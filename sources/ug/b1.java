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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.p5;
public class b1 extends ImageView {
    public static final int M = 0;
    public Paint E;
    public ImageReceiver F;
    public p5 G;
    public float H;
    public boolean I;
    public boolean J;
    public org.telegram.ui.Components.voip.n K;
    public Integer L;
    public final int f58656a;
    public final float[] f58657b;
    public final s1 f58658c;
    public final h6 d;
    public boolean f58659e;
    public final float f58660f;
    public boolean h;
    public int f58661n;
    public int f58662r;
    public int f58663s;
    public LinearGradient f58664w;
    public final Path f58665x;
    public Paint f58666y;

    public b1(int i7, Context context, h6 h6Var) {
        super(context);
        int i10;
        this.f58657b = new float[3];
        this.f58660f = 1.0f;
        this.h = false;
        this.f58661n = -1;
        this.f58664w = null;
        this.f58665x = new Path();
        this.f58666y = new Paint(1);
        this.H = 1.0f;
        this.f58656a = i7;
        this.d = h6Var;
        if (i7 == 0) {
            i10 = 2131232310;
        } else {
            i10 = 2131232247;
        }
        setImageResource(i10);
        if (i7 == 0) {
            s1 s1Var = new s1(5);
            this.f58658c = s1Var;
            s1Var.g();
            s1Var.M = false;
            s1Var.f58943s = 4;
            s1Var.f58944t = 4;
            s1Var.f58942r = 2;
            s1Var.f58939o = 0.1f;
            s1Var.c();
        } else if (i7 == 2) {
            this.f58660f = 0.8f;
            this.f58666y.setColor(m6.x0(null, m6.f29321a7, false));
        } else if (i7 == 3) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(2131232055);
        } else if (i7 == 4) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(2131232203);
        }
    }

    public final void a() {
        if (this.f58659e && getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            int i7 = this.f58661n;
            float[] fArr = this.f58657b;
            Color.colorToHSV(i7, fArr);
            fArr[1] = fArr[1] * 1.0f;
            if (fArr[2] > 0.7f) {
                fArr[2] = 0.7f;
            }
            int HSVToColor = Color.HSVToColor(fArr);
            int i10 = m6.f29378d6;
            h6 h6Var = this.d;
            int f10 = i0.a.f(0.5f, HSVToColor, m6.w0(i10, h6Var));
            int f11 = i0.a.f(0.4f, HSVToColor, m6.w0(i10, h6Var));
            if (this.f58664w == null || this.f58662r != f11 || this.f58663s != f10) {
                if (this.J) {
                    Paint paint = this.f58666y;
                    this.E = paint;
                    paint.setAlpha(255);
                    this.H = 0.0f;
                }
                this.f58666y = new Paint(1);
                this.f58662r = f11;
                this.f58663s = f10;
                LinearGradient linearGradient = new LinearGradient(0.0f, getMeasuredHeight(), 0.0f, 0.0f, new int[]{f11, f10}, (float[]) null, Shader.TileMode.CLAMP);
                this.f58664w = linearGradient;
                this.f58666y.setShader(linearGradient);
                invalidate();
            }
        }
    }

    public ImageReceiver getImageReceiver() {
        return this.F;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f58659e = true;
        if (this.f58656a != 0) {
            a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f58659e = false;
        Paint paint = this.f58666y;
        if (paint != null && this.f58656a != 2) {
            paint.setShader(null);
            this.f58666y = null;
        }
        this.f58664w = null;
        this.J = false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: ug.b1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (this.f58656a == 0) {
            Path path = this.f58665x;
            path.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(rectF.width() / 2.0f, rectF.centerY(), rectF.width() / 2.0f, direction);
            rectF.set((getMeasuredWidth() / 2.0f) + org.telegram.messenger.g0.L(2.5f), org.telegram.messenger.g0.N(5.7f) + (getMeasuredHeight() / 2.0f), getMeasuredWidth() - org.telegram.messenger.g0.N(0.2f), getMeasuredHeight());
            path.addRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), direction);
            path.close();
            s1 s1Var = this.f58658c;
            s1Var.f58927a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            s1Var.f58927a.inset(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
            return;
        }
        a();
    }

    public void setAnimatedEmojiDrawable(p5 p5Var) {
        this.G = p5Var;
        if (p5Var != null) {
            this.I = true;
            invalidate();
        }
    }

    public void setBlendWithColor(Integer num) {
        this.L = num;
    }

    public void setColor(int i7) {
        this.h = true;
        Integer num = this.L;
        if (num != null) {
            i7 = m6.w(i7, num.intValue());
        }
        if (this.f58661n != i7) {
            this.f58661n = i7;
            int i10 = this.f58656a;
            if (i10 != 0 && i10 != 2) {
                a();
            } else {
                Paint paint = this.f58666y;
                if (paint != null) {
                    paint.setColor(i7);
                }
            }
            invalidate();
        }
    }

    public void setImageReceiver(ImageReceiver imageReceiver) {
        this.F = imageReceiver;
        if (imageReceiver != null) {
            this.I = true;
            invalidate();
        }
    }

    public void setLocked(boolean z10) {
        int i7;
        if (this.f58656a != 0) {
            if (z10) {
                i7 = 2131232247;
            } else {
                i7 = 2131232251;
            }
            setImageResource(i7);
        }
    }
}
