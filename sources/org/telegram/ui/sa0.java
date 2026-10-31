package org.telegram.ui;

import android.os.Bundle;
public final class sa0 extends qh.i0 {
    public sa0(Bundle bundle) {
        super(bundle);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        org.telegram.messenger.i0.g3(new zy(this, 19));
    }
}
