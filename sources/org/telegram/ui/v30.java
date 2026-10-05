package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class v30 extends UndoView {
    public final h60 f41583f0;

    public v30(h60 h60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f41583f0 = h60Var;
    }

    @Override
    public final void k(long j3, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f41583f0.f37010z0 != null) {
            return;
        }
        super.k(j3, i10, obj, obj2, runnable, runnable2);
    }
}
