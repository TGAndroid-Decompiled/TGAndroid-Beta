package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class ro implements org.telegram.ui.Components.p90 {
    public final Context f40775a;
    public final yo f40776b;

    public ro(yo yoVar, Context context) {
        this.f40776b = yoVar;
        this.f40775a = context;
    }

    @Override
    public final void d() {
        this.f40776b.X(true);
    }

    @Override
    public final void i() {
        yo yoVar = this.f40776b;
        org.telegram.ui.Components.l70 l70Var = new org.telegram.ui.Components.l70(this.f40775a, yoVar.f43450l0, yoVar.Y, yoVar.f43453o0, yoVar, yoVar.Z, true, ChatObject.isChannel(yoVar.X));
        yo yoVar2 = this.f40776b;
        yoVar2.f43454p0 = l70Var;
        yoVar2.f43454p0.show();
    }

    @Override
    public final void c() {
    }

    @Override
    public final void k() {
    }
}
