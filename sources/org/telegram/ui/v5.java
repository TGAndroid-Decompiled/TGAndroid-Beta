package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class v5 implements DialogInterface.OnDismissListener {
    public final int f39081a;
    public final Object f39082b;

    public v5(Object obj, int i10) {
        this.f39081a = i10;
        this.f39082b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.gj0 gj0Var;
        int i10 = this.f39081a;
        Object obj = this.f39082b;
        switch (i10) {
            case 0:
                ((w5) obj).f39330a.w0(false);
                return;
            case 1:
                ((r9) obj).f37945b.onFragmentDestroy();
                return;
            case 2:
                nd ndVar = (nd) obj;
                if (!ndVar.v.h()) {
                    ndVar.G.N(86);
                    ndVar.h.d();
                    return;
                }
                ndVar.G.L(0, false, false);
                return;
            case 3:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj;
                if (t1Var != null) {
                    t1Var.F3(-1);
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
                po poVar = (po) obj;
                if (!poVar.f37403s.h()) {
                    poVar.O0.N(86);
                    poVar.Y.e.d();
                    return;
                }
                poVar.O0.L(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f31587x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                e70 e70Var = (e70) obj;
                if (!e70Var.K.h()) {
                    e70Var.O.N(86);
                    e70Var.f33918f.d();
                    return;
                }
                e70Var.O.L(0, false, false);
                return;
            case 8:
                ze0 ze0Var = (ze0) obj;
                org.telegram.ui.Components.gj0 gj0Var2 = ze0Var.F;
                kd kdVar = ze0Var.f40782n;
                if (!ze0Var.I.h()) {
                    kdVar.setAnimation(gj0Var2);
                    gj0Var2.N(86);
                    kdVar.setOnAnimationEndListener(new md0(ze0Var, 2));
                    kdVar.d();
                    return;
                }
                kdVar.setAnimation(gj0Var2);
                gj0Var2.L(0, false, false);
                ze0Var.H = true;
                return;
            case 9:
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) obj;
                xk0.f39930a = null;
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
                if (!privacyControlActivity.f32002p0.h()) {
                    privacyControlActivity.f32003q0.N(86);
                    privacyControlActivity.f32005r0.e.d();
                    return;
                }
                privacyControlActivity.f32003q0.L(0, false, false);
                return;
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.f32119n0.h()) {
                    profileActivity.S.N(86);
                    profileActivity.T.N(86);
                    org.telegram.ui.Components.jh0 jh0Var = profileActivity.X;
                    if (jh0Var != null) {
                        org.telegram.ui.Components.gh0 j10 = org.telegram.ui.Components.jh0.j(14, jh0Var.f25981a);
                        if (j10 != null && (gj0Var = j10.f25129k) != null) {
                            gj0Var.start();
                        }
                    } else {
                        profileActivity.v.d();
                    }
                    org.telegram.ui.Cells.o8 o8Var = profileActivity.J2;
                    if (o8Var != null) {
                        o8Var.getImageView().d();
                        return;
                    }
                    return;
                }
                profileActivity.S.L(0, false, false);
                profileActivity.T.L(0, false, false);
                return;
            case 15:
                ((q61) obj).w(0.0f);
                return;
            case 16:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i11 = ShareActivity.f32291b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f32292a = null;
                return;
            case 17:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f32352r = null;
                themeActivity.h = null;
                themeActivity.f32347n = null;
                return;
            case 18:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((ai1) obj).f32630r0.b();
                return;
        }
    }
}
