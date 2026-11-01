package org.telegram.ui;

import android.content.Context;
public final class tz0 implements Runnable {
    public final int f41753a;
    public final org.telegram.messenger.video.a f41754b;
    public final org.telegram.ui.Components.cc f41755c;
    public final Context d;
    public final org.telegram.ui.Components.so0 e;

    public tz0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.cc ccVar, Context context, org.telegram.ui.Components.so0 so0Var, int i10) {
        this.f41753a = i10;
        this.f41754b = aVar;
        this.f41755c = ccVar;
        this.d = context;
        this.e = so0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f41753a;
        org.telegram.ui.Components.so0 so0Var = this.e;
        Context context = this.d;
        org.telegram.ui.Components.cc ccVar = this.f41755c;
        org.telegram.messenger.video.a aVar = this.f41754b;
        switch (i10) {
            case 0:
                aVar.run();
                ccVar.c(org.telegram.messenger.i0.R2(org.telegram.messenger.dd.L0(2131754487, null), -1, 2, new dv(context, 2), so0Var)).j();
                return;
            case 1:
                aVar.run();
                ccVar.c(org.telegram.messenger.i0.R2(org.telegram.messenger.dd.L0(2131754487, null), -1, 2, new dv(context, 5), so0Var)).j();
                return;
            default:
                aVar.run();
                ccVar.c(org.telegram.messenger.i0.R2(org.telegram.messenger.dd.L0(2131754487, null), -1, 2, new dv(context, 6), so0Var)).j();
                return;
        }
    }
}
