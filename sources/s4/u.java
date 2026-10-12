package s4;

import ai.l6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
public final class u implements Animator.AnimatorListener {
    public final d1 E;
    public final z F;
    public final float f48024a;
    public final float f48025b;
    public final float f48026c;
    public final float d;
    public final d1 f48027e;
    public final int f48028f;
    public final ValueAnimator h;
    public boolean f48029n;
    public float f48030r;
    public float f48031s;
    public boolean v = false;
    public boolean f48032w = false;
    public float f48033x;
    public final int f48034y;

    public u(z zVar, d1 d1Var, int i10, float f7, float f10, float f11, float f12, int i11, d1 d1Var2) {
        this.F = zVar;
        this.f48034y = i11;
        this.E = d1Var2;
        this.f48028f = i10;
        this.f48027e = d1Var;
        this.f48024a = f7;
        this.f48025b = f10;
        this.f48026c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new l6(this, 13));
        ofFloat.setTarget(d1Var.f47897a);
        ofFloat.addListener(this);
        this.f48033x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f48032w) {
            this.f48027e.q(true);
        }
        this.f48032w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f48033x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.v) {
            int i10 = this.f48034y;
            d1 d1Var = this.E;
            z zVar = this.F;
            if (i10 <= 0) {
                zVar.f48064x.a(zVar.H, d1Var);
            } else {
                zVar.f48055a.add(d1Var.f47897a);
                this.f48029n = true;
                if (i10 > 0) {
                    zVar.H.post(new v(zVar, this, i10));
                }
            }
            View view = zVar.M;
            View view2 = d1Var.f47897a;
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
