package s4;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import ci.u4;
public final class u implements Animator.AnimatorListener {
    public final b1 E;
    public final y F;
    public final float f46462a;
    public final float f46463b;
    public final float f46464c;
    public final float d;
    public final b1 e;
    public final int f46465f;
    public final ValueAnimator h;
    public boolean f46466n;
    public float f46467r;
    public float f46468s;
    public boolean v = false;
    public boolean f46469w = false;
    public float f46470x;
    public final int f46471y;

    public u(y yVar, b1 b1Var, int i10, float f7, float f10, float f11, float f12, int i11, b1 b1Var2) {
        this.F = yVar;
        this.f46471y = i11;
        this.E = b1Var2;
        this.f46465f = i10;
        this.e = b1Var;
        this.f46462a = f7;
        this.f46463b = f10;
        this.f46464c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new u4(this, 11));
        ofFloat.setTarget(b1Var.f46342a);
        ofFloat.addListener(this);
        this.f46470x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f46469w) {
            this.e.q(true);
        }
        this.f46469w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f46470x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.v) {
            int i10 = this.f46471y;
            b1 b1Var = this.E;
            y yVar = this.F;
            if (i10 <= 0) {
                yVar.f46496x.a(yVar.H, b1Var);
            } else {
                yVar.f46488a.add(b1Var.f46342a);
                this.f46466n = true;
                if (i10 > 0) {
                    yVar.H.post(new j9.u(yVar, this, i10));
                }
            }
            View view = yVar.M;
            View view2 = b1Var.f46342a;
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
