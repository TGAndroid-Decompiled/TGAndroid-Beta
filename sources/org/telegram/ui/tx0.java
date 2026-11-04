package org.telegram.ui;

import android.app.Activity;
public final class tx0 implements Runnable {
    public final int f49913a;
    public final wm f49914b;
    public final Activity f49915c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final org.telegram.messenger.zi f49916e;

    public tx0(wm wmVar, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.messenger.zi ziVar, int i3) {
        this.f49913a = i3;
        this.f49914b = wmVar;
        this.f49915c = activity;
        this.d = e6Var;
        this.f49916e = ziVar;
    }

    @Override
    public final void run() {
        int i3 = this.f49913a;
        org.telegram.messenger.zi ziVar = this.f49916e;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        final Activity activity = this.f49915c;
        wm wmVar = this.f49914b;
        switch (i3) {
            case 0:
                org.telegram.ui.Components.fc.a0(wmVar).c(org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(2131754487, null), -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                sf.c.t(activity, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                sf.c.t(activity, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                sf.c.t(activity, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, e6Var)).j();
                wmVar.eb(ziVar);
                wmVar.gb(ziVar);
                return;
            case 1:
                org.telegram.ui.Components.fc.a0(wmVar).c(org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(2131754487, null), -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                sf.c.t(activity, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                sf.c.t(activity, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                sf.c.t(activity, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, e6Var)).j();
                wmVar.eb(ziVar);
                wmVar.gb(ziVar);
                return;
            default:
                org.telegram.ui.Components.fc.a0(wmVar).c(org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(2131754487, null), -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                sf.c.t(activity, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                sf.c.t(activity, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                sf.c.t(activity, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, e6Var)).j();
                wmVar.eb(ziVar);
                wmVar.gb(ziVar);
                return;
        }
    }
}
