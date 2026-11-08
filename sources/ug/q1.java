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
import org.telegram.messenger.iz;
import org.telegram.messenger.sc;
import org.telegram.ui.ActionBar.a6;
public class q1 extends View implements a6 {
    public p1 f56793a;
    public final tg.y f56794b;
    public int f56795c;
    public ii.c d;
    public boolean f56796e;
    public Paint f56797f;
    public LinearGradient h;
    public Matrix f56798n;

    public q1(Context context) {
        super(context);
        int i7;
        if (iz.o() == 2) {
            i7 = 200;
        } else if (iz.o() == 1) {
            i7 = 100;
        } else {
            i7 = 50;
        }
        this.f56794b = new tg.y(this, 3);
        this.f56796e = true;
        this.f56793a = new p1(i7);
        a();
    }

    public void a() {
        p1 p1Var = this.f56793a;
        p1Var.O = 100;
        p1Var.M = true;
        p1Var.G = true;
        p1Var.K = true;
        p1Var.H = true;
        p1Var.f56778r = 4;
        p1Var.f56782w = 0.98f;
        p1Var.v = 0.98f;
        p1Var.f56781u = 0.98f;
        p1Var.c();
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
        ti.d dVar = new ti.d(this, 3);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, f11);
        ofFloat.addUpdateListener(dVar);
        ofFloat.setDuration(600L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, 1.0f);
        ofFloat2.addUpdateListener(dVar);
        ofFloat2.setDuration(2000L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }

    public final void c() {
        Paint paint = new Paint(1);
        this.f56797f = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(12.0f), new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.h = linearGradient;
        this.f56797f.setShader(linearGradient);
        this.f56798n = new Matrix();
    }

    public int getStarsRectWidth() {
        return org.telegram.messenger.g0.L(140.0f);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ii.c cVar = new ii.c(this, 25);
        this.d = cVar;
        sc.a(cVar);
        boolean e10 = sc.e(131072);
        if (this.f56796e != e10) {
            this.f56796e = e10;
            invalidate();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        HashSet hashSet;
        super.onDetachedFromWindow();
        ii.c cVar = this.d;
        if (cVar != null && (hashSet = sc.f25454n) != null) {
            hashSet.remove(cVar);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.f56796e) {
            if (this.f56797f != null) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            this.f56793a.d(canvas2);
            if (this.f56797f != null) {
                canvas2.save();
                this.f56798n.reset();
                this.f56798n.postTranslate(0.0f, (getHeight() + 1) - org.telegram.messenger.g0.L(12.0f));
                this.h.setLocalMatrix(this.f56798n);
                canvas2.drawRect(0.0f, getHeight() - org.telegram.messenger.g0.L(12.0f), getWidth(), getHeight(), this.f56797f);
                this.f56798n.reset();
                this.f56798n.postRotate(180.0f);
                this.f56798n.postTranslate(0.0f, org.telegram.messenger.g0.L(12.0f));
                this.h.setLocalMatrix(this.f56798n);
                canvas2.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.L(12.0f), this.f56797f);
                canvas2.restore();
                canvas2.restore();
            }
            if (!this.f56793a.f56768g) {
                invalidate();
            }
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        this.f56793a.f56763a.set(0.0f, 0.0f, getStarsRectWidth(), org.telegram.messenger.g0.L(140.0f));
        this.f56793a.f56763a.offset((getMeasuredWidth() - this.f56793a.f56763a.width()) / 2.0f, (getMeasuredHeight() - this.f56793a.f56763a.height()) / 2.0f);
        this.f56793a.f56764b.set(-org.telegram.messenger.g0.L(15.0f), -org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f) + getMeasuredWidth(), org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight());
        if (this.f56795c != measuredHeight) {
            this.f56795c = measuredHeight;
            this.f56793a.f();
        }
    }

    public void setPaused(boolean z9) {
        p1 p1Var = this.f56793a;
        if (z9 == p1Var.f56768g) {
            return;
        }
        p1Var.f56768g = z9;
        if (z9) {
            p1Var.R = System.currentTimeMillis();
            return;
        }
        for (int i7 = 0; i7 < this.f56793a.f56774n.size(); i7++) {
            o1 o1Var = (o1) this.f56793a.f56774n.get(i7);
            o1Var.f56731a = (System.currentTimeMillis() - this.f56793a.R) + o1Var.f56731a;
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        tg.y yVar = this.f56794b;
        removeCallbacks(yVar);
        postDelayed(yVar, 150L);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
