package th;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.a2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.u8;
import org.telegram.ui.Components.xb;
import org.telegram.ui.web.x1;
import org.telegram.ui.web.y1;
public final class i extends Drawable implements Animator.AnimatorListener {
    public static final RectF f42223b0 = new RectF();
    public static final Rect f42224c0 = new Rect();
    public static final int[] f42225d0 = new int[2];
    public static final u8 f42226e0 = new u8("openFactor", 11);
    public static final u8 f42227f0 = new u8("openFactor", 12);
    public final MessageObject E;
    public float F;
    public Bitmap I;
    public BitmapShader J;
    public Paint L;
    public b P;
    public boolean S;
    public boolean T;
    public int U;
    public int V;
    public xb W;
    public float X;
    public float Y;
    public final j f42228a;
    public final x1 f42230b;
    public final LinearGradient f42232f;
    public final d[] f42236w;
    public final Drawable f42237x;
    public final t1 f42238y;
    public final Paint f42231c = new Paint(1);
    public final Matrix d = new Matrix();
    public final Path e = new Path();
    public final RectF h = new RectF();
    public final RectF f42233n = new RectF();
    public final RectF f42234r = new RectF();
    public final RectF f42235s = new RectF();
    public final RectF v = new RectF();
    public float G = 0.0f;
    public float H = 0.0f;
    public final Matrix K = new Matrix();
    public boolean M = false;
    public boolean N = false;
    public boolean O = false;
    public boolean Q = true;
    public int R = -1;
    public final ObjectAnimator Z = ObjectAnimator.ofFloat(this, f42226e0, 1.0f).setDuration(560L);
    public final ObjectAnimator f42229a0 = ObjectAnimator.ofFloat(this, f42227f0, 1.0f).setDuration(240L);

    public i(j jVar, t1 t1Var, ArrayList arrayList, x1 x1Var) {
        this.f42230b = x1Var;
        this.f42228a = jVar;
        this.f42238y = t1Var;
        this.E = t1Var.getMessageObject();
        this.f42236w = new d[Math.min(5, arrayList.size())];
        int i10 = 0;
        while (true) {
            d[] dVarArr = this.f42236w;
            if (i10 < dVarArr.length) {
                dVarArr[i10] = new d(this, ((Long) arrayList.get(i10)).longValue());
                i10++;
            } else {
                this.f42231c.setStyle(Paint.Style.FILL);
                Drawable mutate = jVar.getContext().getDrawable(R.drawable.reactions_bubble_shadow).mutate();
                this.f42237x = mutate;
                t1Var.setHideSideButtonByQuickShare(true);
                jVar.performHapticFeedback(3, 1);
                int v02 = j6.v0(j6.G8, this.f42238y.getResourcesProvider());
                mutate.setColorFilter(new PorterDuffColorFilter(j6.w0(null, j6.Td, false), PorterDuff.Mode.MULTIPLY));
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(100.0f), new int[]{v02, 16777215 & v02}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f42232f = linearGradient;
                this.f42231c.setShader(linearGradient);
                ObjectAnimator objectAnimator = this.Z;
                LinearInterpolator linearInterpolator = g.f42205b;
                objectAnimator.setInterpolator(linearInterpolator);
                this.Z.addListener(this);
                this.f42229a0.setInterpolator(linearInterpolator);
                this.f42229a0.addListener(this);
                AndroidUtilities.makeGlobalBlurBitmap(new y1(this, 12), 15.0f);
                return;
            }
        }
    }

    public static float b(float f7, float f10, float f11, float f12) {
        return (float) Math.toDegrees((float) Math.atan2(f12 - f10, f11 - f7));
    }

    public static PointF f(float f7, float f10, float f11, float f12, float f13, float f14, boolean z10) {
        float f15 = f12 - f7;
        float f16 = f13 - f10;
        float sqrt = (float) Math.sqrt(Math.pow(f16, 2.0d) + Math.pow(f15, 2.0d));
        if (sqrt <= f11 + f14 && sqrt >= Math.abs(f11 - f14)) {
            float f17 = f11 * f11;
            float f18 = ((sqrt * sqrt) + (f17 - (f14 * f14))) / (2.0f * sqrt);
            float sqrt2 = (float) Math.sqrt(f17 - (f18 * f18));
            float A = a4.a.A(f18, f15, sqrt, f7);
            float A2 = a4.a.A(f18, f16, sqrt, f10);
            float f19 = (f16 * sqrt2) / sqrt;
            float f20 = A + f19;
            float f21 = (sqrt2 * f15) / sqrt;
            float f22 = A2 - f21;
            float f23 = A - f19;
            float f24 = A2 + f21;
            if (f20 != f23 && f20 < f23) {
                if (z10) {
                    return new PointF(f20, f22);
                }
                return new PointF(f23, f24);
            } else if (f22 > f24) {
                return new PointF(f20, f22);
            } else {
                return new PointF(f23, f24);
            }
        }
        return null;
    }

    public static float g(float f7, float f10, float f11) {
        return e2.z(f10, f7, f11, f7);
    }

    public static f i(Interpolator interpolator, int i10, int i11, int i12, boolean z10) {
        float f7 = i12;
        return new f(z10, i10 / f7, i11 / f7, interpolator);
    }

    public static float j(float f7) {
        if (f7 <= 0.0f) {
            return f7 + 180.0f;
        }
        return f7 - 180.0f;
    }

    public final void a(Path path, RectF rectF, float f7, float f10, boolean z10, boolean z11) {
        float f11 = f10 - f7;
        if (z10) {
            if (f11 > 0.0f) {
                f11 -= 360.0f;
            }
        } else if (f11 < 0.0f) {
            f11 += 360.0f;
        }
        if (Math.abs(f11) > 270.0f && z11) {
            this.Q = false;
        }
        path.arcTo(rectF, f7, f11);
    }

    public final void c() {
        this.f42229a0.start();
        this.O = true;
        if (this.M && !this.T) {
            b bVar = new b(new e(this, 0));
            this.P = bVar;
            RectF rectF = this.f42234r;
            int i10 = h.f42221a;
            bVar.a((int) rectF.width(), (int) (rectF.height() + AndroidUtilities.dp(30.0f)), 4.0f, AndroidUtilities.dp(10));
        }
        invalidateSelf();
    }

    public final void d() {
        d[] dVarArr;
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        this.f42238y.setHideSideButtonByQuickShare(false);
        if (!this.T) {
            this.T = true;
            Bitmap bitmap4 = this.I;
            if (bitmap4 != null) {
                bitmap4.recycle();
            }
            b bVar = this.P;
            if (bVar != null && (bitmap3 = bVar.f42180c) != null) {
                bitmap3.recycle();
                bVar.f42180c = null;
            }
            for (d dVar : this.f42236w) {
                b bVar2 = dVar.f42189f;
                if (bVar2 != null && (bitmap2 = bVar2.f42180c) != null) {
                    bitmap2.recycle();
                    bVar2.f42180c = null;
                }
                b bVar3 = dVar.e;
                if (bVar3 != null && (bitmap = bVar3.f42180c) != null) {
                    bitmap.recycle();
                    bVar3.f42180c = null;
                }
            }
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        e(canvas, false, 255);
    }

    public final void e(Canvas canvas, boolean z10, int i10) {
        float f7;
        float f10;
        int i11;
        j jVar;
        boolean z11;
        Canvas canvas2;
        int i12;
        float f11;
        int i13;
        float min;
        double d;
        i iVar = this;
        boolean z12 = iVar.S;
        j jVar2 = iVar.f42228a;
        t1 t1Var = iVar.f42238y;
        int i14 = 1;
        if (!z12) {
            int[] iArr = f42225d0;
            t1Var.getLocationInWindow(iArr);
            int i15 = iArr[0];
            int i16 = iArr[1];
            jVar2.getLocationInWindow(iArr);
            int i17 = iArr[0];
            int i18 = iArr[1];
            iVar.U = i15 - i17;
            iVar.V = i16 - i18;
            float dp = AndroidUtilities.dp(16.0f);
            float sideButtonStartX = t1Var.getSideButtonStartX() + iVar.U + dp;
            float sideButtonStartY = t1Var.getSideButtonStartY() + iVar.V + dp;
            float f12 = sideButtonStartX - dp;
            float f13 = sideButtonStartY - dp;
            float f14 = sideButtonStartX + dp;
            float f15 = sideButtonStartY + dp;
            RectF rectF = iVar.h;
            rectF.set(f12, f13, f14, f15);
            float dp2 = AndroidUtilities.dp(16.0f);
            if (rectF.right + AndroidUtilities.dp(48.0f) + dp2 > jVar2.getMeasuredWidth()) {
                iVar.F = Math.max(0.0f, (jVar2.getMeasuredWidth() - dp2) - rectF.right);
            } else if (((rectF.right + AndroidUtilities.dp(48.0f)) - iVar.h()) - dp2 < 0.0f) {
                iVar.F = Math.max(0.0f, (dp2 + iVar.h()) - rectF.right);
            } else {
                iVar.F = AndroidUtilities.dp(48.0f);
            }
            iVar.Z.start();
            iVar.S = true;
        }
        b bVar = iVar.P;
        d[] dVarArr = iVar.f42236w;
        int i19 = 2;
        RectF rectF2 = iVar.f42234r;
        if (bVar != null && !z10) {
            bVar.setBounds((int) rectF2.left, (int) (rectF2.top - AndroidUtilities.dp(30.0f)), (int) rectF2.right, (int) rectF2.bottom);
            iVar.P.f42183i = (int) ((1.0f - g.f42206c.getInterpolation(iVar.H)) * 255.0f);
            iVar.P.draw(canvas);
            if (iVar.R != -1) {
                float interpolation = 1.0f - g.e.getInterpolation(iVar.H);
                float interpolation2 = g.d.getInterpolation(iVar.H);
                float centerX = rectF2.centerX();
                int i20 = h.f42221a;
                float dp3 = centerX + (AndroidUtilities.dp(i20 + 11) * (iVar.R - 2));
                float centerY = rectF2.centerY();
                float f16 = iVar.X;
                float f17 = iVar.Y;
                float f18 = (dp3 + f16) / 2.0f;
                xb xbVar = iVar.W;
                if (xbVar != null && xbVar.top) {
                    min = Math.max(centerY, f17) + AndroidUtilities.dp(15);
                } else {
                    min = Math.min(centerY, f17) - AndroidUtilities.dp(15);
                }
                float g10 = g(dp3, f16, interpolation2);
                double d10 = dp3;
                double d11 = centerY;
                double d12 = f16;
                double d13 = f17;
                double d14 = f18;
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
                double g11 = g(dp3, f16, interpolation2);
                float f19 = (float) ((d18 * g11) + (d * g11 * g11) + ((d11 - (d19 * d)) - (d18 * d10)));
                float f20 = i20;
                float g12 = g((AndroidUtilities.dp(f20) / 2.0f) + AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), interpolation2);
                final d dVar = dVarArr[iVar.R];
                if (dVar.e == null) {
                    b bVar2 = new b(new a() {
                        @Override
                        public final void p(Canvas canvas3, int i21) {
                            float f21;
                            float f22;
                            switch (r2) {
                                case 0:
                                    d dVar2 = dVar;
                                    dVar2.getClass();
                                    canvas3.save();
                                    canvas3.translate(-dVar2.f42191i, -dVar2.f42192j);
                                    float f23 = dVar2.f42191i;
                                    float f24 = dVar2.f42192j;
                                    float f25 = i21 / 255.0f;
                                    RectF rectF3 = AndroidUtilities.rectTmp;
                                    float dp4 = AndroidUtilities.dp(21.0f) / 2.0f;
                                    int i22 = h.f42221a;
                                    float f26 = 8;
                                    rectF3.set(f23, f24, dVar2.h.getWidth() + f23 + (AndroidUtilities.dp(f26) * 2), AndroidUtilities.dp(21.0f) + f24);
                                    t1 t1Var2 = dVar2.f42187b;
                                    boolean R2 = t1Var2.R2();
                                    Paint paint = dVar2.f42190g;
                                    if (paint != null) {
                                        int alpha = paint.getAlpha();
                                        paint.setAlpha((int) (255.0f * f25));
                                        canvas3.drawRoundRect(rectF3, dp4, dp4, paint);
                                        paint.setAlpha(alpha);
                                        f21 = 21.0f;
                                    } else {
                                        Point point = AndroidUtilities.displaySize;
                                        f21 = 21.0f;
                                        t1Var2.q0(0.0f, 0.0f, point.x, point.y);
                                        Paint M2 = t1Var2.M2("paintChatActionBackground");
                                        int alpha2 = M2.getAlpha();
                                        if (R2) {
                                            f22 = alpha2;
                                        } else {
                                            f22 = 229.5f;
                                        }
                                        M2.setAlpha((int) (f22 * f25));
                                        canvas3.drawRoundRect(rectF3, dp4, dp4, M2);
                                        M2.setAlpha(alpha2);
                                    }
                                    if (R2 || paint != null) {
                                        int alpha3 = j6.f17995h2.getAlpha();
                                        j6.f17995h2.setAlpha((int) (alpha3 * f25));
                                        canvas3.drawRoundRect(rectF3, dp4, dp4, j6.f17995h2);
                                        j6.f17995h2.setAlpha(alpha3);
                                    }
                                    canvas3.save();
                                    canvas3.translate(f23 + AndroidUtilities.dp(f26), ((AndroidUtilities.dp(f21) - dVar2.h.getHeight()) / 2.0f) + f24);
                                    int alpha4 = dVar2.h.getPaint().getAlpha();
                                    dVar2.h.getPaint().setAlpha((int) (alpha4 * f25));
                                    dVar2.h.draw(canvas3);
                                    dVar2.h.getPaint().setAlpha(alpha4);
                                    canvas3.restore();
                                    canvas3.restore();
                                    return;
                                default:
                                    d dVar3 = dVar;
                                    dVar3.getClass();
                                    int i23 = h.f42221a;
                                    float dp5 = AndroidUtilities.dp(21);
                                    dVar3.a(canvas3, dp5, dp5, dp5, i21 / 255.0f);
                                    return;
                            }
                        }
                    });
                    dVar.e = bVar2;
                    bVar2.a(AndroidUtilities.dp(f20), AndroidUtilities.dp(f20), 4.0f, AndroidUtilities.dp(10));
                }
                canvas.save();
                canvas.translate(g10 - g12, f19 - g12);
                float f21 = 21;
                canvas.scale(g12 / AndroidUtilities.dp(f21), g12 / AndroidUtilities.dp(f21));
                b bVar3 = dVar.e;
                bVar3.f42183i = (int) (interpolation * 255.0f);
                bVar3.draw(canvas);
                canvas.restore();
                return;
            }
            return;
        }
        if (!z10) {
            f7 = 1.0f - iVar.H;
        } else {
            f7 = i10 / 255.0f;
        }
        float f22 = f7;
        float g13 = g(0.3f, 0.075f, g.f42211k.getInterpolation(iVar.G));
        Matrix matrix = iVar.d;
        matrix.reset();
        matrix.setScale(g13, g13);
        matrix.postTranslate(0.0f, rectF2.bottom);
        iVar.f42232f.setLocalMatrix(matrix);
        Paint paint = iVar.f42231c;
        paint.setAlpha((int) (g.f42210j.getInterpolation(iVar.G) * 255.0f * f22));
        RectF rectF3 = f42223b0;
        rectF3.set(rectF2);
        rectF3.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        Rect rect = f42224c0;
        rectF3.round(rect);
        Drawable drawable = iVar.f42237x;
        drawable.setAlpha((int) (f22 * 255.0f));
        drawable.setBounds(rect);
        drawable.draw(canvas);
        boolean z13 = iVar.M;
        RectF rectF4 = iVar.f42233n;
        if (!z13) {
            canvas.save();
            canvas.translate(rectF4.left, rectF4.top);
            canvas.rotate((g.f42207f.getInterpolation(iVar.G) - g.f42208g.getInterpolation(iVar.G)) * (-40.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            canvas.translate(-t1Var.getSideButtonStartX(), -t1Var.getSideButtonStartY());
            t1Var.k2(canvas, true);
            canvas.restore();
        }
        if (iVar.Q && !iVar.M) {
            canvas.drawPath(iVar.e, paint);
        } else {
            float min2 = Math.min(rectF2.width(), rectF2.height()) / 2.0f;
            float min3 = Math.min(rectF4.width(), rectF4.height()) / 2.0f;
            canvas.drawRoundRect(rectF2, min2, min2, paint);
            if (!iVar.M) {
                canvas.drawRoundRect(rectF4, min3, min3, paint);
            }
        }
        float interpolation3 = g.f42220t.getInterpolation(iVar.G) * AndroidUtilities.dp(2.0f);
        float f23 = h.f42221a + 2;
        float interpolation4 = ((g.f42217q.getInterpolation(iVar.G) * AndroidUtilities.dp(f23)) / 2.0f) - interpolation3;
        float interpolation5 = ((g.f42218r.getInterpolation(iVar.G) * AndroidUtilities.dp(f23)) / 2.0f) - interpolation3;
        float interpolation6 = ((g.f42219s.getInterpolation(iVar.G) * AndroidUtilities.dp(f23)) / 2.0f) - interpolation3;
        int i21 = 0;
        while (i21 < i19) {
            int i22 = 0;
            while (i22 < dVarArr.length) {
                if ((i21 == 0 && i22 == iVar.R) || (i21 == i14 && i22 != iVar.R)) {
                    i11 = i21;
                    i13 = i22;
                    jVar = jVar2;
                } else {
                    float length = i22 - ((dVarArr.length / 2.0f) - 0.5f);
                    if (i22 == i19) {
                        f10 = interpolation4;
                    } else if (i22 != i14 && i22 != 3) {
                        f10 = interpolation6;
                    } else {
                        f10 = interpolation5;
                    }
                    float dp4 = (AndroidUtilities.dp(h.f42221a + 11) * length) + rectF2.centerX();
                    float centerY2 = rectF2.centerY();
                    i11 = i21;
                    final d dVar2 = dVarArr[i22];
                    float f24 = 16;
                    float dp5 = AndroidUtilities.dp(f24);
                    float measuredWidth = jVar2.getMeasuredWidth() - AndroidUtilities.dp(f24);
                    float f25 = rectF2.left;
                    jVar = jVar2;
                    float f26 = rectF2.right;
                    if (i22 == iVar.R && iVar.O) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        dVar2.getClass();
                        canvas2 = canvas;
                        i12 = i22;
                        f11 = dp4;
                        dVar2.a(canvas2, f11, centerY2, f10 + (AndroidUtilities.dp(2.0f) * dVar2.f42197o), f22);
                    } else {
                        canvas2 = canvas;
                        i12 = i22;
                        f11 = dp4;
                    }
                    float f27 = dVar2.f42197o;
                    if (f27 > 0.0f && dVar2.h != null) {
                        float f28 = (f27 * 0.15f) + 0.85f;
                        canvas2.save();
                        canvas2.scale(f28, f28, f11, centerY2);
                        float f29 = dVar2.f42197o * f22;
                        i13 = i12;
                        float D = a2.D(8, 2, dVar2.h.getWidth());
                        dVar2.f42191i = d.b(d.b(f11, D, f25, f26), D, dp5, measuredWidth) - (D / 2.0f);
                        dVar2.f42192j = centerY2 - AndroidUtilities.dp(58.0f);
                        if (dVar2.f42189f == null) {
                            i iVar2 = dVar2.f42186a;
                            if (!iVar2.T) {
                                dVar2.f42190g = iVar2.L;
                                b bVar4 = new b(new a() {
                                    @Override
                                    public final void p(Canvas canvas3, int i212) {
                                        float f212;
                                        float f222;
                                        switch (r2) {
                                            case 0:
                                                d dVar22 = dVar2;
                                                dVar22.getClass();
                                                canvas3.save();
                                                canvas3.translate(-dVar22.f42191i, -dVar22.f42192j);
                                                float f232 = dVar22.f42191i;
                                                float f242 = dVar22.f42192j;
                                                float f252 = i212 / 255.0f;
                                                RectF rectF32 = AndroidUtilities.rectTmp;
                                                float dp42 = AndroidUtilities.dp(21.0f) / 2.0f;
                                                int i222 = h.f42221a;
                                                float f262 = 8;
                                                rectF32.set(f232, f242, dVar22.h.getWidth() + f232 + (AndroidUtilities.dp(f262) * 2), AndroidUtilities.dp(21.0f) + f242);
                                                t1 t1Var2 = dVar22.f42187b;
                                                boolean R2 = t1Var2.R2();
                                                Paint paint2 = dVar22.f42190g;
                                                if (paint2 != null) {
                                                    int alpha = paint2.getAlpha();
                                                    paint2.setAlpha((int) (255.0f * f252));
                                                    canvas3.drawRoundRect(rectF32, dp42, dp42, paint2);
                                                    paint2.setAlpha(alpha);
                                                    f212 = 21.0f;
                                                } else {
                                                    Point point = AndroidUtilities.displaySize;
                                                    f212 = 21.0f;
                                                    t1Var2.q0(0.0f, 0.0f, point.x, point.y);
                                                    Paint M2 = t1Var2.M2("paintChatActionBackground");
                                                    int alpha2 = M2.getAlpha();
                                                    if (R2) {
                                                        f222 = alpha2;
                                                    } else {
                                                        f222 = 229.5f;
                                                    }
                                                    M2.setAlpha((int) (f222 * f252));
                                                    canvas3.drawRoundRect(rectF32, dp42, dp42, M2);
                                                    M2.setAlpha(alpha2);
                                                }
                                                if (R2 || paint2 != null) {
                                                    int alpha3 = j6.f17995h2.getAlpha();
                                                    j6.f17995h2.setAlpha((int) (alpha3 * f252));
                                                    canvas3.drawRoundRect(rectF32, dp42, dp42, j6.f17995h2);
                                                    j6.f17995h2.setAlpha(alpha3);
                                                }
                                                canvas3.save();
                                                canvas3.translate(f232 + AndroidUtilities.dp(f262), ((AndroidUtilities.dp(f212) - dVar22.h.getHeight()) / 2.0f) + f242);
                                                int alpha4 = dVar22.h.getPaint().getAlpha();
                                                dVar22.h.getPaint().setAlpha((int) (alpha4 * f252));
                                                dVar22.h.draw(canvas3);
                                                dVar22.h.getPaint().setAlpha(alpha4);
                                                canvas3.restore();
                                                canvas3.restore();
                                                return;
                                            default:
                                                d dVar3 = dVar2;
                                                dVar3.getClass();
                                                int i23 = h.f42221a;
                                                float dp52 = AndroidUtilities.dp(21);
                                                dVar3.a(canvas3, dp52, dp52, dp52, i212 / 255.0f);
                                                return;
                                        }
                                    }
                                });
                                dVar2.f42189f = bVar4;
                                bVar4.a((int) D, AndroidUtilities.dp(21.0f), 3.0f, AndroidUtilities.dp(4));
                            }
                        }
                        b bVar5 = dVar2.f42189f;
                        if (bVar5 != null) {
                            float f30 = dVar2.f42191i;
                            float f31 = dVar2.f42192j;
                            bVar5.setBounds((int) f30, (int) f31, (int) (f30 + D), (int) (f31 + AndroidUtilities.dp(21.0f)));
                            b bVar6 = dVar2.f42189f;
                            bVar6.f42183i = (int) (f29 * 255.0f);
                            bVar6.draw(canvas2);
                        }
                        canvas2.restore();
                    } else {
                        i13 = i12;
                    }
                }
                i22 = i13 + 1;
                iVar = this;
                i21 = i11;
                jVar2 = jVar;
                i14 = 1;
                i19 = 2;
            }
            i21++;
            iVar = this;
            i14 = 1;
            i19 = 2;
        }
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    public final int h() {
        return AndroidUtilities.dp(((h.f42221a + 11) * this.f42236w.length) + 7);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ObjectAnimator objectAnimator = this.Z;
        x1 x1Var = this.f42230b;
        if (animator == objectAnimator) {
            this.f42238y.setHideSideButtonByQuickShare(false);
            this.M = true;
            invalidateSelf();
            if (this.N) {
                x1Var.run();
            }
        } else if (animator == this.f42229a0) {
            this.N = true;
            invalidateSelf();
            xb xbVar = this.W;
            if (xbVar != null) {
                xbVar.f28999a.setVisibility(0);
            }
            if (this.M) {
                x1Var.run();
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
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
