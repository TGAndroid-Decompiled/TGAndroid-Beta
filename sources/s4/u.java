package s4;

import ai.l6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
public final class u implements Animator.AnimatorListener {
    public final c1 E;
    public final y F;
    public final float f43091a;
    public final float f43092b;
    public final float f43093c;
    public final float d;
    public final c1 e;
    public final int f43094f;
    public final ValueAnimator h;
    public boolean f43095n;
    public float f43096r;
    public float f43097s;
    public boolean v = false;
    public boolean f43098w = false;
    public float f43099x;
    public final int f43100y;

    public u(y yVar, c1 c1Var, int i10, float f7, float f10, float f11, float f12, int i11, c1 c1Var2) {
        this.F = yVar;
        this.f43100y = i11;
        this.E = c1Var2;
        this.f43094f = i10;
        this.e = c1Var;
        this.f43091a = f7;
        this.f43092b = f10;
        this.f43093c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new l6(this, 13));
        ofFloat.setTarget(c1Var.f42974a);
        ofFloat.addListener(this);
        this.f43099x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f43098w) {
            this.e.q(true);
        }
        this.f43098w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f43099x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.v) {
            int i10 = this.f43100y;
            c1 c1Var = this.E;
            y yVar = this.F;
            if (i10 <= 0) {
                yVar.f43122x.a(yVar.H, c1Var);
            } else {
                yVar.f43114a.add(c1Var.f42974a);
                this.f43095n = true;
                if (i10 > 0) {
                    yVar.H.post(new i9.s(yVar, this, i10));
                }
            }
            View view = yVar.M;
            View view2 = c1Var.f42974a;
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
