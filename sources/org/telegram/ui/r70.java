package org.telegram.ui;

import android.os.Bundle;
public final class r70 extends z5 {
    public final dy f42298f;

    public r70(Bundle bundle, dy dyVar) {
        super(bundle);
        this.f42298f = dyVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.f42298f.removeSelfFromStack();
        }
    }
}
