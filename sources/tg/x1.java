package tg;

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
import fi.e4;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.dy0;
public class x1 extends View implements p6 {
    public w1 f49154a;
    public final dy0 f49155b;
    public int f49156c;
    public ig.o d;
    public boolean e;
    public Paint f49157f;
    public LinearGradient h;
    public Matrix f49158n;

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
        this.f49155b = new dy0(this, 14);
        this.e = true;
        this.f49154a = new w1(i10);
        a();
    }

    public void a() {
        w1 w1Var = this.f49154a;
        w1Var.O = 100;
        w1Var.M = true;
        w1Var.G = true;
        w1Var.K = true;
        w1Var.H = true;
        w1Var.f49139r = 4;
        w1Var.f49143w = 0.98f;
        w1Var.v = 0.98f;
        w1Var.f49142u = 0.98f;
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
        e4 e4Var = new e4(this, 27);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, f10);
        ofFloat.addUpdateListener(e4Var);
        ofFloat.setDuration(600L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, 1.0f);
        ofFloat2.addUpdateListener(e4Var);
        ofFloat2.setDuration(2000L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }

    public final void c() {
        Paint paint = new Paint(1);
        this.f49157f = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(12.0f), new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.h = linearGradient;
        this.f49157f.setShader(linearGradient);
        this.f49158n = new Matrix();
    }

    public int getStarsRectWidth() {
        return AndroidUtilities.dp(140.0f);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ig.o oVar = new ig.o(this, 22);
        this.d = oVar;
        LiteMode.addOnPowerSaverAppliedListener(oVar);
        boolean isEnabled = LiteMode.isEnabled(131072);
        if (this.e != isEnabled) {
            this.e = isEnabled;
            invalidate();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ig.o oVar = this.d;
        if (oVar != null) {
            LiteMode.removeOnPowerSaverAppliedListener(oVar);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.e) {
            if (this.f49157f != null) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            this.f49154a.d(canvas2);
            if (this.f49157f != null) {
                canvas2.save();
                this.f49158n.reset();
                this.f49158n.postTranslate(0.0f, (getHeight() + 1) - AndroidUtilities.dp(12.0f));
                this.h.setLocalMatrix(this.f49158n);
                canvas2.drawRect(0.0f, getHeight() - AndroidUtilities.dp(12.0f), getWidth(), getHeight(), this.f49157f);
                this.f49158n.reset();
                this.f49158n.postRotate(180.0f);
                this.f49158n.postTranslate(0.0f, AndroidUtilities.dp(12.0f));
                this.h.setLocalMatrix(this.f49158n);
                canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f), this.f49157f);
                canvas2.restore();
                canvas2.restore();
            }
            if (!this.f49154a.f49129g) {
                invalidate();
            }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        this.f49154a.f49125a.set(0.0f, 0.0f, getStarsRectWidth(), AndroidUtilities.dp(140.0f));
        this.f49154a.f49125a.offset((getMeasuredWidth() - this.f49154a.f49125a.width()) / 2.0f, (getMeasuredHeight() - this.f49154a.f49125a.height()) / 2.0f);
        this.f49154a.f49126b.set(-AndroidUtilities.dp(15.0f), -AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f) + getMeasuredWidth(), AndroidUtilities.dp(15.0f) + getMeasuredHeight());
        if (this.f49156c != measuredHeight) {
            this.f49156c = measuredHeight;
            this.f49154a.f();
        }
    }

    public void setPaused(boolean z10) {
        w1 w1Var = this.f49154a;
        if (z10 == w1Var.f49129g) {
            return;
        }
        w1Var.f49129g = z10;
        if (z10) {
            w1Var.R = System.currentTimeMillis();
            return;
        }
        for (int i10 = 0; i10 < this.f49154a.f49135n.size(); i10++) {
            v1 v1Var = (v1) this.f49154a.f49135n.get(i10);
            v1Var.f49104a = (System.currentTimeMillis() - this.f49154a.R) + v1Var.f49104a;
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        dy0 dy0Var = this.f49155b;
        removeCallbacks(dy0Var);
        postDelayed(dy0Var, 150L);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
