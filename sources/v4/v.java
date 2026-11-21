package v4;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import fi.d4;
public final class v implements Animator.AnimatorListener {
    public final int E;
    public final f1 F;
    public final z G;
    public final float f59271a;
    public final float f59272b;
    public final float f59273c;
    public final float d;
    public final f1 f59274e;
    public final int f59275f;
    public final ValueAnimator h;
    public boolean f59276n;
    public float f59277r;
    public float f59278s;
    public boolean f59279w = false;
    public boolean f59280x = false;
    public float f59281y;

    public v(z zVar, f1 f1Var, int i7, float f10, float f11, float f12, float f13, int i10, f1 f1Var2) {
        this.G = zVar;
        this.E = i10;
        this.F = f1Var2;
        this.f59275f = i7;
        this.f59274e = f1Var;
        this.f59271a = f10;
        this.f59272b = f11;
        this.f59273c = f12;
        this.d = f13;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new d4(this, 14));
        ofFloat.setTarget(f1Var.f59161a);
        ofFloat.addListener(this);
        this.f59281y = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f59280x) {
            this.f59274e.q(true);
        }
        this.f59280x = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f59281y = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.f59279w) {
            int i7 = this.E;
            f1 f1Var = this.F;
            z zVar = this.G;
            if (i7 <= 0) {
                zVar.f59308y.a(zVar.I, f1Var);
            } else {
                zVar.f59298a.add(f1Var.f59161a);
                this.f59276n = true;
                if (i7 > 0) {
                    zVar.I.post(new pb.l(zVar, this, i7));
                }
            }
            View view = zVar.N;
            View view2 = f1Var.f59161a;
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
