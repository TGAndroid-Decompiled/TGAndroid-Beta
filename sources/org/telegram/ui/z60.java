package org.telegram.ui;

import android.os.Bundle;
public final class z60 extends x5 {
    public final zx f43835f;

    public z60(Bundle bundle, zx zxVar) {
        super(bundle);
        this.f43835f = zxVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.f43835f.removeSelfFromStack();
        }
    }
}
