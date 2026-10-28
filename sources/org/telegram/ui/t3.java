package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
public final class t3 implements Utilities.Callback {
    public final int f43478a;
    public final Object f43479b;

    public t3(Object obj, int i10) {
        this.f43478a = i10;
        this.f43479b = obj;
    }

    @Override
    public final void run(Object obj) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10 = this.f43478a;
        boolean z10 = false;
        Object obj2 = this.f43479b;
        switch (i10) {
            case 0:
                j4 j4Var = ((v3) obj2).K;
                if (((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                }
                j4Var.f40408o0 = z10;
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.m0(25, (dc) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ed(1, (ke) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 3:
                ((hq) obj2).e.S = (String) obj;
                return;
            case 4:
                mr mrVar = ((ir) obj2).d;
                mrVar.f41561z1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(mrVar.f41508c, mrVar.f41537q0);
                return;
            case 5:
                ls.V((ls) obj2, (TL_account.TL_birthday) obj);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                ((r10) obj2).e.c0(true);
                return;
            case 7:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((j50) obj2).c();
                return;
            case 8:
                Boolean bool2 = (Boolean) obj;
                Pattern pattern = LaunchActivity.D1;
                ((q90) obj2).run();
                return;
            case 9:
                Boolean bool3 = (Boolean) obj;
                ((wb0) obj2).Z();
                return;
            case 10:
                qf0 qf0Var = (qf0) obj2;
                String str = (String) obj;
                qf0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    qf0Var.f42697b.setLoading(false);
                    return;
                }
                return;
            case 11:
                pi0 pi0Var = (pi0) obj2;
                Integer num = (Integer) obj;
                pi0Var.getClass();
                if (num.intValue() - pi0Var.d.d > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                }
                pi0Var.f42408a0 = z10;
                if (z10) {
                    f7 = Math.min(pi0Var.f42410b0, (pi0Var.E.getHeight() - num.intValue()) - pi0Var.f42412c0.getMeasuredHeight());
                } else {
                    f7 = pi0Var.f42410b0;
                }
                pi0Var.f42412c0.animate().translationY(f7 - pi0Var.f42412c0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.f22964w).start();
                return;
            case 12:
                ej0 ej0Var = (ej0) obj2;
                ej0Var.f38895j0 = (String) obj;
                y5 y5Var = ej0Var.f38904t0;
                AndroidUtilities.cancelRunOnUIThread(y5Var);
                AndroidUtilities.runOnUIThread(y5Var, 100L);
                return;
            case 13:
                qj0 qj0Var = (qj0) obj2;
                qj0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    qj0Var.s();
                    return;
                }
                return;
            case 14:
                zj0 zj0Var = (zj0) obj2;
                Integer num2 = (Integer) obj;
                num2.getClass();
                HashSet hashSet = zj0Var.d;
                if (!hashSet.remove(num2)) {
                    hashSet.add(num2);
                }
                zj0.o0(zj0Var.f46288b[0]);
                zj0Var.p0(true);
                return;
            case 15:
                np0 np0Var = (np0) obj2;
                View view = (View) obj;
                tp0 tp0Var = np0Var.f41856p0;
                if (view instanceof qp0) {
                    view.setBackgroundColor(tp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6));
                    ((qp0) view).updateColors();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.v8) {
                    view.setBackgroundColor(tp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6));
                    ((org.telegram.ui.Cells.v8) view).updateColors();
                    return;
                } else if (view instanceof mp0) {
                    view.setBackgroundColor(tp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6));
                    ((mp0) view).updateColors();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.q4) {
                    view.setBackgroundColor(tp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6));
                    return;
                } else if (view instanceof bp0) {
                    ((bp0) view).d.invalidate();
                    return;
                } else if (view instanceof sp0) {
                    np0Var.l((sp0) view);
                    return;
                } else if (view instanceof lp0) {
                    ((lp0) view).updateColors();
                    return;
                } else {
                    return;
                }
            case 16:
                super/*android.widget.LinearLayout*/.draw((Canvas) obj);
                return;
            case 17:
                Boolean bool4 = (Boolean) obj;
                ((lp0) obj2).f41231c.e();
                return;
            case 18:
                ((fi.h1) obj2).E(((Integer) obj).intValue());
                return;
            case 19:
                hw0 hw0Var = (hw0) obj2;
                hw0Var.f40004r = ((Integer) obj).intValue();
                View E1 = hw0Var.d.E1(4);
                if (E1 instanceof org.telegram.ui.Cells.i9) {
                    org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) E1;
                    if (i9Var.getFixedSize() <= 0 && hw0Var.f40004r > 0) {
                        i9Var.setText(hw0Var.X());
                        hw0Var.W(true);
                        return;
                    }
                }
                hw0Var.d.f32504g3.O(true);
                hw0Var.W(true);
                return;
            case 20:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.B0(true);
                return;
            case 21:
                org.telegram.ui.Components.aa0[] aa0VarArr = (org.telegram.ui.Components.aa0[]) obj2;
                Boolean bool5 = (Boolean) obj;
                int i11 = ProfileActivity.R6;
                ViewPropertyAnimator animate = aa0VarArr[0].animate();
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
                org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
                org.telegram.messenger.wh.q(scaleY, dsVar, 600L);
                ViewPropertyAnimator animate2 = aa0VarArr[1].animate();
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
                scaleX2.scaleY(f15).setInterpolator(dsVar).setDuration(600L).start();
                return;
            case 22:
                StickersActivity.c0((StickersActivity) obj2, (View) obj);
                return;
            case 23:
                ThemeActivity.V((ThemeActivity) obj2, (TL_account.contentSettings) obj);
                return;
            case 24:
                ((fi.h1) obj2).E(((Integer) obj).intValue());
                return;
            case 25:
                ((cf1) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                return;
            default:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ((rh1) obj2).D(true);
                return;
        }
    }
}
