package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class yo implements org.telegram.ui.Components.h90 {
    public final Context f40198a;
    public final fp f40199b;

    public yo(fp fpVar, Context context) {
        this.f40199b = fpVar;
        this.f40198a = context;
    }

    @Override
    public final void e() {
        this.f40199b.X(true);
    }

    @Override
    public final void j() {
        fp fpVar = this.f40199b;
        org.telegram.ui.Components.e70 e70Var = new org.telegram.ui.Components.e70(this.f40198a, fpVar.f33725l0, fpVar.Y, fpVar.f33728o0, fpVar, fpVar.Z, true, ChatObject.isChannel(fpVar.X));
        fp fpVar2 = this.f40199b;
        fpVar2.f33729p0 = e70Var;
        fpVar2.f33729p0.show();
    }

    @Override
    public final void c() {
    }

    @Override
    public final void k() {
    }
}
