package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class wo implements org.telegram.ui.Components.w80 {
    public final Context f39775a;
    public final dp f39776b;

    public wo(dp dpVar, Context context) {
        this.f39776b = dpVar;
        this.f39775a = context;
    }

    @Override
    public final void c() {
        this.f39776b.X(true);
    }

    @Override
    public final void e() {
        dp dpVar = this.f39776b;
        org.telegram.ui.Components.s60 s60Var = new org.telegram.ui.Components.s60(this.f39775a, dpVar.f33758i0, dpVar.V, dpVar.f33761l0, dpVar, dpVar.W, true, ChatObject.isChannel(dpVar.U));
        dp dpVar2 = this.f39776b;
        dpVar2.m0 = s60Var;
        dpVar2.m0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void j() {
    }
}
