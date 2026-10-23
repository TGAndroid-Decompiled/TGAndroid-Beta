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
public final class u3 implements Utilities.Callback {
    public final int f42145a;
    public final Object f42146b;

    public u3(Object obj, int i10) {
        this.f42145a = i10;
        this.f42146b = obj;
    }

    @Override
    public final void run(Object obj) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10 = this.f42145a;
        boolean z10 = false;
        Object obj2 = this.f42146b;
        switch (i10) {
            case 0:
                k4 k4Var = ((w3) obj2).K;
                if (((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                }
                k4Var.f38799o0 = z10;
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new h0(14, (cc) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new h0(20, (ie) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 3:
                ((cq) obj2).e.T = (String) obj;
                return;
            case 4:
                jr jrVar = ((fr) obj2).d;
                jrVar.A1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(jrVar.f38634c, jrVar.f38666r0);
                return;
            case 5:
                hs.U((hs) obj2, (TL_account.TL_birthday) obj);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                ((p10) obj2).e.b0(true);
                return;
            case 7:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((h50) obj2).c();
                return;
            case 8:
                Boolean bool2 = (Boolean) obj;
                Pattern pattern = LaunchActivity.E1;
                ((p90) obj2).run();
                return;
            case 9:
                Boolean bool3 = (Boolean) obj;
                ((wb0) obj2).Y();
                return;
            case 10:
                rf0 rf0Var = (rf0) obj2;
                String str = (String) obj;
                rf0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    rf0Var.f41121b.setLoading(false);
                    return;
                }
                return;
            case 11:
                qi0 qi0Var = (qi0) obj2;
                Integer num = (Integer) obj;
                qi0Var.getClass();
                if (num.intValue() - qi0Var.d.d > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                }
                qi0Var.f40819a0 = z10;
                if (z10) {
                    f7 = Math.min(qi0Var.f40821b0, (qi0Var.E.getHeight() - num.intValue()) - qi0Var.f40823c0.getMeasuredHeight());
                } else {
                    f7 = qi0Var.f40821b0;
                }
                qi0Var.f40823c0.animate().translationY(f7 - qi0Var.f40823c0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.o1.f21717w).start();
                return;
            case 12:
                fj0 fj0Var = (fj0) obj2;
                fj0Var.f37354j0 = (String) obj;
                z5 z5Var = fj0Var.f37363t0;
                AndroidUtilities.cancelRunOnUIThread(z5Var);
                AndroidUtilities.runOnUIThread(z5Var, 100L);
                return;
            case 13:
                rj0 rj0Var = (rj0) obj2;
                rj0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    rj0Var.t();
                    return;
                }
                return;
            case 14:
                fp0 fp0Var = (fp0) obj2;
                View view = (View) obj;
                lp0 lp0Var = fp0Var.f37402p0;
                if (view instanceof ip0) {
                    view.setBackgroundColor(lp0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6));
                    ((ip0) view).updateColors();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r8) {
                    view.setBackgroundColor(lp0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6));
                    ((org.telegram.ui.Cells.r8) view).updateColors();
                    return;
                } else if (view instanceof ep0) {
                    view.setBackgroundColor(lp0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6));
                    ((ep0) view).updateColors();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.l4) {
                    view.setBackgroundColor(lp0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6));
                    return;
                } else if (view instanceof to0) {
                    ((to0) view).d.invalidate();
                    return;
                } else if (view instanceof kp0) {
                    fp0Var.l((kp0) view);
                    return;
                } else if (view instanceof dp0) {
                    ((dp0) view).updateColors();
                    return;
                } else {
                    return;
                }
            case 15:
                super/*android.widget.LinearLayout*/.draw((Canvas) obj);
                return;
            case 16:
                Boolean bool4 = (Boolean) obj;
                ((dp0) obj2).f36671c.e();
                return;
            case 17:
                ((ei.h1) obj2).D(((Integer) obj).intValue());
                return;
            case 18:
                bw0 bw0Var = (bw0) obj2;
                bw0Var.v = ((Integer) obj).intValue();
                View E1 = bw0Var.d.E1(4);
                if (E1 instanceof org.telegram.ui.Cells.e9) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) E1;
                    if (e9Var.getFixedSize() <= 0 && bw0Var.v > 0) {
                        e9Var.setText(bw0Var.W());
                        bw0Var.V(true);
                        return;
                    }
                }
                bw0Var.d.Z2.N(true);
                bw0Var.V(true);
                return;
            case 19:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.A0(true);
                return;
            case 20:
                org.telegram.ui.Components.y90[] y90VarArr = (org.telegram.ui.Components.y90[]) obj2;
                Boolean bool5 = (Boolean) obj;
                ViewPropertyAnimator animate = y90VarArr[0].animate();
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
                org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
                org.telegram.messenger.sl.t(scaleY, bsVar, 600L);
                ViewPropertyAnimator animate2 = y90VarArr[1].animate();
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
                scaleX2.scaleY(f15).setInterpolator(bsVar).setDuration(600L).start();
                return;
            case 21:
                StickersActivity.b0((StickersActivity) obj2, (View) obj);
                return;
            case 22:
                ThemeActivity.U((ThemeActivity) obj2, (TL_account.contentSettings) obj);
                return;
            case 23:
                ((ei.h1) obj2).D(((Integer) obj).intValue());
                return;
            case 24:
                ((ye1) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                return;
            default:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ((oh1) obj2).D(true);
                return;
        }
    }
}
