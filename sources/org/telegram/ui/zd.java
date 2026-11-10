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
public final class zd extends org.telegram.ui.Components.it0 implements org.telegram.ui.ActionBar.c6 {
    public static zd f52409t1;
    public static HashMap f52410u1;
    public final fi.d A0;
    public int B0;
    public final bi.t C0;
    public TL_stars.StarsAmount D0;
    public final org.telegram.ui.Components.i6 E0;
    public final org.telegram.ui.Components.i6 F0;
    public final pd G0;
    public final org.telegram.ui.Components.wp[] H0;
    public final LinearLayout I0;
    public final fi.d J0;
    public final bi.u K0;
    public boolean L0;
    public boolean M0;
    public long N0;
    public final bi.v O0;
    public org.telegram.ui.Components.bc P0;
    public boolean Q0;
    public int R0;
    public Runnable S0;
    public final bi.ec T0;
    public int U0;
    public int V0;
    public int W0;
    public final org.telegram.ui.Components.r41 X0;
    public final FrameLayout Y0;
    public DecimalFormat Z0;
    public final vd f52411a1;
    public final boolean f52412b1;
    public final boolean f52413c1;
    public final oi.q f52414d1;
    public SpannableStringBuilder f52415e1;
    public final ed f52416f1;
    public double f52417g1;
    public double f52418h1;
    public org.telegram.ui.ActionBar.l f52419i1;
    public boolean f52420j1;
    public boolean f52421k1;
    public q41 l1;
    public final e51 m0;
    public q41 f52422m1;
    public final org.telegram.ui.ActionBar.h6 f52423n0;
    public q41 n1;
    public final int f52424o0;
    public boolean f52425o1;
    public final long f52426p0;
    public final wd f52427p1;
    public TL_stories.TL_premium_boostsStatus f52428q0;
    public final wd f52429q1;
    public int f52430r0;
    public final wd f52431r1;
    public final SpannableStringBuilder f52432s0;
    public final dd f52433s1;
    public final SpannableStringBuilder f52434t0;
    public final SpannableStringBuilder f52435u0;
    public final SpannableStringBuilder f52436v0;
    public final bi.t f52437w0;
    public final RelativeSizeSpan f52438x0;
    public final org.telegram.ui.Components.i6 f52439y0;
    public final org.telegram.ui.Components.i6 f52440z0;

    public zd(Activity activity, e51 e51Var, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var, oi.q qVar, boolean z9, boolean z10) {
        super(activity);
        this.D0 = TL_stars.StarsAmount.ofStars(0L);
        this.H0 = new org.telegram.ui.Components.wp[1];
        this.L0 = false;
        this.M0 = true;
        this.Q0 = true;
        this.R0 = -1;
        this.f52420j1 = false;
        this.f52421k1 = false;
        this.f52425o1 = false;
        String M0 = org.telegram.messenger.id.M0(2131748384, null);
        wd wdVar = new wd();
        wdVar.f51000a = false;
        wdVar.f51001b = "TON";
        wdVar.h = "XTR";
        wdVar.f51002c = M0;
        this.f52427p1 = wdVar;
        String M02 = org.telegram.messenger.id.M0(2131748383, null);
        wd wdVar2 = new wd();
        wdVar2.f51000a = false;
        wdVar2.f51001b = "TON";
        wdVar2.h = "XTR";
        wdVar2.f51002c = M02;
        this.f52429q1 = wdVar2;
        String M03 = org.telegram.messenger.id.M0(2131748382, null);
        wd wdVar3 = new wd();
        wdVar3.f51000a = false;
        wdVar3.f51001b = "TON";
        wdVar3.h = "XTR";
        wdVar3.f51002c = M03;
        this.f52431r1 = wdVar3;
        this.f52433s1 = new dd(this, 7);
        this.f52414d1 = qVar;
        this.f52412b1 = z9;
        this.f52413c1 = z10;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.Z0 = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        this.Z0.setMaximumFractionDigits(12);
        this.Z0.setGroupingUsed(false);
        this.m0 = e51Var;
        this.f52423n0 = h6Var;
        this.f52424o0 = i7;
        this.f52426p0 = j3;
        long j10 = -j3;
        TLRPC.Chat M04 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(j10));
        if (M04 != null) {
            this.f52430r0 = M04.level;
        }
        org.telegram.messenger.qp.s1(i7).G0().a(j3, new r3(this, 2));
        H(false);
        if (z9) {
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.m6.I.q();
            tL_payments_getStarsRevenueStats.ton = true;
            tL_payments_getStarsRevenueStats.peer = org.telegram.messenger.qp.s1(i7).j1(j3);
            TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(i7).N0(j10);
            if (N0 != null) {
                boolean z11 = N0.restricted_sponsored;
                this.f52420j1 = z11;
                this.f52421k1 = z11;
            }
            ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getStarsRevenueStats, new kd(this, 1), null, null, 0, Integer.MAX_VALUE, 1, true);
        }
        TLRPC.Chat M05 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(j10));
        this.f52432s0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(org.telegram.messenger.id.a0(null, null, 2131748399, 50), -1, 3, new o1(e51Var, activity, h6Var, 12), h6Var), true);
        this.f52434t0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(org.telegram.messenger.qp.s1(i7).I5 ? 2131748405 : 2131748403, null), -1, 3, new dd(this, 0), null), true);
        this.f52435u0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0((z10 && z9) ? 2131748379 : z10 ? 2131748381 : 2131748377, null), -1, 3, new ed(this, (z10 && z9) ? 2131748378 : z10 ? 2131748380 : 2131748376, 0), h6Var), true);
        this.f52436v0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(org.telegram.messenger.t3.V(M05) ? 2131748372 : 2131748371, null), new dd(this, 1)), true);
        setCommonInsetsManagedExternally(true);
        setGeometry(new f(this, 11));
        this.T0 = new bi.ec(25, activity, this);
        vd vdVar = new vd(this, activity, i7, j3, e51Var.getClassGuid(), new dd(this, 2), h6Var);
        this.f52411a1 = vdVar;
        bi.t tVar = new bi.t(activity, 3);
        this.f52437w0 = tVar;
        tVar.setOrientation(1);
        int i10 = org.telegram.ui.ActionBar.m6.f27890d6;
        org.telegram.ui.ActionBar.t6.h(i10, tVar, h6Var);
        tVar.setPadding(0, 0, 0, org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(activity, false, true, true);
        this.f52439y0 = i6Var;
        i6Var.setTypeface(org.telegram.messenger.g0.o());
        int i11 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.Y(i6Var, i11, h6Var);
        i6Var.setTextSize(org.telegram.messenger.g0.L(32.0f));
        i6Var.setGravity(17);
        this.f52438x0 = new RelativeSizeSpan(0.6770833f);
        tVar.addView(i6Var, c8.ha.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(activity, true, true, true);
        this.f52440z0 = i6Var2;
        i6Var2.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.m6.f28282y6;
        org.telegram.ui.ActionBar.t6.Y(i6Var2, i12, h6Var);
        i6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        tVar.addView(i6Var2, c8.ha.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        fi.d dVar = new fi.d(activity, h6Var, true);
        dVar.setRoundRadius(24);
        this.A0 = dVar;
        dVar.setEnabled(org.telegram.messenger.qp.s1(i7).I5);
        dVar.i(org.telegram.messenger.id.M0(2131748351, null), false, true);
        dVar.setVisibility(8);
        dVar.setOnClickListener(new org.telegram.ui.ActionBar.l1(7, this, e51Var));
        tVar.addView(dVar, c8.ha.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        bi.t tVar2 = new bi.t(activity, 4);
        this.C0 = tVar2;
        tVar2.setOrientation(1);
        org.telegram.ui.ActionBar.t6.h(i10, tVar2, h6Var);
        tVar2.setPadding(0, 0, 0, org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.Components.i6 i6Var3 = new org.telegram.ui.Components.i6(activity, false, true, true);
        this.E0 = i6Var3;
        i6Var3.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.t6.Y(i6Var3, i11, h6Var);
        i6Var3.setTextSize(org.telegram.messenger.g0.L(32.0f));
        i6Var3.setGravity(17);
        new RelativeSizeSpan(0.6770833f);
        tVar2.addView(i6Var3, c8.ha.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.i6 i6Var4 = new org.telegram.ui.Components.i6(activity, true, true, true);
        this.F0 = i6Var4;
        i6Var4.setGravity(17);
        org.telegram.ui.ActionBar.t6.Y(i6Var4, i12, h6Var);
        i6Var4.setTextSize(org.telegram.messenger.g0.L(14.0f));
        tVar2.addView(i6Var4, c8.ha.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        bi.u uVar = new bi.u(1, activity, this);
        this.K0 = uVar;
        uVar.setVisibility(8);
        uVar.setText(org.telegram.messenger.id.M0(2131752953, null));
        uVar.setLeftPadding(org.telegram.messenger.g0.L(36.0f));
        bi.v vVar = new bi.v(activity, 3);
        this.O0 = vVar;
        vVar.setFocusable(false);
        org.telegram.ui.ActionBar.t6.U(vVar, i11, h6Var);
        vVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        vVar.setCursorWidth(1.5f);
        vVar.setBackground(null);
        vVar.setTextSize(1, 18.0f);
        vVar.setMaxLines(1);
        int L = org.telegram.messenger.g0.L(16.0f);
        vVar.setPadding(org.telegram.messenger.g0.L(6.0f), L, L, L);
        vVar.setInputType(2);
        vVar.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.t6.C(vVar, org.telegram.ui.ActionBar.m6.f27990ig, h6Var);
        org.telegram.ui.ActionBar.t6.l(vVar, 36, org.telegram.ui.ActionBar.m6.f28009jg, h6Var);
        vVar.setGravity(org.telegram.messenger.id.f23161a0 ? 5 : 3);
        vVar.setOnFocusChangeListener(new fd(this, 0));
        vVar.addTextChangedListener(new od(this));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232752);
        linearLayout.addView(imageView, c8.ha.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(vVar, c8.ha.p(-1, -2, 1.0f, 119));
        uVar.e(vVar);
        uVar.addView(linearLayout, c8.ha.e(-1, -2, 48));
        tVar2.addView(uVar, c8.ha.t(-1, -2, 1, 18, 14, 18, 2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.I0 = linearLayout2;
        linearLayout2.setOrientation(0);
        ?? dVar2 = new fi.d(activity, h6Var, true);
        dVar2.setRoundRadius(24);
        this.G0 = dVar2;
        dVar2.setEnabled(false);
        dVar2.i(org.telegram.messenger.id.G(0, "MonetizationStarsWithdraw", new Object[0]), false, true);
        dVar2.setVisibility(0);
        dVar2.setOnClickListener(new bi.la(this, i7, e51Var, 4));
        fi.d dVar3 = new fi.d(activity, h6Var, true);
        dVar3.setRoundRadius(24);
        this.J0 = dVar3;
        dVar3.setEnabled(false);
        dVar3.i(org.telegram.messenger.id.M0(2131748374, null), false, true);
        dVar3.setOnClickListener(new hd(this, i7, j3, activity));
        linearLayout2.addView((View) dVar2, c8.ha.p(-1, 48, 1.0f, 119));
        if (org.telegram.messenger.t3.V(M05)) {
            linearLayout2.addView(new Space(activity), c8.ha.p(8, 48, 0.0f, 119));
            linearLayout2.addView(dVar3, c8.ha.p(-1, 48, 1.0f, 119));
        }
        tVar2.addView(linearLayout2, c8.ha.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        vVar.setOnEditorActionListener(new nd(0, this, e51Var));
        this.f52416f1 = new ed(this, i7, 2);
        org.telegram.ui.Components.r41 r41Var = new org.telegram.ui.Components.r41(e51Var, new a5(this, 2), new cd(this), new org.telegram.messenger.ch(this, 20));
        this.X0 = r41Var;
        jg.i0 i0Var = new jg.i0(5, this, false);
        r41Var.f37495e3 = i0Var;
        r41Var.setLayoutManager(i0Var);
        r41Var.setClipToPadding(false);
        r41Var.r1();
        r41Var.setCaptureSectionsDecoratorAllowed(true);
        r41Var.f37496f3.f35845r = false;
        u(r41Var, new cd(this));
        x(vdVar, vdVar.f50705b, new org.telegram.messenger.ch(19));
        View view = vdVar.d;
        y(view);
        view.setLayoutParams(c8.ha.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        if (qVar != null) {
            qVar.b(r41Var);
        }
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.Y0 = frameLayout;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27834a7, frameLayout, h6Var);
        frameLayout.addView(e10, c8.ha.e(-2, -2, 17));
        ?? imageView2 = new ImageView(activity);
        imageView2.setAutoRepeat(true);
        imageView2.f(2131624228, 120, 120, null);
        imageView2.d();
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i13 = org.telegram.ui.ActionBar.m6.Cj;
        org.telegram.ui.ActionBar.t6.U(textView, i13, null);
        textView.setTag(Integer.valueOf(i13));
        textView.setText(org.telegram.messenger.id.M0(2131748777, "LoadingStats"));
        textView.setGravity(1);
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 15.0f);
        int i14 = org.telegram.ui.ActionBar.m6.Dj;
        org.telegram.ui.ActionBar.t6.U(textView2, i14, null);
        textView2.setTag(Integer.valueOf(i14));
        textView2.setText(org.telegram.messenger.id.M0(2131748776, null));
        textView2.setGravity(1);
        e10.addView((View) imageView2, c8.ha.t(120, 120, 1, 0, 0, 0, 20));
        e10.addView(textView, c8.ha.t(-2, -2, 1, 0, 0, 0, 10));
        e10.addView(textView2, c8.ha.r(-2, -2, 1));
        addView(frameLayout, c8.ha.e(-1, -1, 119));
    }

    public static org.telegram.ui.ActionBar.w2 I(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.ActionBar.w2 l10 = org.telegram.messenger.k5.l(1, context, h6Var, false);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231612);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(80.0f);
        int i18 = org.telegram.ui.ActionBar.m6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.m6.L(L, org.telegram.ui.ActionBar.m6.w0(i18, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i18);
        imageView.setBackground(L2);
        org.telegram.ui.ActionBar.t6.j(imageView, L2, M, null, h6Var);
        f10.addView(imageView, c8.ha.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        com.google.android.recaptcha.internal.a.q(textView, 1, 20.0f);
        int i19 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(textView, i19, h6Var);
        if (z9) {
            i7 = 2131753035;
        } else {
            i7 = 2131748389;
        }
        textView.setText(org.telegram.messenger.id.M0(i7, null));
        f10.addView(textView, c8.ha.k(8.0f, 0.0f, 8.0f, 25.0f, -1, -2));
        if (z9) {
            i10 = 2131753044;
        } else {
            i10 = 2131748398;
        }
        String M0 = org.telegram.messenger.id.M0(i10, null);
        if (z9) {
            i11 = 2131753043;
        } else {
            i11 = 2131748397;
        }
        f10.addView(new di.b4(context, 2131232088, M0, org.telegram.messenger.id.M0(i11, null), h6Var), c8.ha.t(-1, -2, 49, 8, 0, 8, 16));
        if (z9) {
            i12 = 2131753042;
        } else {
            i12 = 2131748396;
        }
        String M02 = org.telegram.messenger.id.M0(i12, null);
        if (z9) {
            i13 = 2131753041;
        } else {
            i13 = 2131748395;
        }
        f10.addView(new di.b4(context, 2131231814, M02, org.telegram.messenger.id.M0(i13, null), h6Var), c8.ha.t(-1, -2, 49, 8, 0, 8, 16));
        if (z9) {
            i14 = 2131753040;
        } else {
            i14 = 2131748394;
        }
        String M03 = org.telegram.messenger.id.M0(i14, null);
        if (z9) {
            i15 = 2131753039;
        } else {
            i15 = 2131748393;
        }
        f10.addView(new di.b4(context, 2131231824, M03, org.telegram.messenger.id.M0(i15, null), h6Var), c8.ha.t(-1, -2, 49, 8, 0, 8, 16));
        View view = new View(context);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27891d7, view, h6Var);
        f10.addView(view, c8.ha.n(1.0f / org.telegram.messenger.g0.f22566p, -1, 55, 12, 0, 12, 0));
        org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(context);
        p5Var.setGravity(17);
        p5Var.setTextSize(1, 20.0f);
        p5Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.t6.U(p5Var, i19, h6Var);
        SpannableString spannableString = new SpannableString("💎");
        org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(2131231957, 0);
        wpVar.d = false;
        wpVar.H = 0.9f;
        wpVar.I = 0.9f;
        wpVar.b(p5Var.getPaint().getFontMetricsInt());
        wpVar.G = 0.9f;
        spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
        if (z9) {
            i16 = 2131753036;
        } else {
            i16 = 2131748390;
        }
        p5Var.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.id.M0(i16, null), spannableString, "💎"));
        f10.addView(p5Var, c8.ha.k(8.0f, 20.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(context, h6Var);
        w70Var.setGravity(17);
        w70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(w70Var, i19, h6Var);
        org.telegram.ui.ActionBar.t6.G(w70Var, org.telegram.ui.ActionBar.m6.Uc, h6Var);
        if (z9) {
            i17 = 2131753037;
        } else {
            i17 = 2131748391;
        }
        w70Var.setText(org.telegram.messenger.g0.d4(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(i17, null)), new bi.k1(19, context, z9)));
        f10.addView(w70Var, c8.ha.k(28.0f, 9.0f, 28.0f, 0.0f, -1, -2));
        fi.d h = org.telegram.messenger.k5.h(24, context, h6Var, true);
        h.i(org.telegram.messenger.id.M0(2131749531, null), false, true);
        h.setOnClickListener(new gd(l10, 0));
        f10.addView(h, c8.ha.t(-1, 48, 55, 10, 25, 10, 14));
        l10.N = f10;
        return l10;
    }

    public static SpannableStringBuilder K(CharSequence charSequence, TextPaint textPaint, float f10, float f11, boolean z9) {
        int i7;
        if (f52410u1 == null) {
            f52410u1 = new HashMap();
        }
        int i10 = textPaint.getFontMetricsInt().bottom;
        if (z9) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        int i11 = ((i10 * i7) * ((int) (f10 * 100.0f))) - ((int) (100.0f * f11));
        SpannableString spannableString = (SpannableString) f52410u1.get(Integer.valueOf(i11));
        if (spannableString == null) {
            spannableString = new SpannableString("T");
            if (z9) {
                org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(2131231957, 0);
                wpVar.d = false;
                wpVar.H = f10;
                wpVar.I = f10;
                wpVar.a(org.telegram.ui.ActionBar.m6.f28090o6);
                wpVar.b(textPaint.getFontMetricsInt());
                wpVar.G = 0.9f;
                spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
            } else {
                org.telegram.ui.Components.wp wpVar2 = new org.telegram.ui.Components.wp(2131231955, 0);
                wpVar2.d = false;
                wpVar2.H = f10;
                wpVar2.I = f10;
                wpVar2.f40039s = f11;
                wpVar2.G = 0.95f;
                spannableString.setSpan(wpVar2, 0, spannableString.length(), 33);
            }
            f52410u1.put(Integer.valueOf(i11), spannableString);
        }
        return org.telegram.messenger.g0.M2(charSequence, spannableString, "TON");
    }

    public static void M(Context context, int i7, TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction, long j3, org.telegram.ui.ActionBar.h6 h6Var) {
        long j10;
        String M0;
        long j11;
        long j12;
        long j13;
        char c10;
        boolean z9;
        boolean z10;
        int i10;
        String str;
        String p10;
        TLRPC.Chat chat;
        org.telegram.ui.ActionBar.w2 l10 = org.telegram.messenger.k5.l(1, context, h6Var, false);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        boolean z11 = broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal;
        if (z11) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            M0 = org.telegram.messenger.id.M0(2131748361, null);
            j10 = 0;
            j11 = tL_broadcastRevenueTransactionWithdrawal.date;
            j12 = tL_broadcastRevenueTransactionWithdrawal.amount;
            boolean z12 = tL_broadcastRevenueTransactionWithdrawal.pending;
            z10 = tL_broadcastRevenueTransactionWithdrawal.failed;
            z9 = z12;
            j13 = 0;
            c10 = 65535;
        } else {
            j10 = 0;
            if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
                TL_stats.TL_broadcastRevenueTransactionProceeds tL_broadcastRevenueTransactionProceeds = (TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction;
                M0 = org.telegram.messenger.id.M0(2131748363, null);
                j11 = tL_broadcastRevenueTransactionProceeds.from_date;
                j13 = tL_broadcastRevenueTransactionProceeds.to_date;
                j12 = tL_broadcastRevenueTransactionProceeds.amount;
            } else if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionRefund) {
                TL_stats.TL_broadcastRevenueTransactionRefund tL_broadcastRevenueTransactionRefund = (TL_stats.TL_broadcastRevenueTransactionRefund) broadcastRevenueTransaction;
                M0 = org.telegram.messenger.id.M0(2131748362, null);
                j11 = tL_broadcastRevenueTransactionRefund.from_date;
                j12 = tL_broadcastRevenueTransactionRefund.amount;
                j13 = 0;
            } else {
                return;
            }
            c10 = 1;
            z9 = false;
            z10 = false;
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
        org.telegram.messenger.camera.q.m(textView, 1, 18.0f);
        if (c10 < 0) {
            i10 = org.telegram.ui.ActionBar.m6.f28131q7;
        } else {
            i10 = org.telegram.ui.ActionBar.m6.f28039l8;
        }
        org.telegram.ui.ActionBar.t6.U(textView, i10, null);
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
        f10.addView(textView, c8.ha.t(-1, -2, 49, 0, 24, 0, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f28282y6, h6Var);
        if (z9) {
            textView2.setText(org.telegram.messenger.id.M0(2131748358, null));
        } else if (j15 == j10) {
            textView2.setText(org.telegram.messenger.id.Q(j13));
        } else if (j13 == j10) {
            textView2.setText(org.telegram.messenger.id.Q(j15));
        } else {
            textView2.setText(org.telegram.messenger.id.Q(j15) + " - " + org.telegram.messenger.id.Q(j13));
        }
        if (z10) {
            org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f28131q7, h6Var);
            textView2.setText(TextUtils.concat(textView2.getText(), " — ", org.telegram.messenger.id.M0(2131748359, null)));
        }
        f10.addView(textView2, c8.ha.t(-1, -2, 49, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        textView3.setGravity(17);
        org.telegram.messenger.camera.q.m(textView3, 1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.G6, h6Var);
        textView3.setText(M0);
        f10.addView(textView3, c8.ha.t(-1, -2, 49, 0, 27, 0, 0));
        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
            FrameLayout frameLayout = new FrameLayout(context);
            int L = org.telegram.messenger.g0.L(28.0f);
            int L2 = org.telegram.messenger.g0.L(28.0f);
            int i11 = org.telegram.ui.ActionBar.m6.Qi;
            ShapeDrawable e02 = org.telegram.ui.ActionBar.m6.e0(L, L2, org.telegram.ui.ActionBar.m6.w0(i11, h6Var));
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
            frameLayout.setBackground(e02);
            org.telegram.ui.ActionBar.t6.j(frameLayout, e02, M, null, h6Var);
            if (j3 < j10) {
                TLRPC.Chat M02 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-j3));
                if (M02 == null) {
                    p10 = "";
                    chat = M02;
                } else {
                    p10 = M02.title;
                    chat = M02;
                }
            } else {
                TLRPC.User a22 = org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(j3));
                p10 = org.telegram.messenger.t10.p(a22);
                chat = a22;
            }
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
            k9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
            org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
            v8Var.l(chat);
            k9Var.e(chat, v8Var);
            frameLayout.addView(k9Var, c8.ha.e(28, 28, 51));
            TextView textView4 = new TextView(context);
            org.telegram.ui.ActionBar.t6.U(textView4, org.telegram.ui.ActionBar.m6.f27998j5, h6Var);
            textView4.setTextSize(1, 13.0f);
            textView4.setSingleLine();
            textView4.setText(p10);
            frameLayout.addView(textView4, c8.ha.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
            f10.addView(frameLayout, c8.ha.t(-2, 28, 1, 42, 10, 42, 0));
        }
        fi.d h = org.telegram.messenger.k5.h(24, context, h6Var, true);
        if (z11) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal2 = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            if ((tL_broadcastRevenueTransactionWithdrawal2.flags & 2) != 0) {
                h.i(org.telegram.messenger.id.M0(2131748360, null), false, true);
                h.setOnClickListener(new org.telegram.ui.ActionBar.l1(8, context, tL_broadcastRevenueTransactionWithdrawal2));
                f10.addView(h, c8.ha.t(-1, 48, 55, 18, 30, 18, 14));
                l10.N = f10;
                l10.show();
            }
        }
        h.i(org.telegram.messenger.id.M0(2131747831, null), false, true);
        h.setOnClickListener(new gd(l10, 1));
        f10.addView(h, c8.ha.t(-1, 48, 55, 18, 30, 18, 14));
        l10.N = f10;
        l10.show();
    }

    public final void D(TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats) {
        boolean z9;
        FrameLayout frameLayout;
        mg.b bVar;
        ArrayList arrayList;
        if (this.n1 == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f52418h1 = tL_payments_starsRevenueStats.usd_rate;
        q41 i02 = e51.i0(tL_payments_starsRevenueStats.revenue_graph, org.telegram.messenger.id.M0(2131748400, null), 2, false);
        this.n1 = i02;
        if (i02 != null && (bVar = i02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.n1.d.d.get(0) != null) {
            ((mg.a) this.n1.d.d.get(0)).f20026g = org.telegram.ui.ActionBar.m6.Yj;
            this.n1.d.h = (float) ((1.0d / this.f52418h1) / 100.0d);
        }
        L(false, tL_payments_starsRevenueStats.status);
        if (!this.f52412b1 && (frameLayout = this.Y0) != null) {
            frameLayout.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.wq.h).withEndAction(new dd(this, 6)).start();
        }
        org.telegram.ui.Components.r41 r41Var = this.X0;
        if (r41Var != null) {
            r41Var.f37496f3.O(!z9);
            if (z9) {
                r41Var.v0(0);
            }
        }
    }

    public final void E() {
        if (isAttachedToWindow() && this.f52412b1 && this.f52425o1 && org.telegram.messenger.qp.e1().getBoolean("monetizationadshint", true)) {
            this.m0.showDialog(I(getContext(), this.f52423n0, false));
            org.telegram.messenger.qp.e1().edit().putBoolean("monetizationadshint", false).apply();
        }
    }

    public final void F(boolean z9, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        e51 e51Var = this.m0;
        if (e51Var != null) {
            Activity parentActivity = e51Var.getParentActivity();
            int i7 = this.f52424o0;
            TLRPC.User f10 = org.telegram.messenger.p10.i(i7).f();
            if (parentActivity != null && f10 != null) {
                long j3 = this.f52426p0;
                if (z9) {
                    tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                    tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
                    tL_payments_getStarsRevenueWithdrawalUrl.peer = org.telegram.messenger.qp.s1(i7).j1(j3);
                    if (inputCheckPasswordSRP == null) {
                        inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                    }
                    tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
                    tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
                    tL_payments_getStarsRevenueWithdrawalUrl.amount = this.N0;
                } else {
                    tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                    tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
                    tL_payments_getStarsRevenueWithdrawalUrl.peer = org.telegram.messenger.qp.s1(i7).j1(j3);
                    if (inputCheckPasswordSRP == null) {
                        inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                    }
                    tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
                }
                ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new bi.d4(this, twoStepVerificationActivity, parentActivity, z9));
            }
        }
    }

    public final boolean G(float f10, float f11) {
        if (this.Y0.getVisibility() != 0 && c() && f10 >= 0.0f && f10 < getWidth() && f11 >= getTabsTop() && f11 < getHeight()) {
            return true;
        }
        return false;
    }

    public final void H(boolean z9) {
        if (!this.f52413c1) {
            return;
        }
        int i7 = this.f52424o0;
        bi.n0 g10 = bi.n0.g(i7);
        long j3 = this.f52426p0;
        TLRPC.TL_payments_starsRevenueStats h = g10.h(j3, z9);
        if (h != null) {
            org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.c(29, this, h));
            return;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.peer = org.telegram.messenger.qp.s1(i7).j1(j3);
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.m6.I.q();
        ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getStarsRevenueStats, new kd(this, 2));
    }

    public final void J() {
        vd vdVar = this.f52411a1;
        dd ddVar = vdVar.f50708f;
        boolean[] zArr = vdVar.f50712w;
        boolean a10 = vdVar.a();
        for (int i7 = 0; i7 < 2; i7++) {
            if (!zArr[i7]) {
                if (i7 == 1) {
                    vdVar.f50709n.clear();
                    vdVar.h = "";
                } else {
                    vdVar.f50710r.clear();
                    vdVar.f50711s = "";
                }
                zArr[i7] = false;
                vdVar.c(i7);
            } else {
                return;
            }
        }
        if (vdVar.a() != a10 && ddVar != null) {
            vdVar.e();
            ddVar.run();
        }
    }

    public final void L(boolean z9, TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus) {
        wd wdVar;
        int i7;
        TL_stars.StarsAmount starsAmount;
        TL_stars.StarsAmount starsAmount2;
        int i10;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.m41 m41Var;
        long j3;
        wd wdVar2;
        int i13;
        int i14;
        zd zdVar = this;
        wd wdVar3 = zdVar.f52431r1;
        wd wdVar4 = zdVar.f52429q1;
        org.telegram.ui.Components.i6 i6Var = zdVar.f52440z0;
        RelativeSizeSpan relativeSizeSpan = zdVar.f52438x0;
        org.telegram.ui.Components.i6 i6Var2 = zdVar.f52439y0;
        wd wdVar5 = zdVar.f52427p1;
        if (z9) {
            wdVar5.f51000a = true;
            long j10 = tL_starsRevenueStatus.available_balance.amount;
            wdVar5.d = j10;
            double d = j10 / 1.0E9d;
            wdVar5.f51003e = (long) (zdVar.f52417g1 * d * 100.0d);
            if (zdVar.Z0 == null) {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                decimalFormatSymbols.setDecimalSeparator('.');
                wdVar2 = wdVar3;
                DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                zdVar.Z0 = decimalFormat;
                decimalFormat.setMinimumFractionDigits(2);
                i13 = 6;
                zdVar.Z0.setMaximumFractionDigits(6);
                zdVar.Z0.setGroupingUsed(false);
            } else {
                wdVar2 = wdVar3;
                i13 = 6;
            }
            DecimalFormat decimalFormat2 = zdVar.Z0;
            if (d > 1.5d) {
                i13 = 2;
            }
            decimalFormat2.setMaximumFractionDigits(i13);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(K("TON " + zdVar.Z0.format(d), i6Var2.getPaint(), 0.9f, 0.0f, true));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(relativeSizeSpan, indexOf, spannableStringBuilder.length(), 33);
            }
            i6Var2.setText(spannableStringBuilder);
            i6Var.setText("≈" + org.telegram.messenger.r1.i().f(j3, "USD"));
            wdVar5.f51004f = "USD";
            wdVar4.f51000a = true;
            long j11 = tL_starsRevenueStatus.current_balance.amount;
            wdVar4.d = j11;
            zdVar = this;
            double d2 = zdVar.f52417g1;
            wdVar4.f51003e = (long) ((j11 / 1.0E9d) * d2 * 100.0d);
            wdVar4.f51004f = "USD";
            wd wdVar6 = wdVar2;
            wdVar6.f51000a = true;
            long j12 = tL_starsRevenueStatus.overall_revenue.amount;
            wdVar6.d = j12;
            wdVar6.f51003e = (long) ((j12 / 1.0E9d) * d2 * 100.0d);
            wdVar6.f51004f = "USD";
            zdVar.f52425o1 = true;
            if (tL_starsRevenueStatus.available_balance.amount > 0 && tL_starsRevenueStatus.withdrawal_enabled) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            zdVar.A0.setVisibility(i14);
        } else {
            double d10 = zdVar.f52418h1;
            if (d10 != 0.0d) {
                wdVar5.f51005g = true;
                TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus.available_balance;
                wdVar5.f51006i = starsAmount3;
                wdVar5.f51007j = (long) (starsAmount3.amount * d10 * 100.0d);
                int i15 = tL_starsRevenueStatus.next_withdrawal_at;
                pd pdVar = zdVar.G0;
                if (i6Var2 == null || i6Var == null) {
                    wdVar = wdVar3;
                    i7 = 0;
                } else {
                    wdVar = wdVar3;
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(bi.dd.a1(false, TextUtils.concat("XTR ", bi.dd.M0(starsAmount3, 0.8f, ' ')), 1.0f, null));
                    int indexOf2 = TextUtils.indexOf(spannableStringBuilder2, ".");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2.setSpan(relativeSizeSpan, indexOf2, spannableStringBuilder2.length(), 33);
                    }
                    zdVar.D0 = starsAmount3;
                    zdVar.E0.setText(spannableStringBuilder2);
                    zdVar.F0.setText("≈" + org.telegram.messenger.r1.i().f((long) (zdVar.f52418h1 * starsAmount3.amount * 100.0d), "USD"));
                    if (starsAmount3.amount > 0) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    zdVar.K0.setVisibility(i12);
                    if (zdVar.M0) {
                        zdVar.L0 = true;
                        long j13 = starsAmount3.amount;
                        zdVar.N0 = j13;
                        String l10 = Long.toString(j13);
                        bi.v vVar = zdVar.O0;
                        vVar.setText(l10);
                        vVar.setSelection(vVar.getText().length());
                        i7 = 0;
                        zdVar.L0 = false;
                        if (zdVar.N0 > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        pdVar.setEnabled(z11);
                    } else {
                        i7 = 0;
                    }
                    fi.d dVar = zdVar.J0;
                    if (dVar != null) {
                        if (starsAmount3.amount > 0) {
                            z10 = 1;
                        } else {
                            z10 = i7;
                        }
                        dVar.setEnabled(z10);
                    }
                    zdVar.B0 = i15;
                    ed edVar = zdVar.f52416f1;
                    org.telegram.messenger.g0.r(edVar);
                    edVar.run();
                }
                wdVar5.f51004f = "USD";
                wdVar4.f51005g = true;
                wdVar4.f51006i = tL_starsRevenueStatus.current_balance;
                double d11 = zdVar.f52418h1;
                wdVar4.f51007j = (long) (starsAmount.amount * d11 * 100.0d);
                wdVar4.f51004f = "USD";
                wd wdVar7 = wdVar;
                wdVar7.f51005g = true;
                wdVar7.f51006i = tL_starsRevenueStatus.overall_revenue;
                wdVar7.f51007j = (long) (starsAmount2.amount * d11 * 100.0d);
                wdVar7.f51004f = "USD";
                zdVar.f52425o1 = true;
                LinearLayout linearLayout = zdVar.I0;
                if (linearLayout != null) {
                    if (tL_starsRevenueStatus.withdrawal_enabled) {
                        i11 = i7;
                    } else {
                        i11 = 8;
                    }
                    linearLayout.setVisibility(i11);
                }
                if (pdVar != null) {
                    if (tL_starsRevenueStatus.available_balance.amount <= 0) {
                        boolean z12 = org.telegram.messenger.r2.f25216a;
                        i10 = 8;
                    } else {
                        i10 = i7;
                    }
                    pdVar.setVisibility(i10);
                }
            } else {
                return;
            }
        }
        org.telegram.ui.Components.r41 r41Var = zdVar.X0;
        if (r41Var != null && (m41Var = r41Var.f37496f3) != null) {
            m41Var.O(true);
        }
    }

    public View getTransactionTabs() {
        return this.f52411a1.d;
    }

    @Override
    public final void onAttachedToWindow() {
        f52409t1 = this;
        super.onAttachedToWindow();
        E();
    }

    @Override
    public final void onDetachedFromWindow() {
        f52409t1 = null;
        super.onDetachedFromWindow();
        org.telegram.ui.ActionBar.l lVar = this.f52419i1;
        if (lVar != null) {
            lVar.setCastShadows(true);
        }
    }

    public void setActionBar(org.telegram.ui.ActionBar.l lVar) {
        this.f52419i1 = lVar;
    }

    public void setTabsPinnedChangedListener(Runnable runnable) {
        this.S0 = runnable;
    }

    @Override
    public final void updateColors() {
        try {
            bi.v vVar = this.O0;
            if (vVar != null) {
                vVar.setHandlesColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28009jg, this.f52423n0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
