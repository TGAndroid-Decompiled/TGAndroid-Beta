package org.telegram.ui;

import android.os.Bundle;
public final class z70 extends c6 {
    public final ey f46188f;

    public z70(Bundle bundle, ey eyVar) {
        super(bundle);
        this.f46188f = eyVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.f46188f.removeSelfFromStack();
        }
    }
}
