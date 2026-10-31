package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
public final class s3 implements org.telegram.messenger.q20 {
    public final int f41366a;
    public final Object f41367b;

    public s3(Object obj, int i10) {
        this.f41366a = i10;
        this.f41367b = obj;
    }

    @Override
    public final void a(Object obj) {
        int i10;
        boolean z10;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int i11 = this.f41366a;
        boolean z11 = false;
        Object obj2 = this.f41367b;
        switch (i11) {
            case 0:
                h4 h4Var = ((u3) obj2).K;
                if (((Integer) obj).intValue() - org.telegram.messenger.i0.f16021n > org.telegram.messenger.i0.L(20.0f)) {
                    z11 = true;
                }
                h4Var.f37740o0 = z11;
                return;
            case 1:
                org.telegram.messenger.i0.g3(new h0(15, (zb) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 2:
                org.telegram.messenger.i0.g3(new h0(21, (le) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 3:
                ((hq) obj2).e.S = (String) obj;
                return;
            case 4:
                pr prVar = ((lr) obj2).d;
                prVar.f40777z1 = ((Integer) obj).intValue();
                org.telegram.messenger.i0.Z3(prVar.f40753q0, prVar.f40724c);
                return;
            case 5:
                ns.Y((ns) obj2, (TL_account.TL_birthday) obj);
                return;
            case 6:
                qy qyVar = (qy) obj2;
                int intValue = ((Integer) obj).intValue();
                if (qyVar.e) {
                    i10 = 2;
                } else if (qyVar.d) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                if (intValue != i10) {
                    if (intValue == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    qyVar.d = z10;
                    if (intValue == 2) {
                        z11 = true;
                    }
                    qyVar.e = z11;
                    jo joVar = qyVar.h;
                    if (joVar != null) {
                        joVar.a(Boolean.valueOf(qyVar.f41088c), Boolean.valueOf(qyVar.d), Boolean.valueOf(qyVar.e));
                    }
                    if (qyVar.d && qyVar.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.k2 k2Var : qyVar.getParentLayout().getFragmentStack()) {
                            if (k2Var instanceof ay) {
                                xw xwVar = ((ay) k2Var).F3;
                                if (xwVar.c()) {
                                    xwVar.a();
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 7:
                Boolean bool = (Boolean) obj;
                ((f10) obj2).e.f0(true);
                return;
            case 8:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((o40) obj2).c();
                return;
            case 9:
                Boolean bool2 = (Boolean) obj;
                Pattern pattern = LaunchActivity.D1;
                ((u80) obj2).run();
                return;
            case 10:
                Boolean bool3 = (Boolean) obj;
                ((bb0) obj2).c0();
                return;
            case 11:
                se0 se0Var = (se0) obj2;
                String str = (String) obj;
                org.telegram.messenger.f8.b("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    se0Var.f41485b.setLoading(false);
                    return;
                }
                return;
            case 12:
                kh0 kh0Var = (kh0) obj2;
                Integer num = (Integer) obj;
                kh0Var.getClass();
                if (num.intValue() - kh0Var.d.d > org.telegram.messenger.i0.L(20.0f)) {
                    z11 = true;
                }
                kh0Var.f38829a0 = z11;
                if (z11) {
                    f7 = Math.min(kh0Var.f38831b0, (kh0Var.E.getHeight() - num.intValue()) - kh0Var.f38833c0.getMeasuredHeight());
                } else {
                    f7 = kh0Var.f38831b0;
                }
                kh0Var.f38833c0.animate().translationY(f7 - kh0Var.f38833c0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.m1.f20561w).start();
                return;
            case 13:
                wh0 wh0Var = (wh0) obj2;
                wh0Var.f43306b2 = (String) obj;
                m4 m4Var = wh0Var.f43316l2;
                org.telegram.messenger.i0.r(m4Var);
                org.telegram.messenger.i0.h3(m4Var, 100L);
                return;
            case 14:
                gi0 gi0Var = (gi0) obj2;
                gi0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    gi0Var.J0();
                    return;
                }
                return;
            case 15:
                nn0 nn0Var = (nn0) obj2;
                View view = (View) obj;
                tn0 tn0Var = nn0Var.f40001p0;
                if (view instanceof qn0) {
                    view.setBackgroundColor(tn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6));
                    ((qn0) view).updateColors();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.p8) {
                    view.setBackgroundColor(tn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6));
                    ((org.telegram.ui.Cells.p8) view).updateColors();
                    return;
                } else if (view instanceof mn0) {
                    view.setBackgroundColor(tn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6));
                    ((mn0) view).updateColors();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.p4) {
                    view.setBackgroundColor(tn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6));
                    return;
                } else if (view instanceof cn0) {
                    ((cn0) view).d.invalidate();
                    return;
                } else if (view instanceof sn0) {
                    nn0Var.l((sn0) view);
                    return;
                } else if (view instanceof ln0) {
                    ((ln0) view).updateColors();
                    return;
                } else {
                    return;
                }
            case 16:
                super/*android.widget.LinearLayout*/.draw((Canvas) obj);
                return;
            case 17:
                Boolean bool4 = (Boolean) obj;
                ((ln0) obj2).f39325c.e();
                return;
            case 18:
                ((hk) obj2).E(((Integer) obj).intValue());
                return;
            case 19:
                rt0 rt0Var = (rt0) obj2;
                rt0Var.f41292r = ((Integer) obj).intValue();
                View B1 = rt0Var.d.B1(4);
                if (B1 instanceof org.telegram.ui.Cells.b9) {
                    org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) B1;
                    if (b9Var.getFixedSize() <= 0 && rt0Var.f41292r > 0) {
                        b9Var.setText(rt0Var.a0());
                        rt0Var.Z(true);
                        return;
                    }
                }
                rt0Var.d.f30819f3.O(true);
                rt0Var.Z(true);
                return;
            case 20:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.E0(true);
                return;
            case 21:
                org.telegram.ui.Components.p80[] p80VarArr = (org.telegram.ui.Components.p80[]) obj2;
                Boolean bool5 = (Boolean) obj;
                RectF rectF = ProfileActivity.R6;
                ViewPropertyAnimator animate = p80VarArr[0].animate();
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
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
                org.telegram.messenger.z20.m(scaleY, grVar, 600L);
                ViewPropertyAnimator animate2 = p80VarArr[1].animate();
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
                scaleX2.scaleY(f15).setInterpolator(grVar).setDuration(600L).start();
                return;
            case 22:
                StickersActivity.f0((StickersActivity) obj2, (View) obj);
                return;
            case 23:
                ThemeActivity.Y((ThemeActivity) obj2, (TL_account.contentSettings) obj);
                return;
            case 24:
                ((hk) obj2).E(((Integer) obj).intValue());
                return;
            case 25:
                ((pb1) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                return;
            default:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ((be1) obj2).D(true);
                return;
        }
    }
}
