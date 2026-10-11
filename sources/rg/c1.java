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
import org.telegram.ui.ActionBar.d6;
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
    public final int f47304a;
    public final float[] f47305b;
    public final v1 f47306c;
    public final d6 d;
    public boolean f47307e;
    public final float f47308f;
    public boolean h;
    public int f47309n;
    public int f47310r;
    public int f47311s;
    public LinearGradient v;
    public final Path f47312w;
    public Paint f47313x;
    public Paint f47314y;

    public c1(Context context, int i10, d6 d6Var) {
        super(context);
        int i11;
        this.f47305b = new float[3];
        this.f47308f = 1.0f;
        this.h = false;
        this.f47309n = -1;
        this.v = null;
        this.f47312w = new Path();
        this.f47313x = new Paint(1);
        this.G = 1.0f;
        this.f47304a = i10;
        this.d = d6Var;
        if (i10 == 0) {
            i11 = R.drawable.msg_premium_lock2;
        } else {
            i11 = R.drawable.msg_mini_premiumlock;
        }
        setImageResource(i11);
        if (i10 == 0) {
            v1 v1Var = new v1(5);
            this.f47306c = v1Var;
            v1Var.g();
            v1Var.M = false;
            v1Var.f47582s = 4;
            v1Var.f47583t = 4;
            v1Var.f47581r = 2;
            v1Var.f47578o = 0.1f;
            v1Var.c();
        } else if (i10 == 2) {
            this.f47308f = 0.8f;
            this.f47313x.setColor(h6.x0(null, h6.f20730a7, false));
        } else if (i10 == 3) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(R.drawable.msg_archive_hide);
        } else if (i10 == 4) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(R.drawable.msg_limit_pin);
        }
    }

    public final void a() {
        if (this.f47307e && getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            int i10 = this.f47309n;
            float[] fArr = this.f47305b;
            Color.colorToHSV(i10, fArr);
            fArr[1] = fArr[1] * 1.0f;
            if (fArr[2] > 0.7f) {
                fArr[2] = 0.7f;
            }
            int HSVToColor = Color.HSVToColor(fArr);
            int i11 = h6.f20786d6;
            d6 d6Var = this.d;
            int d = i0.a.d(0.5f, HSVToColor, h6.w0(i11, d6Var));
            int d10 = i0.a.d(0.4f, HSVToColor, h6.w0(i11, d6Var));
            if (this.v == null || this.f47310r != d10 || this.f47311s != d) {
                if (this.I) {
                    Paint paint = this.f47313x;
                    this.f47314y = paint;
                    paint.setAlpha(255);
                    this.G = 0.0f;
                }
                this.f47313x = new Paint(1);
                this.f47310r = d10;
                this.f47311s = d;
                LinearGradient linearGradient = new LinearGradient(0.0f, getMeasuredHeight(), 0.0f, 0.0f, new int[]{d10, d}, (float[]) null, Shader.TileMode.CLAMP);
                this.v = linearGradient;
                this.f47313x.setShader(linearGradient);
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
        this.f47307e = true;
        if (this.f47304a != 0) {
            a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f47307e = false;
        Paint paint = this.f47313x;
        if (paint != null && this.f47304a != 2) {
            paint.setShader(null);
            this.f47313x = null;
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
        if (this.f47304a == 0) {
            Path path = this.f47312w;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(rectF.width() / 2.0f, rectF.centerY(), rectF.width() / 2.0f, direction);
            rectF.set((getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(2.5f), AndroidUtilities.dpf2(5.7f) + (getMeasuredHeight() / 2.0f), getMeasuredWidth() - AndroidUtilities.dpf2(0.2f), getMeasuredHeight());
            path.addRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), direction);
            path.close();
            v1 v1Var = this.f47306c;
            v1Var.f47566a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            v1Var.f47566a.inset(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
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
        if (this.f47309n != i10) {
            this.f47309n = i10;
            int i11 = this.f47304a;
            if (i11 != 0 && i11 != 2) {
                a();
            } else {
                Paint paint = this.f47313x;
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
        if (this.f47304a != 0) {
            if (z10) {
                i10 = R.drawable.msg_mini_premiumlock;
            } else {
                i10 = R.drawable.msg_mini_stickerstar;
            }
            setImageResource(i10);
        }
    }
}
