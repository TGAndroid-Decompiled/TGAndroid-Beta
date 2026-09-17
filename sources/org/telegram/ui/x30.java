package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class x30 extends UndoView {
    public final k60 f39360f0;

    public x30(k60 k60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f39360f0 = k60Var;
    }

    @Override
    public final void k(long j3, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f39360f0.f35115z0 != null) {
            return;
        }
        super.k(j3, i10, obj, obj2, runnable, runnable2);
    }
}
