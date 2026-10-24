package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class v5 implements DialogInterface.OnDismissListener {
    public final int f42577a;
    public final Object f42578b;

    public v5(Object obj, int i10) {
        this.f42577a = i10;
        this.f42578b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.xj0 xj0Var;
        int i10 = this.f42577a;
        Object obj = this.f42578b;
        switch (i10) {
            case 0:
                ((w5) obj).f42901a.x0(false);
                return;
            case 1:
                ((s9) obj).f41320b.onFragmentDestroy();
                return;
            case 2:
                md mdVar = (md) obj;
                if (!mdVar.f39562w.g()) {
                    mdVar.K.P(86);
                    mdVar.f39550n.d();
                    return;
                }
                mdVar.K.N(0, false, false);
                return;
            case 3:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj;
                if (t1Var != null) {
                    t1Var.E3(-1);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.oc ocVar = ((org.telegram.ui.Components.oc[]) obj)[0];
                if (ocVar != null) {
                    ocVar.b();
                    return;
                }
                return;
            case 5:
                ko koVar = (ko) obj;
                if (!koVar.f38974s.g()) {
                    koVar.Q0.P(86);
                    koVar.f38954b0.e.d();
                    return;
                }
                koVar.Q0.N(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f33434x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                w60 w60Var = (w60) obj;
                if (!w60Var.N.g()) {
                    w60Var.R.P(86);
                    w60Var.f42919f.d();
                    return;
                }
                w60Var.R.N(0, false, false);
                return;
            case 8:
                te0 te0Var = (te0) obj;
                org.telegram.ui.Components.xj0 xj0Var2 = te0Var.I;
                jd jdVar = te0Var.f42019n;
                if (!te0Var.L.g()) {
                    jdVar.setAnimation(xj0Var2);
                    xj0Var2.P(86);
                    jdVar.setOnAnimationEndListener(new dd0(te0Var, 2));
                    jdVar.d();
                    return;
                }
                jdVar.setAnimation(xj0Var2);
                xj0Var2.N(0, false, false);
                te0Var.K = true;
                return;
            case 9:
                ((org.telegram.ui.ActionBar.h3) obj).dismiss();
                return;
            case 10:
                ((PhotoViewer) obj).P1 = null;
                return;
            case 11:
                Drawable[] drawableArr = PhotoViewer.U8;
                ((Runnable) obj).run();
                return;
            case 12:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                if (!privacyControlActivity.f33861t0.g()) {
                    privacyControlActivity.f33862u0.P(86);
                    privacyControlActivity.f33863v0.e.d();
                    return;
                }
                privacyControlActivity.f33862u0.N(0, false, false);
                return;
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.f34003r0.g()) {
                    profileActivity.V.P(86);
                    profileActivity.W.P(86);
                    org.telegram.ui.Components.bi0 bi0Var = profileActivity.f33885a0;
                    if (bi0Var != null) {
                        org.telegram.ui.Components.yh0 j10 = org.telegram.ui.Components.bi0.j(14, bi0Var.f25007a);
                        if (j10 != null && (xj0Var = j10.f32923k) != null) {
                            xj0Var.start();
                        }
                    } else {
                        profileActivity.v.d();
                    }
                    org.telegram.ui.Cells.r8 r8Var = profileActivity.N2;
                    if (r8Var != null) {
                        r8Var.getImageView().d();
                        return;
                    }
                    return;
                }
                profileActivity.V.N(0, false, false);
                profileActivity.W.N(0, false, false);
                return;
            case 14:
                ((a61) obj).w(0.0f);
                return;
            case 15:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i11 = ShareActivity.f34157b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f34158a = null;
                return;
            case 16:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f34221r = null;
                themeActivity.h = null;
                themeActivity.f34216n = null;
                return;
            case 17:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((nh1) obj).f39864u0.b();
                return;
        }
    }
}
