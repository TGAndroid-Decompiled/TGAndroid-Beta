package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class ro implements org.telegram.ui.Components.p90 {
    public final Context f40761a;
    public final yo f40762b;

    public ro(yo yoVar, Context context) {
        this.f40762b = yoVar;
        this.f40761a = context;
    }

    @Override
    public final void d() {
        this.f40762b.X(true);
    }

    @Override
    public final void i() {
        yo yoVar = this.f40762b;
        org.telegram.ui.Components.l70 l70Var = new org.telegram.ui.Components.l70(this.f40761a, yoVar.f43437l0, yoVar.Y, yoVar.f43440o0, yoVar, yoVar.Z, true, ChatObject.isChannel(yoVar.X));
        yo yoVar2 = this.f40762b;
        yoVar2.f43441p0 = l70Var;
        yoVar2.f43441p0.show();
    }

    @Override
    public final void c() {
    }

    @Override
    public final void k() {
    }
}
