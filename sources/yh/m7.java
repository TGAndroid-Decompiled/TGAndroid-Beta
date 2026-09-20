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
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.lk;
import org.telegram.ui.zn;
public final class m7 extends ab implements NotificationCenter.NotificationCenterDelegate {
    public final FrameLayout X;
    public k61 Y;
    public boolean Z;

    public m7(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, false, false, f6Var);
        vl0 vl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.g(this, 24));
        s4.j jVar = new s4.j();
        jVar.f43009m = false;
        jVar.C = false;
        jVar.o(qr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        int i11 = org.telegram.ui.ActionBar.j6.f19094d6;
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        this.e.setTitle(LocaleController.getString(R.string.StarsBuy));
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        k90 k90Var = new k90(context, f6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        k90Var.setTextSize(1, 12.0f);
        k90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B6, f6Var));
        k90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        k90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new s2(this, 8)));
        k90Var.setGravity(17);
        k90Var.setMaxWidth(ci.f4.a(k90Var.getText(), k90Var.getPaint()));
        frameLayout.addView(k90Var, w7.y5.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19165h5, f6Var));
        this.containerView.addView(new r00(getContext()), w7.y5.c(-1.0f, -1));
        k61 k61Var = this.Y;
        if (k61Var != null) {
            k61Var.N(false);
        }
    }

    public static void P(m7 m7Var, int i10) {
        w51 G;
        k61 k61Var = m7Var.Y;
        if (k61Var != null && (G = k61Var.G(i10 - 1)) != null) {
            k61 k61Var2 = m7Var.Y;
            if (G.d == -1) {
                m7Var.Z = !m7Var.Z;
                k61Var2.N(true);
                m7Var.d.w0(0, AndroidUtilities.dp(300.0f), null);
            } else if (G.G(i7.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
                Activity findActivity = AndroidUtilities.findActivity(m7Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null) {
                    u5.y(m7Var.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new ai.m0(26, m7Var, G), null);
                }
            }
        }
    }

    public static void Q(m7 m7Var, w51 w51Var, Boolean bool, String str) {
        if (m7Var.getContext() != null) {
            m7Var.dismiss();
            u5.y(m7Var.currentAccount, false).T(true);
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U != null) {
                if (bool.booleanValue()) {
                    xc.a0(U).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) w51Var.B, new Object[0])), R.raw.stars_topup).j();
                    LaunchActivity launchActivity = LaunchActivity.G1;
                    if (launchActivity != null) {
                        launchActivity.f31142x0.c(true);
                    }
                } else if (str != null) {
                    hg.k0.q(R.string.UnknownErrorCode, new Object[]{str}, xc.a0(U), R.raw.error, 36);
                }
            }
        }
    }

    public final void R(ArrayList arrayList, k61 k61Var) {
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
                    arrayList.add(i7.a(i13, i12, tL_starsTopupOption));
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
                int i14 = e7.f47387a;
                w51 J = w51.J(e7.class);
                J.d = -1;
                J.f29948l = string;
                J.f29943f = !this.Z;
                J.f29953q = true;
                arrayList.add(J);
            }
        } else {
            arrayList.add(w51.n(31));
            arrayList.add(w51.n(31));
            arrayList.add(w51.n(31));
            arrayList.add(w51.n(31));
            arrayList.add(w51.n(31));
        }
        arrayList.add(w51.k(this.X));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k61 k61Var;
        if ((i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (k61Var = this.Y) != null) {
            k61Var.N(true);
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
        long j3 = u5.y(this.currentAccount, false).p().amount;
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

    @Override
    public final ul0 v(vl0 vl0Var) {
        k61 k61Var = new k61(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 29), this.resourcesProvider);
        this.Y = k61Var;
        k61Var.f25678r = false;
        return k61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.StarsBuy);
    }
}
