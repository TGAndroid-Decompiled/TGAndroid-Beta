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
import ei.i6;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Wallet.m4;
public class x1 extends View implements b6 {
    public w1 f46939a;
    public final m4 f46940b;
    public int f46941c;
    public ig.k0 d;
    public boolean e;
    public Paint f46942f;
    public LinearGradient h;
    public Matrix f46943n;

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
        this.f46940b = new m4(this, 8);
        this.e = true;
        this.f46939a = new w1(i10);
        a();
    }

    public void a() {
        w1 w1Var = this.f46939a;
        w1Var.O = 100;
        w1Var.M = true;
        w1Var.G = true;
        w1Var.K = true;
        w1Var.H = true;
        w1Var.f46924r = 4;
        w1Var.f46928w = 0.98f;
        w1Var.v = 0.98f;
        w1Var.f46927u = 0.98f;
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
        i6 i6Var = new i6(this, 24);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, f10);
        ofFloat.addUpdateListener(i6Var);
        ofFloat.setDuration(600L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, 1.0f);
        ofFloat2.addUpdateListener(i6Var);
        ofFloat2.setDuration(2000L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }

    public final void c() {
        Paint paint = new Paint(1);
        this.f46942f = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(12.0f), new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.h = linearGradient;
        this.f46942f.setShader(linearGradient);
        this.f46943n = new Matrix();
    }

    public int getStarsRectWidth() {
        return AndroidUtilities.dp(140.0f);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ig.k0 k0Var = new ig.k0(this, 18);
        this.d = k0Var;
        LiteMode.addOnPowerSaverAppliedListener(k0Var);
        boolean isEnabled = LiteMode.isEnabled(131072);
        if (this.e != isEnabled) {
            this.e = isEnabled;
            invalidate();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ig.k0 k0Var = this.d;
        if (k0Var != null) {
            LiteMode.removeOnPowerSaverAppliedListener(k0Var);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.e) {
            if (this.f46942f != null) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            this.f46939a.d(canvas2);
            if (this.f46942f != null) {
                canvas2.save();
                this.f46943n.reset();
                this.f46943n.postTranslate(0.0f, (getHeight() + 1) - AndroidUtilities.dp(12.0f));
                this.h.setLocalMatrix(this.f46943n);
                canvas2.drawRect(0.0f, getHeight() - AndroidUtilities.dp(12.0f), getWidth(), getHeight(), this.f46942f);
                this.f46943n.reset();
                this.f46943n.postRotate(180.0f);
                this.f46943n.postTranslate(0.0f, AndroidUtilities.dp(12.0f));
                this.h.setLocalMatrix(this.f46943n);
                canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f), this.f46942f);
                canvas2.restore();
                canvas2.restore();
            }
            if (!this.f46939a.f46914g) {
                invalidate();
            }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        this.f46939a.f46910a.set(0.0f, 0.0f, getStarsRectWidth(), AndroidUtilities.dp(140.0f));
        this.f46939a.f46910a.offset((getMeasuredWidth() - this.f46939a.f46910a.width()) / 2.0f, (getMeasuredHeight() - this.f46939a.f46910a.height()) / 2.0f);
        this.f46939a.f46911b.set(-AndroidUtilities.dp(15.0f), -AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f) + getMeasuredWidth(), AndroidUtilities.dp(15.0f) + getMeasuredHeight());
        if (this.f46941c != measuredHeight) {
            this.f46941c = measuredHeight;
            this.f46939a.f();
        }
    }

    public void setPaused(boolean z10) {
        w1 w1Var = this.f46939a;
        if (z10 == w1Var.f46914g) {
            return;
        }
        w1Var.f46914g = z10;
        if (z10) {
            w1Var.R = System.currentTimeMillis();
            return;
        }
        for (int i10 = 0; i10 < this.f46939a.f46920n.size(); i10++) {
            v1 v1Var = (v1) this.f46939a.f46920n.get(i10);
            v1Var.f46889a = (System.currentTimeMillis() - this.f46939a.R) + v1Var.f46889a;
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        m4 m4Var = this.f46940b;
        removeCallbacks(m4Var);
        postDelayed(m4Var, 150L);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
