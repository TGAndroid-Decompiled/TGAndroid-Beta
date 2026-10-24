package sg;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.p5;
public class c1 extends ImageView {
    public static final int L = 0;
    public ImageReceiver E;
    public p5 F;
    public float G;
    public boolean H;
    public boolean I;
    public org.telegram.ui.Components.voip.h J;
    public Integer K;
    public final int f46651a;
    public final float[] f46652b;
    public final w1 f46653c;
    public final g6 d;
    public boolean e;
    public final float f46654f;
    public boolean h;
    public int f46655n;
    public int f46656r;
    public int f46657s;
    public LinearGradient v;
    public final Path f46658w;
    public Paint f46659x;
    public Paint f46660y;

    public c1(Context context, int i10, g6 g6Var) {
        super(context);
        int i11;
        this.f46652b = new float[3];
        this.f46654f = 1.0f;
        this.h = false;
        this.f46655n = -1;
        this.v = null;
        this.f46658w = new Path();
        this.f46659x = new Paint(1);
        this.G = 1.0f;
        this.f46651a = i10;
        this.d = g6Var;
        if (i10 == 0) {
            i11 = R.drawable.msg_premium_lock2;
        } else {
            i11 = R.drawable.msg_mini_premiumlock;
        }
        setImageResource(i11);
        if (i10 == 0) {
            w1 w1Var = new w1(5);
            this.f46653c = w1Var;
            w1Var.g();
            w1Var.M = false;
            w1Var.f46924s = 4;
            w1Var.f46925t = 4;
            w1Var.f46923r = 2;
            w1Var.f46920o = 0.1f;
            w1Var.c();
        } else if (i10 == 2) {
            this.f46654f = 0.8f;
            this.f46659x.setColor(k6.x0(null, k6.f21126a7, false));
        } else if (i10 == 3) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(R.drawable.msg_archive_hide);
        } else if (i10 == 4) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(R.drawable.msg_limit_pin);
        }
    }

    public final void a() {
        if (this.e && getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            int i10 = this.f46655n;
            float[] fArr = this.f46652b;
            Color.colorToHSV(i10, fArr);
            fArr[1] = fArr[1] * 1.0f;
            if (fArr[2] > 0.7f) {
                fArr[2] = 0.7f;
            }
            int HSVToColor = Color.HSVToColor(fArr);
            int i11 = k6.f21184d6;
            g6 g6Var = this.d;
            int f7 = i0.a.f(0.5f, HSVToColor, k6.w0(i11, g6Var));
            int f10 = i0.a.f(0.4f, HSVToColor, k6.w0(i11, g6Var));
            if (this.v == null || this.f46656r != f10 || this.f46657s != f7) {
                if (this.I) {
                    Paint paint = this.f46659x;
                    this.f46660y = paint;
                    paint.setAlpha(255);
                    this.G = 0.0f;
                }
                this.f46659x = new Paint(1);
                this.f46656r = f10;
                this.f46657s = f7;
                LinearGradient linearGradient = new LinearGradient(0.0f, getMeasuredHeight(), 0.0f, 0.0f, new int[]{f10, f7}, (float[]) null, Shader.TileMode.CLAMP);
                this.v = linearGradient;
                this.f46659x.setShader(linearGradient);
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
        this.e = true;
        if (this.f46651a != 0) {
            a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        Paint paint = this.f46659x;
        if (paint != null && this.f46651a != 2) {
            paint.setShader(null);
            this.f46659x = null;
        }
        this.v = null;
        this.I = false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: sg.c1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f46651a == 0) {
            Path path = this.f46658w;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(rectF.width() / 2.0f, rectF.centerY(), rectF.width() / 2.0f, direction);
            rectF.set((getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(2.5f), AndroidUtilities.dpf2(5.7f) + (getMeasuredHeight() / 2.0f), getMeasuredWidth() - AndroidUtilities.dpf2(0.2f), getMeasuredHeight());
            path.addRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), direction);
            path.close();
            w1 w1Var = this.f46653c;
            w1Var.f46909a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            w1Var.f46909a.inset(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
            return;
        }
        a();
    }

    public void setAnimatedEmojiDrawable(p5 p5Var) {
        this.F = p5Var;
        if (p5Var != null) {
            this.H = true;
            invalidate();
        }
    }

    public void setBlendWithColor(Integer num) {
        this.K = num;
    }

    public void setColor(int i10) {
        this.h = true;
        Integer num = this.K;
        if (num != null) {
            i10 = k6.v(i10, num.intValue());
        }
        if (this.f46655n != i10) {
            this.f46655n = i10;
            int i11 = this.f46651a;
            if (i11 != 0 && i11 != 2) {
                a();
            } else {
                Paint paint = this.f46659x;
                if (paint != null) {
                    paint.setColor(i10);
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

    public void setLocked(boolean z10) {
        int i10;
        if (this.f46651a != 0) {
            if (z10) {
                i10 = R.drawable.msg_mini_premiumlock;
            } else {
                i10 = R.drawable.msg_mini_stickerstar;
            }
            setImageResource(i10);
        }
    }
}
