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
    public final int f42082a;
    public final Object f42083b;

    public v3(Object obj, int i10) {
        this.f42082a = i10;
        this.f42083b = obj;
    }

    @Override
    public final void run(Object obj) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10 = this.f42082a;
        boolean z10 = false;
        Object obj2 = this.f42083b;
        switch (i10) {
            case 0:
                l4 l4Var = ((x3) obj2).K;
                if (((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                }
                l4Var.f38719o0 = z10;
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new i0(14, (ec) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new i0(20, (ke) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 3:
                ((cq) obj2).e.S = (String) obj;
                return;
            case 4:
                jr jrVar = ((fr) obj2).d;
                jrVar.A1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(jrVar.f38264c, jrVar.f38296r0);
                return;
            case 5:
                hs.U((hs) obj2, (TL_account.TL_birthday) obj);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                ((n10) obj2).e.Z(true);
                return;
            case 7:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((f50) obj2).c();
                return;
            case 8:
                Boolean bool2 = (Boolean) obj;
                Pattern pattern = LaunchActivity.C1;
                ((l90) obj2).run();
                return;
            case 9:
                Boolean bool3 = (Boolean) obj;
                ((sb0) obj2).Y();
                return;
            case 10:
                nf0 nf0Var = (nf0) obj2;
                String str = (String) obj;
                nf0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    nf0Var.f39425b.setLoading(false);
                    return;
                }
                return;
            case 11:
                ni0 ni0Var = (ni0) obj2;
                Integer num = (Integer) obj;
                ni0Var.getClass();
                if (num.intValue() - ni0Var.e.d > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                }
                ni0Var.f39451b0 = z10;
                if (z10) {
                    f7 = Math.min(ni0Var.f39453c0, (ni0Var.F.getHeight() - num.intValue()) - ni0Var.f39454d0.getMeasuredHeight());
                } else {
                    f7 = ni0Var.f39453c0;
                }
                ni0Var.f39454d0.animate().translationY(f7 - ni0Var.f39454d0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.o1.f21628w).start();
                return;
            case 12:
                cj0 cj0Var = (cj0) obj2;
                cj0Var.f35925j0 = (String) obj;
                a6 a6Var = cj0Var.f35934t0;
                AndroidUtilities.cancelRunOnUIThread(a6Var);
                AndroidUtilities.runOnUIThread(a6Var, 100L);
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
                ep0 ep0Var = (ep0) obj2;
                View view = (View) obj;
                kp0 kp0Var = ep0Var.f36583p0;
                if (view instanceof hp0) {
                    view.setBackgroundColor(kp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6));
                    ((hp0) view).b();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.q8) {
                    view.setBackgroundColor(kp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6));
                    ((org.telegram.ui.Cells.q8) view).v();
                    return;
                } else if (view instanceof dp0) {
                    int i11 = org.telegram.ui.ActionBar.h6.f20986d6;
                    view.setBackgroundColor(kp0Var.getThemedColor(i11));
                    dp0 dp0Var = (dp0) view;
                    kp0 kp0Var2 = dp0Var.d.f36583p0;
                    dp0Var.setBackgroundColor(kp0Var2.getThemedColor(i11));
                    dp0Var.f36226a.setTextColor(kp0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                    return;
                } else if (view instanceof org.telegram.ui.Cells.l4) {
                    view.setBackgroundColor(kp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6));
                    return;
                } else if (view instanceof so0) {
                    ((so0) view).d.invalidate();
                    return;
                } else if (view instanceof jp0) {
                    ep0Var.l((jp0) view);
                    return;
                } else if (view instanceof cp0) {
                    ((cp0) view).a();
                    return;
                } else {
                    return;
                }
            case 15:
                zo0.b((zo0) obj2, (Canvas) obj);
                return;
            case 16:
                Boolean bool4 = (Boolean) obj;
                ((cp0) obj2).f35958c.e();
                return;
            case 17:
                ((ei.h1) obj2).D(((Integer) obj).intValue());
                return;
            case 18:
                zv0 zv0Var = (zv0) obj2;
                zv0Var.f43800s = ((Integer) obj).intValue();
                View z12 = zv0Var.d.z1(4);
                if (z12 instanceof org.telegram.ui.Cells.d9) {
                    org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) z12;
                    if (d9Var.getFixedSize() <= 0 && zv0Var.f43800s > 0) {
                        d9Var.setText(zv0Var.W());
                        zv0Var.V(true);
                        return;
                    }
                }
                zv0Var.d.W2.N(true);
                zv0Var.V(true);
                return;
            case 19:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.A0(true);
                return;
            case 20:
                org.telegram.ui.Components.x90[] x90VarArr = (org.telegram.ui.Components.x90[]) obj2;
                Boolean bool5 = (Boolean) obj;
                ViewPropertyAnimator animate = x90VarArr[0].animate();
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
                org.telegram.messenger.lk.t(scaleY, bsVar, 600L);
                ViewPropertyAnimator animate2 = x90VarArr[1].animate();
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
                ((te1) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                return;
            default:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ((jh1) obj2).D(true);
                return;
        }
    }
}
