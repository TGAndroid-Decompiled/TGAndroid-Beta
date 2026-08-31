package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class v5 implements DialogInterface.OnDismissListener {
    public final int f42130a;
    public final Object f42131b;

    public v5(Object obj, int i10) {
        this.f42130a = i10;
        this.f42131b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.ij0 ij0Var;
        int i10 = this.f42130a;
        Object obj = this.f42131b;
        switch (i10) {
            case 0:
                ((w5) obj).f42380a.w0(false);
                return;
            case 1:
                ((r9) obj).f40856b.onFragmentDestroy();
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
                if (!poVar.f40118s.h()) {
                    poVar.O0.N(86);
                    poVar.Y.f23313e.d();
                    return;
                }
                poVar.O0.L(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f34106x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                f70 f70Var = (f70) obj;
                if (!f70Var.K.h()) {
                    f70Var.O.N(86);
                    f70Var.f36775f.d();
                    return;
                }
                f70Var.O.L(0, false, false);
                return;
            case 8:
                af0 af0Var = (af0) obj;
                org.telegram.ui.Components.ij0 ij0Var2 = af0Var.F;
                kd kdVar = af0Var.f35155n;
                if (!af0Var.I.h()) {
                    kdVar.setAnimation(ij0Var2);
                    ij0Var2.N(86);
                    kdVar.setOnAnimationEndListener(new nd0(af0Var, 2));
                    kdVar.d();
                    return;
                }
                kdVar.setAnimation(ij0Var2);
                ij0Var2.L(0, false, false);
                af0Var.H = true;
                return;
            case 9:
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) obj;
                zk0.f43952a = null;
                org.telegram.ui.ActionBar.h3 h3Var = h3VarArr[0];
                if (h3Var != null) {
                    h3Var.dismiss();
                    h3VarArr[0] = null;
                    return;
                }
                return;
            case 10:
                ((org.telegram.ui.ActionBar.h3) obj).dismiss();
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
                if (!privacyControlActivity.f34533p0.h()) {
                    privacyControlActivity.f34534q0.N(86);
                    privacyControlActivity.f34536r0.f23313e.d();
                    return;
                }
                privacyControlActivity.f34534q0.L(0, false, false);
                return;
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.f34652n0.h()) {
                    profileActivity.S.N(86);
                    profileActivity.T.N(86);
                    org.telegram.ui.Components.lh0 lh0Var = profileActivity.X;
                    if (lh0Var != null) {
                        org.telegram.ui.Components.ih0 j10 = org.telegram.ui.Components.lh0.j(14, lh0Var.f28735a);
                        if (j10 != null && (ij0Var = j10.f27794k) != null) {
                            ij0Var.start();
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
                ((r61) obj).w(0.0f);
                return;
            case 16:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i11 = ShareActivity.f34828b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f34829a = null;
                return;
            case 17:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f34892r = null;
                themeActivity.h = null;
                themeActivity.f34887n = null;
                return;
            case 18:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((ci1) obj).f35851r0.b();
                return;
        }
    }
}
