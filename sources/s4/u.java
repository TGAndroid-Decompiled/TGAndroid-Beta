package s4;

import ai.l6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
public final class u implements Animator.AnimatorListener {
    public final d1 E;
    public final z F;
    public final float f47829a;
    public final float f47830b;
    public final float f47831c;
    public final float d;
    public final d1 f47832e;
    public final int f47833f;
    public final ValueAnimator h;
    public boolean f47834n;
    public float f47835r;
    public float f47836s;
    public boolean v = false;
    public boolean f47837w = false;
    public float f47838x;
    public final int f47839y;

    public u(z zVar, d1 d1Var, int i10, float f7, float f10, float f11, float f12, int i11, d1 d1Var2) {
        this.F = zVar;
        this.f47839y = i11;
        this.E = d1Var2;
        this.f47833f = i10;
        this.f47832e = d1Var;
        this.f47829a = f7;
        this.f47830b = f10;
        this.f47831c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new l6(this, 13));
        ofFloat.setTarget(d1Var.f47702a);
        ofFloat.addListener(this);
        this.f47838x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f47837w) {
            this.f47832e.q(true);
        }
        this.f47837w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f47838x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.v) {
            int i10 = this.f47839y;
            d1 d1Var = this.E;
            z zVar = this.F;
            if (i10 <= 0) {
                zVar.f47869x.a(zVar.H, d1Var);
            } else {
                zVar.f47860a.add(d1Var.f47702a);
                this.f47834n = true;
                if (i10 > 0) {
                    zVar.H.post(new v(zVar, this, i10));
                }
            }
            View view = zVar.M;
            View view2 = d1Var.f47702a;
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
