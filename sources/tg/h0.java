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
import bi.k8;
import c8.ma;
import fi.q7;
import fi.z2;
import hi.f4;
import hi.i4;
import hi.k4;
import hi.o3;
import hi.u4;
import hi.x4;
import hi.z3;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.cz;
import org.telegram.messenger.d20;
import org.telegram.messenger.f3;
import org.telegram.messenger.g6;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.r5;
import org.telegram.messenger.xe;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Cells.c5;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oz0;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.x01;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.yg;
import org.telegram.ui.Components.yt0;
import org.telegram.ui.hn0;
import org.telegram.ui.ih0;
import org.telegram.ui.jw0;
import org.telegram.ui.uv;
import org.telegram.ui.vp0;
public abstract class h0 extends eu0 implements h1, h, d1, cu0, gs {
    public float A0;
    public final v A1;
    public yt0 B0;
    public org.telegram.ui.ActionBar.g1 B1;
    public j C0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout C1;
    public boolean D0;
    public Rect D1;
    public int E0;
    public Runnable E1;
    public final boolean F0;
    public final sg.k0 F1;
    public final c0 G0;
    public boolean G1;
    public final uv H0;
    public float H1;
    public final ih0 I0;
    public boolean I1;
    public final d0 J0;
    public final d6 J1;
    public oz0 K0;
    public final Paint K1;
    public final FrameLayout L0;
    public final Paint L1;
    public final f0 M0;
    public fh.g M1;
    public final x01 N0;
    public final float[] N1;
    public final FrameLayout O0;
    public final int[] O1;
    public x4 P0;
    public ty P1;
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
    public final n1 V0;
    public int V1;
    public final qf W0;
    public int W1;
    public ArrayList X0;
    public boolean X1;
    public final int Y0;
    public BigInteger Z0;
    public TextView f57908a1;
    public TextView f57909b1;
    public TextView f57910c1;
    public final i1 f57911d1;
    public final f1 f57912e1;
    public final k1 f57913f1;
    public final ImageView f57914g1;
    public final LinearLayout f57915h1;
    public final TextView f57916i1;
    public final TextView f57917j1;
    public final w0 f57918k0;
    public final TextView f57919k1;
    public final a1 f57920l0;
    public final Paint l1;
    public float m0;
    public final Paint f57921m1;
    public final Bitmap f57922n0;
    public float n1;
    public final Bitmap f57923o0;
    public boolean f57924o1;
    public final sg.k1 f57925p0;
    public r1.g f57926p1;
    public final r5 f57927q0;
    public final e0 f57928q1;
    public final xe f57929r0;
    public final Paint f57930r1;
    public float f57931s0;
    public final Paint f57932s1;
    public float f57933t0;
    public final Paint f57934t1;
    public float f57935u0;
    public final sg.h1 f57936u1;
    public float f57937v0;
    public boolean f57938v1;
    public float f57939w0;
    public r1.g f57940w1;
    public float f57941x0;
    public float f57942x1;
    public float f57943y0;
    public final Paint f57944y1;
    public boolean f57945z0;
    public final int f57946z1;

    public h0(Context context, Activity activity, int i7, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, xe xeVar, hn0 hn0Var, final h6 h6Var) {
        super(context, activity);
        boolean z10;
        int i11;
        g6[] g6VarArr;
        p1 p1Var;
        boolean z11 = false;
        this.Q0 = 0;
        this.R0 = -1;
        final vp0 vp0Var = (vp0) this;
        this.W0 = new qf(vp0Var, 19);
        byte b10 = 1;
        this.l1 = new Paint(1);
        this.f57921m1 = new Paint(1);
        this.f57930r1 = new Paint(1);
        this.f57932s1 = new Paint(1);
        this.f57934t1 = new Paint(1);
        sg.h1 h1Var = new sg.h1(1.0f, 0.016773745f, -1);
        this.f57936u1 = h1Var;
        this.f57944y1 = new Paint(1);
        this.I1 = false;
        this.J1 = new d6((View) this, 350L, nr.h);
        this.K1 = new Paint(1);
        Paint paint = new Paint(1);
        this.L1 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new Matrix();
        this.N1 = new float[2];
        this.O1 = new int[2];
        new s4.s0(vp0Var, 3);
        setDelegate(this);
        this.f57946z1 = i7;
        this.A1 = new h6() {
            @Override
            public final boolean d() {
                return m6.I.q();
            }

            @Override
            public final void e(float f10, float f11, int i12, int i13) {
                m6.r(f10, f11, i12, i13);
            }

            @Override
            public final ColorFilter f() {
                return m6.f29713v3;
            }

            @Override
            public final Paint g(String str) {
                return m6.V0(str);
            }

            @Override
            public final Drawable getDrawable(String str) {
                return null;
            }

            @Override
            public final boolean h() {
                return cz.H0;
            }

            @Override
            public final int i(int i12) {
                return k(i12);
            }

            @Override
            public final boolean j() {
                return false;
            }

            @Override
            public final int k(int i12) {
                if (i12 == m6.G8) {
                    return -14145495;
                }
                if (i12 != m6.E8) {
                    if (i12 == m6.f29454h5) {
                        return -14737633;
                    }
                    if (i12 == m6.f29489j5) {
                        return -592138;
                    }
                    if (i12 == m6.f29639r5) {
                        return -8553091;
                    }
                    if (i12 != m6.f29801zf) {
                        if (i12 == m6.Cf) {
                            return -1610612736;
                        }
                        if (i12 == m6.Ff || i12 == m6.Jf || i12 == m6.Ef) {
                            return -9539985;
                        }
                        if (i12 != m6.G6) {
                            int i13 = m6.Di;
                            if (i12 == i13) {
                                return -11754001;
                            }
                            if (i12 == m6.f29473i6) {
                                return 536870911;
                            }
                            if (i12 != m6.f29746wi && i12 != m6.f29727vi && i12 != m6.f29765xi) {
                                if (i12 == m6.f29784yi) {
                                    return 352321535;
                                }
                                if (i12 != m6.Bf && i12 != i13) {
                                    if (i12 == m6.Af) {
                                        return 780633991;
                                    }
                                    if (i12 == m6.f29324a7) {
                                        return -15921907;
                                    }
                                    if (i12 == m6.f29547m7) {
                                        return -12500671;
                                    }
                                    if (i12 == m6.f29529l7) {
                                        return -13133079;
                                    }
                                    if (i12 == m6.f29564n7) {
                                        return -1;
                                    }
                                    if (i12 == m6.f29381d6) {
                                        return -15198183;
                                    }
                                    if (i12 == m6.f29382d7) {
                                        return -16777216;
                                    }
                                    h6 h6Var2 = h6.this;
                                    if (h6Var2 != null) {
                                        return h6Var2.k(i12);
                                    }
                                    return m6.v0(i12);
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
            public final int m(int i12) {
                return k(i12);
            }

            @Override
            public final void l(int i12, int i13) {
            }
        };
        this.f57929r0 = xeVar;
        this.F0 = context instanceof BubbleActivity;
        sg.k0 e10 = sg.k0.e(i7);
        this.F1 = e10;
        e10.i(0, true);
        h1Var.f57263a = e10.c();
        h1Var.f57265c = e10.f57312i;
        r5 r5Var = new r5("Paint", true);
        this.f57927q0 = r5Var;
        this.f57922n0 = bitmap;
        this.f57923o0 = bitmap2;
        this.Y0 = i10;
        sg.k1 k1Var = new sg.k1();
        this.f57925p0 = k1Var;
        k1Var.f57316a = new org.telegram.tgnet.u(vp0Var, 27);
        byte b11 = 2;
        c0 c0Var = new c0(vp0Var, context, new sg.i0(getPaintingSize(), bitmap2, i10, null), bitmap, bitmap2);
        this.G0 = c0Var;
        c0Var.setDelegate(new sg.h0(vp0Var, hn0Var, false, 3));
        c0Var.setUndoStore(k1Var);
        c0Var.setQueue(r5Var);
        c0Var.setVisibility(4);
        addView(c0Var, ma.e(-1, -1, 51));
        uv uvVar = new uv(13, context, vp0Var);
        this.H0 = uvVar;
        uvVar.setVisibility(4);
        addView(uvVar, ma.e(-1, -1, 51));
        d0 d0Var = new d0(vp0Var, context, new c5(vp0Var));
        this.J0 = d0Var;
        addView(d0Var);
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                d20 d20Var = (d20) arrayList.get(i12);
                byte b12 = d20Var.f23478a;
                if (b12 == 0) {
                    ?? g02 = g0(d20Var.C, d20Var.B, z11);
                    if ((d20Var.f23479b & 2) != 0) {
                        g02.r(z11);
                    }
                    ViewGroup.LayoutParams layoutParams = g02.getLayoutParams();
                    layoutParams.width = d20Var.f23492q;
                    layoutParams.height = d20Var.f23493r;
                    i11 = size;
                    p1Var = g02;
                } else if (b12 == b10) {
                    ?? h02 = h0(z11);
                    h02.setType(d20Var.f23479b);
                    h02.setTypeface(d20Var.f23489n);
                    h02.setBaseFontSize(d20Var.f23488m);
                    SpannableString spannableString = new SpannableString(d20Var.f23485j);
                    ?? r14 = d20Var.f23486k;
                    int size2 = r14.size();
                    int i13 = z11;
                    while (i13 < size2) {
                        Object obj = r14.get(i13);
                        int i14 = i13 + 1;
                        c20 c20Var = (c20) obj;
                        y5 y5Var = new y5(c20Var.document_id, h02.getFontMetricsInt());
                        int i15 = c20Var.offset;
                        spannableString.setSpan(y5Var, i15, c20Var.length + i15, 33);
                        size = size;
                        size2 = size2;
                        i13 = i14;
                    }
                    i11 = size;
                    CharSequence m10 = j6.m(spannableString, h02.getFontMetricsInt(), false, null, 0);
                    if ((m10 instanceof Spanned) && (g6VarArr = (g6[]) ((Spanned) m10).getSpans(0, m10.length(), g6.class)) != null) {
                        for (g6 g6Var : g6VarArr) {
                            g6Var.f24095b = 0.85f;
                        }
                    }
                    h02.setText(m10);
                    u0(h02, d20Var.f23491p);
                    sg.h1 swatch = h02.getSwatch();
                    swatch.f57263a = d20Var.f23487l;
                    h02.setSwatch(swatch);
                    p1Var = h02;
                } else {
                    i11 = size;
                    byte b13 = b11;
                    if (b12 == b13) {
                        p1 f02 = f0(d20Var.f23485j, false);
                        f02.C0 = false;
                        if ((d20Var.f23479b & b13) != 0) {
                            f02.r(false);
                        }
                        if ((d20Var.f23479b & 16) != 0) {
                            f02.t(false);
                        }
                        ViewGroup.LayoutParams layoutParams2 = f02.getLayoutParams();
                        layoutParams2.width = d20Var.f23492q;
                        layoutParams2.height = d20Var.f23493r;
                        p1Var = f02;
                    } else {
                        i12++;
                        size = i11;
                        z11 = false;
                        b10 = 1;
                        b11 = 2;
                    }
                }
                p1Var.setX((d20Var.f23480c * this.B0.f42546a) - (((1.0f - d20Var.v) * d20Var.f23492q) / 2.0f));
                p1Var.setY((d20Var.d * this.B0.f42547b) - (((1.0f - d20Var.v) * d20Var.f23493r) / 2.0f));
                p1Var.setPosition(new PointF((d20Var.f23492q / 2.0f) + p1Var.getX(), (d20Var.f23493r / 2.0f) + p1Var.getY()));
                p1Var.setScale(d20Var.v);
                p1Var.setRotation((float) (((-d20Var.f23481e) / 3.141592653589793d) * 180.0d));
                i12++;
                size = i11;
                z11 = false;
                b10 = 1;
                b11 = 2;
            }
        }
        this.J0.setVisibility(4);
        ih0 ih0Var = new ih0(context, 19);
        this.I0 = ih0Var;
        addView(ih0Var);
        ?? frameLayout = new FrameLayout(context);
        this.L0 = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{-16777216, 0}));
        addView(frameLayout, ma.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.f57914g1 = imageView;
        imageView.setImageResource(2131232533);
        imageView.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        imageView.setBackground(m6.h0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        vp0 vp0Var2 = vp0Var;
                        c0 c0Var2 = vp0Var2.G0;
                        if (c0Var2 != null && (c0Var2.getCurrentBrush() instanceof sg.g)) {
                            c0Var2.b();
                            vp0Var2.f57911d1.setSelectedIndex(1);
                            vp0Var2.w((sg.h) sg.h.f57259a.get(0));
                            return;
                        }
                        vp0Var2.f57925p0.c();
                        return;
                    case 1:
                        vp0 vp0Var3 = vp0Var;
                        c0 c0Var3 = vp0Var3.G0;
                        sg.k1 k1Var2 = vp0Var3.f57925p0;
                        if (k1Var2.a()) {
                            if (c0Var3 != null && (c0Var3.getCurrentBrush() instanceof sg.g)) {
                                c0Var3.b();
                                vp0Var3.f57911d1.setSelectedIndex(1);
                                vp0Var3.w((sg.h) sg.h.f57259a.get(0));
                            }
                            c0Var3.a();
                            k1Var2.f57318c.clear();
                            k1Var2.f57317b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(k1Var2, 14));
                            vp0Var3.J0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        vp0 vp0Var4 = vp0Var;
                        j jVar = vp0Var4.C0;
                        if (jVar instanceof n2) {
                            org.telegram.messenger.g0.v1(((n2) jVar).getFocusedView());
                        }
                        if (vp0Var4.Q1) {
                            vp0Var4.k0(false);
                        }
                        vp0Var4.q0(vp0Var4.C0);
                        vp0Var4.r0(null, true);
                        return;
                    default:
                        vp0Var.r0(null, true);
                        return;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout.addView(imageView, ma.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f57915h1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(m6.h0(822083583, 7, -1));
        linearLayout.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 16.0f);
        textView.setText(hd.N0(2131747073, null));
        linearLayout.addView(o10.e(context, 2131232534), ma.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, ma.r(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new bi.o(27));
        frameLayout.addView(linearLayout, ma.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.f57916i1 = textView2;
        textView2.setBackground(m6.h0(822083583, 7, -1));
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView2.setText(hd.N0(2131747085, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        vp0 vp0Var2 = vp0Var;
                        c0 c0Var2 = vp0Var2.G0;
                        if (c0Var2 != null && (c0Var2.getCurrentBrush() instanceof sg.g)) {
                            c0Var2.b();
                            vp0Var2.f57911d1.setSelectedIndex(1);
                            vp0Var2.w((sg.h) sg.h.f57259a.get(0));
                            return;
                        }
                        vp0Var2.f57925p0.c();
                        return;
                    case 1:
                        vp0 vp0Var3 = vp0Var;
                        c0 c0Var3 = vp0Var3.G0;
                        sg.k1 k1Var2 = vp0Var3.f57925p0;
                        if (k1Var2.a()) {
                            if (c0Var3 != null && (c0Var3.getCurrentBrush() instanceof sg.g)) {
                                c0Var3.b();
                                vp0Var3.f57911d1.setSelectedIndex(1);
                                vp0Var3.w((sg.h) sg.h.f57259a.get(0));
                            }
                            c0Var3.a();
                            k1Var2.f57318c.clear();
                            k1Var2.f57317b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(k1Var2, 14));
                            vp0Var3.J0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        vp0 vp0Var4 = vp0Var;
                        j jVar = vp0Var4.C0;
                        if (jVar instanceof n2) {
                            org.telegram.messenger.g0.v1(((n2) jVar).getFocusedView());
                        }
                        if (vp0Var4.Q1) {
                            vp0Var4.k0(false);
                        }
                        vp0Var4.q0(vp0Var4.C0);
                        vp0Var4.r0(null, true);
                        return;
                    default:
                        vp0Var.r0(null, true);
                        return;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView m11 = org.telegram.ui.Cells.c0.m(frameLayout, textView2, ma.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.f57917j1 = m11;
        m11.setBackground(m6.h0(822083583, 7, -1));
        m11.setText(hd.N0(2131752089, null));
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
                        vp0 vp0Var2 = vp0Var;
                        c0 c0Var2 = vp0Var2.G0;
                        if (c0Var2 != null && (c0Var2.getCurrentBrush() instanceof sg.g)) {
                            c0Var2.b();
                            vp0Var2.f57911d1.setSelectedIndex(1);
                            vp0Var2.w((sg.h) sg.h.f57259a.get(0));
                            return;
                        }
                        vp0Var2.f57925p0.c();
                        return;
                    case 1:
                        vp0 vp0Var3 = vp0Var;
                        c0 c0Var3 = vp0Var3.G0;
                        sg.k1 k1Var2 = vp0Var3.f57925p0;
                        if (k1Var2.a()) {
                            if (c0Var3 != null && (c0Var3.getCurrentBrush() instanceof sg.g)) {
                                c0Var3.b();
                                vp0Var3.f57911d1.setSelectedIndex(1);
                                vp0Var3.w((sg.h) sg.h.f57259a.get(0));
                            }
                            c0Var3.a();
                            k1Var2.f57318c.clear();
                            k1Var2.f57317b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(k1Var2, 14));
                            vp0Var3.J0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        vp0 vp0Var4 = vp0Var;
                        j jVar = vp0Var4.C0;
                        if (jVar instanceof n2) {
                            org.telegram.messenger.g0.v1(((n2) jVar).getFocusedView());
                        }
                        if (vp0Var4.Q1) {
                            vp0Var4.k0(false);
                        }
                        vp0Var4.q0(vp0Var4.C0);
                        vp0Var4.r0(null, true);
                        return;
                    default:
                        vp0Var.r0(null, true);
                        return;
                }
            }
        });
        m11.setAlpha(0.0f);
        m11.setVisibility(8);
        TextView m12 = org.telegram.ui.Cells.c0.m(frameLayout, m11, ma.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.f57919k1 = m12;
        m12.setBackground(m6.h0(822083583, 7, -1));
        m12.setText(hd.N0(2131751342, null));
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
                        vp0 vp0Var2 = vp0Var;
                        c0 c0Var2 = vp0Var2.G0;
                        if (c0Var2 != null && (c0Var2.getCurrentBrush() instanceof sg.g)) {
                            c0Var2.b();
                            vp0Var2.f57911d1.setSelectedIndex(1);
                            vp0Var2.w((sg.h) sg.h.f57259a.get(0));
                            return;
                        }
                        vp0Var2.f57925p0.c();
                        return;
                    case 1:
                        vp0 vp0Var3 = vp0Var;
                        c0 c0Var3 = vp0Var3.G0;
                        sg.k1 k1Var2 = vp0Var3.f57925p0;
                        if (k1Var2.a()) {
                            if (c0Var3 != null && (c0Var3.getCurrentBrush() instanceof sg.g)) {
                                c0Var3.b();
                                vp0Var3.f57911d1.setSelectedIndex(1);
                                vp0Var3.w((sg.h) sg.h.f57259a.get(0));
                            }
                            c0Var3.a();
                            k1Var2.f57318c.clear();
                            k1Var2.f57317b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(k1Var2, 14));
                            vp0Var3.J0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        vp0 vp0Var4 = vp0Var;
                        j jVar = vp0Var4.C0;
                        if (jVar instanceof n2) {
                            org.telegram.messenger.g0.v1(((n2) jVar).getFocusedView());
                        }
                        if (vp0Var4.Q1) {
                            vp0Var4.k0(false);
                        }
                        vp0Var4.q0(vp0Var4.C0);
                        vp0Var4.r0(null, true);
                        return;
                    default:
                        vp0Var.r0(null, true);
                        return;
                }
            }
        });
        m12.setAlpha(0.0f);
        m12.setVisibility(8);
        frameLayout.addView(m12, ma.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        f0 f0Var = new f0(vp0Var, context);
        this.M0 = f0Var;
        f0Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), 0);
        f0Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(f0Var, ma.e(-1, 104, 80));
        if (bitmap2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        i1 i1Var = new i1(context, z10);
        this.f57911d1 = i1Var;
        i1Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        i1Var.setDelegate(this);
        i1Var.setSelectedIndex(1);
        f0Var.addView(i1Var, ma.c(48.0f, -1));
        f1 f1Var = new f1(context);
        this.f57912e1 = f1Var;
        f1Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        f1Var.setVisibility(8);
        f1Var.setDelegate(this);
        f1Var.setAlignment(sg.k0.e(i7).f57311g);
        f0Var.addView(f1Var, ma.c(48.0f, -1));
        x01 x01Var = new x01(vp0Var, context);
        this.N0 = x01Var;
        addView(x01Var, ma.c(-1.0f, -1));
        k1 k1Var2 = new k1(context);
        this.f57913f1 = k1Var2;
        k1Var2.setVisibility(8);
        k1Var2.setOnItemClickListener(new k8(vp0Var, 20));
        f1Var.setTypefaceListView(k1Var2);
        x01Var.addView(k1Var2, ma.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        Paint paint2 = this.l1;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.l1.setColor(1728053247);
        this.l1.setStrokeWidth(Math.max(2, org.telegram.messenger.g0.L(1.0f)));
        this.f57921m1.setColor(m6.w0(m6.G8, this.A1));
        e0 e0Var = new e0(vp0Var, context);
        this.f57928q1 = e0Var;
        e0Var.setVisibility(8);
        e0Var.setColorPalette(sg.k0.e(i7));
        e0Var.setColorListener(new m(vp0Var, 0));
        f0Var.addView(e0Var, ma.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        w0 w0Var = new w0(context);
        this.f57918k0 = w0Var;
        w0Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        w0Var.setBackground(m6.h0(1090519039, 1, -1));
        f0Var.addView(w0Var, ma.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        a1 a1Var = new a1(context);
        this.f57920l0 = a1Var;
        a1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        a1Var.setBackground(m6.h0(1090519039, 1, -1));
        a1Var.setOnClickListener(new st(vp0Var, context, bitmap2, 8));
        f0Var.addView(a1Var, ma.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        n1 n1Var = new n1(context);
        this.V0 = n1Var;
        n1Var.setColorSwatch(this.f57936u1);
        n1Var.setRenderView(this.G0);
        n1Var.setValueOverride(this.W0);
        this.f57936u1.f57265c = this.W0.get();
        n1Var.setOnUpdate(new jw0(vp0Var, i7, 13));
        addView(n1Var, ma.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.O0 = frameLayout2;
        addView(frameLayout2, ma.c(-1.0f, -1));
        this.f57934t1.setStyle(style);
        this.f57934t1.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        s0(this.f57936u1, null);
        w((sg.h) sg.h.f57259a.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            Point point = org.telegram.messenger.g0.f24046q;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (point.y * 0.35f), org.telegram.messenger.g0.L(100.0f), (int) (point.y * 0.65d))));
        }
    }

    public static void X(vp0 vp0Var, Integer num) {
        vp0Var.setNewColor(num.intValue());
        vp0Var.w0(false);
    }

    public static void Y(tg.h0 r13) {
        throw new UnsupportedOperationException("Method not decompiled: tg.h0.Y(tg.h0):void");
    }

    public static void Z(h0 h0Var) {
        g2 g2Var;
        d0 d0Var = h0Var.J0;
        j jVar = h0Var.C0;
        if (jVar != null) {
            PointF A0 = h0Var.A0(jVar);
            j jVar2 = h0Var.C0;
            if (jVar2 instanceof g2) {
                g2 g2Var2 = new g2(h0Var.getContext(), (g2) h0Var.C0, A0);
                g2Var2.setDelegate(h0Var);
                d0Var.addView(g2Var2);
                g2Var = g2Var2;
            } else if (jVar2 instanceof n2) {
                n2 n2Var = new n2(h0Var.getContext(), (n2) h0Var.C0, A0);
                n2Var.setDelegate(h0Var);
                n2Var.setMaxWidth((int) (h0Var.getPaintingSize().f42546a - 20.0f));
                d0Var.addView(n2Var, ma.c(-2.0f, -2));
                g2Var = n2Var;
            } else {
                g2Var = null;
            }
            h0Var.p0(g2Var);
            h0Var.r0(g2Var, true);
        }
        org.telegram.ui.ActionBar.g1 g1Var = h0Var.B1;
        if (g1Var != null && g1Var.isShowing()) {
            h0Var.B1.d(true);
        }
    }

    public static void a0(vp0 vp0Var, Integer num) {
        sg.k0 k0Var = vp0Var.F1;
        k0Var.h(num.intValue(), true);
        k0Var.g();
        vp0Var.setNewColor(num.intValue());
        e0 e0Var = vp0Var.f57928q1;
        e0Var.setSelectedColorIndex(k0Var.d());
        e0Var.getAdapter().f();
    }

    public ViewGroup getBarView() {
        if (this.Q0 == 2) {
            return this.f57912e1;
        }
        return this.f57911d1;
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

    private yt0 getPaintingSize() {
        int i7;
        yt0 yt0Var = this.B0;
        if (yt0Var != null) {
            return yt0Var;
        }
        Bitmap bitmap = this.f57922n0;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        int o4 = cz.o();
        if (o4 != 0) {
            if (o4 != 2) {
                i7 = 2560;
            } else {
                i7 = 3840;
            }
        } else {
            i7 = 1280;
        }
        yt0 yt0Var2 = new yt0(width, height);
        float f10 = i7;
        yt0Var2.f42546a = f10;
        float floor = (float) Math.floor((f10 * height) / width);
        yt0Var2.f42547b = floor;
        if (floor > f10) {
            yt0Var2.f42547b = f10;
            yt0Var2.f42546a = (float) Math.floor((f10 * width) / height);
        }
        this.B0 = yt0Var2;
        return yt0Var2;
    }

    public void setNewColor(int i7) {
        sg.h1 h1Var = this.f57936u1;
        int i10 = h1Var.f57263a;
        h1Var.f57263a = i7;
        s0(h1Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new f4(this, i10, i7, 5));
        duration.start();
    }

    private void setTextType(int i7) {
        this.E0 = i7;
        j jVar = this.C0;
        if (jVar instanceof n2) {
            ((n2) jVar).setType(i7);
        }
        sg.k0 e10 = sg.k0.e(this.f57946z1);
        e10.h = i7;
        e10.f57306a.edit().putInt("text_type", i7).apply();
        this.f57912e1.setOutlineType(i7);
    }

    private void setupTabsLayout(Context context) {
        x4 x4Var = new x4(this, context);
        this.P0 = x4Var;
        x4Var.setClipToPadding(false);
        this.P0.setOrientation(0);
        this.M0.addView(this.P0, ma.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f57908a1 = textView;
        textView.setText(hd.N0(2131747083, null).toUpperCase());
        TextView textView2 = this.f57908a1;
        int i7 = m6.f29473i6;
        v vVar = this.A1;
        t6.Q(textView2, m6.h0(m6.w0(i7, vVar), 7, -1), null, t6.M(i7), vVar);
        this.f57908a1.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.f57908a1.setTextColor(-1);
        this.f57908a1.setTextSize(1, 14.0f);
        this.f57908a1.setGravity(1);
        this.f57908a1.setTypeface(org.telegram.messenger.g0.o());
        this.f57908a1.setSingleLine();
        this.f57908a1.setOnClickListener(new k(this, 0));
        this.P0.addView(this.f57908a1, ma.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.f57909b1 = textView3;
        textView3.setText(hd.N0(2131747082, null).toUpperCase());
        t6.Q(this.f57909b1, m6.h0(m6.w0(i7, vVar), 7, -1), null, t6.M(i7), vVar);
        this.f57909b1.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.f57909b1.setOnClickListener(new k(this, 1));
        this.f57909b1.setTextColor(-1);
        this.f57909b1.setTextSize(1, 14.0f);
        this.f57909b1.setGravity(1);
        this.f57909b1.setTypeface(org.telegram.messenger.g0.o());
        this.f57909b1.setAlpha(0.6f);
        this.f57909b1.setSingleLine();
        this.P0.addView(this.f57909b1, ma.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.f57910c1 = textView4;
        textView4.setText(hd.N0(2131747081, null).toUpperCase());
        t6.Q(this.f57910c1, m6.h0(m6.w0(i7, vVar), 7, -1), null, t6.M(i7), vVar);
        this.f57910c1.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.f57910c1.setTextColor(-1);
        this.f57910c1.setTextSize(1, 14.0f);
        this.f57910c1.setGravity(1);
        this.f57910c1.setTypeface(org.telegram.messenger.g0.o());
        this.f57910c1.setAlpha(0.6f);
        this.f57910c1.setSingleLine();
        this.f57910c1.setOnClickListener(new k(this, 4));
        this.P0.addView(this.f57910c1, ma.l(1.0f, 0, -2));
    }

    public static void u0(n2 n2Var, int i7) {
        int i10;
        n2Var.setAlign(i7);
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
        n2Var.getEditText().setGravity(i10);
        if (i7 != 1) {
            if (i7 == 2 ? !hd.f24444a0 : hd.f24444a0) {
                i11 = 3;
            }
        } else {
            i11 = 4;
        }
        n2Var.getEditText().setTextAlignment(i11);
    }

    @Override
    public final void A() {
        y0(new n(this, 4), this, 53, 0, getHeight());
    }

    public final PointF A0(j jVar) {
        float f10 = 200.0f;
        xe xeVar = this.f57929r0;
        if (xeVar != null) {
            f10 = 200.0f / xeVar.f27876c;
        }
        if (jVar != null) {
            PointF position = jVar.getPosition();
            return new PointF(position.x + f10, position.y + f10);
        }
        float f11 = 100.0f;
        if (xeVar != null) {
            f11 = 100.0f / xeVar.f27876c;
        }
        PointF e02 = e0();
        while (true) {
            int i7 = 0;
            boolean z10 = false;
            while (true) {
                d0 d0Var = this.J0;
                if (i7 >= d0Var.getChildCount()) {
                    break;
                }
                View childAt = d0Var.getChildAt(i7);
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
            ViewGroup viewGroup3 = this.f57912e1;
            ViewGroup viewGroup4 = this.f57911d1;
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
            int i11 = this.f57946z1;
            sg.k0 e10 = sg.k0.e(i11);
            if (i7 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (e10.f57315l != z10) {
                e10.f57315l = z10;
                if (z10) {
                    e10.i(-1, false);
                } else {
                    e10.i(e10.f57306a.getInt("brush", 0), false);
                }
            }
            int c10 = sg.k0.e(i11).c();
            sg.h1 h1Var = this.f57936u1;
            h1Var.f57263a = c10;
            s0(h1Var, null);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.T0 = duration;
            duration.setInterpolator(nr.f37961f);
            this.T0.addUpdateListener(new z2(this, viewGroup, viewGroup2, 4));
            this.T0.addListener(new bi.z0(this, viewGroup, viewGroup2, i7, 4));
            this.T0.start();
        }
    }

    public final void C0() {
        int i7 = 0;
        while (true) {
            d0 d0Var = this.J0;
            if (i7 < d0Var.getChildCount()) {
                View childAt = d0Var.getChildAt(i7);
                if (childAt != this.C0) {
                    if (childAt instanceof j) {
                        j jVar = (j) childAt;
                        if (!jVar.m0 && jVar.f57987k0 <= 0.0f) {
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
                np.f1().edit().putInt("kbd_height_land3", this.V1).commit();
            } else {
                this.U1 = i7;
                np.f1().edit().putInt("kbd_height", this.U1).commit();
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
            int i12 = org.telegram.messenger.g0.f24046q.x;
            if (i11 != i12 || layoutParams.height != i10) {
                layoutParams.width = i12;
                layoutParams.height = i10;
                this.P1.setLayoutParams(layoutParams);
                this.T1 = layoutParams.height;
                requestLayout();
                o3 o3Var = ((vp0) this).Y1.L1;
                if (o3Var != null) {
                    o3Var.a();
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
        if (jVar instanceof n2) {
            if (((n2) jVar).getEditText().isFocused() && i7 > 0) {
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
            o3 o3Var2 = ((vp0) this).Y1.L1;
            if (o3Var2 != null) {
                o3Var2.a();
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
        hashSet.add(Integer.valueOf(m6.G8));
        hashSet.add(Integer.valueOf(m6.f29454h5));
        hashSet.add(Integer.valueOf(m6.f29489j5));
        hashSet.add(Integer.valueOf(m6.f29639r5));
        hashSet.add(Integer.valueOf(m6.f29801zf));
        hashSet.add(Integer.valueOf(m6.Cf));
        hashSet.add(Integer.valueOf(m6.Ff));
        hashSet.add(Integer.valueOf(m6.Jf));
        hashSet.add(Integer.valueOf(m6.Ef));
        hashSet.add(Integer.valueOf(m6.G6));
        hashSet.add(Integer.valueOf(m6.Di));
        hashSet.add(Integer.valueOf(m6.f29746wi));
        hashSet.add(Integer.valueOf(m6.f29727vi));
        hashSet.add(Integer.valueOf(m6.f29765xi));
        hashSet.add(Integer.valueOf(m6.f29784yi));
        hashSet.add(Integer.valueOf(m6.Bf));
        hashSet.add(Integer.valueOf(m6.Af));
        hashSet.add(Integer.valueOf(m6.f29324a7));
        hashSet.add(Integer.valueOf(m6.f29547m7));
        hashSet.add(Integer.valueOf(m6.f29529l7));
        hashSet.add(Integer.valueOf(m6.f29564n7));
        hashSet.add(Integer.valueOf(m6.f29381d6));
        hashSet.add(Integer.valueOf(m6.f29382d7));
    }

    @Override
    public final void b() {
        setTextType((this.E0 + 1) % 4);
    }

    @Override
    public final void c(int i7) {
        j jVar = this.C0;
        if (jVar instanceof n2) {
            u0((n2) jVar, i7);
            sg.k0 e10 = sg.k0.e(this.f57946z1);
            e10.f57311g = i7;
            e10.f57306a.edit().putInt("text_alignment", i7).apply();
        }
    }

    public final void d0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new p4.z(12, this, view)).start();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        d0 d0Var;
        n2 n2Var;
        String str;
        if (i7 == ls.F5 && (d0Var = this.J0) != null) {
            for (int i11 = 0; i11 < d0Var.getChildCount(); i11++) {
                View childAt = d0Var.getChildAt(i11);
                if ((childAt instanceof n2) && (str = (n2Var = (n2) childAt).B0) != null) {
                    n2Var.setTypeface(str);
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
        throw new UnsupportedOperationException("Method not decompiled: tg.h0.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final PointF e0() {
        xe xeVar;
        yt0 paintingSize = getPaintingSize();
        float f10 = paintingSize.f42546a / 2.0f;
        float f11 = paintingSize.f42547b / 2.0f;
        if (this.f57929r0 != null) {
            double radians = (float) Math.toRadians(-(xeVar.f27881k + xeVar.d));
            float cos = (float) ((Math.cos(radians) * xeVar.f27874a) - (Math.sin(radians) * xeVar.f27875b));
            float c10 = (float) i5.c.c(radians, xeVar.f27875b, Math.sin(radians) * xeVar.f27874a);
            f10 -= cos * paintingSize.f42546a;
            f11 -= c10 * paintingSize.f42547b;
        }
        return new PointF(f10, f11);
    }

    @Override
    public final void f(j jVar) {
        int[] i02 = i0(jVar);
        y0(new s(this, jVar, 1), this, 51, i02[0], i02[1] - org.telegram.messenger.g0.L(32.0f));
    }

    public final p1 f0(String str, boolean z10) {
        float f10;
        yt0 yt0Var;
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
        d0 d0Var = this.J0;
        if (i7 > 0) {
            float floor = (float) Math.floor(d0Var.getMeasuredWidth() * 0.5d);
            yt0Var = new yt0(floor, floor / f10);
        } else {
            float floor2 = (float) Math.floor(d0Var.getMeasuredHeight() * 0.5d);
            yt0Var = new yt0(f10 * floor2, floor2);
        }
        yt0 yt0Var2 = yt0Var;
        Pair N0 = org.telegram.messenger.g0.N0(str);
        if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
            float f11 = yt0Var2.f42546a;
            yt0Var2.f42546a = yt0Var2.f42547b;
            yt0Var2.f42547b = f11;
        }
        Context context = getContext();
        PointF e02 = e0();
        int intValue = ((Integer) N0.first).intValue();
        ((Integer) N0.second).getClass();
        p1 p1Var = new p1(context, e02, yt0Var2, str, intValue);
        p1Var.setDelegate(this);
        d0Var.addView(p1Var);
        if (z10) {
            p0(p1Var);
            r0(p1Var, true);
        }
        return p1Var;
    }

    public final tg.z g0(java.lang.Object r24, org.telegram.tgnet.TLRPC.Document r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: tg.h0.g0(java.lang.Object, org.telegram.tgnet.TLRPC$Document, boolean):tg.z");
    }

    public int getAdditionalBottom() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    public int getAdditionalTop() {
        return org.telegram.messenger.g0.L(48.0f);
    }

    public View getCancelView() {
        return this.f57918k0;
    }

    public float getCropRotation() {
        xe xeVar = this.f57929r0;
        if (xeVar != null) {
            return xeVar.d + xeVar.f27881k;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.f57920l0;
    }

    public long getLcm() {
        return this.Z0.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        y5[] y5VarArr;
        d0 d0Var = this.J0;
        int childCount = d0Var.getChildCount();
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = d0Var.getChildAt(i7);
            if (childAt instanceof g2) {
                TLRPC.Document sticker = ((g2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f28446id = sticker.f28440id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof n2) {
                CharSequence text = ((n2) childAt).getText();
                if ((text instanceof Spanned) && (y5VarArr = (y5[]) ((Spanned) text).getSpans(0, text.length(), y5.class)) != null) {
                    for (y5 y5Var : y5VarArr) {
                        if (y5Var != null) {
                            TLRPC.Document document = y5Var.document;
                            if (document == null) {
                                document = p5.e(this.f57946z1, y5Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.f28446id = document.f28440id;
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
        d0 d0Var = this.J0;
        if (jVar == null) {
            return getY() + d0Var.getMeasuredHeight();
        }
        int[] iArr = new int[2];
        jVar.getLocationInWindow(iArr);
        return (d0Var.getScaleY() * this.C0.getHeight()) + iArr[1];
    }

    public oz0 getThanosEffect() {
        if (!oz0.c()) {
            return null;
        }
        if (this.K0 == null) {
            oz0 oz0Var = new oz0(getContext(), new n(this, 0));
            this.K0 = oz0Var;
            addView(oz0Var);
        }
        return this.K0;
    }

    public final n2 h0(boolean z10) {
        ((vp0) this).Y1.f43271h0.isFocusable();
        yt0 paintingSize = getPaintingSize();
        PointF A0 = A0(null);
        n2 n2Var = new n2(getContext(), A0, (int) (paintingSize.f42546a / 9.0f), "", this.f57936u1, this.E0);
        float f10 = paintingSize.f42546a / 9.0f;
        n nVar = new n(this, 2);
        n2Var.f58093x0 = (int) (0.5f * f10);
        n2Var.f58094y0 = (int) (f10 * 2.0f);
        n2Var.f58095z0 = nVar;
        float f11 = A0.x;
        d0 d0Var = this.J0;
        if (f11 == d0Var.getMeasuredWidth() / 2.0f) {
            n2Var.setStickyX(2);
        }
        if (A0.y == d0Var.getMeasuredHeight() / 2.0f) {
            n2Var.setStickyY(2);
        }
        n2Var.setDelegate(this);
        n2Var.setMaxWidth((int) (paintingSize.f42546a - 20.0f));
        int i7 = this.f57946z1;
        n2Var.setTypeface(sg.k0.e(i7).f57313j);
        n2Var.setType(sg.k0.e(i7).h);
        d0Var.addView(n2Var, ma.c(-2.0f, -2));
        xe xeVar = this.f57929r0;
        if (xeVar != null) {
            n2Var.j(1.0f / xeVar.f27876c);
            n2Var.f(-(xeVar.f27881k + xeVar.d));
        }
        if (z10) {
            p0(n2Var);
            n2Var.q();
            r0(n2Var, false);
            n2Var.getFocusedView().requestFocus();
            org.telegram.messenger.g0.I3(n2Var.getFocusedView());
            this.D0 = true;
            int i10 = sg.k0.e(i7).f57311g;
            f1 f1Var = this.f57912e1;
            f1Var.d(i10, true);
            f1Var.setOutlineType(sg.k0.e(i7).h);
        }
        return n2Var;
    }

    public final boolean i(MotionEvent motionEvent) {
        if (this.C0 != null) {
            r0(null, true);
        }
        float x10 = motionEvent.getX();
        c0 c0Var = this.G0;
        float translationX = ((x10 - c0Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / c0Var.getScaleX();
        float y10 = ((((motionEvent.getY() - c0Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) + org.telegram.messenger.g0.L(32.0f)) - ((getAdditionalTop() - getAdditionalBottom()) / 2.0f)) / c0Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-c0Var.getRotation());
        double d2 = y10;
        float measuredWidth = (c0Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        float measuredHeight = (c0Var.getMeasuredHeight() / 2.0f) + ((float) i5.c.c(radians, d2, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        c0Var.e(obtain);
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
        Point point = org.telegram.messenger.g0.f24046q;
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
            ty tyVar = this.P1;
            if (tyVar != null && tyVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.P1.getMeasuredHeight());
                ofFloat.addUpdateListener(new o(this, 0));
                this.S1 = true;
                ofFloat.addListener(new a0(this, 1));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f29005w);
                ofFloat.start();
                return;
            }
            l0();
        }
    }

    public final void l0() {
        ty tyVar;
        o3 o3Var;
        if (this.T1 > 0 && (o3Var = ((vp0) this).Y1.L1) != null) {
            o3Var.a();
        }
        if (!this.Q1 && (tyVar = this.P1) != null && tyVar.getVisibility() != 8) {
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
        if (this.f57938v1) {
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
        ls.e().c(this, ls.F5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ls.e().n(this, ls.F5);
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
            ty tyVar = this.P1;
            tyVar.layout(0, Q, tyVar.getMeasuredWidth(), this.P1.getMeasuredHeight() + Q);
        }
        if (!this.F0) {
            i15 = org.telegram.messenger.g0.f24040m;
        }
        c0 c0Var = this.G0;
        int ceil = (int) Math.ceil((i13 - c0Var.getMeasuredWidth()) / 2.0f);
        int additionalTop = ((getAdditionalTop() - getAdditionalBottom()) / 2) + f3.C(8.0f, (((i14 - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i15)) - org.telegram.messenger.g0.L(48.0f)) - c0Var.getMeasuredHeight()) / 2, i15);
        c0Var.layout(ceil, additionalTop, c0Var.getMeasuredWidth() + ceil, c0Var.getMeasuredHeight() + additionalTop);
        uv uvVar = this.H0;
        uvVar.layout(ceil, additionalTop, uvVar.getMeasuredWidth() + ceil, uvVar.getMeasuredHeight() + additionalTop);
        int measuredWidth = c0Var.getMeasuredWidth();
        d0 d0Var = this.J0;
        int measuredWidth2 = ((measuredWidth - d0Var.getMeasuredWidth()) / 2) + ceil;
        int measuredHeight = ((c0Var.getMeasuredHeight() - d0Var.getMeasuredHeight()) / 2) + additionalTop;
        d0Var.layout(measuredWidth2, measuredHeight, d0Var.getMeasuredWidth() + measuredWidth2, d0Var.getMeasuredHeight() + measuredHeight);
        oz0 oz0Var = this.K0;
        if (oz0Var != null) {
            oz0Var.layout(measuredWidth2, measuredHeight, d0Var.getMeasuredWidth() + measuredWidth2, d0Var.getMeasuredHeight() + measuredHeight);
        }
        ih0 ih0Var = this.I0;
        ih0Var.layout(ceil, additionalTop, ih0Var.getMeasuredWidth() + ceil, ih0Var.getMeasuredHeight() + additionalTop);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float currentActionBarHeight;
        float f10;
        this.f57945z0 = true;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((org.telegram.messenger.g0.f24046q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - org.telegram.messenger.g0.L(48.0f);
        Bitmap bitmap = this.f57922n0;
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
        float f13 = f11 / this.B0.f42546a;
        this.A0 = f13;
        d0 d0Var = this.J0;
        d0Var.setScaleX(f13);
        d0Var.setScaleY(this.A0);
        d0Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.B0.f42546a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.B0.f42547b, 1073741824));
        oz0 oz0Var = this.K0;
        if (oz0Var != null) {
            oz0Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.B0.f42546a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.B0.f42547b, 1073741824));
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
        frameLayout.setPadding(frameLayout.getPaddingLeft(), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.f24040m, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i7, i10);
        this.f57945z0 = false;
        if (org.telegram.messenger.g0.L(20.0f) >= 0 && !this.Q1 && !this.S1) {
            this.f57945z0 = true;
            l0();
            this.f57945z0 = false;
        }
        if (org.telegram.messenger.g0.L(20.0f) < 0) {
            l0();
        }
        ty tyVar = this.P1;
        if (tyVar != null) {
            measureChild(tyVar, i7, i10);
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
        this.f57925p0.b(jVar.getUUID(), new s(this, jVar, 0));
    }

    @Override
    public final boolean q() {
        return !this.D0;
    }

    public final void q0(j jVar) {
        j jVar2 = this.C0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.f57990n0, false);
            this.C0 = null;
            if (jVar instanceof n2) {
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
            sg.k1 k1Var = this.f57925p0;
            k1Var.f57317b.remove(uuid);
            k1Var.f57318c.remove(uuid);
            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(k1Var, 14));
        }
        n1 n1Var = this.V0;
        qf qfVar = this.W0;
        n1Var.setValueOverride(qfVar);
        n1Var.setShowPreview(true);
        float f10 = qfVar.get();
        sg.h1 h1Var = this.f57936u1;
        h1Var.f57265c = f10;
        s0(h1Var, null);
    }

    public final boolean r0(j jVar, boolean z10) {
        h0 h0Var;
        boolean z11;
        int i7;
        boolean z12 = jVar instanceof n2;
        int i10 = 2;
        if (z12 && (((i7 = this.R0) == -1 && this.Q0 != 2) || (i7 != -1 && i7 != 2))) {
            ValueAnimator valueAnimator = this.T0;
            if (valueAnimator != null && i7 != 2) {
                valueAnimator.cancel();
            }
            if (this.f57938v1) {
                w0(false);
            }
            B0(2);
        }
        if (z12 && z10) {
            n2 n2Var = (n2) jVar;
            int gravity = n2Var.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i10 = 0;
                }
            } else {
                i10 = 1;
            }
            f1 f1Var = this.f57912e1;
            f1Var.setAlignment(i10);
            f1Var.setTypeface(n2Var.getTypeface().f57199a);
            f1Var.e(n2Var.getType(), true);
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
                if (jVar2 instanceof n2) {
                    org.telegram.messenger.g0.I3(((n2) jVar2).getFocusedView());
                    k0(false);
                }
                return true;
            }
            h0Var = this;
            jVar2.l(jVar2.f57990n0, false);
            j jVar3 = h0Var.C0;
            if (jVar3 instanceof n2) {
                n2 n2Var2 = (n2) jVar3;
                m2 m2Var = n2Var2.f58087r0;
                m2Var.clearFocus();
                m2Var.setEnabled(false);
                m2Var.setClickable(false);
                n2Var2.m();
                if (!z12) {
                    h0Var.D0 = false;
                    org.telegram.messenger.g0.v1(((n2) h0Var.C0).getFocusedView());
                    k0(false);
                }
            }
            z11 = true;
        } else {
            h0Var = this;
            z11 = false;
        }
        j jVar4 = h0Var.C0;
        h0Var.C0 = jVar;
        if ((jVar4 instanceof n2) && TextUtils.isEmpty(((n2) jVar4).getText())) {
            q0(jVar4);
        }
        j jVar5 = h0Var.C0;
        qf qfVar = h0Var.W0;
        sg.h1 h1Var = h0Var.f57936u1;
        n1 n1Var = h0Var.V0;
        if (jVar5 != null) {
            ih0 ih0Var = h0Var.I0;
            jVar5.f57990n0 = ih0Var;
            jVar5.l(ih0Var, true);
            h0Var.J0.bringChildToFront(h0Var.C0);
            j jVar6 = h0Var.C0;
            if (jVar6 instanceof n2) {
                n2 n2Var3 = (n2) jVar6;
                n2Var3.A0 = false;
                n2Var3.getSwatch().f57265c = h1Var.f57265c;
                s0(n2Var3.getSwatch(), null);
                n1Var.setValueOverride(new u4(n2Var3, (int) (h0Var.B0.f42546a / 9.0f), 1));
                n1Var.setShowPreview(false);
                return true;
            }
            n1Var.setValueOverride(qfVar);
            n1Var.setShowPreview(true);
            h1Var.f57265c = qfVar.get();
            s0(h1Var, null);
            return true;
        }
        ValueAnimator valueAnimator2 = h0Var.T0;
        if (valueAnimator2 != null && h0Var.R0 != 0) {
            valueAnimator2.cancel();
        }
        if (h0Var.f57938v1) {
            w0(false);
        }
        B0(0);
        n1Var.setValueOverride(qfVar);
        n1Var.setShowPreview(true);
        h1Var.f57265c = qfVar.get();
        s0(h1Var, null);
        return z11;
    }

    @Override
    public final void requestLayout() {
        if (this.f57945z0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(sg.h1 h1Var, Integer num) {
        sg.h1 h1Var2 = this.f57936u1;
        if (h1Var2 != h1Var) {
            h1Var2.f57263a = h1Var.f57263a;
            h1Var2.f57264b = h1Var.f57264b;
            h1Var2.f57265c = h1Var.f57265c;
            int i7 = this.f57946z1;
            sg.k0.e(i7).h(h1Var.f57263a, true);
            sg.k0.e(i7).j(h1Var.f57265c);
        }
        int i10 = h1Var.f57263a;
        c0 c0Var = this.G0;
        c0Var.setColor(i10);
        c0Var.setBrushSize(h1Var.f57265c);
        int i11 = h1Var2.f57263a;
        if (num != null && num.intValue() != i11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new z3(this, num, i11, 3));
            duration.start();
        } else {
            f0 f0Var = this.M0;
            if (f0Var != null) {
                f0Var.invalidate();
            }
        }
        j jVar = this.C0;
        if (jVar instanceof n2) {
            ((n2) jVar).setSwatch(new sg.h1(h1Var.f57264b, h1Var.f57265c, h1Var.f57263a));
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
        o3 o3Var;
        if (!this.R1 && !this.Q1) {
            h0(true);
            return;
        }
        boolean z10 = this.Q1;
        if (z10 && (o3Var = ((vp0) this).Y1.L1) != null) {
            o3Var.f15204e = true;
        }
        x0(!z10 ? 1 : 0);
        if (z10) {
            j jVar = this.C0;
            if (jVar instanceof n2) {
                org.telegram.messenger.g0.I3(((n2) jVar).getEditText());
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
        this.f57944y1.setColor(-15132391);
    }

    @Override
    public final void v(float f10, float f11, float[] fArr) {
        Point point = org.telegram.messenger.g0.f24046q;
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
        this.f57931s0 = f10;
        this.f57941x0 = f13;
        this.f57943y0 = f14;
        this.f57933t0 = f11;
        this.f57935u0 = f12;
        this.f57937v0 = f11;
        float f22 = f12 + 0.0f;
        this.f57939w0 = f22;
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
            xe xeVar = this.f57929r0;
            if (xeVar != null) {
                float f23 = xeVar.f27876c * 1.0f;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                if (measuredWidth != 0 && measuredHeight != 0) {
                    int i10 = xeVar.f27881k;
                    if (i10 == 90 || i10 == 270) {
                        measuredHeight = measuredWidth;
                        measuredWidth = measuredHeight;
                    }
                    float max = Math.max(f13 / ((int) (xeVar.f27877e * f20)), f14 / ((int) (xeVar.f27878f * f21)));
                    f16 = f23 * max;
                    float D = com.google.android.gms.internal.vision.e2.D(xeVar.f27874a, measuredWidth, f10, max);
                    float f24 = xeVar.f27876c;
                    f17 = (D * f24) + f11;
                    f15 = 1.0f;
                    f18 = (xeVar.f27875b * measuredHeight * f10 * max * f24) + f22;
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
        n1 n1Var = this.V0;
        if (!z10 && !(hVar instanceof sg.d)) {
            n1Var.b(0.05f, 1.0f);
        } else {
            n1Var.b(0.4f, 1.75f);
        }
        n1Var.setDrawCenter(!(hVar instanceof sg.g));
        c0 c0Var = this.G0;
        if (c0Var.getCurrentBrush() instanceof sg.g) {
            this.U0 = true;
        }
        c0Var.setBrush(hVar);
        sg.h1 h1Var = this.f57936u1;
        int i7 = h1Var.f57263a;
        h1Var.f57263a = sg.k0.e(this.f57946z1).c();
        h1Var.f57265c = this.W0.get();
        s0(h1Var, Integer.valueOf(i7));
        this.H0.invalidate();
    }

    public final void w0(final boolean z10) {
        float f10;
        boolean z11;
        if (this.f57938v1 != z10) {
            this.f57938v1 = z10;
            r1.g gVar = this.f57940w1;
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
            this.f57940w1 = gVar2;
            r1.h hVar = new r1.h();
            if (!z10) {
                f11 = 0.0f;
            }
            hVar.f56376i = f11;
            hVar.b(1250.0f);
            hVar.a(1.0f);
            gVar2.f56368m = hVar;
            if (!this.R1 && !this.Q1) {
                z11 = false;
            } else {
                z11 = true;
            }
            final boolean[] zArr = {z11};
            final float translationY = this.M0.getTranslationY();
            final ViewGroup barView = getBarView();
            this.f57940w1.b(new r1.d() {
                @Override
                public final void a(r1.g gVar3, float f12, float f13) {
                    int i7;
                    h0 h0Var = h0.this;
                    f0 f0Var = h0Var.M0;
                    float f14 = f12 / 1000.0f;
                    h0Var.f57942x1 = f14;
                    float f15 = ((1.0f - f14) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f15);
                    view.setScaleY(f15);
                    view.setTranslationY((Math.min(h0Var.f57942x1, 0.25f) * org.telegram.messenger.g0.L(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(h0Var.f57942x1, 0.25f) / 0.25f));
                    e0 e0Var = h0Var.f57928q1;
                    float f16 = h0Var.f57942x1;
                    boolean z12 = z10;
                    e0Var.B1(z12, f16);
                    h0Var.f57920l0.setProgress(h0Var.f57942x1);
                    h0Var.f57918k0.setProgress(h0Var.f57942x1);
                    h0Var.P0.setTranslationY(org.telegram.messenger.g0.L(32.0f) * h0Var.f57942x1);
                    if (zArr[0]) {
                        float f17 = h0Var.f57942x1;
                        if (!z12) {
                            f17 = 1.0f - f17;
                        }
                        float L = org.telegram.messenger.g0.L(40.0f) * f17;
                        if (z12) {
                            i7 = 1;
                        } else {
                            i7 = -1;
                        }
                        f0Var.setTranslationY(translationY - (L * i7));
                    }
                    f0Var.invalidate();
                    if (view == h0Var.f57912e1) {
                        h0Var.N0.invalidate();
                    }
                }
            });
            this.f57940w1.a(new r(this, z10, 1));
            this.f57940w1.h();
            if (z10) {
                e0 e0Var = this.f57928q1;
                e0Var.setVisibility(0);
                e0Var.setSelectedColorIndex(sg.k0.e(this.f57946z1).d());
            }
        }
    }

    @Override
    public final sg.k0 x() {
        return sg.k0.e(this.f57946z1);
    }

    public final void x0(int i7) {
        boolean z10;
        int i10;
        f1 f1Var = this.f57912e1;
        if (i7 == 1) {
            ty tyVar = this.P1;
            if (tyVar != null && tyVar.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ty tyVar2 = this.P1;
            if (tyVar2 != null && tyVar2.f40092d1 != k10.f24968t0) {
                removeView(tyVar2);
                this.P1 = null;
            }
            if (this.P1 == null) {
                ty tyVar3 = new ty(null, true, false, false, getContext(), false, null, null, true, this.A1, false, false);
                this.P1 = tyVar3;
                tyVar3.V0 = true;
                tyVar3.setVisibility(8);
                if (org.telegram.messenger.g0.Q1()) {
                    this.P1.setForseMultiwindowLayout(true);
                }
                this.P1.setDelegate(new b0(this));
                addView(this.P1);
            }
            this.P1.setVisibility(0);
            this.Q1 = true;
            ty tyVar4 = this.P1;
            if (this.U1 <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.U1 = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.U1 = np.f1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                }
            }
            if (this.V1 <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.V1 = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.V1 = np.f1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                }
            }
            Point point = org.telegram.messenger.g0.f24046q;
            if (point.x > point.y) {
                i10 = this.V1;
            } else {
                i10 = this.U1;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tyVar4.getLayoutParams();
            layoutParams.height = i10;
            tyVar4.setLayoutParams(layoutParams);
            if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                j jVar = this.C0;
                if (jVar instanceof n2) {
                    org.telegram.messenger.g0.v1(((n2) jVar).getEditText());
                }
            }
            this.T1 = i10;
            requestLayout();
            o3 o3Var = ((vp0) this).Y1.L1;
            if (o3Var != null) {
                o3Var.a();
            }
            ah emojiButton = f1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(yg.d, true);
            }
            getHeight();
            if (!z10 && !this.R1) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.T1, 0.0f);
                ofFloat.addUpdateListener(new o(this, 1));
                ofFloat.addListener(new a0(this, 0));
                ofFloat.start();
                return;
            }
            return;
        }
        ah emojiButton2 = f1Var.getEmojiButton();
        if (emojiButton2 != null) {
            emojiButton2.j(yg.f42430e, true);
        }
        ty tyVar5 = this.P1;
        if (tyVar5 != null) {
            this.Q1 = false;
            if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                tyVar5.setVisibility(8);
            }
        }
        if (i7 == 0) {
            this.T1 = 0;
        }
        o3 o3Var2 = ((vp0) this).Y1.L1;
        if (o3Var2 != null) {
            o3Var2.a();
        }
        requestLayout();
        getHeight();
    }

    public final void y0(Runnable runnable, h0 h0Var, int i7, int i10, int i11) {
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
            this.C1.setOnTouchListener(new i4(2, this));
            this.C1.setDispatchKeyEventListener(new q(this));
            this.C1.setShownFromBottom(true);
        }
        this.C1.d();
        runnable.run();
        if (this.B1 == null) {
            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(this.C1, -2, -2);
            this.B1 = g1Var2;
            g1Var2.f28975b = true;
            g1Var2.setAnimationStyle(2131755191);
            this.B1.setOutsideTouchable(true);
            this.B1.setClippingEnabled(true);
            this.B1.setInputMethodMode(2);
            this.B1.setSoftInputMode(0);
            this.B1.getContentView().setFocusableInTouchMode(true);
            this.B1.setOnDismissListener(new k4(2, this));
        }
        this.C1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
        this.B1.setFocusable(true);
        this.B1.showAtLocation(h0Var, i7, i10 - (this.C1.getMeasuredWidth() / 2), i11 - this.C1.getMeasuredHeight());
        org.telegram.ui.ActionBar.g1.i(this.C1);
    }

    public final void z0(boolean z10) {
        float f10;
        if (this.f57924o1 != z10) {
            this.f57924o1 = z10;
            r1.g gVar = this.f57926p1;
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
            this.f57926p1 = gVar2;
            r1.h hVar = new r1.h();
            if (!z10) {
                f11 = 0.0f;
            }
            hVar.f56376i = f11;
            hVar.b(1250.0f);
            hVar.a(1.0f);
            gVar2.f56368m = hVar;
            if (z10) {
                k1 k1Var = this.f57913f1;
                k1Var.setAlpha(0.0f);
                k1Var.setVisibility(0);
            }
            this.f57926p1.b(new q7(3, this));
            this.f57926p1.a(new r(this, z10, 0));
            this.f57926p1.h();
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
