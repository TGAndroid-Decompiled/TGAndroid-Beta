package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class z7 implements MessagesStorage.BooleanCallback {
    public final zn f44597a;
    public final a8 f44598b;

    public z7(a8 a8Var, zn znVar) {
        this.f44598b = a8Var;
        this.f44597a = znVar;
    }

    @Override
    public final void run(boolean z10) {
        c8 c8Var = this.f44598b.f35916b;
        c8Var.f36626x.finishFragment();
        f8 f8Var = c8Var.f36626x;
        this.f44597a.V7(f8Var.P, f8Var.Q + 86400, z10);
    }
}
