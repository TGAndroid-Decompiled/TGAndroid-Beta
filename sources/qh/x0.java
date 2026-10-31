package qh;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.widget.OverScroller;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.k6;
import org.telegram.messenger.k9;
import org.telegram.messenger.sc;
import org.telegram.messenger.us;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.u41;
import org.telegram.ui.f11;
import org.telegram.ui.web.v1;
import rh.v5;
public final class x0 extends View {
    public static int[] D9;
    public static int[] E9;
    public static int[] F9;
    public static String J9;
    public static f K9;
    public static volatile byte[] N9;
    public static int O9;
    public static int P9;
    public static int Q9;
    public boolean A0;
    public final Paint A1;
    public int A2;
    public int[] A3;
    public final float A4;
    public final boolean[] A5;
    public boolean A6;
    public final LinearGradient A7;
    public long A8;
    public final Rect[] A9;
    public float B0;
    public final Paint B1;
    public boolean B2;
    public final Paint B3;
    public final Paint B4;
    public int B5;
    public int B6;
    public final Paint B7;
    public float B8;
    public float C0;
    public final TextPaint C1;
    public float C2;
    public final RectF C3;
    public final Paint C4;
    public final LinearGradient C5;
    public final SweepGradient[] C6;
    public final Matrix C7;
    public float C8;
    public final long D;
    public float D0;
    public final TextPaint D1;
    public float D2;
    public boolean D3;
    public final RectF D4;
    public final Paint D5;
    public float D6;
    public final RectF[] D7;
    public float D8;
    public final Matrix E;
    public long E0;
    public final Path E1;
    public float E2;
    public float E3;
    public final float[] E4;
    public final Path E5;
    public float E6;
    public float E7;
    public float E8;
    public u0 F;
    public boolean F0;
    public final RectF F1;
    public long F2;
    public float F3;
    public final float[] F4;
    public final TextPaint F5;
    public float F6;
    public float F7;
    public float F8;
    public u0 G;
    public float G0;
    public Object G1;
    public long G2;
    public float G3;
    public final float[] G4;
    public Drawable G5;
    public float G6;
    public boolean G7;
    public float G8;
    public long H;
    public final TextPaint H0;
    public Object H1;
    public boolean H2;
    public float H3;
    public final float[] H4;
    public StaticLayout H5;
    public float H6;
    public int H7;
    public float H8;
    public final ArrayList I;
    public String I0;
    public int I1;
    public long I2;
    public float I3;
    public final float[] I4;
    public int I5;
    public float I6;
    public final RectF I7;
    public final Path I8;
    public final HashMap J;
    public String J0;
    public final Drawable J1;
    public float J2;
    public float J3;
    public final long[] J4;
    public final RectF J5;
    public float J6;
    public final HashMap J7;
    public final RectF J8;
    public float K;
    public boolean K0;
    public final Drawable K1;
    public float K2;
    public float K3;
    public int K4;
    public final RectF K5;
    public float K6;
    public final HashMap K7;
    public final RectF K8;
    public float L;
    public final e6 L0;
    public final Drawable L1;
    public float L2;
    public final t0 L3;
    public float L4;
    public final Path L5;
    public boolean L6;
    public int L7;
    public final RectF L8;
    public float M;
    public final float[] M0;
    public final Drawable M1;
    public long M2;
    public float M3;
    public float M4;
    public final float[] M5;
    public long M6;
    public int M7;
    public long M8;
    public float N;
    public final float[] N0;
    public final Drawable N1;
    public long N2;
    public float N3;
    public final Paint N4;
    public float N5;
    public SensorManager N6;
    public float N7;
    public boolean N8;
    public float O;
    public final float[] O0;
    public final Drawable O1;
    public String O2;
    public float O3;
    public final Paint O4;
    public final Matrix O5;
    public final s0 O6;
    public float O7;
    public Bitmap O8;
    public float P;
    public final float[] P0;
    public final Drawable P1;
    public float P2;
    public float P3;
    public final RectF P4;
    public final Matrix P5;
    public float P6;
    public int P7;
    public Bitmap P8;
    public float Q;
    public final float[] Q0;
    public final Drawable Q1;
    public long Q2;
    public float Q3;
    public float Q4;
    public final LinearGradient Q5;
    public float Q6;
    public int Q7;
    public final Paint Q8;
    public boolean R;
    public final float[] R0;
    public final Drawable R1;
    public Bitmap R2;
    public final Path R3;
    public float R4;
    public final LongSparseArray R5;
    public float R6;
    public long R7;
    public final Paint R8;
    public boolean S;
    public final float[] S0;
    public final Drawable S1;
    public final Paint S2;
    public Bitmap S3;
    public boolean S4;
    public final Path S5;
    public float S6;
    public long S7;
    public final RectF S8;
    public boolean T;
    public final float[] T0;
    public final org.telegram.ui.o0 T1;
    public boolean T2;
    public Bitmap T3;
    public boolean T4;
    public boolean T5;
    public long T6;
    public long T7;
    public int T8;
    public boolean U;
    public final float[] U0;
    public final Paint U1;
    public int U2;
    public float U3;
    public float U4;
    public final RectF U5;
    public long U6;
    public final float U7;
    public String U8;
    public long V;
    public final float[] V0;
    public final String V1;
    public boolean V2;
    public float V3;
    public boolean V4;
    public final RectF V5;
    public boolean V6;
    public int V7;
    public boolean V8;
    public long W;
    public final float[] W0;
    public final c2 W1;
    public long W2;
    public float W3;
    public Bitmap W4;
    public final RectF W5;
    public final Matrix W6;
    public long W7;
    public int W8;
    public final float[] X0;
    public final bi0 X1;
    public float X2;
    public final Paint X3;
    public int[] X4;
    public final LinearGradient X5;
    public final Path X6;
    public long X7;
    public long X8;
    public final float[] Y0;
    public final Paint Y1;
    public Bitmap Y2;
    public final int[] Y3;
    public int Y4;
    public final LinearGradient Y5;
    public final RectF Y6;
    public float Y7;
    public bi0 Y8;
    public final float[] Z0;
    public boolean Z1;
    public Bitmap Z2;
    public final int[] Z3;
    public final Paint Z4;
    public final Matrix Z5;
    public final Path Z6;
    public final RectF Z7;
    public bi0 Z8;
    public boolean f45797a;
    public float f45798a0;
    public final byte[] f45799a1;
    public int a2;
    public BitmapShader f45800a3;
    public final float[] f45801a4;
    public final Rect f45802a5;
    public final Paint f45803a6;
    public final Path f45804a7;
    public final TextPaint f45805a8;
    public bi0 f45806a9;
    public final int f45807b;
    public float f45808b0;
    public final boolean[] f45809b1;
    public int f45810b2;
    public final Paint f45811b3;
    public final float[] f45812b4;
    public final RectF f45813b5;
    public float f45814b6;
    public int f45815b7;
    public final TextPaint f45816b8;
    public Object f45817b9;
    public final l2.f f45818c;
    public float f45819c0;
    public int f45820c1;
    public final HashMap f45821c2;
    public final Paint f45822c3;
    public final float[] f45823c4;
    public final int[] f45824c5;
    public long f45825c6;
    public final RectF f45826c7;
    public final TextPaint f45827c8;
    public float f45828c9;
    public String d;
    public float f45829d0;
    public boolean f45830d1;
    public Runnable f45831d2;
    public final Matrix f45832d3;
    public final float[] f45833d4;
    public final float[] f45834d5;
    public long f45835d6;
    public final Matrix f45836d7;
    public TextPaint f45837d8;
    public String f45838d9;
    public String e;
    public float f45839e0;
    public final Random f45840e1;
    public boolean f45841e2;
    public final RectF f45842e3;
    public int f45843e4;
    public final float[] f45844e5;
    public boolean f45845e6;
    public final SparseArray e7;
    public final TextPaint f45846e8;
    public long f45847e9;
    public String f45848f;
    public float f45849f0;
    public float f45850f1;
    public boolean f45851f2;
    public float f45852f3;
    public float[] f45853f4;
    public final float[] f45854f5;
    public boolean f45855f6;
    public final Drawable[] f7;
    public StaticLayout f45856f8;
    public float f45857f9;
    public float f45858g0;
    public float f45859g1;
    public Bitmap f45860g2;
    public boolean f45861g3;
    public float[] f45862g4;
    public final float[] f45863g5;
    public int f45864g6;
    public final RectF f45865g7;
    public int f45866g8;
    public boolean f45867g9;
    public boolean h;
    public float f45868h0;
    public int f45869h1;
    public final int[] f45870h2;
    public boolean f45871h3;
    public float[] f45872h4;
    public final float[] f45873h5;
    public int f45874h6;
    public final RectF f45875h7;
    public boolean f45876h8;
    public float f45877h9;
    public float f45878i0;
    public float f45879i1;
    public v5 f45880i2;
    public int f45881i3;
    public int f45882i4;
    public final boolean[] f45883i5;
    public int f45884i6;
    public final RectF f45885i7;
    public final String f45886i8;
    public float f45887i9;
    public float f45888j0;
    public float f45889j1;
    public final p0 f45890j2;
    public final float[] f45891j3;
    public int f45892j4;
    public int f45893j5;
    public float f45894j6;
    public final RectF f45895j7;
    public final String f45896j8;
    public float f45897j9;
    public VelocityTracker f45898k0;
    public float f45899k1;
    public final q0 f45900k2;
    public final float[] f45901k3;
    public PorterDuffColorFilter f45902k4;
    public float f45903k5;
    public float f45904k6;
    public final RectF f45905k7;
    public f5 f45906k8;
    public final OverScroller f45907k9;
    public float f45908l0;
    public float l1;
    public boolean f45909l2;
    public final int[] f45910l3;
    public int l4;
    public float f45911l5;
    public float f45912l6;
    public boolean f45913l7;
    public bi0 f45914l8;
    public final ViewConfiguration f45915l9;
    public float m0;
    public String f45916m1;
    public long f45917m2;
    public final int[] f45918m3;
    public float f45919m4;
    public StaticLayout f45920m5;
    public float f45921m6;
    public boolean f45922m7;
    public long f45923m8;
    public VelocityTracker f45924m9;
    public v0 f45925n;
    public float f45926n0;
    public int f45927n1;
    public long f45928n2;
    public final float[] f45929n3;
    public float f45930n4;
    public boolean f45931n5;
    public final float[] f45932n6;
    public float f45933n7;
    public boolean f45934n8;
    public boolean f45935n9;
    public float f45936o0;
    public String f45937o1;
    public long f45938o2;
    public final float[] f45939o3;
    public float f45940o4;
    public final float[] f45941o5;
    public final Paint f45942o6;
    public float f45943o7;
    public TLRPC.TL_inputStickerSetShortName f45944o8;
    public boolean f45945o9;
    public float f45946p0;
    public String f45947p1;
    public float f45948p2;
    public float f45949p3;
    public float f45950p4;
    public final float[] p5;
    public float f45951p6;
    public long f45952p7;
    public TLRPC.Document f45953p8;
    public final q0 p9;
    public int f45954q0;
    public final RectF f45955q1;
    public long f45956q2;
    public final double[] f45957q3;
    public float f45958q4;
    public final float[] f45959q5;
    public boolean q6;
    public boolean f45960q7;
    public long f45961q8;
    public final RippleDrawable[] f45962q9;
    public v0 f45963r;
    public long f45964r0;
    public boolean f45965r1;
    public final RectF f45966r2;
    public final double[] f45967r3;
    public float f45968r4;
    public final float[] f45969r5;
    public float f45970r6;
    public float f45971r7;
    public LinearGradient[] f45972r8;
    public int f45973r9;
    public float f45974s;
    public final g f45975s0;
    public float f45976s1;
    public boolean f45977s2;
    public final double[] f45978s3;
    public final long[] f45979s4;
    public final float[] f45980s5;
    public boolean f45981s6;
    public float f45982s7;
    public int[] f45983s8;
    public final Paint f45984s9;
    public f f45985t0;
    public float f45986t1;
    public float f45987t2;
    public int f45988t3;
    public final float[] f45989t4;
    public final float[] f45990t5;
    public Object f45991t6;
    public long f45992t7;
    public final k9 f45993t8;
    public final Path f45994t9;
    public f f45995u0;
    public long f45996u1;
    public String f45997u2;
    public int f45998u3;
    public final float[] f45999u4;
    public final float[] f46000u5;
    public float f46001u6;
    public final RectF f46002u7;
    public int f46003u8;
    public final float[] f46004u9;
    public boolean f46005v0;
    public final ArrayList f46006v1;
    public String f46007v2;
    public float f46008v3;
    public final float[] f46009v4;
    public final float[] f46010v5;
    public int f46011v6;
    public long f46012v7;
    public int f46013v8;
    public final float[] f46014v9;
    public long f46015w;
    public boolean f46016w0;
    public long f46017w1;
    public String f46018w2;
    public float f46019w3;
    public final float[] f46020w4;
    public final float[] f46021w5;
    public int f46022w6;
    public float f46023w7;
    public float f46024w8;
    public final long[] w9;
    public float f46025x;
    public boolean f46026x0;
    public boolean f46027x1;
    public String f46028x2;
    public float f46029x3;
    public final long[] f46030x4;
    public final float[] f46031x5;
    public final SparseIntArray f46032x6;
    public float f46033x7;
    public float f46034x8;
    public final long[] f46035x9;
    public float f46036y;
    public boolean f46037y0;
    public final HashMap f46038y1;
    public final TextPaint f46039y2;
    public boolean y3;
    public final boolean[] f46040y4;
    public final float[] f46041y5;
    public int f46042y6;
    public float f46043y7;
    public final RectF[] f46044y8;
    public final float[] f46045y9;
    public long f46046z0;
    public final Paint f46047z1;
    public String f46048z2;
    public Bitmap f46049z3;
    public final Paint f46050z4;
    public final float[] f46051z5;
    public boolean f46052z6;
    public final RectF f46053z7;
    public long f46054z8;
    public final float[] f46055z9;
    public static final String[] B9 = {"❤️", "🔥", "🎉", "😎", "🚀", "💎", "💙", "✨", "⭐", "🍀", "🐸", "🦄", "🌈", "🍕", "👻", "🍒", "🌸", "⚡", "🏆", "🎁", "👀", "😍", "🥳", "🤩", "🐱", "🐶", "🦋", "🌙", "☀️", "🍓", "🍩", "🎈", "🎮", "🎧", "💜", "🌊"};
    public static final float C9 = (float) Math.atan2(-5.5d, -3.5d);
    public static int G9 = a.b("Black");
    public static int H9 = a.b("Neon Blue");
    public static final int I9 = org.telegram.messenger.i0.L(70.0f);
    public static final float L9 = (float) Math.sin(Math.toRadians(18.0d));
    public static final float M9 = (float) Math.cos(Math.toRadians(18.0d));
    public static final gr R9 = new gr(0.16d, 1.0d, 0.3d, 1.0d);

    public x0(Context context, int i10, String str, String str2, boolean z10, l2.f fVar) {
        super(context);
        f fVar2;
        this.f45797a = true;
        this.f45974s = 1.0f;
        this.D = AnimationUtils.currentAnimationTimeMillis();
        this.E = new Matrix();
        this.F = new u0();
        this.I = new ArrayList();
        this.J = new HashMap();
        Paint paint = new Paint(3);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        paint.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.M = -1.0f;
        this.f45975s0 = new g();
        this.f46016w0 = true;
        this.f46026x0 = true;
        this.D0 = 0.0f;
        this.G0 = 1.0f;
        this.H0 = new TextPaint(1);
        this.I0 = "";
        this.J0 = "";
        this.M0 = new float[320];
        this.N0 = new float[320];
        this.O0 = new float[320];
        this.P0 = new float[320];
        this.Q0 = new float[320];
        this.R0 = new float[320];
        this.S0 = new float[320];
        this.T0 = new float[320];
        this.U0 = new float[320];
        this.V0 = new float[320];
        this.W0 = new float[320];
        this.X0 = new float[320];
        this.Y0 = new float[320];
        this.Z0 = new float[320];
        this.f45799a1 = new byte[320];
        this.f45809b1 = new boolean[320];
        this.f45840e1 = new Random();
        this.f45869h1 = 0;
        this.f45955q1 = new RectF();
        this.f46006v1 = new ArrayList();
        this.f46038y1 = new HashMap();
        this.f46047z1 = new Paint(1);
        this.A1 = new Paint(1);
        this.B1 = new Paint(1);
        this.C1 = new TextPaint(1);
        this.D1 = new TextPaint(1);
        this.E1 = new Path();
        new Path();
        this.F1 = new RectF();
        this.I1 = -1;
        this.U1 = new Paint(1);
        this.V1 = cd.L0(2131746485, null);
        this.Y1 = new Paint(1);
        this.a2 = 1;
        this.f45821c2 = new HashMap();
        this.f45870h2 = new int[3];
        this.f45890j2 = new us() {
            @Override
            public final void didReceivedNotification(int i11, int i12, Object[] objArr) {
                if (objArr.length > 1) {
                    Object obj = objArr[1];
                    x0 x0Var = x0.this;
                    if (obj == x0Var.f45880i2) {
                        x0Var.y0();
                    }
                }
            }
        };
        this.f45900k2 = new Runnable(this) {
            public final x0 f45718b;

            {
                this.f45718b = this;
            }

            @Override
            public final void run() {
                TLRPC.Document document;
                int lastIndexOf;
                int L;
                switch (r2) {
                    case 0:
                        x0 x0Var = this.f45718b;
                        ArrayList arrayList = x0Var.f46006v1;
                        for (int i11 = 0; i11 < Math.min(arrayList.size(), 9); i11++) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i11);
                            ArrayList<TL_stars.StarGiftAttribute> arrayList2 = tL_starGiftUnique.attributes;
                            int size = arrayList2.size();
                            int i12 = 0;
                            while (i12 < size) {
                                TL_stars.StarGiftAttribute starGiftAttribute = arrayList2.get(i12);
                                i12++;
                                TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                                if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) && (document = ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document) != null) {
                                    x0Var.g0(tL_starGiftUnique.f20021id, document);
                                }
                            }
                            x0Var.m1(tL_starGiftUnique);
                        }
                        return;
                    default:
                        x0 x0Var2 = this.f45718b;
                        ArrayList arrayList3 = x0Var2.I;
                        if (x0Var2.f45850f1 >= 0.5f && x0Var2.f45869h1 == 1 && !x0Var2.f45945o9) {
                            float f7 = x0Var2.f45877h9;
                            float f10 = x0Var2.f45887i9;
                            float width = (x0Var2.getWidth() - org.telegram.messenger.i0.L(28.0f)) / 6.0f;
                            RectF rectF = x0Var2.f46002u7;
                            float L2 = (x0Var2.f45889j1 + f10) - (rectF.top + org.telegram.messenger.i0.L(16.0f));
                            int i13 = -1;
                            if (L2 >= 0.0f && f7 >= org.telegram.messenger.i0.L(14.0f) && f10 >= rectF.top + org.telegram.messenger.i0.L(8.0f) && (L = (((int) (L2 / width)) * 6) + ((int) ((f7 - org.telegram.messenger.i0.L(14.0f)) / width))) >= 0 && L < 36) {
                                i13 = L;
                            }
                            if (i13 >= 0) {
                                String[] strArr = x0.B9;
                                if (arrayList3.contains(strArr[i13]) && (lastIndexOf = arrayList3.lastIndexOf(strArr[i13])) >= 0) {
                                    arrayList3.remove(lastIndexOf);
                                    x0Var2.c();
                                    x0Var2.i0();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f45948p2 = 1.0f;
        this.f45966r2 = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.f46039y2 = textPaint;
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        this.A2 = -1;
        this.E2 = -1.0f;
        this.L2 = -1.0f;
        this.N2 = -1L;
        this.O2 = "";
        this.P2 = -1.0f;
        this.S2 = new Paint(3);
        this.X2 = 1.0f;
        this.f45811b3 = new Paint(2);
        this.f45822c3 = new Paint(3);
        this.f45832d3 = new Matrix();
        this.f45842e3 = new RectF();
        this.f45891j3 = new float[14];
        this.f45901k3 = new float[14];
        this.f45910l3 = new int[7];
        this.f45918m3 = new int[7];
        this.f45929n3 = new float[15];
        this.f45939o3 = new float[15];
        this.f45949p3 = -1.0f;
        this.f45957q3 = new double[3];
        this.f45967r3 = new double[3];
        this.f45978s3 = new double[3];
        this.f45988t3 = org.telegram.messenger.i0.f16020m;
        this.f45998u3 = org.telegram.messenger.i0.f16021n;
        this.B3 = new Paint(2);
        this.C3 = new RectF();
        this.G3 = 5.0f;
        this.H3 = -0.7071f;
        this.I3 = 0.7071f;
        this.L3 = new t0();
        this.N3 = 1.0f;
        this.P3 = -1.0f;
        this.R3 = new Path();
        this.U3 = -1.0f;
        this.V3 = -1.0f;
        this.W3 = -1.0f;
        Paint paint2 = new Paint(2);
        this.X3 = paint2;
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode2));
        this.Y3 = new int[1024];
        this.Z3 = new int[1024];
        this.f45801a4 = new float[1024];
        this.f45812b4 = new float[1024];
        this.f45823c4 = new float[1024];
        this.f45833d4 = new float[1024];
        this.f45892j4 = -1;
        this.l4 = -1;
        this.f45979s4 = new long[2048];
        this.f45989t4 = new float[2048];
        this.f45999u4 = new float[2048];
        this.f46009v4 = new float[2048];
        this.f46020w4 = new float[2048];
        this.f46030x4 = new long[2048];
        this.f46040y4 = new boolean[2048];
        Paint paint3 = new Paint(2);
        this.f46050z4 = paint3;
        paint3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.A4 = (float) Math.random();
        this.B4 = new Paint(2);
        this.C4 = new Paint(2);
        this.D4 = new RectF();
        this.E4 = new float[96];
        this.F4 = new float[96];
        this.G4 = new float[96];
        this.H4 = new float[96];
        this.I4 = new float[96];
        this.J4 = new long[96];
        this.N4 = new Paint(2);
        Paint paint4 = new Paint(2);
        this.O4 = paint4;
        paint4.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.P4 = new RectF();
        this.Q4 = 1.0f;
        this.R4 = 1.0f;
        this.T4 = true;
        this.U4 = 1.0f;
        this.Z4 = new Paint(2);
        this.f45802a5 = new Rect();
        this.f45813b5 = new RectF();
        this.f45824c5 = new int[4];
        this.f45834d5 = new float[4];
        this.f45844e5 = new float[4];
        this.f45854f5 = new float[240];
        this.f45863g5 = new float[240];
        this.f45873h5 = new float[240];
        this.f45883i5 = new boolean[240];
        this.f45941o5 = new float[240];
        this.p5 = new float[240];
        this.f45959q5 = new float[240];
        this.f45969r5 = new float[240];
        this.f45980s5 = new float[240];
        this.f45990t5 = new float[240];
        this.f46000u5 = new float[240];
        this.f46010v5 = new float[240];
        this.f46021w5 = new float[240];
        this.f46031x5 = new float[240];
        this.f46041y5 = new float[240];
        this.f46051z5 = new float[240];
        this.A5 = new boolean[240];
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -16777216, 0, tileMode);
        this.C5 = linearGradient;
        Paint paint5 = new Paint(1);
        this.D5 = paint5;
        paint5.setShader(linearGradient);
        paint5.setXfermode(new PorterDuffXfermode(mode2));
        this.E5 = new Path();
        this.F5 = new TextPaint(65);
        this.J5 = new RectF();
        this.K5 = new RectF();
        this.L5 = new Path();
        this.M5 = new float[7];
        this.O5 = new Matrix();
        this.P5 = new Matrix();
        this.Q5 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{16777215, -1, 16777215}, new float[]{0.0f, 0.88f, 1.0f}, tileMode);
        this.R5 = new LongSparseArray();
        this.S5 = new Path();
        this.U5 = new RectF();
        this.V5 = new RectF();
        this.W5 = new RectF();
        this.X5 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, 16777215, -1, tileMode);
        this.Y5 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -1, 16777215, tileMode);
        this.Z5 = new Matrix();
        this.f45803a6 = new Paint();
        this.f45912l6 = 0.85f;
        this.f45932n6 = new float[320];
        Paint paint6 = new Paint();
        this.f45942o6 = paint6;
        PorterDuff.Mode mode3 = PorterDuff.Mode.DST_IN;
        paint6.setXfermode(new PorterDuffXfermode(mode3));
        this.f45951p6 = 1.0f;
        this.q6 = true;
        this.f46001u6 = -1.0f;
        this.f46011v6 = -1;
        this.f46032x6 = new SparseIntArray();
        this.f46042y6 = -1;
        this.B6 = -1;
        this.C6 = new SweepGradient[4];
        this.O6 = new s0(this);
        this.W6 = new Matrix();
        this.X6 = new Path();
        this.Y6 = new RectF();
        this.Z6 = new Path();
        this.f45804a7 = new Path();
        this.f45815b7 = -1;
        this.f45826c7 = new RectF();
        this.f45836d7 = new Matrix();
        this.e7 = new SparseArray();
        this.f45865g7 = new RectF();
        this.f45875h7 = new RectF();
        this.f45885i7 = new RectF();
        this.f45895j7 = new RectF();
        this.f45905k7 = new RectF();
        this.f45933n7 = 1.0f;
        this.f45943o7 = 1.0f;
        this.f45971r7 = 1.0f;
        this.f45982s7 = 1.0f;
        this.f46002u7 = new RectF();
        this.f46053z7 = new RectF();
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{0, 805306368, -1627389952, -285212672, -16777216}, new float[]{0.0f, 0.25f, 0.5f, 0.75f, 1.0f}, tileMode);
        this.A7 = linearGradient2;
        Paint paint7 = new Paint();
        this.B7 = paint7;
        paint7.setXfermode(new PorterDuffXfermode(mode3));
        paint7.setShader(linearGradient2);
        this.C7 = new Matrix();
        this.D7 = new RectF[]{new RectF(), new RectF(), new RectF(), new RectF(), new RectF(), new RectF()};
        this.E7 = -1.0f;
        this.F7 = -1.0f;
        this.I7 = new RectF();
        this.J7 = new HashMap();
        this.K7 = new HashMap();
        this.L7 = -1;
        this.M7 = G9;
        this.P7 = -1;
        this.Q7 = -1;
        this.U7 = org.telegram.messenger.i0.L(20.17f);
        this.V7 = -1;
        this.X7 = -1L;
        this.Y7 = 1.0f;
        this.Z7 = new RectF();
        this.f45805a8 = new TextPaint(1);
        this.f45816b8 = new TextPaint(1);
        this.f45827c8 = new TextPaint(1);
        TextPaint textPaint2 = new TextPaint(129);
        this.f45846e8 = textPaint2;
        textPaint2.setXfermode(new PorterDuffXfermode(mode2));
        this.f45886i8 = cd.L0(2131746507, null);
        this.f45896j8 = cd.L0(2131746517, null);
        int[] iArr = a.f45560b;
        this.f45972r8 = new LinearGradient[iArr.length];
        this.f45983s8 = new int[iArr.length];
        this.f45993t8 = new k9(3);
        this.f46003u8 = -100;
        this.f46013v8 = -100;
        this.f46044y8 = new RectF[]{new RectF(), new RectF(), new RectF()};
        this.I8 = new Path();
        this.J8 = new RectF();
        this.K8 = new RectF();
        this.L8 = new RectF();
        this.Q8 = new Paint(3);
        this.R8 = new Paint(1);
        this.S8 = new RectF();
        this.f45828c9 = -1.0f;
        this.f45907k9 = new OverScroller(getContext());
        this.f45915l9 = ViewConfiguration.get(getContext());
        this.p9 = new Runnable(this) {
            public final x0 f45718b;

            {
                this.f45718b = this;
            }

            @Override
            public final void run() {
                TLRPC.Document document;
                int lastIndexOf;
                int L;
                switch (r2) {
                    case 0:
                        x0 x0Var = this.f45718b;
                        ArrayList arrayList = x0Var.f46006v1;
                        for (int i11 = 0; i11 < Math.min(arrayList.size(), 9); i11++) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i11);
                            ArrayList<TL_stars.StarGiftAttribute> arrayList2 = tL_starGiftUnique.attributes;
                            int size = arrayList2.size();
                            int i12 = 0;
                            while (i12 < size) {
                                TL_stars.StarGiftAttribute starGiftAttribute = arrayList2.get(i12);
                                i12++;
                                TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                                if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) && (document = ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document) != null) {
                                    x0Var.g0(tL_starGiftUnique.f20021id, document);
                                }
                            }
                            x0Var.m1(tL_starGiftUnique);
                        }
                        return;
                    default:
                        x0 x0Var2 = this.f45718b;
                        ArrayList arrayList3 = x0Var2.I;
                        if (x0Var2.f45850f1 >= 0.5f && x0Var2.f45869h1 == 1 && !x0Var2.f45945o9) {
                            float f7 = x0Var2.f45877h9;
                            float f10 = x0Var2.f45887i9;
                            float width = (x0Var2.getWidth() - org.telegram.messenger.i0.L(28.0f)) / 6.0f;
                            RectF rectF = x0Var2.f46002u7;
                            float L2 = (x0Var2.f45889j1 + f10) - (rectF.top + org.telegram.messenger.i0.L(16.0f));
                            int i13 = -1;
                            if (L2 >= 0.0f && f7 >= org.telegram.messenger.i0.L(14.0f) && f10 >= rectF.top + org.telegram.messenger.i0.L(8.0f) && (L = (((int) (L2 / width)) * 6) + ((int) ((f7 - org.telegram.messenger.i0.L(14.0f)) / width))) >= 0 && L < 36) {
                                i13 = L;
                            }
                            if (i13 >= 0) {
                                String[] strArr = x0.B9;
                                if (arrayList3.contains(strArr[i13]) && (lastIndexOf = arrayList3.lastIndexOf(strArr[i13])) >= 0) {
                                    arrayList3.remove(lastIndexOf);
                                    x0Var2.c();
                                    x0Var2.i0();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f45962q9 = new RippleDrawable[12];
        ColorStateList.valueOf(738197503);
        ColorStateList.valueOf(335544320);
        this.f45973r9 = -1;
        this.f45984s9 = new Paint(1);
        this.f45994t9 = new Path();
        this.f46004u9 = new float[12];
        this.f46014v9 = new float[12];
        this.w9 = new long[12];
        this.f46035x9 = new long[12];
        this.f46045y9 = new float[12];
        this.f46055z9 = new float[12];
        this.A9 = new Rect[12];
        for (int i11 = 0; i11 < 12; i11++) {
            this.A9[i11] = new Rect();
        }
        this.f45807b = i10;
        this.d = str;
        this.f45848f = str2;
        this.h = z10;
        this.f45818c = fVar;
        this.L1 = w(2131232362);
        this.M1 = w(2131232113);
        this.N1 = w(2131232318);
        this.U1.setTypeface(org.telegram.messenger.i0.o());
        Drawable w9 = w(2131232096);
        this.O1 = w9;
        Drawable w10 = w(2131231513);
        this.P1 = w10;
        Drawable w11 = w(2131231826);
        this.Q1 = w11;
        this.W1 = new c2(true);
        this.R1 = w(2131232341);
        this.S1 = w(2131232326);
        this.T1 = new org.telegram.ui.o0();
        this.J1 = w(2131232102);
        this.K1 = w(2131231856);
        this.f7 = new Drawable[]{w9, w10, w11};
        bi0 bi0Var = new bi0(2131624134, org.telegram.messenger.i0.L(60.0f), org.telegram.messenger.i0.L(60.0f), false, null);
        this.X1 = bi0Var;
        bi0Var.R(this);
        bi0Var.K(1);
        bi0Var.setCallback(this);
        bi0Var.start();
        Paint paint8 = this.Y1;
        Paint.Style style = Paint.Style.STROKE;
        paint8.setStyle(style);
        this.Y1.setStrokeCap(Paint.Cap.ROUND);
        this.Y1.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.C1.setTextSize(org.telegram.messenger.i0.L(11.0f));
        this.D1.setTypeface(org.telegram.messenger.i0.o());
        this.A1.setStyle(style);
        e6 e6Var = new e6(false, true, true);
        this.L0 = e6Var;
        e6Var.w(org.telegram.messenger.i0.L(11.0f));
        e6Var.n(0.35f, 280L, gr.h);
        e6Var.setCallback(this);
        e6Var.f25695b = 3;
        v0 t10 = t(G9);
        this.f45925n = t10;
        this.f45815b7 = W0(t10.f45788c);
        if (str != null) {
            String str3 = this.d;
            if (str3.equals(J9) && (fVar2 = K9) != null) {
                this.f45985t0 = fVar2;
            } else {
                f c10 = g.c(str3, org.telegram.messenger.i0.L(240.0f), ac.d.M, 0.75f, null);
                this.f45985t0 = c10;
                K9 = c10;
                J9 = str3;
            }
            this.f45975s0.a(this.f45985t0);
        }
        u1(false);
    }

    public static void C0(double d, double d10, double d11, double[] dArr) {
        double d12 = (0.2158037573d * d11) + (0.3963377774d * d10) + d;
        double d13 = (d - (0.1055613458d * d10)) - (0.0638541728d * d11);
        double d14 = (d - (d10 * 0.0894841775d)) - (d11 * 1.291485548d);
        double d15 = d12 * d12 * d12;
        double d16 = d13 * d13 * d13;
        double d17 = d14 * d14 * d14;
        dArr[0] = (0.2309699292d * d17) + ((4.0767416621d * d15) - (3.3077115913d * d16));
        dArr[1] = ((2.6097574011d * d16) + ((-1.2684380046d) * d15)) - (0.3413193965d * d17);
        dArr[2] = (d17 * 1.707614701d) + ((d15 * (-0.0041960863d)) - (d16 * 0.7034186147d));
    }

    public static int D0(float f7, float f10, float f11, int i10) {
        float f12;
        float i12 = i1(Color.red(i10));
        float i13 = i1(Color.green(i10));
        float i14 = i1(Color.blue(i10));
        float cbrt = (float) Math.cbrt((0.051445995f * i14) + (0.53633255f * i13) + (0.41222146f * i12));
        float cbrt2 = (float) Math.cbrt((0.10739696f * i14) + (0.6806995f * i13) + (0.2119035f * i12));
        float f13 = i14 * 0.6299787f;
        float cbrt3 = (float) Math.cbrt(f13 + (i13 * 0.28171885f) + (i12 * 0.08830246f));
        float f14 = (0.4505937f * cbrt3) + ((1.9779985f * cbrt) - (2.4285922f * cbrt2));
        float f15 = ((cbrt2 * 0.78277177f) + (cbrt * 0.025904037f)) - (cbrt3 * 0.80867577f);
        float hypot = (float) Math.hypot(f14, f15);
        if (hypot > 1.0E-5f) {
            f12 = Math.min(f11, f10 * hypot) / hypot;
        } else {
            f12 = 0.0f;
        }
        float f16 = f14 * f12;
        float f17 = f15 * f12;
        float f18 = (0.21580376f * f17) + (0.39633778f * f16) + f7;
        float f19 = (f7 - (0.105561346f * f16)) - (0.06385417f * f17);
        float f20 = (f7 - (f16 * 0.08948418f)) - (f17 * 1.2914855f);
        float f21 = f18 * f18 * f18;
        float f22 = f19 * f19 * f19;
        float f23 = f20 * f20 * f20;
        return Color.rgb(w0((0.23096994f * f23) + ((4.0767417f * f21) - (3.3077116f * f22))), w0(((2.6097574f * f22) + ((-1.268438f) * f21)) - (0.34131938f * f23)), w0((f23 * 1.7076147f) + ((f21 * (-0.0041960864f)) - (f22 * 0.7034186f))));
    }

    public static float S(float f7, float f10) {
        float f11 = f7 - 1.0f;
        return c3.i0.u(f10, f11, f11, ((f10 + 1.0f) * f11 * f11 * f11) + 1.0f);
    }

    public static int W0(int i10) {
        double[] dArr = new double[3];
        double[] dArr2 = new double[3];
        o1(i10, dArr);
        double hypot = Math.hypot(dArr[1], dArr[2]);
        if (hypot < 0.03d) {
            return -1;
        }
        b0(0.96d, Math.min(0.06d, hypot * 0.7d), Math.atan2(dArr[2], dArr[1]), dArr2);
        return Color.rgb((int) Math.round(r(d0(r(dArr2[0]))) * 255.0d), (int) Math.round(r(d0(r(dArr2[1]))) * 255.0d), (int) Math.round(r(d0(r(dArr2[2]))) * 255.0d));
    }

    public static int Z0(int i10) {
        double[] dArr = new double[3];
        i0.b.j(i10, dArr);
        return i0.b.o(i0.b.b(Math.min(96.0d, dArr[0] + 24.0d), dArr[1] * 0.75d, dArr[2] * 0.75d), 26);
    }

    public static int a(float f7, int i10) {
        return i0.b.o(i10, (int) (Utilities.l(f7) * Color.alpha(i10)));
    }

    public static void b0(double d, double d10, double d11, double[] dArr) {
        double cos = Math.cos(d11);
        double sin = Math.sin(d11);
        C0(d, d10 * cos, d10 * sin, dArr);
        if (p0(dArr)) {
            return;
        }
        double d12 = 0.0d;
        double d13 = d10;
        for (int i10 = 0; i10 < 14; i10++) {
            double d14 = (d12 + d13) / 2.0d;
            C0(d, d14 * cos, d14 * sin, dArr);
            if (p0(dArr)) {
                d12 = d14;
            } else {
                d13 = d14;
            }
        }
        C0(d, d12 * cos, d12 * sin, dArr);
    }

    public static float c0(double d) {
        return (float) (d - Math.floor(d));
    }

    public static double d0(double d) {
        if (d <= 0.0031308d) {
            return d * 12.92d;
        }
        return (Math.pow(d, 0.4166666666666667d) * 1.055d) - 0.055d;
    }

    public static int e1(int i10) {
        if (a.h != null) {
            return i10;
        }
        if (a.f45563g == null) {
            int length = a.f45559a.length;
            int[] iArr = new int[length];
            boolean[] zArr = new boolean[length];
            int i11 = 0;
            for (int i12 = 0; i12 < 80; i12++) {
                int b10 = a.b(a.f45562f[i12]);
                if (b10 >= 0 && !zArr[b10]) {
                    zArr[b10] = true;
                    iArr[i11] = b10;
                    i11++;
                }
            }
            for (int i13 = 0; i13 < length; i13++) {
                if (!zArr[i13]) {
                    iArr[i11] = i13;
                    i11++;
                }
            }
            a.f45563g = iArr;
        }
        return a.f45563g[i10];
    }

    public static float f1(boolean z10, boolean z11, float f7) {
        if (z10) {
            if (f7 > 0.0f) {
                return f1.v(f7, 0.18f, 1.0f, 0.0f);
            }
        } else {
            if (!z11) {
                f7 -= 0.135f;
            }
            if (f7 <= 0.0f) {
                return 0.0f;
            }
            if (f7 < 0.315f) {
                return h(f7 / 0.315f);
            }
        }
        return 1.0f;
    }

    public static int g(float f7, int i10) {
        return (((int) (Math.max(0.0f, Math.min(1.0f, f7)) * 255.0f)) << 24) | (i10 & 16777215);
    }

    public static float g1(float f7, float f10, float f11) {
        float l4 = Utilities.l((f11 - f7) / (f10 - f7));
        return c3.i0.D(l4, 2.0f, 3.0f, l4 * l4);
    }

    public static float h(float f7) {
        float f10 = f7 - 1.0f;
        return c3.i0.u(f10, 1.70158f, f10, (2.70158f * f10 * f10 * f10) + 1.0f);
    }

    public static double h1(double d, double d10, double d11) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        double d12 = 6.283185307179586d / d11;
        double d13 = 1.0d - (d10 * d10);
        double sqrt = Math.sqrt(d13) * d12;
        double d14 = sqrt * d;
        return 1.0d - (((Math.sin(d14) * (d10 / Math.sqrt(d13))) + Math.cos(d14)) * Math.exp(((-d10) * d12) * d));
    }

    public static boolean i() {
        if (u.f() && sc.e(256)) {
            return true;
        }
        return false;
    }

    public static float i1(int i10) {
        float f7 = i10 / 255.0f;
        if (f7 <= 0.04045f) {
            return f7 / 12.92f;
        }
        return (float) Math.pow((f7 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float j(long j10, float f7, float f10) {
        if (j10 == 0) {
            return 1.0f;
        }
        float currentAnimationTimeMillis = ((float) (AnimationUtils.currentAnimationTimeMillis() - j10)) / 320.0f;
        if (currentAnimationTimeMillis <= 0.0f || currentAnimationTimeMillis >= 1.0f) {
            return 1.0f;
        }
        if (currentAnimationTimeMillis < 0.25f) {
            return (f7 * ((float) Math.sin((currentAnimationTimeMillis * 1.5707963267948966d) / 0.25d))) + 1.0f;
        }
        if (currentAnimationTimeMillis < 0.6f) {
            float f11 = (currentAnimationTimeMillis - 0.25f) / 0.35f;
            return org.telegram.messenger.i0.T1(f7 + 1.0f, 1.0f - f10, c3.i0.D(f11, 2.0f, 3.0f, f11 * f11));
        }
        float f12 = (currentAnimationTimeMillis - 0.6f) / 0.4f;
        return org.telegram.messenger.i0.T1(1.0f - f10, 1.0f, c3.i0.D(f12, 2.0f, 3.0f, f12 * f12));
    }

    public static void k() {
        if (D9 == null) {
            int length = a.f45560b.length;
            D9 = new int[length];
            E9 = new int[length];
            F9 = new int[length];
            for (int i10 = 0; i10 < length; i10++) {
                D9[i10] = x(a.f45560b[i10], false);
                E9[i10] = x(a.f45561c[i10], true);
                F9[i10] = v(D9[i10], E9[i10]);
            }
        }
    }

    public static float k0(int i10, int i11, int i12) {
        int i13 = i12 * 1442695041;
        int i14 = i13 + (i11 * 668265263) + (i10 * 374761393);
        int i15 = ((i14 >>> 13) ^ i14) * 1274126177;
        return ((i15 ^ (i15 >>> 16)) & 65535) / 65535.0f;
    }

    public static int l1(int i10, int i11) {
        int i12 = i10 | (-16777216);
        int i13 = i11 | (-16777216);
        if (i0.b.g(i12, i13) < 1.15d) {
            double[] dArr = new double[3];
            i0.b.j(i12, dArr);
            for (int i14 = 0; i14 < 40 && i0.b.g(i12, i13) < 1.15d; i14++) {
                double max = Math.max(0.0d, dArr[0] - 2.0d);
                dArr[0] = max;
                i12 = i0.b.b(max, dArr[1], dArr[2]);
            }
        }
        return i0.b.o(i12, 95);
    }

    public static boolean m0(RectF rectF, float f7, float f10) {
        float L = org.telegram.messenger.i0.L(8.0f);
        if (!rectF.isEmpty() && f7 >= rectF.left - L && f7 <= rectF.right + L && f10 >= rectF.top - L && f10 <= rectF.bottom + L) {
            return true;
        }
        return false;
    }

    public static void o1(int i10, double[] dArr) {
        double v02 = v0(Color.red(i10) / 255.0d);
        double v03 = v0(Color.green(i10) / 255.0d);
        double v04 = v0(Color.blue(i10) / 255.0d);
        double cbrt = Math.cbrt((0.0514459929d * v04) + (0.5363325363d * v03) + (0.4122214708d * v02));
        double cbrt2 = Math.cbrt((0.1073969566d * v04) + (0.6806995451d * v03) + (0.2119034982d * v02));
        double d = v04 * 0.6299787005d;
        double cbrt3 = Math.cbrt(d + (v03 * 0.2817188376d) + (v02 * 0.0883024619d));
        dArr[0] = ((0.793617785d * cbrt2) + (0.2104542553d * cbrt)) - (0.0040720468d * cbrt3);
        dArr[1] = (0.4505937099d * cbrt3) + ((1.9779984951d * cbrt) - (2.428592205d * cbrt2));
        dArr[2] = ((cbrt2 * 0.7827717662d) + (cbrt * 0.0259040371d)) - (cbrt3 * 0.808675766d);
    }

    public static boolean p0(double[] dArr) {
        double d = dArr[0];
        if (d >= -1.0E-4d && d <= 1.0001d) {
            double d10 = dArr[1];
            if (d10 >= -1.0E-4d && d10 <= 1.0001d) {
                double d11 = dArr[2];
                if (d11 >= -1.0E-4d && d11 <= 1.0001d) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Bitmap q0(Bitmap bitmap, Bitmap bitmap2, int i10) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i11 = width * height;
        int[] iArr = new int[i11];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i12 = 16777215 & i10;
        int i13 = i10 >>> 24;
        for (int i14 = 0; i14 < i11; i14++) {
            iArr[i14] = ((((iArr[i14] >>> 24) * i13) / 255) << 24) | i12;
        }
        if (bitmap2 == null || !bitmap2.isMutable() || bitmap2.getWidth() != width || bitmap2.getHeight() != height) {
            bitmap2 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap3 = bitmap2;
        bitmap3.setPixels(iArr, 0, width, 0, 0, width, height);
        bitmap3.setHasMipMap(bitmap.hasMipMap());
        return bitmap3;
    }

    public static double r(double d) {
        if (d < 0.0d) {
            return 0.0d;
        }
        if (d > 1.0d) {
            return 1.0d;
        }
        return d;
    }

    public static Bitmap r0(u0 u0Var, Bitmap bitmap, boolean z10) {
        if (z10) {
            Bitmap bitmap2 = u0Var.f45771m;
            if (bitmap2 == null || u0Var.f45772n != bitmap || u0Var.f45774p != u0Var.f45768j) {
                u0Var.f45771m = q0(bitmap, bitmap2, u0Var.f45768j);
                u0Var.f45772n = bitmap;
                u0Var.f45774p = u0Var.f45768j;
            }
            return u0Var.f45771m;
        }
        Bitmap bitmap3 = u0Var.f45769k;
        if (bitmap3 == null || u0Var.f45770l != bitmap || u0Var.f45773o != u0Var.f45768j) {
            u0Var.f45769k = q0(bitmap, bitmap3, u0Var.f45768j);
            u0Var.f45770l = bitmap;
            u0Var.f45773o = u0Var.f45768j;
        }
        return u0Var.f45769k;
    }

    public static void s(int[] iArr, byte[] bArr, int i10) {
        int i11 = 16777215 & i10;
        int i12 = i10 >>> 24;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            iArr[i13] = ((((bArr[i13] & 255) * i12) / 255) << 24) | i11;
        }
    }

    private void setPattern(u0 u0Var) {
        boolean z10;
        if (this.f45851f2) {
            u0 u0Var2 = this.G;
            if (u0Var2 != null && u0Var2 != this.F) {
                P0(u0Var2);
            }
            u0 u0Var3 = this.F;
            if (u0Var3 != u0Var) {
                P0(u0Var3);
            }
            this.G = null;
            this.F = u0Var;
            if (u0Var.f45762a == 2) {
                Z(u0Var);
                if (u0Var.e == null) {
                    u0Var.f45765f = this.f45860g2;
                }
            }
            this.H = AnimationUtils.currentAnimationTimeMillis() - 10000;
            invalidate();
            return;
        }
        if (this.f45974s < 1.0f && this.f45963r != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0Var.h = z10;
        if (u0Var.f45762a == 2) {
            Z(u0Var);
            if (u0Var.e == null) {
                u0Var.f45765f = this.f45860g2;
            }
        }
        u0 u0Var4 = this.G;
        if (u0Var4 != null && u0Var4 != this.F) {
            P0(u0Var4);
        }
        this.G = this.F;
        this.F = u0Var;
        this.H = AnimationUtils.currentAnimationTimeMillis();
        invalidate();
    }

    private void setSceneFromCard(v0 v0Var) {
        Y0(v0Var, getWidth() / 2.0f, (l() / 2.0f) + m());
        if (this.f45851f2) {
            return;
        }
        this.f45948p2 = j(this.f45928n2, 0.03f, 0.005f);
        this.f45928n2 = AnimationUtils.currentAnimationTimeMillis();
    }

    public static v0 t(int i10) {
        ?? obj = new Object();
        obj.f45786a = 0;
        obj.f45789f = i10;
        if (i10 == H9) {
            obj.f45787b = -12602881;
            obj.f45788c = -15308082;
            obj.d = a.d[i10];
        } else {
            obj.f45787b = x(a.f45560b[i10], false);
            obj.f45788c = x(a.f45561c[i10], true);
            obj.d = a.d[i10];
        }
        if (i10 == H9) {
            obj.e = -16747023;
        } else {
            k();
            obj.e = F9[i10];
        }
        obj.h = Z0(obj.f45787b);
        obj.f45790g = g.k(0.5f, obj.f45787b, obj.f45788c);
        return obj;
    }

    public static float t1(float f7, float f10, float f11) {
        float N = (f7 - f11) / org.telegram.messenger.i0.N(1.7f);
        float N2 = f10 / org.telegram.messenger.i0.N(3.2f);
        float w12 = w1(N * 2.6f, N2 * 1.7f, 91) * 0.32f;
        return org.telegram.messenger.i0.N(3.6f) * ((w12 + (w1(N, N2, 17) * 0.68f)) - 0.5f);
    }

    public static int u(v0 v0Var) {
        int i10;
        double d;
        int i11;
        if (v0Var != null) {
            i10 = i0.b.f(0.5f, v0Var.f45787b, v0Var.f45788c);
        } else {
            i10 = -16777216;
        }
        if (v0Var != null) {
            d = i0.b.h(v0Var.f45787b);
        } else {
            d = 0.3d;
        }
        float[] fArr = y0.f46092b;
        float max = (fArr[10] / 100.0f) * ((float) Math.max(0.0d, Math.min(1.0d, (0.85d - d) / 0.45d)));
        float f7 = (fArr[11] / 100.0f) + 1.0f;
        float f10 = ((0.5f - (f7 * 0.5f)) + max) * 255.0f;
        int k10 = i0.b.k(g((fArr[3] + fArr[9]) / 100.0f, 16777215), Color.rgb(Math.max(0, Math.min(255, Math.round((Color.red(i10) * f7) + f10))), Math.max(0, Math.min(255, Math.round((Color.green(i10) * f7) + f10))), Math.max(0, Math.min(255, Math.round((f7 * Color.blue(i10)) + f10)))));
        if (v0Var != null) {
            i11 = v0Var.h;
        } else {
            i11 = 1073741824;
        }
        return i0.b.k(i11, k10);
    }

    public static double u0(int i10, int i11) {
        long j10 = (i11 * (-4417276706812531889L)) ^ (i10 * (-7046029254386353131L));
        long j11 = (j10 ^ (j10 >>> 31)) * (-4658895280553007687L);
        long j12 = (j11 ^ (j11 >>> 27)) * (-7723592293110705685L);
        return ((j12 ^ (j12 >>> 31)) >>> 11) / 9.007199254740992E15d;
    }

    public static int v(int i10, int i11) {
        double d;
        double d10;
        double atan2;
        double min;
        double[] dArr = new double[3];
        double[] dArr2 = new double[3];
        double[] dArr3 = new double[3];
        o1(i11, dArr);
        o1(i10, dArr2);
        double d11 = dArr[0];
        if (d11 < 0.45d) {
            d = d11 - 0.03d;
        } else {
            d = 2.0d;
        }
        double hypot = Math.hypot(dArr[1], dArr[2]);
        if (hypot < 0.03d) {
            double d12 = (dArr[1] * 0.6d) + (dArr2[1] * 0.4d);
            double d13 = (dArr[2] * 0.6d) + (dArr2[2] * 0.4d);
            atan2 = Math.atan2(d13, d12);
            d10 = 2.0d;
            min = Math.min(0.012d, Math.hypot(d12, d13));
        } else {
            d10 = 2.0d;
            atan2 = Math.atan2(dArr[2], dArr[1]);
            min = Math.min((hypot * 1.25d) + 0.02d, 0.2d);
        }
        double d14 = 0.9d;
        double d15 = 0.2d;
        int i12 = 0;
        while (i12 < 12) {
            double d16 = (d15 + d14) / d10;
            double d17 = atan2;
            double d18 = min;
            b0(d16, d18, d17, dArr3);
            if (1.05d / (((r(dArr3[2]) * 0.0722d) + ((r(dArr3[1]) * 0.7152d) + (r(dArr3[0]) * 0.2126d))) + 0.05d) > 4.4d) {
                d15 = d16;
            } else {
                d14 = d16;
            }
            i12++;
            min = d18;
            atan2 = d17;
        }
        double d19 = atan2;
        double d20 = min;
        double d21 = (d15 + d14) / d10;
        if (d21 > d) {
            d21 = Math.max(0.05d, d);
        }
        b0(d21, d20, d19, dArr3);
        return Color.rgb((int) Math.round(r(d0(r(dArr3[0]))) * 255.0d), (int) Math.round(r(d0(r(dArr3[1]))) * 255.0d), (int) Math.round(r(d0(r(dArr3[2]))) * 255.0d));
    }

    public static double v0(double d) {
        if (d <= 0.04045d) {
            return d / 12.92d;
        }
        return Math.pow((d + 0.055d) / 1.055d, 2.4d);
    }

    public static float v1(float f7) {
        int floor = (int) Math.floor(f7);
        float f10 = f7 - floor;
        float D = c3.i0.D(f10, 2.0f, 3.0f, f10 * f10);
        float c02 = c0(Math.sin(floor * 127.1d) * 43758.5453d);
        return ((c0(Math.sin((floor + 1) * 127.1d) * 43758.5453d) - c02) * D) + c02;
    }

    public static int w0(float f7) {
        float pow;
        float max = Math.max(0.0f, Math.min(1.0f, f7));
        if (max <= 0.0031308f) {
            pow = max * 12.92f;
        } else {
            pow = (((float) Math.pow(max, 0.4166666567325592d)) * 1.055f) - 0.055f;
        }
        return Math.round(Math.max(0.0f, Math.min(1.0f, pow)) * 255.0f);
    }

    public static float w1(float f7, float f10, int i10) {
        int floor = (int) Math.floor(f7);
        int floor2 = (int) Math.floor(f10);
        float f11 = f7 - floor;
        float f12 = f10 - floor2;
        float D = c3.i0.D(f11, 2.0f, 3.0f, f11 * f11);
        float D2 = c3.i0.D(f12, 2.0f, 3.0f, f12 * f12);
        float k02 = k0(floor, floor2, i10);
        int i11 = floor + 1;
        float k03 = k0(i11, floor2, i10);
        int i12 = floor2 + 1;
        float k04 = k0(floor, i12, i10);
        float k05 = k0(i11, i12, i10);
        float z10 = c3.i0.z(k03, k02, D, k02);
        return (((((k05 - k04) * D) + k04) - z10) * D2) + z10;
    }

    public static int x(int i10, boolean z10) {
        double[] dArr = new double[3];
        i0.b.j(i10, dArr);
        if (!z10) {
            return i10;
        }
        double max = Math.max(0.0d, dArr[0] - 3.0d);
        dArr[0] = max;
        double d = dArr[1] * 1.03d;
        dArr[1] = d;
        double d10 = dArr[2] * 1.03d;
        dArr[2] = d10;
        return i0.b.b(max, d, d10);
    }

    public static PorterDuffColorFilter x0(u0 u0Var) {
        float[] fArr = y0.f46092b;
        int i10 = ((int) (fArr[14] * 10.0f)) ^ u0Var.f45777s;
        if (u0Var.f45779u == null || u0Var.f45778t != i10) {
            u0Var.f45778t = i10;
            u0Var.f45779u = new PorterDuffColorFilter(i0.b.f(fArr[14] / 100.0f, u0Var.f45777s, -1), PorterDuff.Mode.SRC_IN);
        }
        return u0Var.f45779u;
    }

    public static float y1(float f7) {
        return 1.0f - ((float) Math.pow(1.0f - f7, 2.4000000953674316d));
    }

    public final void A(android.graphics.Canvas r47, int r48) {
        throw new UnsupportedOperationException("Method not decompiled: qh.x0.A(android.graphics.Canvas, int):void");
    }

    public final PorterDuffColorFilter A0(u0 u0Var) {
        float[] fArr = y0.f46092b;
        int i10 = ((int) (fArr[30] * 10.0f)) ^ (u0Var.f45777s * 31);
        if (this.f45902k4 == null || this.l4 != i10) {
            this.l4 = i10;
            this.f45902k4 = new PorterDuffColorFilter(i0.b.f(fArr[30] / 100.0f, u0Var.f45777s, -1), PorterDuff.Mode.SRC_IN);
        }
        return this.f45902k4;
    }

    public final void B(android.graphics.Canvas r79, int r80) {
        throw new UnsupportedOperationException("Method not decompiled: qh.x0.B(android.graphics.Canvas, int):void");
    }

    public final void B0() {
        l2.f fVar;
        m0 m0Var;
        if (!this.f45841e2 && (fVar = this.f45818c) != null && (m0Var = ((i0) fVar.f11587b).e) != null) {
            m0Var.j();
        }
    }

    public final void C(Canvas canvas, Path path, RectF rectF, float f7, float f10) {
        float f11;
        int i10;
        int i11;
        RectF rectF2;
        float f12;
        float f13;
        float[][] fArr;
        float f14;
        float f15;
        int i12;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        int i13;
        int i14;
        int i15;
        Path path2 = path;
        int i16 = 1;
        if (path2 == null) {
            if (this.f46052z6) {
                i15 = 1;
            } else if (this.A6) {
                i15 = 2;
            } else {
                i15 = 0;
            }
            if (t.a(canvas, rectF, f7, i15, f10)) {
                return;
            }
        }
        int i17 = this.B6;
        SweepGradient[] sweepGradientArr = this.C6;
        int i18 = 4;
        float[][] fArr2 = y0.f46091a;
        if (i17 != 1) {
            this.B6 = 1;
            int i19 = 0;
            while (i19 < i18) {
                float[] fArr3 = fArr2[i19];
                int i20 = i18;
                int[] iArr = new int[73];
                int i21 = i16;
                float[] fArr4 = new float[73];
                int i22 = 0;
                for (int i23 = 73; i22 < i23; i23 = 73) {
                    int i24 = i19;
                    double radians = Math.toRadians(i22 * 5);
                    float pow = (float) Math.pow(Math.abs(Math.cos(radians)), fArr3[6]);
                    if (((float) Math.sin(radians)) < 0.0f) {
                        f11 = fArr3[11];
                    } else {
                        f11 = fArr3[12];
                    }
                    float f22 = f11 / 100.0f;
                    iArr[i22] = g(Math.min(1.0f, (((fArr3[5] / 100.0f) - f22) * pow) + f22), 0);
                    fArr4[i22] = i22 / 72.0f;
                    i22++;
                    i19 = i24;
                }
                int i25 = i19;
                sweepGradientArr[i25] = new SweepGradient(0.0f, 0.0f, iArr, fArr4);
                i19 = i25 + 1;
                i18 = i20;
                i16 = i21;
            }
        }
        int i26 = i16;
        int i27 = i18;
        if (this.f46052z6) {
            i10 = i26;
        } else if (this.A6) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        float[] fArr5 = fArr2[i10];
        float f23 = this.D6;
        float[] fArr6 = y0.f46092b;
        float f24 = f23 * fArr6[0];
        float f25 = (this.E6 * fArr6[i26]) / 100.0f;
        float N = org.telegram.messenger.i0.N(fArr5[8]);
        if (N != 0.0f) {
            rectF2 = this.f45826c7;
            rectF2.set(rectF);
            rectF2.inset(N, N);
            if (path2 != null) {
                float width = rectF2.width() / Math.max(1.0f, rectF.width());
                float height = rectF2.height() / Math.max(1.0f, rectF.height());
                float centerX = rectF.centerX();
                float centerY = rectF.centerY();
                i11 = i10;
                Matrix matrix = this.W6;
                matrix.setScale(width, height, centerX, centerY);
                Path path3 = this.X6;
                path2.transform(matrix, path3);
                path2 = path3;
            } else {
                i11 = i10;
            }
            f12 = Math.max(0.0f, f7 - N);
        } else {
            i11 = i10;
            rectF2 = rectF;
            f12 = f7;
        }
        Matrix matrix2 = this.f45836d7;
        matrix2.setRotate(f24);
        matrix2.postScale(rectF2.width() / Math.max(1.0f, rectF2.height()), 1.0f);
        matrix2.postTranslate(rectF2.centerX(), rectF2.centerY());
        float N2 = org.telegram.messenger.i0.N(fArr5[i27]);
        if (N2 > 0.05f) {
            SweepGradient sweepGradient = sweepGradientArr[i11];
            sweepGradient.setLocalMatrix(matrix2);
            Paint paint = this.A1;
            paint.setShader(sweepGradient);
            paint.setColor(-1);
            paint.setAlpha((int) (f10 * 255.0f));
            if (path2 == null) {
                paint.setStrokeWidth(N2);
                RectF rectF3 = this.V5;
                rectF3.set(rectF2);
                float f26 = (-N2) / 2.0f;
                rectF3.inset(f26, f26);
                float f27 = (N2 / 2.0f) + f12;
                canvas.drawRoundRect(rectF3, f27, f27, paint);
            } else {
                canvas.save();
                u.b(canvas, path2);
                paint.setStrokeWidth(N2 * 2.0f);
                canvas.drawPath(path2, paint);
                canvas.restore();
            }
            paint.setShader(null);
            paint.setAlpha(255);
        }
        double radians2 = Math.toRadians(f24);
        float f28 = (float) (-Math.sin(radians2));
        float cos = (float) Math.cos(radians2);
        float N3 = org.telegram.messenger.i0.N(fArr5[0]);
        float N4 = org.telegram.messenger.i0.N(fArr5[2]);
        if (this.A6) {
            f13 = 0.0f;
        } else {
            f13 = this.f45814b6 * ((fArr6[21] * 1.25f) / 100.0f);
        }
        int i28 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
        if (i28 > 0 && this.y3) {
            fArr = fArr2;
            f14 = c1(rectF2.centerX(), rectF2.top, getWidth(), getHeight());
        } else {
            fArr = fArr2;
            f14 = 0.0f;
        }
        if (i28 > 0 && this.y3) {
            f15 = c1(rectF2.centerX(), rectF2.bottom, getWidth(), getHeight());
        } else {
            f15 = 0.0f;
        }
        float min = Math.min(1.0f, ((f14 * f13) + 1.0f) * (f25 + 1.0f) * (fArr5[i26] / 100.0f));
        float min2 = Math.min(1.0f, ((f13 * f15) + 1.0f) * (1.0f - f25) * (fArr5[3] / 100.0f));
        if (Build.VERSION.SDK_INT >= 29) {
            i12 = i26;
        } else {
            i12 = 0;
        }
        int i29 = 0;
        for (int i30 = 2; i29 < i30; i30 = 2) {
            if (i29 == 0) {
                f16 = N3;
            } else {
                f16 = -N4;
            }
            if (i29 == 0) {
                f17 = min;
            } else {
                f17 = min2;
            }
            if (f17 <= 0.004f || Math.abs(f16) < 0.1f) {
                f18 = f12;
                f19 = min;
                f20 = min2;
                f21 = f28;
                i13 = i12;
                i14 = i26;
            } else {
                canvas.save();
                Path path4 = this.Z6;
                f19 = min;
                Path path5 = this.f45804a7;
                if (path2 == null) {
                    f20 = min2;
                    f21 = f28;
                    float min3 = Math.min(f12, Math.min(rectF2.width(), rectF2.height()) / 2.0f);
                    path4.rewind();
                    Path.Direction direction = Path.Direction.CW;
                    path4.addRoundRect(rectF2, min3, min3, direction);
                    f18 = f12;
                    RectF rectF4 = this.Y6;
                    rectF4.set(rectF2);
                    i13 = i12;
                    rectF4.offset(f21 * f16, f16 * cos);
                    path5.rewind();
                    path5.addRoundRect(rectF4, min3, min3, direction);
                } else {
                    f18 = f12;
                    f20 = min2;
                    f21 = f28;
                    i13 = i12;
                    path4.set(path2);
                    path5.set(path2);
                    path5.offset(f21 * f16, f16 * cos);
                }
                u.b(canvas, path5);
                Paint paint2 = this.f46047z1;
                if (i13 == 0) {
                    float f29 = fArr[i11][10];
                    int i31 = this.f45815b7;
                    paint2.setColor(Color.rgb(Math.max(0, Math.min(255, Math.round(((Color.red(i31) - 255) * f29) + 255.0f))), Math.max(0, Math.min(255, Math.round(((Color.green(i31) - 255) * f29) + 255.0f))), Math.max(0, Math.min(255, Math.round(((Color.blue(i31) - 255) * f29) + 255.0f)))));
                    paint2.setAlpha((int) (f17 * 255.0f * f10));
                    i14 = i26;
                } else {
                    int round = Math.round(Math.max(0.0f, Math.min(1.0f, f17)) * 255.0f);
                    paint2.setColor(round | (round << 16) | (-16777216) | (round << 8));
                    paint2.setAlpha((int) (f10 * 255.0f));
                    i14 = i26;
                    u.i(i14, paint2);
                }
                canvas.drawPath(path4, paint2);
                if (i13 != 0) {
                    u.i(0, paint2);
                }
                canvas.restore();
            }
            i29++;
            i26 = i14;
            min = f19;
            min2 = f20;
            f28 = f21;
            f12 = f18;
            i12 = i13;
        }
    }

    public final void D(android.graphics.Canvas r18, qh.u0 r19, int r20, float r21, float r22, float r23, float r24, float r25) {
        throw new UnsupportedOperationException("Method not decompiled: qh.x0.D(android.graphics.Canvas, qh.u0, int, float, float, float, float, float):void");
    }

    public final void E(Canvas canvas, int i10, int i11, u0 u0Var, u0 u0Var2, float f7, boolean z10, boolean z11) {
        float f10;
        float f11;
        boolean z12;
        float f12;
        int i12;
        float f13;
        boolean z13;
        float f14;
        float f15;
        int i13;
        int i14;
        x0 x0Var = this;
        u0 u0Var3 = u0Var;
        u0 u0Var4 = u0Var2;
        x0Var.X(u0Var3);
        x0Var.X(u0Var4);
        float L = org.telegram.messenger.i0.L(86.0f);
        float L2 = org.telegram.messenger.i0.L(70.0f);
        float L3 = org.telegram.messenger.i0.L(90.0f) * 1.3f;
        float f16 = x0Var.K + x0Var.N;
        float f17 = x0Var.L + x0Var.O;
        float f18 = -L3;
        boolean z14 = true;
        int ceil = ((int) Math.ceil(((i11 + L3) - f17) / L2)) + 1;
        org.telegram.messenger.i0.L(24.0f);
        int floor = ((int) Math.floor((f18 - f17) / L2)) - 1;
        while (floor <= ceil) {
            int i15 = floor & 1;
            if (i15 == 0) {
                f10 = 0.0f;
            } else {
                f10 = L / 2.0f;
            }
            boolean z15 = z14;
            int floor2 = ((int) Math.floor(((f18 - f16) - f10) / L)) - 1;
            int i16 = i10;
            float f19 = L3;
            int ceil2 = ((int) Math.ceil((((i16 + L3) - f16) - f10) / L)) + 1;
            while (floor2 <= ceil2) {
                float f20 = L2;
                int i17 = ceil2;
                double u02 = u0(floor, floor2);
                if (c0(53.1d * u02) < 0.2f) {
                    f11 = f16;
                    i14 = floor2;
                    i12 = ceil;
                    i13 = floor;
                    f14 = f10;
                    f13 = L;
                    z13 = z15;
                    f15 = f18;
                } else {
                    x0Var.G0(u02, 3.0f, 10.0f);
                    float f21 = f18;
                    float f22 = (float) (2.0d * u02 * 3.141592653589793d);
                    f11 = f16;
                    float d = x0Var.L4 + sc.e.d(floor2, L, f10, f16);
                    float sin = (((float) Math.sin((x0Var.M3 * 0.45f) + f22)) * org.telegram.messenger.i0.L(3.0f)) + (floor * f20) + f17 + x0Var.M4;
                    if (i15 == 0) {
                        z12 = z15;
                    } else {
                        z12 = false;
                    }
                    float L4 = org.telegram.messenger.i0.L(38.0f);
                    if (z12) {
                        f12 = 1.3f;
                    } else {
                        f12 = 0.9f;
                    }
                    float f23 = L4 * f12;
                    i12 = ceil;
                    float f24 = (float) u02;
                    float C = c3.i0.C(f24, 0.16f, 0.92f, f23);
                    f13 = L;
                    z13 = z15;
                    f14 = f10;
                    f15 = f21;
                    int i18 = floor2;
                    i13 = floor;
                    i14 = i18;
                    if (J0(d, sin, C, i16, i11, 0, floor, i18, (Math.max(0.0f, (C / org.telegram.messenger.i0.L(24.0f)) - 1.0f) * 0.8f) + 1.0f)) {
                        if (z12) {
                            C *= 0.9f;
                        }
                        float f25 = C;
                        float sin2 = (((float) Math.sin((this.M3 * 0.3f) + f22)) * 4.0f) + ((f24 - 0.5f) * 26.0f);
                        float c02 = c0(59.3d * u02) * 0.3f;
                        int i19 = (i14 - ((i13 - i15) / 2)) - i13;
                        int length = u0Var4.f45763b.length;
                        int i20 = ((i19 % length) + length) % length;
                        float c03 = c0(71.9d * u02);
                        if (u0Var3 == null) {
                            D(canvas, u0Var4, i20, f25, sin2, f22 * 2.0f, f1(z10, z11, f7 - c02), c03);
                        } else {
                            u0 u0Var5 = u0Var4;
                            Drawable[] drawableArr = u0Var3.f45763b;
                            int length2 = drawableArr.length;
                            int i21 = ((i19 % length2) + length2) % length2;
                            if (drawableArr[i21] == u0Var5.f45763b[i20]) {
                                D(canvas, u0Var5, i20, f25, sin2, f22 * 2.0f, 1.0f, c03);
                            } else {
                                float f26 = f22 * 2.0f;
                                float f27 = f7 - c02;
                                D(canvas, u0Var3, i21, f25, sin2, f26, f1(z13, false, f27), c03);
                                D(canvas, u0Var2, i20, f25, sin2, f26, f1(false, false, f27), c03);
                            }
                        }
                    }
                }
                floor2 = i14 + 1;
                x0Var = this;
                i16 = i10;
                u0Var3 = u0Var;
                u0Var4 = u0Var2;
                floor = i13;
                f18 = f15;
                ceil2 = i17;
                f10 = f14;
                f16 = f11;
                ceil = i12;
                L = f13;
                z15 = z13;
                L2 = f20;
            }
            floor++;
            x0Var = this;
            u0Var3 = u0Var;
            u0Var4 = u0Var2;
            z14 = z15;
            L2 = L2;
            L3 = f19;
        }
    }

    public final void E0(u0 u0Var, Bitmap bitmap) {
        u0Var.e = bitmap;
        if (bitmap != null) {
            if (y0.f46092b[35] > 0.5f) {
                Y(bitmap);
            }
            x0(u0Var);
        }
        u0Var.f45766g = AnimationUtils.currentAnimationTimeMillis();
        this.f45860g2 = bitmap;
        invalidate();
    }

    public final void F(android.graphics.Canvas r96, int r97, int r98, qh.u0 r99, boolean r100, boolean r101, float r102) {
        throw new UnsupportedOperationException("Method not decompiled: qh.x0.F(android.graphics.Canvas, int, int, qh.u0, boolean, boolean, float):void");
    }

    public final void F0(int i10) {
        if (!this.f45797a) {
            return;
        }
        if (i10 == 2 && !d20.i(this.f45807b).q()) {
            d1(0, cd.L0(2131746489, null), cd.L0(2131746488, null));
            i0();
            return;
        }
        if (i10 == 2 && (this.f45869h1 != i10 || this.f45850f1 < 0.5f)) {
            AnimationUtils.currentAnimationTimeMillis();
        }
        this.f45869h1 = i10;
        this.f45879i1 = i10;
        this.f45889j1 = 0.0f;
        this.f45907k9.forceFinished(true);
        if (this.f45850f1 > 0.5f) {
            this.f45825c6 = AnimationUtils.currentAnimationTimeMillis();
        }
        if (this.f45859g1 < 0.5f) {
            this.I2 = AnimationUtils.currentAnimationTimeMillis();
        }
        this.f45859g1 = 1.0f;
        l0();
        if (this.f45869h1 == 2) {
            y0();
        }
        i0();
    }

    public final void G(Canvas canvas, RectF rectF, int i10) {
        float centerY = rectF.centerY();
        float L = org.telegram.messenger.i0.L(12.0f);
        e6 e6Var = this.L0;
        float c10 = e6Var.c() + org.telegram.messenger.i0.L(2.0f) + L;
        float L2 = rectF.left + org.telegram.messenger.i0.L(8.0f);
        O(canvas, L2, centerY, L, i10, true);
        e6Var.u(i10);
        e6Var.setBounds((int) (L2 + L + org.telegram.messenger.i0.L(2.0f)), (int) (centerY - org.telegram.messenger.i0.L(8.0f)), (int) (L2 + c10 + org.telegram.messenger.i0.L(40.0f)), (int) (centerY + org.telegram.messenger.i0.L(8.0f)));
        e6Var.draw(canvas);
    }

    public final void G0(double d, float f7, float f10) {
        double d10;
        float c02 = ((c0(31.7d * d) * (f10 - f7)) + f7) * org.telegram.messenger.i0.L(1.0f);
        float c03 = (c0(37.1d * d) * 11.0f) + 9.0f;
        if (c0(43.3d * d) < 0.5f) {
            d10 = -1.0d;
        } else {
            d10 = 1.0d;
        }
        double d11 = (d * 6.283d) + ((((d10 * 2.0d) * 3.141592653589793d) * this.M3) / c03);
        this.L4 = ((float) Math.cos(d11)) * c02;
        this.M4 = c02 * ((float) Math.sin(d11));
    }

    public final void H(Canvas canvas, RectF rectF, float f7) {
        int i10;
        v0 v0Var = this.f45925n;
        if (v0Var != null) {
            i10 = i0.b.f(0.5f, v0Var.f45787b, v0Var.f45788c);
        } else {
            i10 = -12947803;
        }
        Paint paint = this.f46047z1;
        paint.setColor(i10 | (-16777216));
        paint.setAlpha((int) (Utilities.l(f7) * 224.4f));
        canvas.drawRect(rectF, paint);
    }

    public final float H0() {
        return (a1() - b1()) + org.telegram.messenger.i0.L(8.0f);
    }

    public final void I(android.graphics.Canvas r29, int r30, org.telegram.tgnet.tl.TL_stars.TL_starGiftUnique r31, float r32, float r33, float r34, float r35) {
        throw new UnsupportedOperationException("Method not decompiled: qh.x0.I(android.graphics.Canvas, int, org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique, float, float, float, float):void");
    }

    public final void I0(float f7, float f10, int i10) {
        Path path;
        int i11;
        int i12;
        TLRPC.Document document;
        TLRPC.Document document2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f46006v1.get(i10);
        ?? obj = new Object();
        obj.f45786a = 2;
        obj.f45789f = i10;
        final u0 u0Var = new u0();
        u0Var.f45762a = 2;
        u0Var.f45775q = i10;
        long j10 = tL_starGiftUnique.f20021id;
        u0Var.f45776r = (int) (j10 ^ (j10 >>> 32));
        ArrayList<TL_stars.StarGiftAttribute> arrayList = tL_starGiftUnique.attributes;
        int size = arrayList.size();
        int i13 = 0;
        int i14 = 0;
        while (i14 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i14);
            i14++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) && (document2 = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document) != null) {
                u0Var.A = document2;
                u0Var.f45764c = f5.l(this.f45807b, 9, document2);
            } else if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) && (document = ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document) != null) {
                u0Var.f45783z = document;
                u0Var.d = f5.l(this.f45807b, 24, document);
            }
        }
        e0(this.f45870h2, i10);
        obj.f45787b = x(this.f45870h2[0], false);
        int x10 = x(this.f45870h2[1], true);
        obj.f45788c = x10;
        obj.d = this.f45870h2[2];
        obj.e = v(obj.f45787b, x10);
        obj.h = Z0(obj.f45787b);
        obj.f45790g = g.k(0.5f, obj.f45787b, obj.f45788c);
        u0Var.f45768j = l1(obj.d, obj.f45787b);
        i0.b.j(l1(obj.d, obj.f45787b) | (-16777216), r9);
        double min = Math.min(97.0d, r9[0] + 20.0d);
        double[] dArr = {min};
        Color.colorToHSV(i0.b.b(min, dArr[1], dArr[2]), r3);
        float[] fArr = {0.0f, Math.min(1.0f, fArr[1] * 1.15f)};
        u0Var.f45777s = Color.HSVToColor(fArr) | (-16777216);
        u0Var.v.setColorFilter(new PorterDuffColorFilter(u0Var.f45777s, PorterDuff.Mode.SRC_IN));
        u0Var.f45778t = -1;
        u0Var.B = tL_starGiftUnique;
        f5 f5Var = u0Var.f45764c;
        if (f5Var != null) {
            f5Var.a(this);
        }
        f5 f5Var2 = u0Var.d;
        if (f5Var2 != null) {
            f5Var2.a(this);
        }
        TLRPC.Document document3 = u0Var.f45783z;
        if (document3 != null) {
            int i15 = 0;
            while (true) {
                if (i15 < document3.thumbs.size()) {
                    if (document3.thumbs.get(i15) instanceof TLRPC.TL_photoPathSize) {
                        path = ((TLRPC.TL_photoPathSize) document3.thumbs.get(i15)).svgPath;
                        break;
                    }
                    i15++;
                } else {
                    path = null;
                    break;
                }
            }
            if (path != null) {
                while (true) {
                    if (i13 < document3.attributes.size()) {
                        TLRPC.DocumentAttribute documentAttribute = document3.attributes.get(i13);
                        if (((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) && (i11 = documentAttribute.f19800w) > 0 && (i12 = documentAttribute.h) > 0) {
                            break;
                        }
                        i13++;
                    } else {
                        i11 = 512;
                        i12 = 512;
                        break;
                    }
                }
                final Path path2 = new Path(path);
                float f11 = I9;
                final float f12 = f11 / i11;
                final float f13 = f11 / i12;
                final int i16 = u0Var.f45768j;
                Utilities.e.c(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap;
                        float f14 = f12;
                        float f15 = f13;
                        int i17 = i16;
                        Path path3 = path2;
                        try {
                            int i18 = x0.I9;
                            bitmap = Bitmap.createBitmap(i18, i18, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(bitmap);
                            canvas.scale(f14, f15);
                            Paint paint = new Paint(1);
                            paint.setColor(i17);
                            canvas.drawPath(path3, paint);
                            bitmap.prepareToDraw();
                        } catch (Throwable th2) {
                            f8.g(th2, true);
                            bitmap = null;
                        }
                        org.telegram.messenger.i0.g3(new u41(x0.this, u0Var, bitmap, 18));
                    }
                });
            }
        }
        this.I.clear();
        Y0(obj, f7, f10);
        if (!this.f45851f2) {
            this.f45948p2 = j(this.f45928n2, 0.03f, 0.005f);
            this.f45928n2 = AnimationUtils.currentAnimationTimeMillis();
        }
        setPattern(u0Var);
    }

    public final void J(Canvas canvas, RectF rectF, float f7, float f10) {
        RectF rectF2;
        float f11;
        RectF rectF3;
        boolean z10;
        float f12;
        char c10;
        char c11;
        int i10;
        double d;
        float f13;
        float f14;
        if (f10 <= 0.0f) {
            return;
        }
        if (this.A6) {
            float min = Math.min(0.0f, org.telegram.messenger.i0.N(y0.f46091a[2][8]));
            rectF3 = this.W5;
            rectF2 = rectF;
            rectF3.set(rectF2);
            rectF3.inset(min, min);
            f11 = f7 - min;
        } else {
            rectF2 = rectF;
            f11 = f7;
            rectF3 = rectF2;
        }
        if (!j0(canvas) && this.Y2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && this.Y2 != null && this.f45800a3 != null) {
            float f15 = this.f45852f3;
            Matrix matrix = this.f45832d3;
            matrix.setScale(f15, f15);
            float f16 = (-f15) / 2.0f;
            matrix.postTranslate(f16, f16);
            this.f45800a3.setLocalMatrix(matrix);
            Paint paint = this.f45822c3;
            paint.setAlpha((int) (Utilities.l(f10) * 255.0f));
            canvas.drawRoundRect(rectF3, f11, f11, paint);
            paint.setAlpha(255);
        }
        Path path = this.E1;
        path.rewind();
        path.addRoundRect(rectF3, f11, f11, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        float[] fArr = y0.f46092b;
        if (z10) {
            f12 = 0.0f;
            c10 = '\t';
            c11 = 3;
        } else if (u.f() && j0(canvas)) {
            int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            f12 = 0.0f;
            if (i11 < 0) {
                canvas.saveLayerAlpha(rectF3, (int) (f10 * 255.0f));
            }
            if (this.f45981s6 && this.f45970r6 > 0.004f) {
                canvas.save();
                canvas.scale(8.0f, 8.0f);
                if (this.f45991t6 == null) {
                    this.f45991t6 = android.support.v4.media.session.w.d("qrSheetLift");
                }
                float round = Math.round(this.f45970r6 * 50.0f) / 50.0f;
                c10 = '\t';
                v0 v0Var = this.f45925n;
                if (v0Var != null) {
                    i10 = v0Var.f45787b;
                } else {
                    i10 = 0;
                }
                if (round == this.f46001u6 && this.f46011v6 == 1 && this.f46022w6 == i10) {
                    c11 = 3;
                } else {
                    this.f46001u6 = round;
                    this.f46011v6 = 1;
                    this.f46022w6 = i10;
                    Object obj = this.f45991t6;
                    if (v0Var != null) {
                        d = i0.b.h(v0Var.f45787b);
                    } else {
                        d = 0.3d;
                    }
                    c11 = 3;
                    float c12 = a1.g.c(fArr[11], 100.0f, round, 1.0f);
                    float max = ((0.5f - (c12 * 0.5f)) + ((fArr[10] / 100.0f) * round * ((float) Math.max(0.0d, Math.min(1.0d, (0.85d - d) / 0.45d))))) * 255.0f;
                    u.k(obj, Math.max(0.5f, org.telegram.messenger.i0.N(org.telegram.messenger.i0.T1(fArr[2], fArr[12], round)) / 8.0f), new float[]{c12, 0.0f, 0.0f, 0.0f, max, 0.0f, c12, 0.0f, 0.0f, max, 0.0f, 0.0f, c12, 0.0f, max, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                }
                Canvas a2 = u.a((getWidth() + 7) / 8, (getHeight() + 7) / 8, this.f45991t6);
                a2.scale(0.125f, 0.125f);
                u.c(a2, this.G1);
                u.d(this.f45991t6);
                u.c(canvas, this.f45991t6);
                canvas.restore();
            } else {
                c10 = '\t';
                c11 = 3;
                Object obj2 = this.H1;
                canvas.save();
                canvas.scale(9.0f, 9.0f);
                u.c(canvas, obj2);
                canvas.restore();
            }
            if (i11 < 0) {
                canvas.restore();
            }
        } else {
            f12 = 0.0f;
            c10 = '\t';
            c11 = 3;
            H(canvas, rectF3, f10);
        }
        int i12 = this.T8;
        if (i12 == 0) {
            float f17 = fArr[c11];
            if (this.f45981s6) {
                f14 = fArr[c10] * this.f45970r6;
            } else {
                f14 = f12;
            }
            i12 = g((f17 + f14) / 100.0f, 16777215);
        }
        Paint paint2 = this.f46047z1;
        paint2.setColor(i12);
        paint2.setAlpha((int) (Color.alpha(paint2.getColor()) * f10));
        canvas.drawRect(rectF3, paint2);
        t.b(canvas, rectF3, f10);
        boolean z11 = this.f45981s6;
        if (!z11 && !this.A6) {
            f13 = (fArr[21] / 100.0f) * this.f45814b6;
        } else {
            f13 = f12;
        }
        if ((f13 > f12 || fArr[39] > f12) && this.y3 && !z11 && !this.A6) {
            int width = getWidth();
            int height = getHeight();
            float c13 = c1(rectF3.left, rectF3.centerY(), width, height);
            float c14 = c1(rectF3.centerX(), rectF3.centerY(), width, height);
            float c15 = c1(rectF3.right, rectF3.centerY(), width, height);
            if (c13 + c14 + c15 > 0.01f) {
                float f18 = ((fArr[39] * 1.25f) / 100.0f) * this.f45814b6 * 0.1f;
                float f19 = c14 * f18 * f10;
                float centerX = rectF3.centerX();
                L(rectF3.left, centerX, c13 * f18 * f10, f19, canvas, rectF3);
                L(centerX, rectF3.right, f19, f18 * c15 * f10, canvas, rectF3);
            }
        }
        canvas.restore();
        C(canvas, null, rectF2, f7, f10);
    }

    public final boolean J0(float r39, float r40, float r41, int r42, int r43, int r44, int r45, int r46, float r47) {
        throw new UnsupportedOperationException("Method not decompiled: qh.x0.J0(float, float, float, int, int, int, int, int, float):boolean");
    }

    public final void K(Canvas canvas) {
        float f7;
        float L;
        int i10;
        int i11;
        float f10;
        float f11;
        float f12;
        float g12;
        int i12;
        Bitmap bitmap;
        float f13;
        float L2;
        Canvas canvas2 = canvas;
        if (this.f45899k1 <= 0.001f) {
            return;
        }
        float L3 = org.telegram.messenger.i0.L(222.0f);
        float L4 = org.telegram.messenger.i0.L(46.0f);
        float L5 = org.telegram.messenger.i0.L(54.0f);
        org.telegram.messenger.i0.L(8.0f);
        if (this.f46037y0) {
            f7 = L4 + L4;
        } else {
            f7 = L4 + L5 + L4;
        }
        int i13 = (this.f45850f1 > 0.5f ? 1 : (this.f45850f1 == 0.5f ? 0 : -1));
        RectF rectF = this.J5;
        if (i13 > 0) {
            L = (rectF.bottom + org.telegram.messenger.i0.L(6.0f)) - f7;
        } else {
            L = rectF.top - org.telegram.messenger.i0.L(6.0f);
        }
        float f14 = L;
        float width = (getWidth() - L3) / 2.0f;
        RectF rectF2 = this.K8;
        rectF2.set(width, f14, L3 + width, f7 + f14);
        float f15 = this.E8;
        float f16 = this.F8;
        float l4 = Utilities.l(this.f45899k1);
        float T1 = org.telegram.messenger.i0.T1(rectF.left, rectF2.left, f15);
        float T12 = org.telegram.messenger.i0.T1(rectF.top, rectF2.top, f16);
        float T13 = org.telegram.messenger.i0.T1(rectF.right, rectF2.right, f15);
        float T14 = org.telegram.messenger.i0.T1(rectF.bottom, rectF2.bottom, f16);
        RectF rectF3 = this.J8;
        rectF3.set(T1, T12, T13, T14);
        float min = Math.min(rectF3.height() / 2.0f, Math.min(rectF3.width() / 2.0f, org.telegram.messenger.i0.T1(rectF.height() / 2.0f, org.telegram.messenger.i0.L(22.0f), Utilities.l(f16))));
        float max = Math.max(-0.25f, Math.min(1.0f, this.G8 / 9.0f)) * org.telegram.messenger.i0.L(5.0f);
        float f17 = rectF3.left;
        float f18 = rectF3.top;
        float f19 = rectF3.right;
        float f20 = 1.0f;
        float f21 = rectF3.bottom;
        float centerX = rectF3.centerX();
        Path path = this.I8;
        path.rewind();
        float f22 = f17 + min;
        path.moveTo(f22, f18);
        float f23 = f19 - min;
        path.lineTo(f23, f18);
        float f24 = f18 + min;
        path.quadTo(f19, f18, f19, f24);
        float f25 = f21 - min;
        path.lineTo(f19, f25);
        path.quadTo(f19, f21, f23, f21);
        float f26 = f21 + max;
        path.cubicTo(org.telegram.messenger.i0.T1(f23, centerX, 0.55f), f26, org.telegram.messenger.i0.T1(f22, centerX, 0.55f), f26, f22, f21);
        path.quadTo(f17, f21, f17, f25);
        path.lineTo(f17, f24);
        path.quadTo(f17, f18, f22, f18);
        path.close();
        RectF rectF4 = this.F1;
        rectF4.set(f17, f18, f19, Math.max(0.0f, max) + f21);
        canvas2.save();
        canvas2.clipPath(path);
        float f27 = 255.0f;
        if (u.f() && j0(canvas)) {
            Object obj = this.H1;
            canvas2.save();
            canvas2.scale(9.0f, 9.0f);
            u.c(canvas2, obj);
            canvas2.restore();
        } else if (this.Y2 != null) {
            Paint paint = this.f45811b3;
            paint.setAlpha((int) (Utilities.l(1.0f) * 255.0f));
            Bitmap bitmap2 = this.Y2;
            if (bitmap2 != null) {
                y(canvas2, bitmap2);
            }
            paint.setAlpha(255);
        } else {
            H(canvas2, rectF4, 1.0f);
        }
        Paint paint2 = this.f46047z1;
        paint2.setColor(352321535);
        paint2.setAlpha((int) (Color.alpha(paint2.getColor()) * 1.0f));
        canvas2.drawRect(rectF4, paint2);
        t.b(canvas2, rectF4, 1.0f);
        canvas2.restore();
        C(canvas2, path, rectF4, 0.0f, 1.0f);
        canvas2.save();
        canvas2.clipPath(path);
        float f28 = l4 / 0.3f;
        float l10 = 1.0f - Utilities.l(f28);
        float f29 = 0.004f;
        float f30 = 0.15f;
        boolean z10 = false;
        int i14 = 1;
        if (l10 > 0.004f) {
            canvas2.saveLayerAlpha(rectF4, (int) (l10 * 255.0f));
            float l11 = 1.0f - (Utilities.l(f28) * 0.15f);
            canvas2.scale(l11, l11, rectF.centerX(), rectF.centerY());
            this.T5 = true;
            int width2 = getWidth();
            System.currentTimeMillis();
            B(canvas2, width2);
            this.T5 = false;
            canvas2.restore();
        }
        float centerX2 = rectF3.centerX() - rectF2.centerX();
        float f31 = rectF3.top - rectF2.top;
        float f32 = 0.6f;
        if (Math.abs(this.G8) < 0.6f) {
            centerX2 = Math.round(centerX2);
            f31 = Math.round(f31);
        }
        canvas2.save();
        canvas2.translate(centerX2, f31);
        TextPaint textPaint = this.C1;
        textPaint.setSubpixelText(true);
        textPaint.setLinearText(false);
        boolean z11 = this.f46026x0;
        String L0 = cd.L0(2131746500, null);
        if (z11) {
            i10 = 2131746504;
        } else {
            i10 = 2131746502;
        }
        String[] strArr = {L0, cd.L0(i10, null), cd.L0(2131746499, null)};
        if (this.f46026x0) {
            i11 = 2131746503;
        } else {
            i11 = 2131746501;
        }
        String[] strArr2 = {null, cd.L0(i11, null), null};
        int i15 = 0;
        float f33 = f14;
        while (i15 < 3) {
            RectF[] rectFArr = this.f46044y8;
            if (i15 == i14 && this.f46037y0) {
                rectFArr[i15].setEmpty();
                i12 = i15;
                f11 = f27;
                f12 = f29;
            } else {
                if (strArr2[i15] != null) {
                    f10 = L5;
                } else {
                    f10 = L4;
                }
                f11 = f27;
                f12 = f29;
                float f34 = f33 + f10;
                rectFArr[i15].set(rectF2.left, f33, rectF2.right, f34);
                if (this.l1 > 0.5f) {
                    g12 = g1(f30, f32, l4);
                } else {
                    g12 = g1(f32, f20, l4);
                }
                if (g12 <= f12) {
                    i12 = i15;
                } else {
                    M(canvas2, i15, rectFArr[i15], z10);
                    canvas2.save();
                    float f35 = (f10 / 2.0f) + f33;
                    if (i15 == 2) {
                        i12 = i15;
                        o0(canvas2, this.K1, rectF2.left + org.telegram.messenger.i0.L(26.0f), f35, org.telegram.messenger.i0.L(20.0f), g12);
                        canvas2 = canvas;
                    } else {
                        i12 = i15;
                        if (i12 == 0) {
                            canvas2 = canvas;
                            o0(canvas2, this.R1, rectF2.left + org.telegram.messenger.i0.L(26.0f), f35, org.telegram.messenger.i0.L(20.0f), g12);
                        } else {
                            canvas2 = canvas;
                            boolean z12 = this.f46026x0;
                            if (z12) {
                                bitmap = this.O8;
                            } else {
                                bitmap = this.P8;
                            }
                            if (bitmap != null) {
                                f13 = 26.0f;
                            } else {
                                int round = Math.round(org.telegram.messenger.i0.L(22.4f));
                                Bitmap createBitmap = Bitmap.createBitmap(round, round, Bitmap.Config.ALPHA_8);
                                f13 = 26.0f;
                                Canvas canvas3 = new Canvas(createBitmap);
                                float f36 = round / 24.0f;
                                canvas3.scale(f36, f36);
                                Paint paint3 = new Paint(1);
                                Paint.Style style = Paint.Style.STROKE;
                                paint3.setStyle(style);
                                paint3.setStrokeWidth(1.66f);
                                Paint.Cap cap = Paint.Cap.ROUND;
                                paint3.setStrokeCap(cap);
                                paint3.setStrokeJoin(Paint.Join.ROUND);
                                paint3.setColor(-16777216);
                                canvas3.drawCircle(11.0f, 11.0f, 8.0f, paint3);
                                canvas3.drawLine(11.0f, 11.0f, 11.0f, 6.6f, paint3);
                                canvas3.drawLine(11.0f, 11.0f, 7.8f, 11.0f, paint3);
                                if (z12) {
                                    Paint paint4 = new Paint(1);
                                    paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                                    canvas3.drawCircle(18.2f, 18.2f, 5.7f, paint4);
                                    Paint paint5 = new Paint(1);
                                    paint5.setColor(-16777216);
                                    canvas3.drawCircle(18.2f, 18.2f, 4.4f, paint5);
                                    paint4.setStyle(style);
                                    paint4.setStrokeWidth(1.4f);
                                    paint4.setStrokeCap(cap);
                                    canvas3.drawLine(16.6f, 16.6f, 19.8f, 19.8f, paint4);
                                    canvas3.drawLine(19.8f, 16.6f, 16.6f, 19.8f, paint4);
                                    this.O8 = createBitmap;
                                } else {
                                    this.P8 = createBitmap;
                                }
                                bitmap = createBitmap;
                            }
                            float L6 = rectF2.left + org.telegram.messenger.i0.L(f13);
                            Paint paint6 = this.Q8;
                            paint6.setColor(-1);
                            paint6.setAlpha((int) (Color.alpha(-1) * g12));
                            canvas2.drawBitmap(bitmap, L6 - (bitmap.getWidth() / 2.0f), f35 - (bitmap.getHeight() / 2.0f), paint6);
                        }
                    }
                    textPaint.setTextSize(org.telegram.messenger.i0.L(15.0f));
                    textPaint.setColor(-1);
                    textPaint.setAlpha((int) (g12 * f11));
                    String str = strArr[i12];
                    float L7 = rectF2.left + org.telegram.messenger.i0.L(52.0f);
                    if (strArr2[i12] != null) {
                        L2 = f35 - org.telegram.messenger.i0.L(2.0f);
                    } else {
                        L2 = org.telegram.messenger.i0.L(5.0f) + f35;
                    }
                    canvas2.drawText(str, L7, L2, textPaint);
                    if (strArr2[i12] != null) {
                        textPaint.setTextSize(org.telegram.messenger.i0.L(12.0f));
                        textPaint.setColor(-1493172225);
                        textPaint.setAlpha((int) (Color.alpha(-1493172225) * g12));
                        canvas2.drawText(strArr2[i12], rectF2.left + org.telegram.messenger.i0.L(52.0f), f35 + org.telegram.messenger.i0.L(14.0f), textPaint);
                    }
                    canvas2.restore();
                }
                f33 = f34;
            }
            i15 = i12 + 1;
            f27 = f11;
            f29 = f12;
            f30 = 0.15f;
            f32 = 0.6f;
            z10 = false;
            i14 = 1;
            f20 = 1.0f;
        }
        canvas2.restore();
        canvas2.restore();
    }

    public final void K0() {
        if (this.W4 == null && !this.V4) {
            this.V4 = true;
            Utilities.e.c(new n0(this, i0.b.o(i0.b.f(0.4f, N0(), -16777216), 16), 0));
        }
    }

    public final void L(float f7, float f10, float f11, float f12, Canvas canvas, RectF rectF) {
        LinearGradient linearGradient;
        float min = Math.min(f11, f12);
        float max = Math.max(f11, f12);
        int i10 = (min > 0.002f ? 1 : (min == 0.002f ? 0 : -1));
        Paint paint = this.f45803a6;
        if (i10 > 0) {
            paint.setShader(null);
            paint.setColor(g(min, 16777215));
            canvas.drawRect(f7, rectF.top, f10, rectF.bottom, paint);
        }
        float f13 = max - min;
        if (f13 > 0.002f) {
            if (f12 >= f11) {
                linearGradient = this.X5;
            } else {
                linearGradient = this.Y5;
            }
            Matrix matrix = this.Z5;
            matrix.setScale(f10 - f7, 1.0f);
            matrix.postTranslate(f7, 0.0f);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            paint.setColor(-1);
            paint.setAlpha((int) (f13 * 255.0f));
            canvas.drawRect(f7, rectF.top, f10, rectF.bottom, paint);
            paint.setShader(null);
        }
    }

    public final float L0(float f7) {
        if (!this.y3 || this.f45968r4 <= 0.001f) {
            return 0.0f;
        }
        float f10 = this.f45958q4;
        float[] fArr = y0.f46092b;
        float max = f10 / Math.max(0.3f, fArr[50]);
        if (max > 4.0f || max < -4.0f) {
            return 0.0f;
        }
        return Math.min(org.telegram.messenger.i0.N(fArr[42]), (org.telegram.messenger.i0.L(3.5f) / 2.0f) / 0.607f) * f7 * max * ((float) Math.exp((-0.5f) * max * max)) * this.f45968r4;
    }

    public final void M(Canvas canvas, int i10, RectF rectF, boolean z10) {
        boolean z11;
        float exp;
        int i11;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (this.f45973r9 == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        long[] jArr = this.f46035x9;
        if (!z11 && jArr[i10] == 0) {
            return;
        }
        if (z11) {
            exp = X0(i10, currentAnimationTimeMillis);
        } else {
            exp = this.f46045y9[i10] * ((float) Math.exp(((float) (-(currentAnimationTimeMillis - jArr[i10]))) / 180.0f));
        }
        if (!z11 && exp < 0.004f) {
            jArr[i10] = 0;
            return;
        }
        float D = c3.i0.D(exp, 2.0f, 3.0f, exp * exp);
        float min = Math.min(1.0f, ((float) (currentAnimationTimeMillis - this.w9[i10])) / 320.0f);
        float f7 = 1.0f - min;
        float x10 = f1.x(f7, f7, f7, 1.0f);
        if (!z11 || exp < 0.996f || min < 1.0f) {
            invalidate();
        }
        float max = Math.max(rectF.left, Math.min(rectF.right, this.f46004u9[i10]));
        float max2 = Math.max(rectF.top, Math.min(rectF.bottom, this.f46014v9[i10]));
        float max3 = (float) Math.max(Math.hypot(max - rectF.left, max2 - rectF.top), Math.max(Math.hypot(max - rectF.right, max2 - rectF.top), Math.max(Math.hypot(max - rectF.left, max2 - rectF.bottom), Math.hypot(max - rectF.right, max2 - rectF.bottom))));
        if (z10) {
            i11 = 335544320;
        } else {
            i11 = 738197503;
        }
        int i12 = (((int) ((i11 >>> 24) * D)) << 24) | (16777215 & i11);
        Paint paint = this.f45984s9;
        paint.setColor(i12);
        Path path = this.f45994t9;
        path.rewind();
        if (i10 != 3 && i10 != 4 && i10 != 11) {
            if (i10 < 6 && i10 != 5) {
                path.addRect(rectF, Path.Direction.CW);
            } else {
                float min2 = Math.min(org.telegram.messenger.i0.L(20.0f), rectF.height() / 2.0f);
                path.addRoundRect(rectF, min2, min2, Path.Direction.CW);
            }
        } else {
            path.addOval(rectF, Path.Direction.CW);
        }
        canvas.save();
        canvas.clipPath(path);
        canvas.drawCircle(max, max2, Math.max(org.telegram.messenger.i0.L(6.0f), max3 * x10), paint);
        canvas.restore();
    }

    public final void M0(int i10, v0 v0Var, int i11, int i12) {
        int i13 = i10 * 7;
        int i14 = v0Var.f45786a;
        float[] fArr = this.f45891j3;
        if (i14 == 0 && v0Var.f45789f == H9) {
            fArr[i13] = 0.0f;
            fArr[i13 + 1] = 0.0f;
            fArr[i13 + 2] = 0.0f;
            float f7 = L9;
            fArr[i13 + 3] = f7;
            float f10 = M9;
            fArr[i13 + 4] = f10;
            fArr[i13 + 5] = 1.0f / ((i12 * f10) + (i11 * f7));
            fArr[i13 + 6] = 0.5f;
        } else {
            fArr[i13] = 1.0f;
            fArr[i13 + 1] = i11 / 2.0f;
            fArr[i13 + 2] = (l() / 2.0f) + m();
            fArr[i13 + 3] = 0.0f;
            fArr[i13 + 4] = 0.0f;
            fArr[i13 + 5] = 1.0f / (((float) Math.hypot(i11, i12)) * 0.62f);
            fArr[i13 + 6] = 0.55f;
        }
        int i15 = i10 * 3;
        int i16 = v0Var.f45787b;
        int[] iArr = this.f45910l3;
        iArr[i15] = i16;
        iArr[i15 + 1] = v0Var.f45790g;
        iArr[i15 + 2] = v0Var.f45788c;
    }

    public final void N(android.graphics.Canvas r61, int r62, int r63) {
        throw new UnsupportedOperationException("Method not decompiled: qh.x0.N(android.graphics.Canvas, int, int):void");
    }

    public final int N0() {
        v0 v0Var = this.f45925n;
        if (v0Var == null) {
            return -16777216;
        }
        if (this.f45974s < 1.0f && this.f45963r != null) {
            float l4 = (l() / 2.0f) + m();
            float l10 = Utilities.l(((((((float) Math.hypot(Math.max(this.f46025x, getWidth() - this.f46025x), Math.max(this.f46036y, getHeight() - this.f46036y))) + org.telegram.messenger.i0.L(60.0f)) * y1(this.f45974s)) - ((float) Math.hypot((getWidth() / 2.0f) - this.f46025x, l4 - this.f46036y))) + org.telegram.messenger.i0.L(80.0f)) / org.telegram.messenger.i0.L(160.0f));
            int i10 = this.f45963r.e;
            int i11 = this.f45925n.e;
            float D = c3.i0.D(l10, 2.0f, 3.0f, l10 * l10);
            double[] dArr = this.f45957q3;
            i0.b.j(i10, dArr);
            double[] dArr2 = this.f45967r3;
            i0.b.j(i11, dArr2);
            double d = D;
            double[] dArr3 = this.f45978s3;
            if (dArr3.length == 3) {
                double d10 = 1.0d - d;
                double d11 = (dArr2[0] * d) + (dArr[0] * d10);
                dArr3[0] = d11;
                double d12 = (dArr2[1] * d) + (dArr[1] * d10);
                dArr3[1] = d12;
                double d13 = (dArr2[2] * d) + (dArr[2] * d10);
                dArr3[2] = d13;
                return i0.b.b(d11, d12, d13);
            }
            throw new IllegalArgumentException("outResult must have a length of 3.");
        }
        return v0Var.e;
    }

    public final void O(Canvas canvas, float f7, float f10, float f11, int i10, boolean z10) {
        PorterDuffColorFilter n12 = n1(i10);
        org.telegram.ui.o0 o0Var = this.T1;
        o0Var.setColorFilter(n12);
        o0Var.setAlpha(255);
        float f12 = f11 / 2.0f;
        float f13 = f10 - f12;
        float f14 = f7 + f11;
        float f15 = f10 + f12;
        o0Var.setBounds((int) f7, (int) f13, (int) f14, (int) f15);
        if (!z10) {
            o0Var.draw(canvas);
            return;
        }
        float f16 = f11 * 0.095f;
        float f17 = (0.28f * f11) + f7;
        float f18 = f10 - (0.21f * f11);
        float f19 = (0.74f * f11) + f7;
        float f20 = (0.25f * f11) + f10;
        float L = f7 - org.telegram.messenger.i0.L(2.0f);
        float L2 = f13 - org.telegram.messenger.i0.L(2.0f);
        float L3 = f14 + org.telegram.messenger.i0.L(2.0f);
        float L4 = f15 + org.telegram.messenger.i0.L(2.0f);
        RectF rectF = this.V5;
        rectF.set(L, L2, L3, L4);
        canvas.saveLayer(rectF, null);
        o0Var.draw(canvas);
        Paint paint = this.Y1;
        paint.setStrokeWidth((0.065f * f11 * 2.0f) + f16);
        canvas.drawLine(f17, f18, f19, f20, paint);
        canvas.restore();
        Paint paint2 = this.A1;
        paint2.setColor(i10);
        paint2.setStrokeWidth(f16);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawLine(f17, f18, f19, f20, paint2);
        paint2.setStrokeCap(Paint.Cap.BUTT);
    }

    public final void O0() {
        this.X1.C(false);
        Bitmap bitmap = this.R2;
        if (bitmap != null) {
            bitmap.recycle();
            this.R2 = null;
        }
        bi0 bi0Var = this.f45806a9;
        if (bi0Var != null) {
            bi0Var.C(false);
            this.f45806a9 = null;
        }
        bi0 bi0Var2 = this.f45914l8;
        if (bi0Var2 != null) {
            bi0Var2.C(false);
            this.f45914l8 = null;
        }
        f5 f5Var = this.f45906k8;
        if (f5Var != null) {
            f5Var.n(this);
            this.f45906k8 = null;
            this.f45923m8 = 0L;
        }
        P0(this.F);
        P0(this.G);
        removeCallbacks(this.p9);
        v5 v5Var = this.f45880i2;
        if (v5Var != null) {
            v5Var.f();
        }
        VelocityTracker velocityTracker = this.f45898k0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f45898k0 = null;
        }
        VelocityTracker velocityTracker2 = this.f45924m9;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.f45924m9 = null;
        }
        HashMap hashMap = this.J7;
        for (f5 f5Var2 : hashMap.values()) {
            f5Var2.n(this);
        }
        for (Drawable drawable : this.J.values()) {
            if (drawable instanceof f5) {
                ((f5) drawable).n(this);
            }
        }
        hashMap.clear();
        HashMap hashMap2 = this.K7;
        for (w0 w0Var : hashMap2.values()) {
            d5 d5Var = w0Var.f45794a;
            if (d5Var != null) {
                d5Var.b();
            }
        }
        hashMap2.clear();
    }

    public final void P(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (this.f45947p1 != null && f12 > 0.004f) {
            TextPaint textPaint = this.f46039y2;
            textPaint.setTextSize(org.telegram.messenger.i0.L(15.0f));
            textPaint.setColor(-1);
            textPaint.setAlpha((int) (f12 * 255.0f));
            canvas.drawText(this.f45947p1, ((f7 + f11) - org.telegram.messenger.i0.L(16.0f)) - textPaint.measureText(this.f45947p1), f10 + org.telegram.messenger.i0.L(5.0f), textPaint);
            textPaint.setAlpha(255);
        }
    }

    public final void P0(u0 u0Var) {
        if (u0Var != null) {
            f5 f5Var = u0Var.f45764c;
            if (f5Var != null) {
                f5Var.n(this);
            }
            f5 f5Var2 = u0Var.d;
            if (f5Var2 != null && !this.J7.containsValue(f5Var2)) {
                u0Var.d.n(this);
            }
            u0Var.G = true;
            s sVar = u0Var.F;
            if (sVar != null) {
                sVar.e = true;
                zs.f(sVar.f45733a).n(sVar, zs.Y1);
                u0Var.F = null;
            }
        }
    }

    public final void Q(float f7, float f10, float f11, Canvas canvas, boolean z10) {
        Canvas canvas2;
        Drawable drawable;
        float f12;
        float f13;
        if (this.W8 != 0) {
            if (z10) {
                float L = f10 - org.telegram.messenger.i0.L(10.0f);
                Paint.Style style = Paint.Style.STROKE;
                Paint paint = this.R8;
                paint.setStyle(style);
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
                paint.setColor(-1);
                float f14 = 1.0f;
                paint.setAlpha((int) (Color.alpha(-1) * 1.0f));
                float L2 = ((org.telegram.messenger.i0.L(26.0f) + f7) - org.telegram.messenger.i0.L(10.0f)) + org.telegram.messenger.i0.L(10.0f);
                float L3 = L + org.telegram.messenger.i0.L(11.0f);
                float L4 = org.telegram.messenger.i0.L(7.25f);
                if (f11 >= 0.0f) {
                    float l4 = 1.0f - Utilities.l(f11 / 0.42f);
                    float x10 = f1.x(l4, l4, l4, 1.0f);
                    if (f11 < 0.6f) {
                        float f15 = 1.0f - (f11 / 0.6f);
                        f13 = (1.0f - ((f15 * f15) * f15)) * 364.0f;
                    } else {
                        float l10 = Utilities.l((f11 - 0.6f) / 0.12f);
                        f13 = 364.0f - ((3.0f - (l10 * 2.0f)) * ((4.0f * l10) * l10));
                    }
                    f12 = f13;
                    f14 = x10;
                } else {
                    f12 = 0.0f;
                }
                float f16 = L3 - L4;
                RectF rectF = this.S8;
                rectF.set(L2 - L4, f16, L2 + L4, L4 + L3);
                canvas.drawArc(rectF, -82.0f, f14 * 344.0f, false, paint);
                canvas.drawLine(L2, f16, L2, L + org.telegram.messenger.i0.L(2.2f), paint);
                double radians = Math.toRadians(f12 - 90.0f);
                canvas2 = canvas;
                canvas2.drawLine(L2, L3, f1.d(3.8f, (float) Math.cos(radians), L2), f1.d(3.8f, (float) Math.sin(radians), L3), paint);
                paint.setStyle(Paint.Style.FILL);
                canvas2.drawCircle(L2, L3, org.telegram.messenger.i0.N(1.2f), paint);
            } else {
                canvas2 = canvas;
                if (n()) {
                    bi0 p12 = p1();
                    int L5 = org.telegram.messenger.i0.L(28.0f);
                    float f17 = L5 / 2.0f;
                    int i10 = (int) (f10 - f17);
                    p12.setBounds((int) ((org.telegram.messenger.i0.L(26.0f) + f7) - f17), i10, ((int) ((org.telegram.messenger.i0.L(26.0f) + f7) - f17)) + L5, L5 + i10);
                    p12.draw(canvas2);
                } else {
                    int i11 = this.W8;
                    if (i11 == 2131232113) {
                        bi0 q12 = q1();
                        int L6 = org.telegram.messenger.i0.L(28.0f);
                        float f18 = L6 / 2.0f;
                        int i12 = (int) (f10 - f18);
                        q12.setBounds((int) ((org.telegram.messenger.i0.L(26.0f) + f7) - f18), i12, ((int) ((org.telegram.messenger.i0.L(26.0f) + f7) - f18)) + L6, L6 + i12);
                        q12.draw(canvas2);
                    } else {
                        if (i11 == 2131232341) {
                            drawable = this.R1;
                        } else if (i11 == 2131232102) {
                            drawable = this.J1;
                        } else {
                            drawable = this.S1;
                        }
                        o0(canvas2, drawable, f7 + org.telegram.messenger.i0.L(26.0f), f10, org.telegram.messenger.i0.L(20.0f), 1.0f);
                        canvas2 = canvas2;
                    }
                }
            }
        } else {
            canvas2 = canvas;
            bi0 r12 = r1();
            int L7 = org.telegram.messenger.i0.L(27.0f);
            float f19 = L7 / 2.0f;
            int i13 = (int) (f10 - f19);
            r12.setBounds((int) ((org.telegram.messenger.i0.L(26.0f) + f7) - f19), i13, ((int) ((org.telegram.messenger.i0.L(26.0f) + f7) - f19)) + L7, L7 + i13);
            r12.draw(canvas2);
        }
        TextPaint textPaint = this.C1;
        textPaint.setColor(-1);
        float f20 = this.f45976s1;
        if (f20 <= 0.0f) {
            f20 = org.telegram.messenger.i0.L(15.0f);
        }
        textPaint.setTextSize(f20);
        String str = this.U8;
        float L8 = f7 + org.telegram.messenger.i0.L(48.0f);
        float L10 = org.telegram.messenger.i0.L(5.0f) + f10;
        int indexOf = str.indexOf(10);
        if (indexOf >= 0) {
            canvas2.drawText(str, 0, indexOf, L8, L10 - org.telegram.messenger.i0.L(9.0f), (Paint) textPaint);
            canvas.drawText(str, indexOf + 1, str.length(), L8, L10 + org.telegram.messenger.i0.L(9.0f), (Paint) textPaint);
        } else if (!s0(str)) {
            canvas2.drawText(str, L8, L10, textPaint);
        } else {
            float textSize = textPaint.getTextSize();
            TextPaint textPaint2 = this.f46039y2;
            textPaint2.setTextSize(textSize);
            textPaint2.setColor(textPaint.getColor());
            canvas2.drawText(this.f46007v2, L8, L10, textPaint);
            float measureText = textPaint.measureText(this.f46007v2) + L8;
            canvas2.drawText(this.f46018w2, measureText, L10, textPaint2);
            canvas2.drawText(this.f46028x2, textPaint2.measureText(this.f46018w2) + measureText, L10, textPaint);
        }
    }

    public final void Q0() {
        int i10 = this.f45973r9;
        if (i10 >= 0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f46045y9[i10] = X0(i10, currentAnimationTimeMillis);
            this.f46035x9[i10] = currentAnimationTimeMillis;
            invalidate();
        }
        this.f45973r9 = -1;
    }

    public final void R(android.graphics.Canvas r28, int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: qh.x0.R(android.graphics.Canvas, int, long):void");
    }

    public final void R0() {
        float f7 = this.f45839e0;
        if (f7 == 0.0f && this.f45849f0 == 0.0f) {
            return;
        }
        this.f45878i0 = f7;
        this.f45888j0 = this.f45849f0;
        this.W = AnimationUtils.currentAnimationTimeMillis();
        this.U = true;
    }

    public final void S0() {
        int i10 = this.V7;
        if (i10 >= 0 && this.X7 < this.W7) {
            this.Y7 = k1(i10);
            this.X7 = AnimationUtils.currentAnimationTimeMillis();
            invalidate();
        }
    }

    public final float T(float f7) {
        float f10;
        if (this.Q4 >= 1.0f) {
            return 1.0f;
        }
        if (this.T4) {
            f10 = 0.85f;
        } else {
            f10 = 0.92f;
        }
        return org.telegram.messenger.i0.T1(f10, 1.0f, f7);
    }

    public final android.graphics.Bitmap T0() {
        throw new UnsupportedOperationException("Method not decompiled: qh.x0.T0():android.graphics.Bitmap");
    }

    public final Drawable U(String str) {
        HashMap hashMap = this.J;
        Drawable drawable = (Drawable) hashMap.get(str);
        if (drawable == null) {
            drawable = k6.g(str);
            if (drawable == null) {
                drawable = k6.g(str.replace("️", ""));
            }
            if (drawable != null) {
                hashMap.put(str, drawable);
            }
        }
        return drawable;
    }

    public final void U0(String str) {
        boolean z10;
        if (this.f46005v0) {
            int L = org.telegram.messenger.i0.L(12.0f) + org.telegram.messenger.i0.L(8.0f);
            this.f45987t2 = this.L0.c() + org.telegram.messenger.i0.L(2.0f) + L + org.telegram.messenger.i0.L(11.0f);
            this.f46005v0 = false;
            this.A0 = false;
            if (this.B0 * this.G0 > 0.001f) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f45977s2 = z10;
            this.f45956q2 = AnimationUtils.currentAnimationTimeMillis();
            this.C0 = this.B0;
            this.D0 = 0.0f;
            this.E0 = System.currentTimeMillis();
            f fVar = this.f45985t0;
            if (fVar != null) {
                j1(fVar);
            }
            u1(true);
            if (str != null) {
                d1(0, str, null);
            }
            i0();
            this.e = null;
            this.f45995u0 = null;
            l2.f fVar2 = this.f45818c;
            if (fVar2 != null) {
                fVar2.B(0);
            }
        }
    }

    public final Bitmap V(f5 f5Var) {
        Bitmap n10;
        ag.c2 c2Var = f5Var.f25975k;
        if (c2Var != null) {
            bi0 B = c2Var.B();
            if (B != null) {
                if (!this.T2) {
                    B.V(0L);
                }
                if (B.u()) {
                    if (B.Q != null) {
                        return B.Q;
                    }
                    if (B.R == null) {
                        return null;
                    }
                    return B.R;
                }
            } else {
                s5 m10 = c2Var.m();
                if (m10 != null) {
                    if (!this.T2) {
                        m10.D(System.currentTimeMillis());
                    }
                    if (m10.s()) {
                        return m10.m();
                    }
                } else if (c2Var.J() && c2Var.L() && (n10 = c2Var.n()) != null && !n10.isRecycled()) {
                    return n10;
                }
            }
        }
        return null;
    }

    public final float V0() {
        if (this.f45859g1 < 0.5f) {
            return 1.0f;
        }
        return Utilities.l(((float) (AnimationUtils.currentAnimationTimeMillis() - this.I2)) / 420.0f);
    }

    public final qh.u0 W() {
        throw new UnsupportedOperationException("Method not decompiled: qh.x0.W():qh.u0");
    }

    public final void X(u0 u0Var) {
        TLRPC.Document document;
        if (u0Var != null && !u0Var.G && u0Var.f45762a == 2 && u0Var.F == null && (document = u0Var.A) != null) {
            u0Var.F = new s(this.f45807b, document, u0Var.B, org.telegram.messenger.i0.L(48.0f), new f11(25, this, u0Var));
        }
    }

    public final float X0(int i10, long j10) {
        return 1.0f - ((1.0f - this.f46055z9[i10]) * ((float) Math.exp(((float) (-(j10 - this.w9[i10]))) / 90.0f)));
    }

    public final boolean Y(Bitmap bitmap) {
        float[] fArr = y0.f46092b;
        float f7 = fArr[36];
        float f10 = fArr[38];
        float f11 = fArr[24];
        if (this.S3 != null && this.T3 == bitmap && f7 == this.U3 && f10 == this.V3 && f11 == this.W3) {
            return true;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            return false;
        }
        this.T3 = bitmap;
        this.U3 = f7;
        this.V3 = f10;
        this.W3 = f11;
        Bitmap bitmap2 = this.S3;
        if (bitmap2 == null || bitmap2.getWidth() != bitmap.getWidth() || this.S3.getHeight() != bitmap.getHeight()) {
            this.S3 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        }
        this.S3.eraseColor(0);
        Canvas canvas = new Canvas(this.S3);
        double radians = Math.toRadians(f11);
        float f12 = (float) (-Math.cos(radians));
        float f13 = (float) (-Math.sin(radians));
        float N = org.telegram.messenger.i0.N(f7);
        float N2 = org.telegram.messenger.i0.N(f10);
        float f14 = f12 * N2;
        float f15 = N2 * f13;
        canvas.drawBitmap(bitmap, f14, f15, (Paint) null);
        canvas.drawBitmap(bitmap, f14 - (f12 * N), f15 - (f13 * N), this.X3);
        return true;
    }

    public final void Y0(v0 v0Var, float f7, float f10) {
        if (v0Var != null) {
            this.f45815b7 = W0(v0Var.f45788c);
        }
        if (this.f45851f2) {
            if (this.f45963r != null) {
                this.f45963r = null;
            }
            this.f45925n = v0Var;
            this.f45974s = 1.0f;
            invalidate();
            return;
        }
        this.f45963r = this.f45925n;
        this.f45925n = v0Var;
        this.f45974s = 0.0f;
        this.f46015w = System.currentTimeMillis();
        this.f46025x = f7;
        this.f46036y = f10;
        this.f45954q0++;
        i0();
        invalidate();
    }

    public final void Z(u0 u0Var) {
        f5 f5Var;
        ag.c2 c2Var;
        if (u0Var != null && u0Var.e == null && (f5Var = u0Var.f45764c) != null) {
            s sVar = u0Var.F;
            if ((sVar == null || sVar.h) && (c2Var = f5Var.f25975k) != null && c2Var.J() && c2Var.L()) {
                int L = org.telegram.messenger.i0.L(48.0f);
                Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                u0Var.f45764c.setBounds(0, 0, L, L);
                u0Var.f45764c.setColorFilter(null);
                u0Var.f45764c.setAlpha(255);
                c2Var.f14384h1 = 1.0f;
                u0Var.f45764c.draw(canvas);
                E0(u0Var, createBitmap);
            }
        }
    }

    public final String a0() {
        String L0 = cd.L0(2131746494, null);
        if (!L0.equals(this.f45997u2)) {
            this.f45997u2 = L0;
            Matcher matcher = Pattern.compile("\\d+").matcher(L0);
            if (matcher.find()) {
                this.f46007v2 = L0.substring(0, matcher.start());
                this.f46018w2 = matcher.group();
                this.f46028x2 = L0.substring(matcher.end());
            } else {
                this.f46007v2 = L0;
                this.f46028x2 = "";
                this.f46018w2 = "";
            }
        }
        return this.f45997u2;
    }

    public final float a1() {
        return (getHeight() - this.f45998u3) - org.telegram.messenger.i0.L(10.0f);
    }

    public final float b(double d) {
        float f7 = this.A4;
        double sin = Math.sin((f7 * 78.233d) + (((f7 * 17.31d) + d) * 12.9898d)) * 43758.5453d;
        return ((float) (sin - Math.floor(sin))) * 300.0f;
    }

    public final float b1() {
        float L;
        float max = Math.max(org.telegram.messenger.i0.L(160.0f), a1() - ((((l() + (org.telegram.messenger.i0.L(51.0f) + this.f45988t3)) + org.telegram.messenger.i0.L(24.0f)) + org.telegram.messenger.i0.L(11.0f)) + org.telegram.messenger.i0.L(13.0f)));
        if (this.f45869h1 == 2 && this.f46027x1) {
            ArrayList arrayList = this.f46006v1;
            if (arrayList.size() <= 3) {
                float A = (z20.A(10.0f, 2, getWidth()) - org.telegram.messenger.i0.L(8.0f)) / 3.0f;
                if (arrayList.isEmpty()) {
                    L = org.telegram.messenger.i0.L(286.0f);
                } else {
                    L = org.telegram.messenger.i0.L(8.0f) + A;
                }
                max = Math.min(max, L);
            }
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f7 = this.P2;
        if (f7 >= 0.0f && this.f45850f1 >= 0.01f) {
            if (f7 != max) {
                long min = Math.min(64L, Math.max(0L, currentAnimationTimeMillis - this.Q2));
                float f10 = this.P2;
                float z10 = c3.i0.z(1.0f, (float) Math.exp(((float) (-min)) / 140.0f), max - f10, f10);
                this.P2 = z10;
                if (Math.abs(max - z10) < 0.5f) {
                    this.P2 = max;
                } else {
                    invalidate();
                }
            }
        } else {
            this.P2 = max;
        }
        this.Q2 = currentAnimationTimeMillis;
        return this.P2;
    }

    public final void c() {
        v0 v0Var;
        Runnable runnable = this.f45831d2;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.f45841e2 && !this.I.isEmpty() && (v0Var = this.f45925n) != null && (v0Var.f45786a != 0 || this.F.f45762a == 2)) {
            this.T7 = AnimationUtils.currentAnimationTimeMillis();
            this.Q7 = -1;
            this.O7 = 0.0f;
            setSceneFromCard(t(this.M7));
        }
        setPattern(W());
        if (!this.f45851f2) {
            this.f45964r0 = AnimationUtils.currentAnimationTimeMillis();
        }
        B0();
    }

    public final float c1(float f7, float f10, int i10, int i11) {
        float f11;
        float f12;
        float f13;
        float f14;
        int i12;
        float f15;
        float f16;
        float asin;
        if (!this.y3) {
            return 0.0f;
        }
        float f17 = i10;
        float f18 = f7 - (f17 / 2.0f);
        float f19 = this.H3;
        float f20 = i11;
        float f21 = f10 - (f20 / 2.0f);
        float f22 = (this.I3 * f21) + (f18 * f19);
        float f23 = 1.0f;
        float max = Math.max(1.0f, ((Math.abs(this.I3) * f20) + (Math.abs(f19) * f17)) / 2.0f);
        float[] fArr = y0.f46092b;
        float f24 = fArr[19] / 100.0f;
        if (f24 > 0.0f) {
            float f25 = this.I3;
            float max2 = ((f21 * this.H3) + (f18 * (-f25))) / Math.max(1.0f, ((Math.abs(this.H3) * f20) + (Math.abs(f25) * f17)) / 2.0f);
            f22 -= ((f24 * f17) * max2) * max2;
        }
        float f26 = (f22 - this.f46019w3) / this.f46029x3;
        float f27 = fArr[20] / 100.0f;
        if (f27 > 0.0f) {
            f26 += (((((float) Math.asin(Math.max(-1.0f, Math.min(1.0f, f22 / max)))) - Math.max(-2.1991148f, Math.min(2.1991148f, (this.f46019w3 / max) * 1.5707964f))) / ((this.f46029x3 / max) * 1.5707964f)) - f26) * f27;
            f11 = sc.e.z(1.0f, (float) Math.cos(Math.max(-1.5707964f, Math.min(1.5707964f, asin))), (f27 * fArr[31]) / 100.0f, 1.0f);
        } else {
            f11 = 1.0f;
        }
        this.f45940o4 = f26;
        float f28 = this.E3;
        this.f45950p4 = f28 * f11;
        float f29 = fArr[34] / 100.0f;
        int i13 = (f26 > 4.0f ? 1 : (f26 == 4.0f ? 0 : -1));
        if ((i13 > 0 || f26 < -4.0f) && f29 <= 0.0f) {
            this.f45919m4 = 0.0f;
            return 0.0f;
        }
        float f30 = fArr[32];
        float f31 = f26 / fArr[29];
        u0 u0Var = this.F;
        if (u0Var != null && u0Var.f45762a == 1) {
            f23 = 0.7f;
        }
        float f32 = f11 * f23;
        if (f31 > 4.0f || f31 < -4.0f) {
            f12 = 0.0f;
            f13 = f32;
            f14 = 4.0f;
            i12 = i13;
            f15 = 0.0f;
        } else {
            float abs = Math.abs(f31);
            f12 = 0.0f;
            f13 = f32;
            f14 = 4.0f;
            i12 = i13;
            f15 = f28 * f32 * ((float) Math.exp(Math.pow(abs, f30) * (-0.5d)));
        }
        this.f45919m4 = f15;
        float f33 = fArr[28] / 100.0f;
        if (i12 <= 0 && f26 >= -4.0f) {
            f16 = (float) Math.exp(Math.pow(Math.abs(f26), f30) * (-0.5d));
        } else {
            f16 = f12;
        }
        float f34 = f33 * f16;
        if (f29 > f12) {
            float f35 = f26 - fArr[33];
            if (f35 < f14 && f35 > -4.0f) {
                f34 += f29 * ((float) Math.exp(Math.pow(Math.abs(f35), f30) * (-0.5d)));
            }
        }
        return this.E3 * f13 * f34;
    }

    public final void d(int i10) {
        boolean z10 = true;
        this.f45841e2 = true;
        if (this.F.f45762a == 0) {
            z10 = false;
        }
        this.I.clear();
        this.O7 = 0.0f;
        this.M7 = i10;
        v0 v0Var = this.f45925n;
        if (v0Var == null || v0Var.f45786a != 0 || v0Var.f45789f != i10) {
            setSceneFromCard(t(i10));
        }
        if (z10) {
            setPattern(new u0());
        }
        Runnable runnable = this.f45831d2;
        if (runnable != null) {
            runnable.run();
        }
        this.f45841e2 = false;
    }

    public final void d1(int i10, String str, String str2) {
        int i11;
        long currentTimeMillis = 0 - System.currentTimeMillis();
        if (currentTimeMillis > 0) {
            postDelayed(new c11(this, i10, str, str2, 16), currentTimeMillis);
            return;
        }
        this.f45927n1 = i10;
        this.f45916m1 = str;
        this.f45937o1 = str2;
        long currentTimeMillis2 = System.currentTimeMillis();
        if (str2 != null) {
            i11 = 4000;
        } else {
            i11 = 2800;
        }
        this.f45996u1 = currentTimeMillis2 + i11;
        invalidate();
    }

    public final void e(int i10, ArrayList arrayList, boolean z10) {
        String str;
        int i11 = -1;
        if (z10 && a.h != null) {
            int i12 = 0;
            while (true) {
                int[] iArr = a.h;
                if (i12 >= iArr.length) {
                    break;
                } else if (iArr[i12] == i10) {
                    i11 = i12;
                    break;
                } else {
                    i12++;
                }
            }
        }
        if (i11 < 0) {
            i11 = G9;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f45841e2 = true;
            this.M7 = i11;
            v0 v0Var = this.f45925n;
            if (v0Var == null || v0Var.f45786a != 0 || v0Var.f45789f != i11) {
                setSceneFromCard(t(i11));
            }
            this.O7 = 0.0f;
            ArrayList arrayList2 = this.I;
            arrayList2.clear();
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                TLRPC.Reaction reaction = (TLRPC.Reaction) obj;
                if (arrayList2.size() >= 6) {
                    break;
                } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                    long j10 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
                    String l4 = a1.g.l(j10, "c:");
                    HashMap hashMap = this.J;
                    if (!hashMap.containsKey(l4)) {
                        f5 m10 = f5.m(this.f45807b, j10, null, 2);
                        m10.a(this);
                        hashMap.put(l4, m10);
                    }
                    if (!arrayList2.contains(l4)) {
                        arrayList2.add(l4);
                    }
                } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
                    TLRPC.TL_reactionEmoji tL_reactionEmoji = (TLRPC.TL_reactionEmoji) reaction;
                    if (!TextUtils.isEmpty(tL_reactionEmoji.emoticon)) {
                        String str2 = tL_reactionEmoji.emoticon;
                        if (str2 != null && !str2.startsWith("c:")) {
                            str = str2.replace("️", "");
                        } else {
                            str = str2;
                        }
                        this.f45821c2.put(str, str2);
                        if (!arrayList2.contains(str)) {
                            arrayList2.add(str);
                        }
                    }
                }
            }
            c();
            this.f45841e2 = false;
            return;
        }
        d(i11);
    }

    public final void e0(int[] iArr, int i10) {
        iArr[0] = -7829368;
        iArr[1] = -11184811;
        iArr[2] = -13421773;
        ArrayList<TL_stars.StarGiftAttribute> arrayList = ((TL_stars.TL_starGiftUnique) this.f46006v1.get(i10)).attributes;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i11);
            i11++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributeBackdrop) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) starGiftAttribute2;
                iArr[0] = stargiftattributebackdrop.center_color | (-16777216);
                iArr[1] = stargiftattributebackdrop.edge_color | (-16777216);
                iArr[2] = stargiftattributebackdrop.pattern_color | (-16777216);
            }
        }
    }

    public final float f(float f7, float f10, float f11) {
        float z10 = c3.i0.z(f10, f7, 1.0f - ((float) Math.pow(1.0f - f11, this.X2)), f7);
        if (Math.abs(f10 - z10) < 0.002f) {
            return f10;
        }
        return z10;
    }

    public final int f0() {
        int size = this.f46006v1.size();
        if (!this.f46027x1 || size <= 0 || size >= 3) {
            return 3;
        }
        return size;
    }

    public final f5 g0(long j10, TLRPC.Document document) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.J7;
        f5 f5Var = (f5) hashMap.get(valueOf);
        if (f5Var == null) {
            f5 l4 = f5.l(this.f45807b, 24, document);
            l4.a(this);
            hashMap.put(Long.valueOf(j10), l4);
            return l4;
        }
        return f5Var;
    }

    public String getCurrentLink() {
        String str;
        if (this.f46005v0 && (str = this.e) != null && this.f45995u0 != null) {
            return str;
        }
        if (this.f45985t0 != null) {
            return this.d;
        }
        return null;
    }

    public ArrayList<TLRPC.Reaction> getPickedEmoji() {
        ArrayList<TLRPC.Reaction> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.I;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            String str = (String) obj;
            if (str.startsWith("c:")) {
                try {
                    TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
                    tL_reactionCustomEmoji.document_id = Long.parseLong(str.substring(2));
                    arrayList.add(tL_reactionCustomEmoji);
                } catch (NumberFormatException unused) {
                }
            } else {
                TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                String str2 = (String) this.f45821c2.get(str);
                if (str2 != null) {
                    str = str2;
                }
                tL_reactionEmoji.emoticon = str;
                arrayList.add(tL_reactionEmoji);
            }
        }
        return arrayList;
    }

    public int getThemeBackdropIndex() {
        v0 v0Var = this.f45925n;
        if (v0Var != null && v0Var.f45786a == 0) {
            return v0Var.f45789f;
        }
        return -1;
    }

    public TL_stars.TL_starGiftUnique getThemeGift() {
        int i10;
        u0 u0Var = this.F;
        if (u0Var.f45762a == 2 && (i10 = u0Var.f45775q) >= 0) {
            ArrayList arrayList = this.f46006v1;
            if (i10 < arrayList.size()) {
                return (TL_stars.TL_starGiftUnique) arrayList.get(this.F.f45775q);
            }
            return null;
        }
        return null;
    }

    public long getThemeGiftSavedId() {
        Long l4;
        TL_stars.TL_starGiftUnique themeGift = getThemeGift();
        if (themeGift != null) {
            l4 = (Long) this.f46038y1.get(Long.valueOf(themeGift.f20021id));
        } else {
            l4 = null;
        }
        if (l4 != null) {
            return l4.longValue();
        }
        return 0L;
    }

    public final boolean h0() {
        if (this.f46027x1 && this.f46006v1.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i0() {
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final boolean j0(Canvas canvas) {
        if (i()) {
            if ((this.S4 || this.Z1) && canvas.isHardwareAccelerated() && u.e(this.H1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void j1(f fVar) {
        g gVar = this.f45975s0;
        if (gVar.f45630q == 2 && gVar.f45628o < 1.0f) {
            gVar.f45626m = fVar;
            invalidate();
            return;
        }
        postDelayed(new v1(21, this, fVar), 40L);
    }

    public final float k1(int i10) {
        if (i10 != this.V7) {
            return 1.0f;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        long j10 = this.X7;
        long j11 = this.W7;
        if (j10 < j11) {
            float l4 = 1.0f - Utilities.l(((float) (currentAnimationTimeMillis - j11)) / 110.0f);
            return 1.0f - ((1.0f - (l4 * l4)) * 0.08f);
        }
        double h12 = h1(((float) (currentAnimationTimeMillis - j10)) / 1000.0f, 0.6d, 0.28d);
        if (currentAnimationTimeMillis - this.X7 > 900) {
            this.V7 = -1;
            return 1.0f;
        }
        float f7 = this.Y7;
        return ((1.0f - f7) * ((float) h12)) + f7;
    }

    public final float l() {
        return org.telegram.messenger.i0.T1(1.07f, 1.0f, this.C2) * getWidth() * 0.745f;
    }

    public final void l0() {
        if (this.U8 == null) {
            this.f45996u1 = 0L;
            return;
        }
        this.f45996u1 = 0L;
        if (this.N8) {
            this.N8 = false;
            this.M8 = AnimationUtils.currentAnimationTimeMillis();
        }
        this.V8 = true;
        invalidate();
    }

    public final float m() {
        float max = ((1.0f - Math.max(this.J2, this.C2)) * org.telegram.messenger.i0.L(16.0f)) + (((getHeight() * 0.468f) - (l() / 2.0f)) - org.telegram.messenger.i0.L(15.0f));
        float a12 = (((a1() - b1()) - org.telegram.messenger.i0.L(13.0f)) - (org.telegram.messenger.i0.L(35.0f) * Math.max(this.J2, this.C2))) - l();
        return org.telegram.messenger.i0.T1(max, Math.max(org.telegram.messenger.i0.L(51.0f) + this.f45988t3, Math.min(max, a12)), this.f45850f1);
    }

    public final w0 m1(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        Long valueOf = Long.valueOf(tL_starGiftUnique.f20021id);
        HashMap hashMap = this.K7;
        w0 w0Var = (w0) hashMap.get(valueOf);
        w0 w0Var2 = w0Var;
        if (w0Var == null) {
            ?? obj = new Object();
            ArrayList<TL_stars.StarGiftAttribute> arrayList = tL_starGiftUnique.attributes;
            int size = arrayList.size();
            TLRPC.Document document = null;
            int i10 = 0;
            while (i10 < size) {
                TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i10);
                i10++;
                TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                    document = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document;
                }
            }
            if (document != null) {
                d5 d5Var = new d5(org.telegram.messenger.i0.L(28.0f), this);
                obj.f45794a = d5Var;
                d5Var.i(document, false);
                obj.f45794a.a();
                obj.f45795b = document.f19799id;
            }
            hashMap.put(Long.valueOf(tL_starGiftUnique.f20021id), obj);
            w0Var2 = obj;
        }
        return w0Var2;
    }

    public final boolean n() {
        String str;
        if (this.W8 == 2131232341 && (str = this.U8) != null && !s0(str)) {
            return true;
        }
        return false;
    }

    public final boolean n0(float f7, float f10) {
        if (this.f45947p1 != null && this.N8) {
            RectF rectF = this.L8;
            if (!rectF.isEmpty()) {
                float f11 = rectF.right;
                TextPaint textPaint = this.f46039y2;
                textPaint.setTextSize(org.telegram.messenger.i0.L(15.0f));
                float L = rectF.bottom + org.telegram.messenger.i0.L(6.0f);
                RectF rectF2 = this.f45955q1;
                rectF2.set((f11 - textPaint.measureText(this.f45947p1)) - org.telegram.messenger.i0.L(28.0f), rectF.top - org.telegram.messenger.i0.L(6.0f), rectF.right + org.telegram.messenger.i0.L(6.0f), L);
                return rectF2.contains(f7, f10);
            }
            return false;
        }
        return false;
    }

    public final PorterDuffColorFilter n1(int i10) {
        SparseArray sparseArray = this.e7;
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) sparseArray.get(i10);
        if (porterDuffColorFilter == null) {
            if (sparseArray.size() > 96) {
                sparseArray.clear();
            }
            PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            sparseArray.put(i10, porterDuffColorFilter2);
            return porterDuffColorFilter2;
        }
        return porterDuffColorFilter;
    }

    public final float o() {
        return l() + m() + org.telegram.messenger.i0.L(24.0f);
    }

    public final void o0(Canvas canvas, Drawable drawable, float f7, float f10, float f11, float f12) {
        drawable.setColorFilter(n1(-1));
        drawable.setAlpha((int) (f12 * 255.0f));
        float f13 = f11 / 2.0f;
        drawable.setBounds((int) (f7 - f13), (int) (f10 - f13), (int) (f7 + f13), (int) (f10 + f13));
        drawable.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        Sensor sensor;
        super.onAttachedToWindow();
        K0();
        int i10 = this.f46042y6;
        SparseIntArray sparseIntArray = this.f46032x6;
        if (i10 != 1) {
            sparseIntArray.clear();
            this.f46042y6 = 1;
        }
        int i11 = 0;
        while (true) {
            int[] iArr = a.f45560b;
            if (i11 >= iArr.length) {
                break;
            }
            ?? obj = new Object();
            int i12 = iArr[i11] | (-16777216);
            obj.f45787b = i12;
            obj.f45788c = (-16777216) | a.f45561c[i11];
            obj.h = Z0(i12);
            if (sparseIntArray.indexOfKey(obj.f45787b) < 0) {
                sparseIntArray.put(obj.f45787b, u(obj));
            }
            i11++;
        }
        zs.f(this.f45807b).c(this.f45890j2, zs.G3);
        y0();
        SensorManager sensorManager = (SensorManager) getContext().getSystemService("sensor");
        this.N6 = sensorManager;
        if (sensorManager != null) {
            sensor = sensorManager.getDefaultSensor(9);
        } else {
            sensor = null;
        }
        if (sensor != null) {
            this.N6.registerListener(this.O6, sensor, 1);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zs.f(this.f45807b).n(this.f45890j2, zs.G3);
        removeCallbacks(this.f45900k2);
        SensorManager sensorManager = this.N6;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.O6);
        }
        this.L6 = false;
        this.f45973r9 = -1;
        Arrays.fill(this.f46035x9, 0L);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r47) {
        throw new UnsupportedOperationException("Method not decompiled: qh.x0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int top;
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = org.telegram.messenger.i0.f16020m;
        View view = this;
        int i15 = 0;
        while (true) {
            top = view.getTop() + i15;
            if (!(view.getParent() instanceof View)) {
                break;
            }
            view = (View) view.getParent();
            i15 = top - view.getScrollY();
        }
        this.f45988t3 = Math.max(Math.max(0, i14 - top), (org.telegram.messenger.i0.L(20.0f) + org.telegram.messenger.i0.L(9.0f)) - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2));
        int height = getRootView().getHeight();
        View view2 = this;
        int i16 = 0;
        while (true) {
            int top2 = view2.getTop() + i16;
            if (!(view2.getParent() instanceof View)) {
                this.f45998u3 = i0.a.d(20.0f, org.telegram.messenger.i0.L(22.0f), Math.max(0, org.telegram.messenger.i0.f16021n - (height - (getHeight() + top2))));
                return;
            }
            view2 = (View) view2.getParent();
            i16 = top2 - view2.getScrollY();
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (i10 > 0 && i11 > 0) {
            float L = org.telegram.messenger.i0.L(12.0f);
            int ceil = ((int) Math.ceil(i10 / L)) + 1;
            int ceil2 = ((int) Math.ceil(i11 / L)) + 1;
            Bitmap bitmap = this.f46049z3;
            if (bitmap == null || bitmap.getWidth() != ceil || this.f46049z3.getHeight() != ceil2) {
                this.f46049z3 = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                this.A3 = new int[ceil * ceil2];
            }
        }
        super.onSizeChanged(i10, i11, i12, i13);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r40) {
        throw new UnsupportedOperationException("Method not decompiled: qh.x0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(float f7, float f10, float f11) {
        int i10;
        float L;
        float nextFloat;
        float f12;
        float d;
        int i11 = this.f45820c1;
        if (i11 >= 320) {
            return;
        }
        this.f45820c1 = i11 + 1;
        Random random = this.f45840e1;
        float nextFloat2 = random.nextFloat();
        if (nextFloat2 < 0.65f) {
            i10 = 0;
        } else if (nextFloat2 < 0.9f) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        byte[] bArr = this.f45799a1;
        bArr[i11] = (byte) i10;
        this.f45809b1[i11] = false;
        this.M0[i11] = ((random.nextFloat() - 0.5f) * org.telegram.messenger.i0.L(4.0f)) + f7;
        this.N0[i11] = f10;
        byte b10 = bArr[i11];
        if (b10 == 0) {
            L = org.telegram.messenger.i0.L(1.4f);
            nextFloat = random.nextFloat();
            f12 = 1.6f;
        } else if (b10 == 1) {
            d = f1.d(0.7f, random.nextFloat(), org.telegram.messenger.i0.N(0.7f));
            this.S0[i11] = d;
            this.O0[i11] = (random.nextFloat() * org.telegram.messenger.i0.L(80.0f)) + (-org.telegram.messenger.i0.L(30.0f));
            this.P0[i11] = (-org.telegram.messenger.i0.L(50.0f)) - (random.nextFloat() * org.telegram.messenger.i0.L(100.0f));
            this.Q0[i11] = Math.max(0.05f, Math.min((random.nextFloat() * 0.2f) + 0.3f, f11));
            this.R0[i11] = 0.0f;
            this.T0[i11] = random.nextFloat() * 90.0f;
            this.U0[i11] = (random.nextFloat() - 0.5f) * 1080.0f;
        } else {
            L = org.telegram.messenger.i0.L(3.0f);
            nextFloat = random.nextFloat();
            f12 = 1.5f;
        }
        d = (nextFloat * org.telegram.messenger.i0.L(f12)) + L;
        this.S0[i11] = d;
        this.O0[i11] = (random.nextFloat() * org.telegram.messenger.i0.L(80.0f)) + (-org.telegram.messenger.i0.L(30.0f));
        this.P0[i11] = (-org.telegram.messenger.i0.L(50.0f)) - (random.nextFloat() * org.telegram.messenger.i0.L(100.0f));
        this.Q0[i11] = Math.max(0.05f, Math.min((random.nextFloat() * 0.2f) + 0.3f, f11));
        this.R0[i11] = 0.0f;
        this.T0[i11] = random.nextFloat() * 90.0f;
        this.U0[i11] = (random.nextFloat() - 0.5f) * 1080.0f;
    }

    public final bi0 p1() {
        if (this.Z8 == null) {
            bi0 bi0Var = new bi0(2131623989, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f));
            this.Z8 = bi0Var;
            bi0Var.setColorFilter(new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.2126f, 0.7152f, 0.0722f, 1.0f, -255.0f}));
            this.Z8.K(0);
            this.Z8.R(this);
            this.Z8.J(true);
        }
        return this.Z8;
    }

    public final void q(float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z10, boolean z11) {
        float f17;
        int i10 = this.f45820c1;
        if (i10 >= 320) {
            return;
        }
        this.f45820c1 = i10 + 1;
        this.f45799a1[i10] = z10 ? (byte) 1 : (byte) 0;
        this.f45809b1[i10] = true;
        this.M0[i10] = f7;
        this.N0[i10] = f10;
        this.O0[i10] = f11;
        this.P0[i10] = f12;
        this.V0[i10] = f7;
        this.W0[i10] = f10;
        this.X0[i10] = f13;
        Random random = this.f45840e1;
        if (z11) {
            f17 = (random.nextFloat() * 3.0f) + 4.0f;
        } else {
            f17 = 0.0f;
        }
        this.Y0[i10] = f17;
        this.Z0[i10] = random.nextFloat() * 6.2832f;
        this.S0[i10] = f14;
        this.Q0[i10] = f15;
        this.R0[i10] = 0.0f;
        this.T0[i10] = f16;
        this.U0[i10] = 0.0f;
    }

    public final bi0 q1() {
        if (this.f45806a9 == null) {
            bi0 bi0Var = new bi0(2131624054, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f));
            this.f45806a9 = bi0Var;
            bi0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            this.f45806a9.K(0);
            this.f45806a9.R(this);
            this.f45806a9.J(true);
        }
        return this.f45806a9;
    }

    public final bi0 r1() {
        if (this.Y8 == null) {
            bi0 bi0Var = new bi0(2131624214, org.telegram.messenger.i0.L(27.0f), org.telegram.messenger.i0.L(27.0f));
            this.Y8 = bi0Var;
            bi0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            this.Y8.K(0);
            this.Y8.R(this);
            this.Y8.J(true);
        }
        return this.Y8;
    }

    public final boolean s0(String str) {
        if (str != null && str.equals(this.f45997u2)) {
            return true;
        }
        return false;
    }

    public final float s1(String str) {
        int indexOf = str.indexOf(10);
        TextPaint textPaint = this.C1;
        if (indexOf >= 0) {
            return Math.max(textPaint.measureText(str, 0, indexOf), textPaint.measureText(str, indexOf + 1, str.length()));
        }
        if (!s0(str)) {
            return textPaint.measureText(str);
        }
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = this.f46039y2;
        textPaint2.setTextSize(textSize);
        return textPaint.measureText(this.f46028x2) + textPaint2.measureText(this.f46018w2) + textPaint.measureText(this.f46007v2);
    }

    public void setFeeStars(long j10) {
        boolean z10;
        String str;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.K0 = z10;
        String str2 = "";
        if (i10 <= 0) {
            str = "";
        } else {
            str = cd.a0(null, null, 2131746496, cd.E(j10, ','));
        }
        int indexOf = str.indexOf(9733);
        if (indexOf >= 0) {
            str2 = str.substring(0, indexOf);
        }
        this.I0 = str2;
        if (indexOf >= 0) {
            str = str.substring(indexOf + 1);
        }
        this.J0 = str;
        if (!this.K0 && this.f46005v0) {
            U0(null);
        }
        invalidate();
    }

    public void setFreeLink(String str) {
        if (TextUtils.equals(this.e, str)) {
            return;
        }
        this.e = str;
        if (str == null) {
            this.f45995u0 = null;
            return;
        }
        Utilities.e.c(new org.telegram.utils.twidget.h0(str, new o0(this, str, 1)));
    }

    public void setGiftsOwner(long j10) {
        if (this.f46017w1 == j10) {
            return;
        }
        this.f46017w1 = j10;
        v5 v5Var = this.f45880i2;
        if (v5Var != null) {
            v5Var.f();
        }
        v5 v5Var2 = new v5(this.f45807b, j10, false);
        this.f45880i2 = v5Var2;
        v5Var2.f47578g = 776;
        v5Var2.e = true;
        v5Var2.j(true);
        y0();
    }

    public void setImmediateOnOpen(boolean z10) {
        this.Z1 = z10;
    }

    public void setInstantTheme(boolean z10) {
        this.f45851f2 = z10;
    }

    public void setLinkExpires(long j10) {
        long j11 = this.G2;
        if (j11 == j10) {
            return;
        }
        if (j11 != 0 && j10 != 0) {
            i0();
        }
        this.G2 = j10;
        this.N2 = -1L;
        invalidate();
    }

    public void setOnPicksChanged(Runnable runnable) {
        this.f45831d2 = runnable;
    }

    public void setReveal(float f7) {
        float f10;
        boolean z10;
        float f11;
        int i10;
        float sin;
        this.Q4 = f7;
        float f12 = 1.0f;
        if (this.T4) {
            double d = f7 * 0.86d;
            double sqrt = Math.sqrt(0.18999999999999995d) * 10.134169850289656d;
            if (f7 >= 1.0f) {
                sin = 1.0f;
            } else {
                double d10 = sqrt * d;
                sin = (float) (1.0d - (((Math.sin(d10) * (0.9d / Math.sqrt(0.18999999999999995d))) + Math.cos(d10)) * Math.exp((-9.120752865260691d) * d)));
            }
            float l4 = Utilities.l((f7 - 0.85f) / 0.15f);
            f10 = c3.i0.z(1.0f, sin, c3.i0.D(l4, 2.0f, 3.0f, l4 * l4), sin);
        } else {
            float f13 = 1.0f - f7;
            f10 = 1.0f - (f13 * f13);
        }
        this.U4 = f10;
        int i11 = 0;
        if (f7 < 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.S4 = true;
        }
        if (z10) {
            f11 = Math.round((1.0f - f10) * org.telegram.messenger.i0.L(64.0f));
        } else {
            f11 = 0.0f;
        }
        setTranslationY(f11);
        if (z10) {
            f12 = Utilities.l(f10 / 0.35f);
        }
        setAlpha(f12);
        if (getParent() instanceof View) {
            View view = (View) getParent();
            if (z10) {
                i10 = a(f10, 1073741824);
            } else {
                i10 = 0;
            }
            view.setBackgroundColor(i10);
        }
        float f14 = -1.0f;
        if (!z10) {
            this.f45949p3 = -1.0f;
        }
        if (z10 && this.T4) {
            f14 = Utilities.l(f10);
        }
        this.f45975s0.D = f14;
        if (z10) {
            i11 = 2;
        }
        if (getLayerType() != i11) {
            setLayerType(i11, null);
        }
        invalidate();
    }

    public void setRevealOpening(boolean z10) {
        this.T4 = z10;
    }

    public void setScanHidden(boolean z10) {
        if (this.f45913l7 != z10) {
            this.f45913l7 = z10;
            invalidate();
        }
    }

    public void setTemporaryLink(boolean z10) {
        float f7;
        if (this.B2 == z10) {
            return;
        }
        this.B2 = z10;
        if (!this.H2) {
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.E2 = f7;
            this.C2 = f7;
        }
        invalidate();
    }

    public void setThemeEditable(boolean z10) {
        if (this.f45797a != z10) {
            this.f45797a = z10;
            invalidate();
        }
    }

    public void setTimerOnly(boolean z10) {
        this.f46037y0 = z10;
    }

    public final int t0() {
        int i10;
        int i11 = this.f46042y6;
        SparseIntArray sparseIntArray = this.f46032x6;
        if (i11 != 1) {
            sparseIntArray.clear();
            this.f46042y6 = 1;
        }
        v0 v0Var = this.f45925n;
        if (v0Var != null) {
            i10 = v0Var.f45787b;
        } else {
            i10 = 0;
        }
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        int u10 = u(this.f45925n);
        sparseIntArray.put(i10, u10);
        return u10;
    }

    public final void u1(boolean z10) {
        long max;
        String sb2;
        if (this.f46005v0) {
            if (!this.f46016w0) {
                StringBuilder sb3 = new StringBuilder();
                z20.q(null, 2131746505, sb3, " · ");
                sb2 = a1.g.m(null, 2131746498, sb3);
                this.A2 = -1;
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (this.A0) {
                    max = 60000;
                } else {
                    max = Math.max(0L, this.f46046z0 - currentTimeMillis);
                }
                int ceil = (int) Math.ceil(max / 1000.0d);
                if (ceil != this.A2 || this.f46048z2 == null) {
                    this.A2 = ceil;
                    StringBuilder sb4 = new StringBuilder();
                    z20.q(null, 2131746505, sb4, " · ");
                    sb4.append(cd.a0(null, null, 2131746506, String.format(Locale.US, "%d:%02d", Integer.valueOf(ceil / 60), Integer.valueOf(ceil % 60))));
                    sb2 = sb4.toString();
                } else {
                    return;
                }
            }
            if (!sb2.equals(this.f46048z2)) {
                this.f46048z2 = sb2;
                this.L0.t(sb2, z10, true);
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        bi0 bi0Var;
        if ((drawable instanceof RippleDrawable) || drawable == this.L0 || drawable == this.X1 || (((bi0Var = this.f45914l8) != null && drawable == bi0Var) || super.verifyDrawable(drawable))) {
            return true;
        }
        return false;
    }

    public final Drawable w(int i10) {
        return getContext().getResources().getDrawable(i10).mutate();
    }

    public final float x1(float f7, float f10, int i10, int i11) {
        float f11 = this.f46025x;
        double max = Math.max(f11, i10 - f11);
        float f12 = this.f46036y;
        return (((1.0f - ((float) Math.pow(1.0f - Utilities.l(((float) Math.hypot(f7 - this.f46025x, f10 - this.f46036y)) / (((float) Math.hypot(max, Math.max(f12, i11 - f12))) + org.telegram.messenger.i0.L(60.0f))), 0.4166666567325592d))) * 600.0f) / 1000.0f) - 0.03f;
    }

    public final void y(Canvas canvas, Bitmap bitmap) {
        float f7 = this.f45852f3;
        float f10 = (-f7) / 2.0f;
        float width = (bitmap.getWidth() - 0.5f) * f7;
        float height = (bitmap.getHeight() - 0.5f) * f7;
        RectF rectF = this.f45842e3;
        rectF.set(f10, f10, width, height);
        canvas.drawBitmap(bitmap, (Rect) null, rectF, this.f45811b3);
    }

    public final void y0() {
        long j10;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int i10;
        v5 v5Var = this.f45880i2;
        if (v5Var == null) {
            return;
        }
        u0 u0Var = this.F;
        int i11 = u0Var.f45762a;
        ArrayList arrayList = this.f46006v1;
        if (i11 == 2 && (i10 = u0Var.f45775q) >= 0 && i10 < arrayList.size()) {
            j10 = ((TL_stars.TL_starGiftUnique) arrayList.get(this.F.f45775q)).f20021id;
        } else {
            j10 = 0;
        }
        if (j10 != 0) {
            tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(this.F.f45775q);
        } else {
            tL_starGiftUnique = null;
        }
        arrayList.clear();
        HashMap hashMap = this.f46038y1;
        hashMap.clear();
        ArrayList arrayList2 = v5Var.f47582l;
        int size = arrayList2.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList2.get(i13);
            i13++;
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
            TL_stars.StarGift starGift = savedStarGift.gift;
            if ((starGift instanceof TL_stars.TL_starGiftUnique) && !savedStarGift.refunded) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) starGift;
                if (!tL_starGiftUnique2.burned) {
                    arrayList.add(tL_starGiftUnique2);
                    hashMap.put(Long.valueOf(savedStarGift.gift.f20021id), Long.valueOf(savedStarGift.saved_id));
                }
            }
        }
        if (tL_starGiftUnique != null) {
            int i14 = 0;
            while (true) {
                if (i14 < arrayList.size()) {
                    if (((TL_stars.TL_starGiftUnique) arrayList.get(i14)).f20021id == j10) {
                        break;
                    }
                    i14++;
                } else {
                    i14 = -1;
                    break;
                }
            }
            if (i14 < 0) {
                arrayList.add(0, tL_starGiftUnique);
            } else {
                i12 = i14;
            }
            this.F.f45775q = i12;
            this.L7 = i12;
        }
        boolean z10 = v5Var.f47580j;
        this.f46027x1 = z10;
        if (!z10 && !v5Var.f47579i) {
            v5Var.b();
        }
        if (!arrayList.isEmpty() && !this.f45909l2) {
            this.f45909l2 = true;
            q0 q0Var = this.f45900k2;
            removeCallbacks(q0Var);
            postDelayed(q0Var, 900L);
        }
        invalidate();
    }

    public final void z(android.graphics.Canvas r45, int r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: qh.x0.z(android.graphics.Canvas, int, int):void");
    }

    public final float z0() {
        float f7;
        int f02;
        int L;
        int L2;
        float f10;
        float A = z20.A(10.0f, 2, getWidth()) - org.telegram.messenger.i0.L(8.0f);
        int i10 = this.f45869h1;
        if (i10 == 0) {
            f7 = A / 6.0f;
            f02 = (a.f45560b.length + 5) / 6;
            L = org.telegram.messenger.i0.L(4.0f) - org.telegram.messenger.i0.L(32.0f);
            L2 = org.telegram.messenger.i0.L(4.0f);
        } else {
            if (i10 == 1) {
                f7 = A / 6.0f;
                f10 = 0.0f;
            } else if (h0()) {
                f7 = 0.0f;
                f10 = 0.0f;
            } else {
                f7 = A / 3.0f;
                f02 = ((f0() + this.f46006v1.size()) - 1) / f0();
                L = org.telegram.messenger.i0.L(4.0f) - org.telegram.messenger.i0.L(32.0f);
                L2 = org.telegram.messenger.i0.L(4.0f);
            }
            f02 = 0;
            return Math.max(0.0f, (((f02 * f7) + f10) + org.telegram.messenger.i0.L(32.0f)) - b1());
        }
        f10 = L2 + L;
        return Math.max(0.0f, (((f02 * f7) + f10) + org.telegram.messenger.i0.L(32.0f)) - b1());
    }
}
