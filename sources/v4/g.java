package v4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class g extends AnimatorListenerAdapter {
    public final int f56980a = 1;
    public final d1 f56981b;
    public final View f56982c;
    public final ViewPropertyAnimator d;
    public final k f56983e;

    public g(k kVar, d1 d1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f56983e = kVar;
        this.f56981b = d1Var;
        this.d = viewPropertyAnimator;
        this.f56982c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f56980a) {
            case 1:
                View view = this.f56982c;
                view.setAlpha(1.0f);
                if (this.f56983e.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                    return;
                }
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f56980a) {
            case 0:
                this.d.setListener(null);
                View view = this.f56982c;
                view.setAlpha(1.0f);
                k kVar = this.f56983e;
                if (kVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                kVar.Q();
                d1 d1Var = this.f56981b;
                kVar.d(d1Var);
                kVar.A.remove(d1Var);
                kVar.G();
                return;
            default:
                this.d.setListener(null);
                k kVar2 = this.f56983e;
                kVar2.M();
                d1 d1Var2 = this.f56981b;
                kVar2.u(d1Var2);
                kVar2.f57016y.remove(d1Var2);
                kVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f56980a) {
            case 0:
                return;
            default:
                this.f56983e.getClass();
                return;
        }
    }

    public g(k kVar, d1 d1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f56983e = kVar;
        this.f56981b = d1Var;
        this.f56982c = view;
        this.d = viewPropertyAnimator;
    }

    private final void a(Animator animator) {
    }
}
