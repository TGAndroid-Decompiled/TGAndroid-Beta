package ug;

import ai.j6;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
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
import android.view.ViewParent;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import ei.j3;
import gi.b4;
import gi.h4;
import gi.k4;
import gi.m4;
import gi.p3;
import gi.w4;
import gi.y4;
import gi.z4;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.f6;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.i6;
import org.telegram.messenger.k5;
import org.telegram.messenger.q5;
import org.telegram.messenger.re;
import org.telegram.messenger.y10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.ct;
import org.telegram.ui.Components.cz0;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.hg;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.pt0;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y00;
import org.telegram.ui.lp0;
import org.telegram.ui.xm0;
import org.telegram.ui.yg0;
public abstract class f0 extends rt0 implements f1, h, b1, pt0, cs {
    public float A0;
    public final u A1;
    public lt0 B0;
    public org.telegram.ui.ActionBar.f1 B1;
    public j C0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout C1;
    public boolean D0;
    public Rect D1;
    public int E0;
    public Runnable E1;
    public final boolean F0;
    public final tg.k0 F1;
    public final a0 G0;
    public boolean G1;
    public final org.telegram.ui.Components.voip.r0 H0;
    public float H1;
    public final yg0 I0;
    public boolean I1;
    public final b0 J0;
    public final u5 J1;
    public cz0 K0;
    public final Paint K1;
    public final FrameLayout L0;
    public final Paint L1;
    public final d0 M0;
    public gh.g M1;
    public final kw0 N0;
    public final float[] N1;
    public final FrameLayout O0;
    public final int[] O1;
    public y4 P0;
    public ey P1;
    public int Q0;
    public boolean Q1;
    public int R0;
    public boolean R1;
    public float S0;
    public boolean S1;
    public ValueAnimator T0;
    public int T1;
    public boolean U0;
    public int U1;
    public final l1 V0;
    public int V1;
    public final y00 W0;
    public int W1;
    public ArrayList X0;
    public boolean X1;
    public final int Y0;
    public BigInteger Z0;
    public TextView f55964a1;
    public TextView f55965b1;
    public TextView f55966c1;
    public final g1 f55967d1;
    public final d1 f55968e1;
    public final i1 f55969f1;
    public final ImageView f55970g1;
    public final LinearLayout f55971h1;
    public final TextView f55972i1;
    public final TextView f55973j1;
    public final u0 f55974k0;
    public final TextView k1;
    public final y0 f55975l0;
    public final Paint f55976l1;
    public float m0;
    public final Paint m1;
    public final Bitmap f55977n0;
    public float f55978n1;
    public final Bitmap f55979o0;
    public boolean f55980o1;
    public final tg.k1 f55981p0;
    public q1.g f55982p1;
    public final q5 f55983q0;
    public final c0 f55984q1;
    public final re f55985r0;
    public final Paint f55986r1;
    public float f55987s0;
    public final Paint f55988s1;
    public float f55989t0;
    public final Paint f55990t1;
    public float f55991u0;
    public final tg.h1 f55992u1;
    public float f55993v0;
    public boolean f55994v1;
    public float f55995w0;
    public q1.g f55996w1;
    public float f55997x0;
    public float f55998x1;
    public float f55999y0;
    public final Paint f56000y1;
    public boolean f56001z0;
    public final int f56002z1;

    public f0(Context context, Activity activity, int i3, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, re reVar, xm0 xm0Var, final e6 e6Var) {
        super(context, activity);
        boolean z10;
        float f10;
        int i11;
        f6[] f6VarArr;
        n1 n1Var;
        boolean z11 = false;
        this.Q0 = 0;
        this.R0 = -1;
        final lp0 lp0Var = (lp0) this;
        this.W0 = new y00(lp0Var);
        byte b10 = 1;
        this.f55976l1 = new Paint(1);
        this.m1 = new Paint(1);
        this.f55986r1 = new Paint(1);
        this.f55988s1 = new Paint(1);
        this.f55990t1 = new Paint(1);
        tg.h1 h1Var = new tg.h1(1.0f, 0.016773745f, -1);
        this.f55992u1 = h1Var;
        this.f56000y1 = new Paint(1);
        this.I1 = false;
        this.J1 = new u5((View) this, 350L, xq.h);
        this.K1 = new Paint(1);
        Paint paint = new Paint(1);
        this.L1 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new Matrix();
        this.N1 = new float[2];
        this.O1 = new int[2];
        new lt(lp0Var, 27);
        setDelegate(this);
        this.f56002z1 = i3;
        this.A1 = new e6() {
            @Override
            public final boolean a() {
                return k6.I.q();
            }

            @Override
            public final void b(float f11, float f12, int i12, int i13) {
                k6.r(f11, f12, i12, i13);
            }

            @Override
            public final ColorFilter c() {
                return k6.f28211v3;
            }

            @Override
            public final Paint d(String str) {
                return k6.V0(str);
            }

            @Override
            public final boolean e() {
                return az.H0;
            }

            @Override
            public final int f(int i12) {
                return h(i12);
            }

            @Override
            public final boolean g() {
                return false;
            }

            @Override
            public final Drawable getDrawable(String str) {
                return null;
            }

            @Override
            public final int h(int i12) {
                if (i12 == k6.G8) {
                    return -14145495;
                }
                if (i12 != k6.E8) {
                    if (i12 == k6.f27954h5) {
                        return -14737633;
                    }
                    if (i12 == k6.f27988j5) {
                        return -592138;
                    }
                    if (i12 == k6.r5) {
                        return -8553091;
                    }
                    if (i12 != k6.f28243wf) {
                        if (i12 == k6.f28299zf) {
                            return -1610612736;
                        }
                        if (i12 == k6.Cf || i12 == k6.Gf || i12 == k6.Bf) {
                            return -9539985;
                        }
                        if (i12 != k6.G6) {
                            int i13 = k6.Ai;
                            if (i12 == i13) {
                                return -11754001;
                            }
                            if (i12 == k6.f27972i6) {
                                return 536870911;
                            }
                            if (i12 != k6.f28188ti && i12 != k6.f28169si && i12 != k6.f28207ui) {
                                if (i12 == k6.f28226vi) {
                                    return 352321535;
                                }
                                if (i12 != k6.f28280yf && i12 != i13) {
                                    if (i12 == k6.f28262xf) {
                                        return 780633991;
                                    }
                                    if (i12 == k6.f27824a7) {
                                        return -15921907;
                                    }
                                    if (i12 == k6.f28044m7) {
                                        return -12500671;
                                    }
                                    if (i12 == k6.f28027l7) {
                                        return -13133079;
                                    }
                                    if (i12 == k6.f28063n7) {
                                        return -1;
                                    }
                                    if (i12 == k6.f27878d6) {
                                        return -15198183;
                                    }
                                    if (i12 == k6.f27879d7) {
                                        return -16777216;
                                    }
                                    e6 e6Var2 = e6.this;
                                    if (e6Var2 != null) {
                                        return e6Var2.h(i12);
                                    }
                                    return k6.v0(i12);
                                }
                                return -7895161;
                            }
                            return -1;
                        }
                        return -1;
                    }
                    return -16777216;
                }
                return -1;
            }

            @Override
            public final int j(int i12) {
                return h(i12);
            }

            @Override
            public final void i(int i12, int i13) {
            }
        };
        this.f55985r0 = reVar;
        this.F0 = context instanceof BubbleActivity;
        tg.k0 e10 = tg.k0.e(i3);
        this.F1 = e10;
        e10.i(0, true);
        h1Var.f55186a = e10.c();
        h1Var.f55188c = e10.f55235i;
        q5 q5Var = new q5("Paint", true);
        this.f55983q0 = q5Var;
        this.f55977n0 = bitmap;
        this.f55979o0 = bitmap2;
        this.Y0 = i10;
        tg.k1 k1Var = new tg.k1();
        this.f55981p0 = k1Var;
        k1Var.f55239a = new e3(lp0Var, 18);
        byte b11 = 2;
        a0 a0Var = new a0(lp0Var, context, new tg.i0(getPaintingSize(), bitmap2, i10, null), bitmap, bitmap2);
        this.G0 = a0Var;
        a0Var.setDelegate(new ua.b(lp0Var, xm0Var, false, 1));
        a0Var.setUndoStore(k1Var);
        a0Var.setQueue(q5Var);
        a0Var.setVisibility(4);
        addView(a0Var, mf.e(-1, -1, 51));
        org.telegram.ui.Components.voip.r0 r0Var = new org.telegram.ui.Components.voip.r0(14, context, lp0Var);
        this.H0 = r0Var;
        r0Var.setVisibility(4);
        addView(r0Var, mf.e(-1, -1, 51));
        b0 b0Var = new b0(lp0Var, context, new nh(lp0Var, 25));
        this.J0 = b0Var;
        addView(b0Var);
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                z10 z10Var = (z10) arrayList.get(i12);
                byte b12 = z10Var.f26703a;
                if (b12 == 0) {
                    f10 = 2.0f;
                    ?? g02 = g0(z10Var.C, z10Var.B, z11);
                    if ((z10Var.f26704b & 2) != 0) {
                        g02.r(z11);
                    }
                    ViewGroup.LayoutParams layoutParams = g02.getLayoutParams();
                    layoutParams.width = z10Var.f26717q;
                    layoutParams.height = z10Var.f26718r;
                    i11 = size;
                    n1Var = g02;
                } else {
                    f10 = 2.0f;
                    if (b12 == b10) {
                        ?? h02 = h0(z11);
                        h02.setType(z10Var.f26704b);
                        h02.setTypeface(z10Var.f26714n);
                        h02.setBaseFontSize(z10Var.f26713m);
                        SpannableString spannableString = new SpannableString(z10Var.f26710j);
                        ?? r15 = z10Var.f26711k;
                        int size2 = r15.size();
                        int i13 = z11;
                        while (i13 < size2) {
                            Object obj = r15.get(i13);
                            int i14 = i13 + 1;
                            y10 y10Var = (y10) obj;
                            p5 p5Var = new p5(y10Var.document_id, h02.getFontMetricsInt());
                            int i15 = y10Var.offset;
                            spannableString.setSpan(p5Var, i15, y10Var.length + i15, 33);
                            size = size;
                            size2 = size2;
                            i13 = i14;
                        }
                        i11 = size;
                        CharSequence m10 = i6.m(spannableString, h02.getFontMetricsInt(), false, null, 0);
                        if ((m10 instanceof Spanned) && (f6VarArr = (f6[]) ((Spanned) m10).getSpans(0, m10.length(), f6.class)) != null) {
                            for (f6 f6Var : f6VarArr) {
                                f6Var.f22453b = 0.85f;
                            }
                        }
                        h02.setText(m10);
                        u0(h02, z10Var.f26716p);
                        tg.h1 swatch = h02.getSwatch();
                        swatch.f55186a = z10Var.f26712l;
                        h02.setSwatch(swatch);
                        n1Var = h02;
                    } else {
                        i11 = size;
                        byte b13 = b11;
                        if (b12 == b13) {
                            n1 f02 = f0(z10Var.f26710j, false);
                            f02.C0 = false;
                            if ((z10Var.f26704b & b13) != 0) {
                                f02.r(false);
                            }
                            if ((z10Var.f26704b & 16) != 0) {
                                f02.t(false);
                            }
                            ViewGroup.LayoutParams layoutParams2 = f02.getLayoutParams();
                            layoutParams2.width = z10Var.f26717q;
                            layoutParams2.height = z10Var.f26718r;
                            n1Var = f02;
                        } else {
                            i12++;
                            size = i11;
                            z11 = false;
                            b10 = 1;
                            b11 = 2;
                        }
                    }
                }
                n1Var.setX((z10Var.f26705c * this.B0.f35877a) - (((1.0f - z10Var.v) * z10Var.f26717q) / f10));
                n1Var.setY((z10Var.d * this.B0.f35878b) - (((1.0f - z10Var.v) * z10Var.f26718r) / f10));
                n1Var.setPosition(new PointF((z10Var.f26717q / f10) + n1Var.getX(), (z10Var.f26718r / f10) + n1Var.getY()));
                n1Var.setScale(z10Var.v);
                n1Var.setRotation((float) (((-z10Var.f26706e) / 3.141592653589793d) * 180.0d));
                i12++;
                size = i11;
                z11 = false;
                b10 = 1;
                b11 = 2;
            }
        }
        this.J0.setVisibility(4);
        yg0 yg0Var = new yg0(context, 19);
        this.I0 = yg0Var;
        addView(yg0Var);
        ?? frameLayout = new FrameLayout(context);
        this.L0 = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{-16777216, 0}));
        addView(frameLayout, mf.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.f55970g1 = imageView;
        imageView.setImageResource(2131232531);
        imageView.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        imageView.setBackground(k6.h0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        lp0 lp0Var2 = lp0Var;
                        a0 a0Var2 = lp0Var2.G0;
                        if (a0Var2 != null && (a0Var2.getCurrentBrush() instanceof tg.g)) {
                            a0Var2.b();
                            lp0Var2.f55967d1.setSelectedIndex(1);
                            lp0Var2.C((tg.h) tg.h.f55183a.get(0));
                            return;
                        }
                        lp0Var2.f55981p0.c();
                        return;
                    case 1:
                        lp0 lp0Var3 = lp0Var;
                        a0 a0Var3 = lp0Var3.G0;
                        tg.k1 k1Var2 = lp0Var3.f55981p0;
                        if (k1Var2.a()) {
                            if (a0Var3 != null && (a0Var3.getCurrentBrush() instanceof tg.g)) {
                                a0Var3.b();
                                lp0Var3.f55967d1.setSelectedIndex(1);
                                lp0Var3.C((tg.h) tg.h.f55183a.get(0));
                            }
                            a0Var3.a();
                            k1Var2.f55241c.clear();
                            k1Var2.f55240b.clear();
                            org.telegram.messenger.g0.h3(new r4.u(k1Var2, 8));
                            lp0Var3.J0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        lp0 lp0Var4 = lp0Var;
                        j jVar = lp0Var4.C0;
                        if (jVar instanceof l2) {
                            org.telegram.messenger.g0.v1(((l2) jVar).getFocusedView());
                        }
                        if (lp0Var4.Q1) {
                            lp0Var4.k0(false);
                        }
                        lp0Var4.q0(lp0Var4.C0);
                        lp0Var4.r0(null, true);
                        return;
                    default:
                        lp0Var.r0(null, true);
                        return;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout.addView(imageView, mf.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f55971h1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(k6.h0(822083583, 7, -1));
        linearLayout.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 16.0f);
        textView.setText(bd.M0(2131747275, null));
        linearLayout.addView(org.telegram.messenger.camera.q.e(context, 2131232532), mf.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, mf.r(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new ai.t(28));
        frameLayout.addView(linearLayout, mf.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.f55972i1 = textView2;
        textView2.setBackground(k6.h0(822083583, 7, -1));
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView2.setText(bd.M0(2131747287, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        lp0 lp0Var2 = lp0Var;
                        a0 a0Var2 = lp0Var2.G0;
                        if (a0Var2 != null && (a0Var2.getCurrentBrush() instanceof tg.g)) {
                            a0Var2.b();
                            lp0Var2.f55967d1.setSelectedIndex(1);
                            lp0Var2.C((tg.h) tg.h.f55183a.get(0));
                            return;
                        }
                        lp0Var2.f55981p0.c();
                        return;
                    case 1:
                        lp0 lp0Var3 = lp0Var;
                        a0 a0Var3 = lp0Var3.G0;
                        tg.k1 k1Var2 = lp0Var3.f55981p0;
                        if (k1Var2.a()) {
                            if (a0Var3 != null && (a0Var3.getCurrentBrush() instanceof tg.g)) {
                                a0Var3.b();
                                lp0Var3.f55967d1.setSelectedIndex(1);
                                lp0Var3.C((tg.h) tg.h.f55183a.get(0));
                            }
                            a0Var3.a();
                            k1Var2.f55241c.clear();
                            k1Var2.f55240b.clear();
                            org.telegram.messenger.g0.h3(new r4.u(k1Var2, 8));
                            lp0Var3.J0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        lp0 lp0Var4 = lp0Var;
                        j jVar = lp0Var4.C0;
                        if (jVar instanceof l2) {
                            org.telegram.messenger.g0.v1(((l2) jVar).getFocusedView());
                        }
                        if (lp0Var4.Q1) {
                            lp0Var4.k0(false);
                        }
                        lp0Var4.q0(lp0Var4.C0);
                        lp0Var4.r0(null, true);
                        return;
                    default:
                        lp0Var.r0(null, true);
                        return;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView m11 = org.telegram.ui.Cells.f1.m(frameLayout, textView2, mf.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.f55973j1 = m11;
        m11.setBackground(k6.h0(822083583, 7, -1));
        m11.setText(bd.M0(2131752101, null));
        m11.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        m11.setGravity(16);
        m11.setTextColor(-1);
        m11.setTypeface(org.telegram.messenger.g0.o());
        m11.setTextSize(1, 16.0f);
        m11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        lp0 lp0Var2 = lp0Var;
                        a0 a0Var2 = lp0Var2.G0;
                        if (a0Var2 != null && (a0Var2.getCurrentBrush() instanceof tg.g)) {
                            a0Var2.b();
                            lp0Var2.f55967d1.setSelectedIndex(1);
                            lp0Var2.C((tg.h) tg.h.f55183a.get(0));
                            return;
                        }
                        lp0Var2.f55981p0.c();
                        return;
                    case 1:
                        lp0 lp0Var3 = lp0Var;
                        a0 a0Var3 = lp0Var3.G0;
                        tg.k1 k1Var2 = lp0Var3.f55981p0;
                        if (k1Var2.a()) {
                            if (a0Var3 != null && (a0Var3.getCurrentBrush() instanceof tg.g)) {
                                a0Var3.b();
                                lp0Var3.f55967d1.setSelectedIndex(1);
                                lp0Var3.C((tg.h) tg.h.f55183a.get(0));
                            }
                            a0Var3.a();
                            k1Var2.f55241c.clear();
                            k1Var2.f55240b.clear();
                            org.telegram.messenger.g0.h3(new r4.u(k1Var2, 8));
                            lp0Var3.J0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        lp0 lp0Var4 = lp0Var;
                        j jVar = lp0Var4.C0;
                        if (jVar instanceof l2) {
                            org.telegram.messenger.g0.v1(((l2) jVar).getFocusedView());
                        }
                        if (lp0Var4.Q1) {
                            lp0Var4.k0(false);
                        }
                        lp0Var4.q0(lp0Var4.C0);
                        lp0Var4.r0(null, true);
                        return;
                    default:
                        lp0Var.r0(null, true);
                        return;
                }
            }
        });
        m11.setAlpha(0.0f);
        m11.setVisibility(8);
        TextView m12 = org.telegram.ui.Cells.f1.m(frameLayout, m11, mf.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.k1 = m12;
        m12.setBackground(k6.h0(822083583, 7, -1));
        m12.setText(bd.M0(2131751355, null));
        m12.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        m12.setGravity(16);
        m12.setTextColor(-1);
        m12.setTypeface(org.telegram.messenger.g0.o());
        m12.setTextSize(1, 16.0f);
        m12.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        lp0 lp0Var2 = lp0Var;
                        a0 a0Var2 = lp0Var2.G0;
                        if (a0Var2 != null && (a0Var2.getCurrentBrush() instanceof tg.g)) {
                            a0Var2.b();
                            lp0Var2.f55967d1.setSelectedIndex(1);
                            lp0Var2.C((tg.h) tg.h.f55183a.get(0));
                            return;
                        }
                        lp0Var2.f55981p0.c();
                        return;
                    case 1:
                        lp0 lp0Var3 = lp0Var;
                        a0 a0Var3 = lp0Var3.G0;
                        tg.k1 k1Var2 = lp0Var3.f55981p0;
                        if (k1Var2.a()) {
                            if (a0Var3 != null && (a0Var3.getCurrentBrush() instanceof tg.g)) {
                                a0Var3.b();
                                lp0Var3.f55967d1.setSelectedIndex(1);
                                lp0Var3.C((tg.h) tg.h.f55183a.get(0));
                            }
                            a0Var3.a();
                            k1Var2.f55241c.clear();
                            k1Var2.f55240b.clear();
                            org.telegram.messenger.g0.h3(new r4.u(k1Var2, 8));
                            lp0Var3.J0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        lp0 lp0Var4 = lp0Var;
                        j jVar = lp0Var4.C0;
                        if (jVar instanceof l2) {
                            org.telegram.messenger.g0.v1(((l2) jVar).getFocusedView());
                        }
                        if (lp0Var4.Q1) {
                            lp0Var4.k0(false);
                        }
                        lp0Var4.q0(lp0Var4.C0);
                        lp0Var4.r0(null, true);
                        return;
                    default:
                        lp0Var.r0(null, true);
                        return;
                }
            }
        });
        m12.setAlpha(0.0f);
        m12.setVisibility(8);
        frameLayout.addView(m12, mf.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        d0 d0Var = new d0(lp0Var, context);
        this.M0 = d0Var;
        d0Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), 0);
        d0Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(d0Var, mf.e(-1, 104, 80));
        if (bitmap2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        g1 g1Var = new g1(context, z10);
        this.f55967d1 = g1Var;
        g1Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        g1Var.setDelegate(this);
        g1Var.setSelectedIndex(1);
        d0Var.addView(g1Var, mf.c(48.0f, -1));
        d1 d1Var = new d1(context);
        this.f55968e1 = d1Var;
        d1Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        d1Var.setVisibility(8);
        d1Var.setDelegate(this);
        d1Var.setAlignment(tg.k0.e(i3).f55234g);
        d0Var.addView(d1Var, mf.c(48.0f, -1));
        kw0 kw0Var = new kw0(lp0Var, context);
        this.N0 = kw0Var;
        addView(kw0Var, mf.c(-1.0f, -1));
        i1 i1Var = new i1(context);
        this.f55969f1 = i1Var;
        i1Var.setVisibility(8);
        i1Var.setOnItemClickListener(new j6(lp0Var, 20));
        d1Var.setTypefaceListView(i1Var);
        kw0Var.addView(i1Var, mf.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        Paint paint2 = this.f55976l1;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f55976l1.setColor(1728053247);
        this.f55976l1.setStrokeWidth(Math.max(2, org.telegram.messenger.g0.L(1.0f)));
        this.m1.setColor(k6.w0(k6.G8, this.A1));
        c0 c0Var = new c0(lp0Var, context);
        this.f55984q1 = c0Var;
        c0Var.setVisibility(8);
        c0Var.setColorPalette(tg.k0.e(i3));
        c0Var.setColorListener(new m(lp0Var, 0));
        d0Var.addView(c0Var, mf.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        u0 u0Var = new u0(context);
        this.f55974k0 = u0Var;
        u0Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        u0Var.setBackground(k6.h0(1090519039, 1, -1));
        d0Var.addView(u0Var, mf.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        y0 y0Var = new y0(context);
        this.f55975l0 = y0Var;
        y0Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        y0Var.setBackground(k6.h0(1090519039, 1, -1));
        y0Var.setOnClickListener(new ct(lp0Var, context, bitmap2, 8));
        d0Var.addView(y0Var, mf.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        l1 l1Var = new l1(context);
        this.V0 = l1Var;
        l1Var.setColorSwatch(this.f55992u1);
        l1Var.setRenderView(this.G0);
        l1Var.setValueOverride(this.W0);
        this.f55992u1.f55188c = this.W0.get();
        l1Var.setOnUpdate(new org.telegram.ui.Wallet.f2(lp0Var, i3, 9));
        addView(l1Var, mf.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.O0 = frameLayout2;
        addView(frameLayout2, mf.c(-1.0f, -1));
        this.f55990t1.setStyle(style);
        this.f55990t1.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        s0(this.f55992u1, null);
        C((tg.h) tg.h.f55183a.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            Point point = org.telegram.messenger.g0.f22608q;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (point.y * 0.35f), org.telegram.messenger.g0.L(100.0f), (int) (point.y * 0.65d))));
        }
    }

    public static void X(lp0 lp0Var, Integer num) {
        lp0Var.setNewColor(num.intValue());
        lp0Var.w0(false);
    }

    public static void Y(ug.f0 r13) {
        throw new UnsupportedOperationException("Method not decompiled: ug.f0.Y(ug.f0):void");
    }

    public static void Z(f0 f0Var) {
        d2 d2Var;
        b0 b0Var = f0Var.J0;
        j jVar = f0Var.C0;
        if (jVar != null) {
            PointF A0 = f0Var.A0(jVar);
            j jVar2 = f0Var.C0;
            if (jVar2 instanceof d2) {
                d2 d2Var2 = new d2(f0Var.getContext(), (d2) f0Var.C0, A0);
                d2Var2.setDelegate(f0Var);
                b0Var.addView(d2Var2);
                d2Var = d2Var2;
            } else if (jVar2 instanceof l2) {
                l2 l2Var = new l2(f0Var.getContext(), (l2) f0Var.C0, A0);
                l2Var.setDelegate(f0Var);
                l2Var.setMaxWidth((int) (f0Var.getPaintingSize().f35877a - 20.0f));
                b0Var.addView(l2Var, mf.c(-2.0f, -2));
                d2Var = l2Var;
            } else {
                d2Var = null;
            }
            f0Var.p0(d2Var);
            f0Var.r0(d2Var, true);
        }
        org.telegram.ui.ActionBar.f1 f1Var = f0Var.B1;
        if (f1Var != null && f1Var.isShowing()) {
            f0Var.B1.d(true);
        }
    }

    public static void a0(lp0 lp0Var, Integer num) {
        tg.k0 k0Var = lp0Var.F1;
        k0Var.h(num.intValue(), true);
        k0Var.g();
        lp0Var.setNewColor(num.intValue());
        c0 c0Var = lp0Var.f55984q1;
        c0Var.setSelectedColorIndex(k0Var.d());
        c0Var.getAdapter().f();
    }

    public ViewGroup getBarView() {
        if (this.Q0 == 2) {
            return this.f55968e1;
        }
        return this.f55967d1;
    }

    private int getFrameRotation() {
        int i3 = this.Y0;
        if (i3 != 90) {
            if (i3 != 180) {
                if (i3 != 270) {
                    return 0;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    private lt0 getPaintingSize() {
        int i3;
        lt0 lt0Var = this.B0;
        if (lt0Var != null) {
            return lt0Var;
        }
        Bitmap bitmap = this.f55977n0;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        int o10 = az.o();
        if (o10 != 0) {
            if (o10 != 2) {
                i3 = 2560;
            } else {
                i3 = 3840;
            }
        } else {
            i3 = 1280;
        }
        lt0 lt0Var2 = new lt0(width, height);
        float f10 = i3;
        lt0Var2.f35877a = f10;
        float floor = (float) Math.floor((f10 * height) / width);
        lt0Var2.f35878b = floor;
        if (floor > f10) {
            lt0Var2.f35878b = f10;
            lt0Var2.f35877a = (float) Math.floor((f10 * width) / height);
        }
        this.B0 = lt0Var2;
        return lt0Var2;
    }

    public void setNewColor(int i3) {
        tg.h1 h1Var = this.f55992u1;
        int i10 = h1Var.f55186a;
        h1Var.f55186a = i3;
        s0(h1Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new h4(this, i10, i3, 5));
        duration.start();
    }

    private void setTextType(int i3) {
        this.E0 = i3;
        j jVar = this.C0;
        if (jVar instanceof l2) {
            ((l2) jVar).setType(i3);
        }
        tg.k0 e10 = tg.k0.e(this.f56002z1);
        e10.h = i3;
        e10.f55229a.edit().putInt("text_type", i3).apply();
        this.f55968e1.setOutlineType(i3);
    }

    private void setupTabsLayout(Context context) {
        y4 y4Var = new y4(this, context);
        this.P0 = y4Var;
        y4Var.setClipToPadding(false);
        this.P0.setOrientation(0);
        this.M0.addView(this.P0, mf.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f55964a1 = textView;
        textView.setText(bd.M0(2131747285, null).toUpperCase());
        TextView textView2 = this.f55964a1;
        int i3 = k6.f27972i6;
        u uVar = this.A1;
        r6.R(textView2, k6.h0(k6.w0(i3, uVar), 7, -1), null, r6.N(i3), uVar);
        this.f55964a1.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.f55964a1.setTextColor(-1);
        this.f55964a1.setTextSize(1, 14.0f);
        this.f55964a1.setGravity(1);
        this.f55964a1.setTypeface(org.telegram.messenger.g0.o());
        this.f55964a1.setSingleLine();
        this.f55964a1.setOnClickListener(new k(this, 0));
        this.P0.addView(this.f55964a1, mf.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.f55965b1 = textView3;
        textView3.setText(bd.M0(2131747284, null).toUpperCase());
        r6.R(this.f55965b1, k6.h0(k6.w0(i3, uVar), 7, -1), null, r6.N(i3), uVar);
        this.f55965b1.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.f55965b1.setOnClickListener(new k(this, 1));
        this.f55965b1.setTextColor(-1);
        this.f55965b1.setTextSize(1, 14.0f);
        this.f55965b1.setGravity(1);
        this.f55965b1.setTypeface(org.telegram.messenger.g0.o());
        this.f55965b1.setAlpha(0.6f);
        this.f55965b1.setSingleLine();
        this.P0.addView(this.f55965b1, mf.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.f55966c1 = textView4;
        textView4.setText(bd.M0(2131747283, null).toUpperCase());
        r6.R(this.f55966c1, k6.h0(k6.w0(i3, uVar), 7, -1), null, r6.N(i3), uVar);
        this.f55966c1.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.f55966c1.setTextColor(-1);
        this.f55966c1.setTextSize(1, 14.0f);
        this.f55966c1.setGravity(1);
        this.f55966c1.setTypeface(org.telegram.messenger.g0.o());
        this.f55966c1.setAlpha(0.6f);
        this.f55966c1.setSingleLine();
        this.f55966c1.setOnClickListener(new k(this, 4));
        this.P0.addView(this.f55966c1, mf.l(1.0f, 0, -2));
    }

    public static void u0(l2 l2Var, int i3) {
        int i10;
        l2Var.setAlign(i3);
        int i11 = 2;
        if (i3 != 1) {
            if (i3 != 2) {
                i10 = 19;
            } else {
                i10 = 21;
            }
        } else {
            i10 = 17;
        }
        l2Var.getEditText().setGravity(i10);
        if (i3 != 1) {
            if (i3 == 2 ? !bd.f21784a0 : bd.f21784a0) {
                i11 = 3;
            }
        } else {
            i11 = 4;
        }
        l2Var.getEditText().setTextAlignment(i11);
    }

    public final PointF A0(j jVar) {
        float f10 = 200.0f;
        re reVar = this.f55985r0;
        if (reVar != null) {
            f10 = 200.0f / reVar.f25112c;
        }
        if (jVar != null) {
            PointF position = jVar.getPosition();
            return new PointF(position.x + f10, position.y + f10);
        }
        float f11 = 100.0f;
        if (reVar != null) {
            f11 = 100.0f / reVar.f25112c;
        }
        PointF e02 = e0();
        while (true) {
            int i3 = 0;
            boolean z10 = false;
            while (true) {
                b0 b0Var = this.J0;
                if (i3 >= b0Var.getChildCount()) {
                    break;
                }
                View childAt = b0Var.getChildAt(i3);
                if (childAt instanceof j) {
                    PointF position2 = ((j) childAt).getPosition();
                    if (((float) Math.sqrt(Math.pow(position2.y - e02.y, 2.0d) + Math.pow(position2.x - e02.x, 2.0d))) < f11) {
                        z10 = true;
                    }
                }
                i3++;
            }
            if (!z10) {
                return e02;
            }
            e02 = new PointF(e02.x + f10, e02.y + f10);
        }
    }

    public final void B0(int i3) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z10;
        if (this.Q0 != i3 && this.R0 != i3) {
            ValueAnimator valueAnimator = this.T0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i10 = this.Q0;
            ViewGroup viewGroup3 = this.f55968e1;
            ViewGroup viewGroup4 = this.f55967d1;
            if (i10 == 0) {
                viewGroup = viewGroup4;
            } else if (i10 == 2) {
                viewGroup = viewGroup3;
            } else {
                viewGroup = null;
            }
            this.R0 = i3;
            if (i3 == 0) {
                viewGroup2 = viewGroup4;
            } else if (i3 == 2) {
                viewGroup2 = viewGroup3;
            } else {
                viewGroup2 = null;
            }
            int i11 = this.f56002z1;
            tg.k0 e10 = tg.k0.e(i11);
            if (i3 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (e10.f55238l != z10) {
                e10.f55238l = z10;
                if (z10) {
                    e10.i(-1, false);
                } else {
                    e10.i(e10.f55229a.getInt("brush", 0), false);
                }
            }
            int c2 = tg.k0.e(i11).c();
            tg.h1 h1Var = this.f55992u1;
            h1Var.f55186a = c2;
            s0(h1Var, null);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.T0 = duration;
            duration.setInterpolator(xq.f40452f);
            this.T0.addUpdateListener(new j3(this, viewGroup, viewGroup2, 4));
            this.T0.addListener(new z4(this, viewGroup, viewGroup2, i3, 3));
            this.T0.start();
        }
    }

    @Override
    public final void C(tg.h hVar) {
        boolean z10 = hVar instanceof tg.b;
        l1 l1Var = this.V0;
        if (!z10 && !(hVar instanceof tg.d)) {
            l1Var.b(0.05f, 1.0f);
        } else {
            l1Var.b(0.4f, 1.75f);
        }
        l1Var.setDrawCenter(!(hVar instanceof tg.g));
        a0 a0Var = this.G0;
        if (a0Var.getCurrentBrush() instanceof tg.g) {
            this.U0 = true;
        }
        a0Var.setBrush(hVar);
        tg.h1 h1Var = this.f55992u1;
        int i3 = h1Var.f55186a;
        h1Var.f55186a = tg.k0.e(this.f56002z1).c();
        h1Var.f55188c = this.W0.get();
        s0(h1Var, Integer.valueOf(i3));
        this.H0.invalidate();
    }

    public final void C0() {
        int i3 = 0;
        while (true) {
            b0 b0Var = this.J0;
            if (i3 < b0Var.getChildCount()) {
                View childAt = b0Var.getChildAt(i3);
                if (childAt != this.C0) {
                    if (childAt instanceof j) {
                        j jVar = (j) childAt;
                        if (!jVar.m0 && jVar.f56082k0 <= 0.0f) {
                        }
                    }
                    i3++;
                }
                ((j) childAt).m();
                i3++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void D() {
        z0(true);
    }

    @Override
    public final void K(int i3, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        if (i3 > org.telegram.messenger.g0.L(50.0f) && this.R1 && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            if (z10) {
                this.V1 = i3;
                hp.d1().edit().putInt("kbd_height_land3", this.V1).commit();
            } else {
                this.U1 = i3;
                hp.d1().edit().putInt("kbd_height", this.U1).commit();
            }
        }
        if (this.Q1) {
            if (z10) {
                i10 = this.V1;
            } else {
                i10 = this.U1;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P1.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = org.telegram.messenger.g0.f22608q.x;
            if (i11 != i12 || layoutParams.height != i10) {
                layoutParams.width = i12;
                layoutParams.height = i10;
                this.P1.setLayoutParams(layoutParams);
                this.T1 = layoutParams.height;
                requestLayout();
                p3 p3Var = ((lp0) this).Y1.L1;
                if (p3Var != null) {
                    p3Var.a();
                }
                getHeight();
            }
        }
        if (this.W1 == i3 && this.X1 == z10) {
            getHeight();
            return;
        }
        this.W1 = i3;
        this.X1 = z10;
        boolean z13 = this.R1;
        j jVar = this.C0;
        if (jVar instanceof l2) {
            if (((l2) jVar).getEditText().isFocused() && i3 > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.R1 = z12;
        } else {
            this.R1 = false;
        }
        if (this.R1 && this.Q1) {
            x0(0);
        }
        if (this.T1 != 0 && !(z11 = this.R1) && z11 != z13 && !this.Q1) {
            this.T1 = 0;
            requestLayout();
            p3 p3Var2 = ((lp0) this).Y1.L1;
            if (p3Var2 != null) {
                p3Var2.a();
            }
        }
        getHeight();
    }

    @Override
    public final void a() {
        w0(true);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.G8));
        hashSet.add(Integer.valueOf(k6.f27954h5));
        hashSet.add(Integer.valueOf(k6.f27988j5));
        hashSet.add(Integer.valueOf(k6.r5));
        hashSet.add(Integer.valueOf(k6.f28243wf));
        hashSet.add(Integer.valueOf(k6.f28299zf));
        hashSet.add(Integer.valueOf(k6.Cf));
        hashSet.add(Integer.valueOf(k6.Gf));
        hashSet.add(Integer.valueOf(k6.Bf));
        hashSet.add(Integer.valueOf(k6.G6));
        hashSet.add(Integer.valueOf(k6.Ai));
        hashSet.add(Integer.valueOf(k6.f28188ti));
        hashSet.add(Integer.valueOf(k6.f28169si));
        hashSet.add(Integer.valueOf(k6.f28207ui));
        hashSet.add(Integer.valueOf(k6.f28226vi));
        hashSet.add(Integer.valueOf(k6.f28280yf));
        hashSet.add(Integer.valueOf(k6.f28262xf));
        hashSet.add(Integer.valueOf(k6.f27824a7));
        hashSet.add(Integer.valueOf(k6.f28044m7));
        hashSet.add(Integer.valueOf(k6.f28027l7));
        hashSet.add(Integer.valueOf(k6.f28063n7));
        hashSet.add(Integer.valueOf(k6.f27878d6));
        hashSet.add(Integer.valueOf(k6.f27879d7));
    }

    @Override
    public final void b() {
        setTextType((this.E0 + 1) % 4);
    }

    @Override
    public final void c(int i3) {
        j jVar = this.C0;
        if (jVar instanceof l2) {
            u0((l2) jVar, i3);
            tg.k0 e10 = tg.k0.e(this.f56002z1);
            e10.f55234g = i3;
            e10.f55229a.edit().putInt("text_alignment", i3).apply();
        }
    }

    public final void d0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new u9.a(2, this, (n1) view)).start();
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        b0 b0Var;
        l2 l2Var;
        String str;
        if (i3 == hs.C5 && (b0Var = this.J0) != null) {
            for (int i11 = 0; i11 < b0Var.getChildCount(); i11++) {
                View childAt = b0Var.getChildAt(i11);
                if ((childAt instanceof l2) && (str = (l2Var = (l2) childAt).B0) != null) {
                    l2Var.setTypeface(str);
                }
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r15, android.view.View r16, long r17) {
        throw new UnsupportedOperationException("Method not decompiled: ug.f0.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final PointF e0() {
        re reVar;
        lt0 paintingSize = getPaintingSize();
        float f10 = paintingSize.f35877a / 2.0f;
        float f11 = paintingSize.f35878b / 2.0f;
        if (this.f55985r0 != null) {
            double radians = (float) Math.toRadians(-(reVar.f25117k + reVar.d));
            float cos = (float) ((Math.cos(radians) * reVar.f25110a) - (Math.sin(radians) * reVar.f25111b));
            float c2 = (float) k2.p1.c(radians, reVar.f25111b, Math.sin(radians) * reVar.f25110a);
            f10 -= cos * paintingSize.f35877a;
            f11 -= c2 * paintingSize.f35878b;
        }
        return new PointF(f10, f11);
    }

    @Override
    public final boolean f(j jVar) {
        return r0(jVar, true);
    }

    public final n1 f0(String str, boolean z10) {
        float f10;
        lt0 lt0Var;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f10 = options.outWidth / options.outHeight;
        } catch (Exception e10) {
            a8.g(e10, true);
            f10 = 1.0f;
        }
        int i3 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        b0 b0Var = this.J0;
        if (i3 > 0) {
            float floor = (float) Math.floor(b0Var.getMeasuredWidth() * 0.5d);
            lt0Var = new lt0(floor, floor / f10);
        } else {
            float floor2 = (float) Math.floor(b0Var.getMeasuredHeight() * 0.5d);
            lt0Var = new lt0(f10 * floor2, floor2);
        }
        lt0 lt0Var2 = lt0Var;
        Pair N0 = org.telegram.messenger.g0.N0(str);
        if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
            float f11 = lt0Var2.f35877a;
            lt0Var2.f35877a = lt0Var2.f35878b;
            lt0Var2.f35878b = f11;
        }
        Context context = getContext();
        PointF e02 = e0();
        int intValue = ((Integer) N0.first).intValue();
        ((Integer) N0.second).getClass();
        n1 n1Var = new n1(context, e02, lt0Var2, str, intValue);
        n1Var.setDelegate(this);
        b0Var.addView(n1Var);
        if (z10) {
            p0(n1Var);
            r0(n1Var, true);
        }
        return n1Var;
    }

    public final ug.x g0(java.lang.Object r24, org.telegram.tgnet.TLRPC.Document r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: ug.f0.g0(java.lang.Object, org.telegram.tgnet.TLRPC$Document, boolean):ug.x");
    }

    public int getAdditionalBottom() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    public int getAdditionalTop() {
        return org.telegram.messenger.g0.L(48.0f);
    }

    public View getCancelView() {
        return this.f55974k0;
    }

    public float getCropRotation() {
        re reVar = this.f55985r0;
        if (reVar != null) {
            return reVar.d + reVar.f25117k;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.f55975l0;
    }

    public long getLcm() {
        return this.Z0.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        p5[] p5VarArr;
        b0 b0Var = this.J0;
        int childCount = b0Var.getChildCount();
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = b0Var.getChildAt(i3);
            if (childAt instanceof d2) {
                TLRPC.Document sticker = ((d2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f27013id = sticker.f27007id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof l2) {
                CharSequence text = ((l2) childAt).getText();
                if ((text instanceof Spanned) && (p5VarArr = (p5[]) ((Spanned) text).getSpans(0, text.length(), p5.class)) != null) {
                    for (p5 p5Var : p5VarArr) {
                        if (p5Var != null) {
                            TLRPC.Document document = p5Var.document;
                            if (document == null) {
                                document = g5.e(this.f56002z1, p5Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.f27013id = document.f27007id;
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
        return this.m0;
    }

    public int getPKeyboardHeight() {
        return 0;
    }

    public tg.u0 getRenderView() {
        return this.G0;
    }

    public float getSelectedEntityBottom() {
        j jVar = this.C0;
        b0 b0Var = this.J0;
        if (jVar == null) {
            return getY() + b0Var.getMeasuredHeight();
        }
        int[] iArr = new int[2];
        jVar.getLocationInWindow(iArr);
        return (b0Var.getScaleY() * this.C0.getHeight()) + iArr[1];
    }

    public cz0 getThanosEffect() {
        if (!cz0.c()) {
            return null;
        }
        if (this.K0 == null) {
            cz0 cz0Var = new cz0(getContext(), new n(this, 0));
            this.K0 = cz0Var;
            addView(cz0Var);
        }
        return this.K0;
    }

    public final l2 h0(boolean z10) {
        ((lp0) this).Y1.f41437h0.isFocusable();
        lt0 paintingSize = getPaintingSize();
        PointF A0 = A0(null);
        l2 l2Var = new l2(getContext(), A0, (int) (paintingSize.f35877a / 9.0f), "", this.f55992u1, this.E0);
        float f10 = paintingSize.f35877a / 9.0f;
        n nVar = new n(this, 2);
        l2Var.f56147x0 = (int) (0.5f * f10);
        l2Var.f56148y0 = (int) (f10 * 2.0f);
        l2Var.f56149z0 = nVar;
        float f11 = A0.x;
        b0 b0Var = this.J0;
        if (f11 == b0Var.getMeasuredWidth() / 2.0f) {
            l2Var.setStickyX(2);
        }
        if (A0.y == b0Var.getMeasuredHeight() / 2.0f) {
            l2Var.setStickyY(2);
        }
        l2Var.setDelegate(this);
        l2Var.setMaxWidth((int) (paintingSize.f35877a - 20.0f));
        int i3 = this.f56002z1;
        l2Var.setTypeface(tg.k0.e(i3).f55236j);
        l2Var.setType(tg.k0.e(i3).h);
        b0Var.addView(l2Var, mf.c(-2.0f, -2));
        re reVar = this.f55985r0;
        if (reVar != null) {
            l2Var.j(1.0f / reVar.f25112c);
            l2Var.f(-(reVar.f25117k + reVar.d));
        }
        if (z10) {
            p0(l2Var);
            l2Var.q();
            r0(l2Var, false);
            l2Var.getFocusedView().requestFocus();
            org.telegram.messenger.g0.K3(l2Var.getFocusedView());
            this.D0 = true;
            int i10 = tg.k0.e(i3).f55234g;
            d1 d1Var = this.f55968e1;
            d1Var.d(i10, true);
            d1Var.setOutlineType(tg.k0.e(i3).h);
        }
        return l2Var;
    }

    @Override
    public final int[] i(j jVar) {
        return i0(jVar);
    }

    public final int[] i0(j jVar) {
        float[] fArr = this.N1;
        fArr[0] = jVar.getWidth() / 2.0f;
        fArr[1] = jVar.getHeight() / 2.0f;
        jVar.getMatrix().mapPoints(fArr);
        fArr[0] = fArr[0] + jVar.getLeft();
        fArr[1] = fArr[1] + jVar.getTop();
        ViewParent parent = jVar.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            fArr[0] = fArr[0] - view.getScrollX();
            fArr[1] = fArr[1] - view.getScrollY();
            view.getMatrix().mapPoints(fArr);
            fArr[0] = fArr[0] + view.getLeft();
            fArr[1] = fArr[1] + view.getTop();
            parent = view.getParent();
        }
        int round = Math.round(fArr[0]);
        int[] iArr = this.O1;
        iArr[0] = round;
        int round2 = Math.round(fArr[1]);
        iArr[1] = round2;
        Point point = org.telegram.messenger.g0.f22608q;
        double d = iArr[0] - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.J0.getRotation());
        double d10 = round2 - (point.y / 2.0f);
        iArr[0] = (point.x / 2) + ((int) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        iArr[1] = (point.y / 2) + ((int) k2.p1.c(radians, d10, Math.sin(radians) * d));
        return iArr;
    }

    public final boolean j(MotionEvent motionEvent) {
        if (this.C0 != null) {
            r0(null, true);
        }
        float x10 = motionEvent.getX();
        a0 a0Var = this.G0;
        float translationX = ((x10 - a0Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / a0Var.getScaleX();
        float y9 = ((((motionEvent.getY() - a0Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) + org.telegram.messenger.g0.L(32.0f)) - ((getAdditionalTop() - getAdditionalBottom()) / 2.0f)) / a0Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-a0Var.getRotation());
        double d10 = y9;
        float measuredWidth = (a0Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        float measuredHeight = (a0Var.getMeasuredHeight() / 2.0f) + ((float) k2.p1.c(radians, d10, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        a0Var.e(obtain);
        obtain.recycle();
        return true;
    }

    public final int j0(boolean z10) {
        return this.T1;
    }

    @Override
    public final void k(j jVar) {
        int[] i02 = i0(jVar);
        y0(new s(this, jVar, 1), this, 51, i02[0], i02[1] - org.telegram.messenger.g0.L(32.0f));
    }

    public final void k0(boolean z10) {
        if (this.Q1) {
            x0(0);
        }
        if (z10) {
            ey eyVar = this.P1;
            if (eyVar != null && eyVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.P1.getMeasuredHeight());
                ofFloat.addUpdateListener(new o(this, 0));
                this.S1 = true;
                ofFloat.addListener(new y(this, 1));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.h1.f27551w);
                ofFloat.start();
                return;
            }
            l0();
        }
    }

    public final void l0() {
        ey eyVar;
        p3 p3Var;
        if (this.T1 > 0 && (p3Var = ((lp0) this).Y1.L1) != null) {
            p3Var.a();
        }
        if (!this.Q1 && (eyVar = this.P1) != null && eyVar.getVisibility() != 8) {
            this.P1.setVisibility(8);
        }
        this.T1 = 0;
    }

    public final void m0(boolean z10) {
        int i3;
        int i10;
        if (this.Q0 == 0) {
            int i11 = 0;
            if (z10) {
                i3 = 2;
            } else {
                i3 = 0;
            }
            this.V0.setLayerType(i3, null);
            if (z10) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            this.M0.setLayerType(i10, null);
            if (z10) {
                i11 = 2;
            }
            this.L0.setLayerType(i11, null);
        }
    }

    public final boolean n0() {
        if (this.f55994v1) {
            w0(false);
            return true;
        } else if (this.Q1) {
            k0(true);
            return true;
        } else if (!this.D0) {
            return false;
        } else {
            r0(null, true);
            return true;
        }
    }

    public abstract void o0(boolean z10);

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hs.e().c(this, hs.C5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.e().n(this, hs.C5);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int Q;
        super.onLayout(z10, i3, i10, i11, i12);
        int i13 = i11 - i3;
        int i14 = i12 - i10;
        int i15 = 0;
        if (this.P1 != null) {
            if (org.telegram.messenger.g0.Q1()) {
                Q = i14 - this.P1.getMeasuredHeight();
            } else {
                Q = (Q() + i14) - this.P1.getMeasuredHeight();
            }
            ey eyVar = this.P1;
            eyVar.layout(0, Q, eyVar.getMeasuredWidth(), this.P1.getMeasuredHeight() + Q);
        }
        if (!this.F0) {
            i15 = org.telegram.messenger.g0.f22602m;
        }
        a0 a0Var = this.G0;
        int ceil = (int) Math.ceil((i13 - a0Var.getMeasuredWidth()) / 2.0f);
        int additionalTop = ((getAdditionalTop() - getAdditionalBottom()) / 2) + k5.C(8.0f, (((i14 - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i15)) - org.telegram.messenger.g0.L(48.0f)) - a0Var.getMeasuredHeight()) / 2, i15);
        a0Var.layout(ceil, additionalTop, a0Var.getMeasuredWidth() + ceil, a0Var.getMeasuredHeight() + additionalTop);
        org.telegram.ui.Components.voip.r0 r0Var = this.H0;
        r0Var.layout(ceil, additionalTop, r0Var.getMeasuredWidth() + ceil, r0Var.getMeasuredHeight() + additionalTop);
        int measuredWidth = a0Var.getMeasuredWidth();
        b0 b0Var = this.J0;
        int measuredWidth2 = ((measuredWidth - b0Var.getMeasuredWidth()) / 2) + ceil;
        int measuredHeight = ((a0Var.getMeasuredHeight() - b0Var.getMeasuredHeight()) / 2) + additionalTop;
        b0Var.layout(measuredWidth2, measuredHeight, b0Var.getMeasuredWidth() + measuredWidth2, b0Var.getMeasuredHeight() + measuredHeight);
        cz0 cz0Var = this.K0;
        if (cz0Var != null) {
            cz0Var.layout(measuredWidth2, measuredHeight, b0Var.getMeasuredWidth() + measuredWidth2, b0Var.getMeasuredHeight() + measuredHeight);
        }
        yg0 yg0Var = this.I0;
        yg0Var.layout(ceil, additionalTop, yg0Var.getMeasuredWidth() + ceil, yg0Var.getMeasuredHeight() + additionalTop);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        float currentActionBarHeight;
        float f10;
        this.f56001z0 = true;
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((org.telegram.messenger.g0.f22608q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - org.telegram.messenger.g0.L(48.0f);
        Bitmap bitmap = this.f55977n0;
        if (bitmap != null) {
            f10 = bitmap.getWidth();
            currentActionBarHeight = bitmap.getHeight();
        } else {
            currentActionBarHeight = (size2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(48.0f);
            f10 = size;
        }
        float f11 = size;
        float floor = (float) Math.floor((f11 * currentActionBarHeight) / f10);
        float f12 = currentActionBarHeight2;
        if (floor > f12) {
            f11 = (float) Math.floor((f10 * f12) / currentActionBarHeight);
            floor = f12;
        }
        int i11 = (int) f11;
        int i12 = (int) floor;
        this.G0.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
        this.H0.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
        float f13 = f11 / this.B0.f35877a;
        this.A0 = f13;
        b0 b0Var = this.J0;
        b0Var.setScaleX(f13);
        b0Var.setScaleY(this.A0);
        b0Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.B0.f35877a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.B0.f35878b, 1073741824));
        cz0 cz0Var = this.K0;
        if (cz0Var != null) {
            cz0Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.B0.f35877a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.B0.f35878b, 1073741824));
            this.K0.setScaleX(this.A0);
            this.K0.setScaleY(this.A0);
        }
        C0();
        this.I0.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
        measureChild(this.M0, i3, i10);
        measureChild(this.V0, i3, i10);
        measureChild(this.O0, i3, i10);
        measureChild(this.N0, i3, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(getPKeyboardHeight(), this.T1), 1073741824));
        FrameLayout frameLayout = this.L0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.f22602m, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i3, i10);
        this.f56001z0 = false;
        if (org.telegram.messenger.g0.L(20.0f) >= 0 && !this.Q1 && !this.S1) {
            this.f56001z0 = true;
            l0();
            this.f56001z0 = false;
        }
        if (org.telegram.messenger.g0.L(20.0f) < 0) {
            l0();
        }
        ey eyVar = this.P1;
        if (eyVar != null) {
            measureChild(eyVar, i3, i10);
        }
    }

    public final void p0(j jVar) {
        if (jVar == null) {
            return;
        }
        this.f55981p0.b(jVar.getUUID(), new s(this, jVar, 0));
    }

    @Override
    public final boolean q() {
        return true;
    }

    public final void q0(j jVar) {
        j jVar2 = this.C0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.f56085n0, false);
            this.C0 = null;
            if (jVar instanceof l2) {
                ValueAnimator valueAnimator = this.T0;
                if (valueAnimator != null && this.R0 != 0) {
                    valueAnimator.cancel();
                }
                B0(0);
            }
        }
        this.J0.removeView(jVar);
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            tg.k1 k1Var = this.f55981p0;
            k1Var.f55240b.remove(uuid);
            k1Var.f55241c.remove(uuid);
            org.telegram.messenger.g0.h3(new r4.u(k1Var, 8));
        }
        l1 l1Var = this.V0;
        y00 y00Var = this.W0;
        l1Var.setValueOverride(y00Var);
        l1Var.setShowPreview(true);
        float f10 = y00Var.get();
        tg.h1 h1Var = this.f55992u1;
        h1Var.f55188c = f10;
        s0(h1Var, null);
    }

    @Override
    public final boolean r() {
        return !this.D0;
    }

    public final boolean r0(j jVar, boolean z10) {
        f0 f0Var;
        boolean z11;
        int i3;
        boolean z12 = jVar instanceof l2;
        int i10 = 2;
        if (z12 && (((i3 = this.R0) == -1 && this.Q0 != 2) || (i3 != -1 && i3 != 2))) {
            ValueAnimator valueAnimator = this.T0;
            if (valueAnimator != null && i3 != 2) {
                valueAnimator.cancel();
            }
            if (this.f55994v1) {
                w0(false);
            }
            B0(2);
        }
        if (z12 && z10) {
            l2 l2Var = (l2) jVar;
            int gravity = l2Var.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i10 = 0;
                }
            } else {
                i10 = 1;
            }
            d1 d1Var = this.f55968e1;
            d1Var.setAlignment(i10);
            d1Var.setTypeface(l2Var.getTypeface().f55128a);
            d1Var.e(l2Var.getType(), true);
            this.N0.invalidate();
        }
        j jVar2 = this.C0;
        if (jVar2 != null) {
            if (jVar2 == jVar) {
                if (!this.D0) {
                    int[] i02 = i0(jVar2);
                    y0(new s(this, jVar2, 1), this, 51, i02[0], i02[1] - org.telegram.messenger.g0.L(32.0f));
                    return true;
                }
                if (jVar2 instanceof l2) {
                    org.telegram.messenger.g0.K3(((l2) jVar2).getFocusedView());
                    k0(false);
                }
                return true;
            }
            f0Var = this;
            jVar2.l(jVar2.f56085n0, false);
            j jVar3 = f0Var.C0;
            if (jVar3 instanceof l2) {
                l2 l2Var2 = (l2) jVar3;
                k2 k2Var = l2Var2.f56141r0;
                k2Var.clearFocus();
                k2Var.setEnabled(false);
                k2Var.setClickable(false);
                l2Var2.m();
                if (!z12) {
                    f0Var.D0 = false;
                    org.telegram.messenger.g0.v1(((l2) f0Var.C0).getFocusedView());
                    k0(false);
                }
            }
            z11 = true;
        } else {
            f0Var = this;
            z11 = false;
        }
        j jVar4 = f0Var.C0;
        f0Var.C0 = jVar;
        if ((jVar4 instanceof l2) && TextUtils.isEmpty(((l2) jVar4).getText())) {
            q0(jVar4);
        }
        j jVar5 = f0Var.C0;
        y00 y00Var = f0Var.W0;
        tg.h1 h1Var = f0Var.f55992u1;
        l1 l1Var = f0Var.V0;
        if (jVar5 != null) {
            yg0 yg0Var = f0Var.I0;
            jVar5.f56085n0 = yg0Var;
            jVar5.l(yg0Var, true);
            f0Var.J0.bringChildToFront(f0Var.C0);
            j jVar6 = f0Var.C0;
            if (jVar6 instanceof l2) {
                l2 l2Var3 = (l2) jVar6;
                l2Var3.A0 = false;
                l2Var3.getSwatch().f55188c = h1Var.f55188c;
                s0(l2Var3.getSwatch(), null);
                l1Var.setValueOverride(new w4(l2Var3, (int) (f0Var.B0.f35877a / 9.0f), 1));
                l1Var.setShowPreview(false);
                return true;
            }
            l1Var.setValueOverride(y00Var);
            l1Var.setShowPreview(true);
            h1Var.f55188c = y00Var.get();
            s0(h1Var, null);
            return true;
        }
        ValueAnimator valueAnimator2 = f0Var.T0;
        if (valueAnimator2 != null && f0Var.R0 != 0) {
            valueAnimator2.cancel();
        }
        if (f0Var.f55994v1) {
            w0(false);
        }
        B0(0);
        l1Var.setValueOverride(y00Var);
        l1Var.setShowPreview(true);
        h1Var.f55188c = y00Var.get();
        s0(h1Var, null);
        return z11;
    }

    @Override
    public final void requestLayout() {
        if (this.f56001z0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(tg.h1 h1Var, Integer num) {
        tg.h1 h1Var2 = this.f55992u1;
        if (h1Var2 != h1Var) {
            h1Var2.f55186a = h1Var.f55186a;
            h1Var2.f55187b = h1Var.f55187b;
            h1Var2.f55188c = h1Var.f55188c;
            int i3 = this.f56002z1;
            tg.k0.e(i3).h(h1Var.f55186a, true);
            tg.k0.e(i3).j(h1Var.f55188c);
        }
        int i10 = h1Var.f55186a;
        a0 a0Var = this.G0;
        a0Var.setColor(i10);
        a0Var.setBrushSize(h1Var.f55188c);
        int i11 = h1Var2.f55186a;
        if (num != null && num.intValue() != i11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new b4(this, num, i11, 3));
            duration.start();
        } else {
            d0 d0Var = this.M0;
            if (d0Var != null) {
                d0Var.invalidate();
            }
        }
        j jVar = this.C0;
        if (jVar instanceof l2) {
            ((l2) jVar).setSwatch(new tg.h1(h1Var.f55187b, h1Var.f55188c, h1Var.f55186a));
        }
    }

    public void setBlurredBackgroundDrawableForTools(gh.g gVar) {
        gVar.q(org.telegram.messenger.g0.L(4.0f));
        this.M1 = gVar;
    }

    public void setDrawShadow(boolean z10) {
        this.G1 = z10;
        invalidate();
        setClipChildren(!z10);
    }

    public void setOffsetTranslationX(float f10) {
        if (this.Q0 == 0) {
            this.V0.setTranslationX(f10);
        }
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.E1 = runnable;
    }

    public final void t0(float f10) {
        this.m0 = f10;
        this.L0.setTranslationY(-f10);
        this.M0.setTranslationY(f10);
    }

    @Override
    public final void u() {
        p3 p3Var;
        if (!this.R1 && !this.Q1) {
            h0(true);
            return;
        }
        boolean z10 = this.Q1;
        if (z10 && (p3Var = ((lp0) this).Y1.L1) != null) {
            p3Var.f13361e = true;
        }
        x0(!z10 ? 1 : 0);
        if (z10) {
            j jVar = this.C0;
            if (jVar instanceof l2) {
                org.telegram.messenger.g0.K3(((l2) jVar).getEditText());
            }
        }
    }

    @Override
    public final void updateColors() {
        this.f56000y1.setColor(-15132391);
    }

    @Override
    public final void v(float f10, float f11, float[] fArr) {
        Point point = org.telegram.messenger.g0.f22608q;
        double d = f10 - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.J0.getRotation());
        double d10 = f11 - (point.y / 2.0f);
        fArr[0] = (point.x / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        fArr[1] = (point.y / 2.0f) + ((float) k2.p1.c(radians, d10, Math.sin(radians) * d));
    }

    public final void v0(float f10, float f11, float f12, float f13, float f14) {
        View view;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        this.f55987s0 = f10;
        this.f55997x0 = f13;
        this.f55999y0 = f14;
        this.f55989t0 = f11;
        this.f55991u0 = f12;
        this.f55993v0 = f11;
        float f22 = f12 + 0.0f;
        this.f55995w0 = f22;
        for (int i3 = 0; i3 < 4; i3++) {
            if (i3 == 0) {
                view = this.J0;
            } else if (i3 == 1) {
                view = this.I0;
            } else if (i3 == 2) {
                view = this.G0;
            } else {
                view = this.H0;
            }
            re reVar = this.f55985r0;
            if (reVar != null) {
                float f23 = reVar.f25112c * 1.0f;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                if (measuredWidth != 0 && measuredHeight != 0) {
                    int i10 = reVar.f25117k;
                    if (i10 == 90 || i10 == 270) {
                        measuredHeight = measuredWidth;
                        measuredWidth = measuredHeight;
                    }
                    float max = Math.max(f13 / ((int) (reVar.f25113e * f20)), f14 / ((int) (reVar.f25114f * f21)));
                    f16 = f23 * max;
                    float C = com.google.android.recaptcha.internal.a.C(reVar.f25110a, measuredWidth, f10, max);
                    float f24 = reVar.f25112c;
                    f17 = (C * f24) + f11;
                    f15 = 1.0f;
                    f18 = (reVar.f25111b * measuredHeight * f10 * max * f24) + f22;
                    f19 = reVar.d + i10;
                } else {
                    return;
                }
            } else {
                f15 = 1.0f;
                if (i3 == 0) {
                    f16 = this.A0 * 1.0f;
                } else {
                    f16 = 1.0f;
                }
                f17 = f11;
                f18 = f22;
                f19 = 0.0f;
            }
            float f25 = ((-this.T1) / 2.0f) + f18;
            float f26 = f10 * f16;
            if (Float.isNaN(f26)) {
                f26 = f15;
            }
            view.setScaleX(f26);
            view.setScaleY(f26);
            view.setTranslationX(f17);
            view.setTranslationY(f25);
            view.setRotation(f19);
            view.invalidate();
        }
        C0();
        invalidate();
    }

    @Override
    public final tg.k0 w() {
        return tg.k0.e(this.f56002z1);
    }

    public final void w0(final boolean z10) {
        float f10;
        boolean z11;
        if (this.f55994v1 != z10) {
            this.f55994v1 = z10;
            q1.g gVar = this.f55996w1;
            if (gVar != null) {
                gVar.d();
            }
            float f11 = 1000.0f;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1000.0f;
            }
            q1.g gVar2 = new q1.g(new q1.f(f10));
            this.f55996w1 = gVar2;
            q1.h hVar = new q1.h();
            if (!z10) {
                f11 = 0.0f;
            }
            hVar.f53661i = f11;
            hVar.b(1250.0f);
            hVar.a(1.0f);
            gVar2.f53653m = hVar;
            if (!this.R1 && !this.Q1) {
                z11 = false;
            } else {
                z11 = true;
            }
            final boolean[] zArr = {z11};
            final float translationY = this.M0.getTranslationY();
            final ViewGroup barView = getBarView();
            this.f55996w1.b(new q1.d() {
                @Override
                public final void a(q1.g gVar3, float f12, float f13) {
                    int i3;
                    f0 f0Var = f0.this;
                    d0 d0Var = f0Var.M0;
                    float f14 = f12 / 1000.0f;
                    f0Var.f55998x1 = f14;
                    float f15 = ((1.0f - f14) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f15);
                    view.setScaleY(f15);
                    view.setTranslationY((Math.min(f0Var.f55998x1, 0.25f) * org.telegram.messenger.g0.L(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(f0Var.f55998x1, 0.25f) / 0.25f));
                    c0 c0Var = f0Var.f55984q1;
                    float f16 = f0Var.f55998x1;
                    boolean z12 = z10;
                    c0Var.B1(z12, f16);
                    f0Var.f55975l0.setProgress(f0Var.f55998x1);
                    f0Var.f55974k0.setProgress(f0Var.f55998x1);
                    f0Var.P0.setTranslationY(org.telegram.messenger.g0.L(32.0f) * f0Var.f55998x1);
                    if (zArr[0]) {
                        float f17 = f0Var.f55998x1;
                        if (!z12) {
                            f17 = 1.0f - f17;
                        }
                        float L = org.telegram.messenger.g0.L(40.0f) * f17;
                        if (z12) {
                            i3 = 1;
                        } else {
                            i3 = -1;
                        }
                        d0Var.setTranslationY(translationY - (L * i3));
                    }
                    d0Var.invalidate();
                    if (view == f0Var.f55968e1) {
                        f0Var.N0.invalidate();
                    }
                }
            });
            this.f55996w1.a(new r(this, z10, 1));
            this.f55996w1.h();
            if (z10) {
                c0 c0Var = this.f55984q1;
                c0Var.setVisibility(0);
                c0Var.setSelectedColorIndex(tg.k0.e(this.f56002z1).d());
            }
        }
    }

    public final void x0(int i3) {
        boolean z10;
        int i10;
        d1 d1Var = this.f55968e1;
        if (i3 == 1) {
            ey eyVar = this.P1;
            if (eyVar != null && eyVar.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ey eyVar2 = this.P1;
            if (eyVar2 != null && eyVar2.f33529d1 != h10.f22829t0) {
                removeView(eyVar2);
                this.P1 = null;
            }
            if (this.P1 == null) {
                ey eyVar3 = new ey(null, true, false, false, getContext(), false, null, null, true, this.A1, false, false);
                this.P1 = eyVar3;
                eyVar3.V0 = true;
                eyVar3.setVisibility(8);
                if (org.telegram.messenger.g0.Q1()) {
                    this.P1.setForseMultiwindowLayout(true);
                }
                this.P1.setDelegate(new z(this));
                addView(this.P1);
            }
            this.P1.setVisibility(0);
            this.Q1 = true;
            ey eyVar4 = this.P1;
            if (this.U1 <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.U1 = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.U1 = hp.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                }
            }
            if (this.V1 <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.V1 = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.V1 = hp.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                }
            }
            Point point = org.telegram.messenger.g0.f22608q;
            if (point.x > point.y) {
                i10 = this.V1;
            } else {
                i10 = this.U1;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) eyVar4.getLayoutParams();
            layoutParams.height = i10;
            eyVar4.setLayoutParams(layoutParams);
            if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                j jVar = this.C0;
                if (jVar instanceof l2) {
                    org.telegram.messenger.g0.v1(((l2) jVar).getEditText());
                }
            }
            this.T1 = i10;
            requestLayout();
            p3 p3Var = ((lp0) this).Y1.L1;
            if (p3Var != null) {
                p3Var.a();
            }
            hg emojiButton = d1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(fg.d, true);
            }
            getHeight();
            if (!z10 && !this.R1) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.T1, 0.0f);
                ofFloat.addUpdateListener(new o(this, 1));
                ofFloat.addListener(new y(this, 0));
                ofFloat.start();
                return;
            }
            return;
        }
        hg emojiButton2 = d1Var.getEmojiButton();
        if (emojiButton2 != null) {
            emojiButton2.j(fg.f33793e, true);
        }
        ey eyVar5 = this.P1;
        if (eyVar5 != null) {
            this.Q1 = false;
            if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                eyVar5.setVisibility(8);
            }
        }
        if (i3 == 0) {
            this.T1 = 0;
        }
        p3 p3Var2 = ((lp0) this).Y1.L1;
        if (p3Var2 != null) {
            p3Var2.a();
        }
        requestLayout();
        getHeight();
    }

    public final void y0(Runnable runnable, f0 f0Var, int i3, int i10, int i11) {
        org.telegram.ui.ActionBar.f1 f1Var = this.B1;
        if (f1Var != null && f1Var.isShowing()) {
            this.B1.d(true);
            return;
        }
        if (this.C1 == null) {
            this.D1 = new Rect();
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), this.A1);
            this.C1 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(true);
            this.C1.setBackgroundColor(-14145495);
            this.C1.setOnTouchListener(new k4(2, this));
            this.C1.setDispatchKeyEventListener(new q(this));
            this.C1.setShownFromBottom(true);
        }
        this.C1.d();
        runnable.run();
        if (this.B1 == null) {
            org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(this.C1, -2, -2);
            this.B1 = f1Var2;
            f1Var2.f27493b = true;
            f1Var2.setAnimationStyle(2131755191);
            this.B1.setOutsideTouchable(true);
            this.B1.setClippingEnabled(true);
            this.B1.setInputMethodMode(2);
            this.B1.setSoftInputMode(0);
            this.B1.getContentView().setFocusableInTouchMode(true);
            this.B1.setOnDismissListener(new m4(2, this));
        }
        this.C1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
        this.B1.setFocusable(true);
        this.B1.showAtLocation(f0Var, i3, i10 - (this.C1.getMeasuredWidth() / 2), i11 - this.C1.getMeasuredHeight());
        org.telegram.ui.ActionBar.f1.i(this.C1);
    }

    @Override
    public final void z() {
        y0(new n(this, 4), this, 53, 0, getHeight());
    }

    public final void z0(boolean z10) {
        float f10;
        if (this.f55980o1 != z10) {
            this.f55980o1 = z10;
            q1.g gVar = this.f55982p1;
            if (gVar != null) {
                gVar.d();
            }
            float f11 = 1000.0f;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1000.0f;
            }
            q1.g gVar2 = new q1.g(new q1.f(f10));
            this.f55982p1 = gVar2;
            q1.h hVar = new q1.h();
            if (!z10) {
                f11 = 0.0f;
            }
            hVar.f53661i = f11;
            hVar.b(1250.0f);
            hVar.a(1.0f);
            gVar2.f53653m = hVar;
            if (z10) {
                i1 i1Var = this.f55969f1;
                i1Var.setAlpha(0.0f);
                i1Var.setVisibility(0);
            }
            this.f55982p1.b(new ei.a8(3, this));
            this.f55982p1.a(new r(this, z10, 0));
            this.f55982p1.h();
        }
    }

    @Override
    public final void A(boolean z10) {
    }

    @Override
    public final void d(boolean z10) {
    }

    @Override
    public final void e(boolean z10) {
    }

    @Override
    public final void l(boolean z10) {
    }

    @Override
    public final void B() {
    }

    @Override
    public final void g() {
    }

    public View getView() {
        return this;
    }

    @Override
    public final void h() {
    }

    @Override
    public final void x() {
    }
}
