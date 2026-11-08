package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class u10 extends UndoView {
    public final c40 f50194j0;

    public u10(c40 c40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f50194j0 = c40Var;
    }

    @Override
    public final void k(long j3, int i7, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f50194j0.f44616q2 != null) {
            return;
        }
        super.k(j3, i7, obj, obj2, runnable, runnable2);
    }
}
