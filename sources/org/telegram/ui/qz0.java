package org.telegram.ui;

import android.app.Activity;
public final class qz0 implements Runnable {
    public final int f40928a;
    public final un f40929b;
    public final Activity f40930c;
    public final org.telegram.ui.ActionBar.p6 d;
    public final org.telegram.messenger.kj e;

    public qz0(un unVar, Activity activity, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.messenger.kj kjVar, int i10) {
        this.f40928a = i10;
        this.f40929b = unVar;
        this.f40930c = activity;
        this.d = p6Var;
        this.e = kjVar;
    }

    @Override
    public final void run() {
        int i10 = this.f40928a;
        org.telegram.messenger.kj kjVar = this.e;
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        final Activity activity = this.f40930c;
        un unVar = this.f40929b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.cc.a0(unVar).c(org.telegram.messenger.i0.R2(org.telegram.messenger.dd.L0(2131754487, null), -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                gf.f.r(activity, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                gf.f.r(activity, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                gf.f.r(activity, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, p6Var)).j();
                unVar.Za(kjVar);
                unVar.bb(kjVar);
                return;
            case 1:
                org.telegram.ui.Components.cc.a0(unVar).c(org.telegram.messenger.i0.R2(org.telegram.messenger.dd.L0(2131754487, null), -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                gf.f.r(activity, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                gf.f.r(activity, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                gf.f.r(activity, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, p6Var)).j();
                unVar.Za(kjVar);
                unVar.bb(kjVar);
                return;
            default:
                org.telegram.ui.Components.cc.a0(unVar).c(org.telegram.messenger.i0.R2(org.telegram.messenger.dd.L0(2131754487, null), -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                gf.f.r(activity, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                gf.f.r(activity, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                gf.f.r(activity, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, p6Var)).j();
                unVar.Za(kjVar);
                unVar.bb(kjVar);
                return;
        }
    }
}
