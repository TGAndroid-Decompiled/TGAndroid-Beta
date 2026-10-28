package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class xb1 implements org.telegram.ui.Components.xq {
    public final vc1 f45649a;

    public xb1(vc1 vc1Var) {
        this.f45649a = vc1Var;
    }

    @Override
    public final int M0(int i10) {
        org.telegram.ui.ActionBar.w6 w6Var;
        vc1 vc1Var = this.f45649a;
        if (vc1Var.f44284n == 3) {
            org.telegram.ui.ActionBar.x6 x6Var = vc1Var.f44264f0;
            if (x6Var.S && i10 == 0 && (w6Var = (org.telegram.ui.ActionBar.w6) x6Var.f23253a0.get(org.telegram.ui.ActionBar.y6.f23534n)) != null) {
                return w6Var.e;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void k(boolean z10) {
        int i10;
        int i11;
        vc1 vc1Var = this.f45649a;
        org.telegram.ui.ActionBar.w6 w6Var = vc1Var.v;
        if (z10) {
            if (w6Var.f23230r == null) {
                vc1Var.finishFragment();
                i11 = ((org.telegram.ui.ActionBar.r2) vc1Var).currentAccount;
                MessagesController.getInstance(i11).saveThemeToServer(w6Var.f23217b, w6Var);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, w6Var.f23217b, w6Var);
                return;
            }
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.r2) vc1Var).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/addtheme/");
            sb2.append(w6Var.f23230r.slug);
            String sb3 = sb2.toString();
            vc1Var.showDialog(new org.telegram.ui.Components.nr0(vc1Var.getParentActivity(), null, sb3, false, sb3, false, null));
            return;
        }
        org.telegram.ui.Components.g5.V(vc1Var, 1, null, null);
    }

    @Override
    public final void w() {
        vc1 vc1Var = this.f45649a;
        if (vc1Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vc1Var.getParentActivity());
            alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.DeleteThemeTitle);
            alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.DeleteThemeAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new jl0(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
            vc1Var.showDialog(e2Var);
            TextView textView = (TextView) e2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, vc1Var.f44246a);
            }
        }
    }

    @Override
    public final void x0(int i10, int i11, boolean z10) {
        vc1 vc1Var = this.f45649a;
        if (vc1Var.f44249b == 2) {
            vc1Var.b1(i10, i11, true);
            return;
        }
        Runnable runnable = vc1Var.Z;
        org.telegram.ui.ActionBar.w6 w6Var = vc1Var.v;
        if (i11 == -1) {
            int i12 = vc1Var.f44284n;
            if (i12 == 1 || i12 == 2) {
                long j10 = vc1Var.J;
                if (j10 != 0) {
                    w6Var.f23222j = j10;
                } else {
                    w6Var.f23222j = 0L;
                }
                long j11 = vc1Var.K;
                if (j11 != 0) {
                    w6Var.f23223k = j11;
                } else {
                    w6Var.f23223k = 0L;
                }
                long j12 = vc1Var.L;
                if (j12 != 0) {
                    w6Var.f23224l = j12;
                } else {
                    w6Var.f23224l = 0L;
                }
                long j13 = vc1Var.M;
                if (j13 != 0) {
                    w6Var.f23225m = j13;
                } else {
                    w6Var.f23225m = 0L;
                }
                w6Var.f23226n = vc1Var.P;
                if (i12 == 2) {
                    int D0 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Nd);
                    int D02 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Od);
                    int D03 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Pd);
                    int D04 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Qd);
                    int i13 = (int) w6Var.f23223k;
                    int i14 = (int) w6Var.f23224l;
                    int i15 = (int) w6Var.f23225m;
                    int i16 = (int) w6Var.f23222j;
                    org.telegram.ui.Components.yq yqVar = vc1Var.W;
                    if (i15 != 0) {
                        D04 = i15;
                    }
                    yqVar.e(D04, 3);
                    org.telegram.ui.Components.yq yqVar2 = vc1Var.W;
                    if (i14 != 0) {
                        D03 = i14;
                    }
                    yqVar2.e(D03, 2);
                    org.telegram.ui.Components.yq yqVar3 = vc1Var.W;
                    if (i13 != 0) {
                        D02 = i13;
                    }
                    yqVar3.e(D02, 1);
                    org.telegram.ui.Components.yq yqVar4 = vc1Var.W;
                    if (i16 != 0) {
                        D0 = i16;
                    }
                    yqVar4.e(D0, 0);
                }
            }
            int i17 = vc1Var.f44284n;
            if (i17 == 1 || i17 == 3) {
                int i18 = vc1Var.E;
                if (i18 != 0) {
                    w6Var.e = i18;
                } else {
                    w6Var.e = 0;
                }
                int i19 = vc1Var.F;
                if (i19 != 0) {
                    w6Var.f23219f = i19;
                } else {
                    w6Var.f23219f = 0;
                }
                int i20 = vc1Var.G;
                if (i20 != 0) {
                    w6Var.f23220g = i20;
                } else {
                    w6Var.f23220g = 0;
                }
                int i21 = vc1Var.H;
                if (i21 != 0) {
                    w6Var.h = i21;
                } else {
                    w6Var.h = 0;
                }
                if (i17 == 3) {
                    vc1Var.W.e(w6Var.h, 3);
                    vc1Var.W.e(w6Var.f23220g, 2);
                    vc1Var.W.e(w6Var.f23219f, 1);
                    org.telegram.ui.Components.yq yqVar5 = vc1Var.W;
                    int i22 = w6Var.e;
                    if (i22 == 0) {
                        i22 = w6Var.f23218c;
                    }
                    yqVar5.e(i22, 0);
                }
            }
            org.telegram.ui.ActionBar.y6.q1(false, false);
            vc1Var.f44303v0.g1();
            return;
        }
        int i23 = vc1Var.Y;
        if (i23 != -1 && i23 != i11) {
            runnable.run();
        }
        vc1Var.X = i10;
        vc1Var.Y = i11;
        if (z10) {
            runnable.run();
        } else if (!vc1Var.f44247a0) {
            vc1Var.f44247a0 = true;
            vc1Var.fragmentView.postDelayed(runnable, 16L);
        }
    }
}
