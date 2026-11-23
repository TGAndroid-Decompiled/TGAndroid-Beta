package v4;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import fi.d4;
public final class u implements Animator.AnimatorListener {
    public final int E;
    public final e1 F;
    public final y G;
    public final float f59222a;
    public final float f59223b;
    public final float f59224c;
    public final float d;
    public final e1 f59225e;
    public final int f59226f;
    public final ValueAnimator h;
    public boolean f59227n;
    public float f59228r;
    public float f59229s;
    public boolean f59230w = false;
    public boolean f59231x = false;
    public float f59232y;

    public u(y yVar, e1 e1Var, int i7, float f10, float f11, float f12, float f13, int i10, e1 e1Var2) {
        this.G = yVar;
        this.E = i10;
        this.F = e1Var2;
        this.f59226f = i7;
        this.f59225e = e1Var;
        this.f59222a = f10;
        this.f59223b = f11;
        this.f59224c = f12;
        this.d = f13;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new d4(this, 14));
        ofFloat.setTarget(e1Var.f59111a);
        ofFloat.addListener(this);
        this.f59232y = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f59231x) {
            this.f59225e.q(true);
        }
        this.f59231x = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f59232y = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.f59230w) {
            int i7 = this.E;
            e1 e1Var = this.F;
            y yVar = this.G;
            if (i7 <= 0) {
                yVar.f59259y.a(yVar.I, e1Var);
            } else {
                yVar.f59249a.add(e1Var.f59111a);
                this.f59227n = true;
                if (i7 > 0) {
                    yVar.I.post(new pb.l(yVar, this, i7));
                }
            }
            View view = yVar.N;
            View view2 = e1Var.f59111a;
            if (view == view2) {
                yVar.q(view2);
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
