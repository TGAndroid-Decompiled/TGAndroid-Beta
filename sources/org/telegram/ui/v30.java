package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class v30 extends UndoView {
    public final i60 f38280f0;

    public v30(i60 i60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f38280f0 = i60Var;
    }

    @Override
    public final void k(long j3, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f38280f0.f34432z0 != null) {
            return;
        }
        super.k(j3, i10, obj, obj2, runnable, runnable2);
    }
}
