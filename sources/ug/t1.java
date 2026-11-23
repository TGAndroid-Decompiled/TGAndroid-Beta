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
import org.telegram.ui.Wallet.o5;
import tg.c2;
public class t1 extends View implements c6 {
    public s1 f59038a;
    public final o5 f59039b;
    public int f59040c;
    public z d;
    public boolean f59041e;
    public Paint f59042f;
    public LinearGradient h;
    public Matrix f59043n;

    public t1(Context context) {
        super(context);
        int i7;
        if (bz.o() == 2) {
            i7 = 200;
        } else if (bz.o() == 1) {
            i7 = 100;
        } else {
            i7 = 50;
        }
        this.f59039b = new o5(this, 10);
        this.f59041e = true;
        this.f59038a = new s1(i7);
        a();
    }

    public void a() {
        s1 s1Var = this.f59038a;
        s1Var.O = 100;
        s1Var.M = true;
        s1Var.G = true;
        s1Var.K = true;
        s1Var.H = true;
        s1Var.f59026r = 4;
        s1Var.f59030w = 0.98f;
        s1Var.v = 0.98f;
        s1Var.f59029u = 0.98f;
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
        c2 c2Var = new c2(this, 4);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, f11);
        ofFloat.addUpdateListener(c2Var);
        ofFloat.setDuration(600L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, 1.0f);
        ofFloat2.addUpdateListener(c2Var);
        ofFloat2.setDuration(2000L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }

    public final void c() {
        Paint paint = new Paint(1);
        this.f59042f = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(12.0f), new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.h = linearGradient;
        this.f59042f.setShader(linearGradient);
        this.f59043n = new Matrix();
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
        if (this.f59041e != e10) {
            this.f59041e = e10;
            invalidate();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        HashSet hashSet;
        super.onDetachedFromWindow();
        z zVar = this.d;
        if (zVar != null && (hashSet = pc.f26318n) != null) {
            hashSet.remove(zVar);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.f59041e) {
            if (this.f59042f != null) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            this.f59038a.d(canvas2);
            if (this.f59042f != null) {
                canvas2.save();
                this.f59043n.reset();
                this.f59043n.postTranslate(0.0f, (getHeight() + 1) - org.telegram.messenger.g0.L(12.0f));
                this.h.setLocalMatrix(this.f59043n);
                canvas2.drawRect(0.0f, getHeight() - org.telegram.messenger.g0.L(12.0f), getWidth(), getHeight(), this.f59042f);
                this.f59043n.reset();
                this.f59043n.postRotate(180.0f);
                this.f59043n.postTranslate(0.0f, org.telegram.messenger.g0.L(12.0f));
                this.h.setLocalMatrix(this.f59043n);
                canvas2.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.L(12.0f), this.f59042f);
                canvas2.restore();
                canvas2.restore();
            }
            if (!this.f59038a.f59016g) {
                invalidate();
            }
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        this.f59038a.f59011a.set(0.0f, 0.0f, getStarsRectWidth(), org.telegram.messenger.g0.L(140.0f));
        this.f59038a.f59011a.offset((getMeasuredWidth() - this.f59038a.f59011a.width()) / 2.0f, (getMeasuredHeight() - this.f59038a.f59011a.height()) / 2.0f);
        this.f59038a.f59012b.set(-org.telegram.messenger.g0.L(15.0f), -org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f) + getMeasuredWidth(), org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight());
        if (this.f59040c != measuredHeight) {
            this.f59040c = measuredHeight;
            this.f59038a.f();
        }
    }

    public void setPaused(boolean z10) {
        s1 s1Var = this.f59038a;
        if (z10 == s1Var.f59016g) {
            return;
        }
        s1Var.f59016g = z10;
        if (z10) {
            s1Var.R = System.currentTimeMillis();
            return;
        }
        for (int i7 = 0; i7 < this.f59038a.f59022n.size(); i7++) {
            r1 r1Var = (r1) this.f59038a.f59022n.get(i7);
            r1Var.f58991a = (System.currentTimeMillis() - this.f59038a.R) + r1Var.f58991a;
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        o5 o5Var = this.f59039b;
        removeCallbacks(o5Var);
        postDelayed(o5Var, 150L);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
