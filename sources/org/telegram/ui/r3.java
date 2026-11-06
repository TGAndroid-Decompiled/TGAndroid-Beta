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
    public final int f49342a;
    public final Object f49343b;

    public r3(Object obj, int i7) {
        this.f49342a = i7;
        this.f49343b = obj;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        boolean z9;
        String str;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i10 = this.f49342a;
        boolean z10 = false;
        Object obj2 = this.f49343b;
        switch (i10) {
            case 0:
                g4 g4Var = ((t3) obj2).K;
                if (((Integer) obj).intValue() - org.telegram.messenger.g0.f22532n > org.telegram.messenger.g0.L(20.0f)) {
                    z10 = true;
                }
                g4Var.f45810o0 = z10;
                return;
            case 1:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.p(21, (tb) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.p(27, (zd) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 3:
                ((jp) obj2).f46997e.S = (String) obj;
                return;
            case 4:
                oq oqVar = ((kq) obj2).d;
                oqVar.f48500z1 = ((Integer) obj).intValue();
                org.telegram.messenger.g0.a4(oqVar.f48476q0, oqVar.f48447c);
                return;
            case 5:
                nr.Z((nr) obj2, (TL_account.TL_birthday) obj);
                return;
            case 6:
                nx nxVar = (nx) obj2;
                int intValue = ((Integer) obj).intValue();
                if (nxVar.f48128e) {
                    i7 = 2;
                } else if (nxVar.d) {
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
                    nxVar.d = z9;
                    if (intValue == 2) {
                        z10 = true;
                    }
                    nxVar.f48128e = z10;
                    di.b0 b0Var = nxVar.h;
                    if (b0Var != null) {
                        b0Var.a(Boolean.valueOf(nxVar.f48127c), Boolean.valueOf(nxVar.d), Boolean.valueOf(nxVar.f48128e));
                    }
                    if (nxVar.d && nxVar.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.f2 f2Var : nxVar.getParentLayout().getFragmentStack()) {
                            if (f2Var instanceof ww) {
                                sv svVar = ((ww) f2Var).F3;
                                if (svVar.c()) {
                                    svVar.a();
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
                ((e00) obj2).f45141e.g0(true);
                return;
            case 8:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((p30) obj2).c();
                return;
            case 9:
                Boolean bool2 = (Boolean) obj;
                String str2 = LaunchActivity.B1;
                ((u70) obj2).run();
                return;
            case 10:
                Boolean bool3 = (Boolean) obj;
                ((w90) obj2).d0();
                return;
            case 11:
                ld0 ld0Var = (ld0) obj2;
                String str3 = (String) obj;
                org.telegram.messenger.a8.b("LoginBilling purchased done " + str3);
                if ("CANCELLED".equalsIgnoreCase(str3)) {
                    ld0Var.f47492b.setLoading(false);
                    return;
                }
                return;
            case 12:
                final be0 be0Var = (be0) obj2;
                List list = (List) obj;
                if (be0Var.o()) {
                    if (list != null && !list.isEmpty()) {
                        Context context = be0Var.getContext();
                        a4.k a10 = org.telegram.messenger.i9.a(context, (db.c) list.get(0));
                        ce0 ce0Var = be0Var.f44286g0;
                        org.telegram.ui.Components.sx0 sx0Var = new org.telegram.ui.Components.sx0(context, ce0.k1(ce0Var));
                        if (((String) a10.f192c) != null) {
                            sx0Var.c(org.telegram.messenger.hd.M0(2131750529, null), (String) a10.f192c, null, null);
                        }
                        if (a10.f191b >= 0) {
                            sx0Var.c(org.telegram.messenger.hd.M0(2131750524, null), org.telegram.messenger.hd.a0(null, null, 2131750523, Integer.valueOf(a10.f191b + 1)), null, null);
                        }
                        if (((String) a10.f194f) != null) {
                            String M0 = org.telegram.messenger.hd.M0(2131750525, null);
                            if (((String) a10.f194f).startsWith("+")) {
                                str = pf.b.c().b((String) a10.f194f);
                            } else {
                                str = (String) a10.f194f;
                            }
                            sx0Var.c(M0, str, null, null);
                        }
                        if (((String) a10.d) != null) {
                            sx0Var.c(org.telegram.messenger.hd.M0(2131750527, null), (String) a10.d, null, null);
                        }
                        if (((String) a10.f193e) != null) {
                            sx0Var.c(org.telegram.messenger.hd.M0(2131750526, null), (String) a10.f193e, null, null);
                        }
                        FrameLayout frameLayout = new FrameLayout(context);
                        frameLayout.addView(sx0Var, c8.ha.d(-1, -2.0f, 55, 24.0f, 4.0f, 24.0f, 4.0f));
                        final boolean[] zArr = new boolean[1];
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, ce0.l1(ce0Var));
                        String M02 = org.telegram.messenger.hd.M0(2131750521, null);
                        final org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                        u1Var.R = M02;
                        u1Var.T = org.telegram.messenger.hd.M0(2131750522, null);
                        alertDialog$Builder.o(frameLayout);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131750528, null), new pu(23, be0Var, zArr));
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        u1Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                            @Override
                            public final void onDismiss(DialogInterface dialogInterface) {
                                be0 be0Var2 = be0.this;
                                if (be0Var2.f44280c0 == u1Var) {
                                    be0Var2.f44280c0 = null;
                                }
                                if (!zArr[0] && be0Var2.o()) {
                                    be0Var2.t(false);
                                }
                            }
                        });
                        be0Var.f44280c0 = u1Var;
                        u1Var.show();
                        return;
                    }
                    be0Var.t(false);
                    return;
                }
                return;
            case 13:
                bg0 bg0Var = (bg0) obj2;
                Integer num = (Integer) obj;
                bg0Var.getClass();
                if (num.intValue() - bg0Var.d.d > org.telegram.messenger.g0.L(20.0f)) {
                    z10 = true;
                }
                bg0Var.f44301a0 = z10;
                if (z10) {
                    f10 = Math.min(bg0Var.f44303b0, (bg0Var.E.getHeight() - num.intValue()) - bg0Var.f44305c0.getMeasuredHeight());
                } else {
                    f10 = bg0Var.f44303b0;
                }
                bg0Var.f44305c0.animate().translationY(f10 - bg0Var.f44305c0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.f27540w).start();
                return;
            case 14:
                qg0 qg0Var = (qg0) obj2;
                qg0Var.f49196b2 = (String) obj;
                m4 m4Var = qg0Var.f49205l2;
                org.telegram.messenger.g0.r(m4Var);
                org.telegram.messenger.g0.i3(m4Var, 100L);
                return;
            case 15:
                ah0 ah0Var = (ah0) obj2;
                ah0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ah0Var.J0();
                    return;
                }
                return;
            case 16:
                bm0 bm0Var = (bm0) obj2;
                View view = (View) obj;
                hm0 hm0Var = bm0Var.f44431p0;
                if (view instanceof em0) {
                    view.setBackgroundColor(hm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27848d6));
                    ((em0) view).updateColors();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.m8) {
                    view.setBackgroundColor(hm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27848d6));
                    ((org.telegram.ui.Cells.m8) view).updateColors();
                    return;
                } else if (view instanceof am0) {
                    view.setBackgroundColor(hm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27848d6));
                    ((am0) view).updateColors();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.n4) {
                    view.setBackgroundColor(hm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27848d6));
                    return;
                } else if (view instanceof ql0) {
                    ((ql0) view).d.invalidate();
                    return;
                } else if (view instanceof gm0) {
                    bm0Var.l((gm0) view);
                    return;
                } else if (view instanceof zl0) {
                    ((zl0) view).updateColors();
                    return;
                } else {
                    return;
                }
            case 17:
                wl0.b((wl0) obj2, (Canvas) obj);
                return;
            case 18:
                Boolean bool4 = (Boolean) obj;
                ((zl0) obj2).f52604c.e();
                return;
            case 19:
                ((fi.g1) obj2).E(((Integer) obj).intValue());
                return;
            case 20:
                gs0 gs0Var = (gs0) obj2;
                gs0Var.f46069r = ((Integer) obj).intValue();
                View B1 = gs0Var.d.B1(4);
                if (B1 instanceof org.telegram.ui.Cells.z8) {
                    org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) B1;
                    if (z8Var.getFixedSize() <= 0 && gs0Var.f46069r > 0) {
                        z8Var.setText(gs0Var.b0());
                        gs0Var.a0(true);
                        return;
                    }
                }
                gs0Var.d.f35167f3.O(true);
                gs0Var.a0(true);
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
                RectF rectF = ProfileActivity.S6;
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
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
                org.telegram.messenger.camera.q.l(scaleY, xqVar, 600L);
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
                ((v91) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                return;
            default:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ((ec1) obj2).v(true);
                return;
        }
    }
}
