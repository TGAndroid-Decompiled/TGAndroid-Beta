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
    public u1 f42473a;
    public int f42474b;
    public ii.q1 f42475c;
    public boolean d;
    public Paint e;
    public LinearGradient f42476f;
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
        this.f42473a = new u1(i10);
        a();
    }

    public void a() {
        u1 u1Var = this.f42473a;
        u1Var.N = 100;
        u1Var.M = true;
        u1Var.G = true;
        u1Var.K = true;
        u1Var.H = true;
        u1Var.f42461r = 4;
        u1Var.f42465w = 0.98f;
        u1Var.v = 0.98f;
        u1Var.f42464u = 0.98f;
        u1Var.c();
    }

    public final void b() {
        Paint paint = new Paint(1);
        this.e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(12.0f), new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f42476f = linearGradient;
        this.e.setShader(linearGradient);
        this.h = new Matrix();
    }

    public int getStarsRectWidth() {
        return AndroidUtilities.dp(140.0f);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ii.q1 q1Var = new ii.q1(this, 12);
        this.f42475c = q1Var;
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
        ii.q1 q1Var = this.f42475c;
        if (q1Var != null) {
            LiteMode.removeOnPowerSaverAppliedListener(q1Var);
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
            this.f42473a.d(canvas2);
            if (this.e != null) {
                canvas2.save();
                this.h.reset();
                this.h.postTranslate(0.0f, (getHeight() + 1) - AndroidUtilities.dp(12.0f));
                this.f42476f.setLocalMatrix(this.h);
                canvas2.drawRect(0.0f, getHeight() - AndroidUtilities.dp(12.0f), getWidth(), getHeight(), this.e);
                this.h.reset();
                this.h.postRotate(180.0f);
                this.h.postTranslate(0.0f, AndroidUtilities.dp(12.0f));
                this.f42476f.setLocalMatrix(this.h);
                canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f), this.e);
                canvas2.restore();
                canvas2.restore();
            }
            if (!this.f42473a.f42451g) {
                invalidate();
            }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        this.f42473a.f42447a.set(0.0f, 0.0f, getStarsRectWidth(), AndroidUtilities.dp(140.0f));
        this.f42473a.f42447a.offset((getMeasuredWidth() - this.f42473a.f42447a.width()) / 2.0f, (getMeasuredHeight() - this.f42473a.f42447a.height()) / 2.0f);
        this.f42473a.f42448b.set(-AndroidUtilities.dp(15.0f), -AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f) + getMeasuredWidth(), AndroidUtilities.dp(15.0f) + getMeasuredHeight());
        if (this.f42474b != measuredHeight) {
            this.f42474b = measuredHeight;
            this.f42473a.f();
        }
    }

    public void setPaused(boolean z10) {
        u1 u1Var = this.f42473a;
        if (z10 == u1Var.f42451g) {
            return;
        }
        u1Var.f42451g = z10;
        if (z10) {
            u1Var.Q = System.currentTimeMillis();
            return;
        }
        for (int i10 = 0; i10 < this.f42473a.f42457n.size(); i10++) {
            t1 t1Var = (t1) this.f42473a.f42457n.get(i10);
            t1Var.f42426a = (System.currentTimeMillis() - this.f42473a.Q) + t1Var.f42426a;
        }
        invalidate();
    }
}
