package s4;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import di.u4;
public final class v implements Animator.AnimatorListener {
    public final e1 E;
    public final z F;
    public final float f47837a;
    public final float f47838b;
    public final float f47839c;
    public final float d;
    public final e1 e;
    public final int f47840f;
    public final ValueAnimator h;
    public boolean f47841n;
    public float f47842r;
    public float f47843s;
    public boolean v = false;
    public boolean f47844w = false;
    public float f47845x;
    public final int f47846y;

    public v(z zVar, e1 e1Var, int i10, float f7, float f10, float f11, float f12, int i11, e1 e1Var2) {
        this.F = zVar;
        this.f47846y = i11;
        this.E = e1Var2;
        this.f47840f = i10;
        this.e = e1Var;
        this.f47837a = f7;
        this.f47838b = f10;
        this.f47839c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new u4(this, 11));
        ofFloat.setTarget(e1Var.f47735a);
        ofFloat.addListener(this);
        this.f47845x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f47844w) {
            this.e.q(true);
        }
        this.f47844w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f47845x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.v) {
            int i10 = this.f47846y;
            e1 e1Var = this.E;
            z zVar = this.F;
            if (i10 <= 0) {
                zVar.f47866x.a(zVar.H, e1Var);
            } else {
                zVar.f47858a.add(e1Var.f47735a);
                this.f47841n = true;
                if (i10 > 0) {
                    zVar.H.post(new k9.u(zVar, this, i10));
                }
            }
            View view = zVar.M;
            View view2 = e1Var.f47735a;
            if (view == view2) {
                zVar.q(view2);
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
