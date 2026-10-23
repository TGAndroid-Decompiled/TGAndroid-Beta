package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class tb1 implements org.telegram.ui.Components.vq {
    public final qc1 f41945a;

    public tb1(qc1 qc1Var) {
        this.f41945a = qc1Var;
    }

    @Override
    public final void j0(int i10, int i11, boolean z10) {
        qc1 qc1Var = this.f41945a;
        if (qc1Var.f40716b == 2) {
            qc1Var.a1(i10, i11, true);
            return;
        }
        Runnable runnable = qc1Var.Z;
        org.telegram.ui.ActionBar.i6 i6Var = qc1Var.v;
        if (i11 == -1) {
            int i12 = qc1Var.f40751n;
            if (i12 == 1 || i12 == 2) {
                long j10 = qc1Var.J;
                if (j10 != 0) {
                    i6Var.f20970j = j10;
                } else {
                    i6Var.f20970j = 0L;
                }
                long j11 = qc1Var.K;
                if (j11 != 0) {
                    i6Var.f20971k = j11;
                } else {
                    i6Var.f20971k = 0L;
                }
                long j12 = qc1Var.L;
                if (j12 != 0) {
                    i6Var.f20972l = j12;
                } else {
                    i6Var.f20972l = 0L;
                }
                long j13 = qc1Var.M;
                if (j13 != 0) {
                    i6Var.f20973m = j13;
                } else {
                    i6Var.f20973m = 0L;
                }
                i6Var.f20974n = qc1Var.P;
                if (i12 == 2) {
                    int D0 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Nd);
                    int D02 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Od);
                    int D03 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Pd);
                    int D04 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Qd);
                    int i13 = (int) i6Var.f20971k;
                    int i14 = (int) i6Var.f20972l;
                    int i15 = (int) i6Var.f20973m;
                    int i16 = (int) i6Var.f20970j;
                    org.telegram.ui.Components.wq wqVar = qc1Var.W;
                    if (i15 != 0) {
                        D04 = i15;
                    }
                    wqVar.e(D04, 3);
                    org.telegram.ui.Components.wq wqVar2 = qc1Var.W;
                    if (i14 != 0) {
                        D03 = i14;
                    }
                    wqVar2.e(D03, 2);
                    org.telegram.ui.Components.wq wqVar3 = qc1Var.W;
                    if (i13 != 0) {
                        D02 = i13;
                    }
                    wqVar3.e(D02, 1);
                    org.telegram.ui.Components.wq wqVar4 = qc1Var.W;
                    if (i16 != 0) {
                        D0 = i16;
                    }
                    wqVar4.e(D0, 0);
                }
            }
            int i17 = qc1Var.f40751n;
            if (i17 == 1 || i17 == 3) {
                int i18 = qc1Var.E;
                if (i18 != 0) {
                    i6Var.e = i18;
                } else {
                    i6Var.e = 0;
                }
                int i19 = qc1Var.F;
                if (i19 != 0) {
                    i6Var.f20967f = i19;
                } else {
                    i6Var.f20967f = 0;
                }
                int i20 = qc1Var.G;
                if (i20 != 0) {
                    i6Var.f20968g = i20;
                } else {
                    i6Var.f20968g = 0;
                }
                int i21 = qc1Var.H;
                if (i21 != 0) {
                    i6Var.h = i21;
                } else {
                    i6Var.h = 0;
                }
                if (i17 == 3) {
                    qc1Var.W.e(i6Var.h, 3);
                    qc1Var.W.e(i6Var.f20968g, 2);
                    qc1Var.W.e(i6Var.f20967f, 1);
                    org.telegram.ui.Components.wq wqVar5 = qc1Var.W;
                    int i22 = i6Var.e;
                    if (i22 == 0) {
                        i22 = i6Var.f20966c;
                    }
                    wqVar5.e(i22, 0);
                }
            }
            org.telegram.ui.ActionBar.k6.q1(false, false);
            qc1Var.f40770v0.g1();
            return;
        }
        int i23 = qc1Var.Y;
        if (i23 != -1 && i23 != i11) {
            runnable.run();
        }
        qc1Var.X = i10;
        qc1Var.Y = i11;
        if (z10) {
            runnable.run();
        } else if (!qc1Var.f40714a0) {
            qc1Var.f40714a0 = true;
            qc1Var.fragmentView.postDelayed(runnable, 16L);
        }
    }

    @Override
    public final void k(boolean z10) {
        int i10;
        int i11;
        qc1 qc1Var = this.f41945a;
        org.telegram.ui.ActionBar.i6 i6Var = qc1Var.v;
        if (z10) {
            if (i6Var.f20978r == null) {
                qc1Var.finishFragment();
                i11 = ((org.telegram.ui.ActionBar.o2) qc1Var).currentAccount;
                MessagesController.getInstance(i11).saveThemeToServer(i6Var.f20965b, i6Var);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, i6Var.f20965b, i6Var);
                return;
            }
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.o2) qc1Var).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/addtheme/");
            sb2.append(i6Var.f20978r.slug);
            String sb3 = sb2.toString();
            qc1Var.showDialog(new org.telegram.ui.Components.ir0(qc1Var.getParentActivity(), null, sb3, false, sb3, false, null));
            return;
        }
        org.telegram.ui.Components.f5.W(qc1Var, 1, null, null);
    }

    @Override
    public final int r0(int i10) {
        org.telegram.ui.ActionBar.i6 i6Var;
        qc1 qc1Var = this.f41945a;
        if (qc1Var.f40751n == 3) {
            org.telegram.ui.ActionBar.j6 j6Var = qc1Var.f40731f0;
            if (j6Var.S && i10 == 0 && (i6Var = (org.telegram.ui.ActionBar.i6) j6Var.f21020a0.get(org.telegram.ui.ActionBar.k6.f21359n)) != null) {
                return i6Var.e;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void u() {
        qc1 qc1Var = this.f41945a;
        if (qc1Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qc1Var.getParentActivity());
            alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.DeleteThemeTitle);
            alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.DeleteThemeAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new sp0(this, 20));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
            qc1Var.showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, qc1Var.f40713a);
            }
        }
    }
}
