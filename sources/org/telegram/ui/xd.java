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
public final class xd extends org.telegram.ui.Components.gt0 implements org.telegram.ui.ActionBar.z5 {
    public static xd f51912u1;
    public static HashMap f51913v1;
    public final org.telegram.ui.Components.h6 A0;
    public final gi.d B0;
    public int C0;
    public final ci.q D0;
    public TL_stars.StarsAmount E0;
    public final org.telegram.ui.Components.h6 F0;
    public final org.telegram.ui.Components.h6 G0;
    public final nd H0;
    public final org.telegram.ui.Components.wp[] I0;
    public final LinearLayout J0;
    public final gi.d K0;
    public final ci.r L0;
    public boolean M0;
    public boolean N0;
    public long O0;
    public final ci.s P0;
    public org.telegram.ui.Components.ac Q0;
    public boolean R0;
    public int S0;
    public Runnable T0;
    public final ai.x2 U0;
    public int V0;
    public int W0;
    public int X0;
    public final org.telegram.ui.Components.l41 Y0;
    public final FrameLayout Z0;
    public DecimalFormat f51914a1;
    public final td f51915b1;
    public final boolean f51916c1;
    public final boolean f51917d1;
    public final pi.q f51918e1;
    public SpannableStringBuilder f51919f1;
    public final dd f51920g1;
    public double f51921h1;
    public double f51922i1;
    public org.telegram.ui.ActionBar.k f51923j1;
    public boolean k1;
    public boolean f51924l1;
    public d41 m1;
    public final r41 f51925n0;
    public d41 f51926n1;
    public final org.telegram.ui.ActionBar.e6 f51927o0;
    public d41 f51928o1;
    public final int f51929p0;
    public boolean f51930p1;
    public final long f51931q0;
    public final ud f51932q1;
    public TL_stories.TL_premium_boostsStatus f51933r0;
    public final ud f51934r1;
    public int f51935s0;
    public final ud f51936s1;
    public final SpannableStringBuilder f51937t0;
    public final cd f51938t1;
    public final SpannableStringBuilder f51939u0;
    public final SpannableStringBuilder f51940v0;
    public final SpannableStringBuilder f51941w0;
    public final ci.q f51942x0;
    public final RelativeSizeSpan f51943y0;
    public final org.telegram.ui.Components.h6 f51944z0;

    public xd(Activity activity, r41 r41Var, int i3, long j10, org.telegram.ui.ActionBar.e6 e6Var, pi.q qVar, boolean z10, boolean z11) {
        super(activity);
        this.E0 = TL_stars.StarsAmount.ofStars(0L);
        this.I0 = new org.telegram.ui.Components.wp[1];
        this.M0 = false;
        this.N0 = true;
        this.R0 = true;
        this.S0 = -1;
        this.k1 = false;
        this.f51924l1 = false;
        this.f51930p1 = false;
        String M0 = org.telegram.messenger.bd.M0(2131748392, null);
        ud udVar = new ud();
        udVar.f50051a = false;
        udVar.f50052b = "TON";
        udVar.h = "XTR";
        udVar.f50053c = M0;
        this.f51932q1 = udVar;
        String M02 = org.telegram.messenger.bd.M0(2131748391, null);
        ud udVar2 = new ud();
        udVar2.f50051a = false;
        udVar2.f50052b = "TON";
        udVar2.h = "XTR";
        udVar2.f50053c = M02;
        this.f51934r1 = udVar2;
        String M03 = org.telegram.messenger.bd.M0(2131748390, null);
        ud udVar3 = new ud();
        udVar3.f50051a = false;
        udVar3.f50052b = "TON";
        udVar3.h = "XTR";
        udVar3.f50053c = M03;
        this.f51936s1 = udVar3;
        this.f51938t1 = new cd(this, 7);
        this.f51918e1 = qVar;
        this.f51916c1 = z10;
        this.f51917d1 = z11;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.f51914a1 = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        this.f51914a1.setMaximumFractionDigits(12);
        this.f51914a1.setGroupingUsed(false);
        this.f51925n0 = r41Var;
        this.f51927o0 = e6Var;
        this.f51929p0 = i3;
        this.f51931q0 = j10;
        long j11 = -j10;
        TLRPC.Chat M04 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(j11));
        if (M04 != null) {
            this.f51935s0 = M04.level;
        }
        org.telegram.messenger.hp.s1(i3).G0().a(j10, new s3(this, 2));
        H(false);
        if (z10) {
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.k6.I.q();
            tL_payments_getStarsRevenueStats.ton = true;
            tL_payments_getStarsRevenueStats.peer = org.telegram.messenger.hp.s1(i3).j1(j10);
            TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(i3).N0(j11);
            if (N0 != null) {
                boolean z12 = N0.restricted_sponsored;
                this.k1 = z12;
                this.f51924l1 = z12;
            }
            ConnectionsManager.getInstance(i3).sendRequest(tL_payments_getStarsRevenueStats, new jd(this, 1), null, null, 0, Integer.MAX_VALUE, 1, true);
        }
        TLRPC.Chat M05 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(j11));
        this.f51937t0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(org.telegram.messenger.bd.a0(null, null, 2131748407, 50), -1, 3, new p1(r41Var, activity, e6Var, 12), e6Var), true);
        this.f51939u0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(org.telegram.messenger.hp.s1(i3).I5 ? 2131748413 : 2131748411, null), -1, 3, new cd(this, 0), null), true);
        this.f51940v0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0((z11 && z10) ? 2131748387 : z11 ? 2131748389 : 2131748385, null), -1, 3, new dd(this, (z11 && z10) ? 2131748386 : z11 ? 2131748388 : 2131748384, 0), e6Var), true);
        this.f51941w0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(org.telegram.messenger.t3.V(M05) ? 2131748380 : 2131748379, null), new cd(this, 1)), true);
        setCommonInsetsManagedExternally(true);
        setGeometry(new f(this, 11));
        this.U0 = new ai.x2(26, activity, this);
        td tdVar = new td(this, activity, i3, j10, r41Var.getClassGuid(), new cd(this, 2), e6Var);
        this.f51915b1 = tdVar;
        ci.q qVar2 = new ci.q(activity, 3);
        this.f51942x0 = qVar2;
        qVar2.setOrientation(1);
        int i10 = org.telegram.ui.ActionBar.k6.f27878d6;
        org.telegram.ui.ActionBar.r6.i(i10, qVar2, e6Var);
        qVar2.setPadding(0, 0, 0, org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(activity, false, true, true);
        this.f51944z0 = h6Var;
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.Z(h6Var, i11, e6Var);
        h6Var.setTextSize(org.telegram.messenger.g0.L(32.0f));
        h6Var.setGravity(17);
        this.f51943y0 = new RelativeSizeSpan(0.6770833f);
        qVar2.addView(h6Var, b8.mf.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(activity, true, true, true);
        this.A0 = h6Var2;
        h6Var2.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.k6.f28273y6;
        org.telegram.ui.ActionBar.r6.Z(h6Var2, i12, e6Var);
        h6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        qVar2.addView(h6Var2, b8.mf.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        gi.d dVar = new gi.d(activity, e6Var, true);
        dVar.setRoundRadius(24);
        this.B0 = dVar;
        dVar.setEnabled(org.telegram.messenger.hp.s1(i3).I5);
        dVar.i(org.telegram.messenger.bd.M0(2131748359, null), false, true);
        dVar.setVisibility(8);
        dVar.setOnClickListener(new org.telegram.messenger.video.g(13, this, r41Var));
        qVar2.addView(dVar, b8.mf.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        ci.q qVar3 = new ci.q(activity, 4);
        this.D0 = qVar3;
        qVar3.setOrientation(1);
        org.telegram.ui.ActionBar.r6.i(i10, qVar3, e6Var);
        qVar3.setPadding(0, 0, 0, org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.Components.h6 h6Var3 = new org.telegram.ui.Components.h6(activity, false, true, true);
        this.F0 = h6Var3;
        h6Var3.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.Z(h6Var3, i11, e6Var);
        h6Var3.setTextSize(org.telegram.messenger.g0.L(32.0f));
        h6Var3.setGravity(17);
        new RelativeSizeSpan(0.6770833f);
        qVar3.addView(h6Var3, b8.mf.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.h6 h6Var4 = new org.telegram.ui.Components.h6(activity, true, true, true);
        this.G0 = h6Var4;
        h6Var4.setGravity(17);
        org.telegram.ui.ActionBar.r6.Z(h6Var4, i12, e6Var);
        h6Var4.setTextSize(org.telegram.messenger.g0.L(14.0f));
        qVar3.addView(h6Var4, b8.mf.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        ci.r rVar = new ci.r(1, activity, this);
        this.L0 = rVar;
        rVar.setVisibility(8);
        rVar.setText(org.telegram.messenger.bd.M0(2131752953, null));
        rVar.setLeftPadding(org.telegram.messenger.g0.L(36.0f));
        ci.s sVar = new ci.s(activity, 3);
        this.P0 = sVar;
        sVar.setFocusable(false);
        org.telegram.ui.ActionBar.r6.V(sVar, i11, e6Var);
        sVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        sVar.setCursorWidth(1.5f);
        sVar.setBackground(null);
        sVar.setTextSize(1, 18.0f);
        sVar.setMaxLines(1);
        int L = org.telegram.messenger.g0.L(16.0f);
        sVar.setPadding(org.telegram.messenger.g0.L(6.0f), L, L, L);
        sVar.setInputType(2);
        sVar.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.r6.D(sVar, org.telegram.ui.ActionBar.k6.ig, e6Var);
        org.telegram.ui.ActionBar.r6.m(sVar, 36, org.telegram.ui.ActionBar.k6.f27998jg, e6Var);
        sVar.setGravity(org.telegram.messenger.bd.f21784a0 ? 5 : 3);
        sVar.setOnFocusChangeListener(new ed(this, 0));
        sVar.addTextChangedListener(new md(this));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232750);
        linearLayout.addView(imageView, b8.mf.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(sVar, b8.mf.p(-1, -2, 1.0f, 119));
        rVar.e(sVar);
        rVar.addView(linearLayout, b8.mf.e(-1, -2, 48));
        qVar3.addView(rVar, b8.mf.t(-1, -2, 1, 18, 14, 18, 2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.J0 = linearLayout2;
        linearLayout2.setOrientation(0);
        ?? dVar2 = new gi.d(activity, e6Var, true);
        dVar2.setRoundRadius(24);
        this.H0 = dVar2;
        dVar2.setEnabled(false);
        dVar2.i(org.telegram.messenger.bd.G(0, "MonetizationStarsWithdraw", new Object[0]), false, true);
        dVar2.setVisibility(0);
        dVar2.setOnClickListener(new ai.h3(this, i3, r41Var, 6));
        gi.d dVar3 = new gi.d(activity, e6Var, true);
        dVar3.setRoundRadius(24);
        this.K0 = dVar3;
        dVar3.setEnabled(false);
        dVar3.i(org.telegram.messenger.bd.M0(2131748382, null), false, true);
        dVar3.setOnClickListener(new gd(this, i3, j10, activity));
        linearLayout2.addView((View) dVar2, b8.mf.p(-1, 48, 1.0f, 119));
        if (org.telegram.messenger.t3.V(M05)) {
            linearLayout2.addView(new Space(activity), b8.mf.p(8, 48, 0.0f, 119));
            linearLayout2.addView(dVar3, b8.mf.p(-1, 48, 1.0f, 119));
        }
        qVar3.addView(linearLayout2, b8.mf.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        sVar.setOnEditorActionListener(new ld(0, this, r41Var));
        this.f51920g1 = new dd(this, i3, 2);
        org.telegram.ui.Components.l41 l41Var = new org.telegram.ui.Components.l41(r41Var, new c5(this, 2), new bd(this), new org.telegram.messenger.go(this, 17));
        this.Y0 = l41Var;
        kg.f0 f0Var = new kg.f0(5, this, false);
        l41Var.f35593f3 = f0Var;
        l41Var.setLayoutManager(f0Var);
        l41Var.setClipToPadding(false);
        l41Var.r1();
        l41Var.setCaptureSectionsDecoratorAllowed(true);
        l41Var.f35594g3.f33698r = false;
        u(l41Var, new bd(this));
        x(tdVar, tdVar.f49776b, new org.telegram.messenger.go(16));
        View view = tdVar.d;
        y(view);
        view.setLayoutParams(b8.mf.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        if (qVar != null) {
            qVar.b(l41Var);
        }
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.Z0 = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27824a7, frameLayout, e6Var);
        frameLayout.addView(e10, b8.mf.e(-2, -2, 17));
        ?? imageView2 = new ImageView(activity);
        imageView2.setAutoRepeat(true);
        imageView2.f(2131624228, 120, 120, null);
        imageView2.d();
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i13 = org.telegram.ui.ActionBar.k6.Cj;
        org.telegram.ui.ActionBar.r6.V(textView, i13, null);
        textView.setTag(Integer.valueOf(i13));
        textView.setText(org.telegram.messenger.bd.M0(2131748785, "LoadingStats"));
        textView.setGravity(1);
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 15.0f);
        int i14 = org.telegram.ui.ActionBar.k6.Dj;
        org.telegram.ui.ActionBar.r6.V(textView2, i14, null);
        textView2.setTag(Integer.valueOf(i14));
        textView2.setText(org.telegram.messenger.bd.M0(2131748784, null));
        textView2.setGravity(1);
        e10.addView((View) imageView2, b8.mf.t(120, 120, 1, 0, 0, 0, 20));
        e10.addView(textView, b8.mf.t(-2, -2, 1, 0, 0, 0, 10));
        e10.addView(textView2, b8.mf.r(-2, -2, 1));
        addView(frameLayout, b8.mf.e(-1, -1, 119));
    }

    public static org.telegram.ui.ActionBar.t2 I(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context, e6Var, false);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231612);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(80.0f);
        int i18 = org.telegram.ui.ActionBar.k6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.w0(i18, e6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i18);
        imageView.setBackground(L2);
        org.telegram.ui.ActionBar.r6.k(imageView, L2, N, null, e6Var);
        f10.addView(imageView, b8.mf.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        k2.p1.t(textView, 1, 20.0f);
        int i19 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i19, e6Var);
        if (z10) {
            i3 = 2131753035;
        } else {
            i3 = 2131748397;
        }
        textView.setText(org.telegram.messenger.bd.M0(i3, null));
        f10.addView(textView, b8.mf.k(8.0f, 0.0f, 8.0f, 25.0f, -1, -2));
        if (z10) {
            i10 = 2131753044;
        } else {
            i10 = 2131748406;
        }
        String M0 = org.telegram.messenger.bd.M0(i10, null);
        if (z10) {
            i11 = 2131753043;
        } else {
            i11 = 2131748405;
        }
        f10.addView(new ai.d2(context, 2131232088, M0, org.telegram.messenger.bd.M0(i11, null), e6Var), b8.mf.t(-1, -2, 49, 8, 0, 8, 16));
        if (z10) {
            i12 = 2131753042;
        } else {
            i12 = 2131748404;
        }
        String M02 = org.telegram.messenger.bd.M0(i12, null);
        if (z10) {
            i13 = 2131753041;
        } else {
            i13 = 2131748403;
        }
        f10.addView(new ai.d2(context, 2131231814, M02, org.telegram.messenger.bd.M0(i13, null), e6Var), b8.mf.t(-1, -2, 49, 8, 0, 8, 16));
        if (z10) {
            i14 = 2131753040;
        } else {
            i14 = 2131748402;
        }
        String M03 = org.telegram.messenger.bd.M0(i14, null);
        if (z10) {
            i15 = 2131753039;
        } else {
            i15 = 2131748401;
        }
        f10.addView(new ai.d2(context, 2131231824, M03, org.telegram.messenger.bd.M0(i15, null), e6Var), b8.mf.t(-1, -2, 49, 8, 0, 8, 16));
        View view = new View(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27879d7, view, e6Var);
        f10.addView(view, b8.mf.n(1.0f / org.telegram.messenger.g0.f22607p, -1, 55, 12, 0, 12, 0));
        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(context);
        o5Var.setGravity(17);
        o5Var.setTextSize(1, 20.0f);
        o5Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.V(o5Var, i19, e6Var);
        SpannableString spannableString = new SpannableString("💎");
        org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(2131231957, 0);
        wpVar.d = false;
        wpVar.I = 0.9f;
        wpVar.J = 0.9f;
        wpVar.b(o5Var.getPaint().getFontMetricsInt());
        wpVar.H = 0.9f;
        spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
        if (z10) {
            i16 = 2131753036;
        } else {
            i16 = 2131748398;
        }
        o5Var.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.bd.M0(i16, null), spannableString, "💎"));
        f10.addView(o5Var, b8.mf.k(8.0f, 20.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.s70 s70Var = new org.telegram.ui.Components.s70(context, e6Var);
        s70Var.setGravity(17);
        s70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(s70Var, i19, e6Var);
        org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.Uc, e6Var);
        if (z10) {
            i17 = 2131753037;
        } else {
            i17 = 2131748399;
        }
        s70Var.setText(org.telegram.messenger.g0.d4(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(i17, null)), new ci.e1(19, context, z10)));
        f10.addView(s70Var, b8.mf.k(28.0f, 9.0f, 28.0f, 0.0f, -1, -2));
        gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        h.i(org.telegram.messenger.bd.M0(2131749539, null), false, true);
        h.setOnClickListener(new fd(l10, 0));
        f10.addView(h, b8.mf.t(-1, 48, 55, 10, 25, 10, 14));
        l10.O = f10;
        return l10;
    }

    public static SpannableStringBuilder K(CharSequence charSequence, TextPaint textPaint, float f10, float f11, boolean z10) {
        int i3;
        if (f51913v1 == null) {
            f51913v1 = new HashMap();
        }
        int i10 = textPaint.getFontMetricsInt().bottom;
        if (z10) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        int i11 = ((i10 * i3) * ((int) (f10 * 100.0f))) - ((int) (100.0f * f11));
        SpannableString spannableString = (SpannableString) f51913v1.get(Integer.valueOf(i11));
        if (spannableString == null) {
            spannableString = new SpannableString("T");
            if (z10) {
                org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(2131231957, 0);
                wpVar.d = false;
                wpVar.I = f10;
                wpVar.J = f10;
                wpVar.a(org.telegram.ui.ActionBar.k6.f28081o6);
                wpVar.b(textPaint.getFontMetricsInt());
                wpVar.H = 0.9f;
                spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
            } else {
                org.telegram.ui.Components.wp wpVar2 = new org.telegram.ui.Components.wp(2131231955, 0);
                wpVar2.d = false;
                wpVar2.I = f10;
                wpVar2.J = f10;
                wpVar2.f40046s = f11;
                wpVar2.H = 0.95f;
                spannableString.setSpan(wpVar2, 0, spannableString.length(), 33);
            }
            f51913v1.put(Integer.valueOf(i11), spannableString);
        }
        return org.telegram.messenger.g0.M2(charSequence, spannableString, "TON");
    }

    public static void M(Context context, int i3, TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction, long j10, org.telegram.ui.ActionBar.e6 e6Var) {
        long j11;
        String M0;
        long j12;
        long j13;
        long j14;
        char c2;
        boolean z10;
        boolean z11;
        int i10;
        String str;
        String p10;
        TLRPC.Chat chat;
        org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context, e6Var, false);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        boolean z12 = broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal;
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            M0 = org.telegram.messenger.bd.M0(2131748369, null);
            j11 = 0;
            j12 = tL_broadcastRevenueTransactionWithdrawal.date;
            j13 = tL_broadcastRevenueTransactionWithdrawal.amount;
            boolean z13 = tL_broadcastRevenueTransactionWithdrawal.pending;
            z11 = tL_broadcastRevenueTransactionWithdrawal.failed;
            z10 = z13;
            j14 = 0;
            c2 = 65535;
        } else {
            j11 = 0;
            if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
                TL_stats.TL_broadcastRevenueTransactionProceeds tL_broadcastRevenueTransactionProceeds = (TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction;
                M0 = org.telegram.messenger.bd.M0(2131748371, null);
                j12 = tL_broadcastRevenueTransactionProceeds.from_date;
                j14 = tL_broadcastRevenueTransactionProceeds.to_date;
                j13 = tL_broadcastRevenueTransactionProceeds.amount;
            } else if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionRefund) {
                TL_stats.TL_broadcastRevenueTransactionRefund tL_broadcastRevenueTransactionRefund = (TL_stats.TL_broadcastRevenueTransactionRefund) broadcastRevenueTransaction;
                M0 = org.telegram.messenger.bd.M0(2131748370, null);
                j12 = tL_broadcastRevenueTransactionRefund.from_date;
                j13 = tL_broadcastRevenueTransactionRefund.amount;
                j14 = 0;
            } else {
                return;
            }
            c2 = 1;
            z10 = false;
            z11 = false;
        }
        long j15 = j13;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        org.telegram.messenger.camera.q.m(textView, 1, 18.0f);
        if (c2 < 0) {
            i10 = org.telegram.ui.ActionBar.k6.f28122q7;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f28028l8;
        }
        org.telegram.ui.ActionBar.r6.V(textView, i10, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (c2 < 0) {
            str = "-";
        } else {
            str = "+";
        }
        spannableStringBuilder.append((CharSequence) str);
        long j16 = j12;
        spannableStringBuilder.append((CharSequence) decimalFormat.format(Math.round((Math.abs(j15) / 1.0E9d) * 100000.0d) / 100000.0d));
        spannableStringBuilder.append((CharSequence) " TON");
        int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.3333334f), 0, indexOf, 33);
        }
        textView.setText(spannableStringBuilder);
        f10.addView(textView, b8.mf.t(-1, -2, 49, 0, 24, 0, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28273y6, e6Var);
        if (z10) {
            textView2.setText(org.telegram.messenger.bd.M0(2131748366, null));
        } else if (j16 == j11) {
            textView2.setText(org.telegram.messenger.bd.Q(j14));
        } else if (j14 == j11) {
            textView2.setText(org.telegram.messenger.bd.Q(j16));
        } else {
            textView2.setText(org.telegram.messenger.bd.Q(j16) + " - " + org.telegram.messenger.bd.Q(j14));
        }
        if (z11) {
            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28122q7, e6Var);
            textView2.setText(TextUtils.concat(textView2.getText(), " — ", org.telegram.messenger.bd.M0(2131748367, null)));
        }
        f10.addView(textView2, b8.mf.t(-1, -2, 49, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        textView3.setGravity(17);
        org.telegram.messenger.camera.q.m(textView3, 1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.G6, e6Var);
        textView3.setText(M0);
        f10.addView(textView3, b8.mf.t(-1, -2, 49, 0, 27, 0, 0));
        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
            FrameLayout frameLayout = new FrameLayout(context);
            int L = org.telegram.messenger.g0.L(28.0f);
            int L2 = org.telegram.messenger.g0.L(28.0f);
            int i11 = org.telegram.ui.ActionBar.k6.Qi;
            ShapeDrawable e02 = org.telegram.ui.ActionBar.k6.e0(L, L2, org.telegram.ui.ActionBar.k6.w0(i11, e6Var));
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
            frameLayout.setBackground(e02);
            org.telegram.ui.ActionBar.r6.k(frameLayout, e02, N, null, e6Var);
            if (j10 < j11) {
                TLRPC.Chat M02 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(-j10));
                if (M02 == null) {
                    p10 = "";
                    chat = M02;
                } else {
                    p10 = M02.title;
                    chat = M02;
                }
            } else {
                TLRPC.User a22 = org.telegram.messenger.hp.s1(i3).a2(Long.valueOf(j10));
                p10 = org.telegram.messenger.l10.p(a22);
                chat = a22;
            }
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
            k9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
            org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
            u8Var.l(chat);
            k9Var.e(chat, u8Var);
            frameLayout.addView(k9Var, b8.mf.e(28, 28, 51));
            TextView textView4 = new TextView(context);
            org.telegram.ui.ActionBar.r6.V(textView4, org.telegram.ui.ActionBar.k6.f27988j5, e6Var);
            textView4.setTextSize(1, 13.0f);
            textView4.setSingleLine();
            textView4.setText(p10);
            frameLayout.addView(textView4, b8.mf.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
            f10.addView(frameLayout, b8.mf.t(-2, 28, 1, 42, 10, 42, 0));
        }
        gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal2 = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            if ((tL_broadcastRevenueTransactionWithdrawal2.flags & 2) != 0) {
                h.i(org.telegram.messenger.bd.M0(2131748368, null), false, true);
                h.setOnClickListener(new org.telegram.messenger.video.g(14, context, tL_broadcastRevenueTransactionWithdrawal2));
                f10.addView(h, b8.mf.t(-1, 48, 55, 18, 30, 18, 14));
                l10.O = f10;
                l10.show();
            }
        }
        h.i(org.telegram.messenger.bd.M0(2131747839, null), false, true);
        h.setOnClickListener(new fd(l10, 1));
        f10.addView(h, b8.mf.t(-1, 48, 55, 18, 30, 18, 14));
        l10.O = f10;
        l10.show();
    }

    public final void D(TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats) {
        boolean z10;
        FrameLayout frameLayout;
        ng.b bVar;
        ArrayList arrayList;
        if (this.f51928o1 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f51922i1 = tL_payments_starsRevenueStats.usd_rate;
        d41 i02 = r41.i0(tL_payments_starsRevenueStats.revenue_graph, org.telegram.messenger.bd.M0(2131748408, null), 2, false);
        this.f51928o1 = i02;
        if (i02 != null && (bVar = i02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.f51928o1.d.d.get(0) != null) {
            ((ng.a) this.f51928o1.d.d.get(0)).f20371g = org.telegram.ui.ActionBar.k6.Yj;
            this.f51928o1.d.h = (float) ((1.0d / this.f51922i1) / 100.0d);
        }
        L(false, tL_payments_starsRevenueStats.status);
        if (!this.f51916c1 && (frameLayout = this.Z0) != null) {
            frameLayout.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.xq.h).withEndAction(new cd(this, 6)).start();
        }
        org.telegram.ui.Components.l41 l41Var = this.Y0;
        if (l41Var != null) {
            l41Var.f35594g3.O(!z10);
            if (z10) {
                l41Var.v0(0);
            }
        }
    }

    public final void E() {
        if (isAttachedToWindow() && this.f51916c1 && this.f51930p1 && org.telegram.messenger.hp.e1().getBoolean("monetizationadshint", true)) {
            this.f51925n0.showDialog(I(getContext(), this.f51927o0, false));
            org.telegram.messenger.hp.e1().edit().putBoolean("monetizationadshint", false).apply();
        }
    }

    public final void F(boolean z10, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        r41 r41Var = this.f51925n0;
        if (r41Var != null) {
            Activity parentActivity = r41Var.getParentActivity();
            int i3 = this.f51929p0;
            TLRPC.User f10 = org.telegram.messenger.h10.i(i3).f();
            if (parentActivity != null && f10 != null) {
                long j10 = this.f51931q0;
                if (z10) {
                    tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                    tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
                    tL_payments_getStarsRevenueWithdrawalUrl.peer = org.telegram.messenger.hp.s1(i3).j1(j10);
                    if (inputCheckPasswordSRP == null) {
                        inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                    }
                    tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
                    tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
                    tL_payments_getStarsRevenueWithdrawalUrl.amount = this.O0;
                } else {
                    tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                    tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
                    tL_payments_getStarsRevenueWithdrawalUrl.peer = org.telegram.messenger.hp.s1(i3).j1(j10);
                    if (inputCheckPasswordSRP == null) {
                        inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                    }
                    tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
                }
                ConnectionsManager.getInstance(i3).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new ci.o3(this, twoStepVerificationActivity, parentActivity, z10));
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
        if (!this.f51917d1) {
            return;
        }
        int i3 = this.f51929p0;
        ci.i0 g7 = ci.i0.g(i3);
        long j10 = this.f51931q0;
        TLRPC.TL_payments_starsRevenueStats h = g7.h(j10, z10);
        if (h != null) {
            org.telegram.messenger.g0.h3(new sc(3, this, h));
            return;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.peer = org.telegram.messenger.hp.s1(i3).j1(j10);
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.k6.I.q();
        ConnectionsManager.getInstance(i3).sendRequest(tL_payments_getStarsRevenueStats, new jd(this, 2));
    }

    public final void J() {
        td tdVar = this.f51915b1;
        cd cdVar = tdVar.f49779f;
        boolean[] zArr = tdVar.f49783w;
        boolean a10 = tdVar.a();
        for (int i3 = 0; i3 < 2; i3++) {
            if (!zArr[i3]) {
                if (i3 == 1) {
                    tdVar.f49780n.clear();
                    tdVar.h = "";
                } else {
                    tdVar.f49781r.clear();
                    tdVar.f49782s = "";
                }
                zArr[i3] = false;
                tdVar.c(i3);
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
        int i3;
        TL_stars.StarsAmount starsAmount;
        TL_stars.StarsAmount starsAmount2;
        int i10;
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.f41 f41Var;
        long j10;
        ud udVar2;
        int i13;
        int i14;
        xd xdVar = this;
        ud udVar3 = xdVar.f51936s1;
        ud udVar4 = xdVar.f51934r1;
        org.telegram.ui.Components.h6 h6Var = xdVar.A0;
        RelativeSizeSpan relativeSizeSpan = xdVar.f51943y0;
        org.telegram.ui.Components.h6 h6Var2 = xdVar.f51944z0;
        ud udVar5 = xdVar.f51932q1;
        if (z10) {
            udVar5.f50051a = true;
            long j11 = tL_starsRevenueStatus.available_balance.amount;
            udVar5.d = j11;
            double d = j11 / 1.0E9d;
            udVar5.f50054e = (long) (xdVar.f51921h1 * d * 100.0d);
            if (xdVar.f51914a1 == null) {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                decimalFormatSymbols.setDecimalSeparator('.');
                udVar2 = udVar3;
                DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                xdVar.f51914a1 = decimalFormat;
                decimalFormat.setMinimumFractionDigits(2);
                i13 = 6;
                xdVar.f51914a1.setMaximumFractionDigits(6);
                xdVar.f51914a1.setGroupingUsed(false);
            } else {
                udVar2 = udVar3;
                i13 = 6;
            }
            DecimalFormat decimalFormat2 = xdVar.f51914a1;
            if (d > 1.5d) {
                i13 = 2;
            }
            decimalFormat2.setMaximumFractionDigits(i13);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(K("TON " + xdVar.f51914a1.format(d), h6Var2.getPaint(), 0.9f, 0.0f, true));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(relativeSizeSpan, indexOf, spannableStringBuilder.length(), 33);
            }
            h6Var2.setText(spannableStringBuilder);
            h6Var.setText("≈" + org.telegram.messenger.r1.i().f(j10, "USD"));
            udVar5.f50055f = "USD";
            udVar4.f50051a = true;
            long j12 = tL_starsRevenueStatus.current_balance.amount;
            udVar4.d = j12;
            xdVar = this;
            double d10 = xdVar.f51921h1;
            udVar4.f50054e = (long) ((j12 / 1.0E9d) * d10 * 100.0d);
            udVar4.f50055f = "USD";
            ud udVar6 = udVar2;
            udVar6.f50051a = true;
            long j13 = tL_starsRevenueStatus.overall_revenue.amount;
            udVar6.d = j13;
            udVar6.f50054e = (long) ((j13 / 1.0E9d) * d10 * 100.0d);
            udVar6.f50055f = "USD";
            xdVar.f51930p1 = true;
            if (tL_starsRevenueStatus.available_balance.amount > 0 && tL_starsRevenueStatus.withdrawal_enabled) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            xdVar.B0.setVisibility(i14);
        } else {
            double d11 = xdVar.f51922i1;
            if (d11 != 0.0d) {
                udVar5.f50056g = true;
                TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus.available_balance;
                udVar5.f50057i = starsAmount3;
                udVar5.f50058j = (long) (starsAmount3.amount * d11 * 100.0d);
                int i15 = tL_starsRevenueStatus.next_withdrawal_at;
                nd ndVar = xdVar.H0;
                if (h6Var2 == null || h6Var == null) {
                    udVar = udVar3;
                    i3 = 0;
                } else {
                    udVar = udVar3;
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(ci.wb.a1(false, TextUtils.concat("XTR ", ci.wb.M0(starsAmount3, 0.8f, ' ')), 1.0f, null));
                    int indexOf2 = TextUtils.indexOf(spannableStringBuilder2, ".");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2.setSpan(relativeSizeSpan, indexOf2, spannableStringBuilder2.length(), 33);
                    }
                    xdVar.E0 = starsAmount3;
                    xdVar.F0.setText(spannableStringBuilder2);
                    xdVar.G0.setText("≈" + org.telegram.messenger.r1.i().f((long) (xdVar.f51922i1 * starsAmount3.amount * 100.0d), "USD"));
                    if (starsAmount3.amount > 0) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    xdVar.L0.setVisibility(i12);
                    if (xdVar.N0) {
                        xdVar.M0 = true;
                        long j14 = starsAmount3.amount;
                        xdVar.O0 = j14;
                        String l10 = Long.toString(j14);
                        ci.s sVar = xdVar.P0;
                        sVar.setText(l10);
                        sVar.setSelection(sVar.getText().length());
                        i3 = 0;
                        xdVar.M0 = false;
                        if (xdVar.O0 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        ndVar.setEnabled(z12);
                    } else {
                        i3 = 0;
                    }
                    gi.d dVar = xdVar.K0;
                    if (dVar != null) {
                        if (starsAmount3.amount > 0) {
                            z11 = 1;
                        } else {
                            z11 = i3;
                        }
                        dVar.setEnabled(z11);
                    }
                    xdVar.C0 = i15;
                    dd ddVar = xdVar.f51920g1;
                    org.telegram.messenger.g0.r(ddVar);
                    ddVar.run();
                }
                udVar5.f50055f = "USD";
                udVar4.f50056g = true;
                udVar4.f50057i = tL_starsRevenueStatus.current_balance;
                double d12 = xdVar.f51922i1;
                udVar4.f50058j = (long) (starsAmount.amount * d12 * 100.0d);
                udVar4.f50055f = "USD";
                ud udVar7 = udVar;
                udVar7.f50056g = true;
                udVar7.f50057i = tL_starsRevenueStatus.overall_revenue;
                udVar7.f50058j = (long) (starsAmount2.amount * d12 * 100.0d);
                udVar7.f50055f = "USD";
                xdVar.f51930p1 = true;
                LinearLayout linearLayout = xdVar.J0;
                if (linearLayout != null) {
                    if (tL_starsRevenueStatus.withdrawal_enabled) {
                        i11 = i3;
                    } else {
                        i11 = 8;
                    }
                    linearLayout.setVisibility(i11);
                }
                if (ndVar != null) {
                    if (tL_starsRevenueStatus.available_balance.amount <= 0) {
                        boolean z13 = org.telegram.messenger.r2.f25040a;
                        i10 = 8;
                    } else {
                        i10 = i3;
                    }
                    ndVar.setVisibility(i10);
                }
            } else {
                return;
            }
        }
        org.telegram.ui.Components.l41 l41Var = xdVar.Y0;
        if (l41Var != null && (f41Var = l41Var.f35594g3) != null) {
            f41Var.O(true);
        }
    }

    public View getTransactionTabs() {
        return this.f51915b1.d;
    }

    @Override
    public final void onAttachedToWindow() {
        f51912u1 = this;
        super.onAttachedToWindow();
        E();
    }

    @Override
    public final void onDetachedFromWindow() {
        f51912u1 = null;
        super.onDetachedFromWindow();
        org.telegram.ui.ActionBar.k kVar = this.f51923j1;
        if (kVar != null) {
            kVar.setCastShadows(true);
        }
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.f51923j1 = kVar;
    }

    public void setTabsPinnedChangedListener(Runnable runnable) {
        this.T0 = runnable;
    }

    @Override
    public final void updateColors() {
        try {
            ci.s sVar = this.P0;
            if (sVar != null) {
                sVar.setHandlesColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27998jg, this.f51927o0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
