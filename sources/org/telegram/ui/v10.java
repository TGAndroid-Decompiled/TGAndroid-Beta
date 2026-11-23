package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class v10 extends UndoView {
    public final e40 f52784k0;

    public v10(e40 e40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f52784k0 = e40Var;
    }

    @Override
    public final void k(long j3, int i7, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f52784k0.f47405u2 != null) {
            return;
        }
        super.k(j3, i7, obj, obj2, runnable, runnable2);
    }
}
