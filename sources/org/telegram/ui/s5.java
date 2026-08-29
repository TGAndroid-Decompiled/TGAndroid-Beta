package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class s5 implements DialogInterface.OnDismissListener {
    public final int f42268a;
    public final Object f42269b;

    public s5(Object obj, int i10) {
        this.f42268a = i10;
        this.f42269b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.xi0 xi0Var;
        int i10 = this.f42268a;
        Object obj = this.f42269b;
        switch (i10) {
            case 0:
                ((t5) obj).f42551a.w0(false);
                return;
            case 1:
                ((n9) obj).f40749b.onFragmentDestroy();
                return;
            case 2:
                hd hdVar = (hd) obj;
                if (!hdVar.v.h()) {
                    hdVar.F.N(86);
                    hdVar.h.d();
                    return;
                }
                hdVar.F.L(0, false, false);
                return;
            case 3:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj;
                if (s1Var != null) {
                    s1Var.F3(-1);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.mc mcVar = ((org.telegram.ui.Components.mc[]) obj)[0];
                if (mcVar != null) {
                    mcVar.b();
                    return;
                }
                return;
            case 5:
                ko koVar = (ko) obj;
                if (!koVar.f39962s.h()) {
                    koVar.N0.N(86);
                    koVar.X.f24711e.d();
                    return;
                }
                koVar.N0.L(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f35532x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                t60 t60Var = (t60) obj;
                if (!t60Var.J.h()) {
                    t60Var.N.N(86);
                    t60Var.f42561f.d();
                    return;
                }
                t60Var.N.L(0, false, false);
                return;
            case 8:
                pe0 pe0Var = (pe0) obj;
                org.telegram.ui.Components.xi0 xi0Var2 = pe0Var.E;
                ed edVar = pe0Var.f41390n;
                if (!pe0Var.H.h()) {
                    edVar.setAnimation(xi0Var2);
                    xi0Var2.N(86);
                    edVar.setOnAnimationEndListener(new dd0(pe0Var, 2));
                    edVar.d();
                    return;
                }
                edVar.setAnimation(xi0Var2);
                xi0Var2.L(0, false, false);
                pe0Var.G = true;
                return;
            case 9:
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                pk0.f41429a = null;
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    f3VarArr[0] = null;
                    return;
                }
                return;
            case 10:
                ((org.telegram.ui.ActionBar.f3) obj).dismiss();
                return;
            case 11:
                ((PhotoViewer) obj).L1 = null;
                return;
            case 12:
                Drawable[] drawableArr = PhotoViewer.P8;
                ((Runnable) obj).run();
                return;
            case 13:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                if (!privacyControlActivity.f35956o0.h()) {
                    privacyControlActivity.f35957p0.N(86);
                    privacyControlActivity.f35958q0.f24711e.d();
                    return;
                }
                privacyControlActivity.f35957p0.L(0, false, false);
                return;
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.m0.h()) {
                    profileActivity.R.N(86);
                    profileActivity.S.N(86);
                    org.telegram.ui.Components.zg0 zg0Var = profileActivity.W;
                    if (zg0Var != null) {
                        org.telegram.ui.Components.wg0 j10 = org.telegram.ui.Components.zg0.j(14, zg0Var.f35338a);
                        if (j10 != null && (xi0Var = j10.f34407k) != null) {
                            xi0Var.start();
                        }
                    } else {
                        profileActivity.v.d();
                    }
                    org.telegram.ui.Cells.m8 m8Var = profileActivity.I2;
                    if (m8Var != null) {
                        m8Var.getImageView().d();
                        return;
                    }
                    return;
                }
                profileActivity.R.L(0, false, false);
                profileActivity.S.L(0, false, false);
                return;
            case 15:
                ((d61) obj).w(0.0f);
                return;
            case 16:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i11 = ShareActivity.f36249b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f36250a = null;
                return;
            case 17:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f36312r = null;
                themeActivity.h = null;
                themeActivity.f36307n = null;
                return;
            case 18:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((oh1) obj).f41166q0.b();
                return;
        }
    }
}
