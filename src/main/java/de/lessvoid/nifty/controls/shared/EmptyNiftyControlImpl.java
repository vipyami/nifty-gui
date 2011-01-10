package de.lessvoid.nifty.controls.shared;

import de.lessvoid.nifty.controls.NiftyControl;
import de.lessvoid.nifty.tools.SizeValue;

/**
 * The methods that NiftyControl provides are implemented in the Control class but also
 * in the *Impl classes where we would only add empty methods.
 *
 * This class is only abstract to prevent instantiation.
 *
 * @author void
 */
public abstract class EmptyNiftyControlImpl implements NiftyControl {

  @Override
  public void enable() {
  }

  @Override
  public void disable() {
  }

  @Override
  public void setEnabled(final boolean enabled) {
  }

  @Override
  public boolean isEnabled() {
    return false;
  }

  @Override
  public String getId() {
    return null;
  }

  @Override
  public void setId(final String id) {
  }

  @Override
  public SizeValue getWidth() {
    return null;
  }

  @Override
  public void setWidth(final SizeValue width) {
  }

  @Override
  public SizeValue getHeight() {
    return null;
  }

  @Override
  public void setHeight(final SizeValue height) {
  }

  @Override
  public String getStyle() {
    return null;
  }

  @Override
  public void setStyle(final String style) {
  }
}
