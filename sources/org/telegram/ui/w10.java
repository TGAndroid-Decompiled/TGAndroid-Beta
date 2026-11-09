package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class w10 extends UndoView {
    public final e40 f50832j0;

    public w10(e40 e40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f50832j0 = e40Var;
    }

    @Override
    public final void k(long j3, int i7, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f50832j0.f45256q2 != null) {
            return;
        }
        super.k(j3, i7, obj, obj2, runnable, runnable2);
    }
}
