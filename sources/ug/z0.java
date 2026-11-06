package ug;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.i5;
public class z0 extends ImageView {
    public static final int L = 0;
    public Paint D;
    public ImageReceiver E;
    public i5 F;
    public float G;
    public boolean H;
    public boolean I;
    public org.telegram.ui.Components.voip.n J;
    public Integer K;
    public final int f56789a;
    public final float[] f56790b;
    public final p1 f56791c;
    public final f6 d;
    public boolean f56792e;
    public final float f56793f;
    public boolean h;
    public int f56794n;
    public int f56795r;
    public int f56796s;
    public LinearGradient f56797w;
    public final Path f56798x;
    public Paint f56799y;

    public z0(int i7, Context context, f6 f6Var) {
        super(context);
        int i10;
        this.f56790b = new float[3];
        this.f56793f = 1.0f;
        this.h = false;
        this.f56794n = -1;
        this.f56797w = null;
        this.f56798x = new Path();
        this.f56799y = new Paint(1);
        this.G = 1.0f;
        this.f56789a = i7;
        this.d = f6Var;
        if (i7 == 0) {
            i10 = 2131232308;
        } else {
            i10 = 2131232245;
        }
        setImageResource(i10);
        if (i7 == 0) {
            p1 p1Var = new p1(5);
            this.f56791c = p1Var;
            p1Var.g();
            p1Var.M = false;
            p1Var.f56687s = 4;
            p1Var.f56688t = 4;
            p1Var.f56686r = 2;
            p1Var.f56683o = 0.1f;
            p1Var.c();
        } else if (i7 == 2) {
            this.f56793f = 0.8f;
            this.f56799y.setColor(k6.x0(null, k6.f27793a7, false));
        } else if (i7 == 3) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(2131232053);
        } else if (i7 == 4) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(2131232201);
        }
    }

    public final void a() {
        if (this.f56792e && getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            int i7 = this.f56794n;
            float[] fArr = this.f56790b;
            Color.colorToHSV(i7, fArr);
            fArr[1] = fArr[1] * 1.0f;
            if (fArr[2] > 0.7f) {
                fArr[2] = 0.7f;
            }
            int HSVToColor = Color.HSVToColor(fArr);
            int i10 = k6.f27849d6;
            f6 f6Var = this.d;
            int f10 = i0.a.f(0.5f, HSVToColor, k6.w0(i10, f6Var));
            int f11 = i0.a.f(0.4f, HSVToColor, k6.w0(i10, f6Var));
            if (this.f56797w == null || this.f56795r != f11 || this.f56796s != f10) {
                if (this.I) {
                    Paint paint = this.f56799y;
                    this.D = paint;
                    paint.setAlpha(255);
                    this.G = 0.0f;
                }
                this.f56799y = new Paint(1);
                this.f56795r = f11;
                this.f56796s = f10;
                LinearGradient linearGradient = new LinearGradient(0.0f, getMeasuredHeight(), 0.0f, 0.0f, new int[]{f11, f10}, (float[]) null, Shader.TileMode.CLAMP);
                this.f56797w = linearGradient;
                this.f56799y.setShader(linearGradient);
                invalidate();
            }
        }
    }

    public ImageReceiver getImageReceiver() {
        return this.E;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f56792e = true;
        if (this.f56789a != 0) {
            a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f56792e = false;
        Paint paint = this.f56799y;
        if (paint != null && this.f56789a != 2) {
            paint.setShader(null);
            this.f56799y = null;
        }
        this.f56797w = null;
        this.I = false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: ug.z0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (this.f56789a == 0) {
            Path path = this.f56798x;
            path.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(rectF.width() / 2.0f, rectF.centerY(), rectF.width() / 2.0f, direction);
            rectF.set((getMeasuredWidth() / 2.0f) + org.telegram.messenger.g0.L(2.5f), org.telegram.messenger.g0.N(5.7f) + (getMeasuredHeight() / 2.0f), getMeasuredWidth() - org.telegram.messenger.g0.N(0.2f), getMeasuredHeight());
            path.addRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), direction);
            path.close();
            p1 p1Var = this.f56791c;
            p1Var.f56671a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            p1Var.f56671a.inset(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
            return;
        }
        a();
    }

    public void setAnimatedEmojiDrawable(i5 i5Var) {
        this.F = i5Var;
        if (i5Var != null) {
            this.H = true;
            invalidate();
        }
    }

    public void setBlendWithColor(Integer num) {
        this.K = num;
    }

    public void setColor(int i7) {
        this.h = true;
        Integer num = this.K;
        if (num != null) {
            i7 = k6.w(i7, num.intValue());
        }
        if (this.f56794n != i7) {
            this.f56794n = i7;
            int i10 = this.f56789a;
            if (i10 != 0 && i10 != 2) {
                a();
            } else {
                Paint paint = this.f56799y;
                if (paint != null) {
                    paint.setColor(i7);
                }
            }
            invalidate();
        }
    }

    public void setImageReceiver(ImageReceiver imageReceiver) {
        this.E = imageReceiver;
        if (imageReceiver != null) {
            this.H = true;
            invalidate();
        }
    }

    public void setLocked(boolean z9) {
        int i7;
        if (this.f56789a != 0) {
            if (z9) {
                i7 = 2131232245;
            } else {
                i7 = 2131232249;
            }
            setImageResource(i7);
        }
    }
}
