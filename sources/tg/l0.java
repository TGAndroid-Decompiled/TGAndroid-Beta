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
import bi.n8;
import c8.na;
import fi.q7;
import fi.z2;
import hi.g5;
import hi.i5;
import hi.j4;
import hi.q4;
import hi.t4;
import hi.v4;
import hi.x3;
import j$.util.Objects;
import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import m.o3;
import org.telegram.messenger.a20;
import org.telegram.messenger.a8;
import org.telegram.messenger.b20;
import org.telegram.messenger.bz;
import org.telegram.messenger.f3;
import org.telegram.messenger.fs;
import org.telegram.messenger.g6;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.j6;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.r5;
import org.telegram.messenger.we;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.x5;
import org.telegram.ui.Components.xg;
import org.telegram.ui.Components.xt0;
import org.telegram.ui.Components.zg;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Wallet.o5;
import org.telegram.ui.ao0;
import org.telegram.ui.cd0;
import org.telegram.ui.gh0;
import org.telegram.ui.kn0;
import org.telegram.ui.tv;
import org.telegram.ui.vp0;
public abstract class l0 extends du0 implements l1, l, h1, bu0, fs {
    public float A0;
    public final p A1;
    public xt0 B0;
    public org.telegram.ui.ActionBar.g1 B1;
    public n C0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout C1;
    public boolean D0;
    public Rect D1;
    public int E0;
    public Runnable E1;
    public final boolean F0;
    public final sg.j0 F1;
    public final g0 G0;
    public boolean G1;
    public final tv H0;
    public float H1;
    public final gh0 I0;
    public boolean I1;
    public final h0 J0;
    public final hi.a0 J1;
    public nz0 K0;
    public b0 K1;
    public final FrameLayout L0;
    public final aa L1;
    public final j0 M0;
    public boolean M1;
    public final w01 N0;
    public final c6 N1;
    public final FrameLayout O0;
    public final Paint O1;
    public i5 P0;
    public final Paint P1;
    public int Q0;
    public fh.g Q1;
    public int R0;
    public final float[] R1;
    public float S0;
    public final int[] S1;
    public ValueAnimator T0;
    public qy T1;
    public boolean U0;
    public boolean U1;
    public final r1 V0;
    public boolean V1;
    public final org.telegram.ui.ActionBar.i5 W0;
    public boolean W1;
    public ArrayList X0;
    public int X1;
    public final int Y0;
    public int Y1;
    public BigInteger Z0;
    public int Z1;
    public TextView f58022a1;
    public int f58023a2;
    public TextView f58024b1;
    public boolean f58025b2;
    public TextView f58026c1;
    public final m1 f58027d1;
    public final j1 f58028e1;
    public final o1 f58029f1;
    public final ImageView f58030g1;
    public final LinearLayout f58031h1;
    public final TextView f58032i1;
    public final TextView f58033j1;
    public final a1 f58034k0;
    public final TextView f58035k1;
    public final e1 f58036l0;
    public final Paint l1;
    public float m0;
    public final Paint f58037m1;
    public final Bitmap f58038n0;
    public float n1;
    public final Bitmap f58039o0;
    public boolean f58040o1;
    public final sg.j1 f58041p0;
    public r1.g f58042p1;
    public final r5 f58043q0;
    public final i0 f58044q1;
    public final we f58045r0;
    public final Paint f58046r1;
    public float f58047s0;
    public final Paint f58048s1;
    public float f58049t0;
    public final Paint f58050t1;
    public float f58051u0;
    public final sg.g1 f58052u1;
    public float f58053v0;
    public boolean f58054v1;
    public float f58055w0;
    public r1.g f58056w1;
    public float f58057x0;
    public float f58058x1;
    public float f58059y0;
    public final Paint f58060y1;
    public boolean f58061z0;
    public final int f58062z1;

    public l0(Context context, Activity activity, int i7, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, we weVar, kn0 kn0Var, final i6 i6Var) {
        super(context, activity);
        hi.a0 a0Var;
        boolean z10;
        d dVar;
        g6[] g6VarArr;
        ArrayList arrayList2 = arrayList;
        boolean z11 = false;
        this.Q0 = 0;
        this.R0 = -1;
        final vp0 vp0Var = (vp0) this;
        this.W0 = new org.telegram.ui.ActionBar.i5(vp0Var);
        byte b10 = 1;
        this.l1 = new Paint(1);
        this.f58037m1 = new Paint(1);
        this.f58046r1 = new Paint(1);
        this.f58048s1 = new Paint(1);
        this.f58050t1 = new Paint(1);
        sg.g1 g1Var = new sg.g1(1.0f, 0.016773745f, -1);
        this.f58052u1 = g1Var;
        this.f58060y1 = new Paint(1);
        aa aaVar = new aa(vp0Var, 20);
        this.L1 = aaVar;
        this.M1 = false;
        this.N1 = new c6((View) this, 350L, kr.h);
        this.O1 = new Paint(1);
        Paint paint = new Paint(1);
        this.P1 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new Matrix();
        this.R1 = new float[2];
        this.S1 = new int[2];
        new o5(vp0Var, 7);
        setDelegate(this);
        this.f58062z1 = i7;
        File captionsVideoFile = getCaptionsVideoFile();
        if (captionsVideoFile != null && captionsVideoFile.exists() && DictationAsr.E(i7)) {
            a0Var = new hi.a0(captionsVideoFile, aaVar);
        } else {
            a0Var = null;
        }
        this.J1 = a0Var;
        if (a0Var != null) {
            a0Var.d = new org.telegram.ui.web.z0(vp0Var, 19);
        }
        this.A1 = new i6() {
            @Override
            public final boolean b() {
                return n6.I.q();
            }

            @Override
            public final void c(float f10, float f11, int i11, int i12) {
                n6.r(f10, f11, i11, i12);
            }

            @Override
            public final ColorFilter d() {
                return n6.f29783v3;
            }

            @Override
            public final Paint e(String str) {
                return n6.V0(str);
            }

            @Override
            public final boolean f() {
                return bz.H0;
            }

            @Override
            public final int g(int i11) {
                return i(i11);
            }

            @Override
            public final Drawable getDrawable(String str) {
                return null;
            }

            @Override
            public final boolean h() {
                return false;
            }

            @Override
            public final int i(int i11) {
                if (i11 == n6.G8) {
                    return -14145495;
                }
                if (i11 != n6.E8) {
                    if (i11 == n6.f29524h5) {
                        return -14737633;
                    }
                    if (i11 == n6.f29559j5) {
                        return -592138;
                    }
                    if (i11 == n6.f29709r5) {
                        return -8553091;
                    }
                    if (i11 != n6.f29871zf) {
                        if (i11 == n6.Cf) {
                            return -1610612736;
                        }
                        if (i11 == n6.Ff || i11 == n6.Jf || i11 == n6.Ef) {
                            return -9539985;
                        }
                        if (i11 != n6.G6) {
                            int i12 = n6.Di;
                            if (i11 == i12) {
                                return -11754001;
                            }
                            if (i11 == n6.f29543i6) {
                                return 536870911;
                            }
                            if (i11 != n6.f29816wi && i11 != n6.f29797vi && i11 != n6.f29835xi) {
                                if (i11 == n6.f29854yi) {
                                    return 352321535;
                                }
                                if (i11 != n6.Bf && i11 != i12) {
                                    if (i11 == n6.Af) {
                                        return 780633991;
                                    }
                                    if (i11 == n6.f29394a7) {
                                        return -15921907;
                                    }
                                    if (i11 == n6.f29617m7) {
                                        return -12500671;
                                    }
                                    if (i11 == n6.f29599l7) {
                                        return -13133079;
                                    }
                                    if (i11 == n6.f29634n7) {
                                        return -1;
                                    }
                                    if (i11 == n6.f29451d6) {
                                        return -15198183;
                                    }
                                    if (i11 == n6.f29452d7) {
                                        return -16777216;
                                    }
                                    i6 i6Var2 = i6.this;
                                    if (i6Var2 != null) {
                                        return i6Var2.i(i11);
                                    }
                                    return n6.v0(i11);
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
            public final int k(int i11) {
                return i(i11);
            }

            @Override
            public final void j(int i11, int i12) {
            }
        };
        this.f58045r0 = weVar;
        this.F0 = context instanceof BubbleActivity;
        sg.j0 e10 = sg.j0.e(i7);
        this.F1 = e10;
        e10.i(0, true);
        g1Var.f57335a = e10.c();
        g1Var.f57337c = e10.f57382i;
        r5 r5Var = new r5("Paint", true);
        this.f58043q0 = r5Var;
        this.f58038n0 = bitmap;
        this.f58039o0 = bitmap2;
        this.Y0 = i10;
        sg.j1 j1Var = new sg.j1();
        this.f58041p0 = j1Var;
        byte b11 = 2;
        j1Var.f57386a = new org.telegram.tgnet.g(vp0Var, 29);
        g0 g0Var = new g0(vp0Var, context, new sg.h0(getPaintingSize(), bitmap2, i10, null), bitmap, bitmap2);
        this.G0 = g0Var;
        g0Var.setDelegate(new s2.e(vp0Var, kn0Var, false, 4));
        g0Var.setUndoStore(j1Var);
        g0Var.setQueue(r5Var);
        g0Var.setVisibility(4);
        addView(g0Var, na.e(-1, -1, 51));
        tv tvVar = new tv(13, context, vp0Var);
        this.H0 = tvVar;
        tvVar.setVisibility(4);
        addView(tvVar, na.e(-1, -1, 51));
        h0 h0Var = new h0(vp0Var, context, new nd0(vp0Var, 17));
        this.J0 = h0Var;
        addView(h0Var);
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i11 = 0;
            d dVar2 = null;
            while (i11 < size) {
                b20 b20Var = (b20) arrayList2.get(i11);
                byte b12 = b20Var.f23124a;
                if (b12 == 0) {
                    ?? i02 = i0(b20Var.C, b20Var.B, z11);
                    if ((b20Var.f23126b & 2) != 0) {
                        i02.r(z11);
                    }
                    ViewGroup.LayoutParams layoutParams = i02.getLayoutParams();
                    layoutParams.width = b20Var.f23139q;
                    layoutParams.height = b20Var.f23140r;
                    dVar = i02;
                } else if (b12 == 11) {
                    if (dVar2 != null) {
                        dVar2.u(b20Var.V, b20Var.W, b20Var.f23132j, b20Var.X);
                        i11++;
                        arrayList2 = arrayList;
                        z11 = false;
                        b10 = 1;
                        b11 = 2;
                    } else {
                        d g02 = g0();
                        g02.setType(b20Var.f23126b);
                        g02.setTypeface(b20Var.f23136n);
                        g02.setBaseFontSize(b20Var.f23135m);
                        x0(g02, b20Var.f23138p);
                        sg.g1 swatch = g02.getSwatch();
                        swatch.f57335a = b20Var.f23134l;
                        g02.setSwatch(swatch);
                        g02.u(b20Var.V, b20Var.W, b20Var.f23132j, b20Var.X);
                        d dVar3 = g02;
                        dVar2 = dVar3;
                        dVar = dVar3;
                    }
                } else if (b12 == b10) {
                    ?? j02 = j0(false);
                    j02.setType(b20Var.f23126b);
                    j02.setTypeface(b20Var.f23136n);
                    j02.setBaseFontSize(b20Var.f23135m);
                    SpannableString spannableString = new SpannableString(b20Var.f23132j);
                    ArrayList arrayList3 = b20Var.f23133k;
                    int size2 = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj = arrayList3.get(i12);
                        i12++;
                        a20 a20Var = (a20) obj;
                        x5 x5Var = new x5(a20Var.document_id, j02.getFontMetricsInt());
                        int i13 = a20Var.offset;
                        spannableString.setSpan(x5Var, i13, a20Var.length + i13, 33);
                        arrayList3 = arrayList3;
                    }
                    CharSequence m10 = j6.m(spannableString, j02.getFontMetricsInt(), false, null, 0);
                    if ((m10 instanceof Spanned) && (g6VarArr = (g6[]) ((Spanned) m10).getSpans(0, m10.length(), g6.class)) != null) {
                        for (g6 g6Var : g6VarArr) {
                            g6Var.f24275b = 0.85f;
                        }
                    }
                    j02.setText(m10);
                    x0(j02, b20Var.f23138p);
                    sg.g1 swatch2 = j02.getSwatch();
                    swatch2.f57335a = b20Var.f23134l;
                    j02.setSwatch(swatch2);
                    dVar = j02;
                } else {
                    byte b13 = b11;
                    if (b12 == b13) {
                        ?? h02 = h0(b20Var.f23132j, false);
                        h02.D0 = false;
                        if ((b20Var.f23126b & b13) != 0) {
                            h02.r(false);
                        }
                        if ((b20Var.f23126b & 16) != 0) {
                            h02.t(false);
                        }
                        ViewGroup.LayoutParams layoutParams2 = h02.getLayoutParams();
                        layoutParams2.width = b20Var.f23139q;
                        layoutParams2.height = b20Var.f23140r;
                        dVar = h02;
                    } else {
                        i11++;
                        arrayList2 = arrayList;
                        z11 = false;
                        b10 = 1;
                        b11 = 2;
                    }
                }
                dVar.setX((b20Var.f23127c * this.B0.f42189a) - (((1.0f - b20Var.v) * b20Var.f23139q) / 2.0f));
                dVar.setY((b20Var.d * this.B0.f42190b) - (((1.0f - b20Var.v) * b20Var.f23140r) / 2.0f));
                dVar.setPosition(new PointF((b20Var.f23139q / 2.0f) + dVar.getX(), (b20Var.f23140r / 2.0f) + dVar.getY()));
                dVar.setScale(b20Var.v);
                dVar.setRotation((float) (((-b20Var.f23128e) / 3.141592653589793d) * 180.0d));
                i11++;
                arrayList2 = arrayList;
                z11 = false;
                b10 = 1;
                b11 = 2;
            }
        }
        this.J0.setVisibility(4);
        gh0 gh0Var = new gh0(context, 19);
        this.I0 = gh0Var;
        addView(gh0Var);
        ?? frameLayout = new FrameLayout(context);
        this.L0 = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{-16777216, 0}));
        addView(frameLayout, na.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.f58030g1 = imageView;
        imageView.setImageResource(2131232536);
        imageView.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        imageView.setBackground(n6.h0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        vp0 vp0Var2 = vp0Var;
                        g0 g0Var2 = vp0Var2.G0;
                        if (g0Var2 != null && (g0Var2.getCurrentBrush() instanceof sg.g)) {
                            g0Var2.b();
                            vp0Var2.f58027d1.setSelectedIndex(1);
                            vp0Var2.w((sg.h) sg.h.f57338a.get(0));
                            return;
                        }
                        vp0Var2.f58041p0.c();
                        return;
                    case 1:
                        vp0 vp0Var3 = vp0Var;
                        g0 g0Var3 = vp0Var3.G0;
                        sg.j1 j1Var2 = vp0Var3.f58041p0;
                        if (j1Var2.a()) {
                            if (g0Var3 != null && (g0Var3.getCurrentBrush() instanceof sg.g)) {
                                g0Var3.b();
                                vp0Var3.f58027d1.setSelectedIndex(1);
                                vp0Var3.w((sg.h) sg.h.f57338a.get(0));
                            }
                            g0Var3.a();
                            j1Var2.f57388c.clear();
                            j1Var2.f57387b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(j1Var2, 14));
                            vp0Var3.J0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        vp0 vp0Var4 = vp0Var;
                        n nVar = vp0Var4.C0;
                        if (nVar instanceof q2) {
                            org.telegram.messenger.g0.v1(((q2) nVar).getFocusedView());
                        }
                        if (vp0Var4.U1) {
                            vp0Var4.n0(false);
                        }
                        vp0Var4.t0(vp0Var4.C0);
                        vp0Var4.u0(null, true);
                        return;
                    default:
                        vp0Var.u0(null, true);
                        return;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout.addView(imageView, na.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f58031h1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(n6.h0(822083583, 7, -1));
        linearLayout.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 16.0f);
        textView.setText(gd.N0(2131747073, null));
        linearLayout.addView(m10.e(context, 2131232537), na.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, na.r(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new bi.o(27));
        frameLayout.addView(linearLayout, na.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.f58032i1 = textView2;
        textView2.setBackground(n6.h0(822083583, 7, -1));
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView2.setText(gd.N0(2131747085, null));
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
                        g0 g0Var2 = vp0Var2.G0;
                        if (g0Var2 != null && (g0Var2.getCurrentBrush() instanceof sg.g)) {
                            g0Var2.b();
                            vp0Var2.f58027d1.setSelectedIndex(1);
                            vp0Var2.w((sg.h) sg.h.f57338a.get(0));
                            return;
                        }
                        vp0Var2.f58041p0.c();
                        return;
                    case 1:
                        vp0 vp0Var3 = vp0Var;
                        g0 g0Var3 = vp0Var3.G0;
                        sg.j1 j1Var2 = vp0Var3.f58041p0;
                        if (j1Var2.a()) {
                            if (g0Var3 != null && (g0Var3.getCurrentBrush() instanceof sg.g)) {
                                g0Var3.b();
                                vp0Var3.f58027d1.setSelectedIndex(1);
                                vp0Var3.w((sg.h) sg.h.f57338a.get(0));
                            }
                            g0Var3.a();
                            j1Var2.f57388c.clear();
                            j1Var2.f57387b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(j1Var2, 14));
                            vp0Var3.J0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        vp0 vp0Var4 = vp0Var;
                        n nVar = vp0Var4.C0;
                        if (nVar instanceof q2) {
                            org.telegram.messenger.g0.v1(((q2) nVar).getFocusedView());
                        }
                        if (vp0Var4.U1) {
                            vp0Var4.n0(false);
                        }
                        vp0Var4.t0(vp0Var4.C0);
                        vp0Var4.u0(null, true);
                        return;
                    default:
                        vp0Var.u0(null, true);
                        return;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView m11 = org.telegram.ui.Cells.c0.m(frameLayout, textView2, na.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.f58033j1 = m11;
        m11.setBackground(n6.h0(822083583, 7, -1));
        m11.setText(gd.N0(2131752089, null));
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
                        g0 g0Var2 = vp0Var2.G0;
                        if (g0Var2 != null && (g0Var2.getCurrentBrush() instanceof sg.g)) {
                            g0Var2.b();
                            vp0Var2.f58027d1.setSelectedIndex(1);
                            vp0Var2.w((sg.h) sg.h.f57338a.get(0));
                            return;
                        }
                        vp0Var2.f58041p0.c();
                        return;
                    case 1:
                        vp0 vp0Var3 = vp0Var;
                        g0 g0Var3 = vp0Var3.G0;
                        sg.j1 j1Var2 = vp0Var3.f58041p0;
                        if (j1Var2.a()) {
                            if (g0Var3 != null && (g0Var3.getCurrentBrush() instanceof sg.g)) {
                                g0Var3.b();
                                vp0Var3.f58027d1.setSelectedIndex(1);
                                vp0Var3.w((sg.h) sg.h.f57338a.get(0));
                            }
                            g0Var3.a();
                            j1Var2.f57388c.clear();
                            j1Var2.f57387b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(j1Var2, 14));
                            vp0Var3.J0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        vp0 vp0Var4 = vp0Var;
                        n nVar = vp0Var4.C0;
                        if (nVar instanceof q2) {
                            org.telegram.messenger.g0.v1(((q2) nVar).getFocusedView());
                        }
                        if (vp0Var4.U1) {
                            vp0Var4.n0(false);
                        }
                        vp0Var4.t0(vp0Var4.C0);
                        vp0Var4.u0(null, true);
                        return;
                    default:
                        vp0Var.u0(null, true);
                        return;
                }
            }
        });
        m11.setAlpha(0.0f);
        m11.setVisibility(8);
        TextView m12 = org.telegram.ui.Cells.c0.m(frameLayout, m11, na.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.f58035k1 = m12;
        m12.setBackground(n6.h0(822083583, 7, -1));
        m12.setText(gd.N0(2131751342, null));
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
                        g0 g0Var2 = vp0Var2.G0;
                        if (g0Var2 != null && (g0Var2.getCurrentBrush() instanceof sg.g)) {
                            g0Var2.b();
                            vp0Var2.f58027d1.setSelectedIndex(1);
                            vp0Var2.w((sg.h) sg.h.f57338a.get(0));
                            return;
                        }
                        vp0Var2.f58041p0.c();
                        return;
                    case 1:
                        vp0 vp0Var3 = vp0Var;
                        g0 g0Var3 = vp0Var3.G0;
                        sg.j1 j1Var2 = vp0Var3.f58041p0;
                        if (j1Var2.a()) {
                            if (g0Var3 != null && (g0Var3.getCurrentBrush() instanceof sg.g)) {
                                g0Var3.b();
                                vp0Var3.f58027d1.setSelectedIndex(1);
                                vp0Var3.w((sg.h) sg.h.f57338a.get(0));
                            }
                            g0Var3.a();
                            j1Var2.f57388c.clear();
                            j1Var2.f57387b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(j1Var2, 14));
                            vp0Var3.J0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        vp0 vp0Var4 = vp0Var;
                        n nVar = vp0Var4.C0;
                        if (nVar instanceof q2) {
                            org.telegram.messenger.g0.v1(((q2) nVar).getFocusedView());
                        }
                        if (vp0Var4.U1) {
                            vp0Var4.n0(false);
                        }
                        vp0Var4.t0(vp0Var4.C0);
                        vp0Var4.u0(null, true);
                        return;
                    default:
                        vp0Var.u0(null, true);
                        return;
                }
            }
        });
        m12.setAlpha(0.0f);
        m12.setVisibility(8);
        frameLayout.addView(m12, na.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        j0 j0Var = new j0(vp0Var, context);
        this.M0 = j0Var;
        j0Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), 0);
        j0Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(j0Var, na.e(-1, 104, 80));
        if (bitmap2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        m1 m1Var = new m1(context, z10);
        this.f58027d1 = m1Var;
        m1Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        m1Var.setDelegate(this);
        m1Var.setSelectedIndex(1);
        j0Var.addView(m1Var, na.c(48.0f, -1));
        j1 j1Var2 = new j1(context);
        this.f58028e1 = j1Var2;
        j1Var2.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        j1Var2.setVisibility(8);
        j1Var2.setDelegate(this);
        j1Var2.setAlignment(sg.j0.e(i7).f57381g);
        j0Var.addView(j1Var2, na.c(48.0f, -1));
        w01 w01Var = new w01(vp0Var, context);
        this.N0 = w01Var;
        addView(w01Var, na.c(-1.0f, -1));
        o1 o1Var = new o1(context);
        this.f58029f1 = o1Var;
        o1Var.setVisibility(8);
        o1Var.setOnItemClickListener(new n8(vp0Var, 20));
        j1Var2.setTypefaceListView(o1Var);
        w01Var.addView(o1Var, na.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        Paint paint2 = this.l1;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.l1.setColor(1728053247);
        this.l1.setStrokeWidth(Math.max(2, org.telegram.messenger.g0.L(1.0f)));
        this.f58037m1.setColor(n6.w0(n6.G8, this.A1));
        i0 i0Var = new i0(vp0Var, context);
        this.f58044q1 = i0Var;
        i0Var.setVisibility(8);
        i0Var.setColorPalette(sg.j0.e(i7));
        i0Var.setColorListener(new r(vp0Var, 0));
        j0Var.addView(i0Var, na.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        a1 a1Var = new a1(context);
        this.f58034k0 = a1Var;
        a1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        a1Var.setBackground(n6.h0(1090519039, 1, -1));
        j0Var.addView(a1Var, na.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        e1 e1Var = new e1(context);
        this.f58036l0 = e1Var;
        e1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        e1Var.setBackground(n6.h0(1090519039, 1, -1));
        e1Var.setOnClickListener(new qt(vp0Var, context, bitmap2, 8));
        j0Var.addView(e1Var, na.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        r1 r1Var = new r1(context);
        this.V0 = r1Var;
        r1Var.setColorSwatch(this.f58052u1);
        r1Var.setRenderView(this.G0);
        r1Var.setValueOverride(this.W0);
        this.f58052u1.f57337c = this.W0.get();
        r1Var.setOnUpdate(new ao0(vp0Var, i7, 15));
        addView(r1Var, na.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.O0 = frameLayout2;
        addView(frameLayout2, na.c(-1.0f, -1));
        this.f58050t1.setStyle(style);
        this.f58050t1.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        v0(this.f58052u1, null);
        w((sg.h) sg.h.f57338a.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            Point point = org.telegram.messenger.g0.f24226q;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (point.y * 0.35f), org.telegram.messenger.g0.L(100.0f), (int) (point.y * 0.65d))));
        }
    }

    public static void X(tg.l0 r13) {
        throw new UnsupportedOperationException("Method not decompiled: tg.l0.X(tg.l0):void");
    }

    public static void Y(l0 l0Var) {
        j2 j2Var;
        h0 h0Var = l0Var.J0;
        n nVar = l0Var.C0;
        if (nVar != null) {
            PointF E0 = l0Var.E0(nVar);
            n nVar2 = l0Var.C0;
            if (nVar2 instanceof j2) {
                j2 j2Var2 = new j2(l0Var.getContext(), (j2) l0Var.C0, E0);
                j2Var2.setDelegate(l0Var);
                h0Var.addView(j2Var2);
                j2Var = j2Var2;
            } else if (nVar2 instanceof q2) {
                q2 q2Var = new q2(l0Var.getContext(), (q2) l0Var.C0, E0);
                q2Var.setDelegate(l0Var);
                q2Var.setMaxWidth((int) (l0Var.getPaintingSize().f42189a - 20.0f));
                h0Var.addView(q2Var, na.c(-2.0f, -2));
                j2Var = q2Var;
            } else {
                j2Var = null;
            }
            l0Var.s0(j2Var);
            l0Var.u0(j2Var, true);
        }
        org.telegram.ui.ActionBar.g1 g1Var = l0Var.B1;
        if (g1Var != null && g1Var.isShowing()) {
            l0Var.B1.d(true);
        }
    }

    public static void Z(vp0 vp0Var, Integer num) {
        vp0Var.setNewColor(num.intValue());
        vp0Var.z0(false);
    }

    public static void a0(vp0 vp0Var, Integer num) {
        sg.j0 j0Var = vp0Var.F1;
        j0Var.h(num.intValue(), true);
        j0Var.g();
        vp0Var.setNewColor(num.intValue());
        i0 i0Var = vp0Var.f58044q1;
        i0Var.setSelectedColorIndex(j0Var.d());
        i0Var.getAdapter().f();
    }

    public ViewGroup getBarView() {
        if (this.Q0 == 2) {
            return this.f58028e1;
        }
        return this.f58027d1;
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

    private xt0 getPaintingSize() {
        int i7;
        xt0 xt0Var = this.B0;
        if (xt0Var != null) {
            return xt0Var;
        }
        Bitmap bitmap = this.f58038n0;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        int o4 = bz.o();
        if (o4 != 0) {
            if (o4 != 2) {
                i7 = 2560;
            } else {
                i7 = 3840;
            }
        } else {
            i7 = 1280;
        }
        xt0 xt0Var2 = new xt0(width, height);
        float f10 = i7;
        xt0Var2.f42189a = f10;
        float floor = (float) Math.floor((f10 * height) / width);
        xt0Var2.f42190b = floor;
        if (floor > f10) {
            xt0Var2.f42190b = f10;
            xt0Var2.f42189a = (float) Math.floor((f10 * width) / height);
        }
        this.B0 = xt0Var2;
        return xt0Var2;
    }

    public void setNewColor(int i7) {
        sg.g1 g1Var = this.f58052u1;
        int i10 = g1Var.f57335a;
        g1Var.f57335a = i7;
        v0(g1Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new q4(this, i10, i7, 5));
        duration.start();
    }

    private void setTextType(int i7) {
        this.E0 = i7;
        n nVar = this.C0;
        if (nVar instanceof q2) {
            ((q2) nVar).setType(i7);
        }
        sg.j0 e10 = sg.j0.e(this.f58062z1);
        e10.h = i7;
        e10.f57376a.edit().putInt("text_type", i7).apply();
        this.f58028e1.setOutlineType(i7);
    }

    public void setTextWeightRange(n nVar) {
        boolean z10 = nVar instanceof d;
        r1 r1Var = this.V0;
        if (z10) {
            r1Var.b(0.3f, 1.1f);
        } else {
            r1Var.b(0.5f, 2.0f);
        }
    }

    private void setupTabsLayout(Context context) {
        i5 i5Var = new i5(this, context);
        this.P0 = i5Var;
        i5Var.setClipToPadding(false);
        this.P0.setOrientation(0);
        this.M0.addView(this.P0, na.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f58022a1 = textView;
        textView.setText(gd.N0(2131747083, null).toUpperCase());
        TextView textView2 = this.f58022a1;
        int i7 = n6.f29543i6;
        p pVar = this.A1;
        u6.Q(textView2, n6.h0(n6.w0(i7, pVar), 7, -1), null, u6.M(i7), pVar);
        this.f58022a1.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.f58022a1.setTextColor(-1);
        this.f58022a1.setTextSize(1, 14.0f);
        this.f58022a1.setGravity(1);
        this.f58022a1.setTypeface(org.telegram.messenger.g0.o());
        this.f58022a1.setSingleLine();
        this.f58022a1.setOnClickListener(new o(this, 0));
        this.P0.addView(this.f58022a1, na.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.f58024b1 = textView3;
        textView3.setText(gd.N0(2131747082, null).toUpperCase());
        u6.Q(this.f58024b1, n6.h0(n6.w0(i7, pVar), 7, -1), null, u6.M(i7), pVar);
        this.f58024b1.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.f58024b1.setOnClickListener(new o(this, 1));
        this.f58024b1.setTextColor(-1);
        this.f58024b1.setTextSize(1, 14.0f);
        this.f58024b1.setGravity(1);
        this.f58024b1.setTypeface(org.telegram.messenger.g0.o());
        this.f58024b1.setAlpha(0.6f);
        this.f58024b1.setSingleLine();
        this.P0.addView(this.f58024b1, na.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.f58026c1 = textView4;
        textView4.setText(gd.N0(2131747081, null).toUpperCase());
        u6.Q(this.f58026c1, n6.h0(n6.w0(i7, pVar), 7, -1), null, u6.M(i7), pVar);
        this.f58026c1.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.f58026c1.setTextColor(-1);
        this.f58026c1.setTextSize(1, 14.0f);
        this.f58026c1.setGravity(1);
        this.f58026c1.setTypeface(org.telegram.messenger.g0.o());
        this.f58026c1.setAlpha(0.6f);
        this.f58026c1.setSingleLine();
        this.f58026c1.setOnClickListener(new o(this, 4));
        this.P0.addView(this.f58026c1, na.l(1.0f, 0, -2));
    }

    public static void x0(q2 q2Var, int i7) {
        int i10;
        q2Var.setAlign(i7);
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
        q2Var.getEditText().setGravity(i10);
        if (i7 != 1) {
            if (i7 == 2 ? !gd.f24314a0 : gd.f24314a0) {
                i11 = 3;
            }
        } else {
            i11 = 4;
        }
        q2Var.getEditText().setTextAlignment(i11);
    }

    @Override
    public final void A() {
        B0(new t(this, 5), this, 53, 0, getHeight());
    }

    public final void A0(int i7) {
        boolean z10;
        int i10;
        j1 j1Var = this.f58028e1;
        if (i7 == 1) {
            qy qyVar = this.T1;
            if (qyVar != null && qyVar.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            qy qyVar2 = this.T1;
            if (qyVar2 != null && qyVar2.f39047d1 != i10.f24637t0) {
                removeView(qyVar2);
                this.T1 = null;
            }
            if (this.T1 == null) {
                qy qyVar3 = new qy(null, true, false, false, getContext(), false, null, null, true, this.A1, false, false);
                this.T1 = qyVar3;
                qyVar3.V0 = true;
                qyVar3.setVisibility(8);
                if (org.telegram.messenger.g0.Q1()) {
                    this.T1.setForseMultiwindowLayout(true);
                }
                this.T1.setDelegate(new f0(this));
                addView(this.T1);
            }
            this.T1.setVisibility(0);
            this.U1 = true;
            qy qyVar4 = this.T1;
            if (this.Y1 <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.Y1 = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.Y1 = mp.f1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                }
            }
            if (this.Z1 <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.Z1 = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.Z1 = mp.f1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                }
            }
            Point point = org.telegram.messenger.g0.f24226q;
            if (point.x > point.y) {
                i10 = this.Z1;
            } else {
                i10 = this.Y1;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qyVar4.getLayoutParams();
            layoutParams.height = i10;
            qyVar4.setLayoutParams(layoutParams);
            if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                n nVar = this.C0;
                if (nVar instanceof q2) {
                    org.telegram.messenger.g0.v1(((q2) nVar).getEditText());
                }
            }
            this.X1 = i10;
            requestLayout();
            x3 x3Var = ((vp0) this).d2.L1;
            if (x3Var != null) {
                x3Var.a();
            }
            zg emojiButton = j1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(xg.d, true);
            }
            getHeight();
            if (!z10 && !this.V1) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.X1, 0.0f);
                ofFloat.addUpdateListener(new u(this, 1));
                ofFloat.addListener(new e0(this, 0));
                ofFloat.start();
                return;
            }
            return;
        }
        zg emojiButton2 = j1Var.getEmojiButton();
        if (emojiButton2 != null) {
            emojiButton2.j(xg.f41996e, true);
        }
        qy qyVar5 = this.T1;
        if (qyVar5 != null) {
            this.U1 = false;
            if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                qyVar5.setVisibility(8);
            }
        }
        if (i7 == 0) {
            this.X1 = 0;
        }
        x3 x3Var2 = ((vp0) this).d2.L1;
        if (x3Var2 != null) {
            x3Var2.a();
        }
        requestLayout();
        getHeight();
    }

    public final void B0(Runnable runnable, l0 l0Var, int i7, int i10, int i11) {
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
            this.C1.setOnTouchListener(new t4(2, this));
            this.C1.setDispatchKeyEventListener(new w(this));
            this.C1.setShownFromBottom(true);
        }
        this.C1.d();
        runnable.run();
        if (this.B1 == null) {
            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(this.C1, -2, -2);
            this.B1 = g1Var2;
            g1Var2.f29034b = true;
            g1Var2.setAnimationStyle(2131755191);
            this.B1.setOutsideTouchable(true);
            this.B1.setClippingEnabled(true);
            this.B1.setInputMethodMode(2);
            this.B1.setSoftInputMode(0);
            this.B1.getContentView().setFocusableInTouchMode(true);
            this.B1.setOnDismissListener(new v4(2, this));
        }
        this.C1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
        this.B1.setFocusable(true);
        this.B1.showAtLocation(l0Var, i7, i10 - (this.C1.getMeasuredWidth() / 2), i11 - this.C1.getMeasuredHeight());
        org.telegram.ui.ActionBar.g1.i(this.C1);
    }

    public final void C0(boolean z10) {
        float f10;
        if (this.f58040o1 != z10) {
            this.f58040o1 = z10;
            r1.g gVar = this.f58042p1;
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
            this.f58042p1 = gVar2;
            r1.h hVar = new r1.h();
            if (!z10) {
                f11 = 0.0f;
            }
            hVar.f56454i = f11;
            hVar.b(1250.0f);
            hVar.a(1.0f);
            gVar2.f56446m = hVar;
            if (z10) {
                o1 o1Var = this.f58029f1;
                o1Var.setAlpha(0.0f);
                o1Var.setVisibility(0);
            }
            this.f58042p1.b(new q7(3, this));
            this.f58042p1.a(new x(this, z10, 0));
            this.f58042p1.h();
        }
    }

    @Override
    public final void D() {
        C0(true);
    }

    public final void D0() {
        hi.a0 a0Var = this.J1;
        if (a0Var != null) {
            a0Var.f14169b.c();
            o3 o3Var = a0Var.f14170c;
            if (o3Var != null) {
                o3Var.f20256f = null;
                fc fcVar = (fc) o3Var.h;
                if (fcVar != null) {
                    fcVar.b();
                    o3Var.h = null;
                }
                a0Var.f14170c = null;
            }
        }
        this.G0.h();
        this.J0.setVisibility(8);
        this.I0.setVisibility(8);
        this.f58043q0.postRunnable(new cd0(23));
    }

    public final PointF E0(n nVar) {
        float f10 = 200.0f;
        we weVar = this.f58045r0;
        if (weVar != null) {
            f10 = 200.0f / weVar.f27770c;
        }
        if (nVar != null) {
            PointF position = nVar.getPosition();
            return new PointF(position.x + f10, position.y + f10);
        }
        float f11 = 100.0f;
        if (weVar != null) {
            f11 = 100.0f / weVar.f27770c;
        }
        PointF f02 = f0();
        while (true) {
            int i7 = 0;
            boolean z10 = false;
            while (true) {
                h0 h0Var = this.J0;
                if (i7 >= h0Var.getChildCount()) {
                    break;
                }
                View childAt = h0Var.getChildAt(i7);
                if (childAt instanceof n) {
                    PointF position2 = ((n) childAt).getPosition();
                    if (((float) Math.sqrt(Math.pow(position2.y - f02.y, 2.0d) + Math.pow(position2.x - f02.x, 2.0d))) < f11) {
                        z10 = true;
                    }
                }
                i7++;
            }
            if (!z10) {
                return f02;
            }
            f02 = new PointF(f02.x + f10, f02.y + f10);
        }
    }

    public final void F0(int i7) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z10;
        if (this.Q0 != i7 && this.R0 != i7) {
            ValueAnimator valueAnimator = this.T0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i10 = this.Q0;
            ViewGroup viewGroup3 = this.f58028e1;
            ViewGroup viewGroup4 = this.f58027d1;
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
            int i11 = this.f58062z1;
            sg.j0 e10 = sg.j0.e(i11);
            boolean z11 = true;
            if (i7 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (e10.f57385l != z10) {
                e10.f57385l = z10;
                if (z10) {
                    e10.i(-1, false);
                } else {
                    e10.i(e10.f57376a.getInt("brush", 0), false);
                }
            }
            int c10 = sg.j0.e(i11).c();
            sg.g1 g1Var = this.f58052u1;
            g1Var.f57335a = c10;
            if (i7 == 2) {
                z11 = false;
            }
            this.I1 = z11;
            v0(g1Var, null);
            this.I1 = false;
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.T0 = duration;
            duration.setInterpolator(kr.f36858f);
            this.T0.addUpdateListener(new z2(this, viewGroup, viewGroup2, 4));
            this.T0.addListener(new bi.z0(this, viewGroup, viewGroup2, i7, 4));
            this.T0.start();
        }
    }

    public final void G0() {
        int i7 = 0;
        while (true) {
            h0 h0Var = this.J0;
            if (i7 < h0Var.getChildCount()) {
                View childAt = h0Var.getChildAt(i7);
                if (childAt != this.C0) {
                    if (childAt instanceof n) {
                        n nVar = (n) childAt;
                        if (!nVar.f58105n0 && nVar.f58103l0 <= 0.0f) {
                        }
                    }
                    i7++;
                }
                ((n) childAt).m();
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void L(int i7, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        if (i7 > org.telegram.messenger.g0.L(50.0f) && this.V1 && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            if (z10) {
                this.Z1 = i7;
                mp.f1().edit().putInt("kbd_height_land3", this.Z1).commit();
            } else {
                this.Y1 = i7;
                mp.f1().edit().putInt("kbd_height", this.Y1).commit();
            }
        }
        if (this.U1) {
            if (z10) {
                i10 = this.Z1;
            } else {
                i10 = this.Y1;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.T1.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = org.telegram.messenger.g0.f24226q.x;
            if (i11 != i12 || layoutParams.height != i10) {
                layoutParams.width = i12;
                layoutParams.height = i10;
                this.T1.setLayoutParams(layoutParams);
                this.X1 = layoutParams.height;
                requestLayout();
                x3 x3Var = ((vp0) this).d2.L1;
                if (x3Var != null) {
                    x3Var.a();
                }
                getHeight();
            }
        }
        if (this.f58023a2 == i7 && this.f58025b2 == z10) {
            getHeight();
            return;
        }
        this.f58023a2 = i7;
        this.f58025b2 = z10;
        boolean z13 = this.V1;
        n nVar = this.C0;
        if (nVar instanceof q2) {
            if (((q2) nVar).getEditText().isFocused() && i7 > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.V1 = z12;
        } else {
            this.V1 = false;
        }
        if (this.V1 && this.U1) {
            A0(0);
        }
        if (this.X1 != 0 && !(z11 = this.V1) && z11 != z13 && !this.U1) {
            this.X1 = 0;
            requestLayout();
            x3 x3Var2 = ((vp0) this).d2.L1;
            if (x3Var2 != null) {
                x3Var2.a();
            }
        }
        getHeight();
    }

    @Override
    public final void a() {
        z0(true);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.G8));
        hashSet.add(Integer.valueOf(n6.f29524h5));
        hashSet.add(Integer.valueOf(n6.f29559j5));
        hashSet.add(Integer.valueOf(n6.f29709r5));
        hashSet.add(Integer.valueOf(n6.f29871zf));
        hashSet.add(Integer.valueOf(n6.Cf));
        hashSet.add(Integer.valueOf(n6.Ff));
        hashSet.add(Integer.valueOf(n6.Jf));
        hashSet.add(Integer.valueOf(n6.Ef));
        hashSet.add(Integer.valueOf(n6.G6));
        hashSet.add(Integer.valueOf(n6.Di));
        hashSet.add(Integer.valueOf(n6.f29816wi));
        hashSet.add(Integer.valueOf(n6.f29797vi));
        hashSet.add(Integer.valueOf(n6.f29835xi));
        hashSet.add(Integer.valueOf(n6.f29854yi));
        hashSet.add(Integer.valueOf(n6.Bf));
        hashSet.add(Integer.valueOf(n6.Af));
        hashSet.add(Integer.valueOf(n6.f29394a7));
        hashSet.add(Integer.valueOf(n6.f29617m7));
        hashSet.add(Integer.valueOf(n6.f29599l7));
        hashSet.add(Integer.valueOf(n6.f29634n7));
        hashSet.add(Integer.valueOf(n6.f29451d6));
        hashSet.add(Integer.valueOf(n6.f29452d7));
    }

    @Override
    public final void b() {
        setTextType((this.E0 + 1) % 4);
    }

    @Override
    public final void c(int i7) {
        n nVar = this.C0;
        if (nVar instanceof q2) {
            x0((q2) nVar, i7);
            sg.j0 e10 = sg.j0.e(this.f58062z1);
            e10.f57381g = i7;
            e10.f57376a.edit().putInt("text_alignment", i7).apply();
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        h0 h0Var;
        q2 q2Var;
        String str;
        if (i7 == ks.F5 && (h0Var = this.J0) != null) {
            for (int i11 = 0; i11 < h0Var.getChildCount(); i11++) {
                View childAt = h0Var.getChildAt(i11);
                if ((childAt instanceof q2) && (str = (q2Var = (q2) childAt).C0) != null) {
                    q2Var.setTypeface(str);
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
        throw new UnsupportedOperationException("Method not decompiled: tg.l0.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final void e0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new org.telegram.ui.web.t1(16, this, view)).start();
    }

    @Override
    public final void f(n nVar) {
        int[] l02 = l0(nVar);
        B0(new z(this, nVar, 1), this, 51, l02[0], l02[1] - org.telegram.messenger.g0.L(32.0f));
    }

    public final PointF f0() {
        we weVar;
        xt0 paintingSize = getPaintingSize();
        float f10 = paintingSize.f42189a / 2.0f;
        float f11 = paintingSize.f42190b / 2.0f;
        if (this.f58045r0 != null) {
            double radians = (float) Math.toRadians(-(weVar.f27775k + weVar.d));
            float cos = (float) ((Math.cos(radians) * weVar.f27768a) - (Math.sin(radians) * weVar.f27769b));
            float c10 = (float) i5.c.c(radians, weVar.f27769b, Math.sin(radians) * weVar.f27768a);
            f10 -= cos * paintingSize.f42189a;
            f11 -= c10 * paintingSize.f42190b;
        }
        return new PointF(f10, f11);
    }

    public final d g0() {
        ((vp0) this).d2.f43352h0.isFocusable();
        xt0 paintingSize = getPaintingSize();
        PointF f02 = f0();
        f02.y *= 1.5f;
        d dVar = new d(getContext(), f02, (int) ((paintingSize.f42189a / 9.0f) * 0.5f), new sg.g1(1.0f, this.f58052u1.f57337c, -1));
        float f10 = paintingSize.f42189a / 9.0f;
        t tVar = new t(this, 2);
        dVar.f58184y0 = (int) (0.5f * f10);
        dVar.f58185z0 = (int) (f10 * 2.0f);
        dVar.A0 = tVar;
        dVar.B0 = true;
        dVar.setStickyX(2);
        dVar.setDelegate(this);
        dVar.setMaxWidth((int) (paintingSize.f42189a - 20.0f));
        dVar.setTypeface(sg.j0.e(this.f58062z1).f57383j);
        dVar.setType(3);
        hi.a0 a0Var = this.J1;
        if (a0Var != null) {
            a0Var.b(dVar);
        } else {
            aa aaVar = this.L1;
            Objects.requireNonNull(aaVar);
            dVar.setPositionProvider(new hi.x(aaVar, 3));
            dVar.setOnEditing(new hi.y(aaVar, 3));
            dVar.setOnSeek(new hi.y(aaVar, 4));
        }
        this.J0.addView(dVar, na.c(-2.0f, -2));
        x0(dVar, 1);
        we weVar = this.f58045r0;
        if (weVar != null) {
            dVar.j(1.0f / weVar.f27770c);
            dVar.f(-(weVar.f27775k + weVar.d));
        }
        return dVar;
    }

    public int getAdditionalBottom() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    public int getAdditionalTop() {
        return org.telegram.messenger.g0.L(48.0f);
    }

    public View getCancelView() {
        return this.f58034k0;
    }

    public long getCaptionsTrimEnd() {
        return 0L;
    }

    public long getCaptionsTrimStart() {
        return 0L;
    }

    public File getCaptionsVideoFile() {
        return null;
    }

    public long getCaptionsVideoPosition() {
        return 0L;
    }

    public float getCropRotation() {
        we weVar = this.f58045r0;
        if (weVar != null) {
            return weVar.d + weVar.f27775k;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.f58036l0;
    }

    public long getLcm() {
        return this.Z0.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        x5[] x5VarArr;
        h0 h0Var = this.J0;
        int childCount = h0Var.getChildCount();
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = h0Var.getChildAt(i7);
            if (childAt instanceof j2) {
                TLRPC.Document sticker = ((j2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f28504id = sticker.f28498id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof q2) {
                CharSequence text = ((q2) childAt).getText();
                if ((text instanceof Spanned) && (x5VarArr = (x5[]) ((Spanned) text).getSpans(0, text.length(), x5.class)) != null) {
                    for (x5 x5Var : x5VarArr) {
                        if (x5Var != null) {
                            TLRPC.Document document = x5Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.o5.e(this.f58062z1, x5Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.f28504id = document.f28498id;
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

    public sg.t0 getRenderView() {
        return this.G0;
    }

    public float getSelectedEntityBottom() {
        n nVar = this.C0;
        h0 h0Var = this.J0;
        if (nVar == null) {
            return getY() + h0Var.getMeasuredHeight();
        }
        int[] iArr = new int[2];
        nVar.getLocationInWindow(iArr);
        return (h0Var.getScaleY() * this.C0.getHeight()) + iArr[1];
    }

    public nz0 getThanosEffect() {
        if (!nz0.c()) {
            return null;
        }
        if (this.K0 == null) {
            nz0 nz0Var = new nz0(getContext(), new t(this, 0));
            this.K0 = nz0Var;
            addView(nz0Var);
        }
        return this.K0;
    }

    public final s1 h0(String str, boolean z10) {
        float f10;
        xt0 xt0Var;
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
        h0 h0Var = this.J0;
        if (i7 > 0) {
            float floor = (float) Math.floor(h0Var.getMeasuredWidth() * 0.5d);
            xt0Var = new xt0(floor, floor / f10);
        } else {
            float floor2 = (float) Math.floor(h0Var.getMeasuredHeight() * 0.5d);
            xt0Var = new xt0(f10 * floor2, floor2);
        }
        xt0 xt0Var2 = xt0Var;
        Pair N0 = org.telegram.messenger.g0.N0(str);
        if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
            float f11 = xt0Var2.f42189a;
            xt0Var2.f42189a = xt0Var2.f42190b;
            xt0Var2.f42190b = f11;
        }
        Context context = getContext();
        PointF f02 = f0();
        int intValue = ((Integer) N0.first).intValue();
        ((Integer) N0.second).getClass();
        s1 s1Var = new s1(context, f02, xt0Var2, str, intValue);
        s1Var.setDelegate(this);
        h0Var.addView(s1Var);
        if (z10) {
            s0(s1Var);
            u0(s1Var, true);
        }
        return s1Var;
    }

    public final boolean i(MotionEvent motionEvent) {
        if (this.C0 != null) {
            u0(null, true);
        }
        float x10 = motionEvent.getX();
        g0 g0Var = this.G0;
        float translationX = ((x10 - g0Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / g0Var.getScaleX();
        float y10 = ((((motionEvent.getY() - g0Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) + org.telegram.messenger.g0.L(32.0f)) - ((getAdditionalTop() - getAdditionalBottom()) / 2.0f)) / g0Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-g0Var.getRotation());
        double d2 = y10;
        float measuredWidth = (g0Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        float measuredHeight = (g0Var.getMeasuredHeight() / 2.0f) + ((float) i5.c.c(radians, d2, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        g0Var.e(obtain);
        obtain.recycle();
        return true;
    }

    public final tg.d0 i0(java.lang.Object r24, org.telegram.tgnet.TLRPC.Document r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: tg.l0.i0(java.lang.Object, org.telegram.tgnet.TLRPC$Document, boolean):tg.d0");
    }

    public final q2 j0(boolean z10) {
        ((vp0) this).d2.f43352h0.isFocusable();
        xt0 paintingSize = getPaintingSize();
        PointF E0 = E0(null);
        q2 q2Var = new q2(getContext(), E0, (int) (paintingSize.f42189a / 9.0f), "", this.f58052u1, this.E0);
        float f10 = paintingSize.f42189a / 9.0f;
        t tVar = new t(this, 3);
        q2Var.f58184y0 = (int) (0.5f * f10);
        q2Var.f58185z0 = (int) (f10 * 2.0f);
        q2Var.A0 = tVar;
        float f11 = E0.x;
        h0 h0Var = this.J0;
        if (f11 == h0Var.getMeasuredWidth() / 2.0f) {
            q2Var.setStickyX(2);
        }
        if (E0.y == h0Var.getMeasuredHeight() / 2.0f) {
            q2Var.setStickyY(2);
        }
        q2Var.setDelegate(this);
        q2Var.setMaxWidth((int) (paintingSize.f42189a - 20.0f));
        int i7 = this.f58062z1;
        q2Var.setTypeface(sg.j0.e(i7).f57383j);
        q2Var.setType(sg.j0.e(i7).h);
        h0Var.addView(q2Var, na.c(-2.0f, -2));
        we weVar = this.f58045r0;
        if (weVar != null) {
            q2Var.j(1.0f / weVar.f27770c);
            q2Var.f(-(weVar.f27775k + weVar.d));
        }
        if (z10) {
            s0(q2Var);
            q2Var.q();
            u0(q2Var, false);
            q2Var.getFocusedView().requestFocus();
            org.telegram.messenger.g0.I3(q2Var.getFocusedView());
            this.D0 = true;
            int i10 = sg.j0.e(i7).f57381g;
            j1 j1Var = this.f58028e1;
            j1Var.d(i10, true);
            j1Var.setOutlineType(sg.j0.e(i7).h);
        }
        return q2Var;
    }

    public final void k0() {
        n nVar = this.C0;
        if ((nVar instanceof q2) && !this.D0) {
            q2 q2Var = (q2) nVar;
            if (q2Var instanceof d) {
                d dVar = (d) q2Var;
                dVar.z();
                if (dVar.E0 == null) {
                    return;
                }
            }
            this.D0 = true;
            q2Var.q();
            View focusedView = q2Var.getFocusedView();
            focusedView.requestFocus();
            org.telegram.messenger.g0.I3(focusedView);
        }
    }

    public final int[] l0(n nVar) {
        float[] fArr = this.R1;
        fArr[0] = nVar.getWidth() / 2.0f;
        fArr[1] = nVar.getHeight() / 2.0f;
        nVar.getMatrix().mapPoints(fArr);
        fArr[0] = fArr[0] + nVar.getLeft();
        fArr[1] = fArr[1] + nVar.getTop();
        ViewParent parent = nVar.getParent();
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
        int[] iArr = this.S1;
        iArr[0] = round;
        int round2 = Math.round(fArr[1]);
        iArr[1] = round2;
        Point point = org.telegram.messenger.g0.f24226q;
        double d = iArr[0] - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.J0.getRotation());
        double d2 = round2 - (point.y / 2.0f);
        iArr[0] = (point.x / 2) + ((int) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        iArr[1] = (point.y / 2) + ((int) i5.c.c(radians, d2, Math.sin(radians) * d));
        return iArr;
    }

    public final int m0(boolean z10) {
        return this.X1;
    }

    @Override
    public final int[] n(n nVar) {
        return l0(nVar);
    }

    public final void n0(boolean z10) {
        if (this.U1) {
            A0(0);
        }
        if (z10) {
            qy qyVar = this.T1;
            if (qyVar != null && qyVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.T1.getMeasuredHeight());
                ofFloat.addUpdateListener(new u(this, 0));
                this.W1 = true;
                ofFloat.addListener(new e0(this, 1));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f29066w);
                ofFloat.start();
                return;
            }
            o0();
        }
    }

    public final void o0() {
        qy qyVar;
        x3 x3Var;
        if (this.X1 > 0 && (x3Var = ((vp0) this).d2.L1) != null) {
            x3Var.a();
        }
        if (!this.U1 && (qyVar = this.T1) != null && qyVar.getVisibility() != 8) {
            this.T1.setVisibility(8);
        }
        this.X1 = 0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.e().c(this, ks.F5);
    }

    @Override
    public final void onDetachedFromWindow() {
        hi.a0 a0Var = this.J1;
        if (a0Var != null) {
            a0Var.f(null);
            o3 o3Var = a0Var.f14170c;
            if (o3Var != null) {
                o3Var.f20256f = null;
                fc fcVar = (fc) o3Var.h;
                if (fcVar != null) {
                    fcVar.b();
                    o3Var.h = null;
                }
                a0Var.f14170c = null;
            }
            a0Var.f14168a.w(false);
        }
        super.onDetachedFromWindow();
        ks.e().n(this, ks.F5);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int Q;
        super.onLayout(z10, i7, i10, i11, i12);
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        int i15 = 0;
        if (this.T1 != null) {
            if (org.telegram.messenger.g0.Q1()) {
                Q = i14 - this.T1.getMeasuredHeight();
            } else {
                Q = (Q() + i14) - this.T1.getMeasuredHeight();
            }
            qy qyVar = this.T1;
            qyVar.layout(0, Q, qyVar.getMeasuredWidth(), this.T1.getMeasuredHeight() + Q);
        }
        if (!this.F0) {
            i15 = org.telegram.messenger.g0.f24220m;
        }
        g0 g0Var = this.G0;
        int ceil = (int) Math.ceil((i13 - g0Var.getMeasuredWidth()) / 2.0f);
        int additionalTop = ((getAdditionalTop() - getAdditionalBottom()) / 2) + f3.C(8.0f, (((i14 - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i15)) - org.telegram.messenger.g0.L(48.0f)) - g0Var.getMeasuredHeight()) / 2, i15);
        g0Var.layout(ceil, additionalTop, g0Var.getMeasuredWidth() + ceil, g0Var.getMeasuredHeight() + additionalTop);
        tv tvVar = this.H0;
        tvVar.layout(ceil, additionalTop, tvVar.getMeasuredWidth() + ceil, tvVar.getMeasuredHeight() + additionalTop);
        int measuredWidth = g0Var.getMeasuredWidth();
        h0 h0Var = this.J0;
        int measuredWidth2 = ((measuredWidth - h0Var.getMeasuredWidth()) / 2) + ceil;
        int measuredHeight = ((g0Var.getMeasuredHeight() - h0Var.getMeasuredHeight()) / 2) + additionalTop;
        h0Var.layout(measuredWidth2, measuredHeight, h0Var.getMeasuredWidth() + measuredWidth2, h0Var.getMeasuredHeight() + measuredHeight);
        nz0 nz0Var = this.K0;
        if (nz0Var != null) {
            nz0Var.layout(measuredWidth2, measuredHeight, h0Var.getMeasuredWidth() + measuredWidth2, h0Var.getMeasuredHeight() + measuredHeight);
        }
        gh0 gh0Var = this.I0;
        gh0Var.layout(ceil, additionalTop, gh0Var.getMeasuredWidth() + ceil, gh0Var.getMeasuredHeight() + additionalTop);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float currentActionBarHeight;
        float f10;
        hi.u uVar;
        this.f58061z0 = true;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((org.telegram.messenger.g0.f24226q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - org.telegram.messenger.g0.L(48.0f);
        Bitmap bitmap = this.f58038n0;
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
        float f13 = f11 / this.B0.f42189a;
        this.A0 = f13;
        h0 h0Var = this.J0;
        h0Var.setScaleX(f13);
        h0Var.setScaleY(this.A0);
        h0Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.B0.f42189a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.B0.f42190b, 1073741824));
        nz0 nz0Var = this.K0;
        if (nz0Var != null) {
            nz0Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.B0.f42189a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.B0.f42190b, 1073741824));
            this.K0.setScaleX(this.A0);
            this.K0.setScaleY(this.A0);
        }
        G0();
        this.I0.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
        measureChild(this.M0, i7, i10);
        measureChild(this.V0, i7, i10);
        hi.a0 a0Var = this.J1;
        if (a0Var != null && (uVar = a0Var.f14171e) != null) {
            uVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        measureChild(this.O0, i7, i10);
        measureChild(this.N0, i7, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(getPKeyboardHeight(), this.X1), 1073741824));
        FrameLayout frameLayout = this.L0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.f24220m, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i7, i10);
        this.f58061z0 = false;
        if (org.telegram.messenger.g0.L(20.0f) >= 0 && !this.U1 && !this.W1) {
            this.f58061z0 = true;
            o0();
            this.f58061z0 = false;
        }
        if (org.telegram.messenger.g0.L(20.0f) < 0) {
            o0();
        }
        qy qyVar = this.T1;
        if (qyVar != null) {
            measureChild(qyVar, i7, i10);
        }
    }

    @Override
    public final boolean p() {
        return true;
    }

    public final void p0(boolean z10) {
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
    public final boolean q() {
        return !this.D0;
    }

    public final boolean q0() {
        if (this.f58054v1) {
            z0(false);
            return true;
        } else if (this.U1) {
            n0(true);
            return true;
        } else if (!this.D0) {
            return false;
        } else {
            u0(null, true);
            return true;
        }
    }

    public abstract void r0(boolean z10);

    @Override
    public final void requestLayout() {
        if (this.f58061z0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(n nVar) {
        if (nVar == null) {
            return;
        }
        this.f58041p0.b(nVar.getUUID(), new z(this, nVar, 0));
    }

    public void setBlurredBackgroundDrawableForTools(fh.g gVar) {
        gVar.q(org.telegram.messenger.g0.L(4.0f));
        this.Q1 = gVar;
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
        x3 x3Var;
        if (!this.V1 && !this.U1) {
            j0(true);
            return;
        }
        boolean z10 = this.U1;
        if (z10 && (x3Var = ((vp0) this).d2.L1) != null) {
            x3Var.f15711e = true;
        }
        A0(!z10 ? 1 : 0);
        if (z10) {
            n nVar = this.C0;
            if (nVar instanceof q2) {
                org.telegram.messenger.g0.I3(((q2) nVar).getEditText());
            }
        }
    }

    public final void t0(n nVar) {
        n nVar2 = this.C0;
        if (nVar == nVar2 && nVar2 != null) {
            nVar2.l(nVar2.f58106o0, false);
            this.C0 = null;
            if (nVar instanceof q2) {
                ValueAnimator valueAnimator = this.T0;
                if (valueAnimator != null && this.R0 != 0) {
                    valueAnimator.cancel();
                }
                F0(0);
            }
        }
        this.J0.removeView(nVar);
        if (nVar != null) {
            UUID uuid = nVar.getUUID();
            sg.j1 j1Var = this.f58041p0;
            j1Var.f57387b.remove(uuid);
            j1Var.f57388c.remove(uuid);
            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(j1Var, 14));
        }
        r1 r1Var = this.V0;
        org.telegram.ui.ActionBar.i5 i5Var = this.W0;
        r1Var.setValueOverride(i5Var);
        r1Var.setShowPreview(true);
        float f10 = i5Var.get();
        sg.g1 g1Var = this.f58052u1;
        g1Var.f57337c = f10;
        v0(g1Var, null);
    }

    @Override
    public final boolean u(n nVar) {
        return u0(nVar, true);
    }

    public final boolean u0(n nVar, boolean z10) {
        l0 l0Var;
        boolean z11;
        int i7;
        boolean z12 = nVar instanceof q2;
        int i10 = 2;
        if (z12 && (((i7 = this.R0) == -1 && this.Q0 != 2) || (i7 != -1 && i7 != 2))) {
            ValueAnimator valueAnimator = this.T0;
            if (valueAnimator != null && i7 != 2) {
                valueAnimator.cancel();
            }
            if (this.f58054v1) {
                z0(false);
            }
            F0(2);
        }
        if (z12 && z10) {
            q2 q2Var = (q2) nVar;
            int gravity = q2Var.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i10 = 0;
                }
            } else {
                i10 = 1;
            }
            j1 j1Var = this.f58028e1;
            j1Var.setAlignment(i10);
            j1Var.setTypeface(q2Var.getTypeface().f57278a);
            j1Var.e(q2Var.getType(), true);
            this.N0.invalidate();
        }
        n nVar2 = this.C0;
        if (nVar2 != null) {
            if (nVar2 == nVar) {
                boolean z13 = this.D0;
                if (!z13 && (nVar2 instanceof d) && !nVar.f58097f0) {
                    k0();
                    return true;
                } else if (!z13) {
                    int[] l02 = l0(nVar2);
                    B0(new z(this, nVar2, 1), this, 51, l02[0], l02[1] - org.telegram.messenger.g0.L(32.0f));
                    return true;
                } else {
                    if (nVar2 instanceof q2) {
                        org.telegram.messenger.g0.I3(((q2) nVar2).getFocusedView());
                        n0(false);
                    }
                    return true;
                }
            }
            l0Var = this;
            nVar2.l(nVar2.f58106o0, false);
            n nVar3 = l0Var.C0;
            if (nVar3 instanceof q2) {
                ((q2) nVar3).r();
                if (!z12) {
                    l0Var.D0 = false;
                    org.telegram.messenger.g0.v1(((q2) l0Var.C0).getFocusedView());
                    n0(false);
                }
            }
            z11 = true;
        } else {
            l0Var = this;
            z11 = false;
        }
        n nVar4 = l0Var.C0;
        l0Var.C0 = nVar;
        if ((nVar4 instanceof q2) && TextUtils.isEmpty(((q2) nVar4).getText()) && !(nVar4 instanceof d)) {
            t0(nVar4);
        }
        n nVar5 = l0Var.C0;
        org.telegram.ui.ActionBar.i5 i5Var = l0Var.W0;
        sg.g1 g1Var = l0Var.f58052u1;
        r1 r1Var = l0Var.V0;
        if (nVar5 != null) {
            gh0 gh0Var = l0Var.I0;
            nVar5.f58106o0 = gh0Var;
            nVar5.l(gh0Var, true);
            l0Var.J0.bringChildToFront(l0Var.C0);
            n nVar6 = l0Var.C0;
            if (nVar6 instanceof q2) {
                q2 q2Var2 = (q2) nVar6;
                q2Var2.B0 = false;
                q2Var2.getSwatch().f57337c = g1Var.f57337c;
                v0(q2Var2.getSwatch(), null);
                setTextWeightRange(q2Var2);
                r1Var.setValueOverride(new g5(q2Var2, (int) (l0Var.B0.f42189a / 9.0f), 1));
                r1Var.setShowPreview(false);
                return true;
            }
            r1Var.setValueOverride(i5Var);
            r1Var.setShowPreview(true);
            g1Var.f57337c = i5Var.get();
            v0(g1Var, null);
            return true;
        }
        ValueAnimator valueAnimator2 = l0Var.T0;
        if (valueAnimator2 != null && l0Var.R0 != 0) {
            valueAnimator2.cancel();
        }
        if (l0Var.f58054v1) {
            z0(false);
        }
        F0(0);
        r1Var.setValueOverride(i5Var);
        r1Var.setShowPreview(true);
        g1Var.f57337c = i5Var.get();
        v0(g1Var, null);
        return z11;
    }

    @Override
    public final void updateColors() {
        this.f58060y1.setColor(-15132391);
    }

    @Override
    public final void v(float f10, float f11, float[] fArr) {
        Point point = org.telegram.messenger.g0.f24226q;
        double d = f10 - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.J0.getRotation());
        double d2 = f11 - (point.y / 2.0f);
        fArr[0] = (point.x / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        fArr[1] = (point.y / 2.0f) + ((float) i5.c.c(radians, d2, Math.sin(radians) * d));
    }

    public final void v0(sg.g1 g1Var, Integer num) {
        sg.g1 g1Var2 = this.f58052u1;
        if (g1Var2 != g1Var) {
            g1Var2.f57335a = g1Var.f57335a;
            g1Var2.f57336b = g1Var.f57336b;
            g1Var2.f57337c = g1Var.f57337c;
            int i7 = this.f58062z1;
            sg.j0.e(i7).h(g1Var.f57335a, true);
            sg.j0.e(i7).j(g1Var.f57337c);
        }
        int i10 = g1Var.f57335a;
        g0 g0Var = this.G0;
        g0Var.setColor(i10);
        g0Var.setBrushSize(g1Var.f57337c);
        int i11 = g1Var2.f57335a;
        if (num != null && num.intValue() != i11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new j4(this, num, i11, 3));
            duration.start();
        } else {
            j0 j0Var = this.M0;
            if (j0Var != null) {
                j0Var.invalidate();
            }
        }
        n nVar = this.C0;
        if ((nVar instanceof q2) && !this.I1) {
            ((q2) nVar).setSwatch(new sg.g1(g1Var.f57336b, g1Var.f57337c, g1Var.f57335a));
        }
    }

    @Override
    public final void w(sg.h hVar) {
        boolean z10 = hVar instanceof sg.b;
        r1 r1Var = this.V0;
        if (!z10 && !(hVar instanceof sg.d)) {
            r1Var.b(0.05f, 1.0f);
        } else {
            r1Var.b(0.4f, 1.75f);
        }
        r1Var.setDrawCenter(!(hVar instanceof sg.g));
        g0 g0Var = this.G0;
        if (g0Var.getCurrentBrush() instanceof sg.g) {
            this.U0 = true;
        }
        g0Var.setBrush(hVar);
        sg.g1 g1Var = this.f58052u1;
        int i7 = g1Var.f57335a;
        g1Var.f57335a = sg.j0.e(this.f58062z1).c();
        g1Var.f57337c = this.W0.get();
        v0(g1Var, Integer.valueOf(i7));
        this.H0.invalidate();
    }

    public final void w0(float f10) {
        this.m0 = f10;
        this.L0.setTranslationY(-f10);
        this.M0.setTranslationY(f10);
    }

    @Override
    public final sg.j0 x() {
        return sg.j0.e(this.f58062z1);
    }

    public final void y0(float f10, float f11, float f12, float f13, float f14) {
        View view;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        this.f58047s0 = f10;
        this.f58057x0 = f13;
        this.f58059y0 = f14;
        this.f58049t0 = f11;
        this.f58051u0 = f12;
        this.f58053v0 = f11;
        float f22 = f12 + 0.0f;
        this.f58055w0 = f22;
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
            we weVar = this.f58045r0;
            if (weVar != null) {
                float f23 = weVar.f27770c * 1.0f;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                if (measuredWidth != 0 && measuredHeight != 0) {
                    int i10 = weVar.f27775k;
                    if (i10 == 90 || i10 == 270) {
                        measuredHeight = measuredWidth;
                        measuredWidth = measuredHeight;
                    }
                    float max = Math.max(f13 / ((int) (weVar.f27771e * f20)), f14 / ((int) (weVar.f27772f * f21)));
                    f16 = f23 * max;
                    float D = com.google.android.gms.internal.vision.e2.D(weVar.f27768a, measuredWidth, f10, max);
                    float f24 = weVar.f27770c;
                    f17 = (D * f24) + f11;
                    f15 = 1.0f;
                    f18 = (weVar.f27769b * measuredHeight * f10 * max * f24) + f22;
                    f19 = weVar.d + i10;
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
            float f25 = ((-this.X1) / 2.0f) + f18;
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
        G0();
        invalidate();
    }

    public final void z0(final boolean z10) {
        float f10;
        boolean z11;
        if (this.f58054v1 != z10) {
            this.f58054v1 = z10;
            r1.g gVar = this.f58056w1;
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
            this.f58056w1 = gVar2;
            r1.h hVar = new r1.h();
            if (!z10) {
                f11 = 0.0f;
            }
            hVar.f56454i = f11;
            hVar.b(1250.0f);
            hVar.a(1.0f);
            gVar2.f56446m = hVar;
            if (!this.V1 && !this.U1) {
                z11 = false;
            } else {
                z11 = true;
            }
            final boolean[] zArr = {z11};
            final float translationY = this.M0.getTranslationY();
            final ViewGroup barView = getBarView();
            this.f58056w1.b(new r1.d() {
                @Override
                public final void a(r1.g gVar3, float f12, float f13) {
                    int i7;
                    l0 l0Var = l0.this;
                    j0 j0Var = l0Var.M0;
                    float f14 = f12 / 1000.0f;
                    l0Var.f58058x1 = f14;
                    float f15 = ((1.0f - f14) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f15);
                    view.setScaleY(f15);
                    view.setTranslationY((Math.min(l0Var.f58058x1, 0.25f) * org.telegram.messenger.g0.L(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(l0Var.f58058x1, 0.25f) / 0.25f));
                    i0 i0Var = l0Var.f58044q1;
                    float f16 = l0Var.f58058x1;
                    boolean z12 = z10;
                    i0Var.B1(z12, f16);
                    l0Var.f58036l0.setProgress(l0Var.f58058x1);
                    l0Var.f58034k0.setProgress(l0Var.f58058x1);
                    l0Var.P0.setTranslationY(org.telegram.messenger.g0.L(32.0f) * l0Var.f58058x1);
                    if (zArr[0]) {
                        float f17 = l0Var.f58058x1;
                        if (!z12) {
                            f17 = 1.0f - f17;
                        }
                        float L = org.telegram.messenger.g0.L(40.0f) * f17;
                        if (z12) {
                            i7 = 1;
                        } else {
                            i7 = -1;
                        }
                        j0Var.setTranslationY(translationY - (L * i7));
                    }
                    j0Var.invalidate();
                    if (view == l0Var.f58028e1) {
                        l0Var.N0.invalidate();
                    }
                }
            });
            this.f58056w1.a(new x(this, z10, 1));
            this.f58056w1.h();
            if (z10) {
                i0 i0Var = this.f58044q1;
                i0Var.setVisibility(0);
                i0Var.setSelectedColorIndex(sg.j0.e(this.f58062z1).d());
            }
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

    public FrameLayout getCaptionsBulletinContainer() {
        return this;
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
