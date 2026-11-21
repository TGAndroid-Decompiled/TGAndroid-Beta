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
import org.telegram.ui.ActionBar.b6;
import tg.z1;
public class t1 extends View implements b6 {
    public s1 f58954a;
    public final s4.s0 f58955b;
    public int f58956c;
    public z d;
    public boolean f58957e;
    public Paint f58958f;
    public LinearGradient h;
    public Matrix f58959n;

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
        this.f58955b = new s4.s0(this, 6);
        this.f58957e = true;
        this.f58954a = new s1(i7);
        a();
    }

    public void a() {
        s1 s1Var = this.f58954a;
        s1Var.O = 100;
        s1Var.M = true;
        s1Var.G = true;
        s1Var.K = true;
        s1Var.H = true;
        s1Var.f58942r = 4;
        s1Var.f58946w = 0.98f;
        s1Var.v = 0.98f;
        s1Var.f58945u = 0.98f;
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
        z1 z1Var = new z1(this, 4);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, f11);
        ofFloat.addUpdateListener(z1Var);
        ofFloat.setDuration(600L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, 1.0f);
        ofFloat2.addUpdateListener(z1Var);
        ofFloat2.setDuration(2000L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }

    public final void c() {
        Paint paint = new Paint(1);
        this.f58958f = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(12.0f), new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.h = linearGradient;
        this.f58958f.setShader(linearGradient);
        this.f58959n = new Matrix();
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
        if (this.f58957e != e10) {
            this.f58957e = e10;
            invalidate();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        HashSet hashSet;
        super.onDetachedFromWindow();
        z zVar = this.d;
        if (zVar != null && (hashSet = pc.f26252n) != null) {
            hashSet.remove(zVar);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.f58957e) {
            if (this.f58958f != null) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            this.f58954a.d(canvas2);
            if (this.f58958f != null) {
                canvas2.save();
                this.f58959n.reset();
                this.f58959n.postTranslate(0.0f, (getHeight() + 1) - org.telegram.messenger.g0.L(12.0f));
                this.h.setLocalMatrix(this.f58959n);
                canvas2.drawRect(0.0f, getHeight() - org.telegram.messenger.g0.L(12.0f), getWidth(), getHeight(), this.f58958f);
                this.f58959n.reset();
                this.f58959n.postRotate(180.0f);
                this.f58959n.postTranslate(0.0f, org.telegram.messenger.g0.L(12.0f));
                this.h.setLocalMatrix(this.f58959n);
                canvas2.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.L(12.0f), this.f58958f);
                canvas2.restore();
                canvas2.restore();
            }
            if (!this.f58954a.f58932g) {
                invalidate();
            }
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        this.f58954a.f58927a.set(0.0f, 0.0f, getStarsRectWidth(), org.telegram.messenger.g0.L(140.0f));
        this.f58954a.f58927a.offset((getMeasuredWidth() - this.f58954a.f58927a.width()) / 2.0f, (getMeasuredHeight() - this.f58954a.f58927a.height()) / 2.0f);
        this.f58954a.f58928b.set(-org.telegram.messenger.g0.L(15.0f), -org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f) + getMeasuredWidth(), org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight());
        if (this.f58956c != measuredHeight) {
            this.f58956c = measuredHeight;
            this.f58954a.f();
        }
    }

    public void setPaused(boolean z10) {
        s1 s1Var = this.f58954a;
        if (z10 == s1Var.f58932g) {
            return;
        }
        s1Var.f58932g = z10;
        if (z10) {
            s1Var.R = System.currentTimeMillis();
            return;
        }
        for (int i7 = 0; i7 < this.f58954a.f58938n.size(); i7++) {
            r1 r1Var = (r1) this.f58954a.f58938n.get(i7);
            r1Var.f58907a = (System.currentTimeMillis() - this.f58954a.R) + r1Var.f58907a;
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        s4.s0 s0Var = this.f58955b;
        removeCallbacks(s0Var);
        postDelayed(s0Var, 150L);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
