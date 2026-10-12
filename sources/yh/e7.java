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
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.za;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
import org.telegram.ui.o20;
import org.telegram.ui.sk;
public final class e7 extends db implements NotificationCenter.NotificationCenterDelegate {
    public final long X;
    public final o20 Y;
    public final FrameLayout Z;
    public final k10 f52663a0;
    public Runnable f52664b0;
    public final TLRPC.InputPeer f52665c0;
    public final boolean f52666d0;
    public h71 f52667e0;
    public boolean f52668f0;

    public e7(android.content.Context r16, org.telegram.ui.ActionBar.c6 r17, long r18, int r20, java.lang.String r21, java.lang.Runnable r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: yh.e7.<init>(android.content.Context, org.telegram.ui.ActionBar.c6, long, int, java.lang.String, java.lang.Runnable, long):void");
    }

    public static void Q(e7 e7Var, int i10) {
        u61 G;
        h71 h71Var = e7Var.f52667e0;
        if (h71Var != null && (G = h71Var.G(i10 - 1)) != null) {
            h71 h71Var2 = e7Var.f52667e0;
            if (G.d == -1) {
                e7Var.f52668f0 = !e7Var.f52668f0;
                h71Var2.N(true);
            } else if (G.G(b7.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
                Activity findActivity = AndroidUtilities.findActivity(e7Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null) {
                    n5.y(e7Var.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new qh.r(5, e7Var, G), e7Var.f52665c0);
                }
            }
        }
    }

    public static void R(e7 e7Var, u61 u61Var, Boolean bool, String str) {
        if (e7Var.getContext() != null) {
            if (bool.booleanValue()) {
                new zc((FrameLayout) e7Var.containerView, e7Var.resourcesProvider).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) u61Var.B, new Object[0])), R.raw.stars_topup).j();
                e7Var.f52663a0.c(true);
                n5.y(e7Var.currentAccount, false).T(true);
            } else if (str != null) {
                hg.c.s(R.string.UnknownErrorCode, new Object[]{str}, new zc((FrameLayout) e7Var.containerView, e7Var.resourcesProvider), R.raw.error, 36);
            }
        }
    }

    @Override
    public final CharSequence A() {
        o20 o20Var = this.Y;
        if (o20Var == null) {
            return null;
        }
        return ((TextView) o20Var.f40542b).getText();
    }

    public final void S(ArrayList arrayList, h71 h71Var) {
        long j3;
        int i10;
        int i11;
        o20 o20Var = this.Y;
        arrayList.add(u61.l(o20Var));
        boolean z10 = this.f52666d0;
        if (z10) {
            com.google.android.gms.internal.vision.e2.n(R.string.TelegramStarsChoose, arrayList);
        }
        int i12 = 0;
        ArrayList z11 = n5.y(this.currentAccount, false).z();
        if (z10) {
            if (z11 != null && !z11.isEmpty()) {
                int i13 = 1;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                boolean z12 = false;
                while (true) {
                    int size = z11.size();
                    j3 = this.X;
                    if (i14 >= size) {
                        break;
                    }
                    TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z11.get(i14);
                    if (tL_starsTopupOption.stars >= j3) {
                        if (tL_starsTopupOption.extended && !this.f52668f0 && z12) {
                            i16++;
                        } else {
                            arrayList.add(b7.a(i14, i13, tL_starsTopupOption));
                            i15++;
                            i13++;
                            z12 = true;
                        }
                    }
                    i14++;
                }
                if (i15 < 3) {
                    arrayList.clear();
                    arrayList.add(u61.k(o20Var));
                    com.google.android.gms.internal.vision.e2.n(R.string.TelegramStarsChoose, arrayList);
                    int i17 = 0;
                    for (int i18 = 0; i18 < z11.size(); i18++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) z11.get(i18);
                        if (tL_starsTopupOption2.stars >= j3) {
                            arrayList.add(b7.a(i18, i13, tL_starsTopupOption2));
                            i17++;
                            i13++;
                        }
                    }
                    if (i17 == 0) {
                        while (i12 < z11.size()) {
                            arrayList.add(b7.a(i12, i13, (TL_stars.TL_starsTopupOption) z11.get(i12)));
                            i12++;
                            i13++;
                        }
                        boolean z13 = this.f52668f0;
                        if (!z13 && i16 > 0) {
                            if (z13) {
                                i11 = R.string.NotifyLessOptions;
                            } else {
                                i11 = R.string.NotifyMoreOptions;
                            }
                            String string = LocaleController.getString(i11);
                            int i19 = x6.f53603a;
                            u61 J = u61.J(x6.class);
                            J.d = -1;
                            J.f31076l = string;
                            J.f31071f = !this.f52668f0;
                            J.f31081q = true;
                            arrayList.add(J);
                        }
                    } else {
                        this.f52668f0 = true;
                    }
                } else if (i15 > 0) {
                    boolean z14 = this.f52668f0;
                    if (!z14 && i16 > 0) {
                        if (z14) {
                            i10 = R.string.NotifyLessOptions;
                        } else {
                            i10 = R.string.NotifyMoreOptions;
                        }
                        String string2 = LocaleController.getString(i10);
                        int i20 = x6.f53603a;
                        u61 J2 = u61.J(x6.class);
                        J2.d = -1;
                        J2.f31076l = string2;
                        J2.f31071f = !this.f52668f0;
                        J2.f31081q = true;
                        arrayList.add(J2);
                    }
                } else {
                    while (i12 < z11.size()) {
                        arrayList.add(b7.a(i12, i13, (TL_stars.TL_starsTopupOption) z11.get(i12)));
                        i12++;
                        i13++;
                    }
                }
            } else {
                arrayList.add(u61.n(31));
                arrayList.add(u61.n(31));
                arrayList.add(u61.n(31));
            }
        }
        arrayList.add(u61.k(this.Z));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            h71 h71Var = this.f52667e0;
            if (h71Var != null) {
                h71Var.N(true);
            }
            long j3 = n5.y(this.currentAccount, false).p().amount;
            long j10 = this.X;
            ((TextView) this.Y.f40542b).setText(LocaleController.formatPluralStringComma("StarsNeededTitle", (int) (j10 - j3)));
            za zaVar = this.f25295e;
            if (zaVar != null) {
                zaVar.setTitle(A());
            }
            if (j3 >= j10 && (runnable = this.f52664b0) != null) {
                runnable.run();
                this.f52664b0 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        o20 o20Var = this.Y;
        if (o20Var != null) {
            ((sg.n) o20Var.f40543c).setPaused(true);
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
        sk skVar;
        if (!this.f52666d0) {
            org.telegram.messenger.v0.q(R.string.PaymentInvoiceDisabledStarsText, new zc(nb.a(getContext()), this.resourcesProvider), R.raw.stars_topup, 36);
        } else if (n5.y(this.currentAccount, false).p().amount >= this.X) {
            Runnable runnable = this.f52664b0;
            if (runnable != null) {
                runnable.run();
                this.f52664b0 = null;
            }
        } else {
            org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
            if (R instanceof eo) {
                eo eoVar = (eo) R;
                if (eoVar.C9() && (skVar = eoVar.Y) != null) {
                    skVar.Q();
                }
            }
            super.show();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        }
    }

    @Override
    public final vm0 x(wm0 wm0Var) {
        h71 h71Var = new h71(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 28), this.resourcesProvider);
        this.f52667e0 = h71Var;
        return h71Var;
    }
}
