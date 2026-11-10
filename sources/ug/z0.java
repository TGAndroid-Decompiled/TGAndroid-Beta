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
import org.telegram.ui.Components.h5;
public class z0 extends ImageView {
    public static final int L = 0;
    public Paint D;
    public ImageReceiver E;
    public h5 F;
    public float G;
    public boolean H;
    public boolean I;
    public org.telegram.ui.Components.voip.n J;
    public Integer K;
    public final int f56890a;
    public final float[] f56891b;
    public final p1 f56892c;
    public final h6 d;
    public boolean f56893e;
    public final float f56894f;
    public boolean h;
    public int f56895n;
    public int f56896r;
    public int f56897s;
    public LinearGradient f56898w;
    public final Path f56899x;
    public Paint f56900y;

    public z0(int i7, Context context, h6 h6Var) {
        super(context);
        int i10;
        this.f56891b = new float[3];
        this.f56894f = 1.0f;
        this.h = false;
        this.f56895n = -1;
        this.f56898w = null;
        this.f56899x = new Path();
        this.f56900y = new Paint(1);
        this.G = 1.0f;
        this.f56890a = i7;
        this.d = h6Var;
        if (i7 == 0) {
            i10 = 2131232308;
        } else {
            i10 = 2131232245;
        }
        setImageResource(i10);
        if (i7 == 0) {
            p1 p1Var = new p1(5);
            this.f56892c = p1Var;
            p1Var.g();
            p1Var.M = false;
            p1Var.f56791s = 4;
            p1Var.f56792t = 4;
            p1Var.f56790r = 2;
            p1Var.f56787o = 0.1f;
            p1Var.c();
        } else if (i7 == 2) {
            this.f56894f = 0.8f;
            this.f56900y.setColor(m6.x0(null, m6.f27834a7, false));
        } else if (i7 == 3) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(2131232053);
        } else if (i7 == 4) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(2131232201);
        }
    }

    public final void a() {
        if (this.f56893e && getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            int i7 = this.f56895n;
            float[] fArr = this.f56891b;
            Color.colorToHSV(i7, fArr);
            fArr[1] = fArr[1] * 1.0f;
            if (fArr[2] > 0.7f) {
                fArr[2] = 0.7f;
            }
            int HSVToColor = Color.HSVToColor(fArr);
            int i10 = m6.f27890d6;
            h6 h6Var = this.d;
            int f10 = i0.a.f(0.5f, HSVToColor, m6.w0(i10, h6Var));
            int f11 = i0.a.f(0.4f, HSVToColor, m6.w0(i10, h6Var));
            if (this.f56898w == null || this.f56896r != f11 || this.f56897s != f10) {
                if (this.I) {
                    Paint paint = this.f56900y;
                    this.D = paint;
                    paint.setAlpha(255);
                    this.G = 0.0f;
                }
                this.f56900y = new Paint(1);
                this.f56896r = f11;
                this.f56897s = f10;
                LinearGradient linearGradient = new LinearGradient(0.0f, getMeasuredHeight(), 0.0f, 0.0f, new int[]{f11, f10}, (float[]) null, Shader.TileMode.CLAMP);
                this.f56898w = linearGradient;
                this.f56900y.setShader(linearGradient);
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
        this.f56893e = true;
        if (this.f56890a != 0) {
            a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f56893e = false;
        Paint paint = this.f56900y;
        if (paint != null && this.f56890a != 2) {
            paint.setShader(null);
            this.f56900y = null;
        }
        this.f56898w = null;
        this.I = false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: ug.z0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (this.f56890a == 0) {
            Path path = this.f56899x;
            path.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(rectF.width() / 2.0f, rectF.centerY(), rectF.width() / 2.0f, direction);
            rectF.set((getMeasuredWidth() / 2.0f) + org.telegram.messenger.g0.L(2.5f), org.telegram.messenger.g0.N(5.7f) + (getMeasuredHeight() / 2.0f), getMeasuredWidth() - org.telegram.messenger.g0.N(0.2f), getMeasuredHeight());
            path.addRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), direction);
            path.close();
            p1 p1Var = this.f56892c;
            p1Var.f56775a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            p1Var.f56775a.inset(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
            return;
        }
        a();
    }

    public void setAnimatedEmojiDrawable(h5 h5Var) {
        this.F = h5Var;
        if (h5Var != null) {
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
            i7 = m6.w(i7, num.intValue());
        }
        if (this.f56895n != i7) {
            this.f56895n = i7;
            int i10 = this.f56890a;
            if (i10 != 0 && i10 != 2) {
                a();
            } else {
                Paint paint = this.f56900y;
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
        if (this.f56890a != 0) {
            if (z9) {
                i7 = 2131232245;
            } else {
                i7 = 2131232249;
            }
            setImageResource(i7);
        }
    }
}
