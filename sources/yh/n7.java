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
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.va;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.za;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo;
import org.telegram.ui.nk;
import org.telegram.ui.q20;
public final class n7 extends za implements NotificationCenter.NotificationCenterDelegate {
    public final long X;
    public final q20 Y;
    public final FrameLayout Z;
    public final r00 f47534a0;
    public Runnable f47535b0;
    public final TLRPC.InputPeer f47536c0;
    public final boolean f47537d0;
    public x51 f47538e0;
    public boolean f47539f0;

    public n7(android.content.Context r16, org.telegram.ui.ActionBar.f6 r17, long r18, int r20, java.lang.String r21, java.lang.Runnable r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: yh.n7.<init>(android.content.Context, org.telegram.ui.ActionBar.f6, long, int, java.lang.String, java.lang.Runnable, long):void");
    }

    public static void P(n7 n7Var, int i10) {
        j51 G;
        x51 x51Var = n7Var.f47538e0;
        if (x51Var != null && (G = x51Var.G(i10 - 1)) != null) {
            x51 x51Var2 = n7Var.f47538e0;
            if (G.d == -1) {
                n7Var.f47539f0 = !n7Var.f47539f0;
                x51Var2.N(true);
            } else if (G.G(k7.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
                Activity findActivity = AndroidUtilities.findActivity(n7Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null) {
                    v5.y(n7Var.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new ai.m0(25, n7Var, G), n7Var.f47536c0);
                }
            }
        }
    }

    public static void Q(n7 n7Var, j51 j51Var, Boolean bool, String str) {
        if (n7Var.getContext() != null) {
            if (bool.booleanValue()) {
                new vc((FrameLayout) n7Var.containerView, n7Var.resourcesProvider).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) j51Var.B, new Object[0])), R.raw.stars_topup).j();
                n7Var.f47534a0.c(true);
                v5.y(n7Var.currentAccount, false).T(true);
            } else if (str != null) {
                hg.k0.s(R.string.UnknownErrorCode, new Object[]{str}, new vc((FrameLayout) n7Var.containerView, n7Var.resourcesProvider), R.raw.error, 36);
            }
        }
    }

    public final void R(ArrayList arrayList, x51 x51Var) {
        long j3;
        int i10;
        int i11;
        q20 q20Var = this.Y;
        arrayList.add(j51.l(q20Var));
        boolean z10 = this.f47537d0;
        if (z10) {
            com.google.android.gms.internal.vision.e2.n(R.string.TelegramStarsChoose, arrayList);
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
                        if (tL_starsTopupOption.extended && !this.f47539f0 && z12) {
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
                    arrayList.add(j51.k(q20Var));
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
                        boolean z13 = this.f47539f0;
                        if (!z13 && i15 > 0) {
                            if (z13) {
                                i11 = R.string.NotifyLessOptions;
                            } else {
                                i11 = R.string.NotifyMoreOptions;
                            }
                            String string = LocaleController.getString(i11);
                            int i19 = g7.f47257a;
                            j51 J = j51.J(g7.class);
                            J.d = -1;
                            J.f25124l = string;
                            J.f25119f = !this.f47539f0;
                            J.f25129q = true;
                            arrayList.add(J);
                        }
                    } else {
                        this.f47539f0 = true;
                    }
                } else if (i14 > 0) {
                    boolean z14 = this.f47539f0;
                    if (!z14 && i15 > 0) {
                        if (z14) {
                            i10 = R.string.NotifyLessOptions;
                        } else {
                            i10 = R.string.NotifyMoreOptions;
                        }
                        String string2 = LocaleController.getString(i10);
                        int i20 = g7.f47257a;
                        j51 J2 = j51.J(g7.class);
                        J2.d = -1;
                        J2.f25124l = string2;
                        J2.f25119f = !this.f47539f0;
                        J2.f25129q = true;
                        arrayList.add(J2);
                    }
                } else {
                    while (i12 < z11.size()) {
                        arrayList.add(k7.a(i12, i16, (TL_stars.TL_starsTopupOption) z11.get(i12)));
                        i12++;
                        i16++;
                    }
                }
            } else {
                arrayList.add(j51.n(31));
                arrayList.add(j51.n(31));
                arrayList.add(j51.n(31));
            }
        }
        arrayList.add(j51.k(this.Z));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            x51 x51Var = this.f47538e0;
            if (x51Var != null) {
                x51Var.N(true);
            }
            long j3 = v5.y(this.currentAccount, false).p().amount;
            long j10 = this.X;
            ((TextView) this.Y.f36779b).setText(LocaleController.formatPluralStringComma("StarsNeededTitle", (int) (j10 - j3)));
            va vaVar = this.e;
            if (vaVar != null) {
                vaVar.setTitle(y());
            }
            if (j3 >= j10 && (runnable = this.f47535b0) != null) {
                runnable.run();
                this.f47535b0 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        q20 q20Var = this.Y;
        if (q20Var != null) {
            ((sg.e) q20Var.f36780c).setPaused(true);
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
        nk nkVar;
        if (!this.f47537d0) {
            org.telegram.messenger.w1.o(R.string.PaymentInvoiceDisabledStarsText, new vc(jb.a(getContext()), this.resourcesProvider), R.raw.stars_topup, 36);
        } else if (v5.y(this.currentAccount, false).p().amount >= this.X) {
            Runnable runnable = this.f47535b0;
            if (runnable != null) {
                runnable.run();
                this.f47535b0 = null;
            }
        } else {
            org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
            if (R instanceof bo) {
                bo boVar = (bo) R;
                if (boVar.x9() && (nkVar = boVar.Y) != null) {
                    nkVar.P();
                }
            }
            super.show();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        }
    }

    @Override
    public final ll0 v(ml0 ml0Var) {
        x51 x51Var = new x51(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 28), this.resourcesProvider);
        this.f47538e0 = x51Var;
        return x51Var;
    }

    @Override
    public final CharSequence y() {
        q20 q20Var = this.Y;
        if (q20Var == null) {
            return null;
        }
        return ((TextView) q20Var.f36779b).getText();
    }
}
