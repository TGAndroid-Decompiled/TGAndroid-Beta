package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class vb1 implements org.telegram.ui.Components.xq {
    public final tc1 f44765a;

    public vb1(tc1 tc1Var) {
        this.f44765a = tc1Var;
    }

    @Override
    public final int M0(int i10) {
        org.telegram.ui.ActionBar.w6 w6Var;
        tc1 tc1Var = this.f44765a;
        if (tc1Var.f43774n == 3) {
            org.telegram.ui.ActionBar.x6 x6Var = tc1Var.f43754f0;
            if (x6Var.S && i10 == 0 && (w6Var = (org.telegram.ui.ActionBar.w6) x6Var.f23252a0.get(org.telegram.ui.ActionBar.y6.f23533n)) != null) {
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
        tc1 tc1Var = this.f44765a;
        org.telegram.ui.ActionBar.w6 w6Var = tc1Var.v;
        if (z10) {
            if (w6Var.f23229r == null) {
                tc1Var.finishFragment();
                i11 = ((org.telegram.ui.ActionBar.r2) tc1Var).currentAccount;
                MessagesController.getInstance(i11).saveThemeToServer(w6Var.f23216b, w6Var);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, w6Var.f23216b, w6Var);
                return;
            }
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.r2) tc1Var).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/addtheme/");
            sb2.append(w6Var.f23229r.slug);
            String sb3 = sb2.toString();
            tc1Var.showDialog(new org.telegram.ui.Components.mr0(tc1Var.getParentActivity(), null, sb3, false, sb3, false, null));
            return;
        }
        org.telegram.ui.Components.g5.V(tc1Var, 1, null, null);
    }

    @Override
    public final void w() {
        tc1 tc1Var = this.f44765a;
        if (tc1Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tc1Var.getParentActivity());
            alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.DeleteThemeTitle);
            alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.DeleteThemeAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new hl0(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
            tc1Var.showDialog(e2Var);
            TextView textView = (TextView) e2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23598q7, tc1Var.f43736a);
            }
        }
    }

    @Override
    public final void x0(int i10, int i11, boolean z10) {
        tc1 tc1Var = this.f44765a;
        if (tc1Var.f43739b == 2) {
            tc1Var.b1(i10, i11, true);
            return;
        }
        Runnable runnable = tc1Var.Z;
        org.telegram.ui.ActionBar.w6 w6Var = tc1Var.v;
        if (i11 == -1) {
            int i12 = tc1Var.f43774n;
            if (i12 == 1 || i12 == 2) {
                long j10 = tc1Var.J;
                if (j10 != 0) {
                    w6Var.f23221j = j10;
                } else {
                    w6Var.f23221j = 0L;
                }
                long j11 = tc1Var.K;
                if (j11 != 0) {
                    w6Var.f23222k = j11;
                } else {
                    w6Var.f23222k = 0L;
                }
                long j12 = tc1Var.L;
                if (j12 != 0) {
                    w6Var.f23223l = j12;
                } else {
                    w6Var.f23223l = 0L;
                }
                long j13 = tc1Var.M;
                if (j13 != 0) {
                    w6Var.f23224m = j13;
                } else {
                    w6Var.f23224m = 0L;
                }
                w6Var.f23225n = tc1Var.P;
                if (i12 == 2) {
                    int D0 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Nd);
                    int D02 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Od);
                    int D03 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Pd);
                    int D04 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Qd);
                    int i13 = (int) w6Var.f23222k;
                    int i14 = (int) w6Var.f23223l;
                    int i15 = (int) w6Var.f23224m;
                    int i16 = (int) w6Var.f23221j;
                    org.telegram.ui.Components.yq yqVar = tc1Var.W;
                    if (i15 != 0) {
                        D04 = i15;
                    }
                    yqVar.e(D04, 3);
                    org.telegram.ui.Components.yq yqVar2 = tc1Var.W;
                    if (i14 != 0) {
                        D03 = i14;
                    }
                    yqVar2.e(D03, 2);
                    org.telegram.ui.Components.yq yqVar3 = tc1Var.W;
                    if (i13 != 0) {
                        D02 = i13;
                    }
                    yqVar3.e(D02, 1);
                    org.telegram.ui.Components.yq yqVar4 = tc1Var.W;
                    if (i16 != 0) {
                        D0 = i16;
                    }
                    yqVar4.e(D0, 0);
                }
            }
            int i17 = tc1Var.f43774n;
            if (i17 == 1 || i17 == 3) {
                int i18 = tc1Var.E;
                if (i18 != 0) {
                    w6Var.e = i18;
                } else {
                    w6Var.e = 0;
                }
                int i19 = tc1Var.F;
                if (i19 != 0) {
                    w6Var.f23218f = i19;
                } else {
                    w6Var.f23218f = 0;
                }
                int i20 = tc1Var.G;
                if (i20 != 0) {
                    w6Var.f23219g = i20;
                } else {
                    w6Var.f23219g = 0;
                }
                int i21 = tc1Var.H;
                if (i21 != 0) {
                    w6Var.h = i21;
                } else {
                    w6Var.h = 0;
                }
                if (i17 == 3) {
                    tc1Var.W.e(w6Var.h, 3);
                    tc1Var.W.e(w6Var.f23219g, 2);
                    tc1Var.W.e(w6Var.f23218f, 1);
                    org.telegram.ui.Components.yq yqVar5 = tc1Var.W;
                    int i22 = w6Var.e;
                    if (i22 == 0) {
                        i22 = w6Var.f23217c;
                    }
                    yqVar5.e(i22, 0);
                }
            }
            org.telegram.ui.ActionBar.y6.q1(false, false);
            tc1Var.f43793v0.g1();
            return;
        }
        int i23 = tc1Var.Y;
        if (i23 != -1 && i23 != i11) {
            runnable.run();
        }
        tc1Var.X = i10;
        tc1Var.Y = i11;
        if (z10) {
            runnable.run();
        } else if (!tc1Var.f43737a0) {
            tc1Var.f43737a0 = true;
            tc1Var.fragmentView.postDelayed(runnable, 16L);
        }
    }
}
