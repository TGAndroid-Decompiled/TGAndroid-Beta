package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class x10 extends UndoView {
    public final f40 f51496j0;

    public x10(f40 f40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f51496j0 = f40Var;
    }

    @Override
    public final void k(long j3, int i7, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f51496j0.f45583t2 != null) {
            return;
        }
        super.k(j3, i7, obj, obj2, runnable, runnable2);
    }
}
