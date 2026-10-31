package org.telegram.ui;

import android.content.Intent;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;
public final class tj0 implements org.telegram.messenger.o20, org.telegram.ui.Cells.z5, org.telegram.ui.Components.j61, org.telegram.ui.ActionBar.u1, org.telegram.ui.ActionBar.j1, r0.m, org.telegram.messenger.k20, org.telegram.ui.Cells.d5, org.telegram.messenger.pc, RequestTimeDelegate, org.telegram.ui.ActionBar.j2, org.telegram.ui.Components.ik0, bg.g, zf.l1 {
    public final int f41851a;
    public final Object f41852b;

    public tj0(Object obj, int i10) {
        this.f41851a = i10;
        this.f41852b = obj;
    }

    @Override
    public a0.h M() {
        return null;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        int i10;
        int i11;
        View fragmentView;
        switch (this.f41851a) {
            case 8:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f41852b;
                i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
                premiumPreviewFragment.f33707o0 = I0;
                premiumPreviewFragment.f33689a.setPadding(0, I0.f7766b, 0, org.telegram.messenger.i0.L(48.0f) + premiumPreviewFragment.f33707o0.d);
                org.telegram.ui.Components.tk0 tk0Var = premiumPreviewFragment.f33689a;
                i0.c cVar = premiumPreviewFragment.f33707o0;
                org.telegram.messenger.i0.A3(tk0Var, cVar.f7765a, 0, cVar.f7767c, 0);
                du0 du0Var = premiumPreviewFragment.U;
                i0.c cVar2 = premiumPreviewFragment.f33707o0;
                du0Var.setPadding(cVar2.f7765a, 0, cVar2.f7767c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i12 = premiumPreviewFragment.f33707o0.f7765a;
                    int L = org.telegram.messenger.i0.L(14.0f);
                    i0.c cVar3 = premiumPreviewFragment.f33707o0;
                    frameLayout.setPadding(i12, L, cVar3.f7767c, cVar3.d);
                }
                return r0.j1.f46131b;
            default:
                pf0 pf0Var = (pf0) ((jd1) this.f41852b);
                i0.c I02 = org.telegram.messenger.i0.I0(j1Var, false);
                int i13 = I02.f7765a;
                pf0Var.M = i13;
                int i14 = I02.f7767c;
                pf0Var.N = i14;
                pf0Var.L = I02.d;
                boolean a2 = pf0Var.D.a();
                if (a2) {
                    i10 = org.telegram.messenger.i0.L(44.0f);
                } else {
                    i10 = 0;
                }
                pf0Var.D.setPadding(0, 0, 0, pf0Var.L);
                int L2 = org.telegram.messenger.i0.L(72.0f) + pf0Var.L + i10;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) pf0Var.H.getLayoutParams();
                if (marginLayoutParams.height != L2) {
                    marginLayoutParams.height = L2;
                    pf0Var.H.setLayoutParams(marginLayoutParams);
                }
                if (a2) {
                    i11 = pf0Var.L + i10;
                } else {
                    i11 = 0;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) pf0Var.f38499c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i11 || marginLayoutParams2.leftMargin != i13 || marginLayoutParams2.rightMargin != i14) {
                    marginLayoutParams2.leftMargin = i13;
                    marginLayoutParams2.rightMargin = i14;
                    marginLayoutParams2.bottomMargin = i11;
                    pf0Var.f38499c.setLayoutParams(marginLayoutParams2);
                }
                pf0Var.E.setPadding(i13, 0, i14, pf0Var.L);
                if (a2) {
                    j1Var = j1Var.f46132a.m(0, 0, 0, pf0Var.L);
                }
                pf0Var.n0();
                pf0Var.m0();
                SparseArray sparseArray = pf0Var.f38497a;
                int size = sparseArray.size();
                for (int i15 = 0; i15 < size; i15++) {
                    hd1 hd1Var = (hd1) sparseArray.valueAt(i15);
                    if (hd1Var != null && (fragmentView = hd1Var.f37897a.getFragmentView()) != null) {
                        r0.h0.b(fragmentView, j1Var);
                    }
                }
                return r0.j1.f46131b;
        }
    }

    @Override
    public boolean Y(int i10) {
        return true;
    }

    @Override
    public void a() {
        switch (this.f41851a) {
            case 6:
                ((kt0) this.f41852b).e();
                return;
            default:
                ((x91) this.f41852b).e();
                return;
        }
    }

    @Override
    public void b(org.telegram.ui.Components.gz gzVar) {
        Drawable[] drawableArr = PhotoViewer.U8;
        gzVar.d(new n2.u((org.telegram.messenger.ff) this.f41852b, 10));
    }

    @Override
    public boolean c(org.telegram.ui.Cells.e5 e5Var, boolean z10) {
        zu0 zu0Var = (zu0) this.f41852b;
        if (z10) {
            zu0Var.d.Y((Long) e5Var.getTag(), e5Var);
            return true;
        }
        return true;
    }

    @Override
    public Object d(Number number, Object obj) {
        Integer num = (Integer) obj;
        PrivacyControlActivity privacyControlActivity = ((su0) this.f41852b).d;
        if (((Integer) number).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().q()) {
                if (privacyControlActivity.f33757y0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(2131232242, 0);
                    dqVar.f25508r = org.telegram.messenger.i0.L(2.0f);
                    dqVar.f25509s = org.telegram.messenger.i0.L(1.0f);
                    spannableString.setSpan(dqVar, 0, 1, 33);
                    privacyControlActivity.f33757y0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.f33757y0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.H(',', "Stars", num.intValue()));
                return spannableStringBuilder;
            }
            return org.telegram.messenger.cd.H(',', "Stars", num.intValue());
        }
        return org.telegram.messenger.cd.E(num.intValue(), ',');
    }

    @Override
    public boolean f(int i10, View view) {
        switch (this.f41851a) {
            case 17:
                return ((t31) this.f41852b).e1(i10, view);
            default:
                ((ea1) this.f41852b).J.f(i10, view);
                return true;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        int i11;
        int i12;
        int i13;
        boolean z10 = false;
        switch (this.f41851a) {
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) ((b2.u) this.f41852b).f2301c;
                try {
                    org.telegram.messenger.i0.u2(photoViewer.T4, photoViewer.D, photoViewer.f33622v2, true);
                    photoViewer.H0(false, false);
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 4:
                ((at0) this.f41852b).finishFragment();
                return;
            case 5:
                ((us0) this.f41852b).f42524a.R.r();
                return;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f41852b;
                int i14 = PopupNotificationActivity.f33677b0;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.f19025b.getPackageName()));
                    popupNotificationActivity.startActivity(intent);
                    return;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                    return;
                }
            case 11:
                RectF rectF = ProfileActivity.R6;
                ((dv0) this.f41852b).a(1);
                return;
            case 14:
                ProxyListActivity proxyListActivity = (ProxyListActivity) ((pj0) this.f41852b).f40677c;
                ArrayList arrayList = proxyListActivity.E;
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    org.telegram.messenger.tz.i((org.telegram.messenger.sz) obj);
                }
                if (org.telegram.messenger.tz.B1 == null) {
                    proxyListActivity.d = false;
                }
                org.telegram.messenger.zs.e().n(proxyListActivity, 277);
                org.telegram.messenger.zs.e().k(277, new Object[0]);
                org.telegram.messenger.zs.e().c(proxyListActivity, 277);
                proxyListActivity.g0(true);
                fg.j jVar = proxyListActivity.f33957a;
                if (jVar != null) {
                    if (org.telegram.messenger.tz.B1 == null) {
                        jVar.h(ProxyListActivity.f0(proxyListActivity), 0);
                    }
                    proxyListActivity.f33957a.F();
                    return;
                }
                return;
            case 19:
                ThemeActivity themeActivity = ((n71) this.f41852b).f39854a;
                if (org.telegram.messenger.i0.Q1()) {
                    i11 = 18;
                } else {
                    i11 = 16;
                }
                boolean o02 = ThemeActivity.o0(themeActivity, i11);
                if (ThemeActivity.c0(themeActivity, 17, true)) {
                    o02 = true;
                }
                if (o02) {
                    x71 x71Var = themeActivity.f34087a;
                    i12 = themeActivity.textSizeRow;
                    x71Var.h(i12, new Object());
                    x71 x71Var2 = themeActivity.f34087a;
                    i13 = themeActivity.bubbleRadiusRow;
                    x71Var2.h(i13, new Object());
                }
                if (themeActivity.f34091c != null) {
                    org.telegram.ui.ActionBar.s6 Q0 = org.telegram.ui.ActionBar.t6.Q0("Blue");
                    org.telegram.ui.ActionBar.s6 D0 = org.telegram.ui.ActionBar.t6.D0();
                    SparseArray sparseArray = Q0.f20802a0;
                    int i16 = org.telegram.ui.ActionBar.t6.f21108n;
                    org.telegram.ui.ActionBar.r6 r6Var = (org.telegram.ui.ActionBar.r6) sparseArray.get(i16);
                    if (r6Var != null) {
                        org.telegram.ui.ActionBar.m6 m6Var = new org.telegram.ui.ActionBar.m6();
                        m6Var.f20590c = "d";
                        m6Var.f20588a = "Blue_99_wp.jpg";
                        m6Var.f20589b = "Blue_99_wp.jpg";
                        r6Var.f20750y = m6Var;
                        Q0.v(m6Var);
                    }
                    if (Q0 != D0) {
                        Q0.u(i16);
                        org.telegram.ui.ActionBar.t6.z1(Q0, true, false, true, false, false);
                        themeActivity.f34091c.B1(Q0, null);
                        themeActivity.f34091c.y0(0);
                        return;
                    } else if (Q0.Y != i16) {
                        if (themeActivity.f34095f == 1) {
                            z10 = true;
                        }
                        org.telegram.ui.ActionBar.t6.K1(D0, z10, i16, null);
                        themeActivity.f34087a.g(themeActivity.f34107q0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.t6.u1(true);
                        return;
                    }
                }
                return;
            case 20:
                m91 m91Var = ((q81) this.f41852b).f40931a;
                org.telegram.ui.ActionBar.s6 s6Var = m91Var.f39555f0;
                org.telegram.ui.ActionBar.t6.l0(s6Var, m91Var.f39596w, true);
                org.telegram.ui.ActionBar.t6.p();
                org.telegram.ui.ActionBar.t6.t1(false, false);
                org.telegram.messenger.zs.e().k(270, s6Var, Boolean.valueOf(m91Var.f39558g0), null, -1);
                m91Var.finishFragment();
                return;
            default:
                ((rc1) this.f41852b).f41200a.I0(true);
                return;
        }
    }

    @Override
    public void i(int i10) {
        fd1 fd1Var = (fd1) this.f41852b;
        if (fd1Var.h == null && !fd1Var.f37235f.e()) {
            fd1Var.f37239w.f34149f.e(false, true);
        }
        fd1Var.f();
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        switch (this.f41851a) {
            case 0:
                Integer num = (Integer) number;
                Float f7 = (Float) serializable;
                Float f10 = (Float) serializable2;
                PasskeysActivity.a0((PasskeysActivity) this.f41852b, (org.telegram.ui.Components.a51) obj, (View) obj2);
                return;
            default:
                b01 b01Var = (b01) this.f41852b;
                org.telegram.ui.Components.a51 a51Var = (org.telegram.ui.Components.a51) obj;
                View view = (View) obj2;
                Integer num2 = (Integer) number;
                Float f11 = (Float) serializable;
                Float f12 = (Float) serializable2;
                c01 c01Var = b01Var.f35926w;
                if (a51Var.f7680a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = b01Var.f35920b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(a51Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            c01.I0(c01Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = b01Var.f35921c;
                    if (tL_reportResultChooseOption != null) {
                        TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(a51Var.d);
                        if (tL_messageReportOption != null) {
                            c01.I0(c01Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultAddComment tL_reportResultAddComment = b01Var.d;
                    if (tL_reportResultAddComment != null) {
                        byte[] bArr = tL_reportResultAddComment.option;
                        if (bArr != null) {
                            c01.I0(c01Var, null, bArr, null);
                            return;
                        }
                        return;
                    }
                    c01.I0(c01Var, a51Var.f24292l, null, null);
                    return;
                }
                return;
        }
    }

    @Override
    public void q(Exception exc) {
        RectF rectF = ProfileActivity.R6;
        org.telegram.messenger.f8.e("mlkit: failed to detect language in selection", exc);
        ((org.telegram.messenger.fe) this.f41852b).run();
    }

    @Override
    public void run(long j10) {
        org.telegram.messenger.i0.g3(new bi.e((org.telegram.messenger.sz) this.f41852b, j10, 18));
    }

    @Override
    public a0.h x() {
        return null;
    }

    @Override
    public void c0(ArrayList arrayList) {
    }
}
