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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.o5;
public class b1 extends ImageView {
    public static final int L = 0;
    public ImageReceiver E;
    public o5 F;
    public float G;
    public boolean H;
    public boolean I;
    public org.telegram.ui.Components.voip.h J;
    public Integer K;
    public final int f42252a;
    public final float[] f42253b;
    public final u1 f42254c;
    public final e6 d;
    public boolean e;
    public final float f42255f;
    public boolean h;
    public int f42256n;
    public int f42257r;
    public int f42258s;
    public LinearGradient v;
    public final Path f42259w;
    public Paint f42260x;
    public Paint f42261y;

    public b1(Context context, int i10, e6 e6Var) {
        super(context);
        int i11;
        this.f42253b = new float[3];
        this.f42255f = 1.0f;
        this.h = false;
        this.f42256n = -1;
        this.v = null;
        this.f42259w = new Path();
        this.f42260x = new Paint(1);
        this.G = 1.0f;
        this.f42252a = i10;
        this.d = e6Var;
        if (i10 == 0) {
            i11 = R.drawable.msg_premium_lock2;
        } else {
            i11 = R.drawable.msg_mini_premiumlock;
        }
        setImageResource(i11);
        if (i10 == 0) {
            u1 u1Var = new u1(5);
            this.f42254c = u1Var;
            u1Var.g();
            u1Var.M = false;
            u1Var.f42507s = 4;
            u1Var.f42508t = 4;
            u1Var.f42506r = 2;
            u1Var.f42503o = 0.1f;
            u1Var.c();
        } else if (i10 == 2) {
            this.f42255f = 0.8f;
            this.f42260x.setColor(i6.w0(null, i6.f18778a7, false));
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
            int i10 = this.f42256n;
            float[] fArr = this.f42253b;
            Color.colorToHSV(i10, fArr);
            fArr[1] = fArr[1] * 1.0f;
            if (fArr[2] > 0.7f) {
                fArr[2] = 0.7f;
            }
            int HSVToColor = Color.HSVToColor(fArr);
            int i11 = i6.f18834d6;
            e6 e6Var = this.d;
            int d = i0.a.d(0.5f, HSVToColor, i6.v0(i11, e6Var));
            int d10 = i0.a.d(0.4f, HSVToColor, i6.v0(i11, e6Var));
            if (this.v == null || this.f42257r != d10 || this.f42258s != d) {
                if (this.I) {
                    Paint paint = this.f42260x;
                    this.f42261y = paint;
                    paint.setAlpha(255);
                    this.G = 0.0f;
                }
                this.f42260x = new Paint(1);
                this.f42257r = d10;
                this.f42258s = d;
                LinearGradient linearGradient = new LinearGradient(0.0f, getMeasuredHeight(), 0.0f, 0.0f, new int[]{d10, d}, (float[]) null, Shader.TileMode.CLAMP);
                this.v = linearGradient;
                this.f42260x.setShader(linearGradient);
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
        if (this.f42252a != 0) {
            a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        Paint paint = this.f42260x;
        if (paint != null && this.f42252a != 2) {
            paint.setShader(null);
            this.f42260x = null;
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
        if (this.f42252a == 0) {
            Path path = this.f42259w;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(rectF.width() / 2.0f, rectF.centerY(), rectF.width() / 2.0f, direction);
            rectF.set((getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(2.5f), AndroidUtilities.dpf2(5.7f) + (getMeasuredHeight() / 2.0f), getMeasuredWidth() - AndroidUtilities.dpf2(0.2f), getMeasuredHeight());
            path.addRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), direction);
            path.close();
            u1 u1Var = this.f42254c;
            u1Var.f42492a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            u1Var.f42492a.inset(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
            return;
        }
        a();
    }

    public void setAnimatedEmojiDrawable(o5 o5Var) {
        this.F = o5Var;
        if (o5Var != null) {
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
            i10 = i6.v(i10, num.intValue());
        }
        if (this.f42256n != i10) {
            this.f42256n = i10;
            int i11 = this.f42252a;
            if (i11 != 0 && i11 != 2) {
                a();
            } else {
                Paint paint = this.f42260x;
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
        if (this.f42252a != 0) {
            if (z10) {
                i10 = R.drawable.msg_mini_premiumlock;
            } else {
                i10 = R.drawable.msg_mini_stickerstar;
            }
            setImageResource(i10);
        }
    }
}
