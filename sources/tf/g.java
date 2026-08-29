package tf;

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
import bg.b3;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.x3;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.cc1;
import org.telegram.ui.d91;
import org.telegram.ui.zk0;
public abstract class g extends View implements i {
    public static final float f48234g1 = AndroidUtilities.dpf2(16.0f);
    public static final float f48235h1 = AndroidUtilities.dpf2(1.5f);
    public static final float f48236i1 = AndroidUtilities.dpf2(12.0f);
    public static final int f48237j1 = AndroidUtilities.dp(18.0f);
    public static final int f48238k1 = AndroidUtilities.dp(14.0f);
    public static final int l1 = AndroidUtilities.dp(10.0f);
    public static final int f48239m1 = AndroidUtilities.dp(16.0f);
    public static final int f48240n1 = AndroidUtilities.dp(24.0f);
    public static final int f48241o1 = AndroidUtilities.dp(16.0f);
    public static final int f48242p1 = AndroidUtilities.dp(10.0f);
    public static final int f48243q1 = AndroidUtilities.dp(12.0f);
    public static final int f48244r1 = AndroidUtilities.dp(8.0f);
    public static final int f48245s1 = AndroidUtilities.dp(6.0f);
    public static final int f48246t1 = AndroidUtilities.dp(5.0f);
    public static final int f48247u1 = AndroidUtilities.dp(2.0f);
    public static final int f48248v1 = AndroidUtilities.dp(1.0f);
    public static final boolean f48249w1;
    public static final boolean f48250x1;
    public static final u1.a f48251y1;
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
    public final cc1 K0;
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
    public f f48252a;
    public ValueAnimator f48253a0;
    public int f48254a1;
    public final ArrayList f48255b;
    public boolean f48256b0;
    public int f48257b1;
    public final ArrayList f48258c;
    public final j f48259c0;
    public long f48260c1;
    public final ArrayList d;
    public uf.b f48261d0;
    public boolean f48262d1;
    public boolean f48263e;
    public vf.b f48264e0;
    public boolean f48265e1;
    public float f48266f;
    public float f48267f0;
    public vf.c f48268f1;
    public float f48269g0;
    public float h;
    public float f48270h0;
    public int f48271i0;
    public int f48272j0;
    public int f48273k0;
    public Bitmap f48274l0;
    public Canvas m0;
    public int f48275n;
    public boolean f48276n0;
    public int f48277o0;
    public vf.e f48278p0;
    public boolean f48279q0;
    public int f48280r;
    public float f48281r0;
    public int f48282s;
    public boolean f48283s0;
    public boolean f48284t0;
    public int f48285u0;
    public float v;
    public vf.j f48286v0;
    public float f48287w;
    public final int f48288w0;
    public float f48289x;
    public final int f48290x0;
    public float f48291y;
    public float f48292y0;
    public float f48293z0;

    static {
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        boolean z11 = false;
        if (i10 < 28) {
            z10 = true;
        } else {
            z10 = false;
        }
        f48249w1 = z10;
        if (i10 > 21) {
            z11 = true;
        }
        f48250x1 = z11;
        f48251y1 = new u1.a();
    }

    public g(Context context, c6 c6Var) {
        super(context);
        this.f48255b = new ArrayList(10);
        this.f48258c = new ArrayList(25);
        this.d = new ArrayList();
        this.f48263e = true;
        this.v = 250.0f;
        this.f48287w = 0.0f;
        this.f48289x = 0.0f;
        this.f48291y = 0.0f;
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
        this.f48256b0 = false;
        ?? obj = new Object();
        obj.h = new Rect();
        obj.f48306i = new Rect();
        obj.f48307j = new Rect();
        obj.f48308k = 0.7f;
        obj.f48309l = 1.0f;
        obj.f48310m = 0.1f;
        obj.f48311n = new h[]{null, null};
        obj.f48300a = this;
        this.f48259c0 = obj;
        this.f48276n0 = false;
        this.f48277o0 = -1;
        this.f48279q0 = false;
        this.f48281r0 = 0.0f;
        this.f48283s0 = false;
        this.f48284t0 = false;
        this.f48285u0 = 0;
        this.f48290x0 = AndroidUtilities.dp(46.0f);
        this.D0 = new RectF();
        this.F0 = new d(this, 0);
        this.G0 = new d(this, 1);
        this.H0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final g f48222b;

            {
                this.f48222b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        g gVar = this.f48222b;
                        gVar.getClass();
                        gVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar.invalidate();
                        return;
                    default:
                        g gVar2 = this.f48222b;
                        gVar2.getClass();
                        gVar2.f48287w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar2.invalidate();
                        return;
                }
            }
        };
        this.I0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final g f48222b;

            {
                this.f48222b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        g gVar = this.f48222b;
                        gVar.getClass();
                        gVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar.invalidate();
                        return;
                    default:
                        g gVar2 = this.f48222b;
                        gVar2.getClass();
                        gVar2.f48287w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar2.invalidate();
                        return;
                }
            }
        };
        this.J0 = new d(this, 2);
        this.K0 = new cc1(this, 11);
        this.L0 = false;
        this.T0 = 0;
        this.U0 = 0;
        Rect rect = new Rect();
        this.V0 = rect;
        ArrayList arrayList = new ArrayList();
        this.W0 = arrayList;
        arrayList.add(rect);
        this.X0 = 0L;
        this.f48265e1 = false;
        this.S0 = c6Var;
        t();
        this.f48288w0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public static void b(Path path, float f9, float f10, float f11, float f12, float f13, float f14, boolean z10, boolean z11, boolean z12, boolean z13) {
        path.reset();
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        float f15 = f11 - f9;
        float f16 = f12 - f10;
        float f17 = f15 / 2.0f;
        if (f13 > f17) {
            f13 = f17;
        }
        float f18 = f16 / 2.0f;
        if (f14 > f18) {
            f14 = f18;
        }
        float f19 = f15 - (f13 * 2.0f);
        float f20 = f16 - (2.0f * f14);
        path.moveTo(f11, f10 + f14);
        if (z11) {
            float f21 = -f14;
            path.rQuadTo(0.0f, f21, -f13, f21);
        } else {
            path.rLineTo(0.0f, -f14);
            path.rLineTo(-f13, 0.0f);
        }
        path.rLineTo(-f19, 0.0f);
        if (z10) {
            float f22 = -f13;
            path.rQuadTo(f22, 0.0f, f22, f14);
        } else {
            path.rLineTo(-f13, 0.0f);
            path.rLineTo(0.0f, f14);
        }
        path.rLineTo(0.0f, f20);
        if (z13) {
            path.rQuadTo(0.0f, f14, f13, f14);
        } else {
            path.rLineTo(0.0f, f14);
            path.rLineTo(f13, 0.0f);
        }
        path.rLineTo(f19, 0.0f);
        if (z12) {
            path.rQuadTo(f13, 0.0f, f13, -f14);
        } else {
            path.rLineTo(f13, 0.0f);
            path.rLineTo(0.0f, -f14);
        }
        path.rLineTo(0.0f, -f20);
        path.close();
    }

    public static ValueAnimator e(float f9, float f10, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, f10);
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(f48251y1);
        ofFloat.addUpdateListener(animatorUpdateListener);
        return ofFloat;
    }

    public void A(boolean z10, boolean z11, boolean z12) {
        long j10;
        if (this.f48261d0 == null) {
            return;
        }
        float f9 = this.B0;
        j jVar = this.f48259c0;
        this.C0 = f9 / (jVar.f48309l - jVar.f48308k);
        H();
        if (this.L0) {
            j10 = s(this.B, this.C);
        } else {
            j10 = 0;
        }
        E(r(this.B, this.C), j10, z10, z11, z12);
        if (this.f48279q0 && !z11) {
            c(false);
            x((this.C0 * jVar.f48308k) - f48234g1);
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
        int i12 = this.f48277o0;
        uf.b bVar = this.f48261d0;
        if (bVar != null) {
            float f9 = this.C0;
            float f10 = (this.f48259c0.f48308k * f9) - f48234g1;
            float f11 = (i10 + f10) / f9;
            if (f11 < 0.0f) {
                this.f48277o0 = 0;
            } else if (f11 > 1.0f) {
                this.f48277o0 = bVar.f49197a.length - 1;
            } else {
                int b10 = bVar.b(f11, this.B, this.C);
                this.f48277o0 = b10;
                int i13 = b10 + 1;
                float[] fArr = this.f48261d0.f49198b;
                if (i13 < fArr.length) {
                    if (Math.abs(this.f48261d0.f49198b[this.f48277o0 + 1] - f11) < Math.abs(fArr[b10] - f11)) {
                        this.f48277o0++;
                    }
                }
            }
            int i14 = this.f48277o0;
            int i15 = this.C;
            if (i14 > i15) {
                this.f48277o0 = i15;
            }
            int i16 = this.f48277o0;
            int i17 = this.B;
            if (i16 < i17) {
                this.f48277o0 = i17;
            }
            if (i12 != this.f48277o0) {
                this.f48279q0 = true;
                c(true);
                x(f10);
                e eVar = this.M0;
                if (eVar != null) {
                    getSelectedDate();
                    d91 d91Var = (d91) ((zk0) eVar).f45255b;
                    d91Var.f();
                    d91Var.f37425b.f48278p0.d(false, false);
                }
                B();
                invalidate();
            }
        }
    }

    public boolean D(uf.b bVar) {
        boolean z10;
        uf.b bVar2 = this.f48261d0;
        long j10 = 0;
        j jVar = this.f48259c0;
        ArrayList arrayList = this.d;
        if (bVar2 != bVar) {
            invalidate();
            arrayList.clear();
            if (bVar != null && bVar.d != null) {
                for (int i10 = 0; i10 < bVar.d.size(); i10++) {
                    arrayList.add(h((uf.a) bVar.d.get(i10)));
                }
            }
            d();
            this.f48261d0 = bVar;
            if (bVar != null) {
                if (bVar.f49197a[0] == 0) {
                    jVar.f48308k = 0.0f;
                    jVar.f48309l = 1.0f;
                } else {
                    float minDistance = getMinDistance();
                    jVar.f48310m = minDistance;
                    float f9 = jVar.f48309l;
                    if (f9 - jVar.f48308k < minDistance) {
                        float f10 = f9 - minDistance;
                        jVar.f48308k = f10;
                        if (f10 < 0.0f) {
                            jVar.f48308k = 0.0f;
                            jVar.f48309l = 1.0f;
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
            this.f48267f0 = 0.0f;
            this.f48269g0 = 2.1474836E9f;
            u();
            int i11 = bVar.f49204j;
            if (i11 != 1 && i11 != 2) {
                this.f48278p0.setSize(arrayList.size());
            } else {
                this.f48278p0.setSize(arrayList.size() * 2);
            }
            this.D = true;
            I();
            return z10;
        }
        jVar.f48308k = 0.7f;
        jVar.f48309l = 1.0f;
        this.f48269g0 = 0.0f;
        this.f48267f0 = 0.0f;
        this.f48255b.clear();
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
        float f9;
        boolean z13;
        if (j10 > 100 && ((float) (j10 / 5)) % 10.0f != 0.0f) {
            j12 = ((j10 / 10) + 1) * 10;
        } else {
            j12 = j10;
        }
        if ((Math.abs(((float) (((long) Math.ceil(((float) j12) / 5.0f)) * 5)) - this.f48289x) >= this.A && j10 != 0) || ((float) j10) != this.f48291y) {
            vf.d f10 = f(this.f48261d0.f49203i, j10, j11);
            long[] jArr = f10.f49555a;
            long j13 = jArr[jArr.length - 1];
            long j14 = jArr[0];
            if (!z12) {
                float f11 = this.v - this.f48287w;
                float f12 = (float) (j13 - j14);
                float f13 = f11 / f12;
                if (f13 > 1.0f) {
                    f13 = f12 / f11;
                }
                double d = f13;
                if (d > 0.7d) {
                    f9 = 0.1f;
                } else if (d < 0.1d) {
                    f9 = 0.03f;
                } else {
                    f9 = 0.045f;
                }
                if (((float) j13) != this.f48289x) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (this.L0 && ((float) j14) != this.f48291y) {
                    z13 = true;
                }
                if (z13) {
                    AnimatorSet animatorSet = this.T;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        this.T.cancel();
                    }
                    this.P0 = this.v;
                    this.Q0 = this.f48287w;
                    this.N0 = 0.0f;
                    this.O0 = 0.0f;
                    this.R0 = f9;
                }
            }
            float f14 = (float) j13;
            this.f48289x = f14;
            float f15 = (float) j14;
            this.f48291y = f15;
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
            ArrayList arrayList = this.f48255b;
            if (!z10) {
                this.v = f14;
                this.f48287w = f15;
                arrayList.clear();
                arrayList.add(f10);
                f10.f49559f = 255;
                return;
            }
            arrayList.add(f10);
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
                    animatorSet3.playTogether(e(this.f48287w, f15, this.I0));
                }
                this.T = animatorSet3;
                animatorSet3.start();
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                vf.d dVar = (vf.d) arrayList.get(i10);
                if (dVar != f10) {
                    dVar.f49560g = dVar.f49559f;
                }
            }
            ValueAnimator e10 = e(0.0f, 255.0f, new b3(25, this, f10));
            this.U = e10;
            e10.addListener(new ok0(20, this, f10));
            this.U.start();
        }
    }

    public final void F() {
        float f9 = this.R0;
        if (f9 != 0.0f) {
            float f10 = this.v;
            float f11 = this.f48289x;
            if (f10 != f11) {
                float f12 = this.N0 + f9;
                this.N0 = f12;
                if (f12 > 1.0f) {
                    this.N0 = 1.0f;
                    this.v = f11;
                } else {
                    float f13 = this.P0;
                    this.v = (jr.f29801g.getInterpolation(f12) * (f11 - f13)) + f13;
                }
                invalidate();
            }
            if (this.L0) {
                float f14 = this.f48287w;
                float f15 = this.f48291y;
                if (f14 != f15) {
                    float f16 = this.O0 + this.R0;
                    this.O0 = f16;
                    if (f16 > 1.0f) {
                        this.O0 = 1.0f;
                        this.f48287w = f15;
                    } else {
                        float f17 = this.Q0;
                        this.f48287w = (jr.f29801g.getInterpolation(f16) * (f15 - f17)) + f17;
                    }
                    invalidate();
                }
            }
        }
    }

    public final void G() {
        int i10;
        int i11;
        if (this.f48284t0) {
            i10 = g6.Zi;
        } else {
            i10 = g6.Yi;
        }
        c6 c6Var = this.S0;
        int v02 = g6.v0(i10, c6Var);
        TextPaint textPaint = this.J;
        textPaint.setColor(v02);
        if (this.f48284t0) {
            i11 = g6.Zi;
        } else {
            i11 = g6.Yi;
        }
        this.K.setColor(g6.v0(i11, c6Var));
        int v03 = g6.v0(g6.Yi, c6Var);
        TextPaint textPaint2 = this.L;
        textPaint2.setColor(v03);
        int v04 = g6.v0(g6.aj, c6Var);
        Paint paint = this.H;
        paint.setColor(v04);
        int v05 = g6.v0(g6.bj, c6Var);
        Paint paint2 = this.I;
        paint2.setColor(v05);
        this.M.setColor(g6.v0(g6.dj, c6Var));
        this.N.setColor(g6.v0(g6.cj, c6Var));
        this.O.setColor(g6.v0(g6.f23062d6, c6Var));
        this.P.setColor(g6.v0(g6.ej, c6Var));
        this.f48278p0.b();
        this.f48275n = paint.getAlpha();
        this.f48280r = paint2.getAlpha();
        this.f48266f = textPaint.getAlpha() / 255.0f;
        this.h = textPaint2.getAlpha() / 255.0f;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((vf.f) obj).a();
        }
        if (this.f48279q0) {
            int i13 = this.f48277o0;
            uf.b bVar = this.f48261d0;
            long[] jArr = bVar.f49197a;
            if (i13 < jArr.length) {
                this.f48278p0.c(i13, jArr[i13], arrayList, false, bVar.f49204j, bVar.h);
            }
        }
        this.D = true;
    }

    public final void H() {
        uf.b bVar = this.f48261d0;
        if (bVar == null) {
            return;
        }
        j jVar = this.f48259c0;
        int c3 = bVar.c(Math.max(jVar.f48308k, 0.0f));
        this.B = c3;
        int a2 = this.f48261d0.a(Math.min(jVar.f48309l, 1.0f), c3);
        this.C = a2;
        int i10 = this.B;
        if (a2 < i10) {
            this.C = i10;
        }
        vf.c cVar = this.f48268f1;
        if (cVar != null) {
            long[] jArr = this.f48261d0.f49197a;
            cVar.b(jArr[i10], jArr[this.C]);
        }
        I();
    }

    public final void I() {
        uf.b bVar = this.f48261d0;
        if (bVar != null) {
            float f9 = this.B0;
            if (f9 != 0.0f) {
                int i10 = (int) ((f9 / (this.C0 * bVar.f49202g)) / 6.0f);
                vf.b bVar2 = this.f48264e0;
                if (bVar2 == null || i10 >= bVar2.f49545b || i10 <= bVar2.f49546c) {
                    int highestOneBit = Integer.highestOneBit(i10) << 1;
                    vf.b bVar3 = this.f48264e0;
                    if (bVar3 == null || bVar3.f49544a != highestOneBit) {
                        ValueAnimator valueAnimator = this.V;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllListeners();
                            this.V.cancel();
                        }
                        double d = highestOneBit;
                        double d10 = 0.2d * d;
                        vf.b bVar4 = new vf.b(highestOneBit, (int) (d + d10), (int) (d - d10));
                        bVar4.d = 255;
                        vf.b bVar5 = this.f48264e0;
                        ArrayList arrayList = this.f48258c;
                        if (bVar5 == null) {
                            this.f48264e0 = bVar4;
                            bVar4.d = 255;
                            arrayList.add(bVar4);
                            return;
                        }
                        this.f48264e0 = bVar4;
                        this.f48271i0 = arrayList.size();
                        for (int i11 = 0; i11 < this.f48271i0; i11++) {
                            vf.b bVar6 = (vf.b) arrayList.get(i11);
                            bVar6.f49547e = bVar6.d;
                        }
                        arrayList.add(bVar4);
                        if (arrayList.size() > 2) {
                            arrayList.remove(0);
                        }
                        ValueAnimator duration = e(0.0f, 1.0f, new b3(26, this, bVar4)).setDuration(200L);
                        this.V = duration;
                        duration.addListener(new ok0(21, this, bVar4));
                        this.V.start();
                    }
                }
            }
        }
    }

    public void J(uf.b bVar, long j10) {
        int length = bVar.f49197a.length;
        long j11 = j10 - (j10 % 86400000);
        long j12 = 86399999 + j11;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            long j13 = bVar.f49197a[i12];
            if (j11 > j13) {
                i10 = i12;
            }
            if (j12 > j13) {
                i11 = i12;
            }
        }
        float[] fArr = bVar.f49198b;
        float f9 = fArr[i10];
        j jVar = this.f48259c0;
        jVar.f48308k = f9;
        jVar.f48309l = fArr[i11];
    }

    public void K() {
        if (f48250x1) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j10 = Long.MAX_VALUE;
            long j11 = 0;
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                vf.f fVar = (vf.f) obj;
                boolean z10 = fVar.f49583n;
                uf.a aVar = fVar.f49572a;
                if (z10) {
                    long j12 = aVar.f49193e;
                    if (j12 > j11) {
                        j11 = j12;
                    }
                }
                if (z10) {
                    long j13 = aVar.f49194f;
                    if (j13 < j10) {
                        j10 = j13;
                    }
                }
            }
            if ((j10 != 2147483647L && ((float) j10) != 0.0f) || (j11 > 0 && ((float) j11) != this.f48270h0)) {
                this.f48270h0 = (float) j11;
                Animator animator = this.W;
                if (animator != null) {
                    animator.cancel();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(e(this.f48267f0, this.f48270h0, this.F0), e(this.f48269g0, 0.0f, this.G0));
                this.W = animatorSet;
                animatorSet.start();
            }
        }
    }

    @Override
    public void a(float f9, float f10, boolean z10) {
        uf.b bVar = this.f48261d0;
        if (bVar == null) {
            return;
        }
        if (z10) {
            int c3 = bVar.c(Math.max(f9, 0.0f));
            int a2 = this.f48261d0.a(Math.min(f10, 1.0f), c3);
            E(r(c3, a2), s(c3, a2), true, true, false);
            c(false);
            return;
        }
        H();
        invalidate();
    }

    public final void c(boolean z10) {
        float f9;
        x((this.C0 * this.f48259c0.f48308k) - f48234g1);
        if (this.f48265e1 == z10) {
            return;
        }
        this.f48265e1 = z10;
        ValueAnimator valueAnimator = this.f48253a0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f48253a0.cancel();
        }
        float f10 = this.f48281r0;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        ValueAnimator duration = e(f10, f9, this.J0).setDuration(200L);
        this.f48253a0 = duration;
        duration.addListener(this.K0);
        this.f48253a0.start();
    }

    public final void d() {
        this.f48277o0 = -1;
        this.f48279q0 = false;
        this.f48265e1 = false;
        this.f48278p0.setVisibility(8);
        this.f48281r0 = 0.0f;
    }

    public vf.d f(int i10, long j10, long j11) {
        return new vf.d(j10, j11, this.L0, this.f48261d0.h, i10, this.J, this.K);
    }

    public vf.e g() {
        return new vf.e(getContext(), this.S0);
    }

    public long getEndDate() {
        return this.f48261d0.f49197a[this.C];
    }

    public float getMinDistance() {
        uf.b bVar = this.f48261d0;
        if (bVar == null) {
            return 0.1f;
        }
        int length = bVar.f49197a.length;
        if (length < 5) {
            return 1.0f;
        }
        float f9 = 5.0f / length;
        if (f9 < 0.1f) {
            return 0.1f;
        }
        return f9;
    }

    public long getSelectedDate() {
        int i10 = this.f48277o0;
        if (i10 < 0) {
            return -1L;
        }
        return this.f48261d0.f49197a[i10];
    }

    public long getStartDate() {
        return this.f48261d0.f49197a[this.B];
    }

    public abstract vf.f h(uf.a aVar);

    public void i(Canvas canvas) {
        int measuredHeight;
        if (this.f48261d0 != null) {
            int i10 = this.f48285u0;
            float f9 = 1.0f;
            if (i10 == 2) {
                f9 = 1.0f - this.f48286v0.f49593f;
            } else if (i10 == 1) {
                f9 = this.f48286v0.f49593f;
            } else if (i10 == 3) {
                f9 = this.f48286v0.f49593f;
            }
            Paint paint = this.H;
            paint.setAlpha((int) (this.f48275n * f9));
            TextPaint textPaint = this.J;
            textPaint.setAlpha((int) (this.f48266f * 255.0f * f9));
            this.K.setAlpha((int) (this.f48266f * 255.0f * f9));
            int textSize = (int) (f48237j1 - textPaint.getTextSize());
            float measuredHeight2 = (getMeasuredHeight() - this.f48282s) - 1;
            canvas.drawLine(this.f48293z0, measuredHeight2, this.A0, measuredHeight2, paint);
            if (this.L0) {
                return;
            }
            canvas.drawText("0", f48234g1, measuredHeight - textSize, textPaint);
        }
    }

    public void j(Canvas canvas) {
        float f9;
        int i10;
        if (this.f48261d0 != null) {
            ArrayList arrayList = this.f48258c;
            this.f48271i0 = arrayList.size();
            int i11 = this.f48285u0;
            float f10 = 1.0f;
            int i12 = 1;
            if (i11 == 2) {
                f9 = 1.0f - this.f48286v0.f49593f;
            } else if (i11 == 1) {
                f9 = this.f48286v0.f49593f;
            } else if (i11 == 3) {
                f9 = this.f48286v0.f49593f;
            } else {
                f9 = 1.0f;
            }
            char c3 = 0;
            this.f48272j0 = 0;
            while (true) {
                int i13 = this.f48272j0;
                if (i13 < this.f48271i0) {
                    int i14 = ((vf.b) arrayList.get(i13)).d;
                    int i15 = ((vf.b) arrayList.get(this.f48272j0)).f49544a;
                    if (i15 == 0) {
                        i15 = 1;
                    }
                    int i16 = this.B - this.f48273k0;
                    while (i16 % i15 != 0) {
                        i16--;
                    }
                    int i17 = this.C - this.f48273k0;
                    while (true) {
                        if (i17 % i15 == 0 && i17 >= this.f48261d0.f49197a.length - i12) {
                            break;
                        }
                        i17++;
                        i14 = i14;
                        c3 = 0;
                        f10 = 1.0f;
                        i12 = 1;
                    }
                    int i18 = this.f48273k0;
                    int i19 = i16 + i18;
                    int i20 = i17 + i18;
                    float f11 = this.C0 * this.f48259c0.f48308k;
                    float f12 = f48234g1;
                    float f13 = f11 - f12;
                    while (i19 < i20) {
                        if (i19 >= 0) {
                            long[] jArr = this.f48261d0.f49197a;
                            if (i19 < jArr.length - i12) {
                                long j10 = jArr[i19];
                                long j11 = jArr[c3];
                                i10 = i14;
                                float f14 = ((((float) (j10 - j11)) / ((float) (jArr[jArr.length - i12] - j11))) * this.C0) - f13;
                                float f15 = f14 - f48242p1;
                                if (f15 > 0.0f) {
                                    float f16 = this.B0;
                                    if (f15 <= f16 + f12) {
                                        float f17 = l1;
                                        TextPaint textPaint = this.L;
                                        if (f15 < f17) {
                                            textPaint.setAlpha((int) (i10 * x3.a(f17, f15, f17, f10) * this.h * f9));
                                        } else if (f15 > f16) {
                                            textPaint.setAlpha((int) (i10 * x3.a(f15, f16, f12, f10) * this.h * f9));
                                        } else {
                                            textPaint.setAlpha((int) (i10 * this.h * f9));
                                        }
                                        uf.b bVar = this.f48261d0;
                                        String[] strArr = bVar.f49199c;
                                        long[] jArr2 = bVar.f49197a;
                                        canvas.drawText(strArr[(int) ((jArr2[i19] - jArr2[0]) / bVar.f49205k)], f14, AndroidUtilities.dp(3.0f) + (getMeasuredHeight() - this.f48282s) + f48238k1, textPaint);
                                        i19 += i15;
                                        i14 = i10;
                                        c3 = 0;
                                        f10 = 1.0f;
                                        i12 = 1;
                                    }
                                }
                                i19 += i15;
                                i14 = i10;
                                c3 = 0;
                                f10 = 1.0f;
                                i12 = 1;
                            }
                        }
                        i10 = i14;
                        i19 += i15;
                        i14 = i10;
                        c3 = 0;
                        f10 = 1.0f;
                        i12 = 1;
                    }
                    this.f48272j0++;
                    c3 = 0;
                    f10 = 1.0f;
                    i12 = 1;
                } else {
                    return;
                }
            }
        }
    }

    public abstract void k(Canvas canvas);

    public void l(android.graphics.Canvas r12, vf.d r13) {
        throw new UnsupportedOperationException("Method not decompiled: tf.g.l(android.graphics.Canvas, vf.d):void");
    }

    public final void m(android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: tf.g.m(android.graphics.Canvas):void");
    }

    public abstract void n(Canvas canvas);

    public void o(Canvas canvas) {
        uf.b bVar;
        int i10 = this.f48277o0;
        if (i10 >= 0 && this.f48279q0 && (bVar = this.f48261d0) != null) {
            int i11 = (int) (this.f48280r * this.f48281r0);
            float f9 = this.B0;
            j jVar = this.f48259c0;
            float f10 = jVar.f48309l;
            float f11 = jVar.f48308k;
            float f12 = f9 / (f10 - f11);
            float f13 = (f11 * f12) - f48234g1;
            float[] fArr = bVar.f49198b;
            if (i10 < fArr.length) {
                float f14 = (fArr[i10] * f12) - f13;
                Paint paint = this.I;
                paint.setAlpha(i11);
                canvas.drawLine(f14, 0.0f, f14, this.D0.bottom, paint);
                if (this.f48263e) {
                    ArrayList arrayList = this.d;
                    this.f48271i0 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        this.f48272j0 = i12;
                        int i13 = this.f48272j0;
                        if (i13 < this.f48271i0) {
                            vf.f fVar = (vf.f) arrayList.get(i13);
                            boolean z10 = fVar.f49583n;
                            Paint paint2 = fVar.d;
                            if (z10 || fVar.f49584o != 0.0f) {
                                float f15 = (float) fVar.f49572a.f49190a[this.f48277o0];
                                float f16 = this.f48287w;
                                float measuredHeight = (getMeasuredHeight() - this.f48282s) - (((f15 - f16) / (this.v - f16)) * ((getMeasuredHeight() - this.f48282s) - f48237j1));
                                paint2.setAlpha((int) (fVar.f49584o * 255.0f * this.f48281r0));
                                Paint paint3 = this.O;
                                paint3.setAlpha((int) (fVar.f49584o * 255.0f * this.f48281r0));
                                canvas.drawPoint(f14, measuredHeight, paint2);
                                canvas.drawPoint(f14, measuredHeight, paint3);
                            }
                            i12 = this.f48272j0 + 1;
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
        if (this.f48283s0) {
            super.onDraw(canvas);
            return;
        }
        F();
        int save = canvas.save();
        RectF rectF = this.D0;
        canvas.clipRect(0.0f, rectF.top, getMeasuredWidth(), rectF.bottom);
        i(canvas);
        ArrayList arrayList = this.f48255b;
        this.f48271i0 = arrayList.size();
        int i10 = 0;
        this.f48272j0 = 0;
        while (true) {
            int i11 = this.f48272j0;
            if (i11 >= this.f48271i0) {
                break;
            }
            l(canvas, (vf.d) arrayList.get(i11));
            this.f48272j0++;
        }
        k(canvas);
        while (true) {
            this.f48272j0 = i10;
            int i12 = this.f48272j0;
            if (i12 < this.f48271i0) {
                p(canvas, (vf.d) arrayList.get(i12));
                i10 = this.f48272j0 + 1;
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
        if (!this.E) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i10));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.displaySize.y - AndroidUtilities.dp(56.0f));
        }
        int measuredWidth = getMeasuredWidth();
        int i12 = this.T0;
        int i13 = this.f48290x0;
        if (measuredWidth != i12 || getMeasuredHeight() != this.U0) {
            this.T0 = getMeasuredWidth();
            this.U0 = getMeasuredHeight();
            float f9 = f48234g1;
            float f10 = 2.0f * f9;
            this.f48274l0 = Bitmap.createBitmap((int) (getMeasuredWidth() - f10), i13, Bitmap.Config.ARGB_4444);
            this.m0 = new Canvas(this.f48274l0);
            this.f48252a.a(i13, (int) (getMeasuredWidth() - f10));
            w();
            if (this.f48279q0) {
                x((this.C0 * this.f48259c0.f48308k) - f9);
            }
            A(false, true, false);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int measuredHeight = getMeasuredHeight();
            int i14 = f48239m1;
            this.V0.set(0, measuredHeight - ((i13 + i14) + i14), getMeasuredWidth(), getMeasuredHeight());
            setSystemGestureExclusionRects(this.W0);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        long j10;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean z10 = false;
        if (this.f48261d0 != null) {
            boolean z11 = this.F;
            j jVar = this.f48259c0;
            if (!z11) {
                jVar.c(motionEvent.getActionIndex(), motionEvent);
                getParent().requestDisallowInterceptTouchEvent(false);
                this.f48276n0 = false;
                return false;
            }
            int x4 = (int) motionEvent.getX(motionEvent.getActionIndex());
            int y8 = (int) motionEvent.getY(motionEvent.getActionIndex());
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
                                return jVar.a(x4, y8, motionEvent.getActionIndex());
                            }
                        }
                    } else {
                        int i10 = x4 - this.Y0;
                        int i11 = y8 - this.Z0;
                        if (jVar.f48311n[0] == null && !jVar.f48302c) {
                            boolean z12 = this.f48276n0;
                            int i12 = this.f48288w0;
                            if (z12) {
                                if ((this.f48262d1 && System.currentTimeMillis() - this.f48260c1 > 200) || Math.abs(i10) > Math.abs(i11) || Math.abs(i11) < i12) {
                                    z10 = true;
                                }
                                this.Y0 = x4;
                                this.Z0 = y8;
                                getParent().requestDisallowInterceptTouchEvent(z10);
                                C(x4, y8);
                                return true;
                            }
                            if (rectF.contains(this.f48254a1, this.f48257b1)) {
                                int i13 = this.f48254a1 - x4;
                                int i14 = this.f48257b1 - y8;
                                if (Math.sqrt((i14 * i14) + (i13 * i13)) > i12 || System.currentTimeMillis() - this.f48260c1 > 200) {
                                    this.f48276n0 = true;
                                    C(x4, y8);
                                    return true;
                                }
                            }
                            return true;
                        }
                        boolean b10 = jVar.b(x4, motionEvent.getActionIndex());
                        if (motionEvent.getPointerCount() > 1) {
                            motionEvent.getY(1);
                            jVar.b((int) motionEvent.getX(1), 1);
                        }
                        getParent().requestDisallowInterceptTouchEvent(b10);
                        return true;
                    }
                }
                if (!jVar.c(motionEvent.getActionIndex(), motionEvent)) {
                    if (rectF.contains(this.f48254a1, this.f48257b1) && !this.f48276n0) {
                        c(false);
                    }
                    h[] hVarArr = jVar.f48311n;
                    h hVar = hVarArr[0];
                    if (hVar != null && (valueAnimator2 = hVar.f48297e) != null) {
                        valueAnimator2.cancel();
                    }
                    h hVar2 = hVarArr[1];
                    if (hVar2 != null && (valueAnimator = hVar2.f48297e) != null) {
                        valueAnimator.cancel();
                    }
                    hVarArr[0] = null;
                    hVarArr[1] = null;
                    I();
                    getParent().requestDisallowInterceptTouchEvent(false);
                    this.f48276n0 = false;
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
            this.f48260c1 = System.currentTimeMillis();
            getParent().requestDisallowInterceptTouchEvent(true);
            if (!jVar.a(x4, y8, motionEvent.getActionIndex())) {
                this.Y0 = x4;
                this.f48254a1 = x4;
                this.Z0 = y8;
                this.f48257b1 = y8;
                if (rectF.contains(x4, y8)) {
                    if (this.f48277o0 < 0 || !this.f48265e1) {
                        this.f48276n0 = true;
                        C(x4, y8);
                        return true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public void p(android.graphics.Canvas r14, vf.d r15) {
        throw new UnsupportedOperationException("Method not decompiled: tf.g.p(android.graphics.Canvas, vf.d):void");
    }

    public long r(int i10, int i11) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        long j10 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            if (((vf.f) arrayList.get(i12)).f49583n) {
                long rMaxQ = ((vf.f) arrayList.get(i12)).f49572a.f49191b.rMaxQ(i10, i11);
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
            if (((vf.f) arrayList.get(i12)).f49583n) {
                long rMinQ = ((vf.f) arrayList.get(i12)).f49572a.f49191b.rMinQ(i10, i11);
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

    public void setHeader(vf.c cVar) {
        this.f48268f1 = cVar;
    }

    public void setLandscape(boolean z10) {
        this.E = z10;
    }

    public void t() {
        this.H.setStrokeWidth(1.0f);
        this.I.setStrokeWidth(f48235h1);
        TextPaint textPaint = this.J;
        float f9 = f48236i1;
        textPaint.setTextSize(f9);
        TextPaint textPaint2 = this.K;
        textPaint2.setTextSize(f9);
        textPaint2.setTextAlign(Paint.Align.RIGHT);
        TextPaint textPaint3 = this.L;
        textPaint3.setTextSize(f9);
        textPaint3.setTextAlign(Paint.Align.CENTER);
        float dpf2 = AndroidUtilities.dpf2(6.0f);
        Paint paint = this.O;
        paint.setStrokeWidth(dpf2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        setLayerType(2, null);
        setWillNotDraw(false);
        vf.e g10 = g();
        this.f48278p0 = g10;
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
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            vf.f fVar = (vf.f) obj;
            boolean z10 = fVar.f49583n;
            uf.a aVar = fVar.f49572a;
            if (z10) {
                long j10 = aVar.f49193e;
                if (((float) j10) > this.f48267f0) {
                    this.f48267f0 = (float) j10;
                }
            }
            if (z10) {
                long j11 = aVar.f49194f;
                if (((float) j11) < this.f48269g0) {
                    this.f48269g0 = (float) j11;
                }
            }
            float f9 = this.f48267f0;
            float f10 = this.f48269g0;
            if (f9 == f10) {
                this.f48267f0 = f9 + 1.0f;
                this.f48269g0 = f10 - 1.0f;
            }
        }
    }

    public final void v() {
        int measuredHeight = getMeasuredHeight() - this.f48282s;
        float f9 = this.f48289x;
        if (f9 != 0.0f && measuredHeight != 0) {
            this.A = (f9 / measuredHeight) * f48236i1;
        }
    }

    public final void w() {
        float f9;
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            float f10 = f48234g1;
            this.f48292y0 = getMeasuredWidth() - (2.0f * f10);
            this.f48293z0 = f10;
            float measuredWidth = getMeasuredWidth();
            if (this.E) {
                f9 = f48241o1;
            } else {
                f9 = f10;
            }
            float f11 = measuredWidth - f9;
            this.A0 = f11;
            float f12 = f11 - this.f48293z0;
            this.B0 = f12;
            j jVar = this.f48259c0;
            this.C0 = f12 / (jVar.f48309l - jVar.f48308k);
            I();
            this.f48282s = AndroidUtilities.dp(100.0f);
            this.D0.set(this.f48293z0 - f10, 0.0f, this.A0 + f10, getMeasuredHeight() - this.f48282s);
            if (this.f48261d0 != null) {
                this.f48273k0 = (int) (AndroidUtilities.dp(20.0f) / (this.f48292y0 / this.f48261d0.f49197a.length));
            }
            v();
        }
    }

    public final void x(float f9) {
        int i10;
        float f10;
        uf.b bVar = this.f48261d0;
        if (bVar != null && (i10 = this.f48277o0) >= 0) {
            long[] jArr = bVar.f49197a;
            if (i10 < jArr.length && this.f48279q0) {
                this.f48278p0.c(i10, jArr[i10], this.d, false, bVar.f49204j, bVar.h);
                this.f48278p0.setVisibility(0);
                this.f48278p0.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
                float f11 = (this.f48261d0.f49198b[this.f48277o0] * this.C0) - f9;
                int i11 = f48246t1;
                if (f11 > (this.f48293z0 + this.B0) / 2.0f) {
                    f10 = f11 - (this.f48278p0.getWidth() + i11);
                } else {
                    f10 = f11 + i11;
                }
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                } else if (this.f48278p0.getMeasuredWidth() + f10 > getMeasuredWidth()) {
                    f10 = getMeasuredWidth() - this.f48278p0.getMeasuredWidth();
                }
                this.f48278p0.setTranslationX(f10);
            }
        }
    }

    public void z() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3;
        A(true, true, true);
        ArrayList arrayList = this.d;
        this.f48271i0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.f48272j0 = i10;
            int i11 = this.f48272j0;
            if (i11 >= this.f48271i0) {
                break;
            }
            final vf.f fVar = (vf.f) arrayList.get(i11);
            if (fVar.f49583n && (valueAnimator3 = fVar.f49578i) != null) {
                valueAnimator3.cancel();
            }
            if (!fVar.f49583n && (valueAnimator2 = fVar.h) != null) {
                valueAnimator2.cancel();
            }
            if (fVar.f49583n && fVar.f49584o != 1.0f) {
                ValueAnimator valueAnimator4 = fVar.h;
                if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                    ValueAnimator e10 = e(fVar.f49584o, 1.0f, new ValueAnimator.AnimatorUpdateListener(this) {
                        public final g f48224b;

                        {
                            this.f48224b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                            switch (r3) {
                                case 0:
                                    g gVar = this.f48224b;
                                    gVar.getClass();
                                    fVar.f49584o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    gVar.D = true;
                                    gVar.invalidate();
                                    return;
                                default:
                                    g gVar2 = this.f48224b;
                                    gVar2.getClass();
                                    fVar.f49584o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    gVar2.D = true;
                                    gVar2.invalidate();
                                    return;
                            }
                        }
                    });
                    fVar.h = e10;
                    e10.start();
                } else {
                    i10 = this.f48272j0 + 1;
                }
            }
            if (!fVar.f49583n && fVar.f49584o != 0.0f && ((valueAnimator = fVar.f49578i) == null || !valueAnimator.isRunning())) {
                ValueAnimator e11 = e(fVar.f49584o, 0.0f, new ValueAnimator.AnimatorUpdateListener(this) {
                    public final g f48224b;

                    {
                        this.f48224b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                        switch (r3) {
                            case 0:
                                g gVar = this.f48224b;
                                gVar.getClass();
                                fVar.f49584o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                gVar.D = true;
                                gVar.invalidate();
                                return;
                            default:
                                g gVar2 = this.f48224b;
                                gVar2.getClass();
                                fVar.f49584o = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                gVar2.D = true;
                                gVar2.invalidate();
                                return;
                        }
                    }
                });
                fVar.f49578i = e11;
                e11.start();
            }
            i10 = this.f48272j0 + 1;
        }
        K();
        if (this.f48279q0) {
            vf.e eVar = this.f48278p0;
            int i12 = this.f48277o0;
            uf.b bVar = this.f48261d0;
            eVar.c(i12, bVar.f49197a[i12], arrayList, true, bVar.f49204j, bVar.h);
        }
    }

    public void q(vf.j jVar) {
    }

    public void y() {
    }
}
