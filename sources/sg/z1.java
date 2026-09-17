package sg;

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
public class z1 extends View {
    public y1 f46377a;
    public int f46378b;
    public org.telegram.ui.web.b1 f46379c;
    public boolean d;
    public Paint f46380e;
    public LinearGradient f46381f;
    public Matrix h;

    public z1(Context context) {
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
        this.f46377a = new y1(i10);
        a();
    }

    public void a() {
        y1 y1Var = this.f46377a;
        y1Var.N = 100;
        y1Var.M = true;
        y1Var.G = true;
        y1Var.K = true;
        y1Var.H = true;
        y1Var.f46360r = 4;
        y1Var.f46364w = 0.98f;
        y1Var.v = 0.98f;
        y1Var.f46363u = 0.98f;
        y1Var.c();
    }

    public final void b() {
        Paint paint = new Paint(1);
        this.f46380e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(12.0f), new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f46381f = linearGradient;
        this.f46380e.setShader(linearGradient);
        this.h = new Matrix();
    }

    public int getStarsRectWidth() {
        return AndroidUtilities.dp(140.0f);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.web.b1 b1Var = new org.telegram.ui.web.b1(this, 9);
        this.f46379c = b1Var;
        LiteMode.addOnPowerSaverAppliedListener(b1Var);
        boolean isEnabled = LiteMode.isEnabled(131072);
        if (this.d != isEnabled) {
            this.d = isEnabled;
            invalidate();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.web.b1 b1Var = this.f46379c;
        if (b1Var != null) {
            LiteMode.removeOnPowerSaverAppliedListener(b1Var);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.d) {
            if (this.f46380e != null) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            this.f46377a.d(canvas2);
            if (this.f46380e != null) {
                canvas2.save();
                this.h.reset();
                this.h.postTranslate(0.0f, (getHeight() + 1) - AndroidUtilities.dp(12.0f));
                this.f46381f.setLocalMatrix(this.h);
                canvas2.drawRect(0.0f, getHeight() - AndroidUtilities.dp(12.0f), getWidth(), getHeight(), this.f46380e);
                this.h.reset();
                this.h.postRotate(180.0f);
                this.h.postTranslate(0.0f, AndroidUtilities.dp(12.0f));
                this.f46381f.setLocalMatrix(this.h);
                canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f), this.f46380e);
                canvas2.restore();
                canvas2.restore();
            }
            if (!this.f46377a.f46350g) {
                invalidate();
            }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        this.f46377a.f46345a.set(0.0f, 0.0f, getStarsRectWidth(), AndroidUtilities.dp(140.0f));
        this.f46377a.f46345a.offset((getMeasuredWidth() - this.f46377a.f46345a.width()) / 2.0f, (getMeasuredHeight() - this.f46377a.f46345a.height()) / 2.0f);
        this.f46377a.f46346b.set(-AndroidUtilities.dp(15.0f), -AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f) + getMeasuredWidth(), AndroidUtilities.dp(15.0f) + getMeasuredHeight());
        if (this.f46378b != measuredHeight) {
            this.f46378b = measuredHeight;
            this.f46377a.f();
        }
    }

    public void setPaused(boolean z10) {
        y1 y1Var = this.f46377a;
        if (z10 == y1Var.f46350g) {
            return;
        }
        y1Var.f46350g = z10;
        if (z10) {
            y1Var.Q = System.currentTimeMillis();
            return;
        }
        for (int i10 = 0; i10 < this.f46377a.f46356n.size(); i10++) {
            x1 x1Var = (x1) this.f46377a.f46356n.get(i10);
            x1Var.f46325a = (System.currentTimeMillis() - this.f46377a.Q) + x1Var.f46325a;
        }
        invalidate();
    }
}
