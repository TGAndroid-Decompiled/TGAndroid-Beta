package org.telegram.ui;

import android.os.Bundle;
public final class s70 extends e6 {
    public final cy f41391f;

    public s70(Bundle bundle, cy cyVar) {
        super(bundle);
        this.f41391f = cyVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.f41391f.removeSelfFromStack();
        }
    }
}
