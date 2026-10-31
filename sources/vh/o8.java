package vh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.util.Property;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.ee;
import org.telegram.messenger.ff;
import org.telegram.messenger.h20;
import org.telegram.messenger.hs;
import org.telegram.messenger.n20;
import org.telegram.messenger.q20;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.we;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fe0;
import org.telegram.ui.Components.gf0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.he0;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.ne0;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.oe0;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.s81;
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.aa0;
import org.telegram.ui.bk0;
import org.telegram.ui.cv0;
import org.telegram.ui.do0;
import org.telegram.ui.hk;
import org.telegram.ui.l40;
public final class o8 implements us {
    public static o8 F2;
    public final c8 A0;
    public View A1;
    public boolean A2;
    public t7 B0;
    public oe0 B1;
    public boolean B2;
    public o4 C0;
    public final ne0 C1;
    public y7 C2;
    public final aa0 D;
    public final a5 D0;
    public TextureView D1;
    public float D2;
    public ValueAnimator E;
    public final a9 E0;
    public fe0 E1;
    public ValueAnimator E2;
    public j8 F;
    public final b9 F0;
    public he0 F1;
    public float G;
    public final u G0;
    public File G1;
    public final RectF H;
    public final a9 H0;
    public ArrayList H1;
    public float I;
    public final t I0;
    public ArrayList I1;
    public int J;
    public final e9 J0;
    public ArrayList J1;
    public float K;
    public boolean K0;
    public n5 K1;
    public Float L;
    public boolean L0;
    public boolean L1;
    public boolean M;
    public m2 M0;
    public long M1;
    public long N;
    public o0 N0;
    public boolean N1;
    public boolean O;
    public final r4 O0;
    public int O1;
    public final e2.f P;
    public final d P0;
    public boolean P1;
    public Runnable Q;
    public final l7 Q0;
    public boolean Q1;
    public n20 R;
    public final x1 R0;
    public boolean R1;
    public int S;
    public final x1 S0;
    public boolean S1;
    public int T;
    public final o2 T0;
    public float T1;
    public int U;
    public final o2 U0;
    public int U1;
    public boolean V;
    public final s81 V0;
    public boolean V1;
    public boolean W;
    public final p2 W0;
    public boolean W1;
    public boolean X;
    public final d8 X0;
    public boolean X1;
    public int Y;
    public final FrameLayout Y0;
    public String Y1;
    public int Z;
    public final z8 Z0;
    public AnimatorSet Z1;
    public final th.b f51604a;
    public int f51605a0;
    public final d9 f51606a1;
    public boolean a2;
    public final Activity f51607b;
    public int f51608b0;
    public final f4 f51609b1;
    public boolean f51610b2;
    public final int f51611c;
    public final RectF f51612c0;
    public final e8 f51613c1;
    public boolean f51614c2;
    public boolean d;
    public final RectF f51615d0;
    public final k7 f51616d1;
    public boolean f51617d2;
    public boolean e;
    public final Path f51618e0;
    public final n0 f51619e1;
    public Runnable f51620e2;
    public final WindowManager f51621f;
    public int f51622f0;
    public bi0 f51623f1;
    public AnimatorSet f51624f2;
    public int f51625g0;
    public final ei0 f51626g1;
    public c7 f51627g2;
    public final WindowManager.LayoutParams h;
    public final b8 f51628h0;
    public bi0 f51629h1;
    public boolean f51630h2;
    public final FrameLayout f51631i0;
    public ImageView f51632i1;
    public AnimatorSet f51633i2;
    public final LinearLayout f51634j0;
    public final kg.f0 f51635j1;
    public ValueAnimator f51636j2;
    public final FrameLayout f51637k0;
    public final p2 f51638k1;
    public boolean f51639k2;
    public final org.telegram.ui.Components.voip.i0 f51640l0;
    public final p2 l1;
    public s4.z f51641l2;
    public final FrameLayout m0;
    public final p2 f51642m1;
    public we f51643m2;
    public final n8 f51644n;
    public final x1 f51645n0;
    public final p2 f51646n1;
    public ValueAnimator f51647n2;
    public final g5 f51648o0;
    public final g4 f51649o1;
    public o1.j f51650o2;
    public final org.telegram.ui.ActionBar.u5 f51651p0;
    public final c9 f51652p1;
    public Boolean f51653p2;
    public w6 f51654q0;
    public n f51655q1;
    public g7 f51656q2;
    public final g8 f51657r;
    public final s9 f51658r0;
    public z7 f51659r1;
    public AnimatorSet f51660r2;
    public final z1 f51661s;
    public final j4 f51662s0;
    public a8 f51663s1;
    public boolean f51664s2;
    public final do0 f51665t0;
    public final z8 f51666t1;
    public int f51667t2;
    public boolean f51668u0;
    public final d f51669u1;
    public ArrayList f51670u2;
    public long f51671v0;
    public s7 f51672v1;
    public FrameLayout f51673v2;
    public boolean f51674w;
    public String f51675w0;
    public ig.c1 f51676w1;
    public boolean f51677w2;
    public long f51678x;
    public TLRPC.InputPeer f51679x0;
    public View f51680x1;
    public y6 f51681x2;
    public f8 f51682y;
    public u6 f51683y0;
    public View f51684y1;
    public org.telegram.utils.twidget.v f51685y2;
    public r f51686z0;
    public View f51687z1;
    public boolean f51688z2;

    public o8(Activity activity, int i10) {
        aa0 aa0Var;
        int i11;
        int i12;
        int i13;
        float f7;
        boolean z10;
        float f10;
        th.b bVar = new th.b();
        this.f51604a = bVar;
        this.f51678x = 0L;
        this.H = new RectF();
        this.M = true;
        this.P = new e2.f(null);
        this.f51612c0 = new RectF();
        this.f51615d0 = new RectF();
        this.f51618e0 = new Path();
        new Rect();
        this.f51622f0 = 0;
        this.f51625g0 = -1;
        this.f51683y0 = new u6();
        this.H1 = null;
        this.I1 = null;
        this.J1 = null;
        this.O1 = 0;
        this.P1 = false;
        this.Q1 = false;
        this.R1 = false;
        this.S1 = false;
        this.U1 = -3;
        this.W1 = false;
        o7 o7Var = new o7(this);
        this.f51617d2 = true;
        this.f51639k2 = true;
        this.f51667t2 = -1;
        this.f51607b = activity;
        this.f51611c = i10;
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null) {
            aa0Var = new aa0(launchActivity, true);
        } else {
            aa0Var = null;
        }
        this.D = aa0Var;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.h = layoutParams;
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.format = -3;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        org.telegram.messenger.i0.m(layoutParams);
        layoutParams.flags = -2013200128;
        layoutParams.softInputMode = 16;
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        this.f51621f = windowManager;
        n8 n8Var = new n8(this, activity);
        this.f51644n = n8Var;
        f7 f7Var = new f7(this, 1);
        WeakHashMap weakHashMap = r0.h0.f46123a;
        r0.z.i(n8Var, f7Var);
        this.f51644n.setFocusable(true);
        this.f51644n.setImportantForAccessibility(2);
        z1 z1Var = new z1(activity, windowManager, this.f51644n, layoutParams);
        this.f51661s = z1Var;
        z1Var.a(new w7(this));
        this.f51644n.addView(this.f51661s.f52227b, new ViewGroup.LayoutParams(-1, -1));
        n8 n8Var2 = this.f51644n;
        g8 g8Var = new g8(this, activity);
        this.f51657r = g8Var;
        n8Var2.addView(g8Var);
        g8 g8Var2 = this.f51657r;
        b8 b8Var = new b8(this, activity);
        this.f51628h0 = b8Var;
        g8Var2.addView(b8Var);
        this.f51657r.addView(this.f51661s.f52228c, new ViewGroup.LayoutParams(-1, -1));
        this.f51658r0 = new s9(this.f51628h0);
        this.f51662s0 = new Object();
        g8 g8Var3 = this.f51657r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f51631i0 = frameLayout;
        g8Var3.addView(frameLayout);
        g8 g8Var4 = this.f51657r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.f51637k0 = frameLayout2;
        g8Var4.addView(frameLayout2);
        g8 g8Var5 = this.f51657r;
        org.telegram.ui.Components.voip.i0 i0Var = new org.telegram.ui.Components.voip.i0(this, activity, 9);
        this.f51640l0 = i0Var;
        g8Var5.addView(i0Var);
        this.f51640l0.setVisibility(8);
        this.f51640l0.setAlpha(0.0f);
        g8 g8Var6 = this.f51657r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.m0 = frameLayout3;
        g8Var6.addView(frameLayout3);
        wb.a(this.f51644n, new mg.u(13));
        c8 c8Var = new c8(this, activity, this.f51658r0, this.f51657r, bVar);
        this.A0 = c8Var;
        n8 n8Var3 = this.f51644n;
        Objects.requireNonNull(n8Var3);
        c8Var.setCancelGestures(new d0(n8Var3, 15));
        this.A0.setResetState(new y6(this, 13));
        this.f51628h0.addView(this.A0, w7.b6.e(-1, -1, 119));
        this.A0.setOnClickListener(new a7(this, 12));
        b8 b8Var2 = this.f51628h0;
        int i14 = this.J;
        if (i14 != 1 && i14 != 0) {
            i11 = -14737633;
        } else {
            i11 = 0;
        }
        b8Var2.setBackgroundColor(i11);
        b8 b8Var3 = this.f51628h0;
        bi.d2 d2Var = rf.e0.f46526a;
        b8Var3.setOutlineProvider(new rf.c0(0, org.telegram.messenger.i0.L(12.0f)));
        this.f51628h0.setClipToOutline(true);
        y6 y6Var = new y6(this, 14);
        ?? view = new View(activity);
        view.f28774a = new TextPaint(1);
        view.f28775b = new TextPaint(1);
        gr grVar = gr.h;
        view.f28780s = new org.telegram.ui.Components.t5((View) view, 0L, 350L, grVar);
        view.I = new eb0(view, 7);
        view.f28783y = y6Var;
        this.C1 = view;
        d8 d8Var = new d8(this, activity, this.f51658r0, this.f51662s0);
        this.X0 = d8Var;
        d8Var.setCollageView(this.A0);
        d8 d8Var2 = this.X0;
        d8Var2.f51429w = new y6(this, 15);
        d8Var2.setOnTapListener(new y6(this, 16));
        this.X0.setVisibility(8);
        d8 d8Var3 = this.X0;
        d8Var3.N = new y6(this, 17);
        this.f51628h0.addView(d8Var3, w7.b6.e(-1, -1, 119));
        this.f51628h0.addView(this.C1, w7.b6.e(-1, -1, 119));
        n8 n8Var4 = this.f51644n;
        e8 e8Var = new e8(this, activity, n8Var4, n8Var4, this.f51657r, bVar, this.f51658r0);
        this.f51613c1 = e8Var;
        e8Var.setAccount(i10);
        this.f51613c1.setUiBlurBitmap(new th.m1(15));
        wb.a(this.f51640l0, new org.telegram.ui.Components.k7(this, 11));
        this.f51613c1.setOnHeightUpdate(new z6(this, 13));
        this.f51613c1.setOnPeriodUpdate(new z6(this, 4));
        long j10 = this.N;
        if (j10 != 0) {
            this.f51613c1.setDialogId(j10);
        }
        this.f51613c1.setOnPremiumHint(new z6(this, 5));
        this.f51613c1.setOnKeyboardOpen(new z6(this, 6));
        do0 do0Var = new do0(this, activity, 11);
        this.f51665t0 = do0Var;
        this.f51657r.addView(do0Var);
        z8 z8Var = new z8(activity, this.f51657r, this.f51628h0, bVar, this.f51658r0);
        this.Z0 = z8Var;
        z8Var.setOnTimelineClick(new y6(this, 10));
        this.Z0.setOnHeightChange(new y6(this, 11));
        this.X0.setVideoTimelineView(this.Z0);
        this.Z0.setVisibility(8);
        this.Z0.setAlpha(0.0f);
        this.Z0.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.Y0 = frameLayout4;
        float f11 = 388;
        frameLayout4.addView(this.Z0, w7.b6.d(-1, f11, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        d9 d9Var = new d9(activity);
        this.f51606a1 = d9Var;
        d9Var.setVisibility(8);
        this.f51606a1.a(false);
        this.Y0.addView(this.f51606a1, w7.b6.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f51640l0.addView(this.Y0, w7.b6.d(-1, 413, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.f51640l0.addView(this.f51613c1, w7.b6.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.A0.setTimelineView(this.Z0);
        this.A0.setPreviewView(this.X0);
        z8 z8Var2 = new z8(activity, this.f51657r, this.f51628h0, bVar, this.f51658r0);
        this.f51666t1 = z8Var2;
        z8Var2.X0 = true;
        z8Var2.setVisibility(8);
        this.f51666t1.setAlpha(0.0f);
        this.f51640l0.addView(this.f51666t1, w7.b6.d(-1, f11, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        k7 k7Var = new k7(this, activity, bVar, this.f51658r0);
        this.f51616d1 = k7Var;
        k7Var.setVisibility(8);
        this.f51640l0.addView(this.f51616d1, w7.b6.e(-1, -2, 85));
        ?? imageView = new ImageView(activity);
        this.f51645n0 = imageView;
        imageView.setContentDescription(cd.L0(2131754878, null));
        x1 x1Var = this.f51645n0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        x1Var.setScaleType(scaleType);
        this.f51645n0.setImageResource(2131232276);
        x1 x1Var2 = this.f51645n0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        x1Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f51645n0.setBackground(org.telegram.ui.ActionBar.t6.h0(553648127, 1, -1));
        this.f51645n0.setOnClickListener(new a7(this, 1));
        this.f51631i0.addView(this.f51645n0, w7.b6.e(56, 56, 51));
        this.f51661s.a(this.f51645n0);
        g5 g5Var = new g5(activity, i10);
        this.f51648o0 = g5Var;
        g5Var.a(false, false);
        this.f51648o0.setOnClickListener(new rh.u1(10, this, activity));
        this.f51631i0.addView(this.f51648o0, w7.b6.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(activity);
        this.f51651p0 = u5Var;
        u5Var.setTextSize(20);
        this.f51651p0.setGravity(19);
        this.f51651p0.setTextColor(-1);
        this.f51651p0.setTypeface(org.telegram.messenger.i0.o());
        this.f51651p0.l(cd.L0(2131746368, null), false);
        this.f51651p0.getPaint().setShadowLayer(org.telegram.messenger.i0.N(1.0f), 0.0f, 1.0f, 1073741824);
        this.f51651p0.setAlpha(0.0f);
        this.f51651p0.setVisibility(8);
        this.f51651p0.setEllipsizeByGradient(true);
        this.f51651p0.setRightPadding(org.telegram.messenger.i0.L(144.0f));
        this.f51631i0.addView(this.f51651p0, w7.b6.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f51634j0 = linearLayout;
        linearLayout.setOrientation(0);
        this.f51634j0.setGravity(5);
        this.f51631i0.addView(this.f51634j0, w7.b6.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        z6 z6Var = new z6(this, 7);
        n8 n8Var5 = this.f51644n;
        ?? imageView2 = new ImageView(activity);
        imageView2.f51497x = true;
        imageView2.f51498y = true;
        imageView2.h = z6Var;
        imageView2.f51489a = i10;
        imageView2.f51490b = n8Var5;
        imageView2.setScaleType(scaleType);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(org.telegram.ui.ActionBar.t6.h0(553648127, 1, -1));
        imageView2.setVisibility(8);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new rh.s(imageView2, 19));
        imageView2.f51492f = new kp(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(2.0f), -1);
        imageView2.d();
        this.f51619e1 = imageView2;
        p2 p2Var = new p2(activity, 1);
        p2Var.l(1.0f, -71.0f);
        p2Var.d = 2000L;
        p2Var.U = false;
        p2Var.H.r(true, false);
        this.f51638k1 = p2Var;
        p2Var.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        this.f51631i0.addView(this.f51638k1, w7.b6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? imageView3 = new ImageView(activity);
        this.f51626g1 = imageView3;
        imageView3.setScaleType(scaleType);
        ei0 ei0Var = this.f51626g1;
        n5 n5Var = this.K1;
        if (n5Var != null && n5Var.Y) {
            i12 = 2131231758;
        } else {
            i12 = 2131231749;
        }
        ei0Var.setImageResource(i12);
        this.f51626g1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f51626g1.setBackground(org.telegram.ui.ActionBar.t6.h0(553648127, 1, -1));
        this.f51626g1.setOnClickListener(new a7(this, 2));
        this.f51626g1.setVisibility(8);
        this.f51626g1.setAlpha(0.0f);
        kg.f0 f0Var = new kg.f0(activity);
        this.f51635j1 = f0Var;
        f0Var.setBackground(org.telegram.ui.ActionBar.t6.h0(553648127, 1, -1));
        this.f51635j1.setVisibility(8);
        this.f51635j1.setAlpha(0.0f);
        this.f51635j1.setOnClickListener(new a7(this, 3));
        this.f51634j0.addView(this.f51635j1, w7.b6.r(46, 56, 53));
        this.f51634j0.addView(this.f51626g1, w7.b6.r(46, 56, 53));
        this.f51634j0.addView(this.f51619e1, w7.b6.e(46, 56, 53));
        a9 a9Var = new a9(activity);
        this.E0 = a9Var;
        a9Var.setBackground(org.telegram.ui.ActionBar.t6.h0(553648127, 1, -1));
        this.E0.setOnClickListener(new a7(this, 4));
        this.E0.setOnLongClickListener(new bi.h1(this, 6));
        this.E0.setVisibility(8);
        this.E0.setAlpha(0.0f);
        this.f51661s.a(this.E0);
        this.f51631i0.addView(this.E0, w7.b6.e(56, 56, 53));
        b9 b9Var = new b9(activity);
        this.F0 = b9Var;
        b9Var.setContentDescription(cd.L0(2131754886, null));
        this.F0.setOnClickListener(new a7(this, 5));
        boolean q6 = u0.q(activity);
        b9 b9Var2 = this.F0;
        if (q6) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        b9Var2.setVisibility(i13);
        b9 b9Var3 = this.F0;
        if (q6) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        b9Var3.setAlpha(f7);
        this.f51661s.a(this.F0);
        this.f51631i0.addView(this.F0, w7.b6.e(56, 56, 53));
        ?? a9Var2 = new a9(activity);
        this.G0 = a9Var2;
        a9Var2.setContentDescription(cd.L0(2131754895, null));
        this.G0.setBackground(org.telegram.ui.ActionBar.t6.h0(553648127, 1, -1));
        if (this.f51686z0 == null) {
            this.f51686z0 = (r) r.a().get(6);
        }
        this.G0.setOnClickListener(new a7(this, 6));
        this.G0.a(new ob0(this.f51686z0, false), false);
        this.G0.setSelected(false);
        this.G0.setVisibility(0);
        this.G0.setAlpha(1.0f);
        this.f51661s.a(this.G0);
        this.f51631i0.addView(this.G0, w7.b6.e(56, 56, 53));
        a9 a9Var3 = new a9(activity);
        this.H0 = a9Var3;
        a9Var3.setContentDescription(cd.L0(2131754894, null));
        this.H0.setBackground(org.telegram.ui.ActionBar.t6.h0(553648127, 1, -1));
        this.H0.a(new ob0(new r("../../.."), true), false);
        this.H0.setVisibility(8);
        this.H0.setAlpha(0.0f);
        this.H0.setOnClickListener(new a7(this, 7));
        this.f51661s.a(this.H0);
        this.f51631i0.addView(this.H0, w7.b6.e(56, 56, 53));
        t tVar = new t(activity, this.f51661s);
        this.I0 = tVar;
        tVar.f51945a.v0(6);
        this.I0.setSelected((r) null);
        this.I0.setOnLayoutClick(new z6(this, 8));
        this.f51631i0.addView(this.I0, w7.b6.e(-1, 56, 53));
        p2 p2Var2 = new p2(activity, 1);
        p2Var2.l(1.0f, -20.0f);
        p2Var2.d = 5000L;
        p2Var2.i(true);
        p2Var2.s(cd.L0(2131744731, null));
        p2Var2.f51740l0 = new r5.a(16);
        this.l1 = p2Var2;
        p2Var2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        this.f51631i0.addView(this.l1, w7.b6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        p2 p2Var3 = new p2(activity, 2);
        p2Var3.l(0.0f, 28.0f);
        p2Var3.d = 5000L;
        p2Var3.p(true);
        this.f51642m1 = p2Var3;
        this.f51631i0.addView(p2Var3, w7.b6.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        p2 p2Var4 = new p2(activity, 1);
        p2Var4.l(1.0f, -20.0f);
        p2Var4.d = 5000L;
        p2Var4.s(cd.L0(2131744722, null));
        this.f51646n1 = p2Var4;
        p2Var4.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        this.f51631i0.addView(this.f51646n1, w7.b6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? view2 = new View(activity);
        Paint paint = new Paint(1);
        view2.f51117a = paint;
        Paint paint2 = new Paint(1);
        view2.f51118b = paint2;
        view2.e = new org.telegram.ui.Components.t5((View) view2, 0L, 250L, grVar);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, true, true);
        view2.f51119c = e6Var;
        e6Var.n(0.3f, 250L, grVar);
        e6Var.w(org.telegram.messenger.i0.L(13.0f));
        e6Var.u(-1);
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.setCallback(view2);
        e6Var.f25695b = 1;
        view2.a(0L, false);
        this.J0 = view2;
        h0(false, false);
        this.f51631i0.addView(this.J0, w7.b6.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.f51661s.a(this.J0);
        MediaController.O(0);
        r4 r4Var = new r4(activity);
        this.O0 = r4Var;
        r4Var.setDelegate(o7Var);
        r4 r4Var2 = this.O0;
        if (this.O1 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        r4Var2.f51867n0 = -1.0f;
        r4Var2.f51868o0 = z10;
        r4Var2.invalidate();
        this.f51637k0.addView(this.O0, w7.b6.e(-1, 100, 87));
        this.f51661s.a(this.O0);
        r4 r4Var3 = this.O0;
        if (this.A0.j()) {
            f10 = this.A0.getFilledProgress();
        } else {
            f10 = 0.0f;
        }
        r4Var3.e(true, f10);
        d dVar = new d(activity, bVar, true);
        this.P0 = dVar;
        dVar.setRoundRadius(24);
        this.P0.setColor(-2473124);
        this.P0.i(cd.L0(2131748798, null), false, true);
        this.P0.setAlpha(0.0f);
        this.P0.setScaleX(0.8f);
        this.P0.setScaleY(0.8f);
        this.P0.setVisibility(8);
        this.f51637k0.addView(this.P0, w7.b6.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.P0.setOnClickListener(new a7(this, 8));
        p2 p2Var5 = new p2(activity, 3);
        p2Var5.p(true);
        p2Var5.s(cd.L0(2131744729, null));
        p2Var5.h = org.telegram.messenger.i0.L(320.0f);
        p2Var5.d = 5000L;
        p2Var5.K = Layout.Alignment.ALIGN_CENTER;
        this.W0 = p2Var5;
        this.f51637k0.addView(p2Var5, w7.b6.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        s81 s81Var = new s81(activity);
        this.V0 = s81Var;
        s81Var.M = false;
        s81Var.setAlpha(0.0f);
        this.f51637k0.addView(this.V0, w7.b6.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.V0.setDelegate(new f7(this, 4));
        s81 s81Var2 = this.V0;
        this.T1 = 0.0f;
        s81Var2.b(false, 0.0f);
        a5 a5Var = new a5(activity, i10, new y6(this, 12));
        this.D0 = a5Var;
        a5Var.f50908c = new z6(this, 9);
        this.f51637k0.addView(a5Var, w7.b6.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        l7 l7Var = new l7(this, activity);
        this.Q0 = l7Var;
        l7Var.setOnSwitchModeListener(new z6(this, 10));
        this.Q0.setOnSwitchingModeListener(new z6(this, 11));
        this.m0.addView(this.Q0, w7.b6.e(-1, 48, 55));
        this.f51661s.a(this.Q0);
        ?? imageView4 = new ImageView(activity);
        this.R0 = imageView4;
        imageView4.setContentDescription(cd.L0(2131754752, null));
        this.R0.setImageResource(2131232764);
        this.R0.setScaleType(scaleType);
        this.R0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.R0.setBackground(org.telegram.ui.ActionBar.t6.h0(553648127, 1, -1));
        this.m0.addView(this.R0, w7.b6.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f51661s.a(this.R0);
        this.R0.setOnClickListener(new a7(this, 9));
        ?? imageView5 = new ImageView(activity);
        this.S0 = imageView5;
        imageView5.setContentDescription(cd.L0(2131748800, null));
        this.S0.setImageResource(2131232765);
        this.S0.setScaleType(scaleType);
        this.S0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.S0.setBackground(org.telegram.ui.ActionBar.t6.h0(553648127, 1, -1));
        this.m0.addView(this.S0, w7.b6.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f51661s.a(this.S0);
        this.S0.setOnClickListener(new a7(this, 10));
        o2 o2Var = new o2(activity);
        this.T0 = o2Var;
        this.m0.addView(o2Var, w7.b6.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f51661s.a(this.T0);
        o2 o2Var2 = new o2(activity);
        this.U0 = o2Var2;
        o2Var2.f51592a.t(cd.L0(2131744721, null), false, true);
        o2Var2.invalidate();
        this.U0.setAlpha(0.0f);
        this.m0.addView(this.U0, w7.b6.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f51661s.a(this.U0);
        d dVar2 = new d(activity, bVar, true);
        dVar2.setRoundRadius(24);
        this.f51669u1 = dVar2;
        dVar2.setVisibility(8);
        this.f51669u1.setAlpha(0.0f);
        this.f51669u1.i(cd.L0(2131744707, null), false, true);
        this.f51669u1.setOnClickListener(new a7(this, 11));
        this.m0.addView(this.f51669u1, w7.b6.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        ?? frameLayout5 = new FrameLayout(activity);
        frameLayout5.f51132b = new ArrayList();
        frameLayout5.e = true;
        frameLayout5.h = true;
        View view3 = new View(activity);
        frameLayout5.f51131a = view3;
        view3.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        frameLayout5.addView(view3, w7.b6.e(-1, -1, 119));
        frameLayout5.a(0, 2131231738, cd.L0(2131754814, null));
        frameLayout5.a(2, 2131232283, cd.L0(2131754756, null));
        frameLayout5.a(1, 2131232285, cd.L0(2131754807, null));
        frameLayout5.a(3, 2131231728, cd.L0(2131751700, null));
        frameLayout5.a(4, 2131232282, cd.L0(2131754811, null));
        String L0 = cd.L0(2131745657, null);
        frameLayout5.d = L0;
        frameLayout5.e = true;
        e4 e4Var = new e4(frameLayout5, activity, L0, true);
        frameLayout5.f51133c = e4Var;
        e4Var.setContentDescription(cd.L0(2131745657, null));
        frameLayout5.addView(frameLayout5.f51133c, w7.b6.c(-2.0f, -2));
        frameLayout5.e();
        this.f51609b1 = frameLayout5;
        frameLayout5.setVisibility(8);
        this.f51609b1.setOnClickListener(new z6(this, 12));
        this.m0.addView(this.f51609b1, w7.b6.e(-1, 52, 23));
        c9 c9Var = new c9(activity);
        this.f51652p1 = c9Var;
        c9Var.setAlpha(0.0f);
        this.f51652p1.setVisibility(8);
        this.f51628h0.addView(this.f51652p1, w7.b6.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        g4 g4Var = new g4(activity, i10, bVar);
        this.f51649o1 = g4Var;
        this.f51628h0.addView(g4Var, w7.b6.e(-1, -1, 119));
        l0(false);
    }

    public static o8 D(Activity activity, int i10) {
        o8 o8Var = F2;
        if (o8Var != null && (o8Var.f51607b != activity || o8Var.f51611c != i10)) {
            o8Var.p(false);
            F2 = null;
        }
        if (F2 == null) {
            F2 = new o8(activity, i10);
        }
        return F2;
    }

    public static void Z(boolean z10) {
        vp.d1().edit().putBoolean("stories_camera", z10).apply();
    }

    public static void a(o8 o8Var) {
        t7 t7Var = o8Var.B0;
        boolean z10 = false;
        if (t7Var != null && t7Var.getTextureView() != null) {
            Bitmap bitmap = o8Var.B0.getTextureView().getBitmap();
            if (bitmap == null) {
                o8Var.f51614c2 = false;
                return;
            }
            int width = bitmap.getWidth() / 12;
            int height = bitmap.getHeight() / 12;
            float f7 = 0.0f;
            for (int i10 = 0; i10 < 10; i10++) {
                int i11 = 0;
                while (i11 < 10) {
                    i11++;
                    f7 += org.telegram.messenger.i0.B(bitmap.getPixel((i10 + 1) * width, i11 * height));
                }
            }
            bitmap.recycle();
            if (f7 / 100.0f < 0.22f) {
                z10 = true;
            }
            o8Var.f51614c2 = z10;
            return;
        }
        o8Var.f51614c2 = false;
    }

    public static void b(o8 o8Var) {
        ValueAnimator valueAnimator = o8Var.f51636j2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            o8Var.f51636j2 = null;
        }
        o8Var.f51639k2 = false;
        g8 g8Var = o8Var.f51657r;
        float f7 = g8Var.f51215a;
        float f10 = g8Var.f51216b;
        g8Var.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        o8Var.f51636j2 = ofFloat;
        ofFloat.addUpdateListener(new fe.c(o8Var, f7, f10, 7));
        o8Var.f51636j2.setDuration(340L);
        o8Var.f51636j2.setInterpolator(gr.h);
        o8Var.f51636j2.addListener(new q7(o8Var, 0));
        o8Var.f51636j2.start();
    }

    public static boolean c(o8 o8Var) {
        Activity activity = o8Var.f51607b;
        if (activity != null && activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 112);
            return false;
        }
        return true;
    }

    public static SpannableString m(Context context) {
        SpannableString spannableString = new SpannableString("c");
        Drawable f7 = i0.a.f(context, 2131232762);
        int L = org.telegram.messenger.i0.L(35.0f);
        int i10 = -L;
        f7.setBounds(i10 / 4, i10, (L / 4) * 3, 0);
        spannableString.setSpan(new x7(f7, f7), 0, 1, 33);
        return spannableString;
    }

    public static void w() {
        o8 o8Var = F2;
        if (o8Var != null) {
            o8Var.p(false);
        }
        F2 = null;
    }

    public final int A() {
        ArrayList arrayList = this.I1;
        if (arrayList != null) {
            return arrayList.size();
        }
        n5 n5Var = this.K1;
        if (n5Var != null) {
            return n5Var.r();
        }
        return 1;
    }

    public final String B() {
        t7 t7Var = this.B0;
        if (t7Var != null && t7Var.getCameraSession() != null) {
            if (this.B0.isFrontface() && !this.B0.getCameraSession().hasFlashModes()) {
                o();
                return (String) this.f51670u2.get(this.f51667t2);
            }
            return this.B0.getCameraSession().getCurrentFlashMode();
        }
        return null;
    }

    public final o0 C() {
        if (this.N0 == null) {
            o0 o0Var = new o0(this.f51607b);
            this.N0 = o0Var;
            this.f51637k0.addView(o0Var, w7.b6.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.N0;
    }

    public final String E() {
        int i10;
        t7 t7Var = this.B0;
        if (t7Var != null && t7Var.getCameraSession() != null) {
            if (this.B0.isFrontface() && !this.B0.getCameraSession().hasFlashModes()) {
                o();
                ArrayList arrayList = this.f51670u2;
                if (this.f51667t2 + 1 >= arrayList.size()) {
                    i10 = 0;
                } else {
                    i10 = this.f51667t2 + 1;
                }
                return (String) arrayList.get(i10);
            }
            return this.B0.getCameraSession().getNextFlashMode();
        }
        return null;
    }

    public final ImageView F() {
        if (this.f51632i1 == null) {
            bi0 bi0Var = new bi0(2131624238, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), true, null);
            this.f51629h1 = bi0Var;
            bi0Var.h = true;
            n5 n5Var = this.K1;
            if (n5Var != null && n5Var.f51563y0) {
                bi0Var.M(35);
                this.f51629h1.P(36);
            } else {
                bi0Var.P(0);
                this.f51629h1.M(0);
            }
            this.f51629h1.Z = true;
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.J9, this.f51604a);
            this.f51629h1.Q(w02, "Sunny");
            this.f51629h1.Q(w02, "Path 6");
            this.f51629h1.Q(w02, "Path");
            this.f51629h1.Q(w02, "Path 5");
            this.f51629h1.o();
            ImageView imageView = new ImageView(this.f51607b);
            this.f51632i1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f51632i1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.f51632i1.setBackground(org.telegram.ui.ActionBar.t6.h0(553648127, 1, -1));
            this.f51632i1.setOnClickListener(new a7(this, 0));
            this.f51632i1.setVisibility(8);
            this.f51632i1.setImageDrawable(this.f51629h1);
            this.f51632i1.setAlpha(0.0f);
            this.f51634j0.addView(this.f51632i1, 0, w7.b6.r(46, 56, 53));
        }
        return this.f51632i1;
    }

    public final void G() {
        s7 s7Var = this.f51672v1;
        if (s7Var == null) {
            return;
        }
        this.f51673v2 = null;
        s7Var.getTopLayout().setAlpha(0.0f);
        this.f51672v1.getTopLayout().setTranslationY(-org.telegram.messenger.i0.L(16.0f));
        this.f51672v1.getBottomLayout().setAlpha(0.0f);
        this.f51672v1.getBottomLayout().setTranslationY(org.telegram.messenger.i0.L(48.0f));
        this.f51672v1.getWeightChooserView().setTranslationX(-org.telegram.messenger.i0.L(32.0f));
        this.f51672v1.setVisibility(8);
    }

    public final boolean H() {
        float f7;
        if (this.A0.j()) {
            f7 = this.A0.getFilledProgress();
        } else {
            f7 = 0.0f;
        }
        if (!this.a2 && f7 >= 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean I() {
        m2 m2Var;
        if (!this.W && (m2Var = this.M0) != null) {
            if (m2Var.getTranslationY() < (this.f51644n.getMeasuredHeight() - ((int) (org.telegram.messenger.i0.f16026q.y * 0.35f))) - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16020m)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void J(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: vh.o8.J(int, boolean):void");
    }

    public final void K(Runnable runnable, long j10) {
        if (!this.S1 && this.K1 != null) {
            c7 c7Var = this.f51627g2;
            if (c7Var != null) {
                org.telegram.messenger.i0.r(c7Var);
            }
            this.f51630h2 = true;
            this.S1 = true;
            this.f51627g2 = new c7(this, runnable, 1);
            this.X0.setAlpha(0.0f);
            this.X0.setVisibility(0);
            this.X0.n(this.K1, this.f51627g2, j10);
            this.X0.q(this.K1, false);
            org.telegram.messenger.i0.h3(this.f51627g2, 800L);
        }
    }

    public final boolean L() {
        throw new UnsupportedOperationException("Method not decompiled: vh.o8.L():boolean");
    }

    public final void M(int i10, int i11) {
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = 8;
        if (i10 == 0) {
            u(false);
            this.O0.setVisibility(8);
            this.V0.setVisibility(8);
            this.Q0.setVisibility(8);
            g(false, false);
            c0(false);
        }
        if (i10 == 2) {
            this.f51666t1.setVisibility(8);
            if (i11 == 1) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            this.f51640l0.setVisibility(i17);
            this.f51613c1.setVisibility(8);
            this.f51669u1.setVisibility(8);
        }
        if (i10 == 1) {
            this.f51609b1.setVisibility(8);
            if (i11 == 2) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            this.f51640l0.setVisibility(i14);
            this.f51626g1.setVisibility(8);
            this.f51635j1.setVisibility(8);
            this.f51619e1.setVisibility(8);
            ImageView imageView = this.f51632i1;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (i11 == 2) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            this.X0.setVisibility(i15);
            this.Z0.setVisibility(8);
            if (i11 != 2) {
                y();
                x();
            }
            if (i11 == 2) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            this.f51651p0.setVisibility(i16);
            v();
            this.f51652p1.setAlpha(0.0f);
            this.f51652p1.setVisibility(8);
            this.f51606a1.setVisibility(8);
            this.H1 = null;
            this.I1 = null;
            this.J1 = null;
        }
        if (i11 == 1) {
            n5 n5Var = this.K1;
            if (n5Var == null || !n5Var.f51541n) {
                t();
                G();
            }
            ne0 ne0Var = this.C1;
            if (ne0Var != null) {
                ne0Var.setAllowTouch(false);
            }
            this.X0.x(2, false);
            this.X0.x(3, false);
            this.X0.x(4, false);
            this.X0.x(5, false);
            this.X0.x(7, false);
            n5 n5Var2 = this.K1;
            if (n5Var2 != null && n5Var2.f51531h0 >= 30000) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.f51606a1.setVisibility(i13);
            this.f51640l0.setAlpha(1.0f);
            this.f51640l0.setTranslationY(0.0f);
            n5 n5Var3 = this.K1;
            if (n5Var3 == null || n5Var3.J0 == 0) {
                i18 = 0;
            }
            this.f51613c1.setVisibility(i18);
        }
        if (i11 == 0 && this.V1) {
            C().setVisibility(0);
            o0 C = C();
            C.f51591r.e(true, 0.0f);
            C.a(true);
            d0 d0Var = C.h;
            if (d0Var != null) {
                org.telegram.messenger.i0.r(d0Var);
            }
            d0 d0Var2 = new d0(C, 1);
            C.h = d0Var2;
            org.telegram.messenger.i0.h3(d0Var2, 3500L);
            this.O0.h();
        }
        this.V1 = false;
        ne0 ne0Var2 = this.C1;
        if (ne0Var2 != null) {
            if (i11 == 1 && ((i12 = this.f51625g0) == -1 || i12 == 1)) {
                z11 = true;
            } else {
                z11 = false;
            }
            ne0Var2.setAllowTouch(z11);
        }
        e8 e8Var = this.f51613c1;
        if (e8Var != null) {
            if (i11 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            e8Var.f51338d0 = z10;
        }
        if (i11 == 1) {
            int i19 = this.f51611c;
            ui.b0(i19).B(0);
            ui.b0(i19).V0(0, false, true, false);
            ui.b0(i19).V0(2, false, true, false);
            th.e5 O1 = vp.r1(i19).O1();
            if (O1.Q == 0) {
                O1.S();
            }
            vp.r1(i19).O1().U();
        }
    }

    public final void N(int r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: vh.o8.N(int, int):void");
    }

    public final void O() {
        ig.a1 a1Var;
        int i10;
        if (this.f51622f0 == 0) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f51681x2 = new y6(this, 3);
            } else {
                Y(false);
            }
        }
        e8 e8Var = this.f51613c1;
        if (e8Var != null) {
            e8Var.f51340f.s();
        }
        r4 r4Var = this.O0;
        if (r4Var != null) {
            r4Var.h();
        }
        g4 g4Var = this.f51649o1;
        if (g4Var != null) {
            th.e5 O1 = vp.r1(g4Var.f51193a).O1();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) O1.f48909i.f(d20.i(O1.f48904a).f15165n);
            if (peerStories != null) {
                i10 = peerStories.stories.size();
            } else {
                i10 = 0;
            }
            g4Var.f51194b = O1.f48905b.m() + i10 + 1;
            g4Var.f51195c.invalidate();
        }
        s7 s7Var = this.f51672v1;
        if (s7Var != null && (a1Var = s7Var.f50996x0.d) != null) {
            a1Var.postRunnable(a1Var.f8276x);
        }
        d8 d8Var = this.X0;
        if (d8Var != null) {
            d8Var.x(0, false);
        }
        s0 s0Var = vp.r1(this.f51611c).O1().f48922w;
        if (!s0Var.f51903c && !s0Var.d) {
            s0Var.d = true;
            p0 p0Var = new p0(s0Var, 1);
            hs a02 = hs.a0(s0Var.f51901a);
            a02.f15938a.c(new bk0((Object) a02, false, (Object) p0Var, 17));
        }
    }

    public final void P(int i10, int i11) {
        boolean z10;
        s7 s7Var;
        z7 z7Var;
        a8 a8Var;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        s7 s7Var2;
        if (i11 == 0) {
            this.f51645n0.setVisibility(8);
        }
        if (i10 == 0 && (s7Var2 = this.f51672v1) != null) {
            s7Var2.setVisibility(8);
        }
        if (i10 == -1) {
            this.f51613c1.setVisibility(8);
            if (i11 == 2) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            this.f51626g1.setVisibility(i12);
            if (i11 == 2) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.f51635j1.setVisibility(i13);
            if (i11 == 2) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            this.f51619e1.setVisibility(i14);
            ImageView imageView = this.f51632i1;
            if (imageView != null) {
                if (i11 == 2) {
                    i16 = 0;
                } else {
                    i16 = 8;
                }
                imageView.setVisibility(i16);
            }
            if (i11 == 2) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            this.Z0.setVisibility(i15);
            this.f51651p0.setVisibility(8);
        }
        boolean z11 = true;
        if (i11 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.X0.setAllowCropping(z10);
        if ((i11 == 0 || i10 == 0) && (s7Var = this.f51672v1) != null) {
            s7Var.M0.setLayerType(0, null);
        }
        ne0 ne0Var = this.C1;
        if (ne0Var != null) {
            if (i11 != 1 && i11 != -1) {
                z11 = false;
            }
            ne0Var.setAllowTouch(z11);
        }
        if (i11 == 3) {
            z7 z7Var2 = this.f51659r1;
            if (z7Var2 != null) {
                z7Var2.setAppearProgress(1.0f);
            }
        } else if (i10 == 3 && (z7Var = this.f51659r1) != null) {
            z7Var.setVisibility(8);
            this.f51659r1.setAppearProgress(0.0f);
            z7 z7Var3 = this.f51659r1;
            z7Var3.f50936y = null;
            z zVar = z7Var3.f50930f;
            zVar.L = null;
            zVar.d = null;
            zVar.J = false;
            z7Var3.d.setVisibility(8);
            z7Var3.f50927a.setCropEditorDrawing(null);
        }
        if (i11 == 4) {
            a8 a8Var2 = this.f51663s1;
            if (a8Var2 != null) {
                a8Var2.setAppearProgress(1.0f);
            }
        } else if (i10 == 4 && (a8Var = this.f51663s1) != null) {
            a8Var.setVisibility(8);
            this.f51663s1.setAppearProgress(0.0f);
            a8 a8Var3 = this.f51663s1;
            a8Var3.f51175b = null;
            z zVar2 = a8Var3.h;
            zVar2.L = null;
            zVar2.d = null;
            zVar2.J = false;
            a8Var3.e.setVisibility(8);
            a8Var3.setVisibility(8);
        }
    }

    public final void Q(i8 i8Var) {
        j4.w o10;
        n8 n8Var;
        if (this.d) {
            return;
        }
        int i10 = this.f51611c;
        if (vp.r1(i10).u2()) {
            org.telegram.ui.b.b(i10);
            return;
        }
        int i11 = 0;
        this.f51668u0 = false;
        this.e = false;
        this.B2 = false;
        this.f51662s0.f51318g = false;
        WindowManager windowManager = this.f51621f;
        if (windowManager != null && (n8Var = this.f51644n) != null && n8Var.getParent() == null) {
            n8 n8Var2 = this.f51644n;
            WindowManager.LayoutParams layoutParams = this.h;
            org.telegram.messenger.i0.x3(windowManager, n8Var2, layoutParams);
            windowManager.addView(this.f51644n, layoutParams);
            f0();
        }
        this.A0.setCameraThumb(z());
        if (this.f51671v0 == 0 && (o10 = vp.r1(i10).O1().o()) != null && o10.a(i10, 1)) {
            g0(o10, true);
        }
        J(0, false);
        k0(-1, false, false);
        RectF rectF = this.H;
        if (i8Var != null) {
            this.F = i8Var;
            this.J = i8Var.f51325a;
            rectF.set(i8Var.f51327c);
            this.G = i8Var.f51326b;
            this.F.e();
        } else {
            this.J = 0;
            Point point = org.telegram.messenger.i0.f16026q;
            rectF.set(0.0f, org.telegram.messenger.i0.L(100.0f), point.x, org.telegram.messenger.i0.L(100.0f) + point.y);
            this.G = org.telegram.messenger.i0.L(8.0f);
        }
        this.f51657r.c();
        int i12 = this.J;
        if (i12 != 1 && i12 != 0) {
            i11 = -14737633;
        }
        this.f51628h0.setBackgroundColor(i11);
        this.f51657r.setTranslationX(0.0f);
        this.f51657r.setTranslationY(0.0f);
        this.f51657r.b(0.0f);
        this.f51657r.setScaleX(1.0f);
        this.f51657r.setScaleY(1.0f);
        this.K = 0.0f;
        org.telegram.messenger.i0.g2(this.f51607b);
        f(1.0f, true, new y6(this, 6));
        d();
        this.f51671v0 = 0L;
        this.f51675w0 = "";
    }

    public final void R(h8 h8Var, n5 n5Var, long j10) {
        int i10;
        n8 n8Var;
        if (this.d) {
            return;
        }
        int i11 = this.f51611c;
        if (vp.r1(i11).u2()) {
            org.telegram.ui.b.b(i11);
            return;
        }
        this.f51668u0 = false;
        this.e = false;
        this.B2 = false;
        WindowManager windowManager = this.f51621f;
        if (windowManager != null && (n8Var = this.f51644n) != null && n8Var.getParent() == null) {
            n8 n8Var2 = this.f51644n;
            WindowManager.LayoutParams layoutParams = this.h;
            org.telegram.messenger.i0.x3(windowManager, n8Var2, layoutParams);
            windowManager.addView(this.f51644n, layoutParams);
            f0();
        }
        this.K1 = n5Var;
        this.O1 = n5Var.K ? 1 : 0;
        this.f51662s0.f51318g = false;
        RectF rectF = this.H;
        if (h8Var != null) {
            this.F = h8Var;
            this.J = h8Var.f51325a;
            rectF.set(h8Var.f51327c);
            this.G = h8Var.f51326b;
            this.F.e();
        } else {
            this.J = 0;
            Point point = org.telegram.messenger.i0.f16026q;
            rectF.set(0.0f, org.telegram.messenger.i0.L(100.0f), point.x, org.telegram.messenger.i0.L(100.0f) + point.y);
            this.G = org.telegram.messenger.i0.L(8.0f);
        }
        this.f51657r.c();
        int i12 = this.J;
        int i13 = 1;
        if (i12 != 1 && i12 != 0) {
            i10 = -14737633;
        } else {
            i10 = 0;
        }
        this.f51628h0.setBackgroundColor(i10);
        this.f51657r.setTranslationX(0.0f);
        this.f51657r.setTranslationY(0.0f);
        this.f51657r.b(0.0f);
        this.f51657r.setScaleX(1.0f);
        this.f51657r.setScaleY(1.0f);
        this.K = 0.0f;
        org.telegram.messenger.i0.g2(this.f51607b);
        n5 n5Var2 = this.K1;
        if (n5Var2 != null) {
            this.f51613c1.setText(n5Var2.C0);
        }
        K(new j7(this, 0), j10);
        if (this.K1.f51518b0) {
            i13 = 2;
        }
        J(i13, false);
        k0(-1, false, false);
        this.f51609b1.b(false, false);
        d();
        this.f51671v0 = 0L;
        this.f51675w0 = "";
    }

    public final void S() {
        z60 z60Var;
        d8 d8Var = this.X0;
        if (d8Var != null) {
            d8Var.x(4, true);
        }
        e8 e8Var = this.f51613c1;
        if (e8Var != null && (z60Var = e8Var.U0) != null) {
            z60Var.u();
            e8Var.U0 = null;
        }
        kg.i1 i1Var = new kg.i1((org.telegram.ui.ActionBar.k2) new u7(this, 1), 14, false);
        i1Var.setOnDismissListener(new i7(this, 1));
        i1Var.show();
    }

    public final void T(h8 h8Var, n5 n5Var) {
        int i10;
        boolean z10;
        int i11;
        j4.w o10;
        n8 n8Var;
        if (this.d) {
            return;
        }
        int i12 = this.f51611c;
        if (vp.r1(i12).u2()) {
            org.telegram.ui.b.b(i12);
            return;
        }
        this.f51668u0 = true;
        this.e = false;
        this.B2 = false;
        WindowManager windowManager = this.f51621f;
        if (windowManager != null && (n8Var = this.f51644n) != null && n8Var.getParent() == null) {
            n8 n8Var2 = this.f51644n;
            WindowManager.LayoutParams layoutParams = this.h;
            org.telegram.messenger.i0.x3(windowManager, n8Var2, layoutParams);
            windowManager.addView(this.f51644n, layoutParams);
            f0();
        }
        this.K1 = n5Var;
        x6.a(i12, n5Var);
        n5 n5Var2 = this.K1;
        if (n5Var2 != null && n5Var2.K) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.O1 = i10;
        if (n5Var2 != null && n5Var2.f51555u && i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f51662s0.f51318g = z10;
        if (this.f51671v0 == 0 && (o10 = vp.r1(i12).O1().o()) != null && o10.a(i12, 1)) {
            g0(o10, true);
        }
        RectF rectF = this.H;
        if (h8Var != null) {
            this.F = h8Var;
            this.J = h8Var.f51325a;
            rectF.set(h8Var.f51327c);
            this.G = h8Var.f51326b;
            this.F.e();
        } else {
            this.J = 0;
            Point point = org.telegram.messenger.i0.f16026q;
            rectF.set(0.0f, org.telegram.messenger.i0.L(100.0f), point.x, org.telegram.messenger.i0.L(100.0f) + point.y);
            this.G = org.telegram.messenger.i0.L(8.0f);
        }
        this.f51657r.c();
        int i13 = this.J;
        if (i13 != 1 && i13 != 0) {
            i11 = -14737633;
        } else {
            i11 = 0;
        }
        this.f51628h0.setBackgroundColor(i11);
        this.f51657r.setTranslationX(0.0f);
        this.f51657r.setTranslationY(0.0f);
        this.f51657r.b(0.0f);
        this.f51657r.setScaleX(1.0f);
        this.f51657r.setScaleY(1.0f);
        this.K = 0.0f;
        org.telegram.messenger.i0.g2(this.f51607b);
        n5 n5Var3 = this.K1;
        if (n5Var3 != null) {
            this.f51613c1.setText(n5Var3.C0);
        }
        this.f51609b1.b(true, false);
        J(1, false);
        k0(-1, false, false);
        f(1.0f, true, new y6(this, 6));
        d();
        this.f51671v0 = 0L;
        this.f51675w0 = "";
    }

    public final void U() {
        ig.c1 c1Var = this.f51676w1;
        if (c1Var != null) {
            c1Var.bringToFront();
        }
        View view = this.f51680x1;
        if (view != null) {
            view.bringToFront();
        }
        View view2 = this.f51684y1;
        if (view2 != null) {
            view2.bringToFront();
        }
        View view3 = this.f51687z1;
        if (view3 != null) {
            view3.bringToFront();
        }
        View view4 = this.A1;
        if (view4 != null) {
            view4.bringToFront();
        }
        c9 c9Var = this.f51652p1;
        if (c9Var != null) {
            c9Var.bringToFront();
        }
        ne0 ne0Var = this.C1;
        if (ne0Var != null) {
            ne0Var.bringToFront();
        }
        fe0 fe0Var = this.E1;
        if (fe0Var != null) {
            fe0Var.bringToFront();
        }
        he0 he0Var = this.F1;
        if (he0Var != null) {
            he0Var.bringToFront();
        }
        g4 g4Var = this.f51649o1;
        if (g4Var != null) {
            g4Var.bringToFront();
        }
        n nVar = this.f51655q1;
        if (nVar != null) {
            nVar.bringToFront();
        }
    }

    public final void V(n5 n5Var, boolean z10) {
        File file;
        View view;
        float f7;
        n5 n5Var2;
        boolean z11;
        int i10;
        if (n5Var != null && this.X0.getWidth() > 0 && this.X0.getHeight() > 0) {
            if (z10) {
                file = n5Var.O0;
            } else {
                file = n5Var.N0;
            }
            if (file != null) {
                file.delete();
            }
            if (this.A0.j()) {
                view = this.A0;
            } else {
                view = this.X0;
            }
            if (z10) {
                f7 = 0.33333334f;
            } else {
                f7 = 1.0f;
            }
            int width = (int) (view.getWidth() * f7);
            Bitmap createBitmap = Bitmap.createBitmap(width, (int) (view.getHeight() * f7), Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(createBitmap);
            canvas.save();
            canvas.scale(f7, f7);
            org.telegram.messenger.i0.m0 = true;
            view.draw(canvas);
            org.telegram.messenger.i0.m0 = false;
            canvas.restore();
            Paint paint = new Paint(2);
            k61 textureView = this.X0.getTextureView();
            if (n5Var.K && !n5Var.f51555u && textureView != null) {
                Bitmap bitmap = textureView.getBitmap();
                Matrix transform = textureView.getTransform(null);
                if (transform != null) {
                    Matrix matrix = new Matrix(transform);
                    matrix.postScale(f7, f7);
                    transform = matrix;
                }
                canvas.drawBitmap(bitmap, transform, paint);
                bitmap.recycle();
            }
            File file2 = n5Var.Q0;
            if (file2 != null) {
                try {
                    Bitmap decodeFile = BitmapFactory.decodeFile(file2.getPath());
                    canvas.save();
                    float width2 = width / decodeFile.getWidth();
                    canvas.scale(width2, width2);
                    canvas.drawBitmap(decodeFile, 0.0f, 0.0f, paint);
                    canvas.restore();
                    decodeFile.recycle();
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
            File file3 = n5Var.P0;
            if (file3 != null) {
                try {
                    Bitmap decodeFile2 = BitmapFactory.decodeFile(file3.getPath());
                    canvas.save();
                    float width3 = width / decodeFile2.getWidth();
                    canvas.scale(width3, width3);
                    canvas.drawBitmap(decodeFile2, 0.0f, 0.0f, paint);
                    canvas.restore();
                    decodeFile2.recycle();
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                }
            }
            s7 s7Var = this.f51672v1;
            if (s7Var != null && s7Var.A0 != null) {
                canvas.save();
                canvas.scale(f7, f7);
                s7 s7Var2 = this.f51672v1;
                s7Var2.f50984r0 = true;
                x3 x3Var = s7Var2.A0;
                x3Var.f9911a = true;
                x3Var.draw(canvas);
                s7 s7Var3 = this.f51672v1;
                s7Var3.A0.f9911a = false;
                s7Var3.f50984r0 = false;
                canvas.restore();
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
            File w9 = n5.w(this.f51611c, "jpg");
            if (z10) {
                n5Var2 = n5Var;
                z11 = z10;
                Utilities.f14522g.c(new ag.n0(this, createBitmap, z11, w9, n5Var2, 16));
            } else {
                n5Var2 = n5Var;
                z11 = z10;
                try {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                    if (z11) {
                        i10 = 95;
                    } else {
                        i10 = 99;
                    }
                    createBitmap.compress(compressFormat, i10, new FileOutputStream(w9));
                } catch (Exception e10) {
                    org.telegram.messenger.f8.g(e10, true);
                }
            }
            if (!z11) {
                n5Var2.N0 = w9;
            }
            n5Var2.f51519b1 = createScaledBitmap;
        }
    }

    public final void W() {
        j4.w o10;
        int size;
        char c10;
        View[] viewPages;
        h51[] h51VarArr;
        w6 w6Var = this.f51654q0;
        BitmapDrawable bitmapDrawable = null;
        if (w6Var != null) {
            w6Var.dismiss();
            this.f51654q0 = null;
        }
        boolean z10 = this.N1;
        org.telegram.messenger.t2 t2Var = org.telegram.messenger.t2.APP_ERROR;
        if (z10) {
            n0 n0Var = this.f51619e1;
            n0Var.getClass();
            n0Var.c(cd.M0("VideoConvertFail"));
            t2Var.a();
            e4 e4Var = this.f51609b1.f51133c;
            int i10 = -this.U1;
            this.U1 = i10;
            org.telegram.messenger.i0.F3(i10, e4Var, null);
            return;
        }
        e8 e8Var = this.f51613c1;
        if (e8Var != null && e8Var.o()) {
            t2Var.a();
            org.telegram.ui.Components.f6 f6Var = e8Var.f51360w;
            int i11 = -this.U1;
            this.U1 = i11;
            org.telegram.messenger.i0.F3(i11, f6Var, null);
            e8Var.e();
            return;
        }
        n5 n5Var = this.K1;
        int i12 = this.f51611c;
        if ((n5Var == null || (!n5Var.f51529g && n5Var.J0 == 0)) && (o10 = vp.r1(i12).f18797h0.o()) != null && o10.a(i12, A())) {
            g0(o10, false);
            return;
        }
        this.K1.D0 = vp.r1(i12).U4();
        th.b bVar = this.f51604a;
        char c11 = 1;
        if (e8Var != null && !this.K1.D0) {
            CharSequence text = e8Var.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((zz0[]) spannable.getSpans(0, text.length(), zz0.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new cc(this.f51644n, bVar).Q(2131624343, 36, org.telegram.messenger.i0.R2(cd.L0(2131744600, null), org.telegram.ui.ActionBar.t6.Uc, 0, new y6(this, 27), bVar)).k(true);
                    int i13 = -this.U1;
                    this.U1 = i13;
                    org.telegram.messenger.i0.F3(i13, e8Var, null);
                    return;
                }
            }
        }
        n5 n5Var2 = this.K1;
        if (!n5Var2.f51529g && n5Var2.J0 == 0) {
            if (this.N != 0) {
                n5Var2.f51557v0 = vp.r1(i12).i1(this.N);
            }
            d8 d8Var = this.X0;
            d8Var.x(3, true);
            w6 w6Var2 = new w6(this.K1.I0, this.f51607b, bVar);
            w6Var2.W0(this.K1.E0);
            w6Var2.V0(this.K1.f51557v0);
            w6Var2.f52113w1 = this.M;
            w6Var2.L1 = new z6(this, 14);
            w6Var2.L0(!this.A0.j());
            ArrayList arrayList = this.I1;
            if (arrayList == null) {
                size = this.K1.r();
            } else {
                size = arrayList.size();
            }
            w6Var2.S0(size);
            w6Var2.Q0(false);
            CharSequence text2 = e8Var.getText();
            ArrayList arrayList2 = new ArrayList();
            if (text2 instanceof Spanned) {
                for (h51 h51Var : (h51[]) ((Spanned) text2).getSpans(0, text2.length(), h51.class)) {
                    if (h51Var != null) {
                        try {
                            TLRPC.User Z1 = vp.r1(i12).Z1(Long.valueOf(Long.parseLong(h51Var.getURL())));
                            if (Z1 != null && !h20.B(Z1) && h20.n(Z1) != null && !arrayList2.contains(Z1)) {
                                arrayList2.add(h20.n(Z1));
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            if (text2 != null) {
                int i14 = 0;
                int i15 = -1;
                while (i14 < text2.length()) {
                    char charAt = text2.charAt(i14);
                    char c12 = c11;
                    if (charAt == '@') {
                        i15 = i14 + 1;
                    } else if (charAt == ' ') {
                        if (i15 != -1) {
                            String charSequence = text2.subSequence(i15, i14).toString();
                            TLObject e22 = vp.r1(i12).e2(charSequence);
                            if (e22 instanceof TLRPC.User) {
                                TLRPC.User user = (TLRPC.User) e22;
                                if (!user.bot && !h20.B(user) && user.f19942id != 777000 && !h20.z(user) && !arrayList2.contains(charSequence)) {
                                    arrayList2.add(charSequence);
                                }
                            }
                        }
                        i15 = -1;
                    }
                    i14++;
                    c11 = c12;
                }
                c10 = c11;
                if (i15 != -1) {
                    String charSequence2 = text2.subSequence(i15, text2.length()).toString();
                    TLObject e23 = vp.r1(i12).e2(charSequence2);
                    if (e23 instanceof TLRPC.User) {
                        TLRPC.User user2 = (TLRPC.User) e23;
                        if (!user2.bot && !h20.B(user2) && user2.f19942id != 777000 && !h20.z(user2) && !arrayList2.contains(charSequence2)) {
                            arrayList2.add(charSequence2);
                        }
                    }
                }
            } else {
                c10 = 1;
            }
            w6Var2.J1 = arrayList2;
            w6Var2.N1 = new z6(this, 15);
            w6Var2.O1 = new z6(this, 16);
            w6Var2.K1 = new f7(this, 9);
            this.f51654q0 = w6Var2;
            n5 n5Var3 = this.K1;
            if (n5Var3.K) {
                if (d8Var != null && !n5Var3.f51528f0 && this.f51622f0 != 2) {
                    n5Var3.f51525e0 = d8Var.getCurrentPosition();
                    q20 z6Var = new z6(this, 17);
                    View view = this.f51676w1;
                    View view2 = this.f51687z1;
                    View[] viewArr = new View[3];
                    viewArr[0] = d8Var;
                    viewArr[c10] = view;
                    viewArr[2] = view2;
                    d8Var.h(z6Var, viewArr);
                }
                w6 w6Var3 = this.f51654q0;
                Bitmap bitmap = this.K1.f51530g0;
                y6 y6Var = new y6(this, 20);
                if (bitmap != null) {
                    w6Var3.getClass();
                    bitmapDrawable = new BitmapDrawable(bitmap);
                }
                w6Var3.S1 = bitmapDrawable;
                w6Var3.T1 = y6Var;
                hk hkVar = w6Var3.f52100i1;
                if (hkVar != null) {
                    for (View view3 : hkVar.getViewPages()) {
                        if (view3 instanceof r6) {
                            r6 r6Var = (r6) view3;
                            r6Var.h(false);
                            r6Var.f(false);
                        }
                    }
                }
            }
            this.f51654q0.setOnDismissListener(new i7(this, 0));
            this.f51654q0.show();
            return;
        }
        n5Var2.f51538l = false;
        h(null);
        o0();
    }

    public final void X(j8 j8Var) {
        int i10 = 0;
        RectF rectF = this.H;
        if (j8Var != null) {
            this.F = j8Var;
            this.J = j8Var.f51325a;
            rectF.set(j8Var.f51327c);
            this.G = j8Var.f51326b;
        } else {
            this.F = null;
            this.J = 0;
            Point point = org.telegram.messenger.i0.f16026q;
            rectF.set(0.0f, org.telegram.messenger.i0.L(100.0f), point.x, org.telegram.messenger.i0.L(100.0f) + point.y);
            this.G = org.telegram.messenger.i0.L(8.0f);
        }
        int i11 = this.J;
        if (i11 != 1 && i11 != 0) {
            i10 = -14737633;
        }
        this.f51628h0.setBackgroundColor(i10);
    }

    public final void Y(boolean z10) {
        boolean z11;
        if (!this.f51677w2 || z10) {
            this.f51664s2 = false;
            Activity activity = this.f51607b;
            if (activity != null) {
                if (activity.checkSelfPermission("android.permission.CAMERA") != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f51664s2 = z11;
                if (z11) {
                    Drawable mutate = activity.getResources().getDrawable(2131232762).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    eq eqVar = new eq(new ColorDrawable(-14540254), mutate);
                    int L = org.telegram.messenger.i0.L(64.0f);
                    int L2 = org.telegram.messenger.i0.L(64.0f);
                    eqVar.e = L;
                    eqVar.f25842f = L2;
                    this.A0.setCameraThumb(eqVar);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, this.f51604a);
                        int i10 = org.telegram.ui.ActionBar.t6.L5;
                        alertDialog$Builder.m(2131624114, 72, org.telegram.ui.ActionBar.t6.x0(null, i10, false), null);
                        alertDialog$Builder.n(i10, null);
                        SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(cd.L0(2131747324, null));
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                        x1Var.T = W2;
                        alertDialog$Builder.k(cd.L0(2131747316, null), new f7(this, 12));
                        alertDialog$Builder.h(cd.L0(2131751772, null), null);
                        x1Var.show();
                        return;
                    }
                    activity.requestPermissions(new String[]{"android.permission.CAMERA"}, 111);
                    this.f51677w2 = true;
                }
            }
            if (!this.f51664s2) {
                if (CameraController.getInstance().isCameraInitied()) {
                    q();
                } else {
                    CameraController.getInstance().initCamera(new y6(this, 0));
                }
            }
        }
    }

    public final void a0(Runnable runnable) {
        t7 t7Var = this.B0;
        if (t7Var != null && t7Var.getTextureView() != null) {
            try {
                Utilities.f14523i.c(new rh.l5(this, this.B0.getTextureView().getBitmap(), runnable, 19));
            } catch (Throwable unused) {
            }
        }
    }

    public final void b0(View view, boolean z10, boolean z11) {
        if (view == null) {
            return;
        }
        float f7 = 0.0f;
        int i10 = 0;
        if (z11) {
            view.setVisibility(0);
            ViewPropertyAnimator animate = view.animate();
            if (z10) {
                f7 = 1.0f;
            }
            animate.alpha(f7).setUpdateListener(new r7(this, 1)).setListener(new androidx.fragment.app.g(this, z10, view, 15)).setDuration(320L).setInterpolator(gr.h).start();
            return;
        }
        view.animate().cancel();
        if (!z10) {
            i10 = 8;
        }
        view.setVisibility(i10);
        if (z10) {
            f7 = 1.0f;
        }
        view.setAlpha(f7);
        m0();
    }

    public final void c0(boolean z10) {
        WindowManager.LayoutParams layoutParams = this.h;
        if (z10) {
            layoutParams.flags |= 128;
        } else {
            layoutParams.flags &= -129;
        }
        try {
            this.f51621f.updateViewLayout(this.f51644n, layoutParams);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void d() {
        zs.e().b(this, zs.f19679r2);
        int i10 = this.f51611c;
        zs.f(i10).b(this, zs.f19729y5);
        zs.f(i10).b(this, zs.f19587b3);
    }

    public final void d0(String str) {
        int i10;
        a9 a9Var = this.E0;
        a9Var.clearAnimation();
        t7 t7Var = this.B0;
        if ((t7Var != null && t7Var.isDual()) || this.a2) {
            str = null;
        }
        this.Y1 = str;
        boolean z10 = false;
        if (str == null) {
            b0(a9Var, false, true);
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 3551) {
            if (hashCode != 109935) {
                if (hashCode == 3005871 && str.equals("auto")) {
                    a9Var.setContentDescription(cd.L0(2131754915, null));
                    i10 = 2131231750;
                }
            } else {
                str.equals("off");
            }
            a9Var.setContentDescription(cd.L0(2131754914, null));
            i10 = 2131231751;
        } else {
            if (str.equals("on")) {
                a9Var.setContentDescription(cd.L0(2131754913, null));
                i10 = 2131231752;
            }
            a9Var.setContentDescription(cd.L0(2131754914, null));
            i10 = 2131231751;
        }
        if (a9Var.f50923n != i10) {
            a9Var.f50923n = i10;
            ValueAnimator valueAnimator = a9Var.f50924r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                a9Var.f50924r = null;
            }
            a9Var.setDrawable(i10);
        }
        if (this.f51622f0 == 0 && !this.I0.e && this.Y1 != null && !H()) {
            z10 = true;
        }
        b0(a9Var, z10, true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        j4.w o10;
        n5 n5Var;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (i10 == zs.f19679r2) {
            r4 r4Var = this.O0;
            if (r4Var != null) {
                r4Var.h();
            }
            if (this.f51643m2 != null && MediaController.a2 != null) {
                for (int i12 = 0; i12 < MediaController.a2.size(); i12++) {
                    we weVar = (we) MediaController.a2.get(i12);
                    int i13 = weVar.f19085a;
                    we weVar2 = this.f51643m2;
                    if (i13 == weVar2.f19085a && weVar.f19086b == weVar2.f19086b) {
                        this.f51643m2 = weVar;
                        return;
                    }
                }
            }
        } else if (i10 == zs.f19729y5) {
            r4 r4Var2 = this.O0;
            if (r4Var2 != null && !this.V1) {
                r4Var2.h();
            }
        } else if (i10 == zs.f19587b3) {
            int i14 = this.f51622f0;
            int i15 = this.f51611c;
            if (i14 == 1) {
                if (!this.N1 && !this.f51613c1.o()) {
                    th.e5 O1 = vp.r1(i15).O1();
                    int A = A();
                    j4.w o11 = O1.o();
                    if (o11 == null || !o11.a(O1.f48904a, A) || ((n5Var = this.K1) != null && (n5Var.f51529g || n5Var.J0 != 0))) {
                        z10 = true;
                    }
                }
                this.f51609b1.setShareEnabled(z10);
            } else if (i14 == 0 && (o10 = vp.r1(i15).O1().o()) != null && o10.a(i15, 1)) {
                n5 n5Var2 = this.K1;
                if (n5Var2 == null || n5Var2.J0 == 0) {
                    g0(o10, true);
                }
            }
        }
    }

    public final void e(boolean z10) {
        float height;
        boolean z11;
        int i10;
        o0 o0Var;
        this.K0 = z10;
        Boolean bool = this.f51653p2;
        if (bool == null || bool.booleanValue() != z10) {
            if (this.M0 == null) {
                if (z10) {
                    s(false);
                }
                if (this.M0 == null) {
                    return;
                }
            }
            if (this.M0.U) {
                this.f51656q2 = new g7(this, z10, 0);
                return;
            }
            ValueAnimator valueAnimator = this.f51647n2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f51647n2 = null;
            }
            o1.j jVar = this.f51650o2;
            if (jVar != null) {
                jVar.d();
                this.f51650o2 = null;
            }
            if (this.M0 == null) {
                if (z10) {
                    s(false);
                }
                if (this.M0 == null) {
                    return;
                }
            }
            m2 m2Var = this.M0;
            if (m2Var != null) {
                m2Var.K = false;
            }
            if (z10 && (o0Var = this.N0) != null) {
                o0Var.a(false);
            }
            int i11 = 4;
            g8 g8Var = this.f51657r;
            if (g8Var != null) {
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                g8Var.setImportantForAccessibility(i10);
            }
            m2 m2Var2 = this.M0;
            if (z10) {
                i11 = 0;
            }
            m2Var2.setImportantForAccessibility(i11);
            this.f51653p2 = Boolean.valueOf(z10);
            float translationY = this.M0.getTranslationY();
            n8 n8Var = this.f51644n;
            if (z10) {
                height = 0.0f;
            } else {
                height = (n8Var.getHeight() - this.M0.g()) + (org.telegram.messenger.i0.f16021n * 2.5f);
            }
            Math.max(1, n8Var.getHeight());
            m2 m2Var3 = this.M0;
            m2Var3.K = !z10;
            if (this.f51636j2 == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f51639k2 = z11;
            if (z10) {
                o1.j jVar2 = new o1.j(m2Var3, o1.j.f13942p, height);
                this.f51650o2 = jVar2;
                jVar2.f13957m.a(0.75f);
                this.f51650o2.f13957m.b(350.0f);
                this.f51650o2.a(new gf0(this, height, 1));
                this.f51650o2.h();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.f51647n2 = ofFloat;
                ofFloat.addUpdateListener(new h7(this, 0));
                this.f51647n2.addListener(new q7(this, 1));
                this.f51647n2.setDuration(450L);
                this.f51647n2.setInterpolator(gr.h);
                this.f51647n2.start();
            }
            if (!z10 && !this.S1) {
                this.f51641l2 = null;
            }
            if (!z10 && this.f51622f0 == 0 && !this.f51664s2) {
                q();
            }
        }
    }

    public final void e0(boolean z10, boolean z11) {
        if (this.f51623f1 == null) {
            bi0 bi0Var = new bi0(2131624086, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), true, null);
            this.f51623f1 = bi0Var;
            bi0Var.F *= 1.5f;
        }
        this.f51626g1.setAnimation(this.f51623f1);
        int i10 = 20;
        if (!z11) {
            bi0 bi0Var2 = this.f51623f1;
            if (!z10) {
                i10 = 0;
            }
            bi0Var2.N(i10, false, false);
        } else if (z10) {
            bi0 bi0Var3 = this.f51623f1;
            if (bi0Var3.f24752a0 > 20) {
                bi0Var3.N(0, false, false);
            }
            this.f51623f1.P(20);
            this.f51623f1.start();
        } else {
            bi0 bi0Var4 = this.f51623f1;
            int i11 = bi0Var4.f24752a0;
            if (i11 != 0 && i11 < 43) {
                bi0Var4.P(43);
                this.f51623f1.start();
            }
        }
    }

    public final void f(float f7, boolean z10, Runnable runnable) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.E = null;
        }
        g8 g8Var = this.f51657r;
        if (z10) {
            this.P.d();
            zs.e().k(zs.f19633j1, 512);
            this.L = Float.valueOf(this.K);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f7);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new h7(this, 5));
            this.E.addListener(new l40(this, f7, runnable, 5));
            if (f7 < 1.0f && this.f51674w) {
                this.E.setDuration(250L);
                this.E.setInterpolator(gr.h);
            } else if (f7 <= 0.0f && g8Var.f51215a >= org.telegram.messenger.i0.L(20.0f)) {
                if (f7 < 0.0f && this.O) {
                    this.E.setDuration(200L);
                    this.E.setInterpolator(gr.h);
                    this.O = false;
                } else {
                    this.E.setDuration(400L);
                    this.E.setInterpolator(gr.h);
                }
            } else {
                this.E.setDuration(300L);
                this.E.setInterpolator(new u1.a());
            }
            this.E.start();
            return;
        }
        this.L = null;
        this.I = f7;
        j();
        g8Var.invalidate();
        this.f51644n.invalidate();
        runnable.run();
        n();
    }

    public final void f0() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT < 33 || (findOnBackInvokedDispatcher = this.f51644n.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.r(this, 4));
    }

    public final void g(boolean z10, boolean z11) {
        float f7;
        float L;
        float L2;
        float f10;
        float L3;
        float L4;
        t tVar;
        if (z10) {
            p2 p2Var = this.l1;
            if (p2Var != null) {
                p2Var.e(true);
            }
            p2 p2Var2 = this.f51642m1;
            if (p2Var2 != null) {
                p2Var2.e(true);
            }
            p2 p2Var3 = this.f51638k1;
            if (p2Var3 != null) {
                p2Var3.e(true);
            }
            p2 p2Var4 = this.W0;
            if (p2Var4 != null) {
                p2Var4.e(true);
            }
        }
        if (this.a2 == z10 && this.f51610b2 == H()) {
            return;
        }
        AnimatorSet animatorSet = this.Z1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.Z1 = null;
        }
        this.a2 = z10;
        this.f51610b2 = H();
        if (z10 && (tVar = this.I0) != null && tVar.e) {
            tVar.a(false, z11);
        }
        l0(z11);
        l7 l7Var = this.Q0;
        o2 o2Var = this.U0;
        o2 o2Var2 = this.T0;
        float f11 = 0.6f;
        float f12 = 1.0f;
        float f13 = 0.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.Z1 = animatorSet2;
            Property property = View.ALPHA;
            if (z10 && this.f51622f0 == 0 && !H()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(o2Var2, property, f10);
            Property property2 = View.TRANSLATION_Y;
            if (z10 && this.f51622f0 == 0 && !H()) {
                L3 = 0.0f;
            } else {
                L3 = org.telegram.messenger.i0.L(16.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(o2Var2, property2, L3);
            if (z10 || this.f51622f0 != 0 || !H()) {
                f11 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(o2Var, property, f11);
            if (!z10 && this.f51622f0 == 0 && H()) {
                L4 = 0.0f;
            } else {
                L4 = org.telegram.messenger.i0.L(16.0f);
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(o2Var, property2, L4);
            if (z10 || this.f51622f0 != 0 || H()) {
                f12 = 0.0f;
            }
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(l7Var, property, f12);
            if (z10 || this.f51622f0 != 0 || H()) {
                f13 = org.telegram.messenger.i0.L(16.0f);
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(l7Var, property2, f13));
            this.Z1.setDuration(260L);
            this.Z1.setInterpolator(gr.h);
            this.Z1.start();
            return;
        }
        if (z10 && this.f51622f0 == 0 && !H()) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        o2Var2.setAlpha(f7);
        if (z10 && this.f51622f0 == 0 && !H()) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.i0.L(16.0f);
        }
        o2Var2.setTranslationY(L);
        if (z10 || this.f51622f0 != 0 || !H()) {
            f11 = 0.0f;
        }
        o2Var.setAlpha(f11);
        if (!z10 && this.f51622f0 == 0 && H()) {
            L2 = 0.0f;
        } else {
            L2 = org.telegram.messenger.i0.L(16.0f);
        }
        o2Var.setTranslationY(L2);
        if (z10 || this.f51622f0 != 0 || H()) {
            f12 = 0.0f;
        }
        l7Var.setAlpha(f12);
        if (z10 || this.f51622f0 != 0 || H()) {
            f13 = org.telegram.messenger.i0.L(16.0f);
        }
        l7Var.setTranslationY(f13);
    }

    public final void g0(j4.w wVar, boolean z10) {
        if (this.f51688z2) {
            return;
        }
        kg.q0 q0Var = new kg.q0(wVar.b(), this.f51611c, this.f51607b, new u7(this, 0), null);
        q0Var.P1 = A();
        q0Var.setOnDismissListener(new o70(2, this, z10));
        this.X0.x(7, true);
        this.f51688z2 = true;
        q0Var.show();
    }

    public final void h(Runnable runnable) {
        n5 n5Var;
        Runnable runnable2;
        d8 d8Var;
        float f7;
        boolean z10;
        Bitmap.CompressFormat compressFormat;
        oe0 oe0Var = this.B1;
        if (oe0Var != null && (n5Var = this.K1) != null) {
            n5Var.f51534j = oe0Var.a() | n5Var.f51534j;
            n5 n5Var2 = this.K1;
            oe0 oe0Var2 = this.B1;
            File file = n5Var2.Z0;
            if (file != null) {
                file.delete();
                n5Var2.Z0 = null;
            }
            ff savedFilterState = oe0Var2.getSavedFilterState();
            n5Var2.f51516a1 = savedFilterState;
            if (!n5Var2.K) {
                if (savedFilterState.a()) {
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    Bitmap bitmap = oe0Var2.getBitmap();
                    if (bitmap == null) {
                        if (runnable != null) {
                            runnable.run();
                        }
                    } else {
                        Matrix matrix = new Matrix();
                        int i10 = n5Var2.R;
                        float f10 = 1.0f;
                        if (i10 == 1) {
                            f7 = -1.0f;
                        } else {
                            f7 = 1.0f;
                        }
                        if (i10 == 2) {
                            f10 = -1.0f;
                        }
                        matrix.postScale(f7, f10, n5Var2.f51537k0 / 2.0f, n5Var2.f51539l0 / 2.0f);
                        matrix.postRotate(-n5Var2.Q);
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        n5Var2.f51542n0.preScale(n5Var2.f51537k0 / createBitmap.getWidth(), n5Var2.f51539l0 / createBitmap.getHeight());
                        n5Var2.f51537k0 = createBitmap.getWidth();
                        n5Var2.f51539l0 = createBitmap.getHeight();
                        bitmap.recycle();
                        File file2 = n5Var2.Z0;
                        if (file2 != null && file2.exists()) {
                            n5Var2.Z0.delete();
                        }
                        String k10 = n5.k(n5Var2.L);
                        String str = "webp";
                        if (!"png".equals(k10) && !"webp".equals(k10)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        int i11 = n5Var2.f51514a;
                        if (!z10) {
                            str = "jpg";
                        }
                        n5Var2.Z0 = n5.w(i11, str);
                        if (runnable == null) {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(n5Var2.Z0);
                                if (z10) {
                                    compressFormat = Bitmap.CompressFormat.WEBP;
                                } else {
                                    compressFormat = Bitmap.CompressFormat.JPEG;
                                }
                                createBitmap.compress(compressFormat, 90, fileOutputStream);
                            } catch (Exception e) {
                                org.telegram.messenger.f8.g(e, true);
                            }
                            createBitmap.recycle();
                        } else {
                            runnable2 = runnable;
                            Utilities.f14523i.c(new org.telegram.ui.kp(n5Var2, createBitmap, z10, runnable2, 16));
                        }
                    }
                }
                runnable2 = runnable;
            } else {
                runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
            if (runnable2 == null) {
                n5 n5Var3 = this.K1;
                if (!n5Var3.K && (d8Var = this.X0) != null) {
                    d8Var.set(n5Var3);
                }
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final void h0(boolean z10, boolean z11) {
        if (this.f51617d2 != z10) {
            this.f51617d2 = z10;
            float f7 = 0.0f;
            if (z11) {
                ViewPropertyAnimator animate = this.J0.animate();
                if (z10) {
                    f7 = 1.0f;
                }
                animate.alpha(f7).setDuration(350L).setInterpolator(gr.h).withEndAction(new g7(this, z10, 1)).start();
                return;
            }
            this.J0.clearAnimation();
            if (z10) {
                f7 = 1.0f;
            }
            this.J0.setAlpha(f7);
            if (!z10) {
                this.J0.b(false, false);
            }
        }
    }

    public final void i() {
        if (this.K1 != null && this.D1 != null && this.f51628h0.getMeasuredWidth() > 0 && this.f51628h0.getMeasuredHeight() > 0) {
            Matrix matrix = new Matrix();
            matrix.reset();
            int i10 = this.K1.Q;
            if (i10 != 0) {
                matrix.postRotate(-i10, this.f51628h0.getMeasuredWidth() / 2.0f, this.f51628h0.getMeasuredHeight() / 2.0f);
                if ((this.K1.Q / 90) % 2 == 1) {
                    matrix.postScale(this.f51628h0.getMeasuredWidth() / this.f51628h0.getMeasuredHeight(), this.f51628h0.getMeasuredHeight() / this.f51628h0.getMeasuredWidth(), this.f51628h0.getMeasuredWidth() / 2.0f, this.f51628h0.getMeasuredHeight() / 2.0f);
                }
            }
            matrix.postScale((1.0f / this.f51628h0.getMeasuredWidth()) * this.K1.f51537k0, (1.0f / this.f51628h0.getMeasuredHeight()) * this.K1.f51539l0);
            matrix.postConcat(this.K1.f51542n0);
            matrix.postScale(this.f51628h0.getMeasuredWidth() / this.K1.f51533i0, this.f51628h0.getMeasuredHeight() / this.K1.f51535j0);
            this.D1.setTransform(matrix);
            this.D1.invalidate();
        }
    }

    public final void i0(boolean z10) {
        Integer num;
        float f7;
        s81 s81Var = this.V0;
        if ((s81Var.getTag() != null && z10) || (s81Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.f51620e2;
                if (runnable != null) {
                    org.telegram.messenger.i0.r(runnable);
                }
                y6 y6Var = new y6(this, 25);
                this.f51620e2 = y6Var;
                org.telegram.messenger.i0.h3(y6Var, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f51624f2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        s81Var.setTag(num);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f51624f2 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            s81Var.setVisibility(0);
        }
        AnimatorSet animatorSet3 = this.f51624f2;
        Property property = View.ALPHA;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animatorSet3.playTogether(ObjectAnimator.ofFloat(s81Var, property, f7));
        this.f51624f2.addListener(new sg.y(14, this, z10));
        this.f51624f2.start();
        if (z10) {
            y6 y6Var2 = new y6(this, 26);
            this.f51620e2 = y6Var2;
            org.telegram.messenger.i0.h3(y6Var2, 2000L);
        }
    }

    public final void j() {
        th.g2 g2Var;
        if (this.J == 1) {
            RectF rectF = this.f51615d0;
            rectF.set(this.f51628h0.getLeft(), this.f51628h0.getTop(), this.f51628h0.getMeasuredWidth(), this.f51628h0.getMeasuredHeight());
            rectF.offset(this.f51657r.getX(), this.f51657r.getY());
            float f7 = this.I;
            RectF rectF2 = this.H;
            RectF rectF3 = this.f51612c0;
            org.telegram.messenger.i0.Z1(rectF2, rectF, f7, rectF3);
            this.f51628h0.setAlpha(this.I);
            float f10 = rectF3.left;
            b8 b8Var = this.f51628h0;
            b8Var.setTranslationX((f10 - b8Var.getLeft()) - this.f51657r.getX());
            float f11 = rectF3.top;
            b8 b8Var2 = this.f51628h0;
            b8Var2.setTranslationY((f11 - b8Var2.getTop()) - this.f51657r.getY());
            j8 j8Var = this.F;
            if (j8Var != null && (g2Var = j8Var.f51328f) != null) {
                g2Var.setTranslationX((rectF.left - rectF2.left) * this.I);
                this.F.f51328f.setTranslationY((rectF.top - rectF2.top) * this.I);
            }
            this.f51628h0.setScaleX(rectF3.width() / this.f51628h0.getMeasuredWidth());
            this.f51628h0.setScaleY(rectF3.height() / this.f51628h0.getMeasuredHeight());
            this.f51631i0.setAlpha(this.I);
            this.f51637k0.setAlpha(this.I);
            this.f51640l0.setAlpha(this.I);
            if (this.f51622f0 == 2) {
                this.f51669u1.setAlpha(this.I);
            }
        }
    }

    public final void j0() {
        w6 w6Var = this.f51654q0;
        if (w6Var != null) {
            w6Var.dismiss();
            this.f51654q0 = null;
        }
        w6 w6Var2 = new w6(86400, this.f51607b, this.f51604a);
        w6Var2.U0();
        w6Var2.W0(this.f51683y0);
        TLRPC.InputPeer inputPeer = this.f51679x0;
        if (inputPeer == null) {
            if (this.N != 0) {
                inputPeer = vp.r1(this.f51611c).i1(this.N);
            } else {
                inputPeer = new TLRPC.TL_inputPeerSelf();
            }
        }
        w6Var2.V0(inputPeer);
        w6Var2.f52113w1 = this.M;
        w6Var2.L1 = new z6(this, 18);
        w6Var2.L0(false);
        w6Var2.S0(1);
        w6Var2.Q0(false);
        w6Var2.N1 = new z6(this, 19);
        w6Var2.K1 = new f7(this, 11);
        this.f51654q0 = w6Var2;
        w6Var2.show();
    }

    public final void k() {
        throw new UnsupportedOperationException("Method not decompiled: vh.o8.k():void");
    }

    public final void k0(int r25, boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: vh.o8.k0(int, boolean, boolean):void");
    }

    public final void l() {
        n5 n5Var;
        boolean z10;
        if (this.f51672v1 != null && (n5Var = this.K1) != null && n5Var.f51555u) {
            File file = n5Var.W0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                this.K1.W0 = null;
            }
            this.K1.W0 = n5.w(this.f51611c, "webp");
            s7 s7Var = this.f51672v1;
            n5 n5Var2 = this.K1;
            ArrayList arrayList = n5Var2.T0;
            if (this.O1 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            Bitmap q02 = s7Var.q0(arrayList, false, false, true, z10, n5Var2);
            try {
                try {
                    q02.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.K1.W0));
                    if (q02.isRecycled()) {
                        return;
                    }
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                    try {
                        this.K1.W0.delete();
                    } catch (Exception e10) {
                        org.telegram.messenger.f8.g(e10, true);
                    }
                    this.K1.W0 = null;
                    if (q02 == null || q02.isRecycled()) {
                        return;
                    }
                }
                q02.recycle();
            } catch (Throwable th2) {
                if (q02 != null && !q02.isRecycled()) {
                    q02.recycle();
                }
                throw th2;
            }
        }
    }

    public final void l0(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        float f7;
        boolean z16;
        t7 t7Var;
        boolean z17 = false;
        if (this.f51622f0 == 0 && this.O1 == 1 && !this.I0.e && !H()) {
            z11 = true;
        } else {
            z11 = false;
        }
        h0(z11, z10);
        this.G0.setSelected(this.A0.j());
        t tVar = this.I0;
        if (tVar != null && tVar.e) {
            z12 = false;
        } else {
            z12 = true;
        }
        b0(this.f51645n0, z12, z10);
        if (!this.a2 && this.O1 != -1 && this.f51622f0 == 0 && this.Y1 != null && !this.I0.e && !H()) {
            z13 = true;
        } else {
            z13 = false;
        }
        b0(this.E0, z13, z10);
        if (!this.a2 && this.O1 != -1 && this.f51622f0 == 0 && (t7Var = this.B0) != null && t7Var.f51983a && !this.I0.e && !this.A0.j()) {
            z14 = true;
        } else {
            z14 = false;
        }
        b0(this.F0, z14, z10);
        if (!this.a2 && this.O1 != -1 && this.f51622f0 == 0 && !this.I0.e) {
            z15 = true;
        } else {
            z15 = false;
        }
        b0(this.G0, z15, z10);
        b0(this.H0, this.I0.e, z10);
        if (this.A0.j()) {
            f7 = this.A0.getFilledProgress();
        } else {
            f7 = 0.0f;
        }
        this.O0.e(z10, f7);
        boolean z18 = this.I0.e;
        p2 p2Var = this.f51646n1;
        if (z18) {
            p2Var.u();
        } else {
            p2Var.e(true);
        }
        g(this.a2, z10);
        if (this.O1 == -1 && this.f51622f0 == 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        org.telegram.messenger.i0.U3(this.S0, z16, true);
        if (this.O1 == -1 && this.f51622f0 == 0) {
            z17 = true;
        }
        org.telegram.messenger.i0.U3(this.R0, z17, true);
    }

    public final void m0() {
        this.H0.setTranslationX(-0.0f);
        float alpha = (this.H0.getAlpha() * org.telegram.messenger.i0.L(46.0f)) + 0.0f;
        this.F0.setTranslationX(-alpha);
        float alpha2 = (this.F0.getAlpha() * org.telegram.messenger.i0.L(46.0f)) + alpha;
        this.G0.setTranslationX(-alpha2);
        float alpha3 = (this.G0.getAlpha() * org.telegram.messenger.i0.L(46.0f)) + alpha2;
        this.E0.setTranslationX(-alpha3);
        float alpha4 = this.E0.getAlpha();
        this.f51645n0.setTranslationX(0.0f);
        float alpha5 = this.f51645n0.getAlpha();
        float L = (alpha4 * org.telegram.messenger.i0.L(46.0f)) + alpha3 + org.telegram.messenger.i0.L(8.0f);
        org.telegram.ui.g3 g3Var = this.I0.f51945a;
        g3Var.setPadding((int) ((alpha5 * org.telegram.messenger.i0.L(46.0f)) + 0.0f + org.telegram.messenger.i0.L(8.0f)), 0, (int) L, 0);
        g3Var.invalidate();
    }

    public final void n() {
        boolean z10;
        if (this.K == 0.0f && this.I >= 1.0f && !this.B2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 == this.A2) {
            return;
        }
        aa0 aa0Var = this.D;
        if (aa0Var != null) {
            aa0Var.c(!z10);
        }
        this.A2 = z10;
    }

    public final void n0(boolean z10) {
        int i10;
        bi0 bi0Var = this.f51629h1;
        if (bi0Var != null) {
            int[] iArr = bi0Var.e;
            int i11 = 0;
            if (z10) {
                n5 n5Var = this.K1;
                if (n5Var != null && n5Var.f51563y0) {
                    i11 = iArr[0];
                }
                bi0Var.P(i11);
                bi0 bi0Var2 = this.f51629h1;
                if (bi0Var2 != null) {
                    bi0Var2.start();
                    return;
                }
                return;
            }
            n5 n5Var2 = this.K1;
            if (n5Var2 != null && n5Var2.f51563y0) {
                i10 = iArr[0] - 1;
            } else {
                i10 = 0;
            }
            bi0Var.N(i10, false, true);
            this.f51629h1.P(i10);
            ImageView imageView = this.f51632i1;
            if (imageView != null) {
                imageView.invalidate();
            }
        }
    }

    public final void o() {
        if (this.f51667t2 < 0) {
            this.f51667t2 = vp.d1().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.f51670u2 = arrayList;
            arrayList.add("off");
            this.f51670u2.add("auto");
            this.f51670u2.add("on");
            float f7 = vp.d1().getFloat("frontflash_warmth", 0.9f);
            z1 z1Var = this.f51661s;
            z1Var.f52237o = f7;
            z1Var.f52236n = z1.f(f7);
            z1Var.g();
            float f10 = vp.d1().getFloat("frontflash_intensity", 1.0f);
            z1 z1Var2 = this.f51661s;
            z1Var2.f52238p = f10;
            z1Var2.i();
        }
    }

    public final void o0() {
        if (this.W1) {
            return;
        }
        this.W1 = true;
        y6 y6Var = new y6(this, 2);
        s7 s7Var = this.f51672v1;
        n5 n5Var = this.K1;
        if (s7Var != null && n5Var != null) {
            n5Var.f();
            boolean r02 = s7Var.r0();
            boolean z10 = s7Var.f50996x0.getPainting().E;
            Utilities.f14522g.c(new ee(this, s7Var, n5Var.f51533i0, n5Var.f51535j0, n5Var, z10, r02, y6Var, 2));
            return;
        }
        y6Var.run();
    }

    public final void p(boolean z10) {
        d8 d8Var;
        if (this.d) {
            w6 w6Var = this.f51654q0;
            if (w6Var != null) {
                w6Var.dismiss();
                this.f51654q0 = null;
            }
            n5 n5Var = this.K1;
            long j10 = 0;
            if (n5Var != null && !n5Var.h) {
                if ((this.f51674w && n5Var.f51529g) || n5Var.f51517b != 0) {
                    n5Var.f51534j = false;
                }
                n5Var.i(false);
            }
            this.K1 = null;
            n20 n20Var = this.R;
            if (n20Var != null && (d8Var = this.X0) != null) {
                if (this.e) {
                    return;
                }
                this.e = true;
                u61 u61Var = d8Var.D;
                if (u61Var != null) {
                    u61Var.g0();
                    d8Var.D.m0();
                    d8Var.D = null;
                }
                u61 u61Var2 = d8Var.f51433y;
                if (u61Var2 != null) {
                    j10 = u61Var2.S();
                    d8Var.f51433y.g0();
                    d8Var.f51433y.m0();
                    d8Var.f51433y = null;
                }
                u61 u61Var3 = d8Var.e;
                if (u61Var3 != null) {
                    j10 = u61Var3.S();
                    d8Var.e.g0();
                    d8Var.e.m0();
                    d8Var.e = null;
                }
                n20Var.a(Long.valueOf(j10), new g7(this, z10, 2), Boolean.valueOf(this.f51674w), Long.valueOf(this.f51678x));
                return;
            }
            d8 d8Var2 = this.X0;
            if (d8Var2 != null && !z10) {
                d8Var2.set(null);
            }
            f(0.0f, z10, new y6(this, 23));
            int i10 = this.J;
            if (i10 == 1 || i10 == 0) {
                this.f51644n.setBackgroundColor(0);
                this.f51609b1.b(false, true);
            }
            zs.e().n(this, zs.f19679r2);
            int i11 = this.f51611c;
            zs.f(i11).n(this, zs.f19729y5);
            zs.f(i11).n(this, zs.f19587b3);
        }
    }

    public final boolean p0() {
        t7 t7Var;
        if ((this.P1 || this.Q1) && (t7Var = this.B0) != null && t7Var.isFrontface()) {
            int i10 = this.f51667t2;
            if (i10 == 2 || (i10 == 1 && this.f51614c2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void q() {
        boolean z10;
        Activity activity = this.f51607b;
        if (this.B0 == null && activity != null) {
            this.B0 = new t7(this, activity, vp.d1().getBoolean("stories_camera", false));
            r4 r4Var = this.O0;
            float f7 = 0.0f;
            if (r4Var != null) {
                r4Var.f51860g0 = 0.0f;
                r4Var.f51861h0.e(true, 0.0f);
            }
            this.B0.recordHevc = !this.A0.j();
            this.B0.setThumbDrawable(z());
            this.B0.initTexture();
            this.B0.setDelegate(new f7(this, 0));
            b9 b9Var = this.F0;
            if (this.B0.f51983a && this.f51622f0 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            b0(b9Var, z10, true);
            u uVar = this.G0;
            if (!this.B0.f51983a) {
                f7 = org.telegram.messenger.i0.L(46.0f);
            }
            uVar.setTranslationX(f7);
            this.A0.setCameraView(this.B0);
            if (vp.d1().getInt("storyhint2", 0) < 1) {
                this.W0.u();
                vp.d1().edit().putInt("storyhint2", vp.d1().getInt("storyhint2", 0) + 1).apply();
            } else if ((!u0.q(this.B0.getContext()) || !vp.d1().getBoolean("dualcam", u0.p(org.telegram.messenger.w0.f19025b, false))) && this.B0.f51983a && vp.d1().getInt("storydualhint", 0) < 2) {
                this.l1.u();
            }
            if (this.C0 == null) {
                this.C0 = new o4(activity, new z6(this, 3));
            }
            this.C0.a(this.B0);
            a5 a5Var = this.D0;
            if (a5Var != null) {
                c8 c8Var = this.A0;
                Object blurRenderNode = c8Var.getBlurRenderNode();
                a5Var.F = c8Var;
                a5Var.G = blurRenderNode;
                a5Var.invalidate();
            }
        }
    }

    public final void r() {
        n5 n5Var;
        Bitmap bitmap;
        Bitmap q6;
        if (this.B1 == null && (n5Var = this.K1) != null) {
            ff ffVar = null;
            if (!n5Var.K) {
                if (n5Var.Z0 == null) {
                    q6 = this.X0.getPhotoBitmap();
                } else {
                    f7 f7Var = new f7(this, 10);
                    Point point = org.telegram.messenger.i0.f16026q;
                    q6 = n5.q(f7Var, point.x, point.y, 0, true);
                }
                bitmap = q6;
            } else {
                bitmap = null;
            }
            if (bitmap != null || this.K1.K) {
                k61 textureView = this.X0.getTextureView();
                int orientation = this.X0.getOrientation();
                n5 n5Var2 = this.K1;
                if (n5Var2 != null) {
                    ffVar = n5Var2.f51516a1;
                }
                oe0 oe0Var = new oe0(this.f51607b, textureView, bitmap, null, orientation, ffVar, null, 0, false, false, this.f51658r0, this.f51604a);
                this.B1 = oe0Var;
                this.f51657r.addView(oe0Var);
                ne0 ne0Var = this.C1;
                if (ne0Var != null) {
                    ne0Var.setFilterView(this.B1);
                }
                TextureView myTextureView = this.B1.getMyTextureView();
                this.D1 = myTextureView;
                if (myTextureView != null) {
                    myTextureView.setOpaque(false);
                }
                this.X0.o(this.D1, this.B1);
                TextureView textureView2 = this.D1;
                if (textureView2 != null) {
                    textureView2.setAlpha(0.0f);
                    this.D1.animate().alpha(1.0f).setDuration(220L).start();
                }
                i();
                fe0 blurControl = this.B1.getBlurControl();
                this.E1 = blurControl;
                if (blurControl != null) {
                    this.f51628h0.addView(blurControl);
                }
                he0 curveControl = this.B1.getCurveControl();
                this.F1 = curveControl;
                if (curveControl != null) {
                    this.f51628h0.addView(curveControl);
                }
                U();
                this.B1.getDoneTextView().setOnClickListener(new a7(this, 13));
                this.B1.getCancelTextView().setOnClickListener(new a7(this, 14));
                this.B1.getToolsView().setVisibility(8);
                this.B1.getToolsView().setAlpha(0.0f);
                this.B1.getToolsView().setTranslationY(org.telegram.messenger.i0.L(186.0f));
                this.B1.f29048i0.setVisibility(0);
            }
        }
    }

    public final void s(boolean z10) {
        boolean z11;
        boolean z12;
        if (this.M0 != null) {
            c8 c8Var = this.A0;
            if (c8Var != null && c8Var.j()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 == this.M0.P) {
                return;
            }
        }
        if (this.f51607b == null) {
            return;
        }
        if (this.M0 != null) {
            v();
        }
        we weVar = this.f51643m2;
        boolean z13 = !z10;
        c8 c8Var2 = this.A0;
        if (c8Var2 != null && c8Var2.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        m2 m2Var = new m2(this, this.f51611c, this.f51607b, this.f51604a, weVar, z10, z13, z11);
        this.M0 = m2Var;
        m2Var.G.setVisibility(8);
        this.M0.setMultipleOnClick(this.A0.j());
        this.M0.setMaxCount(Math.min(10, r.b() - this.A0.getFilledCount()));
        this.M0.setOnBackClickListener(new j7(this, 1));
        this.M0.setOnSelectListener(new cv0(2, this, z10));
        this.M0.setOnSelectMultipleListener(new rh.b1(this, 2));
        s4.z zVar = this.f51641l2;
        if (zVar != null) {
            oi oiVar = this.M0.e;
            oiVar.B = zVar;
            oiVar.l0();
        }
        this.f51644n.addView(this.M0, w7.b6.e(-1, -1, 119));
    }

    public final void t() {
        throw new UnsupportedOperationException("Method not decompiled: vh.o8.t():void");
    }

    public final void u(boolean z10) {
        o4 o4Var = this.C0;
        if (o4Var != null) {
            o4Var.f51597f = null;
            Utilities.e.a(o4Var.h);
            this.C0 = null;
            c8 c8Var = this.A0;
            if (c8Var != null) {
                c8Var.f52125c.a(null);
            }
        }
        a5 a5Var = this.D0;
        if (a5Var != null) {
            a5Var.F = null;
            a5Var.G = null;
            a5Var.invalidate();
        }
        if (this.B0 != null) {
            if (z10) {
                a0(new y6(this, 8));
                return;
            }
            a0(new y6(this, 9));
            this.B0.destroy(true, null);
            org.telegram.messenger.i0.E2(this.B0);
            c8 c8Var2 = this.A0;
            if (c8Var2 != null) {
                c8Var2.setCameraView(null);
            }
            this.B0 = null;
        }
    }

    public final void v() {
        m2 m2Var = this.M0;
        if (m2Var == null) {
            return;
        }
        this.f51644n.removeView(m2Var);
        this.M0 = null;
        ValueAnimator valueAnimator = this.f51647n2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f51647n2 = null;
        }
        o1.j jVar = this.f51650o2;
        if (jVar != null) {
            jVar.d();
            this.f51650o2 = null;
        }
        this.f51653p2 = null;
    }

    public final void x() {
        oe0 oe0Var = this.B1;
        if (oe0Var == null) {
            return;
        }
        oe0Var.c();
        this.C1.setFilterView(null);
        this.f51657r.removeView(this.B1);
        TextureView textureView = this.D1;
        if (textureView != null) {
            this.f51628h0.removeView(textureView);
            this.D1 = null;
        }
        this.X0.o(null, null);
        fe0 fe0Var = this.E1;
        if (fe0Var != null) {
            this.f51628h0.removeView(fe0Var);
            this.E1 = null;
        }
        he0 he0Var = this.F1;
        if (he0Var != null) {
            this.f51628h0.removeView(he0Var);
            this.F1 = null;
        }
        this.B1 = null;
    }

    public final void y() {
        s7 s7Var = this.f51672v1;
        if (s7Var != null) {
            s7Var.A0.removeAllViews();
            s7 s7Var2 = this.f51672v1;
            s7Var2.f50996x0.h();
            s7Var2.A0.setVisibility(8);
            s7Var2.f51000z0.setVisibility(8);
            s7Var2.f50976n0.postRunnable(new r5.a(14));
            q3 q3Var = s7Var2.T1;
            if (q3Var != null) {
                q3Var.dismiss();
            }
            ig.u uVar = s7Var2.C1;
            if (uVar != null) {
                uVar.dismiss();
            }
            this.f51657r.removeView(this.f51672v1);
            this.f51672v1 = null;
            ig.c1 c1Var = this.f51676w1;
            if (c1Var != null) {
                this.f51628h0.removeView(c1Var);
                this.f51676w1 = null;
            }
            View view = this.f51684y1;
            if (view != null) {
                this.f51628h0.removeView(view);
                this.f51684y1 = null;
            }
            View view2 = this.f51680x1;
            if (view2 != null) {
                this.f51628h0.removeView(view2);
                this.f51680x1 = null;
            }
            View view3 = this.f51687z1;
            if (view3 != null) {
                this.f51628h0.removeView(view3);
                this.f51687z1 = null;
            }
            View view4 = this.A1;
            if (view4 != null) {
                this.f51628h0.removeView(view4);
                this.A1 = null;
            }
        }
    }

    public final Drawable z() {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeFile(new File(org.telegram.messenger.w0.h(), "cthumb.jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmap = null;
        }
        if (bitmap != null) {
            return new BitmapDrawable(bitmap);
        }
        return this.f51607b.getResources().getDrawable(2131231493);
    }
}
