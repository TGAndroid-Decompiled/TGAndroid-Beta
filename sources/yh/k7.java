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
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.lk;
import org.telegram.ui.o20;
import org.telegram.ui.zn;
public final class k7 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final long X;
    public final o20 Y;
    public final FrameLayout Z;
    public final r00 f47617a0;
    public Runnable f47618b0;
    public final TLRPC.InputPeer f47619c0;
    public final boolean f47620d0;
    public l61 f47621e0;
    public boolean f47622f0;

    public k7(android.content.Context r16, org.telegram.ui.ActionBar.e6 r17, long r18, int r20, java.lang.String r21, java.lang.Runnable r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: yh.k7.<init>(android.content.Context, org.telegram.ui.ActionBar.e6, long, int, java.lang.String, java.lang.Runnable, long):void");
    }

    public static void P(k7 k7Var, int i10) {
        x51 G;
        l61 l61Var = k7Var.f47621e0;
        if (l61Var != null && (G = l61Var.G(i10 - 1)) != null) {
            l61 l61Var2 = k7Var.f47621e0;
            if (G.d == -1) {
                k7Var.f47622f0 = !k7Var.f47622f0;
                l61Var2.N(true);
            } else if (G.G(h7.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
                Activity findActivity = AndroidUtilities.findActivity(k7Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null) {
                    t5.y(k7Var.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new ai.m0(25, k7Var, G), k7Var.f47619c0);
                }
            }
        }
    }

    public static void Q(k7 k7Var, x51 x51Var, Boolean bool, String str) {
        if (k7Var.getContext() != null) {
            if (bool.booleanValue()) {
                new xc((FrameLayout) k7Var.containerView, k7Var.resourcesProvider).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) x51Var.B, new Object[0])), R.raw.stars_topup).j();
                k7Var.f47617a0.c(true);
                t5.y(k7Var.currentAccount, false).T(true);
            } else if (str != null) {
                hg.k0.p(R.string.UnknownErrorCode, new Object[]{str}, new xc((FrameLayout) k7Var.containerView, k7Var.resourcesProvider), R.raw.error, 36);
            }
        }
    }

    public final void R(ArrayList arrayList, l61 l61Var) {
        long j3;
        int i10;
        int i11;
        o20 o20Var = this.Y;
        arrayList.add(x51.l(o20Var));
        boolean z10 = this.f47620d0;
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
                        if (tL_starsTopupOption.extended && !this.f47622f0 && z12) {
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
                    arrayList.add(x51.k(o20Var));
                    com.google.android.gms.internal.vision.e2.n(R.string.TelegramStarsChoose, arrayList);
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
                        boolean z13 = this.f47622f0;
                        if (!z13 && i15 > 0) {
                            if (z13) {
                                i11 = R.string.NotifyLessOptions;
                            } else {
                                i11 = R.string.NotifyMoreOptions;
                            }
                            String string = LocaleController.getString(i11);
                            int i19 = d7.f47303a;
                            x51 J = x51.J(d7.class);
                            J.d = -1;
                            J.f30248l = string;
                            J.f30243f = !this.f47622f0;
                            J.f30253q = true;
                            arrayList.add(J);
                        }
                    } else {
                        this.f47622f0 = true;
                    }
                } else if (i14 > 0) {
                    boolean z14 = this.f47622f0;
                    if (!z14 && i15 > 0) {
                        if (z14) {
                            i10 = R.string.NotifyLessOptions;
                        } else {
                            i10 = R.string.NotifyMoreOptions;
                        }
                        String string2 = LocaleController.getString(i10);
                        int i20 = d7.f47303a;
                        x51 J2 = x51.J(d7.class);
                        J2.d = -1;
                        J2.f30248l = string2;
                        J2.f30243f = !this.f47622f0;
                        J2.f30253q = true;
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
                arrayList.add(x51.n(31));
                arrayList.add(x51.n(31));
                arrayList.add(x51.n(31));
            }
        }
        arrayList.add(x51.k(this.Z));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            l61 l61Var = this.f47621e0;
            if (l61Var != null) {
                l61Var.N(true);
            }
            long j3 = t5.y(this.currentAccount, false).p().amount;
            long j10 = this.X;
            ((TextView) this.Y.f36092b).setText(LocaleController.formatPluralStringComma("StarsNeededTitle", (int) (j10 - j3)));
            xa xaVar = this.e;
            if (xaVar != null) {
                xaVar.setTitle(y());
            }
            if (j3 >= j10 && (runnable = this.f47618b0) != null) {
                runnable.run();
                this.f47618b0 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        o20 o20Var = this.Y;
        if (o20Var != null) {
            ((sg.e) o20Var.f36093c).setPaused(true);
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
        lk lkVar;
        if (!this.f47620d0) {
            org.telegram.messenger.q.q(R.string.PaymentInvoiceDisabledStarsText, new xc(lb.a(getContext()), this.resourcesProvider), R.raw.stars_topup, 36);
        } else if (t5.y(this.currentAccount, false).p().amount >= this.X) {
            Runnable runnable = this.f47618b0;
            if (runnable != null) {
                runnable.run();
                this.f47618b0 = null;
            }
        } else {
            org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
            if (R instanceof zn) {
                zn znVar = (zn) R;
                if (znVar.x9() && (lkVar = znVar.Y) != null) {
                    lkVar.P();
                }
            }
            super.show();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        }
    }

    @Override
    public final vl0 v(wl0 wl0Var) {
        l61 l61Var = new l61(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 28), this.resourcesProvider);
        this.f47621e0 = l61Var;
        return l61Var;
    }

    @Override
    public final CharSequence y() {
        o20 o20Var = this.Y;
        if (o20Var == null) {
            return null;
        }
        return ((TextView) o20Var.f36092b).getText();
    }
}
