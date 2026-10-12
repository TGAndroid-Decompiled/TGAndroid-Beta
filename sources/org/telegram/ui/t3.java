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
public final class t3 implements Utilities.Callback {
    public final int f42059a;
    public final Object f42060b;

    public t3(Object obj, int i10) {
        this.f42059a = i10;
        this.f42060b = obj;
    }

    @Override
    public final void run(Object obj) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10 = this.f42059a;
        boolean z10 = false;
        Object obj2 = this.f42060b;
        switch (i10) {
            case 0:
                i4 i4Var = ((v3) obj2).K;
                if (((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                }
                i4Var.f38655o0 = z10;
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.f6(16, (fc) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.f6(22, (oe) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 3:
                ((pq) obj2).f41067e.S = (String) obj;
                return;
            case 4:
                wr wrVar = ((sr) obj2).d;
                wrVar.A1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(wrVar.f43614c, wrVar.f43647r0);
                return;
            case 5:
                ts.U((ts) obj2, (TL_account.TL_birthday) obj);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                ((e20) obj2).f36960e.Z(true);
                return;
            case 7:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((v50) obj2).c();
                return;
            case 8:
                Boolean bool2 = (Boolean) obj;
                Pattern pattern = LaunchActivity.B1;
                ((ca0) obj2).run();
                return;
            case 9:
                Boolean bool3 = (Boolean) obj;
                ((nc0) obj2).Y();
                return;
            case 10:
                fg0 fg0Var = (fg0) obj2;
                String str = (String) obj;
                fg0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    fg0Var.f37771b.setLoading(false);
                    return;
                }
                return;
            case 11:
                ej0 ej0Var = (ej0) obj2;
                Integer num = (Integer) obj;
                ej0Var.getClass();
                if (num.intValue() - ej0Var.f37132e.d > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                }
                ej0Var.f37128b0 = z10;
                if (z10) {
                    f7 = Math.min(ej0Var.f37130c0, (ej0Var.F.getHeight() - num.intValue()) - ej0Var.f37131d0.getMeasuredHeight());
                } else {
                    f7 = ej0Var.f37130c0;
                }
                ej0Var.f37131d0.animate().translationY(f7 - ej0Var.f37131d0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.o1.f21181w).start();
                return;
            case 12:
                tj0 tj0Var = (tj0) obj2;
                tj0Var.f42223j0 = (String) obj;
                z5 z5Var = tj0Var.f42232t0;
                AndroidUtilities.cancelRunOnUIThread(z5Var);
                AndroidUtilities.runOnUIThread(z5Var, 100L);
                return;
            case 13:
                ek0 ek0Var = (ek0) obj2;
                ek0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ek0Var.t();
                    return;
                }
                return;
            case 14:
                wp0 wp0Var = (wp0) obj2;
                View view = (View) obj;
                cq0 cq0Var = wp0Var.f43597p0;
                if (view instanceof zp0) {
                    view.setBackgroundColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20559d6));
                    ((zp0) view).b();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r8) {
                    view.setBackgroundColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20559d6));
                    ((org.telegram.ui.Cells.r8) view).v();
                    return;
                } else if (view instanceof vp0) {
                    int i11 = org.telegram.ui.ActionBar.h6.f20559d6;
                    view.setBackgroundColor(cq0Var.getThemedColor(i11));
                    vp0 vp0Var = (vp0) view;
                    cq0 cq0Var2 = vp0Var.d.f43597p0;
                    vp0Var.setBackgroundColor(cq0Var2.getThemedColor(i11));
                    vp0Var.f42821a.setTextColor(cq0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                    return;
                } else if (view instanceof org.telegram.ui.Cells.m4) {
                    view.setBackgroundColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20559d6));
                    return;
                } else if (view instanceof kp0) {
                    ((kp0) view).d.invalidate();
                    return;
                } else if (view instanceof bq0) {
                    wp0Var.l((bq0) view);
                    return;
                } else if (view instanceof up0) {
                    ((up0) view).a();
                    return;
                } else {
                    return;
                }
            case 15:
                super/*android.widget.LinearLayout*/.draw((Canvas) obj);
                return;
            case 16:
                Boolean bool4 = (Boolean) obj;
                ((up0) obj2).f42547c.e();
                return;
            case 17:
                ((ci.h1) obj2).D(((Integer) obj).intValue());
                return;
            case 18:
                vw0 vw0Var = (vw0) obj2;
                vw0Var.f42871s = ((Integer) obj).intValue();
                View z12 = vw0Var.d.z1(4);
                if (z12 instanceof org.telegram.ui.Cells.e9) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) z12;
                    if (e9Var.getFixedSize() <= 0 && vw0Var.f42871s > 0) {
                        e9Var.setText(vw0Var.W());
                        vw0Var.V(true);
                        return;
                    }
                }
                vw0Var.d.W2.N(true);
                vw0Var.V(true);
                return;
            case 19:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.A0(true);
                return;
            case 20:
                org.telegram.ui.Components.ia0[] ia0VarArr = (org.telegram.ui.Components.ia0[]) obj2;
                Boolean bool5 = (Boolean) obj;
                ViewPropertyAnimator animate = ia0VarArr[0].animate();
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
                org.telegram.ui.Components.js jsVar = org.telegram.ui.Components.js.h;
                org.telegram.messenger.am.t(scaleY, jsVar, 600L);
                ViewPropertyAnimator animate2 = ia0VarArr[1].animate();
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
                scaleX2.scaleY(f15).setInterpolator(jsVar).setDuration(600L).start();
                return;
            case 21:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj2;
                Long l4 = (Long) obj;
                if (!m2Var.isFinished) {
                    if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                        m2Var.presentFragment(ProfileActivity.m4(l4.longValue()), true);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(new w21(0));
                        return;
                    }
                }
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new hu0(26, (b31) obj2, (TLRPC.TL_exportedContactToken) obj));
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
                ((hg1) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                return;
            default:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ((xi1) obj2).D(true);
                return;
        }
    }
}
