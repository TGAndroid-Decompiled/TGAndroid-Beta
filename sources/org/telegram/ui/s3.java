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
public final class s3 implements org.telegram.messenger.r20 {
    public final int f41209a;
    public final Object f41210b;

    public s3(Object obj, int i10) {
        this.f41209a = i10;
        this.f41210b = obj;
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
        int i11 = this.f41209a;
        boolean z11 = false;
        Object obj2 = this.f41210b;
        switch (i11) {
            case 0:
                h4 h4Var = ((u3) obj2).K;
                if (((Integer) obj).intValue() - org.telegram.messenger.i0.f16167n > org.telegram.messenger.i0.L(20.0f)) {
                    z11 = true;
                }
                h4Var.f37685o0 = z11;
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
                prVar.f40584z1 = ((Integer) obj).intValue();
                org.telegram.messenger.i0.Z3(prVar.f40560q0, prVar.f40531c);
                return;
            case 5:
                ns.Z((ns) obj2, (TL_account.TL_birthday) obj);
                return;
            case 6:
                py pyVar = (py) obj2;
                int intValue = ((Integer) obj).intValue();
                if (pyVar.e) {
                    i10 = 2;
                } else if (pyVar.d) {
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
                    pyVar.d = z10;
                    if (intValue == 2) {
                        z11 = true;
                    }
                    pyVar.e = z11;
                    jo joVar = pyVar.h;
                    if (joVar != null) {
                        joVar.a(Boolean.valueOf(pyVar.f40635c), Boolean.valueOf(pyVar.d), Boolean.valueOf(pyVar.e));
                    }
                    if (pyVar.d && pyVar.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.k2 k2Var : pyVar.getParentLayout().getFragmentStack()) {
                            if (k2Var instanceof zx) {
                                ww wwVar = ((zx) k2Var).F3;
                                if (wwVar.c()) {
                                    wwVar.a();
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
                ((e10) obj2).e.g0(true);
                return;
            case 8:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((n40) obj2).c();
                return;
            case 9:
                Boolean bool2 = (Boolean) obj;
                Pattern pattern = LaunchActivity.D1;
                ((t80) obj2).run();
                return;
            case 10:
                Boolean bool3 = (Boolean) obj;
                ((ab0) obj2).d0();
                return;
            case 11:
                re0 re0Var = (re0) obj2;
                String str = (String) obj;
                org.telegram.messenger.f8.b("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    re0Var.f41068b.setLoading(false);
                    return;
                }
                return;
            case 12:
                ih0 ih0Var = (ih0) obj2;
                Integer num = (Integer) obj;
                ih0Var.getClass();
                if (num.intValue() - ih0Var.d.d > org.telegram.messenger.i0.L(20.0f)) {
                    z11 = true;
                }
                ih0Var.f38059a0 = z11;
                if (z11) {
                    f7 = Math.min(ih0Var.f38061b0, (ih0Var.E.getHeight() - num.intValue()) - ih0Var.f38063c0.getMeasuredHeight());
                } else {
                    f7 = ih0Var.f38061b0;
                }
                ih0Var.f38063c0.animate().translationY(f7 - ih0Var.f38063c0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.m1.f20562w).start();
                return;
            case 13:
                uh0 uh0Var = (uh0) obj2;
                uh0Var.f41944b2 = (String) obj;
                m4 m4Var = uh0Var.f41954l2;
                org.telegram.messenger.i0.r(m4Var);
                org.telegram.messenger.i0.h3(m4Var, 100L);
                return;
            case 14:
                ei0 ei0Var = (ei0) obj2;
                ei0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ei0Var.J0();
                    return;
                }
                return;
            case 15:
                ln0 ln0Var = (ln0) obj2;
                View view = (View) obj;
                rn0 rn0Var = ln0Var.f39334p0;
                if (view instanceof on0) {
                    view.setBackgroundColor(rn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6));
                    ((on0) view).updateColors();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.p8) {
                    view.setBackgroundColor(rn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6));
                    ((org.telegram.ui.Cells.p8) view).updateColors();
                    return;
                } else if (view instanceof kn0) {
                    view.setBackgroundColor(rn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6));
                    ((kn0) view).updateColors();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.p4) {
                    view.setBackgroundColor(rn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6));
                    return;
                } else if (view instanceof an0) {
                    ((an0) view).d.invalidate();
                    return;
                } else if (view instanceof qn0) {
                    ln0Var.l((qn0) view);
                    return;
                } else if (view instanceof jn0) {
                    ((jn0) view).updateColors();
                    return;
                } else {
                    return;
                }
            case 16:
                super/*android.widget.LinearLayout*/.draw((Canvas) obj);
                return;
            case 17:
                Boolean bool4 = (Boolean) obj;
                ((jn0) obj2).f38478c.e();
                return;
            case 18:
                ((hk) obj2).E(((Integer) obj).intValue());
                return;
            case 19:
                qt0 qt0Var = (qt0) obj2;
                qt0Var.f40904r = ((Integer) obj).intValue();
                View B1 = qt0Var.d.B1(4);
                if (B1 instanceof org.telegram.ui.Cells.b9) {
                    org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) B1;
                    if (b9Var.getFixedSize() <= 0 && qt0Var.f40904r > 0) {
                        b9Var.setText(qt0Var.b0());
                        qt0Var.a0(true);
                        return;
                    }
                }
                qt0Var.d.f31183f3.O(true);
                qt0Var.a0(true);
                return;
            case 20:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.F0(true);
                return;
            case 21:
                org.telegram.ui.Components.p80[] p80VarArr = (org.telegram.ui.Components.p80[]) obj2;
                Boolean bool5 = (Boolean) obj;
                RectF rectF = ProfileActivity.S6;
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
                org.telegram.messenger.a30.m(scaleY, grVar, 600L);
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
                StickersActivity.g0((StickersActivity) obj2, (View) obj);
                return;
            case 23:
                ThemeActivity.Z((ThemeActivity) obj2, (TL_account.contentSettings) obj);
                return;
            case 24:
                ((hk) obj2).E(((Integer) obj).intValue());
                return;
            case 25:
                ((nb1) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                return;
            default:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ((zd1) obj2).D(true);
                return;
        }
    }
}
