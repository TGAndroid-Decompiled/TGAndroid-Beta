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
public final class r3 implements org.telegram.messenger.z10 {
    public final int f50836a;
    public final Object f50837b;

    public r3(Object obj, int i7) {
        this.f50836a = i7;
        this.f50837b = obj;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        boolean z10;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        String str;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i10 = this.f50836a;
        boolean z11 = false;
        Object obj2 = this.f50837b;
        switch (i10) {
            case 0:
                g4 g4Var = ((t3) obj2).L;
                if (((Integer) obj).intValue() - org.telegram.messenger.g0.f23606n > org.telegram.messenger.g0.L(20.0f)) {
                    z11 = true;
                }
                g4Var.f47320p0 = z11;
                return;
            case 1:
                org.telegram.messenger.g0.h3(new u5(10, (sb) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new u5(16, (xd) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 3:
                ((lp) obj2).f49015e.T = (String) obj;
                return;
            case 4:
                qq qqVar = ((mq) obj2).d;
                qqVar.A1 = ((Integer) obj).intValue();
                org.telegram.messenger.g0.Z3(qqVar.f50746r0, qqVar.f50714c);
                return;
            case 5:
                pr.Z((pr) obj2, (TL_account.TL_birthday) obj);
                return;
            case 6:
                ox oxVar = (ox) obj2;
                int intValue = ((Integer) obj).intValue();
                if (oxVar.f50053e) {
                    i7 = 2;
                } else if (oxVar.d) {
                    i7 = 0;
                } else {
                    i7 = 1;
                }
                if (intValue != i7) {
                    if (intValue == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    oxVar.d = z10;
                    if (intValue == 2) {
                        z11 = true;
                    }
                    oxVar.f50053e = z11;
                    fi.b0 b0Var = oxVar.h;
                    if (b0Var != null) {
                        b0Var.a(Boolean.valueOf(oxVar.f50052c), Boolean.valueOf(oxVar.d), Boolean.valueOf(oxVar.f50053e));
                    }
                    if (oxVar.d && oxVar.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.e2 e2Var : oxVar.getParentLayout().getFragmentStack()) {
                            if (e2Var instanceof yw) {
                                uv uvVar = ((yw) e2Var).H3;
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
                ((g00) obj2).f47254e.g0(true);
                return;
            case 8:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((p30) obj2).c();
                return;
            case 9:
                Boolean bool2 = (Boolean) obj;
                String str2 = LaunchActivity.C1;
                ((s70) obj2).run();
                return;
            case 10:
                Boolean bool3 = (Boolean) obj;
                ((x90) obj2).d0();
                return;
            case 11:
                kd0 kd0Var = (kd0) obj2;
                String str3 = (String) obj;
                org.telegram.messenger.a8.b("LoginBilling purchased done " + str3);
                if ("CANCELLED".equalsIgnoreCase(str3)) {
                    kd0Var.f48634b.setLoading(false);
                    return;
                }
                return;
            case 12:
                final be0 be0Var = (be0) obj2;
                List list = (List) obj;
                if (be0Var.o()) {
                    if (list != null && !list.isEmpty()) {
                        Context context = be0Var.getContext();
                        org.telegram.messenger.d1 a10 = org.telegram.messenger.h9.a(context, (db.c) list.get(0));
                        ce0 ce0Var = be0Var.f45693h0;
                        e6Var = ((org.telegram.ui.ActionBar.e2) ce0Var).resourceProvider;
                        org.telegram.ui.Components.vx0 vx0Var = new org.telegram.ui.Components.vx0(context, e6Var);
                        if (a10.f23018b != null) {
                            vx0Var.c(org.telegram.messenger.hd.M0(2131750528, null), a10.f23018b, null, null);
                        }
                        if (a10.f23017a >= 0) {
                            vx0Var.c(org.telegram.messenger.hd.M0(2131750525, null), org.telegram.messenger.hd.a0(null, null, 2131750524, Integer.valueOf(a10.f23017a + 1)), null, null);
                        }
                        if (a10.f23019c != null) {
                            String M0 = org.telegram.messenger.hd.M0(2131750526, null);
                            if (a10.f23019c.startsWith("+")) {
                                str = pf.b.c().b(a10.f23019c);
                            } else {
                                str = a10.f23019c;
                            }
                            vx0Var.c(M0, str, null, null);
                        }
                        FrameLayout frameLayout = new FrameLayout(context);
                        frameLayout.addView(vx0Var, c8.ja.d(-1, -2.0f, 55, 24.0f, 4.0f, 24.0f, 4.0f));
                        final boolean[] zArr = new boolean[1];
                        e6Var2 = ((org.telegram.ui.ActionBar.e2) ce0Var).resourceProvider;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var2);
                        String M02 = org.telegram.messenger.hd.M0(2131750522, null);
                        final org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                        t1Var.S = M02;
                        t1Var.U = org.telegram.messenger.hd.M0(2131750523, null);
                        alertDialog$Builder.o(frameLayout);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131750527, null), new tr(27, be0Var, zArr));
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        t1Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                            @Override
                            public final void onDismiss(DialogInterface dialogInterface) {
                                be0 be0Var2 = be0.this;
                                if (be0Var2.f45687d0 == t1Var) {
                                    be0Var2.f45687d0 = null;
                                }
                                if (!zArr[0] && be0Var2.o()) {
                                    be0Var2.t(false);
                                }
                            }
                        });
                        be0Var.f45687d0 = t1Var;
                        t1Var.show();
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
                    z11 = true;
                }
                bg0Var.f45709b0 = z11;
                if (z11) {
                    f10 = Math.min(bg0Var.f45711c0, (bg0Var.F.getHeight() - num.intValue()) - bg0Var.f45712d0.getMeasuredHeight());
                } else {
                    f10 = bg0Var.f45711c0;
                }
                bg0Var.f45712d0.animate().translationY(f10 - bg0Var.f45712d0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.f28644w).start();
                return;
            case 14:
                qg0 qg0Var = (qg0) obj2;
                qg0Var.f50602f2 = (String) obj;
                m4 m4Var = qg0Var.f50612p2;
                org.telegram.messenger.g0.r(m4Var);
                org.telegram.messenger.g0.i3(m4Var, 100L);
                return;
            case 15:
                bh0 bh0Var = (bh0) obj2;
                bh0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    bh0Var.J0();
                    return;
                }
                return;
            case 16:
                dm0 dm0Var = (dm0) obj2;
                View view = (View) obj;
                jm0 jm0Var = dm0Var.f46419q0;
                if (view instanceof gm0) {
                    view.setBackgroundColor(jm0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6));
                    ((gm0) view).updateColors();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.l8) {
                    view.setBackgroundColor(jm0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6));
                    ((org.telegram.ui.Cells.l8) view).updateColors();
                    return;
                } else if (view instanceof cm0) {
                    view.setBackgroundColor(jm0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6));
                    ((cm0) view).updateColors();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.n4) {
                    view.setBackgroundColor(jm0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6));
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
                ((bm0) obj2).f45781c.e();
                return;
            case 19:
                ((hi.i1) obj2).C(((Integer) obj).intValue());
                return;
            case 20:
                es0 es0Var = (es0) obj2;
                es0Var.f46898r = ((Integer) obj).intValue();
                View B1 = es0Var.d.B1(4);
                if (B1 instanceof org.telegram.ui.Cells.y8) {
                    org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) B1;
                    if (y8Var.getFixedSize() <= 0 && es0Var.f46898r > 0) {
                        y8Var.setText(es0Var.b0());
                        es0Var.a0(true);
                        return;
                    }
                }
                es0Var.d.f39892g3.O(true);
                es0Var.a0(true);
                return;
            case 21:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.Q;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.F0(true);
                return;
            case 22:
                org.telegram.ui.Components.z70[] z70VarArr = (org.telegram.ui.Components.z70[]) obj2;
                Boolean bool5 = (Boolean) obj;
                RectF rectF = ProfileActivity.X6;
                ViewPropertyAnimator animate = z70VarArr[0].animate();
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
                org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
                org.telegram.messenger.i20.n(scaleY, erVar, 600L);
                ViewPropertyAnimator animate2 = z70VarArr[1].animate();
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
                scaleX2.scaleY(f16).setInterpolator(erVar).setDuration(600L).start();
                return;
            case 23:
                StickersActivity.g0((StickersActivity) obj2, (View) obj);
                return;
            case 24:
                ThemeActivity.Z((ThemeActivity) obj2, (TL_account.contentSettings) obj);
                return;
            case 25:
                ((hi.i1) obj2).C(((Integer) obj).intValue());
                return;
            case 26:
                ((u91) obj2).Y = (TL_stories.TL_premium_boostsStatus) obj;
                return;
            default:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ((ec1) obj2).v(true);
                return;
        }
    }
}
