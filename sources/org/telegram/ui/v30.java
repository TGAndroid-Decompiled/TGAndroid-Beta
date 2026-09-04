package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class v30 extends UndoView {
    public final j60 f41404f0;

    public v30(j60 j60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f41404f0 = j60Var;
    }

    @Override
    public final void k(long j3, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f41404f0.f37617z0 != null) {
            return;
        }
        super.k(j3, i10, obj, obj2, runnable, runnable2);
    }
}
