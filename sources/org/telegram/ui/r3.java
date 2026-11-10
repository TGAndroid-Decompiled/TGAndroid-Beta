package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class r3 implements org.telegram.messenger.c20 {
    public final int f49219a;
    public final Object f49220b;

    public r3(Object obj, int i7) {
        this.f49219a = i7;
        this.f49220b = obj;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        boolean z9;
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.ActionBar.h6 h6Var2;
        String str;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i10 = this.f49219a;
        boolean z10 = false;
        Object obj2 = this.f49220b;
        switch (i10) {
            case 0:
                g4 g4Var = ((t3) obj2).K;
                if (((Integer) obj).intValue() - org.telegram.messenger.g0.f22562n > org.telegram.messenger.g0.L(20.0f)) {
                    z10 = true;
                }
                g4Var.f45965o0 = z10;
                return;
            case 1:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.c(22, (tb) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.c(28, (zd) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 3:
                ((lp) obj2).f47649e.S = (String) obj;
                return;
            case 4:
                rq rqVar = ((nq) obj2).d;
                rqVar.f49555z1 = ((Integer) obj).intValue();
                org.telegram.messenger.g0.a4(rqVar.f49531q0, rqVar.f49502c);
                return;
            case 5:
                qr.Z((qr) obj2, (TL_account.TL_birthday) obj);
                return;
            case 6:
                qx qxVar = (qx) obj2;
                int intValue = ((Integer) obj).intValue();
                if (qxVar.f49172e) {
                    i7 = 2;
                } else if (qxVar.d) {
                    i7 = 0;
                } else {
                    i7 = 1;
                }
                if (intValue != i7) {
                    if (intValue == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    qxVar.d = z9;
                    if (intValue == 2) {
                        z10 = true;
                    }
                    qxVar.f49172e = z10;
                    di.b0 b0Var = qxVar.h;
                    if (b0Var != null) {
                        b0Var.a(Boolean.valueOf(qxVar.f49171c), Boolean.valueOf(qxVar.d), Boolean.valueOf(qxVar.f49172e));
                    }
                    if (qxVar.d && qxVar.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.f2 f2Var : qxVar.getParentLayout().getFragmentStack()) {
                            if (f2Var instanceof zw) {
                                vv vvVar = ((zw) f2Var).G3;
                                if (vvVar.c()) {
                                    vvVar.a();
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
                ((h00) obj2).f46189e.g0(true);
                return;
            case 8:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((s30) obj2).c();
                return;
            case 9:
                Boolean bool2 = (Boolean) obj;
                String str2 = LaunchActivity.B1;
                ((x70) obj2).run();
                return;
            case 10:
                Boolean bool3 = (Boolean) obj;
                ((z90) obj2).d0();
                return;
            case 11:
                od0 od0Var = (od0) obj2;
                String str3 = (String) obj;
                org.telegram.messenger.a8.b("LoginBilling purchased done " + str3);
                if ("CANCELLED".equalsIgnoreCase(str3)) {
                    od0Var.f48502b.setLoading(false);
                    return;
                }
                return;
            case 12:
                final ee0 ee0Var = (ee0) obj2;
                List list = (List) obj;
                if (ee0Var.o()) {
                    if (list != null && !list.isEmpty()) {
                        Context context = ee0Var.getContext();
                        org.telegram.messenger.d1 a10 = org.telegram.messenger.i9.a(context, (db.c) list.get(0));
                        fe0 fe0Var = ee0Var.f45255g0;
                        h6Var = ((org.telegram.ui.ActionBar.f2) fe0Var).resourceProvider;
                        org.telegram.ui.Components.tx0 tx0Var = new org.telegram.ui.Components.tx0(context, h6Var);
                        if (a10.f21974b != null) {
                            tx0Var.c(org.telegram.messenger.id.M0(2131750528, null), a10.f21974b, null, null);
                        }
                        if (a10.f21973a >= 0) {
                            tx0Var.c(org.telegram.messenger.id.M0(2131750525, null), org.telegram.messenger.id.a0(null, null, 2131750524, Integer.valueOf(a10.f21973a + 1)), null, null);
                        }
                        if (a10.f21975c != null) {
                            String M0 = org.telegram.messenger.id.M0(2131750526, null);
                            if (a10.f21975c.startsWith("+")) {
                                str = pf.b.c().b(a10.f21975c);
                            } else {
                                str = a10.f21975c;
                            }
                            tx0Var.c(M0, str, null, null);
                        }
                        FrameLayout frameLayout = new FrameLayout(context);
                        frameLayout.addView(tx0Var, c8.ha.d(-1, -2.0f, 55, 24.0f, 4.0f, 24.0f, 4.0f));
                        final boolean[] zArr = new boolean[1];
                        h6Var2 = ((org.telegram.ui.ActionBar.f2) fe0Var).resourceProvider;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var2);
                        String M02 = org.telegram.messenger.id.M0(2131750522, null);
                        final org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                        u1Var.R = M02;
                        u1Var.T = org.telegram.messenger.id.M0(2131750523, null);
                        alertDialog$Builder.o(frameLayout);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131750527, null), new su(23, ee0Var, zArr));
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        u1Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                            @Override
                            public final void onDismiss(DialogInterface dialogInterface) {
                                ee0 ee0Var2 = ee0.this;
                                if (ee0Var2.f45249c0 == u1Var) {
                                    ee0Var2.f45249c0 = null;
                                }
                                if (!zArr[0] && ee0Var2.o()) {
                                    ee0Var2.t(false);
                                }
                            }
                        });
                        ee0Var.f45249c0 = u1Var;
                        u1Var.show();
                        return;
                    }
                    ee0Var.t(false);
                    return;
                }
                return;
            case 13:
                eg0 eg0Var = (eg0) obj2;
                Integer num = (Integer) obj;
                eg0Var.getClass();
                if (num.intValue() - eg0Var.d.d > org.telegram.messenger.g0.L(20.0f)) {
                    z10 = true;
                }
                eg0Var.f45269a0 = z10;
                if (z10) {
                    f10 = Math.min(eg0Var.f45271b0, (eg0Var.E.getHeight() - num.intValue()) - eg0Var.f45273c0.getMeasuredHeight());
                } else {
                    f10 = eg0Var.f45271b0;
                }
                eg0Var.f45273c0.animate().translationY(f10 - eg0Var.f45273c0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.f27527w).start();
                return;
            case 14:
                tg0 tg0Var = (tg0) obj2;
                tg0Var.f50269e2 = (String) obj;
                m4 m4Var = tg0Var.f50279o2;
                org.telegram.messenger.g0.r(m4Var);
                org.telegram.messenger.g0.i3(m4Var, 100L);
                return;
            case 15:
                dh0 dh0Var = (dh0) obj2;
                dh0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    dh0Var.J0();
                    return;
                }
                return;
            case 16:
                em0 em0Var = (em0) obj2;
                View view = (View) obj;
                km0 km0Var = em0Var.f45401p0;
                if (view instanceof hm0) {
                    view.setBackgroundColor(km0Var.getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6));
                    ((hm0) view).updateColors();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.m8) {
                    view.setBackgroundColor(km0Var.getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6));
                    ((org.telegram.ui.Cells.m8) view).updateColors();
                    return;
                } else if (view instanceof dm0) {
                    view.setBackgroundColor(km0Var.getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6));
                    ((dm0) view).updateColors();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.n4) {
                    view.setBackgroundColor(km0Var.getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6));
                    return;
                } else if (view instanceof tl0) {
                    ((tl0) view).d.invalidate();
                    return;
                } else if (view instanceof jm0) {
                    em0Var.l((jm0) view);
                    return;
                } else if (view instanceof cm0) {
                    ((cm0) view).updateColors();
                    return;
                } else {
                    return;
                }
            case 17:
                zl0.b((zl0) obj2, (Canvas) obj);
                return;
            case 18:
                Boolean bool4 = (Boolean) obj;
                ((cm0) obj2).f44407c.e();
                return;
            case 19:
                ((fi.g1) obj2).E(((Integer) obj).intValue());
                return;
            case 20:
                ks0 ks0Var = (ks0) obj2;
                ks0Var.f47410r = ((Integer) obj).intValue();
                View B1 = ks0Var.d.B1(4);
                if (B1 instanceof org.telegram.ui.Cells.z8) {
                    org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) B1;
                    if (z8Var.getFixedSize() <= 0 && ks0Var.f47410r > 0) {
                        z8Var.setText(ks0Var.b0());
                        ks0Var.a0(true);
                        return;
                    }
                }
                ks0Var.d.f37496f3.O(true);
                ks0Var.a0(true);
                return;
            case 21:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.F0(true);
                return;
            case 22:
                org.telegram.ui.Components.w70[] w70VarArr = (org.telegram.ui.Components.w70[]) obj2;
                Boolean bool5 = (Boolean) obj;
                RectF rectF = ProfileActivity.V6;
                ViewPropertyAnimator animate = w70VarArr[0].animate();
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
                org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.h;
                org.telegram.messenger.camera.q.l(scaleY, wqVar, 600L);
                ViewPropertyAnimator animate2 = w70VarArr[1].animate();
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
                scaleX2.scaleY(f16).setInterpolator(wqVar).setDuration(600L).start();
                return;
            case 23:
                StickersActivity.g0((StickersActivity) obj2, (View) obj);
                return;
            case 24:
                ThemeActivity.Z((ThemeActivity) obj2, (TL_account.contentSettings) obj);
                return;
            case 25:
                ((fi.g1) obj2).E(((Integer) obj).intValue());
                return;
            case 26:
                ((z91) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                return;
            default:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ((jc1) obj2).v(true);
                return;
        }
    }
}
