package vh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.k20;
import org.telegram.messenger.kj;
import org.telegram.messenger.v20;
import org.telegram.messenger.vi;
import org.telegram.messenger.w20;
import org.telegram.messenger.wp;
import org.telegram.messenger.ze;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo0;
public abstract class b4 extends wu0 implements jg.x1, jg.h, jg.r1, uu0, k8 {
    public final x3 A0;
    public int A1;
    public final FrameLayout B0;
    public int B1;
    public final y3 C0;
    public ig.u C1;
    public final m3 D0;
    public final boolean D1;
    public final FrameLayout E0;
    public final File E1;
    public jg.d0 F0;
    public final boolean F1;
    public final View G0;
    public final boolean G1;
    public int H0;
    public boolean H1;
    public int I0;
    public nj0 I1;
    public float J0;
    public jg.h2 J1;
    public ValueAnimator K0;
    public float K1;
    public boolean L0;
    public boolean L1;
    public final jg.d2 M0;
    public boolean M1;
    public final r2.y N0;
    public s9 N1;
    public final int O0;
    public final j4 O1;
    public BigInteger P0;
    public final k4 P1;
    public TextView Q0;
    public boolean Q1;
    public TextView R0;
    public ObjectAnimator R1;
    public TextView S0;
    public final float[] S1;
    public final jg.y1 T0;
    public q3 T1;
    public final jg.t1 U0;
    public boolean U1;
    public final jg.a2 V0;
    public boolean V1;
    public final ImageView W0;
    public boolean W1;
    public final TextView X0;
    public final int[] X1;
    public final TextView Y0;
    public vy Y1;
    public final TextView Z0;
    public boolean Z1;
    public final Paint f50961a1;
    public boolean a2;
    public final Paint f50962b1;
    public boolean f50963b2;
    public float f50964c1;
    public int f50965c2;
    public boolean f50966d1;
    public boolean f50967d2;
    public o1.j f50968e1;
    public int f50969e2;
    public final n3 f50970f1;
    public int f50971f2;
    public final Paint f50972g1;
    public int f50973g2;
    public final Paint f50974h1;
    public boolean f50975h2;
    public final Paint f50976i1;
    public final jg.k1 f50977j0;
    public final ig.q1 f50978j1;
    public final jg.o1 f50979k0;
    public boolean f50980k1;
    public final Bitmap f50981l0;
    public o1.j l1;
    public final ig.t1 m0;
    public float f50982m1;
    public final org.telegram.messenger.s5 f50983n0;
    public final Paint f50984n1;
    public final ze f50985o0;
    public final int f50986o1;
    public boolean f50987p0;
    public final org.telegram.ui.ActionBar.x4 f50988p1;
    public qu0 f50989q0;
    public org.telegram.ui.ActionBar.k1 f50990q1;
    public boolean f50991r0;
    public a4 f50992r1;
    public jg.j f50993s0;
    public Rect f50994s1;
    public boolean f50995t0;
    public Runnable f50996t1;
    public int f50997u0;
    public Runnable f50998u1;
    public boolean f50999v0;
    public final n8 f51000v1;
    public final boolean f51001w0;
    public AnimatorSet f51002w1;
    public final v3 f51003x0;
    public final o3 f51004x1;
    public final bo0 f51005y0;
    public n5 f51006y1;
    public final m3 f51007z0;
    public ArrayList f51008z1;

    public b4(Context context, boolean z10, File file, boolean z11, boolean z12, n8 n8Var, Activity activity, final int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, n5 n5Var, int i12, int i13, ze zeVar, s9 s9Var, org.telegram.ui.ActionBar.p6 p6Var, j4 j4Var, k4 k4Var) {
        super(context, activity);
        v3 v3Var;
        ig.q1 q1Var;
        s9 s9Var2;
        org.telegram.messenger.s5 s5Var;
        Bitmap bitmap3;
        Paint paint;
        Paint paint2;
        v3 v3Var2;
        int i14;
        this.H0 = 0;
        this.I0 = -1;
        final s7 s7Var = (s7) this;
        r2.y yVar = new r2.y(s7Var, 12);
        this.N0 = yVar;
        Paint paint3 = new Paint(1);
        this.f50961a1 = paint3;
        Paint paint4 = new Paint(1);
        this.f50962b1 = paint4;
        this.f50972g1 = new Paint(1);
        this.f50974h1 = new Paint(1);
        Paint paint5 = new Paint(1);
        this.f50976i1 = paint5;
        ig.q1 q1Var2 = new ig.q1(1.0f, 0.016773745f, -1);
        this.f50978j1 = q1Var2;
        this.f50984n1 = new Paint(1);
        this.S1 = new float[2];
        this.V1 = false;
        this.X1 = new int[2];
        new u0.b(s7Var, 1);
        setDelegate(this);
        this.N1 = s9Var;
        this.O1 = j4Var;
        this.D1 = z10;
        this.E1 = file;
        this.F1 = z11;
        this.G1 = z12;
        this.f51000v1 = n8Var;
        this.A1 = i12;
        this.B1 = i13;
        this.P1 = k4Var;
        this.f50986o1 = i10;
        org.telegram.ui.ActionBar.x4 x4Var = new org.telegram.ui.ActionBar.x4(2, p6Var);
        this.f50988p1 = x4Var;
        this.f50985o0 = zeVar;
        this.f51001w0 = context instanceof BubbleActivity;
        ig.s0 e = ig.s0.e(i10);
        e.i(0, true);
        q1Var2.f8433a = e.c();
        q1Var2.f8435c = e.f8457i;
        org.telegram.messenger.s5 s5Var2 = new org.telegram.messenger.s5("Paint", true);
        this.f50983n0 = s5Var2;
        this.f50981l0 = bitmap;
        this.O0 = i11;
        ig.t1 t1Var = new ig.t1();
        this.m0 = t1Var;
        t1Var.f8470a = new rh.d0(s7Var, 27);
        View view = new View(context);
        this.G0 = view;
        view.setVisibility(8);
        view.setBackgroundColor(1291845632);
        view.setAlpha(0.0f);
        ig.q0 q0Var = new ig.q0(getPaintingSize(), null, i11, s9Var);
        if (n5Var == null || !n5Var.f51570u) {
            q1Var = q1Var2;
            s9Var2 = s9Var;
            s5Var = s5Var2;
            bitmap3 = bitmap;
            paint = paint4;
            paint2 = paint5;
            v3Var2 = v3Var;
            i14 = 1;
        } else {
            q1Var = q1Var2;
            s9Var2 = null;
            paint = paint4;
            paint2 = paint5;
            v3Var2 = v3Var;
            i14 = 1;
            s5Var = s5Var2;
            bitmap3 = bitmap;
        }
        v3Var2 = new v3(s7Var, context, q0Var, bitmap3, bitmap2, s9Var2);
        this.f51003x0 = v3Var2;
        v3Var2.setDelegate(new w3(s7Var));
        v3Var2.setUndoStore(t1Var);
        v3Var2.setQueue(s5Var);
        v3Var2.setVisibility(4);
        bo0 bo0Var = new bo0(s7Var, context, 10);
        this.f51005y0 = bo0Var;
        bo0Var.setVisibility(4);
        x3 x3Var = new x3(s7Var, context, new s9.g(s7Var));
        this.A0 = x3Var;
        this.f51006y1 = n5Var;
        this.f51008z1 = arrayList;
        if (this.A1 > 0 && this.B1 > 0) {
            E0();
        }
        x3Var.setVisibility(4);
        this.f51007z0 = new m3(s7Var, context, i14);
        FrameLayout frameLayout = new FrameLayout(context);
        this.B0 = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{1073741824, 0}));
        addView(frameLayout, w7.b6.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.W0 = imageView;
        imageView.setImageResource(2131232530);
        imageView.setPadding(org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.t6.h0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        s7 s7Var2 = s7Var;
                        v3 v3Var3 = s7Var2.f51003x0;
                        if (v3Var3 != null && (v3Var3.getCurrentBrush() instanceof ig.g)) {
                            v3Var3.b();
                            s7Var2.T0.setSelectedIndex(1);
                            s7Var2.z((ig.h) ig.h.f8316a.get(0));
                            return;
                        }
                        s7Var2.m0.c();
                        return;
                    case 1:
                        s7 s7Var3 = s7Var;
                        v3 v3Var4 = s7Var3.f51003x0;
                        ig.t1 t1Var2 = s7Var3.m0;
                        if (t1Var2.a()) {
                            if (v3Var4 != null && (v3Var4.getCurrentBrush() instanceof ig.g)) {
                                v3Var4.b();
                                s7Var3.T0.setSelectedIndex(1);
                                s7Var3.z((ig.h) ig.h.f8316a.get(0));
                            }
                            if (v3Var4 != null) {
                                v3Var4.a();
                            }
                            t1Var2.f8472c.clear();
                            t1Var2.f8471b.clear();
                            org.telegram.messenger.i0.g3(new gg.c(t1Var2, 9));
                            s7Var3.A0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        s7 s7Var4 = s7Var;
                        jg.j jVar = s7Var4.f50993s0;
                        if (jVar instanceof jg.g3) {
                            org.telegram.messenger.i0.v1(((jg.g3) jVar).getFocusedView());
                        }
                        if (s7Var4.Z1) {
                            s7Var4.s0(false);
                        }
                        s7Var4.z0(s7Var4.f50993s0);
                        s7Var4.A0(null, true);
                        return;
                    case 3:
                        s7Var.A0(null, true);
                        return;
                    default:
                        s7 s7Var5 = s7Var;
                        if (s7Var5.f50980k1) {
                            s7Var5.F0(false);
                            return;
                        } else if (s7Var5.Z1) {
                            s7Var5.s0(true);
                            return;
                        } else if (s7Var5.f50995t0) {
                            s7Var5.A0(null, true);
                            return;
                        } else {
                            Runnable runnable = s7Var5.f50998u1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout.addView(imageView, w7.b6.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.t6.h0(822083583, 7, -1));
        linearLayout.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextSize(1, 16.0f);
        textView.setText(dd.L0(2131747283, null));
        linearLayout.addView(a30.e(context, 2131232531), w7.b6.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, w7.b6.r(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new bh.c(27));
        frameLayout.addView(linearLayout, w7.b6.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.X0 = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.t6.h0(822083583, 7, -1));
        textView2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        textView2.setText(dd.L0(2131747295, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        s7 s7Var2 = s7Var;
                        v3 v3Var3 = s7Var2.f51003x0;
                        if (v3Var3 != null && (v3Var3.getCurrentBrush() instanceof ig.g)) {
                            v3Var3.b();
                            s7Var2.T0.setSelectedIndex(1);
                            s7Var2.z((ig.h) ig.h.f8316a.get(0));
                            return;
                        }
                        s7Var2.m0.c();
                        return;
                    case 1:
                        s7 s7Var3 = s7Var;
                        v3 v3Var4 = s7Var3.f51003x0;
                        ig.t1 t1Var2 = s7Var3.m0;
                        if (t1Var2.a()) {
                            if (v3Var4 != null && (v3Var4.getCurrentBrush() instanceof ig.g)) {
                                v3Var4.b();
                                s7Var3.T0.setSelectedIndex(1);
                                s7Var3.z((ig.h) ig.h.f8316a.get(0));
                            }
                            if (v3Var4 != null) {
                                v3Var4.a();
                            }
                            t1Var2.f8472c.clear();
                            t1Var2.f8471b.clear();
                            org.telegram.messenger.i0.g3(new gg.c(t1Var2, 9));
                            s7Var3.A0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        s7 s7Var4 = s7Var;
                        jg.j jVar = s7Var4.f50993s0;
                        if (jVar instanceof jg.g3) {
                            org.telegram.messenger.i0.v1(((jg.g3) jVar).getFocusedView());
                        }
                        if (s7Var4.Z1) {
                            s7Var4.s0(false);
                        }
                        s7Var4.z0(s7Var4.f50993s0);
                        s7Var4.A0(null, true);
                        return;
                    case 3:
                        s7Var.A0(null, true);
                        return;
                    default:
                        s7 s7Var5 = s7Var;
                        if (s7Var5.f50980k1) {
                            s7Var5.F0(false);
                            return;
                        } else if (s7Var5.Z1) {
                            s7Var5.s0(true);
                            return;
                        } else if (s7Var5.f50995t0) {
                            s7Var5.A0(null, true);
                            return;
                        } else {
                            Runnable runnable = s7Var5.f50998u1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView l4 = org.telegram.ui.Cells.f1.l(frameLayout, textView2, w7.b6.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.Y0 = l4;
        l4.setBackground(org.telegram.ui.ActionBar.t6.h0(822083583, 7, -1));
        l4.setText(dd.L0(2131752101, null));
        l4.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        l4.setGravity(16);
        l4.setTextColor(-1);
        l4.setTypeface(org.telegram.messenger.i0.o());
        l4.setTextSize(1, 16.0f);
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        s7 s7Var2 = s7Var;
                        v3 v3Var3 = s7Var2.f51003x0;
                        if (v3Var3 != null && (v3Var3.getCurrentBrush() instanceof ig.g)) {
                            v3Var3.b();
                            s7Var2.T0.setSelectedIndex(1);
                            s7Var2.z((ig.h) ig.h.f8316a.get(0));
                            return;
                        }
                        s7Var2.m0.c();
                        return;
                    case 1:
                        s7 s7Var3 = s7Var;
                        v3 v3Var4 = s7Var3.f51003x0;
                        ig.t1 t1Var2 = s7Var3.m0;
                        if (t1Var2.a()) {
                            if (v3Var4 != null && (v3Var4.getCurrentBrush() instanceof ig.g)) {
                                v3Var4.b();
                                s7Var3.T0.setSelectedIndex(1);
                                s7Var3.z((ig.h) ig.h.f8316a.get(0));
                            }
                            if (v3Var4 != null) {
                                v3Var4.a();
                            }
                            t1Var2.f8472c.clear();
                            t1Var2.f8471b.clear();
                            org.telegram.messenger.i0.g3(new gg.c(t1Var2, 9));
                            s7Var3.A0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        s7 s7Var4 = s7Var;
                        jg.j jVar = s7Var4.f50993s0;
                        if (jVar instanceof jg.g3) {
                            org.telegram.messenger.i0.v1(((jg.g3) jVar).getFocusedView());
                        }
                        if (s7Var4.Z1) {
                            s7Var4.s0(false);
                        }
                        s7Var4.z0(s7Var4.f50993s0);
                        s7Var4.A0(null, true);
                        return;
                    case 3:
                        s7Var.A0(null, true);
                        return;
                    default:
                        s7 s7Var5 = s7Var;
                        if (s7Var5.f50980k1) {
                            s7Var5.F0(false);
                            return;
                        } else if (s7Var5.Z1) {
                            s7Var5.s0(true);
                            return;
                        } else if (s7Var5.f50995t0) {
                            s7Var5.A0(null, true);
                            return;
                        } else {
                            Runnable runnable = s7Var5.f50998u1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        l4.setAlpha(0.0f);
        l4.setVisibility(8);
        TextView l10 = org.telegram.ui.Cells.f1.l(frameLayout, l4, w7.b6.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.Z0 = l10;
        l10.setBackground(org.telegram.ui.ActionBar.t6.h0(822083583, 7, -1));
        l10.setText(dd.L0(2131751355, null));
        l10.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        l10.setGravity(16);
        l10.setTextColor(-1);
        l10.setTypeface(org.telegram.messenger.i0.o());
        l10.setTextSize(1, 16.0f);
        l10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        s7 s7Var2 = s7Var;
                        v3 v3Var3 = s7Var2.f51003x0;
                        if (v3Var3 != null && (v3Var3.getCurrentBrush() instanceof ig.g)) {
                            v3Var3.b();
                            s7Var2.T0.setSelectedIndex(1);
                            s7Var2.z((ig.h) ig.h.f8316a.get(0));
                            return;
                        }
                        s7Var2.m0.c();
                        return;
                    case 1:
                        s7 s7Var3 = s7Var;
                        v3 v3Var4 = s7Var3.f51003x0;
                        ig.t1 t1Var2 = s7Var3.m0;
                        if (t1Var2.a()) {
                            if (v3Var4 != null && (v3Var4.getCurrentBrush() instanceof ig.g)) {
                                v3Var4.b();
                                s7Var3.T0.setSelectedIndex(1);
                                s7Var3.z((ig.h) ig.h.f8316a.get(0));
                            }
                            if (v3Var4 != null) {
                                v3Var4.a();
                            }
                            t1Var2.f8472c.clear();
                            t1Var2.f8471b.clear();
                            org.telegram.messenger.i0.g3(new gg.c(t1Var2, 9));
                            s7Var3.A0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        s7 s7Var4 = s7Var;
                        jg.j jVar = s7Var4.f50993s0;
                        if (jVar instanceof jg.g3) {
                            org.telegram.messenger.i0.v1(((jg.g3) jVar).getFocusedView());
                        }
                        if (s7Var4.Z1) {
                            s7Var4.s0(false);
                        }
                        s7Var4.z0(s7Var4.f50993s0);
                        s7Var4.A0(null, true);
                        return;
                    case 3:
                        s7Var.A0(null, true);
                        return;
                    default:
                        s7 s7Var5 = s7Var;
                        if (s7Var5.f50980k1) {
                            s7Var5.F0(false);
                            return;
                        } else if (s7Var5.Z1) {
                            s7Var5.s0(true);
                            return;
                        } else if (s7Var5.f50995t0) {
                            s7Var5.A0(null, true);
                            return;
                        } else {
                            Runnable runnable = s7Var5.f50998u1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        l10.setAlpha(0.0f);
        l10.setVisibility(8);
        frameLayout.addView(l10, w7.b6.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        y3 y3Var = new y3(s7Var, context, e);
        this.C0 = y3Var;
        y3Var.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), 0);
        y3Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(y3Var, w7.b6.e(-1, 104, 80));
        jg.y1 y1Var = new jg.y1(context, (n5Var == null || n5Var.v() || n5Var.f51570u || s9Var == null) ? false : true);
        this.T0 = y1Var;
        y1Var.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        y1Var.setDelegate(this);
        y1Var.setSelectedIndex(1);
        y3Var.addView(y1Var, w7.b6.c(48.0f, -1));
        jg.t1 t1Var2 = new jg.t1(context);
        this.U0 = t1Var2;
        t1Var2.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        t1Var2.setVisibility(8);
        t1Var2.setDelegate(this);
        post(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        s7 s7Var2 = s7Var;
                        ig.q1 q1Var3 = s7Var2.f50978j1;
                        s7Var2.C0(q1Var3);
                        ig.s0.e(i10).j(q1Var3.f8435c);
                        return;
                    default:
                        s7Var.U0.setTypeface(ig.s0.e(i10).f8458j);
                        return;
                }
            }
        });
        t1Var2.setAlignment(ig.s0.e(i10).f8456g);
        y3Var.addView(t1Var2, w7.b6.c(48.0f, -1));
        m3 m3Var = new m3(s7Var, context, 0);
        this.D0 = m3Var;
        addView(m3Var, w7.b6.c(-1.0f, -1));
        jg.a2 a2Var = new jg.a2(context);
        this.V0 = a2Var;
        a2Var.setVisibility(8);
        a2Var.setOnItemClickListener(new ag.y0(s7Var, 21));
        t1Var2.setTypefaceListView(a2Var);
        m3Var.addView(a2Var, w7.b6.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(352321535);
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G8, x4Var));
        n3 n3Var = new n3(s7Var, context);
        this.f50970f1 = n3Var;
        n3Var.setVisibility(8);
        n3Var.setColorPalette(ig.s0.e(i10));
        n3Var.setColorListener(new ig.i(s7Var, 3));
        y3Var.addView(n3Var, w7.b6.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        jg.k1 k1Var = new jg.k1(context);
        this.f50977j0 = k1Var;
        k1Var.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        k1Var.setBackground(org.telegram.ui.ActionBar.t6.h0(1090519039, 1, -1));
        y3Var.addView(k1Var, w7.b6.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        k1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        s7 s7Var2 = s7Var;
                        v3 v3Var3 = s7Var2.f51003x0;
                        if (v3Var3 != null && (v3Var3.getCurrentBrush() instanceof ig.g)) {
                            v3Var3.b();
                            s7Var2.T0.setSelectedIndex(1);
                            s7Var2.z((ig.h) ig.h.f8316a.get(0));
                            return;
                        }
                        s7Var2.m0.c();
                        return;
                    case 1:
                        s7 s7Var3 = s7Var;
                        v3 v3Var4 = s7Var3.f51003x0;
                        ig.t1 t1Var22 = s7Var3.m0;
                        if (t1Var22.a()) {
                            if (v3Var4 != null && (v3Var4.getCurrentBrush() instanceof ig.g)) {
                                v3Var4.b();
                                s7Var3.T0.setSelectedIndex(1);
                                s7Var3.z((ig.h) ig.h.f8316a.get(0));
                            }
                            if (v3Var4 != null) {
                                v3Var4.a();
                            }
                            t1Var22.f8472c.clear();
                            t1Var22.f8471b.clear();
                            org.telegram.messenger.i0.g3(new gg.c(t1Var22, 9));
                            s7Var3.A0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        s7 s7Var4 = s7Var;
                        jg.j jVar = s7Var4.f50993s0;
                        if (jVar instanceof jg.g3) {
                            org.telegram.messenger.i0.v1(((jg.g3) jVar).getFocusedView());
                        }
                        if (s7Var4.Z1) {
                            s7Var4.s0(false);
                        }
                        s7Var4.z0(s7Var4.f50993s0);
                        s7Var4.A0(null, true);
                        return;
                    case 3:
                        s7Var.A0(null, true);
                        return;
                    default:
                        s7 s7Var5 = s7Var;
                        if (s7Var5.f50980k1) {
                            s7Var5.F0(false);
                            return;
                        } else if (s7Var5.Z1) {
                            s7Var5.s0(true);
                            return;
                        } else if (s7Var5.f50995t0) {
                            s7Var5.A0(null, true);
                            return;
                        } else {
                            Runnable runnable = s7Var5.f50998u1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        jg.o1 o1Var = new jg.o1(context);
        this.f50979k0 = o1Var;
        o1Var.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        o1Var.setBackground(org.telegram.ui.ActionBar.t6.h0(1090519039, 1, -1));
        o1Var.setOnClickListener(new rh.e7(s7Var, context, e, 8));
        y3Var.addView(o1Var, w7.b6.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        jg.d2 d2Var = new jg.d2(context);
        this.M0 = d2Var;
        ig.q1 q1Var3 = q1Var;
        d2Var.setColorSwatch(q1Var3);
        d2Var.setRenderView(v3Var2);
        d2Var.setValueOverride(yVar);
        q1Var3.f8435c = yVar.get();
        d2Var.setOnUpdate(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        s7 s7Var2 = s7Var;
                        ig.q1 q1Var32 = s7Var2.f50978j1;
                        s7Var2.C0(q1Var32);
                        ig.s0.e(i10).j(q1Var32.f8435c);
                        return;
                    default:
                        s7Var.U0.setTypeface(ig.s0.e(i10).f8458j);
                        return;
                }
            }
        });
        addView(d2Var, w7.b6.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.E0 = frameLayout2;
        addView(frameLayout2, w7.b6.c(-1.0f, -1));
        Paint paint6 = paint2;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        B0(q1Var3, null, false);
        z((ig.h) ig.h.f8316a.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            Point point = org.telegram.messenger.i0.f16172q;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (point.y * 0.35f), org.telegram.messenger.i0.L(100.0f), (int) (point.y * 0.65d))));
        }
        this.f51004x1 = new o3(s7Var, n8Var, new rh.q2(5, s7Var, n8Var));
        u1.f52000y1 = 1;
    }

    public static void D0(jg.g3 g3Var, int i10) {
        int i11;
        g3Var.setAlign(i10);
        int i12 = 2;
        if (i10 != 1) {
            if (i10 != 2) {
                i11 = 19;
            } else {
                i11 = 21;
            }
        } else {
            i11 = 17;
        }
        g3Var.getEditText().setGravity(i11);
        if (i10 != 1) {
            if (i10 == 2 ? !dd.X : dd.X) {
                i12 = 3;
            }
        } else {
            i12 = 4;
        }
        g3Var.getEditText().setTextAlignment(i12);
    }

    public static void X(s7 s7Var, ig.s0 s0Var, Integer num) {
        s0Var.h(num.intValue(), true);
        s0Var.g();
        s7Var.setNewColor(num.intValue());
        s7Var.f50970f1.setSelectedColorIndex(s0Var.d());
        s7Var.C1 = null;
    }

    public static void Y(s7 s7Var, Integer num) {
        s7Var.setNewColor(num.intValue());
        s7Var.F0(false);
    }

    public ViewGroup getBarView() {
        if (this.H0 == 2) {
            return this.U0;
        }
        return this.T0;
    }

    private int getFrameRotation() {
        int i10 = this.O0;
        if (i10 != 90) {
            if (i10 != 180) {
                if (i10 != 270) {
                    return 0;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    private qu0 getPaintingSize() {
        qu0 qu0Var = this.f50989q0;
        if (qu0Var != null) {
            return qu0Var;
        }
        qu0 qu0Var2 = new qu0(1080.0f, 1920.0f);
        this.f50989q0 = qu0Var2;
        return qu0Var2;
    }

    private void setCoverPause(boolean z10) {
        int i10 = 0;
        while (true) {
            x3 x3Var = this.A0;
            if (i10 < x3Var.getChildCount()) {
                View childAt = x3Var.getChildAt(i10);
                if (childAt instanceof jg.w2) {
                    ImageReceiver imageReceiver = ((jg.w2) childAt).f10351x0;
                    ci0 B = imageReceiver.B();
                    org.telegram.ui.Components.s5 m10 = imageReceiver.m();
                    boolean z11 = !z10;
                    imageReceiver.f14411u0 = z11;
                    imageReceiver.f14409t0 = z11;
                    if (B != null) {
                        if (z10) {
                            B.stop();
                        } else {
                            B.start();
                        }
                    } else if (m10 != null) {
                        m10.D = z10;
                        if (z10) {
                            m10.x(false);
                        }
                        if (z10) {
                            m10.stop();
                        } else {
                            m10.start();
                        }
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void setNewColor(int i10) {
        ig.q1 q1Var = this.f50978j1;
        int i11 = q1Var.f8433a;
        q1Var.f8433a = i10;
        B0(q1Var, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new jg.a0(this, i11, i10, 5));
        duration.start();
    }

    private void setTextType(int i10) {
        this.f50997u0 = i10;
        jg.j jVar = this.f50993s0;
        if (jVar instanceof jg.g3) {
            ((jg.g3) jVar).setType(i10);
        }
        ig.s0 e = ig.s0.e(this.f50986o1);
        e.h = i10;
        e.f8452a.edit().putInt("text_type", i10).apply();
        this.U0.e(i10, true);
    }

    private void setupTabsLayout(Context context) {
        jg.d0 d0Var = new jg.d0(this, context);
        this.F0 = d0Var;
        d0Var.setClipToPadding(false);
        this.F0.setOrientation(0);
        this.C0.addView(this.F0, w7.b6.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.Q0 = textView;
        textView.setText(dd.L0(2131747293, null).toUpperCase());
        TextView textView2 = this.Q0;
        int i10 = org.telegram.ui.ActionBar.t6.f21021i6;
        org.telegram.ui.ActionBar.x4 x4Var = this.f50988p1;
        org.telegram.ui.ActionBar.a7.R(textView2, org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i10, x4Var), 7, -1), null, org.telegram.ui.ActionBar.a7.N(i10), x4Var);
        this.Q0.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
        this.Q0.setTextColor(-1);
        this.Q0.setTextSize(1, 14.0f);
        this.Q0.setGravity(1);
        this.Q0.setTypeface(org.telegram.messenger.i0.o());
        this.Q0.setSingleLine();
        this.Q0.setOnClickListener(new View.OnClickListener(this) {
            public final b4 f50915b;

            {
                this.f50915b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        b4 b4Var = this.f50915b;
                        if (b4Var.f50995t0) {
                            b4Var.A0(null, true);
                            return;
                        } else {
                            b4Var.O0(0);
                            return;
                        }
                    case 1:
                        this.f50915b.x0();
                        return;
                    default:
                        b4 b4Var2 = this.f50915b;
                        b4Var2.O0(2);
                        if (!(b4Var2.f50993s0 instanceof jg.g3)) {
                            b4Var2.U1 = true;
                            b4Var2.l0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.F0.addView(this.Q0, w7.b6.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.R0 = textView3;
        textView3.setText(dd.L0(2131747292, null).toUpperCase());
        org.telegram.ui.ActionBar.a7.R(this.R0, org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i10, x4Var), 7, -1), null, org.telegram.ui.ActionBar.a7.N(i10), x4Var);
        this.R0.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
        this.R0.setOnClickListener(new View.OnClickListener(this) {
            public final b4 f50915b;

            {
                this.f50915b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        b4 b4Var = this.f50915b;
                        if (b4Var.f50995t0) {
                            b4Var.A0(null, true);
                            return;
                        } else {
                            b4Var.O0(0);
                            return;
                        }
                    case 1:
                        this.f50915b.x0();
                        return;
                    default:
                        b4 b4Var2 = this.f50915b;
                        b4Var2.O0(2);
                        if (!(b4Var2.f50993s0 instanceof jg.g3)) {
                            b4Var2.U1 = true;
                            b4Var2.l0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.R0.setTextColor(-1);
        this.R0.setTextSize(1, 14.0f);
        this.R0.setGravity(1);
        this.R0.setTypeface(org.telegram.messenger.i0.o());
        this.R0.setAlpha(0.6f);
        this.R0.setSingleLine();
        this.F0.addView(this.R0, w7.b6.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.S0 = textView4;
        textView4.setText(dd.L0(2131747291, null).toUpperCase());
        org.telegram.ui.ActionBar.a7.R(this.S0, org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i10, x4Var), 7, -1), null, org.telegram.ui.ActionBar.a7.N(i10), x4Var);
        this.S0.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
        this.S0.setTextColor(-1);
        this.S0.setTextSize(1, 14.0f);
        this.S0.setGravity(1);
        this.S0.setTypeface(org.telegram.messenger.i0.o());
        this.S0.setAlpha(0.6f);
        this.S0.setSingleLine();
        this.S0.setOnClickListener(new View.OnClickListener(this) {
            public final b4 f50915b;

            {
                this.f50915b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        b4 b4Var = this.f50915b;
                        if (b4Var.f50995t0) {
                            b4Var.A0(null, true);
                            return;
                        } else {
                            b4Var.O0(0);
                            return;
                        }
                    case 1:
                        this.f50915b.x0();
                        return;
                    default:
                        b4 b4Var2 = this.f50915b;
                        b4Var2.O0(2);
                        if (!(b4Var2.f50993s0 instanceof jg.g3)) {
                            b4Var2.U1 = true;
                            b4Var2.l0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.F0.addView(this.S0, w7.b6.l(1.0f, 0, -2));
    }

    public static boolean u0(TLRPC.Document document) {
        if (document != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    if (!"video/webm".equals(document.mime_type) && !"video/mp4".equals(document.mime_type)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void A() {
        K0(new h3(this, 3), this, 53, 0, getHeight(), false);
    }

    public final boolean A0(jg.j jVar, boolean z10) {
        boolean z11;
        z8 z8Var;
        z8 z8Var2;
        nj0 nj0Var;
        int i10;
        boolean z12 = jVar instanceof jg.g3;
        int i11 = 2;
        int i12 = 0;
        if (z12 && (((i10 = this.I0) == -1 && this.H0 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.K0;
            if (valueAnimator != null && i10 != 2) {
                valueAnimator.cancel();
            }
            if (this.f50980k1) {
                F0(false);
            }
            O0(2);
        }
        boolean z13 = true;
        if (z12 && z10) {
            jg.g3 g3Var = (jg.g3) jVar;
            int gravity = g3Var.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i11 = 0;
                }
            } else {
                i11 = 1;
            }
            jg.t1 t1Var = this.U0;
            t1Var.setAlignment(i11);
            ig.h0 typeface = g3Var.getTypeface();
            if (typeface != null) {
                t1Var.setTypeface(typeface.f8320a);
            }
            t1Var.e(g3Var.getType(), true);
            this.D0.invalidate();
        }
        jg.j jVar2 = this.f50993s0;
        if (jVar2 != null) {
            if (jVar2 == jVar) {
                if (!jVar.f10038d0) {
                    if (jVar instanceof jg.z0) {
                        jg.z0 z0Var = (jg.z0) jVar;
                        z0Var.setType((z0Var.getType() + 1) % z0Var.getTypesCount());
                        return true;
                    } else if (jVar instanceof jg.h3) {
                        jg.h3 h3Var = (jg.h3) jVar;
                        h3Var.setType((h3Var.getType() + 1) % h3Var.getTypesCount());
                        return true;
                    } else if (jVar instanceof jg.v0) {
                        jg.v0 v0Var = (jg.v0) jVar;
                        jg.t0 t0Var = v0Var.f10301q0;
                        if (t0Var.e()) {
                            if (t0Var.getPreviewType() == 0) {
                                i12 = 1;
                            }
                            t0Var.setPreviewType(i12);
                            return true;
                        }
                        v0Var.setType(v0Var.getNextType());
                        return true;
                    } else if (!this.f50995t0) {
                        if (jVar instanceof jg.g3) {
                            this.f50999v0 = true;
                            o0();
                            return true;
                        } else if (jVar instanceof jg.h2) {
                            jg.h2 h2Var = (jg.h2) jVar;
                            if (this.L1 && this.J1 == jVar) {
                                h2Var.q(true);
                                return true;
                            }
                            jg.h2 h2Var2 = this.J1;
                            if (h2Var2 != null && h2Var2 != h2Var && (nj0Var = this.I1) != null) {
                                nj0Var.animate().alpha(0.0f).setListener(new sg.r(nj0Var, 17));
                                this.I1 = null;
                                this.L1 = false;
                                this.K1 = 0.0f;
                            }
                            if (this.I1 == null) {
                                nj0 nj0Var2 = new nj0(2, this.f50986o1, getContext(), LaunchActivity.Q(), new org.telegram.ui.web.a0(7, new th.b()));
                                this.I1 = nj0Var2;
                                w9 w9Var = new w9(this.N1, nj0Var2, 0, false);
                                this.I1.setPadding(0, org.telegram.messenger.i0.L(22.0f), 0, org.telegram.messenger.i0.L(22.0f));
                                this.f51000v1.addView(this.I1, w7.b6.d(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                                Paint paint = new Paint(1);
                                paint.setColor(i0.b.o(-16777216, 120));
                                nj0 nj0Var3 = this.I1;
                                ?? obj = new Object();
                                obj.e = this;
                                obj.f2779c = w9Var;
                                obj.d = paint;
                                obj.f2778b = new Path();
                                nj0Var3.setDelegate(obj);
                                this.I1.p(null, null, true);
                            }
                            this.I1.setFragment(LaunchActivity.Q());
                            this.J1 = h2Var;
                            L0(true);
                            return true;
                        } else {
                            J0(jVar2);
                            return true;
                        }
                    } else if (jVar2 instanceof jg.g3) {
                        org.telegram.messenger.i0.J3(((jg.g3) jVar2).getFocusedView());
                        s0(false);
                    }
                }
                return true;
            }
            jVar2.l(jVar2.m0, false);
            jg.j jVar3 = this.f50993s0;
            if (jVar3 instanceof jg.g3) {
                jg.g3 g3Var2 = (jg.g3) jVar3;
                jg.e3 e3Var = g3Var2.f9984q0;
                e3Var.clearFocus();
                e3Var.setEnabled(false);
                e3Var.setClickable(false);
                g3Var2.m();
                if (!z12) {
                    this.f50995t0 = false;
                    org.telegram.messenger.i0.v1(((jg.g3) this.f50993s0).getFocusedView());
                    s0(false);
                }
            } else if ((jVar3 instanceof jg.i2) && (z8Var2 = ((s7) this).f51948j2.Z0) != null) {
                z8Var2.l(false);
            }
            z11 = true;
        } else {
            z11 = false;
        }
        jg.j jVar4 = this.f50993s0;
        this.f50993s0 = jVar;
        if ((jVar4 instanceof jg.g3) && TextUtils.isEmpty(((jg.g3) jVar4).getText())) {
            z0(jVar4);
        }
        jg.j jVar5 = this.f50993s0;
        if (jVar4 != jVar5 && (jVar5 instanceof jg.i2) && (z8Var = ((s7) this).f51948j2.Z0) != null) {
            z8Var.l(true);
        }
        jg.j jVar6 = this.f50993s0;
        r2.y yVar = this.N0;
        ig.q1 q1Var = this.f50978j1;
        jg.d2 d2Var = this.M0;
        if (jVar6 != null) {
            m3 m3Var = this.f51007z0;
            jVar6.m0 = m3Var;
            jVar6.l(m3Var, true);
            jg.j jVar7 = this.f50993s0;
            if (jVar7 instanceof jg.g3) {
                jg.g3 g3Var3 = (jg.g3) jVar7;
                g3Var3.getSwatch().f8435c = q1Var.f8435c;
                g3Var3.f9993z0 = false;
                C0(g3Var3.getSwatch());
                d2Var.setValueOverride(new jg.c0(g3Var3, (int) (this.f50989q0.f29808a / 9.0f), 1));
                d2Var.setShowPreview(false);
            } else {
                d2Var.setValueOverride(yVar);
                d2Var.setShowPreview(true);
                q1Var.f8435c = yVar.get();
                B0(q1Var, null, false);
            }
        } else {
            ValueAnimator valueAnimator2 = this.K0;
            if (valueAnimator2 != null && this.I0 != 0) {
                valueAnimator2.cancel();
            }
            if (this.f50980k1) {
                F0(false);
            }
            O0(0);
            d2Var.setValueOverride(yVar);
            d2Var.setShowPreview(true);
            q1Var.f8435c = yVar.get();
            B0(q1Var, null, false);
            z13 = z11;
        }
        R0();
        return z13;
    }

    public final void B0(ig.q1 q1Var, Integer num, boolean z10) {
        ig.q1 q1Var2 = this.f50978j1;
        if (q1Var2 != q1Var) {
            q1Var2.f8433a = q1Var.f8433a;
            q1Var2.f8434b = q1Var.f8434b;
            q1Var2.f8435c = q1Var.f8435c;
            int i10 = this.f50986o1;
            ig.s0.e(i10).h(q1Var.f8433a, true);
            ig.s0.e(i10).j(q1Var.f8435c);
        }
        int i11 = q1Var.f8433a;
        v3 v3Var = this.f51003x0;
        v3Var.setColor(i11);
        v3Var.setBrushSize(q1Var.f8435c);
        int i12 = q1Var2.f8433a;
        if (num != null && num.intValue() != i12) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new jg.p(this, num, i12, 3));
            duration.start();
        } else {
            y3 y3Var = this.C0;
            if (y3Var != null) {
                y3Var.invalidate();
            }
        }
        jg.j jVar = this.f50993s0;
        if (jVar instanceof jg.g3) {
            ((jg.g3) jVar).setSwatch(new ig.q1(q1Var.f8434b, q1Var.f8435c, q1Var.f8433a));
        } else if (z10 && (jVar instanceof jg.z0)) {
            ((jg.z0) jVar).setColor(q1Var.f8433a);
            ((jg.z0) this.f50993s0).setType(3);
        } else if (z10 && (jVar instanceof jg.h3)) {
            ((jg.h3) jVar).setColor(q1Var.f8433a);
            ((jg.h3) this.f50993s0).setType(3);
        } else if (z10 && (jVar instanceof jg.v0)) {
            ((jg.v0) jVar).setColor(q1Var.f8433a);
            ((jg.v0) this.f50993s0).setType(0);
        }
    }

    public final void C0(ig.q1 q1Var) {
        B0(q1Var, null, false);
    }

    @Override
    public final void D() {
        M0(true);
    }

    public final void E0() {
        int i10;
        float f7;
        org.telegram.messenger.h6[] h6VarArr;
        jg.j jVar;
        jg.j jVar2;
        ArrayList arrayList = this.f51008z1;
        if (arrayList != null) {
            n5 n5Var = this.f51006y1;
            this.f51006y1 = null;
            this.f51008z1 = null;
            int size = arrayList.size();
            boolean z10 = false;
            int i11 = 0;
            while (true) {
                ?? r14 = this.A0;
                if (i11 < size) {
                    w20 w20Var = (w20) arrayList.get(i11);
                    byte b10 = w20Var.f18970a;
                    if (b10 == 0) {
                        t3 k02 = k0(w20Var.C, w20Var.B);
                        if ((2 & w20Var.f18971b) != 0) {
                            k02.r(z10);
                        }
                        ViewGroup.LayoutParams layoutParams = k02.getLayoutParams();
                        layoutParams.width = w20Var.f18983q;
                        layoutParams.height = w20Var.f18984r;
                        i10 = size;
                        jVar2 = k02;
                    } else if (b10 == 1) {
                        jg.g3 l02 = l0(z10);
                        l02.setType(w20Var.f18971b);
                        l02.setTypeface(w20Var.f18980n);
                        l02.setBaseFontSize(w20Var.f18979m);
                        SpannableString spannableString = new SpannableString(w20Var.f18976j);
                        ?? r42 = w20Var.f18977k;
                        int size2 = r42.size();
                        for (int i12 = z10; i12 < size2; i12++) {
                            v20 v20Var = (v20) r42.get(i12);
                            org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(v20Var.document_id, 1.0f, l02.getFontMetricsInt());
                            int i13 = v20Var.offset;
                            spannableString.setSpan(o5Var, i13, v20Var.length + i13, 33);
                            size = size;
                        }
                        i10 = size;
                        CharSequence m10 = org.telegram.messenger.k6.m(spannableString, l02.getFontMetricsInt(), false, null, 0);
                        if ((m10 instanceof Spanned) && (h6VarArr = (org.telegram.messenger.h6[]) ((Spanned) m10).getSpans(0, m10.length(), org.telegram.messenger.h6.class)) != null) {
                            for (org.telegram.messenger.h6 h6Var : h6VarArr) {
                                h6Var.f16025b = 0.85f;
                            }
                        }
                        l02.setText(m10);
                        D0(l02, w20Var.f18982p);
                        ig.q1 swatch = l02.getSwatch();
                        swatch.f8433a = w20Var.f18978l;
                        l02.setSwatch(swatch);
                        jVar2 = l02;
                    } else {
                        i10 = size;
                        if (b10 == 2) {
                            jg.e2 h02 = h0(w20Var.f18976j, false);
                            h02.G0 = w20Var.f18987u;
                            h02.B0 = false;
                            if ((2 & w20Var.f18971b) != 0) {
                                h02.r(false);
                            }
                            if ((w20Var.f18971b & 16) != 0) {
                                h02.t(false);
                            }
                            ViewGroup.LayoutParams layoutParams2 = h02.getLayoutParams();
                            layoutParams2.width = w20Var.f18983q;
                            layoutParams2.height = w20Var.f18984r;
                            jVar2 = h02;
                        } else {
                            if (b10 == 6) {
                                ArrayList arrayList2 = n5Var.v;
                                boolean z11 = n5Var.K;
                                this.U1 = true;
                                f7 = 1.0f;
                                jg.j s3Var = new s3(this, getContext(), c0(), arrayList2, this.N1, z11, this.O1);
                                s3Var.setDelegate(this);
                                r14.addView(s3Var);
                                d0();
                                jVar = s3Var;
                                if (w20Var.f18983q > 0) {
                                    jVar = s3Var;
                                    if (w20Var.f18984r > 0) {
                                        ViewGroup.LayoutParams layoutParams3 = s3Var.getLayoutParams();
                                        layoutParams3.width = w20Var.f18983q;
                                        layoutParams3.height = w20Var.f18984r;
                                        jVar = s3Var;
                                    }
                                }
                            } else {
                                f7 = 1.0f;
                                if (b10 == 3) {
                                    jg.z0 g02 = g0(w20Var.N, w20Var.M);
                                    int i14 = w20Var.f18978l;
                                    if (i14 != 0) {
                                        g02.setColor(i14);
                                    }
                                    g02.setType(w20Var.f18971b);
                                    jVar = g02;
                                } else if (b10 == 8) {
                                    k9 k9Var = w20Var.O;
                                    if (k9Var != null) {
                                        jg.h3 m0 = m0(k9Var);
                                        int i15 = w20Var.f18978l;
                                        if (i15 != 0) {
                                            m0.setColor(i15);
                                        }
                                        m0.setType(w20Var.f18971b);
                                        jVar = m0;
                                    } else {
                                        i11++;
                                        size = i10;
                                        z10 = false;
                                    }
                                } else if (b10 == 7) {
                                    jg.v0 f02 = f0(w20Var.W);
                                    jg.t0 t0Var = f02.f10301q0;
                                    int i16 = w20Var.f18978l;
                                    if (i16 != 0) {
                                        f02.setColor(i16);
                                    }
                                    boolean e = t0Var.e();
                                    int i17 = t0Var.h;
                                    int i18 = t0Var.f10241f;
                                    if (e) {
                                        t0Var.setPreviewType(w20Var.f18971b);
                                    }
                                    byte b11 = w20Var.f18971b;
                                    if (b11 == -1) {
                                        f02.setType(3);
                                        t0Var.d();
                                        w20Var.f18983q = ((int) Math.ceil(t0Var.f10234a0)) + i18 + i18;
                                        w20Var.f18984r = ((int) Math.ceil(t0Var.f10236b0)) + i17 + i17;
                                        PointF position = f02.getPosition();
                                        position.y = (this.B1 * 0.3f) + position.y;
                                        f02.setPosition(position);
                                        i11++;
                                        size = i10;
                                        z10 = false;
                                    } else {
                                        f02.setType(b11);
                                        jVar = f02;
                                    }
                                } else if (b10 == 4) {
                                    jg.h2 i02 = i0(false);
                                    i02.s(sg.o0.d(w20Var.M.reaction), false);
                                    if (w20Var.M.flipped) {
                                        i02.r(false);
                                    }
                                    jVar = i02;
                                    if (w20Var.M.dark) {
                                        i02.q(false);
                                        jVar = i02;
                                    }
                                } else {
                                    if (b10 == 5 && n5Var.f51559o0 != null) {
                                        jg.i2 j02 = j0(n5Var.f51561p0, false);
                                        o8 o8Var = ((s7) this).f51948j2;
                                        d8 d8Var = o8Var.X0;
                                        if (d8Var != null) {
                                            d8Var.f51446x = j02;
                                            v61 v61Var = d8Var.f51448y;
                                            if (v61Var != null) {
                                                v61Var.A0(j02.f10025u0);
                                            }
                                        }
                                        e8 e8Var = o8Var.f51628c1;
                                        if (e8Var != null) {
                                            e8Var.setHasRoundVideo(true);
                                        }
                                        jVar = j02;
                                        if ((w20Var.f18971b & 2) != 0) {
                                            boolean z12 = !j02.f10022r0;
                                            j02.f10022r0 = z12;
                                            j02.f10023s0.f(z12, true);
                                            j02.invalidate();
                                            jVar = j02;
                                        }
                                    }
                                    i11++;
                                    size = i10;
                                    z10 = false;
                                }
                            }
                            jVar.setX((w20Var.f18972c * this.A1) - (((f7 - w20Var.v) * w20Var.f18983q) / 2.0f));
                            jVar.setY((w20Var.d * this.B1) - (((f7 - w20Var.v) * w20Var.f18984r) / 2.0f));
                            jVar.setPosition(new PointF((w20Var.f18983q / 2.0f) + jVar.getX(), (w20Var.f18984r / 2.0f) + jVar.getY()));
                            jVar.setScale(w20Var.v);
                            jVar.setRotation((float) (((-w20Var.e) / 3.141592653589793d) * 180.0d));
                            i11++;
                            size = i10;
                            z10 = false;
                        }
                    }
                    f7 = 1.0f;
                    jVar = jVar2;
                    jVar.setX((w20Var.f18972c * this.A1) - (((f7 - w20Var.v) * w20Var.f18983q) / 2.0f));
                    jVar.setY((w20Var.d * this.B1) - (((f7 - w20Var.v) * w20Var.f18984r) / 2.0f));
                    jVar.setPosition(new PointF((w20Var.f18983q / 2.0f) + jVar.getX(), (w20Var.f18984r / 2.0f) + jVar.getY()));
                    jVar.setScale(w20Var.v);
                    jVar.setRotation((float) (((-w20Var.e) / 3.141592653589793d) * 180.0d));
                    i11++;
                    size = i10;
                    z10 = false;
                } else {
                    r14.setVisibility(z10 ? 1 : 0);
                    return;
                }
            }
        }
    }

    public final void F0(final boolean z10) {
        float f7;
        boolean z11;
        if (this.f50980k1 != z10) {
            this.f50980k1 = z10;
            o1.j jVar = this.l1;
            if (jVar != null) {
                jVar.d();
            }
            float f10 = 1000.0f;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1000.0f;
            }
            o1.j jVar2 = new o1.j(new o1.i(f7));
            this.l1 = jVar2;
            o1.k kVar = new o1.k();
            if (!z10) {
                f10 = 0.0f;
            }
            kVar.f13965i = f10;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.f13958m = kVar;
            if (!this.f51004x1.c() && this.f50965c2 <= 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            final boolean[] zArr = {z11};
            final float translationY = this.C0.getTranslationY();
            final float alpha = this.f50979k0.getAlpha();
            final ViewGroup barView = getBarView();
            this.l1.b(new o1.g() {
                @Override
                public final void a(o1.j jVar3, float f11, float f12) {
                    float f13;
                    int i10;
                    b4 b4Var = b4.this;
                    y3 y3Var = b4Var.C0;
                    float f14 = f11 / 1000.0f;
                    b4Var.f50982m1 = f14;
                    float f15 = 1.0f;
                    float f16 = ((1.0f - f14) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f16);
                    view.setScaleY(f16);
                    view.setTranslationY((Math.min(b4Var.f50982m1, 0.25f) * org.telegram.messenger.i0.L(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(b4Var.f50982m1, 0.25f) / 0.25f));
                    n3 n3Var = b4Var.f50970f1;
                    float f17 = b4Var.f50982m1;
                    boolean z12 = z10;
                    n3Var.B1(z12, f17);
                    jg.o1 o1Var = b4Var.f50979k0;
                    o1Var.setProgress(b4Var.f50982m1);
                    jg.k1 k1Var = b4Var.f50977j0;
                    k1Var.setProgress(b4Var.f50982m1);
                    b4Var.F0.setTranslationY(org.telegram.messenger.i0.L(32.0f) * b4Var.f50982m1);
                    AnimatorSet animatorSet = b4Var.f51002w1;
                    boolean[] zArr2 = zArr;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        zArr2[0] = false;
                    }
                    if (zArr2[0]) {
                        float f18 = b4Var.f50982m1;
                        if (!z12) {
                            f18 = 1.0f - f18;
                        }
                        if (z12) {
                            f13 = 1.0f;
                        } else {
                            f13 = 0.0f;
                        }
                        float f19 = alpha;
                        o1Var.setAlpha(org.telegram.messenger.i0.T1(f19, f13, f18));
                        if (!z12) {
                            f15 = 0.0f;
                        }
                        k1Var.setAlpha(org.telegram.messenger.i0.T1(f19, f15, f18));
                        float L = org.telegram.messenger.i0.L(39.0f) * f18;
                        if (z12) {
                            i10 = 1;
                        } else {
                            i10 = -1;
                        }
                        y3Var.setTranslationY(translationY - (L * i10));
                    }
                    y3Var.invalidate();
                    if (view == b4Var.U0) {
                        b4Var.D0.invalidate();
                    }
                }
            });
            this.l1.a(new c3(this, z10, 0));
            this.l1.h();
            if (z10) {
                n3 n3Var = this.f50970f1;
                n3Var.setVisibility(0);
                n3Var.setSelectedColorIndex(ig.s0.e(this.f50986o1).d());
            }
        }
    }

    public final void G0(int i10) {
        boolean z10;
        int i11;
        jg.t1 t1Var = this.U0;
        o3 o3Var = this.f51004x1;
        if (i10 == 1) {
            vy vyVar = this.Y1;
            if (vyVar != null && vyVar.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            vy vyVar2 = this.Y1;
            n8 n8Var = this.f51000v1;
            if (vyVar2 != null && vyVar2.f31943c1 != e20.f15506s0) {
                n8Var.removeView(vyVar2);
                this.Y1 = null;
            }
            if (this.Y1 == null) {
                vy vyVar3 = new vy(null, true, false, false, getContext(), false, null, null, true, this.f50988p1, false, false);
                this.Y1 = vyVar3;
                vyVar3.f32011x2 = false;
                vyVar3.U0 = true;
                vyVar3.setVisibility(8);
                if (org.telegram.messenger.i0.Q1()) {
                    this.Y1.setForseMultiwindowLayout(true);
                }
                this.Y1.setDelegate(new u3(this));
                n8Var.addView(this.Y1);
            }
            this.Y1.setVisibility(0);
            this.Z1 = true;
            vy vyVar4 = this.Y1;
            if (this.f50969e2 <= 0) {
                if (org.telegram.messenger.i0.Q1()) {
                    this.f50969e2 = org.telegram.messenger.i0.L(150.0f);
                } else {
                    this.f50969e2 = wp.c1().getInt("kbd_height", org.telegram.messenger.i0.L(200.0f));
                }
            }
            if (this.f50971f2 <= 0) {
                if (org.telegram.messenger.i0.Q1()) {
                    this.f50971f2 = org.telegram.messenger.i0.L(150.0f);
                } else {
                    this.f50971f2 = wp.c1().getInt("kbd_height_land3", org.telegram.messenger.i0.L(200.0f));
                }
            }
            Point point = org.telegram.messenger.i0.f16172q;
            if (point.x > point.y) {
                i11 = this.f50971f2;
            } else {
                i11 = this.f50969e2;
            }
            int paddingUnderContainer = n8Var.getPaddingUnderContainer() + i11;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vyVar4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            vyVar4.setLayoutParams(layoutParams);
            if (!org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
                jg.j jVar = this.f50993s0;
                if (jVar instanceof jg.g3) {
                    org.telegram.messenger.i0.v1(((jg.g3) jVar).getEditText());
                }
            }
            this.f50965c2 = paddingUnderContainer;
            o3Var.a();
            requestLayout();
            fg emojiButton = t1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(dg.d, true);
            }
            if (!z10) {
                if (this.a2) {
                    this.f50967d2 = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f50965c2, 0.0f);
                    ofFloat.addUpdateListener(new d3(this, 1));
                    ofFloat.addListener(new p3(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.m1.f20562w);
                    ofFloat.start();
                }
            }
        } else {
            fg emojiButton2 = t1Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(dg.e, true);
            }
            vy vyVar5 = this.Y1;
            if (vyVar5 != null) {
                this.Z1 = false;
                if (org.telegram.messenger.i0.D || org.telegram.messenger.i0.E) {
                    vyVar5.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.f50965c2 = 0;
                o3Var.a();
            }
            requestLayout();
        }
        P0();
    }

    public final void H0(jg.v0 v0Var) {
        t5 t5Var = new t5(getContext(), this.f50988p1, this.P1, new rh.q2(7, this, v0Var));
        if (v0Var != null) {
            jg.s0 s0Var = v0Var.f10305u0;
            t5Var.U1 = true;
            org.telegram.ui.Cells.m3 m3Var = t5Var.R1;
            org.telegram.ui.Cells.m3 m3Var2 = t5Var.Q1;
            if (s0Var != null) {
                t5Var.Y1 = s0Var.d;
                t5Var.Z1 = false;
                m3Var2.setText(s0Var.f10209c);
                m3Var.setText(s0Var.f10208b);
                t5Var.f51984e2 = !TextUtils.isEmpty(s0Var.f10208b);
                t5Var.f51985f2 = s0Var.f10210f;
                t5Var.f51986g2 = s0Var.e;
            } else {
                m3Var2.setText("");
                m3Var.setText("");
                t5Var.f51985f2 = true;
                t5Var.f51986g2 = false;
            }
            String L0 = dd.L0(2131744660, null);
            d dVar = t5Var.T1;
            dVar.i(L0, false, true);
            rh.t tVar = t5Var.P1;
            if (tVar != null) {
                tVar.O(false);
            }
            dVar.setEnabled(t5Var.f1(m3Var2.getText().toString()));
            t5Var.U1 = false;
        }
        t5Var.setOnDismissListener(new k3(this, 1));
        t5Var.show();
        w0(true);
    }

    public final void I0(jg.z0 z0Var, k20 k20Var) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        bi biVar = new bi(getContext(), new r3(this, k20Var), false, true, false, this.f50988p1);
        biVar.T3 = new hb.a(25);
        ah ahVar = biVar.f24809r3;
        if (z0Var != null && (messageMedia = z0Var.f10386u0) != null && (geoPoint = messageMedia.geo) != null) {
            biVar.f24822u4 = new double[]{geoPoint.lat, geoPoint._long};
            biVar.F1 = true;
            ahVar.setVisibility(8);
        } else if (this.D1) {
            biVar.f24814s4 = this.F1;
            biVar.f24818t4 = this.E1;
            biVar.F1 = true;
            ahVar.setVisibility(8);
        } else {
            biVar.F1 = true;
            ahVar.setVisibility(8);
        }
        biVar.setOnDismissListener(new k3(this, 0));
        biVar.d1();
        biVar.show();
    }

    public final void J0(jg.j jVar) {
        if (jVar instanceof jg.j1) {
            org.telegram.ui.ActionBar.k1 k1Var = this.f50990q1;
            if (k1Var != null && k1Var.isShowing()) {
                this.f50990q1.d(true);
                return;
            }
            return;
        }
        int[] iArr = this.X1;
        jVar.getLocationInWindow(iArr);
        float scaleX = jVar.getScaleX() * jVar.getWidth();
        x3 x3Var = this.A0;
        float scaleX2 = x3Var.getScaleX() * scaleX;
        float scaleY = jVar.getScaleY();
        float scaleY2 = x3Var.getScaleY() * scaleY * jVar.getHeight();
        int i10 = (int) ((scaleX2 / 2.0f) + iArr[0]);
        iArr[0] = i10;
        int i11 = (int) ((scaleY2 / 2.0f) + iArr[1]);
        iArr[1] = i11;
        K0(new g3(this, jVar, 1), this, 51, i10, i11 - org.telegram.messenger.i0.L(32.0f), true);
    }

    public final void K0(Runnable runnable, b4 b4Var, int i10, int i11, int i12, boolean z10) {
        org.telegram.ui.ActionBar.k1 k1Var = this.f50990q1;
        if (k1Var != null && k1Var.isShowing()) {
            this.f50990q1.d(true);
            return;
        }
        if (this.f50992r1 == null) {
            this.f50994s1 = new Rect();
            a4 a4Var = new a4(this, getContext());
            this.f50992r1 = a4Var;
            a4Var.setAnimationEnabled(true);
            this.f50992r1.setOnTouchListener(new jg.r(2, this));
            this.f50992r1.setDispatchKeyEventListener(new i3(this));
            this.f50992r1.setShownFromBottom(true);
        }
        a4 a4Var2 = this.f50992r1;
        a4Var2.W = z10;
        a4Var2.d();
        runnable.run();
        if (this.f50990q1 == null) {
            org.telegram.ui.ActionBar.k1 k1Var2 = new org.telegram.ui.ActionBar.k1(this.f50992r1, -2, -2);
            this.f50990q1 = k1Var2;
            k1Var2.f20456b = true;
            k1Var2.setAnimationStyle(2131755191);
            this.f50990q1.setOutsideTouchable(true);
            this.f50990q1.setClippingEnabled(true);
            this.f50990q1.setInputMethodMode(2);
            this.f50990q1.setSoftInputMode(0);
            this.f50990q1.getContentView().setFocusableInTouchMode(true);
            this.f50990q1.setOnDismissListener(new jg.t(2, this));
        }
        this.f50992r1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(10000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(10000.0f), Integer.MIN_VALUE));
        this.f50990q1.setFocusable(true);
        int measuredWidth = i11 - (this.f50992r1.getMeasuredWidth() / 2);
        int measuredHeight = i12 - this.f50992r1.getMeasuredHeight();
        this.f50990q1.showAtLocation(b4Var, i10, measuredWidth, measuredHeight);
        org.telegram.ui.ActionBar.k1.i(this.f50992r1);
        Drawable mutate = getContext().getResources().getDrawable(2131232563).mutate();
        if (z10) {
            a4 a4Var3 = this.f50992r1;
            a4Var3.setBackgroundDrawable(new v9(new w9(this.N1, a4Var3, 5, false), measuredWidth, measuredHeight, mutate, org.telegram.messenger.i0.N(8.3f)));
            return;
        }
        this.f50992r1.setBackgroundDrawable(mutate);
        this.f50992r1.setBackgroundColor(-14145495);
    }

    @Override
    public final void L(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        if (i10 > org.telegram.messenger.i0.L(50.0f) && this.a2 && !org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
            if (z10) {
                this.f50971f2 = i10;
                wp.c1().edit().putInt("kbd_height_land3", this.f50971f2).commit();
            } else {
                this.f50969e2 = i10;
                wp.c1().edit().putInt("kbd_height", this.f50969e2).commit();
            }
        }
        boolean z13 = this.Z1;
        o3 o3Var = this.f51004x1;
        if (z13) {
            if (z10) {
                i11 = this.f50971f2;
            } else {
                i11 = this.f50969e2;
            }
            int paddingUnderContainer = this.f51000v1.getPaddingUnderContainer() + i11;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Y1.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = org.telegram.messenger.i0.f16172q.x;
            if (i12 != i13 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i13;
                layoutParams.height = paddingUnderContainer;
                this.Y1.setLayoutParams(layoutParams);
                this.f50965c2 = layoutParams.height;
                o3Var.a();
                requestLayout();
            }
        }
        if (this.f50973g2 == i10 && this.f50975h2 == z10) {
            return;
        }
        this.f50973g2 = i10;
        this.f50975h2 = z10;
        boolean z14 = this.a2;
        jg.j jVar = this.f50993s0;
        if (jVar instanceof jg.g3) {
            if (((jg.g3) jVar).getEditText().isFocused() && o3Var.c()) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.a2 = z12;
        } else {
            this.a2 = false;
        }
        if (this.a2 && this.Z1) {
            G0(0);
        }
        if (this.f50965c2 != 0 && !(z11 = this.a2) && z11 != z14 && !this.Z1) {
            this.f50965c2 = 0;
            o3Var.a();
            requestLayout();
        }
        R0();
        if (z14 && !this.a2 && this.f50965c2 > 0 && this.f50967d2) {
            this.f50967d2 = false;
        }
        P0();
    }

    public final void L0(boolean z10) {
        if (this.L1 != z10) {
            if (z10 || this.I1 != null) {
                this.L1 = z10;
                if (z10) {
                    this.I1.n();
                    this.I1.setVisibility(0);
                    this.I1.setSelectedReaction(this.J1.getCurrentReaction());
                    this.I1.getParent().bringChildToFront(this.I1);
                } else {
                    this.J1 = null;
                }
                float f7 = 0.0f;
                if (z10) {
                    this.M1 = true;
                    this.f51000v1.invalidate();
                    float f10 = this.K1;
                    if (z10) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    this.I1.setTransitionProgress(this.K1);
                    ofFloat.addUpdateListener(new d3(this, 2));
                    ofFloat.addListener(new sg.y(12, this, z10));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(gr.f26524g);
                    ofFloat.start();
                    return;
                }
                if (this.I1.getReactionsWindow() != null) {
                    this.I1.getReactionsWindow().e();
                }
                this.I1.animate().alpha(0.0f).setDuration(150L).setListener(new p3(this, 0)).start();
            }
        }
    }

    public final void M0(boolean z10) {
        float f7;
        if (this.f50966d1 != z10) {
            this.f50966d1 = z10;
            o1.j jVar = this.f50968e1;
            if (jVar != null) {
                jVar.d();
            }
            float f10 = 1000.0f;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1000.0f;
            }
            o1.j jVar2 = new o1.j(new o1.i(f7));
            this.f50968e1 = jVar2;
            o1.k kVar = new o1.k();
            if (!z10) {
                f10 = 0.0f;
            }
            kVar.f13965i = f10;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.f13958m = kVar;
            if (z10) {
                jg.a2 a2Var = this.V0;
                a2Var.setAlpha(0.0f);
                a2Var.setVisibility(0);
            }
            this.f50968e1.b(new fg.c(3, this));
            this.f50968e1.a(new c3(this, z10, 1));
            this.f50968e1.h();
        }
    }

    public final PointF N0(jg.j jVar) {
        float f7;
        float f10;
        float f11 = 200.0f;
        ze zeVar = this.f50985o0;
        if (zeVar != null) {
            f11 = 200.0f / zeVar.f19694c;
        }
        float f12 = 0.2f;
        if (jVar != null) {
            PointF position = jVar.getPosition();
            float min = Math.min(jVar.getHeight(), jVar.getWidth()) * 0.2f;
            return new PointF(position.x + min, position.y + min);
        }
        float f13 = 100.0f;
        if (zeVar != null) {
            f13 = 100.0f / zeVar.f19694c;
        }
        PointF c02 = c0();
        int i10 = 0;
        while (i10 < 10) {
            int i11 = 0;
            boolean z10 = false;
            while (true) {
                x3 x3Var = this.A0;
                if (i11 >= x3Var.getChildCount()) {
                    break;
                }
                View childAt = x3Var.getChildAt(i11);
                if (!(childAt instanceof jg.j) || (childAt instanceof jg.j1)) {
                    f7 = f12;
                    f10 = f13;
                } else {
                    PointF position2 = ((jg.j) childAt).getPosition();
                    f7 = f12;
                    f10 = f13;
                    if (((float) Math.sqrt(Math.pow(position2.y - c02.y, 2.0d) + Math.pow(position2.x - c02.x, 2.0d))) < f10) {
                        f11 = Math.min(childAt.getHeight(), childAt.getWidth()) * f7;
                        z10 = true;
                    }
                }
                i11++;
                f13 = f10;
                f12 = f7;
            }
            float f14 = f12;
            float f15 = f13;
            if (!z10) {
                break;
            }
            i10++;
            c02 = new PointF(c02.x + f11, c02.y + f11);
            f12 = f14;
            f13 = f15;
        }
        return c02;
    }

    public final void O0(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z10;
        if (this.H0 != i10 && this.I0 != i10) {
            ValueAnimator valueAnimator = this.K0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i11 = this.H0;
            ViewGroup viewGroup3 = this.U0;
            ViewGroup viewGroup4 = this.T0;
            if (i11 == 0) {
                viewGroup = viewGroup4;
            } else if (i11 == 2) {
                viewGroup = viewGroup3;
            } else {
                viewGroup = null;
            }
            this.I0 = i10;
            if (i10 == 0) {
                viewGroup2 = viewGroup4;
            } else if (i10 == 2) {
                viewGroup2 = viewGroup3;
            } else {
                viewGroup2 = null;
            }
            int i12 = this.f50986o1;
            ig.s0 e = ig.s0.e(i12);
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (e.f8460l != z10) {
                e.f8460l = z10;
                if (z10) {
                    e.i(-1, false);
                } else {
                    e.i(e.f8452a.getInt("brush", 0), false);
                }
            }
            int c10 = ig.s0.e(i12).c();
            ig.q1 q1Var = this.f50978j1;
            q1Var.f8433a = c10;
            B0(q1Var, null, false);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.K0 = duration;
            duration.setInterpolator(gr.f26523f);
            this.K0.addUpdateListener(new ci.b(this, viewGroup, viewGroup2, 3));
            this.K0.addListener(new ci.k(this, viewGroup, viewGroup2, i10, 3));
            this.K0.start();
        }
    }

    public final void P0() {
        boolean z10;
        o3 o3Var = this.f51004x1;
        jg.t1 t1Var = this.U0;
        if (t1Var != null) {
            if (o3Var.c()) {
                t1Var.a(2131231513);
            } else if (this.Z1) {
                t1Var.a(2131231505);
            } else {
                t1Var.a(2131232041);
            }
        }
        if (!o3Var.c() && !this.Z1) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = !z10;
        org.telegram.messenger.i0.T3(1.0f, this.X0, z11, false);
        org.telegram.messenger.i0.T3(1.0f, this.W0, z11, false);
        org.telegram.messenger.i0.T3(1.0f, this.Z0, z10, false);
        org.telegram.messenger.i0.T3(1.0f, this.Y0, z10, false);
    }

    @Override
    public final int Q() {
        return this.f51004x1.f51832l - this.f51000v1.getBottomPadding2();
    }

    public final void Q0() {
        float f7;
        jg.j jVar;
        ObjectAnimator objectAnimator = this.R1;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.f51003x0.getParent();
        if (view == null) {
            return;
        }
        o3 o3Var = this.f51004x1;
        if (((o3Var.c() && !o3Var.d) || this.f50965c2 > 0) && (jVar = this.f50993s0) != null) {
            f7 = view.getScaleY() * (-(jVar.getPosition().y - (view.getMeasuredHeight() * 0.3f)));
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, f7);
        this.R1 = ofFloat;
        ofFloat.setDuration(350L);
        this.R1.setInterpolator(gr.h);
        this.R1.start();
    }

    public final void R0() {
        throw new UnsupportedOperationException("Method not decompiled: vh.b4.R0():void");
    }

    @Override
    public final void a() {
        F0(true);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21002h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21038j5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21186r5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21286wf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21338zf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Cf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Gf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Bf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ai));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ti));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.si));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ui));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.vi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21321yf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.xf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20873a7));
    }

    @Override
    public final void b(jg.j jVar) {
        L0(false);
        J0(jVar);
    }

    public final void b0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new r0(3, this, view)).start();
    }

    @Override
    public final void c() {
        setTextType((this.f50997u0 + 1) % 4);
    }

    public final PointF c0() {
        x3 x3Var = this.A0;
        int measuredWidth = x3Var.getMeasuredWidth();
        int measuredHeight = x3Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.A1;
        }
        if (measuredHeight <= 0) {
            measuredHeight = this.B1;
        }
        return new PointF(measuredWidth / 2.0f, measuredHeight / 2.0f);
    }

    @Override
    public final void d(int i10) {
        jg.j jVar = this.f50993s0;
        if (jVar instanceof jg.g3) {
            D0((jg.g3) jVar, i10);
            ig.s0 e = ig.s0.e(this.f50986o1);
            e.f8456g = i10;
            e.f8452a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public final void d0() {
        org.telegram.ui.Components.o5[] o5VarArr;
        boolean z10 = this.F1;
        x3 x3Var = this.A0;
        boolean z11 = true;
        if (!z10 && !this.H1) {
            int i10 = 0;
            loop0: while (true) {
                if (i10 < x3Var.getChildCount()) {
                    View childAt = x3Var.getChildAt(i10);
                    boolean z12 = childAt instanceof jg.g3;
                    int i11 = this.f50986o1;
                    if (z12) {
                        CharSequence text = ((jg.g3) childAt).getText();
                        if (text instanceof Spanned) {
                            for (org.telegram.ui.Components.o5 o5Var : (org.telegram.ui.Components.o5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.o5.class)) {
                                TLRPC.Document document = o5Var.document;
                                if (document == null) {
                                    document = org.telegram.ui.Components.f5.e(i11, o5Var.getDocumentId());
                                }
                                if (document != null) {
                                    org.telegram.ui.Components.f5.g(i11).e(document);
                                }
                                org.telegram.messenger.b8.G(i11);
                                if (n5.u(document, org.telegram.messenger.b8.K(document, null, true, true).getAbsolutePath())) {
                                    break loop0;
                                }
                            }
                            continue;
                        } else {
                            continue;
                        }
                        i10++;
                    } else if (childAt instanceof jg.w2) {
                        TLRPC.Document sticker = ((jg.w2) childAt).getSticker();
                        org.telegram.messenger.b8.G(i11);
                        if (n5.u(sticker, org.telegram.messenger.b8.K(sticker, null, true, true).getAbsolutePath())) {
                            break;
                        }
                        i10++;
                    } else if (childAt instanceof jg.i2) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    z11 = false;
                    break;
                }
            }
        }
        for (int i12 = 0; i12 < x3Var.getChildCount(); i12++) {
            View childAt2 = x3Var.getChildAt(i12);
            if (childAt2 instanceof jg.j) {
                ((jg.j) childAt2).setIsVideo(z11);
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.V1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ze zeVar;
        int i10 = 0;
        if ((view == this.f51003x0 || view == this.f51005y0 || view == this.A0 || view == this.f51007z0) && (zeVar = this.f50985o0) != null) {
            canvas.save();
            if (!this.f51001w0) {
                i10 = org.telegram.messenger.i0.f16166m;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i10;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i11 = zeVar.f19698k;
            if (i11 != 90 && i11 != 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredHeight * zeVar.e)) / zeVar.f19694c);
            int scaleY = (int) ((view.getScaleY() * (measuredWidth * zeVar.f19695f)) / zeVar.f19694c);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + 0.0f;
            float additionalBottom = (((getAdditionalBottom() + ((getMeasuredHeight() - currentActionBarHeight) - org.telegram.messenger.i0.L(48.0f))) - scaleY) / 2.0f) + org.telegram.messenger.i0.L(8.0f) + i10 + 0.0f;
            canvas.clipRect(Math.max(0.0f, ceil), Math.max(0.0f, additionalBottom), Math.min(ceil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
            i10 = 1;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (i10 != 0) {
            canvas.restore();
        }
        return drawChild;
    }

    public final TextView e0(int i10, String str) {
        TextView textView = new TextView(getContext());
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.E8, this.f50988p1);
        textView.setGravity(16);
        textView.setLines(1);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setPadding(org.telegram.messenger.i0.L(14.0f), 0, org.telegram.messenger.i0.L(14.0f), 0);
        textView.setTextSize(1, 14.0f);
        textView.setTag(Integer.valueOf(i10));
        textView.setText(str);
        return textView;
    }

    public final jg.v0 f0(jg.s0 s0Var) {
        int measuredWidth;
        int i10;
        this.U1 = true;
        getPaintingSize();
        PointF N0 = N0(null);
        x3 x3Var = this.A0;
        if (x3Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.A1;
        } else {
            measuredWidth = x3Var.getMeasuredWidth();
        }
        float f7 = measuredWidth;
        int L = ((int) f7) - org.telegram.messenger.i0.L(58.0f);
        jg.v0 v0Var = new jg.v0(getContext(), N0, this.f50986o1, s0Var, f7 / 360.0f, L);
        if (N0.x == x3Var.getMeasuredWidth() / 2.0f) {
            v0Var.setStickyX(2);
        }
        if (N0.y == x3Var.getMeasuredHeight() / 2.0f) {
            v0Var.setStickyY(2);
        }
        ig.q1 q1Var = this.f50978j1;
        if (q1Var != null && (i10 = q1Var.f8433a) != -47814) {
            v0Var.setColor(i10);
        }
        v0Var.setDelegate(this);
        v0Var.setMaxWidth(L);
        x3Var.addView(v0Var, w7.b6.c(-2.0f, -2));
        d0();
        ze zeVar = this.f50985o0;
        if (zeVar != null) {
            v0Var.j(1.0f / zeVar.f19694c);
            v0Var.f(-(zeVar.f19698k + zeVar.d));
        }
        return v0Var;
    }

    public final jg.z0 g0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int measuredWidth;
        int i10;
        this.U1 = true;
        getPaintingSize();
        PointF N0 = N0(null);
        x3 x3Var = this.A0;
        if (x3Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.A1;
        } else {
            measuredWidth = x3Var.getMeasuredWidth();
        }
        float f7 = measuredWidth;
        int L = ((int) f7) - org.telegram.messenger.i0.L(58.0f);
        jg.z0 z0Var = new jg.z0(getContext(), N0, this.f50986o1, messageMedia, mediaArea, f7 / 240.0f, L);
        if (N0.x == x3Var.getMeasuredWidth() / 2.0f) {
            z0Var.setStickyX(2);
        }
        if (N0.y == x3Var.getMeasuredHeight() / 2.0f) {
            z0Var.setStickyY(2);
        }
        ig.q1 q1Var = this.f50978j1;
        if (q1Var != null && (i10 = q1Var.f8433a) != -47814) {
            z0Var.setColor(i10);
        }
        z0Var.setDelegate(this);
        z0Var.setMaxWidth(L);
        x3Var.addView(z0Var, w7.b6.c(-2.0f, -2));
        d0();
        ze zeVar = this.f50985o0;
        if (zeVar != null) {
            z0Var.j(1.0f / zeVar.f19694c);
            z0Var.f(-(zeVar.f19698k + zeVar.d));
        }
        return z0Var;
    }

    public int getAdditionalBottom() {
        return org.telegram.messenger.i0.L(24.0f);
    }

    public int getAdditionalTop() {
        return org.telegram.messenger.i0.L(48.0f);
    }

    public Bitmap getBlurBitmap() {
        return this.f51003x0.c(true, false);
    }

    public View getBottomLayout() {
        return this.C0;
    }

    public View getCancelView() {
        return this.f50977j0;
    }

    public float getCropRotation() {
        ze zeVar = this.f50985o0;
        if (zeVar != null) {
            return zeVar.d + zeVar.f19698k;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.f50979k0;
    }

    public View getEntitiesView() {
        return this.A0;
    }

    public long getLcm() {
        return this.P0.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        org.telegram.ui.Components.o5[] o5VarArr;
        x3 x3Var = this.A0;
        int childCount = x3Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = x3Var.getChildAt(i10);
            if (childAt instanceof jg.w2) {
                TLRPC.Document sticker = ((jg.w2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f19806id = sticker.f19800id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof jg.g3) {
                CharSequence text = ((jg.g3) childAt).getText();
                if ((text instanceof Spanned) && (o5VarArr = (org.telegram.ui.Components.o5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.o5.class)) != null) {
                    for (org.telegram.ui.Components.o5 o5Var : o5VarArr) {
                        if (o5Var != null) {
                            TLRPC.Document document = o5Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.f5.e(this.f50986o1, o5Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.f19806id = document.f19800id;
                                tL_inputDocument2.access_hash = document.access_hash;
                                byte[] bArr2 = document.file_reference;
                                tL_inputDocument2.file_reference = bArr2;
                                if (bArr2 == null) {
                                    tL_inputDocument2.file_reference = new byte[0];
                                }
                                arrayList.add(tL_inputDocument2);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public float getOffsetTranslationY() {
        return 0.0f;
    }

    public List<View> getPreviewViews() {
        return Arrays.asList(this.f51003x0, this.f51005y0, this.A0, this.f51007z0);
    }

    public View getRenderInputView() {
        return this.f51005y0;
    }

    public ig.c1 getRenderView() {
        return this.f51003x0;
    }

    public jg.j getSelectedEntity() {
        return this.f50993s0;
    }

    public View getSelectionEntitiesView() {
        return this.f51007z0;
    }

    public View getTextDimView() {
        return this.G0;
    }

    public View getTopLayout() {
        return this.B0;
    }

    public View getWeightChooserView() {
        return this.M0;
    }

    public final jg.e2 h0(String str, boolean z10) {
        float f7;
        qu0 qu0Var;
        this.U1 = true;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f7 = options.outWidth / options.outHeight;
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            f7 = 1.0f;
        }
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        x3 x3Var = this.A0;
        if (i10 > 0) {
            float floor = (float) Math.floor(Math.max(this.A1, x3Var.getMeasuredWidth()) * 0.5d);
            qu0Var = new qu0(floor, floor / f7);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.B1, x3Var.getMeasuredHeight()) * 0.5d);
            qu0Var = new qu0(f7 * floor2, floor2);
        }
        qu0 qu0Var2 = qu0Var;
        Pair N0 = org.telegram.messenger.i0.N0(str);
        if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
            float f10 = qu0Var2.f29808a;
            qu0Var2.f29808a = qu0Var2.f29809b;
            qu0Var2.f29809b = f10;
        }
        Context context = getContext();
        PointF c02 = c0();
        int intValue = ((Integer) N0.first).intValue();
        ((Integer) N0.second).getClass();
        jg.e2 e2Var = new jg.e2(context, c02, qu0Var2, str, intValue);
        e2Var.setDelegate(this);
        x3Var.addView(e2Var);
        d0();
        return e2Var;
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        if (this.V1) {
            return false;
        }
        if (this.f50993s0 != null) {
            A0(null, true);
        }
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(x10, y3);
        this.f51003x0.e(obtain);
        obtain.recycle();
        return true;
    }

    public final jg.h2 i0(boolean z10) {
        String str;
        qu0 qu0Var = new qu0(org.telegram.messenger.i0.L(106.0f), org.telegram.messenger.i0.L(106.0f));
        PointF c02 = c0();
        x3 x3Var = this.A0;
        if (x3Var.getMeasuredHeight() > 0) {
            loop0: while (true) {
                for (int i10 = 0; i10 < x3Var.getChildCount(); i10++) {
                    View childAt = x3Var.getChildAt(i10);
                    if (w7.z8.a(c02.x, c02.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < org.telegram.messenger.i0.L(6.0f)) {
                        break;
                    }
                }
                c02.x = (x3Var.getMeasuredWidth() * 0.05f) + c02.x;
                c02.y = (x3Var.getMeasuredHeight() * 0.05f) + c02.y;
                c02.x = Utilities.i(c02.x, x3Var.getMeasuredWidth(), 0.0f);
                c02.y = Utilities.i(c02.y, x3Var.getMeasuredHeight(), 0.0f);
            }
        }
        ?? jVar = new jg.j(getContext(), c02);
        jVar.f9998r0 = new th.u6(jVar);
        jVar.f9999s0 = new th.u6(jVar);
        jVar.f10000t0 = new sg.f0(jVar);
        jVar.f10001u0 = new sg.f0(jVar);
        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5((View) jVar);
        jVar.f10003w0 = t5Var;
        org.telegram.ui.Components.t5 t5Var2 = new org.telegram.ui.Components.t5((View) jVar);
        jVar.f10004x0 = t5Var2;
        jVar.f10006z0 = 1.0f;
        jVar.f9997q0 = qu0Var;
        t5Var2.e(true, 1.0f);
        t5Var.e(true, 1.0f);
        ArrayList arrayList = vi.b0(e20.f15506s0).h;
        sg.f0 f0Var = jVar.f10000t0;
        int i11 = 0;
        while (true) {
            if (i11 < arrayList.size()) {
                if (((TLRPC.TL_availableReaction) arrayList.get(i11)).title.equals("Red Heart")) {
                    str = ((TLRPC.TL_availableReaction) arrayList.get(i11)).reaction;
                    break;
                }
                i11++;
            } else {
                str = ((TLRPC.TL_availableReaction) arrayList.get(0)).reaction;
                break;
            }
        }
        sg.o0 b10 = sg.o0.b(str);
        jVar.f10002v0 = b10;
        f0Var.e(b10);
        jVar.k();
        jVar.setDelegate(this);
        x3Var.addView(jVar);
        d0();
        if (z10) {
            y0(jVar);
            A0(jVar, true);
        }
        return jVar;
    }

    public final jg.i2 j0(String str, boolean z10) {
        float f7;
        this.U1 = true;
        this.W1 = true;
        n0();
        x3 x3Var = this.A0;
        int measuredWidth = x3Var.getMeasuredWidth();
        x3Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.A1;
        }
        float floor = (float) Math.floor(0.43f * f7);
        qu0 qu0Var = new qu0(floor, floor);
        jg.i2 i2Var = new jg.i2(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - org.telegram.messenger.i0.L(16.0f), (qu0Var.f29809b / 2.0f) + org.telegram.messenger.i0.L(72.0f)), qu0Var, str);
        i2Var.setDelegate(this);
        x3Var.addView(i2Var);
        d0();
        if (z10) {
            y0(i2Var);
            post(new z2(this, i2Var, 0));
        }
        this.W1 = false;
        return i2Var;
    }

    public final t3 k0(Object obj, TLRPC.Document document) {
        float f7;
        for (int i10 = 0; i10 < document.attributes.size() && !(document.attributes.get(i10) instanceof TLRPC.TL_documentAttributeSticker); i10++) {
        }
        float f10 = 0.75f;
        ze zeVar = this.f50985o0;
        if (zeVar != null) {
            f7 = -(zeVar.f19698k + zeVar.d);
            f10 = 0.75f / zeVar.f19694c;
        } else {
            f7 = 0.0f;
        }
        jg.q0 q0Var = new jg.q0(c0(), f10, f7);
        Context context = getContext();
        float floor = (float) Math.floor(getPaintingSize().f29808a * 0.5d);
        t3 t3Var = new t3(this, context, q0Var.f10152a, q0Var.f10154c, q0Var.f10153b, new qu0(floor, floor), document, obj);
        boolean C4 = kj.C4(document);
        ImageReceiver imageReceiver = t3Var.f10351x0;
        if (C4) {
            imageReceiver.f14398o1 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }
        imageReceiver.E0(12);
        t3Var.setDelegate(this);
        this.A0.addView(t3Var);
        d0();
        return t3Var;
    }

    public final jg.g3 l0(boolean z10) {
        qu0 paintingSize = getPaintingSize();
        PointF N0 = N0(null);
        jg.g3 g3Var = new jg.g3(getContext(), N0, (int) (paintingSize.f29808a / 9.0f), "", this.f50978j1, this.f50997u0);
        float f7 = paintingSize.f29808a / 9.0f;
        h3 h3Var = new h3(this, 0);
        g3Var.f9990w0 = (int) (0.5f * f7);
        g3Var.f9991x0 = (int) (f7 * 2.0f);
        g3Var.f9992y0 = h3Var;
        float f10 = N0.x;
        x3 x3Var = this.A0;
        if (f10 == x3Var.getMeasuredWidth() / 2.0f) {
            g3Var.setStickyX(2);
        }
        if (N0.y == x3Var.getMeasuredHeight() / 2.0f) {
            g3Var.setStickyY(2);
        }
        g3Var.setDelegate(this);
        g3Var.setMaxWidth(this.A1 - org.telegram.messenger.i0.L(32.0f));
        int i10 = this.f50986o1;
        g3Var.setTypeface(ig.s0.e(i10).f8458j);
        g3Var.setType(ig.s0.e(i10).h);
        x3Var.addView(g3Var, w7.b6.c(-2.0f, -2));
        d0();
        ze zeVar = this.f50985o0;
        if (zeVar != null) {
            g3Var.j(1.0f / zeVar.f19694c);
            g3Var.f(-(zeVar.f19698k + zeVar.d));
        }
        if (z10) {
            y0(g3Var);
            g3Var.q();
            A0(g3Var, false);
            g3Var.getFocusedView().requestFocus();
            org.telegram.messenger.i0.J3(g3Var.getFocusedView());
            this.f50995t0 = true;
            int i11 = ig.s0.e(i10).f8456g;
            jg.t1 t1Var = this.U0;
            t1Var.d(i11, true);
            t1Var.setOutlineType(ig.s0.e(i10).h);
        }
        return g3Var;
    }

    public final jg.h3 m0(k9 k9Var) {
        int measuredWidth;
        int i10;
        this.U1 = true;
        getPaintingSize();
        PointF N0 = N0(null);
        x3 x3Var = this.A0;
        if (x3Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.A1;
        } else {
            measuredWidth = x3Var.getMeasuredWidth();
        }
        float f7 = measuredWidth;
        int L = ((int) f7) - org.telegram.messenger.i0.L(58.0f);
        jg.h3 h3Var = new jg.h3(getContext(), N0, this.f50986o1, k9Var, f7 / 240.0f, L);
        if (N0.x == x3Var.getMeasuredWidth() / 2.0f) {
            h3Var.setStickyX(2);
        }
        if (N0.y == x3Var.getMeasuredHeight() / 2.0f) {
            h3Var.setStickyY(2);
        }
        ig.q1 q1Var = this.f50978j1;
        if (q1Var != null && (i10 = q1Var.f8433a) != -47814) {
            h3Var.setColor(i10);
        }
        h3Var.setDelegate(this);
        h3Var.setMaxWidth(L);
        x3Var.addView(h3Var, w7.b6.c(-2.0f, -2));
        d0();
        ze zeVar = this.f50985o0;
        if (zeVar != null) {
            h3Var.j(1.0f / zeVar.f19694c);
            h3Var.f(-(zeVar.f19698k + zeVar.d));
        }
        return h3Var;
    }

    public final void n0() {
        int i10 = 0;
        while (true) {
            x3 x3Var = this.A0;
            if (i10 < x3Var.getChildCount()) {
                View childAt = x3Var.getChildAt(i10);
                if (childAt instanceof jg.i2) {
                    if (this.f50993s0 == childAt) {
                        A0(null, true);
                    }
                    childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(gr.h).withEndAction(new z2(this, (jg.i2) childAt, 1)).start();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean o() {
        return !(this.f50993s0 instanceof jg.j1);
    }

    public abstract void o0();

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        nj0 nj0Var = this.I1;
        if (nj0Var != null) {
            org.telegram.messenger.i0.E2(nj0Var);
            this.I1 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float currentActionBarHeight;
        float f7;
        float f10;
        this.f50987p0 = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((org.telegram.messenger.i0.f16172q.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - org.telegram.messenger.i0.L(48.0f);
        Bitmap bitmap = this.f50981l0;
        if (bitmap != null) {
            f7 = bitmap.getWidth();
            currentActionBarHeight = bitmap.getHeight();
        } else {
            currentActionBarHeight = (size2 - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.i0.L(48.0f);
            f7 = size;
        }
        if (((float) Math.floor((size * currentActionBarHeight) / f7)) > currentActionBarHeight2) {
            Math.floor((f10 * f7) / currentActionBarHeight);
        }
        float f11 = this.f50989q0.f29808a;
        jg.j jVar = this.f50993s0;
        if (jVar != null) {
            jVar.m();
        }
        measureChild(this.C0, i10, i11);
        measureChild(this.M0, i10, i11);
        measureChild(this.E0, i10, i11);
        measureChild(this.D0, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.f50965c2 - this.f51000v1.getPaddingUnderContainer(), Q()), 1073741824));
        FrameLayout frameLayout = this.B0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), org.telegram.messenger.i0.L(12.0f), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.f50987p0 = false;
        if (org.telegram.messenger.i0.L(20.0f) >= 0 && !this.Z1 && !this.f50963b2) {
            this.f50987p0 = true;
            t0();
            this.f50987p0 = false;
        }
        if (org.telegram.messenger.i0.L(20.0f) >= 0) {
            return;
        }
        t0();
    }

    @Override
    public final boolean p() {
        return !this.f50995t0;
    }

    public final jg.j1 p0() {
        int i10 = 0;
        while (true) {
            x3 x3Var = this.A0;
            if (i10 < x3Var.getChildCount()) {
                View childAt = x3Var.getChildAt(i10);
                if (childAt instanceof jg.j1) {
                    return (jg.j1) childAt;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final android.graphics.Bitmap q0(java.util.ArrayList r39, boolean r40, boolean r41, boolean r42, boolean r43, vh.n5 r44) {
        throw new UnsupportedOperationException("Method not decompiled: vh.b4.q0(java.util.ArrayList, boolean, boolean, boolean, boolean, vh.n5):android.graphics.Bitmap");
    }

    @Override
    public final int[] r(jg.j jVar) {
        int[] iArr = this.X1;
        iArr[0] = (int) jVar.getPosition().x;
        iArr[1] = (int) jVar.getPosition().y;
        return iArr;
    }

    public final boolean r0() {
        if (!this.m0.a() && !this.U1) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.f50987p0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(boolean z10) {
        if (this.Z1) {
            G0(0);
        }
        if (z10) {
            vy vyVar = this.Y1;
            if (vyVar != null && vyVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.Y1.getMeasuredHeight());
                ofFloat.addUpdateListener(new d3(this, 0));
                this.f50963b2 = true;
                ofFloat.addListener(new p3(this, 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.m1.f20562w);
                ofFloat.start();
                return;
            }
            t0();
        }
    }

    public void setBlurManager(s9 s9Var) {
        this.N1 = s9Var;
    }

    public void setCoverPreview(boolean z10) {
        if (this.V1 != z10) {
            this.V1 = z10;
            if (z10) {
                A0(null, true);
            }
            setCoverPause(z10);
        }
    }

    public void setCoverTime(long j10) {
        int i10 = 0;
        while (true) {
            x3 x3Var = this.A0;
            if (i10 < x3Var.getChildCount()) {
                View childAt = x3Var.getChildAt(i10);
                if (childAt instanceof jg.w2) {
                    ImageReceiver imageReceiver = ((jg.w2) childAt).f10351x0;
                    ci0 B = imageReceiver.B();
                    imageReceiver.m();
                    if (B != null) {
                        B.N(Math.round(((((float) j10) % ((float) B.r())) / ((float) B.r())) * B.e[0]), true, false);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void setHasAudio(boolean z10) {
        if (z10 != this.H1) {
            this.H1 = z10;
            d0();
        }
    }

    public void setOnCancelButtonClickedListener(Runnable runnable) {
        this.f50998u1 = runnable;
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.f50996t1 = runnable;
    }

    @Override
    public final void t() {
        if (!this.a2 && !this.Z1) {
            this.U1 = true;
            l0(true);
            return;
        }
        if (this.Z1) {
            jg.j jVar = this.f50993s0;
            if (jVar instanceof jg.g3) {
                this.f51004x1.e = true;
                org.telegram.messenger.i0.J3(((jg.g3) jVar).getEditText());
            }
        }
        G0(!this.Z1 ? 1 : 0);
    }

    public final void t0() {
        vy vyVar;
        if (!this.Z1 && (vyVar = this.Y1) != null && vyVar.getVisibility() != 8) {
            this.Y1.setVisibility(8);
        }
        int i10 = this.f50965c2;
        this.f50965c2 = 0;
        if (i10 != 0) {
            this.f51004x1.a();
        }
    }

    @Override
    public final void u(float f7, float f10, float[] fArr) {
        View view;
        View view2 = (View) this.f51003x0.getParent();
        if (view2 == null || (view = (View) view2.getParent()) == null) {
            return;
        }
        float x10 = (f7 - view2.getX()) - view.getLeft();
        float y3 = (f10 - view2.getY()) - view.getTop();
        float pivotX = ((x10 - view2.getPivotX()) / view2.getScaleX()) + view2.getPivotX();
        float pivotY = view2.getPivotY();
        fArr[0] = pivotX;
        fArr[1] = ((y3 - view2.getPivotY()) / view2.getScaleY()) + pivotY;
    }

    @Override
    public final void updateColors() {
        this.f50984n1.setColor(-15132391);
    }

    @Override
    public final ig.s0 v() {
        return ig.s0.e(this.f50986o1);
    }

    public final boolean v0() {
        if (this.L1) {
            if (this.I1.getReactionsWindow() != null && !this.I1.getReactionsWindow().f48299q) {
                this.I1.e();
                return true;
            }
            L0(false);
            return true;
        } else if (this.f50980k1) {
            F0(false);
            return true;
        } else if (this.Z1) {
            s0(true);
            return true;
        } else if (!this.f50995t0) {
            return false;
        } else {
            if (this.f50999v0) {
                this.f50999v0 = false;
                this.f51004x1.b(true);
                return false;
            }
            A0(null, true);
            return true;
        }
    }

    public abstract void w0(boolean z10);

    public final void x0() {
        final int i10 = this.H0;
        O0(1);
        postDelayed(new r5.a(this, 15), 350L);
        q3 q3Var = new q3(this, getContext(), this.f50988p1, i10);
        this.T1 = q3Var;
        n8 n8Var = this.f51000v1;
        Objects.requireNonNull(n8Var);
        q3Var.f52011t1 = new qh.d(n8Var, 20);
        final boolean[] zArr = {true};
        q3Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                b4 b4Var = b4.this;
                b4Var.T1 = null;
                if (zArr[0]) {
                    b4Var.w0(false);
                }
                b4Var.O0(i10);
            }
        });
        q3Var.f52013v1 = new i3(this);
        q3Var.N0(new org.telegram.ui.Components.i(this, zArr, q3Var, 3));
        q3Var.show();
        w0(true);
    }

    @Override
    public final boolean y(jg.j jVar) {
        return A0(jVar, true);
    }

    public final void y0(jg.j jVar) {
        this.m0.b(jVar.getUUID(), new g3(this, jVar, 0));
    }

    @Override
    public final void z(ig.h hVar) {
        boolean z10 = hVar instanceof ig.b;
        jg.d2 d2Var = this.M0;
        if (!z10 && !(hVar instanceof ig.d)) {
            d2Var.b(0.05f, 1.0f);
        } else {
            d2Var.b(0.4f, 1.75f);
        }
        d2Var.setDrawCenter(!(hVar instanceof ig.g));
        v3 v3Var = this.f51003x0;
        if (v3Var.getCurrentBrush() instanceof ig.g) {
            this.L0 = true;
        }
        v3Var.setBrush(hVar);
        ig.q1 q1Var = this.f50978j1;
        int i10 = q1Var.f8433a;
        q1Var.f8433a = ig.s0.e(this.f50986o1).c();
        q1Var.f8435c = this.N0.get();
        B0(q1Var, Integer.valueOf(i10), false);
        this.f51005y0.invalidate();
    }

    public final void z0(jg.j jVar) {
        jg.j jVar2 = this.f50993s0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.m0, false);
            A0(null, true);
            if (jVar instanceof jg.g3) {
                ValueAnimator valueAnimator = this.K0;
                if (valueAnimator != null && this.I0 != 0) {
                    valueAnimator.cancel();
                }
                O0(0);
            }
        }
        this.A0.removeView(jVar);
        d0();
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            ig.t1 t1Var = this.m0;
            t1Var.f8471b.remove(uuid);
            t1Var.f8472c.remove(uuid);
            org.telegram.messenger.i0.g3(new gg.c(t1Var, 9));
        }
        jg.d2 d2Var = this.M0;
        r2.y yVar = this.N0;
        d2Var.setValueOverride(yVar);
        d2Var.setShowPreview(true);
        float f7 = yVar.get();
        ig.q1 q1Var = this.f50978j1;
        q1Var.f8435c = f7;
        B0(q1Var, null, false);
        if (!this.W1 && (jVar instanceof jg.i2)) {
            o8 o8Var = ((s7) this).f51948j2;
            d8 d8Var = o8Var.X0;
            if (d8Var != null) {
                d8Var.s(null, null, true);
            }
            s7 s7Var = o8Var.f51687v1;
            if (s7Var != null) {
                s7Var.n0();
            }
            e8 e8Var = o8Var.f51628c1;
            if (e8Var != null) {
                e8Var.setHasRoundVideo(false);
            }
            n5 n5Var = o8Var.K1;
            if (n5Var != null) {
                File file = n5Var.f51559o0;
                if (file != null) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                    o8Var.K1.f51559o0 = null;
                }
                if (o8Var.K1.f51561p0 != null) {
                    try {
                        new File(o8Var.K1.f51561p0).delete();
                    } catch (Exception unused2) {
                    }
                    o8Var.K1.f51561p0 = null;
                }
            }
        }
    }

    public void setOffsetTranslationX(float f7) {
    }

    public View getView() {
        return this;
    }
}
