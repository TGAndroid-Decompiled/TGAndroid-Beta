package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class s20 extends UndoView {
    public final a50 f41206j0;

    public s20(a50 a50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f41206j0 = a50Var;
    }

    @Override
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f41206j0.f35648q2 != null) {
            return;
        }
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
