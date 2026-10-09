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
    public final int f41832a;
    public final Object f41833b;

    public t3(Object obj, int i10) {
        this.f41832a = i10;
        this.f41833b = obj;
    }

    @Override
    public final void run(Object obj) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10 = this.f41832a;
        boolean z10 = false;
        Object obj2 = this.f41833b;
        switch (i10) {
            case 0:
                i4 i4Var = ((v3) obj2).K;
                if (((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                }
                i4Var.f38509o0 = z10;
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(19, (cc) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(25, (ke) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 3:
                ((mq) obj2).f39964e.S = (String) obj;
                return;
            case 4:
                tr trVar = ((pr) obj2).d;
                trVar.A1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(trVar.f42058c, trVar.f42091r0);
                return;
            case 5:
                qs.U((qs) obj2, (TL_account.TL_birthday) obj);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                ((c20) obj2).f36501e.Z(true);
                return;
            case 7:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((t50) obj2).c();
                return;
            case 8:
                Boolean bool2 = (Boolean) obj;
                Pattern pattern = LaunchActivity.B1;
                ((aa0) obj2).run();
                return;
            case 9:
                Boolean bool3 = (Boolean) obj;
                ((mc0) obj2).Y();
                return;
            case 10:
                fg0 fg0Var = (fg0) obj2;
                String str = (String) obj;
                fg0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    fg0Var.f37550b.setLoading(false);
                    return;
                }
                return;
            case 11:
                dj0 dj0Var = (dj0) obj2;
                Integer num = (Integer) obj;
                dj0Var.getClass();
                if (num.intValue() - dj0Var.f36997e.d > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                }
                dj0Var.f36993b0 = z10;
                if (z10) {
                    f7 = Math.min(dj0Var.f36995c0, (dj0Var.F.getHeight() - num.intValue()) - dj0Var.f36996d0.getMeasuredHeight());
                } else {
                    f7 = dj0Var.f36995c0;
                }
                dj0Var.f36996d0.animate().translationY(f7 - dj0Var.f36996d0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.f21455w).start();
                return;
            case 12:
                sj0 sj0Var = (sj0) obj2;
                sj0Var.f41718j0 = (String) obj;
                w5 w5Var = sj0Var.f41727t0;
                AndroidUtilities.cancelRunOnUIThread(w5Var);
                AndroidUtilities.runOnUIThread(w5Var, 100L);
                return;
            case 13:
                dk0 dk0Var = (dk0) obj2;
                dk0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    dk0Var.t();
                    return;
                }
                return;
            case 14:
                up0 up0Var = (up0) obj2;
                View view = (View) obj;
                aq0 aq0Var = up0Var.f42532p0;
                if (view instanceof xp0) {
                    view.setBackgroundColor(aq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6));
                    ((xp0) view).b();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r8) {
                    view.setBackgroundColor(aq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6));
                    ((org.telegram.ui.Cells.r8) view).v();
                    return;
                } else if (view instanceof tp0) {
                    int i11 = org.telegram.ui.ActionBar.i6.f20797d6;
                    view.setBackgroundColor(aq0Var.getThemedColor(i11));
                    tp0 tp0Var = (tp0) view;
                    aq0 aq0Var2 = tp0Var.d.f42532p0;
                    tp0Var.setBackgroundColor(aq0Var2.getThemedColor(i11));
                    tp0Var.f42040a.setTextColor(aq0Var2.getThemedColor(org.telegram.ui.ActionBar.i6.G6));
                    return;
                } else if (view instanceof org.telegram.ui.Cells.m4) {
                    view.setBackgroundColor(aq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6));
                    return;
                } else if (view instanceof ip0) {
                    ((ip0) view).d.invalidate();
                    return;
                } else if (view instanceof zp0) {
                    up0Var.l((zp0) view);
                    return;
                } else if (view instanceof sp0) {
                    ((sp0) view).a();
                    return;
                } else {
                    return;
                }
            case 15:
                super/*android.widget.LinearLayout*/.draw((Canvas) obj);
                return;
            case 16:
                Boolean bool4 = (Boolean) obj;
                ((sp0) obj2).f41746c.e();
                return;
            case 17:
                ((ci.h1) obj2).D(((Integer) obj).intValue());
                return;
            case 18:
                tw0 tw0Var = (tw0) obj2;
                tw0Var.f42142s = ((Integer) obj).intValue();
                View z12 = tw0Var.d.z1(4);
                if (z12 instanceof org.telegram.ui.Cells.e9) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) z12;
                    if (e9Var.getFixedSize() <= 0 && tw0Var.f42142s > 0) {
                        e9Var.setText(tw0Var.W());
                        tw0Var.V(true);
                        return;
                    }
                }
                tw0Var.d.W2.N(true);
                tw0Var.V(true);
                return;
            case 19:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.A0(true);
                return;
            case 20:
                org.telegram.ui.Components.ea0[] ea0VarArr = (org.telegram.ui.Components.ea0[]) obj2;
                Boolean bool5 = (Boolean) obj;
                ViewPropertyAnimator animate = ea0VarArr[0].animate();
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
                org.telegram.ui.Components.hs hsVar = org.telegram.ui.Components.hs.h;
                org.telegram.messenger.bi.t(scaleY, hsVar, 600L);
                ViewPropertyAnimator animate2 = ea0VarArr[1].animate();
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
                scaleX2.scaleY(f15).setInterpolator(hsVar).setDuration(600L).start();
                return;
            case 21:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                Long l4 = (Long) obj;
                if (!n2Var.isFinished) {
                    if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                        n2Var.presentFragment(ProfileActivity.m4(l4.longValue()), true);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(new t21(0));
                        return;
                    }
                }
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new rt0(29, (y21) obj2, (TLRPC.TL_exportedContactToken) obj));
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
                ((fg1) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                return;
            default:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ((wi1) obj2).D(true);
                return;
        }
    }
}
