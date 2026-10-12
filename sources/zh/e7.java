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
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.z61;
import org.telegram.ui.Components.za;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fo;
import org.telegram.ui.s20;
import org.telegram.ui.sk;
public final class e7 extends db implements NotificationCenter.NotificationCenterDelegate {
    public final long X;
    public final s20 Y;
    public final FrameLayout Z;
    public final d10 f50451a0;
    public Runnable f50452b0;
    public final TLRPC.InputPeer f50453c0;
    public final boolean f50454d0;
    public z61 f50455e0;
    public boolean f50456f0;

    public e7(android.content.Context r16, org.telegram.ui.ActionBar.c6 r17, long r18, int r20, java.lang.String r21, java.lang.Runnable r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: zh.e7.<init>(android.content.Context, org.telegram.ui.ActionBar.c6, long, int, java.lang.String, java.lang.Runnable, long):void");
    }

    public static void Q(e7 e7Var, int i10) {
        l61 G;
        z61 z61Var = e7Var.f50455e0;
        if (z61Var != null && (G = z61Var.G(i10 - 1)) != null) {
            z61 z61Var2 = e7Var.f50455e0;
            if (G.d == -1) {
                e7Var.f50456f0 = !e7Var.f50456f0;
                z61Var2.N(true);
            } else if (G.G(b7.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
                Activity findActivity = AndroidUtilities.findActivity(e7Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null) {
                    n5.y(e7Var.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new rh.s(5, e7Var, G), e7Var.f50453c0);
                }
            }
        }
    }

    public static void R(e7 e7Var, l61 l61Var, Boolean bool, String str) {
        if (e7Var.getContext() != null) {
            if (bool.booleanValue()) {
                new zc((FrameLayout) e7Var.containerView, e7Var.resourcesProvider).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) l61Var.B, new Object[0])), R.raw.stars_topup).j();
                e7Var.f50451a0.c(true);
                n5.y(e7Var.currentAccount, false).T(true);
            } else if (str != null) {
                i2.d.q(R.string.UnknownErrorCode, new Object[]{str}, new zc((FrameLayout) e7Var.containerView, e7Var.resourcesProvider), R.raw.error, 36);
            }
        }
    }

    @Override
    public final CharSequence A() {
        s20 s20Var = this.Y;
        if (s20Var == null) {
            return null;
        }
        return ((TextView) s20Var.f39941b).getText();
    }

    public final void S(ArrayList arrayList, z61 z61Var) {
        long j10;
        int i10;
        int i11;
        s20 s20Var = this.Y;
        arrayList.add(l61.l(s20Var));
        boolean z10 = this.f50454d0;
        if (z10) {
            i2.d.o(R.string.TelegramStarsChoose, arrayList);
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
                    j10 = this.X;
                    if (i14 >= size) {
                        break;
                    }
                    TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z11.get(i14);
                    if (tL_starsTopupOption.stars >= j10) {
                        if (tL_starsTopupOption.extended && !this.f50456f0 && z12) {
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
                    arrayList.add(l61.k(s20Var));
                    i2.d.o(R.string.TelegramStarsChoose, arrayList);
                    int i17 = 0;
                    for (int i18 = 0; i18 < z11.size(); i18++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) z11.get(i18);
                        if (tL_starsTopupOption2.stars >= j10) {
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
                        boolean z13 = this.f50456f0;
                        if (!z13 && i16 > 0) {
                            if (z13) {
                                i11 = R.string.NotifyLessOptions;
                            } else {
                                i11 = R.string.NotifyMoreOptions;
                            }
                            String string = LocaleController.getString(i11);
                            int i19 = x6.f51313a;
                            l61 J = l61.J(x6.class);
                            J.d = -1;
                            J.f26954l = string;
                            J.f26949f = !this.f50456f0;
                            J.f26959q = true;
                            arrayList.add(J);
                        }
                    } else {
                        this.f50456f0 = true;
                    }
                } else if (i15 > 0) {
                    boolean z14 = this.f50456f0;
                    if (!z14 && i16 > 0) {
                        if (z14) {
                            i10 = R.string.NotifyLessOptions;
                        } else {
                            i10 = R.string.NotifyMoreOptions;
                        }
                        String string2 = LocaleController.getString(i10);
                        int i20 = x6.f51313a;
                        l61 J2 = l61.J(x6.class);
                        J2.d = -1;
                        J2.f26954l = string2;
                        J2.f26949f = !this.f50456f0;
                        J2.f26959q = true;
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
                arrayList.add(l61.n(31));
                arrayList.add(l61.n(31));
                arrayList.add(l61.n(31));
            }
        }
        arrayList.add(l61.k(this.Z));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            z61 z61Var = this.f50455e0;
            if (z61Var != null) {
                z61Var.N(true);
            }
            long j10 = n5.y(this.currentAccount, false).p().amount;
            long j11 = this.X;
            ((TextView) this.Y.f39941b).setText(LocaleController.formatPluralStringComma("StarsNeededTitle", (int) (j11 - j10)));
            za zaVar = this.e;
            if (zaVar != null) {
                zaVar.setTitle(A());
            }
            if (j10 >= j11 && (runnable = this.f50452b0) != null) {
                runnable.run();
                this.f50452b0 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        s20 s20Var = this.Y;
        if (s20Var != null) {
            ((tg.n) s20Var.f39942c).setPaused(true);
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
        if (!this.f50454d0) {
            org.telegram.messenger.q.r(R.string.PaymentInvoiceDisabledStarsText, new zc(nb.a(getContext()), this.resourcesProvider), R.raw.stars_topup, 36);
        } else if (n5.y(this.currentAccount, false).p().amount >= this.X) {
            Runnable runnable = this.f50452b0;
            if (runnable != null) {
                runnable.run();
                this.f50452b0 = null;
            }
        } else {
            org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
            if (R instanceof fo) {
                fo foVar = (fo) R;
                if (foVar.C9() && (skVar = foVar.Y) != null) {
                    skVar.N();
                }
            }
            super.show();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        }
    }

    @Override
    public final lm0 x(mm0 mm0Var) {
        z61 z61Var = new z61(this.d, getContext(), this.currentAccount, 0, true, new ii.a(this, 28), this.resourcesProvider);
        this.f50455e0 = z61Var;
        return z61Var;
    }
}
