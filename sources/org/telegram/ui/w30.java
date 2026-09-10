package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class w30 extends UndoView {
    public final j60 f37695f0;

    public w30(j60 j60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f37695f0 = j60Var;
    }

    @Override
    public final void k(long j3, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f37695f0.f34039z0 != null) {
            return;
        }
        super.k(j3, i10, obj, obj2, runnable, runnable2);
    }
}
