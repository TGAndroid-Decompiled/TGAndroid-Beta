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
public class v1 extends View {
    public u1 f42522a;
    public int f42523b;
    public org.telegram.ui.web.b1 f42524c;
    public boolean d;
    public Paint e;
    public LinearGradient f42525f;
    public Matrix h;

    public v1(Context context) {
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
        this.f42522a = new u1(i10);
        a();
    }

    public void a() {
        u1 u1Var = this.f42522a;
        u1Var.N = 100;
        u1Var.M = true;
        u1Var.G = true;
        u1Var.K = true;
        u1Var.H = true;
        u1Var.f42510r = 4;
        u1Var.f42514w = 0.98f;
        u1Var.v = 0.98f;
        u1Var.f42513u = 0.98f;
        u1Var.c();
    }

    public final void b() {
        Paint paint = new Paint(1);
        this.e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(12.0f), new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f42525f = linearGradient;
        this.e.setShader(linearGradient);
        this.h = new Matrix();
    }

    public int getStarsRectWidth() {
        return AndroidUtilities.dp(140.0f);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.web.b1 b1Var = new org.telegram.ui.web.b1(this, 9);
        this.f42524c = b1Var;
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
        org.telegram.ui.web.b1 b1Var = this.f42524c;
        if (b1Var != null) {
            LiteMode.removeOnPowerSaverAppliedListener(b1Var);
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
            this.f42522a.d(canvas2);
            if (this.e != null) {
                canvas2.save();
                this.h.reset();
                this.h.postTranslate(0.0f, (getHeight() + 1) - AndroidUtilities.dp(12.0f));
                this.f42525f.setLocalMatrix(this.h);
                canvas2.drawRect(0.0f, getHeight() - AndroidUtilities.dp(12.0f), getWidth(), getHeight(), this.e);
                this.h.reset();
                this.h.postRotate(180.0f);
                this.h.postTranslate(0.0f, AndroidUtilities.dp(12.0f));
                this.f42525f.setLocalMatrix(this.h);
                canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f), this.e);
                canvas2.restore();
                canvas2.restore();
            }
            if (!this.f42522a.f42500g) {
                invalidate();
            }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        this.f42522a.f42496a.set(0.0f, 0.0f, getStarsRectWidth(), AndroidUtilities.dp(140.0f));
        this.f42522a.f42496a.offset((getMeasuredWidth() - this.f42522a.f42496a.width()) / 2.0f, (getMeasuredHeight() - this.f42522a.f42496a.height()) / 2.0f);
        this.f42522a.f42497b.set(-AndroidUtilities.dp(15.0f), -AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f) + getMeasuredWidth(), AndroidUtilities.dp(15.0f) + getMeasuredHeight());
        if (this.f42523b != measuredHeight) {
            this.f42523b = measuredHeight;
            this.f42522a.f();
        }
    }

    public void setPaused(boolean z10) {
        u1 u1Var = this.f42522a;
        if (z10 == u1Var.f42500g) {
            return;
        }
        u1Var.f42500g = z10;
        if (z10) {
            u1Var.Q = System.currentTimeMillis();
            return;
        }
        for (int i10 = 0; i10 < this.f42522a.f42506n.size(); i10++) {
            t1 t1Var = (t1) this.f42522a.f42506n.get(i10);
            t1Var.f42475a = (System.currentTimeMillis() - this.f42522a.Q) + t1Var.f42475a;
        }
        invalidate();
    }
}
