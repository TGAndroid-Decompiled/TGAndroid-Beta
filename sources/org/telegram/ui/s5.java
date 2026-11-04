package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
public final class s5 implements DialogInterface.OnDismissListener {
    public final int f49362a;
    public final Object f49363b;

    public s5(Object obj, int i3) {
        this.f49362a = i3;
        this.f49363b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.ch0 ch0Var;
        int i3 = this.f49362a;
        Object obj = this.f49363b;
        switch (i3) {
            case 0:
                ((t5) obj).f49699a.y0(false);
                return;
            case 1:
                ((n9) obj).f47919j1.onFragmentDestroy();
                return;
            case 2:
                ad adVar = (ad) obj;
                if (!adVar.f43756x.g()) {
                    adVar.L.P(86);
                    adVar.f43742n.d();
                    return;
                }
                adVar.L.N(0, false, false);
                return;
            case 3:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                if (q1Var != null) {
                    q1Var.d3(-1);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.ac acVar = ((org.telegram.ui.Components.ac[]) obj)[0];
                if (acVar != null) {
                    acVar.b();
                    return;
                }
                return;
            case 5:
                ln lnVar = (ln) obj;
                if (!lnVar.f47388s.g()) {
                    lnVar.S0.P(86);
                    lnVar.f47369c0.f29595e.d();
                    return;
                }
                lnVar.S0.N(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f41254y;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                y40 y40Var = (y40) obj;
                if (!y40Var.O.g()) {
                    y40Var.S.P(86);
                    y40Var.f52184f.d();
                    return;
                }
                y40Var.S.N(0, false, false);
                return;
            case 8:
                nc0 nc0Var = (nc0) obj;
                org.telegram.ui.Components.ch0 ch0Var2 = nc0Var.J;
                xc xcVar = nc0Var.f47961n;
                if (!nc0Var.M.g()) {
                    xcVar.setAnimation(ch0Var2);
                    ch0Var2.P(86);
                    xcVar.setOnAnimationEndListener(new xa0(nc0Var, 2));
                    xcVar.d();
                    return;
                }
                xcVar.setAnimation(ch0Var2);
                ch0Var2.N(0, false, false);
                nc0Var.L = true;
                return;
            case 9:
                ((org.telegram.ui.ActionBar.t2) obj).dismiss();
                return;
            case 10:
                ((PhotoViewer) obj).Q1 = null;
                return;
            case 11:
                Drawable[] drawableArr = PhotoViewer.V8;
                ((Runnable) obj).run();
                return;
            case 12:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                if (!privacyControlActivity.f41695u0.g()) {
                    privacyControlActivity.f41696v0.P(86);
                    privacyControlActivity.f41698w0.f29595e.d();
                    return;
                }
                privacyControlActivity.f41696v0.N(0, false, false);
                return;
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.f41839r0.g()) {
                    profileActivity.V.P(86);
                    profileActivity.W.P(86);
                    org.telegram.ui.Components.gf0 gf0Var = profileActivity.f41720a0;
                    if (gf0Var != null) {
                        org.telegram.ui.Components.df0 i10 = org.telegram.ui.Components.gf0.i(14, gf0Var.f34074a);
                        if (i10 != null && (ch0Var = i10.f33072k) != null) {
                            ch0Var.start();
                        }
                    } else {
                        profileActivity.f41845s.d();
                    }
                    org.telegram.ui.Cells.l8 l8Var = profileActivity.M2;
                    if (l8Var != null) {
                        l8Var.getImageView().d();
                        return;
                    }
                    return;
                }
                profileActivity.V.N(0, false, false);
                profileActivity.W.N(0, false, false);
                return;
            case 14:
                ((g11) obj).w(0.0f);
                return;
            case 15:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i11 = ShareActivity.f41995b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f41996a = null;
                return;
            case 16:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f42063r = null;
                themeActivity.h = null;
                themeActivity.f42058n = null;
                return;
            case 17:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().k(53, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((zb1) obj).f52644v0.b();
                return;
        }
    }
}
