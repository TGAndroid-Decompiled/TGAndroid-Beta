package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;

public final class qo implements org.telegram.ui.Components.h80 {

    public final Context f41714a;

    public final xo f41715b;

    public qo(xo xoVar, Context context) {
        this.f41715b = xoVar;
        this.f41714a = context;
    }

    @Override
    public final void c() {
        this.f41715b.X(true);
    }

    @Override
    public final void g() {
        xo xoVar = this.f41715b;
        org.telegram.ui.Components.f60 f60Var = new org.telegram.ui.Components.f60(this.f41714a, xoVar.f44560h0, xoVar.U, xoVar.f44563k0, xoVar, xoVar.V, true, ChatObject.isChannel(xoVar.T));
        xo xoVar2 = this.f41715b;
        xoVar2.f44564l0 = f60Var;
        xoVar2.f44564l0.show();
    }

    @Override
    public final void b() {
    }

    @Override
    public final void k() {
    }
}
