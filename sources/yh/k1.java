package yh;

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.qq;
import zh.h8;
public final class k1 extends qq {
    public f01 f50404b;
    public final Path f50405c;
    public final Paint d;
    public final float f50406e;
    public h8 f50407f;
    public boolean f50408g;
    public int h;

    public k1(View view) {
        super(view);
        Path path = new Path();
        this.f50405c = path;
        Paint paint = new Paint(1);
        this.d = paint;
        this.h = -1;
        this.f50406e = 1.0f;
        c(path, 1.0f, false);
        this.f29824a.setColor(-698031);
        this.f29824a.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.33f)));
        paint.setColor(0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public static void c(Path path, float f7, final boolean z10) {
        Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() {
            @Override
            public final Object run(Object obj) {
                float floatValue;
                Float f10 = (Float) obj;
                if (z10) {
                    floatValue = 48.0f - f10.floatValue();
                } else {
                    floatValue = f10.floatValue();
                }
                return Float.valueOf(floatValue);
            }
        };
        path.rewind();
        float f10 = f7 * 24.5f;
        path.moveTo(w.f.d((Float) callbackReturn.run(Float.valueOf(46.83f)), f7), AndroidUtilities.dp(f10));
        path.lineTo(w.f.d((Float) callbackReturn.run(Float.valueOf(23.5f)), f7), AndroidUtilities.dp(1.17f * f7));
        path.cubicTo(w.f.d((Float) callbackReturn.run(Float.valueOf(22.75f)), f7), AndroidUtilities.dp(0.42f * f7), w.f.d((Float) callbackReturn.run(Float.valueOf(21.73f)), f7), 0.0f, w.f.d((Float) callbackReturn.run(Float.valueOf(20.68f)), f7), 0.0f);
        float f11 = f7 * 0.05f;
        path.cubicTo(w.f.d((Float) callbackReturn.run(Float.valueOf(19.62f)), f7), 0.0f, w.f.d((Float) callbackReturn.run(Float.valueOf(2.73f)), f7), AndroidUtilities.dp(f11), w.f.d((Float) callbackReturn.run(Float.valueOf(1.55f)), f7), AndroidUtilities.dp(f11));
        path.cubicTo(w.f.d((Float) callbackReturn.run(Float.valueOf(0.36f)), f7), AndroidUtilities.dp(f11), w.f.d((Float) callbackReturn.run(Float.valueOf(-0.23f)), f7), AndroidUtilities.dp(1.4885f * f7), w.f.d((Float) callbackReturn.run(Float.valueOf(0.6f)), f7), AndroidUtilities.dp(2.32f * f7));
        path.lineTo(w.f.d((Float) callbackReturn.run(Float.valueOf(45.72f)), f7), AndroidUtilities.dp(47.44f * f7));
        Float valueOf = Float.valueOf(48.0f);
        path.cubicTo(w.f.d((Float) callbackReturn.run(Float.valueOf(46.56f)), f7), AndroidUtilities.dp(48.28f * f7), w.f.d((Float) callbackReturn.run(valueOf), f7), AndroidUtilities.dp(47.68f * f7), w.f.d((Float) callbackReturn.run(valueOf), f7), AndroidUtilities.dp(46.5f * f7));
        path.cubicTo(w.f.d((Float) callbackReturn.run(valueOf), f7), AndroidUtilities.dp(45.31f * f7), w.f.d((Float) callbackReturn.run(valueOf), f7), AndroidUtilities.dp(28.38f * f7), w.f.d((Float) callbackReturn.run(valueOf), f7), AndroidUtilities.dp(27.32f * f7));
        path.cubicTo(w.f.d((Float) callbackReturn.run(valueOf), f7), AndroidUtilities.dp(26.26f * f7), w.f.d((Float) callbackReturn.run(Float.valueOf(47.5f)), f7), AndroidUtilities.dp(25.24f * f7), w.f.d((Float) callbackReturn.run(Float.valueOf(46.82f)), f7), AndroidUtilities.dp(f10));
        path.close();
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop, boolean z10, boolean z11) {
        boolean z12;
        float f7;
        float f10;
        float f11;
        float f12;
        Paint paint = this.f29824a;
        if (stargiftattributebackdrop == null) {
            paint.setShader(null);
            return;
        }
        if (this.f50408g) {
            z12 = !z10;
        } else {
            z12 = z10;
        }
        float dp = AndroidUtilities.dp(48.0f);
        float dp2 = AndroidUtilities.dp(48.0f);
        int i10 = stargiftattributebackdrop.center_color | (-16777216);
        float f13 = 0.05f;
        if (z12) {
            f7 = 0.07f;
        } else {
            f7 = 0.05f;
        }
        float f14 = -0.1f;
        if (z12) {
            f10 = -0.15f;
        } else {
            f10 = -0.1f;
        }
        float f15 = 0.125f;
        float f16 = 0.0f;
        if (z11) {
            f11 = 0.125f;
        } else {
            f11 = 0.0f;
        }
        int b10 = j6.b(f7, f10 - f11, i10);
        int i11 = stargiftattributebackdrop.edge_color | (-16777216);
        if (z12) {
            f13 = 0.07f;
        }
        if (z12) {
            f14 = -0.15f;
        }
        if (!z11) {
            f15 = 0.0f;
        }
        int[] iArr = {b10, j6.b(f13, f14 - f15, i11)};
        if (z12) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        if (!z12) {
            f16 = 1.0f;
        }
        paint.setShader(new LinearGradient(0.0f, 0.0f, dp, dp2, iArr, new float[]{f12, f16}, Shader.TileMode.CLAMP));
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        canvas.save();
        canvas.translate(getBounds().right - AndroidUtilities.dp(48.0f), getBounds().top);
        Paint paint = this.d;
        int alpha = paint.getAlpha();
        Path path = this.f50405c;
        if (alpha > 0) {
            paint.setStrokeWidth(AndroidUtilities.dp(1.33f) * 2);
            canvas.drawPath(path, paint);
        }
        canvas.drawPath(path, this.f29824a);
        if (this.f50407f != null) {
            canvas.clipPath(path);
            this.f50407f.f(0, 0, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f));
            this.f50407f.d();
            this.f50407f.a(canvas, -1);
            invalidateSelf();
        }
        if (this.f50404b != null) {
            canvas.save();
            if (this.f50408g) {
                f7 = -45.0f;
            } else {
                f7 = 45.0f;
            }
            float width = getBounds().width() / 2.0f;
            float f14 = -7.0f;
            if (this.f50408g) {
                f10 = -7.0f;
            } else {
                f10 = 6.0f;
            }
            float dp = width + AndroidUtilities.dp(f10);
            float height = getBounds().height() / 2.0f;
            float f15 = 5.0f;
            if (this.f50408g) {
                f11 = 5.0f;
            } else {
                f11 = 6.0f;
            }
            canvas.rotate(f7, dp, height - AndroidUtilities.dp(f11));
            float min = Math.min(1.0f, AndroidUtilities.dp(40.0f) / this.f50404b.f25874c);
            float width2 = getBounds().width() / 2.0f;
            if (this.f50408g) {
                f12 = -7.0f;
            } else {
                f12 = 6.0f;
            }
            float dp2 = width2 + AndroidUtilities.dp(f12);
            float height2 = getBounds().height() / 2.0f;
            if (this.f50408g) {
                f13 = 5.0f;
            } else {
                f13 = 6.0f;
            }
            canvas.scale(min, min, dp2, height2 - AndroidUtilities.dp(f13));
            f01 f01Var = this.f50404b;
            float width3 = getBounds().width() / 2.0f;
            if (!this.f50408g) {
                f14 = 6.0f;
            }
            float dp3 = (width3 + AndroidUtilities.dp(f14)) - (this.f50404b.l() / 2.0f);
            float height3 = getBounds().height() / 2.0f;
            if (this.f50408g) {
                f15 = 4.0f;
            }
            canvas2 = canvas;
            f01Var.c(dp3, height3 - AndroidUtilities.dp(f15), 1.0f, this.h, canvas2);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public final void e(int i10, CharSequence charSequence, boolean z10) {
        Typeface typeface;
        float f7 = i10;
        if (z10) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        this.f50404b = new f01(charSequence, f7, typeface);
    }
}
