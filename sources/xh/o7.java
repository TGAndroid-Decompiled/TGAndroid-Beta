package xh;

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
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.y00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
import org.telegram.ui.ok;
import org.telegram.ui.p20;
public final class o7 extends ab implements NotificationCenter.NotificationCenterDelegate {
    public final long X;
    public final p20 Y;
    public final FrameLayout Z;
    public final y00 f45813a0;
    public Runnable f45814b0;
    public final TLRPC.InputPeer f45815c0;
    public final boolean f45816d0;
    public j61 f45817e0;
    public boolean f45818f0;

    public o7(android.content.Context r16, org.telegram.ui.ActionBar.f6 r17, long r18, int r20, java.lang.String r21, java.lang.Runnable r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: xh.o7.<init>(android.content.Context, org.telegram.ui.ActionBar.f6, long, int, java.lang.String, java.lang.Runnable, long):void");
    }

    public static void P(o7 o7Var, int i10) {
        v51 G;
        j61 j61Var = o7Var.f45817e0;
        if (j61Var != null && (G = j61Var.G(i10 - 1)) != null) {
            j61 j61Var2 = o7Var.f45817e0;
            if (G.d == -1) {
                o7Var.f45818f0 = !o7Var.f45818f0;
                j61Var2.N(true);
            } else if (G.G(l7.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
                Activity findActivity = AndroidUtilities.findActivity(o7Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null) {
                    v5.y(o7Var.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new bi.k6(23, o7Var, G), o7Var.f45815c0);
                }
            }
        }
    }

    public static void Q(o7 o7Var, v51 v51Var, Boolean bool, String str) {
        if (o7Var.getContext() != null) {
            if (bool.booleanValue()) {
                new wc((FrameLayout) o7Var.containerView, o7Var.resourcesProvider).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) v51Var.B, new Object[0])), R.raw.stars_topup).j();
                o7Var.f45813a0.c(true);
                v5.y(o7Var.currentAccount, false).T(true);
            } else if (str != null) {
                com.google.android.gms.internal.vision.e2.o(R.string.UnknownErrorCode, new Object[]{str}, new wc((FrameLayout) o7Var.containerView, o7Var.resourcesProvider), R.raw.error, 36);
            }
        }
    }

    public final void R(ArrayList arrayList, j61 j61Var) {
        long j3;
        int i10;
        int i11;
        p20 p20Var = this.Y;
        arrayList.add(v51.l(p20Var));
        boolean z10 = this.f45816d0;
        if (z10) {
            com.google.android.gms.internal.vision.e2.m(R.string.TelegramStarsChoose, arrayList);
        }
        int i12 = 0;
        ArrayList z11 = v5.y(this.currentAccount, false).z();
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
                        if (tL_starsTopupOption.extended && !this.f45818f0 && z12) {
                            i15++;
                        } else {
                            arrayList.add(l7.a(i13, i16, tL_starsTopupOption));
                            i14++;
                            i16++;
                            z12 = true;
                        }
                    }
                    i13++;
                }
                if (i14 < 3) {
                    arrayList.clear();
                    arrayList.add(v51.k(p20Var));
                    com.google.android.gms.internal.vision.e2.m(R.string.TelegramStarsChoose, arrayList);
                    int i17 = 0;
                    for (int i18 = 0; i18 < z11.size(); i18++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) z11.get(i18);
                        if (tL_starsTopupOption2.stars >= j3) {
                            arrayList.add(l7.a(i18, i16, tL_starsTopupOption2));
                            i17++;
                            i16++;
                        }
                    }
                    if (i17 == 0) {
                        while (i12 < z11.size()) {
                            arrayList.add(l7.a(i12, i16, (TL_stars.TL_starsTopupOption) z11.get(i12)));
                            i12++;
                            i16++;
                        }
                        boolean z13 = this.f45818f0;
                        if (!z13 && i15 > 0) {
                            if (z13) {
                                i11 = R.string.NotifyLessOptions;
                            } else {
                                i11 = R.string.NotifyMoreOptions;
                            }
                            String string = LocaleController.getString(i11);
                            int i19 = h7.f45518a;
                            v51 J = v51.J(h7.class);
                            J.d = -1;
                            J.f27829l = string;
                            J.f27824f = !this.f45818f0;
                            J.f27834q = true;
                            arrayList.add(J);
                        }
                    } else {
                        this.f45818f0 = true;
                    }
                } else if (i14 > 0) {
                    boolean z14 = this.f45818f0;
                    if (!z14 && i15 > 0) {
                        if (z14) {
                            i10 = R.string.NotifyLessOptions;
                        } else {
                            i10 = R.string.NotifyMoreOptions;
                        }
                        String string2 = LocaleController.getString(i10);
                        int i20 = h7.f45518a;
                        v51 J2 = v51.J(h7.class);
                        J2.d = -1;
                        J2.f27829l = string2;
                        J2.f27824f = !this.f45818f0;
                        J2.f27834q = true;
                        arrayList.add(J2);
                    }
                } else {
                    while (i12 < z11.size()) {
                        arrayList.add(l7.a(i12, i16, (TL_stars.TL_starsTopupOption) z11.get(i12)));
                        i12++;
                        i16++;
                    }
                }
            } else {
                arrayList.add(v51.n(31));
                arrayList.add(v51.n(31));
                arrayList.add(v51.n(31));
            }
        }
        arrayList.add(v51.k(this.Z));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            j61 j61Var = this.f45817e0;
            if (j61Var != null) {
                j61Var.N(true);
            }
            long j3 = v5.y(this.currentAccount, false).p().amount;
            long j10 = this.X;
            ((TextView) this.Y.f35672b).setText(LocaleController.formatPluralStringComma("StarsNeededTitle", (int) (j10 - j3)));
            wa waVar = this.e;
            if (waVar != null) {
                waVar.setTitle(y());
            }
            if (j3 >= j10 && (runnable = this.f45814b0) != null) {
                runnable.run();
                this.f45814b0 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        p20 p20Var = this.Y;
        if (p20Var != null) {
            ((rg.f) p20Var.f35673c).setPaused(true);
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
        ok okVar;
        if (!this.f45816d0) {
            org.telegram.messenger.a2.o(R.string.PaymentInvoiceDisabledStarsText, new wc(kb.a(getContext()), this.resourcesProvider), R.raw.stars_topup, 36);
        } else if (v5.y(this.currentAccount, false).p().amount >= this.X) {
            Runnable runnable = this.f45814b0;
            if (runnable != null) {
                runnable.run();
                this.f45814b0 = null;
            }
        } else {
            org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
            if (R instanceof eo) {
                eo eoVar = (eo) R;
                if (eoVar.x9() && (okVar = eoVar.Y) != null) {
                    okVar.P();
                }
            }
            super.show();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        }
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        j61 j61Var = new j61(this.d, getContext(), this.currentAccount, 0, true, new gi.a(this, 28), this.resourcesProvider);
        this.f45817e0 = j61Var;
        return j61Var;
    }

    @Override
    public final CharSequence y() {
        p20 p20Var = this.Y;
        if (p20Var == null) {
            return null;
        }
        return ((TextView) p20Var.f35672b).getText();
    }
}
