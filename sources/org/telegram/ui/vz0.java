package org.telegram.ui;

import android.content.Context;
public final class vz0 implements wz0 {
    public final org.telegram.messenger.video.a f42638a;
    public final org.telegram.ui.Components.cc f42639b;
    public final Context f42640c;
    public final org.telegram.ui.Components.so0 d;
    public final org.telegram.messenger.video.d e;

    public vz0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.cc ccVar, Context context, org.telegram.ui.Components.so0 so0Var, org.telegram.messenger.video.d dVar) {
        this.f42638a = aVar;
        this.f42639b = ccVar;
        this.f42640c = context;
        this.d = so0Var;
        this.e = dVar;
    }

    @Override
    public final void b() {
        org.telegram.messenger.i0.h3(new tz0(this.f42638a, this.f42639b, this.f42640c, this.d, 2), 200L);
    }

    @Override
    public final void c() {
        org.telegram.messenger.i0.h3(new hr0(27, this.f42638a, this.f42639b), 200L);
    }

    @Override
    public final void d() {
        this.e.run();
    }
}
