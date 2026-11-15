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
import bi.b6;
import c8.ja;
import fi.b3;
import fi.t7;
import hi.a4;
import hi.g4;
import hi.k4;
import hi.m4;
import hi.p3;
import hi.w4;
import hi.y4;
import hi.z4;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import org.telegram.messenger.a8;
import org.telegram.messenger.d20;
import org.telegram.messenger.e20;
import org.telegram.messenger.g6;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.k5;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q5;
import org.telegram.messenger.xe;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.m01;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.nt0;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.tt0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.dn0;
import org.telegram.ui.eh0;
import org.telegram.ui.nb1;
import org.telegram.ui.rv;
import org.telegram.ui.tp0;
public abstract class g0 extends tt0 implements g1, h, c1, rt0, is {
    public float A0;
    public final u A1;
    public nt0 B0;
    public org.telegram.ui.ActionBar.g1 B1;
    public j C0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout C1;
    public boolean D0;
    public Rect D1;
    public int E0;
    public Runnable E1;
    public final boolean F0;
    public final sg.k0 F1;
    public final b0 G0;
    public boolean G1;
    public final rv H0;
    public float H1;
    public final eh0 I0;
    public boolean I1;
    public final c0 J0;
    public final u5 J1;
    public fz0 K0;
    public final Paint K1;
    public final FrameLayout L0;
    public final Paint L1;
    public final e0 M0;
    public fh.g M1;
    public final m01 N0;
    public final float[] N1;
    public final FrameLayout O0;
    public final int[] O1;
    public y4 P0;
    public ly P1;
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
    public final m1 V0;
    public int V1;
    public final ff W0;
    public int W1;
    public ArrayList X0;
    public boolean X1;
    public final int Y0;
    public BigInteger Z0;
    public TextView f57268a1;
    public TextView f57269b1;
    public TextView f57270c1;
    public final h1 f57271d1;
    public final e1 f57272e1;
    public final j1 f57273f1;
    public final ImageView f57274g1;
    public final LinearLayout f57275h1;
    public final TextView f57276i1;
    public final TextView f57277j1;
    public final v0 f57278k0;
    public final TextView f57279k1;
    public final z0 f57280l0;
    public final Paint l1;
    public float m0;
    public final Paint f57281m1;
    public final Bitmap f57282n0;
    public float n1;
    public final Bitmap f57283o0;
    public boolean f57284o1;
    public final sg.k1 f57285p0;
    public r1.g f57286p1;
    public final q5 f57287q0;
    public final d0 f57288q1;
    public final xe f57289r0;
    public final Paint f57290r1;
    public float f57291s0;
    public final Paint f57292s1;
    public float f57293t0;
    public final Paint f57294t1;
    public float f57295u0;
    public final sg.h1 f57296u1;
    public float f57297v0;
    public boolean f57298v1;
    public float f57299w0;
    public r1.g f57300w1;
    public float f57301x0;
    public float f57302x1;
    public float f57303y0;
    public final Paint f57304y1;
    public boolean f57305z0;
    public final int f57306z1;

    public g0(Context context, Activity activity, int i7, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, xe xeVar, dn0 dn0Var, final e6 e6Var) {
        super(context, activity);
        boolean z10;
        int i11;
        int i12;
        g6[] g6VarArr;
        n1 n1Var;
        boolean z11 = false;
        this.Q0 = 0;
        this.R0 = -1;
        final tp0 tp0Var = (tp0) this;
        this.W0 = new ff(tp0Var, 18);
        this.l1 = new Paint(1);
        this.f57281m1 = new Paint(1);
        this.f57290r1 = new Paint(1);
        this.f57292s1 = new Paint(1);
        this.f57294t1 = new Paint(1);
        sg.h1 h1Var = new sg.h1(1.0f, 0.016773745f, -1);
        this.f57296u1 = h1Var;
        this.f57304y1 = new Paint(1);
        this.I1 = false;
        this.J1 = new u5((View) this, 350L, er.h);
        this.K1 = new Paint(1);
        Paint paint = new Paint(1);
        this.L1 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new Matrix();
        this.N1 = new float[2];
        this.O1 = new int[2];
        new s4.s0(tp0Var, 3);
        setDelegate(this);
        this.f57306z1 = i7;
        this.A1 = new e6() {
            @Override
            public final boolean a() {
                return j6.I.q();
            }

            @Override
            public final void b(float f10, float f11, int i13, int i14) {
                j6.r(f10, f11, i13, i14);
            }

            @Override
            public final ColorFilter c() {
                return j6.f29181v3;
            }

            @Override
            public final Paint d(String str) {
                return j6.V0(str);
            }

            @Override
            public final boolean e() {
                return gz.H0;
            }

            @Override
            public final int f(int i13) {
                return h(i13);
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
            public final int h(int i13) {
                if (i13 == j6.G8) {
                    return -14145495;
                }
                if (i13 != j6.E8) {
                    if (i13 == j6.f28922h5) {
                        return -14737633;
                    }
                    if (i13 == j6.f28957j5) {
                        return -592138;
                    }
                    if (i13 == j6.f29107r5) {
                        return -8553091;
                    }
                    if (i13 != j6.f29269zf) {
                        if (i13 == j6.Cf) {
                            return -1610612736;
                        }
                        if (i13 == j6.Ff || i13 == j6.Jf || i13 == j6.Ef) {
                            return -9539985;
                        }
                        if (i13 != j6.G6) {
                            int i14 = j6.Di;
                            if (i13 == i14) {
                                return -11754001;
                            }
                            if (i13 == j6.f28941i6) {
                                return 536870911;
                            }
                            if (i13 != j6.f29214wi && i13 != j6.f29195vi && i13 != j6.f29233xi) {
                                if (i13 == j6.f29252yi) {
                                    return 352321535;
                                }
                                if (i13 != j6.Bf && i13 != i14) {
                                    if (i13 == j6.Af) {
                                        return 780633991;
                                    }
                                    if (i13 == j6.f28792a7) {
                                        return -15921907;
                                    }
                                    if (i13 == j6.f29015m7) {
                                        return -12500671;
                                    }
                                    if (i13 == j6.f28997l7) {
                                        return -13133079;
                                    }
                                    if (i13 == j6.f29032n7) {
                                        return -1;
                                    }
                                    if (i13 == j6.f28849d6) {
                                        return -15198183;
                                    }
                                    if (i13 == j6.f28850d7) {
                                        return -16777216;
                                    }
                                    e6 e6Var2 = e6.this;
                                    if (e6Var2 != null) {
                                        return e6Var2.h(i13);
                                    }
                                    return j6.v0(i13);
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
            public final int j(int i13) {
                return h(i13);
            }

            @Override
            public final void i(int i13, int i14) {
            }
        };
        this.f57289r0 = xeVar;
        this.F0 = context instanceof BubbleActivity;
        sg.k0 e10 = sg.k0.e(i7);
        this.F1 = e10;
        e10.i(0, true);
        h1Var.f56644a = e10.c();
        h1Var.f56646c = e10.f56693i;
        q5 q5Var = new q5("Paint", true);
        this.f57287q0 = q5Var;
        this.f57282n0 = bitmap;
        this.f57283o0 = bitmap2;
        this.Y0 = i10;
        sg.k1 k1Var = new sg.k1();
        this.f57285p0 = k1Var;
        byte b10 = 2;
        k1Var.f56697a = new org.telegram.ui.ActionBar.z(tp0Var, 25);
        b0 b0Var = new b0(tp0Var, context, new sg.i0(getPaintingSize(), bitmap2, i10, null), bitmap, bitmap2);
        this.G0 = b0Var;
        b0Var.setDelegate(new sg.h0(tp0Var, dn0Var, false, 3));
        b0Var.setUndoStore(k1Var);
        b0Var.setQueue(q5Var);
        b0Var.setVisibility(4);
        addView(b0Var, ja.e(-1, -1, 51));
        rv rvVar = new rv(13, context, tp0Var);
        this.H0 = rvVar;
        rvVar.setVisibility(4);
        addView(rvVar, ja.e(-1, -1, 51));
        c0 c0Var = new c0(tp0Var, context, new cf(tp0Var));
        this.J0 = c0Var;
        addView(c0Var);
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                e20 e20Var = (e20) arrayList.get(i13);
                byte b11 = e20Var.f23224a;
                if (b11 == 0) {
                    ?? g02 = g0(e20Var.C, e20Var.B, z11);
                    if ((e20Var.f23225b & 2) != 0) {
                        g02.r(z11);
                    }
                    ViewGroup.LayoutParams layoutParams = g02.getLayoutParams();
                    layoutParams.width = e20Var.f23238q;
                    layoutParams.height = e20Var.f23239r;
                    i11 = size;
                    i12 = i13;
                    n1Var = g02;
                } else if (b11 == 1) {
                    ?? h02 = h0(z11);
                    h02.setType(e20Var.f23225b);
                    h02.setTypeface(e20Var.f23235n);
                    h02.setBaseFontSize(e20Var.f23234m);
                    SpannableString spannableString = new SpannableString(e20Var.f23231j);
                    ?? r14 = e20Var.f23232k;
                    int size2 = r14.size();
                    int i14 = z11;
                    while (i14 < size2) {
                        Object obj = r14.get(i14);
                        int i15 = i14 + 1;
                        d20 d20Var = (d20) obj;
                        p5 p5Var = new p5(d20Var.document_id, h02.getFontMetricsInt());
                        int i16 = d20Var.offset;
                        spannableString.setSpan(p5Var, i16, d20Var.length + i16, 33);
                        size = size;
                        i13 = i13;
                        i14 = i15;
                    }
                    i11 = size;
                    i12 = i13;
                    CharSequence m10 = org.telegram.messenger.j6.m(spannableString, h02.getFontMetricsInt(), false, null, 0);
                    if ((m10 instanceof Spanned) && (g6VarArr = (g6[]) ((Spanned) m10).getSpans(0, m10.length(), g6.class)) != null) {
                        for (g6 g6Var : g6VarArr) {
                            g6Var.f23694b = 0.85f;
                        }
                    }
                    h02.setText(m10);
                    u0(h02, e20Var.f23237p);
                    sg.h1 swatch = h02.getSwatch();
                    swatch.f56644a = e20Var.f23233l;
                    h02.setSwatch(swatch);
                    n1Var = h02;
                } else {
                    i11 = size;
                    i12 = i13;
                    byte b12 = b10;
                    if (b11 == b12) {
                        n1 f02 = f0(e20Var.f23231j, false);
                        f02.C0 = false;
                        if ((e20Var.f23225b & b12) != 0) {
                            f02.r(false);
                        }
                        if ((e20Var.f23225b & 16) != 0) {
                            f02.t(false);
                        }
                        ViewGroup.LayoutParams layoutParams2 = f02.getLayoutParams();
                        layoutParams2.width = e20Var.f23238q;
                        layoutParams2.height = e20Var.f23239r;
                        n1Var = f02;
                    } else {
                        i13 = i12 + 1;
                        size = i11;
                        z11 = false;
                        b10 = 2;
                    }
                }
                n1Var.setX((e20Var.f23226c * this.B0.f37713a) - (((1.0f - e20Var.v) * e20Var.f23238q) / 2.0f));
                n1Var.setY((e20Var.d * this.B0.f37714b) - (((1.0f - e20Var.v) * e20Var.f23239r) / 2.0f));
                n1Var.setPosition(new PointF((e20Var.f23238q / 2.0f) + n1Var.getX(), (e20Var.f23239r / 2.0f) + n1Var.getY()));
                n1Var.setScale(e20Var.v);
                n1Var.setRotation((float) (((-e20Var.f23227e) / 3.141592653589793d) * 180.0d));
                i13 = i12 + 1;
                size = i11;
                z11 = false;
                b10 = 2;
            }
        }
        this.J0.setVisibility(4);
        eh0 eh0Var = new eh0(context, 19);
        this.I0 = eh0Var;
        addView(eh0Var);
        ?? frameLayout = new FrameLayout(context);
        this.L0 = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{-16777216, 0}));
        addView(frameLayout, ja.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.f57274g1 = imageView;
        imageView.setImageResource(2131232532);
        imageView.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        imageView.setBackground(j6.h0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        tp0 tp0Var2 = tp0Var;
                        b0 b0Var2 = tp0Var2.G0;
                        if (b0Var2 != null && (b0Var2.getCurrentBrush() instanceof sg.g)) {
                            b0Var2.b();
                            tp0Var2.f57271d1.setSelectedIndex(1);
                            tp0Var2.w((sg.h) sg.h.f56640a.get(0));
                            return;
                        }
                        tp0Var2.f57285p0.c();
                        return;
                    case 1:
                        tp0 tp0Var3 = tp0Var;
                        b0 b0Var3 = tp0Var3.G0;
                        sg.k1 k1Var2 = tp0Var3.f57285p0;
                        if (k1Var2.a()) {
                            if (b0Var3 != null && (b0Var3.getCurrentBrush() instanceof sg.g)) {
                                b0Var3.b();
                                tp0Var3.f57271d1.setSelectedIndex(1);
                                tp0Var3.w((sg.h) sg.h.f56640a.get(0));
                            }
                            b0Var3.a();
                            k1Var2.f56699c.clear();
                            k1Var2.f56698b.clear();
                            org.telegram.messenger.g0.h3(new q2.d(k1Var2, 11));
                            tp0Var3.J0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        tp0 tp0Var4 = tp0Var;
                        j jVar = tp0Var4.C0;
                        if (jVar instanceof o2) {
                            org.telegram.messenger.g0.v1(((o2) jVar).getFocusedView());
                        }
                        if (tp0Var4.Q1) {
                            tp0Var4.k0(false);
                        }
                        tp0Var4.q0(tp0Var4.C0);
                        tp0Var4.r0(null, true);
                        return;
                    default:
                        tp0Var.r0(null, true);
                        return;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout.addView(imageView, ja.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f57275h1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(j6.h0(822083583, 7, -1));
        linearLayout.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 16.0f);
        textView.setText(hd.M0(2131747267, null));
        linearLayout.addView(i20.e(context, 2131232533), ja.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, ja.r(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new bi.o(25));
        frameLayout.addView(linearLayout, ja.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.f57276i1 = textView2;
        textView2.setBackground(j6.h0(822083583, 7, -1));
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView2.setText(hd.M0(2131747279, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        tp0 tp0Var2 = tp0Var;
                        b0 b0Var2 = tp0Var2.G0;
                        if (b0Var2 != null && (b0Var2.getCurrentBrush() instanceof sg.g)) {
                            b0Var2.b();
                            tp0Var2.f57271d1.setSelectedIndex(1);
                            tp0Var2.w((sg.h) sg.h.f56640a.get(0));
                            return;
                        }
                        tp0Var2.f57285p0.c();
                        return;
                    case 1:
                        tp0 tp0Var3 = tp0Var;
                        b0 b0Var3 = tp0Var3.G0;
                        sg.k1 k1Var2 = tp0Var3.f57285p0;
                        if (k1Var2.a()) {
                            if (b0Var3 != null && (b0Var3.getCurrentBrush() instanceof sg.g)) {
                                b0Var3.b();
                                tp0Var3.f57271d1.setSelectedIndex(1);
                                tp0Var3.w((sg.h) sg.h.f56640a.get(0));
                            }
                            b0Var3.a();
                            k1Var2.f56699c.clear();
                            k1Var2.f56698b.clear();
                            org.telegram.messenger.g0.h3(new q2.d(k1Var2, 11));
                            tp0Var3.J0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        tp0 tp0Var4 = tp0Var;
                        j jVar = tp0Var4.C0;
                        if (jVar instanceof o2) {
                            org.telegram.messenger.g0.v1(((o2) jVar).getFocusedView());
                        }
                        if (tp0Var4.Q1) {
                            tp0Var4.k0(false);
                        }
                        tp0Var4.q0(tp0Var4.C0);
                        tp0Var4.r0(null, true);
                        return;
                    default:
                        tp0Var.r0(null, true);
                        return;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView k10 = org.telegram.ui.Cells.y0.k(frameLayout, textView2, ja.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.f57277j1 = k10;
        k10.setBackground(j6.h0(822083583, 7, -1));
        k10.setText(hd.M0(2131752101, null));
        k10.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        k10.setGravity(16);
        k10.setTextColor(-1);
        k10.setTypeface(org.telegram.messenger.g0.o());
        k10.setTextSize(1, 16.0f);
        k10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        tp0 tp0Var2 = tp0Var;
                        b0 b0Var2 = tp0Var2.G0;
                        if (b0Var2 != null && (b0Var2.getCurrentBrush() instanceof sg.g)) {
                            b0Var2.b();
                            tp0Var2.f57271d1.setSelectedIndex(1);
                            tp0Var2.w((sg.h) sg.h.f56640a.get(0));
                            return;
                        }
                        tp0Var2.f57285p0.c();
                        return;
                    case 1:
                        tp0 tp0Var3 = tp0Var;
                        b0 b0Var3 = tp0Var3.G0;
                        sg.k1 k1Var2 = tp0Var3.f57285p0;
                        if (k1Var2.a()) {
                            if (b0Var3 != null && (b0Var3.getCurrentBrush() instanceof sg.g)) {
                                b0Var3.b();
                                tp0Var3.f57271d1.setSelectedIndex(1);
                                tp0Var3.w((sg.h) sg.h.f56640a.get(0));
                            }
                            b0Var3.a();
                            k1Var2.f56699c.clear();
                            k1Var2.f56698b.clear();
                            org.telegram.messenger.g0.h3(new q2.d(k1Var2, 11));
                            tp0Var3.J0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        tp0 tp0Var4 = tp0Var;
                        j jVar = tp0Var4.C0;
                        if (jVar instanceof o2) {
                            org.telegram.messenger.g0.v1(((o2) jVar).getFocusedView());
                        }
                        if (tp0Var4.Q1) {
                            tp0Var4.k0(false);
                        }
                        tp0Var4.q0(tp0Var4.C0);
                        tp0Var4.r0(null, true);
                        return;
                    default:
                        tp0Var.r0(null, true);
                        return;
                }
            }
        });
        k10.setAlpha(0.0f);
        k10.setVisibility(8);
        TextView k11 = org.telegram.ui.Cells.y0.k(frameLayout, k10, ja.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.f57279k1 = k11;
        k11.setBackground(j6.h0(822083583, 7, -1));
        k11.setText(hd.M0(2131751354, null));
        k11.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        k11.setGravity(16);
        k11.setTextColor(-1);
        k11.setTypeface(org.telegram.messenger.g0.o());
        k11.setTextSize(1, 16.0f);
        k11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        tp0 tp0Var2 = tp0Var;
                        b0 b0Var2 = tp0Var2.G0;
                        if (b0Var2 != null && (b0Var2.getCurrentBrush() instanceof sg.g)) {
                            b0Var2.b();
                            tp0Var2.f57271d1.setSelectedIndex(1);
                            tp0Var2.w((sg.h) sg.h.f56640a.get(0));
                            return;
                        }
                        tp0Var2.f57285p0.c();
                        return;
                    case 1:
                        tp0 tp0Var3 = tp0Var;
                        b0 b0Var3 = tp0Var3.G0;
                        sg.k1 k1Var2 = tp0Var3.f57285p0;
                        if (k1Var2.a()) {
                            if (b0Var3 != null && (b0Var3.getCurrentBrush() instanceof sg.g)) {
                                b0Var3.b();
                                tp0Var3.f57271d1.setSelectedIndex(1);
                                tp0Var3.w((sg.h) sg.h.f56640a.get(0));
                            }
                            b0Var3.a();
                            k1Var2.f56699c.clear();
                            k1Var2.f56698b.clear();
                            org.telegram.messenger.g0.h3(new q2.d(k1Var2, 11));
                            tp0Var3.J0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        tp0 tp0Var4 = tp0Var;
                        j jVar = tp0Var4.C0;
                        if (jVar instanceof o2) {
                            org.telegram.messenger.g0.v1(((o2) jVar).getFocusedView());
                        }
                        if (tp0Var4.Q1) {
                            tp0Var4.k0(false);
                        }
                        tp0Var4.q0(tp0Var4.C0);
                        tp0Var4.r0(null, true);
                        return;
                    default:
                        tp0Var.r0(null, true);
                        return;
                }
            }
        });
        k11.setAlpha(0.0f);
        k11.setVisibility(8);
        frameLayout.addView(k11, ja.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        e0 e0Var = new e0(tp0Var, context);
        this.M0 = e0Var;
        e0Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), 0);
        e0Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(e0Var, ja.e(-1, 104, 80));
        if (bitmap2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        h1 h1Var2 = new h1(context, z10);
        this.f57271d1 = h1Var2;
        h1Var2.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        h1Var2.setDelegate(this);
        h1Var2.setSelectedIndex(1);
        e0Var.addView(h1Var2, ja.c(48.0f, -1));
        e1 e1Var = new e1(context);
        this.f57272e1 = e1Var;
        e1Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        e1Var.setVisibility(8);
        e1Var.setDelegate(this);
        e1Var.setAlignment(sg.k0.e(i7).f56692g);
        e0Var.addView(e1Var, ja.c(48.0f, -1));
        m01 m01Var = new m01(tp0Var, context);
        this.N0 = m01Var;
        addView(m01Var, ja.c(-1.0f, -1));
        j1 j1Var = new j1(context);
        this.f57273f1 = j1Var;
        j1Var.setVisibility(8);
        j1Var.setOnItemClickListener(new b6(tp0Var, 20));
        e1Var.setTypefaceListView(j1Var);
        m01Var.addView(j1Var, ja.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        Paint paint2 = this.l1;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.l1.setColor(1728053247);
        this.l1.setStrokeWidth(Math.max(2, org.telegram.messenger.g0.L(1.0f)));
        this.f57281m1.setColor(j6.w0(j6.G8, this.A1));
        d0 d0Var = new d0(tp0Var, context);
        this.f57288q1 = d0Var;
        d0Var.setVisibility(8);
        d0Var.setColorPalette(sg.k0.e(i7));
        d0Var.setColorListener(new m(tp0Var, 0));
        e0Var.addView(d0Var, ja.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        v0 v0Var = new v0(context);
        this.f57278k0 = v0Var;
        v0Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        v0Var.setBackground(j6.h0(1090519039, 1, -1));
        e0Var.addView(v0Var, ja.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        z0 z0Var = new z0(context);
        this.f57280l0 = z0Var;
        z0Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        z0Var.setBackground(j6.h0(1090519039, 1, -1));
        z0Var.setOnClickListener(new lt(tp0Var, context, bitmap2, 8));
        e0Var.addView(z0Var, ja.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        m1 m1Var = new m1(context);
        this.V0 = m1Var;
        m1Var.setColorSwatch(this.f57296u1);
        m1Var.setRenderView(this.G0);
        m1Var.setValueOverride(this.W0);
        this.f57296u1.f56646c = this.W0.get();
        m1Var.setOnUpdate(new nb1(tp0Var, i7, 10));
        addView(m1Var, ja.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.O0 = frameLayout2;
        addView(frameLayout2, ja.c(-1.0f, -1));
        this.f57294t1.setStyle(style);
        this.f57294t1.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        s0(this.f57296u1, null);
        w((sg.h) sg.h.f56640a.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            Point point = org.telegram.messenger.g0.f23609q;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (point.y * 0.35f), org.telegram.messenger.g0.L(100.0f), (int) (point.y * 0.65d))));
        }
    }

    public static void X(tp0 tp0Var, Integer num) {
        tp0Var.setNewColor(num.intValue());
        tp0Var.w0(false);
    }

    public static void Y(tg.g0 r13) {
        throw new UnsupportedOperationException("Method not decompiled: tg.g0.Y(tg.g0):void");
    }

    public static void Z(g0 g0Var) {
        g2 g2Var;
        c0 c0Var = g0Var.J0;
        j jVar = g0Var.C0;
        if (jVar != null) {
            PointF A0 = g0Var.A0(jVar);
            j jVar2 = g0Var.C0;
            if (jVar2 instanceof g2) {
                g2 g2Var2 = new g2(g0Var.getContext(), (g2) g0Var.C0, A0);
                g2Var2.setDelegate(g0Var);
                c0Var.addView(g2Var2);
                g2Var = g2Var2;
            } else if (jVar2 instanceof o2) {
                o2 o2Var = new o2(g0Var.getContext(), (o2) g0Var.C0, A0);
                o2Var.setDelegate(g0Var);
                o2Var.setMaxWidth((int) (g0Var.getPaintingSize().f37713a - 20.0f));
                c0Var.addView(o2Var, ja.c(-2.0f, -2));
                g2Var = o2Var;
            } else {
                g2Var = null;
            }
            g0Var.p0(g2Var);
            g0Var.r0(g2Var, true);
        }
        org.telegram.ui.ActionBar.g1 g1Var = g0Var.B1;
        if (g1Var != null && g1Var.isShowing()) {
            g0Var.B1.d(true);
        }
    }

    public static void a0(tp0 tp0Var, Integer num) {
        sg.k0 k0Var = tp0Var.F1;
        k0Var.h(num.intValue(), true);
        k0Var.g();
        tp0Var.setNewColor(num.intValue());
        d0 d0Var = tp0Var.f57288q1;
        d0Var.setSelectedColorIndex(k0Var.d());
        d0Var.getAdapter().f();
    }

    public ViewGroup getBarView() {
        if (this.Q0 == 2) {
            return this.f57272e1;
        }
        return this.f57271d1;
    }

    private int getFrameRotation() {
        int i7 = this.Y0;
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

    private nt0 getPaintingSize() {
        int i7;
        nt0 nt0Var = this.B0;
        if (nt0Var != null) {
            return nt0Var;
        }
        Bitmap bitmap = this.f57282n0;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        int o4 = gz.o();
        if (o4 != 0) {
            if (o4 != 2) {
                i7 = 2560;
            } else {
                i7 = 3840;
            }
        } else {
            i7 = 1280;
        }
        nt0 nt0Var2 = new nt0(width, height);
        float f10 = i7;
        nt0Var2.f37713a = f10;
        float floor = (float) Math.floor((f10 * height) / width);
        nt0Var2.f37714b = floor;
        if (floor > f10) {
            nt0Var2.f37714b = f10;
            nt0Var2.f37713a = (float) Math.floor((f10 * width) / height);
        }
        this.B0 = nt0Var2;
        return nt0Var2;
    }

    public void setNewColor(int i7) {
        sg.h1 h1Var = this.f57296u1;
        int i10 = h1Var.f56644a;
        h1Var.f56644a = i7;
        s0(h1Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new g4(this, i10, i7, 5));
        duration.start();
    }

    private void setTextType(int i7) {
        this.E0 = i7;
        j jVar = this.C0;
        if (jVar instanceof o2) {
            ((o2) jVar).setType(i7);
        }
        sg.k0 e10 = sg.k0.e(this.f57306z1);
        e10.h = i7;
        e10.f56687a.edit().putInt("text_type", i7).apply();
        this.f57272e1.setOutlineType(i7);
    }

    private void setupTabsLayout(Context context) {
        y4 y4Var = new y4(this, context);
        this.P0 = y4Var;
        y4Var.setClipToPadding(false);
        this.P0.setOrientation(0);
        this.M0.addView(this.P0, ja.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f57268a1 = textView;
        textView.setText(hd.M0(2131747277, null).toUpperCase());
        TextView textView2 = this.f57268a1;
        int i7 = j6.f28941i6;
        u uVar = this.A1;
        q6.Q(textView2, j6.h0(j6.w0(i7, uVar), 7, -1), null, q6.M(i7), uVar);
        this.f57268a1.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.f57268a1.setTextColor(-1);
        this.f57268a1.setTextSize(1, 14.0f);
        this.f57268a1.setGravity(1);
        this.f57268a1.setTypeface(org.telegram.messenger.g0.o());
        this.f57268a1.setSingleLine();
        this.f57268a1.setOnClickListener(new k(this, 0));
        this.P0.addView(this.f57268a1, ja.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.f57269b1 = textView3;
        textView3.setText(hd.M0(2131747276, null).toUpperCase());
        q6.Q(this.f57269b1, j6.h0(j6.w0(i7, uVar), 7, -1), null, q6.M(i7), uVar);
        this.f57269b1.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.f57269b1.setOnClickListener(new k(this, 1));
        this.f57269b1.setTextColor(-1);
        this.f57269b1.setTextSize(1, 14.0f);
        this.f57269b1.setGravity(1);
        this.f57269b1.setTypeface(org.telegram.messenger.g0.o());
        this.f57269b1.setAlpha(0.6f);
        this.f57269b1.setSingleLine();
        this.P0.addView(this.f57269b1, ja.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.f57270c1 = textView4;
        textView4.setText(hd.M0(2131747275, null).toUpperCase());
        q6.Q(this.f57270c1, j6.h0(j6.w0(i7, uVar), 7, -1), null, q6.M(i7), uVar);
        this.f57270c1.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.f57270c1.setTextColor(-1);
        this.f57270c1.setTextSize(1, 14.0f);
        this.f57270c1.setGravity(1);
        this.f57270c1.setTypeface(org.telegram.messenger.g0.o());
        this.f57270c1.setAlpha(0.6f);
        this.f57270c1.setSingleLine();
        this.f57270c1.setOnClickListener(new k(this, 4));
        this.P0.addView(this.f57270c1, ja.l(1.0f, 0, -2));
    }

    public static void u0(o2 o2Var, int i7) {
        int i10;
        o2Var.setAlign(i7);
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
        o2Var.getEditText().setGravity(i10);
        if (i7 != 1) {
            if (i7 == 2 ? !hd.f24101a0 : hd.f24101a0) {
                i11 = 3;
            }
        } else {
            i11 = 4;
        }
        o2Var.getEditText().setTextAlignment(i11);
    }

    @Override
    public final void A() {
        y0(new n(this, 4), this, 53, 0, getHeight());
    }

    public final PointF A0(j jVar) {
        float f10 = 200.0f;
        xe xeVar = this.f57289r0;
        if (xeVar != null) {
            f10 = 200.0f / xeVar.f27490c;
        }
        if (jVar != null) {
            PointF position = jVar.getPosition();
            return new PointF(position.x + f10, position.y + f10);
        }
        float f11 = 100.0f;
        if (xeVar != null) {
            f11 = 100.0f / xeVar.f27490c;
        }
        PointF e02 = e0();
        while (true) {
            int i7 = 0;
            boolean z10 = false;
            while (true) {
                c0 c0Var = this.J0;
                if (i7 >= c0Var.getChildCount()) {
                    break;
                }
                View childAt = c0Var.getChildAt(i7);
                if (childAt instanceof j) {
                    PointF position2 = ((j) childAt).getPosition();
                    if (((float) Math.sqrt(Math.pow(position2.y - e02.y, 2.0d) + Math.pow(position2.x - e02.x, 2.0d))) < f11) {
                        z10 = true;
                    }
                }
                i7++;
            }
            if (!z10) {
                return e02;
            }
            e02 = new PointF(e02.x + f10, e02.y + f10);
        }
    }

    public final void B0(int i7) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z10;
        if (this.Q0 != i7 && this.R0 != i7) {
            ValueAnimator valueAnimator = this.T0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i10 = this.Q0;
            ViewGroup viewGroup3 = this.f57272e1;
            ViewGroup viewGroup4 = this.f57271d1;
            if (i10 == 0) {
                viewGroup = viewGroup4;
            } else if (i10 == 2) {
                viewGroup = viewGroup3;
            } else {
                viewGroup = null;
            }
            this.R0 = i7;
            if (i7 == 0) {
                viewGroup2 = viewGroup4;
            } else if (i7 == 2) {
                viewGroup2 = viewGroup3;
            } else {
                viewGroup2 = null;
            }
            int i11 = this.f57306z1;
            sg.k0 e10 = sg.k0.e(i11);
            if (i7 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (e10.f56696l != z10) {
                e10.f56696l = z10;
                if (z10) {
                    e10.i(-1, false);
                } else {
                    e10.i(e10.f56687a.getInt("brush", 0), false);
                }
            }
            int c10 = sg.k0.e(i11).c();
            sg.h1 h1Var = this.f57296u1;
            h1Var.f56644a = c10;
            s0(h1Var, null);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.T0 = duration;
            duration.setInterpolator(er.f34420f);
            this.T0.addUpdateListener(new b3(this, viewGroup, viewGroup2, 4));
            this.T0.addListener(new z4(this, viewGroup, viewGroup2, i7, 3));
            this.T0.start();
        }
    }

    public final void C0() {
        int i7 = 0;
        while (true) {
            c0 c0Var = this.J0;
            if (i7 < c0Var.getChildCount()) {
                View childAt = c0Var.getChildAt(i7);
                if (childAt != this.C0) {
                    if (childAt instanceof j) {
                        j jVar = (j) childAt;
                        if (!jVar.m0 && jVar.f57384k0 <= 0.0f) {
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
    public final void L(int i7, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        if (i7 > org.telegram.messenger.g0.L(50.0f) && this.R1 && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            if (z10) {
                this.V1 = i7;
                np.d1().edit().putInt("kbd_height_land3", this.V1).commit();
            } else {
                this.U1 = i7;
                np.d1().edit().putInt("kbd_height", this.U1).commit();
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
            int i12 = org.telegram.messenger.g0.f23609q.x;
            if (i11 != i12 || layoutParams.height != i10) {
                layoutParams.width = i12;
                layoutParams.height = i10;
                this.P1.setLayoutParams(layoutParams);
                this.T1 = layoutParams.height;
                requestLayout();
                p3 p3Var = ((tp0) this).Y1.L1;
                if (p3Var != null) {
                    p3Var.a();
                }
                getHeight();
            }
        }
        if (this.W1 == i7 && this.X1 == z10) {
            getHeight();
            return;
        }
        this.W1 = i7;
        this.X1 = z10;
        boolean z13 = this.R1;
        j jVar = this.C0;
        if (jVar instanceof o2) {
            if (((o2) jVar).getEditText().isFocused() && i7 > 0) {
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
            p3 p3Var2 = ((tp0) this).Y1.L1;
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
        hashSet.add(Integer.valueOf(j6.G8));
        hashSet.add(Integer.valueOf(j6.f28922h5));
        hashSet.add(Integer.valueOf(j6.f28957j5));
        hashSet.add(Integer.valueOf(j6.f29107r5));
        hashSet.add(Integer.valueOf(j6.f29269zf));
        hashSet.add(Integer.valueOf(j6.Cf));
        hashSet.add(Integer.valueOf(j6.Ff));
        hashSet.add(Integer.valueOf(j6.Jf));
        hashSet.add(Integer.valueOf(j6.Ef));
        hashSet.add(Integer.valueOf(j6.G6));
        hashSet.add(Integer.valueOf(j6.Di));
        hashSet.add(Integer.valueOf(j6.f29214wi));
        hashSet.add(Integer.valueOf(j6.f29195vi));
        hashSet.add(Integer.valueOf(j6.f29233xi));
        hashSet.add(Integer.valueOf(j6.f29252yi));
        hashSet.add(Integer.valueOf(j6.Bf));
        hashSet.add(Integer.valueOf(j6.Af));
        hashSet.add(Integer.valueOf(j6.f28792a7));
        hashSet.add(Integer.valueOf(j6.f29015m7));
        hashSet.add(Integer.valueOf(j6.f28997l7));
        hashSet.add(Integer.valueOf(j6.f29032n7));
        hashSet.add(Integer.valueOf(j6.f28849d6));
        hashSet.add(Integer.valueOf(j6.f28850d7));
    }

    @Override
    public final void b() {
        setTextType((this.E0 + 1) % 4);
    }

    @Override
    public final void c(int i7) {
        j jVar = this.C0;
        if (jVar instanceof o2) {
            u0((o2) jVar, i7);
            sg.k0 e10 = sg.k0.e(this.f57306z1);
            e10.f56692g = i7;
            e10.f56687a.edit().putInt("text_alignment", i7).apply();
        }
    }

    public final void d0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new org.telegram.ui.web.e1(18, this, (n1) view)).start();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        c0 c0Var;
        o2 o2Var;
        String str;
        if (i7 == ns.C5 && (c0Var = this.J0) != null) {
            for (int i11 = 0; i11 < c0Var.getChildCount(); i11++) {
                View childAt = c0Var.getChildAt(i11);
                if ((childAt instanceof o2) && (str = (o2Var = (o2) childAt).B0) != null) {
                    o2Var.setTypeface(str);
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
        xe xeVar;
        nt0 paintingSize = getPaintingSize();
        float f10 = paintingSize.f37713a / 2.0f;
        float f11 = paintingSize.f37714b / 2.0f;
        if (this.f57289r0 != null) {
            double radians = (float) Math.toRadians(-(xeVar.f27495k + xeVar.d));
            float cos = (float) ((Math.cos(radians) * xeVar.f27488a) - (Math.sin(radians) * xeVar.f27489b));
            float c10 = (float) i5.c.c(radians, xeVar.f27489b, Math.sin(radians) * xeVar.f27488a);
            f10 -= cos * paintingSize.f37713a;
            f11 -= c10 * paintingSize.f37714b;
        }
        return new PointF(f10, f11);
    }

    @Override
    public final void f(j jVar) {
        int[] i02 = i0(jVar);
        y0(new s(this, jVar, 1), this, 51, i02[0], i02[1] - org.telegram.messenger.g0.L(32.0f));
    }

    public final n1 f0(String str, boolean z10) {
        float f10;
        nt0 nt0Var;
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
        c0 c0Var = this.J0;
        if (i7 > 0) {
            float floor = (float) Math.floor(c0Var.getMeasuredWidth() * 0.5d);
            nt0Var = new nt0(floor, floor / f10);
        } else {
            float floor2 = (float) Math.floor(c0Var.getMeasuredHeight() * 0.5d);
            nt0Var = new nt0(f10 * floor2, floor2);
        }
        nt0 nt0Var2 = nt0Var;
        Pair N0 = org.telegram.messenger.g0.N0(str);
        if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
            float f11 = nt0Var2.f37713a;
            nt0Var2.f37713a = nt0Var2.f37714b;
            nt0Var2.f37714b = f11;
        }
        Context context = getContext();
        PointF e02 = e0();
        int intValue = ((Integer) N0.first).intValue();
        ((Integer) N0.second).getClass();
        n1 n1Var = new n1(context, e02, nt0Var2, str, intValue);
        n1Var.setDelegate(this);
        c0Var.addView(n1Var);
        if (z10) {
            p0(n1Var);
            r0(n1Var, true);
        }
        return n1Var;
    }

    public final tg.y g0(java.lang.Object r24, org.telegram.tgnet.TLRPC.Document r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: tg.g0.g0(java.lang.Object, org.telegram.tgnet.TLRPC$Document, boolean):tg.y");
    }

    public int getAdditionalBottom() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    public int getAdditionalTop() {
        return org.telegram.messenger.g0.L(48.0f);
    }

    public View getCancelView() {
        return this.f57278k0;
    }

    public float getCropRotation() {
        xe xeVar = this.f57289r0;
        if (xeVar != null) {
            return xeVar.d + xeVar.f27495k;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.f57280l0;
    }

    public long getLcm() {
        return this.Z0.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        p5[] p5VarArr;
        c0 c0Var = this.J0;
        int childCount = c0Var.getChildCount();
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = c0Var.getChildAt(i7);
            if (childAt instanceof g2) {
                TLRPC.Document sticker = ((g2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f28063id = sticker.f28057id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof o2) {
                CharSequence text = ((o2) childAt).getText();
                if ((text instanceof Spanned) && (p5VarArr = (p5[]) ((Spanned) text).getSpans(0, text.length(), p5.class)) != null) {
                    for (p5 p5Var : p5VarArr) {
                        if (p5Var != null) {
                            TLRPC.Document document = p5Var.document;
                            if (document == null) {
                                document = g5.e(this.f57306z1, p5Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.f28063id = document.f28057id;
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

    public sg.u0 getRenderView() {
        return this.G0;
    }

    public float getSelectedEntityBottom() {
        j jVar = this.C0;
        c0 c0Var = this.J0;
        if (jVar == null) {
            return getY() + c0Var.getMeasuredHeight();
        }
        int[] iArr = new int[2];
        jVar.getLocationInWindow(iArr);
        return (c0Var.getScaleY() * this.C0.getHeight()) + iArr[1];
    }

    public fz0 getThanosEffect() {
        if (!fz0.c()) {
            return null;
        }
        if (this.K0 == null) {
            fz0 fz0Var = new fz0(getContext(), new n(this, 0));
            this.K0 = fz0Var;
            addView(fz0Var);
        }
        return this.K0;
    }

    public final o2 h0(boolean z10) {
        ((tp0) this).Y1.f42781h0.isFocusable();
        nt0 paintingSize = getPaintingSize();
        PointF A0 = A0(null);
        o2 o2Var = new o2(getContext(), A0, (int) (paintingSize.f37713a / 9.0f), "", this.f57296u1, this.E0);
        float f10 = paintingSize.f37713a / 9.0f;
        n nVar = new n(this, 2);
        o2Var.f57502x0 = (int) (0.5f * f10);
        o2Var.f57503y0 = (int) (f10 * 2.0f);
        o2Var.f57504z0 = nVar;
        float f11 = A0.x;
        c0 c0Var = this.J0;
        if (f11 == c0Var.getMeasuredWidth() / 2.0f) {
            o2Var.setStickyX(2);
        }
        if (A0.y == c0Var.getMeasuredHeight() / 2.0f) {
            o2Var.setStickyY(2);
        }
        o2Var.setDelegate(this);
        o2Var.setMaxWidth((int) (paintingSize.f37713a - 20.0f));
        int i7 = this.f57306z1;
        o2Var.setTypeface(sg.k0.e(i7).f56694j);
        o2Var.setType(sg.k0.e(i7).h);
        c0Var.addView(o2Var, ja.c(-2.0f, -2));
        xe xeVar = this.f57289r0;
        if (xeVar != null) {
            o2Var.j(1.0f / xeVar.f27490c);
            o2Var.f(-(xeVar.f27495k + xeVar.d));
        }
        if (z10) {
            p0(o2Var);
            o2Var.q();
            r0(o2Var, false);
            o2Var.getFocusedView().requestFocus();
            org.telegram.messenger.g0.J3(o2Var.getFocusedView());
            this.D0 = true;
            int i10 = sg.k0.e(i7).f56692g;
            e1 e1Var = this.f57272e1;
            e1Var.d(i10, true);
            e1Var.setOutlineType(sg.k0.e(i7).h);
        }
        return o2Var;
    }

    public final boolean i(MotionEvent motionEvent) {
        if (this.C0 != null) {
            r0(null, true);
        }
        float x10 = motionEvent.getX();
        b0 b0Var = this.G0;
        float translationX = ((x10 - b0Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / b0Var.getScaleX();
        float y10 = ((((motionEvent.getY() - b0Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) + org.telegram.messenger.g0.L(32.0f)) - ((getAdditionalTop() - getAdditionalBottom()) / 2.0f)) / b0Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-b0Var.getRotation());
        double d2 = y10;
        float measuredWidth = (b0Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        float measuredHeight = (b0Var.getMeasuredHeight() / 2.0f) + ((float) i5.c.c(radians, d2, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        b0Var.e(obtain);
        obtain.recycle();
        return true;
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
        Point point = org.telegram.messenger.g0.f23609q;
        double d = iArr[0] - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.J0.getRotation());
        double d2 = round2 - (point.y / 2.0f);
        iArr[0] = (point.x / 2) + ((int) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        iArr[1] = (point.y / 2) + ((int) i5.c.c(radians, d2, Math.sin(radians) * d));
        return iArr;
    }

    public final int j0(boolean z10) {
        return this.T1;
    }

    public final void k0(boolean z10) {
        if (this.Q1) {
            x0(0);
        }
        if (z10) {
            ly lyVar = this.P1;
            if (lyVar != null && lyVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.P1.getMeasuredHeight());
                ofFloat.addUpdateListener(new o(this, 0));
                this.S1 = true;
                ofFloat.addListener(new z(this, 1));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f28644w);
                ofFloat.start();
                return;
            }
            l0();
        }
    }

    public final void l0() {
        ly lyVar;
        p3 p3Var;
        if (this.T1 > 0 && (p3Var = ((tp0) this).Y1.L1) != null) {
            p3Var.a();
        }
        if (!this.Q1 && (lyVar = this.P1) != null && lyVar.getVisibility() != 8) {
            this.P1.setVisibility(8);
        }
        this.T1 = 0;
    }

    public final void m0(boolean z10) {
        int i7;
        int i10;
        if (this.Q0 == 0) {
            int i11 = 0;
            if (z10) {
                i7 = 2;
            } else {
                i7 = 0;
            }
            this.V0.setLayerType(i7, null);
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

    @Override
    public final int[] n(j jVar) {
        return i0(jVar);
    }

    public final boolean n0() {
        if (this.f57298v1) {
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
        ns.e().c(this, ns.C5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ns.e().n(this, ns.C5);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int Q;
        super.onLayout(z10, i7, i10, i11, i12);
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        int i15 = 0;
        if (this.P1 != null) {
            if (org.telegram.messenger.g0.Q1()) {
                Q = i14 - this.P1.getMeasuredHeight();
            } else {
                Q = (Q() + i14) - this.P1.getMeasuredHeight();
            }
            ly lyVar = this.P1;
            lyVar.layout(0, Q, lyVar.getMeasuredWidth(), this.P1.getMeasuredHeight() + Q);
        }
        if (!this.F0) {
            i15 = org.telegram.messenger.g0.f23603m;
        }
        b0 b0Var = this.G0;
        int ceil = (int) Math.ceil((i13 - b0Var.getMeasuredWidth()) / 2.0f);
        int additionalTop = ((getAdditionalTop() - getAdditionalBottom()) / 2) + k5.C(8.0f, (((i14 - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i15)) - org.telegram.messenger.g0.L(48.0f)) - b0Var.getMeasuredHeight()) / 2, i15);
        b0Var.layout(ceil, additionalTop, b0Var.getMeasuredWidth() + ceil, b0Var.getMeasuredHeight() + additionalTop);
        rv rvVar = this.H0;
        rvVar.layout(ceil, additionalTop, rvVar.getMeasuredWidth() + ceil, rvVar.getMeasuredHeight() + additionalTop);
        int measuredWidth = b0Var.getMeasuredWidth();
        c0 c0Var = this.J0;
        int measuredWidth2 = ((measuredWidth - c0Var.getMeasuredWidth()) / 2) + ceil;
        int measuredHeight = ((b0Var.getMeasuredHeight() - c0Var.getMeasuredHeight()) / 2) + additionalTop;
        c0Var.layout(measuredWidth2, measuredHeight, c0Var.getMeasuredWidth() + measuredWidth2, c0Var.getMeasuredHeight() + measuredHeight);
        fz0 fz0Var = this.K0;
        if (fz0Var != null) {
            fz0Var.layout(measuredWidth2, measuredHeight, c0Var.getMeasuredWidth() + measuredWidth2, c0Var.getMeasuredHeight() + measuredHeight);
        }
        eh0 eh0Var = this.I0;
        eh0Var.layout(ceil, additionalTop, eh0Var.getMeasuredWidth() + ceil, eh0Var.getMeasuredHeight() + additionalTop);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float currentActionBarHeight;
        float f10;
        this.f57305z0 = true;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((org.telegram.messenger.g0.f23609q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - org.telegram.messenger.g0.L(48.0f);
        Bitmap bitmap = this.f57282n0;
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
        float f13 = f11 / this.B0.f37713a;
        this.A0 = f13;
        c0 c0Var = this.J0;
        c0Var.setScaleX(f13);
        c0Var.setScaleY(this.A0);
        c0Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.B0.f37713a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.B0.f37714b, 1073741824));
        fz0 fz0Var = this.K0;
        if (fz0Var != null) {
            fz0Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.B0.f37713a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.B0.f37714b, 1073741824));
            this.K0.setScaleX(this.A0);
            this.K0.setScaleY(this.A0);
        }
        C0();
        this.I0.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
        measureChild(this.M0, i7, i10);
        measureChild(this.V0, i7, i10);
        measureChild(this.O0, i7, i10);
        measureChild(this.N0, i7, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(getPKeyboardHeight(), this.T1), 1073741824));
        FrameLayout frameLayout = this.L0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.f23603m, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i7, i10);
        this.f57305z0 = false;
        if (org.telegram.messenger.g0.L(20.0f) >= 0 && !this.Q1 && !this.S1) {
            this.f57305z0 = true;
            l0();
            this.f57305z0 = false;
        }
        if (org.telegram.messenger.g0.L(20.0f) < 0) {
            l0();
        }
        ly lyVar = this.P1;
        if (lyVar != null) {
            measureChild(lyVar, i7, i10);
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
        this.f57285p0.b(jVar.getUUID(), new s(this, jVar, 0));
    }

    @Override
    public final boolean q() {
        return !this.D0;
    }

    public final void q0(j jVar) {
        j jVar2 = this.C0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.f57387n0, false);
            this.C0 = null;
            if (jVar instanceof o2) {
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
            sg.k1 k1Var = this.f57285p0;
            k1Var.f56698b.remove(uuid);
            k1Var.f56699c.remove(uuid);
            org.telegram.messenger.g0.h3(new q2.d(k1Var, 11));
        }
        m1 m1Var = this.V0;
        ff ffVar = this.W0;
        m1Var.setValueOverride(ffVar);
        m1Var.setShowPreview(true);
        float f10 = ffVar.get();
        sg.h1 h1Var = this.f57296u1;
        h1Var.f56646c = f10;
        s0(h1Var, null);
    }

    public final boolean r0(j jVar, boolean z10) {
        g0 g0Var;
        boolean z11;
        int i7;
        boolean z12 = jVar instanceof o2;
        int i10 = 2;
        if (z12 && (((i7 = this.R0) == -1 && this.Q0 != 2) || (i7 != -1 && i7 != 2))) {
            ValueAnimator valueAnimator = this.T0;
            if (valueAnimator != null && i7 != 2) {
                valueAnimator.cancel();
            }
            if (this.f57298v1) {
                w0(false);
            }
            B0(2);
        }
        if (z12 && z10) {
            o2 o2Var = (o2) jVar;
            int gravity = o2Var.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i10 = 0;
                }
            } else {
                i10 = 1;
            }
            e1 e1Var = this.f57272e1;
            e1Var.setAlignment(i10);
            e1Var.setTypeface(o2Var.getTypeface().f56580a);
            e1Var.e(o2Var.getType(), true);
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
                if (jVar2 instanceof o2) {
                    org.telegram.messenger.g0.J3(((o2) jVar2).getFocusedView());
                    k0(false);
                }
                return true;
            }
            g0Var = this;
            jVar2.l(jVar2.f57387n0, false);
            j jVar3 = g0Var.C0;
            if (jVar3 instanceof o2) {
                o2 o2Var2 = (o2) jVar3;
                n2 n2Var = o2Var2.f57496r0;
                n2Var.clearFocus();
                n2Var.setEnabled(false);
                n2Var.setClickable(false);
                o2Var2.m();
                if (!z12) {
                    g0Var.D0 = false;
                    org.telegram.messenger.g0.v1(((o2) g0Var.C0).getFocusedView());
                    k0(false);
                }
            }
            z11 = true;
        } else {
            g0Var = this;
            z11 = false;
        }
        j jVar4 = g0Var.C0;
        g0Var.C0 = jVar;
        if ((jVar4 instanceof o2) && TextUtils.isEmpty(((o2) jVar4).getText())) {
            q0(jVar4);
        }
        j jVar5 = g0Var.C0;
        ff ffVar = g0Var.W0;
        sg.h1 h1Var = g0Var.f57296u1;
        m1 m1Var = g0Var.V0;
        if (jVar5 != null) {
            eh0 eh0Var = g0Var.I0;
            jVar5.f57387n0 = eh0Var;
            jVar5.l(eh0Var, true);
            g0Var.J0.bringChildToFront(g0Var.C0);
            j jVar6 = g0Var.C0;
            if (jVar6 instanceof o2) {
                o2 o2Var3 = (o2) jVar6;
                o2Var3.A0 = false;
                o2Var3.getSwatch().f56646c = h1Var.f56646c;
                s0(o2Var3.getSwatch(), null);
                m1Var.setValueOverride(new w4(o2Var3, (int) (g0Var.B0.f37713a / 9.0f), 1));
                m1Var.setShowPreview(false);
                return true;
            }
            m1Var.setValueOverride(ffVar);
            m1Var.setShowPreview(true);
            h1Var.f56646c = ffVar.get();
            s0(h1Var, null);
            return true;
        }
        ValueAnimator valueAnimator2 = g0Var.T0;
        if (valueAnimator2 != null && g0Var.R0 != 0) {
            valueAnimator2.cancel();
        }
        if (g0Var.f57298v1) {
            w0(false);
        }
        B0(0);
        m1Var.setValueOverride(ffVar);
        m1Var.setShowPreview(true);
        h1Var.f56646c = ffVar.get();
        s0(h1Var, null);
        return z11;
    }

    @Override
    public final void requestLayout() {
        if (this.f57305z0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(sg.h1 h1Var, Integer num) {
        sg.h1 h1Var2 = this.f57296u1;
        if (h1Var2 != h1Var) {
            h1Var2.f56644a = h1Var.f56644a;
            h1Var2.f56645b = h1Var.f56645b;
            h1Var2.f56646c = h1Var.f56646c;
            int i7 = this.f57306z1;
            sg.k0.e(i7).h(h1Var.f56644a, true);
            sg.k0.e(i7).j(h1Var.f56646c);
        }
        int i10 = h1Var.f56644a;
        b0 b0Var = this.G0;
        b0Var.setColor(i10);
        b0Var.setBrushSize(h1Var.f56646c);
        int i11 = h1Var2.f56644a;
        if (num != null && num.intValue() != i11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new a4(this, num, i11, 3));
            duration.start();
        } else {
            e0 e0Var = this.M0;
            if (e0Var != null) {
                e0Var.invalidate();
            }
        }
        j jVar = this.C0;
        if (jVar instanceof o2) {
            ((o2) jVar).setSwatch(new sg.h1(h1Var.f56645b, h1Var.f56646c, h1Var.f56644a));
        }
    }

    public void setBlurredBackgroundDrawableForTools(fh.g gVar) {
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

    @Override
    public final void t() {
        p3 p3Var;
        if (!this.R1 && !this.Q1) {
            h0(true);
            return;
        }
        boolean z10 = this.Q1;
        if (z10 && (p3Var = ((tp0) this).Y1.L1) != null) {
            p3Var.f14845e = true;
        }
        x0(!z10 ? 1 : 0);
        if (z10) {
            j jVar = this.C0;
            if (jVar instanceof o2) {
                org.telegram.messenger.g0.J3(((o2) jVar).getEditText());
            }
        }
    }

    public final void t0(float f10) {
        this.m0 = f10;
        this.L0.setTranslationY(-f10);
        this.M0.setTranslationY(f10);
    }

    @Override
    public final boolean u(j jVar) {
        return r0(jVar, true);
    }

    @Override
    public final void updateColors() {
        this.f57304y1.setColor(-15132391);
    }

    @Override
    public final void v(float f10, float f11, float[] fArr) {
        Point point = org.telegram.messenger.g0.f23609q;
        double d = f10 - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.J0.getRotation());
        double d2 = f11 - (point.y / 2.0f);
        fArr[0] = (point.x / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        fArr[1] = (point.y / 2.0f) + ((float) i5.c.c(radians, d2, Math.sin(radians) * d));
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
        this.f57291s0 = f10;
        this.f57301x0 = f13;
        this.f57303y0 = f14;
        this.f57293t0 = f11;
        this.f57295u0 = f12;
        this.f57297v0 = f11;
        float f22 = f12 + 0.0f;
        this.f57299w0 = f22;
        for (int i7 = 0; i7 < 4; i7++) {
            if (i7 == 0) {
                view = this.J0;
            } else if (i7 == 1) {
                view = this.I0;
            } else if (i7 == 2) {
                view = this.G0;
            } else {
                view = this.H0;
            }
            xe xeVar = this.f57289r0;
            if (xeVar != null) {
                float f23 = xeVar.f27490c * 1.0f;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                if (measuredWidth != 0 && measuredHeight != 0) {
                    int i10 = xeVar.f27495k;
                    if (i10 == 90 || i10 == 270) {
                        measuredHeight = measuredWidth;
                        measuredWidth = measuredHeight;
                    }
                    float max = Math.max(f13 / ((int) (xeVar.f27491e * f20)), f14 / ((int) (xeVar.f27492f * f21)));
                    f16 = f23 * max;
                    float D = com.google.android.gms.internal.vision.e2.D(xeVar.f27488a, measuredWidth, f10, max);
                    float f24 = xeVar.f27490c;
                    f17 = (D * f24) + f11;
                    f15 = 1.0f;
                    f18 = (xeVar.f27489b * measuredHeight * f10 * max * f24) + f22;
                    f19 = xeVar.d + i10;
                } else {
                    return;
                }
            } else {
                f15 = 1.0f;
                if (i7 == 0) {
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
    public final void w(sg.h hVar) {
        boolean z10 = hVar instanceof sg.b;
        m1 m1Var = this.V0;
        if (!z10 && !(hVar instanceof sg.d)) {
            m1Var.b(0.05f, 1.0f);
        } else {
            m1Var.b(0.4f, 1.75f);
        }
        m1Var.setDrawCenter(!(hVar instanceof sg.g));
        b0 b0Var = this.G0;
        if (b0Var.getCurrentBrush() instanceof sg.g) {
            this.U0 = true;
        }
        b0Var.setBrush(hVar);
        sg.h1 h1Var = this.f57296u1;
        int i7 = h1Var.f56644a;
        h1Var.f56644a = sg.k0.e(this.f57306z1).c();
        h1Var.f56646c = this.W0.get();
        s0(h1Var, Integer.valueOf(i7));
        this.H0.invalidate();
    }

    public final void w0(final boolean z10) {
        float f10;
        boolean z11;
        if (this.f57298v1 != z10) {
            this.f57298v1 = z10;
            r1.g gVar = this.f57300w1;
            if (gVar != null) {
                gVar.d();
            }
            float f11 = 1000.0f;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1000.0f;
            }
            r1.g gVar2 = new r1.g(new r1.f(f10));
            this.f57300w1 = gVar2;
            r1.h hVar = new r1.h();
            if (!z10) {
                f11 = 0.0f;
            }
            hVar.f55756i = f11;
            hVar.b(1250.0f);
            hVar.a(1.0f);
            gVar2.f55748m = hVar;
            if (!this.R1 && !this.Q1) {
                z11 = false;
            } else {
                z11 = true;
            }
            final boolean[] zArr = {z11};
            final float translationY = this.M0.getTranslationY();
            final ViewGroup barView = getBarView();
            this.f57300w1.b(new r1.d() {
                @Override
                public final void a(r1.g gVar3, float f12, float f13) {
                    int i7;
                    g0 g0Var = g0.this;
                    e0 e0Var = g0Var.M0;
                    float f14 = f12 / 1000.0f;
                    g0Var.f57302x1 = f14;
                    float f15 = ((1.0f - f14) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f15);
                    view.setScaleY(f15);
                    view.setTranslationY((Math.min(g0Var.f57302x1, 0.25f) * org.telegram.messenger.g0.L(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(g0Var.f57302x1, 0.25f) / 0.25f));
                    d0 d0Var = g0Var.f57288q1;
                    float f16 = g0Var.f57302x1;
                    boolean z12 = z10;
                    d0Var.B1(z12, f16);
                    g0Var.f57280l0.setProgress(g0Var.f57302x1);
                    g0Var.f57278k0.setProgress(g0Var.f57302x1);
                    g0Var.P0.setTranslationY(org.telegram.messenger.g0.L(32.0f) * g0Var.f57302x1);
                    if (zArr[0]) {
                        float f17 = g0Var.f57302x1;
                        if (!z12) {
                            f17 = 1.0f - f17;
                        }
                        float L = org.telegram.messenger.g0.L(40.0f) * f17;
                        if (z12) {
                            i7 = 1;
                        } else {
                            i7 = -1;
                        }
                        e0Var.setTranslationY(translationY - (L * i7));
                    }
                    e0Var.invalidate();
                    if (view == g0Var.f57272e1) {
                        g0Var.N0.invalidate();
                    }
                }
            });
            this.f57300w1.a(new r(this, z10, 1));
            this.f57300w1.h();
            if (z10) {
                d0 d0Var = this.f57288q1;
                d0Var.setVisibility(0);
                d0Var.setSelectedColorIndex(sg.k0.e(this.f57306z1).d());
            }
        }
    }

    @Override
    public final sg.k0 x() {
        return sg.k0.e(this.f57306z1);
    }

    public final void x0(int i7) {
        boolean z10;
        int i10;
        e1 e1Var = this.f57272e1;
        if (i7 == 1) {
            ly lyVar = this.P1;
            if (lyVar != null && lyVar.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ly lyVar2 = this.P1;
            if (lyVar2 != null && lyVar2.f36941d1 != m10.f24934t0) {
                removeView(lyVar2);
                this.P1 = null;
            }
            if (this.P1 == null) {
                ly lyVar3 = new ly(null, true, false, false, getContext(), false, null, null, true, this.A1, false, false);
                this.P1 = lyVar3;
                lyVar3.V0 = true;
                lyVar3.setVisibility(8);
                if (org.telegram.messenger.g0.Q1()) {
                    this.P1.setForseMultiwindowLayout(true);
                }
                this.P1.setDelegate(new a0(this));
                addView(this.P1);
            }
            this.P1.setVisibility(0);
            this.Q1 = true;
            ly lyVar4 = this.P1;
            if (this.U1 <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.U1 = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.U1 = np.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                }
            }
            if (this.V1 <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.V1 = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.V1 = np.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                }
            }
            Point point = org.telegram.messenger.g0.f23609q;
            if (point.x > point.y) {
                i10 = this.V1;
            } else {
                i10 = this.U1;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) lyVar4.getLayoutParams();
            layoutParams.height = i10;
            lyVar4.setLayoutParams(layoutParams);
            if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                j jVar = this.C0;
                if (jVar instanceof o2) {
                    org.telegram.messenger.g0.v1(((o2) jVar).getEditText());
                }
            }
            this.T1 = i10;
            requestLayout();
            p3 p3Var = ((tp0) this).Y1.L1;
            if (p3Var != null) {
                p3Var.a();
            }
            pg emojiButton = e1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(ng.d, true);
            }
            getHeight();
            if (!z10 && !this.R1) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.T1, 0.0f);
                ofFloat.addUpdateListener(new o(this, 1));
                ofFloat.addListener(new z(this, 0));
                ofFloat.start();
                return;
            }
            return;
        }
        pg emojiButton2 = e1Var.getEmojiButton();
        if (emojiButton2 != null) {
            emojiButton2.j(ng.f37583e, true);
        }
        ly lyVar5 = this.P1;
        if (lyVar5 != null) {
            this.Q1 = false;
            if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                lyVar5.setVisibility(8);
            }
        }
        if (i7 == 0) {
            this.T1 = 0;
        }
        p3 p3Var2 = ((tp0) this).Y1.L1;
        if (p3Var2 != null) {
            p3Var2.a();
        }
        requestLayout();
        getHeight();
    }

    public final void y0(Runnable runnable, g0 g0Var, int i7, int i10, int i11) {
        org.telegram.ui.ActionBar.g1 g1Var = this.B1;
        if (g1Var != null && g1Var.isShowing()) {
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
            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(this.C1, -2, -2);
            this.B1 = g1Var2;
            g1Var2.f28553b = true;
            g1Var2.setAnimationStyle(2131755191);
            this.B1.setOutsideTouchable(true);
            this.B1.setClippingEnabled(true);
            this.B1.setInputMethodMode(2);
            this.B1.setSoftInputMode(0);
            this.B1.getContentView().setFocusableInTouchMode(true);
            this.B1.setOnDismissListener(new m4(2, this));
        }
        this.C1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
        this.B1.setFocusable(true);
        this.B1.showAtLocation(g0Var, i7, i10 - (this.C1.getMeasuredWidth() / 2), i11 - this.C1.getMeasuredHeight());
        org.telegram.ui.ActionBar.g1.i(this.C1);
    }

    public final void z0(boolean z10) {
        float f10;
        if (this.f57284o1 != z10) {
            this.f57284o1 = z10;
            r1.g gVar = this.f57286p1;
            if (gVar != null) {
                gVar.d();
            }
            float f11 = 1000.0f;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1000.0f;
            }
            r1.g gVar2 = new r1.g(new r1.f(f10));
            this.f57286p1 = gVar2;
            r1.h hVar = new r1.h();
            if (!z10) {
                f11 = 0.0f;
            }
            hVar.f55756i = f11;
            hVar.b(1250.0f);
            hVar.a(1.0f);
            gVar2.f55748m = hVar;
            if (z10) {
                j1 j1Var = this.f57273f1;
                j1Var.setAlpha(0.0f);
                j1Var.setVisibility(0);
            }
            this.f57286p1.b(new t7(3, this));
            this.f57286p1.a(new r(this, z10, 0));
            this.f57286p1.h();
        }
    }

    @Override
    public final void B(boolean z10) {
    }

    @Override
    public final void d(boolean z10) {
    }

    @Override
    public final void e(boolean z10) {
    }

    @Override
    public final void j(boolean z10) {
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
