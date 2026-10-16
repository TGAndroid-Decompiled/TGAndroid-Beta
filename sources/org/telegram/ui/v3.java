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
    public final int f40566a;
    public final Object f40567b;

    public v3(Object obj, int i10) {
        this.f40566a = i10;
        this.f40567b = obj;
    }

    @Override
    public final void run(Object obj) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10 = this.f40566a;
        boolean z10 = false;
        Object obj2 = this.f40567b;
        switch (i10) {
            case 0:
                k4 k4Var = ((x3) obj2).K;
                if (((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                }
                k4Var.f37272o0 = z10;
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.p0(25, (hc) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new jd(1, (qe) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 3:
                ((sq) obj2).e.S = (String) obj;
                return;
            case 4:
                yr yrVar = ((ur) obj2).d;
                yrVar.A1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(yrVar.f41895c, yrVar.f41927r0);
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
                ((qc0) obj2).Y();
                return;
            case 10:
                jg0 jg0Var = (jg0) obj2;
                String str = (String) obj;
                jg0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    jg0Var.f37049b.setLoading(false);
                    return;
                }
                return;
            case 11:
                gj0 gj0Var = (gj0) obj2;
                Integer num = (Integer) obj;
                gj0Var.getClass();
                if (num.intValue() - gj0Var.e.d > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                }
                gj0Var.f36235b0 = z10;
                if (z10) {
                    f7 = Math.min(gj0Var.f36237c0, (gj0Var.F.getHeight() - num.intValue()) - gj0Var.f36238d0.getMeasuredHeight());
                } else {
                    f7 = gj0Var.f36237c0;
                }
                gj0Var.f36238d0.animate().translationY(f7 - gj0Var.f36238d0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.o1.f20254w).start();
                return;
            case 12:
                wj0 wj0Var = (wj0) obj2;
                wj0Var.f41309j0 = (String) obj;
                a6 a6Var = wj0Var.f41318t0;
                AndroidUtilities.cancelRunOnUIThread(a6Var);
                AndroidUtilities.runOnUIThread(a6Var, 100L);
                return;
            case 13:
                hk0 hk0Var = (hk0) obj2;
                hk0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    hk0Var.t();
                    return;
                }
                return;
            case 14:
                yp0 yp0Var = (yp0) obj2;
                View view = (View) obj;
                eq0 eq0Var = yp0Var.f41880p0;
                if (view instanceof bq0) {
                    view.setBackgroundColor(eq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6));
                    ((bq0) view).b();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r8) {
                    view.setBackgroundColor(eq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6));
                    ((org.telegram.ui.Cells.r8) view).v();
                    return;
                } else if (view instanceof xp0) {
                    int i11 = org.telegram.ui.ActionBar.g6.f19601d6;
                    view.setBackgroundColor(eq0Var.getThemedColor(i11));
                    xp0 xp0Var = (xp0) view;
                    eq0 eq0Var2 = xp0Var.d.f41880p0;
                    xp0Var.setBackgroundColor(eq0Var2.getThemedColor(i11));
                    xp0Var.f41607a.setTextColor(eq0Var2.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                    return;
                } else if (view instanceof org.telegram.ui.Cells.m4) {
                    view.setBackgroundColor(eq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6));
                    return;
                } else if (view instanceof mp0) {
                    ((mp0) view).d.invalidate();
                    return;
                } else if (view instanceof dq0) {
                    yp0Var.l((dq0) view);
                    return;
                } else if (view instanceof wp0) {
                    ((wp0) view).a();
                    return;
                } else {
                    return;
                }
            case 15:
                super/*android.widget.LinearLayout*/.draw((Canvas) obj);
                return;
            case 16:
                Boolean bool4 = (Boolean) obj;
                ((wp0) obj2).f41338c.e();
                return;
            case 17:
                ((di.h1) obj2).D(((Integer) obj).intValue());
                return;
            case 18:
                zw0 zw0Var = (zw0) obj2;
                zw0Var.f42433s = ((Integer) obj).intValue();
                View z12 = zw0Var.d.z1(4);
                if (z12 instanceof org.telegram.ui.Cells.e9) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) z12;
                    if (e9Var.getFixedSize() <= 0 && zw0Var.f42433s > 0) {
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
                org.telegram.messenger.sk.t(scaleY, esVar, 600L);
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
                AndroidUtilities.runOnUIThread(new i11(5, (g31) obj2, (TLRPC.TL_exportedContactToken) obj));
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
                ((kg1) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                return;
            default:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ((cj1) obj2).D(true);
                return;
        }
    }
}
