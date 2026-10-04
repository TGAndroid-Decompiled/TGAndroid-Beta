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
    public final int f40680a;
    public final Object f40681b;

    public t3(Object obj, int i10) {
        this.f40680a = i10;
        this.f40681b = obj;
    }

    @Override
    public final void run(Object obj) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10 = this.f40680a;
        boolean z10 = false;
        Object obj2 = this.f40681b;
        switch (i10) {
            case 0:
                i4 i4Var = ((v3) obj2).K;
                if (((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                }
                i4Var.f37269o0 = z10;
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.g6(16, (dc) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.g6(22, (me) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 3:
                ((lq) obj2).f38316e.S = (String) obj;
                return;
            case 4:
                rr rrVar = ((nr) obj2).d;
                rrVar.A1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(rrVar.f40190c, rrVar.f40223r0);
                return;
            case 5:
                qs.S((qs) obj2, (TL_account.TL_birthday) obj);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                ((d20) obj2).f35622e.Y(true);
                return;
            case 7:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((u50) obj2).c();
                return;
            case 8:
                Boolean bool2 = (Boolean) obj;
                Pattern pattern = LaunchActivity.B1;
                ((aa0) obj2).run();
                return;
            case 9:
                Boolean bool3 = (Boolean) obj;
                ((lc0) obj2).X();
                return;
            case 10:
                dg0 dg0Var = (dg0) obj2;
                String str = (String) obj;
                dg0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    dg0Var.f35762b.setLoading(false);
                    return;
                }
                return;
            case 11:
                zi0 zi0Var = (zi0) obj2;
                Integer num = (Integer) obj;
                zi0Var.getClass();
                if (num.intValue() - zi0Var.f43799e.d > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                }
                zi0Var.f43795b0 = z10;
                if (z10) {
                    f7 = Math.min(zi0Var.f43797c0, (zi0Var.F.getHeight() - num.intValue()) - zi0Var.f43798d0.getMeasuredHeight());
                } else {
                    f7 = zi0Var.f43797c0;
                }
                zi0Var.f43798d0.animate().translationY(f7 - zi0Var.f43798d0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.f21444w).start();
                return;
            case 12:
                oj0 oj0Var = (oj0) obj2;
                oj0Var.f39215j0 = (String) obj;
                x5 x5Var = oj0Var.f39224t0;
                AndroidUtilities.cancelRunOnUIThread(x5Var);
                AndroidUtilities.runOnUIThread(x5Var, 100L);
                return;
            case 13:
                ak0 ak0Var = (ak0) obj2;
                ak0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ak0Var.r();
                    return;
                }
                return;
            case 14:
                qp0 qp0Var = (qp0) obj2;
                View view = (View) obj;
                wp0 wp0Var = qp0Var.f39783p0;
                if (view instanceof tp0) {
                    view.setBackgroundColor(wp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20818d6));
                    ((tp0) view).b();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r8) {
                    view.setBackgroundColor(wp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20818d6));
                    ((org.telegram.ui.Cells.r8) view).v();
                    return;
                } else if (view instanceof pp0) {
                    int i11 = org.telegram.ui.ActionBar.i6.f20818d6;
                    view.setBackgroundColor(wp0Var.getThemedColor(i11));
                    pp0 pp0Var = (pp0) view;
                    wp0 wp0Var2 = pp0Var.d.f39783p0;
                    pp0Var.setBackgroundColor(wp0Var2.getThemedColor(i11));
                    pp0Var.f39525a.setTextColor(wp0Var2.getThemedColor(org.telegram.ui.ActionBar.i6.G6));
                    return;
                } else if (view instanceof org.telegram.ui.Cells.m4) {
                    view.setBackgroundColor(wp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20818d6));
                    return;
                } else if (view instanceof ep0) {
                    ((ep0) view).d.invalidate();
                    return;
                } else if (view instanceof vp0) {
                    qp0Var.l((vp0) view);
                    return;
                } else if (view instanceof op0) {
                    ((op0) view).a();
                    return;
                } else {
                    return;
                }
            case 15:
                lp0.b((lp0) obj2, (Canvas) obj);
                return;
            case 16:
                Boolean bool4 = (Boolean) obj;
                ((op0) obj2).f39258c.e();
                return;
            case 17:
                ((ci.i1) obj2).E(((Integer) obj).intValue());
                return;
            case 18:
                nw0 nw0Var = (nw0) obj2;
                nw0Var.f39067s = ((Integer) obj).intValue();
                View A1 = nw0Var.d.A1(4);
                if (A1 instanceof org.telegram.ui.Cells.e9) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) A1;
                    if (e9Var.getFixedSize() <= 0 && nw0Var.f39067s > 0) {
                        e9Var.setText(nw0Var.U());
                        nw0Var.T(true);
                        return;
                    }
                }
                nw0Var.d.f25245f3.N(true);
                nw0Var.T(true);
                return;
            case 19:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.A0(true);
                return;
            case 20:
                org.telegram.ui.Components.q90[] q90VarArr = (org.telegram.ui.Components.q90[]) obj2;
                Boolean bool5 = (Boolean) obj;
                ViewPropertyAnimator animate = q90VarArr[0].animate();
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
                org.telegram.ui.Components.tr trVar = org.telegram.ui.Components.tr.h;
                org.telegram.messenger.ok.s(scaleY, trVar, 600L);
                ViewPropertyAnimator animate2 = q90VarArr[1].animate();
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
                scaleX2.scaleY(f15).setInterpolator(trVar).setDuration(600L).start();
                return;
            case 21:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                Long l4 = (Long) obj;
                if (!n2Var.isFinished) {
                    if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                        n2Var.presentFragment(ProfileActivity.m4(l4.longValue()), true);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(new n21(0));
                        return;
                    }
                }
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new wx0(18, (s21) obj2, (TLRPC.TL_exportedContactToken) obj));
                return;
            case 23:
                StickersActivity.b0((StickersActivity) obj2, (View) obj);
                return;
            case 24:
                ThemeActivity.S((ThemeActivity) obj2, (TL_account.contentSettings) obj);
                return;
            case 25:
                ((ci.i1) obj2).E(((Integer) obj).intValue());
                return;
            case 26:
                ((yf1) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                return;
            default:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ((mi1) obj2).E(true);
                return;
        }
    }
}
