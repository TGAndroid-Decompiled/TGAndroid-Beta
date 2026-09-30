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
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mb;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.ya;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.j20;
import org.telegram.ui.jk;
import org.telegram.ui.wn;
public final class l7 extends cb implements NotificationCenter.NotificationCenterDelegate {
    public final long X;
    public final j20 Y;
    public final FrameLayout Z;
    public final u00 f47776a0;
    public Runnable f47777b0;
    public final TLRPC.InputPeer f47778c0;
    public final boolean f47779d0;
    public m61 f47780e0;
    public boolean f47781f0;

    public l7(android.content.Context r16, org.telegram.ui.ActionBar.d6 r17, long r18, int r20, java.lang.String r21, java.lang.Runnable r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: yh.l7.<init>(android.content.Context, org.telegram.ui.ActionBar.d6, long, int, java.lang.String, java.lang.Runnable, long):void");
    }

    public static void P(l7 l7Var, int i10) {
        y51 G;
        m61 m61Var = l7Var.f47780e0;
        if (m61Var != null && (G = m61Var.G(i10 - 1)) != null) {
            m61 m61Var2 = l7Var.f47780e0;
            if (G.d == -1) {
                l7Var.f47781f0 = !l7Var.f47781f0;
                m61Var2.N(true);
            } else if (G.G(i7.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
                Activity findActivity = AndroidUtilities.findActivity(l7Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null) {
                    s5.y(l7Var.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new ai.m0(25, l7Var, G), l7Var.f47778c0);
                }
            }
        }
    }

    public static void Q(l7 l7Var, y51 y51Var, Boolean bool, String str) {
        if (l7Var.getContext() != null) {
            if (bool.booleanValue()) {
                new yc((FrameLayout) l7Var.containerView, l7Var.resourcesProvider).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) y51Var.B, new Object[0])), R.raw.stars_topup).j();
                l7Var.f47776a0.c(true);
                s5.y(l7Var.currentAccount, false).T(true);
            } else if (str != null) {
                hg.c.q(R.string.UnknownErrorCode, new Object[]{str}, new yc((FrameLayout) l7Var.containerView, l7Var.resourcesProvider), R.raw.error, 36);
            }
        }
    }

    public final void R(ArrayList arrayList, m61 m61Var) {
        long j3;
        int i10;
        int i11;
        j20 j20Var = this.Y;
        arrayList.add(y51.l(j20Var));
        boolean z10 = this.f47779d0;
        if (z10) {
            com.google.android.gms.internal.vision.e2.n(R.string.TelegramStarsChoose, arrayList);
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
                        if (tL_starsTopupOption.extended && !this.f47781f0 && z12) {
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
                    arrayList.add(y51.k(j20Var));
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
                        boolean z13 = this.f47781f0;
                        if (!z13 && i15 > 0) {
                            if (z13) {
                                i11 = R.string.NotifyLessOptions;
                            } else {
                                i11 = R.string.NotifyMoreOptions;
                            }
                            String string = LocaleController.getString(i11);
                            int i19 = e7.f47454a;
                            y51 J = y51.J(e7.class);
                            J.d = -1;
                            J.f30637l = string;
                            J.f30632f = !this.f47781f0;
                            J.f30642q = true;
                            arrayList.add(J);
                        }
                    } else {
                        this.f47781f0 = true;
                    }
                } else if (i14 > 0) {
                    boolean z14 = this.f47781f0;
                    if (!z14 && i15 > 0) {
                        if (z14) {
                            i10 = R.string.NotifyLessOptions;
                        } else {
                            i10 = R.string.NotifyMoreOptions;
                        }
                        String string2 = LocaleController.getString(i10);
                        int i20 = e7.f47454a;
                        y51 J2 = y51.J(e7.class);
                        J2.d = -1;
                        J2.f30637l = string2;
                        J2.f30632f = !this.f47781f0;
                        J2.f30642q = true;
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
                arrayList.add(y51.n(31));
                arrayList.add(y51.n(31));
                arrayList.add(y51.n(31));
            }
        }
        arrayList.add(y51.k(this.Z));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            m61 m61Var = this.f47780e0;
            if (m61Var != null) {
                m61Var.N(true);
            }
            long j3 = s5.y(this.currentAccount, false).p().amount;
            long j10 = this.X;
            ((TextView) this.Y.f34715b).setText(LocaleController.formatPluralStringComma("StarsNeededTitle", (int) (j10 - j3)));
            ya yaVar = this.e;
            if (yaVar != null) {
                yaVar.setTitle(y());
            }
            if (j3 >= j10 && (runnable = this.f47777b0) != null) {
                runnable.run();
                this.f47777b0 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        j20 j20Var = this.Y;
        if (j20Var != null) {
            ((sg.e) j20Var.f34716c).setPaused(true);
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
        if (!this.f47779d0) {
            org.telegram.messenger.f0.p(R.string.PaymentInvoiceDisabledStarsText, new yc(mb.a(getContext()), this.resourcesProvider), R.raw.stars_topup, 36);
        } else if (s5.y(this.currentAccount, false).p().amount >= this.X) {
            Runnable runnable = this.f47777b0;
            if (runnable != null) {
                runnable.run();
                this.f47777b0 = null;
            }
        } else {
            org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
            if (R instanceof wn) {
                wn wnVar = (wn) R;
                if (wnVar.x9() && (jkVar = wnVar.Y) != null) {
                    jkVar.P();
                }
            }
            super.show();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        }
    }

    @Override
    public final yl0 v(zl0 zl0Var) {
        m61 m61Var = new m61(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 28), this.resourcesProvider);
        this.f47780e0 = m61Var;
        return m61Var;
    }

    @Override
    public final CharSequence y() {
        j20 j20Var = this.Y;
        if (j20Var == null) {
            return null;
        }
        return ((TextView) j20Var.f34715b).getText();
    }
}
