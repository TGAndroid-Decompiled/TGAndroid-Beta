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
    public final int f49254a;
    public final Object f49255b;

    public r3(Object obj, int i7) {
        this.f49254a = i7;
        this.f49255b = obj;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        boolean z9;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        String str;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i10 = this.f49254a;
        boolean z10 = false;
        Object obj2 = this.f49255b;
        switch (i10) {
            case 0:
                g4 g4Var = ((t3) obj2).K;
                if (((Integer) obj).intValue() - org.telegram.messenger.g0.f22558n > org.telegram.messenger.g0.L(20.0f)) {
                    z10 = true;
                }
                g4Var.f45896o0 = z10;
                return;
            case 1:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.p(21, (tb) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.p(27, (zd) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 3:
                ((lp) obj2).f47662e.S = (String) obj;
                return;
            case 4:
                qq qqVar = ((mq) obj2).d;
                qqVar.f49174z1 = ((Integer) obj).intValue();
                org.telegram.messenger.g0.a4(qqVar.f49150q0, qqVar.f49121c);
                return;
            case 5:
                pr.Z((pr) obj2, (TL_account.TL_birthday) obj);
                return;
            case 6:
                px pxVar = (px) obj2;
                int intValue = ((Integer) obj).intValue();
                if (pxVar.f48827e) {
                    i7 = 2;
                } else if (pxVar.d) {
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
                    pxVar.d = z9;
                    if (intValue == 2) {
                        z10 = true;
                    }
                    pxVar.f48827e = z10;
                    di.b0 b0Var = pxVar.h;
                    if (b0Var != null) {
                        b0Var.a(Boolean.valueOf(pxVar.f48826c), Boolean.valueOf(pxVar.d), Boolean.valueOf(pxVar.f48827e));
                    }
                    if (pxVar.d && pxVar.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.f2 f2Var : pxVar.getParentLayout().getFragmentStack()) {
                            if (f2Var instanceof yw) {
                                uv uvVar = ((yw) f2Var).G3;
                                if (uvVar.c()) {
                                    uvVar.a();
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
                ((g00) obj2).f45835e.g0(true);
                return;
            case 8:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((r30) obj2).c();
                return;
            case 9:
                Boolean bool2 = (Boolean) obj;
                String str2 = LaunchActivity.B1;
                ((w70) obj2).run();
                return;
            case 10:
                Boolean bool3 = (Boolean) obj;
                ((y90) obj2).d0();
                return;
            case 11:
                nd0 nd0Var = (nd0) obj2;
                String str3 = (String) obj;
                org.telegram.messenger.a8.b("LoginBilling purchased done " + str3);
                if ("CANCELLED".equalsIgnoreCase(str3)) {
                    nd0Var.f48166b.setLoading(false);
                    return;
                }
                return;
            case 12:
                final de0 de0Var = (de0) obj2;
                List list = (List) obj;
                if (de0Var.o()) {
                    if (list != null && !list.isEmpty()) {
                        Context context = de0Var.getContext();
                        org.telegram.messenger.d1 a10 = org.telegram.messenger.i9.a(context, (db.c) list.get(0));
                        ee0 ee0Var = de0Var.f44935g0;
                        g6Var = ((org.telegram.ui.ActionBar.f2) ee0Var).resourceProvider;
                        org.telegram.ui.Components.ux0 ux0Var = new org.telegram.ui.Components.ux0(context, g6Var);
                        if (a10.f21970b != null) {
                            ux0Var.c(org.telegram.messenger.id.M0(2131750528, null), a10.f21970b, null, null);
                        }
                        if (a10.f21969a >= 0) {
                            ux0Var.c(org.telegram.messenger.id.M0(2131750525, null), org.telegram.messenger.id.a0(null, null, 2131750524, Integer.valueOf(a10.f21969a + 1)), null, null);
                        }
                        if (a10.f21971c != null) {
                            String M0 = org.telegram.messenger.id.M0(2131750526, null);
                            if (a10.f21971c.startsWith("+")) {
                                str = pf.b.c().b(a10.f21971c);
                            } else {
                                str = a10.f21971c;
                            }
                            ux0Var.c(M0, str, null, null);
                        }
                        FrameLayout frameLayout = new FrameLayout(context);
                        frameLayout.addView(ux0Var, c8.ha.d(-1, -2.0f, 55, 24.0f, 4.0f, 24.0f, 4.0f));
                        final boolean[] zArr = new boolean[1];
                        g6Var2 = ((org.telegram.ui.ActionBar.f2) ee0Var).resourceProvider;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, g6Var2);
                        String M02 = org.telegram.messenger.id.M0(2131750522, null);
                        final org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                        u1Var.R = M02;
                        u1Var.T = org.telegram.messenger.id.M0(2131750523, null);
                        alertDialog$Builder.o(frameLayout);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131750527, null), new ru(23, de0Var, zArr));
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        u1Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                            @Override
                            public final void onDismiss(DialogInterface dialogInterface) {
                                de0 de0Var2 = de0.this;
                                if (de0Var2.f44929c0 == u1Var) {
                                    de0Var2.f44929c0 = null;
                                }
                                if (!zArr[0] && de0Var2.o()) {
                                    de0Var2.t(false);
                                }
                            }
                        });
                        de0Var.f44929c0 = u1Var;
                        u1Var.show();
                        return;
                    }
                    de0Var.t(false);
                    return;
                }
                return;
            case 13:
                dg0 dg0Var = (dg0) obj2;
                Integer num = (Integer) obj;
                dg0Var.getClass();
                if (num.intValue() - dg0Var.d.d > org.telegram.messenger.g0.L(20.0f)) {
                    z10 = true;
                }
                dg0Var.f44948a0 = z10;
                if (z10) {
                    f10 = Math.min(dg0Var.f44950b0, (dg0Var.E.getHeight() - num.intValue()) - dg0Var.f44952c0.getMeasuredHeight());
                } else {
                    f10 = dg0Var.f44950b0;
                }
                dg0Var.f44952c0.animate().translationY(f10 - dg0Var.f44952c0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.f27519w).start();
                return;
            case 14:
                sg0 sg0Var = (sg0) obj2;
                sg0Var.f49903b2 = (String) obj;
                m4 m4Var = sg0Var.f49912l2;
                org.telegram.messenger.g0.r(m4Var);
                org.telegram.messenger.g0.i3(m4Var, 100L);
                return;
            case 15:
                ch0 ch0Var = (ch0) obj2;
                ch0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ch0Var.J0();
                    return;
                }
                return;
            case 16:
                dm0 dm0Var = (dm0) obj2;
                View view = (View) obj;
                jm0 jm0Var = dm0Var.f45078p0;
                if (view instanceof gm0) {
                    view.setBackgroundColor(jm0Var.getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6));
                    ((gm0) view).updateColors();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.m8) {
                    view.setBackgroundColor(jm0Var.getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6));
                    ((org.telegram.ui.Cells.m8) view).updateColors();
                    return;
                } else if (view instanceof cm0) {
                    view.setBackgroundColor(jm0Var.getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6));
                    ((cm0) view).updateColors();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.n4) {
                    view.setBackgroundColor(jm0Var.getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6));
                    return;
                } else if (view instanceof sl0) {
                    ((sl0) view).d.invalidate();
                    return;
                } else if (view instanceof im0) {
                    dm0Var.l((im0) view);
                    return;
                } else if (view instanceof bm0) {
                    ((bm0) view).updateColors();
                    return;
                } else {
                    return;
                }
            case 17:
                yl0.b((yl0) obj2, (Canvas) obj);
                return;
            case 18:
                Boolean bool4 = (Boolean) obj;
                ((bm0) obj2).f44072c.e();
                return;
            case 19:
                ((fi.g1) obj2).E(((Integer) obj).intValue());
                return;
            case 20:
                js0 js0Var = (js0) obj2;
                js0Var.f47076r = ((Integer) obj).intValue();
                View B1 = js0Var.d.B1(4);
                if (B1 instanceof org.telegram.ui.Cells.z8) {
                    org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) B1;
                    if (z8Var.getFixedSize() <= 0 && js0Var.f47076r > 0) {
                        z8Var.setText(js0Var.b0());
                        js0Var.a0(true);
                        return;
                    }
                }
                js0Var.d.f37556f3.O(true);
                js0Var.a0(true);
                return;
            case 21:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.F0(true);
                return;
            case 22:
                org.telegram.ui.Components.x70[] x70VarArr = (org.telegram.ui.Components.x70[]) obj2;
                Boolean bool5 = (Boolean) obj;
                RectF rectF = ProfileActivity.V6;
                ViewPropertyAnimator animate = x70VarArr[0].animate();
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
                ViewPropertyAnimator animate2 = x70VarArr[1].animate();
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
                ((y91) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                return;
            default:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ((ic1) obj2).v(true);
                return;
        }
    }
}
