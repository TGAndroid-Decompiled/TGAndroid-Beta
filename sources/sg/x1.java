package sg;

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
public class x1 extends View {
    public w1 f45428a;
    public int f45429b;
    public ji.p1 f45430c;
    public boolean d;
    public Paint e;
    public LinearGradient f45431f;
    public Matrix h;

    public x1(Context context) {
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
        this.f45428a = new w1(i10);
        a();
    }

    public void a() {
        w1 w1Var = this.f45428a;
        w1Var.N = 100;
        w1Var.M = true;
        w1Var.G = true;
        w1Var.K = true;
        w1Var.H = true;
        w1Var.f45413r = 4;
        w1Var.f45417w = 0.98f;
        w1Var.v = 0.98f;
        w1Var.f45416u = 0.98f;
        w1Var.c();
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
        ki.a aVar = new ki.a(this, 17);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, f10);
        ofFloat.addUpdateListener(aVar);
        ofFloat.setDuration(600L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, 1.0f);
        ofFloat2.addUpdateListener(aVar);
        ofFloat2.setDuration(2000L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }

    public final void c() {
        Paint paint = new Paint(1);
        this.e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(12.0f), new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f45431f = linearGradient;
        this.e.setShader(linearGradient);
        this.h = new Matrix();
    }

    public int getStarsRectWidth() {
        return AndroidUtilities.dp(140.0f);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ji.p1 p1Var = new ji.p1(this, 12);
        this.f45430c = p1Var;
        LiteMode.addOnPowerSaverAppliedListener(p1Var);
        boolean isEnabled = LiteMode.isEnabled(131072);
        if (this.d != isEnabled) {
            this.d = isEnabled;
            invalidate();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ji.p1 p1Var = this.f45430c;
        if (p1Var != null) {
            LiteMode.removeOnPowerSaverAppliedListener(p1Var);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.d) {
            if (this.e != null) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            this.f45428a.d(canvas2);
            if (this.e != null) {
                canvas2.save();
                this.h.reset();
                this.h.postTranslate(0.0f, (getHeight() + 1) - AndroidUtilities.dp(12.0f));
                this.f45431f.setLocalMatrix(this.h);
                canvas2.drawRect(0.0f, getHeight() - AndroidUtilities.dp(12.0f), getWidth(), getHeight(), this.e);
                this.h.reset();
                this.h.postRotate(180.0f);
                this.h.postTranslate(0.0f, AndroidUtilities.dp(12.0f));
                this.f45431f.setLocalMatrix(this.h);
                canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f), this.e);
                canvas2.restore();
                canvas2.restore();
            }
            if (!this.f45428a.f45403g) {
                invalidate();
            }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        this.f45428a.f45399a.set(0.0f, 0.0f, getStarsRectWidth(), AndroidUtilities.dp(140.0f));
        this.f45428a.f45399a.offset((getMeasuredWidth() - this.f45428a.f45399a.width()) / 2.0f, (getMeasuredHeight() - this.f45428a.f45399a.height()) / 2.0f);
        this.f45428a.f45400b.set(-AndroidUtilities.dp(15.0f), -AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f) + getMeasuredWidth(), AndroidUtilities.dp(15.0f) + getMeasuredHeight());
        if (this.f45429b != measuredHeight) {
            this.f45429b = measuredHeight;
            this.f45428a.f();
        }
    }

    public void setPaused(boolean z10) {
        w1 w1Var = this.f45428a;
        if (z10 == w1Var.f45403g) {
            return;
        }
        w1Var.f45403g = z10;
        if (z10) {
            w1Var.Q = System.currentTimeMillis();
            return;
        }
        for (int i10 = 0; i10 < this.f45428a.f45409n.size(); i10++) {
            v1 v1Var = (v1) this.f45428a.f45409n.get(i10);
            v1Var.f45380a = (System.currentTimeMillis() - this.f45428a.Q) + v1Var.f45380a;
        }
        invalidate();
    }
}
