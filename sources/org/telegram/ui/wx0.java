package org.telegram.ui;

import android.content.Context;
public final class wx0 implements Runnable {
    public final int f51626a;
    public final org.telegram.messenger.video.a f51627b;
    public final org.telegram.ui.Components.fc f51628c;
    public final Context d;
    public final ei.k0 f51629e;

    public wx0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.fc fcVar, Context context, ei.k0 k0Var, int i3) {
        this.f51626a = i3;
        this.f51627b = aVar;
        this.f51628c = fcVar;
        this.d = context;
        this.f51629e = k0Var;
    }

    @Override
    public final void run() {
        int i3 = this.f51626a;
        ei.k0 k0Var = this.f51629e;
        Context context = this.d;
        org.telegram.ui.Components.fc fcVar = this.f51628c;
        org.telegram.messenger.video.a aVar = this.f51627b;
        switch (i3) {
            case 0:
                aVar.run();
                fcVar.c(org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(2131754487, null), -1, 2, new zt(context, 2), k0Var)).j();
                return;
            case 1:
                aVar.run();
                fcVar.c(org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(2131754487, null), -1, 2, new zt(context, 5), k0Var)).j();
                return;
            default:
                aVar.run();
                fcVar.c(org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(2131754487, null), -1, 2, new zt(context, 6), k0Var)).j();
                return;
        }
    }
}
