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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g5;
public class a1 extends ImageView {
    public static final int M = 0;
    public Paint E;
    public ImageReceiver F;
    public g5 G;
    public float H;
    public boolean I;
    public boolean J;
    public org.telegram.ui.Components.voip.n K;
    public Integer L;
    public final int f58034a;
    public final float[] f58035b;
    public final r1 f58036c;
    public final e6 d;
    public boolean f58037e;
    public final float f58038f;
    public boolean h;
    public int f58039n;
    public int f58040r;
    public int f58041s;
    public LinearGradient f58042w;
    public final Path f58043x;
    public Paint f58044y;

    public a1(int i7, Context context, e6 e6Var) {
        super(context);
        int i10;
        this.f58035b = new float[3];
        this.f58038f = 1.0f;
        this.h = false;
        this.f58039n = -1;
        this.f58042w = null;
        this.f58043x = new Path();
        this.f58044y = new Paint(1);
        this.H = 1.0f;
        this.f58034a = i7;
        this.d = e6Var;
        if (i7 == 0) {
            i10 = 2131232309;
        } else {
            i10 = 2131232246;
        }
        setImageResource(i10);
        if (i7 == 0) {
            r1 r1Var = new r1(5);
            this.f58036c = r1Var;
            r1Var.g();
            r1Var.M = false;
            r1Var.f58321s = 4;
            r1Var.f58322t = 4;
            r1Var.f58320r = 2;
            r1Var.f58317o = 0.1f;
            r1Var.c();
        } else if (i7 == 2) {
            this.f58038f = 0.8f;
            this.f58044y.setColor(j6.x0(null, j6.f28792a7, false));
        } else if (i7 == 3) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(2131232054);
        } else if (i7 == 4) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(2131232202);
        }
    }

    public final void a() {
        if (this.f58037e && getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            int i7 = this.f58039n;
            float[] fArr = this.f58035b;
            Color.colorToHSV(i7, fArr);
            fArr[1] = fArr[1] * 1.0f;
            if (fArr[2] > 0.7f) {
                fArr[2] = 0.7f;
            }
            int HSVToColor = Color.HSVToColor(fArr);
            int i10 = j6.f28849d6;
            e6 e6Var = this.d;
            int f10 = i0.a.f(0.5f, HSVToColor, j6.w0(i10, e6Var));
            int f11 = i0.a.f(0.4f, HSVToColor, j6.w0(i10, e6Var));
            if (this.f58042w == null || this.f58040r != f11 || this.f58041s != f10) {
                if (this.J) {
                    Paint paint = this.f58044y;
                    this.E = paint;
                    paint.setAlpha(255);
                    this.H = 0.0f;
                }
                this.f58044y = new Paint(1);
                this.f58040r = f11;
                this.f58041s = f10;
                LinearGradient linearGradient = new LinearGradient(0.0f, getMeasuredHeight(), 0.0f, 0.0f, new int[]{f11, f10}, (float[]) null, Shader.TileMode.CLAMP);
                this.f58042w = linearGradient;
                this.f58044y.setShader(linearGradient);
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
        this.f58037e = true;
        if (this.f58034a != 0) {
            a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f58037e = false;
        Paint paint = this.f58044y;
        if (paint != null && this.f58034a != 2) {
            paint.setShader(null);
            this.f58044y = null;
        }
        this.f58042w = null;
        this.J = false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: ug.a1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (this.f58034a == 0) {
            Path path = this.f58043x;
            path.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(rectF.width() / 2.0f, rectF.centerY(), rectF.width() / 2.0f, direction);
            rectF.set((getMeasuredWidth() / 2.0f) + org.telegram.messenger.g0.L(2.5f), org.telegram.messenger.g0.N(5.7f) + (getMeasuredHeight() / 2.0f), getMeasuredWidth() - org.telegram.messenger.g0.N(0.2f), getMeasuredHeight());
            path.addRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), direction);
            path.close();
            r1 r1Var = this.f58036c;
            r1Var.f58305a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            r1Var.f58305a.inset(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
            return;
        }
        a();
    }

    public void setAnimatedEmojiDrawable(g5 g5Var) {
        this.G = g5Var;
        if (g5Var != null) {
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
            i7 = j6.w(i7, num.intValue());
        }
        if (this.f58039n != i7) {
            this.f58039n = i7;
            int i10 = this.f58034a;
            if (i10 != 0 && i10 != 2) {
                a();
            } else {
                Paint paint = this.f58044y;
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
        if (this.f58034a != 0) {
            if (z10) {
                i7 = 2131232246;
            } else {
                i7 = 2131232250;
            }
            setImageResource(i7);
        }
    }
}
