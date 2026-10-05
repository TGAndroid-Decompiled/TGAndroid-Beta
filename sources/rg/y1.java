package rg;

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
public class y1 extends View {
    public x1 f46407a;
    public int f46408b;
    public ii.q1 f46409c;
    public boolean d;
    public Paint f46410e;
    public LinearGradient f46411f;
    public Matrix h;

    public y1(Context context) {
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
        this.f46407a = new x1(i10);
        a();
    }

    public void a() {
        x1 x1Var = this.f46407a;
        x1Var.N = 100;
        x1Var.M = true;
        x1Var.G = true;
        x1Var.K = true;
        x1Var.H = true;
        x1Var.f46387r = 4;
        x1Var.f46391w = 0.98f;
        x1Var.v = 0.98f;
        x1Var.f46390u = 0.98f;
        x1Var.c();
    }

    public final void b() {
        Paint paint = new Paint(1);
        this.f46410e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(12.0f), new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f46411f = linearGradient;
        this.f46410e.setShader(linearGradient);
        this.h = new Matrix();
    }

    public int getStarsRectWidth() {
        return AndroidUtilities.dp(140.0f);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ii.q1 q1Var = new ii.q1(this, 12);
        this.f46409c = q1Var;
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
        ii.q1 q1Var = this.f46409c;
        if (q1Var != null) {
            LiteMode.removeOnPowerSaverAppliedListener(q1Var);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.d) {
            if (this.f46410e != null) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            this.f46407a.d(canvas2);
            if (this.f46410e != null) {
                canvas2.save();
                this.h.reset();
                this.h.postTranslate(0.0f, (getHeight() + 1) - AndroidUtilities.dp(12.0f));
                this.f46411f.setLocalMatrix(this.h);
                canvas2.drawRect(0.0f, getHeight() - AndroidUtilities.dp(12.0f), getWidth(), getHeight(), this.f46410e);
                this.h.reset();
                this.h.postRotate(180.0f);
                this.h.postTranslate(0.0f, AndroidUtilities.dp(12.0f));
                this.f46411f.setLocalMatrix(this.h);
                canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f), this.f46410e);
                canvas2.restore();
                canvas2.restore();
            }
            if (!this.f46407a.f46377g) {
                invalidate();
            }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        this.f46407a.f46372a.set(0.0f, 0.0f, getStarsRectWidth(), AndroidUtilities.dp(140.0f));
        this.f46407a.f46372a.offset((getMeasuredWidth() - this.f46407a.f46372a.width()) / 2.0f, (getMeasuredHeight() - this.f46407a.f46372a.height()) / 2.0f);
        this.f46407a.f46373b.set(-AndroidUtilities.dp(15.0f), -AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f) + getMeasuredWidth(), AndroidUtilities.dp(15.0f) + getMeasuredHeight());
        if (this.f46408b != measuredHeight) {
            this.f46408b = measuredHeight;
            this.f46407a.f();
        }
    }

    public void setPaused(boolean z10) {
        x1 x1Var = this.f46407a;
        if (z10 == x1Var.f46377g) {
            return;
        }
        x1Var.f46377g = z10;
        if (z10) {
            x1Var.Q = System.currentTimeMillis();
            return;
        }
        for (int i10 = 0; i10 < this.f46407a.f46383n.size(); i10++) {
            w1 w1Var = (w1) this.f46407a.f46383n.get(i10);
            w1Var.f46347a = (System.currentTimeMillis() - this.f46407a.Q) + w1Var.f46347a;
        }
        invalidate();
    }
}
