package org.telegram.ui;

import android.content.Context;
public final class sz0 implements Runnable {
    public final int f41492a;
    public final org.telegram.ui.ActionBar.k2 f41493b;
    public final Context f41494c;
    public final org.telegram.ui.ActionBar.p6 d;
    public final org.telegram.ui.Components.hi0 e;

    public sz0(org.telegram.ui.ActionBar.k2 k2Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.Components.hi0 hi0Var, int i10) {
        this.f41492a = i10;
        this.f41493b = k2Var;
        this.f41494c = context;
        this.d = p6Var;
        this.e = hi0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f41492a;
        org.telegram.ui.Components.hi0 hi0Var = this.e;
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        Context context = this.f41494c;
        org.telegram.ui.ActionBar.k2 k2Var = this.f41493b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.cc.a0(k2Var).c(org.telegram.messenger.i0.R2(org.telegram.messenger.dd.L0(2131754487, null), -1, 2, new dv(context, 4), p6Var)).j();
                org.telegram.messenger.i0.g3(hi0Var);
                return;
            case 1:
                org.telegram.ui.Components.cc.a0(k2Var).c(org.telegram.messenger.i0.R2(org.telegram.messenger.dd.L0(2131754487, null), -1, 2, new dv(context, 3), p6Var)).j();
                org.telegram.messenger.i0.g3(hi0Var);
                return;
            default:
                org.telegram.ui.Components.cc.a0(k2Var).c(org.telegram.messenger.i0.R2(org.telegram.messenger.dd.L0(2131754487, null), -1, 2, new dv(context, 7), p6Var)).j();
                org.telegram.messenger.i0.g3(hi0Var);
                return;
        }
    }
}
