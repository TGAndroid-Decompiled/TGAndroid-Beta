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
import org.telegram.ui.Components.q5;
public class b1 extends ImageView {
    public static final int L = 0;
    public ImageReceiver E;
    public q5 F;
    public float G;
    public boolean H;
    public boolean I;
    public org.telegram.ui.Components.voip.h J;
    public Integer K;
    public final int f42526a;
    public final float[] f42527b;
    public final v1 f42528c;
    public final d6 d;
    public boolean e;
    public final float f42529f;
    public boolean h;
    public int f42530n;
    public int f42531r;
    public int f42532s;
    public LinearGradient v;
    public final Path f42533w;
    public Paint f42534x;
    public Paint f42535y;

    public b1(Context context, int i10, d6 d6Var) {
        super(context);
        int i11;
        this.f42527b = new float[3];
        this.f42529f = 1.0f;
        this.h = false;
        this.f42530n = -1;
        this.v = null;
        this.f42533w = new Path();
        this.f42534x = new Paint(1);
        this.G = 1.0f;
        this.f42526a = i10;
        this.d = d6Var;
        if (i10 == 0) {
            i11 = R.drawable.msg_premium_lock2;
        } else {
            i11 = R.drawable.msg_mini_premiumlock;
        }
        setImageResource(i11);
        if (i10 == 0) {
            v1 v1Var = new v1(5);
            this.f42528c = v1Var;
            v1Var.g();
            v1Var.M = false;
            v1Var.f42787s = 4;
            v1Var.f42788t = 4;
            v1Var.f42786r = 2;
            v1Var.f42783o = 0.1f;
            v1Var.c();
        } else if (i10 == 2) {
            this.f42529f = 0.8f;
            this.f42534x.setColor(h6.w0(null, h6.f18989a7, false));
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
            int i10 = this.f42530n;
            float[] fArr = this.f42527b;
            Color.colorToHSV(i10, fArr);
            fArr[1] = fArr[1] * 1.0f;
            if (fArr[2] > 0.7f) {
                fArr[2] = 0.7f;
            }
            int HSVToColor = Color.HSVToColor(fArr);
            int i11 = h6.f19045d6;
            d6 d6Var = this.d;
            int d = i0.a.d(0.5f, HSVToColor, h6.v0(i11, d6Var));
            int d10 = i0.a.d(0.4f, HSVToColor, h6.v0(i11, d6Var));
            if (this.v == null || this.f42531r != d10 || this.f42532s != d) {
                if (this.I) {
                    Paint paint = this.f42534x;
                    this.f42535y = paint;
                    paint.setAlpha(255);
                    this.G = 0.0f;
                }
                this.f42534x = new Paint(1);
                this.f42531r = d10;
                this.f42532s = d;
                LinearGradient linearGradient = new LinearGradient(0.0f, getMeasuredHeight(), 0.0f, 0.0f, new int[]{d10, d}, (float[]) null, Shader.TileMode.CLAMP);
                this.v = linearGradient;
                this.f42534x.setShader(linearGradient);
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
        if (this.f42526a != 0) {
            a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        Paint paint = this.f42534x;
        if (paint != null && this.f42526a != 2) {
            paint.setShader(null);
            this.f42534x = null;
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
        if (this.f42526a == 0) {
            Path path = this.f42533w;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(rectF.width() / 2.0f, rectF.centerY(), rectF.width() / 2.0f, direction);
            rectF.set((getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(2.5f), AndroidUtilities.dpf2(5.7f) + (getMeasuredHeight() / 2.0f), getMeasuredWidth() - AndroidUtilities.dpf2(0.2f), getMeasuredHeight());
            path.addRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), direction);
            path.close();
            v1 v1Var = this.f42528c;
            v1Var.f42772a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            v1Var.f42772a.inset(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
            return;
        }
        a();
    }

    public void setAnimatedEmojiDrawable(q5 q5Var) {
        this.F = q5Var;
        if (q5Var != null) {
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
        if (this.f42530n != i10) {
            this.f42530n = i10;
            int i11 = this.f42526a;
            if (i11 != 0 && i11 != 2) {
                a();
            } else {
                Paint paint = this.f42534x;
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
        if (this.f42526a != 0) {
            if (z10) {
                i10 = R.drawable.msg_mini_premiumlock;
            } else {
                i10 = R.drawable.msg_mini_stickerstar;
            }
            setImageResource(i10);
        }
    }
}
