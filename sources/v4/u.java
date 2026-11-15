package v4;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import fi.f4;
public final class u implements Animator.AnimatorListener {
    public final int E;
    public final e1 F;
    public final y G;
    public final float f58647a;
    public final float f58648b;
    public final float f58649c;
    public final float d;
    public final e1 f58650e;
    public final int f58651f;
    public final ValueAnimator h;
    public boolean f58652n;
    public float f58653r;
    public float f58654s;
    public boolean f58655w = false;
    public boolean f58656x = false;
    public float f58657y;

    public u(y yVar, e1 e1Var, int i7, float f10, float f11, float f12, float f13, int i10, e1 e1Var2) {
        this.G = yVar;
        this.E = i10;
        this.F = e1Var2;
        this.f58651f = i7;
        this.f58650e = e1Var;
        this.f58647a = f10;
        this.f58648b = f11;
        this.f58649c = f12;
        this.d = f13;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new f4(this, 14));
        ofFloat.setTarget(e1Var.f58535a);
        ofFloat.addListener(this);
        this.f58657y = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f58656x) {
            this.f58650e.q(true);
        }
        this.f58656x = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f58657y = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.f58655w) {
            int i7 = this.E;
            e1 e1Var = this.F;
            y yVar = this.G;
            if (i7 <= 0) {
                yVar.f58684y.a(yVar.I, e1Var);
            } else {
                yVar.f58674a.add(e1Var.f58535a);
                this.f58652n = true;
                if (i7 > 0) {
                    yVar.I.post(new pb.l(yVar, this, i7));
                }
            }
            View view = yVar.N;
            View view2 = e1Var.f58535a;
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
