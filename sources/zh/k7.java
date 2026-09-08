package zh;

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
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.co;
import org.telegram.ui.mk;
import org.telegram.ui.o20;
public final class k7 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final long X;
    public final o20 Y;
    public final FrameLayout Z;
    public final r00 f52175a0;
    public Runnable f52176b0;
    public final TLRPC.InputPeer f52177c0;
    public final boolean f52178d0;
    public v51 f52179e0;
    public boolean f52180f0;

    public k7(android.content.Context r16, org.telegram.ui.ActionBar.f6 r17, long r18, int r20, java.lang.String r21, java.lang.Runnable r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: zh.k7.<init>(android.content.Context, org.telegram.ui.ActionBar.f6, long, int, java.lang.String, java.lang.Runnable, long):void");
    }

    public static void P(k7 k7Var, int i10) {
        h51 G;
        v51 v51Var = k7Var.f52179e0;
        if (v51Var != null && (G = v51Var.G(i10 - 1)) != null) {
            v51 v51Var2 = k7Var.f52179e0;
            if (G.d == -1) {
                k7Var.f52180f0 = !k7Var.f52180f0;
                v51Var2.N(true);
            } else if (G.G(h7.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
                Activity findActivity = AndroidUtilities.findActivity(k7Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null) {
                    s5.y(k7Var.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new bi.f0(25, k7Var, G), k7Var.f52177c0);
                }
            }
        }
    }

    public static void Q(k7 k7Var, h51 h51Var, Boolean bool, String str) {
        if (k7Var.getContext() != null) {
            if (bool.booleanValue()) {
                new yc((FrameLayout) k7Var.containerView, k7Var.resourcesProvider).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) h51Var.B, new Object[0])), R.raw.stars_topup).j();
                k7Var.f52175a0.c(true);
                s5.y(k7Var.currentAccount, false).T(true);
            } else if (str != null) {
                i2.g.s(R.string.UnknownErrorCode, new Object[]{str}, new yc((FrameLayout) k7Var.containerView, k7Var.resourcesProvider), R.raw.error, 36);
            }
        }
    }

    public final void R(ArrayList arrayList, v51 v51Var) {
        long j3;
        int i10;
        int i11;
        o20 o20Var = this.Y;
        arrayList.add(h51.l(o20Var));
        boolean z10 = this.f52178d0;
        if (z10) {
            i2.g.p(R.string.TelegramStarsChoose, arrayList);
        }
        int i12 = 0;
        ArrayList z11 = s5.y(this.currentAccount, false).z();
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
                        if (tL_starsTopupOption.extended && !this.f52180f0 && z12) {
                            i15++;
                        } else {
                            arrayList.add(h7.a(i13, i16, tL_starsTopupOption));
                            i14++;
                            i16++;
                            z12 = true;
                        }
                    }
                    i13++;
                }
                if (i14 < 3) {
                    arrayList.clear();
                    arrayList.add(h51.k(o20Var));
                    i2.g.p(R.string.TelegramStarsChoose, arrayList);
                    int i17 = 0;
                    for (int i18 = 0; i18 < z11.size(); i18++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) z11.get(i18);
                        if (tL_starsTopupOption2.stars >= j3) {
                            arrayList.add(h7.a(i18, i16, tL_starsTopupOption2));
                            i17++;
                            i16++;
                        }
                    }
                    if (i17 == 0) {
                        while (i12 < z11.size()) {
                            arrayList.add(h7.a(i12, i16, (TL_stars.TL_starsTopupOption) z11.get(i12)));
                            i12++;
                            i16++;
                        }
                        boolean z13 = this.f52180f0;
                        if (!z13 && i15 > 0) {
                            if (z13) {
                                i11 = R.string.NotifyLessOptions;
                            } else {
                                i11 = R.string.NotifyMoreOptions;
                            }
                            String string = LocaleController.getString(i11);
                            int i19 = d7.f51832a;
                            h51 J = h51.J(d7.class);
                            J.d = -1;
                            J.f26621l = string;
                            J.f26616f = !this.f52180f0;
                            J.f26626q = true;
                            arrayList.add(J);
                        }
                    } else {
                        this.f52180f0 = true;
                    }
                } else if (i14 > 0) {
                    boolean z14 = this.f52180f0;
                    if (!z14 && i15 > 0) {
                        if (z14) {
                            i10 = R.string.NotifyLessOptions;
                        } else {
                            i10 = R.string.NotifyMoreOptions;
                        }
                        String string2 = LocaleController.getString(i10);
                        int i20 = d7.f51832a;
                        h51 J2 = h51.J(d7.class);
                        J2.d = -1;
                        J2.f26621l = string2;
                        J2.f26616f = !this.f52180f0;
                        J2.f26626q = true;
                        arrayList.add(J2);
                    }
                } else {
                    while (i12 < z11.size()) {
                        arrayList.add(h7.a(i12, i16, (TL_stars.TL_starsTopupOption) z11.get(i12)));
                        i12++;
                        i16++;
                    }
                }
            } else {
                arrayList.add(h51.n(31));
                arrayList.add(h51.n(31));
                arrayList.add(h51.n(31));
            }
        }
        arrayList.add(h51.k(this.Z));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            v51 v51Var = this.f52179e0;
            if (v51Var != null) {
                v51Var.N(true);
            }
            long j3 = s5.y(this.currentAccount, false).p().amount;
            long j10 = this.X;
            ((TextView) this.Y.f39115b).setText(LocaleController.formatPluralStringComma("StarsNeededTitle", (int) (j10 - j3)));
            xa xaVar = this.f24674e;
            if (xaVar != null) {
                xaVar.setTitle(y());
            }
            if (j3 >= j10 && (runnable = this.f52176b0) != null) {
                runnable.run();
                this.f52176b0 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        o20 o20Var = this.Y;
        if (o20Var != null) {
            ((tg.e) o20Var.f39116c).setPaused(true);
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
        mk mkVar;
        if (!this.f52178d0) {
            org.telegram.messenger.w1.o(R.string.PaymentInvoiceDisabledStarsText, new yc(lb.a(getContext()), this.resourcesProvider), R.raw.stars_topup, 36);
        } else if (s5.y(this.currentAccount, false).p().amount >= this.X) {
            Runnable runnable = this.f52176b0;
            if (runnable != null) {
                runnable.run();
                this.f52176b0 = null;
            }
        } else {
            org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
            if (R instanceof co) {
                co coVar = (co) R;
                if (coVar.x9() && (mkVar = coVar.Y) != null) {
                    mkVar.P();
                }
            }
            super.show();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        }
    }

    @Override
    public final kl0 v(ll0 ll0Var) {
        v51 v51Var = new v51(this.d, getContext(), this.currentAccount, 0, true, new ii.a(this, 28), this.resourcesProvider);
        this.f52179e0 = v51Var;
        return v51Var;
    }

    @Override
    public final CharSequence y() {
        o20 o20Var = this.Y;
        if (o20Var == null) {
            return null;
        }
        return ((TextView) o20Var.f39115b).getText();
    }
}
