package org.telegram.ui;

import android.os.Bundle;
public final class z60 extends x5 {
    public final ay f44035f;

    public z60(Bundle bundle, ay ayVar) {
        super(bundle);
        this.f44035f = ayVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.f44035f.removeSelfFromStack();
        }
    }
}
