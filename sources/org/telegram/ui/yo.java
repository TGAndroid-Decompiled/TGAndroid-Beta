package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class yo implements org.telegram.ui.Components.i90 {
    public final Context f40305a;
    public final fp f40306b;

    public yo(fp fpVar, Context context) {
        this.f40306b = fpVar;
        this.f40305a = context;
    }

    @Override
    public final void e() {
        this.f40306b.X(true);
    }

    @Override
    public final void j() {
        fp fpVar = this.f40306b;
        org.telegram.ui.Components.f70 f70Var = new org.telegram.ui.Components.f70(this.f40305a, fpVar.f33866l0, fpVar.Y, fpVar.f33869o0, fpVar, fpVar.Z, true, ChatObject.isChannel(fpVar.X));
        fp fpVar2 = this.f40306b;
        fpVar2.f33870p0 = f70Var;
        fpVar2.f33870p0.show();
    }

    @Override
    public final void c() {
    }

    @Override
    public final void k() {
    }
}
