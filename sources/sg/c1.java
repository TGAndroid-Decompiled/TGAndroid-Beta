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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
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
    public final int f45150a;
    public final float[] f45151b;
    public final w1 f45152c;
    public final c6 d;
    public boolean e;
    public final float f45153f;
    public boolean h;
    public int f45154n;
    public int f45155r;
    public int f45156s;
    public LinearGradient v;
    public final Path f45157w;
    public Paint f45158x;
    public Paint f45159y;

    public c1(Context context, int i10, c6 c6Var) {
        super(context);
        int i11;
        this.f45151b = new float[3];
        this.f45153f = 1.0f;
        this.h = false;
        this.f45154n = -1;
        this.v = null;
        this.f45157w = new Path();
        this.f45158x = new Paint(1);
        this.G = 1.0f;
        this.f45150a = i10;
        this.d = c6Var;
        if (i10 == 0) {
            i11 = R.drawable.msg_premium_lock2;
        } else {
            i11 = R.drawable.msg_mini_premiumlock;
        }
        setImageResource(i11);
        if (i10 == 0) {
            w1 w1Var = new w1(5);
            this.f45152c = w1Var;
            w1Var.g();
            w1Var.M = false;
            w1Var.f45414s = 4;
            w1Var.f45415t = 4;
            w1Var.f45413r = 2;
            w1Var.f45410o = 0.1f;
            w1Var.c();
        } else if (i10 == 2) {
            this.f45153f = 0.8f;
            this.f45158x.setColor(g6.x0(null, g6.f19843a7, false));
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
            int i10 = this.f45154n;
            float[] fArr = this.f45151b;
            Color.colorToHSV(i10, fArr);
            fArr[1] = fArr[1] * 1.0f;
            if (fArr[2] > 0.7f) {
                fArr[2] = 0.7f;
            }
            int HSVToColor = Color.HSVToColor(fArr);
            int i11 = g6.f19901d6;
            c6 c6Var = this.d;
            int d = i0.a.d(0.5f, HSVToColor, g6.w0(i11, c6Var));
            int d10 = i0.a.d(0.4f, HSVToColor, g6.w0(i11, c6Var));
            if (this.v == null || this.f45155r != d10 || this.f45156s != d) {
                if (this.I) {
                    Paint paint = this.f45158x;
                    this.f45159y = paint;
                    paint.setAlpha(255);
                    this.G = 0.0f;
                }
                this.f45158x = new Paint(1);
                this.f45155r = d10;
                this.f45156s = d;
                LinearGradient linearGradient = new LinearGradient(0.0f, getMeasuredHeight(), 0.0f, 0.0f, new int[]{d10, d}, (float[]) null, Shader.TileMode.CLAMP);
                this.v = linearGradient;
                this.f45158x.setShader(linearGradient);
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
        if (this.f45150a != 0) {
            a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        Paint paint = this.f45158x;
        if (paint != null && this.f45150a != 2) {
            paint.setShader(null);
            this.f45158x = null;
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
        if (this.f45150a == 0) {
            Path path = this.f45157w;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(rectF.width() / 2.0f, rectF.centerY(), rectF.width() / 2.0f, direction);
            rectF.set((getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(2.5f), AndroidUtilities.dpf2(5.7f) + (getMeasuredHeight() / 2.0f), getMeasuredWidth() - AndroidUtilities.dpf2(0.2f), getMeasuredHeight());
            path.addRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), direction);
            path.close();
            w1 w1Var = this.f45152c;
            w1Var.f45399a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            w1Var.f45399a.inset(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
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
            i10 = g6.v(i10, num.intValue());
        }
        if (this.f45154n != i10) {
            this.f45154n = i10;
            int i11 = this.f45150a;
            if (i11 != 0 && i11 != 2) {
                a();
            } else {
                Paint paint = this.f45158x;
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
        if (this.f45150a != 0) {
            if (z10) {
                i10 = R.drawable.msg_mini_premiumlock;
            } else {
                i10 = R.drawable.msg_mini_stickerstar;
            }
            setImageResource(i10);
        }
    }
}
