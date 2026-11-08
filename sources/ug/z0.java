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
    public final int f56881a;
    public final float[] f56882b;
    public final p1 f56883c;
    public final f6 d;
    public boolean f56884e;
    public final float f56885f;
    public boolean h;
    public int f56886n;
    public int f56887r;
    public int f56888s;
    public LinearGradient f56889w;
    public final Path f56890x;
    public Paint f56891y;

    public z0(int i7, Context context, f6 f6Var) {
        super(context);
        int i10;
        this.f56882b = new float[3];
        this.f56885f = 1.0f;
        this.h = false;
        this.f56886n = -1;
        this.f56889w = null;
        this.f56890x = new Path();
        this.f56891y = new Paint(1);
        this.G = 1.0f;
        this.f56881a = i7;
        this.d = f6Var;
        if (i7 == 0) {
            i10 = 2131232308;
        } else {
            i10 = 2131232245;
        }
        setImageResource(i10);
        if (i7 == 0) {
            p1 p1Var = new p1(5);
            this.f56883c = p1Var;
            p1Var.g();
            p1Var.M = false;
            p1Var.f56779s = 4;
            p1Var.f56780t = 4;
            p1Var.f56778r = 2;
            p1Var.f56775o = 0.1f;
            p1Var.c();
        } else if (i7 == 2) {
            this.f56885f = 0.8f;
            this.f56891y.setColor(k6.x0(null, k6.f27796a7, false));
        } else if (i7 == 3) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(2131232053);
        } else if (i7 == 4) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(2131232201);
        }
    }

    public final void a() {
        if (this.f56884e && getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            int i7 = this.f56886n;
            float[] fArr = this.f56882b;
            Color.colorToHSV(i7, fArr);
            fArr[1] = fArr[1] * 1.0f;
            if (fArr[2] > 0.7f) {
                fArr[2] = 0.7f;
            }
            int HSVToColor = Color.HSVToColor(fArr);
            int i10 = k6.f27852d6;
            f6 f6Var = this.d;
            int f10 = i0.a.f(0.5f, HSVToColor, k6.w0(i10, f6Var));
            int f11 = i0.a.f(0.4f, HSVToColor, k6.w0(i10, f6Var));
            if (this.f56889w == null || this.f56887r != f11 || this.f56888s != f10) {
                if (this.I) {
                    Paint paint = this.f56891y;
                    this.D = paint;
                    paint.setAlpha(255);
                    this.G = 0.0f;
                }
                this.f56891y = new Paint(1);
                this.f56887r = f11;
                this.f56888s = f10;
                LinearGradient linearGradient = new LinearGradient(0.0f, getMeasuredHeight(), 0.0f, 0.0f, new int[]{f11, f10}, (float[]) null, Shader.TileMode.CLAMP);
                this.f56889w = linearGradient;
                this.f56891y.setShader(linearGradient);
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
        this.f56884e = true;
        if (this.f56881a != 0) {
            a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f56884e = false;
        Paint paint = this.f56891y;
        if (paint != null && this.f56881a != 2) {
            paint.setShader(null);
            this.f56891y = null;
        }
        this.f56889w = null;
        this.I = false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: ug.z0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (this.f56881a == 0) {
            Path path = this.f56890x;
            path.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(rectF.width() / 2.0f, rectF.centerY(), rectF.width() / 2.0f, direction);
            rectF.set((getMeasuredWidth() / 2.0f) + org.telegram.messenger.g0.L(2.5f), org.telegram.messenger.g0.N(5.7f) + (getMeasuredHeight() / 2.0f), getMeasuredWidth() - org.telegram.messenger.g0.N(0.2f), getMeasuredHeight());
            path.addRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), direction);
            path.close();
            p1 p1Var = this.f56883c;
            p1Var.f56763a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            p1Var.f56763a.inset(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
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
        if (this.f56886n != i7) {
            this.f56886n = i7;
            int i10 = this.f56881a;
            if (i10 != 0 && i10 != 2) {
                a();
            } else {
                Paint paint = this.f56891y;
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
        if (this.f56881a != 0) {
            if (z9) {
                i7 = 2131232245;
            } else {
                i7 = 2131232249;
            }
            setImageResource(i7);
        }
    }
}
