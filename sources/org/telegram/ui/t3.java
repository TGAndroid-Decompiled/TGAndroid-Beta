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
    public final int f37510a;
    public final Object f37511b;

    public t3(Object obj, int i10) {
        this.f37510a = i10;
        this.f37511b = obj;
    }

    @Override
    public final void run(Object obj) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10 = this.f37510a;
        boolean z10 = false;
        Object obj2 = this.f37511b;
        switch (i10) {
            case 0:
                i4 i4Var = ((v3) obj2).K;
                if (((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                }
                i4Var.f34015o0 = z10;
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new m4(12, (bc) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new m4(18, (je) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 3:
                ((kq) obj2).e.S = (String) obj;
                return;
            case 4:
                qr qrVar = ((mr) obj2).d;
                qrVar.A1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(qrVar.f36551c, qrVar.f36583r0);
                return;
            case 5:
                ns.U((ns) obj2, (TL_account.TL_birthday) obj);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                ((b20) obj2).e.Z(true);
                return;
            case 7:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((s50) obj2).c();
                return;
            case 8:
                Boolean bool2 = (Boolean) obj;
                Pattern pattern = LaunchActivity.B1;
                ((x90) obj2).run();
                return;
            case 9:
                Boolean bool3 = (Boolean) obj;
                ((ic0) obj2).Y();
                return;
            case 10:
                ag0 ag0Var = (ag0) obj2;
                String str = (String) obj;
                ag0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    ag0Var.f31786b.setLoading(false);
                    return;
                }
                return;
            case 11:
                wi0 wi0Var = (wi0) obj2;
                Integer num = (Integer) obj;
                wi0Var.getClass();
                if (num.intValue() - wi0Var.e.d > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                }
                wi0Var.f38999b0 = z10;
                if (z10) {
                    f7 = Math.min(wi0Var.f39001c0, (wi0Var.F.getHeight() - num.intValue()) - wi0Var.f39002d0.getMeasuredHeight());
                } else {
                    f7 = wi0Var.f39001c0;
                }
                wi0Var.f39002d0.animate().translationY(f7 - wi0Var.f39002d0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.f19441w).start();
                return;
            case 12:
                lj0 lj0Var = (lj0) obj2;
                lj0Var.f35010j0 = (String) obj;
                x5 x5Var = lj0Var.f35019t0;
                AndroidUtilities.cancelRunOnUIThread(x5Var);
                AndroidUtilities.runOnUIThread(x5Var, 100L);
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
                op0 op0Var = (op0) obj2;
                View view = (View) obj;
                up0 up0Var = op0Var.f35938p0;
                if (view instanceof rp0) {
                    view.setBackgroundColor(up0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
                    ((rp0) view).b();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.s8) {
                    view.setBackgroundColor(up0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
                    ((org.telegram.ui.Cells.s8) view).v();
                    return;
                } else if (view instanceof np0) {
                    int i11 = org.telegram.ui.ActionBar.h6.f18789d6;
                    view.setBackgroundColor(up0Var.getThemedColor(i11));
                    np0 np0Var = (np0) view;
                    up0 up0Var2 = np0Var.d.f35938p0;
                    np0Var.setBackgroundColor(up0Var2.getThemedColor(i11));
                    np0Var.f35574a.setTextColor(up0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                    return;
                } else if (view instanceof org.telegram.ui.Cells.m4) {
                    view.setBackgroundColor(up0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
                    return;
                } else if (view instanceof cp0) {
                    ((cp0) view).d.invalidate();
                    return;
                } else if (view instanceof tp0) {
                    op0Var.l((tp0) view);
                    return;
                } else if (view instanceof mp0) {
                    ((mp0) view).a();
                    return;
                } else {
                    return;
                }
            case 15:
                jp0.b((jp0) obj2, (Canvas) obj);
                return;
            case 16:
                Boolean bool4 = (Boolean) obj;
                ((mp0) obj2).f35372c.e();
                return;
            case 17:
                ((ci.i1) obj2).D(((Integer) obj).intValue());
                return;
            case 18:
                mw0 mw0Var = (mw0) obj2;
                mw0Var.f35402s = ((Integer) obj).intValue();
                View y12 = mw0Var.d.y1(4);
                if (y12 instanceof org.telegram.ui.Cells.f9) {
                    org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) y12;
                    if (f9Var.getFixedSize() <= 0 && mw0Var.f35402s > 0) {
                        f9Var.setText(mw0Var.W());
                        mw0Var.V(true);
                        return;
                    }
                }
                mw0Var.d.Y2.N(true);
                mw0Var.V(true);
                return;
            case 19:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.A0(true);
                return;
            case 20:
                org.telegram.ui.Components.d90[] d90VarArr = (org.telegram.ui.Components.d90[]) obj2;
                Boolean bool5 = (Boolean) obj;
                ViewPropertyAnimator animate = d90VarArr[0].animate();
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
                org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.h;
                org.telegram.messenger.ul.r(scaleY, rrVar, 600L);
                ViewPropertyAnimator animate2 = d90VarArr[1].animate();
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
                scaleX2.scaleY(f15).setInterpolator(rrVar).setDuration(600L).start();
                return;
            case 21:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                Long l4 = (Long) obj;
                if (!n2Var.isFinished) {
                    if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                        n2Var.presentFragment(ProfileActivity.m4(l4.longValue()), true);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.th(28));
                        return;
                    }
                }
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new by0(15, (r21) obj2, (TLRPC.TL_exportedContactToken) obj));
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
