package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class z7 implements MessagesStorage.BooleanCallback {
    public final tn f45097a;
    public final a8 f45098b;

    public z7(a8 a8Var, tn tnVar) {
        this.f45098b = a8Var;
        this.f45097a = tnVar;
    }

    @Override
    public final void run(boolean z10) {
        c8 c8Var = this.f45098b.f36452b;
        c8Var.f37036x.finishFragment();
        f8 f8Var = c8Var.f37036x;
        this.f45097a.S7(f8Var.L, f8Var.M + 86400, z10);
    }
}
