package org.telegram.ui;

import android.content.Context;
public final class uz0 implements Runnable {
    public final int f42553a;
    public final org.telegram.messenger.video.a f42554b;
    public final org.telegram.ui.Components.cc f42555c;
    public final Context d;
    public final org.telegram.ui.Components.ro0 e;

    public uz0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.cc ccVar, Context context, org.telegram.ui.Components.ro0 ro0Var, int i10) {
        this.f42553a = i10;
        this.f42554b = aVar;
        this.f42555c = ccVar;
        this.d = context;
        this.e = ro0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f42553a;
        org.telegram.ui.Components.ro0 ro0Var = this.e;
        Context context = this.d;
        org.telegram.ui.Components.cc ccVar = this.f42555c;
        org.telegram.messenger.video.a aVar = this.f42554b;
        switch (i10) {
            case 0:
                aVar.run();
                ccVar.c(org.telegram.messenger.i0.R2(org.telegram.messenger.cd.L0(2131754487, null), -1, 2, new ev(context, 2), ro0Var)).j();
                return;
            case 1:
                aVar.run();
                ccVar.c(org.telegram.messenger.i0.R2(org.telegram.messenger.cd.L0(2131754487, null), -1, 2, new ev(context, 5), ro0Var)).j();
                return;
            default:
                aVar.run();
                ccVar.c(org.telegram.messenger.i0.R2(org.telegram.messenger.cd.L0(2131754487, null), -1, 2, new ev(context, 6), ro0Var)).j();
                return;
        }
    }
}
