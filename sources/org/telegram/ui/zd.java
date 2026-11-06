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
public final class zd extends org.telegram.ui.Components.ht0 implements org.telegram.ui.ActionBar.a6 {
    public static zd f52527t1;
    public static HashMap f52528u1;
    public final fi.d A0;
    public int B0;
    public final bi.t C0;
    public TL_stars.StarsAmount D0;
    public final org.telegram.ui.Components.j6 E0;
    public final org.telegram.ui.Components.j6 F0;
    public final pd G0;
    public final org.telegram.ui.Components.wp[] H0;
    public final LinearLayout I0;
    public final fi.d J0;
    public final bi.u K0;
    public boolean L0;
    public boolean M0;
    public long N0;
    public final bi.v O0;
    public org.telegram.ui.Components.cc P0;
    public boolean Q0;
    public int R0;
    public Runnable S0;
    public final bi.ec T0;
    public int U0;
    public int V0;
    public int W0;
    public final org.telegram.ui.Components.q41 X0;
    public final FrameLayout Y0;
    public DecimalFormat Z0;
    public final vd f52529a1;
    public final boolean f52530b1;
    public final boolean f52531c1;
    public final oi.q f52532d1;
    public SpannableStringBuilder f52533e1;
    public final ed f52534f1;
    public double f52535g1;
    public double f52536h1;
    public org.telegram.ui.ActionBar.k f52537i1;
    public boolean f52538j1;
    public boolean f52539k1;
    public o41 l1;
    public final c51 m0;
    public o41 f52540m1;
    public final org.telegram.ui.ActionBar.f6 f52541n0;
    public o41 n1;
    public final int f52542o0;
    public boolean f52543o1;
    public final long f52544p0;
    public final wd f52545p1;
    public TL_stories.TL_premium_boostsStatus f52546q0;
    public final wd f52547q1;
    public int f52548r0;
    public final wd f52549r1;
    public final SpannableStringBuilder f52550s0;
    public final dd f52551s1;
    public final SpannableStringBuilder f52552t0;
    public final SpannableStringBuilder f52553u0;
    public final SpannableStringBuilder f52554v0;
    public final bi.t f52555w0;
    public final RelativeSizeSpan f52556x0;
    public final org.telegram.ui.Components.j6 f52557y0;
    public final org.telegram.ui.Components.j6 f52558z0;

    public zd(Activity activity, c51 c51Var, int i7, long j3, org.telegram.ui.ActionBar.f6 f6Var, oi.q qVar, boolean z9, boolean z10) {
        super(activity);
        this.D0 = TL_stars.StarsAmount.ofStars(0L);
        this.H0 = new org.telegram.ui.Components.wp[1];
        this.L0 = false;
        this.M0 = true;
        this.Q0 = true;
        this.R0 = -1;
        this.f52538j1 = false;
        this.f52539k1 = false;
        this.f52543o1 = false;
        String M0 = org.telegram.messenger.hd.M0(2131748383, null);
        wd wdVar = new wd();
        wdVar.f51057a = false;
        wdVar.f51058b = "TON";
        wdVar.h = "XTR";
        wdVar.f51059c = M0;
        this.f52545p1 = wdVar;
        String M02 = org.telegram.messenger.hd.M0(2131748382, null);
        wd wdVar2 = new wd();
        wdVar2.f51057a = false;
        wdVar2.f51058b = "TON";
        wdVar2.h = "XTR";
        wdVar2.f51059c = M02;
        this.f52547q1 = wdVar2;
        String M03 = org.telegram.messenger.hd.M0(2131748381, null);
        wd wdVar3 = new wd();
        wdVar3.f51057a = false;
        wdVar3.f51058b = "TON";
        wdVar3.h = "XTR";
        wdVar3.f51059c = M03;
        this.f52549r1 = wdVar3;
        this.f52551s1 = new dd(this, 7);
        this.f52532d1 = qVar;
        this.f52530b1 = z9;
        this.f52531c1 = z10;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.Z0 = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        this.Z0.setMaximumFractionDigits(12);
        this.Z0.setGroupingUsed(false);
        this.m0 = c51Var;
        this.f52541n0 = f6Var;
        this.f52542o0 = i7;
        this.f52544p0 = j3;
        long j10 = -j3;
        TLRPC.Chat M04 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(j10));
        if (M04 != null) {
            this.f52548r0 = M04.level;
        }
        org.telegram.messenger.qp.s1(i7).G0().a(j3, new r3(this, 2));
        H(false);
        if (z9) {
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.k6.I.q();
            tL_payments_getStarsRevenueStats.ton = true;
            tL_payments_getStarsRevenueStats.peer = org.telegram.messenger.qp.s1(i7).j1(j3);
            TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(i7).N0(j10);
            if (N0 != null) {
                boolean z11 = N0.restricted_sponsored;
                this.f52538j1 = z11;
                this.f52539k1 = z11;
            }
            ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getStarsRevenueStats, new kd(this, 1), null, null, 0, Integer.MAX_VALUE, 1, true);
        }
        TLRPC.Chat M05 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(j10));
        this.f52550s0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.a0(null, null, 2131748398, 50), -1, 3, new o1(c51Var, activity, f6Var, 12), f6Var), true);
        this.f52552t0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(org.telegram.messenger.qp.s1(i7).I5 ? 2131748404 : 2131748402, null), -1, 3, new dd(this, 0), null), true);
        this.f52553u0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0((z10 && z9) ? 2131748378 : z10 ? 2131748380 : 2131748376, null), -1, 3, new ed(this, (z10 && z9) ? 2131748377 : z10 ? 2131748379 : 2131748375, 0), f6Var), true);
        this.f52554v0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(org.telegram.messenger.t3.V(M05) ? 2131748371 : 2131748370, null), new dd(this, 1)), true);
        setCommonInsetsManagedExternally(true);
        setGeometry(new f(this, 11));
        this.T0 = new bi.ec(25, activity, this);
        vd vdVar = new vd(this, activity, i7, j3, c51Var.getClassGuid(), new dd(this, 2), f6Var);
        this.f52529a1 = vdVar;
        bi.t tVar = new bi.t(activity, 3);
        this.f52555w0 = tVar;
        tVar.setOrientation(1);
        int i10 = org.telegram.ui.ActionBar.k6.f27849d6;
        org.telegram.ui.ActionBar.r6.i(i10, tVar, f6Var);
        tVar.setPadding(0, 0, 0, org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(activity, false, true, true);
        this.f52557y0 = j6Var;
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.Z(j6Var, i11, f6Var);
        j6Var.setTextSize(org.telegram.messenger.g0.L(32.0f));
        j6Var.setGravity(17);
        this.f52556x0 = new RelativeSizeSpan(0.6770833f);
        tVar.addView(j6Var, c8.ha.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(activity, true, true, true);
        this.f52558z0 = j6Var2;
        j6Var2.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.k6.f28241y6;
        org.telegram.ui.ActionBar.r6.Z(j6Var2, i12, f6Var);
        j6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        tVar.addView(j6Var2, c8.ha.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        fi.d dVar = new fi.d(activity, f6Var, true);
        dVar.setRoundRadius(24);
        this.A0 = dVar;
        dVar.setEnabled(org.telegram.messenger.qp.s1(i7).I5);
        dVar.i(org.telegram.messenger.hd.M0(2131748350, null), false, true);
        dVar.setVisibility(8);
        dVar.setOnClickListener(new org.telegram.ui.ActionBar.l1(7, this, c51Var));
        tVar.addView(dVar, c8.ha.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        bi.t tVar2 = new bi.t(activity, 4);
        this.C0 = tVar2;
        tVar2.setOrientation(1);
        org.telegram.ui.ActionBar.r6.i(i10, tVar2, f6Var);
        tVar2.setPadding(0, 0, 0, org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.Components.j6 j6Var3 = new org.telegram.ui.Components.j6(activity, false, true, true);
        this.E0 = j6Var3;
        j6Var3.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.Z(j6Var3, i11, f6Var);
        j6Var3.setTextSize(org.telegram.messenger.g0.L(32.0f));
        j6Var3.setGravity(17);
        new RelativeSizeSpan(0.6770833f);
        tVar2.addView(j6Var3, c8.ha.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.j6 j6Var4 = new org.telegram.ui.Components.j6(activity, true, true, true);
        this.F0 = j6Var4;
        j6Var4.setGravity(17);
        org.telegram.ui.ActionBar.r6.Z(j6Var4, i12, f6Var);
        j6Var4.setTextSize(org.telegram.messenger.g0.L(14.0f));
        tVar2.addView(j6Var4, c8.ha.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        bi.u uVar = new bi.u(1, activity, this);
        this.K0 = uVar;
        uVar.setVisibility(8);
        uVar.setText(org.telegram.messenger.hd.M0(2131752953, null));
        uVar.setLeftPadding(org.telegram.messenger.g0.L(36.0f));
        bi.v vVar = new bi.v(activity, 3);
        this.O0 = vVar;
        vVar.setFocusable(false);
        org.telegram.ui.ActionBar.r6.V(vVar, i11, f6Var);
        vVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        vVar.setCursorWidth(1.5f);
        vVar.setBackground(null);
        vVar.setTextSize(1, 18.0f);
        vVar.setMaxLines(1);
        int L = org.telegram.messenger.g0.L(16.0f);
        vVar.setPadding(org.telegram.messenger.g0.L(6.0f), L, L, L);
        vVar.setInputType(2);
        vVar.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.r6.D(vVar, org.telegram.ui.ActionBar.k6.f27949ig, f6Var);
        org.telegram.ui.ActionBar.r6.m(vVar, 36, org.telegram.ui.ActionBar.k6.f27968jg, f6Var);
        vVar.setGravity(org.telegram.messenger.hd.f22878a0 ? 5 : 3);
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
        ?? dVar2 = new fi.d(activity, f6Var, true);
        dVar2.setRoundRadius(24);
        this.G0 = dVar2;
        dVar2.setEnabled(false);
        dVar2.i(org.telegram.messenger.hd.G(0, "MonetizationStarsWithdraw", new Object[0]), false, true);
        dVar2.setVisibility(0);
        dVar2.setOnClickListener(new bi.la(this, i7, c51Var, 4));
        fi.d dVar3 = new fi.d(activity, f6Var, true);
        dVar3.setRoundRadius(24);
        this.J0 = dVar3;
        dVar3.setEnabled(false);
        dVar3.i(org.telegram.messenger.hd.M0(2131748373, null), false, true);
        dVar3.setOnClickListener(new hd(this, i7, j3, activity));
        linearLayout2.addView((View) dVar2, c8.ha.p(-1, 48, 1.0f, 119));
        if (org.telegram.messenger.t3.V(M05)) {
            linearLayout2.addView(new Space(activity), c8.ha.p(8, 48, 0.0f, 119));
            linearLayout2.addView(dVar3, c8.ha.p(-1, 48, 1.0f, 119));
        }
        tVar2.addView(linearLayout2, c8.ha.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        vVar.setOnEditorActionListener(new nd(0, this, c51Var));
        this.f52534f1 = new ed(this, i7, 2);
        org.telegram.ui.Components.q41 q41Var = new org.telegram.ui.Components.q41(c51Var, new a5(this, 2), new cd(this), new org.telegram.messenger.ch(this, 20));
        this.X0 = q41Var;
        jg.i0 i0Var = new jg.i0(5, this, false);
        q41Var.f37159e3 = i0Var;
        q41Var.setLayoutManager(i0Var);
        q41Var.setClipToPadding(false);
        q41Var.r1();
        q41Var.setCaptureSectionsDecoratorAllowed(true);
        q41Var.f37160f3.f35510r = false;
        u(q41Var, new cd(this));
        x(vdVar, vdVar.f50700b, new org.telegram.messenger.ch(19));
        View view = vdVar.d;
        y(view);
        view.setLayoutParams(c8.ha.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        if (qVar != null) {
            qVar.b(q41Var);
        }
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.Y0 = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27793a7, frameLayout, f6Var);
        frameLayout.addView(e10, c8.ha.e(-2, -2, 17));
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
        textView.setText(org.telegram.messenger.hd.M0(2131748776, "LoadingStats"));
        textView.setGravity(1);
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 15.0f);
        int i14 = org.telegram.ui.ActionBar.k6.Dj;
        org.telegram.ui.ActionBar.r6.V(textView2, i14, null);
        textView2.setTag(Integer.valueOf(i14));
        textView2.setText(org.telegram.messenger.hd.M0(2131748775, null));
        textView2.setGravity(1);
        e10.addView((View) imageView2, c8.ha.t(120, 120, 1, 0, 0, 0, 20));
        e10.addView(textView, c8.ha.t(-2, -2, 1, 0, 0, 0, 10));
        e10.addView(textView2, c8.ha.r(-2, -2, 1));
        addView(frameLayout, c8.ha.e(-1, -1, 119));
    }

    public static org.telegram.ui.ActionBar.v2 I(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, f6Var, false);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231612);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(80.0f);
        int i18 = org.telegram.ui.ActionBar.k6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.w0(i18, f6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i18);
        imageView.setBackground(L2);
        org.telegram.ui.ActionBar.r6.k(imageView, L2, N, null, f6Var);
        f10.addView(imageView, c8.ha.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        com.google.android.recaptcha.internal.a.q(textView, 1, 20.0f);
        int i19 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i19, f6Var);
        if (z9) {
            i7 = 2131753035;
        } else {
            i7 = 2131748388;
        }
        textView.setText(org.telegram.messenger.hd.M0(i7, null));
        f10.addView(textView, c8.ha.k(8.0f, 0.0f, 8.0f, 25.0f, -1, -2));
        if (z9) {
            i10 = 2131753044;
        } else {
            i10 = 2131748397;
        }
        String M0 = org.telegram.messenger.hd.M0(i10, null);
        if (z9) {
            i11 = 2131753043;
        } else {
            i11 = 2131748396;
        }
        f10.addView(new di.a4(context, 2131232088, M0, org.telegram.messenger.hd.M0(i11, null), f6Var), c8.ha.t(-1, -2, 49, 8, 0, 8, 16));
        if (z9) {
            i12 = 2131753042;
        } else {
            i12 = 2131748395;
        }
        String M02 = org.telegram.messenger.hd.M0(i12, null);
        if (z9) {
            i13 = 2131753041;
        } else {
            i13 = 2131748394;
        }
        f10.addView(new di.a4(context, 2131231814, M02, org.telegram.messenger.hd.M0(i13, null), f6Var), c8.ha.t(-1, -2, 49, 8, 0, 8, 16));
        if (z9) {
            i14 = 2131753040;
        } else {
            i14 = 2131748393;
        }
        String M03 = org.telegram.messenger.hd.M0(i14, null);
        if (z9) {
            i15 = 2131753039;
        } else {
            i15 = 2131748392;
        }
        f10.addView(new di.a4(context, 2131231824, M03, org.telegram.messenger.hd.M0(i15, null), f6Var), c8.ha.t(-1, -2, 49, 8, 0, 8, 16));
        View view = new View(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27850d7, view, f6Var);
        f10.addView(view, c8.ha.n(1.0f / org.telegram.messenger.g0.f22543p, -1, 55, 12, 0, 12, 0));
        org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(context);
        q5Var.setGravity(17);
        q5Var.setTextSize(1, 20.0f);
        q5Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.V(q5Var, i19, f6Var);
        SpannableString spannableString = new SpannableString("💎");
        org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(2131231957, 0);
        wpVar.d = false;
        wpVar.H = 0.9f;
        wpVar.I = 0.9f;
        wpVar.b(q5Var.getPaint().getFontMetricsInt());
        wpVar.G = 0.9f;
        spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
        if (z9) {
            i16 = 2131753036;
        } else {
            i16 = 2131748389;
        }
        q5Var.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.hd.M0(i16, null), spannableString, "💎"));
        f10.addView(q5Var, c8.ha.k(8.0f, 20.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(context, f6Var);
        w70Var.setGravity(17);
        w70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(w70Var, i19, f6Var);
        org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.Uc, f6Var);
        if (z9) {
            i17 = 2131753037;
        } else {
            i17 = 2131748390;
        }
        w70Var.setText(org.telegram.messenger.g0.d4(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(i17, null)), new bi.k1(19, context, z9)));
        f10.addView(w70Var, c8.ha.k(28.0f, 9.0f, 28.0f, 0.0f, -1, -2));
        fi.d h = org.telegram.messenger.k5.h(24, context, f6Var, true);
        h.i(org.telegram.messenger.hd.M0(2131749530, null), false, true);
        h.setOnClickListener(new gd(l10, 0));
        f10.addView(h, c8.ha.t(-1, 48, 55, 10, 25, 10, 14));
        l10.N = f10;
        return l10;
    }

    public static SpannableStringBuilder K(CharSequence charSequence, TextPaint textPaint, float f10, float f11, boolean z9) {
        int i7;
        if (f52528u1 == null) {
            f52528u1 = new HashMap();
        }
        int i10 = textPaint.getFontMetricsInt().bottom;
        if (z9) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        int i11 = ((i10 * i7) * ((int) (f10 * 100.0f))) - ((int) (100.0f * f11));
        SpannableString spannableString = (SpannableString) f52528u1.get(Integer.valueOf(i11));
        if (spannableString == null) {
            spannableString = new SpannableString("T");
            if (z9) {
                org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(2131231957, 0);
                wpVar.d = false;
                wpVar.H = f10;
                wpVar.I = f10;
                wpVar.a(org.telegram.ui.ActionBar.k6.f28049o6);
                wpVar.b(textPaint.getFontMetricsInt());
                wpVar.G = 0.9f;
                spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
            } else {
                org.telegram.ui.Components.wp wpVar2 = new org.telegram.ui.Components.wp(2131231955, 0);
                wpVar2.d = false;
                wpVar2.H = f10;
                wpVar2.I = f10;
                wpVar2.f40071s = f11;
                wpVar2.G = 0.95f;
                spannableString.setSpan(wpVar2, 0, spannableString.length(), 33);
            }
            f52528u1.put(Integer.valueOf(i11), spannableString);
        }
        return org.telegram.messenger.g0.M2(charSequence, spannableString, "TON");
    }

    public static void M(Context context, int i7, TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction, long j3, org.telegram.ui.ActionBar.f6 f6Var) {
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
        org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, f6Var, false);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        boolean z11 = broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal;
        if (z11) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            M0 = org.telegram.messenger.hd.M0(2131748360, null);
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
                M0 = org.telegram.messenger.hd.M0(2131748362, null);
                j11 = tL_broadcastRevenueTransactionProceeds.from_date;
                j13 = tL_broadcastRevenueTransactionProceeds.to_date;
                j12 = tL_broadcastRevenueTransactionProceeds.amount;
            } else if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionRefund) {
                TL_stats.TL_broadcastRevenueTransactionRefund tL_broadcastRevenueTransactionRefund = (TL_stats.TL_broadcastRevenueTransactionRefund) broadcastRevenueTransaction;
                M0 = org.telegram.messenger.hd.M0(2131748361, null);
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
            i10 = org.telegram.ui.ActionBar.k6.f28090q7;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f27998l8;
        }
        org.telegram.ui.ActionBar.r6.V(textView, i10, null);
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
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28241y6, f6Var);
        if (z9) {
            textView2.setText(org.telegram.messenger.hd.M0(2131748357, null));
        } else if (j15 == j10) {
            textView2.setText(org.telegram.messenger.hd.Q(j13));
        } else if (j13 == j10) {
            textView2.setText(org.telegram.messenger.hd.Q(j15));
        } else {
            textView2.setText(org.telegram.messenger.hd.Q(j15) + " - " + org.telegram.messenger.hd.Q(j13));
        }
        if (z10) {
            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28090q7, f6Var);
            textView2.setText(TextUtils.concat(textView2.getText(), " — ", org.telegram.messenger.hd.M0(2131748358, null)));
        }
        f10.addView(textView2, c8.ha.t(-1, -2, 49, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        textView3.setGravity(17);
        org.telegram.messenger.camera.q.m(textView3, 1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.G6, f6Var);
        textView3.setText(M0);
        f10.addView(textView3, c8.ha.t(-1, -2, 49, 0, 27, 0, 0));
        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
            FrameLayout frameLayout = new FrameLayout(context);
            int L = org.telegram.messenger.g0.L(28.0f);
            int L2 = org.telegram.messenger.g0.L(28.0f);
            int i11 = org.telegram.ui.ActionBar.k6.Qi;
            ShapeDrawable e02 = org.telegram.ui.ActionBar.k6.e0(L, L2, org.telegram.ui.ActionBar.k6.w0(i11, f6Var));
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
            frameLayout.setBackground(e02);
            org.telegram.ui.ActionBar.r6.k(frameLayout, e02, N, null, f6Var);
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
            org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
            l9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
            org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
            w8Var.l(chat);
            l9Var.e(chat, w8Var);
            frameLayout.addView(l9Var, c8.ha.e(28, 28, 51));
            TextView textView4 = new TextView(context);
            org.telegram.ui.ActionBar.r6.V(textView4, org.telegram.ui.ActionBar.k6.f27957j5, f6Var);
            textView4.setTextSize(1, 13.0f);
            textView4.setSingleLine();
            textView4.setText(p10);
            frameLayout.addView(textView4, c8.ha.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
            f10.addView(frameLayout, c8.ha.t(-2, 28, 1, 42, 10, 42, 0));
        }
        fi.d h = org.telegram.messenger.k5.h(24, context, f6Var, true);
        if (z11) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal2 = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            if ((tL_broadcastRevenueTransactionWithdrawal2.flags & 2) != 0) {
                h.i(org.telegram.messenger.hd.M0(2131748359, null), false, true);
                h.setOnClickListener(new org.telegram.ui.ActionBar.l1(8, context, tL_broadcastRevenueTransactionWithdrawal2));
                f10.addView(h, c8.ha.t(-1, 48, 55, 18, 30, 18, 14));
                l10.N = f10;
                l10.show();
            }
        }
        h.i(org.telegram.messenger.hd.M0(2131747830, null), false, true);
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
        this.f52536h1 = tL_payments_starsRevenueStats.usd_rate;
        o41 i02 = c51.i0(tL_payments_starsRevenueStats.revenue_graph, org.telegram.messenger.hd.M0(2131748399, null), 2, false);
        this.n1 = i02;
        if (i02 != null && (bVar = i02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.n1.d.d.get(0) != null) {
            ((mg.a) this.n1.d.d.get(0)).f20018g = org.telegram.ui.ActionBar.k6.Yj;
            this.n1.d.h = (float) ((1.0d / this.f52536h1) / 100.0d);
        }
        L(false, tL_payments_starsRevenueStats.status);
        if (!this.f52530b1 && (frameLayout = this.Y0) != null) {
            frameLayout.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.xq.h).withEndAction(new dd(this, 6)).start();
        }
        org.telegram.ui.Components.q41 q41Var = this.X0;
        if (q41Var != null) {
            q41Var.f37160f3.O(!z9);
            if (z9) {
                q41Var.v0(0);
            }
        }
    }

    public final void E() {
        if (isAttachedToWindow() && this.f52530b1 && this.f52543o1 && org.telegram.messenger.qp.e1().getBoolean("monetizationadshint", true)) {
            this.m0.showDialog(I(getContext(), this.f52541n0, false));
            org.telegram.messenger.qp.e1().edit().putBoolean("monetizationadshint", false).apply();
        }
    }

    public final void F(boolean z9, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        c51 c51Var = this.m0;
        if (c51Var != null) {
            Activity parentActivity = c51Var.getParentActivity();
            int i7 = this.f52542o0;
            TLRPC.User f10 = org.telegram.messenger.p10.i(i7).f();
            if (parentActivity != null && f10 != null) {
                long j3 = this.f52544p0;
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
        if (!this.f52531c1) {
            return;
        }
        int i7 = this.f52542o0;
        bi.n0 g10 = bi.n0.g(i7);
        long j3 = this.f52544p0;
        TLRPC.TL_payments_starsRevenueStats h = g10.h(j3, z9);
        if (h != null) {
            org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.p(28, this, h));
            return;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.peer = org.telegram.messenger.qp.s1(i7).j1(j3);
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.k6.I.q();
        ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getStarsRevenueStats, new kd(this, 2));
    }

    public final void J() {
        vd vdVar = this.f52529a1;
        dd ddVar = vdVar.f50703f;
        boolean[] zArr = vdVar.f50707w;
        boolean a10 = vdVar.a();
        for (int i7 = 0; i7 < 2; i7++) {
            if (!zArr[i7]) {
                if (i7 == 1) {
                    vdVar.f50704n.clear();
                    vdVar.h = "";
                } else {
                    vdVar.f50705r.clear();
                    vdVar.f50706s = "";
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
        org.telegram.ui.Components.l41 l41Var;
        long j3;
        wd wdVar2;
        int i13;
        int i14;
        zd zdVar = this;
        wd wdVar3 = zdVar.f52549r1;
        wd wdVar4 = zdVar.f52547q1;
        org.telegram.ui.Components.j6 j6Var = zdVar.f52558z0;
        RelativeSizeSpan relativeSizeSpan = zdVar.f52556x0;
        org.telegram.ui.Components.j6 j6Var2 = zdVar.f52557y0;
        wd wdVar5 = zdVar.f52545p1;
        if (z9) {
            wdVar5.f51057a = true;
            long j10 = tL_starsRevenueStatus.available_balance.amount;
            wdVar5.d = j10;
            double d = j10 / 1.0E9d;
            wdVar5.f51060e = (long) (zdVar.f52535g1 * d * 100.0d);
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
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(K("TON " + zdVar.Z0.format(d), j6Var2.getPaint(), 0.9f, 0.0f, true));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(relativeSizeSpan, indexOf, spannableStringBuilder.length(), 33);
            }
            j6Var2.setText(spannableStringBuilder);
            j6Var.setText("≈" + org.telegram.messenger.r1.i().f(j3, "USD"));
            wdVar5.f51061f = "USD";
            wdVar4.f51057a = true;
            long j11 = tL_starsRevenueStatus.current_balance.amount;
            wdVar4.d = j11;
            zdVar = this;
            double d2 = zdVar.f52535g1;
            wdVar4.f51060e = (long) ((j11 / 1.0E9d) * d2 * 100.0d);
            wdVar4.f51061f = "USD";
            wd wdVar6 = wdVar2;
            wdVar6.f51057a = true;
            long j12 = tL_starsRevenueStatus.overall_revenue.amount;
            wdVar6.d = j12;
            wdVar6.f51060e = (long) ((j12 / 1.0E9d) * d2 * 100.0d);
            wdVar6.f51061f = "USD";
            zdVar.f52543o1 = true;
            if (tL_starsRevenueStatus.available_balance.amount > 0 && tL_starsRevenueStatus.withdrawal_enabled) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            zdVar.A0.setVisibility(i14);
        } else {
            double d10 = zdVar.f52536h1;
            if (d10 != 0.0d) {
                wdVar5.f51062g = true;
                TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus.available_balance;
                wdVar5.f51063i = starsAmount3;
                wdVar5.f51064j = (long) (starsAmount3.amount * d10 * 100.0d);
                int i15 = tL_starsRevenueStatus.next_withdrawal_at;
                pd pdVar = zdVar.G0;
                if (j6Var2 == null || j6Var == null) {
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
                    zdVar.F0.setText("≈" + org.telegram.messenger.r1.i().f((long) (zdVar.f52536h1 * starsAmount3.amount * 100.0d), "USD"));
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
                    ed edVar = zdVar.f52534f1;
                    org.telegram.messenger.g0.r(edVar);
                    edVar.run();
                }
                wdVar5.f51061f = "USD";
                wdVar4.f51062g = true;
                wdVar4.f51063i = tL_starsRevenueStatus.current_balance;
                double d11 = zdVar.f52536h1;
                wdVar4.f51064j = (long) (starsAmount.amount * d11 * 100.0d);
                wdVar4.f51061f = "USD";
                wd wdVar7 = wdVar;
                wdVar7.f51062g = true;
                wdVar7.f51063i = tL_starsRevenueStatus.overall_revenue;
                wdVar7.f51064j = (long) (starsAmount2.amount * d11 * 100.0d);
                wdVar7.f51061f = "USD";
                zdVar.f52543o1 = true;
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
                        boolean z12 = org.telegram.messenger.r2.f25199a;
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
        org.telegram.ui.Components.q41 q41Var = zdVar.X0;
        if (q41Var != null && (l41Var = q41Var.f37160f3) != null) {
            l41Var.O(true);
        }
    }

    public View getTransactionTabs() {
        return this.f52529a1.d;
    }

    @Override
    public final void onAttachedToWindow() {
        f52527t1 = this;
        super.onAttachedToWindow();
        E();
    }

    @Override
    public final void onDetachedFromWindow() {
        f52527t1 = null;
        super.onDetachedFromWindow();
        org.telegram.ui.ActionBar.k kVar = this.f52537i1;
        if (kVar != null) {
            kVar.setCastShadows(true);
        }
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.f52537i1 = kVar;
    }

    public void setTabsPinnedChangedListener(Runnable runnable) {
        this.S0 = runnable;
    }

    @Override
    public final void updateColors() {
        try {
            bi.v vVar = this.O0;
            if (vVar != null) {
                vVar.setHandlesColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27968jg, this.f52541n0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
