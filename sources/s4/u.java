package s4;

import ai.l6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
public final class u implements Animator.AnimatorListener {
    public final d1 E;
    public final z F;
    public final float f47875a;
    public final float f47876b;
    public final float f47877c;
    public final float d;
    public final d1 f47878e;
    public final int f47879f;
    public final ValueAnimator h;
    public boolean f47880n;
    public float f47881r;
    public float f47882s;
    public boolean v = false;
    public boolean f47883w = false;
    public float f47884x;
    public final int f47885y;

    public u(z zVar, d1 d1Var, int i10, float f7, float f10, float f11, float f12, int i11, d1 d1Var2) {
        this.F = zVar;
        this.f47885y = i11;
        this.E = d1Var2;
        this.f47879f = i10;
        this.f47878e = d1Var;
        this.f47875a = f7;
        this.f47876b = f10;
        this.f47877c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new l6(this, 13));
        ofFloat.setTarget(d1Var.f47748a);
        ofFloat.addListener(this);
        this.f47884x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f47883w) {
            this.f47878e.q(true);
        }
        this.f47883w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f47884x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.v) {
            int i10 = this.f47885y;
            d1 d1Var = this.E;
            z zVar = this.F;
            if (i10 <= 0) {
                zVar.f47915x.a(zVar.H, d1Var);
            } else {
                zVar.f47906a.add(d1Var.f47748a);
                this.f47880n = true;
                if (i10 > 0) {
                    zVar.H.post(new v(zVar, this, i10));
                }
            }
            View view = zVar.M;
            View view2 = d1Var.f47748a;
            if (view == view2) {
                zVar.o(view2);
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
