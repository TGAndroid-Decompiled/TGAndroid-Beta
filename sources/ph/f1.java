package ph;

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
import org.telegram.messenger.r20;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.t5;
import rh.s8;
public class f1 extends gq {
    public qz0 f45034c;
    public qz0 d;
    public final t5 e;
    public final Path f45035f;
    public final Path h;
    public final Paint f45036n;
    public final Paint f45037r;
    public final float f45038s;
    public s8 f45039w;
    public boolean f45040x;
    public int f45041y;

    public f1(View view) {
        super(view);
        this.e = new t5(new w5(this, 28), 320L, gr.h, 0);
        Path path = new Path();
        this.f45035f = path;
        this.h = new Path();
        Paint paint = new Paint(1);
        this.f45036n = paint;
        Paint paint2 = new Paint(1);
        this.f45037r = paint2;
        this.f45041y = -1;
        this.f45038s = 1.0f;
        d(path, 1.0f, false);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        ((Paint) this.f26491b).setColor(-698031);
        ((Paint) this.f26491b).setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.L(2.33f)));
        paint2.setColor(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeCap(Paint.Cap.ROUND);
    }

    public static void d(Path path, float f7, final boolean z10) {
        r20 r20Var = new r20() {
            @Override
            public final Object a(Object obj) {
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
        path.moveTo(org.telegram.ui.Cells.f1.g((Float) r20Var.a(Float.valueOf(46.83f)), f7), org.telegram.messenger.i0.L(f10));
        path.lineTo(org.telegram.ui.Cells.f1.g((Float) r20Var.a(Float.valueOf(23.5f)), f7), org.telegram.messenger.i0.L(1.17f * f7));
        path.cubicTo(org.telegram.ui.Cells.f1.g((Float) r20Var.a(Float.valueOf(22.75f)), f7), org.telegram.messenger.i0.L(0.42f * f7), org.telegram.ui.Cells.f1.g((Float) r20Var.a(Float.valueOf(21.73f)), f7), 0.0f, org.telegram.ui.Cells.f1.g((Float) r20Var.a(Float.valueOf(20.68f)), f7), 0.0f);
        float f11 = f7 * 0.05f;
        path.cubicTo(org.telegram.ui.Cells.f1.g((Float) r20Var.a(Float.valueOf(19.62f)), f7), 0.0f, org.telegram.ui.Cells.f1.g((Float) r20Var.a(Float.valueOf(2.73f)), f7), org.telegram.messenger.i0.L(f11), org.telegram.ui.Cells.f1.g((Float) r20Var.a(Float.valueOf(1.55f)), f7), org.telegram.messenger.i0.L(f11));
        path.cubicTo(org.telegram.ui.Cells.f1.g((Float) r20Var.a(Float.valueOf(0.36f)), f7), org.telegram.messenger.i0.L(f11), org.telegram.ui.Cells.f1.g((Float) r20Var.a(Float.valueOf(-0.23f)), f7), org.telegram.messenger.i0.L(1.4885f * f7), org.telegram.ui.Cells.f1.g((Float) r20Var.a(Float.valueOf(0.6f)), f7), org.telegram.messenger.i0.L(2.32f * f7));
        path.lineTo(org.telegram.ui.Cells.f1.g((Float) r20Var.a(Float.valueOf(45.72f)), f7), org.telegram.messenger.i0.L(47.44f * f7));
        Float valueOf = Float.valueOf(48.0f);
        path.cubicTo(org.telegram.ui.Cells.f1.g((Float) r20Var.a(Float.valueOf(46.56f)), f7), org.telegram.messenger.i0.L(48.28f * f7), org.telegram.ui.Cells.f1.g((Float) r20Var.a(valueOf), f7), org.telegram.messenger.i0.L(47.68f * f7), org.telegram.ui.Cells.f1.g((Float) r20Var.a(valueOf), f7), org.telegram.messenger.i0.L(46.5f * f7));
        path.cubicTo(org.telegram.ui.Cells.f1.g((Float) r20Var.a(valueOf), f7), org.telegram.messenger.i0.L(45.31f * f7), org.telegram.ui.Cells.f1.g((Float) r20Var.a(valueOf), f7), org.telegram.messenger.i0.L(28.38f * f7), org.telegram.ui.Cells.f1.g((Float) r20Var.a(valueOf), f7), org.telegram.messenger.i0.L(27.32f * f7));
        path.cubicTo(org.telegram.ui.Cells.f1.g((Float) r20Var.a(valueOf), f7), org.telegram.messenger.i0.L(26.26f * f7), org.telegram.ui.Cells.f1.g((Float) r20Var.a(Float.valueOf(47.5f)), f7), org.telegram.messenger.i0.L(25.24f * f7), org.telegram.ui.Cells.f1.g((Float) r20Var.a(Float.valueOf(46.82f)), f7), org.telegram.messenger.i0.L(f10));
        path.close();
    }

    public final void c(Canvas canvas, qz0 qz0Var, float f7) {
        float f10;
        float f11;
        canvas.save();
        canvas.translate(f7, f7);
        float width = getBounds().width() / 2.0f;
        float f12 = 6.0f;
        if (this.f45040x) {
            f10 = -7.0f;
        } else {
            f10 = 6.0f;
        }
        float L = width + org.telegram.messenger.i0.L(f10);
        float height = getBounds().height() / 2.0f;
        if (this.f45040x) {
            f12 = 5.0f;
        }
        float L2 = height - org.telegram.messenger.i0.L(f12);
        if (this.f45040x) {
            f11 = -45.0f;
        } else {
            f11 = 45.0f;
        }
        canvas.rotate(f11, L, L2);
        float min = Math.min(1.0f, org.telegram.messenger.i0.L(40.0f) / qz0Var.f29774c);
        canvas.scale(min, min, L, L2);
        qz0Var.c(L - (qz0Var.k() / 2.0f), L2 + org.telegram.messenger.i0.L(1.0f), 1.0f, this.f45041y, canvas);
        canvas.restore();
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        canvas.translate(getBounds().right - org.telegram.messenger.i0.L(48.0f), getBounds().top);
        Paint paint = this.f45037r;
        int alpha = paint.getAlpha();
        Path path = this.f45035f;
        if (alpha > 0) {
            paint.setStrokeWidth(org.telegram.messenger.i0.L(1.33f) * 2);
            canvas.drawPath(path, paint);
        }
        canvas.drawPath(path, (Paint) this.f26491b);
        s8 s8Var = this.f45039w;
        float f7 = this.f45038s;
        if (s8Var != null) {
            float f10 = f7 * 48.0f;
            canvas2 = canvas;
            canvas2.saveLayer(0.0f, 0.0f, org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(f10), null);
            this.f45039w.f(0, 0, org.telegram.messenger.i0.L(48.0f), org.telegram.messenger.i0.L(48.0f));
            this.f45039w.d();
            this.f45039w.a(canvas2, -1);
            Path path2 = this.h;
            path2.set(path);
            path2.toggleInverseFillType();
            canvas2.drawPath(path2, this.f45036n);
            canvas2.restore();
            invalidateSelf();
        } else {
            canvas2 = canvas;
        }
        if (this.f45034c != null) {
            t5 t5Var = this.e;
            float e = t5Var.e(false, 1.0f);
            if (!t5Var.f30448i) {
                this.d = null;
            }
            canvas2.save();
            if (this.d != null && t5Var.f30448i) {
                canvas2.clipPath(path);
                float L = org.telegram.messenger.i0.L(f7 * 64.0f);
                c(canvas2, this.d, L * e);
                c(canvas2, this.f45034c, (1.0f - e) * (-L));
            } else {
                c(canvas2, this.f45034c, 0.0f);
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
        Paint paint = (Paint) this.f26491b;
        if (stargiftattributebackdrop == null) {
            paint.setShader(null);
            return;
        }
        if (this.f45040x) {
            z12 = !z10;
        } else {
            z12 = z10;
        }
        float L = org.telegram.messenger.i0.L(48.0f);
        float L2 = org.telegram.messenger.i0.L(48.0f);
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
        int b10 = t6.b(f7, f10 - f11, i10);
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
        int[] iArr = {b10, t6.b(f13, f14 - f15, i11)};
        if (z12) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        if (!z12) {
            f16 = 1.0f;
        }
        paint.setShader(new LinearGradient(0.0f, 0.0f, L, L2, iArr, new float[]{f12, f16}, Shader.TileMode.CLAMP));
    }

    public final void f(int i10, CharSequence charSequence, boolean z10) {
        Typeface typeface = null;
        this.d = null;
        this.e.e(true, 1.0f);
        float f7 = i10;
        if (z10) {
            typeface = org.telegram.messenger.i0.o();
        }
        this.f45034c = new qz0(charSequence, f7, typeface);
        invalidateSelf();
    }

    public final void g(int i10, String str) {
        qz0 qz0Var = this.f45034c;
        if (qz0Var == null) {
            f(i10, str, true);
        } else if (TextUtils.equals(qz0Var.j(), str)) {
        } else {
            this.d = this.f45034c;
            this.f45034c = new qz0(str, i10, org.telegram.messenger.i0.o());
            this.e.e(true, 0.0f);
            invalidateSelf();
        }
    }
}
