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
public final class r3 implements org.telegram.messenger.y10 {
    public final int f51437a;
    public final Object f51438b;

    public r3(Object obj, int i7) {
        this.f51437a = i7;
        this.f51438b = obj;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        boolean z10;
        TLRPC.User user;
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.ActionBar.h6 h6Var2;
        String str;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i10 = this.f51437a;
        boolean z11 = false;
        Object obj2 = this.f51438b;
        switch (i10) {
            case 0:
                g4 g4Var = ((t3) obj2).L;
                if (((Integer) obj).intValue() - org.telegram.messenger.g0.f24041n > org.telegram.messenger.g0.L(20.0f)) {
                    z11 = true;
                }
                g4Var.f47967p0 = z11;
                return;
            case 1:
                org.telegram.messenger.g0.g3(new u8(8, (sb) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new u8(14, (xd) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 3:
                ((mp) obj2).f49956e.T = (String) obj;
                return;
            case 4:
                rq rqVar = ((nq) obj2).d;
                rqVar.A1 = ((Integer) obj).intValue();
                org.telegram.messenger.g0.Y3(rqVar.f51733r0, rqVar.f51701c);
                return;
            case 5:
                qr.Z((qr) obj2, (TL_account.TL_birthday) obj);
                return;
            case 6:
                rx rxVar = (rx) obj2;
                int intValue = ((Integer) obj).intValue();
                if (rxVar.f51782e) {
                    i7 = 2;
                } else if (rxVar.d) {
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
                    rxVar.d = z10;
                    if (intValue == 2) {
                        z11 = true;
                    }
                    rxVar.f51782e = z11;
                    fi.b0 b0Var = rxVar.h;
                    if (b0Var != null) {
                        b0Var.a(Boolean.valueOf(rxVar.f51781c), Boolean.valueOf(rxVar.d), Boolean.valueOf(rxVar.f51782e));
                    }
                    if (rxVar.d && rxVar.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.g2 g2Var : rxVar.getParentLayout().getFragmentStack()) {
                            if (g2Var instanceof cx) {
                                xv xvVar = ((cx) g2Var).H3;
                                if (xvVar.c()) {
                                    xvVar.a();
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
                ((j00) obj2).f48857e.g0(true);
                return;
            case 8:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((s30) obj2).c();
                return;
            case 9:
                Boolean bool2 = (Boolean) obj;
                String str2 = LaunchActivity.C1;
                ((v70) obj2).run();
                return;
            case 10:
                s90 s90Var = (s90) obj2;
                Long l10 = (Long) obj;
                int i11 = s90Var.f51979b;
                s90Var.c();
                if (l10 != null && l10.longValue() > 0) {
                    user = org.telegram.messenger.np.u1(i11).c2(l10);
                } else {
                    user = null;
                }
                if (user != null && user.bot) {
                    ki.h0.a(LaunchActivity.T(), i11, user);
                    return;
                } else {
                    org.telegram.messenger.f3.o(null, 2131747941, s90.d(), null);
                    return;
                }
            case 11:
                Boolean bool3 = (Boolean) obj;
                ((z90) obj2).d0();
                return;
            case 12:
                ld0 ld0Var = (ld0) obj2;
                String str3 = (String) obj;
                org.telegram.messenger.a8.b("LoginBilling purchased done " + str3);
                if ("CANCELLED".equalsIgnoreCase(str3)) {
                    ld0Var.f49594b.setLoading(false);
                    return;
                }
                return;
            case 13:
                final ce0 ce0Var = (ce0) obj2;
                List list = (List) obj;
                if (ce0Var.o()) {
                    if (list != null && !list.isEmpty()) {
                        Context context = ce0Var.getContext();
                        org.telegram.messenger.d1 a10 = org.telegram.messenger.h9.a(context, (db.c) list.get(0));
                        de0 de0Var = ce0Var.f46542h0;
                        h6Var = ((org.telegram.ui.ActionBar.g2) de0Var).resourceProvider;
                        org.telegram.ui.Components.ey0 ey0Var = new org.telegram.ui.Components.ey0(context, h6Var);
                        if (a10.f23471b != null) {
                            ey0Var.e(org.telegram.messenger.hd.N0(2131750511, null), a10.f23471b, null, null);
                        }
                        if (a10.f23470a >= 0) {
                            ey0Var.e(org.telegram.messenger.hd.N0(2131750508, null), org.telegram.messenger.hd.a0(null, null, 2131750507, Integer.valueOf(a10.f23470a + 1)), null, null);
                        }
                        if (a10.f23472c != null) {
                            String N0 = org.telegram.messenger.hd.N0(2131750509, null);
                            if (a10.f23472c.startsWith("+")) {
                                str = pf.b.c().b(a10.f23472c);
                            } else {
                                str = a10.f23472c;
                            }
                            ey0Var.e(N0, str, null, null);
                        }
                        FrameLayout frameLayout = new FrameLayout(context);
                        frameLayout.addView(ey0Var, c8.ma.d(-1, -2.0f, 55, 24.0f, 4.0f, 24.0f, 4.0f));
                        final boolean[] zArr = new boolean[1];
                        h6Var2 = ((org.telegram.ui.ActionBar.g2) de0Var).resourceProvider;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var2);
                        String N02 = org.telegram.messenger.hd.N0(2131750505, null);
                        final org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                        t1Var.S = N02;
                        t1Var.U = org.telegram.messenger.hd.N0(2131750506, null);
                        alertDialog$Builder.o(frameLayout);
                        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131750510, null), new at(26, ce0Var, zArr));
                        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                        t1Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                            @Override
                            public final void onDismiss(DialogInterface dialogInterface) {
                                ce0 ce0Var2 = ce0.this;
                                if (ce0Var2.f46536d0 == t1Var) {
                                    ce0Var2.f46536d0 = null;
                                }
                                if (!zArr[0] && ce0Var2.o()) {
                                    ce0Var2.t(false);
                                }
                            }
                        });
                        ce0Var.f46536d0 = t1Var;
                        t1Var.show();
                        return;
                    }
                    ce0Var.t(false);
                    return;
                }
                return;
            case 14:
                eg0 eg0Var = (eg0) obj2;
                Integer num = (Integer) obj;
                eg0Var.getClass();
                if (num.intValue() - eg0Var.d.d > org.telegram.messenger.g0.L(20.0f)) {
                    z11 = true;
                }
                eg0Var.f47266b0 = z11;
                if (z11) {
                    f10 = Math.min(eg0Var.f47268c0, (eg0Var.F.getHeight() - num.intValue()) - eg0Var.f47269d0.getMeasuredHeight());
                } else {
                    f10 = eg0Var.f47268c0;
                }
                eg0Var.f47269d0.animate().translationY(f10 - eg0Var.f47269d0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.f29005w).start();
                return;
            case 15:
                vg0 vg0Var = (vg0) obj2;
                vg0Var.f52821f2 = (String) obj;
                m4 m4Var = vg0Var.f52831p2;
                org.telegram.messenger.g0.r(m4Var);
                org.telegram.messenger.g0.h3(m4Var, 100L);
                return;
            case 16:
                fh0 fh0Var = (fh0) obj2;
                fh0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    fh0Var.K0();
                    return;
                }
                return;
            case 17:
                fm0 fm0Var = (fm0) obj2;
                View view = (View) obj;
                lm0 lm0Var = fm0Var.f47786q0;
                if (view instanceof im0) {
                    view.setBackgroundColor(lm0Var.getThemedColor(org.telegram.ui.ActionBar.m6.f29381d6));
                    ((im0) view).updateColors();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.n8) {
                    view.setBackgroundColor(lm0Var.getThemedColor(org.telegram.ui.ActionBar.m6.f29381d6));
                    ((org.telegram.ui.Cells.n8) view).updateColors();
                    return;
                } else if (view instanceof em0) {
                    view.setBackgroundColor(lm0Var.getThemedColor(org.telegram.ui.ActionBar.m6.f29381d6));
                    ((em0) view).updateColors();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.o4) {
                    view.setBackgroundColor(lm0Var.getThemedColor(org.telegram.ui.ActionBar.m6.f29381d6));
                    return;
                } else if (view instanceof ul0) {
                    ((ul0) view).d.invalidate();
                    return;
                } else if (view instanceof km0) {
                    fm0Var.l((km0) view);
                    return;
                } else if (view instanceof dm0) {
                    ((dm0) view).updateColors();
                    return;
                } else {
                    return;
                }
            case 18:
                super/*android.widget.LinearLayout*/.draw((Canvas) obj);
                return;
            case 19:
                Boolean bool4 = (Boolean) obj;
                ((dm0) obj2).f47012c.e();
                return;
            case 20:
                ((hi.i1) obj2).A(((Integer) obj).intValue());
                return;
            case 21:
                is0 is0Var = (is0) obj2;
                is0Var.f48822r = ((Integer) obj).intValue();
                View B1 = is0Var.d.B1(4);
                if (B1 instanceof org.telegram.ui.Cells.a9) {
                    org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) B1;
                    if (a9Var.getFixedSize() <= 0 && is0Var.f48822r > 0) {
                        a9Var.setText(is0Var.b0());
                        is0Var.a0(true);
                        return;
                    }
                }
                is0Var.d.f35790g3.O(true);
                is0Var.a0(true);
                return;
            case 22:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.Q;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.F0(true);
                return;
            case 23:
                org.telegram.ui.Components.m80[] m80VarArr = (org.telegram.ui.Components.m80[]) obj2;
                Boolean bool5 = (Boolean) obj;
                RectF rectF = ProfileActivity.Z6;
                ViewPropertyAnimator animate = m80VarArr[0].animate();
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
                org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
                org.telegram.messenger.o10.o(scaleY, nrVar, 600L);
                ViewPropertyAnimator animate2 = m80VarArr[1].animate();
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
                scaleX2.scaleY(f16).setInterpolator(nrVar).setDuration(600L).start();
                return;
            case 24:
                StickersActivity.g0((StickersActivity) obj2, (View) obj);
                return;
            case 25:
                ThemeActivity.Z((ThemeActivity) obj2, (TL_account.contentSettings) obj);
                return;
            case 26:
                ((hi.i1) obj2).A(((Integer) obj).intValue());
                return;
            case 27:
                ((y91) obj2).Y = (TL_stories.TL_premium_boostsStatus) obj;
                return;
            default:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ((hc1) obj2).v(true);
                return;
        }
    }
}
