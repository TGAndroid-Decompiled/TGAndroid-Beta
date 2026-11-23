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
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import org.telegram.messenger.f3;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.ob;
import tg.o1;
import ug.z;
import wg.q;
public final class h extends Drawable implements Animator.AnimatorListener {
    public static final RectF f59955c0 = new RectF();
    public static final Rect f59956d0 = new Rect();
    public static final int[] f59957e0 = new int[2];
    public static final p8 f59958f0 = new p8("openFactor", 11);
    public static final p8 f59959g0 = new p8("openFactor", 12);
    public final r1 E;
    public final gj F;
    public float G;
    public Bitmap J;
    public BitmapShader K;
    public Paint M;
    public b Q;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public ob X;
    public float Y;
    public float Z;
    public final i f59960a;
    public final q f59962b;
    public final LinearGradient f59966f;
    public final d[] f59971x;
    public final Drawable f59972y;
    public final Paint f59964c = new Paint(1);
    public final Matrix d = new Matrix();
    public final Path f59965e = new Path();
    public final RectF h = new RectF();
    public final RectF f59967n = new RectF();
    public final RectF f59968r = new RectF();
    public final RectF f59969s = new RectF();
    public final RectF f59970w = new RectF();
    public float H = 0.0f;
    public float I = 0.0f;
    public final Matrix L = new Matrix();
    public boolean N = false;
    public boolean O = false;
    public boolean P = false;
    public boolean R = true;
    public int S = -1;
    public final ObjectAnimator f59961a0 = ObjectAnimator.ofFloat(this, f59958f0, 1.0f).setDuration(560L);
    public final ObjectAnimator f59963b0 = ObjectAnimator.ofFloat(this, f59959g0, 1.0f).setDuration(240L);

    public h(i iVar, r1 r1Var, ArrayList arrayList, q qVar) {
        this.f59962b = qVar;
        this.f59960a = iVar;
        this.E = r1Var;
        this.F = r1Var.getMessageObject();
        this.f59971x = new d[Math.min(5, arrayList.size())];
        int i7 = 0;
        while (true) {
            d[] dVarArr = this.f59971x;
            if (i7 < dVarArr.length) {
                dVarArr[i7] = new d(this, ((Long) arrayList.get(i7)).longValue());
                i7++;
            } else {
                this.f59964c.setStyle(Paint.Style.FILL);
                Drawable mutate = iVar.getContext().getDrawable(2131232675).mutate();
                this.f59972y = mutate;
                r1Var.setHideSideButtonByQuickShare(true);
                iVar.performHapticFeedback(3, 1);
                int w02 = m6.w0(m6.G8, this.E.getResourcesProvider());
                mutate.setColorFilter(new PorterDuffColorFilter(m6.x0(null, m6.Ke, false), PorterDuff.Mode.MULTIPLY));
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, g0.L(100.0f), new int[]{w02, 16777215 & w02}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f59966f = linearGradient;
                this.f59964c.setShader(linearGradient);
                ObjectAnimator objectAnimator = this.f59961a0;
                LinearInterpolator linearInterpolator = f.f59936b;
                objectAnimator.setInterpolator(linearInterpolator);
                this.f59961a0.addListener(this);
                this.f59963b0.setInterpolator(linearInterpolator);
                this.f59963b0.addListener(this);
                g0.l2(new z(this, 5), 15.0f);
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
            float f20 = p0.f(f19, f16, sqrt, f10);
            float f21 = p0.f(f19, f17, sqrt, f11);
            float f22 = (f17 * sqrt2) / sqrt;
            float f23 = f20 + f22;
            float f24 = (sqrt2 * f16) / sqrt;
            float f25 = f21 - f24;
            float f26 = f20 - f22;
            float f27 = f21 + f24;
            if (f23 != f26 && f23 < f26) {
                if (z10) {
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
        return e2.z(f11, f10, f12, f10);
    }

    public static e i(Interpolator interpolator, int i7, int i10, int i11, boolean z10) {
        float f10 = i11;
        return new e(z10, i7 / f10, i10 / f10, interpolator);
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
        this.f59963b0.start();
        this.P = true;
        if (this.N && !this.U) {
            b bVar = new b(new o1(this, 15));
            this.Q = bVar;
            RectF rectF = this.f59968r;
            int i7 = g.f59953a;
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
            if (bVar != null && (bitmap3 = bVar.f59911c) != null) {
                bitmap3.recycle();
                bVar.f59911c = null;
            }
            for (d dVar : this.f59971x) {
                b bVar2 = dVar.f59922f;
                if (bVar2 != null && (bitmap2 = bVar2.f59911c) != null) {
                    bitmap2.recycle();
                    bVar2.f59911c = null;
                }
                b bVar3 = dVar.f59921e;
                if (bVar3 != null && (bitmap = bVar3.f59911c) != null) {
                    bitmap.recycle();
                    bVar3.f59911c = null;
                }
            }
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        e(canvas, false, 255);
    }

    public final void e(Canvas canvas, boolean z10, int i7) {
        float f10;
        float f11;
        float f12;
        int i10;
        i iVar;
        boolean z11;
        float f13;
        int i11;
        float f14;
        int i12;
        int i13;
        float min;
        double d;
        h hVar = this;
        boolean z12 = hVar.T;
        i iVar2 = hVar.f59960a;
        float f15 = 0.0f;
        int i14 = 0;
        r1 r1Var = hVar.E;
        int i15 = 1;
        if (!z12) {
            int[] iArr = f59957e0;
            r1Var.getLocationInWindow(iArr);
            int i16 = iArr[0];
            int i17 = iArr[1];
            iVar2.getLocationInWindow(iArr);
            int i18 = iArr[0];
            int i19 = iArr[1];
            hVar.V = i16 - i18;
            hVar.W = i17 - i19;
            float L = g0.L(16.0f);
            float sideButtonStartX = r1Var.getSideButtonStartX() + hVar.V + L;
            float sideButtonStartY = r1Var.getSideButtonStartY() + hVar.W + L;
            float f16 = sideButtonStartX - L;
            float f17 = sideButtonStartY - L;
            float f18 = sideButtonStartX + L;
            float f19 = sideButtonStartY + L;
            RectF rectF = hVar.h;
            rectF.set(f16, f17, f18, f19);
            float L2 = g0.L(16.0f);
            if (rectF.right + g0.L(48.0f) + L2 > iVar2.getMeasuredWidth()) {
                hVar.G = Math.max(0.0f, (iVar2.getMeasuredWidth() - L2) - rectF.right);
            } else if (((rectF.right + g0.L(48.0f)) - hVar.h()) - L2 < 0.0f) {
                hVar.G = Math.max(0.0f, (L2 + hVar.h()) - rectF.right);
            } else {
                hVar.G = g0.L(48.0f);
            }
            hVar.f59961a0.start();
            hVar.T = true;
        }
        b bVar = hVar.Q;
        d[] dVarArr = hVar.f59971x;
        int i20 = 2;
        RectF rectF2 = hVar.f59968r;
        if (bVar != null && !z10) {
            bVar.setBounds((int) rectF2.left, (int) (rectF2.top - g0.L(30.0f)), (int) rectF2.right, (int) rectF2.bottom);
            hVar.Q.f59915i = (int) ((1.0f - f.f59937c.getInterpolation(hVar.I)) * 255.0f);
            hVar.Q.draw(canvas);
            if (hVar.S != -1) {
                float interpolation = 1.0f - f.f59938e.getInterpolation(hVar.I);
                float interpolation2 = f.d.getInterpolation(hVar.I);
                float centerX = rectF2.centerX();
                int i21 = g.f59953a;
                float L3 = centerX + (g0.L(i21 + 11) * (hVar.S - 2));
                float centerY = rectF2.centerY();
                float f20 = hVar.Y;
                float f21 = hVar.Z;
                float f22 = (L3 + f20) / 2.0f;
                ob obVar = hVar.X;
                if (obVar != null && obVar.top) {
                    min = Math.max(centerY, f21) + g0.L(15);
                } else {
                    min = Math.min(centerY, f21) - g0.L(15);
                }
                float g10 = g(L3, f20, interpolation2);
                double d2 = L3;
                double d10 = centerY;
                double d11 = f20;
                double d12 = f21;
                double d13 = f22;
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
                double g11 = g(L3, f20, interpolation2);
                float f23 = (float) ((d17 * g11) + (d * g11 * g11) + ((d10 - (d18 * d)) - (d17 * d2)));
                float f24 = i21;
                float g12 = g((g0.L(f24) / 2.0f) + g0.L(2.0f), g0.L(12.0f), interpolation2);
                final d dVar = dVarArr[hVar.S];
                if (dVar.f59921e == null) {
                    b bVar2 = new b(new a() {
                        @Override
                        public final void m(Canvas canvas2, int i22) {
                            float f25;
                            float f26;
                            switch (r2) {
                                case 0:
                                    d dVar2 = dVar;
                                    dVar2.getClass();
                                    canvas2.save();
                                    canvas2.translate(-dVar2.f59924i, -dVar2.f59925j);
                                    float f27 = dVar2.f59924i;
                                    float f28 = dVar2.f59925j;
                                    float f29 = i22 / 255.0f;
                                    RectF rectF3 = g0.P;
                                    float L4 = g0.L(21.0f) / 2.0f;
                                    int i23 = g.f59953a;
                                    float f30 = 8;
                                    rectF3.set(f27, f28, dVar2.h.getWidth() + f27 + (g0.L(f30) * 2), g0.L(21.0f) + f28);
                                    r1 r1Var2 = dVar2.f59919b;
                                    boolean h22 = r1Var2.h2();
                                    Paint paint = dVar2.f59923g;
                                    if (paint != null) {
                                        int alpha = paint.getAlpha();
                                        paint.setAlpha((int) (255.0f * f29));
                                        canvas2.drawRoundRect(rectF3, L4, L4, paint);
                                        paint.setAlpha(alpha);
                                        f25 = 21.0f;
                                    } else {
                                        Point point = g0.f24046q;
                                        f25 = 21.0f;
                                        r1Var2.y(0.0f, 0.0f, point.x, point.y);
                                        Paint a22 = r1Var2.a2("paintChatActionBackground");
                                        int alpha2 = a22.getAlpha();
                                        if (h22) {
                                            f26 = alpha2;
                                        } else {
                                            f26 = 229.5f;
                                        }
                                        a22.setAlpha((int) (f26 * f29));
                                        canvas2.drawRoundRect(rectF3, L4, L4, a22);
                                        a22.setAlpha(alpha2);
                                    }
                                    if (h22 || paint != null) {
                                        int alpha3 = m6.f29451h2.getAlpha();
                                        m6.f29451h2.setAlpha((int) (alpha3 * f29));
                                        canvas2.drawRoundRect(rectF3, L4, L4, m6.f29451h2);
                                        m6.f29451h2.setAlpha(alpha3);
                                    }
                                    canvas2.save();
                                    canvas2.translate(f27 + g0.L(f30), ((g0.L(f25) - dVar2.h.getHeight()) / 2.0f) + f28);
                                    int alpha4 = dVar2.h.getPaint().getAlpha();
                                    dVar2.h.getPaint().setAlpha((int) (alpha4 * f29));
                                    dVar2.h.draw(canvas2);
                                    dVar2.h.getPaint().setAlpha(alpha4);
                                    canvas2.restore();
                                    canvas2.restore();
                                    return;
                                default:
                                    d dVar3 = dVar;
                                    dVar3.getClass();
                                    int i24 = g.f59953a;
                                    float L5 = g0.L(21);
                                    dVar3.a(L5, L5, L5, i22 / 255.0f, canvas2);
                                    return;
                            }
                        }
                    });
                    dVar.f59921e = bVar2;
                    bVar2.a(g0.L(f24), g0.L(f24), 4.0f, g0.L(10));
                }
                canvas.save();
                canvas.translate(g10 - g12, f23 - g12);
                float f25 = 21;
                canvas.scale(g12 / g0.L(f25), g12 / g0.L(f25));
                b bVar3 = dVar.f59921e;
                bVar3.f59915i = (int) (interpolation * 255.0f);
                bVar3.draw(canvas);
                canvas.restore();
                return;
            }
            return;
        }
        if (!z10) {
            f10 = 1.0f - hVar.I;
        } else {
            f10 = i7 / 255.0f;
        }
        float f26 = f10;
        float g13 = g(0.3f, 0.075f, f.f59943k.getInterpolation(hVar.H));
        Matrix matrix = hVar.d;
        matrix.reset();
        matrix.setScale(g13, g13);
        matrix.postTranslate(0.0f, rectF2.bottom);
        hVar.f59966f.setLocalMatrix(matrix);
        Paint paint = hVar.f59964c;
        paint.setAlpha((int) (f.f59942j.getInterpolation(hVar.H) * 255.0f * f26));
        RectF rectF3 = f59955c0;
        rectF3.set(rectF2);
        rectF3.inset(-g0.L(8.0f), -g0.L(8.0f));
        Rect rect = f59956d0;
        rectF3.round(rect);
        Drawable drawable = hVar.f59972y;
        drawable.setAlpha((int) (f26 * 255.0f));
        drawable.setBounds(rect);
        drawable.draw(canvas);
        boolean z13 = hVar.N;
        RectF rectF4 = hVar.f59967n;
        if (!z13) {
            canvas.save();
            canvas.translate(rectF4.left, rectF4.top);
            canvas.rotate((f.f59939f.getInterpolation(hVar.H) - f.f59940g.getInterpolation(hVar.H)) * (-40.0f), g0.L(16.0f), g0.L(16.0f));
            canvas.translate(-r1Var.getSideButtonStartX(), -r1Var.getSideButtonStartY());
            r1Var.v1(canvas, true);
            canvas.restore();
        }
        if (hVar.R && !hVar.N) {
            canvas.drawPath(hVar.f59965e, paint);
        } else {
            float min2 = Math.min(rectF2.width(), rectF2.height()) / 2.0f;
            float min3 = Math.min(rectF4.width(), rectF4.height()) / 2.0f;
            canvas.drawRoundRect(rectF2, min2, min2, paint);
            if (!hVar.N) {
                canvas.drawRoundRect(rectF4, min3, min3, paint);
            }
        }
        float interpolation3 = f.f59952t.getInterpolation(hVar.H) * g0.L(2.0f);
        float f27 = g.f59953a + 2;
        float interpolation4 = ((f.f59949q.getInterpolation(hVar.H) * g0.L(f27)) / 2.0f) - interpolation3;
        float interpolation5 = ((f.f59950r.getInterpolation(hVar.H) * g0.L(f27)) / 2.0f) - interpolation3;
        float interpolation6 = ((f.f59951s.getInterpolation(hVar.H) * g0.L(f27)) / 2.0f) - interpolation3;
        int i22 = 0;
        while (i22 < i20) {
            int i23 = i14;
            while (i23 < dVarArr.length) {
                if ((i22 == 0 && i23 == hVar.S) || (i22 == i15 && i23 != hVar.S)) {
                    i10 = i22;
                    i12 = i23;
                    iVar = iVar2;
                    f12 = f15;
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
                    f12 = f15;
                    float L4 = (g0.L(g.f59953a + 11) * length) + rectF2.centerX();
                    float centerY2 = rectF2.centerY();
                    i10 = i22;
                    final d dVar2 = dVarArr[i23];
                    float f28 = 16;
                    float L5 = g0.L(f28);
                    float measuredWidth = iVar2.getMeasuredWidth() - g0.L(f28);
                    float f29 = rectF2.left;
                    iVar = iVar2;
                    float f30 = rectF2.right;
                    if (i23 == hVar.S && hVar.P) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        dVar2.getClass();
                        f13 = centerY2;
                        i11 = i23;
                        f14 = L4;
                        dVar2.a(f14, f13, f11 + (g0.L(2.0f) * dVar2.f59930o), f26, canvas);
                    } else {
                        f13 = centerY2;
                        i11 = i23;
                        f14 = L4;
                    }
                    float f31 = dVar2.f59930o;
                    if (f31 > f12 && dVar2.h != null) {
                        float f32 = (f31 * 0.15f) + 0.85f;
                        canvas.save();
                        canvas.scale(f32, f32, f14, f13);
                        float f33 = dVar2.f59930o * f26;
                        i12 = i11;
                        float f34 = f13;
                        i13 = 2;
                        float D = f3.D(8, 2, dVar2.h.getWidth());
                        dVar2.f59924i = d.b(d.b(f14, D, f29, f30), D, L5, measuredWidth) - (D / 2.0f);
                        dVar2.f59925j = f34 - g0.L(58.0f);
                        if (dVar2.f59922f == null) {
                            h hVar2 = dVar2.f59918a;
                            if (!hVar2.U) {
                                dVar2.f59923g = hVar2.M;
                                b bVar4 = new b(new a() {
                                    @Override
                                    public final void m(Canvas canvas2, int i222) {
                                        float f252;
                                        float f262;
                                        switch (r2) {
                                            case 0:
                                                d dVar22 = dVar2;
                                                dVar22.getClass();
                                                canvas2.save();
                                                canvas2.translate(-dVar22.f59924i, -dVar22.f59925j);
                                                float f272 = dVar22.f59924i;
                                                float f282 = dVar22.f59925j;
                                                float f292 = i222 / 255.0f;
                                                RectF rectF32 = g0.P;
                                                float L42 = g0.L(21.0f) / 2.0f;
                                                int i232 = g.f59953a;
                                                float f302 = 8;
                                                rectF32.set(f272, f282, dVar22.h.getWidth() + f272 + (g0.L(f302) * 2), g0.L(21.0f) + f282);
                                                r1 r1Var2 = dVar22.f59919b;
                                                boolean h22 = r1Var2.h2();
                                                Paint paint2 = dVar22.f59923g;
                                                if (paint2 != null) {
                                                    int alpha = paint2.getAlpha();
                                                    paint2.setAlpha((int) (255.0f * f292));
                                                    canvas2.drawRoundRect(rectF32, L42, L42, paint2);
                                                    paint2.setAlpha(alpha);
                                                    f252 = 21.0f;
                                                } else {
                                                    Point point = g0.f24046q;
                                                    f252 = 21.0f;
                                                    r1Var2.y(0.0f, 0.0f, point.x, point.y);
                                                    Paint a22 = r1Var2.a2("paintChatActionBackground");
                                                    int alpha2 = a22.getAlpha();
                                                    if (h22) {
                                                        f262 = alpha2;
                                                    } else {
                                                        f262 = 229.5f;
                                                    }
                                                    a22.setAlpha((int) (f262 * f292));
                                                    canvas2.drawRoundRect(rectF32, L42, L42, a22);
                                                    a22.setAlpha(alpha2);
                                                }
                                                if (h22 || paint2 != null) {
                                                    int alpha3 = m6.f29451h2.getAlpha();
                                                    m6.f29451h2.setAlpha((int) (alpha3 * f292));
                                                    canvas2.drawRoundRect(rectF32, L42, L42, m6.f29451h2);
                                                    m6.f29451h2.setAlpha(alpha3);
                                                }
                                                canvas2.save();
                                                canvas2.translate(f272 + g0.L(f302), ((g0.L(f252) - dVar22.h.getHeight()) / 2.0f) + f282);
                                                int alpha4 = dVar22.h.getPaint().getAlpha();
                                                dVar22.h.getPaint().setAlpha((int) (alpha4 * f292));
                                                dVar22.h.draw(canvas2);
                                                dVar22.h.getPaint().setAlpha(alpha4);
                                                canvas2.restore();
                                                canvas2.restore();
                                                return;
                                            default:
                                                d dVar3 = dVar2;
                                                dVar3.getClass();
                                                int i24 = g.f59953a;
                                                float L52 = g0.L(21);
                                                dVar3.a(L52, L52, L52, i222 / 255.0f, canvas2);
                                                return;
                                        }
                                    }
                                });
                                dVar2.f59922f = bVar4;
                                bVar4.a((int) D, g0.L(21.0f), 3.0f, g0.L(4));
                            }
                        }
                        b bVar5 = dVar2.f59922f;
                        if (bVar5 != null) {
                            float f35 = dVar2.f59924i;
                            float f36 = dVar2.f59925j;
                            bVar5.setBounds((int) f35, (int) f36, (int) (f35 + D), (int) (f36 + g0.L(21.0f)));
                            b bVar6 = dVar2.f59922f;
                            bVar6.f59915i = (int) (f33 * 255.0f);
                            bVar6.draw(canvas);
                        }
                        canvas.restore();
                    } else {
                        i12 = i11;
                        i13 = 2;
                    }
                }
                i23 = i12 + 1;
                hVar = this;
                i20 = i13;
                i22 = i10;
                f15 = f12;
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
        return g0.L(((g.f59953a + 11) * this.f59971x.length) + 7);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ObjectAnimator objectAnimator = this.f59961a0;
        q qVar = this.f59962b;
        if (animator == objectAnimator) {
            this.E.setHideSideButtonByQuickShare(false);
            this.N = true;
            invalidateSelf();
            if (this.O) {
                qVar.run();
            }
        } else if (animator == this.f59963b0) {
            this.O = true;
            invalidateSelf();
            ob obVar = this.X;
            if (obVar != null) {
                obVar.f38157a.setVisibility(0);
            }
            if (this.N) {
                qVar.run();
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
