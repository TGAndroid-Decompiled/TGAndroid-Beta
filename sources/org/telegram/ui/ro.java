package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class ro implements org.telegram.ui.Components.o90 {
    public final Context f41192a;
    public final yo f41193b;

    public ro(yo yoVar, Context context) {
        this.f41193b = yoVar;
        this.f41192a = context;
    }

    @Override
    public final void c() {
        this.f41193b.Y(true);
    }

    @Override
    public final void j() {
        yo yoVar = this.f41193b;
        org.telegram.ui.Components.k70 k70Var = new org.telegram.ui.Components.k70(this.f41192a, yoVar.m0, yoVar.Z, yoVar.f43918p0, yoVar, yoVar.f43900a0, true, ChatObject.isChannel(yoVar.Y));
        yo yoVar2 = this.f41193b;
        yoVar2.f43919q0 = k70Var;
        yoVar2.f43919q0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void k() {
    }
}
