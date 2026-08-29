package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class ro implements org.telegram.ui.Components.q80 {
    public final Context f42165a;
    public final yo f42166b;

    public ro(yo yoVar, Context context) {
        this.f42166b = yoVar;
        this.f42165a = context;
    }

    @Override
    public final void b() {
        this.f42166b.X(true);
    }

    @Override
    public final void j() {
        yo yoVar = this.f42166b;
        org.telegram.ui.Components.n60 n60Var = new org.telegram.ui.Components.n60(this.f42165a, yoVar.f44927h0, yoVar.U, yoVar.f44930k0, yoVar, yoVar.V, true, ChatObject.isChannel(yoVar.T));
        yo yoVar2 = this.f42166b;
        yoVar2.f44931l0 = n60Var;
        yoVar2.f44931l0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void k() {
    }
}
