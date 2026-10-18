package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class ro implements org.telegram.ui.Components.p90 {
    public final Context f40799a;
    public final yo f40800b;

    public ro(yo yoVar, Context context) {
        this.f40800b = yoVar;
        this.f40799a = context;
    }

    @Override
    public final void d() {
        this.f40800b.X(true);
    }

    @Override
    public final void i() {
        yo yoVar = this.f40800b;
        org.telegram.ui.Components.l70 l70Var = new org.telegram.ui.Components.l70(this.f40799a, yoVar.f43473l0, yoVar.Y, yoVar.f43476o0, yoVar, yoVar.Z, true, ChatObject.isChannel(yoVar.X));
        yo yoVar2 = this.f40800b;
        yoVar2.f43477p0 = l70Var;
        yoVar2.f43477p0.show();
    }

    @Override
    public final void c() {
    }

    @Override
    public final void k() {
    }
}
