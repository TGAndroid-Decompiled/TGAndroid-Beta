package zh;

import ai.x9;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
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
import ci.g3;
import com.google.android.gms.internal.cast.a6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.az0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.q10;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Wallet.k5;
import v7.x7;
public final class b1 extends View {
    public static int[] f51667n9;
    public static int[] f51668o9;
    public static int[] p9;
    public static String f51671s9;
    public static g f51672t9;
    public static final bs f51674v9;
    public boolean A0;
    public final Paint A1;
    public int A2;
    public float A3;
    public int A4;
    public final RectF A5;
    public long A6;
    public int A7;
    public final Paint A8;
    public float B0;
    public final Paint B1;
    public boolean B2;
    public float B3;
    public float B4;
    public final RectF B5;
    public long B6;
    public long B7;
    public final Paint B8;
    public float C0;
    public final Paint C1;
    public float C2;
    public float C3;
    public float C4;
    public final RectF C5;
    public boolean C6;
    public long C7;
    public final RectF C8;
    public float D0;
    public final Paint D1;
    public float D2;
    public final Paint D3;
    public final float[] D4;
    public final LinearGradient D5;
    public boolean D6;
    public long D7;
    public int D8;
    public final Matrix E;
    public long E0;
    public final TextPaint E1;
    public float E2;
    public final int[] E3;
    public final float[] E4;
    public final LinearGradient E5;
    public final Matrix E6;
    public final float E7;
    public String E8;
    public y0 F;
    public boolean F0;
    public final TextPaint F1;
    public long F2;
    public final int[] F3;
    public final int[] F4;
    public final Matrix F5;
    public final Matrix F6;
    public int F7;
    public boolean F8;
    public y0 G;
    public float G0;
    public final Path G1;
    public long G2;
    public final float[] G3;
    public float G4;
    public final Paint G5;
    public final Path G6;
    public long G7;
    public int G8;
    public long H;
    public final TextPaint H0;
    public final RectF H1;
    public boolean H2;
    public final float[] H3;
    public float H4;
    public float H5;
    public final Path H6;
    public long H7;
    public long H8;
    public final ArrayList I;
    public String I0;
    public Object I1;
    public long I2;
    public final float[] I3;
    public boolean I4;
    public long I5;
    public final RectF I6;
    public float I7;
    public uj0 I8;
    public final HashMap J;
    public String J0;
    public Object J1;
    public float J2;
    public final float[] J3;
    public float J4;
    public long J5;
    public final Path J6;
    public final RectF J7;
    public uj0 J8;
    public float K;
    public boolean K0;
    public int K1;
    public float K2;
    public int K3;
    public final float[] K4;
    public boolean K5;
    public final Path K6;
    public final TextPaint K7;
    public uj0 K8;
    public float L;
    public final p6 L0;
    public final Drawable L1;
    public float L2;
    public float[] L3;
    public final float[] L4;
    public boolean L5;
    public int L6;
    public final TextPaint L7;
    public Object L8;
    public float M;
    public final float[] M0;
    public final Drawable M1;
    public long M2;
    public float[] M3;
    public final float[] M4;
    public int M5;
    public final RectF M6;
    public final TextPaint M7;
    public float M8;
    public float N;
    public final float[] N0;
    public final Drawable N1;
    public long N2;
    public float[] N3;
    public final boolean[] N4;
    public int N5;
    public final Matrix N6;
    public TextPaint N7;
    public String N8;
    public float O;
    public final float[] O0;
    public final Drawable O1;
    public String O2;
    public int O3;
    public int O4;
    public int O5;
    public final SparseArray O6;
    public final TextPaint O7;
    public long O8;
    public float P;
    public final float[] P0;
    public final Drawable P1;
    public float P2;
    public int P3;
    public float P4;
    public float P5;
    public final Drawable[] P6;
    public StaticLayout P7;
    public float P8;
    public float Q;
    public final float[] Q0;
    public final Drawable Q1;
    public long Q2;
    public PorterDuffColorFilter Q3;
    public float Q4;
    public float Q5;
    public final RectF Q6;
    public int Q7;
    public boolean Q8;
    public boolean R;
    public final float[] R0;
    public final Drawable R1;
    public Bitmap R2;
    public int R3;
    public StaticLayout R4;
    public float R5;
    public final RectF R6;
    public boolean R7;
    public float R8;
    public boolean S;
    public final float[] S0;
    public final Drawable S1;
    public final Paint S2;
    public float S3;
    public boolean S4;
    public float S5;
    public final RectF S6;
    public final String S7;
    public float S8;
    public boolean T;
    public final float[] T0;
    public final Drawable T1;
    public boolean T2;
    public float T3;
    public final float[] T4;
    public final float[] T5;
    public final RectF T6;
    public final String T7;
    public float T8;
    public boolean U;
    public final float[] U0;
    public final Drawable U1;
    public long U2;
    public float U3;
    public final float[] U4;
    public final Paint U5;
    public final RectF U6;
    public r5 U7;
    public final OverScroller U8;
    public long V;
    public final float[] V0;
    public final k5 V1;
    public float V2;
    public float V3;
    public final float[] V4;
    public float V5;
    public boolean V6;
    public uj0 V7;
    public final ViewConfiguration V8;
    public long W;
    public final float[] W0;
    public final Paint W1;
    public final double[] W2;
    public float W3;
    public final float[] W4;
    public boolean W5;
    public boolean W6;
    public long W7;
    public VelocityTracker W8;
    public final float[] X0;
    public final String X1;
    public final double[] X2;
    public float X3;
    public final float[] X4;
    public float X5;
    public float X6;
    public boolean X7;
    public boolean X8;
    public final float[] Y0;
    public final g2 Y1;
    public final double[] Y2;
    public final long[] Y3;
    public final float[] Y4;
    public boolean Y5;
    public float Y6;
    public TLRPC.TL_inputStickerSetShortName Y7;
    public boolean Y8;
    public final float[] Z0;
    public final uj0 Z1;
    public final ArrayList Z2;
    public final float[] Z3;
    public final float[] Z4;
    public Object Z5;
    public long Z6;
    public TLRPC.Document Z7;
    public final t0 Z8;
    public boolean f51675a;
    public float f51676a0;
    public final byte[] f51677a1;
    public final Paint a2;
    public float f51678a3;
    public final float[] f51679a4;
    public final float[] f51680a5;
    public float f51681a6;
    public boolean f51682a7;
    public long f51683a8;
    public final RippleDrawable[] f51684a9;
    public final int f51685b;
    public float f51686b0;
    public final boolean[] f51687b1;
    public int f51688b2;
    public float f51689b3;
    public final float[] f51690b4;
    public final float[] f51691b5;
    public int f51692b6;
    public float f51693b7;
    public LinearGradient[] f51694b8;
    public int f51695b9;
    public final u3.c f51696c;
    public float f51697c0;
    public int f51698c1;
    public int f51699c2;
    public float f51700c3;
    public final float[] f51701c4;
    public final float[] f51702c5;
    public int f51703c6;
    public float f51704c7;
    public int[] f51705c8;
    public final Paint f51706c9;
    public String d;
    public float f51707d0;
    public boolean f51708d1;
    public Runnable f51709d2;
    public boolean f51710d3;
    public final long[] f51711d4;
    public final float[] f51712d5;
    public final SparseIntArray f51713d6;
    public long f51714d7;
    public final q10 f51715d8;
    public final Path f51716d9;
    public String e;
    public float f51717e0;
    public final Random f51718e1;
    public boolean f51719e2;
    public Bitmap f51720e3;
    public final boolean[] f51721e4;
    public final float[] f51722e5;
    public int f51723e6;
    public final RectF e7;
    public int f51724e8;
    public final float[] f51725e9;
    public String f51726f;
    public float f51727f0;
    public float f51728f1;
    public boolean f51729f2;
    public int[] f51730f3;
    public final Paint f51731f4;
    public final boolean[] f51732f5;
    public final LinearGradient f51733f6;
    public long f7;
    public int f51734f8;
    public final float[] f51735f9;
    public float f51736g0;
    public float f51737g1;
    public Bitmap f51738g2;
    public final Paint f51739g3;
    public Paint f51740g4;
    public int f51741g5;
    public boolean f51742g6;
    public float f51743g7;
    public float f51744g8;
    public final long[] f51745g9;
    public boolean h;
    public float f51746h0;
    public int f51747h1;
    public final int[] f51748h2;
    public final RectF f51749h3;
    public Bitmap f51750h4;
    public final LinearGradient f51751h5;
    public boolean f51752h6;
    public float f51753h7;
    public float f51754h8;
    public final long[] f51755h9;
    public float f51756i0;
    public float f51757i1;
    public x9 f51758i2;
    public boolean f51759i3;
    public final float[] f51760i4;
    public final Paint f51761i5;
    public int f51762i6;
    public float f51763i7;
    public final RectF[] f51764i8;
    public final float[] f51765i9;
    public float f51766j0;
    public float f51767j1;
    public final s0 f51768j2;
    public float f51769j3;
    public final float[] f51770j4;
    public final Path f51771j5;
    public final SweepGradient[] f51772j6;
    public final RectF f51773j7;
    public long f51774j8;
    public final float[] f51775j9;
    public VelocityTracker f51776k0;
    public float f51777k1;
    public final t0 f51778k2;
    public float f51779k3;
    public final int[] f51780k4;
    public final TextPaint f51781k5;
    public float f51782k6;
    public final LinearGradient f51783k7;
    public long f51784k8;
    public final Rect[] f51785k9;
    public float f51786l0;
    public float l1;
    public boolean f51787l2;
    public float f51788l3;
    public int l4;
    public Drawable f51789l5;
    public float f51790l6;
    public final Paint f51791l7;
    public float f51792l8;
    public float m0;
    public String f51793m1;
    public long f51794m2;
    public float f51795m3;
    public final float[] f51796m4;
    public StaticLayout f51797m5;
    public float f51798m6;
    public final Matrix f51799m7;
    public float f51800m8;
    public z0 f51801n;
    public float f51802n0;
    public int f51803n1;
    public long f51804n2;
    public float f51805n3;
    public final float[] f51806n4;
    public int f51807n5;
    public float f51808n6;
    public final RectF[] f51809n7;
    public float f51810n8;
    public float f51811o0;
    public String f51812o1;
    public long f51813o2;
    public float f51814o3;
    public final float[] f51815o4;
    public final RectF f51816o5;
    public float f51817o6;
    public float f51818o7;
    public float f51819o8;
    public float f51820p0;
    public String f51821p1;
    public float f51822p2;
    public float f51823p3;
    public final float[] f51824p4;
    public final RectF p5;
    public float f51825p6;
    public float f51826p7;
    public float f51827p8;
    public int f51828q0;
    public final RectF f51829q1;
    public long f51830q2;
    public final x0 f51831q3;
    public final float[] f51832q4;
    public final Path f51833q5;
    public float q6;
    public boolean f51834q7;
    public float f51835q8;
    public z0 f51836r;
    public long f51837r0;
    public boolean f51838r1;
    public final RectF f51839r2;
    public float f51840r3;
    public final long[] f51841r4;
    public final float[] f51842r5;
    public float f51843r6;
    public int f51844r7;
    public float f51845r8;
    public float f51846s;
    public final h f51847s0;
    public float f51848s1;
    public boolean f51849s2;
    public float f51850s3;
    public int f51851s4;
    public float f51852s5;
    public boolean f51853s6;
    public final RectF f51854s7;
    public final Path f51855s8;
    public g f51856t0;
    public float f51857t1;
    public float f51858t2;
    public float f51859t3;
    public float f51860t4;
    public final Matrix f51861t5;
    public long f51862t6;
    public final HashMap f51863t7;
    public final RectF f51864t8;
    public g f51865u0;
    public long f51866u1;
    public String f51867u2;
    public float f51868u3;
    public float f51869u4;
    public final Matrix f51870u5;
    public SensorManager f51871u6;
    public final HashMap f51872u7;
    public final RectF f51873u8;
    public long v;
    public boolean f51874v0;
    public final ArrayList f51875v1;
    public String f51876v2;
    public float f51877v3;
    public final float[] f51878v4;
    public final LinearGradient f51879v5;
    public final w0 f51880v6;
    public int f51881v7;
    public final RectF f51882v8;
    public float f51883w;
    public boolean f51884w0;
    public long f51885w1;
    public String f51886w2;
    public final Path f51887w3;
    public final float[] f51888w4;
    public final LongSparseArray f51889w5;
    public float f51890w6;
    public int f51891w7;
    public long f51892w8;
    public float f51893x;
    public boolean f51894x0;
    public boolean f51895x1;
    public String f51896x2;
    public Bitmap f51897x3;
    public final int[] f51898x4;
    public final Path f51899x5;
    public float f51900x6;
    public float f51901x7;
    public boolean f51902x8;
    public final long f51903y;
    public boolean f51904y0;
    public final HashMap f51905y1;
    public final TextPaint f51906y2;
    public Bitmap y3;
    public final short[] f51907y4;
    public boolean f51908y5;
    public float f51909y6;
    public float f51910y7;
    public Bitmap f51911y8;
    public long f51912z0;
    public final Paint f51913z1;
    public String f51914z2;
    public Paint f51915z3;
    public int f51916z4;
    public float f51917z5;
    public float f51918z6;
    public int f51919z7;
    public Bitmap f51920z8;
    public static final String[] f51665l9 = {"❤️", "🔥", "🎉", "😎", "🚀", "💎", "💙", "✨", "⭐", "🍀", "🐸", "🦄", "🌈", "🍕", "👻", "🍒", "🌸", "⚡", "🏆", "🎁", "👀", "😍", "🥳", "🤩", "🐱", "🐶", "🦋", "🌙", "☀️", "🍓", "🍩", "🎈", "🎮", "🎧", "💜", "🌊"};
    public static final float f51666m9 = (float) Math.atan2(-5.5d, -3.5d);
    public static int f51669q9 = a.b("Black");
    public static int f51670r9 = a.b("Neon Blue");
    public static final PorterDuffColorFilter[] f51673u9 = new PorterDuffColorFilter[9];

    static {
        for (int i10 = 0; i10 <= 8; i10++) {
            f51673u9[i10] = new PorterDuffColorFilter((((int) ((i10 * 140.25f) / 8.0f)) << 24) | 16777215, PorterDuff.Mode.SRC_ATOP);
        }
        f51674v9 = new bs(0.16d, 1.0d, 0.3d, 1.0d);
        x7.d("M9.78283 3.01277C10.6236 1.07141 13.3768 1.07128 14.2174 3.01277L16.0651 7.2823L20.8209 7.63875C22.9981 7.80179 23.8599 10.5397 22.1686 11.92L18.6207 14.8136L19.7203 19.1817C20.243 21.2594 18.0032 22.939 16.1549 21.8555L11.9996 19.42L7.8463 21.8546C5.99747 22.9384 3.75791 21.2578 4.28185 19.1798L4.96056 16.4854C5.14523 15.7532 5.50091 15.088 5.98595 14.5372C5.19936 14.3783 4.45349 14.0318 3.81603 13.5157L1.85119 11.9249C0.150805 10.5482 1.00932 7.80116 3.19103 7.63777L7.93322 7.28132L9.78283 3.01277ZM12.8404 3.60847C12.5215 2.87274 11.4776 2.87264 11.1588 3.60847L9.17052 8.20222C9.03522 8.51476 8.73767 8.72659 8.39806 8.75203L3.30333 9.13386C2.47619 9.19581 2.15024 10.2367 2.79455 10.7589L4.75939 12.3497C5.54417 12.9851 6.564 13.2549 7.56017 13.0899L8.87951 12.8712L9.27111 14.3106L8.35705 14.6622C7.39226 15.0332 6.66837 15.8503 6.41564 16.8526L5.73595 19.546C5.53727 20.3339 6.38647 20.9714 7.08751 20.5606L11.5367 17.9532L11.6471 17.8975C11.8728 17.8034 12.1275 17.8032 12.3531 17.8975L12.4635 17.9532L16.9137 20.5616C17.6145 20.9721 18.4633 20.3356 18.2652 19.5479L17.0758 14.8194C16.9893 14.4748 17.1101 14.1115 17.3854 13.8868L21.2203 10.7579C21.8614 10.2345 21.5348 9.19698 20.7096 9.13484L15.6012 8.75203C15.2617 8.72649 14.964 8.51467 14.8287 8.20222L12.8404 3.60847Z");
    }

    public b1(Context context, int i10, String str, String str2, boolean z10, u3.c cVar) {
        super(context);
        boolean z11;
        g gVar;
        this.f51675a = true;
        this.f51846s = 1.0f;
        this.f51903y = AnimationUtils.currentAnimationTimeMillis();
        this.E = new Matrix();
        this.F = new y0();
        this.I = new ArrayList();
        this.J = new HashMap();
        Paint paint = new Paint(3);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        paint.setColorFilter(new PorterDuffColorFilter(-1, mode));
        AndroidUtilities.dp(55.0f);
        this.M = -1.0f;
        this.f51847s0 = new h();
        this.f51884w0 = true;
        this.f51894x0 = true;
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
        this.f51677a1 = new byte[320];
        this.f51687b1 = new boolean[320];
        this.f51718e1 = new Random();
        this.f51747h1 = 0;
        this.f51829q1 = new RectF();
        this.f51875v1 = new ArrayList();
        this.f51905y1 = new HashMap();
        this.f51913z1 = new Paint(1);
        this.A1 = new Paint(1);
        this.B1 = new Paint(1);
        this.C1 = new Paint(1);
        this.D1 = new Paint(1);
        this.E1 = new TextPaint(1);
        this.F1 = new TextPaint(1);
        this.G1 = new Path();
        new Path();
        this.H1 = new RectF();
        this.K1 = -1;
        this.W1 = new Paint(1);
        this.X1 = LocaleController.getString(R.string.QrScanQr);
        this.a2 = new Paint(1);
        this.f51688b2 = 1;
        this.f51748h2 = new int[3];
        this.f51768j2 = new NotificationCenter.NotificationCenterDelegate() {
            @Override
            public final void didReceivedNotification(int i11, int i12, Object[] objArr) {
                b1 b1Var = b1.this;
                b1Var.getClass();
                if (objArr.length > 1 && objArr[1] == b1Var.f51758i2) {
                    b1Var.u0();
                }
            }
        };
        this.f51778k2 = new Runnable(this) {
            public final b1 f52104b;

            {
                this.f52104b = this;
            }

            @Override
            public final void run() {
                TLRPC.Document document;
                int lastIndexOf;
                int dp;
                switch (r2) {
                    case 0:
                        b1 b1Var = this.f52104b;
                        ArrayList arrayList = b1Var.f51875v1;
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
                                    b1Var.e0(tL_starGiftUnique.f20496id, document);
                                }
                            }
                            b1Var.f1(tL_starGiftUnique);
                        }
                        return;
                    default:
                        b1 b1Var2 = this.f52104b;
                        ArrayList arrayList3 = b1Var2.I;
                        if (b1Var2.f51728f1 >= 0.5f && b1Var2.f51747h1 == 1 && !b1Var2.Y8) {
                            float f7 = b1Var2.R8;
                            float f10 = b1Var2.S8;
                            float width = (b1Var2.getWidth() - AndroidUtilities.dp(28.0f)) / 6.0f;
                            RectF rectF = b1Var2.e7;
                            float dp2 = (b1Var2.f51767j1 + f10) - (rectF.top + AndroidUtilities.dp(16.0f));
                            int i13 = -1;
                            if (dp2 >= 0.0f && f7 >= AndroidUtilities.dp(14.0f) && f10 >= rectF.top + AndroidUtilities.dp(8.0f) && (dp = (((int) (dp2 / width)) * 6) + ((int) ((f7 - AndroidUtilities.dp(14.0f)) / width))) >= 0 && dp < 36) {
                                i13 = dp;
                            }
                            if (i13 >= 0) {
                                String[] strArr = b1.f51665l9;
                                if (arrayList3.contains(strArr[i13]) && (lastIndexOf = arrayList3.lastIndexOf(strArr[i13])) >= 0) {
                                    arrayList3.remove(lastIndexOf);
                                    b1Var2.b();
                                    b1Var2.g0();
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
        this.f51822p2 = 1.0f;
        this.f51839r2 = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.f51906y2 = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        this.A2 = -1;
        this.E2 = -1.0f;
        this.L2 = -1.0f;
        this.N2 = -1L;
        this.O2 = "";
        this.P2 = -1.0f;
        this.S2 = new Paint(3);
        this.V2 = 1.0f;
        this.W2 = new double[3];
        this.X2 = new double[3];
        this.Y2 = new double[3];
        this.Z2 = new ArrayList();
        int i11 = 2;
        this.f51739g3 = new Paint(2);
        this.f51749h3 = new RectF();
        new LinearGradient(-3.0f, 0.0f, 3.0f, 0.0f, new int[]{16777215, 33554431, 83886079, 134217727, 83886079, 33554431, 16777215}, new float[]{0.0f, 0.17f, 0.33f, 0.5f, 0.67f, 0.83f, 1.0f}, Shader.TileMode.CLAMP);
        this.f51788l3 = 5.0f;
        this.f51795m3 = -0.7071f;
        this.f51805n3 = 0.7071f;
        this.f51831q3 = new x0();
        this.f51850s3 = 1.0f;
        this.f51868u3 = -1.0f;
        this.f51887w3 = new Path();
        this.A3 = -1.0f;
        this.B3 = -1.0f;
        this.C3 = -1.0f;
        Paint paint2 = new Paint(2);
        this.D3 = paint2;
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.E3 = new int[1024];
        this.F3 = new int[1024];
        this.G3 = new float[1024];
        this.H3 = new float[1024];
        this.I3 = new float[1024];
        this.J3 = new float[1024];
        this.P3 = -1;
        this.R3 = -1;
        this.Y3 = new long[2048];
        this.Z3 = new float[2048];
        this.f51679a4 = new float[2048];
        this.f51690b4 = new float[2048];
        this.f51701c4 = new float[2048];
        this.f51711d4 = new long[2048];
        this.f51721e4 = new boolean[2048];
        Paint paint3 = new Paint(3);
        this.f51731f4 = paint3;
        paint3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f51760i4 = new float[4096];
        this.f51770j4 = new float[4096];
        this.f51780k4 = new int[2048];
        this.f51796m4 = new float[96];
        this.f51806n4 = new float[96];
        this.f51815o4 = new float[96];
        this.f51824p4 = new float[96];
        this.f51832q4 = new float[96];
        this.f51841r4 = new long[96];
        this.f51878v4 = new float[16384];
        this.f51888w4 = new float[16384];
        this.f51898x4 = new int[8192];
        this.f51907y4 = new short[12288];
        int i12 = 0;
        while (i12 < 2048) {
            int i13 = i12 * 6;
            int i14 = i11;
            int i15 = i12 * 4;
            short[] sArr = this.f51907y4;
            short s10 = (short) i15;
            sArr[i13] = s10;
            sArr[i13 + 1] = (short) (i15 + 1);
            short s11 = (short) (i15 + 2);
            sArr[i13 + 2] = s11;
            sArr[i13 + 3] = s11;
            sArr[i13 + 4] = (short) (i15 + 3);
            sArr[i13 + 5] = s10;
            i12++;
            i11 = i14;
        }
        int i16 = i11;
        this.D4 = new float[4096];
        this.E4 = new float[4096];
        this.F4 = new int[2048];
        this.G4 = 1.0f;
        this.H4 = 1.0f;
        this.I4 = true;
        this.J4 = 1.0f;
        setOutlineProvider(new dh.b(this, 8));
        this.K4 = new float[240];
        this.L4 = new float[240];
        this.M4 = new float[240];
        this.N4 = new boolean[240];
        this.T4 = new float[240];
        this.U4 = new float[240];
        this.V4 = new float[240];
        this.W4 = new float[240];
        this.X4 = new float[240];
        this.Y4 = new float[240];
        this.Z4 = new float[240];
        this.f51680a5 = new float[240];
        this.f51691b5 = new float[240];
        this.f51702c5 = new float[240];
        this.f51712d5 = new float[240];
        this.f51722e5 = new float[240];
        this.f51732f5 = new boolean[240];
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -16777216, 0, tileMode);
        this.f51751h5 = linearGradient;
        Paint paint4 = new Paint(1);
        this.f51761i5 = paint4;
        paint4.setShader(linearGradient);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        paint4.setXfermode(new PorterDuffXfermode(mode2));
        this.f51771j5 = new Path();
        this.f51781k5 = new TextPaint(65);
        this.f51816o5 = new RectF();
        this.p5 = new RectF();
        this.f51833q5 = new Path();
        this.f51842r5 = new float[7];
        this.f51861t5 = new Matrix();
        this.f51870u5 = new Matrix();
        this.f51879v5 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{16777215, -1, 16777215}, new float[]{0.0f, 0.88f, 1.0f}, tileMode);
        this.f51889w5 = new LongSparseArray();
        this.f51899x5 = new Path();
        this.f51917z5 = 1.0f;
        this.A5 = new RectF();
        this.B5 = new RectF();
        this.C5 = new RectF();
        this.D5 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, 16777215, -1, tileMode);
        this.E5 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -1, 16777215, tileMode);
        this.F5 = new Matrix();
        this.G5 = new Paint();
        this.R5 = 0.85f;
        this.T5 = new float[320];
        Paint paint5 = new Paint();
        this.U5 = paint5;
        PorterDuff.Mode mode3 = PorterDuff.Mode.DST_IN;
        paint5.setXfermode(new PorterDuffXfermode(mode3));
        this.V5 = 1.0f;
        this.W5 = true;
        this.f51681a6 = -1.0f;
        this.f51692b6 = -1;
        this.f51713d6 = new SparseIntArray();
        this.f51723e6 = -1;
        new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 1090519039, 16777215, tileMode);
        this.f51733f6 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 352321535, 16777215, tileMode);
        this.f51762i6 = -1;
        this.f51772j6 = new SweepGradient[4];
        this.f51880v6 = new w0(this);
        this.E6 = new Matrix();
        this.F6 = new Matrix();
        this.G6 = new Path();
        this.H6 = new Path();
        this.I6 = new RectF();
        this.J6 = new Path();
        this.K6 = new Path();
        this.L6 = -1;
        this.M6 = new RectF();
        new RectF();
        new LinearGradient(0.0f, 0.0f, 1.0f, 1.0f, new int[]{637534208, 218103808, 436207616}, (float[]) null, tileMode);
        new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{1811939327, 788529151, 956301311}, new float[]{0.0f, 0.45f, 1.0f}, tileMode);
        this.N6 = new Matrix();
        this.O6 = new SparseArray();
        this.Q6 = new RectF();
        this.R6 = new RectF();
        this.S6 = new RectF();
        this.T6 = new RectF();
        this.U6 = new RectF();
        this.X6 = 1.0f;
        this.Y6 = 1.0f;
        this.f51693b7 = 1.0f;
        this.f51704c7 = 1.0f;
        this.e7 = new RectF();
        new RectF();
        this.f51773j7 = new RectF();
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{0, 805306368, -1627389952, -285212672, -16777216}, new float[]{0.0f, 0.25f, 0.5f, 0.75f, 1.0f}, tileMode);
        this.f51783k7 = linearGradient2;
        Paint paint6 = new Paint();
        this.f51791l7 = paint6;
        paint6.setXfermode(new PorterDuffXfermode(mode3));
        paint6.setShader(linearGradient2);
        this.f51799m7 = new Matrix();
        RectF rectF = new RectF();
        RectF rectF2 = new RectF();
        RectF rectF3 = new RectF();
        RectF rectF4 = new RectF();
        RectF rectF5 = new RectF();
        RectF rectF6 = new RectF();
        RectF[] rectFArr = new RectF[6];
        rectFArr[0] = rectF;
        rectFArr[1] = rectF2;
        rectFArr[i16] = rectF3;
        rectFArr[3] = rectF4;
        rectFArr[4] = rectF5;
        rectFArr[5] = rectF6;
        this.f51809n7 = rectFArr;
        this.f51818o7 = -1.0f;
        this.f51826p7 = -1.0f;
        this.f51854s7 = new RectF();
        this.f51863t7 = new HashMap();
        this.f51872u7 = new HashMap();
        this.f51881v7 = -1;
        this.f51891w7 = f51669q9;
        this.f51919z7 = -1;
        this.A7 = -1;
        new Path();
        new Path();
        new PathMeasure();
        this.E7 = AndroidUtilities.dp(20.17f);
        new RectF();
        this.F7 = -1;
        this.H7 = -1L;
        this.I7 = 1.0f;
        this.J7 = new RectF();
        this.K7 = new TextPaint(1);
        this.L7 = new TextPaint(1);
        this.M7 = new TextPaint(1);
        TextPaint textPaint2 = new TextPaint(129);
        this.O7 = textPaint2;
        textPaint2.setXfermode(new PorterDuffXfermode(mode2));
        this.S7 = LocaleController.getString(R.string.QrNoGiftsTitle);
        this.T7 = LocaleController.getString(R.string.QrBrowseGifts);
        int[] iArr = a.f51651b;
        this.f51694b8 = new LinearGradient[iArr.length];
        this.f51705c8 = new int[iArr.length];
        this.f51715d8 = new q10(i16);
        this.f51724e8 = -100;
        this.f51734f8 = -100;
        new RectF();
        this.f51764i8 = new RectF[]{new RectF(), new RectF(), new RectF()};
        this.f51855s8 = new Path();
        this.f51864t8 = new RectF();
        this.f51873u8 = new RectF();
        this.f51882v8 = new RectF();
        this.A8 = new Paint(3);
        this.B8 = new Paint(1);
        this.C8 = new RectF();
        this.M8 = -1.0f;
        this.U8 = new OverScroller(getContext());
        this.V8 = ViewConfiguration.get(getContext());
        this.Z8 = new Runnable(this) {
            public final b1 f52104b;

            {
                this.f52104b = this;
            }

            @Override
            public final void run() {
                TLRPC.Document document;
                int lastIndexOf;
                int dp;
                switch (r2) {
                    case 0:
                        b1 b1Var = this.f52104b;
                        ArrayList arrayList = b1Var.f51875v1;
                        for (int i112 = 0; i112 < Math.min(arrayList.size(), 9); i112++) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i112);
                            ArrayList<TL_stars.StarGiftAttribute> arrayList2 = tL_starGiftUnique.attributes;
                            int size = arrayList2.size();
                            int i122 = 0;
                            while (i122 < size) {
                                TL_stars.StarGiftAttribute starGiftAttribute = arrayList2.get(i122);
                                i122++;
                                TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                                if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) && (document = ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document) != null) {
                                    b1Var.e0(tL_starGiftUnique.f20496id, document);
                                }
                            }
                            b1Var.f1(tL_starGiftUnique);
                        }
                        return;
                    default:
                        b1 b1Var2 = this.f52104b;
                        ArrayList arrayList3 = b1Var2.I;
                        if (b1Var2.f51728f1 >= 0.5f && b1Var2.f51747h1 == 1 && !b1Var2.Y8) {
                            float f7 = b1Var2.R8;
                            float f10 = b1Var2.S8;
                            float width = (b1Var2.getWidth() - AndroidUtilities.dp(28.0f)) / 6.0f;
                            RectF rectF7 = b1Var2.e7;
                            float dp2 = (b1Var2.f51767j1 + f10) - (rectF7.top + AndroidUtilities.dp(16.0f));
                            int i132 = -1;
                            if (dp2 >= 0.0f && f7 >= AndroidUtilities.dp(14.0f) && f10 >= rectF7.top + AndroidUtilities.dp(8.0f) && (dp = (((int) (dp2 / width)) * 6) + ((int) ((f7 - AndroidUtilities.dp(14.0f)) / width))) >= 0 && dp < 36) {
                                i132 = dp;
                            }
                            if (i132 >= 0) {
                                String[] strArr = b1.f51665l9;
                                if (arrayList3.contains(strArr[i132]) && (lastIndexOf = arrayList3.lastIndexOf(strArr[i132])) >= 0) {
                                    arrayList3.remove(lastIndexOf);
                                    b1Var2.b();
                                    b1Var2.g0();
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
        this.f51684a9 = new RippleDrawable[12];
        ColorStateList.valueOf(738197503);
        ColorStateList.valueOf(335544320);
        this.f51695b9 = -1;
        this.f51706c9 = new Paint(1);
        this.f51716d9 = new Path();
        this.f51725e9 = new float[12];
        this.f51735f9 = new float[12];
        this.f51745g9 = new long[12];
        this.f51755h9 = new long[12];
        this.f51765i9 = new float[12];
        this.f51775j9 = new float[12];
        this.f51785k9 = new Rect[12];
        for (int i17 = 0; i17 < 12; i17++) {
            this.f51785k9[i17] = new Rect();
        }
        this.f51685b = i10;
        this.d = str;
        this.f51726f = str2;
        this.h = z10;
        this.f51696c = cVar;
        this.N1 = v(R.drawable.msg_share);
        this.O1 = v(R.drawable.msg_download);
        this.P1 = v(R.drawable.msg_qr_scan);
        this.W1.setTypeface(AndroidUtilities.bold());
        Drawable v = v(R.drawable.msg_colors);
        this.Q1 = v;
        Drawable v10 = v(R.drawable.input_smile);
        this.R1 = v10;
        Drawable v11 = v(R.drawable.menu_gift);
        this.S1 = v11;
        this.Y1 = new g2(true);
        this.T1 = v(R.drawable.msg_retry);
        this.U1 = v(R.drawable.msg_recent);
        this.V1 = new k5(1);
        this.L1 = v(R.drawable.msg_copy);
        this.M1 = v(R.drawable.menu_premium_main);
        this.P6 = new Drawable[]{v, v10, v11};
        uj0 uj0Var = new uj0(R.raw.plane_logo_plain, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
        this.Z1 = uj0Var;
        uj0Var.R(this);
        uj0Var.K(1);
        uj0Var.setCallback(this);
        uj0Var.start();
        Paint paint7 = this.a2;
        Paint.Style style = Paint.Style.STROKE;
        paint7.setStyle(style);
        this.a2.setStrokeCap(Paint.Cap.ROUND);
        this.a2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.E1.setTextSize(AndroidUtilities.dp(11.0f));
        this.F1.setTypeface(AndroidUtilities.bold());
        this.C1.setStyle(style);
        this.A1.setStyle(style);
        p6 p6Var = new p6(false, true, true);
        this.L0 = p6Var;
        p6Var.w(AndroidUtilities.dp(11.0f));
        p6Var.n(0.35f, 280L, bs.h);
        p6Var.setCallback(this);
        p6Var.f29192b = 3;
        z0 s12 = s(f51669q9);
        this.f51801n = s12;
        this.L6 = P0(s12.f52177c);
        if (str != null) {
            String str3 = this.d;
            if (str3.equals(f51671s9) && (gVar = f51672t9) != null) {
                this.f51856t0 = gVar;
            } else {
                g a2 = h.a(AndroidUtilities.dp(240.0f), str3);
                this.f51856t0 = a2;
                f51672t9 = a2;
                f51671s9 = str3;
            }
            h hVar = this.f51847s0;
            hVar.f52010m = this.f51856t0;
            hVar.f52011n = null;
            hVar.f52014q = 2;
            hVar.f52012o = 0.0f;
            hVar.f52013p = 0L;
            hVar.E = 0L;
            z11 = false;
            hVar.F = false;
        } else {
            z11 = false;
        }
        n1(z11);
    }

    public static int P0(int i10) {
        double[] dArr = new double[3];
        double[] dArr2 = new double[3];
        h1(i10, dArr);
        double hypot = Math.hypot(dArr[1], dArr[2]);
        if (hypot < 0.03d) {
            return -1;
        }
        Z(0.96d, Math.min(0.06d, hypot * 0.7d), Math.atan2(dArr[2], dArr[1]), dArr2);
        return Color.rgb((int) Math.round(q(b0(q(dArr2[0]))) * 255.0d), (int) Math.round(q(b0(q(dArr2[1]))) * 255.0d), (int) Math.round(q(b0(q(dArr2[2]))) * 255.0d));
    }

    public static float R(float f7, float f10) {
        float f11 = f7 - 1.0f;
        return a6.t(f10, f11, f11, ((f10 + 1.0f) * f11 * f11 * f11) + 1.0f);
    }

    public static int S0(int i10) {
        double[] dArr = new double[3];
        i0.b.j(i10, dArr);
        return i0.b.o(i0.b.b(Math.min(96.0d, dArr[0] + 24.0d), dArr[1] * 0.75d, dArr[2] * 0.75d), 26);
    }

    public static int X0(int i10) {
        if (a.f51654g == null) {
            int length = a.f51650a.length;
            int[] iArr = new int[length];
            boolean[] zArr = new boolean[length];
            int i11 = 0;
            for (int i12 = 0; i12 < 80; i12++) {
                int b10 = a.b(a.f51653f[i12]);
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
            a.f51654g = iArr;
        }
        return a.f51654g[i10];
    }

    public static float Y0(boolean z10, boolean z11, float f7) {
        if (z10) {
            if (f7 > 0.0f) {
                return org.telegram.ui.Cells.t0.v(f7, 0.18f, 1.0f, 0.0f);
            }
        } else {
            if (!z11) {
                f7 -= 0.135f;
            }
            if (f7 <= 0.0f) {
                return 0.0f;
            }
            if (f7 < 0.315f) {
                float f10 = (f7 / 0.315f) - 1.0f;
                return a6.t(f10, 1.70158f, f10, (2.70158f * f10 * f10 * f10) + 1.0f);
            }
        }
        return 1.0f;
    }

    public static void Z(double d, double d10, double d11, double[] dArr) {
        double cos = Math.cos(d11);
        double sin = Math.sin(d11);
        y0(d, d10 * cos, d10 * sin, dArr);
        if (n0(dArr)) {
            return;
        }
        double d12 = 0.0d;
        double d13 = d10;
        for (int i10 = 0; i10 < 14; i10++) {
            double d14 = (d12 + d13) / 2.0d;
            y0(d, d14 * cos, d14 * sin, dArr);
            if (n0(dArr)) {
                d12 = d14;
            } else {
                d13 = d14;
            }
        }
        y0(d, d12 * cos, d12 * sin, dArr);
    }

    public static float Z0(float f7, float f10, float f11) {
        float clamp01 = Utilities.clamp01((f11 - f7) / (f10 - f7));
        return a6.B(clamp01, 2.0f, 3.0f, clamp01 * clamp01);
    }

    public static int a(float f7, int i10) {
        return i0.b.o(i10, (int) (Utilities.clamp01(f7) * Color.alpha(i10)));
    }

    public static float a0(double d) {
        return (float) (d - Math.floor(d));
    }

    public static double a1(double d, double d10, double d11) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        double d12 = 6.283185307179586d / d11;
        double d13 = 1.0d - (d10 * d10);
        double sqrt = Math.sqrt(d13) * d12;
        double d14 = sqrt * d;
        return 1.0d - (((Math.sin(d14) * (d10 / Math.sqrt(d13))) + Math.cos(d14)) * Math.exp(((-d10) * d12) * d));
    }

    public static double b0(double d) {
        if (d <= 0.0031308d) {
            return d * 12.92d;
        }
        return (Math.pow(d, 0.4166666666666667d) * 1.055d) - 0.055d;
    }

    public static float b1(int i10) {
        float f7 = i10 / 255.0f;
        if (f7 <= 0.04045f) {
            return f7 / 12.92f;
        }
        return (float) Math.pow((f7 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static int e1(int i10, int i11) {
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

    public static int f(float f7, int i10) {
        return (((int) (Math.max(0.0f, Math.min(1.0f, f7)) * 255.0f)) << 24) | (i10 & 16777215);
    }

    public static void h1(int i10, double[] dArr) {
        double r02 = r0(Color.red(i10) / 255.0d);
        double r03 = r0(Color.green(i10) / 255.0d);
        double r04 = r0(Color.blue(i10) / 255.0d);
        double cbrt = Math.cbrt((0.0514459929d * r04) + (0.5363325363d * r03) + (0.4122214708d * r02));
        double cbrt2 = Math.cbrt((0.1073969566d * r04) + (0.6806995451d * r03) + (0.2119034982d * r02));
        double d = r04 * 0.6299787005d;
        double cbrt3 = Math.cbrt(d + (r03 * 0.2817188376d) + (r02 * 0.0883024619d));
        dArr[0] = ((0.793617785d * cbrt2) + (0.2104542553d * cbrt)) - (0.0040720468d * cbrt3);
        dArr[1] = (0.4505937099d * cbrt3) + ((1.9779984951d * cbrt) - (2.428592205d * cbrt2));
        dArr[2] = ((cbrt2 * 0.7827717662d) + (cbrt * 0.0259040371d)) - (cbrt3 * 0.808675766d);
    }

    public static float i(float f7, float f10, long j10) {
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
            return AndroidUtilities.lerp(f7 + 1.0f, 1.0f - f10, a6.B(f11, 2.0f, 3.0f, f11 * f11));
        }
        float f12 = (currentAnimationTimeMillis - 0.6f) / 0.4f;
        return AndroidUtilities.lerp(1.0f - f10, 1.0f, a6.B(f12, 2.0f, 3.0f, f12 * f12));
    }

    public static float i0(int i10, int i11, int i12) {
        int i13 = i12 * 1442695041;
        int i14 = i13 + (i11 * 668265263) + (i10 * 374761393);
        int i15 = ((i14 >>> 13) ^ i14) * 1274126177;
        return ((i15 ^ (i15 >>> 16)) & 65535) / 65535.0f;
    }

    public static void j() {
        if (f51667n9 == null) {
            int length = a.f51651b.length;
            f51667n9 = new int[length];
            f51668o9 = new int[length];
            p9 = new int[length];
            for (int i10 = 0; i10 < length; i10++) {
                f51667n9[i10] = w(a.f51651b[i10], false);
                f51668o9[i10] = w(a.f51652c[i10], true);
                p9[i10] = u(f51667n9[i10], f51668o9[i10]);
            }
        }
    }

    public static void k(z0 z0Var) {
        z0Var.f52180i = S0(z0Var.f52176b);
        h.i(0.55f, z0Var.f52177c, z0Var.f52176b);
        int i10 = z0Var.f52176b;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        z0Var.f52179g = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i10, h.i(0.5f, i10, z0Var.f52177c), z0Var.f52177c}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
        int i11 = z0Var.f52176b;
        z0Var.h = new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{i11, h.i(0.5f, i11, z0Var.f52177c), z0Var.f52177c}, new float[]{0.0f, 0.55f, 1.0f}, tileMode);
        int f7 = i0.b.f(0.22f, z0Var.f52176b, -1);
        new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{i0.b.o(f7, 150), i0.b.o(f7, 50), 0}, new float[]{0.0f, 0.45f, 1.0f}, tileMode);
        Color.colorToHSV(z0Var.f52176b, r1);
        float[] fArr = {(fArr[0] + 28.0f) % 360.0f, Math.min(1.0f, fArr[1] * 1.1f)};
        int HSVToColor = Color.HSVToColor(fArr);
        new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{i0.b.o(HSVToColor, 150), i0.b.o(HSVToColor, 0)}, (float[]) null, tileMode);
    }

    public static boolean k0(RectF rectF, float f7, float f10) {
        float dp = AndroidUtilities.dp(8.0f);
        if (!rectF.isEmpty() && f7 >= rectF.left - dp && f7 <= rectF.right + dp && f10 >= rectF.top - dp && f10 <= rectF.bottom + dp) {
            return true;
        }
        return false;
    }

    public static float m1(float f7, float f10, float f11) {
        float dpf2 = (f7 - f11) / AndroidUtilities.dpf2(1.7f);
        float dpf22 = f10 / AndroidUtilities.dpf2(3.2f);
        float p12 = p1(dpf2 * 2.6f, dpf22 * 1.7f, 91) * 0.32f;
        return AndroidUtilities.dpf2(3.6f) * ((p12 + (p1(dpf2, dpf22, 17) * 0.68f)) - 0.5f);
    }

    public static boolean n0(double[] dArr) {
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

    public static float o1(float f7) {
        int floor = (int) Math.floor(f7);
        float f10 = f7 - floor;
        float B = a6.B(f10, 2.0f, 3.0f, f10 * f10);
        float a02 = a0(Math.sin(floor * 127.1d) * 43758.5453d);
        return ((a0(Math.sin((floor + 1) * 127.1d) * 43758.5453d) - a02) * B) + a02;
    }

    public static float p1(float f7, float f10, int i10) {
        int floor = (int) Math.floor(f7);
        int floor2 = (int) Math.floor(f10);
        float f11 = f7 - floor;
        float f12 = f10 - floor2;
        float B = a6.B(f11, 2.0f, 3.0f, f11 * f11);
        float B2 = a6.B(f12, 2.0f, 3.0f, f12 * f12);
        float i02 = i0(floor, floor2, i10);
        int i11 = floor + 1;
        float i03 = i0(i11, floor2, i10);
        int i12 = floor2 + 1;
        float i04 = i0(floor, i12, i10);
        float i05 = i0(i11, i12, i10);
        float x10 = a6.x(i03, i02, B, i02);
        return (((((i05 - i04) * B) + i04) - x10) * B2) + x10;
    }

    public static double q(double d) {
        if (d < 0.0d) {
            return 0.0d;
        }
        if (d > 1.0d) {
            return 1.0d;
        }
        return d;
    }

    public static double q0(int i10, int i11) {
        long j10 = (i11 * (-4417276706812531889L)) ^ (i10 * (-7046029254386353131L));
        long j11 = (j10 ^ (j10 >>> 31)) * (-4658895280553007687L);
        long j12 = (j11 ^ (j11 >>> 27)) * (-7723592293110705685L);
        return ((j12 ^ (j12 >>> 31)) >>> 11) / 9.007199254740992E15d;
    }

    public static double r0(double d) {
        if (d <= 0.04045d) {
            return d / 12.92d;
        }
        return Math.pow((d + 0.055d) / 1.055d, 2.4d);
    }

    public static float r1(float f7) {
        return 1.0f - ((float) Math.pow(1.0f - f7, 2.4000000953674316d));
    }

    public static z0 s(int i10) {
        ?? obj = new Object();
        obj.f52175a = 0;
        obj.f52178f = i10;
        if (i10 == f51670r9) {
            obj.f52176b = -12602881;
            obj.f52177c = -15308082;
            obj.d = a.d[i10];
        } else {
            obj.f52176b = w(a.f51651b[i10], false);
            obj.f52177c = w(a.f51652c[i10], true);
            obj.d = a.d[i10];
        }
        if (i10 == f51670r9) {
            obj.e = -16747023;
        } else {
            j();
            obj.e = p9[i10];
        }
        k(obj);
        return obj;
    }

    public static int s0(float f7) {
        float pow;
        float max = Math.max(0.0f, Math.min(1.0f, f7));
        if (max <= 0.0031308f) {
            pow = max * 12.92f;
        } else {
            pow = (((float) Math.pow(max, 0.4166666567325592d)) * 1.055f) - 0.055f;
        }
        return Math.round(Math.max(0.0f, Math.min(1.0f, pow)) * 255.0f);
    }

    private void setPattern(y0 y0Var) {
        boolean z10;
        if (this.f51729f2) {
            y0 y0Var2 = this.G;
            if (y0Var2 != null && y0Var2 != this.F) {
                I0(y0Var2);
            }
            y0 y0Var3 = this.F;
            if (y0Var3 != y0Var) {
                I0(y0Var3);
            }
            this.G = null;
            this.F = y0Var;
            if (y0Var.f52145a == 2) {
                X(y0Var);
                if (y0Var.e == null) {
                    y0Var.f52148f = this.f51738g2;
                }
            }
            this.H = AnimationUtils.currentAnimationTimeMillis() - 10000;
            invalidate();
            return;
        }
        if (this.f51846s < 1.0f && this.f51836r != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        y0Var.h = z10;
        if (y0Var.f52145a == 2) {
            X(y0Var);
            if (y0Var.e == null) {
                y0Var.f52148f = this.f51738g2;
            }
        }
        y0 y0Var4 = this.G;
        if (y0Var4 != null && y0Var4 != this.F) {
            I0(y0Var4);
        }
        this.G = this.F;
        this.F = y0Var;
        this.H = AnimationUtils.currentAnimationTimeMillis();
        invalidate();
    }

    private void setSceneFromCard(z0 z0Var) {
        R0(z0Var, getWidth() / 2.0f, (l() / 2.0f) + m());
        if (this.f51729f2) {
            return;
        }
        this.f51822p2 = i(0.03f, 0.005f, this.f51804n2);
        this.f51804n2 = AnimationUtils.currentAnimationTimeMillis();
    }

    public static int t(z0 z0Var) {
        int i10;
        double d;
        int i11;
        if (z0Var != null) {
            i10 = i0.b.f(0.5f, z0Var.f52176b, z0Var.f52177c);
        } else {
            i10 = -16777216;
        }
        if (z0Var != null) {
            d = i0.b.h(z0Var.f52176b);
        } else {
            d = 0.3d;
        }
        float[] fArr = e1.f51980b;
        float max = (fArr[10] / 100.0f) * ((float) Math.max(0.0d, Math.min(1.0d, (0.85d - d) / 0.45d)));
        float f7 = (fArr[11] / 100.0f) + 1.0f;
        float f10 = ((0.5f - (f7 * 0.5f)) + max) * 255.0f;
        int k10 = i0.b.k(f((fArr[3] + fArr[9]) / 100.0f, 16777215), Color.rgb(Math.max(0, Math.min(255, Math.round((Color.red(i10) * f7) + f10))), Math.max(0, Math.min(255, Math.round((Color.green(i10) * f7) + f10))), Math.max(0, Math.min(255, Math.round((f7 * Color.blue(i10)) + f10)))));
        if (z0Var != null) {
            i11 = z0Var.f52180i;
        } else {
            i11 = 1073741824;
        }
        return i0.b.k(i11, k10);
    }

    public static PorterDuffColorFilter t0(y0 y0Var) {
        float[] fArr = e1.f51980b;
        int i10 = ((int) (fArr[14] * 10.0f)) ^ y0Var.f52153l;
        if (y0Var.f52158q == null || y0Var.f52157p != i10) {
            y0Var.f52157p = i10;
            y0Var.f52158q = new PorterDuffColorFilter(i0.b.f(fArr[14] / 100.0f, y0Var.f52153l, -1), PorterDuff.Mode.SRC_IN);
        }
        return y0Var.f52158q;
    }

    public static int u(int i10, int i11) {
        double d;
        double d10;
        double atan2;
        double min;
        double[] dArr = new double[3];
        double[] dArr2 = new double[3];
        double[] dArr3 = new double[3];
        h1(i11, dArr);
        h1(i10, dArr2);
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
            Z(d16, d18, d17, dArr3);
            if (1.05d / (((q(dArr3[2]) * 0.0722d) + ((q(dArr3[1]) * 0.7152d) + (q(dArr3[0]) * 0.2126d))) + 0.05d) > 4.4d) {
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
        Z(d21, d20, d19, dArr3);
        return Color.rgb((int) Math.round(q(b0(q(dArr3[0]))) * 255.0d), (int) Math.round(q(b0(q(dArr3[1]))) * 255.0d), (int) Math.round(q(b0(q(dArr3[2]))) * 255.0d));
    }

    public static int w(int i10, boolean z10) {
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

    public static void y0(double d, double d10, double d11, double[] dArr) {
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

    public static int z0(float f7, float f10, float f11, int i10) {
        float f12;
        float b12 = b1(Color.red(i10));
        float b13 = b1(Color.green(i10));
        float b14 = b1(Color.blue(i10));
        float cbrt = (float) Math.cbrt((0.051445995f * b14) + (0.53633255f * b13) + (0.41222146f * b12));
        float cbrt2 = (float) Math.cbrt((0.10739696f * b14) + (0.6806995f * b13) + (0.2119035f * b12));
        float f13 = b14 * 0.6299787f;
        float cbrt3 = (float) Math.cbrt(f13 + (b13 * 0.28171885f) + (b12 * 0.08830246f));
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
        return Color.rgb(s0((0.23096994f * f23) + ((4.0767417f * f21) - (3.3077116f * f22))), s0(((2.6097574f * f22) + ((-1.268438f) * f21)) - (0.34131938f * f23)), s0((f23 * 1.7076147f) + ((f21 * (-0.0041960864f)) - (f22 * 0.7034186f))));
    }

    public final void A(Canvas canvas, Path path, RectF rectF, float f7, float f10) {
        float f11;
        int i10;
        int i11;
        int i12;
        float f12;
        RectF rectF2;
        float f13;
        float f14;
        float[] fArr;
        float f15;
        float f16;
        int i13;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float[][] fArr2;
        float f22;
        int i14;
        Path path2 = path;
        int i15 = this.f51762i6;
        SweepGradient[] sweepGradientArr = this.f51772j6;
        int i16 = 4;
        float[][] fArr3 = e1.f51979a;
        int i17 = 1;
        if (i15 != 1) {
            this.f51762i6 = 1;
            int i18 = 0;
            while (i18 < i16) {
                float[] fArr4 = fArr3[i18];
                int[] iArr = new int[73];
                float[] fArr5 = new float[73];
                int i19 = i16;
                int i20 = 0;
                for (int i21 = 73; i20 < i21; i21 = 73) {
                    int i22 = i17;
                    float[] fArr6 = fArr4;
                    double radians = Math.toRadians(i20 * 5);
                    int[] iArr2 = iArr;
                    float pow = (float) Math.pow(Math.abs(Math.cos(radians)), fArr6[6]);
                    if (((float) Math.sin(radians)) < 0.0f) {
                        f11 = fArr6[11];
                    } else {
                        f11 = fArr6[12];
                    }
                    float f23 = f11 / 100.0f;
                    iArr2[i20] = f(Math.min(1.0f, (((fArr6[5] / 100.0f) - f23) * pow) + f23), 0);
                    fArr5[i20] = i20 / 72.0f;
                    i20++;
                    i17 = i22;
                    fArr4 = fArr6;
                    iArr = iArr2;
                }
                sweepGradientArr[i18] = new SweepGradient(0.0f, 0.0f, iArr, fArr5);
                i18++;
                i16 = i19;
            }
        }
        int i23 = i16;
        int i24 = i17;
        if (this.f51742g6) {
            i10 = i24;
        } else if (this.f51752h6) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        float[] fArr7 = fArr3[i10];
        float f24 = this.f51782k6;
        float[] fArr8 = e1.f51980b;
        float f25 = f24 * fArr8[0];
        float f26 = (this.f51790l6 * fArr8[i24]) / 100.0f;
        float dpf2 = AndroidUtilities.dpf2(fArr7[8]);
        if (dpf2 != 0.0f) {
            rectF2 = this.M6;
            rectF2.set(rectF);
            rectF2.inset(dpf2, dpf2);
            if (path2 != null) {
                i12 = 2;
                float width = rectF2.width() / Math.max(1.0f, rectF.width());
                i11 = i10;
                float height = rectF2.height() / Math.max(1.0f, rectF.height());
                float centerX = rectF.centerX();
                float centerY = rectF.centerY();
                Matrix matrix = this.F6;
                matrix.setScale(width, height, centerX, centerY);
                Path path3 = this.H6;
                path2.transform(matrix, path3);
                path2 = path3;
            } else {
                i11 = i10;
                i12 = 2;
            }
            f12 = Math.max(0.0f, f7 - dpf2);
        } else {
            i11 = i10;
            i12 = 2;
            f12 = f7;
            rectF2 = rectF;
        }
        Matrix matrix2 = this.N6;
        matrix2.setRotate(f25);
        matrix2.postScale(rectF2.width() / Math.max(1.0f, rectF2.height()), 1.0f);
        matrix2.postTranslate(rectF2.centerX(), rectF2.centerY());
        float dpf22 = AndroidUtilities.dpf2(fArr7[i23]);
        if (dpf22 > 0.05f) {
            SweepGradient sweepGradient = sweepGradientArr[i11];
            sweepGradient.setLocalMatrix(matrix2);
            Paint paint = this.C1;
            paint.setShader(sweepGradient);
            paint.setColor(-1);
            paint.setAlpha((int) (f10 * 255.0f));
            if (path2 == null) {
                paint.setStrokeWidth(dpf22);
                RectF rectF3 = this.B5;
                rectF3.set(rectF2);
                float f27 = (-dpf22) / 2.0f;
                rectF3.inset(f27, f27);
                float f28 = (dpf22 / 2.0f) + f12;
                canvas.drawRoundRect(rectF3, f28, f28, paint);
            } else {
                canvas.save();
                b0.b(canvas, path2);
                paint.setStrokeWidth(dpf22 * 2.0f);
                canvas.drawPath(path2, paint);
                canvas.restore();
            }
            paint.setShader(null);
            paint.setAlpha(255);
        }
        double radians2 = Math.toRadians(f25);
        float f29 = (float) (-Math.sin(radians2));
        float cos = (float) Math.cos(radians2);
        float dpf23 = AndroidUtilities.dpf2(fArr7[0]);
        float dpf24 = AndroidUtilities.dpf2(fArr7[i12]);
        if (this.f51752h6) {
            f13 = 0.0f;
        } else {
            f13 = ((fArr8[21] * 1.25f) / 100.0f) * this.H5;
        }
        int i25 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
        if (i25 > 0 && this.f51710d3) {
            f14 = f29;
            fArr = fArr7;
            f15 = V0(rectF2.centerX(), rectF2.top, getWidth(), getHeight());
        } else {
            f14 = f29;
            fArr = fArr7;
            f15 = 0.0f;
        }
        if (i25 > 0 && this.f51710d3) {
            f16 = V0(rectF2.centerX(), rectF2.bottom, getWidth(), getHeight());
        } else {
            f16 = 0.0f;
        }
        float f30 = (f15 * f13) + 1.0f;
        float min = Math.min(1.0f, f30 * (f26 + 1.0f) * (fArr[i24] / 100.0f));
        float f31 = (f13 * f16) + 1.0f;
        float min2 = Math.min(1.0f, f31 * (1.0f - f26) * (fArr[3] / 100.0f));
        if (Build.VERSION.SDK_INT >= 29) {
            i13 = i24;
        } else {
            i13 = 0;
        }
        int i26 = 0;
        for (int i27 = i12; i26 < i27; i27 = 2) {
            if (i26 == 0) {
                f17 = dpf23;
            } else {
                f17 = -dpf24;
            }
            if (i26 == 0) {
                f18 = min;
            } else {
                f18 = min2;
            }
            if (f18 <= 0.004f || Math.abs(f17) < 0.1f) {
                f19 = f12;
                f20 = min;
                f21 = min2;
                fArr2 = fArr3;
                f22 = cos;
                i14 = i24;
            } else {
                canvas.save();
                Path path4 = this.J6;
                f20 = min;
                Path path5 = this.K6;
                if (path2 == null) {
                    f21 = min2;
                    fArr2 = fArr3;
                    float min3 = Math.min(f12, Math.min(rectF2.width(), rectF2.height()) / 2.0f);
                    path4.rewind();
                    Path.Direction direction = Path.Direction.CW;
                    path4.addRoundRect(rectF2, min3, min3, direction);
                    f19 = f12;
                    RectF rectF4 = this.I6;
                    rectF4.set(rectF2);
                    f22 = cos;
                    rectF4.offset(f14 * f17, f17 * f22);
                    path5.rewind();
                    path5.addRoundRect(rectF4, min3, min3, direction);
                } else {
                    f19 = f12;
                    f21 = min2;
                    fArr2 = fArr3;
                    f22 = cos;
                    path4.set(path2);
                    path5.set(path2);
                    path5.offset(f14 * f17, f22 * f17);
                }
                b0.b(canvas, path5);
                Paint paint2 = this.B1;
                if (i13 == 0) {
                    float f32 = fArr2[i11][10];
                    int i28 = this.L6;
                    paint2.setColor(Color.rgb(Math.max(0, Math.min(255, Math.round(((Color.red(i28) - 255) * f32) + 255.0f))), Math.max(0, Math.min(255, Math.round(((Color.green(i28) - 255) * f32) + 255.0f))), Math.max(0, Math.min(255, Math.round(((Color.blue(i28) - 255) * f32) + 255.0f)))));
                    paint2.setAlpha((int) (f18 * 255.0f * f10));
                    i14 = i24;
                } else {
                    int round = Math.round(Math.max(0.0f, Math.min(1.0f, f18)) * 255.0f);
                    paint2.setColor(round | (round << 16) | (-16777216) | (round << 8));
                    paint2.setAlpha((int) (f10 * 255.0f));
                    i14 = i24;
                    b0.i(paint2, i14);
                }
                canvas.drawPath(path4, paint2);
                if (i13 != 0) {
                    b0.i(paint2, 0);
                }
                canvas.restore();
            }
            i26++;
            i24 = i14;
            min = f20;
            min2 = f21;
            fArr3 = fArr2;
            f12 = f19;
            cos = f22;
        }
    }

    public final void A0(y0 y0Var, Bitmap bitmap) {
        y0Var.e = bitmap;
        if (bitmap != null && g0.a.g()) {
            y0Var.f52154m = bitmap;
            y0Var.f52155n = g0.a.a(bitmap);
            y0Var.f52156o = g0.a.a(bitmap);
            this.f51750h4 = bitmap;
            this.f51740g4 = g0.a.a(bitmap);
            if (e1.f51980b[35] > 0.5f) {
                W(bitmap);
            }
            t0(y0Var);
        }
        y0Var.f52149g = AnimationUtils.currentAnimationTimeMillis();
        this.f51738g2 = bitmap;
        invalidate();
    }

    public final void B(android.graphics.Canvas r22, zh.y0 r23, int r24, float r25, float r26, float r27, float r28, float r29) {
        throw new UnsupportedOperationException("Method not decompiled: zh.b1.B(android.graphics.Canvas, zh.y0, int, float, float, float, float, float):void");
    }

    public final void B0(int i10) {
        if (!this.f51675a) {
            return;
        }
        if (i10 == 2 && !UserConfig.getInstance(this.f51685b).isPremium()) {
            W0(0, LocaleController.getString(R.string.QrPremiumGiftsToast), LocaleController.getString(R.string.QrPremiumSubscribe));
            g0();
            return;
        }
        if (i10 == 2 && (this.f51747h1 != i10 || this.f51728f1 < 0.5f)) {
            AnimationUtils.currentAnimationTimeMillis();
        }
        this.f51747h1 = i10;
        this.f51757i1 = i10;
        this.f51767j1 = 0.0f;
        this.U8.forceFinished(true);
        if (this.f51728f1 > 0.5f) {
            this.I5 = AnimationUtils.currentAnimationTimeMillis();
        }
        if (this.f51737g1 < 0.5f) {
            this.I2 = AnimationUtils.currentAnimationTimeMillis();
        }
        this.f51737g1 = 1.0f;
        j0();
        if (this.f51747h1 == 2) {
            u0();
        }
        g0();
    }

    public final void C(Canvas canvas, int i10, int i11, y0 y0Var, y0 y0Var2, float f7, boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        boolean z12;
        float f13;
        int i12;
        boolean z13;
        float f14;
        float f15;
        int i13;
        int i14;
        int i15;
        float f16;
        y0 y0Var3;
        Canvas canvas2;
        y0 y0Var4;
        b1 b1Var = this;
        Canvas canvas3 = canvas;
        y0 y0Var5 = y0Var;
        y0 y0Var6 = y0Var2;
        b1Var.V(y0Var5);
        b1Var.V(y0Var6);
        if (y0Var5 != null) {
            y0Var5.H.a(canvas3);
            y0Var5.I.a(canvas3);
        }
        d1 d1Var = y0Var6.H;
        d1 d1Var2 = y0Var6.I;
        d1Var.a(canvas3);
        d1Var2.a(canvas3);
        float dp = AndroidUtilities.dp(86.0f);
        float dp2 = AndroidUtilities.dp(70.0f);
        float dp3 = AndroidUtilities.dp(90.0f) * 1.3f;
        float f17 = b1Var.K + b1Var.N;
        float f18 = b1Var.L + b1Var.O;
        float f19 = -dp3;
        boolean z14 = true;
        int floor = ((int) Math.floor((f19 - f18) / dp2)) - 1;
        int ceil = ((int) Math.ceil(((i11 + dp3) - f18) / dp2)) + 1;
        AndroidUtilities.dp(24.0f);
        while (floor <= ceil) {
            int i16 = floor & 1;
            if (i16 == 0) {
                f10 = 0.0f;
            } else {
                f10 = dp / 2.0f;
            }
            boolean z15 = z14;
            float f20 = f10;
            int floor2 = ((int) Math.floor(((f19 - f17) - f10) / dp)) - 1;
            int i17 = i10;
            int ceil2 = ((int) Math.ceil((((i17 + dp3) - f17) - f20) / dp)) + 1;
            int i18 = floor2;
            while (i18 <= ceil2) {
                double q02 = q0(floor, i18);
                if (a0(53.1d * q02) < 0.2f) {
                    f11 = dp3;
                    f15 = f17;
                    i14 = floor;
                    i13 = ceil2;
                    i15 = i18;
                    y0Var4 = y0Var6;
                    z13 = z15;
                    f12 = f20;
                    canvas2 = canvas;
                    y0Var3 = y0Var;
                    f14 = f19;
                    i12 = ceil;
                } else {
                    f11 = dp3;
                    b1Var.C0(q02, 3.0f, 10.0f);
                    float f21 = f17;
                    float f22 = (float) (2.0d * q02 * 3.141592653589793d);
                    float f23 = f20;
                    f12 = f23;
                    float c10 = b1Var.f51860t4 + r.c.c(i18, dp, f23, f21);
                    float sin = (floor * dp2) + f18 + b1Var.f51869u4 + (((float) Math.sin((b1Var.f51840r3 * 0.45f) + f22)) * AndroidUtilities.dp(3.0f));
                    if (i16 == 0) {
                        z12 = z15;
                    } else {
                        z12 = false;
                    }
                    float dp4 = AndroidUtilities.dp(38.0f);
                    if (z12) {
                        f13 = 1.3f;
                    } else {
                        f13 = 0.9f;
                    }
                    float f24 = dp4 * f13;
                    int i19 = i18;
                    float f25 = (float) q02;
                    float A = a6.A(f25, 0.16f, 0.92f, f24);
                    int i20 = ceil;
                    int i21 = floor;
                    i12 = i20;
                    z13 = z15;
                    f14 = f19;
                    f15 = f21;
                    i13 = ceil2;
                    i14 = i21;
                    i15 = i19;
                    if (!F0(c10, sin, A, i17, i11, 0, i21, i19, (Math.max(0.0f, (A / AndroidUtilities.dp(24.0f)) - 1.0f) * 0.8f) + 1.0f)) {
                        canvas2 = canvas;
                        y0Var4 = y0Var6;
                    } else {
                        if (z12) {
                            f16 = A * 0.9f;
                        } else {
                            f16 = A;
                        }
                        float sin2 = (((float) Math.sin((this.f51840r3 * 0.3f) + f22)) * 4.0f) + ((f25 - 0.5f) * 26.0f);
                        float a02 = a0(59.3d * q02) * 0.3f;
                        int i22 = (i15 - ((i14 - i16) / 2)) - i14;
                        int length = y0Var6.f52146b.length;
                        int i23 = ((i22 % length) + length) % length;
                        float a03 = a0(71.9d * q02);
                        if (y0Var == null) {
                            float f26 = f22 * 2.0f;
                            float Y0 = Y0(z10, z11, f7 - a02);
                            canvas2 = canvas;
                            y0Var4 = y0Var6;
                            B(canvas2, y0Var4, i23, f16, sin2, f26, Y0, a03);
                        } else {
                            y0 y0Var7 = y0Var6;
                            y0Var3 = y0Var;
                            Drawable[] drawableArr = y0Var3.f52146b;
                            int length2 = drawableArr.length;
                            int i24 = ((i22 % length2) + length2) % length2;
                            if (drawableArr[i24] == y0Var7.f52146b[i23]) {
                                float f27 = f22 * 2.0f;
                                canvas2 = canvas;
                                B(canvas2, y0Var7, i23, f16, sin2, f27, 1.0f, a03);
                                y0Var4 = y0Var2;
                            } else {
                                float f28 = f22 * 2.0f;
                                float f29 = f7 - a02;
                                float Y02 = Y0(z13, false, f29);
                                canvas2 = canvas;
                                B(canvas2, y0Var3, i24, f16, sin2, f28, Y02, a03);
                                y0Var3 = y0Var;
                                y0Var4 = y0Var2;
                                B(canvas2, y0Var4, i23, f16, sin2, f28, Y0(false, false, f29), a03);
                            }
                        }
                    }
                    y0Var3 = y0Var;
                }
                i18 = i15 + 1;
                b1Var = this;
                i17 = i10;
                canvas3 = canvas2;
                floor = i14;
                f19 = f14;
                ceil = i12;
                dp3 = f11;
                f20 = f12;
                ceil2 = i13;
                z15 = z13;
                y0Var5 = y0Var3;
                y0Var6 = y0Var4;
                f17 = f15;
            }
            float f30 = f17;
            floor++;
            b1Var = this;
            z14 = z15;
            y0Var5 = y0Var5;
            dp3 = dp3;
            y0Var6 = y0Var6;
            f17 = f30;
        }
        Canvas canvas4 = canvas3;
        y0 y0Var8 = y0Var6;
        y0 y0Var9 = y0Var5;
        if (y0Var9 != null) {
            y0Var9.H.b(canvas4);
            y0Var9.I.b(canvas4);
        }
        y0Var8.H.b(canvas4);
        d1Var2.b(canvas4);
    }

    public final void C0(double d, float f7, float f10) {
        double d10;
        float a02 = ((a0(31.7d * d) * (f10 - f7)) + f7) * AndroidUtilities.dp(1.0f);
        float a03 = (a0(37.1d * d) * 11.0f) + 9.0f;
        if (a0(43.3d * d) < 0.5f) {
            d10 = -1.0d;
        } else {
            d10 = 1.0d;
        }
        double d11 = (d * 6.283d) + ((((d10 * 2.0d) * 3.141592653589793d) * this.f51840r3) / a03);
        this.f51860t4 = ((float) Math.cos(d11)) * a02;
        this.f51869u4 = a02 * ((float) Math.sin(d11));
    }

    public final void D(android.graphics.Canvas r73, int r74, int r75, zh.y0 r76, boolean r77, boolean r78, float r79) {
        throw new UnsupportedOperationException("Method not decompiled: zh.b1.D(android.graphics.Canvas, int, int, zh.y0, boolean, boolean, float):void");
    }

    public final float D0() {
        return (T0() - U0()) + AndroidUtilities.dp(8.0f);
    }

    public final void E(Canvas canvas, RectF rectF, int i10) {
        float centerY = rectF.centerY();
        float dp = AndroidUtilities.dp(12.0f);
        p6 p6Var = this.L0;
        float c10 = p6Var.c() + AndroidUtilities.dp(2.0f) + dp;
        float dp2 = rectF.left + AndroidUtilities.dp(8.0f);
        N(canvas, dp2, centerY, dp, i10, true);
        p6Var.u(i10);
        p6Var.setBounds((int) (dp2 + dp + AndroidUtilities.dp(2.0f)), (int) (centerY - AndroidUtilities.dp(8.0f)), (int) (dp2 + c10 + AndroidUtilities.dp(40.0f)), (int) (centerY + AndroidUtilities.dp(8.0f)));
        p6Var.draw(canvas);
    }

    public final void E0(float f7, float f10, int i10) {
        TLRPC.Document document;
        TLRPC.Document document2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f51875v1.get(i10);
        ?? obj = new Object();
        obj.f52175a = 2;
        obj.f52178f = i10;
        y0 y0Var = new y0();
        y0Var.f52145a = 2;
        y0Var.f52151j = i10;
        long j10 = tL_starGiftUnique.f20496id;
        y0Var.f52152k = (int) (j10 ^ (j10 >>> 32));
        ArrayList<TL_stars.StarGiftAttribute> arrayList = tL_starGiftUnique.attributes;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i11);
            i11++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            boolean z10 = starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern;
            int i12 = this.f51685b;
            if (z10 && (document2 = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document) != null) {
                y0Var.f52165y = document2;
                y0Var.f52147c = r5.m(i12, 9, document2);
            } else if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) && (document = ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document) != null) {
                y0Var.f52164x = document;
                y0Var.d = r5.m(i12, 24, document);
            }
        }
        int[] iArr = this.f51748h2;
        c0(i10, iArr);
        obj.f52176b = w(iArr[0], false);
        int w9 = w(iArr[1], true);
        obj.f52177c = w9;
        obj.d = iArr[2];
        obj.e = u(obj.f52176b, w9);
        k(obj);
        int e12 = e1(obj.d, obj.f52176b);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        y0Var.f52150i.setColorFilter(new PorterDuffColorFilter(e12, mode));
        i0.b.j(e1(obj.d, obj.f52176b) | (-16777216), r10);
        double min = Math.min(97.0d, r10[0] + 20.0d);
        double[] dArr = {min};
        Color.colorToHSV(i0.b.b(min, dArr[1], dArr[2]), r6);
        float[] fArr = {0.0f, Math.min(1.0f, fArr[1] * 1.15f)};
        y0Var.f52153l = Color.HSVToColor(fArr) | (-16777216);
        y0Var.f52159r.setColorFilter(new PorterDuffColorFilter(y0Var.f52153l, mode));
        y0Var.f52157p = -1;
        y0Var.f52166z = tL_starGiftUnique;
        r5 r5Var = y0Var.f52147c;
        if (r5Var != null) {
            r5Var.a(this);
        }
        r5 r5Var2 = y0Var.d;
        if (r5Var2 != null) {
            r5Var2.a(this);
        }
        this.I.clear();
        R0(obj, f7, f10);
        if (!this.f51729f2) {
            this.f51822p2 = i(0.03f, 0.005f, this.f51804n2);
            this.f51804n2 = AnimationUtils.currentAnimationTimeMillis();
        }
        setPattern(y0Var);
    }

    public final void F(Canvas canvas, RectF rectF, float f7) {
        int i10;
        z0 z0Var = this.f51801n;
        if (z0Var != null) {
            i10 = i0.b.f(0.5f, z0Var.f52176b, z0Var.f52177c);
        } else {
            i10 = -12947803;
        }
        Paint paint = this.B1;
        paint.setColor(i10 | (-16777216));
        paint.setAlpha((int) (Utilities.clamp01(f7) * 224.4f));
        canvas.drawRect(rectF, paint);
    }

    public final boolean F0(float r39, float r40, float r41, int r42, int r43, int r44, int r45, int r46, float r47) {
        throw new UnsupportedOperationException("Method not decompiled: zh.b1.F0(float, float, float, int, int, int, int, int, float):boolean");
    }

    public final void G(android.graphics.Canvas r29, int r30, org.telegram.tgnet.tl.TL_stars.TL_starGiftUnique r31, float r32, float r33, float r34, float r35) {
        throw new UnsupportedOperationException("Method not decompiled: zh.b1.G(android.graphics.Canvas, int, org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique, float, float, float, float):void");
    }

    public final float G0(float f7) {
        if (!this.f51710d3 || this.X3 <= 0.001f) {
            return 0.0f;
        }
        float f10 = this.W3;
        float[] fArr = e1.f51980b;
        float max = f10 / Math.max(0.3f, fArr[50]);
        if (max > 4.0f || max < -4.0f) {
            return 0.0f;
        }
        return Math.min(AndroidUtilities.dpf2(fArr[42]), (AndroidUtilities.dp(3.5f) / 2.0f) / 0.607f) * f7 * max * ((float) Math.exp((-0.5f) * max * max)) * this.X3;
    }

    public final void H(Canvas canvas, RectF rectF, float f7, float f10) {
        RectF rectF2;
        float f11;
        RectF rectF3;
        float f12;
        float f13;
        char c10;
        char c11;
        float f14;
        float f15;
        int i10;
        int i11;
        double d;
        if (f10 <= 0.0f) {
            return;
        }
        if (this.D6) {
            g(canvas, rectF, f7);
        }
        if (this.f51752h6) {
            float min = Math.min(0.0f, AndroidUtilities.dpf2(e1.f51979a[2][8]));
            rectF3 = this.C5;
            rectF2 = rectF;
            rectF3.set(rectF2);
            rectF3.inset(min, min);
            f11 = f7 - min;
        } else {
            rectF2 = rectF;
            f11 = f7;
            rectF3 = rectF2;
        }
        Path path = this.G1;
        path.rewind();
        path.addRoundRect(rectF3, f11, f11, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        boolean f16 = b0.f();
        float[] fArr = e1.f51980b;
        if (f16 && h0(canvas)) {
            int i12 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            if (i12 < 0) {
                canvas.saveLayerAlpha(rectF3, (int) (f10 * 255.0f));
            }
            canvas.save();
            canvas.scale(4.0f, 4.0f);
            if (this.Y5 && this.X5 > 0.004f) {
                canvas.scale(2.0f, 2.0f);
                if (this.Z5 == null) {
                    this.Z5 = android.support.v4.media.session.x.d("qrSheetLift");
                }
                float round = Math.round(this.X5 * 50.0f) / 50.0f;
                z0 z0Var = this.f51801n;
                if (z0Var != null) {
                    i11 = z0Var.f52176b;
                } else {
                    i11 = 0;
                }
                c10 = '\t';
                c11 = 3;
                if (round == this.f51681a6 && this.f51692b6 == 1 && this.f51703c6 == i11) {
                    f12 = 0.0f;
                    i10 = i12;
                    f13 = 255.0f;
                } else {
                    this.f51681a6 = round;
                    this.f51692b6 = 1;
                    this.f51703c6 = i11;
                    Object obj = this.Z5;
                    if (z0Var != null) {
                        d = i0.b.h(z0Var.f52176b);
                    } else {
                        d = 0.3d;
                    }
                    f13 = 255.0f;
                    f12 = 0.0f;
                    i10 = i12;
                    float d10 = a1.g.d(fArr[11], 100.0f, round, 1.0f);
                    float max = ((0.5f - (d10 * 0.5f)) + ((fArr[10] / 100.0f) * round * ((float) Math.max(0.0d, Math.min(1.0d, (0.85d - d) / 0.45d))))) * 255.0f;
                    b0.k(obj, Math.max(0.5f, AndroidUtilities.dpf2(AndroidUtilities.lerp(fArr[2], fArr[12], round)) / 8.0f), new float[]{d10, 0.0f, 0.0f, 0.0f, max, 0.0f, d10, 0.0f, 0.0f, max, 0.0f, 0.0f, d10, 0.0f, max, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                }
                Canvas a2 = b0.a((getWidth() + 7) / 8, (getHeight() + 7) / 8, this.Z5);
                a2.scale(0.125f, 0.125f);
                b0.c(a2, this.I1);
                b0.d(this.Z5);
                b0.c(canvas, this.Z5);
            } else {
                f12 = 0.0f;
                i10 = i12;
                f13 = 255.0f;
                c10 = '\t';
                c11 = 3;
                b0.c(canvas, this.J1);
            }
            canvas.restore();
            if (i10 < 0) {
                canvas.restore();
            }
        } else {
            f12 = 0.0f;
            f13 = 255.0f;
            c10 = '\t';
            c11 = 3;
            F(canvas, rectF3, f10);
        }
        int i13 = this.D8;
        if (i13 == 0) {
            float f17 = fArr[c11];
            if (this.Y5) {
                f15 = fArr[c10] * this.X5;
            } else {
                f15 = f12;
            }
            i13 = f((f17 + f15) / 100.0f, 16777215);
        }
        Paint paint = this.B1;
        paint.setColor(i13);
        paint.setAlpha((int) (Color.alpha(paint.getColor()) * f10));
        canvas.drawRect(rectF3, paint);
        float min2 = Math.min(rectF3.height(), AndroidUtilities.dp(40.0f));
        Matrix matrix = this.N6;
        matrix.setScale(1.0f, min2);
        matrix.postTranslate(f12, rectF3.top);
        LinearGradient linearGradient = this.f51733f6;
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
        paint.setAlpha((int) (f10 * f13));
        canvas.drawRect(rectF3, paint);
        paint.setShader(null);
        boolean z10 = this.Y5;
        if (!z10 && !this.f51752h6) {
            f14 = (fArr[21] / 100.0f) * this.H5;
        } else {
            f14 = 0.0f;
        }
        if ((f14 > 0.0f || fArr[39] > 0.0f) && this.f51710d3 && !z10 && !this.f51752h6) {
            int width = getWidth();
            int height = getHeight();
            float V0 = V0(rectF3.left, rectF3.centerY(), width, height);
            float V02 = V0(rectF3.centerX(), rectF3.centerY(), width, height);
            float V03 = V0(rectF3.right, rectF3.centerY(), width, height);
            if (V0 + V02 + V03 > 0.01f) {
                float f18 = ((fArr[39] * 1.25f) / 100.0f) * this.H5 * 0.1f;
                float f19 = V02 * f18 * f10;
                float centerX = rectF3.centerX();
                J(rectF3.left, centerX, V0 * f18 * f10, f19, canvas, rectF3);
                J(centerX, rectF3.right, f19, f18 * V03 * f10, canvas, rectF3);
            }
        }
        canvas.restore();
        A(canvas, null, rectF2, f7, f10);
    }

    public final int H0() {
        z0 z0Var = this.f51801n;
        if (z0Var == null) {
            return -16777216;
        }
        if (this.f51846s < 1.0f && this.f51836r != null) {
            float l4 = (l() / 2.0f) + m();
            float clamp01 = Utilities.clamp01(((((((float) Math.hypot(Math.max(this.f51883w, getWidth() - this.f51883w), Math.max(this.f51893x, getHeight() - this.f51893x))) + AndroidUtilities.dp(60.0f)) * r1(this.f51846s)) - ((float) Math.hypot((getWidth() / 2.0f) - this.f51883w, l4 - this.f51893x))) + AndroidUtilities.dp(80.0f)) / AndroidUtilities.dp(160.0f));
            int i10 = this.f51836r.e;
            int i11 = this.f51801n.e;
            float B = a6.B(clamp01, 2.0f, 3.0f, clamp01 * clamp01);
            double[] dArr = this.W2;
            i0.b.j(i10, dArr);
            double[] dArr2 = this.X2;
            i0.b.j(i11, dArr2);
            double d = B;
            double[] dArr3 = this.Y2;
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
        return z0Var.e;
    }

    public final void I(Canvas canvas) {
        float f7;
        float dp;
        int i10;
        int i11;
        float f10;
        float f11;
        float f12;
        float Z0;
        int i12;
        Bitmap bitmap;
        float f13;
        float dp2;
        Canvas canvas2 = canvas;
        if (this.f51777k1 <= 0.001f) {
            return;
        }
        float dp3 = AndroidUtilities.dp(222.0f);
        float dp4 = AndroidUtilities.dp(46.0f);
        float dp5 = AndroidUtilities.dp(54.0f);
        AndroidUtilities.dp(8.0f);
        if (this.f51904y0) {
            f7 = dp4 + dp4;
        } else {
            f7 = dp4 + dp5 + dp4;
        }
        int i13 = (this.f51728f1 > 0.5f ? 1 : (this.f51728f1 == 0.5f ? 0 : -1));
        RectF rectF = this.f51816o5;
        if (i13 > 0) {
            dp = (rectF.bottom + AndroidUtilities.dp(6.0f)) - f7;
        } else {
            dp = rectF.top - AndroidUtilities.dp(6.0f);
        }
        float f14 = dp;
        float width = (getWidth() - dp3) / 2.0f;
        RectF rectF2 = this.f51873u8;
        rectF2.set(width, f14, dp3 + width, f7 + f14);
        float f15 = this.f51819o8;
        float f16 = this.f51827p8;
        float clamp01 = Utilities.clamp01(this.f51777k1);
        float lerp = AndroidUtilities.lerp(rectF.left, rectF2.left, f15);
        float lerp2 = AndroidUtilities.lerp(rectF.top, rectF2.top, f16);
        float lerp3 = AndroidUtilities.lerp(rectF.right, rectF2.right, f15);
        float lerp4 = AndroidUtilities.lerp(rectF.bottom, rectF2.bottom, f16);
        RectF rectF3 = this.f51864t8;
        rectF3.set(lerp, lerp2, lerp3, lerp4);
        float min = Math.min(rectF3.height() / 2.0f, Math.min(rectF3.width() / 2.0f, AndroidUtilities.lerp(rectF.height() / 2.0f, AndroidUtilities.dp(22.0f), Utilities.clamp01(f16))));
        float max = Math.max(-0.25f, Math.min(1.0f, this.f51835q8 / 9.0f)) * AndroidUtilities.dp(5.0f);
        float f17 = rectF3.left;
        float f18 = rectF3.top;
        float f19 = rectF3.right;
        float f20 = rectF3.bottom;
        float centerX = rectF3.centerX();
        Path path = this.f51855s8;
        path.rewind();
        float f21 = f17 + min;
        path.moveTo(f21, f18);
        float f22 = f19 - min;
        path.lineTo(f22, f18);
        float f23 = f18 + min;
        path.quadTo(f19, f18, f19, f23);
        float f24 = f20 - min;
        path.lineTo(f19, f24);
        path.quadTo(f19, f20, f22, f20);
        float f25 = f20 + max;
        path.cubicTo(AndroidUtilities.lerp(f22, centerX, 0.55f), f25, AndroidUtilities.lerp(f21, centerX, 0.55f), f25, f21, f20);
        path.quadTo(f17, f20, f17, f24);
        path.lineTo(f17, f23);
        path.quadTo(f17, f18, f21, f18);
        path.close();
        RectF rectF4 = this.H1;
        rectF4.set(f17, f18, f19, Math.max(0.0f, max) + f20);
        if (this.D6) {
            g(canvas2, rectF4, Math.min(rectF4.height(), rectF4.width()) / 2.0f);
        }
        canvas2.save();
        canvas2.clipPath(path);
        if (b0.f() && h0(canvas)) {
            canvas2.save();
            canvas2.scale(4.0f, 4.0f);
            b0.c(canvas2, this.J1);
            canvas2.restore();
        } else {
            F(canvas2, rectF4, 1.0f);
        }
        Paint paint = this.B1;
        paint.setColor(352321535);
        paint.setAlpha((int) (Color.alpha(paint.getColor()) * 1.0f));
        canvas2.drawRect(rectF4, paint);
        float min2 = Math.min(rectF4.height(), AndroidUtilities.dp(40.0f));
        Matrix matrix = this.N6;
        matrix.setScale(1.0f, min2);
        matrix.postTranslate(0.0f, rectF4.top);
        LinearGradient linearGradient = this.f51733f6;
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
        float f26 = 255.0f;
        paint.setAlpha((int) 255.0f);
        canvas2.drawRect(rectF4, paint);
        paint.setShader(null);
        canvas2.restore();
        A(canvas2, path, rectF4, 0.0f, 1.0f);
        canvas2.save();
        canvas2.clipPath(path);
        float f27 = clamp01 / 0.3f;
        float clamp012 = 1.0f - Utilities.clamp01(f27);
        float f28 = 0.004f;
        float f29 = 0.15f;
        boolean z10 = false;
        int i14 = 1;
        if (clamp012 > 0.004f) {
            canvas2.saveLayerAlpha(rectF4, (int) (clamp012 * 255.0f));
            float clamp013 = 1.0f - (Utilities.clamp01(f27) * 0.15f);
            canvas2.scale(clamp013, clamp013, rectF.centerX(), rectF.centerY());
            this.f51908y5 = true;
            int width2 = getWidth();
            System.currentTimeMillis();
            z(canvas2, width2);
            this.f51908y5 = false;
            canvas2.restore();
        }
        float centerX2 = rectF3.centerX() - rectF2.centerX();
        float f30 = rectF3.top - rectF2.top;
        float f31 = 0.6f;
        if (Math.abs(this.f51835q8) < 0.6f) {
            centerX2 = Math.round(centerX2);
            f30 = Math.round(f30);
        }
        canvas2.save();
        canvas2.translate(centerX2, f30);
        TextPaint textPaint = this.E1;
        textPaint.setSubpixelText(true);
        textPaint.setLinearText(false);
        boolean z11 = this.f51894x0;
        String string = LocaleController.getString(R.string.QrNoPaidMenuReset);
        if (z11) {
            i10 = R.string.QrNoPaidMenuDisableTimer;
        } else {
            i10 = R.string.QrNoPaidMenuEnableTimer;
        }
        String[] strArr = {string, LocaleController.getString(i10), LocaleController.getString(R.string.QrNoPaidMenuRestoreFee)};
        if (this.f51894x0) {
            i11 = R.string.QrNoPaidMenuDisableTimerInfo;
        } else {
            i11 = R.string.QrNoPaidMenuEnableTimerInfo;
        }
        String[] strArr2 = {null, LocaleController.getString(i11), null};
        int i15 = 0;
        float f32 = f14;
        while (i15 < 3) {
            RectF[] rectFArr = this.f51764i8;
            if (i15 == i14 && this.f51904y0) {
                rectFArr[i15].setEmpty();
                i12 = i15;
                f11 = f28;
                f12 = f26;
            } else {
                if (strArr2[i15] != null) {
                    f10 = dp5;
                } else {
                    f10 = dp4;
                }
                f11 = f28;
                f12 = f26;
                float f33 = f32 + f10;
                rectFArr[i15].set(rectF2.left, f32, rectF2.right, f33);
                if (this.l1 > 0.5f) {
                    Z0 = Z0(f29, f31, clamp01);
                } else {
                    Z0 = Z0(f31, 1.0f, clamp01);
                }
                if (Z0 <= f11) {
                    i12 = i15;
                } else {
                    K(canvas2, i15, rectFArr[i15], z10);
                    canvas2.save();
                    float f34 = (f10 / 2.0f) + f32;
                    if (i15 == 2) {
                        i12 = i15;
                        m0(canvas2, this.M1, rectF2.left + AndroidUtilities.dp(26.0f), f34, AndroidUtilities.dp(20.0f), Z0);
                        canvas2 = canvas;
                    } else {
                        i12 = i15;
                        if (i12 == 0) {
                            canvas2 = canvas;
                            m0(canvas2, this.T1, rectF2.left + AndroidUtilities.dp(26.0f), f34, AndroidUtilities.dp(20.0f), Z0);
                        } else {
                            canvas2 = canvas;
                            boolean z12 = this.f51894x0;
                            if (z12) {
                                bitmap = this.f51911y8;
                            } else {
                                bitmap = this.f51920z8;
                            }
                            if (bitmap != null) {
                                f13 = 26.0f;
                            } else {
                                int round = Math.round(AndroidUtilities.dp(22.4f));
                                Bitmap createBitmap = Bitmap.createBitmap(round, round, Bitmap.Config.ALPHA_8);
                                f13 = 26.0f;
                                Canvas canvas3 = new Canvas(createBitmap);
                                float f35 = round / 24.0f;
                                canvas3.scale(f35, f35);
                                Paint paint2 = new Paint(1);
                                Paint.Style style = Paint.Style.STROKE;
                                paint2.setStyle(style);
                                paint2.setStrokeWidth(1.66f);
                                Paint.Cap cap = Paint.Cap.ROUND;
                                paint2.setStrokeCap(cap);
                                paint2.setStrokeJoin(Paint.Join.ROUND);
                                paint2.setColor(-16777216);
                                canvas3.drawCircle(11.0f, 11.0f, 8.0f, paint2);
                                canvas3.drawLine(11.0f, 11.0f, 11.0f, 6.6f, paint2);
                                canvas3.drawLine(11.0f, 11.0f, 7.8f, 11.0f, paint2);
                                if (z12) {
                                    Paint paint3 = new Paint(1);
                                    paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                                    canvas3.drawCircle(18.2f, 18.2f, 5.7f, paint3);
                                    Paint paint4 = new Paint(1);
                                    paint4.setColor(-16777216);
                                    canvas3.drawCircle(18.2f, 18.2f, 4.4f, paint4);
                                    paint3.setStyle(style);
                                    paint3.setStrokeWidth(1.4f);
                                    paint3.setStrokeCap(cap);
                                    canvas3.drawLine(16.6f, 16.6f, 19.8f, 19.8f, paint3);
                                    canvas3.drawLine(19.8f, 16.6f, 16.6f, 19.8f, paint3);
                                    this.f51911y8 = createBitmap;
                                } else {
                                    this.f51920z8 = createBitmap;
                                }
                                bitmap = createBitmap;
                            }
                            float dp6 = rectF2.left + AndroidUtilities.dp(f13);
                            Paint paint5 = this.A8;
                            paint5.setColor(-1);
                            paint5.setAlpha((int) (Color.alpha(-1) * Z0));
                            canvas2.drawBitmap(bitmap, dp6 - (bitmap.getWidth() / 2.0f), f34 - (bitmap.getHeight() / 2.0f), paint5);
                        }
                    }
                    textPaint.setTextSize(AndroidUtilities.dp(15.0f));
                    textPaint.setColor(-1);
                    textPaint.setAlpha((int) (Z0 * f12));
                    String str = strArr[i12];
                    float dp7 = rectF2.left + AndroidUtilities.dp(52.0f);
                    if (strArr2[i12] != null) {
                        dp2 = f34 - AndroidUtilities.dp(2.0f);
                    } else {
                        dp2 = AndroidUtilities.dp(5.0f) + f34;
                    }
                    canvas2.drawText(str, dp7, dp2, textPaint);
                    if (strArr2[i12] != null) {
                        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                        textPaint.setColor(-1493172225);
                        textPaint.setAlpha((int) (Color.alpha(-1493172225) * Z0));
                        canvas2.drawText(strArr2[i12], rectF2.left + AndroidUtilities.dp(52.0f), f34 + AndroidUtilities.dp(14.0f), textPaint);
                    }
                    canvas2.restore();
                }
                f32 = f33;
            }
            i15 = i12 + 1;
            f28 = f11;
            f26 = f12;
            f29 = 0.15f;
            f31 = 0.6f;
            z10 = false;
            i14 = 1;
        }
        canvas2.restore();
        canvas2.restore();
    }

    public final void I0(y0 y0Var) {
        if (y0Var == null) {
            return;
        }
        r5 r5Var = y0Var.f52147c;
        if (r5Var != null) {
            r5Var.o(this);
        }
        r5 r5Var2 = y0Var.d;
        if (r5Var2 != null && !y0Var.F && !this.f51863t7.containsValue(r5Var2)) {
            y0Var.d.o(this);
        }
        y0Var.G = true;
        j jVar = y0Var.v;
        if (jVar != null) {
            jVar.f52034n = true;
            int i10 = jVar.f52030a;
            NotificationCenter.getInstance(i10).removeObserver(jVar, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(i10).removeObserver(jVar, NotificationCenter.fileLoadFailed);
            if (!jVar.f52035r) {
                for (Bitmap bitmap : jVar.f52032c.values()) {
                    bitmap.recycle();
                }
            }
            y0Var.v = null;
        }
        z zVar = y0Var.E;
        if (zVar != null) {
            zVar.f52171n = true;
            NotificationCenter.getInstance(zVar.f52167a).removeObserver(zVar, NotificationCenter.fileLoaded);
            y0Var.E = null;
        }
        l lVar = y0Var.f52162u;
        if (lVar != null) {
            e.c(lVar.f52040a);
            y0Var.f52162u = null;
        }
        a0 a0Var = y0Var.A;
        if (a0Var != null) {
            e.c(a0Var.f51655a);
            y0Var.A = null;
        }
        y0Var.H.d(null);
        y0Var.I.d(null);
        y0Var.J.d(null);
        y0Var.K.d(null);
    }

    public final void J(float f7, float f10, float f11, float f12, Canvas canvas, RectF rectF) {
        LinearGradient linearGradient;
        float min = Math.min(f11, f12);
        float max = Math.max(f11, f12);
        int i10 = (min > 0.002f ? 1 : (min == 0.002f ? 0 : -1));
        Paint paint = this.G5;
        if (i10 > 0) {
            paint.setShader(null);
            paint.setColor(f(min, 16777215));
            canvas.drawRect(f7, rectF.top, f10, rectF.bottom, paint);
        }
        float f13 = max - min;
        if (f13 > 0.002f) {
            if (f12 >= f11) {
                linearGradient = this.D5;
            } else {
                linearGradient = this.E5;
            }
            Matrix matrix = this.F5;
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

    public final void J0() {
        int i10 = this.f51695b9;
        if (i10 >= 0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f51765i9[i10] = Q0(i10, currentAnimationTimeMillis);
            this.f51755h9[i10] = currentAnimationTimeMillis;
            invalidate();
        }
        this.f51695b9 = -1;
    }

    public final void K(Canvas canvas, int i10, RectF rectF, boolean z10) {
        boolean z11;
        float exp;
        int i11;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (this.f51695b9 == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        long[] jArr = this.f51755h9;
        if (!z11 && jArr[i10] == 0) {
            return;
        }
        if (z11) {
            exp = Q0(i10, currentAnimationTimeMillis);
        } else {
            exp = this.f51765i9[i10] * ((float) Math.exp(((float) (-(currentAnimationTimeMillis - jArr[i10]))) / 180.0f));
        }
        if (!z11 && exp < 0.004f) {
            jArr[i10] = 0;
            return;
        }
        float B = a6.B(exp, 2.0f, 3.0f, exp * exp);
        float min = Math.min(1.0f, ((float) (currentAnimationTimeMillis - this.f51745g9[i10])) / 320.0f);
        float f7 = 1.0f - min;
        float z12 = org.telegram.ui.Cells.t0.z(f7, f7, f7, 1.0f);
        if (!z11 || exp < 0.996f || min < 1.0f) {
            invalidate();
        }
        float max = Math.max(rectF.left, Math.min(rectF.right, this.f51725e9[i10]));
        float max2 = Math.max(rectF.top, Math.min(rectF.bottom, this.f51735f9[i10]));
        float max3 = (float) Math.max(Math.hypot(max - rectF.left, max2 - rectF.top), Math.max(Math.hypot(max - rectF.right, max2 - rectF.top), Math.max(Math.hypot(max - rectF.left, max2 - rectF.bottom), Math.hypot(max - rectF.right, max2 - rectF.bottom))));
        if (z10) {
            i11 = 335544320;
        } else {
            i11 = 738197503;
        }
        int i12 = (((int) ((i11 >>> 24) * B)) << 24) | (16777215 & i11);
        Paint paint = this.f51706c9;
        paint.setColor(i12);
        Path path = this.f51716d9;
        path.rewind();
        if (i10 != 3 && i10 != 4 && i10 != 11) {
            if (i10 < 6 && i10 != 5) {
                path.addRect(rectF, Path.Direction.CW);
            } else {
                float min2 = Math.min(AndroidUtilities.dp(20.0f), rectF.height() / 2.0f);
                path.addRoundRect(rectF, min2, min2, Path.Direction.CW);
            }
        } else {
            path.addOval(rectF, Path.Direction.CW);
        }
        canvas.save();
        canvas.clipPath(path);
        canvas.drawCircle(max, max2, Math.max(AndroidUtilities.dp(6.0f), max3 * z12), paint);
        canvas.restore();
    }

    public final void K0() {
        float f7 = this.f51717e0;
        if (f7 == 0.0f && this.f51727f0 == 0.0f) {
            return;
        }
        this.f51756i0 = f7;
        this.f51766j0 = this.f51727f0;
        this.W = AnimationUtils.currentAnimationTimeMillis();
        this.U = true;
    }

    public final void L(Canvas canvas, z0 z0Var, int i10, int i11) {
        if (z0Var == null) {
            canvas.drawColor(-16777216);
            return;
        }
        int i12 = z0Var.f52175a;
        Paint paint = this.f51913z1;
        Matrix matrix = this.E;
        if (i12 == 0 && z0Var.f52178f == f51670r9) {
            float f7 = i10;
            double radians = (float) Math.toRadians(18.0d);
            float f10 = i11;
            matrix.setScale(1.0f, (((float) Math.cos(radians)) * f10) + (((float) Math.sin(radians)) * f7));
            matrix.postRotate(-18.0f);
            z0Var.f52179g.setLocalMatrix(matrix);
            paint.setShader(z0Var.f52179g);
            canvas.drawRect(0.0f, 0.0f, f7, f10, paint);
            paint.setShader(null);
            return;
        }
        float f11 = i10;
        float m10 = m();
        float hypot = ((float) Math.hypot(i10, i11)) * 0.62f;
        matrix.setScale(hypot, hypot);
        matrix.postTranslate(f11 / 2.0f, (l() / 2.0f) + m10);
        z0Var.h.setLocalMatrix(matrix);
        paint.setShader(z0Var.h);
        canvas.drawRect(0.0f, 0.0f, f11, i11, paint);
        paint.setShader(null);
    }

    public final void L0() {
        int i10 = this.F7;
        if (i10 >= 0 && this.H7 < this.G7) {
            this.I7 = d1(i10);
            this.H7 = AnimationUtils.currentAnimationTimeMillis();
            invalidate();
        }
    }

    public final void M(android.graphics.Canvas r59, int r60, int r61) {
        throw new UnsupportedOperationException("Method not decompiled: zh.b1.M(android.graphics.Canvas, int, int):void");
    }

    public final android.graphics.Bitmap M0() {
        throw new UnsupportedOperationException("Method not decompiled: zh.b1.M0():android.graphics.Bitmap");
    }

    public final void N(Canvas canvas, float f7, float f10, float f11, int i10, boolean z10) {
        PorterDuffColorFilter g12 = g1(i10);
        k5 k5Var = this.V1;
        k5Var.setColorFilter(g12);
        k5Var.setAlpha(255);
        float f12 = f11 / 2.0f;
        float f13 = f10 - f12;
        float f14 = f7 + f11;
        float f15 = f10 + f12;
        k5Var.setBounds((int) f7, (int) f13, (int) f14, (int) f15);
        if (!z10) {
            k5Var.draw(canvas);
            return;
        }
        float f16 = f11 * 0.095f;
        float f17 = (0.28f * f11) + f7;
        float f18 = f10 - (0.21f * f11);
        float f19 = (0.74f * f11) + f7;
        float f20 = (0.25f * f11) + f10;
        float dp = f7 - AndroidUtilities.dp(2.0f);
        float dp2 = f13 - AndroidUtilities.dp(2.0f);
        float dp3 = f14 + AndroidUtilities.dp(2.0f);
        float dp4 = f15 + AndroidUtilities.dp(2.0f);
        RectF rectF = this.B5;
        rectF.set(dp, dp2, dp3, dp4);
        canvas.saveLayer(rectF, null);
        k5Var.draw(canvas);
        Paint paint = this.a2;
        paint.setStrokeWidth((0.065f * f11 * 2.0f) + f16);
        canvas.drawLine(f17, f18, f19, f20, paint);
        canvas.restore();
        Paint paint2 = this.C1;
        paint2.setColor(i10);
        paint2.setStrokeWidth(f16);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawLine(f17, f18, f19, f20, paint2);
        paint2.setStrokeCap(Paint.Cap.BUTT);
    }

    public final void N0(String str) {
        boolean z10;
        if (this.f51874v0) {
            int dp = AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(8.0f);
            this.f51858t2 = this.L0.c() + AndroidUtilities.dp(2.0f) + dp + AndroidUtilities.dp(11.0f);
            this.f51874v0 = false;
            this.A0 = false;
            if (this.B0 * this.G0 > 0.001f) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f51849s2 = z10;
            this.f51830q2 = AnimationUtils.currentAnimationTimeMillis();
            this.C0 = this.B0;
            this.D0 = 0.0f;
            this.E0 = System.currentTimeMillis();
            g gVar = this.f51856t0;
            if (gVar != null) {
                c1(gVar);
            }
            n1(true);
            if (str != null) {
                W0(0, str, null);
            }
            g0();
            this.e = null;
            this.f51865u0 = null;
            u3.c cVar = this.f51696c;
            if (cVar != null) {
                cVar.i(0);
            }
        }
    }

    public final void O(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (this.f51821p1 != null && f12 > 0.004f) {
            TextPaint textPaint = this.f51906y2;
            textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint.setColor(-1);
            textPaint.setAlpha((int) (f12 * 255.0f));
            canvas.drawText(this.f51821p1, ((f7 + f11) - AndroidUtilities.dp(16.0f)) - textPaint.measureText(this.f51821p1), f10 + AndroidUtilities.dp(5.0f), textPaint);
            textPaint.setAlpha(255);
        }
    }

    public final float O0() {
        if (this.f51737g1 < 0.5f) {
            return 1.0f;
        }
        return Utilities.clamp01(((float) (AnimationUtils.currentAnimationTimeMillis() - this.I2)) / 420.0f);
    }

    public final void P(float f7, float f10, float f11, Canvas canvas, boolean z10) {
        Canvas canvas2;
        Drawable drawable;
        float f12;
        float f13;
        if (this.G8 != 0) {
            if (z10) {
                float dp = f10 - AndroidUtilities.dp(10.0f);
                Paint.Style style = Paint.Style.STROKE;
                Paint paint = this.B8;
                paint.setStyle(style);
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                paint.setColor(-1);
                float f14 = 1.0f;
                paint.setAlpha((int) (Color.alpha(-1) * 1.0f));
                float dp2 = ((AndroidUtilities.dp(26.0f) + f7) - AndroidUtilities.dp(10.0f)) + AndroidUtilities.dp(10.0f);
                float dp3 = dp + AndroidUtilities.dp(11.0f);
                float dp4 = AndroidUtilities.dp(7.25f);
                if (f11 >= 0.0f) {
                    float clamp01 = 1.0f - Utilities.clamp01(f11 / 0.42f);
                    float z11 = org.telegram.ui.Cells.t0.z(clamp01, clamp01, clamp01, 1.0f);
                    if (f11 < 0.6f) {
                        float f15 = 1.0f - (f11 / 0.6f);
                        f13 = (1.0f - ((f15 * f15) * f15)) * 364.0f;
                    } else {
                        float clamp012 = Utilities.clamp01((f11 - 0.6f) / 0.12f);
                        f13 = 364.0f - ((3.0f - (clamp012 * 2.0f)) * ((4.0f * clamp012) * clamp012));
                    }
                    f12 = f13;
                    f14 = z11;
                } else {
                    f12 = 0.0f;
                }
                float f16 = dp3 - dp4;
                RectF rectF = this.C8;
                rectF.set(dp2 - dp4, f16, dp2 + dp4, dp4 + dp3);
                canvas.drawArc(rectF, -82.0f, f14 * 344.0f, false, paint);
                canvas.drawLine(dp2, f16, dp2, dp + AndroidUtilities.dp(2.2f), paint);
                double radians = Math.toRadians(f12 - 90.0f);
                canvas2 = canvas;
                canvas2.drawLine(dp2, dp3, org.telegram.ui.Cells.t0.b(3.8f, (float) Math.cos(radians), dp2), org.telegram.ui.Cells.t0.b(3.8f, (float) Math.sin(radians), dp3), paint);
                paint.setStyle(Paint.Style.FILL);
                canvas2.drawCircle(dp2, dp3, AndroidUtilities.dpf2(1.2f), paint);
            } else {
                canvas2 = canvas;
                if (n()) {
                    uj0 i12 = i1();
                    int dp5 = AndroidUtilities.dp(28.0f);
                    float f17 = dp5 / 2.0f;
                    int i10 = (int) (f10 - f17);
                    i12.setBounds((int) ((AndroidUtilities.dp(26.0f) + f7) - f17), i10, ((int) ((AndroidUtilities.dp(26.0f) + f7) - f17)) + dp5, dp5 + i10);
                    i12.draw(canvas2);
                } else {
                    int i11 = this.G8;
                    if (i11 == R.drawable.msg_download) {
                        uj0 j12 = j1();
                        int dp6 = AndroidUtilities.dp(28.0f);
                        float f18 = dp6 / 2.0f;
                        int i13 = (int) (f10 - f18);
                        j12.setBounds((int) ((AndroidUtilities.dp(26.0f) + f7) - f18), i13, ((int) ((AndroidUtilities.dp(26.0f) + f7) - f18)) + dp6, dp6 + i13);
                        j12.draw(canvas2);
                    } else {
                        if (i11 == R.drawable.msg_retry) {
                            drawable = this.T1;
                        } else if (i11 == R.drawable.msg_copy) {
                            drawable = this.L1;
                        } else {
                            drawable = this.U1;
                        }
                        m0(canvas2, drawable, f7 + AndroidUtilities.dp(26.0f), f10, AndroidUtilities.dp(20.0f), 1.0f);
                        canvas2 = canvas2;
                    }
                }
            }
        } else {
            canvas2 = canvas;
            uj0 k12 = k1();
            int dp7 = AndroidUtilities.dp(27.0f);
            float f19 = dp7 / 2.0f;
            int i14 = (int) (f10 - f19);
            k12.setBounds((int) ((AndroidUtilities.dp(26.0f) + f7) - f19), i14, ((int) ((AndroidUtilities.dp(26.0f) + f7) - f19)) + dp7, dp7 + i14);
            k12.draw(canvas2);
        }
        TextPaint textPaint = this.E1;
        textPaint.setColor(-1);
        float f20 = this.f51848s1;
        if (f20 <= 0.0f) {
            f20 = AndroidUtilities.dp(15.0f);
        }
        textPaint.setTextSize(f20);
        String str = this.E8;
        float dp8 = f7 + AndroidUtilities.dp(48.0f);
        float dp9 = AndroidUtilities.dp(5.0f) + f10;
        int indexOf = str.indexOf(10);
        if (indexOf >= 0) {
            canvas2.drawText(str, 0, indexOf, dp8, dp9 - AndroidUtilities.dp(9.0f), (Paint) textPaint);
            canvas.drawText(str, indexOf + 1, str.length(), dp8, dp9 + AndroidUtilities.dp(9.0f), (Paint) textPaint);
        } else if (!o0(str)) {
            canvas2.drawText(str, dp8, dp9, textPaint);
        } else {
            float textSize = textPaint.getTextSize();
            TextPaint textPaint2 = this.f51906y2;
            textPaint2.setTextSize(textSize);
            textPaint2.setColor(textPaint.getColor());
            canvas2.drawText(this.f51876v2, dp8, dp9, textPaint);
            float measureText = textPaint.measureText(this.f51876v2) + dp8;
            canvas2.drawText(this.f51886w2, measureText, dp9, textPaint2);
            canvas2.drawText(this.f51896x2, textPaint2.measureText(this.f51886w2) + measureText, dp9, textPaint);
        }
    }

    public final void Q(android.graphics.Canvas r30, int r31, long r32) {
        throw new UnsupportedOperationException("Method not decompiled: zh.b1.Q(android.graphics.Canvas, int, long):void");
    }

    public final float Q0(int i10, long j10) {
        return 1.0f - ((1.0f - this.f51775j9[i10]) * ((float) Math.exp(((float) (-(j10 - this.f51745g9[i10]))) / 90.0f)));
    }

    public final void R0(z0 z0Var, float f7, float f10) {
        if (z0Var != null) {
            this.L6 = P0(z0Var.f52177c);
        }
        if (this.f51729f2) {
            if (this.f51836r != null) {
                this.f51836r = null;
            }
            this.f51801n = z0Var;
            this.f51846s = 1.0f;
            invalidate();
            return;
        }
        this.f51836r = this.f51801n;
        this.f51801n = z0Var;
        this.f51846s = 0.0f;
        this.v = System.currentTimeMillis();
        this.f51883w = f7;
        this.f51893x = f10;
        this.f51828q0++;
        g0();
        invalidate();
    }

    public final float S(float f7) {
        float f10;
        if (this.G4 >= 1.0f) {
            return 1.0f;
        }
        if (this.I4) {
            f10 = 0.85f;
        } else {
            f10 = 0.92f;
        }
        return AndroidUtilities.lerp(f10, 1.0f, f7);
    }

    public final Drawable T(String str) {
        HashMap hashMap = this.J;
        Drawable drawable = (Drawable) hashMap.get(str);
        if (drawable == null) {
            drawable = Emoji.getEmojiDrawable(str);
            if (drawable == null) {
                drawable = Emoji.getEmojiDrawable(str.replace("️", ""));
            }
            if (drawable != null) {
                hashMap.put(str, drawable);
            }
        }
        return drawable;
    }

    public final float T0() {
        return (getHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(10.0f);
    }

    public final zh.y0 U() {
        throw new UnsupportedOperationException("Method not decompiled: zh.b1.U():zh.y0");
    }

    public final float U0() {
        float dp;
        float max = Math.max(AndroidUtilities.dp(160.0f), T0() - ((((l() + (AndroidUtilities.dp(51.0f) + AndroidUtilities.statusBarHeight)) + AndroidUtilities.dp(24.0f)) + AndroidUtilities.dp(11.0f)) + AndroidUtilities.dp(13.0f)));
        if (this.f51747h1 == 2 && this.f51895x1) {
            ArrayList arrayList = this.f51875v1;
            if (arrayList.size() <= 3) {
                float C = (wh.C(10.0f, 2, getWidth()) - AndroidUtilities.dp(8.0f)) / 3.0f;
                if (arrayList.isEmpty()) {
                    dp = AndroidUtilities.dp(286.0f);
                } else {
                    dp = AndroidUtilities.dp(8.0f) + C;
                }
                max = Math.min(max, dp);
            }
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f7 = this.P2;
        if (f7 >= 0.0f && this.f51728f1 >= 0.01f) {
            if (f7 != max) {
                long min = Math.min(64L, Math.max(0L, currentAnimationTimeMillis - this.Q2));
                float f10 = this.P2;
                float x10 = a6.x(1.0f, (float) Math.exp(((float) (-min)) / 140.0f), max - f10, f10);
                this.P2 = x10;
                if (Math.abs(max - x10) < 0.5f) {
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

    public final void V(y0 y0Var) {
        TLRPC.Document document;
        g3 g3Var;
        if (y0Var != null && !y0Var.G) {
            if (y0Var.f52145a == 1 && !y0Var.f52163w && y0Var.f52146b != null) {
                ArrayList arrayList = new ArrayList();
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                int i10 = 0;
                while (true) {
                    TLRPC.Document document2 = null;
                    if (i10 < y0Var.f52146b.length) {
                        long j10 = y0Var.f52160s[i10];
                        if (!arrayList.contains(Long.valueOf(j10))) {
                            Drawable drawable = y0Var.f52146b[i10];
                            boolean z10 = drawable instanceof r5;
                            if (z10) {
                                document2 = ((r5) drawable).e;
                            }
                            if (!z10 || document2 != null) {
                                arrayList.add(Long.valueOf(j10));
                                if (document2 != null) {
                                    hashMap.put(Long.valueOf(j10), document2);
                                }
                                if (document2 == null || (!"application/x-tgsticker".equals(document2.mime_type) && !"video/webm".equals(document2.mime_type))) {
                                    if (z10) {
                                        g3 g3Var2 = ((r5) drawable).f29841k;
                                        if (g3Var2 == null || !g3Var2.hasImageLoaded() || !g3Var2.hasNotThumb()) {
                                            return;
                                        }
                                    } else if ((drawable instanceof Emoji.EmojiDrawable) && !((Emoji.EmojiDrawable) drawable).isLoaded()) {
                                        return;
                                    }
                                    hashMap2.put(Long.valueOf(j10), drawable);
                                }
                            } else {
                                return;
                            }
                        }
                        i10++;
                    } else {
                        y0Var.f52163w = true;
                        int dp = AndroidUtilities.dp(52.0f);
                        HashMap hashMap3 = new HashMap();
                        for (Map.Entry entry : hashMap2.entrySet()) {
                            Long l4 = (Long) entry.getKey();
                            Drawable drawable2 = (Drawable) entry.getValue();
                            Bitmap createBitmap = Bitmap.createBitmap(dp, dp, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            if ((drawable2 instanceof r5) && (g3Var = ((r5) drawable2).f29841k) != null) {
                                g3Var.setCurrentAlpha(1.0f);
                            }
                            Rect rect = new Rect(drawable2.getBounds());
                            drawable2.setBounds(0, 0, dp, dp);
                            drawable2.setAlpha(255);
                            drawable2.setColorFilter(null);
                            drawable2.draw(canvas);
                            drawable2.setBounds(rect);
                            hashMap3.put(l4, createBitmap);
                        }
                        y0Var.v = new j(this.f51685b, arrayList, hashMap, hashMap3, dp, LiteMode.isEnabled(16388), new v0(this, y0Var, 0));
                    }
                }
            }
            if (y0Var.f52145a == 2 && y0Var.E == null && y0Var.A == null && (document = y0Var.f52164x) != null) {
                y0Var.E = new z(this.f51685b, document, y0Var.f52165y, y0Var.f52166z, AndroidUtilities.dp(48.0f), LiteMode.isEnabled(16388), new v0(this, y0Var, 1), new v0(this, y0Var, 2));
            }
        }
    }

    public final float V0(float f7, float f10, int i10, int i11) {
        float f11;
        float f12;
        float f13;
        float f14;
        int i12;
        float f15;
        float f16;
        float asin;
        if (!this.f51710d3) {
            return 0.0f;
        }
        float f17 = i10;
        float f18 = f7 - (f17 / 2.0f);
        float f19 = this.f51795m3;
        float f20 = i11;
        float f21 = f10 - (f20 / 2.0f);
        float f22 = (this.f51805n3 * f21) + (f18 * f19);
        float f23 = 1.0f;
        float max = Math.max(1.0f, ((Math.abs(this.f51805n3) * f20) + (Math.abs(f19) * f17)) / 2.0f);
        float[] fArr = e1.f51980b;
        float f24 = fArr[19] / 100.0f;
        if (f24 > 0.0f) {
            float f25 = this.f51805n3;
            float max2 = ((f21 * this.f51795m3) + (f18 * (-f25))) / Math.max(1.0f, ((Math.abs(this.f51795m3) * f20) + (Math.abs(f25) * f17)) / 2.0f);
            f22 -= ((f24 * f17) * max2) * max2;
        }
        float f26 = (f22 - this.f51689b3) / this.f51700c3;
        float f27 = fArr[20] / 100.0f;
        if (f27 > 0.0f) {
            f26 += (((((float) Math.asin(Math.max(-1.0f, Math.min(1.0f, f22 / max)))) - Math.max(-2.1991148f, Math.min(2.1991148f, (this.f51689b3 / max) * 1.5707964f))) / ((this.f51700c3 / max) * 1.5707964f)) - f26) * f27;
            f11 = a6.D(1.0f, (float) Math.cos(Math.max(-1.5707964f, Math.min(1.5707964f, asin))), (f27 * fArr[31]) / 100.0f, 1.0f);
        } else {
            f11 = 1.0f;
        }
        this.U3 = f26;
        float f28 = this.f51769j3;
        this.V3 = f28 * f11;
        float f29 = fArr[34] / 100.0f;
        int i13 = (f26 > 4.0f ? 1 : (f26 == 4.0f ? 0 : -1));
        if ((i13 > 0 || f26 < -4.0f) && f29 <= 0.0f) {
            this.S3 = 0.0f;
            return 0.0f;
        }
        float f30 = fArr[32];
        float f31 = f26 / fArr[29];
        y0 y0Var = this.F;
        if (y0Var != null && y0Var.f52145a == 1) {
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
        this.S3 = f15;
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
        return this.f51769j3 * f13 * f34;
    }

    public final boolean W(Bitmap bitmap) {
        float[] fArr = e1.f51980b;
        float f7 = fArr[36];
        float f10 = fArr[38];
        float f11 = fArr[24];
        if (this.f51897x3 != null && this.y3 == bitmap && f7 == this.A3 && f10 == this.B3 && f11 == this.C3) {
            return true;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            return false;
        }
        this.y3 = bitmap;
        this.A3 = f7;
        this.B3 = f10;
        this.C3 = f11;
        Bitmap bitmap2 = this.f51897x3;
        if (bitmap2 == null || bitmap2.getWidth() != bitmap.getWidth() || this.f51897x3.getHeight() != bitmap.getHeight()) {
            this.f51897x3 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        }
        this.f51897x3.eraseColor(0);
        Canvas canvas = new Canvas(this.f51897x3);
        double radians = Math.toRadians(f11);
        float f12 = (float) (-Math.cos(radians));
        float f13 = (float) (-Math.sin(radians));
        float dpf2 = AndroidUtilities.dpf2(f7);
        float dpf22 = AndroidUtilities.dpf2(f10);
        float f14 = f12 * dpf22;
        float f15 = dpf22 * f13;
        canvas.drawBitmap(bitmap, f14, f15, (Paint) null);
        canvas.drawBitmap(bitmap, f14 - (f12 * dpf2), f15 - (f13 * dpf2), this.D3);
        this.f51915z3 = g0.a.a(this.f51897x3);
        return true;
    }

    public final void W0(int i10, String str, String str2) {
        int i11;
        long currentTimeMillis = 0 - System.currentTimeMillis();
        if (currentTimeMillis > 0) {
            postDelayed(new az0(i10, 22, this, str, str2), currentTimeMillis);
            return;
        }
        this.f51803n1 = i10;
        this.f51793m1 = str;
        this.f51812o1 = str2;
        long currentTimeMillis2 = System.currentTimeMillis();
        if (str2 != null) {
            i11 = 4000;
        } else {
            i11 = 2800;
        }
        this.f51866u1 = currentTimeMillis2 + i11;
        invalidate();
    }

    public final void X(y0 y0Var) {
        r5 r5Var;
        g3 g3Var;
        if (y0Var != null && y0Var.e == null && (r5Var = y0Var.f52147c) != null) {
            z zVar = y0Var.E;
            if ((zVar == null || (zVar.v && zVar.f52174w)) && (g3Var = r5Var.f29841k) != null && g3Var.hasImageLoaded() && g3Var.hasNotThumb()) {
                int dp = AndroidUtilities.dp(48.0f);
                Bitmap createBitmap = Bitmap.createBitmap(dp, dp, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                y0Var.f52147c.setBounds(0, 0, dp, dp);
                y0Var.f52147c.setColorFilter(null);
                y0Var.f52147c.setAlpha(255);
                g3Var.setCurrentAlpha(1.0f);
                y0Var.f52147c.draw(canvas);
                A0(y0Var, createBitmap);
            }
        }
    }

    public final String Y() {
        String string = LocaleController.getString(R.string.QrNoPaidToastExpires);
        if (!string.equals(this.f51867u2)) {
            this.f51867u2 = string;
            Matcher matcher = Pattern.compile("\\d+").matcher(string);
            if (matcher.find()) {
                this.f51876v2 = string.substring(0, matcher.start());
                this.f51886w2 = matcher.group();
                this.f51896x2 = string.substring(matcher.end());
            } else {
                this.f51876v2 = string;
                this.f51896x2 = "";
                this.f51886w2 = "";
            }
        }
        return this.f51867u2;
    }

    public final void b() {
        z0 z0Var;
        int i10;
        Runnable runnable = this.f51709d2;
        if (runnable != null) {
            runnable.run();
        }
        int i11 = f51669q9;
        if (!this.f51719e2 && !this.I.isEmpty() && (z0Var = this.f51801n) != null && ((i10 = z0Var.f52175a) != 0 || z0Var.f52178f != i11)) {
            if (this.F.f52145a == 2 || i10 == 2) {
                this.D7 = AnimationUtils.currentAnimationTimeMillis();
                this.A7 = -1;
                this.f51910y7 = 0.0f;
            }
            this.f51891w7 = i11;
            setSceneFromCard(s(i11));
        }
        setPattern(U());
        if (!this.f51729f2) {
            this.f51837r0 = AnimationUtils.currentAnimationTimeMillis();
        }
        x0();
    }

    public final void c(int i10) {
        boolean z10 = true;
        this.f51719e2 = true;
        if (this.F.f52145a == 0) {
            z10 = false;
        }
        this.I.clear();
        this.f51910y7 = 0.0f;
        this.f51891w7 = i10;
        z0 z0Var = this.f51801n;
        if (z0Var == null || z0Var.f52175a != 0 || z0Var.f52178f != i10) {
            setSceneFromCard(s(i10));
        }
        if (z10) {
            setPattern(new y0());
        }
        Runnable runnable = this.f51709d2;
        if (runnable != null) {
            runnable.run();
        }
        this.f51719e2 = false;
    }

    public final void c0(int i10, int[] iArr) {
        iArr[0] = -7829368;
        iArr[1] = -11184811;
        iArr[2] = -13421773;
        ArrayList<TL_stars.StarGiftAttribute> arrayList = ((TL_stars.TL_starGiftUnique) this.f51875v1.get(i10)).attributes;
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

    public final void c1(g gVar) {
        h hVar = this.f51847s0;
        if (hVar.f52014q == 2 && hVar.f52012o < 1.0f) {
            hVar.f52010m = gVar;
            invalidate();
            return;
        }
        postDelayed(new uf.c(29, this, gVar), 40L);
    }

    public final void d(ArrayList arrayList) {
        this.f51719e2 = true;
        int i10 = f51669q9;
        z0 z0Var = this.f51801n;
        if (z0Var == null || z0Var.f52175a != 0 || z0Var.f52178f != i10) {
            this.f51891w7 = i10;
            setSceneFromCard(s(i10));
        }
        this.f51910y7 = 0.0f;
        ArrayList arrayList2 = this.I;
        arrayList2.clear();
        for (int i11 = 0; i11 < arrayList.size() && i11 < 6; i11++) {
            String str = "c:" + arrayList.get(i11);
            HashMap hashMap = this.J;
            if (!hashMap.containsKey(str)) {
                r5 n10 = r5.n(this.f51685b, ((Long) arrayList.get(i11)).longValue(), null, 7);
                n10.a(this);
                hashMap.put(str, n10);
            }
            arrayList2.add(str);
        }
        b();
        this.f51719e2 = false;
    }

    public final int d0() {
        int size = this.f51875v1.size();
        if (!this.f51895x1 || size <= 0 || size >= 3) {
            return 3;
        }
        return size;
    }

    public final float d1(int i10) {
        if (i10 != this.F7) {
            return 1.0f;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        long j10 = this.H7;
        long j11 = this.G7;
        if (j10 < j11) {
            float clamp01 = 1.0f - Utilities.clamp01(((float) (currentAnimationTimeMillis - j11)) / 110.0f);
            return 1.0f - ((1.0f - (clamp01 * clamp01)) * 0.08f);
        }
        double a12 = a1(((float) (currentAnimationTimeMillis - j10)) / 1000.0f, 0.6d, 0.28d);
        if (currentAnimationTimeMillis - this.H7 > 900) {
            this.F7 = -1;
            return 1.0f;
        }
        float f7 = this.I7;
        return ((1.0f - f7) * ((float) a12)) + f7;
    }

    public final float e(float f7, float f10, float f11) {
        float x10 = a6.x(f10, f7, 1.0f - ((float) Math.pow(1.0f - f11, this.V2)), f7);
        if (Math.abs(f10 - x10) < 0.002f) {
            return f10;
        }
        return x10;
    }

    public final r5 e0(long j10, TLRPC.Document document) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.f51863t7;
        r5 r5Var = (r5) hashMap.get(valueOf);
        if (r5Var == null) {
            r5 m10 = r5.m(this.f51685b, 24, document);
            m10.a(this);
            hashMap.put(Long.valueOf(j10), m10);
            return m10;
        }
        return r5Var;
    }

    public final boolean f0() {
        if (this.f51895x1 && this.f51875v1.isEmpty()) {
            return true;
        }
        return false;
    }

    public final a1 f1(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        Long valueOf = Long.valueOf(tL_starGiftUnique.f20496id);
        HashMap hashMap = this.f51872u7;
        a1 a1Var = (a1) hashMap.get(valueOf);
        a1 a1Var2 = a1Var;
        if (a1Var == null) {
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
                p5 p5Var = new p5(AndroidUtilities.dp(28.0f), this);
                obj.f51659a = p5Var;
                p5Var.i(document, false);
                obj.f51659a.a();
                obj.f51660b = document.f20278id;
            }
            hashMap.put(Long.valueOf(tL_starGiftUnique.f20496id), obj);
            a1Var2 = obj;
        }
        return a1Var2;
    }

    public final void g(Canvas canvas, RectF rectF, float f7) {
        char c10;
        if (b0.f() && canvas.isHardwareAccelerated() && b0.e(this.I1)) {
            if (this.f51742g6) {
                c10 = 1;
            } else if (this.f51752h6) {
                c10 = 2;
            } else {
                c10 = 0;
            }
            float[] fArr = e1.f51979a[c10];
            float dpf2 = AndroidUtilities.dpf2(1.0f) + AndroidUtilities.dpf2(fArr[4]) + Math.max(0.0f, -AndroidUtilities.dpf2(fArr[8]));
            RectF rectF2 = this.I6;
            rectF2.set(rectF);
            float f10 = -dpf2;
            rectF2.inset(f10, f10);
            Path path = this.G6;
            path.rewind();
            float f11 = f7 + dpf2;
            path.addRoundRect(rectF2, f11, f11, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            Matrix matrix = this.F6;
            canvas.getMatrix(matrix);
            if (matrix.invert(matrix)) {
                matrix.preConcat(this.E6);
                canvas.concat(matrix);
            }
            b0.c(canvas, this.I1);
            canvas.restore();
        }
    }

    public final void g0() {
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final PorterDuffColorFilter g1(int i10) {
        SparseArray sparseArray = this.O6;
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

    public String getCurrentLink() {
        String str;
        if (this.f51874v0 && (str = this.e) != null && this.f51865u0 != null) {
            return str;
        }
        if (this.f51856t0 != null) {
            return this.d;
        }
        return null;
    }

    public ArrayList<Long> getPickedCustomEmoji() {
        ArrayList<Long> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.I;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            String str = (String) obj;
            if (str.startsWith("c:")) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(str.substring(2))));
                } catch (NumberFormatException unused) {
                }
            }
        }
        return arrayList;
    }

    public int getThemeBackdropIndex() {
        z0 z0Var = this.f51801n;
        if (z0Var != null && z0Var.f52175a == 0) {
            return z0Var.f52178f;
        }
        return -1;
    }

    public TL_stars.TL_starGiftUnique getThemeGift() {
        int i10;
        y0 y0Var = this.F;
        if (y0Var.f52145a == 2 && (i10 = y0Var.f52151j) >= 0) {
            ArrayList arrayList = this.f51875v1;
            if (i10 < arrayList.size()) {
                return (TL_stars.TL_starGiftUnique) arrayList.get(this.F.f52151j);
            }
            return null;
        }
        return null;
    }

    public long getThemeGiftSavedId() {
        Long l4;
        TL_stars.TL_starGiftUnique themeGift = getThemeGift();
        if (themeGift != null) {
            l4 = (Long) this.f51905y1.get(Long.valueOf(themeGift.f20496id));
        } else {
            l4 = null;
        }
        if (l4 != null) {
            return l4.longValue();
        }
        return 0L;
    }

    public final float h() {
        return (getHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(40.0f);
    }

    public final boolean h0(Canvas canvas) {
        if (b0.f() && canvas.isHardwareAccelerated() && b0.e(this.J1)) {
            return true;
        }
        return false;
    }

    public final uj0 i1() {
        if (this.J8 == null) {
            uj0 uj0Var = new uj0(R.raw.contact_check, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f));
            this.J8 = uj0Var;
            uj0Var.setColorFilter(new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.2126f, 0.7152f, 0.0722f, 1.0f, -255.0f}));
            this.J8.K(0);
            this.J8.R(this);
            this.J8.J(true);
        }
        return this.J8;
    }

    public final void j0() {
        if (this.E8 == null) {
            this.f51866u1 = 0L;
            return;
        }
        this.f51866u1 = 0L;
        if (this.f51902x8) {
            this.f51902x8 = false;
            this.f51892w8 = AnimationUtils.currentAnimationTimeMillis();
        }
        this.F8 = true;
        invalidate();
    }

    public final uj0 j1() {
        if (this.K8 == null) {
            uj0 uj0Var = new uj0(R.raw.ic_save_to_gallery, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f));
            this.K8 = uj0Var;
            uj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            this.K8.K(0);
            this.K8.R(this);
            this.K8.J(true);
        }
        return this.K8;
    }

    public final uj0 k1() {
        if (this.I8 == null) {
            uj0 uj0Var = new uj0(R.raw.star_premium_2, AndroidUtilities.dp(27.0f), AndroidUtilities.dp(27.0f));
            this.I8 = uj0Var;
            uj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            this.I8.K(0);
            this.I8.R(this);
            this.I8.J(true);
        }
        return this.I8;
    }

    public final float l() {
        return AndroidUtilities.lerp(1.07f, 1.0f, this.C2) * getWidth() * 0.745f;
    }

    public final boolean l0(float f7, float f10) {
        if (this.f51821p1 != null && this.f51902x8) {
            RectF rectF = this.f51882v8;
            if (!rectF.isEmpty()) {
                float f11 = rectF.right;
                TextPaint textPaint = this.f51906y2;
                textPaint.setTextSize(AndroidUtilities.dp(15.0f));
                float dp = rectF.bottom + AndroidUtilities.dp(6.0f);
                RectF rectF2 = this.f51829q1;
                rectF2.set((f11 - textPaint.measureText(this.f51821p1)) - AndroidUtilities.dp(28.0f), rectF.top - AndroidUtilities.dp(6.0f), rectF.right + AndroidUtilities.dp(6.0f), dp);
                return rectF2.contains(f7, f10);
            }
            return false;
        }
        return false;
    }

    public final float l1(String str) {
        int indexOf = str.indexOf(10);
        TextPaint textPaint = this.E1;
        if (indexOf >= 0) {
            return Math.max(textPaint.measureText(str, 0, indexOf), textPaint.measureText(str, indexOf + 1, str.length()));
        }
        if (!o0(str)) {
            return textPaint.measureText(str);
        }
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = this.f51906y2;
        textPaint2.setTextSize(textSize);
        return textPaint.measureText(this.f51896x2) + textPaint2.measureText(this.f51886w2) + textPaint.measureText(this.f51876v2);
    }

    public final float m() {
        float max = ((1.0f - Math.max(this.J2, this.C2)) * AndroidUtilities.dp(16.0f)) + (((getHeight() * 0.468f) - (l() / 2.0f)) - AndroidUtilities.dp(15.0f));
        float T0 = (((T0() - U0()) - AndroidUtilities.dp(13.0f)) - (AndroidUtilities.dp(35.0f) * Math.max(this.J2, this.C2))) - l();
        return AndroidUtilities.lerp(max, Math.max(AndroidUtilities.dp(51.0f) + AndroidUtilities.statusBarHeight, Math.min(max, T0)), this.f51728f1);
    }

    public final void m0(Canvas canvas, Drawable drawable, float f7, float f10, float f11, float f12) {
        drawable.setColorFilter(g1(-1));
        drawable.setAlpha((int) (f12 * 255.0f));
        float f13 = f11 / 2.0f;
        drawable.setBounds((int) (f7 - f13), (int) (f10 - f13), (int) (f7 + f13), (int) (f10 + f13));
        drawable.draw(canvas);
    }

    public final boolean n() {
        String str;
        if (this.G8 == R.drawable.msg_retry && (str = this.E8) != null && !o0(str)) {
            return true;
        }
        return false;
    }

    public final void n1(boolean z10) {
        long max;
        String sb2;
        if (this.f51874v0) {
            if (!this.f51884w0) {
                StringBuilder sb3 = new StringBuilder();
                org.telegram.ui.Cells.t0.n(R.string.QrNoPaidFree, " · ", sb3);
                sb2 = org.telegram.messenger.q.g(R.string.QrNoPaidNoTimeLimit, sb3);
                this.A2 = -1;
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (this.A0) {
                    max = 60000;
                } else {
                    max = Math.max(0L, this.f51912z0 - currentTimeMillis);
                }
                int ceil = (int) Math.ceil(max / 1000.0d);
                if (ceil != this.A2 || this.f51914z2 == null) {
                    this.A2 = ceil;
                    StringBuilder sb4 = new StringBuilder();
                    org.telegram.ui.Cells.t0.n(R.string.QrNoPaidFree, " · ", sb4);
                    sb4.append(LocaleController.formatString(R.string.QrNoPaidExpiresIn, String.format(Locale.US, "%d:%02d", Integer.valueOf(ceil / 60), Integer.valueOf(ceil % 60))));
                    sb2 = sb4.toString();
                } else {
                    return;
                }
            }
            if (!sb2.equals(this.f51914z2)) {
                this.f51914z2 = sb2;
                this.L0.t(sb2, z10, true);
            }
        }
    }

    public final void o(float f7, float f10, float f11) {
        int i10;
        float dp;
        float nextFloat;
        float f12;
        float b10;
        int i11 = this.f51698c1;
        if (i11 >= 320) {
            return;
        }
        this.f51698c1 = i11 + 1;
        Random random = this.f51718e1;
        float nextFloat2 = random.nextFloat();
        if (nextFloat2 < 0.65f) {
            i10 = 0;
        } else if (nextFloat2 < 0.9f) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        byte[] bArr = this.f51677a1;
        bArr[i11] = (byte) i10;
        this.f51687b1[i11] = false;
        this.M0[i11] = ((random.nextFloat() - 0.5f) * AndroidUtilities.dp(4.0f)) + f7;
        this.N0[i11] = f10;
        byte b11 = bArr[i11];
        if (b11 == 0) {
            dp = AndroidUtilities.dp(1.4f);
            nextFloat = random.nextFloat();
            f12 = 1.6f;
        } else if (b11 == 1) {
            b10 = org.telegram.ui.Cells.t0.b(0.7f, random.nextFloat(), AndroidUtilities.dpf2(0.7f));
            this.S0[i11] = b10;
            this.O0[i11] = (random.nextFloat() * AndroidUtilities.dp(80.0f)) + (-AndroidUtilities.dp(30.0f));
            this.P0[i11] = (-AndroidUtilities.dp(50.0f)) - (random.nextFloat() * AndroidUtilities.dp(100.0f));
            this.Q0[i11] = Math.max(0.05f, Math.min((random.nextFloat() * 0.2f) + 0.3f, f11));
            this.R0[i11] = 0.0f;
            this.T0[i11] = random.nextFloat() * 90.0f;
            this.U0[i11] = (random.nextFloat() - 0.5f) * 1080.0f;
        } else {
            dp = AndroidUtilities.dp(3.0f);
            nextFloat = random.nextFloat();
            f12 = 1.5f;
        }
        b10 = (nextFloat * AndroidUtilities.dp(f12)) + dp;
        this.S0[i11] = b10;
        this.O0[i11] = (random.nextFloat() * AndroidUtilities.dp(80.0f)) + (-AndroidUtilities.dp(30.0f));
        this.P0[i11] = (-AndroidUtilities.dp(50.0f)) - (random.nextFloat() * AndroidUtilities.dp(100.0f));
        this.Q0[i11] = Math.max(0.05f, Math.min((random.nextFloat() * 0.2f) + 0.3f, f11));
        this.R0[i11] = 0.0f;
        this.T0[i11] = random.nextFloat() * 90.0f;
        this.U0[i11] = (random.nextFloat() - 0.5f) * 1080.0f;
    }

    public final boolean o0(String str) {
        if (str != null && str.equals(this.f51867u2)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        Sensor sensor;
        super.onAttachedToWindow();
        int i10 = this.f51723e6;
        SparseIntArray sparseIntArray = this.f51713d6;
        if (i10 != 1) {
            sparseIntArray.clear();
            this.f51723e6 = 1;
        }
        int i11 = 0;
        while (true) {
            int[] iArr = a.f51651b;
            if (i11 >= iArr.length) {
                break;
            }
            ?? obj = new Object();
            int i12 = iArr[i11] | (-16777216);
            obj.f52176b = i12;
            obj.f52177c = (-16777216) | a.f51652c[i11];
            obj.f52180i = S0(i12);
            if (sparseIntArray.indexOfKey(obj.f52176b) < 0) {
                sparseIntArray.put(obj.f52176b, t(obj));
            }
            i11++;
        }
        NotificationCenter.getInstance(this.f51685b).addObserver(this.f51768j2, NotificationCenter.starUserGiftsLoaded);
        u0();
        SensorManager sensorManager = (SensorManager) getContext().getSystemService("sensor");
        this.f51871u6 = sensorManager;
        if (sensorManager != null) {
            sensor = sensorManager.getDefaultSensor(9);
        } else {
            sensor = null;
        }
        if (sensor != null) {
            this.f51871u6.registerListener(this.f51880v6, sensor, 1);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f51685b).removeObserver(this.f51768j2, NotificationCenter.starUserGiftsLoaded);
        removeCallbacks(this.f51778k2);
        SensorManager sensorManager = this.f51871u6;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.f51880v6);
        }
        this.f51853s6 = false;
        this.f51695b9 = -1;
        Arrays.fill(this.f51755h9, 0L);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r49) {
        throw new UnsupportedOperationException("Method not decompiled: zh.b1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (Build.VERSION.SDK_INT >= 29 && z10) {
            int i14 = i12 - i10;
            int l4 = (int) ((l() / 2.0f) + m());
            int dp = AndroidUtilities.dp(100.0f);
            int dp2 = AndroidUtilities.dp(24.0f);
            ArrayList arrayList = this.Z2;
            arrayList.clear();
            int i15 = l4 - dp;
            int i16 = l4 + dp;
            arrayList.add(new Rect(0, i15, dp2, i16));
            arrayList.add(new Rect(i14 - dp2, i15, i14, i16));
            setSystemGestureExclusionRects(arrayList);
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (i10 > 0 && i11 > 0) {
            float dp = AndroidUtilities.dp(12.0f);
            int ceil = ((int) Math.ceil(i10 / dp)) + 1;
            int ceil2 = ((int) Math.ceil(i11 / dp)) + 1;
            Bitmap bitmap = this.f51720e3;
            if (bitmap == null || bitmap.getWidth() != ceil || this.f51720e3.getHeight() != ceil2) {
                this.f51720e3 = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                this.f51730f3 = new int[ceil * ceil2];
            }
        }
        super.onSizeChanged(i10, i11, i12, i13);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r41) {
        throw new UnsupportedOperationException("Method not decompiled: zh.b1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z10, boolean z11) {
        float f17;
        int i10 = this.f51698c1;
        if (i10 >= 320) {
            return;
        }
        this.f51698c1 = i10 + 1;
        this.f51677a1[i10] = z10 ? (byte) 1 : (byte) 0;
        this.f51687b1[i10] = true;
        this.M0[i10] = f7;
        this.N0[i10] = f10;
        this.O0[i10] = f11;
        this.P0[i10] = f12;
        this.V0[i10] = f7;
        this.W0[i10] = f10;
        this.X0[i10] = f13;
        Random random = this.f51718e1;
        if (z11) {
            f17 = org.telegram.ui.Cells.t0.d(random, 3.0f, 4.0f);
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

    public final int p0() {
        int i10;
        int i11 = this.f51723e6;
        SparseIntArray sparseIntArray = this.f51713d6;
        if (i11 != 1) {
            sparseIntArray.clear();
            this.f51723e6 = 1;
        }
        z0 z0Var = this.f51801n;
        if (z0Var != null) {
            i10 = z0Var.f52176b;
        } else {
            i10 = 0;
        }
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        int t10 = t(this.f51801n);
        sparseIntArray.put(i10, t10);
        return t10;
    }

    public final float q1(float f7, float f10, int i10, int i11) {
        float f11 = this.f51883w;
        double max = Math.max(f11, i10 - f11);
        float f12 = this.f51893x;
        return (((1.0f - ((float) Math.pow(1.0f - Utilities.clamp01(((float) Math.hypot(f7 - this.f51883w, f10 - this.f51893x)) / (((float) Math.hypot(max, Math.max(f12, i11 - f12))) + AndroidUtilities.dp(60.0f))), 0.4166666567325592d))) * 600.0f) / 1000.0f) - 0.03f;
    }

    public final void r(int i10, float f7, int i11, float f10, int i12, float f11) {
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        int i13;
        float f24;
        float f25;
        float a02;
        this.K3 = 0;
        float f26 = 7.0f;
        float f27 = 1.25f;
        float f28 = 0.75f;
        float f29 = 0.55f;
        float f30 = 1.1f;
        float f31 = 21.0f;
        float f32 = 2.0f;
        if (this.P3 == i10 && this.L3 != null) {
            f13 = 7.0f;
            f14 = 1.25f;
            f15 = 0.75f;
            f16 = 0.55f;
            f17 = 1.1f;
            f18 = 21.0f;
            f19 = 2.0f;
            f12 = 300.0f;
            f21 = 0.0f;
            f20 = 3.5f;
        } else {
            this.P3 = i10;
            float f33 = 3.5f;
            f12 = 300.0f;
            Random random = new Random((i10 * 7919) + 20973);
            float dp = AndroidUtilities.dp(300.0f);
            int round = Math.round(33.46154f);
            this.L3 = new float[round];
            this.M3 = new float[round];
            this.N3 = new float[round];
            this.O3 = 0;
            int i14 = 0;
            while (true) {
                if (i14 < round) {
                    float nextFloat = random.nextFloat();
                    float dp2 = ((((((nextFloat * f28) * nextFloat) + f29) * (AndroidUtilities.dp(f31) * f30)) / f32) * f27) + AndroidUtilities.dp(f26);
                    int i15 = i14 + 12;
                    float f34 = -3.4028235E38f;
                    f13 = f26;
                    int i16 = 0;
                    float f35 = 0.0f;
                    float f36 = 0.0f;
                    while (i16 < i15) {
                        float nextFloat2 = random.nextFloat() * dp;
                        float nextFloat3 = random.nextFloat() * dp;
                        float f37 = f27;
                        float f38 = f29;
                        float f39 = Float.MAX_VALUE;
                        float f40 = f28;
                        int i17 = 0;
                        while (i17 < this.O3) {
                            float abs = Math.abs(nextFloat2 - this.L3[i17]);
                            float f41 = f30;
                            float abs2 = Math.abs(nextFloat3 - this.M3[i17]);
                            float f42 = dp / f32;
                            if (abs > f42) {
                                abs = dp - abs;
                            }
                            if (abs2 > f42) {
                                abs2 = dp - abs2;
                            }
                            float f43 = f31;
                            float f44 = this.N3[i17];
                            float dp3 = ((((((f44 * f40) * f44) + f38) * (AndroidUtilities.dp(f43) * f41)) / f32) * f37) + AndroidUtilities.dp(f13);
                            if (nextFloat > 0.7f && f44 > 0.7f) {
                                f22 = AndroidUtilities.dp(10.0f);
                            } else {
                                f22 = 0.0f;
                            }
                            float f45 = f32;
                            float f46 = f33;
                            f39 = Math.min(f39, ((((float) Math.hypot(abs, abs2)) - dp2) - dp3) - f22);
                            i17++;
                            f32 = f45;
                            f30 = f41;
                            f31 = f43;
                            f33 = f46;
                        }
                        float f47 = f30;
                        float f48 = f31;
                        float f49 = f32;
                        float f50 = f33;
                        if (f39 > f34) {
                            f34 = f39;
                            f35 = nextFloat2;
                            f36 = nextFloat3;
                        }
                        i16++;
                        f32 = f49;
                        f28 = f40;
                        f27 = f37;
                        f29 = f38;
                        f30 = f47;
                        f31 = f48;
                        f33 = f50;
                    }
                    f14 = f27;
                    f15 = f28;
                    f16 = f29;
                    f17 = f30;
                    f18 = f31;
                    f19 = f32;
                    f20 = f33;
                    f21 = 0.0f;
                    if (this.O3 > 0 && f34 < AndroidUtilities.dp(f20)) {
                        break;
                    }
                    float[] fArr = this.L3;
                    int i18 = this.O3;
                    fArr[i18] = f35;
                    this.M3[i18] = f36;
                    this.N3[i18] = nextFloat;
                    this.O3 = i18 + 1;
                    i14++;
                    f32 = f19;
                    f26 = f13;
                    f28 = f15;
                    f27 = f14;
                    f29 = f16;
                    f30 = f17;
                    f31 = f18;
                    f33 = f20;
                } else {
                    f13 = f26;
                    f14 = f27;
                    f15 = f28;
                    f16 = f29;
                    f17 = f30;
                    f18 = f31;
                    f19 = f32;
                    f20 = f33;
                    f21 = 0.0f;
                    break;
                }
            }
        }
        float dp4 = AndroidUtilities.dp(f12);
        float f51 = -f11;
        float f52 = i12 + f11;
        int ceil = (int) Math.ceil((f52 - f10) / dp4);
        int floor = ((int) Math.floor((f51 - f7) / dp4)) - 1;
        float f53 = i11 + f11;
        int ceil2 = (int) Math.ceil((f53 - f7) / dp4);
        for (int floor2 = ((int) Math.floor((f51 - f10) / dp4)) - 1; floor2 <= ceil; floor2++) {
            int i19 = floor;
            while (i19 <= ceil2) {
                int i20 = 0;
                while (i20 < this.O3 && this.K3 < 1024) {
                    float f54 = (i19 * dp4) + this.L3[i20];
                    float f55 = (floor2 * dp4) + this.M3[i20];
                    float f56 = f54 + f7;
                    float f57 = f55 + f10;
                    float f58 = f19;
                    if (f56 < f51 - AndroidUtilities.dp(20.0f) || f56 > AndroidUtilities.dp(20.0f) + f53 || f57 < f51 - AndroidUtilities.dp(20.0f) || f57 > AndroidUtilities.dp(20.0f) + f52) {
                        f23 = dp4;
                        i13 = ceil2;
                        f24 = f51;
                    } else {
                        float f59 = this.N3[i20];
                        float dp5 = ((((((f59 * f15) * f59) + f16) * (AndroidUtilities.dp(f18) * f17)) / f58) * f14) + AndroidUtilities.dp(f13);
                        float dp6 = AndroidUtilities.dp(170.0f);
                        f23 = dp4;
                        float dp7 = AndroidUtilities.dp(150.0f);
                        int round2 = Math.round(f55 / dp7);
                        int i21 = round2 - 1;
                        while (true) {
                            i13 = ceil2;
                            if (i21 <= round2 + 1) {
                                if ((i21 & 1) == 0) {
                                    f25 = f21;
                                } else {
                                    f25 = dp6 / f58;
                                }
                                int round3 = Math.round((f54 - f25) / dp6);
                                float f60 = f25;
                                int i22 = round3 - 1;
                                while (true) {
                                    f24 = f51;
                                    if (i22 <= round3 + 1) {
                                        double q02 = q0(i21, i22);
                                        int i23 = i22;
                                        float a03 = ((a0(3.7d * q02) - 0.5f) * AndroidUtilities.dp(76.0f)) + (i22 * dp6) + f60;
                                        int i24 = i21;
                                        float a04 = ((a0(5.3d * q02) - 0.5f) * AndroidUtilities.dp(64.0f)) + (i21 * dp7);
                                        float a05 = (a0(11.9d * q02) * AndroidUtilities.dp(32.0f)) + AndroidUtilities.dp(62.0f);
                                        if (dp5 < f21) {
                                            a02 = a05 * 0.66f;
                                        } else {
                                            a02 = (((a0(q02 * 31.7d) * f13) + 5.0f) * AndroidUtilities.dp(1.0f)) + (a05 * 0.35f) + dp5 + AndroidUtilities.dp(f20);
                                        }
                                        float f61 = a03 - f54;
                                        float f62 = a04 - f55;
                                        if ((f62 * f62) + (f61 * f61) < a02 * a02) {
                                            break;
                                        }
                                        i22 = i23 + 1;
                                        f51 = f24;
                                        i21 = i24;
                                    }
                                }
                            } else {
                                f24 = f51;
                                int i25 = this.K3;
                                this.E3[i25] = (floor2 * 4096) + i20;
                                this.F3[i25] = i19;
                                this.G3[i25] = f54;
                                this.H3[i25] = f55;
                                this.I3[i25] = 1.0f;
                                this.J3[i25] = f59;
                                this.K3 = i25 + 1;
                                break;
                            }
                            i21++;
                            ceil2 = i13;
                            f51 = f24;
                        }
                    }
                    i20++;
                    f19 = f58;
                    dp4 = f23;
                    ceil2 = i13;
                    f51 = f24;
                }
                i19++;
                f19 = f19;
                dp4 = dp4;
                ceil2 = ceil2;
                f51 = f51;
            }
        }
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
            str = LocaleController.formatString(R.string.QrNoPaidRemoveStarsFee, LocaleController.formatNumber(j10, ','));
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
        if (!this.K0 && this.f51874v0) {
            N0(null);
        }
        invalidate();
    }

    public void setFreeLink(String str) {
        if (TextUtils.equals(this.e, str)) {
            return;
        }
        this.e = str;
        if (str == null) {
            this.f51865u0 = null;
            return;
        }
        Utilities.globalQueue.postRunnable(new r0(str, new q0(this, str, 1)));
    }

    public void setGiftsOwner(long j10) {
        if (this.f51885w1 == j10) {
            return;
        }
        this.f51885w1 = j10;
        x9 x9Var = this.f51758i2;
        if (x9Var != null) {
            x9Var.f();
        }
        x9 x9Var2 = new x9(this.f51685b, j10, false);
        this.f51758i2 = x9Var2;
        x9Var2.f2444g = 776;
        x9Var2.e = true;
        x9Var2.j(true);
        u0();
    }

    public void setInstantTheme(boolean z10) {
        this.f51729f2 = z10;
    }

    public void setLinkExpires(long j10) {
        long j11 = this.G2;
        if (j11 == j10) {
            return;
        }
        if (j11 != 0 && j10 != 0) {
            g0();
        }
        this.G2 = j10;
        this.N2 = -1L;
        invalidate();
    }

    public void setOnPicksChanged(Runnable runnable) {
        this.f51709d2 = runnable;
    }

    public void setReveal(float f7) {
        float f10;
        boolean z10;
        float f11;
        float f12;
        int i10;
        float sin;
        this.G4 = f7;
        float f13 = 0.15f;
        float f14 = 1.0f;
        if (this.I4) {
            double d = f7 * 0.86d;
            double sqrt = Math.sqrt(0.18999999999999995d) * 10.134169850289656d;
            if (f7 >= 1.0f) {
                sin = 1.0f;
            } else {
                double d10 = sqrt * d;
                sin = (float) (1.0d - (((Math.sin(d10) * (0.9d / Math.sqrt(0.18999999999999995d))) + Math.cos(d10)) * Math.exp((-9.120752865260691d) * d)));
            }
            float clamp01 = Utilities.clamp01((f7 - 0.85f) / 0.15f);
            f10 = a6.x(1.0f, sin, a6.B(clamp01, 2.0f, 3.0f, clamp01 * clamp01), sin);
        } else {
            float f15 = 1.0f - f7;
            f10 = 1.0f - (f15 * f15);
        }
        this.J4 = f10;
        int i11 = 0;
        if (f7 < 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f11 = (1.0f - f10) * AndroidUtilities.dp(64.0f);
        } else {
            f11 = 0.0f;
        }
        setTranslationY(f11);
        setScaleX(1.0f);
        setScaleY(1.0f);
        if (z10) {
            if (!this.I4) {
                f13 = 0.35f;
            }
            f14 = Utilities.clamp01(f10 / f13);
        }
        setAlpha(f14);
        if (getParent() instanceof View) {
            View view = (View) getParent();
            if (z10) {
                i10 = a(f10, 1073741824);
            } else {
                i10 = 0;
            }
            view.setBackgroundColor(i10);
        }
        if (z10 != getClipToOutline()) {
            setClipToOutline(z10);
            invalidateOutline();
        }
        if (z10 && this.I4) {
            f12 = Utilities.clamp01(f10);
        } else {
            f12 = -1.0f;
        }
        this.f51847s0.D = f12;
        if (z10 && f7 > 0.0f) {
            i11 = 2;
        }
        if (getLayerType() != i11) {
            setLayerType(i11, null);
        }
        invalidate();
    }

    public void setRevealOpening(boolean z10) {
        this.I4 = z10;
    }

    public void setScanHidden(boolean z10) {
        if (this.V6 != z10) {
            this.V6 = z10;
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
        if (this.f51675a != z10) {
            this.f51675a = z10;
            invalidate();
        }
    }

    public void setTimerOnly(boolean z10) {
        this.f51904y0 = z10;
    }

    public final void u0() {
        long j10;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int i10;
        x9 x9Var = this.f51758i2;
        if (x9Var == null) {
            return;
        }
        y0 y0Var = this.F;
        int i11 = y0Var.f52145a;
        ArrayList arrayList = this.f51875v1;
        if (i11 == 2 && (i10 = y0Var.f52151j) >= 0 && i10 < arrayList.size()) {
            j10 = ((TL_stars.TL_starGiftUnique) arrayList.get(this.F.f52151j)).f20496id;
        } else {
            j10 = 0;
        }
        if (j10 != 0) {
            tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(this.F.f52151j);
        } else {
            tL_starGiftUnique = null;
        }
        arrayList.clear();
        HashMap hashMap = this.f51905y1;
        hashMap.clear();
        ArrayList arrayList2 = x9Var.f2448l;
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
                    hashMap.put(Long.valueOf(savedStarGift.gift.f20496id), Long.valueOf(savedStarGift.saved_id));
                }
            }
        }
        if (tL_starGiftUnique != null) {
            int i14 = 0;
            while (true) {
                if (i14 < arrayList.size()) {
                    if (((TL_stars.TL_starGiftUnique) arrayList.get(i14)).f20496id == j10) {
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
            this.F.f52151j = i12;
            this.f51881v7 = i12;
        }
        boolean z10 = x9Var.f2446j;
        this.f51895x1 = z10;
        if (!z10 && !x9Var.f2445i) {
            x9Var.a();
        }
        if (!arrayList.isEmpty() && !this.f51787l2) {
            this.f51787l2 = true;
            t0 t0Var = this.f51778k2;
            removeCallbacks(t0Var);
            postDelayed(t0Var, 900L);
        }
        invalidate();
    }

    public final Drawable v(int i10) {
        return getContext().getResources().getDrawable(i10).mutate();
    }

    public final float v0() {
        float f7;
        int d02;
        int dp;
        int dp2;
        float f10;
        float C = wh.C(10.0f, 2, getWidth()) - AndroidUtilities.dp(8.0f);
        int i10 = this.f51747h1;
        if (i10 == 0) {
            f7 = C / 6.0f;
            d02 = (a.f51651b.length + 5) / 6;
            dp = AndroidUtilities.dp(4.0f) - AndroidUtilities.dp(32.0f);
            dp2 = AndroidUtilities.dp(4.0f);
        } else {
            if (i10 == 1) {
                f7 = C / 6.0f;
                f10 = 0.0f;
            } else if (f0()) {
                f7 = 0.0f;
                f10 = 0.0f;
            } else {
                f7 = C / 3.0f;
                d02 = ((d0() + this.f51875v1.size()) - 1) / d0();
                dp = AndroidUtilities.dp(4.0f) - AndroidUtilities.dp(32.0f);
                dp2 = AndroidUtilities.dp(4.0f);
            }
            d02 = 0;
            return Math.max(0.0f, (((d02 * f7) + f10) + AndroidUtilities.dp(32.0f)) - U0());
        }
        f10 = dp2 + dp;
        return Math.max(0.0f, (((d02 * f7) + f10) + AndroidUtilities.dp(32.0f)) - U0());
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        uj0 uj0Var;
        if ((drawable instanceof RippleDrawable) || drawable == this.L0 || drawable == this.Z1 || (((uj0Var = this.V7) != null && drawable == uj0Var) || super.verifyDrawable(drawable))) {
            return true;
        }
        return false;
    }

    public final PorterDuffColorFilter w0(y0 y0Var) {
        float[] fArr = e1.f51980b;
        int i10 = ((int) (fArr[30] * 10.0f)) ^ (y0Var.f52153l * 31);
        if (this.Q3 == null || this.R3 != i10) {
            this.R3 = i10;
            this.Q3 = new PorterDuffColorFilter(i0.b.f(fArr[30] / 100.0f, y0Var.f52153l, -1), PorterDuff.Mode.SRC_IN);
        }
        return this.Q3;
    }

    public final void x(android.graphics.Canvas r42, int r43, int r44) {
        throw new UnsupportedOperationException("Method not decompiled: zh.b1.x(android.graphics.Canvas, int, int):void");
    }

    public final void x0() {
        u3.c cVar;
        p0 p0Var;
        if (!this.f51719e2 && (cVar = this.f51696c) != null && (p0Var = ((m0) cVar.f47527a).e) != null) {
            p0Var.f();
        }
    }

    public final void y(android.graphics.Canvas r67, int r68) {
        throw new UnsupportedOperationException("Method not decompiled: zh.b1.y(android.graphics.Canvas, int):void");
    }

    public final void z(android.graphics.Canvas r82, int r83) {
        throw new UnsupportedOperationException("Method not decompiled: zh.b1.z(android.graphics.Canvas, int):void");
    }
}
