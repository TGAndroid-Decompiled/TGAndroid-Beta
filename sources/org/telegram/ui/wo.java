package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class wo implements org.telegram.ui.Components.x80 {
    public final Context f42864a;
    public final ep f42865b;

    public wo(ep epVar, Context context) {
        this.f42865b = epVar;
        this.f42864a = context;
    }

    @Override
    public final void c() {
        this.f42865b.X(true);
    }

    @Override
    public final void e() {
        ep epVar = this.f42865b;
        org.telegram.ui.Components.u60 u60Var = new org.telegram.ui.Components.u60(this.f42864a, epVar.f36642i0, epVar.V, epVar.f36645l0, epVar, epVar.W, true, ChatObject.isChannel(epVar.U));
        ep epVar2 = this.f42865b;
        epVar2.m0 = u60Var;
        epVar2.m0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void k() {
    }
}
