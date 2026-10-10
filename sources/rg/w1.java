package rg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
public class w1 extends View {
    public v1 f47547a;
    public int f47548b;
    public ii.q1 f47549c;
    public boolean d;
    public Paint f47550e;
    public LinearGradient f47551f;
    public Matrix h;

    public w1(Context context) {
        super(context);
        int i10;
        if (SharedConfig.getDevicePerformanceClass() == 2) {
            i10 = 200;
        } else if (SharedConfig.getDevicePerformanceClass() == 1) {
            i10 = 100;
        } else {
            i10 = 50;
        }
        this.d = true;
        this.f47547a = new v1(i10);
        a();
    }

    public void a() {
        v1 v1Var = this.f47547a;
        v1Var.N = 100;
        v1Var.M = true;
        v1Var.G = true;
        v1Var.K = true;
        v1Var.H = true;
        v1Var.f47535r = 4;
        v1Var.f47539w = 0.98f;
        v1Var.v = 0.98f;
        v1Var.f47538u = 0.98f;
        v1Var.c();
    }

    public final void b(float f7) {
        float f10;
        if (f7 < 60.0f) {
            f10 = 5.0f;
        } else if (f7 < 180.0f) {
            f10 = 9.0f;
        } else {
            f10 = 15.0f;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        org.telegram.ui.Components.voip.r0 r0Var = new org.telegram.ui.Components.voip.r0(this, 16);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, f10);
        ofFloat.addUpdateListener(r0Var);
        ofFloat.setDuration(600L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, 1.0f);
        ofFloat2.addUpdateListener(r0Var);
        ofFloat2.setDuration(2000L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }

    public final void c() {
        Paint paint = new Paint(1);
        this.f47550e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(12.0f), new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f47551f = linearGradient;
        this.f47550e.setShader(linearGradient);
        this.h = new Matrix();
    }

    public int getStarsRectWidth() {
        return AndroidUtilities.dp(140.0f);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ii.q1 q1Var = new ii.q1(this, 12);
        this.f47549c = q1Var;
        LiteMode.addOnPowerSaverAppliedListener(q1Var);
        boolean isEnabled = LiteMode.isEnabled(131072);
        if (this.d != isEnabled) {
            this.d = isEnabled;
            invalidate();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ii.q1 q1Var = this.f47549c;
        if (q1Var != null) {
            LiteMode.removeOnPowerSaverAppliedListener(q1Var);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.d) {
            if (this.f47550e != null) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            this.f47547a.d(canvas2);
            if (this.f47550e != null) {
                canvas2.save();
                this.h.reset();
                this.h.postTranslate(0.0f, (getHeight() + 1) - AndroidUtilities.dp(12.0f));
                this.f47551f.setLocalMatrix(this.h);
                canvas2.drawRect(0.0f, getHeight() - AndroidUtilities.dp(12.0f), getWidth(), getHeight(), this.f47550e);
                this.h.reset();
                this.h.postRotate(180.0f);
                this.h.postTranslate(0.0f, AndroidUtilities.dp(12.0f));
                this.f47551f.setLocalMatrix(this.h);
                canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f), this.f47550e);
                canvas2.restore();
                canvas2.restore();
            }
            if (!this.f47547a.f47525g) {
                invalidate();
            }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        this.f47547a.f47520a.set(0.0f, 0.0f, getStarsRectWidth(), AndroidUtilities.dp(140.0f));
        this.f47547a.f47520a.offset((getMeasuredWidth() - this.f47547a.f47520a.width()) / 2.0f, (getMeasuredHeight() - this.f47547a.f47520a.height()) / 2.0f);
        this.f47547a.f47521b.set(-AndroidUtilities.dp(15.0f), -AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f) + getMeasuredWidth(), AndroidUtilities.dp(15.0f) + getMeasuredHeight());
        if (this.f47548b != measuredHeight) {
            this.f47548b = measuredHeight;
            this.f47547a.f();
        }
    }

    public void setPaused(boolean z10) {
        v1 v1Var = this.f47547a;
        if (z10 == v1Var.f47525g) {
            return;
        }
        v1Var.f47525g = z10;
        if (z10) {
            v1Var.Q = System.currentTimeMillis();
            return;
        }
        for (int i10 = 0; i10 < this.f47547a.f47531n.size(); i10++) {
            u1 u1Var = (u1) this.f47547a.f47531n.get(i10);
            u1Var.f47498a = (System.currentTimeMillis() - this.f47547a.Q) + u1Var.f47498a;
        }
        invalidate();
    }
}
