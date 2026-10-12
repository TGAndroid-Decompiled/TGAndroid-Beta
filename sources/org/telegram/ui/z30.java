package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class z30 extends UndoView {
    public final n60 f42472f0;

    public z30(n60 n60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f42472f0 = n60Var;
    }

    @Override
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f42472f0.f38546z0 != null) {
            return;
        }
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
