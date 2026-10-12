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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.s5;
public class c1 extends ImageView {
    public static final int L = 0;
    public ImageReceiver E;
    public s5 F;
    public float G;
    public boolean H;
    public boolean I;
    public org.telegram.ui.Components.voip.h J;
    public Integer K;
    public final int f47428a;
    public final float[] f47429b;
    public final v1 f47430c;
    public final c6 d;
    public boolean f47431e;
    public final float f47432f;
    public boolean h;
    public int f47433n;
    public int f47434r;
    public int f47435s;
    public LinearGradient v;
    public final Path f47436w;
    public Paint f47437x;
    public Paint f47438y;

    public c1(Context context, int i10, c6 c6Var) {
        super(context);
        int i11;
        this.f47429b = new float[3];
        this.f47432f = 1.0f;
        this.h = false;
        this.f47433n = -1;
        this.v = null;
        this.f47436w = new Path();
        this.f47437x = new Paint(1);
        this.G = 1.0f;
        this.f47428a = i10;
        this.d = c6Var;
        if (i10 == 0) {
            i11 = R.drawable.msg_premium_lock2;
        } else {
            i11 = R.drawable.msg_mini_premiumlock;
        }
        setImageResource(i11);
        if (i10 == 0) {
            v1 v1Var = new v1(5);
            this.f47430c = v1Var;
            v1Var.g();
            v1Var.M = false;
            v1Var.f47706s = 4;
            v1Var.f47707t = 4;
            v1Var.f47705r = 2;
            v1Var.f47702o = 0.1f;
            v1Var.c();
        } else if (i10 == 2) {
            this.f47432f = 0.8f;
            this.f47437x.setColor(h6.x0(null, h6.f20503a7, false));
        } else if (i10 == 3) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(R.drawable.msg_archive_hide);
        } else if (i10 == 4) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(R.drawable.msg_limit_pin);
        }
    }

    public final void a() {
        if (this.f47431e && getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            int i10 = this.f47433n;
            float[] fArr = this.f47429b;
            Color.colorToHSV(i10, fArr);
            fArr[1] = fArr[1] * 1.0f;
            if (fArr[2] > 0.7f) {
                fArr[2] = 0.7f;
            }
            int HSVToColor = Color.HSVToColor(fArr);
            int i11 = h6.f20559d6;
            c6 c6Var = this.d;
            int d = i0.a.d(0.5f, HSVToColor, h6.w0(i11, c6Var));
            int d10 = i0.a.d(0.4f, HSVToColor, h6.w0(i11, c6Var));
            if (this.v == null || this.f47434r != d10 || this.f47435s != d) {
                if (this.I) {
                    Paint paint = this.f47437x;
                    this.f47438y = paint;
                    paint.setAlpha(255);
                    this.G = 0.0f;
                }
                this.f47437x = new Paint(1);
                this.f47434r = d10;
                this.f47435s = d;
                LinearGradient linearGradient = new LinearGradient(0.0f, getMeasuredHeight(), 0.0f, 0.0f, new int[]{d10, d}, (float[]) null, Shader.TileMode.CLAMP);
                this.v = linearGradient;
                this.f47437x.setShader(linearGradient);
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
        this.f47431e = true;
        if (this.f47428a != 0) {
            a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f47431e = false;
        Paint paint = this.f47437x;
        if (paint != null && this.f47428a != 2) {
            paint.setShader(null);
            this.f47437x = null;
        }
        this.v = null;
        this.I = false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: rg.c1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f47428a == 0) {
            Path path = this.f47436w;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(rectF.width() / 2.0f, rectF.centerY(), rectF.width() / 2.0f, direction);
            rectF.set((getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(2.5f), AndroidUtilities.dpf2(5.7f) + (getMeasuredHeight() / 2.0f), getMeasuredWidth() - AndroidUtilities.dpf2(0.2f), getMeasuredHeight());
            path.addRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), direction);
            path.close();
            v1 v1Var = this.f47430c;
            v1Var.f47690a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            v1Var.f47690a.inset(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
            return;
        }
        a();
    }

    public void setAnimatedEmojiDrawable(s5 s5Var) {
        this.F = s5Var;
        if (s5Var != null) {
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
        if (this.f47433n != i10) {
            this.f47433n = i10;
            int i11 = this.f47428a;
            if (i11 != 0 && i11 != 2) {
                a();
            } else {
                Paint paint = this.f47437x;
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
        if (this.f47428a != 0) {
            if (z10) {
                i10 = R.drawable.msg_mini_premiumlock;
            } else {
                i10 = R.drawable.msg_mini_stickerstar;
            }
            setImageResource(i10);
        }
    }
}
