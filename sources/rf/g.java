package rf;

import ag.t2;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.y1;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.a91;
import org.telegram.ui.dl0;
import org.telegram.ui.zb1;

public abstract class g extends View implements i {

    public static final float f46934g1 = AndroidUtilities.dpf2(16.0f);

    public static final float f46935h1 = AndroidUtilities.dpf2(1.5f);

    public static final float f46936i1 = AndroidUtilities.dpf2(12.0f);

    public static final int f46937j1 = AndroidUtilities.dp(18.0f);

    public static final int f46938k1 = AndroidUtilities.dp(14.0f);
    public static final int l1 = AndroidUtilities.dp(10.0f);

    public static final int f46939m1 = AndroidUtilities.dp(16.0f);

    public static final int f46940n1 = AndroidUtilities.dp(24.0f);

    public static final int f46941o1 = AndroidUtilities.dp(16.0f);

    public static final int f46942p1 = AndroidUtilities.dp(10.0f);

    public static final int f46943q1 = AndroidUtilities.dp(12.0f);

    public static final int f46944r1 = AndroidUtilities.dp(8.0f);

    public static final int f46945s1 = AndroidUtilities.dp(6.0f);

    public static final int f46946t1 = AndroidUtilities.dp(5.0f);

    public static final int f46947u1 = AndroidUtilities.dp(2.0f);

    public static final int f46948v1 = AndroidUtilities.dp(1.0f);

    public static final boolean f46949w1;

    public static final boolean f46950x1;

    public static final u1.a f46951y1;
    public float A;
    public float A0;
    public int B;
    public float B0;
    public int C;
    public float C0;
    public boolean D;
    public final RectF D0;
    public boolean E;
    public VibrationEffect E0;
    public boolean F;
    public final d F0;
    public final Paint G;
    public final d G0;
    public final Paint H;
    public final b H0;
    public final Paint I;
    public final b I0;
    public final TextPaint J;
    public final d J0;
    public final TextPaint K;
    public final zb1 K0;
    public final TextPaint L;
    public boolean L0;
    public final Paint M;
    public e M0;
    public final Paint N;
    public float N0;
    public final Paint O;
    public float O0;
    public final Paint P;
    public float P0;
    public final Paint Q;
    public float Q0;
    public final Rect R;
    public float R0;
    public final Path S;
    public final c6 S0;
    public AnimatorSet T;
    public int T0;
    public ValueAnimator U;
    public int U0;
    public ValueAnimator V;
    public final Rect V0;
    public Animator W;
    public final ArrayList W0;
    public long X0;
    public int Y0;
    public int Z0;

    public f f46952a;

    public ValueAnimator f46953a0;

    public int f46954a1;

    public final ArrayList f46955b;

    public boolean f46956b0;

    public int f46957b1;

    public final ArrayList f46958c;

    public final j f46959c0;

    public long f46960c1;
    public final ArrayList d;

    public sf.b f46961d0;

    public boolean f46962d1;

    public boolean f46963e;

    public tf.b f46964e0;

    public boolean f46965e1;

    public float f46966f;

    public float f46967f0;

    public tf.c f46968f1;

    public float f46969g0;
    public float h;

    public float f46970h0;

    public int f46971i0;

    public int f46972j0;

    public int f46973k0;

    public Bitmap f46974l0;
    public Canvas m0;

    public int f46975n;

    public boolean f46976n0;

    public int f46977o0;

    public tf.e f46978p0;

    public boolean f46979q0;

    public int f46980r;

    public float f46981r0;

    public int f46982s;

    public boolean f46983s0;

    public boolean f46984t0;

    public int f46985u0;
    public float v;

    public tf.j f46986v0;

    public float f46987w;

    public final int f46988w0;

    public float f46989x;

    public final int f46990x0;

    public float f46991y;

    public float f46992y0;

    public float f46993z0;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f46949w1 = i10 < 28;
        f46950x1 = i10 > 21;
        f46951y1 = new u1.a();
    }

    public g(Context context, c6 c6Var) {
        super(context);
        this.f46955b = new ArrayList(10);
        this.f46958c = new ArrayList(25);
        this.d = new ArrayList();
        final int i10 = 1;
        this.f46963e = true;
        this.v = 250.0f;
        this.f46987w = 0.0f;
        this.f46989x = 0.0f;
        this.f46991y = 0.0f;
        this.A = 0.0f;
        this.D = true;
        final int i11 = 0;
        this.E = false;
        this.F = true;
        this.G = new Paint();
        this.H = new Paint();
        this.I = new Paint();
        this.J = new TextPaint(1);
        this.K = new TextPaint(1);
        this.L = new TextPaint(1);
        this.M = new Paint(1);
        this.N = new Paint();
        this.O = new Paint(1);
        this.P = new Paint(1);
        this.Q = new Paint(1);
        this.R = new Rect();
        this.S = new Path();
        this.f46956b0 = false;
        j jVar = new j();
        jVar.h = new Rect();
        jVar.f47006i = new Rect();
        jVar.f47007j = new Rect();
        jVar.f47008k = 0.7f;
        jVar.f47009l = 1.0f;
        jVar.f47010m = 0.1f;
        jVar.f47011n = new h[]{null, null};
        jVar.f47000a = this;
        this.f46959c0 = jVar;
        this.f46976n0 = false;
        this.f46977o0 = -1;
        this.f46979q0 = false;
        this.f46981r0 = 0.0f;
        this.f46983s0 = false;
        this.f46984t0 = false;
        this.f46985u0 = 0;
        this.f46990x0 = AndroidUtilities.dp(46.0f);
        this.D0 = new RectF();
        this.F0 = new d(this, i11);
        this.G0 = new d(this, i10);
        this.H0 = new ValueAnimator.AnimatorUpdateListener(this) {

            public final g f46922b;

            {
                this.f46922b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        g gVar = this.f46922b;
                        gVar.getClass();
                        gVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar.invalidate();
                        break;
                    default:
                        g gVar2 = this.f46922b;
                        gVar2.getClass();
                        gVar2.f46987w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar2.invalidate();
                        break;
                }
            }
        };
        this.I0 = new ValueAnimator.AnimatorUpdateListener(this) {

            public final g f46922b;

            {
                this.f46922b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        g gVar = this.f46922b;
                        gVar.getClass();
                        gVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar.invalidate();
                        break;
                    default:
                        g gVar2 = this.f46922b;
                        gVar2.getClass();
                        gVar2.f46987w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar2.invalidate();
                        break;
                }
            }
        };
        this.J0 = new d(this, 2);
        this.K0 = new zb1(this, 8);
        this.L0 = false;
        this.T0 = 0;
        this.U0 = 0;
        Rect rect = new Rect();
        this.V0 = rect;
        ArrayList arrayList = new ArrayList();
        this.W0 = arrayList;
        arrayList.add(rect);
        this.X0 = 0L;
        this.f46965e1 = false;
        this.S0 = c6Var;
        t();
        this.f46988w0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public static void b(Path path, float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, boolean z11, boolean z12, boolean z13) {
        path.reset();
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        if (f15 < 0.0f) {
            f15 = 0.0f;
        }
        float f16 = f12 - f10;
        float f17 = f13 - f11;
        float f18 = f16 / 2.0f;
        if (f14 > f18) {
            f14 = f18;
        }
        float f19 = f17 / 2.0f;
        if (f15 > f19) {
            f15 = f19;
        }
        float f20 = f16 - (f14 * 2.0f);
        float f21 = f17 - (2.0f * f15);
        path.moveTo(f12, f11 + f15);
        if (z11) {
            float f22 = -f15;
            path.rQuadTo(0.0f, f22, -f14, f22);
        } else {
            path.rLineTo(0.0f, -f15);
            path.rLineTo(-f14, 0.0f);
        }
        path.rLineTo(-f20, 0.0f);
        if (z10) {
            float f23 = -f14;
            path.rQuadTo(f23, 0.0f, f23, f15);
        } else {
            path.rLineTo(-f14, 0.0f);
            path.rLineTo(0.0f, f15);
        }
        path.rLineTo(0.0f, f21);
        if (z13) {
            path.rQuadTo(0.0f, f15, f14, f15);
        } else {
            path.rLineTo(0.0f, f15);
            path.rLineTo(f14, 0.0f);
        }
        path.rLineTo(f20, 0.0f);
        if (z12) {
            path.rQuadTo(f14, 0.0f, f14, -f15);
        } else {
            path.rLineTo(f14, 0.0f);
            path.rLineTo(0.0f, -f15);
        }
        path.rLineTo(0.0f, -f21);
        path.close();
    }

    public static ValueAnimator e(float f10, float f11, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, f11);
        valueAnimatorOfFloat.setDuration(400L);
        valueAnimatorOfFloat.setInterpolator(f46951y1);
        valueAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        return valueAnimatorOfFloat;
    }

    public void A(boolean z10, boolean z11, boolean z12) {
        if (this.f46961d0 == null) {
            return;
        }
        float f10 = this.B0;
        j jVar = this.f46959c0;
        this.C0 = f10 / (jVar.f47009l - jVar.f47008k);
        H();
        E(r(this.B, this.C), this.L0 ? s(this.B, this.C) : 0L, z10, z11, z12);
        if (this.f46979q0 && !z11) {
            c(false);
            x((this.C0 * jVar.f47008k) - f46934g1);
        }
        invalidate();
    }

    public final void B() {
        if (Build.VERSION.SDK_INT >= 26) {
            Vibrator vibrator = (Vibrator) getContext().getSystemService("vibrator");
            if (this.E0 == null) {
                this.E0 = VibrationEffect.createWaveform(new long[]{0, 2}, -1);
            }
            vibrator.cancel();
            vibrator.vibrate(this.E0);
        }
    }

    public void C(int i10, int i11) {
        int i12 = this.f46977o0;
        sf.b bVar = this.f46961d0;
        if (bVar == null) {
            return;
        }
        float f10 = this.C0;
        float f11 = (this.f46959c0.f47008k * f10) - f46934g1;
        float f12 = (i10 + f11) / f10;
        if (f12 < 0.0f) {
            this.f46977o0 = 0;
        } else if (f12 > 1.0f) {
            this.f46977o0 = bVar.f47881a.length - 1;
        } else {
            int iB = bVar.b(f12, this.B, this.C);
            this.f46977o0 = iB;
            int i13 = iB + 1;
            float[] fArr = this.f46961d0.f47882b;
            if (i13 < fArr.length) {
                if (Math.abs(this.f46961d0.f47882b[this.f46977o0 + 1] - f12) < Math.abs(fArr[iB] - f12)) {
                    this.f46977o0++;
                }
            }
        }
        int i14 = this.f46977o0;
        int i15 = this.C;
        if (i14 > i15) {
            this.f46977o0 = i15;
        }
        int i16 = this.f46977o0;
        int i17 = this.B;
        if (i16 < i17) {
            this.f46977o0 = i17;
        }
        if (i12 != this.f46977o0) {
            this.f46979q0 = true;
            c(true);
            x(f11);
            e eVar = this.M0;
            if (eVar != null) {
                getSelectedDate();
                a91 a91Var = (a91) ((dl0) eVar).f37438b;
                a91Var.f();
                a91Var.f36464b.f46978p0.d(false, false);
            }
            B();
            invalidate();
        }
    }

    public boolean D(sf.b bVar) {
        boolean z10;
        sf.b bVar2 = this.f46961d0;
        j jVar = this.f46959c0;
        ArrayList arrayList = this.d;
        if (bVar2 != bVar) {
            invalidate();
            arrayList.clear();
            if (bVar != null && bVar.d != null) {
                for (int i10 = 0; i10 < bVar.d.size(); i10++) {
                    arrayList.add(h((sf.a) bVar.d.get(i10)));
                }
            }
            d();
            this.f46961d0 = bVar;
            if (bVar != null) {
                if (bVar.f47881a[0] == 0) {
                    jVar.f47008k = 0.0f;
                    jVar.f47009l = 1.0f;
                } else {
                    float minDistance = getMinDistance();
                    jVar.f47010m = minDistance;
                    float f10 = jVar.f47009l;
                    if (f10 - jVar.f47008k < minDistance) {
                        float f11 = f10 - minDistance;
                        jVar.f47008k = f11;
                        if (f11 < 0.0f) {
                            jVar.f47008k = 0.0f;
                            jVar.f47009l = 1.0f;
                        }
                    }
                }
            }
            z10 = true;
        } else {
            z10 = false;
        }
        w();
        if (bVar != null) {
            H();
            E(r(this.B, this.C), this.L0 ? s(this.B, this.C) : 0L, false, false, false);
            this.f46967f0 = 0.0f;
            this.f46969g0 = 2.1474836E9f;
            u();
            int i11 = bVar.f47888j;
            if (i11 == 1 || i11 == 2) {
                this.f46978p0.setSize(arrayList.size() * 2);
            } else {
                this.f46978p0.setSize(arrayList.size());
            }
            this.D = true;
            I();
            return z10;
        }
        jVar.f47008k = 0.7f;
        jVar.f47009l = 1.0f;
        this.f46969g0 = 0.0f;
        this.f46967f0 = 0.0f;
        this.f46955b.clear();
        AnimatorSet animatorSet = this.T;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.U.cancel();
        }
        return z10;
    }

    public final void E(long j10, long j11, boolean z10, boolean z11, boolean z12) {
        if ((Math.abs((((long) Math.ceil(((j10 <= 100 || ((float) (j10 / 5)) % 10.0f == 0.0f) ? j10 : ((j10 / 10) + 1) * 10) / 5.0f)) * 5) - this.f46989x) < this.A || j10 == 0) && j10 == this.f46991y) {
            return;
        }
        tf.d dVarF = f(this.f46961d0.f47887i, j10, j11);
        long[] jArr = dVarF.f48178a;
        long j12 = jArr[jArr.length - 1];
        long j13 = jArr[0];
        if (!z12) {
            float f10 = this.v - this.f46987w;
            float f11 = j12 - j13;
            float f12 = f10 / f11;
            if (f12 > 1.0f) {
                f12 = f11 / f10;
            }
            double d = f12;
            float f13 = d > 0.7d ? 0.1f : d < 0.1d ? 0.03f : 0.045f;
            boolean z13 = ((float) j12) != this.f46989x;
            if (this.L0 && j13 != this.f46991y) {
                z13 = true;
            }
            if (z13) {
                AnimatorSet animatorSet = this.T;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    this.T.cancel();
                }
                this.P0 = this.v;
                this.Q0 = this.f46987w;
                this.N0 = 0.0f;
                this.O0 = 0.0f;
                this.R0 = f13;
            }
        }
        float f14 = j12;
        this.f46989x = f14;
        float f15 = j13;
        this.f46991y = f15;
        v();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.X0 >= 320 || z11) {
            this.X0 = jCurrentTimeMillis;
            ValueAnimator valueAnimator = this.U;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.U.cancel();
            }
            ArrayList arrayList = this.f46955b;
            if (!z10) {
                this.v = f14;
                this.f46987w = f15;
                arrayList.clear();
                arrayList.add(dVarF);
                dVarF.f48182f = 255;
                return;
            }
            arrayList.add(dVarF);
            if (z12) {
                AnimatorSet animatorSet2 = this.T;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    this.T.cancel();
                }
                this.R0 = 0.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(e(this.v, f14, this.H0));
                if (this.L0) {
                    animatorSet3.playTogether(e(this.f46987w, f15, this.I0));
                }
                this.T = animatorSet3;
                animatorSet3.start();
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                tf.d dVar = (tf.d) arrayList.get(i10);
                if (dVar != dVarF) {
                    dVar.f48183g = dVar.f48182f;
                }
            }
            ValueAnimator valueAnimatorE = e(0.0f, 255.0f, new t2(24, this, dVarF));
            this.U = valueAnimatorE;
            valueAnimatorE.addListener(new fk0(19, this, dVarF));
            this.U.start();
        }
    }

    public final void F() {
        float f10 = this.R0;
        if (f10 == 0.0f) {
            return;
        }
        float f11 = this.v;
        float f12 = this.f46989x;
        if (f11 != f12) {
            float f13 = this.N0 + f10;
            this.N0 = f13;
            if (f13 > 1.0f) {
                this.N0 = 1.0f;
                this.v = f12;
            } else {
                float f14 = this.P0;
                this.v = (er.f28123g.getInterpolation(f13) * (f12 - f14)) + f14;
            }
            invalidate();
        }
        if (this.L0) {
            float f15 = this.f46987w;
            float f16 = this.f46991y;
            if (f15 != f16) {
                float f17 = this.O0 + this.R0;
                this.O0 = f17;
                if (f17 > 1.0f) {
                    this.O0 = 1.0f;
                    this.f46987w = f16;
                } else {
                    float f18 = this.Q0;
                    this.f46987w = (er.f28123g.getInterpolation(f17) * (f16 - f18)) + f18;
                }
                invalidate();
            }
        }
    }

    public final void G() {
        int i10 = this.f46984t0 ? g6.Zi : g6.Yi;
        c6 c6Var = this.S0;
        int iV0 = g6.v0(i10, c6Var);
        TextPaint textPaint = this.J;
        textPaint.setColor(iV0);
        this.K.setColor(g6.v0(this.f46984t0 ? g6.Zi : g6.Yi, c6Var));
        int iV1 = g6.v0(g6.Yi, c6Var);
        TextPaint textPaint2 = this.L;
        textPaint2.setColor(iV1);
        int iV2 = g6.v0(g6.aj, c6Var);
        Paint paint = this.H;
        paint.setColor(iV2);
        int iV3 = g6.v0(g6.bj, c6Var);
        Paint paint2 = this.I;
        paint2.setColor(iV3);
        this.M.setColor(g6.v0(g6.dj, c6Var));
        this.N.setColor(g6.v0(g6.cj, c6Var));
        this.O.setColor(g6.v0(g6.f23053d6, c6Var));
        this.P.setColor(g6.v0(g6.ej, c6Var));
        this.f46978p0.b();
        this.f46975n = paint.getAlpha();
        this.f46980r = paint2.getAlpha();
        this.f46966f = textPaint.getAlpha() / 255.0f;
        this.h = textPaint2.getAlpha() / 255.0f;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((tf.f) obj).a();
        }
        if (this.f46979q0) {
            int i12 = this.f46977o0;
            sf.b bVar = this.f46961d0;
            long[] jArr = bVar.f47881a;
            if (i12 < jArr.length) {
                this.f46978p0.c(i12, jArr[i12], arrayList, false, bVar.f47888j, bVar.h);
            }
        }
        this.D = true;
    }

    public final void H() {
        sf.b bVar = this.f46961d0;
        if (bVar == null) {
            return;
        }
        j jVar = this.f46959c0;
        int iC = bVar.c(Math.max(jVar.f47008k, 0.0f));
        this.B = iC;
        int iA = this.f46961d0.a(Math.min(jVar.f47009l, 1.0f), iC);
        this.C = iA;
        int i10 = this.B;
        if (iA < i10) {
            this.C = i10;
        }
        tf.c cVar = this.f46968f1;
        if (cVar != null) {
            long[] jArr = this.f46961d0.f47881a;
            cVar.b(jArr[i10], jArr[this.C]);
        }
        I();
    }

    public final void I() {
        sf.b bVar = this.f46961d0;
        if (bVar != null) {
            float f10 = this.B0;
            if (f10 == 0.0f) {
                return;
            }
            int i10 = (int) ((f10 / (this.C0 * bVar.f47886g)) / 6.0f);
            tf.b bVar2 = this.f46964e0;
            if (bVar2 == null || i10 >= bVar2.f48168b || i10 <= bVar2.f48169c) {
                int iHighestOneBit = Integer.highestOneBit(i10) << 1;
                tf.b bVar3 = this.f46964e0;
                if (bVar3 == null || bVar3.f48167a != iHighestOneBit) {
                    ValueAnimator valueAnimator = this.V;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        this.V.cancel();
                    }
                    double d = iHighestOneBit;
                    double d10 = 0.2d * d;
                    tf.b bVar4 = new tf.b(iHighestOneBit, (int) (d + d10), (int) (d - d10));
                    bVar4.d = 255;
                    tf.b bVar5 = this.f46964e0;
                    ArrayList arrayList = this.f46958c;
                    if (bVar5 == null) {
                        this.f46964e0 = bVar4;
                        bVar4.d = 255;
                        arrayList.add(bVar4);
                        return;
                    }
                    this.f46964e0 = bVar4;
                    this.f46971i0 = arrayList.size();
                    for (int i11 = 0; i11 < this.f46971i0; i11++) {
                        tf.b bVar6 = (tf.b) arrayList.get(i11);
                        bVar6.f48170e = bVar6.d;
                    }
                    arrayList.add(bVar4);
                    if (arrayList.size() > 2) {
                        arrayList.remove(0);
                    }
                    ValueAnimator duration = e(0.0f, 1.0f, new t2(25, this, bVar4)).setDuration(200L);
                    this.V = duration;
                    duration.addListener(new fk0(20, this, bVar4));
                    this.V.start();
                }
            }
        }
    }

    public void J(sf.b bVar, long j10) {
        int length = bVar.f47881a.length;
        long j11 = j10 - (j10 % 86400000);
        long j12 = 86399999 + j11;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            long j13 = bVar.f47881a[i12];
            if (j11 > j13) {
                i10 = i12;
            }
            if (j12 > j13) {
                i11 = i12;
            }
        }
        float[] fArr = bVar.f47882b;
        float f10 = fArr[i10];
        j jVar = this.f46959c0;
        jVar.f47008k = f10;
        jVar.f47009l = fArr[i11];
    }

    public void K() {
        if (f46950x1) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j10 = Long.MAX_VALUE;
            long j11 = 0;
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                tf.f fVar = (tf.f) obj;
                boolean z10 = fVar.f48206n;
                sf.a aVar = fVar.f48195a;
                if (z10) {
                    long j12 = aVar.f47877e;
                    if (j12 > j11) {
                        j11 = j12;
                    }
                }
                if (z10) {
                    long j13 = aVar.f47878f;
                    if (j13 < j10) {
                        j10 = j13;
                    }
                }
            }
            if ((j10 == 2147483647L || j10 == 0.0f) && (j11 <= 0 || j11 == this.f46970h0)) {
                return;
            }
            this.f46970h0 = j11;
            Animator animator = this.W;
            if (animator != null) {
                animator.cancel();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(e(this.f46967f0, this.f46970h0, this.F0), e(this.f46969g0, 0.0f, this.G0));
            this.W = animatorSet;
            animatorSet.start();
        }
    }

    @Override
    public void a(float f10, float f11, boolean z10) {
        sf.b bVar = this.f46961d0;
        if (bVar == null) {
            return;
        }
        if (!z10) {
            H();
            invalidate();
        } else {
            int iC = bVar.c(Math.max(f10, 0.0f));
            int iA = this.f46961d0.a(Math.min(f11, 1.0f), iC);
            E(r(iC, iA), s(iC, iA), true, true, false);
            c(false);
        }
    }

    public final void c(boolean z10) {
        x((this.C0 * this.f46959c0.f47008k) - f46934g1);
        if (this.f46965e1 == z10) {
            return;
        }
        this.f46965e1 = z10;
        ValueAnimator valueAnimator = this.f46953a0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f46953a0.cancel();
        }
        ValueAnimator duration = e(this.f46981r0, z10 ? 1.0f : 0.0f, this.J0).setDuration(200L);
        this.f46953a0 = duration;
        duration.addListener(this.K0);
        this.f46953a0.start();
    }

    public final void d() {
        this.f46977o0 = -1;
        this.f46979q0 = false;
        this.f46965e1 = false;
        this.f46978p0.setVisibility(8);
        this.f46981r0 = 0.0f;
    }

    public tf.d f(int i10, long j10, long j11) {
        return new tf.d(j10, j11, this.L0, this.f46961d0.h, i10, this.J, this.K);
    }

    public tf.e g() {
        return new tf.e(getContext(), this.S0);
    }

    public long getEndDate() {
        return this.f46961d0.f47881a[this.C];
    }

    public float getMinDistance() {
        sf.b bVar = this.f46961d0;
        if (bVar == null) {
            return 0.1f;
        }
        int length = bVar.f47881a.length;
        if (length < 5) {
            return 1.0f;
        }
        float f10 = 5.0f / length;
        if (f10 < 0.1f) {
            return 0.1f;
        }
        return f10;
    }

    public long getSelectedDate() {
        int i10 = this.f46977o0;
        if (i10 < 0) {
            return -1L;
        }
        return this.f46961d0.f47881a[i10];
    }

    public long getStartDate() {
        return this.f46961d0.f47881a[this.B];
    }

    public abstract tf.f h(sf.a aVar);

    public void i(Canvas canvas) {
        if (this.f46961d0 == null) {
            return;
        }
        int i10 = this.f46985u0;
        float f10 = 1.0f;
        if (i10 == 2) {
            f10 = 1.0f - this.f46986v0.f48216f;
        } else if (i10 == 1 || i10 == 3) {
            f10 = this.f46986v0.f48216f;
        }
        int i11 = (int) (this.f46975n * f10);
        Paint paint = this.H;
        paint.setAlpha(i11);
        int i12 = (int) (this.f46966f * 255.0f * f10);
        TextPaint textPaint = this.J;
        textPaint.setAlpha(i12);
        this.K.setAlpha((int) (this.f46966f * 255.0f * f10));
        int textSize = (int) (f46937j1 - textPaint.getTextSize());
        int measuredHeight = (getMeasuredHeight() - this.f46982s) - 1;
        float f11 = measuredHeight;
        canvas.drawLine(this.f46993z0, f11, this.A0, f11, paint);
        if (this.L0) {
            return;
        }
        canvas.drawText("0", f46934g1, measuredHeight - textSize, textPaint);
    }

    public void j(Canvas canvas) {
        float f10;
        int i10;
        if (this.f46961d0 == null) {
            return;
        }
        ArrayList arrayList = this.f46958c;
        this.f46971i0 = arrayList.size();
        int i11 = this.f46985u0;
        float f11 = 1.0f;
        int i12 = 1;
        if (i11 == 2) {
            f10 = 1.0f - this.f46986v0.f48216f;
        } else {
            f10 = (i11 == 1 || i11 == 3) ? this.f46986v0.f48216f : 1.0f;
        }
        char c10 = 0;
        this.f46972j0 = 0;
        while (true) {
            int i13 = this.f46972j0;
            if (i13 >= this.f46971i0) {
                return;
            }
            int i14 = ((tf.b) arrayList.get(i13)).d;
            int i15 = ((tf.b) arrayList.get(this.f46972j0)).f48167a;
            if (i15 == 0) {
                i15 = 1;
            }
            int i16 = this.B - this.f46973k0;
            while (i16 % i15 != 0) {
                i16--;
            }
            int i17 = this.C - this.f46973k0;
            while (true) {
                if (i17 % i15 == 0 && i17 >= this.f46961d0.f47881a.length - i12) {
                    break;
                }
                i17++;
                i14 = i14;
                c10 = 0;
                f11 = 1.0f;
                i12 = 1;
            }
            int i18 = this.f46973k0;
            int i19 = i16 + i18;
            int i20 = i17 + i18;
            float f12 = this.C0 * this.f46959c0.f47008k;
            float f13 = f46934g1;
            float f14 = f12 - f13;
            while (i19 < i20) {
                if (i19 >= 0) {
                    long[] jArr = this.f46961d0.f47881a;
                    if (i19 >= jArr.length - i12) {
                        i10 = i14;
                    } else {
                        long j10 = jArr[i19];
                        long j11 = jArr[c10];
                        i10 = i14;
                        float f15 = (((j10 - j11) / (jArr[jArr.length - i12] - j11)) * this.C0) - f14;
                        float f16 = f15 - f46942p1;
                        if (f16 > 0.0f) {
                            float f17 = this.B0;
                            if (f16 <= f17 + f13) {
                                float f18 = l1;
                                TextPaint textPaint = this.L;
                                if (f16 < f18) {
                                    textPaint.setAlpha((int) (i10 * y1.a(f18, f16, f18, f11) * this.h * f10));
                                } else if (f16 > f17) {
                                    textPaint.setAlpha((int) (i10 * y1.a(f16, f17, f13, f11) * this.h * f10));
                                } else {
                                    textPaint.setAlpha((int) (i10 * this.h * f10));
                                }
                                sf.b bVar = this.f46961d0;
                                String[] strArr = bVar.f47883c;
                                long[] jArr2 = bVar.f47881a;
                                canvas.drawText(strArr[(int) ((jArr2[i19] - jArr2[0]) / bVar.f47889k)], f15, AndroidUtilities.dp(3.0f) + (getMeasuredHeight() - this.f46982s) + f46938k1, textPaint);
                            }
                        }
                    }
                } else {
                    i10 = i14;
                }
                i19 += i15;
                i14 = i10;
                c10 = 0;
                f11 = 1.0f;
                i12 = 1;
            }
            this.f46972j0++;
            c10 = 0;
            f11 = 1.0f;
            i12 = 1;
        }
    }

    public abstract void k(Canvas canvas);

    public void l(Canvas canvas, tf.d dVar) {
        float f10;
        long[] jArr = dVar.f48178a;
        int length = jArr.length;
        float f11 = 1.0f;
        if (length > 2) {
            float f12 = (jArr[1] - jArr[0]) / (this.v - this.f46987w);
            if (f12 < 0.1d) {
                f10 = f12 / 0.1f;
            } else {
                f10 = 1.0f;
            }
        } else {
            f10 = 1.0f;
        }
        int i10 = this.f46985u0;
        if (i10 == 2) {
            f11 = 1.0f - this.f46986v0.f48216f;
        } else if (i10 == 1 || i10 == 3) {
            f11 = this.f46986v0.f48216f;
        }
        int i11 = (int) ((this.f46975n / 255.0f) * dVar.f48182f * f11 * f10);
        Paint paint = this.H;
        paint.setAlpha(i11);
        this.J.setAlpha((int) com.google.android.recaptcha.internal.a.C(dVar.f48182f, this.f46966f, f11, f10));
        this.K.setAlpha((int) com.google.android.recaptcha.internal.a.C(dVar.f48182f, this.f46966f, f11, f10));
        int measuredHeight = (getMeasuredHeight() - this.f46982s) - f46937j1;
        for (int i12 = !this.L0 ? 1 : 0; i12 < length; i12++) {
            float measuredHeight2 = getMeasuredHeight() - this.f46982s;
            float f13 = dVar.f48178a[i12];
            float f14 = this.f46987w;
            int i13 = (int) (measuredHeight2 - (((f13 - f14) / (this.v - f14)) * measuredHeight));
            canvas.drawRect(this.f46993z0, i13, this.A0, i13 + 1, paint);
        }
    }

    public final void m(Canvas canvas) {
        float f10;
        int i10;
        int i11;
        sf.b bVar;
        int i12;
        Paint paint;
        Paint paint2;
        int i13;
        int i14;
        char c10;
        Canvas canvas2;
        float f11;
        Rect rect;
        h[] hVarArr;
        h hVar;
        int i15;
        h hVar2;
        int i16;
        int i17;
        h hVar3;
        Paint paint3;
        int i18;
        int i19;
        float f12;
        boolean z10;
        boolean z11;
        int i20;
        float f13;
        float f14;
        float f15;
        int i21;
        ArrayList arrayList;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        if (this.f46961d0 == null) {
            return;
        }
        float f16 = this.f46992y0;
        j jVar = this.f46959c0;
        jVar.f47001b = f16;
        int measuredHeight = getMeasuredHeight();
        int i22 = f46939m1;
        int i23 = measuredHeight - i22;
        int measuredHeight2 = getMeasuredHeight();
        int i24 = this.f46990x0;
        int i25 = (measuredHeight2 - i24) - i22;
        float f17 = this.f46992y0;
        float f18 = jVar.f47008k * f17;
        float f19 = f46934g1;
        int i26 = (int) (f18 + f19);
        int i27 = (int) ((jVar.f47009l * f17) + f19);
        int i28 = this.f46985u0;
        if (i28 != 1) {
            if (i28 == 3) {
                f10 = this.f46986v0.f48216f;
                i10 = i26;
                i11 = i27;
            }
            bVar = this.f46961d0;
            i12 = f46943q1;
            paint = this.N;
            paint2 = this.G;
            if (bVar != null) {
                if (i28 == 0) {
                    i21 = 0;
                    while (true) {
                        arrayList = this.d;
                        f12 = f10;
                        if (i21 < arrayList.size()) {
                            tf.f fVar = (tf.f) arrayList.get(i21);
                            valueAnimator = fVar.h;
                            if (!(valueAnimator == null && valueAnimator.isRunning()) && ((valueAnimator2 = fVar.f48201i) == null || !valueAnimator2.isRunning())) {
                                i21++;
                                f10 = f12;
                            } else {
                                z10 = true;
                            }
                        }
                        if (z10) {
                            canvas.save();
                            z11 = z10;
                            canvas.clipRect(f19, (getMeasuredHeight() - i22) - i24, getMeasuredWidth() - f19, getMeasuredHeight() - i22);
                            canvas.translate(f19, (getMeasuredHeight() - i22) - i24);
                            n(canvas);
                            canvas.restore();
                        } else {
                            z11 = z10;
                            if (this.D) {
                                this.f46974l0.eraseColor(0);
                                n(this.m0);
                                this.D = false;
                            }
                            if (z11) {
                                i13 = i22;
                            } else {
                                i20 = this.f46985u0;
                                if (i20 == 2) {
                                    float f20 = this.f46992y0;
                                    tf.j jVar2 = this.f46986v0;
                                    float f21 = (jVar2.f48214c * f20) + f19;
                                    paint2.setAlpha((int) ((1.0f - jVar2.f48216f) * 255.0f));
                                    canvas.save();
                                    i13 = i22;
                                    canvas.clipRect(f19, i25, getMeasuredWidth() - f19, i23);
                                    canvas.scale((this.f46986v0.f48216f * 2.0f) + 1.0f, 1.0f, f21, ((i23 - i25) + i25) >> 1);
                                    canvas.drawBitmap(this.f46974l0, f19, (getMeasuredHeight() - i13) - i24, paint2);
                                    canvas.restore();
                                } else {
                                    paint = paint;
                                    i13 = i22;
                                    if (i20 == 1) {
                                        float f22 = ((i23 - i25) + i25) >> 1;
                                        f13 = this.f46992y0;
                                        tf.j jVar3 = this.f46986v0;
                                        f14 = jVar3.f48214c;
                                        f15 = f13 * f14;
                                        float f23 = f15 + f19;
                                        if (f14 <= 0.5f) {
                                            f15 = (1.0f - f14) * f13;
                                        }
                                        float f24 = f15 * jVar3.f48216f;
                                        canvas.save();
                                        canvas.clipRect(f23 - f24, i25, f24 + f23, i23);
                                        paint2.setAlpha((int) (this.f46986v0.f48216f * 255.0f));
                                        canvas.scale(this.f46986v0.f48216f, 1.0f, f23, f22);
                                        canvas.drawBitmap(this.f46974l0, f19, (getMeasuredHeight() - i13) - i24, paint2);
                                        canvas.restore();
                                    } else {
                                        paint2.setAlpha((int) (f12 * 255.0f));
                                        canvas.drawBitmap(this.f46974l0, f19, (getMeasuredHeight() - i13) - i24, paint2);
                                    }
                                }
                                if (this.f46985u0 == 2) {
                                    return;
                                }
                                float f25 = i25;
                                float f26 = i23;
                                float f27 = f46934g1;
                                Paint paint4 = paint;
                                i14 = 2;
                                c10 = 0;
                                canvas.drawRect(f27, f25, i10 + i12, f26, paint4);
                                canvas2 = canvas;
                                canvas2.drawRect(i11 - i12, f25, getMeasuredWidth() - f27, f26, paint4);
                                f11 = f19;
                            }
                            if (this.f46985u0 == 2) {
                                return;
                            }
                            float f28 = i25;
                            float f29 = i23;
                            float f210 = f46934g1;
                            Paint paint5 = paint;
                            i14 = 2;
                            c10 = 0;
                            canvas.drawRect(f210, f28, i10 + i12, f29, paint5);
                            canvas2 = canvas;
                            canvas2.drawRect(i11 - i12, f28, getMeasuredWidth() - f210, f29, paint5);
                            f11 = f19;
                        }
                        if (z11) {
                            i20 = this.f46985u0;
                            if (i20 == 2) {
                                float f211 = this.f46992y0;
                                tf.j jVar4 = this.f46986v0;
                                float f212 = (jVar4.f48214c * f211) + f19;
                                paint2.setAlpha((int) ((1.0f - jVar4.f48216f) * 255.0f));
                                canvas.save();
                                i13 = i22;
                                canvas.clipRect(f19, i25, getMeasuredWidth() - f19, i23);
                                canvas.scale((this.f46986v0.f48216f * 2.0f) + 1.0f, 1.0f, f212, ((i23 - i25) + i25) >> 1);
                                canvas.drawBitmap(this.f46974l0, f19, (getMeasuredHeight() - i13) - i24, paint2);
                                canvas.restore();
                            } else {
                                paint = paint;
                                i13 = i22;
                                if (i20 == 1) {
                                    float f213 = ((i23 - i25) + i25) >> 1;
                                    f13 = this.f46992y0;
                                    tf.j jVar5 = this.f46986v0;
                                    f14 = jVar5.f48214c;
                                    f15 = f13 * f14;
                                    float f214 = f15 + f19;
                                    if (f14 <= 0.5f) {
                                        f15 = (1.0f - f14) * f13;
                                    }
                                    float f215 = f15 * jVar5.f48216f;
                                    canvas.save();
                                    canvas.clipRect(f214 - f215, i25, f215 + f214, i23);
                                    paint2.setAlpha((int) (this.f46986v0.f48216f * 255.0f));
                                    canvas.scale(this.f46986v0.f48216f, 1.0f, f214, f213);
                                    canvas.drawBitmap(this.f46974l0, f19, (getMeasuredHeight() - i13) - i24, paint2);
                                    canvas.restore();
                                } else {
                                    paint2.setAlpha((int) (f12 * 255.0f));
                                    canvas.drawBitmap(this.f46974l0, f19, (getMeasuredHeight() - i13) - i24, paint2);
                                }
                            }
                            if (this.f46985u0 == 2) {
                                return;
                            }
                            float f216 = i25;
                            float f217 = i23;
                            float f218 = f46934g1;
                            Paint paint6 = paint;
                            i14 = 2;
                            c10 = 0;
                            canvas.drawRect(f218, f216, i10 + i12, f217, paint6);
                            canvas2 = canvas;
                            canvas2.drawRect(i11 - i12, f216, getMeasuredWidth() - f218, f217, paint6);
                            f11 = f19;
                        } else {
                            i13 = i22;
                        }
                        if (this.f46985u0 == 2) {
                            return;
                        }
                        float f219 = i25;
                        float f2110 = i23;
                        float f2111 = f46934g1;
                        Paint paint7 = paint;
                        i14 = 2;
                        c10 = 0;
                        canvas.drawRect(f2111, f219, i10 + i12, f2110, paint7);
                        canvas2 = canvas;
                        canvas2.drawRect(i11 - i12, f219, getMeasuredWidth() - f2111, f2110, paint7);
                        f11 = f19;
                    }
                } else {
                    f12 = f10;
                }
                z10 = false;
                if (z10) {
                    canvas.save();
                    z11 = z10;
                    canvas.clipRect(f19, (getMeasuredHeight() - i22) - i24, getMeasuredWidth() - f19, getMeasuredHeight() - i22);
                    canvas.translate(f19, (getMeasuredHeight() - i22) - i24);
                    n(canvas);
                    canvas.restore();
                } else {
                    z11 = z10;
                    if (this.D) {
                        this.f46974l0.eraseColor(0);
                        n(this.m0);
                        this.D = false;
                    }
                    if (z11) {
                        i20 = this.f46985u0;
                        if (i20 == 2) {
                            float f2112 = this.f46992y0;
                            tf.j jVar6 = this.f46986v0;
                            float f2113 = (jVar6.f48214c * f2112) + f19;
                            paint2.setAlpha((int) ((1.0f - jVar6.f48216f) * 255.0f));
                            canvas.save();
                            i13 = i22;
                            canvas.clipRect(f19, i25, getMeasuredWidth() - f19, i23);
                            canvas.scale((this.f46986v0.f48216f * 2.0f) + 1.0f, 1.0f, f2113, ((i23 - i25) + i25) >> 1);
                            canvas.drawBitmap(this.f46974l0, f19, (getMeasuredHeight() - i13) - i24, paint2);
                            canvas.restore();
                        } else {
                            paint = paint;
                            i13 = i22;
                            if (i20 == 1) {
                                float f2114 = ((i23 - i25) + i25) >> 1;
                                f13 = this.f46992y0;
                                tf.j jVar7 = this.f46986v0;
                                f14 = jVar7.f48214c;
                                f15 = f13 * f14;
                                float f2115 = f15 + f19;
                                if (f14 <= 0.5f) {
                                    f15 = (1.0f - f14) * f13;
                                }
                                float f2116 = f15 * jVar7.f48216f;
                                canvas.save();
                                canvas.clipRect(f2115 - f2116, i25, f2116 + f2115, i23);
                                paint2.setAlpha((int) (this.f46986v0.f48216f * 255.0f));
                                canvas.scale(this.f46986v0.f48216f, 1.0f, f2115, f2114);
                                canvas.drawBitmap(this.f46974l0, f19, (getMeasuredHeight() - i13) - i24, paint2);
                                canvas.restore();
                            } else {
                                paint2.setAlpha((int) (f12 * 255.0f));
                                canvas.drawBitmap(this.f46974l0, f19, (getMeasuredHeight() - i13) - i24, paint2);
                            }
                        }
                        if (this.f46985u0 == 2) {
                            return;
                        }
                        float f2117 = i25;
                        float f2118 = i23;
                        float f2119 = f46934g1;
                        Paint paint8 = paint;
                        i14 = 2;
                        c10 = 0;
                        canvas.drawRect(f2119, f2117, i10 + i12, f2118, paint8);
                        canvas2 = canvas;
                        canvas2.drawRect(i11 - i12, f2117, getMeasuredWidth() - f2119, f2118, paint8);
                        f11 = f19;
                    } else {
                        i13 = i22;
                    }
                    if (this.f46985u0 == 2) {
                        return;
                    }
                    float f21110 = i25;
                    float f21111 = i23;
                    float f21112 = f46934g1;
                    Paint paint9 = paint;
                    i14 = 2;
                    c10 = 0;
                    canvas.drawRect(f21112, f21110, i10 + i12, f21111, paint9);
                    canvas2 = canvas;
                    canvas2.drawRect(i11 - i12, f21110, getMeasuredWidth() - f21112, f21111, paint9);
                    f11 = f19;
                }
                if (z11) {
                    i20 = this.f46985u0;
                    if (i20 == 2) {
                        float f21113 = this.f46992y0;
                        tf.j jVar8 = this.f46986v0;
                        float f21114 = (jVar8.f48214c * f21113) + f19;
                        paint2.setAlpha((int) ((1.0f - jVar8.f48216f) * 255.0f));
                        canvas.save();
                        i13 = i22;
                        canvas.clipRect(f19, i25, getMeasuredWidth() - f19, i23);
                        canvas.scale((this.f46986v0.f48216f * 2.0f) + 1.0f, 1.0f, f21114, ((i23 - i25) + i25) >> 1);
                        canvas.drawBitmap(this.f46974l0, f19, (getMeasuredHeight() - i13) - i24, paint2);
                        canvas.restore();
                    } else {
                        paint = paint;
                        i13 = i22;
                        if (i20 == 1) {
                            float f21115 = ((i23 - i25) + i25) >> 1;
                            f13 = this.f46992y0;
                            tf.j jVar9 = this.f46986v0;
                            f14 = jVar9.f48214c;
                            f15 = f13 * f14;
                            float f21116 = f15 + f19;
                            if (f14 <= 0.5f) {
                                f15 = (1.0f - f14) * f13;
                            }
                            float f21117 = f15 * jVar9.f48216f;
                            canvas.save();
                            canvas.clipRect(f21116 - f21117, i25, f21117 + f21116, i23);
                            paint2.setAlpha((int) (this.f46986v0.f48216f * 255.0f));
                            canvas.scale(this.f46986v0.f48216f, 1.0f, f21116, f21115);
                            canvas.drawBitmap(this.f46974l0, f19, (getMeasuredHeight() - i13) - i24, paint2);
                            canvas.restore();
                        } else {
                            paint2.setAlpha((int) (f12 * 255.0f));
                            canvas.drawBitmap(this.f46974l0, f19, (getMeasuredHeight() - i13) - i24, paint2);
                        }
                    }
                    if (this.f46985u0 == 2) {
                        return;
                    }
                    float f21118 = i25;
                    float f21119 = i23;
                    float f211110 = f46934g1;
                    Paint paint10 = paint;
                    i14 = 2;
                    c10 = 0;
                    canvas.drawRect(f211110, f21118, i10 + i12, f21119, paint10);
                    canvas2 = canvas;
                    canvas2.drawRect(i11 - i12, f21118, getMeasuredWidth() - f211110, f21119, paint10);
                    f11 = f19;
                } else {
                    i13 = i22;
                }
                if (this.f46985u0 == 2) {
                    return;
                }
                float f211111 = i25;
                float f211112 = i23;
                float f211113 = f46934g1;
                Paint paint11 = paint;
                i14 = 2;
                c10 = 0;
                canvas.drawRect(f211113, f211111, i10 + i12, f211112, paint11);
                canvas2 = canvas;
                canvas2.drawRect(i11 - i12, f211111, getMeasuredWidth() - f211113, f211112, paint11);
                f11 = f19;
            } else {
                i13 = i22;
                i12 = i12;
                i14 = 2;
                c10 = 0;
                canvas2 = canvas;
                f11 = f19;
                canvas2.drawRect(f11, i25, getMeasuredWidth() - f19, i23, paint);
            }
            canvas2.drawBitmap(this.f46952a.a(i24, (int) (getMeasuredWidth() - (f11 * 2.0f))), f11, (getMeasuredHeight() - i13) - i24, paint2);
            if (this.f46961d0 != null) {
                rect = this.R;
                rect.set(i10, i25, i11, i23);
                jVar.f47007j.set(rect);
                int i29 = rect.left;
                int i30 = rect.top;
                int i31 = f46948v1;
                float f30 = rect.bottom + i31;
                float f31 = f46944r1;
                Path path = this.S;
                b(path, i29, i30 - i31, i29 + i12, f30, f31, f31, true, false, false, true);
                Paint paint12 = this.M;
                canvas2.drawPath(path, paint12);
                int i32 = rect.right;
                b(path, i32 - i12, rect.top - i31, i32, rect.bottom + i31, f31, f31, false, true, true, false);
                canvas2.drawPath(path, paint12);
                float f32 = rect.left + i12;
                int i33 = rect.bottom;
                canvas2.drawRect(f32, i33, rect.right - i12, i33 + i31, paint12);
                float f33 = rect.left + i12;
                int i34 = rect.top;
                canvas.drawRect(f33, i34 - i31, rect.right - i12, i34, paint12);
                int i35 = rect.left;
                int i36 = f46945s1;
                float fCenterY = rect.centerY() - i36;
                float f34 = rect.left + i36;
                float fCenterY2 = rect.centerY() + i36;
                Paint paint13 = this.Q;
                canvas.drawLine(i35 + i36, fCenterY, f34, fCenterY2, paint13);
                canvas.drawLine(rect.right - i36, rect.centerY() - i36, rect.right - i36, rect.centerY() + i36, paint13);
                hVarArr = jVar.f47011n;
                hVar = hVarArr[c10];
                if (hVar == null && hVar.f46994a == 4) {
                    hVar2 = hVar;
                    i15 = 1;
                } else {
                    i15 = 1;
                    hVar2 = hVarArr[1];
                    if (hVar2 != null || hVar2.f46994a != 4) {
                        hVar2 = null;
                    }
                }
                int i37 = rect.bottom;
                int i38 = rect.top;
                i16 = (i37 - i38) >> i15;
                i17 = i38 + i16;
                if (hVar2 == null) {
                    if (hVar == null && hVar.f46994a == i15) {
                        hVar3 = hVar;
                    } else {
                        hVar3 = hVarArr[i15];
                        if (hVar3 != null || hVar3.f46994a != i15) {
                            hVar3 = null;
                        }
                    }
                    if ((hVar != null || hVar.f46994a != i14) && ((hVar = hVarArr[i15]) == null || hVar.f46994a != i14)) {
                    }
                    paint3 = this.P;
                    i18 = f46947u1;
                    i19 = f46946t1;
                    if (hVar3 != null) {
                        canvas.drawCircle(rect.left + i19, i17, (i16 * hVar3.f46998f) - i18, paint3);
                    }
                    if (hVar != null) {
                        canvas.drawCircle(rect.right - i19, i17, (i16 * hVar.f46998f) - i18, paint3);
                    }
                }
                Rect rect2 = jVar.h;
                int i39 = f46940n1;
                int i40 = i39 >> 1;
                rect2.set(i10 - i39, i25, i10 + i40, i23);
                jVar.f47006i.set(i11 - i40, i25, i11 + i39, i23);
            }
        }
        tf.j jVar10 = this.f46986v0;
        int i41 = (int) ((jVar10.f48212a * f17) + f19);
        int i42 = (int) ((f17 * jVar10.f48213b) + f19);
        float f35 = 1.0f - jVar10.f48216f;
        i26 = (int) (((i41 - i26) * f35) + i26);
        i27 = (int) ((f35 * (i42 - i27)) + i27);
        i10 = i26;
        i11 = i27;
        f10 = 1.0f;
        bVar = this.f46961d0;
        i12 = f46943q1;
        paint = this.N;
        paint2 = this.G;
        if (bVar != null) {
            if (i28 == 0) {
                i21 = 0;
                while (true) {
                    arrayList = this.d;
                    f12 = f10;
                    if (i21 < arrayList.size()) {
                        tf.f fVar2 = (tf.f) arrayList.get(i21);
                        valueAnimator = fVar2.h;
                        if (valueAnimator == null) {
                            i21++;
                            f10 = f12;
                        } else {
                            i21++;
                            f10 = f12;
                        }
                        z10 = true;
                    }
                    if (z10) {
                        canvas.save();
                        z11 = z10;
                        canvas.clipRect(f19, (getMeasuredHeight() - i22) - i24, getMeasuredWidth() - f19, getMeasuredHeight() - i22);
                        canvas.translate(f19, (getMeasuredHeight() - i22) - i24);
                        n(canvas);
                        canvas.restore();
                    } else {
                        z11 = z10;
                        if (this.D) {
                            this.f46974l0.eraseColor(0);
                            n(this.m0);
                            this.D = false;
                        }
                        if (z11) {
                            i20 = this.f46985u0;
                            if (i20 == 2) {
                                float f211114 = this.f46992y0;
                                tf.j jVar11 = this.f46986v0;
                                float f211115 = (jVar11.f48214c * f211114) + f19;
                                paint2.setAlpha((int) ((1.0f - jVar11.f48216f) * 255.0f));
                                canvas.save();
                                i13 = i22;
                                canvas.clipRect(f19, i25, getMeasuredWidth() - f19, i23);
                                canvas.scale((this.f46986v0.f48216f * 2.0f) + 1.0f, 1.0f, f211115, ((i23 - i25) + i25) >> 1);
                                canvas.drawBitmap(this.f46974l0, f19, (getMeasuredHeight() - i13) - i24, paint2);
                                canvas.restore();
                            } else {
                                paint = paint;
                                i13 = i22;
                                if (i20 == 1) {
                                    float f211116 = ((i23 - i25) + i25) >> 1;
                                    f13 = this.f46992y0;
                                    tf.j jVar12 = this.f46986v0;
                                    f14 = jVar12.f48214c;
                                    f15 = f13 * f14;
                                    float f211117 = f15 + f19;
                                    if (f14 <= 0.5f) {
                                        f15 = (1.0f - f14) * f13;
                                    }
                                    float f211118 = f15 * jVar12.f48216f;
                                    canvas.save();
                                    canvas.clipRect(f211117 - f211118, i25, f211118 + f211117, i23);
                                    paint2.setAlpha((int) (this.f46986v0.f48216f * 255.0f));
                                    canvas.scale(this.f46986v0.f48216f, 1.0f, f211117, f211116);
                                    canvas.drawBitmap(this.f46974l0, f19, (getMeasuredHeight() - i13) - i24, paint2);
                                    canvas.restore();
                                } else {
                                    paint2.setAlpha((int) (f12 * 255.0f));
                                    canvas.drawBitmap(this.f46974l0, f19, (getMeasuredHeight() - i13) - i24, paint2);
                                }
                            }
                            if (this.f46985u0 == 2) {
                                return;
                            }
                            float f211119 = i25;
                            float f2111110 = i23;
                            float f2111111 = f46934g1;
                            Paint paint14 = paint;
                            i14 = 2;
                            c10 = 0;
                            canvas.drawRect(f2111111, f211119, i10 + i12, f2111110, paint14);
                            canvas2 = canvas;
                            canvas2.drawRect(i11 - i12, f211119, getMeasuredWidth() - f2111111, f2111110, paint14);
                            f11 = f19;
                        } else {
                            i13 = i22;
                        }
                        if (this.f46985u0 == 2) {
                            return;
                        }
                        float f2111112 = i25;
                        float f2111113 = i23;
                        float f2111114 = f46934g1;
                        Paint paint15 = paint;
                        i14 = 2;
                        c10 = 0;
                        canvas.drawRect(f2111114, f2111112, i10 + i12, f2111113, paint15);
                        canvas2 = canvas;
                        canvas2.drawRect(i11 - i12, f2111112, getMeasuredWidth() - f2111114, f2111113, paint15);
                        f11 = f19;
                    }
                    if (z11) {
                        i20 = this.f46985u0;
                        if (i20 == 2) {
                            float f2111115 = this.f46992y0;
                            tf.j jVar13 = this.f46986v0;
                            float f2111116 = (jVar13.f48214c * f2111115) + f19;
                            paint2.setAlpha((int) ((1.0f - jVar13.f48216f) * 255.0f));
                            canvas.save();
                            i13 = i22;
                            canvas.clipRect(f19, i25, getMeasuredWidth() - f19, i23);
                            canvas.scale((this.f46986v0.f48216f * 2.0f) + 1.0f, 1.0f, f2111116, ((i23 - i25) + i25) >> 1);
                            canvas.drawBitmap(this.f46974l0, f19, (getMeasuredHeight() - i13) - i24, paint2);
                            canvas.restore();
                        } else {
                            paint = paint;
                            i13 = i22;
                            if (i20 == 1) {
                                float f2111117 = ((i23 - i25) + i25) >> 1;
                                f13 = this.f46992y0;
                                tf.j jVar14 = this.f46986v0;
                                f14 = jVar14.f48214c;
                                f15 = f13 * f14;
                                float f2111118 = f15 + f19;
                                if (f14 <= 0.5f) {
                                    f15 = (1.0f - f14) * f13;
                                }
                                float f2111119 = f15 * jVar14.f48216f;
                                canvas.save();
                                canvas.clipRect(f2111118 - f2111119, i25, f2111119 + f2111118, i23);
                                paint2.setAlpha((int) (this.f46986v0.f48216f * 255.0f));
                                canvas.scale(this.f46986v0.f48216f, 1.0f, f2111118, f2111117);
                                canvas.drawBitmap(this.f46974l0, f19, (getMeasuredHeight() - i13) - i24, paint2);
                                canvas.restore();
                            } else {
                                paint2.setAlpha((int) (f12 * 255.0f));
                                canvas.drawBitmap(this.f46974l0, f19, (getMeasuredHeight() - i13) - i24, paint2);
                            }
                        }
                        if (this.f46985u0 == 2) {
                            return;
                        }
                        float f21111110 = i25;
                        float f21111111 = i23;
                        float f21111112 = f46934g1;
                        Paint paint16 = paint;
                        i14 = 2;
                        c10 = 0;
                        canvas.drawRect(f21111112, f21111110, i10 + i12, f21111111, paint16);
                        canvas2 = canvas;
                        canvas2.drawRect(i11 - i12, f21111110, getMeasuredWidth() - f21111112, f21111111, paint16);
                        f11 = f19;
                    } else {
                        i13 = i22;
                    }
                    if (this.f46985u0 == 2) {
                        return;
                    }
                    float f21111113 = i25;
                    float f21111114 = i23;
                    float f21111115 = f46934g1;
                    Paint paint17 = paint;
                    i14 = 2;
                    c10 = 0;
                    canvas.drawRect(f21111115, f21111113, i10 + i12, f21111114, paint17);
                    canvas2 = canvas;
                    canvas2.drawRect(i11 - i12, f21111113, getMeasuredWidth() - f21111115, f21111114, paint17);
                    f11 = f19;
                }
            } else {
                f12 = f10;
            }
            z10 = false;
            if (z10) {
                canvas.save();
                z11 = z10;
                canvas.clipRect(f19, (getMeasuredHeight() - i22) - i24, getMeasuredWidth() - f19, getMeasuredHeight() - i22);
                canvas.translate(f19, (getMeasuredHeight() - i22) - i24);
                n(canvas);
                canvas.restore();
            } else {
                z11 = z10;
                if (this.D) {
                    this.f46974l0.eraseColor(0);
                    n(this.m0);
                    this.D = false;
                }
                if (z11) {
                    i20 = this.f46985u0;
                    if (i20 == 2) {
                        float f21111116 = this.f46992y0;
                        tf.j jVar15 = this.f46986v0;
                        float f21111117 = (jVar15.f48214c * f21111116) + f19;
                        paint2.setAlpha((int) ((1.0f - jVar15.f48216f) * 255.0f));
                        canvas.save();
                        i13 = i22;
                        canvas.clipRect(f19, i25, getMeasuredWidth() - f19, i23);
                        canvas.scale((this.f46986v0.f48216f * 2.0f) + 1.0f, 1.0f, f21111117, ((i23 - i25) + i25) >> 1);
                        canvas.drawBitmap(this.f46974l0, f19, (getMeasuredHeight() - i13) - i24, paint2);
                        canvas.restore();
                    } else {
                        paint = paint;
                        i13 = i22;
                        if (i20 == 1) {
                            float f21111118 = ((i23 - i25) + i25) >> 1;
                            f13 = this.f46992y0;
                            tf.j jVar16 = this.f46986v0;
                            f14 = jVar16.f48214c;
                            f15 = f13 * f14;
                            float f21111119 = f15 + f19;
                            if (f14 <= 0.5f) {
                                f15 = (1.0f - f14) * f13;
                            }
                            float f21111120 = f15 * jVar16.f48216f;
                            canvas.save();
                            canvas.clipRect(f21111119 - f21111120, i25, f21111120 + f21111119, i23);
                            paint2.setAlpha((int) (this.f46986v0.f48216f * 255.0f));
                            canvas.scale(this.f46986v0.f48216f, 1.0f, f21111119, f21111118);
                            canvas.drawBitmap(this.f46974l0, f19, (getMeasuredHeight() - i13) - i24, paint2);
                            canvas.restore();
                        } else {
                            paint2.setAlpha((int) (f12 * 255.0f));
                            canvas.drawBitmap(this.f46974l0, f19, (getMeasuredHeight() - i13) - i24, paint2);
                        }
                    }
                    if (this.f46985u0 == 2) {
                        return;
                    }
                    float f211111110 = i25;
                    float f211111111 = i23;
                    float f211111112 = f46934g1;
                    Paint paint18 = paint;
                    i14 = 2;
                    c10 = 0;
                    canvas.drawRect(f211111112, f211111110, i10 + i12, f211111111, paint18);
                    canvas2 = canvas;
                    canvas2.drawRect(i11 - i12, f211111110, getMeasuredWidth() - f211111112, f211111111, paint18);
                    f11 = f19;
                } else {
                    i13 = i22;
                }
                if (this.f46985u0 == 2) {
                    return;
                }
                float f211111113 = i25;
                float f211111114 = i23;
                float f211111115 = f46934g1;
                Paint paint19 = paint;
                i14 = 2;
                c10 = 0;
                canvas.drawRect(f211111115, f211111113, i10 + i12, f211111114, paint19);
                canvas2 = canvas;
                canvas2.drawRect(i11 - i12, f211111113, getMeasuredWidth() - f211111115, f211111114, paint19);
                f11 = f19;
            }
            if (z11) {
                i20 = this.f46985u0;
                if (i20 == 2) {
                    float f211111116 = this.f46992y0;
                    tf.j jVar17 = this.f46986v0;
                    float f211111117 = (jVar17.f48214c * f211111116) + f19;
                    paint2.setAlpha((int) ((1.0f - jVar17.f48216f) * 255.0f));
                    canvas.save();
                    i13 = i22;
                    canvas.clipRect(f19, i25, getMeasuredWidth() - f19, i23);
                    canvas.scale((this.f46986v0.f48216f * 2.0f) + 1.0f, 1.0f, f211111117, ((i23 - i25) + i25) >> 1);
                    canvas.drawBitmap(this.f46974l0, f19, (getMeasuredHeight() - i13) - i24, paint2);
                    canvas.restore();
                } else {
                    paint = paint;
                    i13 = i22;
                    if (i20 == 1) {
                        float f211111118 = ((i23 - i25) + i25) >> 1;
                        f13 = this.f46992y0;
                        tf.j jVar18 = this.f46986v0;
                        f14 = jVar18.f48214c;
                        f15 = f13 * f14;
                        float f211111119 = f15 + f19;
                        if (f14 <= 0.5f) {
                            f15 = (1.0f - f14) * f13;
                        }
                        float f21111121 = f15 * jVar18.f48216f;
                        canvas.save();
                        canvas.clipRect(f211111119 - f21111121, i25, f21111121 + f211111119, i23);
                        paint2.setAlpha((int) (this.f46986v0.f48216f * 255.0f));
                        canvas.scale(this.f46986v0.f48216f, 1.0f, f211111119, f211111118);
                        canvas.drawBitmap(this.f46974l0, f19, (getMeasuredHeight() - i13) - i24, paint2);
                        canvas.restore();
                    } else {
                        paint2.setAlpha((int) (f12 * 255.0f));
                        canvas.drawBitmap(this.f46974l0, f19, (getMeasuredHeight() - i13) - i24, paint2);
                    }
                }
                if (this.f46985u0 == 2) {
                    return;
                }
                float f2111111110 = i25;
                float f2111111111 = i23;
                float f2111111112 = f46934g1;
                Paint paint110 = paint;
                i14 = 2;
                c10 = 0;
                canvas.drawRect(f2111111112, f2111111110, i10 + i12, f2111111111, paint110);
                canvas2 = canvas;
                canvas2.drawRect(i11 - i12, f2111111110, getMeasuredWidth() - f2111111112, f2111111111, paint110);
                f11 = f19;
            } else {
                i13 = i22;
            }
            if (this.f46985u0 == 2) {
                return;
            }
            float f2111111113 = i25;
            float f2111111114 = i23;
            float f2111111115 = f46934g1;
            Paint paint111 = paint;
            i14 = 2;
            c10 = 0;
            canvas.drawRect(f2111111115, f2111111113, i10 + i12, f2111111114, paint111);
            canvas2 = canvas;
            canvas2.drawRect(i11 - i12, f2111111113, getMeasuredWidth() - f2111111115, f2111111114, paint111);
            f11 = f19;
        } else {
            i13 = i22;
            i12 = i12;
            i14 = 2;
            c10 = 0;
            canvas2 = canvas;
            f11 = f19;
            canvas2.drawRect(f11, i25, getMeasuredWidth() - f19, i23, paint);
        }
        canvas2.drawBitmap(this.f46952a.a(i24, (int) (getMeasuredWidth() - (f11 * 2.0f))), f11, (getMeasuredHeight() - i13) - i24, paint2);
        if (this.f46961d0 != null) {
            rect = this.R;
            rect.set(i10, i25, i11, i23);
            jVar.f47007j.set(rect);
            int i210 = rect.left;
            int i310 = rect.top;
            int i311 = f46948v1;
            float f36 = rect.bottom + i311;
            float f37 = f46944r1;
            Path path2 = this.S;
            b(path2, i210, i310 - i311, i210 + i12, f36, f37, f37, true, false, false, true);
            Paint paint112 = this.M;
            canvas2.drawPath(path2, paint112);
            int i312 = rect.right;
            b(path2, i312 - i12, rect.top - i311, i312, rect.bottom + i311, f37, f37, false, true, true, false);
            canvas2.drawPath(path2, paint112);
            float f38 = rect.left + i12;
            int i313 = rect.bottom;
            canvas2.drawRect(f38, i313, rect.right - i12, i313 + i311, paint112);
            float f39 = rect.left + i12;
            int i314 = rect.top;
            canvas.drawRect(f39, i314 - i311, rect.right - i12, i314, paint112);
            int i315 = rect.left;
            int i316 = f46945s1;
            float fCenterY3 = rect.centerY() - i316;
            float f310 = rect.left + i316;
            float fCenterY4 = rect.centerY() + i316;
            Paint paint113 = this.Q;
            canvas.drawLine(i315 + i316, fCenterY3, f310, fCenterY4, paint113);
            canvas.drawLine(rect.right - i316, rect.centerY() - i316, rect.right - i316, rect.centerY() + i316, paint113);
            hVarArr = jVar.f47011n;
            hVar = hVarArr[c10];
            if (hVar == null) {
                i15 = 1;
                hVar2 = hVarArr[1];
                if (hVar2 != null) {
                    hVar2 = null;
                } else {
                    hVar2 = null;
                }
            } else {
                i15 = 1;
                hVar2 = hVarArr[1];
                if (hVar2 != null) {
                    hVar2 = null;
                } else {
                    hVar2 = null;
                }
            }
            int i317 = rect.bottom;
            int i318 = rect.top;
            i16 = (i317 - i318) >> i15;
            i17 = i318 + i16;
            if (hVar2 == null) {
                if (hVar == null) {
                    hVar3 = hVarArr[i15];
                    if (hVar3 != null) {
                        hVar3 = null;
                    } else {
                        hVar3 = null;
                    }
                } else {
                    hVar3 = hVarArr[i15];
                    if (hVar3 != null) {
                        hVar3 = null;
                    } else {
                        hVar3 = null;
                    }
                }
                hVar = hVar != null ? null : null;
                paint3 = this.P;
                i18 = f46947u1;
                i19 = f46946t1;
                if (hVar3 != null) {
                    canvas.drawCircle(rect.left + i19, i17, (i16 * hVar3.f46998f) - i18, paint3);
                }
                if (hVar != null) {
                    canvas.drawCircle(rect.right - i19, i17, (i16 * hVar.f46998f) - i18, paint3);
                }
            }
            Rect rect3 = jVar.h;
            int i319 = f46940n1;
            int i43 = i319 >> 1;
            rect3.set(i10 - i319, i25, i10 + i43, i23);
            jVar.f47006i.set(i11 - i43, i25, i11 + i319, i23);
        }
    }

    public abstract void n(Canvas canvas);

    public void o(Canvas canvas) {
        sf.b bVar;
        int i10 = this.f46977o0;
        if (i10 < 0 || !this.f46979q0 || (bVar = this.f46961d0) == null) {
            return;
        }
        int i11 = (int) (this.f46980r * this.f46981r0);
        float f10 = this.B0;
        j jVar = this.f46959c0;
        float f11 = jVar.f47009l;
        float f12 = jVar.f47008k;
        float f13 = f10 / (f11 - f12);
        float f14 = (f12 * f13) - f46934g1;
        float[] fArr = bVar.f47882b;
        if (i10 >= fArr.length) {
            return;
        }
        float f15 = (fArr[i10] * f13) - f14;
        Paint paint = this.I;
        paint.setAlpha(i11);
        canvas.drawLine(f15, 0.0f, f15, this.D0.bottom, paint);
        if (!this.f46963e) {
            return;
        }
        ArrayList arrayList = this.d;
        this.f46971i0 = arrayList.size();
        int i12 = 0;
        while (true) {
            this.f46972j0 = i12;
            int i13 = this.f46972j0;
            if (i13 >= this.f46971i0) {
                return;
            }
            tf.f fVar = (tf.f) arrayList.get(i13);
            boolean z10 = fVar.f48206n;
            Paint paint2 = fVar.d;
            if (z10 || fVar.f48207o != 0.0f) {
                float f16 = fVar.f48195a.f47874a[this.f46977o0];
                float f17 = this.f46987w;
                float measuredHeight = (getMeasuredHeight() - this.f46982s) - (((f16 - f17) / (this.v - f17)) * ((getMeasuredHeight() - this.f46982s) - f46937j1));
                paint2.setAlpha((int) (fVar.f48207o * 255.0f * this.f46981r0));
                int i14 = (int) (fVar.f48207o * 255.0f * this.f46981r0);
                Paint paint3 = this.O;
                paint3.setAlpha(i14);
                canvas.drawPoint(f15, measuredHeight, paint2);
                canvas.drawPoint(f15, measuredHeight, paint3);
            }
            i12 = this.f46972j0 + 1;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.f46983s0) {
            super.onDraw(canvas);
            return;
        }
        F();
        int iSave = canvas.save();
        RectF rectF = this.D0;
        canvas.clipRect(0.0f, rectF.top, getMeasuredWidth(), rectF.bottom);
        i(canvas);
        ArrayList arrayList = this.f46955b;
        this.f46971i0 = arrayList.size();
        int i10 = 0;
        this.f46972j0 = 0;
        while (true) {
            int i11 = this.f46972j0;
            if (i11 >= this.f46971i0) {
                break;
            }
            l(canvas, (tf.d) arrayList.get(i11));
            this.f46972j0++;
        }
        k(canvas);
        while (true) {
            this.f46972j0 = i10;
            int i12 = this.f46972j0;
            if (i12 >= this.f46971i0) {
                canvas.restoreToCount(iSave);
                j(canvas);
                m(canvas);
                o(canvas);
                super.onDraw(canvas);
                return;
            }
            p(canvas, (tf.d) arrayList.get(i12));
            i10 = this.f46972j0 + 1;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.E) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.displaySize.y - AndroidUtilities.dp(56.0f));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i10));
        }
        int measuredWidth = getMeasuredWidth();
        int i12 = this.T0;
        int i13 = this.f46990x0;
        if (measuredWidth != i12 || getMeasuredHeight() != this.U0) {
            this.T0 = getMeasuredWidth();
            this.U0 = getMeasuredHeight();
            float measuredWidth2 = getMeasuredWidth();
            float f10 = f46934g1;
            float f11 = 2.0f * f10;
            this.f46974l0 = Bitmap.createBitmap((int) (measuredWidth2 - f11), i13, Bitmap.Config.ARGB_4444);
            this.m0 = new Canvas(this.f46974l0);
            this.f46952a.a(i13, (int) (getMeasuredWidth() - f11));
            w();
            if (this.f46979q0) {
                x((this.C0 * this.f46959c0.f47008k) - f10);
            }
            A(false, true, false);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int measuredHeight = getMeasuredHeight();
            int i14 = f46939m1;
            this.V0.set(0, measuredHeight - ((i13 + i14) + i14), getMeasuredWidth(), getMeasuredHeight());
            setSystemGestureExclusionRects(this.W0);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        h hVar;
        h hVar2;
        long jS;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        if (this.f46961d0 != null) {
            boolean z10 = this.F;
            j jVar = this.f46959c0;
            if (!z10) {
                jVar.c(motionEvent.getActionIndex(), motionEvent);
                getParent().requestDisallowInterceptTouchEvent(false);
                this.f46976n0 = false;
                return false;
            }
            int x8 = (int) motionEvent.getX(motionEvent.getActionIndex());
            int y10 = (int) motionEvent.getY(motionEvent.getActionIndex());
            int actionMasked = motionEvent.getActionMasked();
            RectF rectF = this.D0;
            if (actionMasked == 0) {
                this.f46960c1 = System.currentTimeMillis();
                getParent().requestDisallowInterceptTouchEvent(true);
                if (!jVar.a(x8, y10, motionEvent.getActionIndex())) {
                    this.Y0 = x8;
                    this.f46954a1 = x8;
                    this.Z0 = y10;
                    this.f46957b1 = y10;
                    if (rectF.contains(x8, y10)) {
                        if (this.f46977o0 < 0 || !this.f46965e1) {
                            this.f46976n0 = true;
                            C(x8, y10);
                            return true;
                        }
                    }
                }
                return true;
            }
            if (actionMasked == 1) {
                if (!jVar.c(motionEvent.getActionIndex(), motionEvent)) {
                    if (rectF.contains(this.f46954a1, this.f46957b1) && !this.f46976n0) {
                        c(false);
                    }
                    h[] hVarArr = jVar.f47011n;
                    hVar = hVarArr[0];
                    if (hVar != null && (valueAnimator2 = hVar.f46997e) != null) {
                        valueAnimator2.cancel();
                    }
                    hVar2 = hVarArr[1];
                    if (hVar2 != null && (valueAnimator = hVar2.f46997e) != null) {
                        valueAnimator.cancel();
                    }
                    hVarArr[0] = null;
                    hVarArr[1] = null;
                    I();
                    getParent().requestDisallowInterceptTouchEvent(false);
                    this.f46976n0 = false;
                    y();
                    invalidate();
                    if (this.L0) {
                        jS = s(this.B, this.C);
                    } else {
                        jS = 0;
                    }
                    E(r(this.B, this.C), jS, true, true, false);
                    return true;
                }
            } else if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        return jVar.a(x8, y10, motionEvent.getActionIndex());
                    }
                    if (actionMasked == 6) {
                        jVar.c(motionEvent.getActionIndex(), motionEvent);
                        return true;
                    }
                }
                if (!jVar.c(motionEvent.getActionIndex(), motionEvent)) {
                    if (rectF.contains(this.f46954a1, this.f46957b1)) {
                        c(false);
                    }
                    h[] hVarArr2 = jVar.f47011n;
                    hVar = hVarArr2[0];
                    if (hVar != null) {
                        valueAnimator2.cancel();
                    }
                    hVar2 = hVarArr2[1];
                    if (hVar2 != null) {
                        valueAnimator.cancel();
                    }
                    hVarArr2[0] = null;
                    hVarArr2[1] = null;
                    I();
                    getParent().requestDisallowInterceptTouchEvent(false);
                    this.f46976n0 = false;
                    y();
                    invalidate();
                    if (this.L0) {
                        jS = s(this.B, this.C);
                    } else {
                        jS = 0;
                    }
                    E(r(this.B, this.C), jS, true, true, false);
                    return true;
                }
            } else {
                int i10 = x8 - this.Y0;
                int i11 = y10 - this.Z0;
                if (jVar.f47011n[0] != null || jVar.f47002c) {
                    boolean zB = jVar.b(x8, motionEvent.getActionIndex());
                    if (motionEvent.getPointerCount() > 1) {
                        int x10 = (int) motionEvent.getX(1);
                        motionEvent.getY(1);
                        jVar.b(x10, 1);
                    }
                    getParent().requestDisallowInterceptTouchEvent(zB);
                    return true;
                }
                boolean z11 = this.f46976n0;
                int i12 = this.f46988w0;
                if (z11) {
                    boolean z12 = (this.f46962d1 && System.currentTimeMillis() - this.f46960c1 > 200) || Math.abs(i10) > Math.abs(i11) || Math.abs(i11) < i12;
                    this.Y0 = x8;
                    this.Z0 = y10;
                    getParent().requestDisallowInterceptTouchEvent(z12);
                    C(x8, y10);
                    return true;
                }
                if (rectF.contains(this.f46954a1, this.f46957b1)) {
                    int i13 = this.f46954a1 - x8;
                    int i14 = this.f46957b1 - y10;
                    if (Math.sqrt((i14 * i14) + (i13 * i13)) > i12 || System.currentTimeMillis() - this.f46960c1 > 200) {
                        this.f46976n0 = true;
                        C(x8, y10);
                        return true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public void p(Canvas canvas, tf.d dVar) {
        float f10;
        TextPaint textPaint;
        tf.d dVar2;
        long[] jArr = dVar.f48178a;
        int length = jArr.length;
        float f11 = 1.0f;
        if (length > 2) {
            float f12 = (jArr[1] - jArr[0]) / (this.v - this.f46987w);
            if (f12 < 0.1d) {
                f10 = f12 / 0.1f;
            } else {
                f10 = 1.0f;
            }
        } else {
            f10 = 1.0f;
        }
        int i10 = this.f46985u0;
        if (i10 == 2) {
            f11 = 1.0f - this.f46986v0.f48216f;
        } else if (i10 == 1 || i10 == 3) {
            f11 = this.f46986v0.f48216f;
        }
        this.H.setAlpha((int) ((this.f46975n / 255.0f) * dVar.f48182f * f11 * f10));
        int iC = (int) com.google.android.recaptcha.internal.a.C(dVar.f48182f, this.f46966f, f11, f10);
        TextPaint textPaint2 = this.J;
        textPaint2.setAlpha(iC);
        int iC2 = (int) com.google.android.recaptcha.internal.a.C(dVar.f48182f, this.f46966f, f11, f10);
        TextPaint textPaint3 = this.K;
        textPaint3.setAlpha(iC2);
        int measuredHeight = getMeasuredHeight() - this.f46982s;
        int i11 = f46937j1;
        int i12 = measuredHeight - i11;
        int textSize = (int) (i11 - textPaint2.getTextSize());
        int i13 = 1 ^ (this.L0 ? 1 : 0);
        while (i13 < length) {
            float measuredHeight2 = getMeasuredHeight() - this.f46982s;
            float f13 = dVar.f48178a[i13];
            float f14 = this.f46987w;
            float f15 = ((int) (measuredHeight2 - (((f13 - f14) / (this.v - f14)) * i12))) - textSize;
            float f16 = f46934g1;
            tf.d dVar3 = dVar;
            int i14 = i13;
            Canvas canvas2 = canvas;
            dVar3.a(canvas2, 0, i14, f16, f15, textPaint2);
            if (dVar3.f48180c != null) {
                float measuredWidth = getMeasuredWidth() - f16;
                textPaint = textPaint3;
                dVar2 = dVar3;
                dVar2.a(canvas2, 1, i14, measuredWidth, f15, textPaint);
            } else {
                textPaint = textPaint3;
                dVar2 = dVar3;
            }
            i13 = i14 + 1;
            dVar = dVar2;
            canvas = canvas2;
            textPaint3 = textPaint;
        }
    }

    public long r(int i10, int i11) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        long j10 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            if (((tf.f) arrayList.get(i12)).f48206n) {
                long jRMaxQ = ((tf.f) arrayList.get(i12)).f48195a.f47875b.rMaxQ(i10, i11);
                if (jRMaxQ > j10) {
                    j10 = jRMaxQ;
                }
            }
        }
        return j10;
    }

    public long s(int i10, int i11) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        long j10 = Long.MAX_VALUE;
        for (int i12 = 0; i12 < size; i12++) {
            if (((tf.f) arrayList.get(i12)).f48206n) {
                long jRMinQ = ((tf.f) arrayList.get(i12)).f48195a.f47875b.rMinQ(i10, i11);
                if (jRMinQ < j10) {
                    j10 = jRMinQ;
                }
            }
        }
        return j10;
    }

    public void setDateSelectionListener(e eVar) {
        this.M0 = eVar;
    }

    public void setHeader(tf.c cVar) {
        this.f46968f1 = cVar;
    }

    public void setLandscape(boolean z10) {
        this.E = z10;
    }

    public void t() {
        this.H.setStrokeWidth(1.0f);
        this.I.setStrokeWidth(f46935h1);
        TextPaint textPaint = this.J;
        float f10 = f46936i1;
        textPaint.setTextSize(f10);
        TextPaint textPaint2 = this.K;
        textPaint2.setTextSize(f10);
        textPaint2.setTextAlign(Paint.Align.RIGHT);
        TextPaint textPaint3 = this.L;
        textPaint3.setTextSize(f10);
        textPaint3.setTextAlign(Paint.Align.CENTER);
        float fDpf2 = AndroidUtilities.dpf2(6.0f);
        Paint paint = this.O;
        paint.setStrokeWidth(fDpf2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        setLayerType(2, null);
        setWillNotDraw(false);
        tf.e eVarG = g();
        this.f46978p0 = eVarG;
        eVarG.setVisibility(8);
        Paint paint2 = this.Q;
        paint2.setColor(-1);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(3.0f));
        paint2.setStrokeCap(cap);
        G();
    }

    public void u() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            tf.f fVar = (tf.f) obj;
            boolean z10 = fVar.f48206n;
            sf.a aVar = fVar.f48195a;
            if (z10) {
                long j10 = aVar.f47877e;
                if (j10 > this.f46967f0) {
                    this.f46967f0 = j10;
                }
            }
            if (z10) {
                long j11 = aVar.f47878f;
                if (j11 < this.f46969g0) {
                    this.f46969g0 = j11;
                }
            }
            float f10 = this.f46967f0;
            float f11 = this.f46969g0;
            if (f10 == f11) {
                this.f46967f0 = f10 + 1.0f;
                this.f46969g0 = f11 - 1.0f;
            }
        }
    }

    public final void v() {
        int measuredHeight = getMeasuredHeight() - this.f46982s;
        float f10 = this.f46989x;
        if (f10 == 0.0f || measuredHeight == 0) {
            return;
        }
        this.A = (f10 / measuredHeight) * f46936i1;
    }

    public final void w() {
        if (getMeasuredHeight() <= 0 || getMeasuredWidth() <= 0) {
            return;
        }
        float measuredWidth = getMeasuredWidth();
        float f10 = f46934g1;
        this.f46992y0 = measuredWidth - (2.0f * f10);
        this.f46993z0 = f10;
        float measuredWidth2 = getMeasuredWidth() - (this.E ? f46941o1 : f10);
        this.A0 = measuredWidth2;
        float f11 = measuredWidth2 - this.f46993z0;
        this.B0 = f11;
        j jVar = this.f46959c0;
        this.C0 = f11 / (jVar.f47009l - jVar.f47008k);
        I();
        this.f46982s = AndroidUtilities.dp(100.0f);
        this.D0.set(this.f46993z0 - f10, 0.0f, this.A0 + f10, getMeasuredHeight() - this.f46982s);
        if (this.f46961d0 != null) {
            this.f46973k0 = (int) (AndroidUtilities.dp(20.0f) / (this.f46992y0 / this.f46961d0.f47881a.length));
        }
        v();
    }

    public final void x(float f10) {
        int i10;
        sf.b bVar = this.f46961d0;
        if (bVar == null || (i10 = this.f46977o0) < 0) {
            return;
        }
        long[] jArr = bVar.f47881a;
        if (i10 >= jArr.length || !this.f46979q0) {
            return;
        }
        this.f46978p0.c(i10, jArr[i10], this.d, false, bVar.f47888j, bVar.h);
        this.f46978p0.setVisibility(0);
        this.f46978p0.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
        float f11 = (this.f46961d0.f47882b[this.f46977o0] * this.C0) - f10;
        float f12 = (this.f46993z0 + this.B0) / 2.0f;
        int i11 = f46946t1;
        float width = f11 > f12 ? f11 - (this.f46978p0.getWidth() + i11) : f11 + i11;
        if (width < 0.0f) {
            width = 0.0f;
        } else if (this.f46978p0.getMeasuredWidth() + width > getMeasuredWidth()) {
            width = getMeasuredWidth() - this.f46978p0.getMeasuredWidth();
        }
        this.f46978p0.setTranslationX(width);
    }

    public void z() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3;
        A(true, true, true);
        ArrayList arrayList = this.d;
        this.f46971i0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.f46972j0 = i10;
            int i11 = this.f46972j0;
            if (i11 >= this.f46971i0) {
                break;
            }
            final tf.f fVar = (tf.f) arrayList.get(i11);
            if (fVar.f48206n && (valueAnimator3 = fVar.f48201i) != null) {
                valueAnimator3.cancel();
            }
            if (!fVar.f48206n && (valueAnimator2 = fVar.h) != null) {
                valueAnimator2.cancel();
            }
            if (fVar.f48206n && fVar.f48207o != 1.0f) {
                ValueAnimator valueAnimator4 = fVar.h;
                if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                    final int i12 = 0;
                    ValueAnimator valueAnimatorE = e(fVar.f48207o, 1.0f, new ValueAnimator.AnimatorUpdateListener(this) {

                        public final g f46924b;

                        {
                            this.f46924b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                            switch (i12) {
                                case 0:
                                    g gVar = this.f46924b;
                                    gVar.getClass();
                                    fVar.f48207o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    gVar.D = true;
                                    gVar.invalidate();
                                    break;
                                default:
                                    g gVar2 = this.f46924b;
                                    gVar2.getClass();
                                    fVar.f48207o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    gVar2.D = true;
                                    gVar2.invalidate();
                                    break;
                            }
                        }
                    });
                    fVar.h = valueAnimatorE;
                    valueAnimatorE.start();
                    if (fVar.f48206n) {
                    }
                }
            } else if (fVar.f48206n && fVar.f48207o != 0.0f && ((valueAnimator = fVar.f48201i) == null || !valueAnimator.isRunning())) {
                final int i13 = 1;
                ValueAnimator valueAnimatorE2 = e(fVar.f48207o, 0.0f, new ValueAnimator.AnimatorUpdateListener(this) {

                    public final g f46924b;

                    {
                        this.f46924b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                        switch (i13) {
                            case 0:
                                g gVar = this.f46924b;
                                gVar.getClass();
                                fVar.f48207o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                gVar.D = true;
                                gVar.invalidate();
                                break;
                            default:
                                g gVar2 = this.f46924b;
                                gVar2.getClass();
                                fVar.f48207o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                gVar2.D = true;
                                gVar2.invalidate();
                                break;
                        }
                    }
                });
                fVar.f48201i = valueAnimatorE2;
                valueAnimatorE2.start();
            }
            i10 = this.f46972j0 + 1;
        }
        K();
        if (this.f46979q0) {
            tf.e eVar = this.f46978p0;
            int i14 = this.f46977o0;
            sf.b bVar = this.f46961d0;
            eVar.c(i14, bVar.f47881a[i14], arrayList, true, bVar.f47888j, bVar.h);
        }
    }

    public void q(tf.j jVar) {
    }

    public void y() {
    }
}
