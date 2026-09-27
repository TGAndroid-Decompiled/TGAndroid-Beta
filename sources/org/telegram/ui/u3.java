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
    public final int f38110a;
    public final Object f38111b;

    public u3(Object obj, int i10) {
        this.f38110a = i10;
        this.f38111b = obj;
    }

    @Override
    public final void run(Object obj) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10 = this.f38110a;
        boolean z10 = false;
        Object obj2 = this.f38111b;
        switch (i10) {
            case 0:
                j4 j4Var = ((w3) obj2).K;
                if (((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                }
                j4Var.f34621o0 = z10;
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new n(15, (dc) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new n(21, (me) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 3:
                ((kq) obj2).e.S = (String) obj;
                return;
            case 4:
                qr qrVar = ((mr) obj2).d;
                qrVar.A1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(qrVar.f36823c, qrVar.f36855r0);
                return;
            case 5:
                ps.U((ps) obj2, (TL_account.TL_birthday) obj);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                ((c20) obj2).e.Z(true);
                return;
            case 7:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((t50) obj2).c();
                return;
            case 8:
                Boolean bool2 = (Boolean) obj;
                Pattern pattern = LaunchActivity.B1;
                ((y90) obj2).run();
                return;
            case 9:
                Boolean bool3 = (Boolean) obj;
                ((kc0) obj2).Y();
                return;
            case 10:
                cg0 cg0Var = (cg0) obj2;
                String str = (String) obj;
                cg0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    cg0Var.f32710b.setLoading(false);
                    return;
                }
                return;
            case 11:
                yi0 yi0Var = (yi0) obj2;
                Integer num = (Integer) obj;
                yi0Var.getClass();
                if (num.intValue() - yi0Var.e.d > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                }
                yi0Var.f40224b0 = z10;
                if (z10) {
                    f7 = Math.min(yi0Var.f40226c0, (yi0Var.F.getHeight() - num.intValue()) - yi0Var.f40227d0.getMeasuredHeight());
                } else {
                    f7 = yi0Var.f40226c0;
                }
                yi0Var.f40227d0.animate().translationY(f7 - yi0Var.f40227d0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.f19718w).start();
                return;
            case 12:
                nj0 nj0Var = (nj0) obj2;
                nj0Var.f36032j0 = (String) obj;
                y5 y5Var = nj0Var.f36041t0;
                AndroidUtilities.cancelRunOnUIThread(y5Var);
                AndroidUtilities.runOnUIThread(y5Var, 100L);
                return;
            case 13:
                yj0 yj0Var = (yj0) obj2;
                yj0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    yj0Var.r();
                    return;
                }
                return;
            case 14:
                qp0 qp0Var = (qp0) obj2;
                View view = (View) obj;
                wp0 wp0Var = qp0Var.f36807p0;
                if (view instanceof tp0) {
                    view.setBackgroundColor(wp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19057d6));
                    ((tp0) view).b();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r8) {
                    view.setBackgroundColor(wp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19057d6));
                    ((org.telegram.ui.Cells.r8) view).v();
                    return;
                } else if (view instanceof pp0) {
                    int i11 = org.telegram.ui.ActionBar.i6.f19057d6;
                    view.setBackgroundColor(wp0Var.getThemedColor(i11));
                    pp0 pp0Var = (pp0) view;
                    wp0 wp0Var2 = pp0Var.d.f36807p0;
                    pp0Var.setBackgroundColor(wp0Var2.getThemedColor(i11));
                    pp0Var.f36514a.setTextColor(wp0Var2.getThemedColor(org.telegram.ui.ActionBar.i6.G6));
                    return;
                } else if (view instanceof org.telegram.ui.Cells.m4) {
                    view.setBackgroundColor(wp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19057d6));
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
                ((op0) obj2).f36238c.e();
                return;
            case 17:
                ((ci.i1) obj2).E(((Integer) obj).intValue());
                return;
            case 18:
                nw0 nw0Var = (nw0) obj2;
                nw0Var.f36102s = ((Integer) obj).intValue();
                View z12 = nw0Var.d.z1(4);
                if (z12 instanceof org.telegram.ui.Cells.e9) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) z12;
                    if (e9Var.getFixedSize() <= 0 && nw0Var.f36102s > 0) {
                        e9Var.setText(nw0Var.W());
                        nw0Var.V(true);
                        return;
                    }
                }
                nw0Var.d.Y2.N(true);
                nw0Var.V(true);
                return;
            case 19:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.A0(true);
                return;
            case 20:
                org.telegram.ui.Components.p90[] p90VarArr = (org.telegram.ui.Components.p90[]) obj2;
                Boolean bool5 = (Boolean) obj;
                ViewPropertyAnimator animate = p90VarArr[0].animate();
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
                org.telegram.messenger.qk.s(scaleY, srVar, 600L);
                ViewPropertyAnimator animate2 = p90VarArr[1].animate();
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
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj2;
                Long l4 = (Long) obj;
                if (!o2Var.isFinished) {
                    if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                        o2Var.presentFragment(ProfileActivity.m4(l4.longValue()), true);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(new n21(0));
                        return;
                    }
                }
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new by0(16, (s21) obj2, (TLRPC.TL_exportedContactToken) obj));
                return;
            case 23:
                StickersActivity.b0((StickersActivity) obj2, (View) obj);
                return;
            case 24:
                ThemeActivity.U((ThemeActivity) obj2, (TL_account.contentSettings) obj);
                return;
            case 25:
                ((ci.i1) obj2).E(((Integer) obj).intValue());
                return;
            case 26:
                ((wf1) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                return;
            default:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ((ki1) obj2).E(true);
                return;
        }
    }
}
