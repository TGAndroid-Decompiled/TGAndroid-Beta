package org.telegram.ui;

import android.os.Bundle;
public final class z50 extends y5 {
    public final yw f53880f;

    public z50(Bundle bundle, yw ywVar) {
        super(bundle);
        this.f53880f = ywVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.f53880f.removeSelfFromStack();
        }
    }
}
