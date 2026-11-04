package vg;

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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g5;
public class y0 extends ImageView {
    public static final int M = 0;
    public Paint E;
    public ImageReceiver F;
    public g5 G;
    public float H;
    public boolean I;
    public boolean J;
    public org.telegram.ui.Components.voip.g K;
    public Integer L;
    public final int f56922a;
    public final float[] f56923b;
    public final s1 f56924c;
    public final e6 d;
    public boolean f56925e;
    public final float f56926f;
    public boolean h;
    public int f56927n;
    public int f56928r;
    public int f56929s;
    public LinearGradient f56930w;
    public final Path f56931x;
    public Paint f56932y;

    public y0(int i3, Context context, e6 e6Var) {
        super(context);
        int i10;
        this.f56923b = new float[3];
        this.f56926f = 1.0f;
        this.h = false;
        this.f56927n = -1;
        this.f56930w = null;
        this.f56931x = new Path();
        this.f56932y = new Paint(1);
        this.H = 1.0f;
        this.f56922a = i3;
        this.d = e6Var;
        if (i3 == 0) {
            i10 = 2131232308;
        } else {
            i10 = 2131232245;
        }
        setImageResource(i10);
        if (i3 == 0) {
            s1 s1Var = new s1(5);
            this.f56924c = s1Var;
            s1Var.g();
            s1Var.M = false;
            s1Var.f56845s = 4;
            s1Var.f56846t = 4;
            s1Var.f56844r = 2;
            s1Var.f56841o = 0.1f;
            s1Var.c();
        } else if (i3 == 2) {
            this.f56926f = 0.8f;
            this.f56932y.setColor(k6.x0(null, k6.f27824a7, false));
        } else if (i3 == 3) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(2131232053);
        } else if (i3 == 4) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(2131232201);
        }
    }

    public final void a() {
        if (this.f56925e && getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            int i3 = this.f56927n;
            float[] fArr = this.f56923b;
            Color.colorToHSV(i3, fArr);
            fArr[1] = fArr[1] * 1.0f;
            if (fArr[2] > 0.7f) {
                fArr[2] = 0.7f;
            }
            int HSVToColor = Color.HSVToColor(fArr);
            int i10 = k6.f27878d6;
            e6 e6Var = this.d;
            int f10 = i0.a.f(0.5f, HSVToColor, k6.w0(i10, e6Var));
            int f11 = i0.a.f(0.4f, HSVToColor, k6.w0(i10, e6Var));
            if (this.f56930w == null || this.f56928r != f11 || this.f56929s != f10) {
                if (this.J) {
                    Paint paint = this.f56932y;
                    this.E = paint;
                    paint.setAlpha(255);
                    this.H = 0.0f;
                }
                this.f56932y = new Paint(1);
                this.f56928r = f11;
                this.f56929s = f10;
                LinearGradient linearGradient = new LinearGradient(0.0f, getMeasuredHeight(), 0.0f, 0.0f, new int[]{f11, f10}, (float[]) null, Shader.TileMode.CLAMP);
                this.f56930w = linearGradient;
                this.f56932y.setShader(linearGradient);
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
        this.f56925e = true;
        if (this.f56922a != 0) {
            a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f56925e = false;
        Paint paint = this.f56932y;
        if (paint != null && this.f56922a != 2) {
            paint.setShader(null);
            this.f56932y = null;
        }
        this.f56930w = null;
        this.J = false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: vg.y0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        if (this.f56922a == 0) {
            Path path = this.f56931x;
            path.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(rectF.width() / 2.0f, rectF.centerY(), rectF.width() / 2.0f, direction);
            rectF.set((getMeasuredWidth() / 2.0f) + org.telegram.messenger.g0.L(2.5f), org.telegram.messenger.g0.N(5.7f) + (getMeasuredHeight() / 2.0f), getMeasuredWidth() - org.telegram.messenger.g0.N(0.2f), getMeasuredHeight());
            path.addRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), direction);
            path.close();
            s1 s1Var = this.f56924c;
            s1Var.f56829a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            s1Var.f56829a.inset(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
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

    public void setColor(int i3) {
        this.h = true;
        Integer num = this.L;
        if (num != null) {
            i3 = k6.w(i3, num.intValue());
        }
        if (this.f56927n != i3) {
            this.f56927n = i3;
            int i10 = this.f56922a;
            if (i10 != 0 && i10 != 2) {
                a();
            } else {
                Paint paint = this.f56932y;
                if (paint != null) {
                    paint.setColor(i3);
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
        int i3;
        if (this.f56922a != 0) {
            if (z10) {
                i3 = 2131232245;
            } else {
                i3 = 2131232249;
            }
            setImageResource(i3);
        }
    }
}
