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
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jk;
import org.telegram.ui.l20;
import org.telegram.ui.xn;
public final class l7 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final long X;
    public final l20 Y;
    public final FrameLayout Z;
    public final s00 f47350a0;
    public Runnable f47351b0;
    public final TLRPC.InputPeer f47352c0;
    public final boolean f47353d0;
    public v51 f47354e0;
    public boolean f47355f0;

    public l7(android.content.Context r16, org.telegram.ui.ActionBar.d6 r17, long r18, int r20, java.lang.String r21, java.lang.Runnable r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: yh.l7.<init>(android.content.Context, org.telegram.ui.ActionBar.d6, long, int, java.lang.String, java.lang.Runnable, long):void");
    }

    public static void P(l7 l7Var, int i10) {
        h51 G;
        v51 v51Var = l7Var.f47354e0;
        if (v51Var != null && (G = v51Var.G(i10 - 1)) != null) {
            v51 v51Var2 = l7Var.f47354e0;
            if (G.d == -1) {
                l7Var.f47355f0 = !l7Var.f47355f0;
                v51Var2.N(true);
            } else if (G.G(i7.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
                Activity findActivity = AndroidUtilities.findActivity(l7Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null) {
                    t5.y(l7Var.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new ai.m0(25, l7Var, G), l7Var.f47352c0);
                }
            }
        }
    }

    public static void Q(l7 l7Var, h51 h51Var, Boolean bool, String str) {
        if (l7Var.getContext() != null) {
            if (bool.booleanValue()) {
                new xc((FrameLayout) l7Var.containerView, l7Var.resourcesProvider).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) h51Var.B, new Object[0])), R.raw.stars_topup).j();
                l7Var.f47350a0.c(true);
                t5.y(l7Var.currentAccount, false).T(true);
            } else if (str != null) {
                hg.c.s(R.string.UnknownErrorCode, new Object[]{str}, new xc((FrameLayout) l7Var.containerView, l7Var.resourcesProvider), R.raw.error, 36);
            }
        }
    }

    public final void R(ArrayList arrayList, v51 v51Var) {
        long j3;
        int i10;
        int i11;
        l20 l20Var = this.Y;
        arrayList.add(h51.l(l20Var));
        boolean z10 = this.f47353d0;
        if (z10) {
            com.google.android.gms.internal.vision.e2.n(R.string.TelegramStarsChoose, arrayList);
        }
        int i12 = 0;
        ArrayList z11 = t5.y(this.currentAccount, false).z();
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
                        if (tL_starsTopupOption.extended && !this.f47355f0 && z12) {
                            i15++;
                        } else {
                            arrayList.add(i7.a(i13, i16, tL_starsTopupOption));
                            i14++;
                            i16++;
                            z12 = true;
                        }
                    }
                    i13++;
                }
                if (i14 < 3) {
                    arrayList.clear();
                    arrayList.add(h51.k(l20Var));
                    com.google.android.gms.internal.vision.e2.n(R.string.TelegramStarsChoose, arrayList);
                    int i17 = 0;
                    for (int i18 = 0; i18 < z11.size(); i18++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) z11.get(i18);
                        if (tL_starsTopupOption2.stars >= j3) {
                            arrayList.add(i7.a(i18, i16, tL_starsTopupOption2));
                            i17++;
                            i16++;
                        }
                    }
                    if (i17 == 0) {
                        while (i12 < z11.size()) {
                            arrayList.add(i7.a(i12, i16, (TL_stars.TL_starsTopupOption) z11.get(i12)));
                            i12++;
                            i16++;
                        }
                        boolean z13 = this.f47355f0;
                        if (!z13 && i15 > 0) {
                            if (z13) {
                                i11 = R.string.NotifyLessOptions;
                            } else {
                                i11 = R.string.NotifyMoreOptions;
                            }
                            String string = LocaleController.getString(i11);
                            int i19 = e7.f47034a;
                            h51 J = h51.J(e7.class);
                            J.d = -1;
                            J.f24507l = string;
                            J.f24502f = !this.f47355f0;
                            J.f24512q = true;
                            arrayList.add(J);
                        }
                    } else {
                        this.f47355f0 = true;
                    }
                } else if (i14 > 0) {
                    boolean z14 = this.f47355f0;
                    if (!z14 && i15 > 0) {
                        if (z14) {
                            i10 = R.string.NotifyLessOptions;
                        } else {
                            i10 = R.string.NotifyMoreOptions;
                        }
                        String string2 = LocaleController.getString(i10);
                        int i20 = e7.f47034a;
                        h51 J2 = h51.J(e7.class);
                        J2.d = -1;
                        J2.f24507l = string2;
                        J2.f24502f = !this.f47355f0;
                        J2.f24512q = true;
                        arrayList.add(J2);
                    }
                } else {
                    while (i12 < z11.size()) {
                        arrayList.add(i7.a(i12, i16, (TL_stars.TL_starsTopupOption) z11.get(i12)));
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
            v51 v51Var = this.f47354e0;
            if (v51Var != null) {
                v51Var.N(true);
            }
            long j3 = t5.y(this.currentAccount, false).p().amount;
            long j10 = this.X;
            ((TextView) this.Y.f34846b).setText(LocaleController.formatPluralStringComma("StarsNeededTitle", (int) (j10 - j3)));
            xa xaVar = this.e;
            if (xaVar != null) {
                xaVar.setTitle(y());
            }
            if (j3 >= j10 && (runnable = this.f47351b0) != null) {
                runnable.run();
                this.f47351b0 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        l20 l20Var = this.Y;
        if (l20Var != null) {
            ((sg.e) l20Var.f34847c).setPaused(true);
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
        if (!this.f47353d0) {
            org.telegram.messenger.z0.o(R.string.PaymentInvoiceDisabledStarsText, new xc(lb.a(getContext()), this.resourcesProvider), R.raw.stars_topup, 36);
        } else if (t5.y(this.currentAccount, false).p().amount >= this.X) {
            Runnable runnable = this.f47351b0;
            if (runnable != null) {
                runnable.run();
                this.f47351b0 = null;
            }
        } else {
            org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
            if (R instanceof xn) {
                xn xnVar = (xn) R;
                if (xnVar.x9() && (jkVar = xnVar.Y) != null) {
                    jkVar.Q();
                }
            }
            super.show();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        }
    }

    @Override
    public final ll0 v(ml0 ml0Var) {
        v51 v51Var = new v51(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 28), this.resourcesProvider);
        this.f47354e0 = v51Var;
        return v51Var;
    }

    @Override
    public final CharSequence y() {
        l20 l20Var = this.Y;
        if (l20Var == null) {
            return null;
        }
        return ((TextView) l20Var.f34846b).getText();
    }
}
