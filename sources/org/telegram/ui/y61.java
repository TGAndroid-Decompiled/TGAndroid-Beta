package org.telegram.ui;

import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class y61 implements org.telegram.ui.Components.iq {
    public final v71 f54290a;

    public y61(v71 v71Var) {
        this.f54290a = v71Var;
    }

    @Override
    public final void a(boolean z10) {
        int i7;
        int i10;
        v71 v71Var = this.f54290a;
        org.telegram.ui.ActionBar.k6 k6Var = v71Var.f52905w;
        if (z10) {
            if (k6Var.f29239r == null) {
                v71Var.finishFragment();
                i10 = ((org.telegram.ui.ActionBar.g2) v71Var).currentAccount;
                org.telegram.messenger.mp.u1(i10).H4(k6Var.f29225b, k6Var);
                org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25307v4, k6Var.f29225b, k6Var);
                return;
            }
            StringBuilder sb2 = new StringBuilder("https://");
            i7 = ((org.telegram.ui.ActionBar.g2) v71Var).currentAccount;
            sb2.append(org.telegram.messenger.mp.u1(i7).X2);
            sb2.append("/addtheme/");
            sb2.append(k6Var.f29239r.slug);
            String sb3 = sb2.toString();
            v71Var.showDialog(new org.telegram.ui.Components.zo0(v71Var.getParentActivity(), null, sb3, false, sb3, false, null));
            return;
        }
        org.telegram.ui.Components.b5.T(v71Var, 1, null, null);
    }

    @Override
    public final void b() {
        v71 v71Var = this.f54290a;
        if (v71Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v71Var.getParentActivity());
            String N0 = org.telegram.messenger.gd.N0(2131751472, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.gd.N0(2131751473, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new oi0(this, 19));
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
            v71Var.showDialog(t1Var);
            TextView textView = (TextView) t1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, v71Var.f52845a);
            }
        }
    }

    @Override
    public final void c(int i7, int i10, boolean z10) {
        v71 v71Var = this.f54290a;
        if (v71Var.f52849b == 2) {
            v71Var.f1(i7, i10, true);
            return;
        }
        Runnable runnable = v71Var.f52846a0;
        org.telegram.ui.ActionBar.k6 k6Var = v71Var.f52905w;
        if (i10 == -1) {
            int i11 = v71Var.f52885n;
            if (i11 == 1 || i11 == 2) {
                long j3 = v71Var.K;
                if (j3 != 0) {
                    k6Var.f29231j = j3;
                } else {
                    k6Var.f29231j = 0L;
                }
                long j10 = v71Var.L;
                if (j10 != 0) {
                    k6Var.f29232k = j10;
                } else {
                    k6Var.f29232k = 0L;
                }
                long j11 = v71Var.M;
                if (j11 != 0) {
                    k6Var.f29233l = j11;
                } else {
                    k6Var.f29233l = 0L;
                }
                long j12 = v71Var.N;
                if (j12 != 0) {
                    k6Var.f29234m = j12;
                } else {
                    k6Var.f29234m = 0L;
                }
                k6Var.f29235n = v71Var.Q;
                if (i11 == 2) {
                    int E0 = org.telegram.ui.ActionBar.n6.E0(org.telegram.ui.ActionBar.n6.Ee);
                    int E02 = org.telegram.ui.ActionBar.n6.E0(org.telegram.ui.ActionBar.n6.Fe);
                    int E03 = org.telegram.ui.ActionBar.n6.E0(org.telegram.ui.ActionBar.n6.Ge);
                    int E04 = org.telegram.ui.ActionBar.n6.E0(org.telegram.ui.ActionBar.n6.He);
                    int i12 = (int) k6Var.f29232k;
                    int i13 = (int) k6Var.f29233l;
                    int i14 = (int) k6Var.f29234m;
                    int i15 = (int) k6Var.f29231j;
                    org.telegram.ui.Components.jq jqVar = v71Var.X;
                    if (i14 != 0) {
                        E04 = i14;
                    }
                    jqVar.e(E04, 3);
                    org.telegram.ui.Components.jq jqVar2 = v71Var.X;
                    if (i13 != 0) {
                        E03 = i13;
                    }
                    jqVar2.e(E03, 2);
                    org.telegram.ui.Components.jq jqVar3 = v71Var.X;
                    if (i12 != 0) {
                        E02 = i12;
                    }
                    jqVar3.e(E02, 1);
                    org.telegram.ui.Components.jq jqVar4 = v71Var.X;
                    if (i15 != 0) {
                        E0 = i15;
                    }
                    jqVar4.e(E0, 0);
                }
            }
            int i16 = v71Var.f52885n;
            if (i16 == 1 || i16 == 3) {
                int i17 = v71Var.F;
                if (i17 != 0) {
                    k6Var.f29227e = i17;
                } else {
                    k6Var.f29227e = 0;
                }
                int i18 = v71Var.G;
                if (i18 != 0) {
                    k6Var.f29228f = i18;
                } else {
                    k6Var.f29228f = 0;
                }
                int i19 = v71Var.H;
                if (i19 != 0) {
                    k6Var.f29229g = i19;
                } else {
                    k6Var.f29229g = 0;
                }
                int i20 = v71Var.I;
                if (i20 != 0) {
                    k6Var.h = i20;
                } else {
                    k6Var.h = 0;
                }
                if (i16 == 3) {
                    v71Var.X.e(k6Var.h, 3);
                    v71Var.X.e(k6Var.f29229g, 2);
                    v71Var.X.e(k6Var.f29228f, 1);
                    org.telegram.ui.Components.jq jqVar5 = v71Var.X;
                    int i21 = k6Var.f29227e;
                    if (i21 == 0) {
                        i21 = k6Var.f29226c;
                    }
                    jqVar5.e(i21, 0);
                }
            }
            org.telegram.ui.ActionBar.n6.t1(false, false);
            v71Var.f52906w0.g1();
            return;
        }
        int i22 = v71Var.Z;
        if (i22 != -1 && i22 != i10) {
            runnable.run();
        }
        v71Var.Y = i7;
        v71Var.Z = i10;
        if (z10) {
            runnable.run();
        } else if (!v71Var.f52850b0) {
            v71Var.f52850b0 = true;
            v71Var.fragmentView.postDelayed(runnable, 16L);
        }
    }

    @Override
    public final int d(int i7) {
        org.telegram.ui.ActionBar.k6 k6Var;
        v71 v71Var = this.f54290a;
        if (v71Var.f52885n == 3) {
            org.telegram.ui.ActionBar.m6 m6Var = v71Var.f52867g0;
            if (m6Var.T && i7 == 0 && (k6Var = (org.telegram.ui.ActionBar.k6) m6Var.f29323b0.get(org.telegram.ui.ActionBar.n6.f29627n)) != null) {
                return k6Var.f29227e;
            }
            return 0;
        }
        return 0;
    }
}
