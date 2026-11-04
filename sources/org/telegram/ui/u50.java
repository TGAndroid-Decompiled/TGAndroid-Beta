package org.telegram.ui;

import android.os.Bundle;
public final class u50 extends z5 {
    public final uw f49983f;

    public u50(Bundle bundle, uw uwVar) {
        super(bundle);
        this.f49983f = uwVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.f49983f.removeSelfFromStack();
        }
    }
}
