package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class x5 implements DialogInterface.OnDismissListener {
    public final int f39844a;
    public final Object f39845b;

    public x5(Object obj, int i10) {
        this.f39844a = i10;
        this.f39845b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.gj0 gj0Var;
        int i10 = this.f39844a;
        Object obj = this.f39845b;
        switch (i10) {
            case 0:
                ((y5) obj).f40141a.w0(false);
                return;
            case 1:
                ((t9) obj).f38421b.onFragmentDestroy();
                return;
            case 2:
                pd pdVar = (pd) obj;
                if (!pdVar.v.h()) {
                    pdVar.G.N(86);
                    pdVar.h.d();
                    return;
                }
                pdVar.G.L(0, false, false);
                return;
            case 3:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj;
                if (s1Var != null) {
                    s1Var.F3(-1);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.ic icVar = ((org.telegram.ui.Components.ic[]) obj)[0];
                if (icVar != null) {
                    icVar.b();
                    return;
                }
                return;
            case 5:
                ro roVar = (ro) obj;
                if (!roVar.f37923s.h()) {
                    roVar.O0.N(86);
                    roVar.Y.e.d();
                    return;
                }
                roVar.O0.L(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f31561x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                g70 g70Var = (g70) obj;
                if (!g70Var.K.h()) {
                    g70Var.O.N(86);
                    g70Var.f34343f.d();
                    return;
                }
                g70Var.O.L(0, false, false);
                return;
            case 8:
                bf0 bf0Var = (bf0) obj;
                org.telegram.ui.Components.gj0 gj0Var2 = bf0Var.F;
                md mdVar = bf0Var.f32867n;
                if (!bf0Var.I.h()) {
                    mdVar.setAnimation(gj0Var2);
                    gj0Var2.N(86);
                    mdVar.setOnAnimationEndListener(new od0(bf0Var, 2));
                    mdVar.d();
                    return;
                }
                mdVar.setAnimation(gj0Var2);
                gj0Var2.L(0, false, false);
                bf0Var.H = true;
                return;
            case 9:
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) obj;
                zk0.f40496a = null;
                org.telegram.ui.ActionBar.g3 g3Var = g3VarArr[0];
                if (g3Var != null) {
                    g3Var.dismiss();
                    g3VarArr[0] = null;
                    return;
                }
                return;
            case 10:
                ((org.telegram.ui.ActionBar.g3) obj).dismiss();
                return;
            case 11:
                ((PhotoViewer) obj).M1 = null;
                return;
            case 12:
                Drawable[] drawableArr = PhotoViewer.Q8;
                ((Runnable) obj).run();
                return;
            case 13:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                if (!privacyControlActivity.f31976p0.h()) {
                    privacyControlActivity.f31977q0.N(86);
                    privacyControlActivity.f31979r0.e.d();
                    return;
                }
                privacyControlActivity.f31977q0.L(0, false, false);
                return;
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.f32093n0.h()) {
                    profileActivity.S.N(86);
                    profileActivity.T.N(86);
                    org.telegram.ui.Components.kh0 kh0Var = profileActivity.X;
                    if (kh0Var != null) {
                        org.telegram.ui.Components.hh0 j10 = org.telegram.ui.Components.kh0.j(14, kh0Var.f26284a);
                        if (j10 != null && (gj0Var = j10.f25412k) != null) {
                            gj0Var.start();
                        }
                    } else {
                        profileActivity.v.d();
                    }
                    org.telegram.ui.Cells.n8 n8Var = profileActivity.J2;
                    if (n8Var != null) {
                        n8Var.getImageView().d();
                        return;
                    }
                    return;
                }
                profileActivity.S.L(0, false, false);
                profileActivity.T.L(0, false, false);
                return;
            case 15:
                ((x61) obj).w(0.0f);
                return;
            case 16:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i11 = ShareActivity.f32265b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f32266a = null;
                return;
            case 17:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f32326r = null;
                themeActivity.h = null;
                themeActivity.f32321n = null;
                return;
            case 18:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((ii1) obj).f34976r0.b();
                return;
        }
    }
}
