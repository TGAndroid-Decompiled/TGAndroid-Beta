package zh;

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
import bi.ud;
import org.telegram.messenger.d20;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;
public class c1 extends a5.h {
    public my0 f60143c;
    public my0 d;
    public final w5 f60144e;
    public final Path f60145f;
    public final Path h;
    public final Paint f60146n;
    public final Paint f60147r;
    public final float f60148s;
    public ud f60149w;
    public boolean f60150x;
    public int f60151y;

    public c1(View view) {
        super(view);
        this.f60144e = new w5(new wg.p(this, 9), 320L, xq.h, 0);
        Path path = new Path();
        this.f60145f = path;
        this.h = new Path();
        Paint paint = new Paint(1);
        this.f60146n = paint;
        Paint paint2 = new Paint(1);
        this.f60147r = paint2;
        this.f60151y = -1;
        this.f60148s = 1.0f;
        d(path, 1.0f, false);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        ((Paint) this.f220b).setColor(-698031);
        ((Paint) this.f220b).setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(2.33f)));
        paint2.setColor(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeCap(Paint.Cap.ROUND);
    }

    public static void d(Path path, float f10, final boolean z9) {
        d20 d20Var = new d20() {
            @Override
            public final Object a(Object obj) {
                float floatValue;
                Float f11 = (Float) obj;
                if (z9) {
                    floatValue = 48.0f - f11.floatValue();
                } else {
                    floatValue = f11.floatValue();
                }
                return Float.valueOf(floatValue);
            }
        };
        path.rewind();
        float f11 = f10 * 24.5f;
        path.moveTo(rf.b.e((Float) d20Var.a(Float.valueOf(46.83f)), f10), org.telegram.messenger.g0.L(f11));
        path.lineTo(rf.b.e((Float) d20Var.a(Float.valueOf(23.5f)), f10), org.telegram.messenger.g0.L(1.17f * f10));
        path.cubicTo(rf.b.e((Float) d20Var.a(Float.valueOf(22.75f)), f10), org.telegram.messenger.g0.L(0.42f * f10), rf.b.e((Float) d20Var.a(Float.valueOf(21.73f)), f10), 0.0f, rf.b.e((Float) d20Var.a(Float.valueOf(20.68f)), f10), 0.0f);
        float f12 = f10 * 0.05f;
        path.cubicTo(rf.b.e((Float) d20Var.a(Float.valueOf(19.62f)), f10), 0.0f, rf.b.e((Float) d20Var.a(Float.valueOf(2.73f)), f10), org.telegram.messenger.g0.L(f12), rf.b.e((Float) d20Var.a(Float.valueOf(1.55f)), f10), org.telegram.messenger.g0.L(f12));
        path.cubicTo(rf.b.e((Float) d20Var.a(Float.valueOf(0.36f)), f10), org.telegram.messenger.g0.L(f12), rf.b.e((Float) d20Var.a(Float.valueOf(-0.23f)), f10), org.telegram.messenger.g0.L(1.4885f * f10), rf.b.e((Float) d20Var.a(Float.valueOf(0.6f)), f10), org.telegram.messenger.g0.L(2.32f * f10));
        path.lineTo(rf.b.e((Float) d20Var.a(Float.valueOf(45.72f)), f10), org.telegram.messenger.g0.L(47.44f * f10));
        Float valueOf = Float.valueOf(48.0f);
        path.cubicTo(rf.b.e((Float) d20Var.a(Float.valueOf(46.56f)), f10), org.telegram.messenger.g0.L(48.28f * f10), rf.b.e((Float) d20Var.a(valueOf), f10), org.telegram.messenger.g0.L(47.68f * f10), rf.b.e((Float) d20Var.a(valueOf), f10), org.telegram.messenger.g0.L(46.5f * f10));
        path.cubicTo(rf.b.e((Float) d20Var.a(valueOf), f10), org.telegram.messenger.g0.L(45.31f * f10), rf.b.e((Float) d20Var.a(valueOf), f10), org.telegram.messenger.g0.L(28.38f * f10), rf.b.e((Float) d20Var.a(valueOf), f10), org.telegram.messenger.g0.L(27.32f * f10));
        path.cubicTo(rf.b.e((Float) d20Var.a(valueOf), f10), org.telegram.messenger.g0.L(26.26f * f10), rf.b.e((Float) d20Var.a(Float.valueOf(47.5f)), f10), org.telegram.messenger.g0.L(25.24f * f10), rf.b.e((Float) d20Var.a(Float.valueOf(46.82f)), f10), org.telegram.messenger.g0.L(f11));
        path.close();
    }

    public final void c(Canvas canvas, my0 my0Var, float f10) {
        float f11;
        float f12;
        canvas.save();
        canvas.translate(f10, f10);
        float width = getBounds().width() / 2.0f;
        float f13 = 6.0f;
        if (this.f60150x) {
            f11 = -7.0f;
        } else {
            f11 = 6.0f;
        }
        float L = width + org.telegram.messenger.g0.L(f11);
        float height = getBounds().height() / 2.0f;
        if (this.f60150x) {
            f13 = 5.0f;
        }
        float L2 = height - org.telegram.messenger.g0.L(f13);
        if (this.f60150x) {
            f12 = -45.0f;
        } else {
            f12 = 45.0f;
        }
        canvas.rotate(f12, L, L2);
        float min = Math.min(1.0f, org.telegram.messenger.g0.L(40.0f) / my0Var.f36125c);
        canvas.scale(min, min, L, L2);
        my0Var.c(L - (my0Var.k() / 2.0f), L2 + org.telegram.messenger.g0.L(1.0f), 1.0f, this.f60151y, canvas);
        canvas.restore();
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        canvas.translate(getBounds().right - org.telegram.messenger.g0.L(48.0f), getBounds().top);
        Paint paint = this.f60147r;
        int alpha = paint.getAlpha();
        Path path = this.f60145f;
        if (alpha > 0) {
            paint.setStrokeWidth(org.telegram.messenger.g0.L(1.33f) * 2);
            canvas.drawPath(path, paint);
        }
        canvas.drawPath(path, (Paint) this.f220b);
        ud udVar = this.f60149w;
        float f10 = this.f60148s;
        if (udVar != null) {
            float f11 = f10 * 48.0f;
            canvas2 = canvas;
            canvas2.saveLayer(0.0f, 0.0f, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), null);
            this.f60149w.f(0, 0, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f));
            this.f60149w.d();
            this.f60149w.a(canvas2, -1);
            Path path2 = this.h;
            path2.set(path);
            path2.toggleInverseFillType();
            canvas2.drawPath(path2, this.f60146n);
            canvas2.restore();
            invalidateSelf();
        } else {
            canvas2 = canvas;
        }
        if (this.f60143c != null) {
            w5 w5Var = this.f60144e;
            float e10 = w5Var.e(false, 1.0f);
            if (!w5Var.f39859i) {
                this.d = null;
            }
            canvas2.save();
            if (this.d != null && w5Var.f39859i) {
                canvas2.clipPath(path);
                float L = org.telegram.messenger.g0.L(f10 * 64.0f);
                c(canvas2, this.d, L * e10);
                c(canvas2, this.f60143c, (1.0f - e10) * (-L));
            } else {
                c(canvas2, this.f60143c, 0.0f);
            }
            canvas2.restore();
        }
        canvas2.restore();
    }

    public final void e(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop, boolean z9, boolean z10) {
        boolean z11;
        float f10;
        float f11;
        float f12;
        float f13;
        Paint paint = (Paint) this.f220b;
        if (stargiftattributebackdrop == null) {
            paint.setShader(null);
            return;
        }
        if (this.f60150x) {
            z11 = !z9;
        } else {
            z11 = z9;
        }
        float L = org.telegram.messenger.g0.L(48.0f);
        float L2 = org.telegram.messenger.g0.L(48.0f);
        int i7 = stargiftattributebackdrop.center_color | (-16777216);
        float f14 = 0.05f;
        if (z11) {
            f10 = 0.07f;
        } else {
            f10 = 0.05f;
        }
        float f15 = -0.1f;
        if (z11) {
            f11 = -0.15f;
        } else {
            f11 = -0.1f;
        }
        float f16 = 0.125f;
        float f17 = 0.0f;
        if (z10) {
            f12 = 0.125f;
        } else {
            f12 = 0.0f;
        }
        int b10 = k6.b(f10, f11 - f12, i7);
        int i10 = stargiftattributebackdrop.edge_color | (-16777216);
        if (z11) {
            f14 = 0.07f;
        }
        if (z11) {
            f15 = -0.15f;
        }
        if (!z10) {
            f16 = 0.0f;
        }
        int[] iArr = {b10, k6.b(f14, f15 - f16, i10)};
        if (z11) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        if (!z11) {
            f17 = 1.0f;
        }
        paint.setShader(new LinearGradient(0.0f, 0.0f, L, L2, iArr, new float[]{f13, f17}, Shader.TileMode.CLAMP));
    }

    public final void f(int i7, CharSequence charSequence, boolean z9) {
        Typeface typeface = null;
        this.d = null;
        this.f60144e.e(true, 1.0f);
        float f10 = i7;
        if (z9) {
            typeface = org.telegram.messenger.g0.o();
        }
        this.f60143c = new my0(charSequence, f10, typeface);
        invalidateSelf();
    }

    public final void g(int i7, String str) {
        my0 my0Var = this.f60143c;
        if (my0Var == null) {
            f(i7, str, true);
        } else if (TextUtils.equals(my0Var.j(), str)) {
        } else {
            this.d = this.f60143c;
            this.f60143c = new my0(str, i7, org.telegram.messenger.g0.o());
            this.f60144e.e(true, 0.0f);
            invalidateSelf();
        }
    }
}
