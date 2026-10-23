package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class ro implements org.telegram.ui.Components.q90 {
    public final Context f41194a;
    public final yo f41195b;

    public ro(yo yoVar, Context context) {
        this.f41195b = yoVar;
        this.f41194a = context;
    }

    @Override
    public final void c() {
        this.f41195b.Y(true);
    }

    @Override
    public final void j() {
        yo yoVar = this.f41195b;
        org.telegram.ui.Components.m70 m70Var = new org.telegram.ui.Components.m70(this.f41194a, yoVar.m0, yoVar.Z, yoVar.f43931p0, yoVar, yoVar.f43913a0, true, ChatObject.isChannel(yoVar.Y));
        yo yoVar2 = this.f41195b;
        yoVar2.f43932q0 = m70Var;
        yoVar2.f43932q0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void k() {
    }
}
