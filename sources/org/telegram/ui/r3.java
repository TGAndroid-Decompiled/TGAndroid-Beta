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
public final class r3 implements org.telegram.messenger.w10 {
    public final int f51597a;
    public final Object f51598b;

    public r3(Object obj, int i7) {
        this.f51597a = i7;
        this.f51598b = obj;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        boolean z10;
        TLRPC.User user;
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.ActionBar.i6 i6Var2;
        String str;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i10 = this.f51597a;
        boolean z11 = false;
        Object obj2 = this.f51598b;
        switch (i10) {
            case 0:
                g4 g4Var = ((t3) obj2).L;
                if (((Integer) obj).intValue() - org.telegram.messenger.g0.f24221n > org.telegram.messenger.g0.L(20.0f)) {
                    z11 = true;
                }
                g4Var.f48078p0 = z11;
                return;
            case 1:
                org.telegram.messenger.g0.g3(new u5(10, (sb) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new u5(16, (xd) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 3:
                ((mp) obj2).f50093e.T = (String) obj;
                return;
            case 4:
                rq rqVar = ((nq) obj2).d;
                rqVar.A1 = ((Integer) obj).intValue();
                org.telegram.messenger.g0.Y3(rqVar.f51848r0, rqVar.f51816c);
                return;
            case 5:
                qr.Z((qr) obj2, (TL_account.TL_birthday) obj);
                return;
            case 6:
                qx qxVar = (qx) obj2;
                int intValue = ((Integer) obj).intValue();
                if (qxVar.f51553e) {
                    i7 = 2;
                } else if (qxVar.d) {
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
                    qxVar.d = z10;
                    if (intValue == 2) {
                        z11 = true;
                    }
                    qxVar.f51553e = z11;
                    fi.b0 b0Var = qxVar.h;
                    if (b0Var != null) {
                        b0Var.a(Boolean.valueOf(qxVar.f51552c), Boolean.valueOf(qxVar.d), Boolean.valueOf(qxVar.f51553e));
                    }
                    if (qxVar.d && qxVar.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.g2 g2Var : qxVar.getParentLayout().getFragmentStack()) {
                            if (g2Var instanceof bx) {
                                wv wvVar = ((bx) g2Var).H3;
                                if (wvVar.c()) {
                                    wvVar.a();
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
                ((i00) obj2).f48676e.g0(true);
                return;
            case 8:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((r30) obj2).c();
                return;
            case 9:
                Boolean bool2 = (Boolean) obj;
                String str2 = LaunchActivity.C1;
                ((u70) obj2).run();
                return;
            case 10:
                r90 r90Var = (r90) obj2;
                Long l10 = (Long) obj;
                int i11 = r90Var.f51668b;
                r90Var.c();
                if (l10 != null && l10.longValue() > 0) {
                    user = org.telegram.messenger.mp.u1(i11).c2(l10);
                } else {
                    user = null;
                }
                if (user != null && user.bot) {
                    ki.h0.a(LaunchActivity.T(), i11, user);
                    return;
                } else {
                    org.telegram.messenger.f3.o(null, 2131747941, r90.d(), null);
                    return;
                }
            case 11:
                Boolean bool3 = (Boolean) obj;
                ((y90) obj2).d0();
                return;
            case 12:
                ld0 ld0Var = (ld0) obj2;
                String str3 = (String) obj;
                org.telegram.messenger.a8.b("LoginBilling purchased done " + str3);
                if ("CANCELLED".equalsIgnoreCase(str3)) {
                    ld0Var.f49728b.setLoading(false);
                    return;
                }
                return;
            case 13:
                final ce0 ce0Var = (ce0) obj2;
                List list = (List) obj;
                if (ce0Var.o()) {
                    if (list != null && !list.isEmpty()) {
                        Context context = ce0Var.getContext();
                        org.telegram.messenger.d1 a10 = org.telegram.messenger.g9.a(context, (db.c) list.get(0));
                        de0 de0Var = ce0Var.f46781h0;
                        i6Var = ((org.telegram.ui.ActionBar.g2) de0Var).resourceProvider;
                        org.telegram.ui.Components.dy0 dy0Var = new org.telegram.ui.Components.dy0(context, i6Var);
                        if (a10.f23579b != null) {
                            dy0Var.e(org.telegram.messenger.gd.N0(2131750511, null), a10.f23579b, null, null);
                        }
                        if (a10.f23578a >= 0) {
                            dy0Var.e(org.telegram.messenger.gd.N0(2131750508, null), org.telegram.messenger.gd.a0(null, null, 2131750507, Integer.valueOf(a10.f23578a + 1)), null, null);
                        }
                        if (a10.f23580c != null) {
                            String N0 = org.telegram.messenger.gd.N0(2131750509, null);
                            if (a10.f23580c.startsWith("+")) {
                                str = pf.b.c().b(a10.f23580c);
                            } else {
                                str = a10.f23580c;
                            }
                            dy0Var.e(N0, str, null, null);
                        }
                        FrameLayout frameLayout = new FrameLayout(context);
                        frameLayout.addView(dy0Var, c8.na.d(-1, -2.0f, 55, 24.0f, 4.0f, 24.0f, 4.0f));
                        final boolean[] zArr = new boolean[1];
                        i6Var2 = ((org.telegram.ui.ActionBar.g2) de0Var).resourceProvider;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var2);
                        String N02 = org.telegram.messenger.gd.N0(2131750505, null);
                        final org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                        t1Var.S = N02;
                        t1Var.U = org.telegram.messenger.gd.N0(2131750506, null);
                        alertDialog$Builder.o(frameLayout);
                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131750510, null), new zs(26, ce0Var, zArr));
                        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                        t1Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                            @Override
                            public final void onDismiss(DialogInterface dialogInterface) {
                                ce0 ce0Var2 = ce0.this;
                                if (ce0Var2.f46775d0 == t1Var) {
                                    ce0Var2.f46775d0 = null;
                                }
                                if (!zArr[0] && ce0Var2.o()) {
                                    ce0Var2.t(false);
                                }
                            }
                        });
                        ce0Var.f46775d0 = t1Var;
                        t1Var.show();
                        return;
                    }
                    ce0Var.t(false);
                    return;
                }
                return;
            case 14:
                dg0 dg0Var = (dg0) obj2;
                Integer num = (Integer) obj;
                dg0Var.getClass();
                if (num.intValue() - dg0Var.d.d > org.telegram.messenger.g0.L(20.0f)) {
                    z11 = true;
                }
                dg0Var.f47094b0 = z11;
                if (z11) {
                    f10 = Math.min(dg0Var.f47096c0, (dg0Var.F.getHeight() - num.intValue()) - dg0Var.f47097d0.getMeasuredHeight());
                } else {
                    f10 = dg0Var.f47096c0;
                }
                dg0Var.f47097d0.animate().translationY(f10 - dg0Var.f47097d0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.f29066w).start();
                return;
            case 15:
                tg0 tg0Var = (tg0) obj2;
                tg0Var.f52395f2 = (String) obj;
                m4 m4Var = tg0Var.f52405p2;
                org.telegram.messenger.g0.r(m4Var);
                org.telegram.messenger.g0.h3(m4Var, 100L);
                return;
            case 16:
                dh0 dh0Var = (dh0) obj2;
                dh0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    dh0Var.K0();
                    return;
                }
                return;
            case 17:
                dm0 dm0Var = (dm0) obj2;
                View view = (View) obj;
                jm0 jm0Var = dm0Var.f47185q0;
                if (view instanceof gm0) {
                    view.setBackgroundColor(jm0Var.getThemedColor(org.telegram.ui.ActionBar.n6.f29451d6));
                    ((gm0) view).updateColors();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.m8) {
                    view.setBackgroundColor(jm0Var.getThemedColor(org.telegram.ui.ActionBar.n6.f29451d6));
                    ((org.telegram.ui.Cells.m8) view).updateColors();
                    return;
                } else if (view instanceof cm0) {
                    view.setBackgroundColor(jm0Var.getThemedColor(org.telegram.ui.ActionBar.n6.f29451d6));
                    ((cm0) view).updateColors();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.o4) {
                    view.setBackgroundColor(jm0Var.getThemedColor(org.telegram.ui.ActionBar.n6.f29451d6));
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
            case 18:
                yl0.b((yl0) obj2, (Canvas) obj);
                return;
            case 19:
                Boolean bool4 = (Boolean) obj;
                ((bm0) obj2).f46107c.e();
                return;
            case 20:
                ((hi.q1) obj2).C(((Integer) obj).intValue());
                return;
            case 21:
                hs0 hs0Var = (hs0) obj2;
                hs0Var.f48625r = ((Integer) obj).intValue();
                View B1 = hs0Var.d.B1(4);
                if (B1 instanceof org.telegram.ui.Cells.z8) {
                    org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) B1;
                    if (z8Var.getFixedSize() <= 0 && hs0Var.f48625r > 0) {
                        z8Var.setText(hs0Var.b0());
                        hs0Var.a0(true);
                        return;
                    }
                }
                hs0Var.d.f35323g3.O(true);
                hs0Var.a0(true);
                return;
            case 22:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.Q;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.F0(true);
                return;
            case 23:
                org.telegram.ui.Components.j80[] j80VarArr = (org.telegram.ui.Components.j80[]) obj2;
                Boolean bool5 = (Boolean) obj;
                RectF rectF = ProfileActivity.Z6;
                ViewPropertyAnimator animate = j80VarArr[0].animate();
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
                org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.h;
                org.telegram.messenger.m10.o(scaleY, krVar, 600L);
                ViewPropertyAnimator animate2 = j80VarArr[1].animate();
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
                scaleX2.scaleY(f16).setInterpolator(krVar).setDuration(600L).start();
                return;
            case 24:
                StickersActivity.g0((StickersActivity) obj2, (View) obj);
                return;
            case 25:
                ThemeActivity.Z((ThemeActivity) obj2, (TL_account.contentSettings) obj);
                return;
            case 26:
                ((hi.q1) obj2).C(((Integer) obj).intValue());
                return;
            case 27:
                ((w91) obj2).Y = (TL_stories.TL_premium_boostsStatus) obj;
                return;
            default:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ((fc1) obj2).v(true);
                return;
        }
    }
}
