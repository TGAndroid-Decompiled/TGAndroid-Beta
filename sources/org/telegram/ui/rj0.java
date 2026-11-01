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
public final class rj0 implements org.telegram.messenger.p20, org.telegram.ui.Cells.z5, org.telegram.ui.Components.k61, org.telegram.ui.ActionBar.u1, org.telegram.ui.ActionBar.j1, r0.m, org.telegram.messenger.l20, org.telegram.ui.Cells.d5, org.telegram.messenger.qc, RequestTimeDelegate, org.telegram.ui.ActionBar.j2, org.telegram.ui.Components.jk0, bg.g, zf.l1 {
    public final int f41097a;
    public final Object f41098b;

    public rj0(Object obj, int i10) {
        this.f41097a = i10;
        this.f41098b = obj;
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
        switch (this.f41097a) {
            case 8:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f41098b;
                i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
                premiumPreviewFragment.f33714o0 = I0;
                premiumPreviewFragment.f33696a.setPadding(0, I0.f7767b, 0, org.telegram.messenger.i0.L(48.0f) + premiumPreviewFragment.f33714o0.d);
                org.telegram.ui.Components.uk0 uk0Var = premiumPreviewFragment.f33696a;
                i0.c cVar = premiumPreviewFragment.f33714o0;
                org.telegram.messenger.i0.A3(uk0Var, cVar.f7766a, 0, cVar.f7768c, 0);
                cu0 cu0Var = premiumPreviewFragment.U;
                i0.c cVar2 = premiumPreviewFragment.f33714o0;
                cu0Var.setPadding(cVar2.f7766a, 0, cVar2.f7768c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i12 = premiumPreviewFragment.f33714o0.f7766a;
                    int L = org.telegram.messenger.i0.L(14.0f);
                    i0.c cVar3 = premiumPreviewFragment.f33714o0;
                    frameLayout.setPadding(i12, L, cVar3.f7768c, cVar3.d);
                }
                return r0.j1.f46142b;
            default:
                of0 of0Var = (of0) ((hd1) this.f41098b);
                i0.c I02 = org.telegram.messenger.i0.I0(j1Var, false);
                int i13 = I02.f7766a;
                of0Var.M = i13;
                int i14 = I02.f7768c;
                of0Var.N = i14;
                of0Var.L = I02.d;
                boolean a2 = of0Var.D.a();
                if (a2) {
                    i10 = org.telegram.messenger.i0.L(44.0f);
                } else {
                    i10 = 0;
                }
                of0Var.D.setPadding(0, 0, 0, of0Var.L);
                int L2 = org.telegram.messenger.i0.L(72.0f) + of0Var.L + i10;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) of0Var.H.getLayoutParams();
                if (marginLayoutParams.height != L2) {
                    marginLayoutParams.height = L2;
                    of0Var.H.setLayoutParams(marginLayoutParams);
                }
                if (a2) {
                    i11 = of0Var.L + i10;
                } else {
                    i11 = 0;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) of0Var.f37789c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i11 || marginLayoutParams2.leftMargin != i13 || marginLayoutParams2.rightMargin != i14) {
                    marginLayoutParams2.leftMargin = i13;
                    marginLayoutParams2.rightMargin = i14;
                    marginLayoutParams2.bottomMargin = i11;
                    of0Var.f37789c.setLayoutParams(marginLayoutParams2);
                }
                of0Var.E.setPadding(i13, 0, i14, of0Var.L);
                if (a2) {
                    j1Var = j1Var.f46143a.m(0, 0, 0, of0Var.L);
                }
                of0Var.o0();
                of0Var.n0();
                SparseArray sparseArray = of0Var.f37787a;
                int size = sparseArray.size();
                for (int i15 = 0; i15 < size; i15++) {
                    fd1 fd1Var = (fd1) sparseArray.valueAt(i15);
                    if (fd1Var != null && (fragmentView = fd1Var.f37108a.getFragmentView()) != null) {
                        r0.h0.b(fragmentView, j1Var);
                    }
                }
                return r0.j1.f46142b;
        }
    }

    @Override
    public boolean Y(int i10) {
        return true;
    }

    @Override
    public void a() {
        switch (this.f41097a) {
            case 6:
                ((jt0) this.f41098b).e();
                return;
            default:
                ((v91) this.f41098b).e();
                return;
        }
    }

    @Override
    public void b(org.telegram.ui.Components.gz gzVar) {
        Drawable[] drawableArr = PhotoViewer.U8;
        gzVar.d(new n2.u((org.telegram.messenger.gf) this.f41098b, 10));
    }

    @Override
    public boolean c(org.telegram.ui.Cells.e5 e5Var, boolean z10) {
        yu0 yu0Var = (yu0) this.f41098b;
        if (z10) {
            yu0Var.d.Z((Long) e5Var.getTag(), e5Var);
            return true;
        }
        return true;
    }

    @Override
    public Object d(Number number, Object obj) {
        Integer num = (Integer) obj;
        PrivacyControlActivity privacyControlActivity = ((ru0) this.f41098b).d;
        if (((Integer) number).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().q()) {
                if (privacyControlActivity.f33764y0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(2131232242, 0);
                    dqVar.f25568r = org.telegram.messenger.i0.L(2.0f);
                    dqVar.f25569s = org.telegram.messenger.i0.L(1.0f);
                    spannableString.setSpan(dqVar, 0, 1, 33);
                    privacyControlActivity.f33764y0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.f33764y0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.dd.H(',', "Stars", num.intValue()));
                return spannableStringBuilder;
            }
            return org.telegram.messenger.dd.H(',', "Stars", num.intValue());
        }
        return org.telegram.messenger.dd.E(num.intValue(), ',');
    }

    @Override
    public boolean f(int i10, View view) {
        switch (this.f41097a) {
            case 17:
                return ((r31) this.f41098b).e1(i10, view);
            default:
                ((ca1) this.f41098b).J.f(i10, view);
                return true;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        int i11;
        int i12;
        int i13;
        boolean z10 = false;
        switch (this.f41097a) {
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) ((b2.u) this.f41098b).f2301c;
                try {
                    org.telegram.messenger.i0.u2(photoViewer.T4, photoViewer.D, photoViewer.f33629v2, true);
                    photoViewer.H0(false, false);
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 4:
                ((zs0) this.f41098b).finishFragment();
                return;
            case 5:
                ((ts0) this.f41098b).f41724a.R.r();
                return;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f41098b;
                int i14 = PopupNotificationActivity.f33684b0;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.f18945b.getPackageName()));
                    popupNotificationActivity.startActivity(intent);
                    return;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                    return;
                }
            case 11:
                RectF rectF = ProfileActivity.S6;
                ((cv0) this.f41098b).a(1);
                return;
            case 14:
                ProxyListActivity proxyListActivity = (ProxyListActivity) ((nj0) this.f41098b).f39920c;
                ArrayList arrayList = proxyListActivity.E;
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    org.telegram.messenger.uz.i((org.telegram.messenger.tz) obj);
                }
                if (org.telegram.messenger.uz.B1 == null) {
                    proxyListActivity.d = false;
                }
                org.telegram.messenger.at.e().n(proxyListActivity, 277);
                org.telegram.messenger.at.e().k(277, new Object[0]);
                org.telegram.messenger.at.e().c(proxyListActivity, 277);
                proxyListActivity.h0(true);
                fg.j jVar = proxyListActivity.f33964a;
                if (jVar != null) {
                    if (org.telegram.messenger.uz.B1 == null) {
                        jVar.h(ProxyListActivity.g0(proxyListActivity), 0);
                    }
                    proxyListActivity.f33964a.F();
                    return;
                }
                return;
            case 19:
                ThemeActivity themeActivity = ((l71) this.f41098b).f39112a;
                if (org.telegram.messenger.i0.Q1()) {
                    i11 = 18;
                } else {
                    i11 = 16;
                }
                boolean p02 = ThemeActivity.p0(themeActivity, i11);
                if (ThemeActivity.d0(themeActivity, 17, true)) {
                    p02 = true;
                }
                if (p02) {
                    v71 v71Var = themeActivity.f34094a;
                    i12 = themeActivity.textSizeRow;
                    v71Var.h(i12, new Object());
                    v71 v71Var2 = themeActivity.f34094a;
                    i13 = themeActivity.bubbleRadiusRow;
                    v71Var2.h(i13, new Object());
                }
                if (themeActivity.f34098c != null) {
                    org.telegram.ui.ActionBar.s6 Q0 = org.telegram.ui.ActionBar.t6.Q0("Blue");
                    org.telegram.ui.ActionBar.s6 D0 = org.telegram.ui.ActionBar.t6.D0();
                    SparseArray sparseArray = Q0.f20803a0;
                    int i16 = org.telegram.ui.ActionBar.t6.f21109n;
                    org.telegram.ui.ActionBar.r6 r6Var = (org.telegram.ui.ActionBar.r6) sparseArray.get(i16);
                    if (r6Var != null) {
                        org.telegram.ui.ActionBar.m6 m6Var = new org.telegram.ui.ActionBar.m6();
                        m6Var.f20591c = "d";
                        m6Var.f20589a = "Blue_99_wp.jpg";
                        m6Var.f20590b = "Blue_99_wp.jpg";
                        r6Var.f20751y = m6Var;
                        Q0.v(m6Var);
                    }
                    if (Q0 != D0) {
                        Q0.u(i16);
                        org.telegram.ui.ActionBar.t6.z1(Q0, true, false, true, false, false);
                        themeActivity.f34098c.B1(Q0, null);
                        themeActivity.f34098c.y0(0);
                        return;
                    } else if (Q0.Y != i16) {
                        if (themeActivity.f34102f == 1) {
                            z10 = true;
                        }
                        org.telegram.ui.ActionBar.t6.K1(D0, z10, i16, null);
                        themeActivity.f34094a.g(themeActivity.f34114q0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.t6.u1(true);
                        return;
                    }
                }
                return;
            case 20:
                k91 k91Var = ((o81) this.f41098b).f40104a;
                org.telegram.ui.ActionBar.s6 s6Var = k91Var.f38730f0;
                org.telegram.ui.ActionBar.t6.l0(s6Var, k91Var.f38771w, true);
                org.telegram.ui.ActionBar.t6.p();
                org.telegram.ui.ActionBar.t6.t1(false, false);
                org.telegram.messenger.at.e().k(270, s6Var, Boolean.valueOf(k91Var.f38733g0), null, -1);
                k91Var.finishFragment();
                return;
            default:
                ((pc1) this.f41098b).f40458a.J0(true);
                return;
        }
    }

    @Override
    public void i(int i10) {
        dd1 dd1Var = (dd1) this.f41098b;
        if (dd1Var.h == null && !dd1Var.f36572f.e()) {
            dd1Var.f36576w.f34156f.e(false, true);
        }
        dd1Var.f();
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        switch (this.f41097a) {
            case 0:
                Integer num = (Integer) number;
                Float f7 = (Float) serializable;
                Float f10 = (Float) serializable2;
                PasskeysActivity.b0((PasskeysActivity) this.f41098b, (org.telegram.ui.Components.b51) obj, (View) obj2);
                return;
            default:
                a01 a01Var = (a01) this.f41098b;
                org.telegram.ui.Components.b51 b51Var = (org.telegram.ui.Components.b51) obj;
                View view = (View) obj2;
                Integer num2 = (Integer) number;
                Float f11 = (Float) serializable;
                Float f12 = (Float) serializable2;
                b01 b01Var = a01Var.f35511w;
                if (b51Var.f7681a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = a01Var.f35505b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(b51Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            b01.I0(b01Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = a01Var.f35506c;
                    if (tL_reportResultChooseOption != null) {
                        TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(b51Var.d);
                        if (tL_messageReportOption != null) {
                            b01.I0(b01Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultAddComment tL_reportResultAddComment = a01Var.d;
                    if (tL_reportResultAddComment != null) {
                        byte[] bArr = tL_reportResultAddComment.option;
                        if (bArr != null) {
                            b01.I0(b01Var, null, bArr, null);
                            return;
                        }
                        return;
                    }
                    b01.I0(b01Var, b51Var.f24643l, null, null);
                    return;
                }
                return;
        }
    }

    @Override
    public void p(Exception exc) {
        RectF rectF = ProfileActivity.S6;
        org.telegram.messenger.f8.e("mlkit: failed to detect language in selection", exc);
        ((org.telegram.messenger.ge) this.f41098b).run();
    }

    @Override
    public void run(long j10) {
        org.telegram.messenger.i0.g3(new bi.e((org.telegram.messenger.tz) this.f41098b, j10, 18));
    }

    @Override
    public a0.h x() {
        return null;
    }

    @Override
    public void c0(ArrayList arrayList) {
    }
}
