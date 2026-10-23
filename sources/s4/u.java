package s4;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import ci.v4;
public final class u implements Animator.AnimatorListener {
    public final b1 E;
    public final y F;
    public final float f46041a;
    public final float f46042b;
    public final float f46043c;
    public final float d;
    public final b1 e;
    public final int f46044f;
    public final ValueAnimator h;
    public boolean f46045n;
    public float f46046r;
    public float f46047s;
    public boolean v = false;
    public boolean f46048w = false;
    public float f46049x;
    public final int f46050y;

    public u(y yVar, b1 b1Var, int i10, float f7, float f10, float f11, float f12, int i11, b1 b1Var2) {
        this.F = yVar;
        this.f46050y = i11;
        this.E = b1Var2;
        this.f46044f = i10;
        this.e = b1Var;
        this.f46041a = f7;
        this.f46042b = f10;
        this.f46043c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new v4(this, 11));
        ofFloat.setTarget(b1Var.f45921a);
        ofFloat.addListener(this);
        this.f46049x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f46048w) {
            this.e.q(true);
        }
        this.f46048w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f46049x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.v) {
            int i10 = this.f46050y;
            b1 b1Var = this.E;
            y yVar = this.F;
            if (i10 <= 0) {
                yVar.f46075x.a(yVar.H, b1Var);
            } else {
                yVar.f46067a.add(b1Var.f45921a);
                this.f46045n = true;
                if (i10 > 0) {
                    yVar.H.post(new j9.u(yVar, this, i10));
                }
            }
            View view = yVar.M;
            View view2 = b1Var.f45921a;
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
