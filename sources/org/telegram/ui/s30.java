package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class s30 extends UndoView {
    public final e60 f38096c0;

    public s30(e60 e60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f38096c0 = e60Var;
    }

    @Override
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f38096c0.f33708w0 != null) {
            return;
        }
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
