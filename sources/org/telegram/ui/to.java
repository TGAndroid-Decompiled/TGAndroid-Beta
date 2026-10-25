package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class to implements org.telegram.ui.Components.q90 {
    public final Context f43872a;
    public final ap f43873b;

    public to(ap apVar, Context context) {
        this.f43873b = apVar;
        this.f43872a = context;
    }

    @Override
    public final void d() {
        this.f43873b.Z(true);
    }

    @Override
    public final void e() {
        ap apVar = this.f43873b;
        org.telegram.ui.Components.n70 n70Var = new org.telegram.ui.Components.n70(this.f43872a, apVar.f37856l0, apVar.Y, apVar.f37859o0, apVar, apVar.Z, true, ChatObject.isChannel(apVar.X));
        ap apVar2 = this.f43873b;
        apVar2.f37860p0 = n70Var;
        apVar2.f37860p0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void k() {
    }
}
