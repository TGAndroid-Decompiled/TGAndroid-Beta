package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class to implements org.telegram.ui.Components.q90 {
    public final Context f43875a;
    public final ap f43876b;

    public to(ap apVar, Context context) {
        this.f43876b = apVar;
        this.f43875a = context;
    }

    @Override
    public final void d() {
        this.f43876b.Z(true);
    }

    @Override
    public final void e() {
        ap apVar = this.f43876b;
        org.telegram.ui.Components.n70 n70Var = new org.telegram.ui.Components.n70(this.f43875a, apVar.f37859l0, apVar.Y, apVar.f37862o0, apVar, apVar.Z, true, ChatObject.isChannel(apVar.X));
        ap apVar2 = this.f43876b;
        apVar2.f37863p0 = n70Var;
        apVar2.f37863p0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void k() {
    }
}
