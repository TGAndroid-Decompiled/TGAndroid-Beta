package vh;

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
import com.google.android.gms.internal.cast.a6;
import ig.l0;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.q;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.yb;
import qg.g0;
public final class h extends Drawable implements Animator.AnimatorListener {
    public static final RectF f48446b0 = new RectF();
    public static final Rect f48447c0 = new Rect();
    public static final int[] f48448d0 = new int[2];
    public static final s8 f48449e0 = new s8("openFactor", 11);
    public static final s8 f48450f0 = new s8("openFactor", 12);
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
    public yb W;
    public float X;
    public float Y;
    public final i f48451a;
    public final uf.c f48453b;
    public final LinearGradient f48455f;
    public final d[] f48459w;
    public final Drawable f48460x;
    public final u1 f48461y;
    public final Paint f48454c = new Paint(1);
    public final Matrix d = new Matrix();
    public final Path e = new Path();
    public final RectF h = new RectF();
    public final RectF f48456n = new RectF();
    public final RectF f48457r = new RectF();
    public final RectF f48458s = new RectF();
    public final RectF v = new RectF();
    public float G = 0.0f;
    public float H = 0.0f;
    public final Matrix K = new Matrix();
    public boolean M = false;
    public boolean N = false;
    public boolean O = false;
    public boolean Q = true;
    public int R = -1;
    public final ObjectAnimator Z = ObjectAnimator.ofFloat(this, f48449e0, 1.0f).setDuration(560L);
    public final ObjectAnimator f48452a0 = ObjectAnimator.ofFloat(this, f48450f0, 1.0f).setDuration(240L);

    public h(i iVar, u1 u1Var, ArrayList arrayList, uf.c cVar) {
        this.f48453b = cVar;
        this.f48451a = iVar;
        this.f48461y = u1Var;
        this.E = u1Var.getMessageObject();
        this.f48459w = new d[Math.min(5, arrayList.size())];
        int i10 = 0;
        while (true) {
            d[] dVarArr = this.f48459w;
            if (i10 < dVarArr.length) {
                dVarArr[i10] = new d(this, ((Long) arrayList.get(i10)).longValue());
                i10++;
            } else {
                this.f48454c.setStyle(Paint.Style.FILL);
                Drawable mutate = iVar.getContext().getDrawable(R.drawable.reactions_bubble_shadow).mutate();
                this.f48460x = mutate;
                u1Var.setHideSideButtonByQuickShare(true);
                iVar.performHapticFeedback(3, 1);
                int w02 = h6.w0(h6.G8, this.f48461y.getResourcesProvider());
                mutate.setColorFilter(new PorterDuffColorFilter(h6.x0(null, h6.Td, false), PorterDuff.Mode.MULTIPLY));
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(100.0f), new int[]{w02, 16777215 & w02}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f48455f = linearGradient;
                this.f48454c.setShader(linearGradient);
                ObjectAnimator objectAnimator = this.Z;
                LinearInterpolator linearInterpolator = f.f48428b;
                objectAnimator.setInterpolator(linearInterpolator);
                this.Z.addListener(this);
                this.f48452a0.setInterpolator(linearInterpolator);
                this.f48452a0.addListener(this);
                AndroidUtilities.makeGlobalBlurBitmap(new l0(this, 25), 15.0f);
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
            float B = a1.g.B(f18, f15, sqrt, f7);
            float B2 = a1.g.B(f18, f16, sqrt, f10);
            float f19 = (f16 * sqrt2) / sqrt;
            float f20 = B + f19;
            float f21 = (sqrt2 * f15) / sqrt;
            float f22 = B2 - f21;
            float f23 = B - f19;
            float f24 = B2 + f21;
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
        return a6.x(f10, f7, f11, f7);
    }

    public static e i(Interpolator interpolator, int i10, int i11, int i12, boolean z10) {
        float f7 = i12;
        return new e(z10, i10 / f7, i11 / f7, interpolator);
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
        this.f48452a0.start();
        this.O = true;
        if (this.M && !this.T) {
            b bVar = new b(new g0(this, 24));
            this.P = bVar;
            RectF rectF = this.f48457r;
            int i10 = g.f48444a;
            bVar.a((int) rectF.width(), (int) (rectF.height() + AndroidUtilities.dp(30.0f)), 4.0f, AndroidUtilities.dp(10));
        }
        invalidateSelf();
    }

    public final void d() {
        d[] dVarArr;
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        this.f48461y.setHideSideButtonByQuickShare(false);
        if (!this.T) {
            this.T = true;
            Bitmap bitmap4 = this.I;
            if (bitmap4 != null) {
                bitmap4.recycle();
            }
            b bVar = this.P;
            if (bVar != null && (bitmap3 = bVar.f48405c) != null) {
                bitmap3.recycle();
                bVar.f48405c = null;
            }
            for (d dVar : this.f48459w) {
                b bVar2 = dVar.f48414f;
                if (bVar2 != null && (bitmap2 = bVar2.f48405c) != null) {
                    bitmap2.recycle();
                    bVar2.f48405c = null;
                }
                b bVar3 = dVar.e;
                if (bVar3 != null && (bitmap = bVar3.f48405c) != null) {
                    bitmap.recycle();
                    bVar3.f48405c = null;
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
        float f11;
        int i11;
        i iVar;
        boolean z11;
        Canvas canvas2;
        int i12;
        float f12;
        int i13;
        int i14;
        float min;
        double d;
        h hVar = this;
        boolean z12 = hVar.S;
        i iVar2 = hVar.f48451a;
        float f13 = 0.0f;
        int i15 = 0;
        u1 u1Var = hVar.f48461y;
        int i16 = 1;
        if (!z12) {
            int[] iArr = f48448d0;
            u1Var.getLocationInWindow(iArr);
            int i17 = iArr[0];
            int i18 = iArr[1];
            iVar2.getLocationInWindow(iArr);
            int i19 = iArr[0];
            int i20 = iArr[1];
            hVar.U = i17 - i19;
            hVar.V = i18 - i20;
            float dp = AndroidUtilities.dp(16.0f);
            float sideButtonStartX = u1Var.getSideButtonStartX() + hVar.U + dp;
            float sideButtonStartY = u1Var.getSideButtonStartY() + hVar.V + dp;
            float f14 = sideButtonStartX - dp;
            float f15 = sideButtonStartY - dp;
            float f16 = sideButtonStartX + dp;
            float f17 = sideButtonStartY + dp;
            RectF rectF = hVar.h;
            rectF.set(f14, f15, f16, f17);
            float dp2 = AndroidUtilities.dp(16.0f);
            if (rectF.right + AndroidUtilities.dp(48.0f) + dp2 > iVar2.getMeasuredWidth()) {
                hVar.F = Math.max(0.0f, (iVar2.getMeasuredWidth() - dp2) - rectF.right);
            } else if (((rectF.right + AndroidUtilities.dp(48.0f)) - hVar.h()) - dp2 < 0.0f) {
                hVar.F = Math.max(0.0f, (dp2 + hVar.h()) - rectF.right);
            } else {
                hVar.F = AndroidUtilities.dp(48.0f);
            }
            hVar.Z.start();
            hVar.S = true;
        }
        b bVar = hVar.P;
        d[] dVarArr = hVar.f48459w;
        int i21 = 2;
        RectF rectF2 = hVar.f48457r;
        if (bVar != null && !z10) {
            bVar.setBounds((int) rectF2.left, (int) (rectF2.top - AndroidUtilities.dp(30.0f)), (int) rectF2.right, (int) rectF2.bottom);
            hVar.P.f48408i = (int) ((1.0f - f.f48429c.getInterpolation(hVar.H)) * 255.0f);
            hVar.P.draw(canvas);
            if (hVar.R != -1) {
                float interpolation = 1.0f - f.e.getInterpolation(hVar.H);
                float interpolation2 = f.d.getInterpolation(hVar.H);
                float centerX = rectF2.centerX();
                int i22 = g.f48444a;
                float dp3 = centerX + (AndroidUtilities.dp(i22 + 11) * (hVar.R - 2));
                float centerY = rectF2.centerY();
                float f18 = hVar.X;
                float f19 = hVar.Y;
                float f20 = (dp3 + f18) / 2.0f;
                yb ybVar = hVar.W;
                if (ybVar != null && ybVar.top) {
                    min = Math.max(centerY, f19) + AndroidUtilities.dp(15);
                } else {
                    min = Math.min(centerY, f19) - AndroidUtilities.dp(15);
                }
                float g10 = g(dp3, f18, interpolation2);
                double d10 = dp3;
                double d11 = centerY;
                double d12 = f18;
                double d13 = f19;
                double d14 = f20;
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
                double g11 = g(dp3, f18, interpolation2);
                float f21 = (float) ((d18 * g11) + (d * g11 * g11) + ((d11 - (d19 * d)) - (d18 * d10)));
                float f22 = i22;
                float g12 = g((AndroidUtilities.dp(f22) / 2.0f) + AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), interpolation2);
                final d dVar = dVarArr[hVar.R];
                if (dVar.e == null) {
                    b bVar2 = new b(new a() {
                        @Override
                        public final void p(Canvas canvas3, int i23) {
                            float f23;
                            float f24;
                            switch (r2) {
                                case 0:
                                    d dVar2 = dVar;
                                    dVar2.getClass();
                                    canvas3.save();
                                    canvas3.translate(-dVar2.f48416i, -dVar2.f48417j);
                                    float f25 = dVar2.f48416i;
                                    float f26 = dVar2.f48417j;
                                    float f27 = i23 / 255.0f;
                                    RectF rectF3 = AndroidUtilities.rectTmp;
                                    float dp4 = AndroidUtilities.dp(21.0f) / 2.0f;
                                    int i24 = g.f48444a;
                                    float f28 = 8;
                                    rectF3.set(f25, f26, dVar2.h.getWidth() + f25 + (AndroidUtilities.dp(f28) * 2), AndroidUtilities.dp(21.0f) + f26);
                                    u1 u1Var2 = dVar2.f48412b;
                                    boolean R2 = u1Var2.R2();
                                    Paint paint = dVar2.f48415g;
                                    if (paint != null) {
                                        int alpha = paint.getAlpha();
                                        paint.setAlpha((int) (255.0f * f27));
                                        canvas3.drawRoundRect(rectF3, dp4, dp4, paint);
                                        paint.setAlpha(alpha);
                                        f23 = 21.0f;
                                    } else {
                                        Point point = AndroidUtilities.displaySize;
                                        f23 = 21.0f;
                                        u1Var2.q0(0.0f, 0.0f, point.x, point.y);
                                        Paint M2 = u1Var2.M2("paintChatActionBackground");
                                        int alpha2 = M2.getAlpha();
                                        if (R2) {
                                            f24 = alpha2;
                                        } else {
                                            f24 = 229.5f;
                                        }
                                        M2.setAlpha((int) (f24 * f27));
                                        canvas3.drawRoundRect(rectF3, dp4, dp4, M2);
                                        M2.setAlpha(alpha2);
                                    }
                                    if (R2 || paint != null) {
                                        int alpha3 = h6.f21054h2.getAlpha();
                                        h6.f21054h2.setAlpha((int) (alpha3 * f27));
                                        canvas3.drawRoundRect(rectF3, dp4, dp4, h6.f21054h2);
                                        h6.f21054h2.setAlpha(alpha3);
                                    }
                                    canvas3.save();
                                    canvas3.translate(f25 + AndroidUtilities.dp(f28), ((AndroidUtilities.dp(f23) - dVar2.h.getHeight()) / 2.0f) + f26);
                                    int alpha4 = dVar2.h.getPaint().getAlpha();
                                    dVar2.h.getPaint().setAlpha((int) (alpha4 * f27));
                                    dVar2.h.draw(canvas3);
                                    dVar2.h.getPaint().setAlpha(alpha4);
                                    canvas3.restore();
                                    canvas3.restore();
                                    return;
                                default:
                                    d dVar3 = dVar;
                                    dVar3.getClass();
                                    int i25 = g.f48444a;
                                    float dp5 = AndroidUtilities.dp(21);
                                    dVar3.a(canvas3, dp5, dp5, dp5, i23 / 255.0f);
                                    return;
                            }
                        }
                    });
                    dVar.e = bVar2;
                    bVar2.a(AndroidUtilities.dp(f22), AndroidUtilities.dp(f22), 4.0f, AndroidUtilities.dp(10));
                }
                canvas.save();
                canvas.translate(g10 - g12, f21 - g12);
                float f23 = 21;
                canvas.scale(g12 / AndroidUtilities.dp(f23), g12 / AndroidUtilities.dp(f23));
                b bVar3 = dVar.e;
                bVar3.f48408i = (int) (interpolation * 255.0f);
                bVar3.draw(canvas);
                canvas.restore();
                return;
            }
            return;
        }
        if (!z10) {
            f7 = 1.0f - hVar.H;
        } else {
            f7 = i10 / 255.0f;
        }
        float f24 = f7;
        float g13 = g(0.3f, 0.075f, f.f48434k.getInterpolation(hVar.G));
        Matrix matrix = hVar.d;
        matrix.reset();
        matrix.setScale(g13, g13);
        matrix.postTranslate(0.0f, rectF2.bottom);
        hVar.f48455f.setLocalMatrix(matrix);
        Paint paint = hVar.f48454c;
        paint.setAlpha((int) (f.f48433j.getInterpolation(hVar.G) * 255.0f * f24));
        RectF rectF3 = f48446b0;
        rectF3.set(rectF2);
        rectF3.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        Rect rect = f48447c0;
        rectF3.round(rect);
        Drawable drawable = hVar.f48460x;
        drawable.setAlpha((int) (f24 * 255.0f));
        drawable.setBounds(rect);
        drawable.draw(canvas);
        boolean z13 = hVar.M;
        RectF rectF4 = hVar.f48456n;
        if (!z13) {
            canvas.save();
            canvas.translate(rectF4.left, rectF4.top);
            canvas.rotate((f.f48430f.getInterpolation(hVar.G) - f.f48431g.getInterpolation(hVar.G)) * (-40.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            canvas.translate(-u1Var.getSideButtonStartX(), -u1Var.getSideButtonStartY());
            u1Var.k2(canvas, true);
            canvas.restore();
        }
        if (hVar.Q && !hVar.M) {
            canvas.drawPath(hVar.e, paint);
        } else {
            float min2 = Math.min(rectF2.width(), rectF2.height()) / 2.0f;
            float min3 = Math.min(rectF4.width(), rectF4.height()) / 2.0f;
            canvas.drawRoundRect(rectF2, min2, min2, paint);
            if (!hVar.M) {
                canvas.drawRoundRect(rectF4, min3, min3, paint);
            }
        }
        float interpolation3 = f.f48443t.getInterpolation(hVar.G) * AndroidUtilities.dp(2.0f);
        float f25 = g.f48444a + 2;
        float interpolation4 = ((f.f48440q.getInterpolation(hVar.G) * AndroidUtilities.dp(f25)) / 2.0f) - interpolation3;
        float interpolation5 = ((f.f48441r.getInterpolation(hVar.G) * AndroidUtilities.dp(f25)) / 2.0f) - interpolation3;
        float interpolation6 = ((f.f48442s.getInterpolation(hVar.G) * AndroidUtilities.dp(f25)) / 2.0f) - interpolation3;
        int i23 = 0;
        while (i23 < i21) {
            int i24 = i15;
            while (i24 < dVarArr.length) {
                if ((i23 == 0 && i24 == hVar.R) || (i23 == i16 && i24 != hVar.R)) {
                    i11 = i23;
                    i13 = i24;
                    iVar = iVar2;
                    f11 = f13;
                    i14 = i21;
                } else {
                    float length = i24 - ((dVarArr.length / 2.0f) - 0.5f);
                    if (i24 == i21) {
                        f10 = interpolation4;
                    } else if (i24 != i16 && i24 != 3) {
                        f10 = interpolation6;
                    } else {
                        f10 = interpolation5;
                    }
                    f11 = f13;
                    float dp4 = (AndroidUtilities.dp(g.f48444a + 11) * length) + rectF2.centerX();
                    float centerY2 = rectF2.centerY();
                    i11 = i23;
                    final d dVar2 = dVarArr[i24];
                    float f26 = 16;
                    float dp5 = AndroidUtilities.dp(f26);
                    float measuredWidth = iVar2.getMeasuredWidth() - AndroidUtilities.dp(f26);
                    float f27 = rectF2.left;
                    iVar = iVar2;
                    float f28 = rectF2.right;
                    if (i24 == hVar.R && hVar.O) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        dVar2.getClass();
                        canvas2 = canvas;
                        i12 = i24;
                        f12 = dp4;
                        dVar2.a(canvas2, f12, centerY2, f10 + (AndroidUtilities.dp(2.0f) * dVar2.f48422o), f24);
                    } else {
                        canvas2 = canvas;
                        i12 = i24;
                        f12 = dp4;
                    }
                    float f29 = dVar2.f48422o;
                    if (f29 > f11 && dVar2.h != null) {
                        float f30 = (f29 * 0.15f) + 0.85f;
                        canvas2.save();
                        canvas2.scale(f30, f30, f12, centerY2);
                        float f31 = dVar2.f48422o * f24;
                        i13 = i12;
                        i14 = 2;
                        float D = q.D(8, 2, dVar2.h.getWidth());
                        dVar2.f48416i = d.b(d.b(f12, D, f27, f28), D, dp5, measuredWidth) - (D / 2.0f);
                        dVar2.f48417j = centerY2 - AndroidUtilities.dp(58.0f);
                        if (dVar2.f48414f == null) {
                            h hVar2 = dVar2.f48411a;
                            if (!hVar2.T) {
                                dVar2.f48415g = hVar2.L;
                                b bVar4 = new b(new a() {
                                    @Override
                                    public final void p(Canvas canvas3, int i232) {
                                        float f232;
                                        float f242;
                                        switch (r2) {
                                            case 0:
                                                d dVar22 = dVar2;
                                                dVar22.getClass();
                                                canvas3.save();
                                                canvas3.translate(-dVar22.f48416i, -dVar22.f48417j);
                                                float f252 = dVar22.f48416i;
                                                float f262 = dVar22.f48417j;
                                                float f272 = i232 / 255.0f;
                                                RectF rectF32 = AndroidUtilities.rectTmp;
                                                float dp42 = AndroidUtilities.dp(21.0f) / 2.0f;
                                                int i242 = g.f48444a;
                                                float f282 = 8;
                                                rectF32.set(f252, f262, dVar22.h.getWidth() + f252 + (AndroidUtilities.dp(f282) * 2), AndroidUtilities.dp(21.0f) + f262);
                                                u1 u1Var2 = dVar22.f48412b;
                                                boolean R2 = u1Var2.R2();
                                                Paint paint2 = dVar22.f48415g;
                                                if (paint2 != null) {
                                                    int alpha = paint2.getAlpha();
                                                    paint2.setAlpha((int) (255.0f * f272));
                                                    canvas3.drawRoundRect(rectF32, dp42, dp42, paint2);
                                                    paint2.setAlpha(alpha);
                                                    f232 = 21.0f;
                                                } else {
                                                    Point point = AndroidUtilities.displaySize;
                                                    f232 = 21.0f;
                                                    u1Var2.q0(0.0f, 0.0f, point.x, point.y);
                                                    Paint M2 = u1Var2.M2("paintChatActionBackground");
                                                    int alpha2 = M2.getAlpha();
                                                    if (R2) {
                                                        f242 = alpha2;
                                                    } else {
                                                        f242 = 229.5f;
                                                    }
                                                    M2.setAlpha((int) (f242 * f272));
                                                    canvas3.drawRoundRect(rectF32, dp42, dp42, M2);
                                                    M2.setAlpha(alpha2);
                                                }
                                                if (R2 || paint2 != null) {
                                                    int alpha3 = h6.f21054h2.getAlpha();
                                                    h6.f21054h2.setAlpha((int) (alpha3 * f272));
                                                    canvas3.drawRoundRect(rectF32, dp42, dp42, h6.f21054h2);
                                                    h6.f21054h2.setAlpha(alpha3);
                                                }
                                                canvas3.save();
                                                canvas3.translate(f252 + AndroidUtilities.dp(f282), ((AndroidUtilities.dp(f232) - dVar22.h.getHeight()) / 2.0f) + f262);
                                                int alpha4 = dVar22.h.getPaint().getAlpha();
                                                dVar22.h.getPaint().setAlpha((int) (alpha4 * f272));
                                                dVar22.h.draw(canvas3);
                                                dVar22.h.getPaint().setAlpha(alpha4);
                                                canvas3.restore();
                                                canvas3.restore();
                                                return;
                                            default:
                                                d dVar3 = dVar2;
                                                dVar3.getClass();
                                                int i25 = g.f48444a;
                                                float dp52 = AndroidUtilities.dp(21);
                                                dVar3.a(canvas3, dp52, dp52, dp52, i232 / 255.0f);
                                                return;
                                        }
                                    }
                                });
                                dVar2.f48414f = bVar4;
                                bVar4.a((int) D, AndroidUtilities.dp(21.0f), 3.0f, AndroidUtilities.dp(4));
                            }
                        }
                        b bVar5 = dVar2.f48414f;
                        if (bVar5 != null) {
                            float f32 = dVar2.f48416i;
                            float f33 = dVar2.f48417j;
                            bVar5.setBounds((int) f32, (int) f33, (int) (f32 + D), (int) (f33 + AndroidUtilities.dp(21.0f)));
                            b bVar6 = dVar2.f48414f;
                            bVar6.f48408i = (int) (f31 * 255.0f);
                            bVar6.draw(canvas2);
                        }
                        canvas2.restore();
                    } else {
                        i13 = i12;
                        i14 = 2;
                    }
                }
                i24 = i13 + 1;
                hVar = this;
                i21 = i14;
                i23 = i11;
                f13 = f11;
                iVar2 = iVar;
                i16 = 1;
            }
            i23++;
            hVar = this;
            i15 = 0;
            i16 = 1;
        }
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    public final int h() {
        return AndroidUtilities.dp(((g.f48444a + 11) * this.f48459w.length) + 7);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ObjectAnimator objectAnimator = this.Z;
        uf.c cVar = this.f48453b;
        if (animator == objectAnimator) {
            this.f48461y.setHideSideButtonByQuickShare(false);
            this.M = true;
            invalidateSelf();
            if (this.N) {
                cVar.run();
            }
        } else if (animator == this.f48452a0) {
            this.N = true;
            invalidateSelf();
            yb ybVar = this.W;
            if (ybVar != null) {
                ybVar.f32598a.setVisibility(0);
            }
            if (this.M) {
                cVar.run();
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
