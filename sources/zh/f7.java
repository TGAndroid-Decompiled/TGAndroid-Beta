package zh;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fo;
import org.telegram.ui.sk;
public final class f7 extends db implements NotificationCenter.NotificationCenterDelegate {
    public final FrameLayout X;
    public a71 Y;
    public boolean Z;

    public f7(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, false, false, c6Var);
        mm0 mm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new bi.d(this, 24));
        s4.k kVar = new s4.k();
        kVar.f44872m = false;
        kVar.C = false;
        kVar.o(es.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        int i11 = org.telegram.ui.ActionBar.g6.f19601d6;
        setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        this.e.setTitle(LocaleController.getString(R.string.StarsBuy));
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        da0 da0Var = new da0(context, c6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        da0Var.setTextSize(1, 12.0f);
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.B6, c6Var));
        da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19660gc, c6Var));
        da0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new zf.c(this, 19)));
        da0Var.setGravity(17);
        da0Var.setMaxWidth(di.d4.a(da0Var.getText(), da0Var.getPaint()));
        frameLayout.addView(da0Var, w7.z5.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19672h5, c6Var));
        this.containerView.addView(new d10(getContext()), w7.z5.d(-1.0f, -1));
        a71 a71Var = this.Y;
        if (a71Var != null) {
            a71Var.N(false);
        }
    }

    public static void Q(f7 f7Var, int i10) {
        m61 G;
        a71 a71Var = f7Var.Y;
        if (a71Var != null && (G = a71Var.G(i10 - 1)) != null) {
            a71 a71Var2 = f7Var.Y;
            if (G.d == -1) {
                f7Var.Z = !f7Var.Z;
                a71Var2.N(true);
                f7Var.d.v0(0, AndroidUtilities.dp(300.0f), null);
            } else if (G.G(b7.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
                Activity findActivity = AndroidUtilities.findActivity(f7Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null) {
                    n5.y(f7Var.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new rh.r(6, f7Var, G), null);
                }
            }
        }
    }

    public static void R(f7 f7Var, m61 m61Var, Boolean bool, String str) {
        if (f7Var.getContext() != null) {
            f7Var.dismiss();
            n5.y(f7Var.currentAccount, false).T(true);
            org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
            if (U != null) {
                if (bool.booleanValue()) {
                    zc.a0(U).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) m61Var.B, new Object[0])), R.raw.stars_topup).j();
                    LaunchActivity launchActivity = LaunchActivity.G1;
                    if (launchActivity != null) {
                        launchActivity.f31849x0.c(true);
                    }
                } else if (str != null) {
                    i2.d.s(R.string.UnknownErrorCode, new Object[]{str}, zc.a0(U), R.raw.error, 36);
                }
            }
        }
    }

    @Override
    public final CharSequence B() {
        return LocaleController.getString(R.string.StarsBuy);
    }

    public final void S(ArrayList arrayList, a71 a71Var) {
        int i10;
        i2.d.p(R.string.TelegramStarsChoose, arrayList);
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
                int i14 = x6.f51314a;
                m61 J = m61.J(x6.class);
                J.d = -1;
                J.f26946l = string;
                J.f26941f = !this.Z;
                J.f26951q = true;
                arrayList.add(J);
            }
        } else {
            arrayList.add(m61.n(31));
            arrayList.add(m61.n(31));
            arrayList.add(m61.n(31));
            arrayList.add(m61.n(31));
            arrayList.add(m61.n(31));
        }
        arrayList.add(m61.k(this.X));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a71 a71Var;
        if ((i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (a71Var = this.Y) != null) {
            a71Var.N(true);
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
        long j10 = n5.y(this.currentAccount, false).p().amount;
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

    @Override
    public final lm0 x(mm0 mm0Var) {
        a71 a71Var = new a71(this.d, getContext(), this.currentAccount, 0, true, new ii.a(this, 29), this.resourcesProvider);
        this.Y = a71Var;
        a71Var.f23145r = false;
        return a71Var;
    }
}
