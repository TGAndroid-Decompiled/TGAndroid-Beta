package tg;

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
import c8.ha;
import di.g3;
import fi.a5;
import fi.b5;
import fi.e4;
import fi.k4;
import fi.n4;
import fi.p4;
import fi.q3;
import fi.y4;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import org.telegram.messenger.a8;
import org.telegram.messenger.g20;
import org.telegram.messenger.h20;
import org.telegram.messenger.i6;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.messenger.k5;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.q5;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.ye;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.hg;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.jg;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.cn0;
import org.telegram.ui.l00;
import org.telegram.ui.sq0;
import org.telegram.ui.up0;
public abstract class g0 extends st0 implements g1, h, c1, qt0, ls {
    public mt0 A0;
    public org.telegram.ui.ActionBar.g1 A1;
    public j B0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout B1;
    public boolean C0;
    public Rect C1;
    public int D0;
    public Runnable D1;
    public final boolean E0;
    public final sg.l0 E1;
    public final b0 F0;
    public boolean F1;
    public final l00 G0;
    public float G1;
    public final sq0 H0;
    public boolean H1;
    public final c0 I0;
    public final w5 I1;
    public dz0 J0;
    public final Paint J1;
    public final FrameLayout K0;
    public final Paint K1;
    public final e0 L0;
    public fh.g L1;
    public final v41 M0;
    public final float[] M1;
    public final FrameLayout N0;
    public final int[] N1;
    public a5 O0;
    public hy O1;
    public int P0;
    public boolean P1;
    public int Q0;
    public boolean Q1;
    public float R0;
    public boolean R1;
    public ValueAnimator S0;
    public int S1;
    public boolean T0;
    public int T1;
    public final m1 U0;
    public int U1;
    public final rt V0;
    public int V1;
    public ArrayList W0;
    public boolean W1;
    public final int X0;
    public BigInteger Y0;
    public TextView Z0;
    public TextView f55666a1;
    public TextView f55667b1;
    public final h1 f55668c1;
    public final e1 f55669d1;
    public final j1 f55670e1;
    public final ImageView f55671f1;
    public final LinearLayout f55672g1;
    public final TextView f55673h1;
    public final TextView f55674i1;
    public final v0 f55675j0;
    public final TextView f55676j1;
    public final z0 f55677k0;
    public final Paint f55678k1;
    public float f55679l0;
    public final Paint l1;
    public final Bitmap m0;
    public float f55680m1;
    public final Bitmap f55681n0;
    public boolean n1;
    public final sg.m1 f55682o0;
    public r1.g f55683o1;
    public final q5 f55684p0;
    public final d0 f55685p1;
    public final ye f55686q0;
    public final Paint f55687q1;
    public float f55688r0;
    public final Paint f55689r1;
    public float f55690s0;
    public final Paint f55691s1;
    public float f55692t0;
    public final sg.j1 f55693t1;
    public float f55694u0;
    public boolean f55695u1;
    public float f55696v0;
    public r1.g f55697v1;
    public float f55698w0;
    public float f55699w1;
    public float f55700x0;
    public final Paint f55701x1;
    public boolean f55702y0;
    public final int f55703y1;
    public float f55704z0;
    public final u f55705z1;

    public g0(Context context, Activity activity, int i7, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, ye yeVar, cn0 cn0Var, final f6 f6Var) {
        super(context, activity);
        boolean z9;
        float f10;
        int i11;
        org.telegram.messenger.f6[] f6VarArr;
        n1 n1Var;
        boolean z10 = false;
        this.P0 = 0;
        this.Q0 = -1;
        final up0 up0Var = (up0) this;
        this.V0 = new rt(up0Var, 16);
        byte b10 = 1;
        this.f55678k1 = new Paint(1);
        this.l1 = new Paint(1);
        this.f55687q1 = new Paint(1);
        this.f55689r1 = new Paint(1);
        this.f55691s1 = new Paint(1);
        sg.j1 j1Var = new sg.j1(1.0f, 0.016773745f, -1);
        this.f55693t1 = j1Var;
        this.f55701x1 = new Paint(1);
        this.H1 = false;
        this.I1 = new w5((View) this, 350L, xq.h);
        this.J1 = new Paint(1);
        Paint paint = new Paint(1);
        this.K1 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new Matrix();
        this.M1 = new float[2];
        this.N1 = new int[2];
        new y(up0Var, 0);
        setDelegate(this);
        this.f55703y1 = i7;
        this.f55705z1 = new f6() {
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
                return k6.f28184v3;
            }

            @Override
            public final Paint d(String str) {
                return k6.V0(str);
            }

            @Override
            public final boolean e() {
                return iz.H0;
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
                    if (i12 == k6.f27925h5) {
                        return -14737633;
                    }
                    if (i12 == k6.f27960j5) {
                        return -592138;
                    }
                    if (i12 == k6.f28110r5) {
                        return -8553091;
                    }
                    if (i12 != k6.f28214wf) {
                        if (i12 == k6.f28270zf) {
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
                            if (i12 == k6.f27944i6) {
                                return 536870911;
                            }
                            if (i12 != k6.f28160ti && i12 != k6.f28141si && i12 != k6.f28180ui) {
                                if (i12 == k6.f28198vi) {
                                    return 352321535;
                                }
                                if (i12 != k6.f28252yf && i12 != i13) {
                                    if (i12 == k6.f28233xf) {
                                        return 780633991;
                                    }
                                    if (i12 == k6.f27796a7) {
                                        return -15921907;
                                    }
                                    if (i12 == k6.f28018m7) {
                                        return -12500671;
                                    }
                                    if (i12 == k6.f28000l7) {
                                        return -13133079;
                                    }
                                    if (i12 == k6.f28035n7) {
                                        return -1;
                                    }
                                    if (i12 == k6.f27852d6) {
                                        return -15198183;
                                    }
                                    if (i12 == k6.f27853d7) {
                                        return -16777216;
                                    }
                                    f6 f6Var2 = f6.this;
                                    if (f6Var2 != null) {
                                        return f6Var2.h(i12);
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
        this.f55686q0 = yeVar;
        this.E0 = context instanceof BubbleActivity;
        sg.l0 e10 = sg.l0.e(i7);
        this.E1 = e10;
        e10.i(0, true);
        j1Var.f55109a = e10.c();
        j1Var.f55111c = e10.f55133i;
        q5 q5Var = new q5("Paint", true);
        this.f55684p0 = q5Var;
        this.m0 = bitmap;
        this.f55681n0 = bitmap2;
        this.X0 = i10;
        sg.m1 m1Var = new sg.m1();
        this.f55682o0 = m1Var;
        m1Var.f55147a = new m3(up0Var, 20);
        byte b11 = 2;
        b0 b0Var = new b0(up0Var, context, new sg.j0(getPaintingSize(), bitmap2, i10, null), bitmap, bitmap2);
        this.F0 = b0Var;
        b0Var.setDelegate(new sg.i0(up0Var, cn0Var, false, 3));
        b0Var.setUndoStore(m1Var);
        b0Var.setQueue(q5Var);
        b0Var.setVisibility(4);
        addView(b0Var, ha.e(-1, -1, 51));
        l00 l00Var = new l00(12, context, up0Var);
        this.G0 = l00Var;
        l00Var.setVisibility(4);
        addView(l00Var, ha.e(-1, -1, 51));
        c0 c0Var = new c0(up0Var, context, new org.telegram.ui.Components.n(up0Var));
        this.I0 = c0Var;
        addView(c0Var);
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                h20 h20Var = (h20) arrayList.get(i12);
                byte b12 = h20Var.f22813a;
                if (b12 == 0) {
                    f10 = 2.0f;
                    ?? g02 = g0(h20Var.C, h20Var.B, z10);
                    if ((h20Var.f22814b & 2) != 0) {
                        g02.r(z10);
                    }
                    ViewGroup.LayoutParams layoutParams = g02.getLayoutParams();
                    layoutParams.width = h20Var.f22827q;
                    layoutParams.height = h20Var.f22828r;
                    i11 = size;
                    n1Var = g02;
                } else {
                    f10 = 2.0f;
                    if (b12 == b10) {
                        ?? h02 = h0(z10);
                        h02.setType(h20Var.f22814b);
                        h02.setTypeface(h20Var.f22824n);
                        h02.setBaseFontSize(h20Var.f22823m);
                        SpannableString spannableString = new SpannableString(h20Var.f22820j);
                        ?? r15 = h20Var.f22821k;
                        int size2 = r15.size();
                        int i13 = z10;
                        while (i13 < size2) {
                            Object obj = r15.get(i13);
                            int i14 = i13 + 1;
                            g20 g20Var = (g20) obj;
                            r5 r5Var = new r5(g20Var.document_id, h02.getFontMetricsInt());
                            int i15 = g20Var.offset;
                            spannableString.setSpan(r5Var, i15, g20Var.length + i15, 33);
                            size = size;
                            size2 = size2;
                            i13 = i14;
                        }
                        i11 = size;
                        CharSequence m10 = i6.m(spannableString, h02.getFontMetricsInt(), false, null, 0);
                        if ((m10 instanceof Spanned) && (f6VarArr = (org.telegram.messenger.f6[]) ((Spanned) m10).getSpans(0, m10.length(), org.telegram.messenger.f6.class)) != null) {
                            for (org.telegram.messenger.f6 f6Var2 : f6VarArr) {
                                f6Var2.f22370b = 0.85f;
                            }
                        }
                        h02.setText(m10);
                        u0(h02, h20Var.f22826p);
                        sg.j1 swatch = h02.getSwatch();
                        swatch.f55109a = h20Var.f22822l;
                        h02.setSwatch(swatch);
                        n1Var = h02;
                    } else {
                        i11 = size;
                        byte b13 = b11;
                        if (b12 == b13) {
                            n1 f02 = f0(h20Var.f22820j, false);
                            f02.B0 = false;
                            if ((h20Var.f22814b & b13) != 0) {
                                f02.r(false);
                            }
                            if ((h20Var.f22814b & 16) != 0) {
                                f02.t(false);
                            }
                            ViewGroup.LayoutParams layoutParams2 = f02.getLayoutParams();
                            layoutParams2.width = h20Var.f22827q;
                            layoutParams2.height = h20Var.f22828r;
                            n1Var = f02;
                        } else {
                            i12++;
                            size = i11;
                            z10 = false;
                            b10 = 1;
                            b11 = 2;
                        }
                    }
                }
                n1Var.setX((h20Var.f22815c * this.A0.f36114a) - (((1.0f - h20Var.v) * h20Var.f22827q) / f10));
                n1Var.setY((h20Var.d * this.A0.f36115b) - (((1.0f - h20Var.v) * h20Var.f22828r) / f10));
                n1Var.setPosition(new PointF((h20Var.f22827q / f10) + n1Var.getX(), (h20Var.f22828r / f10) + n1Var.getY()));
                n1Var.setScale(h20Var.v);
                n1Var.setRotation((float) (((-h20Var.f22816e) / 3.141592653589793d) * 180.0d));
                i12++;
                size = i11;
                z10 = false;
                b10 = 1;
                b11 = 2;
            }
        }
        this.I0.setVisibility(4);
        sq0 sq0Var = new sq0(context, 17);
        this.H0 = sq0Var;
        addView(sq0Var);
        ?? frameLayout = new FrameLayout(context);
        this.K0 = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{-16777216, 0}));
        addView(frameLayout, ha.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.f55671f1 = imageView;
        imageView.setImageResource(2131232531);
        imageView.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        imageView.setBackground(k6.h0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        up0 up0Var2 = up0Var;
                        b0 b0Var2 = up0Var2.F0;
                        if (b0Var2 != null && (b0Var2.getCurrentBrush() instanceof sg.g)) {
                            b0Var2.b();
                            up0Var2.f55668c1.setSelectedIndex(1);
                            up0Var2.w((sg.h) sg.h.f55060a.get(0));
                            return;
                        }
                        up0Var2.f55682o0.c();
                        return;
                    case 1:
                        up0 up0Var3 = up0Var;
                        b0 b0Var3 = up0Var3.F0;
                        sg.m1 m1Var2 = up0Var3.f55682o0;
                        if (m1Var2.a()) {
                            if (b0Var3 != null && (b0Var3.getCurrentBrush() instanceof sg.g)) {
                                b0Var3.b();
                                up0Var3.f55668c1.setSelectedIndex(1);
                                up0Var3.w((sg.h) sg.h.f55060a.get(0));
                            }
                            b0Var3.a();
                            m1Var2.f55149c.clear();
                            m1Var2.f55148b.clear();
                            org.telegram.messenger.g0.h3(new sg.t0(m1Var2, 1));
                            up0Var3.I0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        up0 up0Var4 = up0Var;
                        j jVar = up0Var4.B0;
                        if (jVar instanceof k2) {
                            org.telegram.messenger.g0.v1(((k2) jVar).getFocusedView());
                        }
                        if (up0Var4.P1) {
                            up0Var4.k0(false);
                        }
                        up0Var4.q0(up0Var4.B0);
                        up0Var4.r0(null, true);
                        return;
                    default:
                        up0Var.r0(null, true);
                        return;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout.addView(imageView, ha.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f55672g1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(k6.h0(822083583, 7, -1));
        linearLayout.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 16.0f);
        textView.setText(id.M0(2131747268, null));
        linearLayout.addView(org.telegram.messenger.camera.q.e(context, 2131232532), ha.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, ha.r(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new bi.l1(22));
        frameLayout.addView(linearLayout, ha.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.f55673h1 = textView2;
        textView2.setBackground(k6.h0(822083583, 7, -1));
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView2.setText(id.M0(2131747280, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        up0 up0Var2 = up0Var;
                        b0 b0Var2 = up0Var2.F0;
                        if (b0Var2 != null && (b0Var2.getCurrentBrush() instanceof sg.g)) {
                            b0Var2.b();
                            up0Var2.f55668c1.setSelectedIndex(1);
                            up0Var2.w((sg.h) sg.h.f55060a.get(0));
                            return;
                        }
                        up0Var2.f55682o0.c();
                        return;
                    case 1:
                        up0 up0Var3 = up0Var;
                        b0 b0Var3 = up0Var3.F0;
                        sg.m1 m1Var2 = up0Var3.f55682o0;
                        if (m1Var2.a()) {
                            if (b0Var3 != null && (b0Var3.getCurrentBrush() instanceof sg.g)) {
                                b0Var3.b();
                                up0Var3.f55668c1.setSelectedIndex(1);
                                up0Var3.w((sg.h) sg.h.f55060a.get(0));
                            }
                            b0Var3.a();
                            m1Var2.f55149c.clear();
                            m1Var2.f55148b.clear();
                            org.telegram.messenger.g0.h3(new sg.t0(m1Var2, 1));
                            up0Var3.I0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        up0 up0Var4 = up0Var;
                        j jVar = up0Var4.B0;
                        if (jVar instanceof k2) {
                            org.telegram.messenger.g0.v1(((k2) jVar).getFocusedView());
                        }
                        if (up0Var4.P1) {
                            up0Var4.k0(false);
                        }
                        up0Var4.q0(up0Var4.B0);
                        up0Var4.r0(null, true);
                        return;
                    default:
                        up0Var.r0(null, true);
                        return;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView i16 = org.telegram.ui.Cells.f1.i(frameLayout, textView2, ha.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.f55674i1 = i16;
        i16.setBackground(k6.h0(822083583, 7, -1));
        i16.setText(id.M0(2131752101, null));
        i16.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        i16.setGravity(16);
        i16.setTextColor(-1);
        i16.setTypeface(org.telegram.messenger.g0.o());
        i16.setTextSize(1, 16.0f);
        i16.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        up0 up0Var2 = up0Var;
                        b0 b0Var2 = up0Var2.F0;
                        if (b0Var2 != null && (b0Var2.getCurrentBrush() instanceof sg.g)) {
                            b0Var2.b();
                            up0Var2.f55668c1.setSelectedIndex(1);
                            up0Var2.w((sg.h) sg.h.f55060a.get(0));
                            return;
                        }
                        up0Var2.f55682o0.c();
                        return;
                    case 1:
                        up0 up0Var3 = up0Var;
                        b0 b0Var3 = up0Var3.F0;
                        sg.m1 m1Var2 = up0Var3.f55682o0;
                        if (m1Var2.a()) {
                            if (b0Var3 != null && (b0Var3.getCurrentBrush() instanceof sg.g)) {
                                b0Var3.b();
                                up0Var3.f55668c1.setSelectedIndex(1);
                                up0Var3.w((sg.h) sg.h.f55060a.get(0));
                            }
                            b0Var3.a();
                            m1Var2.f55149c.clear();
                            m1Var2.f55148b.clear();
                            org.telegram.messenger.g0.h3(new sg.t0(m1Var2, 1));
                            up0Var3.I0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        up0 up0Var4 = up0Var;
                        j jVar = up0Var4.B0;
                        if (jVar instanceof k2) {
                            org.telegram.messenger.g0.v1(((k2) jVar).getFocusedView());
                        }
                        if (up0Var4.P1) {
                            up0Var4.k0(false);
                        }
                        up0Var4.q0(up0Var4.B0);
                        up0Var4.r0(null, true);
                        return;
                    default:
                        up0Var.r0(null, true);
                        return;
                }
            }
        });
        i16.setAlpha(0.0f);
        i16.setVisibility(8);
        TextView i17 = org.telegram.ui.Cells.f1.i(frameLayout, i16, ha.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.f55676j1 = i17;
        i17.setBackground(k6.h0(822083583, 7, -1));
        i17.setText(id.M0(2131751355, null));
        i17.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        i17.setGravity(16);
        i17.setTextColor(-1);
        i17.setTypeface(org.telegram.messenger.g0.o());
        i17.setTextSize(1, 16.0f);
        i17.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        up0 up0Var2 = up0Var;
                        b0 b0Var2 = up0Var2.F0;
                        if (b0Var2 != null && (b0Var2.getCurrentBrush() instanceof sg.g)) {
                            b0Var2.b();
                            up0Var2.f55668c1.setSelectedIndex(1);
                            up0Var2.w((sg.h) sg.h.f55060a.get(0));
                            return;
                        }
                        up0Var2.f55682o0.c();
                        return;
                    case 1:
                        up0 up0Var3 = up0Var;
                        b0 b0Var3 = up0Var3.F0;
                        sg.m1 m1Var2 = up0Var3.f55682o0;
                        if (m1Var2.a()) {
                            if (b0Var3 != null && (b0Var3.getCurrentBrush() instanceof sg.g)) {
                                b0Var3.b();
                                up0Var3.f55668c1.setSelectedIndex(1);
                                up0Var3.w((sg.h) sg.h.f55060a.get(0));
                            }
                            b0Var3.a();
                            m1Var2.f55149c.clear();
                            m1Var2.f55148b.clear();
                            org.telegram.messenger.g0.h3(new sg.t0(m1Var2, 1));
                            up0Var3.I0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        up0 up0Var4 = up0Var;
                        j jVar = up0Var4.B0;
                        if (jVar instanceof k2) {
                            org.telegram.messenger.g0.v1(((k2) jVar).getFocusedView());
                        }
                        if (up0Var4.P1) {
                            up0Var4.k0(false);
                        }
                        up0Var4.q0(up0Var4.B0);
                        up0Var4.r0(null, true);
                        return;
                    default:
                        up0Var.r0(null, true);
                        return;
                }
            }
        });
        i17.setAlpha(0.0f);
        i17.setVisibility(8);
        frameLayout.addView(i17, ha.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        e0 e0Var = new e0(up0Var, context);
        this.L0 = e0Var;
        e0Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), 0);
        e0Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(e0Var, ha.e(-1, 104, 80));
        if (bitmap2 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        h1 h1Var = new h1(context, z9);
        this.f55668c1 = h1Var;
        h1Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        h1Var.setDelegate(this);
        h1Var.setSelectedIndex(1);
        e0Var.addView(h1Var, ha.c(48.0f, -1));
        e1 e1Var = new e1(context);
        this.f55669d1 = e1Var;
        e1Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        e1Var.setVisibility(8);
        e1Var.setDelegate(this);
        e1Var.setAlignment(sg.l0.e(i7).f55132g);
        e0Var.addView(e1Var, ha.c(48.0f, -1));
        v41 v41Var = new v41(up0Var, context);
        this.M0 = v41Var;
        addView(v41Var, ha.c(-1.0f, -1));
        j1 j1Var2 = new j1(context);
        this.f55670e1 = j1Var2;
        j1Var2.setVisibility(8);
        j1Var2.setOnItemClickListener(new ai.k(up0Var, 19));
        e1Var.setTypefaceListView(j1Var2);
        v41Var.addView(j1Var2, ha.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        Paint paint2 = this.f55678k1;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f55678k1.setColor(1728053247);
        this.f55678k1.setStrokeWidth(Math.max(2, org.telegram.messenger.g0.L(1.0f)));
        this.l1.setColor(k6.w0(k6.G8, this.f55705z1));
        d0 d0Var = new d0(up0Var, context);
        this.f55685p1 = d0Var;
        d0Var.setVisibility(8);
        d0Var.setColorPalette(sg.l0.e(i7));
        d0Var.setColorListener(new m(up0Var, 0));
        e0Var.addView(d0Var, ha.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        v0 v0Var = new v0(context);
        this.f55675j0 = v0Var;
        v0Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        v0Var.setBackground(k6.h0(1090519039, 1, -1));
        e0Var.addView(v0Var, ha.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        z0 z0Var = new z0(context);
        this.f55677k0 = z0Var;
        z0Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        z0Var.setBackground(k6.h0(1090519039, 1, -1));
        z0Var.setOnClickListener(new td0(up0Var, context, bitmap2, 3));
        e0Var.addView(z0Var, ha.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        m1 m1Var2 = new m1(context);
        this.U0 = m1Var2;
        m1Var2.setColorSwatch(this.f55693t1);
        m1Var2.setRenderView(this.F0);
        m1Var2.setValueOverride(this.V0);
        this.f55693t1.f55111c = this.V0.get();
        m1Var2.setOnUpdate(new org.telegram.ui.Wallet.g2(up0Var, i7, 7));
        addView(m1Var2, ha.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.N0 = frameLayout2;
        addView(frameLayout2, ha.c(-1.0f, -1));
        this.f55691s1.setStyle(style);
        this.f55691s1.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        s0(this.f55693t1, null);
        w((sg.h) sg.h.f55060a.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            Point point = org.telegram.messenger.g0.f22563q;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (point.y * 0.35f), org.telegram.messenger.g0.L(100.0f), (int) (point.y * 0.65d))));
        }
    }

    public static void X(up0 up0Var, Integer num) {
        up0Var.setNewColor(num.intValue());
        up0Var.w0(false);
    }

    public static void Y(tg.g0 r13) {
        throw new UnsupportedOperationException("Method not decompiled: tg.g0.Y(tg.g0):void");
    }

    public static void Z(g0 g0Var) {
        d2 d2Var;
        c0 c0Var = g0Var.I0;
        j jVar = g0Var.B0;
        if (jVar != null) {
            PointF A0 = g0Var.A0(jVar);
            j jVar2 = g0Var.B0;
            if (jVar2 instanceof d2) {
                d2 d2Var2 = new d2(g0Var.getContext(), (d2) g0Var.B0, A0);
                d2Var2.setDelegate(g0Var);
                c0Var.addView(d2Var2);
                d2Var = d2Var2;
            } else if (jVar2 instanceof k2) {
                k2 k2Var = new k2(g0Var.getContext(), (k2) g0Var.B0, A0);
                k2Var.setDelegate(g0Var);
                k2Var.setMaxWidth((int) (g0Var.getPaintingSize().f36114a - 20.0f));
                c0Var.addView(k2Var, ha.c(-2.0f, -2));
                d2Var = k2Var;
            } else {
                d2Var = null;
            }
            g0Var.p0(d2Var);
            g0Var.r0(d2Var, true);
        }
        org.telegram.ui.ActionBar.g1 g1Var = g0Var.A1;
        if (g1Var != null && g1Var.isShowing()) {
            g0Var.A1.d(true);
        }
    }

    public static void a0(up0 up0Var, Integer num) {
        sg.l0 l0Var = up0Var.E1;
        l0Var.h(num.intValue(), true);
        l0Var.g();
        up0Var.setNewColor(num.intValue());
        d0 d0Var = up0Var.f55685p1;
        d0Var.setSelectedColorIndex(l0Var.d());
        d0Var.getAdapter().f();
    }

    public ViewGroup getBarView() {
        if (this.P0 == 2) {
            return this.f55669d1;
        }
        return this.f55668c1;
    }

    private int getFrameRotation() {
        int i7 = this.X0;
        if (i7 != 90) {
            if (i7 != 180) {
                if (i7 != 270) {
                    return 0;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    private mt0 getPaintingSize() {
        int i7;
        mt0 mt0Var = this.A0;
        if (mt0Var != null) {
            return mt0Var;
        }
        Bitmap bitmap = this.m0;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        int o4 = iz.o();
        if (o4 != 0) {
            if (o4 != 2) {
                i7 = 2560;
            } else {
                i7 = 3840;
            }
        } else {
            i7 = 1280;
        }
        mt0 mt0Var2 = new mt0(width, height);
        float f10 = i7;
        mt0Var2.f36114a = f10;
        float floor = (float) Math.floor((f10 * height) / width);
        mt0Var2.f36115b = floor;
        if (floor > f10) {
            mt0Var2.f36115b = f10;
            mt0Var2.f36114a = (float) Math.floor((f10 * width) / height);
        }
        this.A0 = mt0Var2;
        return mt0Var2;
    }

    public void setNewColor(int i7) {
        sg.j1 j1Var = this.f55693t1;
        int i10 = j1Var.f55109a;
        j1Var.f55109a = i7;
        s0(j1Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new k4(this, i10, i7, 5));
        duration.start();
    }

    private void setTextType(int i7) {
        this.D0 = i7;
        j jVar = this.B0;
        if (jVar instanceof k2) {
            ((k2) jVar).setType(i7);
        }
        sg.l0 e10 = sg.l0.e(this.f55703y1);
        e10.h = i7;
        e10.f55127a.edit().putInt("text_type", i7).apply();
        this.f55669d1.setOutlineType(i7);
    }

    private void setupTabsLayout(Context context) {
        a5 a5Var = new a5(this, context);
        this.O0 = a5Var;
        a5Var.setClipToPadding(false);
        this.O0.setOrientation(0);
        this.L0.addView(this.O0, ha.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.Z0 = textView;
        textView.setText(id.M0(2131747278, null).toUpperCase());
        TextView textView2 = this.Z0;
        int i7 = k6.f27944i6;
        u uVar = this.f55705z1;
        r6.R(textView2, k6.h0(k6.w0(i7, uVar), 7, -1), null, r6.N(i7), uVar);
        this.Z0.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.Z0.setTextColor(-1);
        this.Z0.setTextSize(1, 14.0f);
        this.Z0.setGravity(1);
        this.Z0.setTypeface(org.telegram.messenger.g0.o());
        this.Z0.setSingleLine();
        this.Z0.setOnClickListener(new k(this, 0));
        this.O0.addView(this.Z0, ha.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.f55666a1 = textView3;
        textView3.setText(id.M0(2131747277, null).toUpperCase());
        r6.R(this.f55666a1, k6.h0(k6.w0(i7, uVar), 7, -1), null, r6.N(i7), uVar);
        this.f55666a1.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.f55666a1.setOnClickListener(new k(this, 1));
        this.f55666a1.setTextColor(-1);
        this.f55666a1.setTextSize(1, 14.0f);
        this.f55666a1.setGravity(1);
        this.f55666a1.setTypeface(org.telegram.messenger.g0.o());
        this.f55666a1.setAlpha(0.6f);
        this.f55666a1.setSingleLine();
        this.O0.addView(this.f55666a1, ha.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.f55667b1 = textView4;
        textView4.setText(id.M0(2131747276, null).toUpperCase());
        r6.R(this.f55667b1, k6.h0(k6.w0(i7, uVar), 7, -1), null, r6.N(i7), uVar);
        this.f55667b1.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.f55667b1.setTextColor(-1);
        this.f55667b1.setTextSize(1, 14.0f);
        this.f55667b1.setGravity(1);
        this.f55667b1.setTypeface(org.telegram.messenger.g0.o());
        this.f55667b1.setAlpha(0.6f);
        this.f55667b1.setSingleLine();
        this.f55667b1.setOnClickListener(new k(this, 4));
        this.O0.addView(this.f55667b1, ha.l(1.0f, 0, -2));
    }

    public static void u0(k2 k2Var, int i7) {
        int i10;
        k2Var.setAlign(i7);
        int i11 = 2;
        if (i7 != 1) {
            if (i7 != 2) {
                i10 = 19;
            } else {
                i10 = 21;
            }
        } else {
            i10 = 17;
        }
        k2Var.getEditText().setGravity(i10);
        if (i7 != 1) {
            if (i7 == 2 ? !id.f23157a0 : id.f23157a0) {
                i11 = 3;
            }
        } else {
            i11 = 4;
        }
        k2Var.getEditText().setTextAlignment(i11);
    }

    @Override
    public final void A() {
        y0(new n(this, 4), this, 53, 0, getHeight());
    }

    public final PointF A0(j jVar) {
        float f10 = 200.0f;
        ye yeVar = this.f55686q0;
        if (yeVar != null) {
            f10 = 200.0f / yeVar.f26637c;
        }
        if (jVar != null) {
            PointF position = jVar.getPosition();
            return new PointF(position.x + f10, position.y + f10);
        }
        float f11 = 100.0f;
        if (yeVar != null) {
            f11 = 100.0f / yeVar.f26637c;
        }
        PointF e02 = e0();
        while (true) {
            int i7 = 0;
            boolean z9 = false;
            while (true) {
                c0 c0Var = this.I0;
                if (i7 >= c0Var.getChildCount()) {
                    break;
                }
                View childAt = c0Var.getChildAt(i7);
                if (childAt instanceof j) {
                    PointF position2 = ((j) childAt).getPosition();
                    if (((float) Math.sqrt(Math.pow(position2.y - e02.y, 2.0d) + Math.pow(position2.x - e02.x, 2.0d))) < f11) {
                        z9 = true;
                    }
                }
                i7++;
            }
            if (!z9) {
                return e02;
            }
            e02 = new PointF(e02.x + f10, e02.y + f10);
        }
    }

    public final void B0(int i7) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z9;
        if (this.P0 != i7 && this.Q0 != i7) {
            ValueAnimator valueAnimator = this.S0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i10 = this.P0;
            ViewGroup viewGroup3 = this.f55669d1;
            ViewGroup viewGroup4 = this.f55668c1;
            if (i10 == 0) {
                viewGroup = viewGroup4;
            } else if (i10 == 2) {
                viewGroup = viewGroup3;
            } else {
                viewGroup = null;
            }
            this.Q0 = i7;
            if (i7 == 0) {
                viewGroup2 = viewGroup4;
            } else if (i7 == 2) {
                viewGroup2 = viewGroup3;
            } else {
                viewGroup2 = null;
            }
            int i11 = this.f55703y1;
            sg.l0 e10 = sg.l0.e(i11);
            if (i7 == 2) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (e10.f55136l != z9) {
                e10.f55136l = z9;
                if (z9) {
                    e10.i(-1, false);
                } else {
                    e10.i(e10.f55127a.getInt("brush", 0), false);
                }
            }
            int c10 = sg.l0.e(i11).c();
            sg.j1 j1Var = this.f55693t1;
            j1Var.f55109a = c10;
            s0(j1Var, null);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.S0 = duration;
            duration.setInterpolator(xq.f40366f);
            this.S0.addUpdateListener(new g3(this, viewGroup, viewGroup2, 4));
            this.S0.addListener(new b5(this, viewGroup, viewGroup2, i7, 3));
            this.S0.start();
        }
    }

    public final void C0() {
        int i7 = 0;
        while (true) {
            c0 c0Var = this.I0;
            if (i7 < c0Var.getChildCount()) {
                View childAt = c0Var.getChildAt(i7);
                if (childAt != this.B0) {
                    if (childAt instanceof j) {
                        j jVar = (j) childAt;
                        if (!jVar.f55784l0 && jVar.f55782j0 <= 0.0f) {
                        }
                    }
                    i7++;
                }
                ((j) childAt).m();
                i7++;
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
    public final void K(int i7, boolean z9) {
        boolean z10;
        boolean z11;
        int i10;
        if (i7 > org.telegram.messenger.g0.L(50.0f) && this.Q1 && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            if (z9) {
                this.U1 = i7;
                qp.d1().edit().putInt("kbd_height_land3", this.U1).commit();
            } else {
                this.T1 = i7;
                qp.d1().edit().putInt("kbd_height", this.T1).commit();
            }
        }
        if (this.P1) {
            if (z9) {
                i10 = this.U1;
            } else {
                i10 = this.T1;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.O1.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = org.telegram.messenger.g0.f22563q.x;
            if (i11 != i12 || layoutParams.height != i10) {
                layoutParams.width = i12;
                layoutParams.height = i10;
                this.O1.setLayoutParams(layoutParams);
                this.S1 = layoutParams.height;
                requestLayout();
                q3 q3Var = ((up0) this).X1.K1;
                if (q3Var != null) {
                    q3Var.a();
                }
                getHeight();
            }
        }
        if (this.V1 == i7 && this.W1 == z9) {
            getHeight();
            return;
        }
        this.V1 = i7;
        this.W1 = z9;
        boolean z12 = this.Q1;
        j jVar = this.B0;
        if (jVar instanceof k2) {
            if (((k2) jVar).getEditText().isFocused() && i7 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.Q1 = z11;
        } else {
            this.Q1 = false;
        }
        if (this.Q1 && this.P1) {
            x0(0);
        }
        if (this.S1 != 0 && !(z10 = this.Q1) && z10 != z12 && !this.P1) {
            this.S1 = 0;
            requestLayout();
            q3 q3Var2 = ((up0) this).X1.K1;
            if (q3Var2 != null) {
                q3Var2.a();
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
        hashSet.add(Integer.valueOf(k6.f27925h5));
        hashSet.add(Integer.valueOf(k6.f27960j5));
        hashSet.add(Integer.valueOf(k6.f28110r5));
        hashSet.add(Integer.valueOf(k6.f28214wf));
        hashSet.add(Integer.valueOf(k6.f28270zf));
        hashSet.add(Integer.valueOf(k6.Cf));
        hashSet.add(Integer.valueOf(k6.Gf));
        hashSet.add(Integer.valueOf(k6.Bf));
        hashSet.add(Integer.valueOf(k6.G6));
        hashSet.add(Integer.valueOf(k6.Ai));
        hashSet.add(Integer.valueOf(k6.f28160ti));
        hashSet.add(Integer.valueOf(k6.f28141si));
        hashSet.add(Integer.valueOf(k6.f28180ui));
        hashSet.add(Integer.valueOf(k6.f28198vi));
        hashSet.add(Integer.valueOf(k6.f28252yf));
        hashSet.add(Integer.valueOf(k6.f28233xf));
        hashSet.add(Integer.valueOf(k6.f27796a7));
        hashSet.add(Integer.valueOf(k6.f28018m7));
        hashSet.add(Integer.valueOf(k6.f28000l7));
        hashSet.add(Integer.valueOf(k6.f28035n7));
        hashSet.add(Integer.valueOf(k6.f27852d6));
        hashSet.add(Integer.valueOf(k6.f27853d7));
    }

    @Override
    public final void b() {
        setTextType((this.D0 + 1) % 4);
    }

    @Override
    public final void c(int i7) {
        j jVar = this.B0;
        if (jVar instanceof k2) {
            u0((k2) jVar, i7);
            sg.l0 e10 = sg.l0.e(this.f55703y1);
            e10.f55132g = i7;
            e10.f55127a.edit().putInt("text_alignment", i7).apply();
        }
    }

    public final void d0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new org.telegram.ui.web.w(20, this, (n1) view)).start();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        c0 c0Var;
        k2 k2Var;
        String str;
        if (i7 == qs.C5 && (c0Var = this.I0) != null) {
            for (int i11 = 0; i11 < c0Var.getChildCount(); i11++) {
                View childAt = c0Var.getChildAt(i11);
                if ((childAt instanceof k2) && (str = (k2Var = (k2) childAt).A0) != null) {
                    k2Var.setTypeface(str);
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
        throw new UnsupportedOperationException("Method not decompiled: tg.g0.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final PointF e0() {
        ye yeVar;
        mt0 paintingSize = getPaintingSize();
        float f10 = paintingSize.f36114a / 2.0f;
        float f11 = paintingSize.f36115b / 2.0f;
        if (this.f55686q0 != null) {
            double radians = (float) Math.toRadians(-(yeVar.f26642k + yeVar.d));
            float cos = (float) ((Math.cos(radians) * yeVar.f26635a) - (Math.sin(radians) * yeVar.f26636b));
            float d = (float) jg.g.d(radians, yeVar.f26636b, Math.sin(radians) * yeVar.f26635a);
            f10 -= cos * paintingSize.f36114a;
            f11 -= d * paintingSize.f36115b;
        }
        return new PointF(f10, f11);
    }

    @Override
    public final void f(j jVar) {
        int[] i02 = i0(jVar);
        y0(new s(this, jVar, 1), this, 51, i02[0], i02[1] - org.telegram.messenger.g0.L(32.0f));
    }

    public final n1 f0(String str, boolean z9) {
        float f10;
        mt0 mt0Var;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f10 = options.outWidth / options.outHeight;
        } catch (Exception e10) {
            a8.g(e10, true);
            f10 = 1.0f;
        }
        int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        c0 c0Var = this.I0;
        if (i7 > 0) {
            float floor = (float) Math.floor(c0Var.getMeasuredWidth() * 0.5d);
            mt0Var = new mt0(floor, floor / f10);
        } else {
            float floor2 = (float) Math.floor(c0Var.getMeasuredHeight() * 0.5d);
            mt0Var = new mt0(f10 * floor2, floor2);
        }
        mt0 mt0Var2 = mt0Var;
        Pair N0 = org.telegram.messenger.g0.N0(str);
        if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
            float f11 = mt0Var2.f36114a;
            mt0Var2.f36114a = mt0Var2.f36115b;
            mt0Var2.f36115b = f11;
        }
        Context context = getContext();
        PointF e02 = e0();
        int intValue = ((Integer) N0.first).intValue();
        ((Integer) N0.second).getClass();
        n1 n1Var = new n1(context, e02, mt0Var2, str, intValue);
        n1Var.setDelegate(this);
        c0Var.addView(n1Var);
        if (z9) {
            p0(n1Var);
            r0(n1Var, true);
        }
        return n1Var;
    }

    public final tg.x g0(java.lang.Object r24, org.telegram.tgnet.TLRPC.Document r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: tg.g0.g0(java.lang.Object, org.telegram.tgnet.TLRPC$Document, boolean):tg.x");
    }

    public int getAdditionalBottom() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    public int getAdditionalTop() {
        return org.telegram.messenger.g0.L(48.0f);
    }

    public View getCancelView() {
        return this.f55675j0;
    }

    public float getCropRotation() {
        ye yeVar = this.f55686q0;
        if (yeVar != null) {
            return yeVar.d + yeVar.f26642k;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.f55677k0;
    }

    public long getLcm() {
        return this.Y0.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        r5[] r5VarArr;
        c0 c0Var = this.I0;
        int childCount = c0Var.getChildCount();
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = c0Var.getChildAt(i7);
            if (childAt instanceof d2) {
                TLRPC.Document sticker = ((d2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f26968id = sticker.f26962id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof k2) {
                CharSequence text = ((k2) childAt).getText();
                if ((text instanceof Spanned) && (r5VarArr = (r5[]) ((Spanned) text).getSpans(0, text.length(), r5.class)) != null) {
                    for (r5 r5Var : r5VarArr) {
                        if (r5Var != null) {
                            TLRPC.Document document = r5Var.document;
                            if (document == null) {
                                document = i5.e(this.f55703y1, r5Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.f26968id = document.f26962id;
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
        return this.f55679l0;
    }

    public int getPKeyboardHeight() {
        return 0;
    }

    public sg.w0 getRenderView() {
        return this.F0;
    }

    public float getSelectedEntityBottom() {
        j jVar = this.B0;
        c0 c0Var = this.I0;
        if (jVar == null) {
            return getY() + c0Var.getMeasuredHeight();
        }
        int[] iArr = new int[2];
        jVar.getLocationInWindow(iArr);
        return (c0Var.getScaleY() * this.B0.getHeight()) + iArr[1];
    }

    public dz0 getThanosEffect() {
        if (!dz0.c()) {
            return null;
        }
        if (this.J0 == null) {
            dz0 dz0Var = new dz0(getContext(), new n(this, 0));
            this.J0 = dz0Var;
            addView(dz0Var);
        }
        return this.J0;
    }

    public final k2 h0(boolean z9) {
        ((up0) this).X1.f41403g0.isFocusable();
        mt0 paintingSize = getPaintingSize();
        PointF A0 = A0(null);
        k2 k2Var = new k2(getContext(), A0, (int) (paintingSize.f36114a / 9.0f), "", this.f55693t1, this.D0);
        float f10 = paintingSize.f36114a / 9.0f;
        n nVar = new n(this, 2);
        k2Var.f55814w0 = (int) (0.5f * f10);
        k2Var.f55815x0 = (int) (f10 * 2.0f);
        k2Var.f55816y0 = nVar;
        float f11 = A0.x;
        c0 c0Var = this.I0;
        if (f11 == c0Var.getMeasuredWidth() / 2.0f) {
            k2Var.setStickyX(2);
        }
        if (A0.y == c0Var.getMeasuredHeight() / 2.0f) {
            k2Var.setStickyY(2);
        }
        k2Var.setDelegate(this);
        k2Var.setMaxWidth((int) (paintingSize.f36114a - 20.0f));
        int i7 = this.f55703y1;
        k2Var.setTypeface(sg.l0.e(i7).f55134j);
        k2Var.setType(sg.l0.e(i7).h);
        c0Var.addView(k2Var, ha.c(-2.0f, -2));
        ye yeVar = this.f55686q0;
        if (yeVar != null) {
            k2Var.j(1.0f / yeVar.f26637c);
            k2Var.f(-(yeVar.f26642k + yeVar.d));
        }
        if (z9) {
            p0(k2Var);
            k2Var.q();
            r0(k2Var, false);
            k2Var.getFocusedView().requestFocus();
            org.telegram.messenger.g0.K3(k2Var.getFocusedView());
            this.C0 = true;
            int i10 = sg.l0.e(i7).f55132g;
            e1 e1Var = this.f55669d1;
            e1Var.d(i10, true);
            e1Var.setOutlineType(sg.l0.e(i7).h);
        }
        return k2Var;
    }

    public final boolean i(MotionEvent motionEvent) {
        if (this.B0 != null) {
            r0(null, true);
        }
        float x10 = motionEvent.getX();
        b0 b0Var = this.F0;
        float translationX = ((x10 - b0Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / b0Var.getScaleX();
        float y10 = ((((motionEvent.getY() - b0Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) + org.telegram.messenger.g0.L(32.0f)) - ((getAdditionalTop() - getAdditionalBottom()) / 2.0f)) / b0Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-b0Var.getRotation());
        double d2 = y10;
        float measuredWidth = (b0Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        float measuredHeight = (b0Var.getMeasuredHeight() / 2.0f) + ((float) jg.g.d(radians, d2, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        b0Var.e(obtain);
        obtain.recycle();
        return true;
    }

    public final int[] i0(j jVar) {
        float[] fArr = this.M1;
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
        int[] iArr = this.N1;
        iArr[0] = round;
        int round2 = Math.round(fArr[1]);
        iArr[1] = round2;
        Point point = org.telegram.messenger.g0.f22563q;
        double d = iArr[0] - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.I0.getRotation());
        double d2 = round2 - (point.y / 2.0f);
        iArr[0] = (point.x / 2) + ((int) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        iArr[1] = (point.y / 2) + ((int) jg.g.d(radians, d2, Math.sin(radians) * d));
        return iArr;
    }

    public final int j0(boolean z9) {
        return this.S1;
    }

    public final void k0(boolean z9) {
        if (this.P1) {
            x0(0);
        }
        if (z9) {
            hy hyVar = this.O1;
            if (hyVar != null && hyVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.O1.getMeasuredHeight());
                ofFloat.addUpdateListener(new o(this, 0));
                this.R1 = true;
                ofFloat.addListener(new z(this, 1));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f27544w);
                ofFloat.start();
                return;
            }
            l0();
        }
    }

    public final void l0() {
        hy hyVar;
        q3 q3Var;
        if (this.S1 > 0 && (q3Var = ((up0) this).X1.K1) != null) {
            q3Var.a();
        }
        if (!this.P1 && (hyVar = this.O1) != null && hyVar.getVisibility() != 8) {
            this.O1.setVisibility(8);
        }
        this.S1 = 0;
    }

    public final void m0(boolean z9) {
        int i7;
        int i10;
        if (this.P0 == 0) {
            int i11 = 0;
            if (z9) {
                i7 = 2;
            } else {
                i7 = 0;
            }
            this.U0.setLayerType(i7, null);
            if (z9) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            this.L0.setLayerType(i10, null);
            if (z9) {
                i11 = 2;
            }
            this.K0.setLayerType(i11, null);
        }
    }

    @Override
    public final int[] n(j jVar) {
        return i0(jVar);
    }

    public final boolean n0() {
        if (this.f55695u1) {
            w0(false);
            return true;
        } else if (this.P1) {
            k0(true);
            return true;
        } else if (!this.C0) {
            return false;
        } else {
            r0(null, true);
            return true;
        }
    }

    public abstract void o0(boolean z9);

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.e().c(this, qs.C5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.e().n(this, qs.C5);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int Q;
        super.onLayout(z9, i7, i10, i11, i12);
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        int i15 = 0;
        if (this.O1 != null) {
            if (org.telegram.messenger.g0.Q1()) {
                Q = i14 - this.O1.getMeasuredHeight();
            } else {
                Q = (Q() + i14) - this.O1.getMeasuredHeight();
            }
            hy hyVar = this.O1;
            hyVar.layout(0, Q, hyVar.getMeasuredWidth(), this.O1.getMeasuredHeight() + Q);
        }
        if (!this.E0) {
            i15 = org.telegram.messenger.g0.f22557m;
        }
        b0 b0Var = this.F0;
        int ceil = (int) Math.ceil((i13 - b0Var.getMeasuredWidth()) / 2.0f);
        int additionalTop = ((getAdditionalTop() - getAdditionalBottom()) / 2) + k5.C(8.0f, (((i14 - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i15)) - org.telegram.messenger.g0.L(48.0f)) - b0Var.getMeasuredHeight()) / 2, i15);
        b0Var.layout(ceil, additionalTop, b0Var.getMeasuredWidth() + ceil, b0Var.getMeasuredHeight() + additionalTop);
        l00 l00Var = this.G0;
        l00Var.layout(ceil, additionalTop, l00Var.getMeasuredWidth() + ceil, l00Var.getMeasuredHeight() + additionalTop);
        int measuredWidth = b0Var.getMeasuredWidth();
        c0 c0Var = this.I0;
        int measuredWidth2 = ((measuredWidth - c0Var.getMeasuredWidth()) / 2) + ceil;
        int measuredHeight = ((b0Var.getMeasuredHeight() - c0Var.getMeasuredHeight()) / 2) + additionalTop;
        c0Var.layout(measuredWidth2, measuredHeight, c0Var.getMeasuredWidth() + measuredWidth2, c0Var.getMeasuredHeight() + measuredHeight);
        dz0 dz0Var = this.J0;
        if (dz0Var != null) {
            dz0Var.layout(measuredWidth2, measuredHeight, c0Var.getMeasuredWidth() + measuredWidth2, c0Var.getMeasuredHeight() + measuredHeight);
        }
        sq0 sq0Var = this.H0;
        sq0Var.layout(ceil, additionalTop, sq0Var.getMeasuredWidth() + ceil, sq0Var.getMeasuredHeight() + additionalTop);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float currentActionBarHeight;
        float f10;
        this.f55702y0 = true;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((org.telegram.messenger.g0.f22563q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - org.telegram.messenger.g0.L(48.0f);
        Bitmap bitmap = this.m0;
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
        this.F0.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
        this.G0.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
        float f13 = f11 / this.A0.f36114a;
        this.f55704z0 = f13;
        c0 c0Var = this.I0;
        c0Var.setScaleX(f13);
        c0Var.setScaleY(this.f55704z0);
        c0Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.A0.f36114a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.A0.f36115b, 1073741824));
        dz0 dz0Var = this.J0;
        if (dz0Var != null) {
            dz0Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.A0.f36114a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.A0.f36115b, 1073741824));
            this.J0.setScaleX(this.f55704z0);
            this.J0.setScaleY(this.f55704z0);
        }
        C0();
        this.H0.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
        measureChild(this.L0, i7, i10);
        measureChild(this.U0, i7, i10);
        measureChild(this.N0, i7, i10);
        measureChild(this.M0, i7, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(getPKeyboardHeight(), this.S1), 1073741824));
        FrameLayout frameLayout = this.K0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.f22557m, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i7, i10);
        this.f55702y0 = false;
        if (org.telegram.messenger.g0.L(20.0f) >= 0 && !this.P1 && !this.R1) {
            this.f55702y0 = true;
            l0();
            this.f55702y0 = false;
        }
        if (org.telegram.messenger.g0.L(20.0f) < 0) {
            l0();
        }
        hy hyVar = this.O1;
        if (hyVar != null) {
            measureChild(hyVar, i7, i10);
        }
    }

    @Override
    public final boolean p() {
        return true;
    }

    public final void p0(j jVar) {
        if (jVar == null) {
            return;
        }
        this.f55682o0.b(jVar.getUUID(), new s(this, jVar, 0));
    }

    @Override
    public final boolean q() {
        return !this.C0;
    }

    public final void q0(j jVar) {
        j jVar2 = this.B0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.m0, false);
            this.B0 = null;
            if (jVar instanceof k2) {
                ValueAnimator valueAnimator = this.S0;
                if (valueAnimator != null && this.Q0 != 0) {
                    valueAnimator.cancel();
                }
                B0(0);
            }
        }
        this.I0.removeView(jVar);
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            sg.m1 m1Var = this.f55682o0;
            m1Var.f55148b.remove(uuid);
            m1Var.f55149c.remove(uuid);
            org.telegram.messenger.g0.h3(new sg.t0(m1Var, 1));
        }
        m1 m1Var2 = this.U0;
        rt rtVar = this.V0;
        m1Var2.setValueOverride(rtVar);
        m1Var2.setShowPreview(true);
        float f10 = rtVar.get();
        sg.j1 j1Var = this.f55693t1;
        j1Var.f55111c = f10;
        s0(j1Var, null);
    }

    public final boolean r0(j jVar, boolean z9) {
        g0 g0Var;
        boolean z10;
        int i7;
        boolean z11 = jVar instanceof k2;
        int i10 = 2;
        if (z11 && (((i7 = this.Q0) == -1 && this.P0 != 2) || (i7 != -1 && i7 != 2))) {
            ValueAnimator valueAnimator = this.S0;
            if (valueAnimator != null && i7 != 2) {
                valueAnimator.cancel();
            }
            if (this.f55695u1) {
                w0(false);
            }
            B0(2);
        }
        if (z11 && z9) {
            k2 k2Var = (k2) jVar;
            int gravity = k2Var.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i10 = 0;
                }
            } else {
                i10 = 1;
            }
            e1 e1Var = this.f55669d1;
            e1Var.setAlignment(i10);
            e1Var.setTypeface(k2Var.getTypeface().f55018a);
            e1Var.e(k2Var.getType(), true);
            this.M0.invalidate();
        }
        j jVar2 = this.B0;
        if (jVar2 != null) {
            if (jVar2 == jVar) {
                if (!this.C0) {
                    int[] i02 = i0(jVar2);
                    y0(new s(this, jVar2, 1), this, 51, i02[0], i02[1] - org.telegram.messenger.g0.L(32.0f));
                    return true;
                }
                if (jVar2 instanceof k2) {
                    org.telegram.messenger.g0.K3(((k2) jVar2).getFocusedView());
                    k0(false);
                }
                return true;
            }
            g0Var = this;
            jVar2.l(jVar2.m0, false);
            j jVar3 = g0Var.B0;
            if (jVar3 instanceof k2) {
                k2 k2Var2 = (k2) jVar3;
                j2 j2Var = k2Var2.f55808q0;
                j2Var.clearFocus();
                j2Var.setEnabled(false);
                j2Var.setClickable(false);
                k2Var2.m();
                if (!z11) {
                    g0Var.C0 = false;
                    org.telegram.messenger.g0.v1(((k2) g0Var.B0).getFocusedView());
                    k0(false);
                }
            }
            z10 = true;
        } else {
            g0Var = this;
            z10 = false;
        }
        j jVar4 = g0Var.B0;
        g0Var.B0 = jVar;
        if ((jVar4 instanceof k2) && TextUtils.isEmpty(((k2) jVar4).getText())) {
            q0(jVar4);
        }
        j jVar5 = g0Var.B0;
        rt rtVar = g0Var.V0;
        sg.j1 j1Var = g0Var.f55693t1;
        m1 m1Var = g0Var.U0;
        if (jVar5 != null) {
            sq0 sq0Var = g0Var.H0;
            jVar5.m0 = sq0Var;
            jVar5.l(sq0Var, true);
            g0Var.I0.bringChildToFront(g0Var.B0);
            j jVar6 = g0Var.B0;
            if (jVar6 instanceof k2) {
                k2 k2Var3 = (k2) jVar6;
                k2Var3.f55817z0 = false;
                k2Var3.getSwatch().f55111c = j1Var.f55111c;
                s0(k2Var3.getSwatch(), null);
                m1Var.setValueOverride(new y4(k2Var3, (int) (g0Var.A0.f36114a / 9.0f), 1));
                m1Var.setShowPreview(false);
                return true;
            }
            m1Var.setValueOverride(rtVar);
            m1Var.setShowPreview(true);
            j1Var.f55111c = rtVar.get();
            s0(j1Var, null);
            return true;
        }
        ValueAnimator valueAnimator2 = g0Var.S0;
        if (valueAnimator2 != null && g0Var.Q0 != 0) {
            valueAnimator2.cancel();
        }
        if (g0Var.f55695u1) {
            w0(false);
        }
        B0(0);
        m1Var.setValueOverride(rtVar);
        m1Var.setShowPreview(true);
        j1Var.f55111c = rtVar.get();
        s0(j1Var, null);
        return z10;
    }

    @Override
    public final void requestLayout() {
        if (this.f55702y0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(sg.j1 j1Var, Integer num) {
        sg.j1 j1Var2 = this.f55693t1;
        if (j1Var2 != j1Var) {
            j1Var2.f55109a = j1Var.f55109a;
            j1Var2.f55110b = j1Var.f55110b;
            j1Var2.f55111c = j1Var.f55111c;
            int i7 = this.f55703y1;
            sg.l0.e(i7).h(j1Var.f55109a, true);
            sg.l0.e(i7).j(j1Var.f55111c);
        }
        int i10 = j1Var.f55109a;
        b0 b0Var = this.F0;
        b0Var.setColor(i10);
        b0Var.setBrushSize(j1Var.f55111c);
        int i11 = j1Var2.f55109a;
        if (num != null && num.intValue() != i11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new e4(this, num, i11, 3));
            duration.start();
        } else {
            e0 e0Var = this.L0;
            if (e0Var != null) {
                e0Var.invalidate();
            }
        }
        j jVar = this.B0;
        if (jVar instanceof k2) {
            ((k2) jVar).setSwatch(new sg.j1(j1Var.f55110b, j1Var.f55111c, j1Var.f55109a));
        }
    }

    public void setBlurredBackgroundDrawableForTools(fh.g gVar) {
        gVar.q(org.telegram.messenger.g0.L(4.0f));
        this.L1 = gVar;
    }

    public void setDrawShadow(boolean z9) {
        this.F1 = z9;
        invalidate();
        setClipChildren(!z9);
    }

    public void setOffsetTranslationX(float f10) {
        if (this.P0 == 0) {
            this.U0.setTranslationX(f10);
        }
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.D1 = runnable;
    }

    @Override
    public final void t() {
        q3 q3Var;
        if (!this.Q1 && !this.P1) {
            h0(true);
            return;
        }
        boolean z9 = this.P1;
        if (z9 && (q3Var = ((up0) this).X1.K1) != null) {
            q3Var.f12652e = true;
        }
        x0(!z9 ? 1 : 0);
        if (z9) {
            j jVar = this.B0;
            if (jVar instanceof k2) {
                org.telegram.messenger.g0.K3(((k2) jVar).getEditText());
            }
        }
    }

    public final void t0(float f10) {
        this.f55679l0 = f10;
        this.K0.setTranslationY(-f10);
        this.L0.setTranslationY(f10);
    }

    @Override
    public final boolean u(j jVar) {
        return r0(jVar, true);
    }

    @Override
    public final void updateColors() {
        this.f55701x1.setColor(-15132391);
    }

    @Override
    public final void v(float f10, float f11, float[] fArr) {
        Point point = org.telegram.messenger.g0.f22563q;
        double d = f10 - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.I0.getRotation());
        double d2 = f11 - (point.y / 2.0f);
        fArr[0] = (point.x / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        fArr[1] = (point.y / 2.0f) + ((float) jg.g.d(radians, d2, Math.sin(radians) * d));
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
        this.f55688r0 = f10;
        this.f55698w0 = f13;
        this.f55700x0 = f14;
        this.f55690s0 = f11;
        this.f55692t0 = f12;
        this.f55694u0 = f11;
        float f22 = f12 + 0.0f;
        this.f55696v0 = f22;
        for (int i7 = 0; i7 < 4; i7++) {
            if (i7 == 0) {
                view = this.I0;
            } else if (i7 == 1) {
                view = this.H0;
            } else if (i7 == 2) {
                view = this.F0;
            } else {
                view = this.G0;
            }
            ye yeVar = this.f55686q0;
            if (yeVar != null) {
                float f23 = yeVar.f26637c * 1.0f;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                if (measuredWidth != 0 && measuredHeight != 0) {
                    int i10 = yeVar.f26642k;
                    if (i10 == 90 || i10 == 270) {
                        measuredHeight = measuredWidth;
                        measuredWidth = measuredHeight;
                    }
                    float max = Math.max(f13 / ((int) (yeVar.f26638e * f20)), f14 / ((int) (yeVar.f26639f * f21)));
                    f16 = f23 * max;
                    float D = com.google.android.recaptcha.internal.a.D(yeVar.f26635a, measuredWidth, f10, max);
                    float f24 = yeVar.f26637c;
                    f17 = (D * f24) + f11;
                    f15 = 1.0f;
                    f18 = (yeVar.f26636b * measuredHeight * f10 * max * f24) + f22;
                    f19 = yeVar.d + i10;
                } else {
                    return;
                }
            } else {
                f15 = 1.0f;
                if (i7 == 0) {
                    f16 = this.f55704z0 * 1.0f;
                } else {
                    f16 = 1.0f;
                }
                f17 = f11;
                f18 = f22;
                f19 = 0.0f;
            }
            float f25 = ((-this.S1) / 2.0f) + f18;
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
    public final void w(sg.h hVar) {
        boolean z9 = hVar instanceof sg.b;
        m1 m1Var = this.U0;
        if (!z9 && !(hVar instanceof sg.d)) {
            m1Var.b(0.05f, 1.0f);
        } else {
            m1Var.b(0.4f, 1.75f);
        }
        m1Var.setDrawCenter(!(hVar instanceof sg.g));
        b0 b0Var = this.F0;
        if (b0Var.getCurrentBrush() instanceof sg.g) {
            this.T0 = true;
        }
        b0Var.setBrush(hVar);
        sg.j1 j1Var = this.f55693t1;
        int i7 = j1Var.f55109a;
        j1Var.f55109a = sg.l0.e(this.f55703y1).c();
        j1Var.f55111c = this.V0.get();
        s0(j1Var, Integer.valueOf(i7));
        this.G0.invalidate();
    }

    public final void w0(final boolean z9) {
        float f10;
        boolean z10;
        if (this.f55695u1 != z9) {
            this.f55695u1 = z9;
            r1.g gVar = this.f55697v1;
            if (gVar != null) {
                gVar.d();
            }
            float f11 = 1000.0f;
            if (z9) {
                f10 = 0.0f;
            } else {
                f10 = 1000.0f;
            }
            r1.g gVar2 = new r1.g(new r1.f(f10));
            this.f55697v1 = gVar2;
            r1.h hVar = new r1.h();
            if (!z9) {
                f11 = 0.0f;
            }
            hVar.f54276i = f11;
            hVar.b(1250.0f);
            hVar.a(1.0f);
            gVar2.f54268m = hVar;
            if (!this.Q1 && !this.P1) {
                z10 = false;
            } else {
                z10 = true;
            }
            final boolean[] zArr = {z10};
            final float translationY = this.L0.getTranslationY();
            final ViewGroup barView = getBarView();
            this.f55697v1.b(new r1.d() {
                @Override
                public final void a(r1.g gVar3, float f12, float f13) {
                    int i7;
                    g0 g0Var = g0.this;
                    e0 e0Var = g0Var.L0;
                    float f14 = f12 / 1000.0f;
                    g0Var.f55699w1 = f14;
                    float f15 = ((1.0f - f14) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f15);
                    view.setScaleY(f15);
                    view.setTranslationY((Math.min(g0Var.f55699w1, 0.25f) * org.telegram.messenger.g0.L(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(g0Var.f55699w1, 0.25f) / 0.25f));
                    d0 d0Var = g0Var.f55685p1;
                    float f16 = g0Var.f55699w1;
                    boolean z11 = z9;
                    d0Var.B1(z11, f16);
                    g0Var.f55677k0.setProgress(g0Var.f55699w1);
                    g0Var.f55675j0.setProgress(g0Var.f55699w1);
                    g0Var.O0.setTranslationY(org.telegram.messenger.g0.L(32.0f) * g0Var.f55699w1);
                    if (zArr[0]) {
                        float f17 = g0Var.f55699w1;
                        if (!z11) {
                            f17 = 1.0f - f17;
                        }
                        float L = org.telegram.messenger.g0.L(40.0f) * f17;
                        if (z11) {
                            i7 = 1;
                        } else {
                            i7 = -1;
                        }
                        e0Var.setTranslationY(translationY - (L * i7));
                    }
                    e0Var.invalidate();
                    if (view == g0Var.f55669d1) {
                        g0Var.M0.invalidate();
                    }
                }
            });
            this.f55697v1.a(new r(this, z9, 1));
            this.f55697v1.h();
            if (z9) {
                d0 d0Var = this.f55685p1;
                d0Var.setVisibility(0);
                d0Var.setSelectedColorIndex(sg.l0.e(this.f55703y1).d());
            }
        }
    }

    @Override
    public final sg.l0 x() {
        return sg.l0.e(this.f55703y1);
    }

    public final void x0(int i7) {
        boolean z9;
        int i10;
        e1 e1Var = this.f55669d1;
        if (i7 == 1) {
            hy hyVar = this.O1;
            if (hyVar != null && hyVar.getVisibility() == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            hy hyVar2 = this.O1;
            if (hyVar2 != null && hyVar2.f34400c1 != p10.f24470s0) {
                removeView(hyVar2);
                this.O1 = null;
            }
            if (this.O1 == null) {
                hy hyVar3 = new hy(null, true, false, false, getContext(), false, null, null, true, this.f55705z1, false, false);
                this.O1 = hyVar3;
                hyVar3.U0 = true;
                hyVar3.setVisibility(8);
                if (org.telegram.messenger.g0.Q1()) {
                    this.O1.setForseMultiwindowLayout(true);
                }
                this.O1.setDelegate(new a0(this));
                addView(this.O1);
            }
            this.O1.setVisibility(0);
            this.P1 = true;
            hy hyVar4 = this.O1;
            if (this.T1 <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.T1 = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.T1 = qp.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                }
            }
            if (this.U1 <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.U1 = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.U1 = qp.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                }
            }
            Point point = org.telegram.messenger.g0.f22563q;
            if (point.x > point.y) {
                i10 = this.U1;
            } else {
                i10 = this.T1;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) hyVar4.getLayoutParams();
            layoutParams.height = i10;
            hyVar4.setLayoutParams(layoutParams);
            if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                j jVar = this.B0;
                if (jVar instanceof k2) {
                    org.telegram.messenger.g0.v1(((k2) jVar).getEditText());
                }
            }
            this.S1 = i10;
            requestLayout();
            q3 q3Var = ((up0) this).X1.K1;
            if (q3Var != null) {
                q3Var.a();
            }
            jg emojiButton = e1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(hg.d, true);
            }
            getHeight();
            if (!z9 && !this.Q1) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.S1, 0.0f);
                ofFloat.addUpdateListener(new o(this, 1));
                ofFloat.addListener(new z(this, 0));
                ofFloat.start();
                return;
            }
            return;
        }
        jg emojiButton2 = e1Var.getEmojiButton();
        if (emojiButton2 != null) {
            emojiButton2.j(hg.f34251e, true);
        }
        hy hyVar5 = this.O1;
        if (hyVar5 != null) {
            this.P1 = false;
            if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                hyVar5.setVisibility(8);
            }
        }
        if (i7 == 0) {
            this.S1 = 0;
        }
        q3 q3Var2 = ((up0) this).X1.K1;
        if (q3Var2 != null) {
            q3Var2.a();
        }
        requestLayout();
        getHeight();
    }

    public final void y0(Runnable runnable, g0 g0Var, int i7, int i10, int i11) {
        org.telegram.ui.ActionBar.g1 g1Var = this.A1;
        if (g1Var != null && g1Var.isShowing()) {
            this.A1.d(true);
            return;
        }
        if (this.B1 == null) {
            this.C1 = new Rect();
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), this.f55705z1);
            this.B1 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(true);
            this.B1.setBackgroundColor(-14145495);
            this.B1.setOnTouchListener(new n4(2, this));
            this.B1.setDispatchKeyEventListener(new q(this));
            this.B1.setShownFromBottom(true);
        }
        this.B1.d();
        runnable.run();
        if (this.A1 == null) {
            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(this.B1, -2, -2);
            this.A1 = g1Var2;
            g1Var2.f27483b = true;
            g1Var2.setAnimationStyle(2131755191);
            this.A1.setOutsideTouchable(true);
            this.A1.setClippingEnabled(true);
            this.A1.setInputMethodMode(2);
            this.A1.setSoftInputMode(0);
            this.A1.getContentView().setFocusableInTouchMode(true);
            this.A1.setOnDismissListener(new p4(2, this));
        }
        this.B1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
        this.A1.setFocusable(true);
        this.A1.showAtLocation(g0Var, i7, i10 - (this.B1.getMeasuredWidth() / 2), i11 - this.B1.getMeasuredHeight());
        org.telegram.ui.ActionBar.g1.i(this.B1);
    }

    public final void z0(boolean z9) {
        float f10;
        if (this.n1 != z9) {
            this.n1 = z9;
            r1.g gVar = this.f55683o1;
            if (gVar != null) {
                gVar.d();
            }
            float f11 = 1000.0f;
            if (z9) {
                f10 = 0.0f;
            } else {
                f10 = 1000.0f;
            }
            r1.g gVar2 = new r1.g(new r1.f(f10));
            this.f55683o1 = gVar2;
            r1.h hVar = new r1.h();
            if (!z9) {
                f11 = 0.0f;
            }
            hVar.f54276i = f11;
            hVar.b(1250.0f);
            hVar.a(1.0f);
            gVar2.f54268m = hVar;
            if (z9) {
                j1 j1Var = this.f55670e1;
                j1Var.setAlpha(0.0f);
                j1Var.setVisibility(0);
            }
            this.f55683o1.b(new di.a8(3, this));
            this.f55683o1.a(new r(this, z9, 0));
            this.f55683o1.h();
        }
    }

    @Override
    public final void B(boolean z9) {
    }

    @Override
    public final void d(boolean z9) {
    }

    @Override
    public final void e(boolean z9) {
    }

    @Override
    public final void j(boolean z9) {
    }

    @Override
    public final void C() {
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
    public final void y() {
    }
}
