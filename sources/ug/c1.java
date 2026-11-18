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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.o5;
public class c1 extends ImageView {
    public static final int M = 0;
    public Paint E;
    public ImageReceiver F;
    public o5 G;
    public float H;
    public boolean I;
    public boolean J;
    public org.telegram.ui.Components.voip.n K;
    public Integer L;
    public final int f58625a;
    public final float[] f58626b;
    public final t1 f58627c;
    public final i6 d;
    public boolean f58628e;
    public final float f58629f;
    public boolean h;
    public int f58630n;
    public int f58631r;
    public int f58632s;
    public LinearGradient f58633w;
    public final Path f58634x;
    public Paint f58635y;

    public c1(int i7, Context context, i6 i6Var) {
        super(context);
        int i10;
        this.f58626b = new float[3];
        this.f58629f = 1.0f;
        this.h = false;
        this.f58630n = -1;
        this.f58633w = null;
        this.f58634x = new Path();
        this.f58635y = new Paint(1);
        this.H = 1.0f;
        this.f58625a = i7;
        this.d = i6Var;
        if (i7 == 0) {
            i10 = 2131232310;
        } else {
            i10 = 2131232247;
        }
        setImageResource(i10);
        if (i7 == 0) {
            t1 t1Var = new t1(5);
            this.f58627c = t1Var;
            t1Var.g();
            t1Var.M = false;
            t1Var.f58908s = 4;
            t1Var.f58909t = 4;
            t1Var.f58907r = 2;
            t1Var.f58904o = 0.1f;
            t1Var.c();
        } else if (i7 == 2) {
            this.f58629f = 0.8f;
            this.f58635y.setColor(n6.x0(null, n6.f29339a7, false));
        } else if (i7 == 3) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(2131232055);
        } else if (i7 == 4) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(2131232203);
        }
    }

    public final void a() {
        if (this.f58628e && getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            int i7 = this.f58630n;
            float[] fArr = this.f58626b;
            Color.colorToHSV(i7, fArr);
            fArr[1] = fArr[1] * 1.0f;
            if (fArr[2] > 0.7f) {
                fArr[2] = 0.7f;
            }
            int HSVToColor = Color.HSVToColor(fArr);
            int i10 = n6.f29396d6;
            i6 i6Var = this.d;
            int f10 = i0.a.f(0.5f, HSVToColor, n6.w0(i10, i6Var));
            int f11 = i0.a.f(0.4f, HSVToColor, n6.w0(i10, i6Var));
            if (this.f58633w == null || this.f58631r != f11 || this.f58632s != f10) {
                if (this.J) {
                    Paint paint = this.f58635y;
                    this.E = paint;
                    paint.setAlpha(255);
                    this.H = 0.0f;
                }
                this.f58635y = new Paint(1);
                this.f58631r = f11;
                this.f58632s = f10;
                LinearGradient linearGradient = new LinearGradient(0.0f, getMeasuredHeight(), 0.0f, 0.0f, new int[]{f11, f10}, (float[]) null, Shader.TileMode.CLAMP);
                this.f58633w = linearGradient;
                this.f58635y.setShader(linearGradient);
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
        this.f58628e = true;
        if (this.f58625a != 0) {
            a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f58628e = false;
        Paint paint = this.f58635y;
        if (paint != null && this.f58625a != 2) {
            paint.setShader(null);
            this.f58635y = null;
        }
        this.f58633w = null;
        this.J = false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: ug.c1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (this.f58625a == 0) {
            Path path = this.f58634x;
            path.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(rectF.width() / 2.0f, rectF.centerY(), rectF.width() / 2.0f, direction);
            rectF.set((getMeasuredWidth() / 2.0f) + org.telegram.messenger.g0.L(2.5f), org.telegram.messenger.g0.N(5.7f) + (getMeasuredHeight() / 2.0f), getMeasuredWidth() - org.telegram.messenger.g0.N(0.2f), getMeasuredHeight());
            path.addRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), direction);
            path.close();
            t1 t1Var = this.f58627c;
            t1Var.f58892a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            t1Var.f58892a.inset(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
            return;
        }
        a();
    }

    public void setAnimatedEmojiDrawable(o5 o5Var) {
        this.G = o5Var;
        if (o5Var != null) {
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
            i7 = n6.w(i7, num.intValue());
        }
        if (this.f58630n != i7) {
            this.f58630n = i7;
            int i10 = this.f58625a;
            if (i10 != 0 && i10 != 2) {
                a();
            } else {
                Paint paint = this.f58635y;
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
        if (this.f58625a != 0) {
            if (z10) {
                i7 = 2131232247;
            } else {
                i7 = 2131232251;
            }
            setImageResource(i7);
        }
    }
}
