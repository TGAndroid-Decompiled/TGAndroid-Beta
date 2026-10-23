package org.telegram.ui;

import android.os.Bundle;
public final class y70 extends d6 {
    public final ey f43741f;

    public y70(Bundle bundle, ey eyVar) {
        super(bundle);
        this.f43741f = eyVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.f43741f.removeSelfFromStack();
        }
    }
}
