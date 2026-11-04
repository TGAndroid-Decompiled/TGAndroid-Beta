package org.telegram.ui;

import android.content.Context;
public final class vx0 implements Runnable {
    public final int f50628a;
    public final org.telegram.ui.ActionBar.d2 f50629b;
    public final Context f50630c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final org.telegram.ui.Components.j50 f50631e;

    public vx0(org.telegram.ui.ActionBar.d2 d2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.j50 j50Var, int i3) {
        this.f50628a = i3;
        this.f50629b = d2Var;
        this.f50630c = context;
        this.d = e6Var;
        this.f50631e = j50Var;
    }

    @Override
    public final void run() {
        int i3 = this.f50628a;
        org.telegram.ui.Components.j50 j50Var = this.f50631e;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        Context context = this.f50630c;
        org.telegram.ui.ActionBar.d2 d2Var = this.f50629b;
        switch (i3) {
            case 0:
                org.telegram.ui.Components.fc.a0(d2Var).c(org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(2131754487, null), -1, 2, new zt(context, 4), e6Var)).j();
                org.telegram.messenger.g0.h3(j50Var);
                return;
            case 1:
                org.telegram.ui.Components.fc.a0(d2Var).c(org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(2131754487, null), -1, 2, new zt(context, 3), e6Var)).j();
                org.telegram.messenger.g0.h3(j50Var);
                return;
            default:
                org.telegram.ui.Components.fc.a0(d2Var).c(org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(2131754487, null), -1, 2, new zt(context, 7), e6Var)).j();
                org.telegram.messenger.g0.h3(j50Var);
                return;
        }
    }
}
