package yh;

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.h11;
import zh.b8;
public class k1 extends er {
    public h11 f48936c;
    public h11 d;
    public final g6 e;
    public final Path f48937f;
    public final Path h;
    public final Paint f48938n;
    public final Paint f48939r;
    public final float f48940s;
    public b8 v;
    public boolean f48941w;
    public int f48942x;

    public k1(View view) {
        super(view);
        this.e = new g6(new rh.j(this, 27), 320L, es.h, 0);
        Path path = new Path();
        this.f48937f = path;
        this.h = new Path();
        Paint paint = new Paint(1);
        this.f48938n = paint;
        Paint paint2 = new Paint(1);
        this.f48939r = paint2;
        this.f48942x = -1;
        this.f48940s = 1.0f;
        d(path, 1.0f, false);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        ((Paint) this.f24769b).setColor(-698031);
        ((Paint) this.f24769b).setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.33f)));
        paint2.setColor(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeCap(Paint.Cap.ROUND);
    }

    public static void d(Path path, float f7, final boolean z10) {
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
        path.moveTo(t8.b.d((Float) callbackReturn.run(Float.valueOf(46.83f)), f7), AndroidUtilities.dp(f10));
        path.lineTo(t8.b.d((Float) callbackReturn.run(Float.valueOf(23.5f)), f7), AndroidUtilities.dp(1.17f * f7));
        path.cubicTo(t8.b.d((Float) callbackReturn.run(Float.valueOf(22.75f)), f7), AndroidUtilities.dp(0.42f * f7), t8.b.d((Float) callbackReturn.run(Float.valueOf(21.73f)), f7), 0.0f, t8.b.d((Float) callbackReturn.run(Float.valueOf(20.68f)), f7), 0.0f);
        float f11 = f7 * 0.05f;
        path.cubicTo(t8.b.d((Float) callbackReturn.run(Float.valueOf(19.62f)), f7), 0.0f, t8.b.d((Float) callbackReturn.run(Float.valueOf(2.73f)), f7), AndroidUtilities.dp(f11), t8.b.d((Float) callbackReturn.run(Float.valueOf(1.55f)), f7), AndroidUtilities.dp(f11));
        path.cubicTo(t8.b.d((Float) callbackReturn.run(Float.valueOf(0.36f)), f7), AndroidUtilities.dp(f11), t8.b.d((Float) callbackReturn.run(Float.valueOf(-0.23f)), f7), AndroidUtilities.dp(1.4885f * f7), t8.b.d((Float) callbackReturn.run(Float.valueOf(0.6f)), f7), AndroidUtilities.dp(2.32f * f7));
        path.lineTo(t8.b.d((Float) callbackReturn.run(Float.valueOf(45.72f)), f7), AndroidUtilities.dp(47.44f * f7));
        Float valueOf = Float.valueOf(48.0f);
        path.cubicTo(t8.b.d((Float) callbackReturn.run(Float.valueOf(46.56f)), f7), AndroidUtilities.dp(48.28f * f7), t8.b.d((Float) callbackReturn.run(valueOf), f7), AndroidUtilities.dp(47.68f * f7), t8.b.d((Float) callbackReturn.run(valueOf), f7), AndroidUtilities.dp(46.5f * f7));
        path.cubicTo(t8.b.d((Float) callbackReturn.run(valueOf), f7), AndroidUtilities.dp(45.31f * f7), t8.b.d((Float) callbackReturn.run(valueOf), f7), AndroidUtilities.dp(28.38f * f7), t8.b.d((Float) callbackReturn.run(valueOf), f7), AndroidUtilities.dp(27.32f * f7));
        path.cubicTo(t8.b.d((Float) callbackReturn.run(valueOf), f7), AndroidUtilities.dp(26.26f * f7), t8.b.d((Float) callbackReturn.run(Float.valueOf(47.5f)), f7), AndroidUtilities.dp(25.24f * f7), t8.b.d((Float) callbackReturn.run(Float.valueOf(46.82f)), f7), AndroidUtilities.dp(f10));
        path.close();
    }

    public final void c(Canvas canvas, h11 h11Var, float f7) {
        float f10;
        float f11;
        canvas.save();
        canvas.translate(f7, f7);
        float width = getBounds().width() / 2.0f;
        float f12 = 6.0f;
        if (this.f48941w) {
            f10 = -7.0f;
        } else {
            f10 = 6.0f;
        }
        float dp = width + AndroidUtilities.dp(f10);
        float height = getBounds().height() / 2.0f;
        if (this.f48941w) {
            f12 = 5.0f;
        }
        float dp2 = height - AndroidUtilities.dp(f12);
        if (this.f48941w) {
            f11 = -45.0f;
        } else {
            f11 = 45.0f;
        }
        canvas.rotate(f11, dp, dp2);
        float min = Math.min(1.0f, AndroidUtilities.dp(40.0f) / h11Var.f25473c);
        canvas.scale(min, min, dp, dp2);
        h11Var.c(dp - (h11Var.l() / 2.0f), dp2 + AndroidUtilities.dp(1.0f), 1.0f, this.f48942x, canvas);
        canvas.restore();
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        canvas.translate(getBounds().right - AndroidUtilities.dp(48.0f), getBounds().top);
        Paint paint = this.f48939r;
        int alpha = paint.getAlpha();
        Path path = this.f48937f;
        if (alpha > 0) {
            paint.setStrokeWidth(AndroidUtilities.dp(1.33f) * 2);
            canvas.drawPath(path, paint);
        }
        canvas.drawPath(path, (Paint) this.f24769b);
        b8 b8Var = this.v;
        float f7 = this.f48940s;
        if (b8Var != null) {
            float f10 = f7 * 48.0f;
            canvas2 = canvas;
            canvas2.saveLayer(0.0f, 0.0f, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), null);
            this.v.f(0, 0, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f));
            this.v.d();
            this.v.a(canvas2, -1);
            Path path2 = this.h;
            path2.set(path);
            path2.toggleInverseFillType();
            canvas2.drawPath(path2, this.f48938n);
            canvas2.restore();
            invalidateSelf();
        } else {
            canvas2 = canvas;
        }
        if (this.f48936c != null) {
            g6 g6Var = this.e;
            float d = g6Var.d(1.0f, false);
            if (!g6Var.f25193i) {
                this.d = null;
            }
            canvas2.save();
            if (this.d != null && g6Var.f25193i) {
                canvas2.clipPath(path);
                float dp = AndroidUtilities.dp(f7 * 64.0f);
                c(canvas2, this.d, dp * d);
                c(canvas2, this.f48936c, (1.0f - d) * (-dp));
            } else {
                c(canvas2, this.f48936c, 0.0f);
            }
            canvas2.restore();
        }
        canvas2.restore();
    }

    public final void e(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop, boolean z10, boolean z11) {
        boolean z12;
        float f7;
        float f10;
        float f11;
        float f12;
        Paint paint = (Paint) this.f24769b;
        if (stargiftattributebackdrop == null) {
            paint.setShader(null);
            return;
        }
        if (this.f48941w) {
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
        int b10 = org.telegram.ui.ActionBar.g6.b(f7, f10 - f11, i10);
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
        int[] iArr = {b10, org.telegram.ui.ActionBar.g6.b(f13, f14 - f15, i11)};
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

    public final void f(int i10, CharSequence charSequence, boolean z10) {
        Typeface typeface = null;
        this.d = null;
        this.e.d(1.0f, true);
        float f7 = i10;
        if (z10) {
            typeface = AndroidUtilities.bold();
        }
        this.f48936c = new h11(charSequence, f7, typeface);
        invalidateSelf();
    }
}
