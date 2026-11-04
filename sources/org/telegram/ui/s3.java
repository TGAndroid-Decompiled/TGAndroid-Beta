package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
public final class s3 implements org.telegram.messenger.u10 {
    public final int f49339a;
    public final Object f49340b;

    public s3(Object obj, int i3) {
        this.f49339a = i3;
        this.f49340b = obj;
    }

    @Override
    public final void a(Object obj) {
        int i3;
        boolean z10;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i10 = this.f49339a;
        boolean z11 = false;
        Object obj2 = this.f49340b;
        switch (i10) {
            case 0:
                i4 i4Var = ((u3) obj2).L;
                if (((Integer) obj).intValue() - org.telegram.messenger.g0.f22603n > org.telegram.messenger.g0.L(20.0f)) {
                    z11 = true;
                }
                i4Var.f46094p0 = z11;
                return;
            case 1:
                org.telegram.messenger.g0.h3(new org.telegram.messenger.voip.l0(26, (rb) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new sc(2, (xd) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 3:
                ((hp) obj2).f45961e.T = (String) obj;
                return;
            case 4:
                nq nqVar = ((iq) obj2).d;
                nqVar.A1 = ((Integer) obj).intValue();
                org.telegram.messenger.g0.a4(nqVar.f48084r0, nqVar.f48052c);
                return;
            case 5:
                lr.Z((lr) obj2, (TL_account.TL_birthday) obj);
                return;
            case 6:
                kx kxVar = (kx) obj2;
                int intValue = ((Integer) obj).intValue();
                if (kxVar.f47046e) {
                    i3 = 2;
                } else if (kxVar.d) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                if (intValue != i3) {
                    if (intValue == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    kxVar.d = z10;
                    if (intValue == 2) {
                        z11 = true;
                    }
                    kxVar.f47046e = z11;
                    ei.d0 d0Var = kxVar.h;
                    if (d0Var != null) {
                        d0Var.a(Boolean.valueOf(kxVar.f47045c), Boolean.valueOf(kxVar.d), Boolean.valueOf(kxVar.f47046e));
                    }
                    if (kxVar.d && kxVar.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.d2 d2Var : kxVar.getParentLayout().getFragmentStack()) {
                            if (d2Var instanceof uw) {
                                pv pvVar = ((uw) d2Var).G3;
                                if (pvVar.c()) {
                                    pvVar.a();
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
                ((c00) obj2).f44184e.g0(true);
                return;
            case 8:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((k30) obj2).c();
                return;
            case 9:
                Boolean bool2 = (Boolean) obj;
                String str = LaunchActivity.E1;
                ((o70) obj2).run();
                return;
            case 10:
                Boolean bool3 = (Boolean) obj;
                ((t90) obj2).d0();
                return;
            case 11:
                id0 id0Var = (id0) obj2;
                String str2 = (String) obj;
                org.telegram.messenger.a8.b("LoginBilling purchased done " + str2);
                if ("CANCELLED".equalsIgnoreCase(str2)) {
                    id0Var.f46245b.setLoading(false);
                    return;
                }
                return;
            case 12:
                vf0 vf0Var = (vf0) obj2;
                Integer num = (Integer) obj;
                vf0Var.getClass();
                if (num.intValue() - vf0Var.d.d > org.telegram.messenger.g0.L(20.0f)) {
                    z11 = true;
                }
                vf0Var.f50475b0 = z11;
                if (z11) {
                    f10 = Math.min(vf0Var.f50477c0, (vf0Var.F.getHeight() - num.intValue()) - vf0Var.f50478d0.getMeasuredHeight());
                } else {
                    f10 = vf0Var.f50477c0;
                }
                vf0Var.f50478d0.animate().translationY(f10 - vf0Var.f50478d0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.h1.f27551w).start();
                return;
            case 13:
                kg0 kg0Var = (kg0) obj2;
                kg0Var.c2 = (String) obj;
                o4 o4Var = kg0Var.f46935m2;
                org.telegram.messenger.g0.r(o4Var);
                org.telegram.messenger.g0.i3(o4Var, 100L);
                return;
            case 14:
                vg0 vg0Var = (vg0) obj2;
                vg0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    vg0Var.J0();
                    return;
                }
                return;
            case 15:
                wl0 wl0Var = (wl0) obj2;
                View view = (View) obj;
                cm0 cm0Var = wl0Var.f51221q0;
                if (view instanceof zl0) {
                    view.setBackgroundColor(cm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6));
                    ((zl0) view).updateColors();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.l8) {
                    view.setBackgroundColor(cm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6));
                    ((org.telegram.ui.Cells.l8) view).updateColors();
                    return;
                } else if (view instanceof vl0) {
                    view.setBackgroundColor(cm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6));
                    ((vl0) view).updateColors();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.n4) {
                    view.setBackgroundColor(cm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6));
                    return;
                } else if (view instanceof ll0) {
                    ((ll0) view).d.invalidate();
                    return;
                } else if (view instanceof bm0) {
                    wl0Var.l((bm0) view);
                    return;
                } else if (view instanceof ul0) {
                    ((ul0) view).updateColors();
                    return;
                } else {
                    return;
                }
            case 16:
                super/*android.widget.LinearLayout*/.draw((Canvas) obj);
                return;
            case 17:
                Boolean bool4 = (Boolean) obj;
                ((ul0) obj2).f50119c.e();
                return;
            case 18:
                ((gi.g1) obj2).D(((Integer) obj).intValue());
                return;
            case 19:
                xr0 xr0Var = (xr0) obj2;
                xr0Var.f52088r = ((Integer) obj).intValue();
                View B1 = xr0Var.d.B1(4);
                if (B1 instanceof org.telegram.ui.Cells.y8) {
                    org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) B1;
                    if (y8Var.getFixedSize() <= 0 && xr0Var.f52088r > 0) {
                        y8Var.setText(xr0Var.b0());
                        xr0Var.a0(true);
                        return;
                    }
                }
                xr0Var.d.f35594g3.O(true);
                xr0Var.a0(true);
                return;
            case 20:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.Q;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.F0(true);
                return;
            case 21:
                org.telegram.ui.Components.s70[] s70VarArr = (org.telegram.ui.Components.s70[]) obj2;
                Boolean bool5 = (Boolean) obj;
                RectF rectF = ProfileActivity.T6;
                ViewPropertyAnimator animate = s70VarArr[0].animate();
                float f15 = 0.0f;
                float f16 = 1.0f;
                if (bool5.booleanValue()) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f11);
                if (bool5.booleanValue()) {
                    f12 = 0.8f;
                } else {
                    f12 = 1.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f12);
                if (bool5.booleanValue()) {
                    f13 = 0.8f;
                } else {
                    f13 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f13);
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
                org.telegram.messenger.camera.q.l(scaleY, xqVar, 600L);
                ViewPropertyAnimator animate2 = s70VarArr[1].animate();
                if (bool5.booleanValue()) {
                    f15 = 1.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f15);
                if (!bool5.booleanValue()) {
                    f14 = 0.8f;
                } else {
                    f14 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f14);
                if (!bool5.booleanValue()) {
                    f16 = 0.8f;
                }
                scaleX2.scaleY(f16).setInterpolator(xqVar).setDuration(600L).start();
                return;
            case 22:
                StickersActivity.g0((StickersActivity) obj2, (View) obj);
                return;
            case 23:
                ThemeActivity.Z((ThemeActivity) obj2, (TL_account.contentSettings) obj);
                return;
            case 24:
                ((gi.g1) obj2).D(((Integer) obj).intValue());
                return;
            case 25:
                ((m91) obj2).Y = (TL_stories.TL_premium_boostsStatus) obj;
                return;
            default:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ((zb1) obj2).D(true);
                return;
        }
    }
}
