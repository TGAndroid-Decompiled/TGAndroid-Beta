package s4;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import bi.u5;
public final class u implements Animator.AnimatorListener {
    public final c1 E;
    public final y F;
    public final float f45870a;
    public final float f45871b;
    public final float f45872c;
    public final float d;
    public final c1 f45873e;
    public final int f45874f;
    public final ValueAnimator h;
    public boolean f45875n;
    public float f45876r;
    public float f45877s;
    public boolean v = false;
    public boolean f45878w = false;
    public float f45879x;
    public final int f45880y;

    public u(y yVar, c1 c1Var, int i10, float f7, float f10, float f11, float f12, int i11, c1 c1Var2) {
        this.F = yVar;
        this.f45880y = i11;
        this.E = c1Var2;
        this.f45874f = i10;
        this.f45873e = c1Var;
        this.f45870a = f7;
        this.f45871b = f10;
        this.f45872c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new u5(this, 11));
        ofFloat.setTarget(c1Var.f45738a);
        ofFloat.addListener(this);
        this.f45879x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f45878w) {
            this.f45873e.q(true);
        }
        this.f45878w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f45879x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.v) {
            int i10 = this.f45880y;
            c1 c1Var = this.E;
            y yVar = this.F;
            if (i10 <= 0) {
                yVar.f45904x.a(yVar.H, c1Var);
            } else {
                yVar.f45895a.add(c1Var.f45738a);
                this.f45875n = true;
                if (i10 > 0) {
                    yVar.H.post(new i9.s(yVar, this, i10));
                }
            }
            View view = yVar.M;
            View view2 = c1Var.f45738a;
            if (view == view2) {
                yVar.o(view2);
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
