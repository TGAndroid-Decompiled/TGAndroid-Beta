package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class z7 implements MessagesStorage.BooleanCallback {
    public final zn f44631a;
    public final a8 f44632b;

    public z7(a8 a8Var, zn znVar) {
        this.f44632b = a8Var;
        this.f44631a = znVar;
    }

    @Override
    public final void run(boolean z10) {
        c8 c8Var = this.f44632b.f35950b;
        c8Var.f36660x.finishFragment();
        f8 f8Var = c8Var.f36660x;
        this.f44631a.V7(f8Var.P, f8Var.Q + 86400, z10);
    }
}
