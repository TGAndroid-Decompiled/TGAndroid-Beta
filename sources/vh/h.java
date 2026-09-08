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
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.w1;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Components.yb;
import org.telegram.ui.web.b1;
import rg.p2;
import ug.r;
public final class h extends Drawable implements Animator.AnimatorListener {
    public static final RectF f47905b0 = new RectF();
    public static final Rect f47906c0 = new Rect();
    public static final int[] f47907d0 = new int[2];
    public static final t8 f47908e0 = new t8("openFactor", 11);
    public static final t8 f47909f0 = new t8("openFactor", 12);
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
    public final i f47910a;
    public final r f47912b;
    public final LinearGradient f47915f;
    public final d[] f47919w;
    public final Drawable f47920x;
    public final t1 f47921y;
    public final Paint f47913c = new Paint(1);
    public final Matrix d = new Matrix();
    public final Path f47914e = new Path();
    public final RectF h = new RectF();
    public final RectF f47916n = new RectF();
    public final RectF f47917r = new RectF();
    public final RectF f47918s = new RectF();
    public final RectF v = new RectF();
    public float G = 0.0f;
    public float H = 0.0f;
    public final Matrix K = new Matrix();
    public boolean M = false;
    public boolean N = false;
    public boolean O = false;
    public boolean Q = true;
    public int R = -1;
    public final ObjectAnimator Z = ObjectAnimator.ofFloat(this, f47908e0, 1.0f).setDuration(560L);
    public final ObjectAnimator f47911a0 = ObjectAnimator.ofFloat(this, f47909f0, 1.0f).setDuration(240L);

    public h(i iVar, t1 t1Var, ArrayList arrayList, r rVar) {
        this.f47912b = rVar;
        this.f47910a = iVar;
        this.f47921y = t1Var;
        this.E = t1Var.getMessageObject();
        this.f47919w = new d[Math.min(5, arrayList.size())];
        int i10 = 0;
        while (true) {
            d[] dVarArr = this.f47919w;
            if (i10 < dVarArr.length) {
                dVarArr[i10] = new d(this, ((Long) arrayList.get(i10)).longValue());
                i10++;
            } else {
                this.f47913c.setStyle(Paint.Style.FILL);
                Drawable mutate = iVar.getContext().getDrawable(R.drawable.reactions_bubble_shadow).mutate();
                this.f47920x = mutate;
                t1Var.setHideSideButtonByQuickShare(true);
                iVar.performHapticFeedback(3, 1);
                int v02 = j6.v0(j6.G8, this.f47921y.getResourcesProvider());
                mutate.setColorFilter(new PorterDuffColorFilter(j6.w0(null, j6.Td, false), PorterDuff.Mode.MULTIPLY));
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(100.0f), new int[]{v02, 16777215 & v02}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f47915f = linearGradient;
                this.f47913c.setShader(linearGradient);
                ObjectAnimator objectAnimator = this.Z;
                LinearInterpolator linearInterpolator = f.f47886b;
                objectAnimator.setInterpolator(linearInterpolator);
                this.Z.addListener(this);
                this.f47911a0.setInterpolator(linearInterpolator);
                this.f47911a0.addListener(this);
                AndroidUtilities.makeGlobalBlurBitmap(new b1(this, 16), 15.0f);
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
        this.f47911a0.start();
        this.O = true;
        if (this.M && !this.T) {
            b bVar = new b(new p2(this, 10));
            this.P = bVar;
            RectF rectF = this.f47917r;
            int i10 = g.f47903a;
            bVar.a((int) rectF.width(), (int) (rectF.height() + AndroidUtilities.dp(30.0f)), 4.0f, AndroidUtilities.dp(10));
        }
        invalidateSelf();
    }

    public final void d() {
        d[] dVarArr;
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        this.f47921y.setHideSideButtonByQuickShare(false);
        if (!this.T) {
            this.T = true;
            Bitmap bitmap4 = this.I;
            if (bitmap4 != null) {
                bitmap4.recycle();
            }
            b bVar = this.P;
            if (bVar != null && (bitmap3 = bVar.f47861c) != null) {
                bitmap3.recycle();
                bVar.f47861c = null;
            }
            for (d dVar : this.f47919w) {
                b bVar2 = dVar.f47872f;
                if (bVar2 != null && (bitmap2 = bVar2.f47861c) != null) {
                    bitmap2.recycle();
                    bVar2.f47861c = null;
                }
                b bVar3 = dVar.f47871e;
                if (bVar3 != null && (bitmap = bVar3.f47861c) != null) {
                    bitmap.recycle();
                    bVar3.f47861c = null;
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
        i iVar;
        boolean z11;
        Canvas canvas2;
        int i12;
        float f11;
        int i13;
        float min;
        double d;
        h hVar = this;
        boolean z12 = hVar.S;
        i iVar2 = hVar.f47910a;
        t1 t1Var = hVar.f47921y;
        int i14 = 1;
        if (!z12) {
            int[] iArr = f47907d0;
            t1Var.getLocationInWindow(iArr);
            int i15 = iArr[0];
            int i16 = iArr[1];
            iVar2.getLocationInWindow(iArr);
            int i17 = iArr[0];
            int i18 = iArr[1];
            hVar.U = i15 - i17;
            hVar.V = i16 - i18;
            float dp = AndroidUtilities.dp(16.0f);
            float sideButtonStartX = t1Var.getSideButtonStartX() + hVar.U + dp;
            float sideButtonStartY = t1Var.getSideButtonStartY() + hVar.V + dp;
            float f12 = sideButtonStartX - dp;
            float f13 = sideButtonStartY - dp;
            float f14 = sideButtonStartX + dp;
            float f15 = sideButtonStartY + dp;
            RectF rectF = hVar.h;
            rectF.set(f12, f13, f14, f15);
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
        d[] dVarArr = hVar.f47919w;
        int i19 = 2;
        RectF rectF2 = hVar.f47917r;
        if (bVar != null && !z10) {
            bVar.setBounds((int) rectF2.left, (int) (rectF2.top - AndroidUtilities.dp(30.0f)), (int) rectF2.right, (int) rectF2.bottom);
            hVar.P.f47865i = (int) ((1.0f - f.f47887c.getInterpolation(hVar.H)) * 255.0f);
            hVar.P.draw(canvas);
            if (hVar.R != -1) {
                float interpolation = 1.0f - f.f47888e.getInterpolation(hVar.H);
                float interpolation2 = f.d.getInterpolation(hVar.H);
                float centerX = rectF2.centerX();
                int i20 = g.f47903a;
                float dp3 = centerX + (AndroidUtilities.dp(i20 + 11) * (hVar.R - 2));
                float centerY = rectF2.centerY();
                float f16 = hVar.X;
                float f17 = hVar.Y;
                float f18 = (dp3 + f16) / 2.0f;
                yb ybVar = hVar.W;
                if (ybVar != null && ybVar.top) {
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
                final d dVar = dVarArr[hVar.R];
                if (dVar.f47871e == null) {
                    b bVar2 = new b(new a() {
                        @Override
                        public final void r(Canvas canvas3, int i21) {
                            float f21;
                            float f22;
                            switch (r2) {
                                case 0:
                                    d dVar2 = dVar;
                                    dVar2.getClass();
                                    canvas3.save();
                                    canvas3.translate(-dVar2.f47874i, -dVar2.f47875j);
                                    float f23 = dVar2.f47874i;
                                    float f24 = dVar2.f47875j;
                                    float f25 = i21 / 255.0f;
                                    RectF rectF3 = AndroidUtilities.rectTmp;
                                    float dp4 = AndroidUtilities.dp(21.0f) / 2.0f;
                                    int i22 = g.f47903a;
                                    float f26 = 8;
                                    rectF3.set(f23, f24, dVar2.h.getWidth() + f23 + (AndroidUtilities.dp(f26) * 2), AndroidUtilities.dp(21.0f) + f24);
                                    t1 t1Var2 = dVar2.f47869b;
                                    boolean R2 = t1Var2.R2();
                                    Paint paint = dVar2.f47873g;
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
                                        int alpha3 = j6.f20758h2.getAlpha();
                                        j6.f20758h2.setAlpha((int) (alpha3 * f25));
                                        canvas3.drawRoundRect(rectF3, dp4, dp4, j6.f20758h2);
                                        j6.f20758h2.setAlpha(alpha3);
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
                                    int i23 = g.f47903a;
                                    float dp5 = AndroidUtilities.dp(21);
                                    dVar3.a(canvas3, dp5, dp5, dp5, i21 / 255.0f);
                                    return;
                            }
                        }
                    });
                    dVar.f47871e = bVar2;
                    bVar2.a(AndroidUtilities.dp(f20), AndroidUtilities.dp(f20), 4.0f, AndroidUtilities.dp(10));
                }
                canvas.save();
                canvas.translate(g10 - g12, f19 - g12);
                float f21 = 21;
                canvas.scale(g12 / AndroidUtilities.dp(f21), g12 / AndroidUtilities.dp(f21));
                b bVar3 = dVar.f47871e;
                bVar3.f47865i = (int) (interpolation * 255.0f);
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
        float f22 = f7;
        float g13 = g(0.3f, 0.075f, f.f47893k.getInterpolation(hVar.G));
        Matrix matrix = hVar.d;
        matrix.reset();
        matrix.setScale(g13, g13);
        matrix.postTranslate(0.0f, rectF2.bottom);
        hVar.f47915f.setLocalMatrix(matrix);
        Paint paint = hVar.f47913c;
        paint.setAlpha((int) (f.f47892j.getInterpolation(hVar.G) * 255.0f * f22));
        RectF rectF3 = f47905b0;
        rectF3.set(rectF2);
        rectF3.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        Rect rect = f47906c0;
        rectF3.round(rect);
        Drawable drawable = hVar.f47920x;
        drawable.setAlpha((int) (f22 * 255.0f));
        drawable.setBounds(rect);
        drawable.draw(canvas);
        boolean z13 = hVar.M;
        RectF rectF4 = hVar.f47916n;
        if (!z13) {
            canvas.save();
            canvas.translate(rectF4.left, rectF4.top);
            canvas.rotate((f.f47889f.getInterpolation(hVar.G) - f.f47890g.getInterpolation(hVar.G)) * (-40.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            canvas.translate(-t1Var.getSideButtonStartX(), -t1Var.getSideButtonStartY());
            t1Var.k2(canvas, true);
            canvas.restore();
        }
        if (hVar.Q && !hVar.M) {
            canvas.drawPath(hVar.f47914e, paint);
        } else {
            float min2 = Math.min(rectF2.width(), rectF2.height()) / 2.0f;
            float min3 = Math.min(rectF4.width(), rectF4.height()) / 2.0f;
            canvas.drawRoundRect(rectF2, min2, min2, paint);
            if (!hVar.M) {
                canvas.drawRoundRect(rectF4, min3, min3, paint);
            }
        }
        float interpolation3 = f.f47902t.getInterpolation(hVar.G) * AndroidUtilities.dp(2.0f);
        float f23 = g.f47903a + 2;
        float interpolation4 = ((f.f47899q.getInterpolation(hVar.G) * AndroidUtilities.dp(f23)) / 2.0f) - interpolation3;
        float interpolation5 = ((f.f47900r.getInterpolation(hVar.G) * AndroidUtilities.dp(f23)) / 2.0f) - interpolation3;
        float interpolation6 = ((f.f47901s.getInterpolation(hVar.G) * AndroidUtilities.dp(f23)) / 2.0f) - interpolation3;
        int i21 = 0;
        while (i21 < i19) {
            int i22 = 0;
            while (i22 < dVarArr.length) {
                if ((i21 == 0 && i22 == hVar.R) || (i21 == i14 && i22 != hVar.R)) {
                    i11 = i21;
                    i13 = i22;
                    iVar = iVar2;
                } else {
                    float length = i22 - ((dVarArr.length / 2.0f) - 0.5f);
                    if (i22 == i19) {
                        f10 = interpolation4;
                    } else if (i22 != i14 && i22 != 3) {
                        f10 = interpolation6;
                    } else {
                        f10 = interpolation5;
                    }
                    float dp4 = (AndroidUtilities.dp(g.f47903a + 11) * length) + rectF2.centerX();
                    float centerY2 = rectF2.centerY();
                    i11 = i21;
                    final d dVar2 = dVarArr[i22];
                    float f24 = 16;
                    float dp5 = AndroidUtilities.dp(f24);
                    float measuredWidth = iVar2.getMeasuredWidth() - AndroidUtilities.dp(f24);
                    float f25 = rectF2.left;
                    iVar = iVar2;
                    float f26 = rectF2.right;
                    if (i22 == hVar.R && hVar.O) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        dVar2.getClass();
                        canvas2 = canvas;
                        i12 = i22;
                        f11 = dp4;
                        dVar2.a(canvas2, f11, centerY2, f10 + (AndroidUtilities.dp(2.0f) * dVar2.f47880o), f22);
                    } else {
                        canvas2 = canvas;
                        i12 = i22;
                        f11 = dp4;
                    }
                    float f27 = dVar2.f47880o;
                    if (f27 > 0.0f && dVar2.h != null) {
                        float f28 = (f27 * 0.15f) + 0.85f;
                        canvas2.save();
                        canvas2.scale(f28, f28, f11, centerY2);
                        float f29 = dVar2.f47880o * f22;
                        i13 = i12;
                        float D = w1.D(8, 2, dVar2.h.getWidth());
                        dVar2.f47874i = d.b(d.b(f11, D, f25, f26), D, dp5, measuredWidth) - (D / 2.0f);
                        dVar2.f47875j = centerY2 - AndroidUtilities.dp(58.0f);
                        if (dVar2.f47872f == null) {
                            h hVar2 = dVar2.f47868a;
                            if (!hVar2.T) {
                                dVar2.f47873g = hVar2.L;
                                b bVar4 = new b(new a() {
                                    @Override
                                    public final void r(Canvas canvas3, int i212) {
                                        float f212;
                                        float f222;
                                        switch (r2) {
                                            case 0:
                                                d dVar22 = dVar2;
                                                dVar22.getClass();
                                                canvas3.save();
                                                canvas3.translate(-dVar22.f47874i, -dVar22.f47875j);
                                                float f232 = dVar22.f47874i;
                                                float f242 = dVar22.f47875j;
                                                float f252 = i212 / 255.0f;
                                                RectF rectF32 = AndroidUtilities.rectTmp;
                                                float dp42 = AndroidUtilities.dp(21.0f) / 2.0f;
                                                int i222 = g.f47903a;
                                                float f262 = 8;
                                                rectF32.set(f232, f242, dVar22.h.getWidth() + f232 + (AndroidUtilities.dp(f262) * 2), AndroidUtilities.dp(21.0f) + f242);
                                                t1 t1Var2 = dVar22.f47869b;
                                                boolean R2 = t1Var2.R2();
                                                Paint paint2 = dVar22.f47873g;
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
                                                    int alpha3 = j6.f20758h2.getAlpha();
                                                    j6.f20758h2.setAlpha((int) (alpha3 * f252));
                                                    canvas3.drawRoundRect(rectF32, dp42, dp42, j6.f20758h2);
                                                    j6.f20758h2.setAlpha(alpha3);
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
                                                int i23 = g.f47903a;
                                                float dp52 = AndroidUtilities.dp(21);
                                                dVar3.a(canvas3, dp52, dp52, dp52, i212 / 255.0f);
                                                return;
                                        }
                                    }
                                });
                                dVar2.f47872f = bVar4;
                                bVar4.a((int) D, AndroidUtilities.dp(21.0f), 3.0f, AndroidUtilities.dp(4));
                            }
                        }
                        b bVar5 = dVar2.f47872f;
                        if (bVar5 != null) {
                            float f30 = dVar2.f47874i;
                            float f31 = dVar2.f47875j;
                            bVar5.setBounds((int) f30, (int) f31, (int) (f30 + D), (int) (f31 + AndroidUtilities.dp(21.0f)));
                            b bVar6 = dVar2.f47872f;
                            bVar6.f47865i = (int) (f29 * 255.0f);
                            bVar6.draw(canvas2);
                        }
                        canvas2.restore();
                    } else {
                        i13 = i12;
                    }
                }
                i22 = i13 + 1;
                hVar = this;
                i21 = i11;
                iVar2 = iVar;
                i14 = 1;
                i19 = 2;
            }
            i21++;
            hVar = this;
            i14 = 1;
            i19 = 2;
        }
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    public final int h() {
        return AndroidUtilities.dp(((g.f47903a + 11) * this.f47919w.length) + 7);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ObjectAnimator objectAnimator = this.Z;
        r rVar = this.f47912b;
        if (animator == objectAnimator) {
            this.f47921y.setHideSideButtonByQuickShare(false);
            this.M = true;
            invalidateSelf();
            if (this.N) {
                rVar.run();
            }
        } else if (animator == this.f47911a0) {
            this.N = true;
            invalidateSelf();
            yb ybVar = this.W;
            if (ybVar != null) {
                ybVar.f32902a.setVisibility(0);
            }
            if (this.M) {
                rVar.run();
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
