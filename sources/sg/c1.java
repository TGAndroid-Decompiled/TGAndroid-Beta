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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.r5;
public class c1 extends ImageView {
    public static final int L = 0;
    public ImageReceiver E;
    public r5 F;
    public float G;
    public boolean H;
    public boolean I;
    public org.telegram.ui.Components.voip.h J;
    public Integer K;
    public final int f46220a;
    public final float[] f46221b;
    public final w1 f46222c;
    public final d6 d;
    public boolean e;
    public final float f46223f;
    public boolean h;
    public int f46224n;
    public int f46225r;
    public int f46226s;
    public LinearGradient v;
    public final Path f46227w;
    public Paint f46228x;
    public Paint f46229y;

    public c1(Context context, int i10, d6 d6Var) {
        super(context);
        int i11;
        this.f46221b = new float[3];
        this.f46223f = 1.0f;
        this.h = false;
        this.f46224n = -1;
        this.v = null;
        this.f46227w = new Path();
        this.f46228x = new Paint(1);
        this.G = 1.0f;
        this.f46220a = i10;
        this.d = d6Var;
        if (i10 == 0) {
            i11 = R.drawable.msg_premium_lock2;
        } else {
            i11 = R.drawable.msg_mini_premiumlock;
        }
        setImageResource(i11);
        if (i10 == 0) {
            w1 w1Var = new w1(5);
            this.f46222c = w1Var;
            w1Var.g();
            w1Var.M = false;
            w1Var.f46485s = 4;
            w1Var.f46486t = 4;
            w1Var.f46484r = 2;
            w1Var.f46481o = 0.1f;
            w1Var.c();
        } else if (i10 == 2) {
            this.f46223f = 0.8f;
            this.f46228x.setColor(h6.x0(null, h6.f20929a7, false));
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
            int i10 = this.f46224n;
            float[] fArr = this.f46221b;
            Color.colorToHSV(i10, fArr);
            fArr[1] = fArr[1] * 1.0f;
            if (fArr[2] > 0.7f) {
                fArr[2] = 0.7f;
            }
            int HSVToColor = Color.HSVToColor(fArr);
            int i11 = h6.f20987d6;
            d6 d6Var = this.d;
            int f7 = i0.a.f(0.5f, HSVToColor, h6.w0(i11, d6Var));
            int f10 = i0.a.f(0.4f, HSVToColor, h6.w0(i11, d6Var));
            if (this.v == null || this.f46225r != f10 || this.f46226s != f7) {
                if (this.I) {
                    Paint paint = this.f46228x;
                    this.f46229y = paint;
                    paint.setAlpha(255);
                    this.G = 0.0f;
                }
                this.f46228x = new Paint(1);
                this.f46225r = f10;
                this.f46226s = f7;
                LinearGradient linearGradient = new LinearGradient(0.0f, getMeasuredHeight(), 0.0f, 0.0f, new int[]{f10, f7}, (float[]) null, Shader.TileMode.CLAMP);
                this.v = linearGradient;
                this.f46228x.setShader(linearGradient);
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
        if (this.f46220a != 0) {
            a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        Paint paint = this.f46228x;
        if (paint != null && this.f46220a != 2) {
            paint.setShader(null);
            this.f46228x = null;
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
        if (this.f46220a == 0) {
            Path path = this.f46227w;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(rectF.width() / 2.0f, rectF.centerY(), rectF.width() / 2.0f, direction);
            rectF.set((getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(2.5f), AndroidUtilities.dpf2(5.7f) + (getMeasuredHeight() / 2.0f), getMeasuredWidth() - AndroidUtilities.dpf2(0.2f), getMeasuredHeight());
            path.addRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), direction);
            path.close();
            w1 w1Var = this.f46222c;
            w1Var.f46470a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            w1Var.f46470a.inset(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
            return;
        }
        a();
    }

    public void setAnimatedEmojiDrawable(r5 r5Var) {
        this.F = r5Var;
        if (r5Var != null) {
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
            i10 = h6.v(i10, num.intValue());
        }
        if (this.f46224n != i10) {
            this.f46224n = i10;
            int i11 = this.f46220a;
            if (i11 != 0 && i11 != 2) {
                a();
            } else {
                Paint paint = this.f46228x;
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
        if (this.f46220a != 0) {
            if (z10) {
                i10 = R.drawable.msg_mini_premiumlock;
            } else {
                i10 = R.drawable.msg_mini_stickerstar;
            }
            setImageResource(i10);
        }
    }
}
