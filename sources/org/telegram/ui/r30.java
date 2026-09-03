package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class r30 extends UndoView {
    public final d60 f40746c0;

    public r30(d60 d60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f40746c0 = d60Var;
    }

    @Override
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f40746c0.f36082w0 != null) {
            return;
        }
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
