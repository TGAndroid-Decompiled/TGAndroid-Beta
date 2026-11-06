package v4;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import di.m4;
import org.telegram.ui.fx;
public final class u implements Animator.AnimatorListener {
    public final int D;
    public final d1 E;
    public final y F;
    public final float f57044a;
    public final float f57045b;
    public final float f57046c;
    public final float d;
    public final d1 f57047e;
    public final int f57048f;
    public final ValueAnimator h;
    public boolean f57049n;
    public float f57050r;
    public float f57051s;
    public boolean f57052w = false;
    public boolean f57053x = false;
    public float f57054y;

    public u(y yVar, d1 d1Var, int i7, float f10, float f11, float f12, float f13, int i10, d1 d1Var2) {
        this.F = yVar;
        this.D = i10;
        this.E = d1Var2;
        this.f57048f = i7;
        this.f57047e = d1Var;
        this.f57044a = f10;
        this.f57045b = f11;
        this.f57046c = f12;
        this.d = f13;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new m4(this, 14));
        ofFloat.setTarget(d1Var.f56927a);
        ofFloat.addListener(this);
        this.f57054y = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f57053x) {
            this.f57047e.q(true);
        }
        this.f57053x = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f57054y = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.f57052w) {
            int i7 = this.D;
            d1 d1Var = this.E;
            y yVar = this.F;
            if (i7 <= 0) {
                yVar.f57079y.a(yVar.H, d1Var);
            } else {
                yVar.f57069a.add(d1Var.f56927a);
                this.f57049n = true;
                if (i7 > 0) {
                    yVar.H.post(new fx(yVar, this, i7));
                }
            }
            View view = yVar.M;
            View view2 = d1Var.f56927a;
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
