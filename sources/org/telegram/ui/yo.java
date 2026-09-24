package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class yo implements org.telegram.ui.Components.f90 {
    public final Context f40182a;
    public final fp f40183b;

    public yo(fp fpVar, Context context) {
        this.f40183b = fpVar;
        this.f40182a = context;
    }

    @Override
    public final void e() {
        this.f40183b.X(true);
    }

    @Override
    public final void j() {
        fp fpVar = this.f40183b;
        org.telegram.ui.Components.c70 c70Var = new org.telegram.ui.Components.c70(this.f40182a, fpVar.f33709l0, fpVar.Y, fpVar.f33712o0, fpVar, fpVar.Z, true, ChatObject.isChannel(fpVar.X));
        fp fpVar2 = this.f40183b;
        fpVar2.f33713p0 = c70Var;
        fpVar2.f33713p0.show();
    }

    @Override
    public final void c() {
    }

    @Override
    public final void k() {
    }
}
