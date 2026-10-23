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
    public final int f42107a;
    public final Object f42108b;

    public v3(Object obj, int i10) {
        this.f42107a = i10;
        this.f42108b = obj;
    }

    @Override
    public final void run(Object obj) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10 = this.f42107a;
        boolean z10 = false;
        Object obj2 = this.f42108b;
        switch (i10) {
            case 0:
                l4 l4Var = ((x3) obj2).K;
                if (((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                }
                l4Var.f38777o0 = z10;
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new i0(14, (cc) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new i0(20, (ie) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 3:
                ((aq) obj2).e.S = (String) obj;
                return;
            case 4:
                hr hrVar = ((dr) obj2).d;
                hrVar.A1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(hrVar.f37726c, hrVar.f37758r0);
                return;
            case 5:
                fs.U((fs) obj2, (TL_account.TL_birthday) obj);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                ((l10) obj2).e.Z(true);
                return;
            case 7:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((d50) obj2).c();
                return;
            case 8:
                Boolean bool2 = (Boolean) obj;
                Pattern pattern = LaunchActivity.C1;
                ((j90) obj2).run();
                return;
            case 9:
                Boolean bool3 = (Boolean) obj;
                ((qb0) obj2).Y();
                return;
            case 10:
                mf0 mf0Var = (mf0) obj2;
                String str = (String) obj;
                mf0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    mf0Var.f39236b.setLoading(false);
                    return;
                }
                return;
            case 11:
                mi0 mi0Var = (mi0) obj2;
                Integer num = (Integer) obj;
                mi0Var.getClass();
                if (num.intValue() - mi0Var.d.d > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                }
                mi0Var.f39260a0 = z10;
                if (z10) {
                    f7 = Math.min(mi0Var.f39262b0, (mi0Var.E.getHeight() - num.intValue()) - mi0Var.f39264c0.getMeasuredHeight());
                } else {
                    f7 = mi0Var.f39262b0;
                }
                mi0Var.f39264c0.animate().translationY(f7 - mi0Var.f39264c0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.o1.f21636w).start();
                return;
            case 12:
                bj0 bj0Var = (bj0) obj2;
                bj0Var.f35660j0 = (String) obj;
                a6 a6Var = bj0Var.f35669t0;
                AndroidUtilities.cancelRunOnUIThread(a6Var);
                AndroidUtilities.runOnUIThread(a6Var, 100L);
                return;
            case 13:
                mj0 mj0Var = (mj0) obj2;
                mj0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    mj0Var.t();
                    return;
                }
                return;
            case 14:
                cp0 cp0Var = (cp0) obj2;
                View view = (View) obj;
                ip0 ip0Var = cp0Var.f36042p0;
                if (view instanceof fp0) {
                    view.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20994d6));
                    ((fp0) view).b();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.q8) {
                    view.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20994d6));
                    ((org.telegram.ui.Cells.q8) view).v();
                    return;
                } else if (view instanceof bp0) {
                    int i11 = org.telegram.ui.ActionBar.h6.f20994d6;
                    view.setBackgroundColor(ip0Var.getThemedColor(i11));
                    bp0 bp0Var = (bp0) view;
                    ip0 ip0Var2 = bp0Var.d.f36042p0;
                    bp0Var.setBackgroundColor(ip0Var2.getThemedColor(i11));
                    bp0Var.f35685a.setTextColor(ip0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                    return;
                } else if (view instanceof org.telegram.ui.Cells.l4) {
                    view.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20994d6));
                    return;
                } else if (view instanceof qo0) {
                    ((qo0) view).d.invalidate();
                    return;
                } else if (view instanceof hp0) {
                    cp0Var.l((hp0) view);
                    return;
                } else if (view instanceof ap0) {
                    ((ap0) view).a();
                    return;
                } else {
                    return;
                }
            case 15:
                xo0.b((xo0) obj2, (Canvas) obj);
                return;
            case 16:
                Boolean bool4 = (Boolean) obj;
                ((ap0) obj2).f35408c.e();
                return;
            case 17:
                ((ei.h1) obj2).D(((Integer) obj).intValue());
                return;
            case 18:
                xv0 xv0Var = (xv0) obj2;
                xv0Var.f43289s = ((Integer) obj).intValue();
                View z12 = xv0Var.d.z1(4);
                if (z12 instanceof org.telegram.ui.Cells.d9) {
                    org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) z12;
                    if (d9Var.getFixedSize() <= 0 && xv0Var.f43289s > 0) {
                        d9Var.setText(xv0Var.W());
                        xv0Var.V(true);
                        return;
                    }
                }
                xv0Var.d.W2.N(true);
                xv0Var.V(true);
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
                org.telegram.messenger.nk.t(scaleY, bsVar, 600L);
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
                ((re1) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                return;
            default:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ((hh1) obj2).D(true);
                return;
        }
    }
}
