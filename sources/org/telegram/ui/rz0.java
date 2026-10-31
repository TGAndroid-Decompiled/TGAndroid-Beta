package org.telegram.ui;

import android.app.Activity;
public final class rz0 implements Runnable {
    public final int f41316a;
    public final un f41317b;
    public final Activity f41318c;
    public final org.telegram.ui.ActionBar.p6 d;
    public final org.telegram.messenger.jj e;

    public rz0(un unVar, Activity activity, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.messenger.jj jjVar, int i10) {
        this.f41316a = i10;
        this.f41317b = unVar;
        this.f41318c = activity;
        this.d = p6Var;
        this.e = jjVar;
    }

    @Override
    public final void run() {
        int i10 = this.f41316a;
        org.telegram.messenger.jj jjVar = this.e;
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        final Activity activity = this.f41318c;
        un unVar = this.f41317b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.cc.a0(unVar).c(org.telegram.messenger.i0.R2(org.telegram.messenger.cd.L0(2131754487, null), -1, 2, new Runnable() {
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
                unVar.Ua(jjVar);
                unVar.Wa(jjVar);
                return;
            case 1:
                org.telegram.ui.Components.cc.a0(unVar).c(org.telegram.messenger.i0.R2(org.telegram.messenger.cd.L0(2131754487, null), -1, 2, new Runnable() {
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
                unVar.Ua(jjVar);
                unVar.Wa(jjVar);
                return;
            default:
                org.telegram.ui.Components.cc.a0(unVar).c(org.telegram.messenger.i0.R2(org.telegram.messenger.cd.L0(2131754487, null), -1, 2, new Runnable() {
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
                unVar.Ua(jjVar);
                unVar.Wa(jjVar);
                return;
        }
    }
}
