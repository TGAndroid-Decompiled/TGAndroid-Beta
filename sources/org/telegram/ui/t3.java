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
    public final int f43666a;
    public final Object f43667b;

    public t3(Object obj, int i10) {
        this.f43666a = i10;
        this.f43667b = obj;
    }

    @Override
    public final void run(Object obj) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10 = this.f43666a;
        boolean z10 = false;
        Object obj2 = this.f43667b;
        switch (i10) {
            case 0:
                j4 j4Var = ((v3) obj2).K;
                if (((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                }
                j4Var.f40443o0 = z10;
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.m0(25, (dc) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ed(1, (ke) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 3:
                ((fq) obj2).e.S = (String) obj;
                return;
            case 4:
                kr krVar = ((gr) obj2).d;
                krVar.f41063z1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(krVar.f41010c, krVar.f41039q0);
                return;
            case 5:
                js.V((js) obj2, (TL_account.TL_birthday) obj);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                ((p10) obj2).e.c0(true);
                return;
            case 7:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((h50) obj2).c();
                return;
            case 8:
                Boolean bool2 = (Boolean) obj;
                Pattern pattern = LaunchActivity.D1;
                ((o90) obj2).run();
                return;
            case 9:
                Boolean bool3 = (Boolean) obj;
                ((tb0) obj2).Z();
                return;
            case 10:
                of0 of0Var = (of0) obj2;
                String str = (String) obj;
                of0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    of0Var.f42177b.setLoading(false);
                    return;
                }
                return;
            case 11:
                ni0 ni0Var = (ni0) obj2;
                Integer num = (Integer) obj;
                ni0Var.getClass();
                if (num.intValue() - ni0Var.d.d > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                }
                ni0Var.f41905a0 = z10;
                if (z10) {
                    f7 = Math.min(ni0Var.f41907b0, (ni0Var.E.getHeight() - num.intValue()) - ni0Var.f41909c0.getMeasuredHeight());
                } else {
                    f7 = ni0Var.f41907b0;
                }
                ni0Var.f41909c0.animate().translationY(f7 - ni0Var.f41909c0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.f22963w).start();
                return;
            case 12:
                cj0 cj0Var = (cj0) obj2;
                cj0Var.f38484j0 = (String) obj;
                y5 y5Var = cj0Var.f38493t0;
                AndroidUtilities.cancelRunOnUIThread(y5Var);
                AndroidUtilities.runOnUIThread(y5Var, 100L);
                return;
            case 13:
                oj0 oj0Var = (oj0) obj2;
                oj0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    oj0Var.s();
                    return;
                }
                return;
            case 14:
                xj0 xj0Var = (xj0) obj2;
                Integer num2 = (Integer) obj;
                num2.getClass();
                HashSet hashSet = xj0Var.d;
                if (!hashSet.remove(num2)) {
                    hashSet.add(num2);
                }
                xj0.o0(xj0Var.f45784b[0]);
                xj0Var.p0(true);
                return;
            case 15:
                lp0 lp0Var = (lp0) obj2;
                View view = (View) obj;
                rp0 rp0Var = lp0Var.f41333p0;
                if (view instanceof op0) {
                    view.setBackgroundColor(rp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6));
                    ((op0) view).updateColors();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.v8) {
                    view.setBackgroundColor(rp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6));
                    ((org.telegram.ui.Cells.v8) view).updateColors();
                    return;
                } else if (view instanceof kp0) {
                    view.setBackgroundColor(rp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6));
                    ((kp0) view).updateColors();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.q4) {
                    view.setBackgroundColor(rp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6));
                    return;
                } else if (view instanceof zo0) {
                    ((zo0) view).d.invalidate();
                    return;
                } else if (view instanceof qp0) {
                    lp0Var.l((qp0) view);
                    return;
                } else if (view instanceof jp0) {
                    ((jp0) view).updateColors();
                    return;
                } else {
                    return;
                }
            case 16:
                super/*android.widget.LinearLayout*/.draw((Canvas) obj);
                return;
            case 17:
                Boolean bool4 = (Boolean) obj;
                ((jp0) obj2).f40716c.e();
                return;
            case 18:
                ((fi.h1) obj2).E(((Integer) obj).intValue());
                return;
            case 19:
                fw0 fw0Var = (fw0) obj2;
                fw0Var.f39489r = ((Integer) obj).intValue();
                View E1 = fw0Var.d.E1(4);
                if (E1 instanceof org.telegram.ui.Cells.i9) {
                    org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) E1;
                    if (i9Var.getFixedSize() <= 0 && fw0Var.f39489r > 0) {
                        i9Var.setText(fw0Var.X());
                        fw0Var.W(true);
                        return;
                    }
                }
                fw0Var.d.f32152g3.O(true);
                fw0Var.W(true);
                return;
            case 20:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.B0(true);
                return;
            case 21:
                org.telegram.ui.Components.z90[] z90VarArr = (org.telegram.ui.Components.z90[]) obj2;
                Boolean bool5 = (Boolean) obj;
                int i11 = ProfileActivity.R6;
                ViewPropertyAnimator animate = z90VarArr[0].animate();
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
                org.telegram.messenger.vh.q(scaleY, dsVar, 600L);
                ViewPropertyAnimator animate2 = z90VarArr[1].animate();
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
                ((af1) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                return;
            default:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ((ph1) obj2).D(true);
                return;
        }
    }
}
