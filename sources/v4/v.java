package v4;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import fi.d4;
public final class v implements Animator.AnimatorListener {
    public final int E;
    public final f1 F;
    public final z G;
    public final float f59275a;
    public final float f59276b;
    public final float f59277c;
    public final float d;
    public final f1 f59278e;
    public final int f59279f;
    public final ValueAnimator h;
    public boolean f59280n;
    public float f59281r;
    public float f59282s;
    public boolean f59283w = false;
    public boolean f59284x = false;
    public float f59285y;

    public v(z zVar, f1 f1Var, int i7, float f10, float f11, float f12, float f13, int i10, f1 f1Var2) {
        this.G = zVar;
        this.E = i10;
        this.F = f1Var2;
        this.f59279f = i7;
        this.f59278e = f1Var;
        this.f59275a = f10;
        this.f59276b = f11;
        this.f59277c = f12;
        this.d = f13;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new d4(this, 14));
        ofFloat.setTarget(f1Var.f59165a);
        ofFloat.addListener(this);
        this.f59285y = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f59284x) {
            this.f59278e.q(true);
        }
        this.f59284x = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f59285y = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.f59283w) {
            int i7 = this.E;
            f1 f1Var = this.F;
            z zVar = this.G;
            if (i7 <= 0) {
                zVar.f59312y.a(zVar.I, f1Var);
            } else {
                zVar.f59302a.add(f1Var.f59165a);
                this.f59280n = true;
                if (i7 > 0) {
                    zVar.I.post(new pb.l(zVar, this, i7));
                }
            }
            View view = zVar.N;
            View view2 = f1Var.f59165a;
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
