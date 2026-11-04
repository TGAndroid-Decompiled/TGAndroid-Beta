package vg;

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
import gi.j8;
import java.util.HashSet;
import org.telegram.messenger.az;
import org.telegram.messenger.lc;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.lt;
import ug.f2;
public class t1 extends View implements z5 {
    public s1 f56857a;
    public final lt f56858b;
    public int f56859c;
    public j8 d;
    public boolean f56860e;
    public Paint f56861f;
    public LinearGradient h;
    public Matrix f56862n;

    public t1(Context context) {
        super(context);
        int i3;
        if (az.o() == 2) {
            i3 = 200;
        } else if (az.o() == 1) {
            i3 = 100;
        } else {
            i3 = 50;
        }
        this.f56858b = new lt(this, 29);
        this.f56860e = true;
        this.f56857a = new s1(i3);
        a();
    }

    public void a() {
        s1 s1Var = this.f56857a;
        s1Var.O = 100;
        s1Var.M = true;
        s1Var.G = true;
        s1Var.K = true;
        s1Var.H = true;
        s1Var.f56844r = 4;
        s1Var.f56848w = 0.98f;
        s1Var.v = 0.98f;
        s1Var.f56847u = 0.98f;
        s1Var.c();
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
        f2 f2Var = new f2(this, 3);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, f11);
        ofFloat.addUpdateListener(f2Var);
        ofFloat.setDuration(600L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, 1.0f);
        ofFloat2.addUpdateListener(f2Var);
        ofFloat2.setDuration(2000L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }

    public final void c() {
        Paint paint = new Paint(1);
        this.f56861f = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(12.0f), new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.h = linearGradient;
        this.f56861f.setShader(linearGradient);
        this.f56862n = new Matrix();
    }

    public int getStarsRectWidth() {
        return org.telegram.messenger.g0.L(140.0f);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        j8 j8Var = new j8(this, 28);
        this.d = j8Var;
        lc.a(j8Var);
        boolean e10 = lc.e(131072);
        if (this.f56860e != e10) {
            this.f56860e = e10;
            invalidate();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        HashSet hashSet;
        super.onDetachedFromWindow();
        j8 j8Var = this.d;
        if (j8Var != null && (hashSet = lc.f23973n) != null) {
            hashSet.remove(j8Var);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.f56860e) {
            if (this.f56861f != null) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            this.f56857a.d(canvas2);
            if (this.f56861f != null) {
                canvas2.save();
                this.f56862n.reset();
                this.f56862n.postTranslate(0.0f, (getHeight() + 1) - org.telegram.messenger.g0.L(12.0f));
                this.h.setLocalMatrix(this.f56862n);
                canvas2.drawRect(0.0f, getHeight() - org.telegram.messenger.g0.L(12.0f), getWidth(), getHeight(), this.f56861f);
                this.f56862n.reset();
                this.f56862n.postRotate(180.0f);
                this.f56862n.postTranslate(0.0f, org.telegram.messenger.g0.L(12.0f));
                this.h.setLocalMatrix(this.f56862n);
                canvas2.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.L(12.0f), this.f56861f);
                canvas2.restore();
                canvas2.restore();
            }
            if (!this.f56857a.f56834g) {
                invalidate();
            }
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        this.f56857a.f56829a.set(0.0f, 0.0f, getStarsRectWidth(), org.telegram.messenger.g0.L(140.0f));
        this.f56857a.f56829a.offset((getMeasuredWidth() - this.f56857a.f56829a.width()) / 2.0f, (getMeasuredHeight() - this.f56857a.f56829a.height()) / 2.0f);
        this.f56857a.f56830b.set(-org.telegram.messenger.g0.L(15.0f), -org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f) + getMeasuredWidth(), org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight());
        if (this.f56859c != measuredHeight) {
            this.f56859c = measuredHeight;
            this.f56857a.f();
        }
    }

    public void setPaused(boolean z10) {
        s1 s1Var = this.f56857a;
        if (z10 == s1Var.f56834g) {
            return;
        }
        s1Var.f56834g = z10;
        if (z10) {
            s1Var.R = System.currentTimeMillis();
            return;
        }
        for (int i3 = 0; i3 < this.f56857a.f56840n.size(); i3++) {
            r1 r1Var = (r1) this.f56857a.f56840n.get(i3);
            r1Var.f56810a = (System.currentTimeMillis() - this.f56857a.R) + r1Var.f56810a;
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        lt ltVar = this.f56858b;
        removeCallbacks(ltVar);
        postDelayed(ltVar, 150L);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
