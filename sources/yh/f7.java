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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.i10;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ok;
import org.telegram.ui.zn;
public final class f7 extends eb implements NotificationCenter.NotificationCenterDelegate {
    public final FrameLayout X;
    public d71 Y;
    public boolean Z;

    public f7(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, false, false, e6Var);
        rm0 rm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        rm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.g(this, 24));
        s4.j jVar = new s4.j();
        jVar.f47742m = false;
        jVar.C = false;
        jVar.o(is.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        int i11 = org.telegram.ui.ActionBar.i6.f20801d6;
        setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        this.f25983e.setTitle(LocaleController.getString(R.string.StarsBuy));
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        fa0 fa0Var = new fa0(context, e6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        fa0Var.setTextSize(1, 12.0f);
        fa0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.B6, e6Var));
        fa0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, e6Var));
        fa0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new f0(this, 12)));
        fa0Var.setGravity(17);
        fa0Var.setMaxWidth(ci.d4.a(fa0Var.getText(), fa0Var.getPaint()));
        frameLayout.addView(fa0Var, w7.x5.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20872h5, e6Var));
        this.containerView.addView(new i10(getContext()), w7.x5.d(-1.0f, -1));
        d71 d71Var = this.Y;
        if (d71Var != null) {
            d71Var.N(false);
        }
    }

    public static void Q(f7 f7Var, int i10) {
        q61 G;
        d71 d71Var = f7Var.Y;
        if (d71Var != null && (G = d71Var.G(i10 - 1)) != null) {
            d71 d71Var2 = f7Var.Y;
            if (G.d == -1) {
                f7Var.Z = !f7Var.Z;
                d71Var2.N(true);
                f7Var.d.v0(0, AndroidUtilities.dp(300.0f), null);
            } else if (G.G(b7.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
                Activity findActivity = AndroidUtilities.findActivity(f7Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null) {
                    m5.y(f7Var.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new qh.r(6, f7Var, G), null);
                }
            }
        }
    }

    public static void R(f7 f7Var, q61 q61Var, Boolean bool, String str) {
        if (f7Var.getContext() != null) {
            f7Var.dismiss();
            m5.y(f7Var.currentAccount, false).T(true);
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U != null) {
                if (bool.booleanValue()) {
                    ad.a0(U).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) q61Var.B, new Object[0])), R.raw.stars_topup).j();
                    LaunchActivity launchActivity = LaunchActivity.G1;
                    if (launchActivity != null) {
                        launchActivity.f33859x0.c(true);
                    }
                } else if (str != null) {
                    hg.c.q(R.string.UnknownErrorCode, new Object[]{str}, ad.a0(U), R.raw.error, 36);
                }
            }
        }
    }

    @Override
    public final CharSequence B() {
        return LocaleController.getString(R.string.StarsBuy);
    }

    public final void S(ArrayList arrayList, d71 d71Var) {
        int i10;
        com.google.android.gms.internal.vision.e2.n(R.string.TelegramStarsChoose, arrayList);
        ArrayList z10 = m5.y(this.currentAccount, false).z();
        if (z10 != null && !z10.isEmpty()) {
            int i11 = 0;
            int i12 = 1;
            for (int i13 = 0; i13 < z10.size(); i13++) {
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z10.get(i13);
                if (tL_starsTopupOption.extended && !this.Z) {
                    i11++;
                } else {
                    arrayList.add(b7.a(i13, i12, tL_starsTopupOption));
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
                int i14 = x6.f53423a;
                q61 J = q61.J(x6.class);
                J.d = -1;
                J.f30063l = string;
                J.f30058f = !this.Z;
                J.f30068q = true;
                arrayList.add(J);
            }
        } else {
            arrayList.add(q61.n(31));
            arrayList.add(q61.n(31));
            arrayList.add(q61.n(31));
            arrayList.add(q61.n(31));
            arrayList.add(q61.n(31));
        }
        arrayList.add(q61.k(this.X));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        d71 d71Var;
        if ((i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (d71Var = this.Y) != null) {
            d71Var.N(true);
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
        long j3 = m5.y(this.currentAccount, false).p().amount;
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

    @Override
    public final qm0 x(rm0 rm0Var) {
        d71 d71Var = new d71(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 29), this.resourcesProvider);
        this.Y = d71Var;
        d71Var.f25587r = false;
        return d71Var;
    }
}
