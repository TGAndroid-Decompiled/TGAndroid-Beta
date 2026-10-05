package yh;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jk;
import org.telegram.ui.yn;
public final class p7 extends cb implements NotificationCenter.NotificationCenterDelegate {
    public final FrameLayout X;
    public w61 Y;
    public boolean Z;

    public p7(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null, false, false, d6Var);
        zl0 zl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        zl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.g(this, 24));
        s4.j jVar = new s4.j();
        jVar.f46577m = false;
        jVar.C = false;
        jVar.o(tr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        int i11 = org.telegram.ui.ActionBar.i6.f20827d6;
        setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
        this.f25355e.setTitle(LocaleController.getString(R.string.StarsBuy));
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        q90 q90Var = new q90(context, d6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        q90Var.setTextSize(1, 12.0f);
        q90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.B6, d6Var));
        q90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, d6Var));
        q90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new o2(this, 9)));
        q90Var.setGravity(17);
        q90Var.setMaxWidth(ci.e4.a(q90Var.getText(), q90Var.getPaint()));
        frameLayout.addView(q90Var, w7.z5.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20899h5, d6Var));
        this.containerView.addView(new u00(getContext()), w7.z5.c(-1.0f, -1));
        w61 w61Var = this.Y;
        if (w61Var != null) {
            w61Var.N(false);
        }
    }

    public static void N(p7 p7Var, int i10) {
        h61 G;
        w61 w61Var = p7Var.Y;
        if (w61Var != null && (G = w61Var.G(i10 - 1)) != null) {
            w61 w61Var2 = p7Var.Y;
            if (G.d == -1) {
                p7Var.Z = !p7Var.Z;
                w61Var2.N(true);
                p7Var.d.w0(0, AndroidUtilities.dp(300.0f), null);
            } else if (G.H(k7.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
                Activity findActivity = AndroidUtilities.findActivity(p7Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null) {
                    u5.y(p7Var.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new ai.m0(26, p7Var, G), null);
                }
            }
        }
    }

    public static void O(p7 p7Var, h61 h61Var, Boolean bool, String str) {
        if (p7Var.getContext() != null) {
            p7Var.dismiss();
            u5.y(p7Var.currentAccount, false).T(true);
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U != null) {
                if (bool.booleanValue()) {
                    yc.a0(U).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) h61Var.B, new Object[0])), R.raw.stars_topup).j();
                    LaunchActivity launchActivity = LaunchActivity.G1;
                    if (launchActivity != null) {
                        launchActivity.f33831x0.c(true);
                    }
                } else if (str != null) {
                    hg.c.q(R.string.UnknownErrorCode, new Object[]{str}, yc.a0(U), R.raw.error, 36);
                }
            }
        }
    }

    public final void P(ArrayList arrayList, w61 w61Var) {
        int i10;
        com.google.android.gms.internal.vision.e2.n(R.string.TelegramStarsChoose, arrayList);
        ArrayList z10 = u5.y(this.currentAccount, false).z();
        if (z10 != null && !z10.isEmpty()) {
            int i11 = 0;
            int i12 = 1;
            for (int i13 = 0; i13 < z10.size(); i13++) {
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z10.get(i13);
                if (tL_starsTopupOption.extended && !this.Z) {
                    i11++;
                } else {
                    arrayList.add(k7.a(i13, i12, tL_starsTopupOption));
                    i12++;
                }
            }
            boolean z11 = this.Z;
            if (!z11 && i11 > 0) {
                if (z11) {
                    i10 = R.string.NotifyLessOptions;
                } else {
                    i10 = R.string.NotifyMoreOptions;
                }
                String string = LocaleController.getString(i10);
                int i14 = g7.f51360a;
                h61 K = h61.K(g7.class);
                K.d = -1;
                K.f27093l = string;
                K.f27088f = !this.Z;
                K.f27098q = true;
                arrayList.add(K);
            }
        } else {
            arrayList.add(h61.p(31));
            arrayList.add(h61.p(31));
            arrayList.add(h61.p(31));
            arrayList.add(h61.p(31));
            arrayList.add(h61.p(31));
        }
        arrayList.add(h61.k(this.X));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        w61 w61Var;
        if ((i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (w61Var = this.Y) != null) {
            w61Var.N(true);
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
        long j3 = u5.y(this.currentAccount, false).p().amount;
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

    @Override
    public final yl0 v(zl0 zl0Var) {
        w61 w61Var = new w61(this.d, getContext(), this.currentAccount, 0, true, new o7(this, 0), this.resourcesProvider);
        this.Y = w61Var;
        w61Var.f32531r = false;
        return w61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.StarsBuy);
    }
}
