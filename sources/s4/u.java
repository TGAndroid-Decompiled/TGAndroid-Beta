package s4;

import ai.k6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
public final class u implements Animator.AnimatorListener {
    public final c1 E;
    public final y F;
    public final float f46670a;
    public final float f46671b;
    public final float f46672c;
    public final float d;
    public final c1 f46673e;
    public final int f46674f;
    public final ValueAnimator h;
    public boolean f46675n;
    public float f46676r;
    public float f46677s;
    public boolean v = false;
    public boolean f46678w = false;
    public float f46679x;
    public final int f46680y;

    public u(y yVar, c1 c1Var, int i10, float f7, float f10, float f11, float f12, int i11, c1 c1Var2) {
        this.F = yVar;
        this.f46680y = i11;
        this.E = c1Var2;
        this.f46674f = i10;
        this.f46673e = c1Var;
        this.f46670a = f7;
        this.f46671b = f10;
        this.f46672c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new k6(this, 13));
        ofFloat.setTarget(c1Var.f46538a);
        ofFloat.addListener(this);
        this.f46679x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f46678w) {
            this.f46673e.q(true);
        }
        this.f46678w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f46679x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.v) {
            int i10 = this.f46680y;
            c1 c1Var = this.E;
            y yVar = this.F;
            if (i10 <= 0) {
                yVar.f46704x.a(yVar.H, c1Var);
            } else {
                yVar.f46695a.add(c1Var.f46538a);
                this.f46675n = true;
                if (i10 > 0) {
                    yVar.H.post(new i9.s(yVar, this, i10));
                }
            }
            View view = yVar.M;
            View view2 = c1Var.f46538a;
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
