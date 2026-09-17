package s4;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import bi.u5;
public final class u implements Animator.AnimatorListener {
    public final c1 E;
    public final y F;
    public final float f45899a;
    public final float f45900b;
    public final float f45901c;
    public final float d;
    public final c1 f45902e;
    public final int f45903f;
    public final ValueAnimator h;
    public boolean f45904n;
    public float f45905r;
    public float f45906s;
    public boolean v = false;
    public boolean f45907w = false;
    public float f45908x;
    public final int f45909y;

    public u(y yVar, c1 c1Var, int i10, float f7, float f10, float f11, float f12, int i11, c1 c1Var2) {
        this.F = yVar;
        this.f45909y = i11;
        this.E = c1Var2;
        this.f45903f = i10;
        this.f45902e = c1Var;
        this.f45899a = f7;
        this.f45900b = f10;
        this.f45901c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new u5(this, 11));
        ofFloat.setTarget(c1Var.f45767a);
        ofFloat.addListener(this);
        this.f45908x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f45907w) {
            this.f45902e.q(true);
        }
        this.f45907w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f45908x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.v) {
            int i10 = this.f45909y;
            c1 c1Var = this.E;
            y yVar = this.F;
            if (i10 <= 0) {
                yVar.f45933x.a(yVar.H, c1Var);
            } else {
                yVar.f45924a.add(c1Var.f45767a);
                this.f45904n = true;
                if (i10 > 0) {
                    yVar.H.post(new i9.s(yVar, this, i10));
                }
            }
            View view = yVar.M;
            View view2 = c1Var.f45767a;
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
