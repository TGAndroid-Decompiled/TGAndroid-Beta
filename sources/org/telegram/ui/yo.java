package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class yo implements org.telegram.ui.Components.g90 {
    public final Context f40197a;
    public final fp f40198b;

    public yo(fp fpVar, Context context) {
        this.f40198b = fpVar;
        this.f40197a = context;
    }

    @Override
    public final void e() {
        this.f40198b.X(true);
    }

    @Override
    public final void j() {
        fp fpVar = this.f40198b;
        org.telegram.ui.Components.d70 d70Var = new org.telegram.ui.Components.d70(this.f40197a, fpVar.f33723l0, fpVar.Y, fpVar.f33726o0, fpVar, fpVar.Z, true, ChatObject.isChannel(fpVar.X));
        fp fpVar2 = this.f40198b;
        fpVar2.f33727p0 = d70Var;
        fpVar2.f33727p0.show();
    }

    @Override
    public final void c() {
    }

    @Override
    public final void k() {
    }
}
