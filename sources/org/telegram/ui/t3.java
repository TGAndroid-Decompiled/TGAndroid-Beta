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
    public final int f37952a;
    public final Object f37953b;

    public t3(Object obj, int i10) {
        this.f37952a = i10;
        this.f37953b = obj;
    }

    @Override
    public final void run(Object obj) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10 = this.f37952a;
        boolean z10 = false;
        Object obj2 = this.f37953b;
        switch (i10) {
            case 0:
                i4 i4Var = ((v3) obj2).K;
                if (((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                }
                i4Var.f34400o0 = z10;
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.a6(17, (bc) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.a6(23, (je) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 3:
                ((jq) obj2).e.S = (String) obj;
                return;
            case 4:
                pr prVar = ((lr) obj2).d;
                prVar.A1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(prVar.f36614c, prVar.f36646r0);
                return;
            case 5:
                ms.U((ms) obj2, (TL_account.TL_birthday) obj);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                ((z10) obj2).e.Z(true);
                return;
            case 7:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((q50) obj2).c();
                return;
            case 8:
                Boolean bool2 = (Boolean) obj;
                Pattern pattern = LaunchActivity.B1;
                ((w90) obj2).run();
                return;
            case 9:
                Boolean bool3 = (Boolean) obj;
                ((hc0) obj2).Y();
                return;
            case 10:
                zf0 zf0Var = (zf0) obj2;
                String str = (String) obj;
                zf0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    zf0Var.f40460b.setLoading(false);
                    return;
                }
                return;
            case 11:
                vi0 vi0Var = (vi0) obj2;
                Integer num = (Integer) obj;
                vi0Var.getClass();
                if (num.intValue() - vi0Var.e.d > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                }
                vi0Var.f38728b0 = z10;
                if (z10) {
                    f7 = Math.min(vi0Var.f38730c0, (vi0Var.F.getHeight() - num.intValue()) - vi0Var.f38731d0.getMeasuredHeight());
                } else {
                    f7 = vi0Var.f38730c0;
                }
                vi0Var.f38731d0.animate().translationY(f7 - vi0Var.f38731d0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.o1.f19668w).start();
                return;
            case 12:
                kj0 kj0Var = (kj0) obj2;
                kj0Var.f35087j0 = (String) obj;
                w5 w5Var = kj0Var.f35096t0;
                AndroidUtilities.cancelRunOnUIThread(w5Var);
                AndroidUtilities.runOnUIThread(w5Var, 100L);
                return;
            case 13:
                wj0 wj0Var = (wj0) obj2;
                wj0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    wj0Var.r();
                    return;
                }
                return;
            case 14:
                np0 np0Var = (np0) obj2;
                View view = (View) obj;
                tp0 tp0Var = np0Var.f35954p0;
                if (view instanceof qp0) {
                    view.setBackgroundColor(tp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19059d6));
                    ((qp0) view).b();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r8) {
                    view.setBackgroundColor(tp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19059d6));
                    ((org.telegram.ui.Cells.r8) view).v();
                    return;
                } else if (view instanceof mp0) {
                    int i11 = org.telegram.ui.ActionBar.h6.f19059d6;
                    view.setBackgroundColor(tp0Var.getThemedColor(i11));
                    mp0 mp0Var = (mp0) view;
                    tp0 tp0Var2 = mp0Var.d.f35954p0;
                    mp0Var.setBackgroundColor(tp0Var2.getThemedColor(i11));
                    mp0Var.f35639a.setTextColor(tp0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                    return;
                } else if (view instanceof org.telegram.ui.Cells.m4) {
                    view.setBackgroundColor(tp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19059d6));
                    return;
                } else if (view instanceof bp0) {
                    ((bp0) view).d.invalidate();
                    return;
                } else if (view instanceof sp0) {
                    np0Var.l((sp0) view);
                    return;
                } else if (view instanceof lp0) {
                    ((lp0) view).a();
                    return;
                } else {
                    return;
                }
            case 15:
                ip0.b((ip0) obj2, (Canvas) obj);
                return;
            case 16:
                Boolean bool4 = (Boolean) obj;
                ((lp0) obj2).f35396c.e();
                return;
            case 17:
                ((ci.i1) obj2).D(((Integer) obj).intValue());
                return;
            case 18:
                kw0 kw0Var = (kw0) obj2;
                kw0Var.f35188s = ((Integer) obj).intValue();
                View y12 = kw0Var.d.y1(4);
                if (y12 instanceof org.telegram.ui.Cells.e9) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) y12;
                    if (e9Var.getFixedSize() <= 0 && kw0Var.f35188s > 0) {
                        e9Var.setText(kw0Var.W());
                        kw0Var.V(true);
                        return;
                    }
                }
                kw0Var.d.Y2.N(true);
                kw0Var.V(true);
                return;
            case 19:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.A0(true);
                return;
            case 20:
                org.telegram.ui.Components.o90[] o90VarArr = (org.telegram.ui.Components.o90[]) obj2;
                Boolean bool5 = (Boolean) obj;
                ViewPropertyAnimator animate = o90VarArr[0].animate();
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
                org.telegram.ui.Components.sr srVar = org.telegram.ui.Components.sr.h;
                org.telegram.messenger.ok.s(scaleY, srVar, 600L);
                ViewPropertyAnimator animate2 = o90VarArr[1].animate();
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
                scaleX2.scaleY(f15).setInterpolator(srVar).setDuration(600L).start();
                return;
            case 21:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj2;
                Long l4 = (Long) obj;
                if (!m2Var.isFinished) {
                    if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                        m2Var.presentFragment(ProfileActivity.m4(l4.longValue()), true);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(new l21(0));
                        return;
                    }
                }
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new jx0(20, (q21) obj2, (TLRPC.TL_exportedContactToken) obj));
                return;
            case 23:
                StickersActivity.b0((StickersActivity) obj2, (View) obj);
                return;
            case 24:
                ThemeActivity.U((ThemeActivity) obj2, (TL_account.contentSettings) obj);
                return;
            case 25:
                ((ci.i1) obj2).D(((Integer) obj).intValue());
                return;
            case 26:
                ((wf1) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                return;
            default:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ((mi1) obj2).E(true);
                return;
        }
    }
}
