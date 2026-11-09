package wh;

import a8.p0;
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
import org.telegram.messenger.ij;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.kb;
public final class h extends Drawable implements Animator.AnimatorListener {
    public static final RectF f57905b0 = new RectF();
    public static final Rect f57906c0 = new Rect();
    public static final int[] f57907d0 = new int[2];
    public static final o8 f57908e0 = new o8("openFactor", 11);
    public static final o8 f57909f0 = new o8("openFactor", 12);
    public final q1 D;
    public final ij E;
    public float F;
    public Bitmap I;
    public BitmapShader J;
    public Paint L;
    public b P;
    public boolean S;
    public boolean T;
    public int U;
    public int V;
    public kb W;
    public float X;
    public float Y;
    public final i f57910a;
    public final u9.f f57912b;
    public final LinearGradient f57915f;
    public final d[] f57920x;
    public final Drawable f57921y;
    public final Paint f57913c = new Paint(1);
    public final Matrix d = new Matrix();
    public final Path f57914e = new Path();
    public final RectF h = new RectF();
    public final RectF f57916n = new RectF();
    public final RectF f57917r = new RectF();
    public final RectF f57918s = new RectF();
    public final RectF f57919w = new RectF();
    public float G = 0.0f;
    public float H = 0.0f;
    public final Matrix K = new Matrix();
    public boolean M = false;
    public boolean N = false;
    public boolean O = false;
    public boolean Q = true;
    public int R = -1;
    public final ObjectAnimator Z = ObjectAnimator.ofFloat(this, f57908e0, 1.0f).setDuration(560L);
    public final ObjectAnimator f57911a0 = ObjectAnimator.ofFloat(this, f57909f0, 1.0f).setDuration(240L);

    public h(i iVar, q1 q1Var, ArrayList arrayList, u9.f fVar) {
        this.f57912b = fVar;
        this.f57910a = iVar;
        this.D = q1Var;
        this.E = q1Var.getMessageObject();
        this.f57920x = new d[Math.min(5, arrayList.size())];
        int i7 = 0;
        while (true) {
            d[] dVarArr = this.f57920x;
            if (i7 < dVarArr.length) {
                dVarArr[i7] = new d(this, ((Long) arrayList.get(i7)).longValue());
                i7++;
            } else {
                this.f57913c.setStyle(Paint.Style.FILL);
                Drawable mutate = iVar.getContext().getDrawable(2131232673).mutate();
                this.f57921y = mutate;
                q1Var.setHideSideButtonByQuickShare(true);
                iVar.performHapticFeedback(3, 1);
                int w02 = l6.w0(l6.G8, this.D.getResourcesProvider());
                mutate.setColorFilter(new PorterDuffColorFilter(l6.x0(null, l6.He, false), PorterDuff.Mode.MULTIPLY));
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, g0.L(100.0f), new int[]{w02, 16777215 & w02}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f57915f = linearGradient;
                this.f57913c.setShader(linearGradient);
                ObjectAnimator objectAnimator = this.Z;
                LinearInterpolator linearInterpolator = f.f57886b;
                objectAnimator.setInterpolator(linearInterpolator);
                this.Z.addListener(this);
                this.f57911a0.setInterpolator(linearInterpolator);
                this.f57911a0.addListener(this);
                g0.l2(new ii.c(this, 29), 15.0f);
                return;
            }
        }
    }

    public static float b(float f10, float f11, float f12, float f13) {
        return (float) Math.toDegrees((float) Math.atan2(f13 - f11, f12 - f10));
    }

    public static PointF f(float f10, float f11, float f12, float f13, float f14, float f15, boolean z9) {
        float f16 = f13 - f10;
        float f17 = f14 - f11;
        float sqrt = (float) Math.sqrt(Math.pow(f17, 2.0d) + Math.pow(f16, 2.0d));
        if (sqrt <= f12 + f15 && sqrt >= Math.abs(f12 - f15)) {
            float f18 = f12 * f12;
            float f19 = ((sqrt * sqrt) + (f18 - (f15 * f15))) / (2.0f * sqrt);
            float sqrt2 = (float) Math.sqrt(f18 - (f19 * f19));
            float f20 = p0.f(f19, f16, sqrt, f10);
            float f21 = p0.f(f19, f17, sqrt, f11);
            float f22 = (f17 * sqrt2) / sqrt;
            float f23 = f20 + f22;
            float f24 = (sqrt2 * f16) / sqrt;
            float f25 = f21 - f24;
            float f26 = f20 - f22;
            float f27 = f21 + f24;
            if (f23 != f26 && f23 < f26) {
                if (z9) {
                    return new PointF(f23, f25);
                }
                return new PointF(f26, f27);
            } else if (f25 > f27) {
                return new PointF(f23, f25);
            } else {
                return new PointF(f26, f27);
            }
        }
        return null;
    }

    public static float g(float f10, float f11, float f12) {
        return com.google.android.recaptcha.internal.a.z(f11, f10, f12, f10);
    }

    public static e i(Interpolator interpolator, int i7, int i10, int i11, boolean z9) {
        float f10 = i11;
        return new e(z9, i7 / f10, i10 / f10, interpolator);
    }

    public static float j(float f10) {
        if (f10 <= 0.0f) {
            return f10 + 180.0f;
        }
        return f10 - 180.0f;
    }

    public final void a(Path path, RectF rectF, float f10, float f11, boolean z9, boolean z10) {
        float f12 = f11 - f10;
        if (z9) {
            if (f12 > 0.0f) {
                f12 -= 360.0f;
            }
        } else if (f12 < 0.0f) {
            f12 += 360.0f;
        }
        if (Math.abs(f12) > 270.0f && z10) {
            this.Q = false;
        }
        path.arcTo(rectF, f10, f12);
    }

    public final void c() {
        this.f57911a0.start();
        this.O = true;
        if (this.M && !this.T) {
            b bVar = new b(new u5.e(this, 9));
            this.P = bVar;
            RectF rectF = this.f57917r;
            int i7 = g.f57903a;
            bVar.a((int) rectF.width(), (int) (rectF.height() + g0.L(30.0f)), 4.0f, g0.L(10));
        }
        invalidateSelf();
    }

    public final void d() {
        d[] dVarArr;
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        this.D.setHideSideButtonByQuickShare(false);
        if (!this.T) {
            this.T = true;
            Bitmap bitmap4 = this.I;
            if (bitmap4 != null) {
                bitmap4.recycle();
            }
            b bVar = this.P;
            if (bVar != null && (bitmap3 = bVar.f57861c) != null) {
                bitmap3.recycle();
                bVar.f57861c = null;
            }
            for (d dVar : this.f57920x) {
                b bVar2 = dVar.f57872f;
                if (bVar2 != null && (bitmap2 = bVar2.f57861c) != null) {
                    bitmap2.recycle();
                    bVar2.f57861c = null;
                }
                b bVar3 = dVar.f57871e;
                if (bVar3 != null && (bitmap = bVar3.f57861c) != null) {
                    bitmap.recycle();
                    bVar3.f57861c = null;
                }
            }
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        e(canvas, false, 255);
    }

    public final void e(Canvas canvas, boolean z9, int i7) {
        float f10;
        float f11;
        float f12;
        int i10;
        i iVar;
        boolean z10;
        Canvas canvas2;
        int i11;
        float f13;
        int i12;
        int i13;
        float min;
        double d;
        h hVar = this;
        boolean z11 = hVar.S;
        i iVar2 = hVar.f57910a;
        float f14 = 0.0f;
        int i14 = 0;
        q1 q1Var = hVar.D;
        int i15 = 1;
        if (!z11) {
            int[] iArr = f57907d0;
            q1Var.getLocationInWindow(iArr);
            int i16 = iArr[0];
            int i17 = iArr[1];
            iVar2.getLocationInWindow(iArr);
            int i18 = iArr[0];
            int i19 = iArr[1];
            hVar.U = i16 - i18;
            hVar.V = i17 - i19;
            float L = g0.L(16.0f);
            float sideButtonStartX = q1Var.getSideButtonStartX() + hVar.U + L;
            float sideButtonStartY = q1Var.getSideButtonStartY() + hVar.V + L;
            float f15 = sideButtonStartX - L;
            float f16 = sideButtonStartY - L;
            float f17 = sideButtonStartX + L;
            float f18 = sideButtonStartY + L;
            RectF rectF = hVar.h;
            rectF.set(f15, f16, f17, f18);
            float L2 = g0.L(16.0f);
            if (rectF.right + g0.L(48.0f) + L2 > iVar2.getMeasuredWidth()) {
                hVar.F = Math.max(0.0f, (iVar2.getMeasuredWidth() - L2) - rectF.right);
            } else if (((rectF.right + g0.L(48.0f)) - hVar.h()) - L2 < 0.0f) {
                hVar.F = Math.max(0.0f, (L2 + hVar.h()) - rectF.right);
            } else {
                hVar.F = g0.L(48.0f);
            }
            hVar.Z.start();
            hVar.S = true;
        }
        b bVar = hVar.P;
        d[] dVarArr = hVar.f57920x;
        int i20 = 2;
        RectF rectF2 = hVar.f57917r;
        if (bVar != null && !z9) {
            bVar.setBounds((int) rectF2.left, (int) (rectF2.top - g0.L(30.0f)), (int) rectF2.right, (int) rectF2.bottom);
            hVar.P.f57865i = (int) ((1.0f - f.f57887c.getInterpolation(hVar.H)) * 255.0f);
            hVar.P.draw(canvas);
            if (hVar.R != -1) {
                float interpolation = 1.0f - f.f57888e.getInterpolation(hVar.H);
                float interpolation2 = f.d.getInterpolation(hVar.H);
                float centerX = rectF2.centerX();
                int i21 = g.f57903a;
                float L3 = centerX + (g0.L(i21 + 11) * (hVar.R - 2));
                float centerY = rectF2.centerY();
                float f19 = hVar.X;
                float f20 = hVar.Y;
                float f21 = (L3 + f19) / 2.0f;
                kb kbVar = hVar.W;
                if (kbVar != null && kbVar.top) {
                    min = Math.max(centerY, f20) + g0.L(15);
                } else {
                    min = Math.min(centerY, f20) - g0.L(15);
                }
                float g10 = g(L3, f19, interpolation2);
                double d2 = L3;
                double d10 = centerY;
                double d11 = f19;
                double d12 = f20;
                double d13 = f21;
                double d14 = d11 - d2;
                double d15 = (min - (((d12 - d10) * (d13 - d2)) / d14)) - d10;
                double d16 = ((d11 * d2) + ((d13 * d13) - (d11 * d13))) - (d13 * d2);
                double d17 = 0.0d;
                if (d16 == 0.0d) {
                    d = 0.0d;
                } else {
                    d = d15 / d16;
                }
                double d18 = d2 * d2;
                double d19 = (d12 - (((d11 * d11) - d18) * d)) - d10;
                if (d14 != 0.0d) {
                    d17 = d19 / d14;
                }
                double g11 = g(L3, f19, interpolation2);
                float f22 = (float) ((d17 * g11) + (d * g11 * g11) + ((d10 - (d18 * d)) - (d17 * d2)));
                float f23 = i21;
                float g12 = g((g0.L(f23) / 2.0f) + g0.L(2.0f), g0.L(12.0f), interpolation2);
                final d dVar = dVarArr[hVar.R];
                if (dVar.f57871e == null) {
                    b bVar2 = new b(new a() {
                        @Override
                        public final void m(Canvas canvas3, int i22) {
                            float f24;
                            float f25;
                            switch (r2) {
                                case 0:
                                    d dVar2 = dVar;
                                    dVar2.getClass();
                                    canvas3.save();
                                    canvas3.translate(-dVar2.f57874i, -dVar2.f57875j);
                                    float f26 = dVar2.f57874i;
                                    float f27 = dVar2.f57875j;
                                    float f28 = i22 / 255.0f;
                                    RectF rectF3 = g0.P;
                                    float L4 = g0.L(21.0f) / 2.0f;
                                    int i23 = g.f57903a;
                                    float f29 = 8;
                                    rectF3.set(f26, f27, dVar2.h.getWidth() + f26 + (g0.L(f29) * 2), g0.L(21.0f) + f27);
                                    q1 q1Var2 = dVar2.f57869b;
                                    boolean g22 = q1Var2.g2();
                                    Paint paint = dVar2.f57873g;
                                    if (paint != null) {
                                        int alpha = paint.getAlpha();
                                        paint.setAlpha((int) (255.0f * f28));
                                        canvas3.drawRoundRect(rectF3, L4, L4, paint);
                                        paint.setAlpha(alpha);
                                        f24 = 21.0f;
                                    } else {
                                        Point point = g0.f22563q;
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
                                        int alpha3 = l6.f27935h2.getAlpha();
                                        l6.f27935h2.setAlpha((int) (alpha3 * f28));
                                        canvas3.drawRoundRect(rectF3, L4, L4, l6.f27935h2);
                                        l6.f27935h2.setAlpha(alpha3);
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
                                    int i24 = g.f57903a;
                                    float L5 = g0.L(21);
                                    dVar3.a(canvas3, L5, L5, L5, i22 / 255.0f);
                                    return;
                            }
                        }
                    });
                    dVar.f57871e = bVar2;
                    bVar2.a(g0.L(f23), g0.L(f23), 4.0f, g0.L(10));
                }
                canvas.save();
                canvas.translate(g10 - g12, f22 - g12);
                float f24 = 21;
                canvas.scale(g12 / g0.L(f24), g12 / g0.L(f24));
                b bVar3 = dVar.f57871e;
                bVar3.f57865i = (int) (interpolation * 255.0f);
                bVar3.draw(canvas);
                canvas.restore();
                return;
            }
            return;
        }
        if (!z9) {
            f10 = 1.0f - hVar.H;
        } else {
            f10 = i7 / 255.0f;
        }
        float f25 = f10;
        float g13 = g(0.3f, 0.075f, f.f57893k.getInterpolation(hVar.G));
        Matrix matrix = hVar.d;
        matrix.reset();
        matrix.setScale(g13, g13);
        matrix.postTranslate(0.0f, rectF2.bottom);
        hVar.f57915f.setLocalMatrix(matrix);
        Paint paint = hVar.f57913c;
        paint.setAlpha((int) (f.f57892j.getInterpolation(hVar.G) * 255.0f * f25));
        RectF rectF3 = f57905b0;
        rectF3.set(rectF2);
        rectF3.inset(-g0.L(8.0f), -g0.L(8.0f));
        Rect rect = f57906c0;
        rectF3.round(rect);
        Drawable drawable = hVar.f57921y;
        drawable.setAlpha((int) (f25 * 255.0f));
        drawable.setBounds(rect);
        drawable.draw(canvas);
        boolean z12 = hVar.M;
        RectF rectF4 = hVar.f57916n;
        if (!z12) {
            canvas.save();
            canvas.translate(rectF4.left, rectF4.top);
            canvas.rotate((f.f57889f.getInterpolation(hVar.G) - f.f57890g.getInterpolation(hVar.G)) * (-40.0f), g0.L(16.0f), g0.L(16.0f));
            canvas.translate(-q1Var.getSideButtonStartX(), -q1Var.getSideButtonStartY());
            q1Var.v1(canvas, true);
            canvas.restore();
        }
        if (hVar.Q && !hVar.M) {
            canvas.drawPath(hVar.f57914e, paint);
        } else {
            float min2 = Math.min(rectF2.width(), rectF2.height()) / 2.0f;
            float min3 = Math.min(rectF4.width(), rectF4.height()) / 2.0f;
            canvas.drawRoundRect(rectF2, min2, min2, paint);
            if (!hVar.M) {
                canvas.drawRoundRect(rectF4, min3, min3, paint);
            }
        }
        float interpolation3 = f.f57902t.getInterpolation(hVar.G) * g0.L(2.0f);
        float f26 = g.f57903a + 2;
        float interpolation4 = ((f.f57899q.getInterpolation(hVar.G) * g0.L(f26)) / 2.0f) - interpolation3;
        float interpolation5 = ((f.f57900r.getInterpolation(hVar.G) * g0.L(f26)) / 2.0f) - interpolation3;
        float interpolation6 = ((f.f57901s.getInterpolation(hVar.G) * g0.L(f26)) / 2.0f) - interpolation3;
        int i22 = 0;
        while (i22 < i20) {
            int i23 = i14;
            while (i23 < dVarArr.length) {
                if ((i22 == 0 && i23 == hVar.R) || (i22 == i15 && i23 != hVar.R)) {
                    i10 = i22;
                    i12 = i23;
                    iVar = iVar2;
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
                    float L4 = (g0.L(g.f57903a + 11) * length) + rectF2.centerX();
                    float centerY2 = rectF2.centerY();
                    i10 = i22;
                    final d dVar2 = dVarArr[i23];
                    float f27 = 16;
                    float L5 = g0.L(f27);
                    float measuredWidth = iVar2.getMeasuredWidth() - g0.L(f27);
                    float f28 = rectF2.left;
                    iVar = iVar2;
                    float f29 = rectF2.right;
                    if (i23 == hVar.R && hVar.O) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        dVar2.getClass();
                        canvas2 = canvas;
                        i11 = i23;
                        f13 = L4;
                        dVar2.a(canvas2, f13, centerY2, f11 + (g0.L(2.0f) * dVar2.f57880o), f25);
                    } else {
                        canvas2 = canvas;
                        i11 = i23;
                        f13 = L4;
                    }
                    float f30 = dVar2.f57880o;
                    if (f30 > f12 && dVar2.h != null) {
                        float f31 = (f30 * 0.15f) + 0.85f;
                        canvas2.save();
                        canvas2.scale(f31, f31, f13, centerY2);
                        float f32 = dVar2.f57880o * f25;
                        i12 = i11;
                        i13 = 2;
                        float D = k5.D(8, 2, dVar2.h.getWidth());
                        dVar2.f57874i = d.b(d.b(f13, D, f28, f29), D, L5, measuredWidth) - (D / 2.0f);
                        dVar2.f57875j = centerY2 - g0.L(58.0f);
                        if (dVar2.f57872f == null) {
                            h hVar2 = dVar2.f57868a;
                            if (!hVar2.T) {
                                dVar2.f57873g = hVar2.L;
                                b bVar4 = new b(new a() {
                                    @Override
                                    public final void m(Canvas canvas3, int i222) {
                                        float f242;
                                        float f252;
                                        switch (r2) {
                                            case 0:
                                                d dVar22 = dVar2;
                                                dVar22.getClass();
                                                canvas3.save();
                                                canvas3.translate(-dVar22.f57874i, -dVar22.f57875j);
                                                float f262 = dVar22.f57874i;
                                                float f272 = dVar22.f57875j;
                                                float f282 = i222 / 255.0f;
                                                RectF rectF32 = g0.P;
                                                float L42 = g0.L(21.0f) / 2.0f;
                                                int i232 = g.f57903a;
                                                float f292 = 8;
                                                rectF32.set(f262, f272, dVar22.h.getWidth() + f262 + (g0.L(f292) * 2), g0.L(21.0f) + f272);
                                                q1 q1Var2 = dVar22.f57869b;
                                                boolean g22 = q1Var2.g2();
                                                Paint paint2 = dVar22.f57873g;
                                                if (paint2 != null) {
                                                    int alpha = paint2.getAlpha();
                                                    paint2.setAlpha((int) (255.0f * f282));
                                                    canvas3.drawRoundRect(rectF32, L42, L42, paint2);
                                                    paint2.setAlpha(alpha);
                                                    f242 = 21.0f;
                                                } else {
                                                    Point point = g0.f22563q;
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
                                                    int alpha3 = l6.f27935h2.getAlpha();
                                                    l6.f27935h2.setAlpha((int) (alpha3 * f282));
                                                    canvas3.drawRoundRect(rectF32, L42, L42, l6.f27935h2);
                                                    l6.f27935h2.setAlpha(alpha3);
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
                                                int i24 = g.f57903a;
                                                float L52 = g0.L(21);
                                                dVar3.a(canvas3, L52, L52, L52, i222 / 255.0f);
                                                return;
                                        }
                                    }
                                });
                                dVar2.f57872f = bVar4;
                                bVar4.a((int) D, g0.L(21.0f), 3.0f, g0.L(4));
                            }
                        }
                        b bVar5 = dVar2.f57872f;
                        if (bVar5 != null) {
                            float f33 = dVar2.f57874i;
                            float f34 = dVar2.f57875j;
                            bVar5.setBounds((int) f33, (int) f34, (int) (f33 + D), (int) (f34 + g0.L(21.0f)));
                            b bVar6 = dVar2.f57872f;
                            bVar6.f57865i = (int) (f32 * 255.0f);
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
                iVar2 = iVar;
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
        return g0.L(((g.f57903a + 11) * this.f57920x.length) + 7);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ObjectAnimator objectAnimator = this.Z;
        u9.f fVar = this.f57912b;
        if (animator == objectAnimator) {
            this.D.setHideSideButtonByQuickShare(false);
            this.M = true;
            invalidateSelf();
            if (this.N) {
                fVar.run();
            }
        } else if (animator == this.f57911a0) {
            this.N = true;
            invalidateSelf();
            kb kbVar = this.W;
            if (kbVar != null) {
                kbVar.f35291a.setVisibility(0);
            }
            if (this.M) {
                fVar.run();
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
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
