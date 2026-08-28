package qf;

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
import org.telegram.messenger.l0;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.su0;
import org.telegram.ui.c91;
import org.telegram.ui.dl0;
import org.telegram.ui.te1;
public abstract class g extends View implements i {
    public static final float f46175g1 = AndroidUtilities.dpf2(16.0f);
    public static final float f46176h1 = AndroidUtilities.dpf2(1.5f);
    public static final float f46177i1 = AndroidUtilities.dpf2(12.0f);
    public static final int f46178j1 = AndroidUtilities.dp(18.0f);
    public static final int f46179k1 = AndroidUtilities.dp(14.0f);
    public static final int l1 = AndroidUtilities.dp(10.0f);
    public static final int f46180m1 = AndroidUtilities.dp(16.0f);
    public static final int f46181n1 = AndroidUtilities.dp(24.0f);
    public static final int f46182o1 = AndroidUtilities.dp(16.0f);
    public static final int f46183p1 = AndroidUtilities.dp(10.0f);
    public static final int f46184q1 = AndroidUtilities.dp(12.0f);
    public static final int f46185r1 = AndroidUtilities.dp(8.0f);
    public static final int f46186s1 = AndroidUtilities.dp(6.0f);
    public static final int f46187t1 = AndroidUtilities.dp(5.0f);
    public static final int f46188u1 = AndroidUtilities.dp(2.0f);
    public static final int f46189v1 = AndroidUtilities.dp(1.0f);
    public static final boolean f46190w1;
    public static final boolean f46191x1;
    public static final u1.a f46192y1;
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
    public final te1 K0;
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
    public final b6 S0;
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
    public f f46193a;
    public ValueAnimator f46194a0;
    public int f46195a1;
    public final ArrayList f46196b;
    public boolean f46197b0;
    public int f46198b1;
    public final ArrayList f46199c;
    public final j f46200c0;
    public long f46201c1;
    public final ArrayList d;
    public rf.b f46202d0;
    public boolean f46203d1;
    public boolean f46204e;
    public sf.b f46205e0;
    public boolean f46206e1;
    public float f46207f;
    public float f46208f0;
    public sf.c f46209f1;
    public float f46210g0;
    public float h;
    public float f46211h0;
    public int f46212i0;
    public int f46213j0;
    public int f46214k0;
    public Bitmap f46215l0;
    public Canvas m0;
    public int f46216n;
    public boolean f46217n0;
    public int f46218o0;
    public sf.e f46219p0;
    public boolean f46220q0;
    public int f46221r;
    public float f46222r0;
    public int f46223s;
    public boolean f46224s0;
    public boolean f46225t0;
    public int f46226u0;
    public float v;
    public sf.j f46227v0;
    public float f46228w;
    public final int f46229w0;
    public float f46230x;
    public final int f46231x0;
    public float f46232y;
    public float f46233y0;
    public float f46234z0;

    static {
        boolean z10;
        int i9 = Build.VERSION.SDK_INT;
        boolean z11 = false;
        if (i9 < 28) {
            z10 = true;
        } else {
            z10 = false;
        }
        f46190w1 = z10;
        if (i9 > 21) {
            z11 = true;
        }
        f46191x1 = z11;
        f46192y1 = new u1.a();
    }

    public g(Context context, b6 b6Var) {
        super(context);
        this.f46196b = new ArrayList(10);
        this.f46199c = new ArrayList(25);
        this.d = new ArrayList();
        this.f46204e = true;
        this.v = 250.0f;
        this.f46228w = 0.0f;
        this.f46230x = 0.0f;
        this.f46232y = 0.0f;
        this.A = 0.0f;
        this.D = true;
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
        this.f46197b0 = false;
        ?? obj = new Object();
        obj.h = new Rect();
        obj.f46247i = new Rect();
        obj.f46248j = new Rect();
        obj.f46249k = 0.7f;
        obj.f46250l = 1.0f;
        obj.f46251m = 0.1f;
        obj.f46252n = new h[]{null, null};
        obj.f46241a = this;
        this.f46200c0 = obj;
        this.f46217n0 = false;
        this.f46218o0 = -1;
        this.f46220q0 = false;
        this.f46222r0 = 0.0f;
        this.f46224s0 = false;
        this.f46225t0 = false;
        this.f46226u0 = 0;
        this.f46231x0 = AndroidUtilities.dp(46.0f);
        this.D0 = new RectF();
        this.F0 = new d(this, 0);
        this.G0 = new d(this, 1);
        this.H0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final g f46163b;

            {
                this.f46163b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        g gVar = this.f46163b;
                        gVar.getClass();
                        gVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar.invalidate();
                        return;
                    default:
                        g gVar2 = this.f46163b;
                        gVar2.getClass();
                        gVar2.f46228w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar2.invalidate();
                        return;
                }
            }
        };
        this.I0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final g f46163b;

            {
                this.f46163b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        g gVar = this.f46163b;
                        gVar.getClass();
                        gVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar.invalidate();
                        return;
                    default:
                        g gVar2 = this.f46163b;
                        gVar2.getClass();
                        gVar2.f46228w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar2.invalidate();
                        return;
                }
            }
        };
        this.J0 = new d(this, 2);
        this.K0 = new te1(this, 5);
        this.L0 = false;
        this.T0 = 0;
        this.U0 = 0;
        Rect rect = new Rect();
        this.V0 = rect;
        ArrayList arrayList = new ArrayList();
        this.W0 = arrayList;
        arrayList.add(rect);
        this.X0 = 0L;
        this.f46206e1 = false;
        this.S0 = b6Var;
        t();
        this.f46229w0 = ViewConfiguration.get(context).getScaledTouchSlop();
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
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(f46192y1);
        ofFloat.addUpdateListener(animatorUpdateListener);
        return ofFloat;
    }

    public void A(boolean z10, boolean z11, boolean z12) {
        long j10;
        if (this.f46202d0 == null) {
            return;
        }
        float f10 = this.B0;
        j jVar = this.f46200c0;
        this.C0 = f10 / (jVar.f46250l - jVar.f46249k);
        H();
        if (this.L0) {
            j10 = s(this.B, this.C);
        } else {
            j10 = 0;
        }
        E(r(this.B, this.C), j10, z10, z11, z12);
        if (this.f46220q0 && !z11) {
            c(false);
            x((this.C0 * jVar.f46249k) - f46175g1);
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

    public void C(int i9, int i10) {
        int i11 = this.f46218o0;
        rf.b bVar = this.f46202d0;
        if (bVar != null) {
            float f10 = this.C0;
            float f11 = (this.f46200c0.f46249k * f10) - f46175g1;
            float f12 = (i9 + f11) / f10;
            if (f12 < 0.0f) {
                this.f46218o0 = 0;
            } else if (f12 > 1.0f) {
                this.f46218o0 = bVar.f47160a.length - 1;
            } else {
                int b10 = bVar.b(f12, this.B, this.C);
                this.f46218o0 = b10;
                int i12 = b10 + 1;
                float[] fArr = this.f46202d0.f47161b;
                if (i12 < fArr.length) {
                    if (Math.abs(this.f46202d0.f47161b[this.f46218o0 + 1] - f12) < Math.abs(fArr[b10] - f12)) {
                        this.f46218o0++;
                    }
                }
            }
            int i13 = this.f46218o0;
            int i14 = this.C;
            if (i13 > i14) {
                this.f46218o0 = i14;
            }
            int i15 = this.f46218o0;
            int i16 = this.B;
            if (i15 < i16) {
                this.f46218o0 = i16;
            }
            if (i11 != this.f46218o0) {
                this.f46220q0 = true;
                c(true);
                x(f11);
                e eVar = this.M0;
                if (eVar != null) {
                    getSelectedDate();
                    c91 c91Var = (c91) ((dl0) eVar).f37560b;
                    c91Var.f();
                    c91Var.f37128b.f46219p0.d(false, false);
                }
                B();
                invalidate();
            }
        }
    }

    public boolean D(rf.b bVar) {
        boolean z10;
        rf.b bVar2 = this.f46202d0;
        long j10 = 0;
        j jVar = this.f46200c0;
        ArrayList arrayList = this.d;
        if (bVar2 != bVar) {
            invalidate();
            arrayList.clear();
            if (bVar != null && bVar.d != null) {
                for (int i9 = 0; i9 < bVar.d.size(); i9++) {
                    arrayList.add(h((rf.a) bVar.d.get(i9)));
                }
            }
            d();
            this.f46202d0 = bVar;
            if (bVar != null) {
                if (bVar.f47160a[0] == 0) {
                    jVar.f46249k = 0.0f;
                    jVar.f46250l = 1.0f;
                } else {
                    float minDistance = getMinDistance();
                    jVar.f46251m = minDistance;
                    float f10 = jVar.f46250l;
                    if (f10 - jVar.f46249k < minDistance) {
                        float f11 = f10 - minDistance;
                        jVar.f46249k = f11;
                        if (f11 < 0.0f) {
                            jVar.f46249k = 0.0f;
                            jVar.f46250l = 1.0f;
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
            if (this.L0) {
                j10 = s(this.B, this.C);
            }
            E(r(this.B, this.C), j10, false, false, false);
            this.f46208f0 = 0.0f;
            this.f46210g0 = 2.1474836E9f;
            u();
            int i10 = bVar.f47167j;
            if (i10 != 1 && i10 != 2) {
                this.f46219p0.setSize(arrayList.size());
            } else {
                this.f46219p0.setSize(arrayList.size() * 2);
            }
            this.D = true;
            I();
            return z10;
        }
        jVar.f46249k = 0.7f;
        jVar.f46250l = 1.0f;
        this.f46210g0 = 0.0f;
        this.f46208f0 = 0.0f;
        this.f46196b.clear();
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
        long j12;
        float f10;
        boolean z13;
        if (j10 > 100 && ((float) (j10 / 5)) % 10.0f != 0.0f) {
            j12 = ((j10 / 10) + 1) * 10;
        } else {
            j12 = j10;
        }
        if ((Math.abs(((float) (((long) Math.ceil(((float) j12) / 5.0f)) * 5)) - this.f46230x) >= this.A && j10 != 0) || ((float) j10) != this.f46232y) {
            sf.d f11 = f(this.f46202d0.f47166i, j10, j11);
            long[] jArr = f11.f47529a;
            long j13 = jArr[jArr.length - 1];
            long j14 = jArr[0];
            if (!z12) {
                float f12 = this.v - this.f46228w;
                float f13 = (float) (j13 - j14);
                float f14 = f12 / f13;
                if (f14 > 1.0f) {
                    f14 = f13 / f12;
                }
                double d = f14;
                if (d > 0.7d) {
                    f10 = 0.1f;
                } else if (d < 0.1d) {
                    f10 = 0.03f;
                } else {
                    f10 = 0.045f;
                }
                if (((float) j13) != this.f46230x) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (this.L0 && ((float) j14) != this.f46232y) {
                    z13 = true;
                }
                if (z13) {
                    AnimatorSet animatorSet = this.T;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        this.T.cancel();
                    }
                    this.P0 = this.v;
                    this.Q0 = this.f46228w;
                    this.N0 = 0.0f;
                    this.O0 = 0.0f;
                    this.R0 = f10;
                }
            }
            float f15 = (float) j13;
            this.f46230x = f15;
            float f16 = (float) j14;
            this.f46232y = f16;
            v();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.X0 < 320 && !z11) {
                return;
            }
            this.X0 = currentTimeMillis;
            ValueAnimator valueAnimator = this.U;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.U.cancel();
            }
            ArrayList arrayList = this.f46196b;
            if (!z10) {
                this.v = f15;
                this.f46228w = f16;
                arrayList.clear();
                arrayList.add(f11);
                f11.f47533f = 255;
                return;
            }
            arrayList.add(f11);
            if (z12) {
                AnimatorSet animatorSet2 = this.T;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    this.T.cancel();
                }
                this.R0 = 0.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(e(this.v, f15, this.H0));
                if (this.L0) {
                    animatorSet3.playTogether(e(this.f46228w, f16, this.I0));
                }
                this.T = animatorSet3;
                animatorSet3.start();
            }
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                sf.d dVar = (sf.d) arrayList.get(i9);
                if (dVar != f11) {
                    dVar.f47534g = dVar.f47533f;
                }
            }
            ValueAnimator e10 = e(0.0f, 255.0f, new f2.g(23, this, f11));
            this.U = e10;
            e10.addListener(new su0(16, this, f11));
            this.U.start();
        }
    }

    public final void F() {
        float f10 = this.R0;
        if (f10 != 0.0f) {
            float f11 = this.v;
            float f12 = this.f46230x;
            if (f11 != f12) {
                float f13 = this.N0 + f10;
                this.N0 = f13;
                if (f13 > 1.0f) {
                    this.N0 = 1.0f;
                    this.v = f12;
                } else {
                    float f14 = this.P0;
                    this.v = (gr.f28845g.getInterpolation(f13) * (f12 - f14)) + f14;
                }
                invalidate();
            }
            if (this.L0) {
                float f15 = this.f46228w;
                float f16 = this.f46232y;
                if (f15 != f16) {
                    float f17 = this.O0 + this.R0;
                    this.O0 = f17;
                    if (f17 > 1.0f) {
                        this.O0 = 1.0f;
                        this.f46228w = f16;
                    } else {
                        float f18 = this.Q0;
                        this.f46228w = (gr.f28845g.getInterpolation(f17) * (f16 - f18)) + f18;
                    }
                    invalidate();
                }
            }
        }
    }

    public final void G() {
        int i9;
        int i10;
        if (this.f46225t0) {
            i9 = f6.Zi;
        } else {
            i9 = f6.Yi;
        }
        b6 b6Var = this.S0;
        int v02 = f6.v0(i9, b6Var);
        TextPaint textPaint = this.J;
        textPaint.setColor(v02);
        if (this.f46225t0) {
            i10 = f6.Zi;
        } else {
            i10 = f6.Yi;
        }
        this.K.setColor(f6.v0(i10, b6Var));
        int v03 = f6.v0(f6.Yi, b6Var);
        TextPaint textPaint2 = this.L;
        textPaint2.setColor(v03);
        int v04 = f6.v0(f6.aj, b6Var);
        Paint paint = this.H;
        paint.setColor(v04);
        int v05 = f6.v0(f6.bj, b6Var);
        Paint paint2 = this.I;
        paint2.setColor(v05);
        this.M.setColor(f6.v0(f6.dj, b6Var));
        this.N.setColor(f6.v0(f6.cj, b6Var));
        this.O.setColor(f6.v0(f6.f23001d6, b6Var));
        this.P.setColor(f6.v0(f6.ej, b6Var));
        this.f46219p0.b();
        this.f46216n = paint.getAlpha();
        this.f46221r = paint2.getAlpha();
        this.f46207f = textPaint.getAlpha() / 255.0f;
        this.h = textPaint2.getAlpha() / 255.0f;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((sf.f) obj).a();
        }
        if (this.f46220q0) {
            int i12 = this.f46218o0;
            rf.b bVar = this.f46202d0;
            long[] jArr = bVar.f47160a;
            if (i12 < jArr.length) {
                this.f46219p0.c(i12, jArr[i12], arrayList, false, bVar.f47167j, bVar.h);
            }
        }
        this.D = true;
    }

    public final void H() {
        rf.b bVar = this.f46202d0;
        if (bVar == null) {
            return;
        }
        j jVar = this.f46200c0;
        int c10 = bVar.c(Math.max(jVar.f46249k, 0.0f));
        this.B = c10;
        int a2 = this.f46202d0.a(Math.min(jVar.f46250l, 1.0f), c10);
        this.C = a2;
        int i9 = this.B;
        if (a2 < i9) {
            this.C = i9;
        }
        sf.c cVar = this.f46209f1;
        if (cVar != null) {
            long[] jArr = this.f46202d0.f47160a;
            cVar.b(jArr[i9], jArr[this.C]);
        }
        I();
    }

    public final void I() {
        rf.b bVar = this.f46202d0;
        if (bVar != null) {
            float f10 = this.B0;
            if (f10 != 0.0f) {
                int i9 = (int) ((f10 / (this.C0 * bVar.f47165g)) / 6.0f);
                sf.b bVar2 = this.f46205e0;
                if (bVar2 == null || i9 >= bVar2.f47519b || i9 <= bVar2.f47520c) {
                    int highestOneBit = Integer.highestOneBit(i9) << 1;
                    sf.b bVar3 = this.f46205e0;
                    if (bVar3 == null || bVar3.f47518a != highestOneBit) {
                        ValueAnimator valueAnimator = this.V;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllListeners();
                            this.V.cancel();
                        }
                        double d = highestOneBit;
                        double d9 = 0.2d * d;
                        sf.b bVar4 = new sf.b(highestOneBit, (int) (d + d9), (int) (d - d9));
                        bVar4.d = 255;
                        sf.b bVar5 = this.f46205e0;
                        ArrayList arrayList = this.f46199c;
                        if (bVar5 == null) {
                            this.f46205e0 = bVar4;
                            bVar4.d = 255;
                            arrayList.add(bVar4);
                            return;
                        }
                        this.f46205e0 = bVar4;
                        this.f46212i0 = arrayList.size();
                        for (int i10 = 0; i10 < this.f46212i0; i10++) {
                            sf.b bVar6 = (sf.b) arrayList.get(i10);
                            bVar6.f47521e = bVar6.d;
                        }
                        arrayList.add(bVar4);
                        if (arrayList.size() > 2) {
                            arrayList.remove(0);
                        }
                        ValueAnimator duration = e(0.0f, 1.0f, new f2.g(24, this, bVar4)).setDuration(200L);
                        this.V = duration;
                        duration.addListener(new su0(17, this, bVar4));
                        this.V.start();
                    }
                }
            }
        }
    }

    public void J(rf.b bVar, long j10) {
        int length = bVar.f47160a.length;
        long j11 = j10 - (j10 % 86400000);
        long j12 = 86399999 + j11;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            long j13 = bVar.f47160a[i11];
            if (j11 > j13) {
                i9 = i11;
            }
            if (j12 > j13) {
                i10 = i11;
            }
        }
        float[] fArr = bVar.f47161b;
        float f10 = fArr[i9];
        j jVar = this.f46200c0;
        jVar.f46249k = f10;
        jVar.f46250l = fArr[i10];
    }

    public void K() {
        if (f46191x1) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j10 = Long.MAX_VALUE;
            long j11 = 0;
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                sf.f fVar = (sf.f) obj;
                boolean z10 = fVar.f47557n;
                rf.a aVar = fVar.f47546a;
                if (z10) {
                    long j12 = aVar.f47156e;
                    if (j12 > j11) {
                        j11 = j12;
                    }
                }
                if (z10) {
                    long j13 = aVar.f47157f;
                    if (j13 < j10) {
                        j10 = j13;
                    }
                }
            }
            if ((j10 != 2147483647L && ((float) j10) != 0.0f) || (j11 > 0 && ((float) j11) != this.f46211h0)) {
                this.f46211h0 = (float) j11;
                Animator animator = this.W;
                if (animator != null) {
                    animator.cancel();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(e(this.f46208f0, this.f46211h0, this.F0), e(this.f46210g0, 0.0f, this.G0));
                this.W = animatorSet;
                animatorSet.start();
            }
        }
    }

    @Override
    public void a(float f10, float f11, boolean z10) {
        rf.b bVar = this.f46202d0;
        if (bVar == null) {
            return;
        }
        if (z10) {
            int c10 = bVar.c(Math.max(f10, 0.0f));
            int a2 = this.f46202d0.a(Math.min(f11, 1.0f), c10);
            E(r(c10, a2), s(c10, a2), true, true, false);
            c(false);
            return;
        }
        H();
        invalidate();
    }

    public final void c(boolean z10) {
        float f10;
        x((this.C0 * this.f46200c0.f46249k) - f46175g1);
        if (this.f46206e1 == z10) {
            return;
        }
        this.f46206e1 = z10;
        ValueAnimator valueAnimator = this.f46194a0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f46194a0.cancel();
        }
        float f11 = this.f46222r0;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator duration = e(f11, f10, this.J0).setDuration(200L);
        this.f46194a0 = duration;
        duration.addListener(this.K0);
        this.f46194a0.start();
    }

    public final void d() {
        this.f46218o0 = -1;
        this.f46220q0 = false;
        this.f46206e1 = false;
        this.f46219p0.setVisibility(8);
        this.f46222r0 = 0.0f;
    }

    public sf.d f(int i9, long j10, long j11) {
        return new sf.d(j10, j11, this.L0, this.f46202d0.h, i9, this.J, this.K);
    }

    public sf.e g() {
        return new sf.e(getContext(), this.S0);
    }

    public long getEndDate() {
        return this.f46202d0.f47160a[this.C];
    }

    public float getMinDistance() {
        rf.b bVar = this.f46202d0;
        if (bVar == null) {
            return 0.1f;
        }
        int length = bVar.f47160a.length;
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
        int i9 = this.f46218o0;
        if (i9 < 0) {
            return -1L;
        }
        return this.f46202d0.f47160a[i9];
    }

    public long getStartDate() {
        return this.f46202d0.f47160a[this.B];
    }

    public abstract sf.f h(rf.a aVar);

    public void i(Canvas canvas) {
        int measuredHeight;
        if (this.f46202d0 != null) {
            int i9 = this.f46226u0;
            float f10 = 1.0f;
            if (i9 == 2) {
                f10 = 1.0f - this.f46227v0.f47567f;
            } else if (i9 == 1) {
                f10 = this.f46227v0.f47567f;
            } else if (i9 == 3) {
                f10 = this.f46227v0.f47567f;
            }
            Paint paint = this.H;
            paint.setAlpha((int) (this.f46216n * f10));
            TextPaint textPaint = this.J;
            textPaint.setAlpha((int) (this.f46207f * 255.0f * f10));
            this.K.setAlpha((int) (this.f46207f * 255.0f * f10));
            int textSize = (int) (f46178j1 - textPaint.getTextSize());
            float measuredHeight2 = (getMeasuredHeight() - this.f46223s) - 1;
            canvas.drawLine(this.f46234z0, measuredHeight2, this.A0, measuredHeight2, paint);
            if (this.L0) {
                return;
            }
            canvas.drawText("0", f46175g1, measuredHeight - textSize, textPaint);
        }
    }

    public void j(Canvas canvas) {
        float f10;
        int i9;
        if (this.f46202d0 != null) {
            ArrayList arrayList = this.f46199c;
            this.f46212i0 = arrayList.size();
            int i10 = this.f46226u0;
            float f11 = 1.0f;
            int i11 = 1;
            if (i10 == 2) {
                f10 = 1.0f - this.f46227v0.f47567f;
            } else if (i10 == 1) {
                f10 = this.f46227v0.f47567f;
            } else if (i10 == 3) {
                f10 = this.f46227v0.f47567f;
            } else {
                f10 = 1.0f;
            }
            char c10 = 0;
            this.f46213j0 = 0;
            while (true) {
                int i12 = this.f46213j0;
                if (i12 < this.f46212i0) {
                    int i13 = ((sf.b) arrayList.get(i12)).d;
                    int i14 = ((sf.b) arrayList.get(this.f46213j0)).f47518a;
                    if (i14 == 0) {
                        i14 = 1;
                    }
                    int i15 = this.B - this.f46214k0;
                    while (i15 % i14 != 0) {
                        i15--;
                    }
                    int i16 = this.C - this.f46214k0;
                    while (true) {
                        if (i16 % i14 == 0 && i16 >= this.f46202d0.f47160a.length - i11) {
                            break;
                        }
                        i16++;
                        i13 = i13;
                        c10 = 0;
                        f11 = 1.0f;
                        i11 = 1;
                    }
                    int i17 = this.f46214k0;
                    int i18 = i15 + i17;
                    int i19 = i16 + i17;
                    float f12 = this.C0 * this.f46200c0.f46249k;
                    float f13 = f46175g1;
                    float f14 = f12 - f13;
                    while (i18 < i19) {
                        if (i18 >= 0) {
                            long[] jArr = this.f46202d0.f47160a;
                            if (i18 < jArr.length - i11) {
                                long j10 = jArr[i18];
                                long j11 = jArr[c10];
                                i9 = i13;
                                float f15 = ((((float) (j10 - j11)) / ((float) (jArr[jArr.length - i11] - j11))) * this.C0) - f14;
                                float f16 = f15 - f46183p1;
                                if (f16 > 0.0f) {
                                    float f17 = this.B0;
                                    if (f16 <= f17 + f13) {
                                        float f18 = l1;
                                        TextPaint textPaint = this.L;
                                        if (f16 < f18) {
                                            textPaint.setAlpha((int) (i9 * l0.a(f18, f16, f18, f11) * this.h * f10));
                                        } else if (f16 > f17) {
                                            textPaint.setAlpha((int) (i9 * l0.a(f16, f17, f13, f11) * this.h * f10));
                                        } else {
                                            textPaint.setAlpha((int) (i9 * this.h * f10));
                                        }
                                        rf.b bVar = this.f46202d0;
                                        String[] strArr = bVar.f47162c;
                                        long[] jArr2 = bVar.f47160a;
                                        canvas.drawText(strArr[(int) ((jArr2[i18] - jArr2[0]) / bVar.f47168k)], f15, AndroidUtilities.dp(3.0f) + (getMeasuredHeight() - this.f46223s) + f46179k1, textPaint);
                                        i18 += i14;
                                        i13 = i9;
                                        c10 = 0;
                                        f11 = 1.0f;
                                        i11 = 1;
                                    }
                                }
                                i18 += i14;
                                i13 = i9;
                                c10 = 0;
                                f11 = 1.0f;
                                i11 = 1;
                            }
                        }
                        i9 = i13;
                        i18 += i14;
                        i13 = i9;
                        c10 = 0;
                        f11 = 1.0f;
                        i11 = 1;
                    }
                    this.f46213j0++;
                    c10 = 0;
                    f11 = 1.0f;
                    i11 = 1;
                } else {
                    return;
                }
            }
        }
    }

    public abstract void k(Canvas canvas);

    public void l(android.graphics.Canvas r12, sf.d r13) {
        throw new UnsupportedOperationException("Method not decompiled: qf.g.l(android.graphics.Canvas, sf.d):void");
    }

    public final void m(android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: qf.g.m(android.graphics.Canvas):void");
    }

    public abstract void n(Canvas canvas);

    public void o(Canvas canvas) {
        rf.b bVar;
        int i9 = this.f46218o0;
        if (i9 >= 0 && this.f46220q0 && (bVar = this.f46202d0) != null) {
            int i10 = (int) (this.f46221r * this.f46222r0);
            float f10 = this.B0;
            j jVar = this.f46200c0;
            float f11 = jVar.f46250l;
            float f12 = jVar.f46249k;
            float f13 = f10 / (f11 - f12);
            float f14 = (f12 * f13) - f46175g1;
            float[] fArr = bVar.f47161b;
            if (i9 < fArr.length) {
                float f15 = (fArr[i9] * f13) - f14;
                Paint paint = this.I;
                paint.setAlpha(i10);
                canvas.drawLine(f15, 0.0f, f15, this.D0.bottom, paint);
                if (this.f46204e) {
                    ArrayList arrayList = this.d;
                    this.f46212i0 = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        this.f46213j0 = i11;
                        int i12 = this.f46213j0;
                        if (i12 < this.f46212i0) {
                            sf.f fVar = (sf.f) arrayList.get(i12);
                            boolean z10 = fVar.f47557n;
                            Paint paint2 = fVar.d;
                            if (z10 || fVar.f47558o != 0.0f) {
                                float f16 = (float) fVar.f47546a.f47153a[this.f46218o0];
                                float f17 = this.f46228w;
                                float measuredHeight = (getMeasuredHeight() - this.f46223s) - (((f16 - f17) / (this.v - f17)) * ((getMeasuredHeight() - this.f46223s) - f46178j1));
                                paint2.setAlpha((int) (fVar.f47558o * 255.0f * this.f46222r0));
                                Paint paint3 = this.O;
                                paint3.setAlpha((int) (fVar.f47558o * 255.0f * this.f46222r0));
                                canvas.drawPoint(f15, measuredHeight, paint2);
                                canvas.drawPoint(f15, measuredHeight, paint3);
                            }
                            i11 = this.f46213j0 + 1;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.f46224s0) {
            super.onDraw(canvas);
            return;
        }
        F();
        int save = canvas.save();
        RectF rectF = this.D0;
        canvas.clipRect(0.0f, rectF.top, getMeasuredWidth(), rectF.bottom);
        i(canvas);
        ArrayList arrayList = this.f46196b;
        this.f46212i0 = arrayList.size();
        int i9 = 0;
        this.f46213j0 = 0;
        while (true) {
            int i10 = this.f46213j0;
            if (i10 >= this.f46212i0) {
                break;
            }
            l(canvas, (sf.d) arrayList.get(i10));
            this.f46213j0++;
        }
        k(canvas);
        while (true) {
            this.f46213j0 = i9;
            int i11 = this.f46213j0;
            if (i11 < this.f46212i0) {
                p(canvas, (sf.d) arrayList.get(i11));
                i9 = this.f46213j0 + 1;
            } else {
                canvas.restoreToCount(save);
                j(canvas);
                m(canvas);
                o(canvas);
                super.onDraw(canvas);
                return;
            }
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        if (!this.E) {
            setMeasuredDimension(View.MeasureSpec.getSize(i9), View.MeasureSpec.getSize(i9));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.displaySize.y - AndroidUtilities.dp(56.0f));
        }
        int measuredWidth = getMeasuredWidth();
        int i11 = this.T0;
        int i12 = this.f46231x0;
        if (measuredWidth != i11 || getMeasuredHeight() != this.U0) {
            this.T0 = getMeasuredWidth();
            this.U0 = getMeasuredHeight();
            float f10 = f46175g1;
            float f11 = 2.0f * f10;
            this.f46215l0 = Bitmap.createBitmap((int) (getMeasuredWidth() - f11), i12, Bitmap.Config.ARGB_4444);
            this.m0 = new Canvas(this.f46215l0);
            this.f46193a.a(i12, (int) (getMeasuredWidth() - f11));
            w();
            if (this.f46220q0) {
                x((this.C0 * this.f46200c0.f46249k) - f10);
            }
            A(false, true, false);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int measuredHeight = getMeasuredHeight();
            int i13 = f46180m1;
            this.V0.set(0, measuredHeight - ((i12 + i13) + i13), getMeasuredWidth(), getMeasuredHeight());
            setSystemGestureExclusionRects(this.W0);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        long j10;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean z10 = false;
        if (this.f46202d0 != null) {
            boolean z11 = this.F;
            j jVar = this.f46200c0;
            if (!z11) {
                jVar.c(motionEvent.getActionIndex(), motionEvent);
                getParent().requestDisallowInterceptTouchEvent(false);
                this.f46217n0 = false;
                return false;
            }
            int x10 = (int) motionEvent.getX(motionEvent.getActionIndex());
            int y10 = (int) motionEvent.getY(motionEvent.getActionIndex());
            int actionMasked = motionEvent.getActionMasked();
            RectF rectF = this.D0;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 5) {
                                if (actionMasked == 6) {
                                    jVar.c(motionEvent.getActionIndex(), motionEvent);
                                    return true;
                                }
                            } else {
                                return jVar.a(x10, y10, motionEvent.getActionIndex());
                            }
                        }
                    } else {
                        int i9 = x10 - this.Y0;
                        int i10 = y10 - this.Z0;
                        if (jVar.f46252n[0] == null && !jVar.f46243c) {
                            boolean z12 = this.f46217n0;
                            int i11 = this.f46229w0;
                            if (z12) {
                                if ((this.f46203d1 && System.currentTimeMillis() - this.f46201c1 > 200) || Math.abs(i9) > Math.abs(i10) || Math.abs(i10) < i11) {
                                    z10 = true;
                                }
                                this.Y0 = x10;
                                this.Z0 = y10;
                                getParent().requestDisallowInterceptTouchEvent(z10);
                                C(x10, y10);
                                return true;
                            }
                            if (rectF.contains(this.f46195a1, this.f46198b1)) {
                                int i12 = this.f46195a1 - x10;
                                int i13 = this.f46198b1 - y10;
                                if (Math.sqrt((i13 * i13) + (i12 * i12)) > i11 || System.currentTimeMillis() - this.f46201c1 > 200) {
                                    this.f46217n0 = true;
                                    C(x10, y10);
                                    return true;
                                }
                            }
                            return true;
                        }
                        boolean b10 = jVar.b(x10, motionEvent.getActionIndex());
                        if (motionEvent.getPointerCount() > 1) {
                            motionEvent.getY(1);
                            jVar.b((int) motionEvent.getX(1), 1);
                        }
                        getParent().requestDisallowInterceptTouchEvent(b10);
                        return true;
                    }
                }
                if (!jVar.c(motionEvent.getActionIndex(), motionEvent)) {
                    if (rectF.contains(this.f46195a1, this.f46198b1) && !this.f46217n0) {
                        c(false);
                    }
                    h[] hVarArr = jVar.f46252n;
                    h hVar = hVarArr[0];
                    if (hVar != null && (valueAnimator2 = hVar.f46238e) != null) {
                        valueAnimator2.cancel();
                    }
                    h hVar2 = hVarArr[1];
                    if (hVar2 != null && (valueAnimator = hVar2.f46238e) != null) {
                        valueAnimator.cancel();
                    }
                    hVarArr[0] = null;
                    hVarArr[1] = null;
                    I();
                    getParent().requestDisallowInterceptTouchEvent(false);
                    this.f46217n0 = false;
                    y();
                    invalidate();
                    if (this.L0) {
                        j10 = s(this.B, this.C);
                    } else {
                        j10 = 0;
                    }
                    E(r(this.B, this.C), j10, true, true, false);
                    return true;
                }
                return true;
            }
            this.f46201c1 = System.currentTimeMillis();
            getParent().requestDisallowInterceptTouchEvent(true);
            if (!jVar.a(x10, y10, motionEvent.getActionIndex())) {
                this.Y0 = x10;
                this.f46195a1 = x10;
                this.Z0 = y10;
                this.f46198b1 = y10;
                if (rectF.contains(x10, y10)) {
                    if (this.f46218o0 < 0 || !this.f46206e1) {
                        this.f46217n0 = true;
                        C(x10, y10);
                        return true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public void p(android.graphics.Canvas r14, sf.d r15) {
        throw new UnsupportedOperationException("Method not decompiled: qf.g.p(android.graphics.Canvas, sf.d):void");
    }

    public long r(int i9, int i10) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        long j10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            if (((sf.f) arrayList.get(i11)).f47557n) {
                long rMaxQ = ((sf.f) arrayList.get(i11)).f47546a.f47154b.rMaxQ(i9, i10);
                if (rMaxQ > j10) {
                    j10 = rMaxQ;
                }
            }
        }
        return j10;
    }

    public long s(int i9, int i10) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        long j10 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            if (((sf.f) arrayList.get(i11)).f47557n) {
                long rMinQ = ((sf.f) arrayList.get(i11)).f47546a.f47154b.rMinQ(i9, i10);
                if (rMinQ < j10) {
                    j10 = rMinQ;
                }
            }
        }
        return j10;
    }

    public void setDateSelectionListener(e eVar) {
        this.M0 = eVar;
    }

    public void setHeader(sf.c cVar) {
        this.f46209f1 = cVar;
    }

    public void setLandscape(boolean z10) {
        this.E = z10;
    }

    public void t() {
        this.H.setStrokeWidth(1.0f);
        this.I.setStrokeWidth(f46176h1);
        TextPaint textPaint = this.J;
        float f10 = f46177i1;
        textPaint.setTextSize(f10);
        TextPaint textPaint2 = this.K;
        textPaint2.setTextSize(f10);
        textPaint2.setTextAlign(Paint.Align.RIGHT);
        TextPaint textPaint3 = this.L;
        textPaint3.setTextSize(f10);
        textPaint3.setTextAlign(Paint.Align.CENTER);
        float dpf2 = AndroidUtilities.dpf2(6.0f);
        Paint paint = this.O;
        paint.setStrokeWidth(dpf2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        setLayerType(2, null);
        setWillNotDraw(false);
        sf.e g10 = g();
        this.f46219p0 = g10;
        g10.setVisibility(8);
        Paint paint2 = this.Q;
        paint2.setColor(-1);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(3.0f));
        paint2.setStrokeCap(cap);
        G();
    }

    public void u() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            sf.f fVar = (sf.f) obj;
            boolean z10 = fVar.f47557n;
            rf.a aVar = fVar.f47546a;
            if (z10) {
                long j10 = aVar.f47156e;
                if (((float) j10) > this.f46208f0) {
                    this.f46208f0 = (float) j10;
                }
            }
            if (z10) {
                long j11 = aVar.f47157f;
                if (((float) j11) < this.f46210g0) {
                    this.f46210g0 = (float) j11;
                }
            }
            float f10 = this.f46208f0;
            float f11 = this.f46210g0;
            if (f10 == f11) {
                this.f46208f0 = f10 + 1.0f;
                this.f46210g0 = f11 - 1.0f;
            }
        }
    }

    public final void v() {
        int measuredHeight = getMeasuredHeight() - this.f46223s;
        float f10 = this.f46230x;
        if (f10 != 0.0f && measuredHeight != 0) {
            this.A = (f10 / measuredHeight) * f46177i1;
        }
    }

    public final void w() {
        float f10;
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            float f11 = f46175g1;
            this.f46233y0 = getMeasuredWidth() - (2.0f * f11);
            this.f46234z0 = f11;
            float measuredWidth = getMeasuredWidth();
            if (this.E) {
                f10 = f46182o1;
            } else {
                f10 = f11;
            }
            float f12 = measuredWidth - f10;
            this.A0 = f12;
            float f13 = f12 - this.f46234z0;
            this.B0 = f13;
            j jVar = this.f46200c0;
            this.C0 = f13 / (jVar.f46250l - jVar.f46249k);
            I();
            this.f46223s = AndroidUtilities.dp(100.0f);
            this.D0.set(this.f46234z0 - f11, 0.0f, this.A0 + f11, getMeasuredHeight() - this.f46223s);
            if (this.f46202d0 != null) {
                this.f46214k0 = (int) (AndroidUtilities.dp(20.0f) / (this.f46233y0 / this.f46202d0.f47160a.length));
            }
            v();
        }
    }

    public final void x(float f10) {
        int i9;
        float f11;
        rf.b bVar = this.f46202d0;
        if (bVar != null && (i9 = this.f46218o0) >= 0) {
            long[] jArr = bVar.f47160a;
            if (i9 < jArr.length && this.f46220q0) {
                this.f46219p0.c(i9, jArr[i9], this.d, false, bVar.f47167j, bVar.h);
                this.f46219p0.setVisibility(0);
                this.f46219p0.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
                float f12 = (this.f46202d0.f47161b[this.f46218o0] * this.C0) - f10;
                int i10 = f46187t1;
                if (f12 > (this.f46234z0 + this.B0) / 2.0f) {
                    f11 = f12 - (this.f46219p0.getWidth() + i10);
                } else {
                    f11 = f12 + i10;
                }
                if (f11 < 0.0f) {
                    f11 = 0.0f;
                } else if (this.f46219p0.getMeasuredWidth() + f11 > getMeasuredWidth()) {
                    f11 = getMeasuredWidth() - this.f46219p0.getMeasuredWidth();
                }
                this.f46219p0.setTranslationX(f11);
            }
        }
    }

    public void z() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3;
        A(true, true, true);
        ArrayList arrayList = this.d;
        this.f46212i0 = arrayList.size();
        int i9 = 0;
        while (true) {
            this.f46213j0 = i9;
            int i10 = this.f46213j0;
            if (i10 >= this.f46212i0) {
                break;
            }
            final sf.f fVar = (sf.f) arrayList.get(i10);
            if (fVar.f47557n && (valueAnimator3 = fVar.f47552i) != null) {
                valueAnimator3.cancel();
            }
            if (!fVar.f47557n && (valueAnimator2 = fVar.h) != null) {
                valueAnimator2.cancel();
            }
            if (fVar.f47557n && fVar.f47558o != 1.0f) {
                ValueAnimator valueAnimator4 = fVar.h;
                if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                    ValueAnimator e10 = e(fVar.f47558o, 1.0f, new ValueAnimator.AnimatorUpdateListener(this) {
                        public final g f46165b;

                        {
                            this.f46165b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                            switch (r3) {
                                case 0:
                                    g gVar = this.f46165b;
                                    gVar.getClass();
                                    fVar.f47558o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    gVar.D = true;
                                    gVar.invalidate();
                                    return;
                                default:
                                    g gVar2 = this.f46165b;
                                    gVar2.getClass();
                                    fVar.f47558o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    gVar2.D = true;
                                    gVar2.invalidate();
                                    return;
                            }
                        }
                    });
                    fVar.h = e10;
                    e10.start();
                } else {
                    i9 = this.f46213j0 + 1;
                }
            }
            if (!fVar.f47557n && fVar.f47558o != 0.0f && ((valueAnimator = fVar.f47552i) == null || !valueAnimator.isRunning())) {
                ValueAnimator e11 = e(fVar.f47558o, 0.0f, new ValueAnimator.AnimatorUpdateListener(this) {
                    public final g f46165b;

                    {
                        this.f46165b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                        switch (r3) {
                            case 0:
                                g gVar = this.f46165b;
                                gVar.getClass();
                                fVar.f47558o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                gVar.D = true;
                                gVar.invalidate();
                                return;
                            default:
                                g gVar2 = this.f46165b;
                                gVar2.getClass();
                                fVar.f47558o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                gVar2.D = true;
                                gVar2.invalidate();
                                return;
                        }
                    }
                });
                fVar.f47552i = e11;
                e11.start();
            }
            i9 = this.f46213j0 + 1;
        }
        K();
        if (this.f46220q0) {
            sf.e eVar = this.f46219p0;
            int i11 = this.f46218o0;
            rf.b bVar = this.f46202d0;
            eVar.c(i11, bVar.f47160a[i11], arrayList, true, bVar.f47167j, bVar.h);
        }
    }

    public void q(sf.j jVar) {
    }

    public void y() {
    }
}
