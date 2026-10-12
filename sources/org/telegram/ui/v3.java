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
public final class v3 implements Utilities.Callback {
    public final int f40879a;
    public final Object f40880b;

    public v3(Object obj, int i10) {
        this.f40879a = i10;
        this.f40880b = obj;
    }

    @Override
    public final void run(Object obj) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10 = this.f40879a;
        boolean z10 = false;
        Object obj2 = this.f40880b;
        switch (i10) {
            case 0:
                k4 k4Var = ((x3) obj2).K;
                if (((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                }
                k4Var.f37551o0 = z10;
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new fc(0, (ic) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new fc(6, (qe) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 3:
                ((sq) obj2).e.S = (String) obj;
                return;
            case 4:
                yr yrVar = ((ur) obj2).d;
                yrVar.A1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(yrVar.f42218c, yrVar.f42250r0);
                return;
            case 5:
                ws.U((ws) obj2, (TL_account.TL_birthday) obj);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                ((i20) obj2).e.Z(true);
                return;
            case 7:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((a60) obj2).c();
                return;
            case 8:
                Boolean bool2 = (Boolean) obj;
                Pattern pattern = LaunchActivity.B1;
                ((fa0) obj2).run();
                return;
            case 9:
                Boolean bool3 = (Boolean) obj;
                ((rc0) obj2).Y();
                return;
            case 10:
                kg0 kg0Var = (kg0) obj2;
                String str = (String) obj;
                kg0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    kg0Var.f37647b.setLoading(false);
                    return;
                }
                return;
            case 11:
                hj0 hj0Var = (hj0) obj2;
                Integer num = (Integer) obj;
                hj0Var.getClass();
                if (num.intValue() - hj0Var.e.d > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                }
                hj0Var.f36837b0 = z10;
                if (z10) {
                    f7 = Math.min(hj0Var.f36839c0, (hj0Var.F.getHeight() - num.intValue()) - hj0Var.f36840d0.getMeasuredHeight());
                } else {
                    f7 = hj0Var.f36839c0;
                }
                hj0Var.f36840d0.animate().translationY(f7 - hj0Var.f36840d0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.o1.f20554w).start();
                return;
            case 12:
                xj0 xj0Var = (xj0) obj2;
                xj0Var.f41879j0 = (String) obj;
                a6 a6Var = xj0Var.f41888t0;
                AndroidUtilities.cancelRunOnUIThread(a6Var);
                AndroidUtilities.runOnUIThread(a6Var, 100L);
                return;
            case 13:
                ik0 ik0Var = (ik0) obj2;
                ik0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ik0Var.t();
                    return;
                }
                return;
            case 14:
                aq0 aq0Var = (aq0) obj2;
                View view = (View) obj;
                gq0 gq0Var = aq0Var.f34322p0;
                if (view instanceof dq0) {
                    view.setBackgroundColor(gq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
                    ((dq0) view).b();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r8) {
                    view.setBackgroundColor(gq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
                    ((org.telegram.ui.Cells.r8) view).v();
                    return;
                } else if (view instanceof zp0) {
                    int i11 = org.telegram.ui.ActionBar.g6.f19901d6;
                    view.setBackgroundColor(gq0Var.getThemedColor(i11));
                    zp0 zp0Var = (zp0) view;
                    gq0 gq0Var2 = zp0Var.d.f34322p0;
                    zp0Var.setBackgroundColor(gq0Var2.getThemedColor(i11));
                    zp0Var.f42692a.setTextColor(gq0Var2.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                    return;
                } else if (view instanceof org.telegram.ui.Cells.m4) {
                    view.setBackgroundColor(gq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
                    return;
                } else if (view instanceof op0) {
                    ((op0) view).d.invalidate();
                    return;
                } else if (view instanceof fq0) {
                    aq0Var.l((fq0) view);
                    return;
                } else if (view instanceof yp0) {
                    ((yp0) view).a();
                    return;
                } else {
                    return;
                }
            case 15:
                vp0.b((vp0) obj2, (Canvas) obj);
                return;
            case 16:
                Boolean bool4 = (Boolean) obj;
                ((yp0) obj2).f42207c.e();
                return;
            case 17:
                ((di.h1) obj2).D(((Integer) obj).intValue());
                return;
            case 18:
                zw0 zw0Var = (zw0) obj2;
                zw0Var.f42729s = ((Integer) obj).intValue();
                View z12 = zw0Var.d.z1(4);
                if (z12 instanceof org.telegram.ui.Cells.e9) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) z12;
                    if (e9Var.getFixedSize() <= 0 && zw0Var.f42729s > 0) {
                        e9Var.setText(zw0Var.W());
                        zw0Var.V(true);
                        return;
                    }
                }
                zw0Var.d.W2.N(true);
                zw0Var.V(true);
                return;
            case 19:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.A0(true);
                return;
            case 20:
                org.telegram.ui.Components.da0[] da0VarArr = (org.telegram.ui.Components.da0[]) obj2;
                Boolean bool5 = (Boolean) obj;
                ViewPropertyAnimator animate = da0VarArr[0].animate();
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
                org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.h;
                org.telegram.messenger.yh.s(scaleY, esVar, 600L);
                ViewPropertyAnimator animate2 = da0VarArr[1].animate();
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
                scaleX2.scaleY(f15).setInterpolator(esVar).setDuration(600L).start();
                return;
            case 21:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj2;
                Long l4 = (Long) obj;
                if (!m2Var.isFinished) {
                    if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                        m2Var.presentFragment(ProfileActivity.m4(l4.longValue()), true);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(new b31(1));
                        return;
                    }
                }
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new hz0(10, (g31) obj2, (TLRPC.TL_exportedContactToken) obj));
                return;
            case 23:
                StickersActivity.b0((StickersActivity) obj2, (View) obj);
                return;
            case 24:
                ThemeActivity.U((ThemeActivity) obj2, (TL_account.contentSettings) obj);
                return;
            case 25:
                ((di.h1) obj2).D(((Integer) obj).intValue());
                return;
            case 26:
                ((lg1) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                return;
            default:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ((dj1) obj2).D(true);
                return;
        }
    }
}
