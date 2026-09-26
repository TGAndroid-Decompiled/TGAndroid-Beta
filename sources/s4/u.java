package s4;

import ai.k6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
public final class u implements Animator.AnimatorListener {
    public final c1 E;
    public final y F;
    public final float f43077a;
    public final float f43078b;
    public final float f43079c;
    public final float d;
    public final c1 e;
    public final int f43080f;
    public final ValueAnimator h;
    public boolean f43081n;
    public float f43082r;
    public float f43083s;
    public boolean v = false;
    public boolean f43084w = false;
    public float f43085x;
    public final int f43086y;

    public u(y yVar, c1 c1Var, int i10, float f7, float f10, float f11, float f12, int i11, c1 c1Var2) {
        this.F = yVar;
        this.f43086y = i11;
        this.E = c1Var2;
        this.f43080f = i10;
        this.e = c1Var;
        this.f43077a = f7;
        this.f43078b = f10;
        this.f43079c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new k6(this, 13));
        ofFloat.setTarget(c1Var.f42960a);
        ofFloat.addListener(this);
        this.f43085x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f43084w) {
            this.e.q(true);
        }
        this.f43084w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f43085x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.v) {
            int i10 = this.f43086y;
            c1 c1Var = this.E;
            y yVar = this.F;
            if (i10 <= 0) {
                yVar.f43108x.a(yVar.H, c1Var);
            } else {
                yVar.f43100a.add(c1Var.f42960a);
                this.f43081n = true;
                if (i10 > 0) {
                    yVar.H.post(new i9.s(yVar, this, i10));
                }
            }
            View view = yVar.M;
            View view2 = c1Var.f42960a;
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
