package wf;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.fx0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.kl0;
import org.telegram.ui.r91;
import qh.j2;
public abstract class g extends View implements i {
    public static final float f49523h1 = AndroidUtilities.dpf2(16.0f);
    public static final float f49524i1 = AndroidUtilities.dpf2(1.5f);
    public static final float f49525j1 = AndroidUtilities.dpf2(12.0f);
    public static final int f49526k1 = AndroidUtilities.dp(18.0f);
    public static final int l1 = AndroidUtilities.dp(14.0f);
    public static final int f49527m1 = AndroidUtilities.dp(10.0f);
    public static final int f49528n1 = AndroidUtilities.dp(16.0f);
    public static final int f49529o1 = AndroidUtilities.dp(24.0f);
    public static final int f49530p1 = AndroidUtilities.dp(16.0f);
    public static final int f49531q1 = AndroidUtilities.dp(10.0f);
    public static final int f49532r1 = AndroidUtilities.dp(12.0f);
    public static final int f49533s1 = AndroidUtilities.dp(8.0f);
    public static final int f49534t1 = AndroidUtilities.dp(6.0f);
    public static final int f49535u1 = AndroidUtilities.dp(5.0f);
    public static final int f49536v1 = AndroidUtilities.dp(2.0f);
    public static final int f49537w1 = AndroidUtilities.dp(1.0f);
    public static final boolean f49538x1;
    public static final boolean f49539y1;
    public static final u1.a f49540z1;
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
    public final g6 T0;
    public AnimatorSet U;
    public int U0;
    public ValueAnimator V;
    public int V0;
    public ValueAnimator W;
    public final Rect W0;
    public final ArrayList X0;
    public long Y0;
    public int Z0;
    public f f49541a;
    public Animator f49542a0;
    public int f49543a1;
    public final ArrayList f49544b;
    public ValueAnimator f49545b0;
    public int f49546b1;
    public final ArrayList f49547c;
    public boolean f49548c0;
    public int f49549c1;
    public final ArrayList d;
    public final j f49550d0;
    public long f49551d1;
    public boolean f49552e;
    public xf.b f49553e0;
    public boolean f49554e1;
    public float f49555f;
    public yf.b f49556f0;
    public boolean f49557f1;
    public float f49558g0;
    public yf.c f49559g1;
    public float h;
    public float f49560h0;
    public float f49561i0;
    public int f49562j0;
    public int f49563k0;
    public int f49564l0;
    public Bitmap m0;
    public int f49565n;
    public Canvas f49566n0;
    public boolean f49567o0;
    public int f49568p0;
    public yf.e f49569q0;
    public int f49570r;
    public boolean f49571r0;
    public int f49572s;
    public float f49573s0;
    public boolean f49574t0;
    public boolean f49575u0;
    public float v;
    public int f49576v0;
    public float f49577w;
    public yf.j f49578w0;
    public float f49579x;
    public final int f49580x0;
    public float f49581y;
    public final int f49582y0;
    public float f49583z0;

    static {
        boolean z4;
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (i10 < 28) {
            z4 = true;
        } else {
            z4 = false;
        }
        f49538x1 = z4;
        if (i10 > 21) {
            z10 = true;
        }
        f49539y1 = z10;
        f49540z1 = new u1.a();
    }

    public g(Context context, g6 g6Var) {
        super(context);
        this.f49544b = new ArrayList(10);
        this.f49547c = new ArrayList(25);
        this.d = new ArrayList();
        this.f49552e = true;
        this.v = 250.0f;
        this.f49577w = 0.0f;
        this.f49579x = 0.0f;
        this.f49581y = 0.0f;
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
        this.f49548c0 = false;
        ?? obj = new Object();
        obj.h = new Rect();
        obj.f49596i = new Rect();
        obj.f49597j = new Rect();
        obj.f49598k = 0.7f;
        obj.f49599l = 1.0f;
        obj.f49600m = 0.1f;
        obj.f49601n = new h[]{null, null};
        obj.f49590a = this;
        this.f49550d0 = obj;
        this.f49567o0 = false;
        this.f49568p0 = -1;
        this.f49571r0 = false;
        this.f49573s0 = 0.0f;
        this.f49574t0 = false;
        this.f49575u0 = false;
        this.f49576v0 = 0;
        this.f49582y0 = AndroidUtilities.dp(46.0f);
        this.E0 = new RectF();
        this.G0 = new d(this, 0);
        this.H0 = new d(this, 1);
        this.I0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final g f49511b;

            {
                this.f49511b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        g gVar = this.f49511b;
                        gVar.getClass();
                        gVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar.invalidate();
                        return;
                    default:
                        g gVar2 = this.f49511b;
                        gVar2.getClass();
                        gVar2.f49577w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar2.invalidate();
                        return;
                }
            }
        };
        this.J0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final g f49511b;

            {
                this.f49511b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        g gVar = this.f49511b;
                        gVar.getClass();
                        gVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar.invalidate();
                        return;
                    default:
                        g gVar2 = this.f49511b;
                        gVar2.getClass();
                        gVar2.f49577w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
        this.f49557f1 = false;
        this.T0 = g6Var;
        t();
        this.f49580x0 = ViewConfiguration.get(context).getScaledTouchSlop();
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
        ofFloat.setInterpolator(f49540z1);
        ofFloat.addUpdateListener(animatorUpdateListener);
        return ofFloat;
    }

    public void A(boolean z4, boolean z10, boolean z11) {
        long j10;
        if (this.f49553e0 == null) {
            return;
        }
        float f10 = this.C0;
        j jVar = this.f49550d0;
        this.D0 = f10 / (jVar.f49599l - jVar.f49598k);
        H();
        if (this.M0) {
            j10 = s(this.C, this.D);
        } else {
            j10 = 0;
        }
        E(r(this.C, this.D), j10, z4, z10, z11);
        if (this.f49571r0 && !z10) {
            c(false);
            x((this.D0 * jVar.f49598k) - f49523h1);
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
        int i12 = this.f49568p0;
        xf.b bVar = this.f49553e0;
        if (bVar != null) {
            float f10 = this.D0;
            float f11 = (this.f49550d0.f49598k * f10) - f49523h1;
            float f12 = (i10 + f11) / f10;
            if (f12 < 0.0f) {
                this.f49568p0 = 0;
            } else if (f12 > 1.0f) {
                this.f49568p0 = bVar.f50546a.length - 1;
            } else {
                int b10 = bVar.b(f12, this.C, this.D);
                this.f49568p0 = b10;
                int i13 = b10 + 1;
                float[] fArr = this.f49553e0.f50547b;
                if (i13 < fArr.length) {
                    if (Math.abs(this.f49553e0.f50547b[this.f49568p0 + 1] - f12) < Math.abs(fArr[b10] - f12)) {
                        this.f49568p0++;
                    }
                }
            }
            int i14 = this.f49568p0;
            int i15 = this.D;
            if (i14 > i15) {
                this.f49568p0 = i15;
            }
            int i16 = this.f49568p0;
            int i17 = this.C;
            if (i16 < i17) {
                this.f49568p0 = i17;
            }
            if (i12 != this.f49568p0) {
                this.f49571r0 = true;
                c(true);
                x(f11);
                e eVar = this.N0;
                if (eVar != null) {
                    getSelectedDate();
                    r91 r91Var = (r91) ((kl0) eVar).f38438b;
                    r91Var.f();
                    r91Var.f40868b.f49569q0.d(false, false);
                }
                B();
                invalidate();
            }
        }
    }

    public boolean D(xf.b bVar) {
        boolean z4;
        xf.b bVar2 = this.f49553e0;
        long j10 = 0;
        j jVar = this.f49550d0;
        ArrayList arrayList = this.d;
        if (bVar2 != bVar) {
            invalidate();
            arrayList.clear();
            if (bVar != null && bVar.d != null) {
                for (int i10 = 0; i10 < bVar.d.size(); i10++) {
                    arrayList.add(h((xf.a) bVar.d.get(i10)));
                }
            }
            d();
            this.f49553e0 = bVar;
            if (bVar != null) {
                if (bVar.f50546a[0] == 0) {
                    jVar.f49598k = 0.0f;
                    jVar.f49599l = 1.0f;
                } else {
                    float minDistance = getMinDistance();
                    jVar.f49600m = minDistance;
                    float f10 = jVar.f49599l;
                    if (f10 - jVar.f49598k < minDistance) {
                        float f11 = f10 - minDistance;
                        jVar.f49598k = f11;
                        if (f11 < 0.0f) {
                            jVar.f49598k = 0.0f;
                            jVar.f49599l = 1.0f;
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
            this.f49558g0 = 0.0f;
            this.f49560h0 = 2.1474836E9f;
            u();
            int i11 = bVar.f50553j;
            if (i11 != 1 && i11 != 2) {
                this.f49569q0.setSize(arrayList.size());
            } else {
                this.f49569q0.setSize(arrayList.size() * 2);
            }
            this.E = true;
            I();
            return z4;
        }
        jVar.f49598k = 0.7f;
        jVar.f49599l = 1.0f;
        this.f49560h0 = 0.0f;
        this.f49558g0 = 0.0f;
        this.f49544b.clear();
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
        if ((Math.abs(((float) (((long) Math.ceil(((float) j12) / 5.0f)) * 5)) - this.f49579x) >= this.B && j10 != 0) || ((float) j10) != this.f49581y) {
            yf.d f11 = f(this.f49553e0.f50552i, j10, j11);
            long[] jArr = f11.f50904a;
            long j13 = jArr[jArr.length - 1];
            long j14 = jArr[0];
            if (!z11) {
                float f12 = this.v - this.f49577w;
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
                if (((float) j13) != this.f49579x) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (this.M0 && ((float) j14) != this.f49581y) {
                    z12 = true;
                }
                if (z12) {
                    AnimatorSet animatorSet = this.U;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        this.U.cancel();
                    }
                    this.Q0 = this.v;
                    this.R0 = this.f49577w;
                    this.O0 = 0.0f;
                    this.P0 = 0.0f;
                    this.S0 = f10;
                }
            }
            float f15 = (float) j13;
            this.f49579x = f15;
            float f16 = (float) j14;
            this.f49581y = f16;
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
            ArrayList arrayList = this.f49544b;
            if (!z4) {
                this.v = f15;
                this.f49577w = f16;
                arrayList.clear();
                arrayList.add(f11);
                f11.f50908f = 255;
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
                    animatorSet3.playTogether(e(this.f49577w, f16, this.J0));
                }
                this.U = animatorSet3;
                animatorSet3.start();
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                yf.d dVar = (yf.d) arrayList.get(i10);
                if (dVar != f11) {
                    dVar.f50909g = dVar.f50908f;
                }
            }
            ValueAnimator e6 = e(0.0f, 255.0f, new bg.a(26, this, f11));
            this.V = e6;
            e6.addListener(new fx0(20, this, f11));
            this.V.start();
        }
    }

    public final void F() {
        float f10 = this.S0;
        if (f10 != 0.0f) {
            float f11 = this.v;
            float f12 = this.f49579x;
            if (f11 != f12) {
                float f13 = this.O0 + f10;
                this.O0 = f13;
                if (f13 > 1.0f) {
                    this.O0 = 1.0f;
                    this.v = f12;
                } else {
                    float f14 = this.Q0;
                    this.v = (pr.f30184g.getInterpolation(f13) * (f12 - f14)) + f14;
                }
                invalidate();
            }
            if (this.M0) {
                float f15 = this.f49577w;
                float f16 = this.f49581y;
                if (f15 != f16) {
                    float f17 = this.P0 + this.S0;
                    this.P0 = f17;
                    if (f17 > 1.0f) {
                        this.P0 = 1.0f;
                        this.f49577w = f16;
                    } else {
                        float f18 = this.R0;
                        this.f49577w = (pr.f30184g.getInterpolation(f17) * (f16 - f18)) + f18;
                    }
                    invalidate();
                }
            }
        }
    }

    public final void G() {
        int i10;
        int i11;
        if (this.f49575u0) {
            i10 = k6.Zi;
        } else {
            i10 = k6.Yi;
        }
        g6 g6Var = this.T0;
        int v02 = k6.v0(i10, g6Var);
        TextPaint textPaint = this.K;
        textPaint.setColor(v02);
        if (this.f49575u0) {
            i11 = k6.Zi;
        } else {
            i11 = k6.Yi;
        }
        this.L.setColor(k6.v0(i11, g6Var));
        int v03 = k6.v0(k6.Yi, g6Var);
        TextPaint textPaint2 = this.M;
        textPaint2.setColor(v03);
        int v04 = k6.v0(k6.aj, g6Var);
        Paint paint = this.I;
        paint.setColor(v04);
        int v05 = k6.v0(k6.bj, g6Var);
        Paint paint2 = this.J;
        paint2.setColor(v05);
        this.N.setColor(k6.v0(k6.dj, g6Var));
        this.O.setColor(k6.v0(k6.cj, g6Var));
        this.P.setColor(k6.v0(k6.f21659d6, g6Var));
        this.Q.setColor(k6.v0(k6.ej, g6Var));
        this.f49569q0.b();
        this.f49565n = paint.getAlpha();
        this.f49570r = paint2.getAlpha();
        this.f49555f = textPaint.getAlpha() / 255.0f;
        this.h = textPaint2.getAlpha() / 255.0f;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((yf.f) obj).a();
        }
        if (this.f49571r0) {
            int i13 = this.f49568p0;
            xf.b bVar = this.f49553e0;
            long[] jArr = bVar.f50546a;
            if (i13 < jArr.length) {
                this.f49569q0.c(i13, jArr[i13], arrayList, false, bVar.f50553j, bVar.h);
            }
        }
        this.E = true;
    }

    public final void H() {
        xf.b bVar = this.f49553e0;
        if (bVar == null) {
            return;
        }
        j jVar = this.f49550d0;
        int c3 = bVar.c(Math.max(jVar.f49598k, 0.0f));
        this.C = c3;
        int a2 = this.f49553e0.a(Math.min(jVar.f49599l, 1.0f), c3);
        this.D = a2;
        int i10 = this.C;
        if (a2 < i10) {
            this.D = i10;
        }
        yf.c cVar = this.f49559g1;
        if (cVar != null) {
            long[] jArr = this.f49553e0.f50546a;
            cVar.b(jArr[i10], jArr[this.D]);
        }
        I();
    }

    public final void I() {
        xf.b bVar = this.f49553e0;
        if (bVar != null) {
            float f10 = this.C0;
            if (f10 != 0.0f) {
                int i10 = (int) ((f10 / (this.D0 * bVar.f50551g)) / 6.0f);
                yf.b bVar2 = this.f49556f0;
                if (bVar2 == null || i10 >= bVar2.f50894b || i10 <= bVar2.f50895c) {
                    int highestOneBit = Integer.highestOneBit(i10) << 1;
                    yf.b bVar3 = this.f49556f0;
                    if (bVar3 == null || bVar3.f50893a != highestOneBit) {
                        ValueAnimator valueAnimator = this.W;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllListeners();
                            this.W.cancel();
                        }
                        double d = highestOneBit;
                        double d10 = 0.2d * d;
                        yf.b bVar4 = new yf.b(highestOneBit, (int) (d + d10), (int) (d - d10));
                        bVar4.d = 255;
                        yf.b bVar5 = this.f49556f0;
                        ArrayList arrayList = this.f49547c;
                        if (bVar5 == null) {
                            this.f49556f0 = bVar4;
                            bVar4.d = 255;
                            arrayList.add(bVar4);
                            return;
                        }
                        this.f49556f0 = bVar4;
                        this.f49562j0 = arrayList.size();
                        for (int i11 = 0; i11 < this.f49562j0; i11++) {
                            yf.b bVar6 = (yf.b) arrayList.get(i11);
                            bVar6.f50896e = bVar6.d;
                        }
                        arrayList.add(bVar4);
                        if (arrayList.size() > 2) {
                            arrayList.remove(0);
                        }
                        ValueAnimator duration = e(0.0f, 1.0f, new bg.a(27, this, bVar4)).setDuration(200L);
                        this.W = duration;
                        duration.addListener(new fx0(21, this, bVar4));
                        this.W.start();
                    }
                }
            }
        }
    }

    public void J(xf.b bVar, long j10) {
        int length = bVar.f50546a.length;
        long j11 = j10 - (j10 % 86400000);
        long j12 = 86399999 + j11;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            long j13 = bVar.f50546a[i12];
            if (j11 > j13) {
                i10 = i12;
            }
            if (j12 > j13) {
                i11 = i12;
            }
        }
        float[] fArr = bVar.f50547b;
        float f10 = fArr[i10];
        j jVar = this.f49550d0;
        jVar.f49598k = f10;
        jVar.f49599l = fArr[i11];
    }

    public void K() {
        if (f49539y1) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j10 = Long.MAX_VALUE;
            long j11 = 0;
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                yf.f fVar = (yf.f) obj;
                boolean z4 = fVar.f50932n;
                xf.a aVar = fVar.f50921a;
                if (z4) {
                    long j12 = aVar.f50542e;
                    if (j12 > j11) {
                        j11 = j12;
                    }
                }
                if (z4) {
                    long j13 = aVar.f50543f;
                    if (j13 < j10) {
                        j10 = j13;
                    }
                }
            }
            if ((j10 != 2147483647L && ((float) j10) != 0.0f) || (j11 > 0 && ((float) j11) != this.f49561i0)) {
                this.f49561i0 = (float) j11;
                Animator animator = this.f49542a0;
                if (animator != null) {
                    animator.cancel();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(e(this.f49558g0, this.f49561i0, this.G0), e(this.f49560h0, 0.0f, this.H0));
                this.f49542a0 = animatorSet;
                animatorSet.start();
            }
        }
    }

    @Override
    public void a(float f10, float f11, boolean z4) {
        xf.b bVar = this.f49553e0;
        if (bVar == null) {
            return;
        }
        if (z4) {
            int c3 = bVar.c(Math.max(f10, 0.0f));
            int a2 = this.f49553e0.a(Math.min(f11, 1.0f), c3);
            E(r(c3, a2), s(c3, a2), true, true, false);
            c(false);
            return;
        }
        H();
        invalidate();
    }

    public final void c(boolean z4) {
        float f10;
        x((this.D0 * this.f49550d0.f49598k) - f49523h1);
        if (this.f49557f1 == z4) {
            return;
        }
        this.f49557f1 = z4;
        ValueAnimator valueAnimator = this.f49545b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f49545b0.cancel();
        }
        float f11 = this.f49573s0;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator duration = e(f11, f10, this.K0).setDuration(200L);
        this.f49545b0 = duration;
        duration.addListener(this.L0);
        this.f49545b0.start();
    }

    public final void d() {
        this.f49568p0 = -1;
        this.f49571r0 = false;
        this.f49557f1 = false;
        this.f49569q0.setVisibility(8);
        this.f49573s0 = 0.0f;
    }

    public yf.d f(int i10, long j10, long j11) {
        return new yf.d(j10, j11, this.M0, this.f49553e0.h, i10, this.K, this.L);
    }

    public yf.e g() {
        return new yf.e(getContext(), this.T0);
    }

    public long getEndDate() {
        return this.f49553e0.f50546a[this.D];
    }

    public float getMinDistance() {
        xf.b bVar = this.f49553e0;
        if (bVar == null) {
            return 0.1f;
        }
        int length = bVar.f50546a.length;
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
        int i10 = this.f49568p0;
        if (i10 < 0) {
            return -1L;
        }
        return this.f49553e0.f50546a[i10];
    }

    public long getStartDate() {
        return this.f49553e0.f50546a[this.C];
    }

    public abstract yf.f h(xf.a aVar);

    public void i(Canvas canvas) {
        int measuredHeight;
        if (this.f49553e0 != null) {
            int i10 = this.f49576v0;
            float f10 = 1.0f;
            if (i10 == 2) {
                f10 = 1.0f - this.f49578w0.f50942f;
            } else if (i10 == 1) {
                f10 = this.f49578w0.f50942f;
            } else if (i10 == 3) {
                f10 = this.f49578w0.f50942f;
            }
            Paint paint = this.I;
            paint.setAlpha((int) (this.f49565n * f10));
            TextPaint textPaint = this.K;
            textPaint.setAlpha((int) (this.f49555f * 255.0f * f10));
            this.L.setAlpha((int) (this.f49555f * 255.0f * f10));
            int textSize = (int) (f49526k1 - textPaint.getTextSize());
            float measuredHeight2 = (getMeasuredHeight() - this.f49572s) - 1;
            canvas.drawLine(this.A0, measuredHeight2, this.B0, measuredHeight2, paint);
            if (this.M0) {
                return;
            }
            canvas.drawText("0", f49523h1, measuredHeight - textSize, textPaint);
        }
    }

    public void j(Canvas canvas) {
        float f10;
        int i10;
        if (this.f49553e0 != null) {
            ArrayList arrayList = this.f49547c;
            this.f49562j0 = arrayList.size();
            int i11 = this.f49576v0;
            float f11 = 1.0f;
            int i12 = 1;
            if (i11 == 2) {
                f10 = 1.0f - this.f49578w0.f50942f;
            } else if (i11 == 1) {
                f10 = this.f49578w0.f50942f;
            } else if (i11 == 3) {
                f10 = this.f49578w0.f50942f;
            } else {
                f10 = 1.0f;
            }
            char c3 = 0;
            this.f49563k0 = 0;
            while (true) {
                int i13 = this.f49563k0;
                if (i13 < this.f49562j0) {
                    int i14 = ((yf.b) arrayList.get(i13)).d;
                    int i15 = ((yf.b) arrayList.get(this.f49563k0)).f50893a;
                    if (i15 == 0) {
                        i15 = 1;
                    }
                    int i16 = this.C - this.f49564l0;
                    while (i16 % i15 != 0) {
                        i16--;
                    }
                    int i17 = this.D - this.f49564l0;
                    while (true) {
                        if (i17 % i15 == 0 && i17 >= this.f49553e0.f50546a.length - i12) {
                            break;
                        }
                        i17++;
                        i14 = i14;
                        c3 = 0;
                        f11 = 1.0f;
                        i12 = 1;
                    }
                    int i18 = this.f49564l0;
                    int i19 = i16 + i18;
                    int i20 = i17 + i18;
                    float f12 = this.D0 * this.f49550d0.f49598k;
                    float f13 = f49523h1;
                    float f14 = f12 - f13;
                    while (i19 < i20) {
                        if (i19 >= 0) {
                            long[] jArr = this.f49553e0.f50546a;
                            if (i19 < jArr.length - i12) {
                                long j10 = jArr[i19];
                                long j11 = jArr[c3];
                                i10 = i14;
                                float f15 = ((((float) (j10 - j11)) / ((float) (jArr[jArr.length - i12] - j11))) * this.D0) - f14;
                                float f16 = f15 - f49531q1;
                                if (f16 > 0.0f) {
                                    float f17 = this.C0;
                                    if (f16 <= f17 + f13) {
                                        float f18 = f49527m1;
                                        TextPaint textPaint = this.M;
                                        if (f16 < f18) {
                                            textPaint.setAlpha((int) (i10 * y3.a(f18, f16, f18, f11) * this.h * f10));
                                        } else if (f16 > f17) {
                                            textPaint.setAlpha((int) (i10 * y3.a(f16, f17, f13, f11) * this.h * f10));
                                        } else {
                                            textPaint.setAlpha((int) (i10 * this.h * f10));
                                        }
                                        xf.b bVar = this.f49553e0;
                                        String[] strArr = bVar.f50548c;
                                        long[] jArr2 = bVar.f50546a;
                                        canvas.drawText(strArr[(int) ((jArr2[i19] - jArr2[0]) / bVar.f50554k)], f15, AndroidUtilities.dp(3.0f) + (getMeasuredHeight() - this.f49572s) + l1, textPaint);
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
                    this.f49563k0++;
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

    public void l(android.graphics.Canvas r12, yf.d r13) {
        throw new UnsupportedOperationException("Method not decompiled: wf.g.l(android.graphics.Canvas, yf.d):void");
    }

    public final void m(android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: wf.g.m(android.graphics.Canvas):void");
    }

    public abstract void n(Canvas canvas);

    public void o(Canvas canvas) {
        xf.b bVar;
        int i10 = this.f49568p0;
        if (i10 >= 0 && this.f49571r0 && (bVar = this.f49553e0) != null) {
            int i11 = (int) (this.f49570r * this.f49573s0);
            float f10 = this.C0;
            j jVar = this.f49550d0;
            float f11 = jVar.f49599l;
            float f12 = jVar.f49598k;
            float f13 = f10 / (f11 - f12);
            float f14 = (f12 * f13) - f49523h1;
            float[] fArr = bVar.f50547b;
            if (i10 < fArr.length) {
                float f15 = (fArr[i10] * f13) - f14;
                Paint paint = this.J;
                paint.setAlpha(i11);
                canvas.drawLine(f15, 0.0f, f15, this.E0.bottom, paint);
                if (this.f49552e) {
                    ArrayList arrayList = this.d;
                    this.f49562j0 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        this.f49563k0 = i12;
                        int i13 = this.f49563k0;
                        if (i13 < this.f49562j0) {
                            yf.f fVar = (yf.f) arrayList.get(i13);
                            boolean z4 = fVar.f50932n;
                            Paint paint2 = fVar.d;
                            if (z4 || fVar.f50933o != 0.0f) {
                                float f16 = (float) fVar.f50921a.f50539a[this.f49568p0];
                                float f17 = this.f49577w;
                                float measuredHeight = (getMeasuredHeight() - this.f49572s) - (((f16 - f17) / (this.v - f17)) * ((getMeasuredHeight() - this.f49572s) - f49526k1));
                                paint2.setAlpha((int) (fVar.f50933o * 255.0f * this.f49573s0));
                                Paint paint3 = this.P;
                                paint3.setAlpha((int) (fVar.f50933o * 255.0f * this.f49573s0));
                                canvas.drawPoint(f15, measuredHeight, paint2);
                                canvas.drawPoint(f15, measuredHeight, paint3);
                            }
                            i12 = this.f49563k0 + 1;
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
        if (this.f49574t0) {
            super.onDraw(canvas);
            return;
        }
        F();
        int save = canvas.save();
        RectF rectF = this.E0;
        canvas.clipRect(0.0f, rectF.top, getMeasuredWidth(), rectF.bottom);
        i(canvas);
        ArrayList arrayList = this.f49544b;
        this.f49562j0 = arrayList.size();
        int i10 = 0;
        this.f49563k0 = 0;
        while (true) {
            int i11 = this.f49563k0;
            if (i11 >= this.f49562j0) {
                break;
            }
            l(canvas, (yf.d) arrayList.get(i11));
            this.f49563k0++;
        }
        k(canvas);
        while (true) {
            this.f49563k0 = i10;
            int i12 = this.f49563k0;
            if (i12 < this.f49562j0) {
                p(canvas, (yf.d) arrayList.get(i12));
                i10 = this.f49563k0 + 1;
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
        int i13 = this.f49582y0;
        if (measuredWidth != i12 || getMeasuredHeight() != this.V0) {
            this.U0 = getMeasuredWidth();
            this.V0 = getMeasuredHeight();
            float f10 = f49523h1;
            float f11 = 2.0f * f10;
            this.m0 = Bitmap.createBitmap((int) (getMeasuredWidth() - f11), i13, Bitmap.Config.ARGB_4444);
            this.f49566n0 = new Canvas(this.m0);
            this.f49541a.a(i13, (int) (getMeasuredWidth() - f11));
            w();
            if (this.f49571r0) {
                x((this.D0 * this.f49550d0.f49598k) - f10);
            }
            A(false, true, false);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int measuredHeight = getMeasuredHeight();
            int i14 = f49528n1;
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
        if (this.f49553e0 != null) {
            boolean z10 = this.G;
            j jVar = this.f49550d0;
            if (!z10) {
                jVar.c(motionEvent.getActionIndex(), motionEvent);
                getParent().requestDisallowInterceptTouchEvent(false);
                this.f49567o0 = false;
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
                        int i11 = y10 - this.f49543a1;
                        if (jVar.f49601n[0] == null && !jVar.f49592c) {
                            boolean z11 = this.f49567o0;
                            int i12 = this.f49580x0;
                            if (z11) {
                                if ((this.f49554e1 && System.currentTimeMillis() - this.f49551d1 > 200) || Math.abs(i10) > Math.abs(i11) || Math.abs(i11) < i12) {
                                    z4 = true;
                                }
                                this.Z0 = x10;
                                this.f49543a1 = y10;
                                getParent().requestDisallowInterceptTouchEvent(z4);
                                C(x10, y10);
                                return true;
                            }
                            if (rectF.contains(this.f49546b1, this.f49549c1)) {
                                int i13 = this.f49546b1 - x10;
                                int i14 = this.f49549c1 - y10;
                                if (Math.sqrt((i14 * i14) + (i13 * i13)) > i12 || System.currentTimeMillis() - this.f49551d1 > 200) {
                                    this.f49567o0 = true;
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
                    if (rectF.contains(this.f49546b1, this.f49549c1) && !this.f49567o0) {
                        c(false);
                    }
                    h[] hVarArr = jVar.f49601n;
                    h hVar = hVarArr[0];
                    if (hVar != null && (valueAnimator2 = hVar.f49587e) != null) {
                        valueAnimator2.cancel();
                    }
                    h hVar2 = hVarArr[1];
                    if (hVar2 != null && (valueAnimator = hVar2.f49587e) != null) {
                        valueAnimator.cancel();
                    }
                    hVarArr[0] = null;
                    hVarArr[1] = null;
                    I();
                    getParent().requestDisallowInterceptTouchEvent(false);
                    this.f49567o0 = false;
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
            this.f49551d1 = System.currentTimeMillis();
            getParent().requestDisallowInterceptTouchEvent(true);
            if (!jVar.a(x10, y10, motionEvent.getActionIndex())) {
                this.Z0 = x10;
                this.f49546b1 = x10;
                this.f49543a1 = y10;
                this.f49549c1 = y10;
                if (rectF.contains(x10, y10)) {
                    if (this.f49568p0 < 0 || !this.f49557f1) {
                        this.f49567o0 = true;
                        C(x10, y10);
                        return true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public void p(android.graphics.Canvas r14, yf.d r15) {
        throw new UnsupportedOperationException("Method not decompiled: wf.g.p(android.graphics.Canvas, yf.d):void");
    }

    public long r(int i10, int i11) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        long j10 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            if (((yf.f) arrayList.get(i12)).f50932n) {
                long rMaxQ = ((yf.f) arrayList.get(i12)).f50921a.f50540b.rMaxQ(i10, i11);
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
            if (((yf.f) arrayList.get(i12)).f50932n) {
                long rMinQ = ((yf.f) arrayList.get(i12)).f50921a.f50540b.rMinQ(i10, i11);
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

    public void setHeader(yf.c cVar) {
        this.f49559g1 = cVar;
    }

    public void setLandscape(boolean z4) {
        this.F = z4;
    }

    public void t() {
        this.I.setStrokeWidth(1.0f);
        this.J.setStrokeWidth(f49524i1);
        TextPaint textPaint = this.K;
        float f10 = f49525j1;
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
        yf.e g10 = g();
        this.f49569q0 = g10;
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
            yf.f fVar = (yf.f) obj;
            boolean z4 = fVar.f50932n;
            xf.a aVar = fVar.f50921a;
            if (z4) {
                long j10 = aVar.f50542e;
                if (((float) j10) > this.f49558g0) {
                    this.f49558g0 = (float) j10;
                }
            }
            if (z4) {
                long j11 = aVar.f50543f;
                if (((float) j11) < this.f49560h0) {
                    this.f49560h0 = (float) j11;
                }
            }
            float f10 = this.f49558g0;
            float f11 = this.f49560h0;
            if (f10 == f11) {
                this.f49558g0 = f10 + 1.0f;
                this.f49560h0 = f11 - 1.0f;
            }
        }
    }

    public final void v() {
        int measuredHeight = getMeasuredHeight() - this.f49572s;
        float f10 = this.f49579x;
        if (f10 != 0.0f && measuredHeight != 0) {
            this.B = (f10 / measuredHeight) * f49525j1;
        }
    }

    public final void w() {
        float f10;
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            float f11 = f49523h1;
            this.f49583z0 = getMeasuredWidth() - (2.0f * f11);
            this.A0 = f11;
            float measuredWidth = getMeasuredWidth();
            if (this.F) {
                f10 = f49530p1;
            } else {
                f10 = f11;
            }
            float f12 = measuredWidth - f10;
            this.B0 = f12;
            float f13 = f12 - this.A0;
            this.C0 = f13;
            j jVar = this.f49550d0;
            this.D0 = f13 / (jVar.f49599l - jVar.f49598k);
            I();
            this.f49572s = AndroidUtilities.dp(100.0f);
            this.E0.set(this.A0 - f11, 0.0f, this.B0 + f11, getMeasuredHeight() - this.f49572s);
            if (this.f49553e0 != null) {
                this.f49564l0 = (int) (AndroidUtilities.dp(20.0f) / (this.f49583z0 / this.f49553e0.f50546a.length));
            }
            v();
        }
    }

    public final void x(float f10) {
        int i10;
        float f11;
        xf.b bVar = this.f49553e0;
        if (bVar != null && (i10 = this.f49568p0) >= 0) {
            long[] jArr = bVar.f50546a;
            if (i10 < jArr.length && this.f49571r0) {
                this.f49569q0.c(i10, jArr[i10], this.d, false, bVar.f50553j, bVar.h);
                this.f49569q0.setVisibility(0);
                this.f49569q0.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
                float f12 = (this.f49553e0.f50547b[this.f49568p0] * this.D0) - f10;
                int i11 = f49535u1;
                if (f12 > (this.A0 + this.C0) / 2.0f) {
                    f11 = f12 - (this.f49569q0.getWidth() + i11);
                } else {
                    f11 = f12 + i11;
                }
                if (f11 < 0.0f) {
                    f11 = 0.0f;
                } else if (this.f49569q0.getMeasuredWidth() + f11 > getMeasuredWidth()) {
                    f11 = getMeasuredWidth() - this.f49569q0.getMeasuredWidth();
                }
                this.f49569q0.setTranslationX(f11);
            }
        }
    }

    public void z() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3;
        A(true, true, true);
        ArrayList arrayList = this.d;
        this.f49562j0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.f49563k0 = i10;
            int i11 = this.f49563k0;
            if (i11 >= this.f49562j0) {
                break;
            }
            final yf.f fVar = (yf.f) arrayList.get(i11);
            if (fVar.f50932n && (valueAnimator3 = fVar.f50927i) != null) {
                valueAnimator3.cancel();
            }
            if (!fVar.f50932n && (valueAnimator2 = fVar.h) != null) {
                valueAnimator2.cancel();
            }
            if (fVar.f50932n && fVar.f50933o != 1.0f) {
                ValueAnimator valueAnimator4 = fVar.h;
                if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                    ValueAnimator e6 = e(fVar.f50933o, 1.0f, new ValueAnimator.AnimatorUpdateListener(this) {
                        public final g f49513b;

                        {
                            this.f49513b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                            switch (r3) {
                                case 0:
                                    g gVar = this.f49513b;
                                    gVar.getClass();
                                    fVar.f50933o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    gVar.E = true;
                                    gVar.invalidate();
                                    return;
                                default:
                                    g gVar2 = this.f49513b;
                                    gVar2.getClass();
                                    fVar.f50933o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    gVar2.E = true;
                                    gVar2.invalidate();
                                    return;
                            }
                        }
                    });
                    fVar.h = e6;
                    e6.start();
                } else {
                    i10 = this.f49563k0 + 1;
                }
            }
            if (!fVar.f50932n && fVar.f50933o != 0.0f && ((valueAnimator = fVar.f50927i) == null || !valueAnimator.isRunning())) {
                ValueAnimator e10 = e(fVar.f50933o, 0.0f, new ValueAnimator.AnimatorUpdateListener(this) {
                    public final g f49513b;

                    {
                        this.f49513b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                        switch (r3) {
                            case 0:
                                g gVar = this.f49513b;
                                gVar.getClass();
                                fVar.f50933o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                gVar.E = true;
                                gVar.invalidate();
                                return;
                            default:
                                g gVar2 = this.f49513b;
                                gVar2.getClass();
                                fVar.f50933o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                gVar2.E = true;
                                gVar2.invalidate();
                                return;
                        }
                    }
                });
                fVar.f50927i = e10;
                e10.start();
            }
            i10 = this.f49563k0 + 1;
        }
        K();
        if (this.f49571r0) {
            yf.e eVar = this.f49569q0;
            int i12 = this.f49568p0;
            xf.b bVar = this.f49553e0;
            eVar.c(i12, bVar.f50546a[i12], arrayList, true, bVar.f50553j, bVar.h);
        }
    }

    public void q(yf.j jVar) {
    }

    public void y() {
    }
}
