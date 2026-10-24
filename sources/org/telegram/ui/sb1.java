package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class sb1 implements org.telegram.ui.Components.tq {
    public final pc1 f41341a;

    public sb1(pc1 pc1Var) {
        this.f41341a = pc1Var;
    }

    @Override
    public final void j0(int i10, int i11, boolean z10) {
        pc1 pc1Var = this.f41341a;
        if (pc1Var.f40445b == 2) {
            pc1Var.a1(i10, i11, true);
            return;
        }
        Runnable runnable = pc1Var.Z;
        org.telegram.ui.ActionBar.i6 i6Var = pc1Var.v;
        if (i11 == -1) {
            int i12 = pc1Var.f40480n;
            if (i12 == 1 || i12 == 2) {
                long j10 = pc1Var.J;
                if (j10 != 0) {
                    i6Var.f20971j = j10;
                } else {
                    i6Var.f20971j = 0L;
                }
                long j11 = pc1Var.K;
                if (j11 != 0) {
                    i6Var.f20972k = j11;
                } else {
                    i6Var.f20972k = 0L;
                }
                long j12 = pc1Var.L;
                if (j12 != 0) {
                    i6Var.f20973l = j12;
                } else {
                    i6Var.f20973l = 0L;
                }
                long j13 = pc1Var.M;
                if (j13 != 0) {
                    i6Var.f20974m = j13;
                } else {
                    i6Var.f20974m = 0L;
                }
                i6Var.f20975n = pc1Var.P;
                if (i12 == 2) {
                    int D0 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Nd);
                    int D02 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Od);
                    int D03 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Pd);
                    int D04 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Qd);
                    int i13 = (int) i6Var.f20972k;
                    int i14 = (int) i6Var.f20973l;
                    int i15 = (int) i6Var.f20974m;
                    int i16 = (int) i6Var.f20971j;
                    org.telegram.ui.Components.uq uqVar = pc1Var.W;
                    if (i15 != 0) {
                        D04 = i15;
                    }
                    uqVar.e(D04, 3);
                    org.telegram.ui.Components.uq uqVar2 = pc1Var.W;
                    if (i14 != 0) {
                        D03 = i14;
                    }
                    uqVar2.e(D03, 2);
                    org.telegram.ui.Components.uq uqVar3 = pc1Var.W;
                    if (i13 != 0) {
                        D02 = i13;
                    }
                    uqVar3.e(D02, 1);
                    org.telegram.ui.Components.uq uqVar4 = pc1Var.W;
                    if (i16 != 0) {
                        D0 = i16;
                    }
                    uqVar4.e(D0, 0);
                }
            }
            int i17 = pc1Var.f40480n;
            if (i17 == 1 || i17 == 3) {
                int i18 = pc1Var.E;
                if (i18 != 0) {
                    i6Var.e = i18;
                } else {
                    i6Var.e = 0;
                }
                int i19 = pc1Var.F;
                if (i19 != 0) {
                    i6Var.f20968f = i19;
                } else {
                    i6Var.f20968f = 0;
                }
                int i20 = pc1Var.G;
                if (i20 != 0) {
                    i6Var.f20969g = i20;
                } else {
                    i6Var.f20969g = 0;
                }
                int i21 = pc1Var.H;
                if (i21 != 0) {
                    i6Var.h = i21;
                } else {
                    i6Var.h = 0;
                }
                if (i17 == 3) {
                    pc1Var.W.e(i6Var.h, 3);
                    pc1Var.W.e(i6Var.f20969g, 2);
                    pc1Var.W.e(i6Var.f20968f, 1);
                    org.telegram.ui.Components.uq uqVar5 = pc1Var.W;
                    int i22 = i6Var.e;
                    if (i22 == 0) {
                        i22 = i6Var.f20967c;
                    }
                    uqVar5.e(i22, 0);
                }
            }
            org.telegram.ui.ActionBar.k6.q1(false, false);
            pc1Var.f40499v0.g1();
            return;
        }
        int i23 = pc1Var.Y;
        if (i23 != -1 && i23 != i11) {
            runnable.run();
        }
        pc1Var.X = i10;
        pc1Var.Y = i11;
        if (z10) {
            runnable.run();
        } else if (!pc1Var.f40443a0) {
            pc1Var.f40443a0 = true;
            pc1Var.fragmentView.postDelayed(runnable, 16L);
        }
    }

    @Override
    public final void k(boolean z10) {
        int i10;
        int i11;
        pc1 pc1Var = this.f41341a;
        org.telegram.ui.ActionBar.i6 i6Var = pc1Var.v;
        if (z10) {
            if (i6Var.f20979r == null) {
                pc1Var.finishFragment();
                i11 = ((org.telegram.ui.ActionBar.o2) pc1Var).currentAccount;
                MessagesController.getInstance(i11).saveThemeToServer(i6Var.f20966b, i6Var);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, i6Var.f20966b, i6Var);
                return;
            }
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.o2) pc1Var).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/addtheme/");
            sb2.append(i6Var.f20979r.slug);
            String sb3 = sb2.toString();
            pc1Var.showDialog(new org.telegram.ui.Components.hr0(pc1Var.getParentActivity(), null, sb3, false, sb3, false, null));
            return;
        }
        org.telegram.ui.Components.d5.V(pc1Var, 1, null, null);
    }

    @Override
    public final int r0(int i10) {
        org.telegram.ui.ActionBar.i6 i6Var;
        pc1 pc1Var = this.f41341a;
        if (pc1Var.f40480n == 3) {
            org.telegram.ui.ActionBar.j6 j6Var = pc1Var.f40460f0;
            if (j6Var.S && i10 == 0 && (i6Var = (org.telegram.ui.ActionBar.i6) j6Var.f21021a0.get(org.telegram.ui.ActionBar.k6.f21360n)) != null) {
                return i6Var.e;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void u() {
        pc1 pc1Var = this.f41341a;
        if (pc1Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pc1Var.getParentActivity());
            alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.DeleteThemeTitle);
            alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.DeleteThemeAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new rp0(this, 20));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
            pc1Var.showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21422q7, pc1Var.f40442a);
            }
        }
    }
}
