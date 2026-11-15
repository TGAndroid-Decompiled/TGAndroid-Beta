package org.telegram.ui;

import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class v61 implements org.telegram.ui.Components.cq {
    public final t71 f52145a;

    public v61(t71 t71Var) {
        this.f52145a = t71Var;
    }

    @Override
    public final void a(boolean z10) {
        int i7;
        int i10;
        t71 t71Var = this.f52145a;
        org.telegram.ui.ActionBar.g6 g6Var = t71Var.f51468w;
        if (z10) {
            if (g6Var.f28617r == null) {
                t71Var.finishFragment();
                i10 = ((org.telegram.ui.ActionBar.e2) t71Var).currentAccount;
                org.telegram.messenger.np.s1(i10).y4(g6Var.f28603b, g6Var);
                org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25571s4, g6Var.f28603b, g6Var);
                return;
            }
            StringBuilder sb2 = new StringBuilder("https://");
            i7 = ((org.telegram.ui.ActionBar.e2) t71Var).currentAccount;
            sb2.append(org.telegram.messenger.np.s1(i7).V2);
            sb2.append("/addtheme/");
            sb2.append(g6Var.f28617r.slug);
            String sb3 = sb2.toString();
            t71Var.showDialog(new org.telegram.ui.Components.po0(t71Var.getParentActivity(), null, sb3, false, sb3, false, null));
            return;
        }
        org.telegram.ui.Components.t4.T(t71Var, 1, null, null);
    }

    @Override
    public final void b() {
        t71 t71Var = this.f52145a;
        if (t71Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(t71Var.getParentActivity());
            String M0 = org.telegram.messenger.hd.M0(2131751484, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = M0;
            t1Var.U = org.telegram.messenger.hd.M0(2131751485, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new ni0(this, 19));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            t71Var.showDialog(t1Var);
            TextView textView = (TextView) t1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, t71Var.f51408a);
            }
        }
    }

    @Override
    public final void c(int i7, int i10, boolean z10) {
        t71 t71Var = this.f52145a;
        if (t71Var.f51412b == 2) {
            t71Var.f1(i7, i10, true);
            return;
        }
        Runnable runnable = t71Var.f51409a0;
        org.telegram.ui.ActionBar.g6 g6Var = t71Var.f51468w;
        if (i10 == -1) {
            int i11 = t71Var.f51448n;
            if (i11 == 1 || i11 == 2) {
                long j3 = t71Var.K;
                if (j3 != 0) {
                    g6Var.f28609j = j3;
                } else {
                    g6Var.f28609j = 0L;
                }
                long j10 = t71Var.L;
                if (j10 != 0) {
                    g6Var.f28610k = j10;
                } else {
                    g6Var.f28610k = 0L;
                }
                long j11 = t71Var.M;
                if (j11 != 0) {
                    g6Var.f28611l = j11;
                } else {
                    g6Var.f28611l = 0L;
                }
                long j12 = t71Var.N;
                if (j12 != 0) {
                    g6Var.f28612m = j12;
                } else {
                    g6Var.f28612m = 0L;
                }
                g6Var.f28613n = t71Var.Q;
                if (i11 == 2) {
                    int E0 = org.telegram.ui.ActionBar.j6.E0(org.telegram.ui.ActionBar.j6.Ee);
                    int E02 = org.telegram.ui.ActionBar.j6.E0(org.telegram.ui.ActionBar.j6.Fe);
                    int E03 = org.telegram.ui.ActionBar.j6.E0(org.telegram.ui.ActionBar.j6.Ge);
                    int E04 = org.telegram.ui.ActionBar.j6.E0(org.telegram.ui.ActionBar.j6.He);
                    int i12 = (int) g6Var.f28610k;
                    int i13 = (int) g6Var.f28611l;
                    int i14 = (int) g6Var.f28612m;
                    int i15 = (int) g6Var.f28609j;
                    org.telegram.ui.Components.dq dqVar = t71Var.X;
                    if (i14 != 0) {
                        E04 = i14;
                    }
                    dqVar.e(E04, 3);
                    org.telegram.ui.Components.dq dqVar2 = t71Var.X;
                    if (i13 != 0) {
                        E03 = i13;
                    }
                    dqVar2.e(E03, 2);
                    org.telegram.ui.Components.dq dqVar3 = t71Var.X;
                    if (i12 != 0) {
                        E02 = i12;
                    }
                    dqVar3.e(E02, 1);
                    org.telegram.ui.Components.dq dqVar4 = t71Var.X;
                    if (i15 != 0) {
                        E0 = i15;
                    }
                    dqVar4.e(E0, 0);
                }
            }
            int i16 = t71Var.f51448n;
            if (i16 == 1 || i16 == 3) {
                int i17 = t71Var.F;
                if (i17 != 0) {
                    g6Var.f28605e = i17;
                } else {
                    g6Var.f28605e = 0;
                }
                int i18 = t71Var.G;
                if (i18 != 0) {
                    g6Var.f28606f = i18;
                } else {
                    g6Var.f28606f = 0;
                }
                int i19 = t71Var.H;
                if (i19 != 0) {
                    g6Var.f28607g = i19;
                } else {
                    g6Var.f28607g = 0;
                }
                int i20 = t71Var.I;
                if (i20 != 0) {
                    g6Var.h = i20;
                } else {
                    g6Var.h = 0;
                }
                if (i16 == 3) {
                    t71Var.X.e(g6Var.h, 3);
                    t71Var.X.e(g6Var.f28607g, 2);
                    t71Var.X.e(g6Var.f28606f, 1);
                    org.telegram.ui.Components.dq dqVar5 = t71Var.X;
                    int i21 = g6Var.f28605e;
                    if (i21 == 0) {
                        i21 = g6Var.f28604c;
                    }
                    dqVar5.e(i21, 0);
                }
            }
            org.telegram.ui.ActionBar.j6.t1(false, false);
            t71Var.f51469w0.g1();
            return;
        }
        int i22 = t71Var.Z;
        if (i22 != -1 && i22 != i10) {
            runnable.run();
        }
        t71Var.Y = i7;
        t71Var.Z = i10;
        if (z10) {
            runnable.run();
        } else if (!t71Var.f51413b0) {
            t71Var.f51413b0 = true;
            t71Var.fragmentView.postDelayed(runnable, 16L);
        }
    }

    @Override
    public final int d(int i7) {
        org.telegram.ui.ActionBar.g6 g6Var;
        t71 t71Var = this.f52145a;
        if (t71Var.f51448n == 3) {
            org.telegram.ui.ActionBar.i6 i6Var = t71Var.f51430g0;
            if (i6Var.T && i7 == 0 && (g6Var = (org.telegram.ui.ActionBar.g6) i6Var.f28701b0.get(org.telegram.ui.ActionBar.j6.f29025n)) != null) {
                return g6Var.f28605e;
            }
            return 0;
        }
        return 0;
    }
}
