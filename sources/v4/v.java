package v4;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import fi.d4;
public final class v implements Animator.AnimatorListener {
    public final int E;
    public final f1 F;
    public final z G;
    public final float f59233a;
    public final float f59234b;
    public final float f59235c;
    public final float d;
    public final f1 f59236e;
    public final int f59237f;
    public final ValueAnimator h;
    public boolean f59238n;
    public float f59239r;
    public float f59240s;
    public boolean f59241w = false;
    public boolean f59242x = false;
    public float f59243y;

    public v(z zVar, f1 f1Var, int i7, float f10, float f11, float f12, float f13, int i10, f1 f1Var2) {
        this.G = zVar;
        this.E = i10;
        this.F = f1Var2;
        this.f59237f = i7;
        this.f59236e = f1Var;
        this.f59233a = f10;
        this.f59234b = f11;
        this.f59235c = f12;
        this.d = f13;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new d4(this, 14));
        ofFloat.setTarget(f1Var.f59123a);
        ofFloat.addListener(this);
        this.f59243y = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f59242x) {
            this.f59236e.q(true);
        }
        this.f59242x = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f59243y = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.f59241w) {
            int i7 = this.E;
            f1 f1Var = this.F;
            z zVar = this.G;
            if (i7 <= 0) {
                zVar.f59270y.a(zVar.I, f1Var);
            } else {
                zVar.f59260a.add(f1Var.f59123a);
                this.f59238n = true;
                if (i7 > 0) {
                    zVar.I.post(new pb.l(zVar, this, i7));
                }
            }
            View view = zVar.N;
            View view2 = f1Var.f59123a;
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
