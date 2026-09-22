package rg;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.p5;
public class b1 extends ImageView {
    public static final int L = 0;
    public ImageReceiver E;
    public p5 F;
    public float G;
    public boolean H;
    public boolean I;
    public org.telegram.ui.Components.voip.h J;
    public Integer K;
    public final int f42575a;
    public final float[] f42576b;
    public final v1 f42577c;
    public final f6 d;
    public boolean e;
    public final float f42578f;
    public boolean h;
    public int f42579n;
    public int f42580r;
    public int f42581s;
    public LinearGradient v;
    public final Path f42582w;
    public Paint f42583x;
    public Paint f42584y;

    public b1(Context context, int i10, f6 f6Var) {
        super(context);
        int i11;
        this.f42576b = new float[3];
        this.f42578f = 1.0f;
        this.h = false;
        this.f42579n = -1;
        this.v = null;
        this.f42582w = new Path();
        this.f42583x = new Paint(1);
        this.G = 1.0f;
        this.f42575a = i10;
        this.d = f6Var;
        if (i10 == 0) {
            i11 = R.drawable.msg_premium_lock2;
        } else {
            i11 = R.drawable.msg_mini_premiumlock;
        }
        setImageResource(i11);
        if (i10 == 0) {
            v1 v1Var = new v1(5);
            this.f42577c = v1Var;
            v1Var.g();
            v1Var.M = false;
            v1Var.f42836s = 4;
            v1Var.f42837t = 4;
            v1Var.f42835r = 2;
            v1Var.f42832o = 0.1f;
            v1Var.c();
        } else if (i10 == 2) {
            this.f42578f = 0.8f;
            this.f42583x.setColor(j6.w0(null, j6.f19053a7, false));
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
            int i10 = this.f42579n;
            float[] fArr = this.f42576b;
            Color.colorToHSV(i10, fArr);
            fArr[1] = fArr[1] * 1.0f;
            if (fArr[2] > 0.7f) {
                fArr[2] = 0.7f;
            }
            int HSVToColor = Color.HSVToColor(fArr);
            int i11 = j6.f19109d6;
            f6 f6Var = this.d;
            int d = i0.a.d(0.5f, HSVToColor, j6.v0(i11, f6Var));
            int d10 = i0.a.d(0.4f, HSVToColor, j6.v0(i11, f6Var));
            if (this.v == null || this.f42580r != d10 || this.f42581s != d) {
                if (this.I) {
                    Paint paint = this.f42583x;
                    this.f42584y = paint;
                    paint.setAlpha(255);
                    this.G = 0.0f;
                }
                this.f42583x = new Paint(1);
                this.f42580r = d10;
                this.f42581s = d;
                LinearGradient linearGradient = new LinearGradient(0.0f, getMeasuredHeight(), 0.0f, 0.0f, new int[]{d10, d}, (float[]) null, Shader.TileMode.CLAMP);
                this.v = linearGradient;
                this.f42583x.setShader(linearGradient);
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
        if (this.f42575a != 0) {
            a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        Paint paint = this.f42583x;
        if (paint != null && this.f42575a != 2) {
            paint.setShader(null);
            this.f42583x = null;
        }
        this.v = null;
        this.I = false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: rg.b1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f42575a == 0) {
            Path path = this.f42582w;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(rectF.width() / 2.0f, rectF.centerY(), rectF.width() / 2.0f, direction);
            rectF.set((getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(2.5f), AndroidUtilities.dpf2(5.7f) + (getMeasuredHeight() / 2.0f), getMeasuredWidth() - AndroidUtilities.dpf2(0.2f), getMeasuredHeight());
            path.addRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), direction);
            path.close();
            v1 v1Var = this.f42577c;
            v1Var.f42821a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            v1Var.f42821a.inset(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
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
            i10 = j6.v(i10, num.intValue());
        }
        if (this.f42579n != i10) {
            this.f42579n = i10;
            int i11 = this.f42575a;
            if (i11 != 0 && i11 != 2) {
                a();
            } else {
                Paint paint = this.f42583x;
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
        if (this.f42575a != 0) {
            if (z10) {
                i10 = R.drawable.msg_mini_premiumlock;
            } else {
                i10 = R.drawable.msg_mini_stickerstar;
            }
            setImageResource(i10);
        }
    }
}
