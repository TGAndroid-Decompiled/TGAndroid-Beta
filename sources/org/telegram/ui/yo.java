package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class yo implements org.telegram.ui.Components.w80 {
    public final Context f40312a;
    public final fp f40313b;

    public yo(fp fpVar, Context context) {
        this.f40313b = fpVar;
        this.f40312a = context;
    }

    @Override
    public final void c() {
        this.f40313b.X(true);
    }

    @Override
    public final void f() {
        fp fpVar = this.f40313b;
        org.telegram.ui.Components.t60 t60Var = new org.telegram.ui.Components.t60(this.f40312a, fpVar.f34189i0, fpVar.V, fpVar.f34192l0, fpVar, fpVar.W, true, ChatObject.isChannel(fpVar.U));
        fp fpVar2 = this.f40313b;
        fpVar2.m0 = t60Var;
        fpVar2.m0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void h() {
    }
}
