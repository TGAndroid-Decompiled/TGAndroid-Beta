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
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.mb;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.ya;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jk;
import org.telegram.ui.o20;
import org.telegram.ui.yn;
public final class m7 extends cb implements NotificationCenter.NotificationCenterDelegate {
    public final long X;
    public final o20 Y;
    public final FrameLayout Z;
    public final u00 f51643a0;
    public Runnable f51644b0;
    public final TLRPC.InputPeer f51645c0;
    public final boolean f51646d0;
    public u61 f51647e0;
    public boolean f51648f0;

    public m7(android.content.Context r16, org.telegram.ui.ActionBar.d6 r17, long r18, int r20, java.lang.String r21, java.lang.Runnable r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: yh.m7.<init>(android.content.Context, org.telegram.ui.ActionBar.d6, long, int, java.lang.String, java.lang.Runnable, long):void");
    }

    public static void N(m7 m7Var, int i10) {
        g61 G;
        u61 u61Var = m7Var.f51647e0;
        if (u61Var != null && (G = u61Var.G(i10 - 1)) != null) {
            u61 u61Var2 = m7Var.f51647e0;
            if (G.d == -1) {
                m7Var.f51648f0 = !m7Var.f51648f0;
                u61Var2.N(true);
            } else if (G.G(j7.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
                Activity findActivity = AndroidUtilities.findActivity(m7Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null) {
                    t5.y(m7Var.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new ai.m0(25, m7Var, G), m7Var.f51645c0);
                }
            }
        }
    }

    public static void O(m7 m7Var, g61 g61Var, Boolean bool, String str) {
        if (m7Var.getContext() != null) {
            if (bool.booleanValue()) {
                new yc((FrameLayout) m7Var.containerView, m7Var.resourcesProvider).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) g61Var.B, new Object[0])), R.raw.stars_topup).j();
                m7Var.f51643a0.c(true);
                t5.y(m7Var.currentAccount, false).T(true);
            } else if (str != null) {
                hg.c.q(R.string.UnknownErrorCode, new Object[]{str}, new yc((FrameLayout) m7Var.containerView, m7Var.resourcesProvider), R.raw.error, 36);
            }
        }
    }

    public final void P(ArrayList arrayList, u61 u61Var) {
        long j3;
        int i10;
        int i11;
        o20 o20Var = this.Y;
        arrayList.add(g61.m(o20Var));
        boolean z10 = this.f51646d0;
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
                        if (tL_starsTopupOption.extended && !this.f51648f0 && z12) {
                            i15++;
                        } else {
                            arrayList.add(j7.a(i13, i16, tL_starsTopupOption));
                            i14++;
                            i16++;
                            z12 = true;
                        }
                    }
                    i13++;
                }
                if (i14 < 3) {
                    arrayList.clear();
                    arrayList.add(g61.k(o20Var));
                    com.google.android.gms.internal.vision.e2.n(R.string.TelegramStarsChoose, arrayList);
                    int i17 = 0;
                    for (int i18 = 0; i18 < z11.size(); i18++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) z11.get(i18);
                        if (tL_starsTopupOption2.stars >= j3) {
                            arrayList.add(j7.a(i18, i16, tL_starsTopupOption2));
                            i17++;
                            i16++;
                        }
                    }
                    if (i17 == 0) {
                        while (i12 < z11.size()) {
                            arrayList.add(j7.a(i12, i16, (TL_stars.TL_starsTopupOption) z11.get(i12)));
                            i12++;
                            i16++;
                        }
                        boolean z13 = this.f51648f0;
                        if (!z13 && i15 > 0) {
                            if (z13) {
                                i11 = R.string.NotifyLessOptions;
                            } else {
                                i11 = R.string.NotifyMoreOptions;
                            }
                            String string = LocaleController.getString(i11);
                            int i19 = f7.f51301a;
                            g61 J = g61.J(f7.class);
                            J.d = -1;
                            J.f26674l = string;
                            J.f26669f = !this.f51648f0;
                            J.f26679q = true;
                            arrayList.add(J);
                        }
                    } else {
                        this.f51648f0 = true;
                    }
                } else if (i14 > 0) {
                    boolean z14 = this.f51648f0;
                    if (!z14 && i15 > 0) {
                        if (z14) {
                            i10 = R.string.NotifyLessOptions;
                        } else {
                            i10 = R.string.NotifyMoreOptions;
                        }
                        String string2 = LocaleController.getString(i10);
                        int i20 = f7.f51301a;
                        g61 J2 = g61.J(f7.class);
                        J2.d = -1;
                        J2.f26674l = string2;
                        J2.f26669f = !this.f51648f0;
                        J2.f26679q = true;
                        arrayList.add(J2);
                    }
                } else {
                    while (i12 < z11.size()) {
                        arrayList.add(j7.a(i12, i16, (TL_stars.TL_starsTopupOption) z11.get(i12)));
                        i12++;
                        i16++;
                    }
                }
            } else {
                arrayList.add(g61.o(31));
                arrayList.add(g61.o(31));
                arrayList.add(g61.o(31));
            }
        }
        arrayList.add(g61.k(this.Z));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            u61 u61Var = this.f51647e0;
            if (u61Var != null) {
                u61Var.N(true);
            }
            long j3 = t5.y(this.currentAccount, false).p().amount;
            long j10 = this.X;
            ((TextView) this.Y.f39096b).setText(LocaleController.formatPluralStringComma("StarsNeededTitle", (int) (j10 - j3)));
            ya yaVar = this.f25307e;
            if (yaVar != null) {
                yaVar.setTitle(y());
            }
            if (j3 >= j10 && (runnable = this.f51644b0) != null) {
                runnable.run();
                this.f51644b0 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        o20 o20Var = this.Y;
        if (o20Var != null) {
            ((sg.e) o20Var.f39097c).setPaused(true);
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
        if (!this.f51646d0) {
            org.telegram.messenger.q.p(R.string.PaymentInvoiceDisabledStarsText, new yc(mb.a(getContext()), this.resourcesProvider), R.raw.stars_topup, 36);
        } else if (t5.y(this.currentAccount, false).p().amount >= this.X) {
            Runnable runnable = this.f51644b0;
            if (runnable != null) {
                runnable.run();
                this.f51644b0 = null;
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
        u61 u61Var = new u61(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 28), this.resourcesProvider);
        this.f51647e0 = u61Var;
        return u61Var;
    }

    @Override
    public final CharSequence y() {
        o20 o20Var = this.Y;
        if (o20Var == null) {
            return null;
        }
        return ((TextView) o20Var.f39096b).getText();
    }
}
