package s4;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import ci.v4;
public final class u implements Animator.AnimatorListener {
    public final b1 E;
    public final y F;
    public final float f46058a;
    public final float f46059b;
    public final float f46060c;
    public final float d;
    public final b1 e;
    public final int f46061f;
    public final ValueAnimator h;
    public boolean f46062n;
    public float f46063r;
    public float f46064s;
    public boolean v = false;
    public boolean f46065w = false;
    public float f46066x;
    public final int f46067y;

    public u(y yVar, b1 b1Var, int i10, float f7, float f10, float f11, float f12, int i11, b1 b1Var2) {
        this.F = yVar;
        this.f46067y = i11;
        this.E = b1Var2;
        this.f46061f = i10;
        this.e = b1Var;
        this.f46058a = f7;
        this.f46059b = f10;
        this.f46060c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new v4(this, 11));
        ofFloat.setTarget(b1Var.f45938a);
        ofFloat.addListener(this);
        this.f46066x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f46065w) {
            this.e.q(true);
        }
        this.f46065w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f46066x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.v) {
            int i10 = this.f46067y;
            b1 b1Var = this.E;
            y yVar = this.F;
            if (i10 <= 0) {
                yVar.f46092x.a(yVar.H, b1Var);
            } else {
                yVar.f46084a.add(b1Var.f45938a);
                this.f46062n = true;
                if (i10 > 0) {
                    yVar.H.post(new j9.u(yVar, this, i10));
                }
            }
            View view = yVar.M;
            View view2 = b1Var.f45938a;
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
