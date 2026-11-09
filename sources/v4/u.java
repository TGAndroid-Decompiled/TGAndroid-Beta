package v4;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import di.n4;
import org.telegram.ui.hx;
public final class u implements Animator.AnimatorListener {
    public final int D;
    public final d1 E;
    public final y F;
    public final float f57173a;
    public final float f57174b;
    public final float f57175c;
    public final float d;
    public final d1 f57176e;
    public final int f57177f;
    public final ValueAnimator h;
    public boolean f57178n;
    public float f57179r;
    public float f57180s;
    public boolean f57181w = false;
    public boolean f57182x = false;
    public float f57183y;

    public u(y yVar, d1 d1Var, int i7, float f10, float f11, float f12, float f13, int i10, d1 d1Var2) {
        this.F = yVar;
        this.D = i10;
        this.E = d1Var2;
        this.f57177f = i7;
        this.f57176e = d1Var;
        this.f57173a = f10;
        this.f57174b = f11;
        this.f57175c = f12;
        this.d = f13;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new n4(this, 14));
        ofFloat.setTarget(d1Var.f57056a);
        ofFloat.addListener(this);
        this.f57183y = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f57182x) {
            this.f57176e.q(true);
        }
        this.f57182x = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f57183y = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.f57181w) {
            int i7 = this.D;
            d1 d1Var = this.E;
            y yVar = this.F;
            if (i7 <= 0) {
                yVar.f57208y.a(yVar.H, d1Var);
            } else {
                yVar.f57198a.add(d1Var.f57056a);
                this.f57178n = true;
                if (i7 > 0) {
                    yVar.H.post(new hx(yVar, this, i7));
                }
            }
            View view = yVar.M;
            View view2 = d1Var.f57056a;
            if (view == view2) {
                yVar.q(view2);
            }
        }
    }

    @Override
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override
    public final void onAnimationStart(Animator animator) {
    }
}
