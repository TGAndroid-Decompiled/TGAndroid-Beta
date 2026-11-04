package org.telegram.ui;

import android.content.Context;
public final class un implements org.telegram.ui.Components.l70 {
    public final Context f50150a;
    public final bo f50151b;

    public un(bo boVar, Context context) {
        this.f50151b = boVar;
        this.f50150a = context;
    }

    @Override
    public final void d() {
        this.f50151b.d0(true);
    }

    @Override
    public final void h() {
        bo boVar = this.f50151b;
        org.telegram.ui.Components.i50 i50Var = new org.telegram.ui.Components.i50(this.f50150a, boVar.m0, boVar.Z, boVar.f44108p0, boVar, boVar.f44089a0, true, org.telegram.messenger.t3.T(boVar.Y));
        bo boVar2 = this.f50151b;
        boVar2.f44109q0 = i50Var;
        boVar2.f44109q0.show();
    }

    @Override
    public final void b() {
    }

    @Override
    public final void i() {
    }
}
