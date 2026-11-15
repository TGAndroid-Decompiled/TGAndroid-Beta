package ug;

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
import java.util.HashSet;
import org.telegram.messenger.gz;
import org.telegram.messenger.qc;
import org.telegram.ui.ActionBar.z5;
import tg.y1;
public class s1 extends View implements z5 {
    public r1 f58330a;
    public final s4.s0 f58331b;
    public int f58332c;
    public p1 d;
    public boolean f58333e;
    public Paint f58334f;
    public LinearGradient h;
    public Matrix f58335n;

    public s1(Context context) {
        super(context);
        int i7;
        if (gz.o() == 2) {
            i7 = 200;
        } else if (gz.o() == 1) {
            i7 = 100;
        } else {
            i7 = 50;
        }
        this.f58331b = new s4.s0(this, 6);
        this.f58333e = true;
        this.f58330a = new r1(i7);
        a();
    }

    public void a() {
        r1 r1Var = this.f58330a;
        r1Var.O = 100;
        r1Var.M = true;
        r1Var.G = true;
        r1Var.K = true;
        r1Var.H = true;
        r1Var.f58320r = 4;
        r1Var.f58324w = 0.98f;
        r1Var.v = 0.98f;
        r1Var.f58323u = 0.98f;
        r1Var.c();
    }

    public final void b(float f10) {
        float f11;
        if (f10 < 60.0f) {
            f11 = 5.0f;
        } else if (f10 < 180.0f) {
            f11 = 9.0f;
        } else {
            f11 = 15.0f;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        y1 y1Var = new y1(this, 4);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, f11);
        ofFloat.addUpdateListener(y1Var);
        ofFloat.setDuration(600L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, 1.0f);
        ofFloat2.addUpdateListener(y1Var);
        ofFloat2.setDuration(2000L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }

    public final void c() {
        Paint paint = new Paint(1);
        this.f58334f = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(12.0f), new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.h = linearGradient;
        this.f58334f.setShader(linearGradient);
        this.f58335n = new Matrix();
    }

    public int getStarsRectWidth() {
        return org.telegram.messenger.g0.L(140.0f);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        p1 p1Var = new p1(this, 0);
        this.d = p1Var;
        qc.a(p1Var);
        boolean e10 = qc.e(131072);
        if (this.f58333e != e10) {
            this.f58333e = e10;
            invalidate();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        HashSet hashSet;
        super.onDetachedFromWindow();
        p1 p1Var = this.d;
        if (p1Var != null && (hashSet = qc.f26077n) != null) {
            hashSet.remove(p1Var);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.f58333e) {
            if (this.f58334f != null) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            this.f58330a.d(canvas2);
            if (this.f58334f != null) {
                canvas2.save();
                this.f58335n.reset();
                this.f58335n.postTranslate(0.0f, (getHeight() + 1) - org.telegram.messenger.g0.L(12.0f));
                this.h.setLocalMatrix(this.f58335n);
                canvas2.drawRect(0.0f, getHeight() - org.telegram.messenger.g0.L(12.0f), getWidth(), getHeight(), this.f58334f);
                this.f58335n.reset();
                this.f58335n.postRotate(180.0f);
                this.f58335n.postTranslate(0.0f, org.telegram.messenger.g0.L(12.0f));
                this.h.setLocalMatrix(this.f58335n);
                canvas2.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.L(12.0f), this.f58334f);
                canvas2.restore();
                canvas2.restore();
            }
            if (!this.f58330a.f58310g) {
                invalidate();
            }
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        this.f58330a.f58305a.set(0.0f, 0.0f, getStarsRectWidth(), org.telegram.messenger.g0.L(140.0f));
        this.f58330a.f58305a.offset((getMeasuredWidth() - this.f58330a.f58305a.width()) / 2.0f, (getMeasuredHeight() - this.f58330a.f58305a.height()) / 2.0f);
        this.f58330a.f58306b.set(-org.telegram.messenger.g0.L(15.0f), -org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f) + getMeasuredWidth(), org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight());
        if (this.f58332c != measuredHeight) {
            this.f58332c = measuredHeight;
            this.f58330a.f();
        }
    }

    public void setPaused(boolean z10) {
        r1 r1Var = this.f58330a;
        if (z10 == r1Var.f58310g) {
            return;
        }
        r1Var.f58310g = z10;
        if (z10) {
            r1Var.R = System.currentTimeMillis();
            return;
        }
        for (int i7 = 0; i7 < this.f58330a.f58316n.size(); i7++) {
            q1 q1Var = (q1) this.f58330a.f58316n.get(i7);
            q1Var.f58274a = (System.currentTimeMillis() - this.f58330a.R) + q1Var.f58274a;
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        s4.s0 s0Var = this.f58331b;
        removeCallbacks(s0Var);
        postDelayed(s0Var, 150L);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
