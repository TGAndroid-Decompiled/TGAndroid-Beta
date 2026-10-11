package s4;

import ai.l6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
public final class u implements Animator.AnimatorListener {
    public final d1 E;
    public final z F;
    public final float f47909a;
    public final float f47910b;
    public final float f47911c;
    public final float d;
    public final d1 f47912e;
    public final int f47913f;
    public final ValueAnimator h;
    public boolean f47914n;
    public float f47915r;
    public float f47916s;
    public boolean v = false;
    public boolean f47917w = false;
    public float f47918x;
    public final int f47919y;

    public u(z zVar, d1 d1Var, int i10, float f7, float f10, float f11, float f12, int i11, d1 d1Var2) {
        this.F = zVar;
        this.f47919y = i11;
        this.E = d1Var2;
        this.f47913f = i10;
        this.f47912e = d1Var;
        this.f47909a = f7;
        this.f47910b = f10;
        this.f47911c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new l6(this, 13));
        ofFloat.setTarget(d1Var.f47782a);
        ofFloat.addListener(this);
        this.f47918x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f47917w) {
            this.f47912e.q(true);
        }
        this.f47917w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f47918x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.v) {
            int i10 = this.f47919y;
            d1 d1Var = this.E;
            z zVar = this.F;
            if (i10 <= 0) {
                zVar.f47949x.a(zVar.H, d1Var);
            } else {
                zVar.f47940a.add(d1Var.f47782a);
                this.f47914n = true;
                if (i10 > 0) {
                    zVar.H.post(new v(zVar, this, i10));
                }
            }
            View view = zVar.M;
            View view2 = d1Var.f47782a;
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
