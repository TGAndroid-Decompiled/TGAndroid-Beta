package org.telegram.ui;
public final class rk extends ko {
    public boolean P0;

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.P0) {
            i0();
            this.P0 = true;
        }
    }
}
