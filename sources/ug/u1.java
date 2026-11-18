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
import org.telegram.messenger.bz;
import org.telegram.messenger.pc;
import org.telegram.ui.ActionBar.c6;
public class u1 extends View implements c6 {
    public t1 f58919a;
    public final s4.s0 f58920b;
    public int f58921c;
    public z d;
    public boolean f58922e;
    public Paint f58923f;
    public LinearGradient h;
    public Matrix f58924n;

    public u1(Context context) {
        super(context);
        int i7;
        if (bz.o() == 2) {
            i7 = 200;
        } else if (bz.o() == 1) {
            i7 = 100;
        } else {
            i7 = 50;
        }
        this.f58920b = new s4.s0(this, 6);
        this.f58922e = true;
        this.f58919a = new t1(i7);
        a();
    }

    public void a() {
        t1 t1Var = this.f58919a;
        t1Var.O = 100;
        t1Var.M = true;
        t1Var.G = true;
        t1Var.K = true;
        t1Var.H = true;
        t1Var.f58907r = 4;
        t1Var.f58911w = 0.98f;
        t1Var.v = 0.98f;
        t1Var.f58910u = 0.98f;
        t1Var.c();
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
        tg.x1 x1Var = new tg.x1(this, 4);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, f11);
        ofFloat.addUpdateListener(x1Var);
        ofFloat.setDuration(600L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, 1.0f);
        ofFloat2.addUpdateListener(x1Var);
        ofFloat2.setDuration(2000L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }

    public final void c() {
        Paint paint = new Paint(1);
        this.f58923f = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(12.0f), new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.h = linearGradient;
        this.f58923f.setShader(linearGradient);
        this.f58924n = new Matrix();
    }

    public int getStarsRectWidth() {
        return org.telegram.messenger.g0.L(140.0f);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        z zVar = new z(this, 1);
        this.d = zVar;
        pc.a(zVar);
        boolean e10 = pc.e(131072);
        if (this.f58922e != e10) {
            this.f58922e = e10;
            invalidate();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        HashSet hashSet;
        super.onDetachedFromWindow();
        z zVar = this.d;
        if (zVar != null && (hashSet = pc.f26226n) != null) {
            hashSet.remove(zVar);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.f58922e) {
            if (this.f58923f != null) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            this.f58919a.d(canvas2);
            if (this.f58923f != null) {
                canvas2.save();
                this.f58924n.reset();
                this.f58924n.postTranslate(0.0f, (getHeight() + 1) - org.telegram.messenger.g0.L(12.0f));
                this.h.setLocalMatrix(this.f58924n);
                canvas2.drawRect(0.0f, getHeight() - org.telegram.messenger.g0.L(12.0f), getWidth(), getHeight(), this.f58923f);
                this.f58924n.reset();
                this.f58924n.postRotate(180.0f);
                this.f58924n.postTranslate(0.0f, org.telegram.messenger.g0.L(12.0f));
                this.h.setLocalMatrix(this.f58924n);
                canvas2.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.L(12.0f), this.f58923f);
                canvas2.restore();
                canvas2.restore();
            }
            if (!this.f58919a.f58897g) {
                invalidate();
            }
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        this.f58919a.f58892a.set(0.0f, 0.0f, getStarsRectWidth(), org.telegram.messenger.g0.L(140.0f));
        this.f58919a.f58892a.offset((getMeasuredWidth() - this.f58919a.f58892a.width()) / 2.0f, (getMeasuredHeight() - this.f58919a.f58892a.height()) / 2.0f);
        this.f58919a.f58893b.set(-org.telegram.messenger.g0.L(15.0f), -org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f) + getMeasuredWidth(), org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight());
        if (this.f58921c != measuredHeight) {
            this.f58921c = measuredHeight;
            this.f58919a.f();
        }
    }

    public void setPaused(boolean z10) {
        t1 t1Var = this.f58919a;
        if (z10 == t1Var.f58897g) {
            return;
        }
        t1Var.f58897g = z10;
        if (z10) {
            t1Var.R = System.currentTimeMillis();
            return;
        }
        for (int i7 = 0; i7 < this.f58919a.f58903n.size(); i7++) {
            s1 s1Var = (s1) this.f58919a.f58903n.get(i7);
            s1Var.f58870a = (System.currentTimeMillis() - this.f58919a.R) + s1Var.f58870a;
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        s4.s0 s0Var = this.f58920b;
        removeCallbacks(s0Var);
        postDelayed(s0Var, 150L);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
