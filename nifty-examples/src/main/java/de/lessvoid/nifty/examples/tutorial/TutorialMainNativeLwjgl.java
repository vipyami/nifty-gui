package de.lessvoid.nifty.examples.tutorial;

import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.batch.BatchRenderDevice;
import de.lessvoid.nifty.examples.LwjglInitHelper;
import de.lessvoid.nifty.renderer.lwjgl.input.LwjglInputSystem;
import de.lessvoid.nifty.renderer.lwjgl.render.LwjglRenderDevice;
import de.lessvoid.nifty.renderer.lwjgl.render.batch.LwjglBatchRenderBackend;
import de.lessvoid.nifty.renderer.lwjgl.render.batch.LwjglBatchRenderBackendCoreProfile;
import de.lessvoid.nifty.sound.openal.OpenALSoundDevice;
import de.lessvoid.nifty.spi.time.impl.AccurateTimeProvider;

public final class TutorialMainNativeLwjgl {

  private TutorialMainNativeLwjgl() {
  }

  public static void main(final String[] args) throws Exception {
    if (!LwjglInitHelper.initSubSystems("Nifty 1.2 Tutorial, rendering using native Lwjgl with OpenAL Sound", true)) {
      System.exit(0);
    }

    // create nifty
    BatchRenderDevice renderDevice = new BatchRenderDevice(new LwjglBatchRenderBackendCoreProfile(), 2048, 2048);
    renderDevice.enableLogFPS();
    Nifty nifty = new Nifty(
        renderDevice,
        new OpenALSoundDevice(),
        new LwjglInputSystem(),
        new AccurateTimeProvider());
    nifty.fromXml("tutorial/tutorial.xml", "start");

    // render
    LwjglInitHelper.renderLoop(nifty, null);
    LwjglInitHelper.destroy();
  }
}
