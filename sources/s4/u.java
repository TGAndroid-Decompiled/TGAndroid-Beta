package s4;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import ci.v4;
public final class u implements Animator.AnimatorListener {
    public final b1 E;
    public final y F;
    public final float f46040a;
    public final float f46041b;
    public final float f46042c;
    public final float d;
    public final b1 e;
    public final int f46043f;
    public final ValueAnimator h;
    public boolean f46044n;
    public float f46045r;
    public float f46046s;
    public boolean v = false;
    public boolean f46047w = false;
    public float f46048x;
    public final int f46049y;

    public u(y yVar, b1 b1Var, int i10, float f7, float f10, float f11, float f12, int i11, b1 b1Var2) {
        this.F = yVar;
        this.f46049y = i11;
        this.E = b1Var2;
        this.f46043f = i10;
        this.e = b1Var;
        this.f46040a = f7;
        this.f46041b = f10;
        this.f46042c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new v4(this, 11));
        ofFloat.setTarget(b1Var.f45920a);
        ofFloat.addListener(this);
        this.f46048x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f46047w) {
            this.e.q(true);
        }
        this.f46047w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f46048x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.v) {
            int i10 = this.f46049y;
            b1 b1Var = this.E;
            y yVar = this.F;
            if (i10 <= 0) {
                yVar.f46074x.a(yVar.H, b1Var);
            } else {
                yVar.f46066a.add(b1Var.f45920a);
                this.f46044n = true;
                if (i10 > 0) {
                    yVar.H.post(new j9.u(yVar, this, i10));
                }
            }
            View view = yVar.M;
            View view2 = b1Var.f45920a;
            if (view == view2) {
                yVar.o(view2);
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
