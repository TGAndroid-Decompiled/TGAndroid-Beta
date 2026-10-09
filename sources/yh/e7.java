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
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.ob;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m20;
import org.telegram.ui.ok;
import org.telegram.ui.zn;
public final class e7 extends eb implements NotificationCenter.NotificationCenterDelegate {
    public final long X;
    public final m20 Y;
    public final FrameLayout Z;
    public final h10 f52449a0;
    public Runnable f52450b0;
    public final TLRPC.InputPeer f52451c0;
    public final boolean f52452d0;
    public c71 f52453e0;
    public boolean f52454f0;

    public e7(android.content.Context r16, org.telegram.ui.ActionBar.e6 r17, long r18, int r20, java.lang.String r21, java.lang.Runnable r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: yh.e7.<init>(android.content.Context, org.telegram.ui.ActionBar.e6, long, int, java.lang.String, java.lang.Runnable, long):void");
    }

    public static void Q(e7 e7Var, int i10) {
        p61 G;
        c71 c71Var = e7Var.f52453e0;
        if (c71Var != null && (G = c71Var.G(i10 - 1)) != null) {
            c71 c71Var2 = e7Var.f52453e0;
            if (G.d == -1) {
                e7Var.f52454f0 = !e7Var.f52454f0;
                c71Var2.N(true);
            } else if (G.G(b7.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
                Activity findActivity = AndroidUtilities.findActivity(e7Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null) {
                    m5.y(e7Var.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new qh.r(5, e7Var, G), e7Var.f52451c0);
                }
            }
        }
    }

    public static void R(e7 e7Var, p61 p61Var, Boolean bool, String str) {
        if (e7Var.getContext() != null) {
            if (bool.booleanValue()) {
                new ad((FrameLayout) e7Var.containerView, e7Var.resourcesProvider).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) p61Var.B, new Object[0])), R.raw.stars_topup).j();
                e7Var.f52449a0.c(true);
                m5.y(e7Var.currentAccount, false).T(true);
            } else if (str != null) {
                hg.c.q(R.string.UnknownErrorCode, new Object[]{str}, new ad((FrameLayout) e7Var.containerView, e7Var.resourcesProvider), R.raw.error, 36);
            }
        }
    }

    @Override
    public final CharSequence B() {
        m20 m20Var = this.Y;
        if (m20Var == null) {
            return null;
        }
        return ((TextView) m20Var.f39745b).getText();
    }

    public final void S(ArrayList arrayList, c71 c71Var) {
        long j3;
        int i10;
        int i11;
        m20 m20Var = this.Y;
        arrayList.add(p61.l(m20Var));
        boolean z10 = this.f52452d0;
        if (z10) {
            com.google.android.gms.internal.vision.e2.n(R.string.TelegramStarsChoose, arrayList);
        }
        int i12 = 0;
        ArrayList z11 = m5.y(this.currentAccount, false).z();
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
                        if (tL_starsTopupOption.extended && !this.f52454f0 && z12) {
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
                    arrayList.add(p61.k(m20Var));
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
                        boolean z13 = this.f52454f0;
                        if (!z13 && i16 > 0) {
                            if (z13) {
                                i11 = R.string.NotifyLessOptions;
                            } else {
                                i11 = R.string.NotifyMoreOptions;
                            }
                            String string = LocaleController.getString(i11);
                            int i19 = x6.f53377a;
                            p61 J = p61.J(x6.class);
                            J.d = -1;
                            J.f29734l = string;
                            J.f29729f = !this.f52454f0;
                            J.f29739q = true;
                            arrayList.add(J);
                        }
                    } else {
                        this.f52454f0 = true;
                    }
                } else if (i15 > 0) {
                    boolean z14 = this.f52454f0;
                    if (!z14 && i16 > 0) {
                        if (z14) {
                            i10 = R.string.NotifyLessOptions;
                        } else {
                            i10 = R.string.NotifyMoreOptions;
                        }
                        String string2 = LocaleController.getString(i10);
                        int i20 = x6.f53377a;
                        p61 J2 = p61.J(x6.class);
                        J2.d = -1;
                        J2.f29734l = string2;
                        J2.f29729f = !this.f52454f0;
                        J2.f29739q = true;
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
                arrayList.add(p61.n(31));
                arrayList.add(p61.n(31));
                arrayList.add(p61.n(31));
            }
        }
        arrayList.add(p61.k(this.Z));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            c71 c71Var = this.f52453e0;
            if (c71Var != null) {
                c71Var.N(true);
            }
            long j3 = m5.y(this.currentAccount, false).p().amount;
            long j10 = this.X;
            ((TextView) this.Y.f39745b).setText(LocaleController.formatPluralStringComma("StarsNeededTitle", (int) (j10 - j3)));
            ab abVar = this.f26023e;
            if (abVar != null) {
                abVar.setTitle(B());
            }
            if (j3 >= j10 && (runnable = this.f52450b0) != null) {
                runnable.run();
                this.f52450b0 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        m20 m20Var = this.Y;
        if (m20Var != null) {
            ((sg.n) m20Var.f39746c).setPaused(true);
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
        if (!this.f52452d0) {
            org.telegram.messenger.q.q(R.string.PaymentInvoiceDisabledStarsText, new ad(ob.a(getContext()), this.resourcesProvider), R.raw.stars_topup, 36);
        } else if (m5.y(this.currentAccount, false).p().amount >= this.X) {
            Runnable runnable = this.f52450b0;
            if (runnable != null) {
                runnable.run();
                this.f52450b0 = null;
            }
        } else {
            org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
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
    public final pm0 x(qm0 qm0Var) {
        c71 c71Var = new c71(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 28), this.resourcesProvider);
        this.f52453e0 = c71Var;
        return c71Var;
    }
}
