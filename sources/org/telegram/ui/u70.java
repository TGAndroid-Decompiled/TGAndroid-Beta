package org.telegram.ui;

import android.os.Bundle;
public final class u70 extends a6 {
    public final fy f43193f;

    public u70(Bundle bundle, fy fyVar) {
        super(bundle);
        this.f43193f = fyVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.f43193f.removeSelfFromStack();
        }
    }
}
