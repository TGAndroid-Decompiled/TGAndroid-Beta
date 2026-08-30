package vf;

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
import org.telegram.messenger.y3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.il0;
import org.telegram.ui.q91;
import ph.j2;
public abstract class g extends View implements i {
    public static final float f45686h1 = AndroidUtilities.dpf2(16.0f);
    public static final float f45687i1 = AndroidUtilities.dpf2(1.5f);
    public static final float f45688j1 = AndroidUtilities.dpf2(12.0f);
    public static final int f45689k1 = AndroidUtilities.dp(18.0f);
    public static final int l1 = AndroidUtilities.dp(14.0f);
    public static final int f45690m1 = AndroidUtilities.dp(10.0f);
    public static final int f45691n1 = AndroidUtilities.dp(16.0f);
    public static final int f45692o1 = AndroidUtilities.dp(24.0f);
    public static final int f45693p1 = AndroidUtilities.dp(16.0f);
    public static final int f45694q1 = AndroidUtilities.dp(10.0f);
    public static final int f45695r1 = AndroidUtilities.dp(12.0f);
    public static final int f45696s1 = AndroidUtilities.dp(8.0f);
    public static final int f45697t1 = AndroidUtilities.dp(6.0f);
    public static final int f45698u1 = AndroidUtilities.dp(5.0f);
    public static final int f45699v1 = AndroidUtilities.dp(2.0f);
    public static final int f45700w1 = AndroidUtilities.dp(1.0f);
    public static final boolean f45701x1;
    public static final boolean f45702y1;
    public static final u1.a f45703z1;
    public float A0;
    public float B;
    public float B0;
    public int C;
    public float C0;
    public int D;
    public float D0;
    public boolean E;
    public final RectF E0;
    public boolean F;
    public VibrationEffect F0;
    public boolean G;
    public final d G0;
    public final Paint H;
    public final d H0;
    public final Paint I;
    public final b I0;
    public final Paint J;
    public final b J0;
    public final TextPaint K;
    public final d K0;
    public final TextPaint L;
    public final j2 L0;
    public final TextPaint M;
    public boolean M0;
    public final Paint N;
    public e N0;
    public final Paint O;
    public float O0;
    public final Paint P;
    public float P0;
    public final Paint Q;
    public float Q0;
    public final Paint R;
    public float R0;
    public final Rect S;
    public float S0;
    public final Path T;
    public final f6 T0;
    public AnimatorSet U;
    public int U0;
    public ValueAnimator V;
    public int V0;
    public ValueAnimator W;
    public final Rect W0;
    public final ArrayList X0;
    public long Y0;
    public int Z0;
    public f f45704a;
    public Animator f45705a0;
    public int f45706a1;
    public final ArrayList f45707b;
    public ValueAnimator f45708b0;
    public int f45709b1;
    public final ArrayList f45710c;
    public boolean f45711c0;
    public int f45712c1;
    public final ArrayList d;
    public final j f45713d0;
    public long f45714d1;
    public boolean e;
    public wf.b f45715e0;
    public boolean f45716e1;
    public float f45717f;
    public xf.b f45718f0;
    public boolean f45719f1;
    public float f45720g0;
    public xf.c f45721g1;
    public float h;
    public float f45722h0;
    public float f45723i0;
    public int f45724j0;
    public int f45725k0;
    public int f45726l0;
    public Bitmap m0;
    public int f45727n;
    public Canvas f45728n0;
    public boolean f45729o0;
    public int f45730p0;
    public xf.e f45731q0;
    public int f45732r;
    public boolean f45733r0;
    public int f45734s;
    public float f45735s0;
    public boolean f45736t0;
    public boolean f45737u0;
    public float v;
    public int f45738v0;
    public float f45739w;
    public xf.j f45740w0;
    public float f45741x;
    public final int f45742x0;
    public float f45743y;
    public final int f45744y0;
    public float f45745z0;

    static {
        boolean z4;
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (i10 < 28) {
            z4 = true;
        } else {
            z4 = false;
        }
        f45701x1 = z4;
        if (i10 > 21) {
            z10 = true;
        }
        f45702y1 = z10;
        f45703z1 = new u1.a();
    }

    public g(Context context, f6 f6Var) {
        super(context);
        this.f45707b = new ArrayList(10);
        this.f45710c = new ArrayList(25);
        this.d = new ArrayList();
        this.e = true;
        this.v = 250.0f;
        this.f45739w = 0.0f;
        this.f45741x = 0.0f;
        this.f45743y = 0.0f;
        this.B = 0.0f;
        this.E = true;
        this.F = false;
        this.G = true;
        this.H = new Paint();
        this.I = new Paint();
        this.J = new Paint();
        this.K = new TextPaint(1);
        this.L = new TextPaint(1);
        this.M = new TextPaint(1);
        this.N = new Paint(1);
        this.O = new Paint();
        this.P = new Paint(1);
        this.Q = new Paint(1);
        this.R = new Paint(1);
        this.S = new Rect();
        this.T = new Path();
        this.f45711c0 = false;
        ?? obj = new Object();
        obj.h = new Rect();
        obj.f45756i = new Rect();
        obj.f45757j = new Rect();
        obj.f45758k = 0.7f;
        obj.f45759l = 1.0f;
        obj.f45760m = 0.1f;
        obj.f45761n = new h[]{null, null};
        obj.f45751a = this;
        this.f45713d0 = obj;
        this.f45729o0 = false;
        this.f45730p0 = -1;
        this.f45733r0 = false;
        this.f45735s0 = 0.0f;
        this.f45736t0 = false;
        this.f45737u0 = false;
        this.f45738v0 = 0;
        this.f45744y0 = AndroidUtilities.dp(46.0f);
        this.E0 = new RectF();
        this.G0 = new d(this, 0);
        this.H0 = new d(this, 1);
        this.I0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final g f45675b;

            {
                this.f45675b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        g gVar = this.f45675b;
                        gVar.getClass();
                        gVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar.invalidate();
                        return;
                    default:
                        g gVar2 = this.f45675b;
                        gVar2.getClass();
                        gVar2.f45739w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar2.invalidate();
                        return;
                }
            }
        };
        this.J0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final g f45675b;

            {
                this.f45675b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        g gVar = this.f45675b;
                        gVar.getClass();
                        gVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar.invalidate();
                        return;
                    default:
                        g gVar2 = this.f45675b;
                        gVar2.getClass();
                        gVar2.f45739w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar2.invalidate();
                        return;
                }
            }
        };
        this.K0 = new d(this, 2);
        this.L0 = new j2(this, 11);
        this.M0 = false;
        this.U0 = 0;
        this.V0 = 0;
        Rect rect = new Rect();
        this.W0 = rect;
        ArrayList arrayList = new ArrayList();
        this.X0 = arrayList;
        arrayList.add(rect);
        this.Y0 = 0L;
        this.f45719f1 = false;
        this.T0 = f6Var;
        t();
        this.f45742x0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public static void b(Path path, float f10, float f11, float f12, float f13, float f14, float f15, boolean z4, boolean z10, boolean z11, boolean z12) {
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
        if (z10) {
            float f22 = -f15;
            path.rQuadTo(0.0f, f22, -f14, f22);
        } else {
            path.rLineTo(0.0f, -f15);
            path.rLineTo(-f14, 0.0f);
        }
        path.rLineTo(-f20, 0.0f);
        if (z4) {
            float f23 = -f14;
            path.rQuadTo(f23, 0.0f, f23, f15);
        } else {
            path.rLineTo(-f14, 0.0f);
            path.rLineTo(0.0f, f15);
        }
        path.rLineTo(0.0f, f21);
        if (z12) {
            path.rQuadTo(0.0f, f15, f14, f15);
        } else {
            path.rLineTo(0.0f, f15);
            path.rLineTo(f14, 0.0f);
        }
        path.rLineTo(f20, 0.0f);
        if (z11) {
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
        ofFloat.setInterpolator(f45703z1);
        ofFloat.addUpdateListener(animatorUpdateListener);
        return ofFloat;
    }

    public void A(boolean z4, boolean z10, boolean z11) {
        long j10;
        if (this.f45715e0 == null) {
            return;
        }
        float f10 = this.C0;
        j jVar = this.f45713d0;
        this.D0 = f10 / (jVar.f45759l - jVar.f45758k);
        H();
        if (this.M0) {
            j10 = s(this.C, this.D);
        } else {
            j10 = 0;
        }
        E(r(this.C, this.D), j10, z4, z10, z11);
        if (this.f45733r0 && !z10) {
            c(false);
            x((this.D0 * jVar.f45758k) - f45686h1);
        }
        invalidate();
    }

    public final void B() {
        if (Build.VERSION.SDK_INT >= 26) {
            Vibrator vibrator = (Vibrator) getContext().getSystemService("vibrator");
            if (this.F0 == null) {
                this.F0 = VibrationEffect.createWaveform(new long[]{0, 2}, -1);
            }
            vibrator.cancel();
            vibrator.vibrate(this.F0);
        }
    }

    public void C(int i10, int i11) {
        int i12 = this.f45730p0;
        wf.b bVar = this.f45715e0;
        if (bVar != null) {
            float f10 = this.D0;
            float f11 = (this.f45713d0.f45758k * f10) - f45686h1;
            float f12 = (i10 + f11) / f10;
            if (f12 < 0.0f) {
                this.f45730p0 = 0;
            } else if (f12 > 1.0f) {
                this.f45730p0 = bVar.f46537a.length - 1;
            } else {
                int b10 = bVar.b(f12, this.C, this.D);
                this.f45730p0 = b10;
                int i13 = b10 + 1;
                float[] fArr = this.f45715e0.f46538b;
                if (i13 < fArr.length) {
                    if (Math.abs(this.f45715e0.f46538b[this.f45730p0 + 1] - f12) < Math.abs(fArr[b10] - f12)) {
                        this.f45730p0++;
                    }
                }
            }
            int i14 = this.f45730p0;
            int i15 = this.D;
            if (i14 > i15) {
                this.f45730p0 = i15;
            }
            int i16 = this.f45730p0;
            int i17 = this.C;
            if (i16 < i17) {
                this.f45730p0 = i17;
            }
            if (i12 != this.f45730p0) {
                this.f45733r0 = true;
                c(true);
                x(f11);
                e eVar = this.N0;
                if (eVar != null) {
                    getSelectedDate();
                    q91 q91Var = (q91) ((il0) eVar).f35137b;
                    q91Var.f();
                    q91Var.f37680b.f45731q0.d(false, false);
                }
                B();
                invalidate();
            }
        }
    }

    public boolean D(wf.b bVar) {
        boolean z4;
        wf.b bVar2 = this.f45715e0;
        long j10 = 0;
        j jVar = this.f45713d0;
        ArrayList arrayList = this.d;
        if (bVar2 != bVar) {
            invalidate();
            arrayList.clear();
            if (bVar != null && bVar.d != null) {
                for (int i10 = 0; i10 < bVar.d.size(); i10++) {
                    arrayList.add(h((wf.a) bVar.d.get(i10)));
                }
            }
            d();
            this.f45715e0 = bVar;
            if (bVar != null) {
                if (bVar.f46537a[0] == 0) {
                    jVar.f45758k = 0.0f;
                    jVar.f45759l = 1.0f;
                } else {
                    float minDistance = getMinDistance();
                    jVar.f45760m = minDistance;
                    float f10 = jVar.f45759l;
                    if (f10 - jVar.f45758k < minDistance) {
                        float f11 = f10 - minDistance;
                        jVar.f45758k = f11;
                        if (f11 < 0.0f) {
                            jVar.f45758k = 0.0f;
                            jVar.f45759l = 1.0f;
                        }
                    }
                }
            }
            z4 = true;
        } else {
            z4 = false;
        }
        w();
        if (bVar != null) {
            H();
            if (this.M0) {
                j10 = s(this.C, this.D);
            }
            E(r(this.C, this.D), j10, false, false, false);
            this.f45720g0 = 0.0f;
            this.f45722h0 = 2.1474836E9f;
            u();
            int i11 = bVar.f46543j;
            if (i11 != 1 && i11 != 2) {
                this.f45731q0.setSize(arrayList.size());
            } else {
                this.f45731q0.setSize(arrayList.size() * 2);
            }
            this.E = true;
            I();
            return z4;
        }
        jVar.f45758k = 0.7f;
        jVar.f45759l = 1.0f;
        this.f45722h0 = 0.0f;
        this.f45720g0 = 0.0f;
        this.f45707b.clear();
        AnimatorSet animatorSet = this.U;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator valueAnimator = this.V;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.V.cancel();
        }
        return z4;
    }

    public final void E(long j10, long j11, boolean z4, boolean z10, boolean z11) {
        long j12;
        float f10;
        boolean z12;
        if (j10 > 100 && ((float) (j10 / 5)) % 10.0f != 0.0f) {
            j12 = ((j10 / 10) + 1) * 10;
        } else {
            j12 = j10;
        }
        if ((Math.abs(((float) (((long) Math.ceil(((float) j12) / 5.0f)) * 5)) - this.f45741x) >= this.B && j10 != 0) || ((float) j10) != this.f45743y) {
            xf.d f11 = f(this.f45715e0.f46542i, j10, j11);
            long[] jArr = f11.f46934a;
            long j13 = jArr[jArr.length - 1];
            long j14 = jArr[0];
            if (!z11) {
                float f12 = this.v - this.f45739w;
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
                if (((float) j13) != this.f45741x) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (this.M0 && ((float) j14) != this.f45743y) {
                    z12 = true;
                }
                if (z12) {
                    AnimatorSet animatorSet = this.U;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        this.U.cancel();
                    }
                    this.Q0 = this.v;
                    this.R0 = this.f45739w;
                    this.O0 = 0.0f;
                    this.P0 = 0.0f;
                    this.S0 = f10;
                }
            }
            float f15 = (float) j13;
            this.f45741x = f15;
            float f16 = (float) j14;
            this.f45743y = f16;
            v();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.Y0 < 320 && !z10) {
                return;
            }
            this.Y0 = currentTimeMillis;
            ValueAnimator valueAnimator = this.V;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.V.cancel();
            }
            ArrayList arrayList = this.f45707b;
            if (!z4) {
                this.v = f15;
                this.f45739w = f16;
                arrayList.clear();
                arrayList.add(f11);
                f11.f46937f = 255;
                return;
            }
            arrayList.add(f11);
            if (z11) {
                AnimatorSet animatorSet2 = this.U;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    this.U.cancel();
                }
                this.S0 = 0.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(e(this.v, f15, this.I0));
                if (this.M0) {
                    animatorSet3.playTogether(e(this.f45739w, f16, this.J0));
                }
                this.U = animatorSet3;
                animatorSet3.start();
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                xf.d dVar = (xf.d) arrayList.get(i10);
                if (dVar != f11) {
                    dVar.f46938g = dVar.f46937f;
                }
            }
            ValueAnimator e = e(0.0f, 255.0f, new ag.a(26, this, f11));
            this.V = e;
            e.addListener(new ex0(20, this, f11));
            this.V.start();
        }
    }

    public final void F() {
        float f10 = this.S0;
        if (f10 != 0.0f) {
            float f11 = this.v;
            float f12 = this.f45741x;
            if (f11 != f12) {
                float f13 = this.O0 + f10;
                this.O0 = f13;
                if (f13 > 1.0f) {
                    this.O0 = 1.0f;
                    this.v = f12;
                } else {
                    float f14 = this.Q0;
                    this.v = (nr.f27347g.getInterpolation(f13) * (f12 - f14)) + f14;
                }
                invalidate();
            }
            if (this.M0) {
                float f15 = this.f45739w;
                float f16 = this.f45743y;
                if (f15 != f16) {
                    float f17 = this.P0 + this.S0;
                    this.P0 = f17;
                    if (f17 > 1.0f) {
                        this.P0 = 1.0f;
                        this.f45739w = f16;
                    } else {
                        float f18 = this.R0;
                        this.f45739w = (nr.f27347g.getInterpolation(f17) * (f16 - f18)) + f18;
                    }
                    invalidate();
                }
            }
        }
    }

    public final void G() {
        int i10;
        int i11;
        if (this.f45737u0) {
            i10 = j6.Zi;
        } else {
            i10 = j6.Yi;
        }
        f6 f6Var = this.T0;
        int v02 = j6.v0(i10, f6Var);
        TextPaint textPaint = this.K;
        textPaint.setColor(v02);
        if (this.f45737u0) {
            i11 = j6.Zi;
        } else {
            i11 = j6.Yi;
        }
        this.L.setColor(j6.v0(i11, f6Var));
        int v03 = j6.v0(j6.Yi, f6Var);
        TextPaint textPaint2 = this.M;
        textPaint2.setColor(v03);
        int v04 = j6.v0(j6.aj, f6Var);
        Paint paint = this.I;
        paint.setColor(v04);
        int v05 = j6.v0(j6.bj, f6Var);
        Paint paint2 = this.J;
        paint2.setColor(v05);
        this.N.setColor(j6.v0(j6.dj, f6Var));
        this.O.setColor(j6.v0(j6.cj, f6Var));
        this.P.setColor(j6.v0(j6.f19906d6, f6Var));
        this.Q.setColor(j6.v0(j6.ej, f6Var));
        this.f45731q0.b();
        this.f45727n = paint.getAlpha();
        this.f45732r = paint2.getAlpha();
        this.f45717f = textPaint.getAlpha() / 255.0f;
        this.h = textPaint2.getAlpha() / 255.0f;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((xf.f) obj).a();
        }
        if (this.f45733r0) {
            int i13 = this.f45730p0;
            wf.b bVar = this.f45715e0;
            long[] jArr = bVar.f46537a;
            if (i13 < jArr.length) {
                this.f45731q0.c(i13, jArr[i13], arrayList, false, bVar.f46543j, bVar.h);
            }
        }
        this.E = true;
    }

    public final void H() {
        wf.b bVar = this.f45715e0;
        if (bVar == null) {
            return;
        }
        j jVar = this.f45713d0;
        int c3 = bVar.c(Math.max(jVar.f45758k, 0.0f));
        this.C = c3;
        int a2 = this.f45715e0.a(Math.min(jVar.f45759l, 1.0f), c3);
        this.D = a2;
        int i10 = this.C;
        if (a2 < i10) {
            this.D = i10;
        }
        xf.c cVar = this.f45721g1;
        if (cVar != null) {
            long[] jArr = this.f45715e0.f46537a;
            cVar.b(jArr[i10], jArr[this.D]);
        }
        I();
    }

    public final void I() {
        wf.b bVar = this.f45715e0;
        if (bVar != null) {
            float f10 = this.C0;
            if (f10 != 0.0f) {
                int i10 = (int) ((f10 / (this.D0 * bVar.f46541g)) / 6.0f);
                xf.b bVar2 = this.f45718f0;
                if (bVar2 == null || i10 >= bVar2.f46926b || i10 <= bVar2.f46927c) {
                    int highestOneBit = Integer.highestOneBit(i10) << 1;
                    xf.b bVar3 = this.f45718f0;
                    if (bVar3 == null || bVar3.f46925a != highestOneBit) {
                        ValueAnimator valueAnimator = this.W;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllListeners();
                            this.W.cancel();
                        }
                        double d = highestOneBit;
                        double d10 = 0.2d * d;
                        xf.b bVar4 = new xf.b(highestOneBit, (int) (d + d10), (int) (d - d10));
                        bVar4.d = 255;
                        xf.b bVar5 = this.f45718f0;
                        ArrayList arrayList = this.f45710c;
                        if (bVar5 == null) {
                            this.f45718f0 = bVar4;
                            bVar4.d = 255;
                            arrayList.add(bVar4);
                            return;
                        }
                        this.f45718f0 = bVar4;
                        this.f45724j0 = arrayList.size();
                        for (int i11 = 0; i11 < this.f45724j0; i11++) {
                            xf.b bVar6 = (xf.b) arrayList.get(i11);
                            bVar6.e = bVar6.d;
                        }
                        arrayList.add(bVar4);
                        if (arrayList.size() > 2) {
                            arrayList.remove(0);
                        }
                        ValueAnimator duration = e(0.0f, 1.0f, new ag.a(27, this, bVar4)).setDuration(200L);
                        this.W = duration;
                        duration.addListener(new ex0(21, this, bVar4));
                        this.W.start();
                    }
                }
            }
        }
    }

    public void J(wf.b bVar, long j10) {
        int length = bVar.f46537a.length;
        long j11 = j10 - (j10 % 86400000);
        long j12 = 86399999 + j11;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            long j13 = bVar.f46537a[i12];
            if (j11 > j13) {
                i10 = i12;
            }
            if (j12 > j13) {
                i11 = i12;
            }
        }
        float[] fArr = bVar.f46538b;
        float f10 = fArr[i10];
        j jVar = this.f45713d0;
        jVar.f45758k = f10;
        jVar.f45759l = fArr[i11];
    }

    public void K() {
        if (f45702y1) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j10 = Long.MAX_VALUE;
            long j11 = 0;
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                xf.f fVar = (xf.f) obj;
                boolean z4 = fVar.f46959n;
                wf.a aVar = fVar.f46949a;
                if (z4) {
                    long j12 = aVar.e;
                    if (j12 > j11) {
                        j11 = j12;
                    }
                }
                if (z4) {
                    long j13 = aVar.f46534f;
                    if (j13 < j10) {
                        j10 = j13;
                    }
                }
            }
            if ((j10 != 2147483647L && ((float) j10) != 0.0f) || (j11 > 0 && ((float) j11) != this.f45723i0)) {
                this.f45723i0 = (float) j11;
                Animator animator = this.f45705a0;
                if (animator != null) {
                    animator.cancel();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(e(this.f45720g0, this.f45723i0, this.G0), e(this.f45722h0, 0.0f, this.H0));
                this.f45705a0 = animatorSet;
                animatorSet.start();
            }
        }
    }

    @Override
    public void a(float f10, float f11, boolean z4) {
        wf.b bVar = this.f45715e0;
        if (bVar == null) {
            return;
        }
        if (z4) {
            int c3 = bVar.c(Math.max(f10, 0.0f));
            int a2 = this.f45715e0.a(Math.min(f11, 1.0f), c3);
            E(r(c3, a2), s(c3, a2), true, true, false);
            c(false);
            return;
        }
        H();
        invalidate();
    }

    public final void c(boolean z4) {
        float f10;
        x((this.D0 * this.f45713d0.f45758k) - f45686h1);
        if (this.f45719f1 == z4) {
            return;
        }
        this.f45719f1 = z4;
        ValueAnimator valueAnimator = this.f45708b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f45708b0.cancel();
        }
        float f11 = this.f45735s0;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator duration = e(f11, f10, this.K0).setDuration(200L);
        this.f45708b0 = duration;
        duration.addListener(this.L0);
        this.f45708b0.start();
    }

    public final void d() {
        this.f45730p0 = -1;
        this.f45733r0 = false;
        this.f45719f1 = false;
        this.f45731q0.setVisibility(8);
        this.f45735s0 = 0.0f;
    }

    public xf.d f(int i10, long j10, long j11) {
        return new xf.d(j10, j11, this.M0, this.f45715e0.h, i10, this.K, this.L);
    }

    public xf.e g() {
        return new xf.e(getContext(), this.T0);
    }

    public long getEndDate() {
        return this.f45715e0.f46537a[this.D];
    }

    public float getMinDistance() {
        wf.b bVar = this.f45715e0;
        if (bVar == null) {
            return 0.1f;
        }
        int length = bVar.f46537a.length;
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
        int i10 = this.f45730p0;
        if (i10 < 0) {
            return -1L;
        }
        return this.f45715e0.f46537a[i10];
    }

    public long getStartDate() {
        return this.f45715e0.f46537a[this.C];
    }

    public abstract xf.f h(wf.a aVar);

    public void i(Canvas canvas) {
        int measuredHeight;
        if (this.f45715e0 != null) {
            int i10 = this.f45738v0;
            float f10 = 1.0f;
            if (i10 == 2) {
                f10 = 1.0f - this.f45740w0.f46968f;
            } else if (i10 == 1) {
                f10 = this.f45740w0.f46968f;
            } else if (i10 == 3) {
                f10 = this.f45740w0.f46968f;
            }
            Paint paint = this.I;
            paint.setAlpha((int) (this.f45727n * f10));
            TextPaint textPaint = this.K;
            textPaint.setAlpha((int) (this.f45717f * 255.0f * f10));
            this.L.setAlpha((int) (this.f45717f * 255.0f * f10));
            int textSize = (int) (f45689k1 - textPaint.getTextSize());
            float measuredHeight2 = (getMeasuredHeight() - this.f45734s) - 1;
            canvas.drawLine(this.A0, measuredHeight2, this.B0, measuredHeight2, paint);
            if (this.M0) {
                return;
            }
            canvas.drawText("0", f45686h1, measuredHeight - textSize, textPaint);
        }
    }

    public void j(Canvas canvas) {
        float f10;
        int i10;
        if (this.f45715e0 != null) {
            ArrayList arrayList = this.f45710c;
            this.f45724j0 = arrayList.size();
            int i11 = this.f45738v0;
            float f11 = 1.0f;
            int i12 = 1;
            if (i11 == 2) {
                f10 = 1.0f - this.f45740w0.f46968f;
            } else if (i11 == 1) {
                f10 = this.f45740w0.f46968f;
            } else if (i11 == 3) {
                f10 = this.f45740w0.f46968f;
            } else {
                f10 = 1.0f;
            }
            char c3 = 0;
            this.f45725k0 = 0;
            while (true) {
                int i13 = this.f45725k0;
                if (i13 < this.f45724j0) {
                    int i14 = ((xf.b) arrayList.get(i13)).d;
                    int i15 = ((xf.b) arrayList.get(this.f45725k0)).f46925a;
                    if (i15 == 0) {
                        i15 = 1;
                    }
                    int i16 = this.C - this.f45726l0;
                    while (i16 % i15 != 0) {
                        i16--;
                    }
                    int i17 = this.D - this.f45726l0;
                    while (true) {
                        if (i17 % i15 == 0 && i17 >= this.f45715e0.f46537a.length - i12) {
                            break;
                        }
                        i17++;
                        i14 = i14;
                        c3 = 0;
                        f11 = 1.0f;
                        i12 = 1;
                    }
                    int i18 = this.f45726l0;
                    int i19 = i16 + i18;
                    int i20 = i17 + i18;
                    float f12 = this.D0 * this.f45713d0.f45758k;
                    float f13 = f45686h1;
                    float f14 = f12 - f13;
                    while (i19 < i20) {
                        if (i19 >= 0) {
                            long[] jArr = this.f45715e0.f46537a;
                            if (i19 < jArr.length - i12) {
                                long j10 = jArr[i19];
                                long j11 = jArr[c3];
                                i10 = i14;
                                float f15 = ((((float) (j10 - j11)) / ((float) (jArr[jArr.length - i12] - j11))) * this.D0) - f14;
                                float f16 = f15 - f45694q1;
                                if (f16 > 0.0f) {
                                    float f17 = this.C0;
                                    if (f16 <= f17 + f13) {
                                        float f18 = f45690m1;
                                        TextPaint textPaint = this.M;
                                        if (f16 < f18) {
                                            textPaint.setAlpha((int) (i10 * y3.a(f18, f16, f18, f11) * this.h * f10));
                                        } else if (f16 > f17) {
                                            textPaint.setAlpha((int) (i10 * y3.a(f16, f17, f13, f11) * this.h * f10));
                                        } else {
                                            textPaint.setAlpha((int) (i10 * this.h * f10));
                                        }
                                        wf.b bVar = this.f45715e0;
                                        String[] strArr = bVar.f46539c;
                                        long[] jArr2 = bVar.f46537a;
                                        canvas.drawText(strArr[(int) ((jArr2[i19] - jArr2[0]) / bVar.f46544k)], f15, AndroidUtilities.dp(3.0f) + (getMeasuredHeight() - this.f45734s) + l1, textPaint);
                                        i19 += i15;
                                        i14 = i10;
                                        c3 = 0;
                                        f11 = 1.0f;
                                        i12 = 1;
                                    }
                                }
                                i19 += i15;
                                i14 = i10;
                                c3 = 0;
                                f11 = 1.0f;
                                i12 = 1;
                            }
                        }
                        i10 = i14;
                        i19 += i15;
                        i14 = i10;
                        c3 = 0;
                        f11 = 1.0f;
                        i12 = 1;
                    }
                    this.f45725k0++;
                    c3 = 0;
                    f11 = 1.0f;
                    i12 = 1;
                } else {
                    return;
                }
            }
        }
    }

    public abstract void k(Canvas canvas);

    public void l(android.graphics.Canvas r12, xf.d r13) {
        throw new UnsupportedOperationException("Method not decompiled: vf.g.l(android.graphics.Canvas, xf.d):void");
    }

    public final void m(android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: vf.g.m(android.graphics.Canvas):void");
    }

    public abstract void n(Canvas canvas);

    public void o(Canvas canvas) {
        wf.b bVar;
        int i10 = this.f45730p0;
        if (i10 >= 0 && this.f45733r0 && (bVar = this.f45715e0) != null) {
            int i11 = (int) (this.f45732r * this.f45735s0);
            float f10 = this.C0;
            j jVar = this.f45713d0;
            float f11 = jVar.f45759l;
            float f12 = jVar.f45758k;
            float f13 = f10 / (f11 - f12);
            float f14 = (f12 * f13) - f45686h1;
            float[] fArr = bVar.f46538b;
            if (i10 < fArr.length) {
                float f15 = (fArr[i10] * f13) - f14;
                Paint paint = this.J;
                paint.setAlpha(i11);
                canvas.drawLine(f15, 0.0f, f15, this.E0.bottom, paint);
                if (this.e) {
                    ArrayList arrayList = this.d;
                    this.f45724j0 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        this.f45725k0 = i12;
                        int i13 = this.f45725k0;
                        if (i13 < this.f45724j0) {
                            xf.f fVar = (xf.f) arrayList.get(i13);
                            boolean z4 = fVar.f46959n;
                            Paint paint2 = fVar.d;
                            if (z4 || fVar.f46960o != 0.0f) {
                                float f16 = (float) fVar.f46949a.f46531a[this.f45730p0];
                                float f17 = this.f45739w;
                                float measuredHeight = (getMeasuredHeight() - this.f45734s) - (((f16 - f17) / (this.v - f17)) * ((getMeasuredHeight() - this.f45734s) - f45689k1));
                                paint2.setAlpha((int) (fVar.f46960o * 255.0f * this.f45735s0));
                                Paint paint3 = this.P;
                                paint3.setAlpha((int) (fVar.f46960o * 255.0f * this.f45735s0));
                                canvas.drawPoint(f15, measuredHeight, paint2);
                                canvas.drawPoint(f15, measuredHeight, paint3);
                            }
                            i12 = this.f45725k0 + 1;
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
        if (this.f45736t0) {
            super.onDraw(canvas);
            return;
        }
        F();
        int save = canvas.save();
        RectF rectF = this.E0;
        canvas.clipRect(0.0f, rectF.top, getMeasuredWidth(), rectF.bottom);
        i(canvas);
        ArrayList arrayList = this.f45707b;
        this.f45724j0 = arrayList.size();
        int i10 = 0;
        this.f45725k0 = 0;
        while (true) {
            int i11 = this.f45725k0;
            if (i11 >= this.f45724j0) {
                break;
            }
            l(canvas, (xf.d) arrayList.get(i11));
            this.f45725k0++;
        }
        k(canvas);
        while (true) {
            this.f45725k0 = i10;
            int i12 = this.f45725k0;
            if (i12 < this.f45724j0) {
                p(canvas, (xf.d) arrayList.get(i12));
                i10 = this.f45725k0 + 1;
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
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.F) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i10));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.displaySize.y - AndroidUtilities.dp(56.0f));
        }
        int measuredWidth = getMeasuredWidth();
        int i12 = this.U0;
        int i13 = this.f45744y0;
        if (measuredWidth != i12 || getMeasuredHeight() != this.V0) {
            this.U0 = getMeasuredWidth();
            this.V0 = getMeasuredHeight();
            float f10 = f45686h1;
            float f11 = 2.0f * f10;
            this.m0 = Bitmap.createBitmap((int) (getMeasuredWidth() - f11), i13, Bitmap.Config.ARGB_4444);
            this.f45728n0 = new Canvas(this.m0);
            this.f45704a.a(i13, (int) (getMeasuredWidth() - f11));
            w();
            if (this.f45733r0) {
                x((this.D0 * this.f45713d0.f45758k) - f10);
            }
            A(false, true, false);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int measuredHeight = getMeasuredHeight();
            int i14 = f45691n1;
            this.W0.set(0, measuredHeight - ((i13 + i14) + i14), getMeasuredWidth(), getMeasuredHeight());
            setSystemGestureExclusionRects(this.X0);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        long j10;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean z4 = false;
        if (this.f45715e0 != null) {
            boolean z10 = this.G;
            j jVar = this.f45713d0;
            if (!z10) {
                jVar.c(motionEvent.getActionIndex(), motionEvent);
                getParent().requestDisallowInterceptTouchEvent(false);
                this.f45729o0 = false;
                return false;
            }
            int x10 = (int) motionEvent.getX(motionEvent.getActionIndex());
            int y10 = (int) motionEvent.getY(motionEvent.getActionIndex());
            int actionMasked = motionEvent.getActionMasked();
            RectF rectF = this.E0;
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
                        int i10 = x10 - this.Z0;
                        int i11 = y10 - this.f45706a1;
                        if (jVar.f45761n[0] == null && !jVar.f45753c) {
                            boolean z11 = this.f45729o0;
                            int i12 = this.f45742x0;
                            if (z11) {
                                if ((this.f45716e1 && System.currentTimeMillis() - this.f45714d1 > 200) || Math.abs(i10) > Math.abs(i11) || Math.abs(i11) < i12) {
                                    z4 = true;
                                }
                                this.Z0 = x10;
                                this.f45706a1 = y10;
                                getParent().requestDisallowInterceptTouchEvent(z4);
                                C(x10, y10);
                                return true;
                            }
                            if (rectF.contains(this.f45709b1, this.f45712c1)) {
                                int i13 = this.f45709b1 - x10;
                                int i14 = this.f45712c1 - y10;
                                if (Math.sqrt((i14 * i14) + (i13 * i13)) > i12 || System.currentTimeMillis() - this.f45714d1 > 200) {
                                    this.f45729o0 = true;
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
                    if (rectF.contains(this.f45709b1, this.f45712c1) && !this.f45729o0) {
                        c(false);
                    }
                    h[] hVarArr = jVar.f45761n;
                    h hVar = hVarArr[0];
                    if (hVar != null && (valueAnimator2 = hVar.e) != null) {
                        valueAnimator2.cancel();
                    }
                    h hVar2 = hVarArr[1];
                    if (hVar2 != null && (valueAnimator = hVar2.e) != null) {
                        valueAnimator.cancel();
                    }
                    hVarArr[0] = null;
                    hVarArr[1] = null;
                    I();
                    getParent().requestDisallowInterceptTouchEvent(false);
                    this.f45729o0 = false;
                    y();
                    invalidate();
                    if (this.M0) {
                        j10 = s(this.C, this.D);
                    } else {
                        j10 = 0;
                    }
                    E(r(this.C, this.D), j10, true, true, false);
                    return true;
                }
                return true;
            }
            this.f45714d1 = System.currentTimeMillis();
            getParent().requestDisallowInterceptTouchEvent(true);
            if (!jVar.a(x10, y10, motionEvent.getActionIndex())) {
                this.Z0 = x10;
                this.f45709b1 = x10;
                this.f45706a1 = y10;
                this.f45712c1 = y10;
                if (rectF.contains(x10, y10)) {
                    if (this.f45730p0 < 0 || !this.f45719f1) {
                        this.f45729o0 = true;
                        C(x10, y10);
                        return true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public void p(android.graphics.Canvas r14, xf.d r15) {
        throw new UnsupportedOperationException("Method not decompiled: vf.g.p(android.graphics.Canvas, xf.d):void");
    }

    public long r(int i10, int i11) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        long j10 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            if (((xf.f) arrayList.get(i12)).f46959n) {
                long rMaxQ = ((xf.f) arrayList.get(i12)).f46949a.f46532b.rMaxQ(i10, i11);
                if (rMaxQ > j10) {
                    j10 = rMaxQ;
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
            if (((xf.f) arrayList.get(i12)).f46959n) {
                long rMinQ = ((xf.f) arrayList.get(i12)).f46949a.f46532b.rMinQ(i10, i11);
                if (rMinQ < j10) {
                    j10 = rMinQ;
                }
            }
        }
        return j10;
    }

    public void setDateSelectionListener(e eVar) {
        this.N0 = eVar;
    }

    public void setHeader(xf.c cVar) {
        this.f45721g1 = cVar;
    }

    public void setLandscape(boolean z4) {
        this.F = z4;
    }

    public void t() {
        this.I.setStrokeWidth(1.0f);
        this.J.setStrokeWidth(f45687i1);
        TextPaint textPaint = this.K;
        float f10 = f45688j1;
        textPaint.setTextSize(f10);
        TextPaint textPaint2 = this.L;
        textPaint2.setTextSize(f10);
        textPaint2.setTextAlign(Paint.Align.RIGHT);
        TextPaint textPaint3 = this.M;
        textPaint3.setTextSize(f10);
        textPaint3.setTextAlign(Paint.Align.CENTER);
        float dpf2 = AndroidUtilities.dpf2(6.0f);
        Paint paint = this.P;
        paint.setStrokeWidth(dpf2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        setLayerType(2, null);
        setWillNotDraw(false);
        xf.e g10 = g();
        this.f45731q0 = g10;
        g10.setVisibility(8);
        Paint paint2 = this.R;
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
            xf.f fVar = (xf.f) obj;
            boolean z4 = fVar.f46959n;
            wf.a aVar = fVar.f46949a;
            if (z4) {
                long j10 = aVar.e;
                if (((float) j10) > this.f45720g0) {
                    this.f45720g0 = (float) j10;
                }
            }
            if (z4) {
                long j11 = aVar.f46534f;
                if (((float) j11) < this.f45722h0) {
                    this.f45722h0 = (float) j11;
                }
            }
            float f10 = this.f45720g0;
            float f11 = this.f45722h0;
            if (f10 == f11) {
                this.f45720g0 = f10 + 1.0f;
                this.f45722h0 = f11 - 1.0f;
            }
        }
    }

    public final void v() {
        int measuredHeight = getMeasuredHeight() - this.f45734s;
        float f10 = this.f45741x;
        if (f10 != 0.0f && measuredHeight != 0) {
            this.B = (f10 / measuredHeight) * f45688j1;
        }
    }

    public final void w() {
        float f10;
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            float f11 = f45686h1;
            this.f45745z0 = getMeasuredWidth() - (2.0f * f11);
            this.A0 = f11;
            float measuredWidth = getMeasuredWidth();
            if (this.F) {
                f10 = f45693p1;
            } else {
                f10 = f11;
            }
            float f12 = measuredWidth - f10;
            this.B0 = f12;
            float f13 = f12 - this.A0;
            this.C0 = f13;
            j jVar = this.f45713d0;
            this.D0 = f13 / (jVar.f45759l - jVar.f45758k);
            I();
            this.f45734s = AndroidUtilities.dp(100.0f);
            this.E0.set(this.A0 - f11, 0.0f, this.B0 + f11, getMeasuredHeight() - this.f45734s);
            if (this.f45715e0 != null) {
                this.f45726l0 = (int) (AndroidUtilities.dp(20.0f) / (this.f45745z0 / this.f45715e0.f46537a.length));
            }
            v();
        }
    }

    public final void x(float f10) {
        int i10;
        float f11;
        wf.b bVar = this.f45715e0;
        if (bVar != null && (i10 = this.f45730p0) >= 0) {
            long[] jArr = bVar.f46537a;
            if (i10 < jArr.length && this.f45733r0) {
                this.f45731q0.c(i10, jArr[i10], this.d, false, bVar.f46543j, bVar.h);
                this.f45731q0.setVisibility(0);
                this.f45731q0.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
                float f12 = (this.f45715e0.f46538b[this.f45730p0] * this.D0) - f10;
                int i11 = f45698u1;
                if (f12 > (this.A0 + this.C0) / 2.0f) {
                    f11 = f12 - (this.f45731q0.getWidth() + i11);
                } else {
                    f11 = f12 + i11;
                }
                if (f11 < 0.0f) {
                    f11 = 0.0f;
                } else if (this.f45731q0.getMeasuredWidth() + f11 > getMeasuredWidth()) {
                    f11 = getMeasuredWidth() - this.f45731q0.getMeasuredWidth();
                }
                this.f45731q0.setTranslationX(f11);
            }
        }
    }

    public void z() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3;
        A(true, true, true);
        ArrayList arrayList = this.d;
        this.f45724j0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.f45725k0 = i10;
            int i11 = this.f45725k0;
            if (i11 >= this.f45724j0) {
                break;
            }
            final xf.f fVar = (xf.f) arrayList.get(i11);
            if (fVar.f46959n && (valueAnimator3 = fVar.f46954i) != null) {
                valueAnimator3.cancel();
            }
            if (!fVar.f46959n && (valueAnimator2 = fVar.h) != null) {
                valueAnimator2.cancel();
            }
            if (fVar.f46959n && fVar.f46960o != 1.0f) {
                ValueAnimator valueAnimator4 = fVar.h;
                if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                    ValueAnimator e = e(fVar.f46960o, 1.0f, new ValueAnimator.AnimatorUpdateListener(this) {
                        public final g f45677b;

                        {
                            this.f45677b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                            switch (r3) {
                                case 0:
                                    g gVar = this.f45677b;
                                    gVar.getClass();
                                    fVar.f46960o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    gVar.E = true;
                                    gVar.invalidate();
                                    return;
                                default:
                                    g gVar2 = this.f45677b;
                                    gVar2.getClass();
                                    fVar.f46960o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    gVar2.E = true;
                                    gVar2.invalidate();
                                    return;
                            }
                        }
                    });
                    fVar.h = e;
                    e.start();
                } else {
                    i10 = this.f45725k0 + 1;
                }
            }
            if (!fVar.f46959n && fVar.f46960o != 0.0f && ((valueAnimator = fVar.f46954i) == null || !valueAnimator.isRunning())) {
                ValueAnimator e6 = e(fVar.f46960o, 0.0f, new ValueAnimator.AnimatorUpdateListener(this) {
                    public final g f45677b;

                    {
                        this.f45677b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                        switch (r3) {
                            case 0:
                                g gVar = this.f45677b;
                                gVar.getClass();
                                fVar.f46960o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                gVar.E = true;
                                gVar.invalidate();
                                return;
                            default:
                                g gVar2 = this.f45677b;
                                gVar2.getClass();
                                fVar.f46960o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                gVar2.E = true;
                                gVar2.invalidate();
                                return;
                        }
                    }
                });
                fVar.f46954i = e6;
                e6.start();
            }
            i10 = this.f45725k0 + 1;
        }
        K();
        if (this.f45733r0) {
            xf.e eVar = this.f45731q0;
            int i12 = this.f45730p0;
            wf.b bVar = this.f45715e0;
            eVar.c(i12, bVar.f46537a[i12], arrayList, true, bVar.f46543j, bVar.h);
        }
    }

    public void q(xf.j jVar) {
    }

    public void y() {
    }
}
