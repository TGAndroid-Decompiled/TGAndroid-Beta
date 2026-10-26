package org.telegram.ui;

import android.os.Bundle;
public final class x70 extends c6 {
    public final cy f45688f;

    public x70(Bundle bundle, cy cyVar) {
        super(bundle);
        this.f45688f = cyVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.f45688f.removeSelfFromStack();
        }
    }
}
