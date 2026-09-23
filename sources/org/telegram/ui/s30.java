package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class s30 extends UndoView {
    public final f60 f37111f0;

    public s30(f60 f60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f37111f0 = f60Var;
    }

    @Override
    public final void k(long j3, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f37111f0.f33202z0 != null) {
            return;
        }
        super.k(j3, i10, obj, obj2, runnable, runnable2);
    }
}
