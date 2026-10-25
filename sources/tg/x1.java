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
import org.telegram.ui.Components.cy0;
public class x1 extends View implements p6 {
    public w1 f49116a;
    public final cy0 f49117b;
    public int f49118c;
    public ig.o d;
    public boolean e;
    public Paint f49119f;
    public LinearGradient h;
    public Matrix f49120n;

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
        this.f49117b = new cy0(this, 14);
        this.e = true;
        this.f49116a = new w1(i10);
        a();
    }

    public void a() {
        w1 w1Var = this.f49116a;
        w1Var.O = 100;
        w1Var.M = true;
        w1Var.G = true;
        w1Var.K = true;
        w1Var.H = true;
        w1Var.f49101r = 4;
        w1Var.f49105w = 0.98f;
        w1Var.v = 0.98f;
        w1Var.f49104u = 0.98f;
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
        this.f49119f = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(12.0f), new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.h = linearGradient;
        this.f49119f.setShader(linearGradient);
        this.f49120n = new Matrix();
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
            if (this.f49119f != null) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            this.f49116a.d(canvas2);
            if (this.f49119f != null) {
                canvas2.save();
                this.f49120n.reset();
                this.f49120n.postTranslate(0.0f, (getHeight() + 1) - AndroidUtilities.dp(12.0f));
                this.h.setLocalMatrix(this.f49120n);
                canvas2.drawRect(0.0f, getHeight() - AndroidUtilities.dp(12.0f), getWidth(), getHeight(), this.f49119f);
                this.f49120n.reset();
                this.f49120n.postRotate(180.0f);
                this.f49120n.postTranslate(0.0f, AndroidUtilities.dp(12.0f));
                this.h.setLocalMatrix(this.f49120n);
                canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f), this.f49119f);
                canvas2.restore();
                canvas2.restore();
            }
            if (!this.f49116a.f49091g) {
                invalidate();
            }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        this.f49116a.f49087a.set(0.0f, 0.0f, getStarsRectWidth(), AndroidUtilities.dp(140.0f));
        this.f49116a.f49087a.offset((getMeasuredWidth() - this.f49116a.f49087a.width()) / 2.0f, (getMeasuredHeight() - this.f49116a.f49087a.height()) / 2.0f);
        this.f49116a.f49088b.set(-AndroidUtilities.dp(15.0f), -AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f) + getMeasuredWidth(), AndroidUtilities.dp(15.0f) + getMeasuredHeight());
        if (this.f49118c != measuredHeight) {
            this.f49118c = measuredHeight;
            this.f49116a.f();
        }
    }

    public void setPaused(boolean z10) {
        w1 w1Var = this.f49116a;
        if (z10 == w1Var.f49091g) {
            return;
        }
        w1Var.f49091g = z10;
        if (z10) {
            w1Var.R = System.currentTimeMillis();
            return;
        }
        for (int i10 = 0; i10 < this.f49116a.f49097n.size(); i10++) {
            v1 v1Var = (v1) this.f49116a.f49097n.get(i10);
            v1Var.f49066a = (System.currentTimeMillis() - this.f49116a.R) + v1Var.f49066a;
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        cy0 cy0Var = this.f49117b;
        removeCallbacks(cy0Var);
        postDelayed(cy0Var, 150L);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
