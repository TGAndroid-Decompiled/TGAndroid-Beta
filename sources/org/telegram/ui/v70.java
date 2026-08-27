package org.telegram.ui;

import android.os.Bundle;

public final class v70 extends a6 {

    public final gy f43375f;

    public v70(Bundle bundle, gy gyVar) {
        super(bundle);
        this.f43375f = gyVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || z11) {
            return;
        }
        this.f43375f.removeSelfFromStack();
    }
}
