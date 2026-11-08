package org.telegram.ui;

import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class z61 implements org.telegram.ui.Components.up {
    public final v71 f52473a;

    public z61(v71 v71Var) {
        this.f52473a = v71Var;
    }

    @Override
    public final void a(boolean z9) {
        int i7;
        int i10;
        v71 v71Var = this.f52473a;
        org.telegram.ui.ActionBar.h6 h6Var = v71Var.f50579w;
        if (z9) {
            if (h6Var.f27534r == null) {
                v71Var.finishFragment();
                i10 = ((org.telegram.ui.ActionBar.f2) v71Var).currentAccount;
                org.telegram.messenger.qp.s1(i10).y4(h6Var.f27520b, h6Var);
                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25075s4, h6Var.f27520b, h6Var);
                return;
            }
            StringBuilder sb2 = new StringBuilder("https://");
            i7 = ((org.telegram.ui.ActionBar.f2) v71Var).currentAccount;
            sb2.append(org.telegram.messenger.qp.s1(i7).U2);
            sb2.append("/addtheme/");
            sb2.append(h6Var.f27534r.slug);
            String sb3 = sb2.toString();
            v71Var.showDialog(new org.telegram.ui.Components.mo0(v71Var.getParentActivity(), null, sb3, false, sb3, false, null));
            return;
        }
        org.telegram.ui.Components.v4.T(v71Var, 1, null, null);
    }

    @Override
    public final void b() {
        v71 v71Var = this.f52473a;
        if (v71Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v71Var.getParentActivity());
            String M0 = org.telegram.messenger.id.M0(2131751485, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.M0(2131751486, null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751599, null), new li0(this, 19));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            v71Var.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28093q7, v71Var.f50520a);
            }
        }
    }

    @Override
    public final void c(int i7, int i10, boolean z9) {
        v71 v71Var = this.f52473a;
        if (v71Var.f50524b == 2) {
            v71Var.f1(i7, i10, true);
            return;
        }
        Runnable runnable = v71Var.Z;
        org.telegram.ui.ActionBar.h6 h6Var = v71Var.f50579w;
        if (i10 == -1) {
            int i11 = v71Var.f50559n;
            if (i11 == 1 || i11 == 2) {
                long j3 = v71Var.J;
                if (j3 != 0) {
                    h6Var.f27526j = j3;
                } else {
                    h6Var.f27526j = 0L;
                }
                long j10 = v71Var.K;
                if (j10 != 0) {
                    h6Var.f27527k = j10;
                } else {
                    h6Var.f27527k = 0L;
                }
                long j11 = v71Var.L;
                if (j11 != 0) {
                    h6Var.f27528l = j11;
                } else {
                    h6Var.f27528l = 0L;
                }
                long j12 = v71Var.M;
                if (j12 != 0) {
                    h6Var.f27529m = j12;
                } else {
                    h6Var.f27529m = 0L;
                }
                h6Var.f27530n = v71Var.P;
                if (i11 == 2) {
                    int E0 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Be);
                    int E02 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ce);
                    int E03 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.De);
                    int E04 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ee);
                    int i12 = (int) h6Var.f27527k;
                    int i13 = (int) h6Var.f27528l;
                    int i14 = (int) h6Var.f27529m;
                    int i15 = (int) h6Var.f27526j;
                    org.telegram.ui.Components.vp vpVar = v71Var.W;
                    if (i14 != 0) {
                        E04 = i14;
                    }
                    vpVar.e(E04, 3);
                    org.telegram.ui.Components.vp vpVar2 = v71Var.W;
                    if (i13 != 0) {
                        E03 = i13;
                    }
                    vpVar2.e(E03, 2);
                    org.telegram.ui.Components.vp vpVar3 = v71Var.W;
                    if (i12 != 0) {
                        E02 = i12;
                    }
                    vpVar3.e(E02, 1);
                    org.telegram.ui.Components.vp vpVar4 = v71Var.W;
                    if (i15 != 0) {
                        E0 = i15;
                    }
                    vpVar4.e(E0, 0);
                }
            }
            int i16 = v71Var.f50559n;
            if (i16 == 1 || i16 == 3) {
                int i17 = v71Var.E;
                if (i17 != 0) {
                    h6Var.f27522e = i17;
                } else {
                    h6Var.f27522e = 0;
                }
                int i18 = v71Var.F;
                if (i18 != 0) {
                    h6Var.f27523f = i18;
                } else {
                    h6Var.f27523f = 0;
                }
                int i19 = v71Var.G;
                if (i19 != 0) {
                    h6Var.f27524g = i19;
                } else {
                    h6Var.f27524g = 0;
                }
                int i20 = v71Var.H;
                if (i20 != 0) {
                    h6Var.h = i20;
                } else {
                    h6Var.h = 0;
                }
                if (i16 == 3) {
                    v71Var.W.e(h6Var.h, 3);
                    v71Var.W.e(h6Var.f27524g, 2);
                    v71Var.W.e(h6Var.f27523f, 1);
                    org.telegram.ui.Components.vp vpVar5 = v71Var.W;
                    int i21 = h6Var.f27522e;
                    if (i21 == 0) {
                        i21 = h6Var.f27521c;
                    }
                    vpVar5.e(i21, 0);
                }
            }
            org.telegram.ui.ActionBar.k6.t1(false, false);
            v71Var.f50577v0.g1();
            return;
        }
        int i22 = v71Var.Y;
        if (i22 != -1 && i22 != i10) {
            runnable.run();
        }
        v71Var.X = i7;
        v71Var.Y = i10;
        if (z9) {
            runnable.run();
        } else if (!v71Var.f50521a0) {
            v71Var.f50521a0 = true;
            v71Var.fragmentView.postDelayed(runnable, 16L);
        }
    }

    @Override
    public final int d(int i7) {
        org.telegram.ui.ActionBar.h6 h6Var;
        v71 v71Var = this.f52473a;
        if (v71Var.f50559n == 3) {
            org.telegram.ui.ActionBar.j6 j6Var = v71Var.f50539f0;
            if (j6Var.S && i7 == 0 && (h6Var = (org.telegram.ui.ActionBar.h6) j6Var.f27630a0.get(org.telegram.ui.ActionBar.k6.f28028n)) != null) {
                return h6Var.f27522e;
            }
            return 0;
        }
        return 0;
    }
}
