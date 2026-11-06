package org.telegram.ui;

import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class y61 implements org.telegram.ui.Components.up {
    public final u71 f52155a;

    public y61(u71 u71Var) {
        this.f52155a = u71Var;
    }

    @Override
    public final void a(boolean z9) {
        int i7;
        int i10;
        u71 u71Var = this.f52155a;
        org.telegram.ui.ActionBar.h6 h6Var = u71Var.f50325w;
        if (z9) {
            if (h6Var.f27530r == null) {
                u71Var.finishFragment();
                i10 = ((org.telegram.ui.ActionBar.f2) u71Var).currentAccount;
                org.telegram.messenger.qp.s1(i10).y4(h6Var.f27516b, h6Var);
                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25058s4, h6Var.f27516b, h6Var);
                return;
            }
            StringBuilder sb2 = new StringBuilder("https://");
            i7 = ((org.telegram.ui.ActionBar.f2) u71Var).currentAccount;
            sb2.append(org.telegram.messenger.qp.s1(i7).U2);
            sb2.append("/addtheme/");
            sb2.append(h6Var.f27530r.slug);
            String sb3 = sb2.toString();
            u71Var.showDialog(new org.telegram.ui.Components.mo0(u71Var.getParentActivity(), null, sb3, false, sb3, false, null));
            return;
        }
        org.telegram.ui.Components.v4.T(u71Var, 1, null, null);
    }

    @Override
    public final void b() {
        u71 u71Var = this.f52155a;
        if (u71Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u71Var.getParentActivity());
            String M0 = org.telegram.messenger.hd.M0(2131751485, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.hd.M0(2131751486, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751599, null), new li0(this, 19));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            u71Var.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28089q7, u71Var.f50266a);
            }
        }
    }

    @Override
    public final void c(int i7, int i10, boolean z9) {
        u71 u71Var = this.f52155a;
        if (u71Var.f50270b == 2) {
            u71Var.f1(i7, i10, true);
            return;
        }
        Runnable runnable = u71Var.Z;
        org.telegram.ui.ActionBar.h6 h6Var = u71Var.f50325w;
        if (i10 == -1) {
            int i11 = u71Var.f50305n;
            if (i11 == 1 || i11 == 2) {
                long j3 = u71Var.J;
                if (j3 != 0) {
                    h6Var.f27522j = j3;
                } else {
                    h6Var.f27522j = 0L;
                }
                long j10 = u71Var.K;
                if (j10 != 0) {
                    h6Var.f27523k = j10;
                } else {
                    h6Var.f27523k = 0L;
                }
                long j11 = u71Var.L;
                if (j11 != 0) {
                    h6Var.f27524l = j11;
                } else {
                    h6Var.f27524l = 0L;
                }
                long j12 = u71Var.M;
                if (j12 != 0) {
                    h6Var.f27525m = j12;
                } else {
                    h6Var.f27525m = 0L;
                }
                h6Var.f27526n = u71Var.P;
                if (i11 == 2) {
                    int E0 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Be);
                    int E02 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ce);
                    int E03 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.De);
                    int E04 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ee);
                    int i12 = (int) h6Var.f27523k;
                    int i13 = (int) h6Var.f27524l;
                    int i14 = (int) h6Var.f27525m;
                    int i15 = (int) h6Var.f27522j;
                    org.telegram.ui.Components.vp vpVar = u71Var.W;
                    if (i14 != 0) {
                        E04 = i14;
                    }
                    vpVar.e(E04, 3);
                    org.telegram.ui.Components.vp vpVar2 = u71Var.W;
                    if (i13 != 0) {
                        E03 = i13;
                    }
                    vpVar2.e(E03, 2);
                    org.telegram.ui.Components.vp vpVar3 = u71Var.W;
                    if (i12 != 0) {
                        E02 = i12;
                    }
                    vpVar3.e(E02, 1);
                    org.telegram.ui.Components.vp vpVar4 = u71Var.W;
                    if (i15 != 0) {
                        E0 = i15;
                    }
                    vpVar4.e(E0, 0);
                }
            }
            int i16 = u71Var.f50305n;
            if (i16 == 1 || i16 == 3) {
                int i17 = u71Var.E;
                if (i17 != 0) {
                    h6Var.f27518e = i17;
                } else {
                    h6Var.f27518e = 0;
                }
                int i18 = u71Var.F;
                if (i18 != 0) {
                    h6Var.f27519f = i18;
                } else {
                    h6Var.f27519f = 0;
                }
                int i19 = u71Var.G;
                if (i19 != 0) {
                    h6Var.f27520g = i19;
                } else {
                    h6Var.f27520g = 0;
                }
                int i20 = u71Var.H;
                if (i20 != 0) {
                    h6Var.h = i20;
                } else {
                    h6Var.h = 0;
                }
                if (i16 == 3) {
                    u71Var.W.e(h6Var.h, 3);
                    u71Var.W.e(h6Var.f27520g, 2);
                    u71Var.W.e(h6Var.f27519f, 1);
                    org.telegram.ui.Components.vp vpVar5 = u71Var.W;
                    int i21 = h6Var.f27518e;
                    if (i21 == 0) {
                        i21 = h6Var.f27517c;
                    }
                    vpVar5.e(i21, 0);
                }
            }
            org.telegram.ui.ActionBar.k6.t1(false, false);
            u71Var.f50323v0.g1();
            return;
        }
        int i22 = u71Var.Y;
        if (i22 != -1 && i22 != i10) {
            runnable.run();
        }
        u71Var.X = i7;
        u71Var.Y = i10;
        if (z9) {
            runnable.run();
        } else if (!u71Var.f50267a0) {
            u71Var.f50267a0 = true;
            u71Var.fragmentView.postDelayed(runnable, 16L);
        }
    }

    @Override
    public final int d(int i7) {
        org.telegram.ui.ActionBar.h6 h6Var;
        u71 u71Var = this.f52155a;
        if (u71Var.f50305n == 3) {
            org.telegram.ui.ActionBar.j6 j6Var = u71Var.f50285f0;
            if (j6Var.S && i7 == 0 && (h6Var = (org.telegram.ui.ActionBar.h6) j6Var.f27626a0.get(org.telegram.ui.ActionBar.k6.f28024n)) != null) {
                return h6Var.f27518e;
            }
            return 0;
        }
        return 0;
    }
}
