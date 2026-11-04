package xh;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.messenger.k5;
import org.telegram.messenger.zi;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.ib;
public final class h extends Drawable implements Animator.AnimatorListener {
    public static final RectF f58844c0 = new RectF();
    public static final Rect f58845d0 = new Rect();
    public static final int[] f58846e0 = new int[2];
    public static final n8 f58847f0 = new n8("openFactor", 11);
    public static final n8 f58848g0 = new n8("openFactor", 12);
    public final q1 E;
    public final zi F;
    public float G;
    public Bitmap J;
    public BitmapShader K;
    public Paint M;
    public b Q;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public ib X;
    public float Y;
    public float Z;
    public final j f58849a;
    public final i f58851b;
    public final LinearGradient f58855f;
    public final d[] f58860x;
    public final Drawable f58861y;
    public final Paint f58853c = new Paint(1);
    public final Matrix d = new Matrix();
    public final Path f58854e = new Path();
    public final RectF h = new RectF();
    public final RectF f58856n = new RectF();
    public final RectF f58857r = new RectF();
    public final RectF f58858s = new RectF();
    public final RectF f58859w = new RectF();
    public float H = 0.0f;
    public float I = 0.0f;
    public final Matrix L = new Matrix();
    public boolean N = false;
    public boolean O = false;
    public boolean P = false;
    public boolean R = true;
    public int S = -1;
    public final ObjectAnimator f58850a0 = ObjectAnimator.ofFloat(this, f58847f0, 1.0f).setDuration(560L);
    public final ObjectAnimator f58852b0 = ObjectAnimator.ofFloat(this, f58848g0, 1.0f).setDuration(240L);

    public h(j jVar, q1 q1Var, ArrayList arrayList, i iVar) {
        this.f58851b = iVar;
        this.f58849a = jVar;
        this.E = q1Var;
        this.F = q1Var.getMessageObject();
        this.f58860x = new d[Math.min(5, arrayList.size())];
        int i3 = 0;
        while (true) {
            d[] dVarArr = this.f58860x;
            if (i3 < dVarArr.length) {
                dVarArr[i3] = new d(this, ((Long) arrayList.get(i3)).longValue());
                i3++;
            } else {
                this.f58853c.setStyle(Paint.Style.FILL);
                Drawable mutate = jVar.getContext().getDrawable(2131232671).mutate();
                this.f58861y = mutate;
                q1Var.setHideSideButtonByQuickShare(true);
                jVar.performHapticFeedback(3, 1);
                int w02 = k6.w0(k6.G8, this.E.getResourcesProvider());
                mutate.setColorFilter(new PorterDuffColorFilter(k6.x0(null, k6.He, false), PorterDuff.Mode.MULTIPLY));
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, g0.L(100.0f), new int[]{w02, 16777215 & w02}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f58855f = linearGradient;
                this.f58853c.setShader(linearGradient);
                ObjectAnimator objectAnimator = this.f58850a0;
                LinearInterpolator linearInterpolator = f.f58825b;
                objectAnimator.setInterpolator(linearInterpolator);
                this.f58850a0.addListener(this);
                this.f58852b0.setInterpolator(linearInterpolator);
                this.f58852b0.addListener(this);
                g0.l2(new xg.d(this, 2), 15.0f);
                return;
            }
        }
    }

    public static float b(float f10, float f11, float f12, float f13) {
        return (float) Math.toDegrees((float) Math.atan2(f13 - f11, f12 - f10));
    }

    public static PointF f(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10) {
        float f16 = f13 - f10;
        float f17 = f14 - f11;
        float sqrt = (float) Math.sqrt(Math.pow(f17, 2.0d) + Math.pow(f16, 2.0d));
        if (sqrt <= f12 + f15 && sqrt >= Math.abs(f12 - f15)) {
            float f18 = f12 * f12;
            float f19 = ((sqrt * sqrt) + (f18 - (f15 * f15))) / (2.0f * sqrt);
            float sqrt2 = (float) Math.sqrt(f18 - (f19 * f19));
            float e10 = a1.g.e(f19, f16, sqrt, f10);
            float e11 = a1.g.e(f19, f17, sqrt, f11);
            float f20 = (f17 * sqrt2) / sqrt;
            float f21 = e10 + f20;
            float f22 = (sqrt2 * f16) / sqrt;
            float f23 = e11 - f22;
            float f24 = e10 - f20;
            float f25 = e11 + f22;
            if (f21 != f24 && f21 < f24) {
                if (z10) {
                    return new PointF(f21, f23);
                }
                return new PointF(f24, f25);
            } else if (f23 > f25) {
                return new PointF(f21, f23);
            } else {
                return new PointF(f24, f25);
            }
        }
        return null;
    }

    public static float g(float f10, float f11, float f12) {
        return com.google.android.recaptcha.internal.a.y(f11, f10, f12, f10);
    }

    public static e i(Interpolator interpolator, int i3, int i10, int i11, boolean z10) {
        float f10 = i11;
        return new e(z10, i3 / f10, i10 / f10, interpolator);
    }

    public static float j(float f10) {
        if (f10 <= 0.0f) {
            return f10 + 180.0f;
        }
        return f10 - 180.0f;
    }

    public final void a(Path path, RectF rectF, float f10, float f11, boolean z10, boolean z11) {
        float f12 = f11 - f10;
        if (z10) {
            if (f12 > 0.0f) {
                f12 -= 360.0f;
            }
        } else if (f12 < 0.0f) {
            f12 += 360.0f;
        }
        if (Math.abs(f12) > 270.0f && z11) {
            this.R = false;
        }
        path.arcTo(rectF, f10, f12);
    }

    public final void c() {
        this.f58852b0.start();
        this.P = true;
        if (this.N && !this.U) {
            b bVar = new b(new xg.c(this, 4));
            this.Q = bVar;
            RectF rectF = this.f58857r;
            int i3 = g.f58842a;
            bVar.a((int) rectF.width(), (int) (rectF.height() + g0.L(30.0f)), 4.0f, g0.L(10));
        }
        invalidateSelf();
    }

    public final void d() {
        d[] dVarArr;
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        this.E.setHideSideButtonByQuickShare(false);
        if (!this.U) {
            this.U = true;
            Bitmap bitmap4 = this.J;
            if (bitmap4 != null) {
                bitmap4.recycle();
            }
            b bVar = this.Q;
            if (bVar != null && (bitmap3 = bVar.f58800c) != null) {
                bitmap3.recycle();
                bVar.f58800c = null;
            }
            for (d dVar : this.f58860x) {
                b bVar2 = dVar.f58811f;
                if (bVar2 != null && (bitmap2 = bVar2.f58800c) != null) {
                    bitmap2.recycle();
                    bVar2.f58800c = null;
                }
                b bVar3 = dVar.f58810e;
                if (bVar3 != null && (bitmap = bVar3.f58800c) != null) {
                    bitmap.recycle();
                    bVar3.f58800c = null;
                }
            }
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        e(canvas, false, 255);
    }

    public final void e(Canvas canvas, boolean z10, int i3) {
        float f10;
        float f11;
        float f12;
        int i10;
        j jVar;
        boolean z11;
        Canvas canvas2;
        int i11;
        float f13;
        int i12;
        int i13;
        float min;
        double d;
        h hVar = this;
        boolean z12 = hVar.T;
        j jVar2 = hVar.f58849a;
        float f14 = 0.0f;
        int i14 = 0;
        q1 q1Var = hVar.E;
        int i15 = 1;
        if (!z12) {
            int[] iArr = f58846e0;
            q1Var.getLocationInWindow(iArr);
            int i16 = iArr[0];
            int i17 = iArr[1];
            jVar2.getLocationInWindow(iArr);
            int i18 = iArr[0];
            int i19 = iArr[1];
            hVar.V = i16 - i18;
            hVar.W = i17 - i19;
            float L = g0.L(16.0f);
            float sideButtonStartX = q1Var.getSideButtonStartX() + hVar.V + L;
            float sideButtonStartY = q1Var.getSideButtonStartY() + hVar.W + L;
            float f15 = sideButtonStartX - L;
            float f16 = sideButtonStartY - L;
            float f17 = sideButtonStartX + L;
            float f18 = sideButtonStartY + L;
            RectF rectF = hVar.h;
            rectF.set(f15, f16, f17, f18);
            float L2 = g0.L(16.0f);
            if (rectF.right + g0.L(48.0f) + L2 > jVar2.getMeasuredWidth()) {
                hVar.G = Math.max(0.0f, (jVar2.getMeasuredWidth() - L2) - rectF.right);
            } else if (((rectF.right + g0.L(48.0f)) - hVar.h()) - L2 < 0.0f) {
                hVar.G = Math.max(0.0f, (L2 + hVar.h()) - rectF.right);
            } else {
                hVar.G = g0.L(48.0f);
            }
            hVar.f58850a0.start();
            hVar.T = true;
        }
        b bVar = hVar.Q;
        d[] dVarArr = hVar.f58860x;
        int i20 = 2;
        RectF rectF2 = hVar.f58857r;
        if (bVar != null && !z10) {
            bVar.setBounds((int) rectF2.left, (int) (rectF2.top - g0.L(30.0f)), (int) rectF2.right, (int) rectF2.bottom);
            hVar.Q.f58804i = (int) ((1.0f - f.f58826c.getInterpolation(hVar.I)) * 255.0f);
            hVar.Q.draw(canvas);
            if (hVar.S != -1) {
                float interpolation = 1.0f - f.f58827e.getInterpolation(hVar.I);
                float interpolation2 = f.d.getInterpolation(hVar.I);
                float centerX = rectF2.centerX();
                int i21 = g.f58842a;
                float L3 = centerX + (g0.L(i21 + 11) * (hVar.S - 2));
                float centerY = rectF2.centerY();
                float f19 = hVar.Y;
                float f20 = hVar.Z;
                float f21 = (L3 + f19) / 2.0f;
                ib ibVar = hVar.X;
                if (ibVar != null && ibVar.top) {
                    min = Math.max(centerY, f20) + g0.L(15);
                } else {
                    min = Math.min(centerY, f20) - g0.L(15);
                }
                float g7 = g(L3, f19, interpolation2);
                double d10 = L3;
                double d11 = centerY;
                double d12 = f19;
                double d13 = f20;
                double d14 = f21;
                double d15 = d12 - d10;
                double d16 = (min - (((d13 - d11) * (d14 - d10)) / d15)) - d11;
                double d17 = ((d12 * d10) + ((d14 * d14) - (d12 * d14))) - (d14 * d10);
                double d18 = 0.0d;
                if (d17 == 0.0d) {
                    d = 0.0d;
                } else {
                    d = d16 / d17;
                }
                double d19 = d10 * d10;
                double d20 = (d13 - (((d12 * d12) - d19) * d)) - d11;
                if (d15 != 0.0d) {
                    d18 = d20 / d15;
                }
                double g10 = g(L3, f19, interpolation2);
                float f22 = (float) ((d18 * g10) + (d * g10 * g10) + ((d11 - (d19 * d)) - (d18 * d10)));
                float f23 = i21;
                float g11 = g((g0.L(f23) / 2.0f) + g0.L(2.0f), g0.L(12.0f), interpolation2);
                final d dVar = dVarArr[hVar.S];
                if (dVar.f58810e == null) {
                    b bVar2 = new b(new a() {
                        @Override
                        public final void h(Canvas canvas3, int i22) {
                            float f24;
                            float f25;
                            switch (r2) {
                                case 0:
                                    d dVar2 = dVar;
                                    dVar2.getClass();
                                    canvas3.save();
                                    canvas3.translate(-dVar2.f58813i, -dVar2.f58814j);
                                    float f26 = dVar2.f58813i;
                                    float f27 = dVar2.f58814j;
                                    float f28 = i22 / 255.0f;
                                    RectF rectF3 = g0.P;
                                    float L4 = g0.L(21.0f) / 2.0f;
                                    int i23 = g.f58842a;
                                    float f29 = 8;
                                    rectF3.set(f26, f27, dVar2.h.getWidth() + f26 + (g0.L(f29) * 2), g0.L(21.0f) + f27);
                                    q1 q1Var2 = dVar2.f58808b;
                                    boolean g22 = q1Var2.g2();
                                    Paint paint = dVar2.f58812g;
                                    if (paint != null) {
                                        int alpha = paint.getAlpha();
                                        paint.setAlpha((int) (255.0f * f28));
                                        canvas3.drawRoundRect(rectF3, L4, L4, paint);
                                        paint.setAlpha(alpha);
                                        f24 = 21.0f;
                                    } else {
                                        Point point = g0.f22608q;
                                        f24 = 21.0f;
                                        q1Var2.y(0.0f, 0.0f, point.x, point.y);
                                        Paint Z1 = q1Var2.Z1("paintChatActionBackground");
                                        int alpha2 = Z1.getAlpha();
                                        if (g22) {
                                            f25 = alpha2;
                                        } else {
                                            f25 = 229.5f;
                                        }
                                        Z1.setAlpha((int) (f25 * f28));
                                        canvas3.drawRoundRect(rectF3, L4, L4, Z1);
                                        Z1.setAlpha(alpha2);
                                    }
                                    if (g22 || paint != null) {
                                        int alpha3 = k6.f27951h2.getAlpha();
                                        k6.f27951h2.setAlpha((int) (alpha3 * f28));
                                        canvas3.drawRoundRect(rectF3, L4, L4, k6.f27951h2);
                                        k6.f27951h2.setAlpha(alpha3);
                                    }
                                    canvas3.save();
                                    canvas3.translate(f26 + g0.L(f29), ((g0.L(f24) - dVar2.h.getHeight()) / 2.0f) + f27);
                                    int alpha4 = dVar2.h.getPaint().getAlpha();
                                    dVar2.h.getPaint().setAlpha((int) (alpha4 * f28));
                                    dVar2.h.draw(canvas3);
                                    dVar2.h.getPaint().setAlpha(alpha4);
                                    canvas3.restore();
                                    canvas3.restore();
                                    return;
                                default:
                                    d dVar3 = dVar;
                                    dVar3.getClass();
                                    int i24 = g.f58842a;
                                    float L5 = g0.L(21);
                                    dVar3.a(canvas3, L5, L5, L5, i22 / 255.0f);
                                    return;
                            }
                        }
                    });
                    dVar.f58810e = bVar2;
                    bVar2.a(g0.L(f23), g0.L(f23), 4.0f, g0.L(10));
                }
                canvas.save();
                canvas.translate(g7 - g11, f22 - g11);
                float f24 = 21;
                canvas.scale(g11 / g0.L(f24), g11 / g0.L(f24));
                b bVar3 = dVar.f58810e;
                bVar3.f58804i = (int) (interpolation * 255.0f);
                bVar3.draw(canvas);
                canvas.restore();
                return;
            }
            return;
        }
        if (!z10) {
            f10 = 1.0f - hVar.I;
        } else {
            f10 = i3 / 255.0f;
        }
        float f25 = f10;
        float g12 = g(0.3f, 0.075f, f.f58832k.getInterpolation(hVar.H));
        Matrix matrix = hVar.d;
        matrix.reset();
        matrix.setScale(g12, g12);
        matrix.postTranslate(0.0f, rectF2.bottom);
        hVar.f58855f.setLocalMatrix(matrix);
        Paint paint = hVar.f58853c;
        paint.setAlpha((int) (f.f58831j.getInterpolation(hVar.H) * 255.0f * f25));
        RectF rectF3 = f58844c0;
        rectF3.set(rectF2);
        rectF3.inset(-g0.L(8.0f), -g0.L(8.0f));
        Rect rect = f58845d0;
        rectF3.round(rect);
        Drawable drawable = hVar.f58861y;
        drawable.setAlpha((int) (f25 * 255.0f));
        drawable.setBounds(rect);
        drawable.draw(canvas);
        boolean z13 = hVar.N;
        RectF rectF4 = hVar.f58856n;
        if (!z13) {
            canvas.save();
            canvas.translate(rectF4.left, rectF4.top);
            canvas.rotate((f.f58828f.getInterpolation(hVar.H) - f.f58829g.getInterpolation(hVar.H)) * (-40.0f), g0.L(16.0f), g0.L(16.0f));
            canvas.translate(-q1Var.getSideButtonStartX(), -q1Var.getSideButtonStartY());
            q1Var.v1(canvas, true);
            canvas.restore();
        }
        if (hVar.R && !hVar.N) {
            canvas.drawPath(hVar.f58854e, paint);
        } else {
            float min2 = Math.min(rectF2.width(), rectF2.height()) / 2.0f;
            float min3 = Math.min(rectF4.width(), rectF4.height()) / 2.0f;
            canvas.drawRoundRect(rectF2, min2, min2, paint);
            if (!hVar.N) {
                canvas.drawRoundRect(rectF4, min3, min3, paint);
            }
        }
        float interpolation3 = f.f58841t.getInterpolation(hVar.H) * g0.L(2.0f);
        float f26 = g.f58842a + 2;
        float interpolation4 = ((f.f58838q.getInterpolation(hVar.H) * g0.L(f26)) / 2.0f) - interpolation3;
        float interpolation5 = ((f.f58839r.getInterpolation(hVar.H) * g0.L(f26)) / 2.0f) - interpolation3;
        float interpolation6 = ((f.f58840s.getInterpolation(hVar.H) * g0.L(f26)) / 2.0f) - interpolation3;
        int i22 = 0;
        while (i22 < i20) {
            int i23 = i14;
            while (i23 < dVarArr.length) {
                if ((i22 == 0 && i23 == hVar.S) || (i22 == i15 && i23 != hVar.S)) {
                    i10 = i22;
                    i12 = i23;
                    jVar = jVar2;
                    f12 = f14;
                    i13 = i20;
                } else {
                    float length = i23 - ((dVarArr.length / 2.0f) - 0.5f);
                    if (i23 == i20) {
                        f11 = interpolation4;
                    } else if (i23 != i15 && i23 != 3) {
                        f11 = interpolation6;
                    } else {
                        f11 = interpolation5;
                    }
                    f12 = f14;
                    float L4 = (g0.L(g.f58842a + 11) * length) + rectF2.centerX();
                    float centerY2 = rectF2.centerY();
                    i10 = i22;
                    final d dVar2 = dVarArr[i23];
                    float f27 = 16;
                    float L5 = g0.L(f27);
                    float measuredWidth = jVar2.getMeasuredWidth() - g0.L(f27);
                    float f28 = rectF2.left;
                    jVar = jVar2;
                    float f29 = rectF2.right;
                    if (i23 == hVar.S && hVar.P) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        dVar2.getClass();
                        canvas2 = canvas;
                        i11 = i23;
                        f13 = L4;
                        dVar2.a(canvas2, f13, centerY2, f11 + (g0.L(2.0f) * dVar2.f58819o), f25);
                    } else {
                        canvas2 = canvas;
                        i11 = i23;
                        f13 = L4;
                    }
                    float f30 = dVar2.f58819o;
                    if (f30 > f12 && dVar2.h != null) {
                        float f31 = (f30 * 0.15f) + 0.85f;
                        canvas2.save();
                        canvas2.scale(f31, f31, f13, centerY2);
                        float f32 = dVar2.f58819o * f25;
                        i12 = i11;
                        i13 = 2;
                        float D = k5.D(8, 2, dVar2.h.getWidth());
                        dVar2.f58813i = d.b(d.b(f13, D, f28, f29), D, L5, measuredWidth) - (D / 2.0f);
                        dVar2.f58814j = centerY2 - g0.L(58.0f);
                        if (dVar2.f58811f == null) {
                            h hVar2 = dVar2.f58807a;
                            if (!hVar2.U) {
                                dVar2.f58812g = hVar2.M;
                                b bVar4 = new b(new a() {
                                    @Override
                                    public final void h(Canvas canvas3, int i222) {
                                        float f242;
                                        float f252;
                                        switch (r2) {
                                            case 0:
                                                d dVar22 = dVar2;
                                                dVar22.getClass();
                                                canvas3.save();
                                                canvas3.translate(-dVar22.f58813i, -dVar22.f58814j);
                                                float f262 = dVar22.f58813i;
                                                float f272 = dVar22.f58814j;
                                                float f282 = i222 / 255.0f;
                                                RectF rectF32 = g0.P;
                                                float L42 = g0.L(21.0f) / 2.0f;
                                                int i232 = g.f58842a;
                                                float f292 = 8;
                                                rectF32.set(f262, f272, dVar22.h.getWidth() + f262 + (g0.L(f292) * 2), g0.L(21.0f) + f272);
                                                q1 q1Var2 = dVar22.f58808b;
                                                boolean g22 = q1Var2.g2();
                                                Paint paint2 = dVar22.f58812g;
                                                if (paint2 != null) {
                                                    int alpha = paint2.getAlpha();
                                                    paint2.setAlpha((int) (255.0f * f282));
                                                    canvas3.drawRoundRect(rectF32, L42, L42, paint2);
                                                    paint2.setAlpha(alpha);
                                                    f242 = 21.0f;
                                                } else {
                                                    Point point = g0.f22608q;
                                                    f242 = 21.0f;
                                                    q1Var2.y(0.0f, 0.0f, point.x, point.y);
                                                    Paint Z1 = q1Var2.Z1("paintChatActionBackground");
                                                    int alpha2 = Z1.getAlpha();
                                                    if (g22) {
                                                        f252 = alpha2;
                                                    } else {
                                                        f252 = 229.5f;
                                                    }
                                                    Z1.setAlpha((int) (f252 * f282));
                                                    canvas3.drawRoundRect(rectF32, L42, L42, Z1);
                                                    Z1.setAlpha(alpha2);
                                                }
                                                if (g22 || paint2 != null) {
                                                    int alpha3 = k6.f27951h2.getAlpha();
                                                    k6.f27951h2.setAlpha((int) (alpha3 * f282));
                                                    canvas3.drawRoundRect(rectF32, L42, L42, k6.f27951h2);
                                                    k6.f27951h2.setAlpha(alpha3);
                                                }
                                                canvas3.save();
                                                canvas3.translate(f262 + g0.L(f292), ((g0.L(f242) - dVar22.h.getHeight()) / 2.0f) + f272);
                                                int alpha4 = dVar22.h.getPaint().getAlpha();
                                                dVar22.h.getPaint().setAlpha((int) (alpha4 * f282));
                                                dVar22.h.draw(canvas3);
                                                dVar22.h.getPaint().setAlpha(alpha4);
                                                canvas3.restore();
                                                canvas3.restore();
                                                return;
                                            default:
                                                d dVar3 = dVar2;
                                                dVar3.getClass();
                                                int i24 = g.f58842a;
                                                float L52 = g0.L(21);
                                                dVar3.a(canvas3, L52, L52, L52, i222 / 255.0f);
                                                return;
                                        }
                                    }
                                });
                                dVar2.f58811f = bVar4;
                                bVar4.a((int) D, g0.L(21.0f), 3.0f, g0.L(4));
                            }
                        }
                        b bVar5 = dVar2.f58811f;
                        if (bVar5 != null) {
                            float f33 = dVar2.f58813i;
                            float f34 = dVar2.f58814j;
                            bVar5.setBounds((int) f33, (int) f34, (int) (f33 + D), (int) (f34 + g0.L(21.0f)));
                            b bVar6 = dVar2.f58811f;
                            bVar6.f58804i = (int) (f32 * 255.0f);
                            bVar6.draw(canvas2);
                        }
                        canvas2.restore();
                    } else {
                        i12 = i11;
                        i13 = 2;
                    }
                }
                i23 = i12 + 1;
                hVar = this;
                i20 = i13;
                i22 = i10;
                f14 = f12;
                jVar2 = jVar;
                i15 = 1;
            }
            i22++;
            hVar = this;
            i14 = 0;
            i15 = 1;
        }
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    public final int h() {
        return g0.L(((g.f58842a + 11) * this.f58860x.length) + 7);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ObjectAnimator objectAnimator = this.f58850a0;
        i iVar = this.f58851b;
        if (animator == objectAnimator) {
            this.E.setHideSideButtonByQuickShare(false);
            this.N = true;
            invalidateSelf();
            if (this.O) {
                iVar.run();
            }
        } else if (animator == this.f58852b0) {
            this.O = true;
            invalidateSelf();
            ib ibVar = this.X;
            if (ibVar != null) {
                ibVar.f34650a.setVisibility(0);
            }
            if (this.N) {
                iVar.run();
            }
        }
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
    }

    @Override
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override
    public final void onAnimationStart(Animator animator) {
    }

    @Override
    public final void setAlpha(int i3) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
