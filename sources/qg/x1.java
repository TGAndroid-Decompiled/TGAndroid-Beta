package qg;

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
    public w1 f40983a;
    public int f40984b;
    public org.telegram.ui.web.y1 f40985c;
    public boolean d;
    public Paint e;
    public LinearGradient f40986f;
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
        this.f40983a = new w1(i10);
        a();
    }

    public void a() {
        w1 w1Var = this.f40983a;
        w1Var.N = 100;
        w1Var.M = true;
        w1Var.G = true;
        w1Var.K = true;
        w1Var.H = true;
        w1Var.f40969r = 4;
        w1Var.f40973w = 0.98f;
        w1Var.v = 0.98f;
        w1Var.f40972u = 0.98f;
        w1Var.c();
    }

    public final void b() {
        Paint paint = new Paint(1);
        this.e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(12.0f), new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f40986f = linearGradient;
        this.e.setShader(linearGradient);
        this.h = new Matrix();
    }

    public int getStarsRectWidth() {
        return AndroidUtilities.dp(140.0f);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.web.y1 y1Var = new org.telegram.ui.web.y1(this, 5);
        this.f40985c = y1Var;
        LiteMode.addOnPowerSaverAppliedListener(y1Var);
        boolean isEnabled = LiteMode.isEnabled(131072);
        if (this.d != isEnabled) {
            this.d = isEnabled;
            invalidate();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.web.y1 y1Var = this.f40985c;
        if (y1Var != null) {
            LiteMode.removeOnPowerSaverAppliedListener(y1Var);
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
            this.f40983a.d(canvas2);
            if (this.e != null) {
                canvas2.save();
                this.h.reset();
                this.h.postTranslate(0.0f, (getHeight() + 1) - AndroidUtilities.dp(12.0f));
                this.f40986f.setLocalMatrix(this.h);
                canvas2.drawRect(0.0f, getHeight() - AndroidUtilities.dp(12.0f), getWidth(), getHeight(), this.e);
                this.h.reset();
                this.h.postRotate(180.0f);
                this.h.postTranslate(0.0f, AndroidUtilities.dp(12.0f));
                this.f40986f.setLocalMatrix(this.h);
                canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f), this.e);
                canvas2.restore();
                canvas2.restore();
            }
            if (!this.f40983a.f40959g) {
                invalidate();
            }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        this.f40983a.f40955a.set(0.0f, 0.0f, getStarsRectWidth(), AndroidUtilities.dp(140.0f));
        this.f40983a.f40955a.offset((getMeasuredWidth() - this.f40983a.f40955a.width()) / 2.0f, (getMeasuredHeight() - this.f40983a.f40955a.height()) / 2.0f);
        this.f40983a.f40956b.set(-AndroidUtilities.dp(15.0f), -AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f) + getMeasuredWidth(), AndroidUtilities.dp(15.0f) + getMeasuredHeight());
        if (this.f40984b != measuredHeight) {
            this.f40984b = measuredHeight;
            this.f40983a.f();
        }
    }

    public void setPaused(boolean z10) {
        w1 w1Var = this.f40983a;
        if (z10 == w1Var.f40959g) {
            return;
        }
        w1Var.f40959g = z10;
        if (z10) {
            w1Var.Q = System.currentTimeMillis();
            return;
        }
        for (int i10 = 0; i10 < this.f40983a.f40965n.size(); i10++) {
            v1 v1Var = (v1) this.f40983a.f40965n.get(i10);
            v1Var.f40937a = (System.currentTimeMillis() - this.f40983a.Q) + v1Var.f40937a;
        }
        invalidate();
    }
}
