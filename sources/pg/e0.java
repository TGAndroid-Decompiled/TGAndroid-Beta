package pg;

import ai.b8;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.xv0;
import v7.a7;
public final class e0 {
    public static final tr B = new tr(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;
    public final f1 f41198a;
    public boolean f41199b;
    public boolean f41200c;
    public long d;
    public boolean e;
    public boolean f41201f;
    public w0 f41202g;
    public w0 h;
    public double f41203i;
    public boolean f41204j;
    public float f41205k;
    public boolean f41206l;
    public int f41208n;
    public int f41209o;
    public double f41210p;
    public double f41211q;
    public ValueAnimator f41212r;
    public final n1 f41213s;
    public Matrix f41214t;
    public long v;
    public float f41216w;
    public ValueAnimator f41217x;
    public boolean f41219z;
    public final w0[] f41207m = new w0[3];
    public final float[] f41215u = new float[2];
    public final z f41218y = new z(this, 1);

    public e0(f1 f1Var) {
        this.f41198a = f1Var;
        Context context = f1Var.getContext();
        ii.q1 q1Var = new ii.q1(this, 6);
        final ?? obj = new Object();
        obj.f41281b = new ArrayList();
        obj.f41282c = new ArrayList();
        obj.f41285i = null;
        obj.f41286j = new AtomicBoolean(false);
        obj.f41287k = new AtomicBoolean(false);
        obj.f41288l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: pg.j1.run():void");
            }
        };
        obj.f41283f = context;
        obj.e = q1Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f41284g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f41280a = sharedPreferences.getInt("scoreall", 0);
        n1.f41278m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: pg.j1.run():void");
            }
        });
        this.f41213s = obj;
    }

    public final void a(d dVar, boolean z10, y0 y0Var) {
        Object obj;
        e1 e1Var;
        if (this.f41206l) {
            f1 f1Var = this.f41198a;
            if (!f1Var.getPainting().G && this.f41202g != null) {
                if (dVar == null) {
                    obj = f1Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f41206l = false;
                if (r42 instanceof d) {
                    f1Var.getPainting().E = false;
                }
                s0 painting = f1Var.getPainting();
                painting.f41323f.f(new p0(painting, 1));
                this.f41208n = 0;
                this.f41209o = 0;
                this.f41204j = false;
                this.f41199b = false;
                if (z10 && (e1Var = f1Var.f41222a) != null) {
                    e1Var.f();
                }
                xv0 xv0Var = f1Var.getPainting().f41324g;
                w0 w0Var = this.f41202g;
                float a2 = a7.a((float) w0Var.f41397a, (float) w0Var.f41398b, 0.0f, 0.0f);
                w0 w0Var2 = this.f41202g;
                float max = Math.max(a2, a7.a((float) w0Var2.f41397a, (float) w0Var2.f41398b, xv0Var.f30521a, 0.0f));
                w0 w0Var3 = this.f41202g;
                float a10 = a7.a((float) w0Var3.f41397a, (float) w0Var3.f41398b, 0.0f, xv0Var.f30522b);
                w0 w0Var4 = this.f41202g;
                final float max2 = Math.max(max, Math.max(a10, a7.a((float) w0Var4.f41397a, (float) w0Var4.f41398b, xv0Var.f30521a, xv0Var.f30522b))) / 0.84f;
                ValueAnimator valueAnimator = this.f41212r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f41212r = null;
                }
                ValueAnimator valueAnimator2 = this.f41217x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f41217x = null;
                }
                w0 w0Var5 = this.f41202g;
                final w0 w0Var6 = new w0(w0Var5.f41397a, w0Var5.f41398b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f41217x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        f1 f1Var2 = e0.this.f41198a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        t0 t0Var = new t0(new w0[]{w0Var6});
                        m mVar = r42;
                        mVar.getClass();
                        if (mVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = f1Var2.getCurrentColor();
                        }
                        t0Var.f41363c = currentColor;
                        t0Var.d = floatValue * max2;
                        t0Var.e = mVar;
                        s0 painting2 = f1Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f41323f.f(new b8(painting2, t0Var, true, true, null, 4));
                    }
                });
                this.f41217x.addListener(new c0(this, w0Var6, max2, r42, z10, y0Var));
                this.f41217x.setDuration(450L);
                this.f41217x.setInterpolator(tr.h);
                this.f41217x.start();
                if (z10) {
                    BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
                }
            }
        }
    }

    public final void b(t0 t0Var) {
        f1 f1Var = this.f41198a;
        int currentColor = f1Var.getCurrentColor();
        float currentWeight = f1Var.getCurrentWeight();
        m currentBrush = f1Var.getCurrentBrush();
        t0Var.f41363c = currentColor;
        t0Var.d = currentWeight;
        t0Var.e = currentBrush;
        if (this.f41201f) {
            this.f41203i = 0.0d;
        }
        t0Var.f41361a = this.f41203i;
        s0 painting = f1Var.getPainting();
        boolean z10 = this.f41201f;
        b0 b0Var = new b0(this, t0Var, 0);
        if (painting.L == null) {
            painting.f41323f.f(new b8(painting, t0Var, z10, false, b0Var, 4));
        }
        this.f41201f = false;
    }

    public final void c(float f7, boolean z10) {
        int i10 = this.f41208n;
        w0[] w0VarArr = this.f41207m;
        if (i10 > 2) {
            Vector vector = new Vector();
            w0 w0Var = w0VarArr[0];
            w0 w0Var2 = w0VarArr[1];
            w0 w0Var3 = w0VarArr[2];
            if (w0Var3 != null && w0Var2 != null && w0Var != null) {
                w0 b10 = w0Var2.b(w0Var);
                w0 b11 = w0Var3.b(w0Var2);
                int min = (int) Math.min(48.0d, Math.max(Math.floor(b10.a(b11) / 1), 24.0d));
                float f10 = 1.0f;
                float f11 = 1.0f / min;
                int i11 = 0;
                float f12 = 0.0f;
                while (i11 < min) {
                    float f13 = f10 - f12;
                    double d = f13;
                    double pow = Math.pow(d, 2.0d);
                    double d10 = f12 * f12;
                    double d11 = f13 * f13;
                    double d12 = f12;
                    double d13 = (b11.f41397a * d10) + (w0Var2.f41397a * 2.0d * d12 * d) + (b10.f41397a * d11);
                    double d14 = (b11.f41398b * d10) + (w0Var2.f41398b * 2.0d * d12 * d) + (b10.f41398b * d11);
                    double lerp = ((((b11.f41399c * d10) + ((w0Var2.f41399c * ((2.0f * f13) * f12)) + (b10.f41399c * pow))) - 1.0d) * AndroidUtilities.lerp(f7, 1.0f, w7.q.a(this.f41209o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    w0 w0Var4 = new w0(d13, d14, lerp);
                    if (this.f41200c) {
                        w0Var4.d = true;
                        this.f41200c = false;
                    }
                    vector.add(w0Var4);
                    this.f41210p += lerp;
                    this.f41211q += 1.0d;
                    f12 += f11;
                    i11++;
                    f10 = 1.0f;
                }
                if (z10) {
                    b11.d = true;
                }
                vector.add(b11);
                w0[] w0VarArr2 = new w0[vector.size()];
                vector.toArray(w0VarArr2);
                b(new t0(w0VarArr2));
                System.arraycopy(w0VarArr, 1, w0VarArr, 0, 2);
                if (z10) {
                    this.f41208n = 0;
                    return;
                } else {
                    this.f41208n = 2;
                    return;
                }
            }
            return;
        }
        w0[] w0VarArr3 = new w0[i10];
        System.arraycopy(w0VarArr, 0, w0VarArr3, 0, i10);
        b(new t0(w0VarArr3));
    }
}
