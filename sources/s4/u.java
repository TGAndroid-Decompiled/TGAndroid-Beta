package s4;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import ci.u4;
public final class u implements Animator.AnimatorListener {
    public final b1 E;
    public final y F;
    public final float f46030a;
    public final float f46031b;
    public final float f46032c;
    public final float d;
    public final b1 e;
    public final int f46033f;
    public final ValueAnimator h;
    public boolean f46034n;
    public float f46035r;
    public float f46036s;
    public boolean v = false;
    public boolean f46037w = false;
    public float f46038x;
    public final int f46039y;

    public u(y yVar, b1 b1Var, int i10, float f7, float f10, float f11, float f12, int i11, b1 b1Var2) {
        this.F = yVar;
        this.f46039y = i11;
        this.E = b1Var2;
        this.f46033f = i10;
        this.e = b1Var;
        this.f46030a = f7;
        this.f46031b = f10;
        this.f46032c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new u4(this, 11));
        ofFloat.setTarget(b1Var.f45910a);
        ofFloat.addListener(this);
        this.f46038x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f46037w) {
            this.e.q(true);
        }
        this.f46037w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f46038x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.v) {
            int i10 = this.f46039y;
            b1 b1Var = this.E;
            y yVar = this.F;
            if (i10 <= 0) {
                yVar.f46064x.a(yVar.H, b1Var);
            } else {
                yVar.f46056a.add(b1Var.f45910a);
                this.f46034n = true;
                if (i10 > 0) {
                    yVar.H.post(new j9.u(yVar, this, i10));
                }
            }
            View view = yVar.M;
            View view2 = b1Var.f45910a;
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
