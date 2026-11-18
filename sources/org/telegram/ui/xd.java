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
public final class xd extends org.telegram.ui.Components.qt0 implements org.telegram.ui.ActionBar.c6 {
    public static xd f53784u1;
    public static HashMap f53785v1;
    public final org.telegram.ui.Components.n6 A0;
    public final hi.d B0;
    public int C0;
    public final ai.r2 D0;
    public TL_stars.StarsAmount E0;
    public final org.telegram.ui.Components.n6 F0;
    public final org.telegram.ui.Components.n6 G0;
    public final nd H0;
    public final org.telegram.ui.Components.lq[] I0;
    public final LinearLayout J0;
    public final hi.d K0;
    public final di.p L0;
    public boolean M0;
    public boolean N0;
    public long O0;
    public final di.q P0;
    public org.telegram.ui.Components.gc Q0;
    public boolean R0;
    public int S0;
    public Runnable T0;
    public final bi.i3 U0;
    public int V0;
    public int W0;
    public int X0;
    public final org.telegram.ui.Components.e51 Y0;
    public final FrameLayout Z0;
    public DecimalFormat f53786a1;
    public final td f53787b1;
    public final boolean f53788c1;
    public final boolean f53789d1;
    public final ri.q f53790e1;
    public SpannableStringBuilder f53791f1;
    public final dd f53792g1;
    public double f53793h1;
    public double f53794i1;
    public org.telegram.ui.ActionBar.k f53795j1;
    public boolean f53796k1;
    public boolean l1;
    public o41 f53797m1;
    public final c51 f53798n0;
    public o41 n1;
    public final org.telegram.ui.ActionBar.i6 f53799o0;
    public o41 f53800o1;
    public final int f53801p0;
    public boolean f53802p1;
    public final long f53803q0;
    public final ud f53804q1;
    public TL_stories.TL_premium_boostsStatus f53805r0;
    public final ud f53806r1;
    public int f53807s0;
    public final ud f53808s1;
    public final SpannableStringBuilder f53809t0;
    public final cd f53810t1;
    public final SpannableStringBuilder f53811u0;
    public final SpannableStringBuilder f53812v0;
    public final SpannableStringBuilder f53813w0;
    public final ai.r2 f53814x0;
    public final RelativeSizeSpan f53815y0;
    public final org.telegram.ui.Components.n6 f53816z0;

    public xd(Activity activity, c51 c51Var, int i7, long j3, org.telegram.ui.ActionBar.i6 i6Var, ri.q qVar, boolean z10, boolean z11) {
        super(activity);
        this.E0 = TL_stars.StarsAmount.ofStars(0L);
        this.I0 = new org.telegram.ui.Components.lq[1];
        this.M0 = false;
        this.N0 = true;
        this.R0 = true;
        this.S0 = -1;
        this.f53796k1 = false;
        this.l1 = false;
        this.f53802p1 = false;
        String M0 = org.telegram.messenger.gd.M0(2131748192, null);
        ud udVar = new ud();
        udVar.f52529a = false;
        udVar.f52530b = "TON";
        udVar.h = "XTR";
        udVar.f52531c = M0;
        this.f53804q1 = udVar;
        String M02 = org.telegram.messenger.gd.M0(2131748191, null);
        ud udVar2 = new ud();
        udVar2.f52529a = false;
        udVar2.f52530b = "TON";
        udVar2.h = "XTR";
        udVar2.f52531c = M02;
        this.f53806r1 = udVar2;
        String M03 = org.telegram.messenger.gd.M0(2131748190, null);
        ud udVar3 = new ud();
        udVar3.f52529a = false;
        udVar3.f52530b = "TON";
        udVar3.h = "XTR";
        udVar3.f52531c = M03;
        this.f53808s1 = udVar3;
        this.f53810t1 = new cd(this, 7);
        this.f53790e1 = qVar;
        this.f53788c1 = z10;
        this.f53789d1 = z11;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.f53786a1 = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        this.f53786a1.setMaximumFractionDigits(12);
        this.f53786a1.setGroupingUsed(false);
        this.f53798n0 = c51Var;
        this.f53799o0 = i6Var;
        this.f53801p0 = i7;
        this.f53803q0 = j3;
        long j10 = -j3;
        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(j10));
        if (O0 != null) {
            this.f53807s0 = O0.level;
        }
        org.telegram.messenger.mp.u1(i7).I0().a(j3, new r3(this, 2));
        H(false);
        if (z10) {
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.n6.I.q();
            tL_payments_getStarsRevenueStats.ton = true;
            tL_payments_getStarsRevenueStats.peer = org.telegram.messenger.mp.u1(i7).l1(j3);
            TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(i7).P0(j10);
            if (P0 != null) {
                boolean z12 = P0.restricted_sponsored;
                this.f53796k1 = z12;
                this.l1 = z12;
            }
            ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getStarsRevenueStats, new jd(this, 1), null, null, 0, Integer.MAX_VALUE, 1, true);
        }
        TLRPC.Chat O02 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(j10));
        this.f53809t0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.a0(null, null, 2131748207, 50), -1, 3, new o1(c51Var, activity, i6Var, 12), i6Var), true);
        this.f53811u0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.M0(org.telegram.messenger.mp.u1(i7).L5 ? 2131748213 : 2131748211, null), -1, 3, new cd(this, 0), null), true);
        this.f53812v0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.M0((z11 && z10) ? 2131748187 : z11 ? 2131748189 : 2131748185, null), -1, 3, new dd(this, (z11 && z10) ? 2131748186 : z11 ? 2131748188 : 2131748184, 0), i6Var), true);
        this.f53813w0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.M0(org.telegram.messenger.v3.V(O02) ? 2131748180 : 2131748179, null), new cd(this, 1)), true);
        setCommonInsetsManagedExternally(true);
        setGeometry(new f(this, 11));
        this.U0 = new bi.i3(26, activity, this);
        td tdVar = new td(this, activity, i7, j3, c51Var.getClassGuid(), new cd(this, 2), i6Var);
        this.f53787b1 = tdVar;
        ai.r2 r2Var = new ai.r2(activity, 4);
        this.f53814x0 = r2Var;
        r2Var.setOrientation(1);
        int i10 = org.telegram.ui.ActionBar.n6.f29394d6;
        org.telegram.ui.ActionBar.u6.h(i10, r2Var, i6Var);
        r2Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(activity, false, true, true);
        this.f53816z0 = n6Var;
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        int i11 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.Y(n6Var, i11, i6Var);
        n6Var.setTextSize(org.telegram.messenger.g0.L(32.0f));
        n6Var.setGravity(17);
        this.f53815y0 = new RelativeSizeSpan(0.6770833f);
        r2Var.addView(n6Var, c8.ma.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(activity, true, true, true);
        this.A0 = n6Var2;
        n6Var2.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.n6.f29786y6;
        org.telegram.ui.ActionBar.u6.Y(n6Var2, i12, i6Var);
        n6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        r2Var.addView(n6Var2, c8.ma.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        hi.d dVar = new hi.d(activity, i6Var, true);
        dVar.setRoundRadius(24);
        this.B0 = dVar;
        dVar.setEnabled(org.telegram.messenger.mp.u1(i7).L5);
        dVar.i(org.telegram.messenger.gd.M0(2131748159, null), false, true);
        dVar.setVisibility(8);
        dVar.setOnClickListener(new ni.b(10, this, c51Var));
        r2Var.addView(dVar, c8.ma.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        ai.r2 r2Var2 = new ai.r2(activity, 5);
        this.D0 = r2Var2;
        r2Var2.setOrientation(1);
        org.telegram.ui.ActionBar.u6.h(i10, r2Var2, i6Var);
        r2Var2.setPadding(0, 0, 0, org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.Components.n6 n6Var3 = new org.telegram.ui.Components.n6(activity, false, true, true);
        this.F0 = n6Var3;
        n6Var3.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.u6.Y(n6Var3, i11, i6Var);
        n6Var3.setTextSize(org.telegram.messenger.g0.L(32.0f));
        n6Var3.setGravity(17);
        new RelativeSizeSpan(0.6770833f);
        r2Var2.addView(n6Var3, c8.ma.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.n6 n6Var4 = new org.telegram.ui.Components.n6(activity, true, true, true);
        this.G0 = n6Var4;
        n6Var4.setGravity(17);
        org.telegram.ui.ActionBar.u6.Y(n6Var4, i12, i6Var);
        n6Var4.setTextSize(org.telegram.messenger.g0.L(14.0f));
        r2Var2.addView(n6Var4, c8.ma.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        di.p pVar = new di.p(1, activity, this);
        this.L0 = pVar;
        pVar.setVisibility(8);
        pVar.setText(org.telegram.messenger.gd.M0(2131752942, null));
        pVar.setLeftPadding(org.telegram.messenger.g0.L(36.0f));
        di.q qVar2 = new di.q(activity, 3);
        this.P0 = qVar2;
        qVar2.setFocusable(false);
        org.telegram.ui.ActionBar.u6.U(qVar2, i11, i6Var);
        qVar2.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        qVar2.setCursorWidth(1.5f);
        qVar2.setBackground(null);
        qVar2.setTextSize(1, 18.0f);
        qVar2.setMaxLines(1);
        int L = org.telegram.messenger.g0.L(16.0f);
        qVar2.setPadding(org.telegram.messenger.g0.L(6.0f), L, L, L);
        qVar2.setInputType(2);
        qVar2.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.u6.C(qVar2, org.telegram.ui.ActionBar.n6.f29550lg, i6Var);
        org.telegram.ui.ActionBar.u6.l(qVar2, 36, org.telegram.ui.ActionBar.n6.f29567mg, i6Var);
        qVar2.setGravity(org.telegram.messenger.gd.f24213a0 ? 5 : 3);
        qVar2.setOnFocusChangeListener(new ed(this, 0));
        qVar2.addTextChangedListener(new md(this));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232754);
        linearLayout.addView(imageView, c8.ma.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(qVar2, c8.ma.p(-1, -2, 1.0f, 119));
        pVar.e(qVar2);
        pVar.addView(linearLayout, c8.ma.e(-1, -2, 48));
        r2Var2.addView(pVar, c8.ma.t(-1, -2, 1, 18, 14, 18, 2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.J0 = linearLayout2;
        linearLayout2.setOrientation(0);
        ?? dVar2 = new hi.d(activity, i6Var, true);
        dVar2.setRoundRadius(24);
        this.H0 = dVar2;
        dVar2.setEnabled(false);
        dVar2.i(org.telegram.messenger.gd.G(0, "MonetizationStarsWithdraw", new Object[0]), false, true);
        dVar2.setVisibility(0);
        dVar2.setOnClickListener(new bi.e5(this, i7, c51Var, 6));
        hi.d dVar3 = new hi.d(activity, i6Var, true);
        dVar3.setRoundRadius(24);
        this.K0 = dVar3;
        dVar3.setEnabled(false);
        dVar3.i(org.telegram.messenger.gd.M0(2131748182, null), false, true);
        dVar3.setOnClickListener(new gd(this, i7, j3, activity));
        linearLayout2.addView((View) dVar2, c8.ma.p(-1, 48, 1.0f, 119));
        if (org.telegram.messenger.v3.V(O02)) {
            linearLayout2.addView(new Space(activity), c8.ma.p(8, 48, 0.0f, 119));
            linearLayout2.addView(dVar3, c8.ma.p(-1, 48, 1.0f, 119));
        }
        r2Var2.addView(linearLayout2, c8.ma.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        qVar2.setOnEditorActionListener(new ld(0, this, c51Var));
        this.f53792g1 = new dd(this, i7, 2);
        org.telegram.ui.Components.e51 e51Var = new org.telegram.ui.Components.e51(c51Var, new a5(this, 2), new bd(this), new org.telegram.messenger.ed(this, 25));
        this.Y0 = e51Var;
        jg.i0 i0Var = new jg.i0(5, this, false);
        e51Var.f34606f3 = i0Var;
        e51Var.setLayoutManager(i0Var);
        e51Var.setClipToPadding(false);
        e51Var.r1();
        e51Var.setCaptureSectionsDecoratorAllowed(true);
        e51Var.f34607g3.f42809r = false;
        u(e51Var, new bd(this));
        x(tdVar, tdVar.f52253b, new org.telegram.messenger.ed(24));
        View view = tdVar.d;
        y(view);
        view.setLayoutParams(c8.ma.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        if (qVar != null) {
            qVar.b(e51Var);
        }
        LinearLayout f10 = org.telegram.messenger.f3.f(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.Z0 = frameLayout;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29337a7, frameLayout, i6Var);
        frameLayout.addView(f10, c8.ma.e(-2, -2, 17));
        ?? imageView2 = new ImageView(activity);
        imageView2.setAutoRepeat(true);
        imageView2.f(2131624229, 120, 120, null);
        imageView2.d();
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i13 = org.telegram.ui.ActionBar.n6.Fj;
        org.telegram.ui.ActionBar.u6.U(textView, i13, null);
        textView.setTag(Integer.valueOf(i13));
        textView.setText(org.telegram.messenger.gd.M0(2131748585, "LoadingStats"));
        textView.setGravity(1);
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 15.0f);
        int i14 = org.telegram.ui.ActionBar.n6.Gj;
        org.telegram.ui.ActionBar.u6.U(textView2, i14, null);
        textView2.setTag(Integer.valueOf(i14));
        textView2.setText(org.telegram.messenger.gd.M0(2131748584, null));
        textView2.setGravity(1);
        f10.addView((View) imageView2, c8.ma.t(120, 120, 1, 0, 0, 0, 20));
        f10.addView(textView, c8.ma.t(-2, -2, 1, 0, 0, 0, 10));
        f10.addView(textView2, c8.ma.r(-2, -2, 1));
        addView(frameLayout, c8.ma.e(-1, -1, 119));
    }

    public static org.telegram.ui.ActionBar.x2 I(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.ActionBar.x2 j3 = org.telegram.messenger.f3.j(1, context, i6Var, false);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g10.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231613);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(80.0f);
        int i18 = org.telegram.ui.ActionBar.n6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.n6.L(L, org.telegram.ui.ActionBar.n6.w0(i18, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i18);
        imageView.setBackground(L2);
        org.telegram.ui.ActionBar.u6.j(imageView, L2, M, null, i6Var);
        g10.addView(imageView, c8.ma.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        i5.c.x(textView, 1, 20.0f);
        int i19 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(textView, i19, i6Var);
        if (z10) {
            i7 = 2131753024;
        } else {
            i7 = 2131748197;
        }
        textView.setText(org.telegram.messenger.gd.M0(i7, null));
        g10.addView(textView, c8.ma.k(8.0f, 0.0f, 8.0f, 25.0f, -1, -2));
        if (z10) {
            i10 = 2131753033;
        } else {
            i10 = 2131748206;
        }
        String M0 = org.telegram.messenger.gd.M0(i10, null);
        if (z10) {
            i11 = 2131753032;
        } else {
            i11 = 2131748205;
        }
        g10.addView(new bi.p2(context, 2131232090, M0, org.telegram.messenger.gd.M0(i11, null), i6Var), c8.ma.t(-1, -2, 49, 8, 0, 8, 16));
        if (z10) {
            i12 = 2131753031;
        } else {
            i12 = 2131748204;
        }
        String M02 = org.telegram.messenger.gd.M0(i12, null);
        if (z10) {
            i13 = 2131753030;
        } else {
            i13 = 2131748203;
        }
        g10.addView(new bi.p2(context, 2131231815, M02, org.telegram.messenger.gd.M0(i13, null), i6Var), c8.ma.t(-1, -2, 49, 8, 0, 8, 16));
        if (z10) {
            i14 = 2131753029;
        } else {
            i14 = 2131748202;
        }
        String M03 = org.telegram.messenger.gd.M0(i14, null);
        if (z10) {
            i15 = 2131753028;
        } else {
            i15 = 2131748201;
        }
        g10.addView(new bi.p2(context, 2131231825, M03, org.telegram.messenger.gd.M0(i15, null), i6Var), c8.ma.t(-1, -2, 49, 8, 0, 8, 16));
        View view = new View(context);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29395d7, view, i6Var);
        g10.addView(view, c8.ma.n(1.0f / org.telegram.messenger.g0.f24117p, -1, 55, 12, 0, 12, 0));
        org.telegram.ui.Components.w5 w5Var = new org.telegram.ui.Components.w5(context);
        w5Var.setGravity(17);
        w5Var.setTextSize(1, 20.0f);
        w5Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.u6.U(w5Var, i19, i6Var);
        SpannableString spannableString = new SpannableString("💎");
        org.telegram.ui.Components.lq lqVar = new org.telegram.ui.Components.lq(2131231958, 0);
        lqVar.d = false;
        lqVar.I = 0.9f;
        lqVar.J = 0.9f;
        lqVar.b(w5Var.getPaint().getFontMetricsInt());
        lqVar.H = 0.9f;
        spannableString.setSpan(lqVar, 0, spannableString.length(), 33);
        if (z10) {
            i16 = 2131753025;
        } else {
            i16 = 2131748198;
        }
        w5Var.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.gd.M0(i16, null), spannableString, "💎"));
        g10.addView(w5Var, c8.ma.k(8.0f, 20.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.k80 k80Var = new org.telegram.ui.Components.k80(context, i6Var);
        k80Var.setGravity(17);
        k80Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(k80Var, i19, i6Var);
        org.telegram.ui.ActionBar.u6.G(k80Var, org.telegram.ui.ActionBar.n6.Xc, i6Var);
        if (z10) {
            i17 = 2131753026;
        } else {
            i17 = 2131748199;
        }
        k80Var.setText(org.telegram.messenger.g0.b4(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(i17, null)), new ch.k(19, context, z10)));
        g10.addView(k80Var, c8.ma.k(28.0f, 9.0f, 28.0f, 0.0f, -1, -2));
        hi.d g11 = org.telegram.messenger.n10.g(24, context, i6Var, true);
        g11.i(org.telegram.messenger.gd.M0(2131749356, null), false, true);
        g11.setOnClickListener(new fd(j3, 0));
        g10.addView(g11, c8.ma.t(-1, 48, 55, 10, 25, 10, 14));
        j3.O = g10;
        return j3;
    }

    public static SpannableStringBuilder K(CharSequence charSequence, TextPaint textPaint, float f10, float f11, boolean z10) {
        int i7;
        if (f53785v1 == null) {
            f53785v1 = new HashMap();
        }
        int i10 = textPaint.getFontMetricsInt().bottom;
        if (z10) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        int i11 = ((i10 * i7) * ((int) (f10 * 100.0f))) - ((int) (100.0f * f11));
        SpannableString spannableString = (SpannableString) f53785v1.get(Integer.valueOf(i11));
        if (spannableString == null) {
            spannableString = new SpannableString("T");
            if (z10) {
                org.telegram.ui.Components.lq lqVar = new org.telegram.ui.Components.lq(2131231958, 0);
                lqVar.d = false;
                lqVar.I = f10;
                lqVar.J = f10;
                lqVar.a(org.telegram.ui.ActionBar.n6.f29594o6);
                lqVar.b(textPaint.getFontMetricsInt());
                lqVar.H = 0.9f;
                spannableString.setSpan(lqVar, 0, spannableString.length(), 33);
            } else {
                org.telegram.ui.Components.lq lqVar2 = new org.telegram.ui.Components.lq(2131231956, 0);
                lqVar2.d = false;
                lqVar2.I = f10;
                lqVar2.J = f10;
                lqVar2.f37199s = f11;
                lqVar2.H = 0.95f;
                spannableString.setSpan(lqVar2, 0, spannableString.length(), 33);
            }
            f53785v1.put(Integer.valueOf(i11), spannableString);
        }
        return org.telegram.messenger.g0.M2(charSequence, spannableString, "TON");
    }

    public static void M(Context context, int i7, TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction, long j3, org.telegram.ui.ActionBar.i6 i6Var) {
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
        String q10;
        TLRPC.Chat chat;
        org.telegram.ui.ActionBar.x2 j14 = org.telegram.messenger.f3.j(1, context, i6Var, false);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        boolean z12 = broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal;
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            M0 = org.telegram.messenger.gd.M0(2131748169, null);
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
                M0 = org.telegram.messenger.gd.M0(2131748171, null);
                j11 = tL_broadcastRevenueTransactionProceeds.from_date;
                j13 = tL_broadcastRevenueTransactionProceeds.to_date;
                j12 = tL_broadcastRevenueTransactionProceeds.amount;
            } else if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionRefund) {
                TL_stats.TL_broadcastRevenueTransactionRefund tL_broadcastRevenueTransactionRefund = (TL_stats.TL_broadcastRevenueTransactionRefund) broadcastRevenueTransaction;
                M0 = org.telegram.messenger.gd.M0(2131748170, null);
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
        long j15 = j12;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        org.telegram.messenger.n10.p(textView, 1, 18.0f);
        if (c10 < 0) {
            i10 = org.telegram.ui.ActionBar.n6.f29635q7;
        } else {
            i10 = org.telegram.ui.ActionBar.n6.f29543l8;
        }
        org.telegram.ui.ActionBar.u6.U(textView, i10, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (c10 < 0) {
            str = "-";
        } else {
            str = "+";
        }
        spannableStringBuilder.append((CharSequence) str);
        long j16 = j11;
        spannableStringBuilder.append((CharSequence) decimalFormat.format(Math.round((Math.abs(j15) / 1.0E9d) * 100000.0d) / 100000.0d));
        spannableStringBuilder.append((CharSequence) " TON");
        int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.3333334f), 0, indexOf, 33);
        }
        textView.setText(spannableStringBuilder);
        g10.addView(textView, c8.ma.t(-1, -2, 49, 0, 24, 0, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29786y6, i6Var);
        if (z10) {
            textView2.setText(org.telegram.messenger.gd.M0(2131748166, null));
        } else if (j16 == j10) {
            textView2.setText(org.telegram.messenger.gd.Q(j13));
        } else if (j13 == j10) {
            textView2.setText(org.telegram.messenger.gd.Q(j16));
        } else {
            textView2.setText(org.telegram.messenger.gd.Q(j16) + " - " + org.telegram.messenger.gd.Q(j13));
        }
        if (z11) {
            org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29635q7, i6Var);
            textView2.setText(TextUtils.concat(textView2.getText(), " — ", org.telegram.messenger.gd.M0(2131748167, null)));
        }
        g10.addView(textView2, c8.ma.t(-1, -2, 49, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        textView3.setGravity(17);
        org.telegram.messenger.n10.p(textView3, 1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.G6, i6Var);
        textView3.setText(M0);
        g10.addView(textView3, c8.ma.t(-1, -2, 49, 0, 27, 0, 0));
        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
            FrameLayout frameLayout = new FrameLayout(context);
            int L = org.telegram.messenger.g0.L(28.0f);
            int L2 = org.telegram.messenger.g0.L(28.0f);
            int i11 = org.telegram.ui.ActionBar.n6.Ti;
            ShapeDrawable e02 = org.telegram.ui.ActionBar.n6.e0(L, L2, org.telegram.ui.ActionBar.n6.w0(i11, i6Var));
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
            frameLayout.setBackground(e02);
            org.telegram.ui.ActionBar.u6.j(frameLayout, e02, M, null, i6Var);
            if (j3 < j10) {
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-j3));
                if (O0 == null) {
                    q10 = "";
                    chat = O0;
                } else {
                    q10 = O0.title;
                    chat = O0;
                }
            } else {
                TLRPC.User c22 = org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(j3));
                q10 = org.telegram.messenger.o10.q(c22);
                chat = c22;
            }
            org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
            q9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
            org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
            b9Var.l(chat);
            q9Var.f(chat, b9Var);
            frameLayout.addView(q9Var, c8.ma.e(28, 28, 51));
            TextView textView4 = new TextView(context);
            org.telegram.ui.ActionBar.u6.U(textView4, org.telegram.ui.ActionBar.n6.f29502j5, i6Var);
            textView4.setTextSize(1, 13.0f);
            textView4.setSingleLine();
            textView4.setText(q10);
            frameLayout.addView(textView4, c8.ma.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
            g10.addView(frameLayout, c8.ma.t(-2, 28, 1, 42, 10, 42, 0));
        }
        hi.d g11 = org.telegram.messenger.n10.g(24, context, i6Var, true);
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal2 = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            if ((tL_broadcastRevenueTransactionWithdrawal2.flags & 2) != 0) {
                g11.i(org.telegram.messenger.gd.M0(2131748168, null), false, true);
                g11.setOnClickListener(new ni.b(11, context, tL_broadcastRevenueTransactionWithdrawal2));
                g10.addView(g11, c8.ma.t(-1, 48, 55, 18, 30, 18, 14));
                j14.O = g10;
                j14.show();
            }
        }
        g11.i(org.telegram.messenger.gd.M0(2131747638, null), false, true);
        g11.setOnClickListener(new fd(j14, 1));
        g10.addView(g11, c8.ma.t(-1, 48, 55, 18, 30, 18, 14));
        j14.O = g10;
        j14.show();
    }

    public final void D(TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats) {
        boolean z10;
        FrameLayout frameLayout;
        mg.b bVar;
        ArrayList arrayList;
        if (this.f53800o1 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f53794i1 = tL_payments_starsRevenueStats.usd_rate;
        o41 i02 = c51.i0(tL_payments_starsRevenueStats.revenue_graph, org.telegram.messenger.gd.M0(2131748208, null), 2, false);
        this.f53800o1 = i02;
        if (i02 != null && (bVar = i02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.f53800o1.d.d.get(0) != null) {
            ((mg.a) this.f53800o1.d.d.get(0)).f20979g = org.telegram.ui.ActionBar.n6.bk;
            this.f53800o1.d.h = (float) ((1.0d / this.f53794i1) / 100.0d);
        }
        L(false, tL_payments_starsRevenueStats.status);
        if (!this.f53788c1 && (frameLayout = this.Z0) != null) {
            frameLayout.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.lr.h).withEndAction(new cd(this, 6)).start();
        }
        org.telegram.ui.Components.e51 e51Var = this.Y0;
        if (e51Var != null) {
            e51Var.f34607g3.O(!z10);
            if (z10) {
                e51Var.v0(0);
            }
        }
    }

    public final void E() {
        if (isAttachedToWindow() && this.f53788c1 && this.f53802p1 && org.telegram.messenger.mp.g1().getBoolean("monetizationadshint", true)) {
            this.f53798n0.showDialog(I(getContext(), this.f53799o0, false));
            org.telegram.messenger.mp.g1().edit().putBoolean("monetizationadshint", false).apply();
        }
    }

    public final void F(boolean z10, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        c51 c51Var = this.f53798n0;
        if (c51Var != null) {
            Activity parentActivity = c51Var.getParentActivity();
            int i7 = this.f53801p0;
            TLRPC.User f10 = org.telegram.messenger.j10.i(i7).f();
            if (parentActivity != null && f10 != null) {
                long j3 = this.f53803q0;
                if (z10) {
                    tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                    tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
                    tL_payments_getStarsRevenueWithdrawalUrl.peer = org.telegram.messenger.mp.u1(i7).l1(j3);
                    if (inputCheckPasswordSRP == null) {
                        inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                    }
                    tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
                    tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
                    tL_payments_getStarsRevenueWithdrawalUrl.amount = this.O0;
                } else {
                    tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                    tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
                    tL_payments_getStarsRevenueWithdrawalUrl.peer = org.telegram.messenger.mp.u1(i7).l1(j3);
                    if (inputCheckPasswordSRP == null) {
                        inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                    }
                    tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
                }
                ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new di.j3(this, twoStepVerificationActivity, parentActivity, z10));
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
        if (!this.f53789d1) {
            return;
        }
        int i7 = this.f53801p0;
        di.e0 g10 = di.e0.g(i7);
        long j3 = this.f53803q0;
        TLRPC.TL_payments_starsRevenueStats h = g10.h(j3, z10);
        if (h != null) {
            org.telegram.messenger.g0.g3(new k9(13, this, h));
            return;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.peer = org.telegram.messenger.mp.u1(i7).l1(j3);
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.n6.I.q();
        ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getStarsRevenueStats, new jd(this, 2));
    }

    public final void J() {
        td tdVar = this.f53787b1;
        cd cdVar = tdVar.f52256f;
        boolean[] zArr = tdVar.f52260w;
        boolean a10 = tdVar.a();
        for (int i7 = 0; i7 < 2; i7++) {
            if (!zArr[i7]) {
                if (i7 == 1) {
                    tdVar.f52257n.clear();
                    tdVar.h = "";
                } else {
                    tdVar.f52258r.clear();
                    tdVar.f52259s = "";
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
        org.telegram.ui.Components.z41 z41Var;
        long j3;
        ud udVar2;
        int i13;
        int i14;
        xd xdVar = this;
        ud udVar3 = xdVar.f53808s1;
        ud udVar4 = xdVar.f53806r1;
        org.telegram.ui.Components.n6 n6Var = xdVar.A0;
        RelativeSizeSpan relativeSizeSpan = xdVar.f53815y0;
        org.telegram.ui.Components.n6 n6Var2 = xdVar.f53816z0;
        ud udVar5 = xdVar.f53804q1;
        if (z10) {
            udVar5.f52529a = true;
            long j10 = tL_starsRevenueStatus.available_balance.amount;
            udVar5.d = j10;
            double d = j10 / 1.0E9d;
            udVar5.f52532e = (long) (xdVar.f53793h1 * d * 100.0d);
            if (xdVar.f53786a1 == null) {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                decimalFormatSymbols.setDecimalSeparator('.');
                udVar2 = udVar3;
                DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                xdVar.f53786a1 = decimalFormat;
                decimalFormat.setMinimumFractionDigits(2);
                i13 = 6;
                xdVar.f53786a1.setMaximumFractionDigits(6);
                xdVar.f53786a1.setGroupingUsed(false);
            } else {
                udVar2 = udVar3;
                i13 = 6;
            }
            DecimalFormat decimalFormat2 = xdVar.f53786a1;
            if (d > 1.5d) {
                i13 = 2;
            }
            decimalFormat2.setMaximumFractionDigits(i13);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(K("TON " + xdVar.f53786a1.format(d), n6Var2.getPaint(), 0.9f, 0.0f, true));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(relativeSizeSpan, indexOf, spannableStringBuilder.length(), 33);
            }
            n6Var2.setText(spannableStringBuilder);
            n6Var.setText("≈" + org.telegram.messenger.r1.i().f(j3, "USD"));
            udVar5.f52533f = "USD";
            udVar4.f52529a = true;
            long j11 = tL_starsRevenueStatus.current_balance.amount;
            udVar4.d = j11;
            xdVar = this;
            double d2 = xdVar.f53793h1;
            udVar4.f52532e = (long) ((j11 / 1.0E9d) * d2 * 100.0d);
            udVar4.f52533f = "USD";
            ud udVar6 = udVar2;
            udVar6.f52529a = true;
            long j12 = tL_starsRevenueStatus.overall_revenue.amount;
            udVar6.d = j12;
            udVar6.f52532e = (long) ((j12 / 1.0E9d) * d2 * 100.0d);
            udVar6.f52533f = "USD";
            xdVar.f53802p1 = true;
            if (tL_starsRevenueStatus.available_balance.amount > 0 && tL_starsRevenueStatus.withdrawal_enabled) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            xdVar.B0.setVisibility(i14);
        } else {
            double d10 = xdVar.f53794i1;
            if (d10 != 0.0d) {
                udVar5.f52534g = true;
                TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus.available_balance;
                udVar5.f52535i = starsAmount3;
                udVar5.f52536j = (long) (starsAmount3.amount * d10 * 100.0d);
                int i15 = tL_starsRevenueStatus.next_withdrawal_at;
                nd ndVar = xdVar.H0;
                if (n6Var2 == null || n6Var == null) {
                    udVar = udVar3;
                    i7 = 0;
                } else {
                    udVar = udVar3;
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(di.pb.b1(false, TextUtils.concat("XTR ", di.pb.M0(starsAmount3, 0.8f, ' ')), 1.0f, null));
                    int indexOf2 = TextUtils.indexOf(spannableStringBuilder2, ".");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2.setSpan(relativeSizeSpan, indexOf2, spannableStringBuilder2.length(), 33);
                    }
                    xdVar.E0 = starsAmount3;
                    xdVar.F0.setText(spannableStringBuilder2);
                    xdVar.G0.setText("≈" + org.telegram.messenger.r1.i().f((long) (xdVar.f53794i1 * starsAmount3.amount * 100.0d), "USD"));
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
                    dd ddVar = xdVar.f53792g1;
                    org.telegram.messenger.g0.r(ddVar);
                    ddVar.run();
                }
                udVar5.f52533f = "USD";
                udVar4.f52534g = true;
                udVar4.f52535i = tL_starsRevenueStatus.current_balance;
                double d11 = xdVar.f53794i1;
                udVar4.f52536j = (long) (starsAmount.amount * d11 * 100.0d);
                udVar4.f52533f = "USD";
                ud udVar7 = udVar;
                udVar7.f52534g = true;
                udVar7.f52535i = tL_starsRevenueStatus.overall_revenue;
                udVar7.f52536j = (long) (starsAmount2.amount * d11 * 100.0d);
                udVar7.f52533f = "USD";
                xdVar.f53802p1 = true;
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
                        boolean z13 = org.telegram.messenger.s2.f26721a;
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
        org.telegram.ui.Components.e51 e51Var = xdVar.Y0;
        if (e51Var != null && (z41Var = e51Var.f34607g3) != null) {
            z41Var.O(true);
        }
    }

    public View getTransactionTabs() {
        return this.f53787b1.d;
    }

    @Override
    public final void onAttachedToWindow() {
        f53784u1 = this;
        super.onAttachedToWindow();
        E();
    }

    @Override
    public final void onDetachedFromWindow() {
        f53784u1 = null;
        super.onDetachedFromWindow();
        org.telegram.ui.ActionBar.k kVar = this.f53795j1;
        if (kVar != null) {
            kVar.setCastShadows(true);
        }
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.f53795j1 = kVar;
    }

    public void setTabsPinnedChangedListener(Runnable runnable) {
        this.T0 = runnable;
    }

    @Override
    public final void updateColors() {
        try {
            di.q qVar = this.P0;
            if (qVar != null) {
                qVar.setHandlesColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29567mg, this.f53799o0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
