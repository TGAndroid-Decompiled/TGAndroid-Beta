package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class t30 extends UndoView {
    public final g60 f42052f0;

    public t30(g60 g60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f42052f0 = g60Var;
    }

    @Override
    public final void k(long j3, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f42052f0.f37973z0 != null) {
            return;
        }
        super.k(j3, i10, obj, obj2, runnable, runnable2);
    }
}
