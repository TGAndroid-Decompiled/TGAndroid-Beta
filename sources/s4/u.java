package s4;

import ai.k6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
public final class u implements Animator.AnimatorListener {
    public final c1 E;
    public final y F;
    public final float f46663a;
    public final float f46664b;
    public final float f46665c;
    public final float d;
    public final c1 f46666e;
    public final int f46667f;
    public final ValueAnimator h;
    public boolean f46668n;
    public float f46669r;
    public float f46670s;
    public boolean v = false;
    public boolean f46671w = false;
    public float f46672x;
    public final int f46673y;

    public u(y yVar, c1 c1Var, int i10, float f7, float f10, float f11, float f12, int i11, c1 c1Var2) {
        this.F = yVar;
        this.f46673y = i11;
        this.E = c1Var2;
        this.f46667f = i10;
        this.f46666e = c1Var;
        this.f46663a = f7;
        this.f46664b = f10;
        this.f46665c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new k6(this, 13));
        ofFloat.setTarget(c1Var.f46531a);
        ofFloat.addListener(this);
        this.f46672x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f46671w) {
            this.f46666e.q(true);
        }
        this.f46671w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f46672x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.v) {
            int i10 = this.f46673y;
            c1 c1Var = this.E;
            y yVar = this.F;
            if (i10 <= 0) {
                yVar.f46697x.a(yVar.H, c1Var);
            } else {
                yVar.f46688a.add(c1Var.f46531a);
                this.f46668n = true;
                if (i10 > 0) {
                    yVar.H.post(new i9.s(yVar, this, i10));
                }
            }
            View view = yVar.M;
            View view2 = c1Var.f46531a;
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
