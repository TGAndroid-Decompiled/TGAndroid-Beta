package zf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.View;
import kh.i9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
public class w1 extends View {
    public v1 f50764a;
    public int f50765b;
    public i9 f50766c;
    public boolean d;
    public Paint f50767e;
    public LinearGradient f50768f;
    public Matrix h;

    public w1(Context context) {
        super(context);
        int i9;
        if (SharedConfig.getDevicePerformanceClass() == 2) {
            i9 = 200;
        } else if (SharedConfig.getDevicePerformanceClass() == 1) {
            i9 = 100;
        } else {
            i9 = 50;
        }
        this.d = true;
        this.f50764a = new v1(i9);
        a();
    }

    public void a() {
        v1 v1Var = this.f50764a;
        v1Var.N = 100;
        v1Var.M = true;
        v1Var.G = true;
        v1Var.K = true;
        v1Var.H = true;
        v1Var.f50748r = 4;
        v1Var.f50752w = 0.98f;
        v1Var.v = 0.98f;
        v1Var.f50751u = 0.98f;
        v1Var.c();
    }

    public final void b() {
        Paint paint = new Paint(1);
        this.f50767e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(12.0f), new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f50768f = linearGradient;
        this.f50767e.setShader(linearGradient);
        this.h = new Matrix();
    }

    public int getStarsRectWidth() {
        return AndroidUtilities.dp(140.0f);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        i9 i9Var = new i9(this, 26);
        this.f50766c = i9Var;
        LiteMode.addOnPowerSaverAppliedListener(i9Var);
        boolean isEnabled = LiteMode.isEnabled(131072);
        if (this.d != isEnabled) {
            this.d = isEnabled;
            invalidate();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i9 i9Var = this.f50766c;
        if (i9Var != null) {
            LiteMode.removeOnPowerSaverAppliedListener(i9Var);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.d) {
            if (this.f50767e != null) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            this.f50764a.d(canvas2);
            if (this.f50767e != null) {
                canvas2.save();
                this.h.reset();
                this.h.postTranslate(0.0f, (getHeight() + 1) - AndroidUtilities.dp(12.0f));
                this.f50768f.setLocalMatrix(this.h);
                canvas2.drawRect(0.0f, getHeight() - AndroidUtilities.dp(12.0f), getWidth(), getHeight(), this.f50767e);
                this.h.reset();
                this.h.postRotate(180.0f);
                this.h.postTranslate(0.0f, AndroidUtilities.dp(12.0f));
                this.f50768f.setLocalMatrix(this.h);
                canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f), this.f50767e);
                canvas2.restore();
                canvas2.restore();
            }
            if (!this.f50764a.f50738g) {
                invalidate();
            }
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        this.f50764a.f50733a.set(0.0f, 0.0f, getStarsRectWidth(), AndroidUtilities.dp(140.0f));
        this.f50764a.f50733a.offset((getMeasuredWidth() - this.f50764a.f50733a.width()) / 2.0f, (getMeasuredHeight() - this.f50764a.f50733a.height()) / 2.0f);
        this.f50764a.f50734b.set(-AndroidUtilities.dp(15.0f), -AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f) + getMeasuredWidth(), AndroidUtilities.dp(15.0f) + getMeasuredHeight());
        if (this.f50765b != measuredHeight) {
            this.f50765b = measuredHeight;
            this.f50764a.f();
        }
    }

    public void setPaused(boolean z10) {
        v1 v1Var = this.f50764a;
        if (z10 == v1Var.f50738g) {
            return;
        }
        v1Var.f50738g = z10;
        if (z10) {
            v1Var.Q = System.currentTimeMillis();
            return;
        }
        for (int i9 = 0; i9 < this.f50764a.f50744n.size(); i9++) {
            u1 u1Var = (u1) this.f50764a.f50744n.get(i9);
            u1Var.f50713a = (System.currentTimeMillis() - this.f50764a.Q) + u1Var.f50713a;
        }
        invalidate();
    }
}
