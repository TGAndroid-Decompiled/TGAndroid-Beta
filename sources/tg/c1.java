package tg;

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
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.t5;
public class c1 extends ImageView {
    public static final int L = 0;
    public ImageReceiver E;
    public t5 F;
    public float G;
    public boolean H;
    public boolean I;
    public org.telegram.ui.Components.voip.h J;
    public Integer K;
    public final int f48827a;
    public final float[] f48828b;
    public final w1 f48829c;
    public final u6 d;
    public boolean e;
    public final float f48830f;
    public boolean h;
    public int f48831n;
    public int f48832r;
    public int f48833s;
    public LinearGradient v;
    public final Path f48834w;
    public Paint f48835x;
    public Paint f48836y;

    public c1(Context context, int i10, u6 u6Var) {
        super(context);
        int i11;
        this.f48828b = new float[3];
        this.f48830f = 1.0f;
        this.h = false;
        this.f48831n = -1;
        this.v = null;
        this.f48834w = new Path();
        this.f48835x = new Paint(1);
        this.G = 1.0f;
        this.f48827a = i10;
        this.d = u6Var;
        if (i10 == 0) {
            i11 = R.drawable.msg_premium_lock2;
        } else {
            i11 = R.drawable.msg_mini_premiumlock;
        }
        setImageResource(i11);
        if (i10 == 0) {
            w1 w1Var = new w1(5);
            this.f48829c = w1Var;
            w1Var.g();
            w1Var.M = false;
            w1Var.f49102s = 4;
            w1Var.f49103t = 4;
            w1Var.f49101r = 2;
            w1Var.f49098o = 0.1f;
            w1Var.c();
        } else if (i10 == 2) {
            this.f48830f = 0.8f;
            this.f48835x.setColor(y6.x0(null, y6.f23297a7, false));
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
            int i10 = this.f48831n;
            float[] fArr = this.f48828b;
            Color.colorToHSV(i10, fArr);
            fArr[1] = fArr[1] * 1.0f;
            if (fArr[2] > 0.7f) {
                fArr[2] = 0.7f;
            }
            int HSVToColor = Color.HSVToColor(fArr);
            int i11 = y6.f23354d6;
            u6 u6Var = this.d;
            int f7 = i0.a.f(0.5f, HSVToColor, y6.w0(i11, u6Var));
            int f10 = i0.a.f(0.4f, HSVToColor, y6.w0(i11, u6Var));
            if (this.v == null || this.f48832r != f10 || this.f48833s != f7) {
                if (this.I) {
                    Paint paint = this.f48835x;
                    this.f48836y = paint;
                    paint.setAlpha(255);
                    this.G = 0.0f;
                }
                this.f48835x = new Paint(1);
                this.f48832r = f10;
                this.f48833s = f7;
                LinearGradient linearGradient = new LinearGradient(0.0f, getMeasuredHeight(), 0.0f, 0.0f, new int[]{f10, f7}, (float[]) null, Shader.TileMode.CLAMP);
                this.v = linearGradient;
                this.f48835x.setShader(linearGradient);
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
        if (this.f48827a != 0) {
            a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        Paint paint = this.f48835x;
        if (paint != null && this.f48827a != 2) {
            paint.setShader(null);
            this.f48835x = null;
        }
        this.v = null;
        this.I = false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: tg.c1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f48827a == 0) {
            Path path = this.f48834w;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(rectF.width() / 2.0f, rectF.centerY(), rectF.width() / 2.0f, direction);
            rectF.set((getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(2.5f), AndroidUtilities.dpf2(5.7f) + (getMeasuredHeight() / 2.0f), getMeasuredWidth() - AndroidUtilities.dpf2(0.2f), getMeasuredHeight());
            path.addRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), direction);
            path.close();
            w1 w1Var = this.f48829c;
            w1Var.f49087a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            w1Var.f49087a.inset(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
            return;
        }
        a();
    }

    public void setAnimatedEmojiDrawable(t5 t5Var) {
        this.F = t5Var;
        if (t5Var != null) {
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
            i10 = y6.v(i10, num.intValue());
        }
        if (this.f48831n != i10) {
            this.f48831n = i10;
            int i11 = this.f48827a;
            if (i11 != 0 && i11 != 2) {
                a();
            } else {
                Paint paint = this.f48835x;
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
        if (this.f48827a != 0) {
            if (z10) {
                i10 = R.drawable.msg_mini_premiumlock;
            } else {
                i10 = R.drawable.msg_mini_stickerstar;
            }
            setImageResource(i10);
        }
    }
}
