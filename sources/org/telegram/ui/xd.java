package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
public final class xd extends org.telegram.ui.Components.it0 implements org.telegram.ui.ActionBar.z5 {
    public static xd f53175u1;
    public static HashMap f53176v1;
    public final org.telegram.ui.Components.h6 A0;
    public final hi.d B0;
    public int C0;
    public final ai.r2 D0;
    public TL_stars.StarsAmount E0;
    public final org.telegram.ui.Components.h6 F0;
    public final org.telegram.ui.Components.h6 G0;
    public final nd H0;
    public final org.telegram.ui.Components.eq[] I0;
    public final LinearLayout J0;
    public final hi.d K0;
    public final di.p L0;
    public boolean M0;
    public boolean N0;
    public long O0;
    public final di.q P0;
    public org.telegram.ui.Components.xb Q0;
    public boolean R0;
    public int S0;
    public Runnable T0;
    public final bi.o2 U0;
    public int V0;
    public int W0;
    public int X0;
    public final org.telegram.ui.Components.u41 Y0;
    public final FrameLayout Z0;
    public DecimalFormat f53177a1;
    public final td f53178b1;
    public final boolean f53179c1;
    public final boolean f53180d1;
    public final ri.q f53181e1;
    public SpannableStringBuilder f53182f1;
    public final dd f53183g1;
    public double f53184h1;
    public double f53185i1;
    public org.telegram.ui.ActionBar.k f53186j1;
    public boolean f53187k1;
    public boolean l1;
    public l41 f53188m1;
    public final z41 f53189n0;
    public l41 n1;
    public final org.telegram.ui.ActionBar.e6 f53190o0;
    public l41 f53191o1;
    public final int f53192p0;
    public boolean f53193p1;
    public final long f53194q0;
    public final ud f53195q1;
    public TL_stories.TL_premium_boostsStatus f53196r0;
    public final ud f53197r1;
    public int f53198s0;
    public final ud f53199s1;
    public final SpannableStringBuilder f53200t0;
    public final cd f53201t1;
    public final SpannableStringBuilder f53202u0;
    public final SpannableStringBuilder f53203v0;
    public final SpannableStringBuilder f53204w0;
    public final ai.r2 f53205x0;
    public final RelativeSizeSpan f53206y0;
    public final org.telegram.ui.Components.h6 f53207z0;

    public xd(Activity activity, z41 z41Var, int i7, long j3, org.telegram.ui.ActionBar.e6 e6Var, ri.q qVar, boolean z10, boolean z11) {
        super(activity);
        this.E0 = TL_stars.StarsAmount.ofStars(0L);
        this.I0 = new org.telegram.ui.Components.eq[1];
        this.M0 = false;
        this.N0 = true;
        this.R0 = true;
        this.S0 = -1;
        this.f53187k1 = false;
        this.l1 = false;
        this.f53193p1 = false;
        String M0 = org.telegram.messenger.hd.M0(2131748384, null);
        ud udVar = new ud();
        udVar.f51909a = false;
        udVar.f51910b = "TON";
        udVar.h = "XTR";
        udVar.f51911c = M0;
        this.f53195q1 = udVar;
        String M02 = org.telegram.messenger.hd.M0(2131748383, null);
        ud udVar2 = new ud();
        udVar2.f51909a = false;
        udVar2.f51910b = "TON";
        udVar2.h = "XTR";
        udVar2.f51911c = M02;
        this.f53197r1 = udVar2;
        String M03 = org.telegram.messenger.hd.M0(2131748382, null);
        ud udVar3 = new ud();
        udVar3.f51909a = false;
        udVar3.f51910b = "TON";
        udVar3.h = "XTR";
        udVar3.f51911c = M03;
        this.f53199s1 = udVar3;
        this.f53201t1 = new cd(this, 7);
        this.f53181e1 = qVar;
        this.f53179c1 = z10;
        this.f53180d1 = z11;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.f53177a1 = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        this.f53177a1.setMaximumFractionDigits(12);
        this.f53177a1.setGroupingUsed(false);
        this.f53189n0 = z41Var;
        this.f53190o0 = e6Var;
        this.f53192p0 = i7;
        this.f53194q0 = j3;
        long j10 = -j3;
        TLRPC.Chat M04 = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(j10));
        if (M04 != null) {
            this.f53198s0 = M04.level;
        }
        org.telegram.messenger.np.s1(i7).G0().a(j3, new r3(this, 2));
        H(false);
        if (z10) {
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.j6.I.q();
            tL_payments_getStarsRevenueStats.ton = true;
            tL_payments_getStarsRevenueStats.peer = org.telegram.messenger.np.s1(i7).j1(j3);
            TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(i7).N0(j10);
            if (N0 != null) {
                boolean z12 = N0.restricted_sponsored;
                this.f53187k1 = z12;
                this.l1 = z12;
            }
            ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getStarsRevenueStats, new jd(this, 1), null, null, 0, Integer.MAX_VALUE, 1, true);
        }
        TLRPC.Chat M05 = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(j10));
        this.f53200t0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.a0(null, null, 2131748399, 50), -1, 3, new o1(z41Var, activity, e6Var, 12), e6Var), true);
        this.f53202u0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(org.telegram.messenger.np.s1(i7).J5 ? 2131748405 : 2131748403, null), -1, 3, new cd(this, 0), null), true);
        this.f53203v0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0((z11 && z10) ? 2131748379 : z11 ? 2131748381 : 2131748377, null), -1, 3, new dd(this, (z11 && z10) ? 2131748378 : z11 ? 2131748380 : 2131748376, 0), e6Var), true);
        this.f53204w0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(org.telegram.messenger.t3.V(M05) ? 2131748372 : 2131748371, null), new cd(this, 1)), true);
        setCommonInsetsManagedExternally(true);
        setGeometry(new f(this, 11));
        this.U0 = new bi.o2(26, activity, this);
        td tdVar = new td(this, activity, i7, j3, z41Var.getClassGuid(), new cd(this, 2), e6Var);
        this.f53178b1 = tdVar;
        ai.r2 r2Var = new ai.r2(activity, 4);
        this.f53205x0 = r2Var;
        r2Var.setOrientation(1);
        int i10 = org.telegram.ui.ActionBar.j6.f28849d6;
        org.telegram.ui.ActionBar.q6.h(i10, r2Var, e6Var);
        r2Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(activity, false, true, true);
        this.f53207z0 = h6Var;
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.Y(h6Var, i11, e6Var);
        h6Var.setTextSize(org.telegram.messenger.g0.L(32.0f));
        h6Var.setGravity(17);
        this.f53206y0 = new RelativeSizeSpan(0.6770833f);
        r2Var.addView(h6Var, c8.ja.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(activity, true, true, true);
        this.A0 = h6Var2;
        h6Var2.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.j6.f29241y6;
        org.telegram.ui.ActionBar.q6.Y(h6Var2, i12, e6Var);
        h6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        r2Var.addView(h6Var2, c8.ja.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        hi.d dVar = new hi.d(activity, e6Var, true);
        dVar.setRoundRadius(24);
        this.B0 = dVar;
        dVar.setEnabled(org.telegram.messenger.np.s1(i7).J5);
        dVar.i(org.telegram.messenger.hd.M0(2131748351, null), false, true);
        dVar.setVisibility(8);
        dVar.setOnClickListener(new org.telegram.messenger.video.e(14, this, z41Var));
        r2Var.addView(dVar, c8.ja.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        ai.r2 r2Var2 = new ai.r2(activity, 5);
        this.D0 = r2Var2;
        r2Var2.setOrientation(1);
        org.telegram.ui.ActionBar.q6.h(i10, r2Var2, e6Var);
        r2Var2.setPadding(0, 0, 0, org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.Components.h6 h6Var3 = new org.telegram.ui.Components.h6(activity, false, true, true);
        this.F0 = h6Var3;
        h6Var3.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.q6.Y(h6Var3, i11, e6Var);
        h6Var3.setTextSize(org.telegram.messenger.g0.L(32.0f));
        h6Var3.setGravity(17);
        new RelativeSizeSpan(0.6770833f);
        r2Var2.addView(h6Var3, c8.ja.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.h6 h6Var4 = new org.telegram.ui.Components.h6(activity, true, true, true);
        this.G0 = h6Var4;
        h6Var4.setGravity(17);
        org.telegram.ui.ActionBar.q6.Y(h6Var4, i12, e6Var);
        h6Var4.setTextSize(org.telegram.messenger.g0.L(14.0f));
        r2Var2.addView(h6Var4, c8.ja.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        di.p pVar = new di.p(1, activity, this);
        this.L0 = pVar;
        pVar.setVisibility(8);
        pVar.setText(org.telegram.messenger.hd.M0(2131752953, null));
        pVar.setLeftPadding(org.telegram.messenger.g0.L(36.0f));
        di.q qVar2 = new di.q(activity, 3);
        this.P0 = qVar2;
        qVar2.setFocusable(false);
        org.telegram.ui.ActionBar.q6.U(qVar2, i11, e6Var);
        qVar2.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        qVar2.setCursorWidth(1.5f);
        qVar2.setBackground(null);
        qVar2.setTextSize(1, 18.0f);
        qVar2.setMaxLines(1);
        int L = org.telegram.messenger.g0.L(16.0f);
        qVar2.setPadding(org.telegram.messenger.g0.L(6.0f), L, L, L);
        qVar2.setInputType(2);
        qVar2.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.q6.C(qVar2, org.telegram.ui.ActionBar.j6.f29005lg, e6Var);
        org.telegram.ui.ActionBar.q6.l(qVar2, 36, org.telegram.ui.ActionBar.j6.f29022mg, e6Var);
        qVar2.setGravity(org.telegram.messenger.hd.f24104a0 ? 5 : 3);
        qVar2.setOnFocusChangeListener(new ed(this, 0));
        qVar2.addTextChangedListener(new md(this));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232753);
        linearLayout.addView(imageView, c8.ja.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(qVar2, c8.ja.p(-1, -2, 1.0f, 119));
        pVar.e(qVar2);
        pVar.addView(linearLayout, c8.ja.e(-1, -2, 48));
        r2Var2.addView(pVar, c8.ja.t(-1, -2, 1, 18, 14, 18, 2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.J0 = linearLayout2;
        linearLayout2.setOrientation(0);
        ?? dVar2 = new hi.d(activity, e6Var, true);
        dVar2.setRoundRadius(24);
        this.H0 = dVar2;
        dVar2.setEnabled(false);
        dVar2.i(org.telegram.messenger.hd.G(0, "MonetizationStarsWithdraw", new Object[0]), false, true);
        dVar2.setVisibility(0);
        dVar2.setOnClickListener(new bi.x2(this, i7, z41Var, 6));
        hi.d dVar3 = new hi.d(activity, e6Var, true);
        dVar3.setRoundRadius(24);
        this.K0 = dVar3;
        dVar3.setEnabled(false);
        dVar3.i(org.telegram.messenger.hd.M0(2131748374, null), false, true);
        dVar3.setOnClickListener(new gd(this, i7, j3, activity));
        linearLayout2.addView((View) dVar2, c8.ja.p(-1, 48, 1.0f, 119));
        if (org.telegram.messenger.t3.V(M05)) {
            linearLayout2.addView(new Space(activity), c8.ja.p(8, 48, 0.0f, 119));
            linearLayout2.addView(dVar3, c8.ja.p(-1, 48, 1.0f, 119));
        }
        r2Var2.addView(linearLayout2, c8.ja.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        qVar2.setOnEditorActionListener(new ld(0, this, z41Var));
        this.f53183g1 = new dd(this, i7, 2);
        org.telegram.ui.Components.u41 u41Var = new org.telegram.ui.Components.u41(z41Var, new a5(this, 2), new bd(this), new org.telegram.messenger.fd(this, 24));
        this.Y0 = u41Var;
        jg.i0 i0Var = new jg.i0(5, this, false);
        u41Var.f39891f3 = i0Var;
        u41Var.setLayoutManager(i0Var);
        u41Var.setClipToPadding(false);
        u41Var.r1();
        u41Var.setCaptureSectionsDecoratorAllowed(true);
        u41Var.f39892g3.f38199r = false;
        u(u41Var, new bd(this));
        x(tdVar, tdVar.f51556b, new org.telegram.messenger.fd(23));
        View view = tdVar.d;
        y(view);
        view.setLayoutParams(c8.ja.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        if (qVar != null) {
            qVar.b(u41Var);
        }
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.Z0 = frameLayout;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28792a7, frameLayout, e6Var);
        frameLayout.addView(e10, c8.ja.e(-2, -2, 17));
        ?? imageView2 = new ImageView(activity);
        imageView2.setAutoRepeat(true);
        imageView2.f(2131624229, 120, 120, null);
        imageView2.d();
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i13 = org.telegram.ui.ActionBar.j6.Fj;
        org.telegram.ui.ActionBar.q6.U(textView, i13, null);
        textView.setTag(Integer.valueOf(i13));
        textView.setText(org.telegram.messenger.hd.M0(2131748777, "LoadingStats"));
        textView.setGravity(1);
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 15.0f);
        int i14 = org.telegram.ui.ActionBar.j6.Gj;
        org.telegram.ui.ActionBar.q6.U(textView2, i14, null);
        textView2.setTag(Integer.valueOf(i14));
        textView2.setText(org.telegram.messenger.hd.M0(2131748776, null));
        textView2.setGravity(1);
        e10.addView((View) imageView2, c8.ja.t(120, 120, 1, 0, 0, 0, 20));
        e10.addView(textView, c8.ja.t(-2, -2, 1, 0, 0, 0, 10));
        e10.addView(textView2, c8.ja.r(-2, -2, 1));
        addView(frameLayout, c8.ja.e(-1, -1, 119));
    }

    public static org.telegram.ui.ActionBar.u2 I(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, e6Var, false);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231612);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(80.0f);
        int i18 = org.telegram.ui.ActionBar.j6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.j6.L(L, org.telegram.ui.ActionBar.j6.w0(i18, e6Var));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i18);
        imageView.setBackground(L2);
        org.telegram.ui.ActionBar.q6.j(imageView, L2, M, null, e6Var);
        f10.addView(imageView, c8.ja.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        i5.c.v(textView, 1, 20.0f);
        int i19 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.U(textView, i19, e6Var);
        if (z10) {
            i7 = 2131753035;
        } else {
            i7 = 2131748389;
        }
        textView.setText(org.telegram.messenger.hd.M0(i7, null));
        f10.addView(textView, c8.ja.k(8.0f, 0.0f, 8.0f, 25.0f, -1, -2));
        if (z10) {
            i10 = 2131753044;
        } else {
            i10 = 2131748398;
        }
        String M0 = org.telegram.messenger.hd.M0(i10, null);
        if (z10) {
            i11 = 2131753043;
        } else {
            i11 = 2131748397;
        }
        f10.addView(new bi.v1(context, 2131232089, M0, org.telegram.messenger.hd.M0(i11, null), e6Var), c8.ja.t(-1, -2, 49, 8, 0, 8, 16));
        if (z10) {
            i12 = 2131753042;
        } else {
            i12 = 2131748396;
        }
        String M02 = org.telegram.messenger.hd.M0(i12, null);
        if (z10) {
            i13 = 2131753041;
        } else {
            i13 = 2131748395;
        }
        f10.addView(new bi.v1(context, 2131231814, M02, org.telegram.messenger.hd.M0(i13, null), e6Var), c8.ja.t(-1, -2, 49, 8, 0, 8, 16));
        if (z10) {
            i14 = 2131753040;
        } else {
            i14 = 2131748394;
        }
        String M03 = org.telegram.messenger.hd.M0(i14, null);
        if (z10) {
            i15 = 2131753039;
        } else {
            i15 = 2131748393;
        }
        f10.addView(new bi.v1(context, 2131231824, M03, org.telegram.messenger.hd.M0(i15, null), e6Var), c8.ja.t(-1, -2, 49, 8, 0, 8, 16));
        View view = new View(context);
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28850d7, view, e6Var);
        f10.addView(view, c8.ja.n(1.0f / org.telegram.messenger.g0.f23610p, -1, 55, 12, 0, 12, 0));
        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(context);
        o5Var.setGravity(17);
        o5Var.setTextSize(1, 20.0f);
        o5Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.q6.U(o5Var, i19, e6Var);
        SpannableString spannableString = new SpannableString("💎");
        org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(2131231957, 0);
        eqVar.d = false;
        eqVar.I = 0.9f;
        eqVar.J = 0.9f;
        eqVar.b(o5Var.getPaint().getFontMetricsInt());
        eqVar.H = 0.9f;
        spannableString.setSpan(eqVar, 0, spannableString.length(), 33);
        if (z10) {
            i16 = 2131753036;
        } else {
            i16 = 2131748390;
        }
        o5Var.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.hd.M0(i16, null), spannableString, "💎"));
        f10.addView(o5Var, c8.ja.k(8.0f, 20.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.z70 z70Var = new org.telegram.ui.Components.z70(context, e6Var);
        z70Var.setGravity(17);
        z70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(z70Var, i19, e6Var);
        org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.Xc, e6Var);
        if (z10) {
            i17 = 2131753037;
        } else {
            i17 = 2131748391;
        }
        z70Var.setText(org.telegram.messenger.g0.c4(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(i17, null)), new ai.q(20, context, z10)));
        f10.addView(z70Var, c8.ja.k(28.0f, 9.0f, 28.0f, 0.0f, -1, -2));
        hi.d g10 = org.telegram.messenger.i20.g(24, context, e6Var, true);
        g10.i(org.telegram.messenger.hd.M0(2131749531, null), false, true);
        g10.setOnClickListener(new fd(k10, 0));
        f10.addView(g10, c8.ja.t(-1, 48, 55, 10, 25, 10, 14));
        k10.O = f10;
        return k10;
    }

    public static SpannableStringBuilder K(CharSequence charSequence, TextPaint textPaint, float f10, float f11, boolean z10) {
        int i7;
        if (f53176v1 == null) {
            f53176v1 = new HashMap();
        }
        int i10 = textPaint.getFontMetricsInt().bottom;
        if (z10) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        int i11 = ((i10 * i7) * ((int) (f10 * 100.0f))) - ((int) (100.0f * f11));
        SpannableString spannableString = (SpannableString) f53176v1.get(Integer.valueOf(i11));
        if (spannableString == null) {
            spannableString = new SpannableString("T");
            if (z10) {
                org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(2131231957, 0);
                eqVar.d = false;
                eqVar.I = f10;
                eqVar.J = f10;
                eqVar.a(org.telegram.ui.ActionBar.j6.f29049o6);
                eqVar.b(textPaint.getFontMetricsInt());
                eqVar.H = 0.9f;
                spannableString.setSpan(eqVar, 0, spannableString.length(), 33);
            } else {
                org.telegram.ui.Components.eq eqVar2 = new org.telegram.ui.Components.eq(2131231955, 0);
                eqVar2.d = false;
                eqVar2.I = f10;
                eqVar2.J = f10;
                eqVar2.f34415s = f11;
                eqVar2.H = 0.95f;
                spannableString.setSpan(eqVar2, 0, spannableString.length(), 33);
            }
            f53176v1.put(Integer.valueOf(i11), spannableString);
        }
        return org.telegram.messenger.g0.M2(charSequence, spannableString, "TON");
    }

    public static void M(Context context, int i7, TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction, long j3, org.telegram.ui.ActionBar.e6 e6Var) {
        long j10;
        String M0;
        long j11;
        long j12;
        long j13;
        char c10;
        boolean z10;
        boolean z11;
        int i10;
        String str;
        String p10;
        TLRPC.Chat chat;
        org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, e6Var, false);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        boolean z12 = broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal;
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            M0 = org.telegram.messenger.hd.M0(2131748361, null);
            j10 = 0;
            j11 = tL_broadcastRevenueTransactionWithdrawal.date;
            j12 = tL_broadcastRevenueTransactionWithdrawal.amount;
            boolean z13 = tL_broadcastRevenueTransactionWithdrawal.pending;
            z11 = tL_broadcastRevenueTransactionWithdrawal.failed;
            z10 = z13;
            j13 = 0;
            c10 = 65535;
        } else {
            j10 = 0;
            if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
                TL_stats.TL_broadcastRevenueTransactionProceeds tL_broadcastRevenueTransactionProceeds = (TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction;
                M0 = org.telegram.messenger.hd.M0(2131748363, null);
                j11 = tL_broadcastRevenueTransactionProceeds.from_date;
                j13 = tL_broadcastRevenueTransactionProceeds.to_date;
                j12 = tL_broadcastRevenueTransactionProceeds.amount;
            } else if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionRefund) {
                TL_stats.TL_broadcastRevenueTransactionRefund tL_broadcastRevenueTransactionRefund = (TL_stats.TL_broadcastRevenueTransactionRefund) broadcastRevenueTransaction;
                M0 = org.telegram.messenger.hd.M0(2131748362, null);
                j11 = tL_broadcastRevenueTransactionRefund.from_date;
                j12 = tL_broadcastRevenueTransactionRefund.amount;
                j13 = 0;
            } else {
                return;
            }
            c10 = 1;
            z10 = false;
            z11 = false;
        }
        long j14 = j12;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        org.telegram.messenger.i20.o(textView, 1, 18.0f);
        if (c10 < 0) {
            i10 = org.telegram.ui.ActionBar.j6.f29090q7;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f28998l8;
        }
        org.telegram.ui.ActionBar.q6.U(textView, i10, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (c10 < 0) {
            str = "-";
        } else {
            str = "+";
        }
        spannableStringBuilder.append((CharSequence) str);
        long j15 = j11;
        spannableStringBuilder.append((CharSequence) decimalFormat.format(Math.round((Math.abs(j14) / 1.0E9d) * 100000.0d) / 100000.0d));
        spannableStringBuilder.append((CharSequence) " TON");
        int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.3333334f), 0, indexOf, 33);
        }
        textView.setText(spannableStringBuilder);
        f10.addView(textView, c8.ja.t(-1, -2, 49, 0, 24, 0, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.f29241y6, e6Var);
        if (z10) {
            textView2.setText(org.telegram.messenger.hd.M0(2131748358, null));
        } else if (j15 == j10) {
            textView2.setText(org.telegram.messenger.hd.Q(j13));
        } else if (j13 == j10) {
            textView2.setText(org.telegram.messenger.hd.Q(j15));
        } else {
            textView2.setText(org.telegram.messenger.hd.Q(j15) + " - " + org.telegram.messenger.hd.Q(j13));
        }
        if (z11) {
            org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.f29090q7, e6Var);
            textView2.setText(TextUtils.concat(textView2.getText(), " — ", org.telegram.messenger.hd.M0(2131748359, null)));
        }
        f10.addView(textView2, c8.ja.t(-1, -2, 49, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        textView3.setGravity(17);
        org.telegram.messenger.i20.o(textView3, 1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(textView3, org.telegram.ui.ActionBar.j6.G6, e6Var);
        textView3.setText(M0);
        f10.addView(textView3, c8.ja.t(-1, -2, 49, 0, 27, 0, 0));
        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
            FrameLayout frameLayout = new FrameLayout(context);
            int L = org.telegram.messenger.g0.L(28.0f);
            int L2 = org.telegram.messenger.g0.L(28.0f);
            int i11 = org.telegram.ui.ActionBar.j6.Ti;
            ShapeDrawable e02 = org.telegram.ui.ActionBar.j6.e0(L, L2, org.telegram.ui.ActionBar.j6.w0(i11, e6Var));
            org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
            frameLayout.setBackground(e02);
            org.telegram.ui.ActionBar.q6.j(frameLayout, e02, M, null, e6Var);
            if (j3 < j10) {
                TLRPC.Chat M02 = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(-j3));
                if (M02 == null) {
                    p10 = "";
                    chat = M02;
                } else {
                    p10 = M02.title;
                    chat = M02;
                }
            } else {
                TLRPC.User a22 = org.telegram.messenger.np.s1(i7).a2(Long.valueOf(j3));
                p10 = org.telegram.messenger.q10.p(a22);
                chat = a22;
            }
            org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
            i9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
            org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
            t8Var.l(chat);
            i9Var.f(chat, t8Var);
            frameLayout.addView(i9Var, c8.ja.e(28, 28, 51));
            TextView textView4 = new TextView(context);
            org.telegram.ui.ActionBar.q6.U(textView4, org.telegram.ui.ActionBar.j6.f28957j5, e6Var);
            textView4.setTextSize(1, 13.0f);
            textView4.setSingleLine();
            textView4.setText(p10);
            frameLayout.addView(textView4, c8.ja.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
            f10.addView(frameLayout, c8.ja.t(-2, 28, 1, 42, 10, 42, 0));
        }
        hi.d g10 = org.telegram.messenger.i20.g(24, context, e6Var, true);
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal2 = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            if ((tL_broadcastRevenueTransactionWithdrawal2.flags & 2) != 0) {
                g10.i(org.telegram.messenger.hd.M0(2131748360, null), false, true);
                g10.setOnClickListener(new org.telegram.messenger.video.e(15, context, tL_broadcastRevenueTransactionWithdrawal2));
                f10.addView(g10, c8.ja.t(-1, 48, 55, 18, 30, 18, 14));
                k10.O = f10;
                k10.show();
            }
        }
        g10.i(org.telegram.messenger.hd.M0(2131747831, null), false, true);
        g10.setOnClickListener(new fd(k10, 1));
        f10.addView(g10, c8.ja.t(-1, 48, 55, 18, 30, 18, 14));
        k10.O = f10;
        k10.show();
    }

    public final void D(TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats) {
        boolean z10;
        FrameLayout frameLayout;
        mg.b bVar;
        ArrayList arrayList;
        if (this.f53191o1 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f53185i1 = tL_payments_starsRevenueStats.usd_rate;
        l41 i02 = z41.i0(tL_payments_starsRevenueStats.revenue_graph, org.telegram.messenger.hd.M0(2131748400, null), 2, false);
        this.f53191o1 = i02;
        if (i02 != null && (bVar = i02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.f53191o1.d.d.get(0) != null) {
            ((mg.a) this.f53191o1.d.d.get(0)).f20618g = org.telegram.ui.ActionBar.j6.bk;
            this.f53191o1.d.h = (float) ((1.0d / this.f53185i1) / 100.0d);
        }
        L(false, tL_payments_starsRevenueStats.status);
        if (!this.f53179c1 && (frameLayout = this.Z0) != null) {
            frameLayout.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.er.h).withEndAction(new cd(this, 6)).start();
        }
        org.telegram.ui.Components.u41 u41Var = this.Y0;
        if (u41Var != null) {
            u41Var.f39892g3.O(!z10);
            if (z10) {
                u41Var.v0(0);
            }
        }
    }

    public final void E() {
        if (isAttachedToWindow() && this.f53179c1 && this.f53193p1 && org.telegram.messenger.np.e1().getBoolean("monetizationadshint", true)) {
            this.f53189n0.showDialog(I(getContext(), this.f53190o0, false));
            org.telegram.messenger.np.e1().edit().putBoolean("monetizationadshint", false).apply();
        }
    }

    public final void F(boolean z10, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        z41 z41Var = this.f53189n0;
        if (z41Var != null) {
            Activity parentActivity = z41Var.getParentActivity();
            int i7 = this.f53192p0;
            TLRPC.User f10 = org.telegram.messenger.m10.i(i7).f();
            if (parentActivity != null && f10 != null) {
                long j3 = this.f53194q0;
                if (z10) {
                    tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                    tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
                    tL_payments_getStarsRevenueWithdrawalUrl.peer = org.telegram.messenger.np.s1(i7).j1(j3);
                    if (inputCheckPasswordSRP == null) {
                        inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                    }
                    tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
                    tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
                    tL_payments_getStarsRevenueWithdrawalUrl.amount = this.O0;
                } else {
                    tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                    tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
                    tL_payments_getStarsRevenueWithdrawalUrl.peer = org.telegram.messenger.np.s1(i7).j1(j3);
                    if (inputCheckPasswordSRP == null) {
                        inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                    }
                    tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
                }
                ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new di.f3(this, twoStepVerificationActivity, parentActivity, z10));
            }
        }
    }

    public final boolean G(float f10, float f11) {
        if (this.Z0.getVisibility() != 0 && c() && f10 >= 0.0f && f10 < getWidth() && f11 >= getTabsTop() && f11 < getHeight()) {
            return true;
        }
        return false;
    }

    public final void H(boolean z10) {
        if (!this.f53180d1) {
            return;
        }
        int i7 = this.f53192p0;
        di.e0 g10 = di.e0.g(i7);
        long j3 = this.f53194q0;
        TLRPC.TL_payments_starsRevenueStats h = g10.h(j3, z10);
        if (h != null) {
            org.telegram.messenger.g0.h3(new u5(17, this, h));
            return;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.peer = org.telegram.messenger.np.s1(i7).j1(j3);
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.j6.I.q();
        ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getStarsRevenueStats, new jd(this, 2));
    }

    public final void J() {
        td tdVar = this.f53178b1;
        cd cdVar = tdVar.f51559f;
        boolean[] zArr = tdVar.f51563w;
        boolean a10 = tdVar.a();
        for (int i7 = 0; i7 < 2; i7++) {
            if (!zArr[i7]) {
                if (i7 == 1) {
                    tdVar.f51560n.clear();
                    tdVar.h = "";
                } else {
                    tdVar.f51561r.clear();
                    tdVar.f51562s = "";
                }
                zArr[i7] = false;
                tdVar.c(i7);
            } else {
                return;
            }
        }
        if (tdVar.a() != a10 && cdVar != null) {
            tdVar.e();
            cdVar.run();
        }
    }

    public final void L(boolean z10, TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus) {
        ud udVar;
        int i7;
        TL_stars.StarsAmount starsAmount;
        TL_stars.StarsAmount starsAmount2;
        int i10;
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.p41 p41Var;
        long j3;
        ud udVar2;
        int i13;
        int i14;
        xd xdVar = this;
        ud udVar3 = xdVar.f53199s1;
        ud udVar4 = xdVar.f53197r1;
        org.telegram.ui.Components.h6 h6Var = xdVar.A0;
        RelativeSizeSpan relativeSizeSpan = xdVar.f53206y0;
        org.telegram.ui.Components.h6 h6Var2 = xdVar.f53207z0;
        ud udVar5 = xdVar.f53195q1;
        if (z10) {
            udVar5.f51909a = true;
            long j10 = tL_starsRevenueStatus.available_balance.amount;
            udVar5.d = j10;
            double d = j10 / 1.0E9d;
            udVar5.f51912e = (long) (xdVar.f53184h1 * d * 100.0d);
            if (xdVar.f53177a1 == null) {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                decimalFormatSymbols.setDecimalSeparator('.');
                udVar2 = udVar3;
                DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                xdVar.f53177a1 = decimalFormat;
                decimalFormat.setMinimumFractionDigits(2);
                i13 = 6;
                xdVar.f53177a1.setMaximumFractionDigits(6);
                xdVar.f53177a1.setGroupingUsed(false);
            } else {
                udVar2 = udVar3;
                i13 = 6;
            }
            DecimalFormat decimalFormat2 = xdVar.f53177a1;
            if (d > 1.5d) {
                i13 = 2;
            }
            decimalFormat2.setMaximumFractionDigits(i13);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(K("TON " + xdVar.f53177a1.format(d), h6Var2.getPaint(), 0.9f, 0.0f, true));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(relativeSizeSpan, indexOf, spannableStringBuilder.length(), 33);
            }
            h6Var2.setText(spannableStringBuilder);
            h6Var.setText("≈" + org.telegram.messenger.r1.i().f(j3, "USD"));
            udVar5.f51913f = "USD";
            udVar4.f51909a = true;
            long j11 = tL_starsRevenueStatus.current_balance.amount;
            udVar4.d = j11;
            xdVar = this;
            double d2 = xdVar.f53184h1;
            udVar4.f51912e = (long) ((j11 / 1.0E9d) * d2 * 100.0d);
            udVar4.f51913f = "USD";
            ud udVar6 = udVar2;
            udVar6.f51909a = true;
            long j12 = tL_starsRevenueStatus.overall_revenue.amount;
            udVar6.d = j12;
            udVar6.f51912e = (long) ((j12 / 1.0E9d) * d2 * 100.0d);
            udVar6.f51913f = "USD";
            xdVar.f53193p1 = true;
            if (tL_starsRevenueStatus.available_balance.amount > 0 && tL_starsRevenueStatus.withdrawal_enabled) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            xdVar.B0.setVisibility(i14);
        } else {
            double d10 = xdVar.f53185i1;
            if (d10 != 0.0d) {
                udVar5.f51914g = true;
                TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus.available_balance;
                udVar5.f51915i = starsAmount3;
                udVar5.f51916j = (long) (starsAmount3.amount * d10 * 100.0d);
                int i15 = tL_starsRevenueStatus.next_withdrawal_at;
                nd ndVar = xdVar.H0;
                if (h6Var2 == null || h6Var == null) {
                    udVar = udVar3;
                    i7 = 0;
                } else {
                    udVar = udVar3;
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(di.lb.a1(false, TextUtils.concat("XTR ", di.lb.M0(starsAmount3, 0.8f, ' ')), 1.0f, null));
                    int indexOf2 = TextUtils.indexOf(spannableStringBuilder2, ".");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2.setSpan(relativeSizeSpan, indexOf2, spannableStringBuilder2.length(), 33);
                    }
                    xdVar.E0 = starsAmount3;
                    xdVar.F0.setText(spannableStringBuilder2);
                    xdVar.G0.setText("≈" + org.telegram.messenger.r1.i().f((long) (xdVar.f53185i1 * starsAmount3.amount * 100.0d), "USD"));
                    if (starsAmount3.amount > 0) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    xdVar.L0.setVisibility(i12);
                    if (xdVar.N0) {
                        xdVar.M0 = true;
                        long j13 = starsAmount3.amount;
                        xdVar.O0 = j13;
                        String l10 = Long.toString(j13);
                        di.q qVar = xdVar.P0;
                        qVar.setText(l10);
                        qVar.setSelection(qVar.getText().length());
                        i7 = 0;
                        xdVar.M0 = false;
                        if (xdVar.O0 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        ndVar.setEnabled(z12);
                    } else {
                        i7 = 0;
                    }
                    hi.d dVar = xdVar.K0;
                    if (dVar != null) {
                        if (starsAmount3.amount > 0) {
                            z11 = 1;
                        } else {
                            z11 = i7;
                        }
                        dVar.setEnabled(z11);
                    }
                    xdVar.C0 = i15;
                    dd ddVar = xdVar.f53183g1;
                    org.telegram.messenger.g0.r(ddVar);
                    ddVar.run();
                }
                udVar5.f51913f = "USD";
                udVar4.f51914g = true;
                udVar4.f51915i = tL_starsRevenueStatus.current_balance;
                double d11 = xdVar.f53185i1;
                udVar4.f51916j = (long) (starsAmount.amount * d11 * 100.0d);
                udVar4.f51913f = "USD";
                ud udVar7 = udVar;
                udVar7.f51914g = true;
                udVar7.f51915i = tL_starsRevenueStatus.overall_revenue;
                udVar7.f51916j = (long) (starsAmount2.amount * d11 * 100.0d);
                udVar7.f51913f = "USD";
                xdVar.f53193p1 = true;
                LinearLayout linearLayout = xdVar.J0;
                if (linearLayout != null) {
                    if (tL_starsRevenueStatus.withdrawal_enabled) {
                        i11 = i7;
                    } else {
                        i11 = 8;
                    }
                    linearLayout.setVisibility(i11);
                }
                if (ndVar != null) {
                    if (tL_starsRevenueStatus.available_balance.amount <= 0) {
                        boolean z13 = org.telegram.messenger.r2.f26206a;
                        i10 = 8;
                    } else {
                        i10 = i7;
                    }
                    ndVar.setVisibility(i10);
                }
            } else {
                return;
            }
        }
        org.telegram.ui.Components.u41 u41Var = xdVar.Y0;
        if (u41Var != null && (p41Var = u41Var.f39892g3) != null) {
            p41Var.O(true);
        }
    }

    public View getTransactionTabs() {
        return this.f53178b1.d;
    }

    @Override
    public final void onAttachedToWindow() {
        f53175u1 = this;
        super.onAttachedToWindow();
        E();
    }

    @Override
    public final void onDetachedFromWindow() {
        f53175u1 = null;
        super.onDetachedFromWindow();
        org.telegram.ui.ActionBar.k kVar = this.f53186j1;
        if (kVar != null) {
            kVar.setCastShadows(true);
        }
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.f53186j1 = kVar;
    }

    public void setTabsPinnedChangedListener(Runnable runnable) {
        this.T0 = runnable;
    }

    @Override
    public final void updateColors() {
        try {
            di.q qVar = this.P0;
            if (qVar != null) {
                qVar.setHandlesColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29022mg, this.f53190o0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
