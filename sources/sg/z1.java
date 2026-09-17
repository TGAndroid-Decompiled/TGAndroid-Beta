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
    public y1 f46405a;
    public int f46406b;
    public org.telegram.ui.web.b1 f46407c;
    public boolean d;
    public Paint f46408e;
    public LinearGradient f46409f;
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
        this.f46405a = new y1(i10);
        a();
    }

    public void a() {
        y1 y1Var = this.f46405a;
        y1Var.N = 100;
        y1Var.M = true;
        y1Var.G = true;
        y1Var.K = true;
        y1Var.H = true;
        y1Var.f46388r = 4;
        y1Var.f46392w = 0.98f;
        y1Var.v = 0.98f;
        y1Var.f46391u = 0.98f;
        y1Var.c();
    }

    public final void b() {
        Paint paint = new Paint(1);
        this.f46408e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(12.0f), new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f46409f = linearGradient;
        this.f46408e.setShader(linearGradient);
        this.h = new Matrix();
    }

    public int getStarsRectWidth() {
        return AndroidUtilities.dp(140.0f);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.web.b1 b1Var = new org.telegram.ui.web.b1(this, 9);
        this.f46407c = b1Var;
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
        org.telegram.ui.web.b1 b1Var = this.f46407c;
        if (b1Var != null) {
            LiteMode.removeOnPowerSaverAppliedListener(b1Var);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.d) {
            if (this.f46408e != null) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            this.f46405a.d(canvas2);
            if (this.f46408e != null) {
                canvas2.save();
                this.h.reset();
                this.h.postTranslate(0.0f, (getHeight() + 1) - AndroidUtilities.dp(12.0f));
                this.f46409f.setLocalMatrix(this.h);
                canvas2.drawRect(0.0f, getHeight() - AndroidUtilities.dp(12.0f), getWidth(), getHeight(), this.f46408e);
                this.h.reset();
                this.h.postRotate(180.0f);
                this.h.postTranslate(0.0f, AndroidUtilities.dp(12.0f));
                this.f46409f.setLocalMatrix(this.h);
                canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f), this.f46408e);
                canvas2.restore();
                canvas2.restore();
            }
            if (!this.f46405a.f46378g) {
                invalidate();
            }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        this.f46405a.f46373a.set(0.0f, 0.0f, getStarsRectWidth(), AndroidUtilities.dp(140.0f));
        this.f46405a.f46373a.offset((getMeasuredWidth() - this.f46405a.f46373a.width()) / 2.0f, (getMeasuredHeight() - this.f46405a.f46373a.height()) / 2.0f);
        this.f46405a.f46374b.set(-AndroidUtilities.dp(15.0f), -AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f) + getMeasuredWidth(), AndroidUtilities.dp(15.0f) + getMeasuredHeight());
        if (this.f46406b != measuredHeight) {
            this.f46406b = measuredHeight;
            this.f46405a.f();
        }
    }

    public void setPaused(boolean z10) {
        y1 y1Var = this.f46405a;
        if (z10 == y1Var.f46378g) {
            return;
        }
        y1Var.f46378g = z10;
        if (z10) {
            y1Var.Q = System.currentTimeMillis();
            return;
        }
        for (int i10 = 0; i10 < this.f46405a.f46384n.size(); i10++) {
            x1 x1Var = (x1) this.f46405a.f46384n.get(i10);
            x1Var.f46353a = (System.currentTimeMillis() - this.f46405a.Q) + x1Var.f46353a;
        }
        invalidate();
    }
}
