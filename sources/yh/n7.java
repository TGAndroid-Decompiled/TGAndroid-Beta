package yh;

import android.app.Activity;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.mb;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.ya;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jk;
import org.telegram.ui.o20;
import org.telegram.ui.yn;
public final class n7 extends cb implements NotificationCenter.NotificationCenterDelegate {
    public final long X;
    public final o20 Y;
    public final FrameLayout Z;
    public final u00 f51709a0;
    public Runnable f51710b0;
    public final TLRPC.InputPeer f51711c0;
    public final boolean f51712d0;
    public w61 f51713e0;
    public boolean f51714f0;

    public n7(android.content.Context r16, org.telegram.ui.ActionBar.d6 r17, long r18, int r20, java.lang.String r21, java.lang.Runnable r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: yh.n7.<init>(android.content.Context, org.telegram.ui.ActionBar.d6, long, int, java.lang.String, java.lang.Runnable, long):void");
    }

    public static void N(n7 n7Var, int i10) {
        h61 G;
        w61 w61Var = n7Var.f51713e0;
        if (w61Var != null && (G = w61Var.G(i10 - 1)) != null) {
            w61 w61Var2 = n7Var.f51713e0;
            if (G.d == -1) {
                n7Var.f51714f0 = !n7Var.f51714f0;
                w61Var2.N(true);
            } else if (G.H(k7.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
                Activity findActivity = AndroidUtilities.findActivity(n7Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null) {
                    u5.y(n7Var.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new ai.m0(25, n7Var, G), n7Var.f51711c0);
                }
            }
        }
    }

    public static void O(n7 n7Var, h61 h61Var, Boolean bool, String str) {
        if (n7Var.getContext() != null) {
            if (bool.booleanValue()) {
                new yc((FrameLayout) n7Var.containerView, n7Var.resourcesProvider).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) h61Var.B, new Object[0])), R.raw.stars_topup).j();
                n7Var.f51709a0.c(true);
                u5.y(n7Var.currentAccount, false).T(true);
            } else if (str != null) {
                hg.c.q(R.string.UnknownErrorCode, new Object[]{str}, new yc((FrameLayout) n7Var.containerView, n7Var.resourcesProvider), R.raw.error, 36);
            }
        }
    }

    public final void P(ArrayList arrayList, w61 w61Var) {
        long j3;
        int i10;
        int i11;
        o20 o20Var = this.Y;
        arrayList.add(h61.m(o20Var));
        boolean z10 = this.f51712d0;
        if (z10) {
            com.google.android.gms.internal.vision.e2.n(R.string.TelegramStarsChoose, arrayList);
        }
        int i12 = 0;
        ArrayList z11 = u5.y(this.currentAccount, false).z();
        if (z10) {
            if (z11 != null && !z11.isEmpty()) {
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                boolean z12 = false;
                int i16 = 1;
                while (true) {
                    int size = z11.size();
                    j3 = this.X;
                    if (i13 >= size) {
                        break;
                    }
                    TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z11.get(i13);
                    if (tL_starsTopupOption.stars >= j3) {
                        if (tL_starsTopupOption.extended && !this.f51714f0 && z12) {
                            i15++;
                        } else {
                            arrayList.add(k7.a(i13, i16, tL_starsTopupOption));
                            i14++;
                            i16++;
                            z12 = true;
                        }
                    }
                    i13++;
                }
                if (i14 < 3) {
                    arrayList.clear();
                    arrayList.add(h61.k(o20Var));
                    com.google.android.gms.internal.vision.e2.n(R.string.TelegramStarsChoose, arrayList);
                    int i17 = 0;
                    for (int i18 = 0; i18 < z11.size(); i18++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) z11.get(i18);
                        if (tL_starsTopupOption2.stars >= j3) {
                            arrayList.add(k7.a(i18, i16, tL_starsTopupOption2));
                            i17++;
                            i16++;
                        }
                    }
                    if (i17 == 0) {
                        while (i12 < z11.size()) {
                            arrayList.add(k7.a(i12, i16, (TL_stars.TL_starsTopupOption) z11.get(i12)));
                            i12++;
                            i16++;
                        }
                        boolean z13 = this.f51714f0;
                        if (!z13 && i15 > 0) {
                            if (z13) {
                                i11 = R.string.NotifyLessOptions;
                            } else {
                                i11 = R.string.NotifyMoreOptions;
                            }
                            String string = LocaleController.getString(i11);
                            int i19 = g7.f51360a;
                            h61 K = h61.K(g7.class);
                            K.d = -1;
                            K.f27093l = string;
                            K.f27088f = !this.f51714f0;
                            K.f27098q = true;
                            arrayList.add(K);
                        }
                    } else {
                        this.f51714f0 = true;
                    }
                } else if (i14 > 0) {
                    boolean z14 = this.f51714f0;
                    if (!z14 && i15 > 0) {
                        if (z14) {
                            i10 = R.string.NotifyLessOptions;
                        } else {
                            i10 = R.string.NotifyMoreOptions;
                        }
                        String string2 = LocaleController.getString(i10);
                        int i20 = g7.f51360a;
                        h61 K2 = h61.K(g7.class);
                        K2.d = -1;
                        K2.f27093l = string2;
                        K2.f27088f = !this.f51714f0;
                        K2.f27098q = true;
                        arrayList.add(K2);
                    }
                } else {
                    while (i12 < z11.size()) {
                        arrayList.add(k7.a(i12, i16, (TL_stars.TL_starsTopupOption) z11.get(i12)));
                        i12++;
                        i16++;
                    }
                }
            } else {
                arrayList.add(h61.p(31));
                arrayList.add(h61.p(31));
                arrayList.add(h61.p(31));
            }
        }
        arrayList.add(h61.k(this.Z));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            w61 w61Var = this.f51713e0;
            if (w61Var != null) {
                w61Var.N(true);
            }
            long j3 = u5.y(this.currentAccount, false).p().amount;
            long j10 = this.X;
            ((TextView) this.Y.f39085b).setText(LocaleController.formatPluralStringComma("StarsNeededTitle", (int) (j10 - j3)));
            ya yaVar = this.f25355e;
            if (yaVar != null) {
                yaVar.setTitle(y());
            }
            if (j3 >= j10 && (runnable = this.f51710b0) != null) {
                runnable.run();
                this.f51710b0 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        o20 o20Var = this.Y;
        if (o20Var != null) {
            ((sg.e) o20Var.f39086c).setPaused(true);
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final void show() {
        jk jkVar;
        if (!this.f51712d0) {
            org.telegram.messenger.q.p(R.string.PaymentInvoiceDisabledStarsText, new yc(mb.a(getContext()), this.resourcesProvider), R.raw.stars_topup, 36);
        } else if (u5.y(this.currentAccount, false).p().amount >= this.X) {
            Runnable runnable = this.f51710b0;
            if (runnable != null) {
                runnable.run();
                this.f51710b0 = null;
            }
        } else {
            org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
            if (R instanceof yn) {
                yn ynVar = (yn) R;
                if (ynVar.w9() && (jkVar = ynVar.W) != null) {
                    jkVar.N();
                }
            }
            super.show();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        }
    }

    @Override
    public final yl0 v(zl0 zl0Var) {
        w61 w61Var = new w61(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 29), this.resourcesProvider);
        this.f51713e0 = w61Var;
        return w61Var;
    }

    @Override
    public final CharSequence y() {
        o20 o20Var = this.Y;
        if (o20Var == null) {
            return null;
        }
        return ((TextView) o20Var.f39085b).getText();
    }
}
