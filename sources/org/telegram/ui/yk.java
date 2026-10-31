package org.telegram.ui;
public final class yk extends oo {
    public boolean T0;

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.T0) {
            m0();
            this.T0 = true;
        }
    }
}
