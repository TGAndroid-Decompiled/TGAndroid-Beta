package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
public final class s3 implements Utilities.Callback {
    public final int f41606a;
    public final Object f41607b;

    public s3(Object obj, int i10) {
        this.f41606a = i10;
        this.f41607b = obj;
    }

    @Override
    public final void run(Object obj) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10 = this.f41606a;
        boolean z10 = false;
        Object obj2 = this.f41607b;
        switch (i10) {
            case 0:
                h4 h4Var = ((u3) obj2).K;
                if (((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                }
                h4Var.f38313o0 = z10;
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.a6(18, (bc) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.a6(24, (je) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 3:
                ((mq) obj2).f40084e.S = (String) obj;
                return;
            case 4:
                sr srVar = ((or) obj2).d;
                srVar.A1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(srVar.f41824c, srVar.f41857r0);
                return;
            case 5:
                ps.U((ps) obj2, (TL_account.TL_birthday) obj);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                ((b20) obj2).f36279e.Z(true);
                return;
            case 7:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((t50) obj2).c();
                return;
            case 8:
                Boolean bool2 = (Boolean) obj;
                Pattern pattern = LaunchActivity.B1;
                ((z90) obj2).run();
                return;
            case 9:
                Boolean bool3 = (Boolean) obj;
                ((lc0) obj2).Y();
                return;
            case 10:
                eg0 eg0Var = (eg0) obj2;
                String str = (String) obj;
                eg0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    eg0Var.f37337b.setLoading(false);
                    return;
                }
                return;
            case 11:
                cj0 cj0Var = (cj0) obj2;
                Integer num = (Integer) obj;
                cj0Var.getClass();
                if (num.intValue() - cj0Var.f36764e.d > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                }
                cj0Var.f36760b0 = z10;
                if (z10) {
                    f7 = Math.min(cj0Var.f36762c0, (cj0Var.F.getHeight() - num.intValue()) - cj0Var.f36763d0.getMeasuredHeight());
                } else {
                    f7 = cj0Var.f36762c0;
                }
                cj0Var.f36763d0.animate().translationY(f7 - cj0Var.f36763d0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.o1.f21443w).start();
                return;
            case 12:
                rj0 rj0Var = (rj0) obj2;
                rj0Var.f41495j0 = (String) obj;
                v5 v5Var = rj0Var.f41504t0;
                AndroidUtilities.cancelRunOnUIThread(v5Var);
                AndroidUtilities.runOnUIThread(v5Var, 100L);
                return;
            case 13:
                ck0 ck0Var = (ck0) obj2;
                ck0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ck0Var.t();
                    return;
                }
                return;
            case 14:
                tp0 tp0Var = (tp0) obj2;
                View view = (View) obj;
                zp0 zp0Var = tp0Var.f42275p0;
                if (view instanceof wp0) {
                    view.setBackgroundColor(zp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20822d6));
                    ((wp0) view).b();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r8) {
                    view.setBackgroundColor(zp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20822d6));
                    ((org.telegram.ui.Cells.r8) view).v();
                    return;
                } else if (view instanceof sp0) {
                    int i11 = org.telegram.ui.ActionBar.h6.f20822d6;
                    view.setBackgroundColor(zp0Var.getThemedColor(i11));
                    sp0 sp0Var = (sp0) view;
                    zp0 zp0Var2 = sp0Var.d.f42275p0;
                    sp0Var.setBackgroundColor(zp0Var2.getThemedColor(i11));
                    sp0Var.f41808a.setTextColor(zp0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                    return;
                } else if (view instanceof org.telegram.ui.Cells.m4) {
                    view.setBackgroundColor(zp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20822d6));
                    return;
                } else if (view instanceof hp0) {
                    ((hp0) view).d.invalidate();
                    return;
                } else if (view instanceof yp0) {
                    tp0Var.l((yp0) view);
                    return;
                } else if (view instanceof rp0) {
                    ((rp0) view).a();
                    return;
                } else {
                    return;
                }
            case 15:
                super/*android.widget.LinearLayout*/.draw((Canvas) obj);
                return;
            case 16:
                Boolean bool4 = (Boolean) obj;
                ((rp0) obj2).f41520c.e();
                return;
            case 17:
                ((ci.h1) obj2).D(((Integer) obj).intValue());
                return;
            case 18:
                sw0 sw0Var = (sw0) obj2;
                sw0Var.f41909s = ((Integer) obj).intValue();
                View z12 = sw0Var.d.z1(4);
                if (z12 instanceof org.telegram.ui.Cells.e9) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) z12;
                    if (e9Var.getFixedSize() <= 0 && sw0Var.f41909s > 0) {
                        e9Var.setText(sw0Var.W());
                        sw0Var.V(true);
                        return;
                    }
                }
                sw0Var.d.W2.N(true);
                sw0Var.V(true);
                return;
            case 19:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.A0(true);
                return;
            case 20:
                org.telegram.ui.Components.ea0[] ea0VarArr = (org.telegram.ui.Components.ea0[]) obj2;
                Boolean bool5 = (Boolean) obj;
                ViewPropertyAnimator animate = ea0VarArr[0].animate();
                float f14 = 0.0f;
                float f15 = 1.0f;
                if (bool5.booleanValue()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f10);
                if (bool5.booleanValue()) {
                    f11 = 0.8f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                if (bool5.booleanValue()) {
                    f12 = 0.8f;
                } else {
                    f12 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f12);
                org.telegram.ui.Components.is isVar = org.telegram.ui.Components.is.h;
                org.telegram.messenger.ai.t(scaleY, isVar, 600L);
                ViewPropertyAnimator animate2 = ea0VarArr[1].animate();
                if (bool5.booleanValue()) {
                    f14 = 1.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f14);
                if (!bool5.booleanValue()) {
                    f13 = 0.8f;
                } else {
                    f13 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f13);
                if (!bool5.booleanValue()) {
                    f15 = 0.8f;
                }
                scaleX2.scaleY(f15).setInterpolator(isVar).setDuration(600L).start();
                return;
            case 21:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj2;
                Long l4 = (Long) obj;
                if (!m2Var.isFinished) {
                    if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                        m2Var.presentFragment(ProfileActivity.m4(l4.longValue()), true);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(new s21(0));
                        return;
                    }
                }
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new tt0(28, (x21) obj2, (TLRPC.TL_exportedContactToken) obj));
                return;
            case 23:
                StickersActivity.b0((StickersActivity) obj2, (View) obj);
                return;
            case 24:
                ThemeActivity.U((ThemeActivity) obj2, (TL_account.contentSettings) obj);
                return;
            case 25:
                ((ci.h1) obj2).D(((Integer) obj).intValue());
                return;
            case 26:
                ((eg1) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                return;
            default:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ((ui1) obj2).D(true);
                return;
        }
    }
}
