package zf;

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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.k5;
public class b1 extends ImageView {
    public static final int H = 0;
    public ImageReceiver A;
    public k5 B;
    public float C;
    public boolean D;
    public boolean E;
    public org.telegram.ui.Components.voip.h F;
    public Integer G;
    public final int f50467a;
    public final float[] f50468b;
    public final v1 f50469c;
    public final b6 d;
    public boolean f50470e;
    public final float f50471f;
    public boolean h;
    public int f50472n;
    public int f50473r;
    public int f50474s;
    public LinearGradient v;
    public final Path f50475w;
    public Paint f50476x;
    public Paint f50477y;

    public b1(Context context, int i9, b6 b6Var) {
        super(context);
        int i10;
        this.f50468b = new float[3];
        this.f50471f = 1.0f;
        this.h = false;
        this.f50472n = -1;
        this.v = null;
        this.f50475w = new Path();
        this.f50476x = new Paint(1);
        this.C = 1.0f;
        this.f50467a = i9;
        this.d = b6Var;
        if (i9 == 0) {
            i10 = R.drawable.msg_premium_lock2;
        } else {
            i10 = R.drawable.msg_mini_premiumlock;
        }
        setImageResource(i10);
        if (i9 == 0) {
            v1 v1Var = new v1(5);
            this.f50469c = v1Var;
            v1Var.g();
            v1Var.M = false;
            v1Var.f50749s = 4;
            v1Var.f50750t = 4;
            v1Var.f50748r = 2;
            v1Var.f50745o = 0.1f;
            v1Var.c();
        } else if (i9 == 2) {
            this.f50471f = 0.8f;
            this.f50476x.setColor(f6.w0(null, f6.f22947a7, false));
        } else if (i9 == 3) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(R.drawable.msg_archive_hide);
        } else if (i9 == 4) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(R.drawable.msg_limit_pin);
        }
    }

    public final void a() {
        if (this.f50470e && getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            int i9 = this.f50472n;
            float[] fArr = this.f50468b;
            Color.colorToHSV(i9, fArr);
            fArr[1] = fArr[1] * 1.0f;
            if (fArr[2] > 0.7f) {
                fArr[2] = 0.7f;
            }
            int HSVToColor = Color.HSVToColor(fArr);
            int i10 = f6.f23001d6;
            b6 b6Var = this.d;
            int d = i0.a.d(0.5f, HSVToColor, f6.v0(i10, b6Var));
            int d9 = i0.a.d(0.4f, HSVToColor, f6.v0(i10, b6Var));
            if (this.v == null || this.f50473r != d9 || this.f50474s != d) {
                if (this.E) {
                    Paint paint = this.f50476x;
                    this.f50477y = paint;
                    paint.setAlpha(255);
                    this.C = 0.0f;
                }
                this.f50476x = new Paint(1);
                this.f50473r = d9;
                this.f50474s = d;
                LinearGradient linearGradient = new LinearGradient(0.0f, getMeasuredHeight(), 0.0f, 0.0f, new int[]{d9, d}, (float[]) null, Shader.TileMode.CLAMP);
                this.v = linearGradient;
                this.f50476x.setShader(linearGradient);
                invalidate();
            }
        }
    }

    public ImageReceiver getImageReceiver() {
        return this.A;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f50470e = true;
        if (this.f50467a != 0) {
            a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f50470e = false;
        Paint paint = this.f50476x;
        if (paint != null && this.f50467a != 2) {
            paint.setShader(null);
            this.f50476x = null;
        }
        this.v = null;
        this.E = false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: zf.b1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        if (this.f50467a == 0) {
            Path path = this.f50475w;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(rectF.width() / 2.0f, rectF.centerY(), rectF.width() / 2.0f, direction);
            rectF.set((getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(2.5f), AndroidUtilities.dpf2(5.7f) + (getMeasuredHeight() / 2.0f), getMeasuredWidth() - AndroidUtilities.dpf2(0.2f), getMeasuredHeight());
            path.addRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), direction);
            path.close();
            v1 v1Var = this.f50469c;
            v1Var.f50733a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            v1Var.f50733a.inset(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
            return;
        }
        a();
    }

    public void setAnimatedEmojiDrawable(k5 k5Var) {
        this.B = k5Var;
        if (k5Var != null) {
            this.D = true;
            invalidate();
        }
    }

    public void setBlendWithColor(Integer num) {
        this.G = num;
    }

    public void setColor(int i9) {
        this.h = true;
        Integer num = this.G;
        if (num != null) {
            i9 = f6.v(i9, num.intValue());
        }
        if (this.f50472n != i9) {
            this.f50472n = i9;
            int i10 = this.f50467a;
            if (i10 != 0 && i10 != 2) {
                a();
            } else {
                Paint paint = this.f50476x;
                if (paint != null) {
                    paint.setColor(i9);
                }
            }
            invalidate();
        }
    }

    public void setImageReceiver(ImageReceiver imageReceiver) {
        this.A = imageReceiver;
        if (imageReceiver != null) {
            this.D = true;
            invalidate();
        }
    }

    public void setLocked(boolean z10) {
        int i9;
        if (this.f50467a != 0) {
            if (z10) {
                i9 = R.drawable.msg_mini_premiumlock;
            } else {
                i9 = R.drawable.msg_mini_stickerstar;
            }
            setImageResource(i9);
        }
    }
}
