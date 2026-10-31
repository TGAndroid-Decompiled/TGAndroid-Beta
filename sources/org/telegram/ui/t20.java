package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class t20 extends UndoView {
    public final b50 f41695j0;

    public t20(b50 b50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f41695j0 = b50Var;
    }

    @Override
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f41695j0.f36064q2 != null) {
            return;
        }
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
