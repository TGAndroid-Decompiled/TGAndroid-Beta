package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zc1 implements org.telegram.ui.Components.br {
    public final wd1 f44638a;

    public zc1(wd1 wd1Var) {
        this.f44638a = wd1Var;
    }

    @Override
    public final int B0(int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        wd1 wd1Var = this.f44638a;
        if (wd1Var.f43363n == 3) {
            org.telegram.ui.ActionBar.g6 g6Var = wd1Var.f43340e0;
            if (g6Var.S && i10 == 0 && (f6Var = (org.telegram.ui.ActionBar.f6) g6Var.f20656a0.get(org.telegram.ui.ActionBar.h6.f20964n)) != null) {
                return f6Var.f20609e;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void l(boolean z10) {
        int i10;
        int i11;
        wd1 wd1Var = this.f44638a;
        org.telegram.ui.ActionBar.f6 f6Var = wd1Var.f43375s;
        if (z10) {
            if (f6Var.f20621r == null) {
                wd1Var.finishFragment();
                i11 = ((org.telegram.ui.ActionBar.m2) wd1Var).currentAccount;
                MessagesController.getInstance(i11).saveThemeToServer(f6Var.f20607b, f6Var);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, f6Var.f20607b, f6Var);
                return;
            }
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.m2) wd1Var).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/addtheme/");
            sb2.append(f6Var.f20621r.slug);
            String sb3 = sb2.toString();
            wd1Var.showDialog(new org.telegram.ui.Components.or0(wd1Var.getParentActivity(), null, sb3, false, sb3, false, null));
            return;
        }
        org.telegram.ui.Components.g5.V(wd1Var, 1, null, null);
    }

    @Override
    public final void s0(int i10, int i11, boolean z10) {
        wd1 wd1Var = this.f44638a;
        if (wd1Var.f43328b == 2) {
            wd1Var.a1(i10, i11, true);
            return;
        }
        Runnable runnable = wd1Var.Y;
        org.telegram.ui.ActionBar.f6 f6Var = wd1Var.f43375s;
        if (i11 == -1) {
            int i12 = wd1Var.f43363n;
            if (i12 == 1 || i12 == 2) {
                long j3 = wd1Var.I;
                if (j3 != 0) {
                    f6Var.f20613j = j3;
                } else {
                    f6Var.f20613j = 0L;
                }
                long j10 = wd1Var.J;
                if (j10 != 0) {
                    f6Var.f20614k = j10;
                } else {
                    f6Var.f20614k = 0L;
                }
                long j11 = wd1Var.K;
                if (j11 != 0) {
                    f6Var.f20615l = j11;
                } else {
                    f6Var.f20615l = 0L;
                }
                long j12 = wd1Var.L;
                if (j12 != 0) {
                    f6Var.f20616m = j12;
                } else {
                    f6Var.f20616m = 0L;
                }
                f6Var.f20617n = wd1Var.O;
                if (i12 == 2) {
                    int C0 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Nd);
                    int C02 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Od);
                    int C03 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Pd);
                    int C04 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Qd);
                    int i13 = (int) f6Var.f20614k;
                    int i14 = (int) f6Var.f20615l;
                    int i15 = (int) f6Var.f20616m;
                    int i16 = (int) f6Var.f20613j;
                    org.telegram.ui.Components.cr crVar = wd1Var.V;
                    if (i15 != 0) {
                        C04 = i15;
                    }
                    crVar.e(C04, 3);
                    org.telegram.ui.Components.cr crVar2 = wd1Var.V;
                    if (i14 != 0) {
                        C03 = i14;
                    }
                    crVar2.e(C03, 2);
                    org.telegram.ui.Components.cr crVar3 = wd1Var.V;
                    if (i13 != 0) {
                        C02 = i13;
                    }
                    crVar3.e(C02, 1);
                    org.telegram.ui.Components.cr crVar4 = wd1Var.V;
                    if (i16 != 0) {
                        C0 = i16;
                    }
                    crVar4.e(C0, 0);
                }
            }
            int i17 = wd1Var.f43363n;
            if (i17 == 1 || i17 == 3) {
                int i18 = wd1Var.f43390y;
                if (i18 != 0) {
                    f6Var.f20609e = i18;
                } else {
                    f6Var.f20609e = 0;
                }
                int i19 = wd1Var.E;
                if (i19 != 0) {
                    f6Var.f20610f = i19;
                } else {
                    f6Var.f20610f = 0;
                }
                int i20 = wd1Var.F;
                if (i20 != 0) {
                    f6Var.f20611g = i20;
                } else {
                    f6Var.f20611g = 0;
                }
                int i21 = wd1Var.G;
                if (i21 != 0) {
                    f6Var.h = i21;
                } else {
                    f6Var.h = 0;
                }
                if (i17 == 3) {
                    wd1Var.V.e(f6Var.h, 3);
                    wd1Var.V.e(f6Var.f20611g, 2);
                    wd1Var.V.e(f6Var.f20610f, 1);
                    org.telegram.ui.Components.cr crVar5 = wd1Var.V;
                    int i22 = f6Var.f20609e;
                    if (i22 == 0) {
                        i22 = f6Var.f20608c;
                    }
                    crVar5.e(i22, 0);
                }
            }
            org.telegram.ui.ActionBar.h6.o1(false, false);
            wd1Var.f43380u0.f1();
            return;
        }
        int i23 = wd1Var.X;
        if (i23 != -1 && i23 != i11) {
            runnable.run();
        }
        wd1Var.W = i10;
        wd1Var.X = i11;
        if (z10) {
            runnable.run();
        } else if (!wd1Var.Z) {
            wd1Var.Z = true;
            wd1Var.fragmentView.postDelayed(runnable, 16L);
        }
    }

    @Override
    public final void y() {
        wd1 wd1Var = this.f44638a;
        if (wd1Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wd1Var.getParentActivity());
            alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.DeleteThemeTitle);
            alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.DeleteThemeAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new gq0(this, 20));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
            wd1Var.showDialog(a2Var);
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(wd1Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21026q7));
            }
        }
    }
}
