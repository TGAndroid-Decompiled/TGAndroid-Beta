package xh;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.y00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
import org.telegram.ui.ok;
public final class p7 extends ab implements NotificationCenter.NotificationCenterDelegate {
    public final FrameLayout X;
    public j61 Y;
    public boolean Z;

    public p7(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, false, false, f6Var);
        vl0 vl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.g(this, 23));
        s4.j jVar = new s4.j();
        jVar.f41645m = false;
        jVar.C = false;
        jVar.o(wr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        int i11 = org.telegram.ui.ActionBar.j6.f17928d6;
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        this.e.setTitle(LocaleController.getString(R.string.StarsBuy));
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        m90 m90Var = new m90(context, f6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        m90Var.setTextSize(1, 12.0f);
        m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B6, f6Var));
        m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        m90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new x(this, 14)));
        m90Var.setGravity(17);
        m90Var.setMaxWidth(bi.x4.a(m90Var.getText(), m90Var.getPaint()));
        frameLayout.addView(m90Var, w7.a6.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17998h5, f6Var));
        this.containerView.addView(new y00(getContext()), w7.a6.c(-1.0f, -1));
        j61 j61Var = this.Y;
        if (j61Var != null) {
            j61Var.N(false);
        }
    }

    public static void P(p7 p7Var, int i10) {
        v51 G;
        j61 j61Var = p7Var.Y;
        if (j61Var != null && (G = j61Var.G(i10 - 1)) != null) {
            j61 j61Var2 = p7Var.Y;
            if (G.d == -1) {
                p7Var.Z = !p7Var.Z;
                j61Var2.N(true);
                p7Var.d.v0(0, AndroidUtilities.dp(300.0f), null);
            } else if (G.G(l7.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
                Activity findActivity = AndroidUtilities.findActivity(p7Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null) {
                    v5.y(p7Var.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new bi.k6(24, p7Var, G), null);
                }
            }
        }
    }

    public static void Q(p7 p7Var, v51 v51Var, Boolean bool, String str) {
        if (p7Var.getContext() != null) {
            p7Var.dismiss();
            v5.y(p7Var.currentAccount, false).T(true);
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            if (U != null) {
                if (bool.booleanValue()) {
                    wc.a0(U).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) v51Var.B, new Object[0])), R.raw.stars_topup).j();
                    LaunchActivity launchActivity = LaunchActivity.G1;
                    if (launchActivity != null) {
                        launchActivity.f29971x0.c(true);
                    }
                } else if (str != null) {
                    com.google.android.gms.internal.vision.e2.o(R.string.UnknownErrorCode, new Object[]{str}, wc.a0(U), R.raw.error, 36);
                }
            }
        }
    }

    public final void R(ArrayList arrayList, j61 j61Var) {
        int i10;
        com.google.android.gms.internal.vision.e2.m(R.string.TelegramStarsChoose, arrayList);
        ArrayList z10 = v5.y(this.currentAccount, false).z();
        if (z10 != null && !z10.isEmpty()) {
            int i11 = 0;
            int i12 = 1;
            for (int i13 = 0; i13 < z10.size(); i13++) {
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z10.get(i13);
                if (tL_starsTopupOption.extended && !this.Z) {
                    i11++;
                } else {
                    arrayList.add(l7.a(i13, i12, tL_starsTopupOption));
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
                int i14 = h7.f45518a;
                v51 J = v51.J(h7.class);
                J.d = -1;
                J.f27829l = string;
                J.f27824f = !this.Z;
                J.f27834q = true;
                arrayList.add(J);
            }
        } else {
            arrayList.add(v51.n(31));
            arrayList.add(v51.n(31));
            arrayList.add(v51.n(31));
            arrayList.add(v51.n(31));
            arrayList.add(v51.n(31));
        }
        arrayList.add(v51.k(this.X));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        j61 j61Var;
        if ((i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (j61Var = this.Y) != null) {
            j61Var.N(true);
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
        long j3 = v5.y(this.currentAccount, false).p().amount;
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

    @Override
    public final ul0 v(vl0 vl0Var) {
        j61 j61Var = new j61(this.d, getContext(), this.currentAccount, 0, true, new gi.a(this, 29), this.resourcesProvider);
        this.Y = j61Var;
        j61Var.f24250r = false;
        return j61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.StarsBuy);
    }
}
