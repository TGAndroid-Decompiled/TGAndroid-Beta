package org.telegram.ui;

import android.content.Context;
public final class wz0 implements xz0 {
    public final org.telegram.messenger.video.a f43400a;
    public final org.telegram.ui.Components.cc f43401b;
    public final Context f43402c;
    public final org.telegram.ui.Components.ro0 d;
    public final org.telegram.messenger.video.d e;

    public wz0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.cc ccVar, Context context, org.telegram.ui.Components.ro0 ro0Var, org.telegram.messenger.video.d dVar) {
        this.f43400a = aVar;
        this.f43401b = ccVar;
        this.f43402c = context;
        this.d = ro0Var;
        this.e = dVar;
    }

    @Override
    public final void b() {
        org.telegram.messenger.i0.h3(new uz0(this.f43400a, this.f43401b, this.f43402c, this.d, 2), 200L);
    }

    @Override
    public final void c() {
        org.telegram.messenger.i0.h3(new et0(26, this.f43400a, this.f43401b), 200L);
    }

    @Override
    public final void d() {
        this.e.run();
    }
}
