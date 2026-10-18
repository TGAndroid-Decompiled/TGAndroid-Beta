package yh;

import ai.de;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.f6;
public class j1 extends br {
    public d11 f50319c;
    public d11 d;
    public final f6 e;
    public final Path f50320f;
    public final Path h;
    public final Paint f50321n;
    public final Paint f50322r;
    public final float f50323s;
    public de v;
    public boolean f50324w;
    public int f50325x;

    public j1(View view) {
        super(view);
        this.e = new f6(new tg.p(this, 17), 320L, bs.h, 0);
        Path path = new Path();
        this.f50320f = path;
        this.h = new Path();
        Paint paint = new Paint(1);
        this.f50321n = paint;
        Paint paint2 = new Paint(1);
        this.f50322r = paint2;
        this.f50325x = -1;
        this.f50323s = 1.0f;
        d(path, 1.0f, false);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        ((Paint) this.f25027b).setColor(-698031);
        ((Paint) this.f25027b).setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.33f)));
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
        path.moveTo(r4.c.d((Float) callbackReturn.run(Float.valueOf(46.83f)), f7), AndroidUtilities.dp(f10));
        path.lineTo(r4.c.d((Float) callbackReturn.run(Float.valueOf(23.5f)), f7), AndroidUtilities.dp(1.17f * f7));
        path.cubicTo(r4.c.d((Float) callbackReturn.run(Float.valueOf(22.75f)), f7), AndroidUtilities.dp(0.42f * f7), r4.c.d((Float) callbackReturn.run(Float.valueOf(21.73f)), f7), 0.0f, r4.c.d((Float) callbackReturn.run(Float.valueOf(20.68f)), f7), 0.0f);
        float f11 = f7 * 0.05f;
        path.cubicTo(r4.c.d((Float) callbackReturn.run(Float.valueOf(19.62f)), f7), 0.0f, r4.c.d((Float) callbackReturn.run(Float.valueOf(2.73f)), f7), AndroidUtilities.dp(f11), r4.c.d((Float) callbackReturn.run(Float.valueOf(1.55f)), f7), AndroidUtilities.dp(f11));
        path.cubicTo(r4.c.d((Float) callbackReturn.run(Float.valueOf(0.36f)), f7), AndroidUtilities.dp(f11), r4.c.d((Float) callbackReturn.run(Float.valueOf(-0.23f)), f7), AndroidUtilities.dp(1.4885f * f7), r4.c.d((Float) callbackReturn.run(Float.valueOf(0.6f)), f7), AndroidUtilities.dp(2.32f * f7));
        path.lineTo(r4.c.d((Float) callbackReturn.run(Float.valueOf(45.72f)), f7), AndroidUtilities.dp(47.44f * f7));
        Float valueOf = Float.valueOf(48.0f);
        path.cubicTo(r4.c.d((Float) callbackReturn.run(Float.valueOf(46.56f)), f7), AndroidUtilities.dp(48.28f * f7), r4.c.d((Float) callbackReturn.run(valueOf), f7), AndroidUtilities.dp(47.68f * f7), r4.c.d((Float) callbackReturn.run(valueOf), f7), AndroidUtilities.dp(46.5f * f7));
        path.cubicTo(r4.c.d((Float) callbackReturn.run(valueOf), f7), AndroidUtilities.dp(45.31f * f7), r4.c.d((Float) callbackReturn.run(valueOf), f7), AndroidUtilities.dp(28.38f * f7), r4.c.d((Float) callbackReturn.run(valueOf), f7), AndroidUtilities.dp(27.32f * f7));
        path.cubicTo(r4.c.d((Float) callbackReturn.run(valueOf), f7), AndroidUtilities.dp(26.26f * f7), r4.c.d((Float) callbackReturn.run(Float.valueOf(47.5f)), f7), AndroidUtilities.dp(25.24f * f7), r4.c.d((Float) callbackReturn.run(Float.valueOf(46.82f)), f7), AndroidUtilities.dp(f10));
        path.close();
    }

    public final void c(Canvas canvas, d11 d11Var, float f7) {
        float f10;
        float f11;
        canvas.save();
        canvas.translate(f7, f7);
        float width = getBounds().width() / 2.0f;
        float f12 = 6.0f;
        if (this.f50324w) {
            f10 = -7.0f;
        } else {
            f10 = 6.0f;
        }
        float dp = width + AndroidUtilities.dp(f10);
        float height = getBounds().height() / 2.0f;
        if (this.f50324w) {
            f12 = 5.0f;
        }
        float dp2 = height - AndroidUtilities.dp(f12);
        if (this.f50324w) {
            f11 = -45.0f;
        } else {
            f11 = 45.0f;
        }
        canvas.rotate(f11, dp, dp2);
        float min = Math.min(1.0f, AndroidUtilities.dp(40.0f) / d11Var.f25437c);
        canvas.scale(min, min, dp, dp2);
        d11Var.c(dp - (d11Var.l() / 2.0f), dp2 + AndroidUtilities.dp(1.0f), 1.0f, this.f50325x, canvas);
        canvas.restore();
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        canvas.translate(getBounds().right - AndroidUtilities.dp(48.0f), getBounds().top);
        Paint paint = this.f50322r;
        int alpha = paint.getAlpha();
        Path path = this.f50320f;
        if (alpha > 0) {
            paint.setStrokeWidth(AndroidUtilities.dp(1.33f) * 2);
            canvas.drawPath(path, paint);
        }
        canvas.drawPath(path, (Paint) this.f25027b);
        de deVar = this.v;
        float f7 = this.f50323s;
        if (deVar != null) {
            float f10 = f7 * 48.0f;
            canvas2 = canvas;
            canvas2.saveLayer(0.0f, 0.0f, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), null);
            this.v.f(0, 0, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f));
            this.v.d();
            this.v.a(canvas2, -1);
            Path path2 = this.h;
            path2.set(path);
            path2.toggleInverseFillType();
            canvas2.drawPath(path2, this.f50321n);
            canvas2.restore();
            invalidateSelf();
        } else {
            canvas2 = canvas;
        }
        if (this.f50319c != null) {
            f6 f6Var = this.e;
            float d = f6Var.d(1.0f, false);
            if (!f6Var.f26096i) {
                this.d = null;
            }
            canvas2.save();
            if (this.d != null && f6Var.f26096i) {
                canvas2.clipPath(path);
                float dp = AndroidUtilities.dp(f7 * 64.0f);
                c(canvas2, this.d, dp * d);
                c(canvas2, this.f50319c, (1.0f - d) * (-dp));
            } else {
                c(canvas2, this.f50319c, 0.0f);
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
        Paint paint = (Paint) this.f25027b;
        if (stargiftattributebackdrop == null) {
            paint.setShader(null);
            return;
        }
        if (this.f50324w) {
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
        int b10 = h6.b(f7, f10 - f11, i10);
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
        int[] iArr = {b10, h6.b(f13, f14 - f15, i11)};
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
        this.f50319c = new d11(charSequence, f7, typeface);
        invalidateSelf();
    }

    public final void g(int i10, String str) {
        d11 d11Var = this.f50319c;
        if (d11Var == null) {
            f(i10, str, true);
        } else if (TextUtils.equals(d11Var.k(), str)) {
        } else {
            this.d = this.f50319c;
            this.f50319c = new d11(str, i10, AndroidUtilities.bold());
            this.e.d(0.0f, true);
            invalidateSelf();
        }
    }
}
