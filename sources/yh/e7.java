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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.i10;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.za;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.l20;
import org.telegram.ui.ok;
import org.telegram.ui.zn;
public final class e7 extends db implements NotificationCenter.NotificationCenterDelegate {
    public final long X;
    public final l20 Y;
    public final FrameLayout Z;
    public final i10 f52526a0;
    public Runnable f52527b0;
    public final TLRPC.InputPeer f52528c0;
    public final boolean f52529d0;
    public e71 f52530e0;
    public boolean f52531f0;

    public e7(android.content.Context r16, org.telegram.ui.ActionBar.d6 r17, long r18, int r20, java.lang.String r21, java.lang.Runnable r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: yh.e7.<init>(android.content.Context, org.telegram.ui.ActionBar.d6, long, int, java.lang.String, java.lang.Runnable, long):void");
    }

    public static void Q(e7 e7Var, int i10) {
        r61 G;
        e71 e71Var = e7Var.f52530e0;
        if (e71Var != null && (G = e71Var.G(i10 - 1)) != null) {
            e71 e71Var2 = e7Var.f52530e0;
            if (G.d == -1) {
                e7Var.f52531f0 = !e7Var.f52531f0;
                e71Var2.N(true);
            } else if (G.G(b7.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
                Activity findActivity = AndroidUtilities.findActivity(e7Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null) {
                    n5.y(e7Var.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new qh.r(5, e7Var, G), e7Var.f52528c0);
                }
            }
        }
    }

    public static void R(e7 e7Var, r61 r61Var, Boolean bool, String str) {
        if (e7Var.getContext() != null) {
            if (bool.booleanValue()) {
                new ad((FrameLayout) e7Var.containerView, e7Var.resourcesProvider).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) r61Var.B, new Object[0])), R.raw.stars_topup).j();
                e7Var.f52526a0.c(true);
                n5.y(e7Var.currentAccount, false).T(true);
            } else if (str != null) {
                hg.c.q(R.string.UnknownErrorCode, new Object[]{str}, new ad((FrameLayout) e7Var.containerView, e7Var.resourcesProvider), R.raw.error, 36);
            }
        }
    }

    @Override
    public final CharSequence B() {
        l20 l20Var = this.Y;
        if (l20Var == null) {
            return null;
        }
        return ((TextView) l20Var.f39491b).getText();
    }

    public final void S(ArrayList arrayList, e71 e71Var) {
        long j3;
        int i10;
        int i11;
        l20 l20Var = this.Y;
        arrayList.add(r61.l(l20Var));
        boolean z10 = this.f52529d0;
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
                        if (tL_starsTopupOption.extended && !this.f52531f0 && z12) {
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
                    arrayList.add(r61.k(l20Var));
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
                        boolean z13 = this.f52531f0;
                        if (!z13 && i16 > 0) {
                            if (z13) {
                                i11 = R.string.NotifyLessOptions;
                            } else {
                                i11 = R.string.NotifyMoreOptions;
                            }
                            String string = LocaleController.getString(i11);
                            int i19 = x6.f53466a;
                            r61 J = r61.J(x6.class);
                            J.d = -1;
                            J.f30361l = string;
                            J.f30356f = !this.f52531f0;
                            J.f30366q = true;
                            arrayList.add(J);
                        }
                    } else {
                        this.f52531f0 = true;
                    }
                } else if (i15 > 0) {
                    boolean z14 = this.f52531f0;
                    if (!z14 && i16 > 0) {
                        if (z14) {
                            i10 = R.string.NotifyLessOptions;
                        } else {
                            i10 = R.string.NotifyMoreOptions;
                        }
                        String string2 = LocaleController.getString(i10);
                        int i20 = x6.f53466a;
                        r61 J2 = r61.J(x6.class);
                        J2.d = -1;
                        J2.f30361l = string2;
                        J2.f30356f = !this.f52531f0;
                        J2.f30366q = true;
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
                arrayList.add(r61.n(31));
                arrayList.add(r61.n(31));
                arrayList.add(r61.n(31));
            }
        }
        arrayList.add(r61.k(this.Z));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            e71 e71Var = this.f52530e0;
            if (e71Var != null) {
                e71Var.N(true);
            }
            long j3 = n5.y(this.currentAccount, false).p().amount;
            long j10 = this.X;
            ((TextView) this.Y.f39491b).setText(LocaleController.formatPluralStringComma("StarsNeededTitle", (int) (j10 - j3)));
            za zaVar = this.f25521e;
            if (zaVar != null) {
                zaVar.setTitle(B());
            }
            if (j3 >= j10 && (runnable = this.f52527b0) != null) {
                runnable.run();
                this.f52527b0 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        l20 l20Var = this.Y;
        if (l20Var != null) {
            ((sg.n) l20Var.f39492c).setPaused(true);
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
        if (!this.f52529d0) {
            org.telegram.messenger.q.q(R.string.PaymentInvoiceDisabledStarsText, new ad(nb.a(getContext()), this.resourcesProvider), R.raw.stars_topup, 36);
        } else if (n5.y(this.currentAccount, false).p().amount >= this.X) {
            Runnable runnable = this.f52527b0;
            if (runnable != null) {
                runnable.run();
                this.f52527b0 = null;
            }
        } else {
            org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
            if (R instanceof zn) {
                zn znVar = (zn) R;
                if (znVar.C9() && (okVar = znVar.Y) != null) {
                    okVar.N();
                }
            }
            super.show();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        }
    }

    @Override
    public final rm0 x(sm0 sm0Var) {
        e71 e71Var = new e71(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 28), this.resourcesProvider);
        this.f52530e0 = e71Var;
        return e71Var;
    }
}
