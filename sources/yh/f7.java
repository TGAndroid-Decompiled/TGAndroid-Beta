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
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
import org.telegram.ui.sk;
public final class f7 extends db implements NotificationCenter.NotificationCenterDelegate {
    public final FrameLayout X;
    public h71 Y;
    public boolean Z;

    public f7(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, false, false, c6Var);
        wm0 wm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        wm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.g(this, 24));
        s4.j jVar = new s4.j();
        jVar.f47937m = false;
        jVar.C = false;
        jVar.o(js.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        int i11 = org.telegram.ui.ActionBar.h6.f20560d6;
        setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i11, c6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.h6.w0(i11, c6Var));
        this.f25287e.setTitle(LocaleController.getString(R.string.StarsBuy));
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        ia0 ia0Var = new ia0(context, c6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        ia0Var.setTextSize(1, 12.0f);
        ia0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.B6, c6Var));
        ia0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, c6Var));
        ia0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new f0(this, 12)));
        ia0Var.setGravity(17);
        ia0Var.setMaxWidth(ci.d4.a(ia0Var.getText(), ia0Var.getPaint()));
        frameLayout.addView(ia0Var, w7.w5.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20631h5, c6Var));
        this.containerView.addView(new k10(getContext()), w7.w5.d(-1.0f, -1));
        h71 h71Var = this.Y;
        if (h71Var != null) {
            h71Var.N(false);
        }
    }

    public static void Q(f7 f7Var, int i10) {
        u61 G;
        h71 h71Var = f7Var.Y;
        if (h71Var != null && (G = h71Var.G(i10 - 1)) != null) {
            h71 h71Var2 = f7Var.Y;
            if (G.d == -1) {
                f7Var.Z = !f7Var.Z;
                h71Var2.N(true);
                f7Var.d.v0(0, AndroidUtilities.dp(300.0f), null);
            } else if (G.G(b7.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
                Activity findActivity = AndroidUtilities.findActivity(f7Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null) {
                    n5.y(f7Var.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new qh.r(6, f7Var, G), null);
                }
            }
        }
    }

    public static void R(f7 f7Var, u61 u61Var, Boolean bool, String str) {
        if (f7Var.getContext() != null) {
            f7Var.dismiss();
            n5.y(f7Var.currentAccount, false).T(true);
            org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
            if (U != null) {
                if (bool.booleanValue()) {
                    zc.a0(U).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) u61Var.B, new Object[0])), R.raw.stars_topup).j();
                    LaunchActivity launchActivity = LaunchActivity.G1;
                    if (launchActivity != null) {
                        launchActivity.f33660x0.c(true);
                    }
                } else if (str != null) {
                    hg.c.s(R.string.UnknownErrorCode, new Object[]{str}, zc.a0(U), R.raw.error, 36);
                }
            }
        }
    }

    @Override
    public final CharSequence A() {
        return LocaleController.getString(R.string.StarsBuy);
    }

    public final void S(ArrayList arrayList, h71 h71Var) {
        int i10;
        com.google.android.gms.internal.vision.e2.n(R.string.TelegramStarsChoose, arrayList);
        ArrayList z10 = n5.y(this.currentAccount, false).z();
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
                int i14 = x6.f53612a;
                u61 J = u61.J(x6.class);
                J.d = -1;
                J.f31071l = string;
                J.f31066f = !this.Z;
                J.f31076q = true;
                arrayList.add(J);
            }
        } else {
            arrayList.add(u61.n(31));
            arrayList.add(u61.n(31));
            arrayList.add(u61.n(31));
            arrayList.add(u61.n(31));
            arrayList.add(u61.n(31));
        }
        arrayList.add(u61.k(this.X));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        h71 h71Var;
        if ((i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (h71Var = this.Y) != null) {
            h71Var.N(true);
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
        long j3 = n5.y(this.currentAccount, false).p().amount;
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        if (R instanceof eo) {
            eo eoVar = (eo) R;
            if (eoVar.C9() && (skVar = eoVar.Y) != null) {
                skVar.Q();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final vm0 x(wm0 wm0Var) {
        h71 h71Var = new h71(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 29), this.resourcesProvider);
        this.Y = h71Var;
        h71Var.f26679r = false;
        return h71Var;
    }
}
