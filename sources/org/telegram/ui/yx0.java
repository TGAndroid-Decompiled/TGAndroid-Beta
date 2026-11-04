package org.telegram.ui;

import android.content.Context;
public final class yx0 implements zx0 {
    public final org.telegram.messenger.video.a f52436a;
    public final org.telegram.ui.Components.fc f52437b;
    public final Context f52438c;
    public final ei.k0 d;
    public final org.telegram.messenger.video.d f52439e;

    public yx0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.fc fcVar, Context context, ei.k0 k0Var, org.telegram.messenger.video.d dVar) {
        this.f52436a = aVar;
        this.f52437b = fcVar;
        this.f52438c = context;
        this.d = k0Var;
        this.f52439e = dVar;
    }

    @Override
    public final void f() {
        org.telegram.messenger.g0.i3(new wx0(this.f52436a, this.f52437b, this.f52438c, this.d, 2), 200L);
    }

    @Override
    public final void g() {
        org.telegram.messenger.g0.i3(new qv0(8, this.f52436a, this.f52437b), 200L);
    }

    @Override
    public final void i() {
        this.f52439e.run();
    }
}
