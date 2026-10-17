package org.telegram.ui;

import android.os.Bundle;
public final class u70 extends e6 {
    public final ey f41906f;

    public u70(Bundle bundle, ey eyVar) {
        super(bundle);
        this.f41906f = eyVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.f41906f.removeSelfFromStack();
        }
    }
}
