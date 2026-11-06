package v4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class g extends AnimatorListenerAdapter {
    public final int f56981a = 1;
    public final d1 f56982b;
    public final View f56983c;
    public final ViewPropertyAnimator d;
    public final k f56984e;

    public g(k kVar, d1 d1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f56984e = kVar;
        this.f56982b = d1Var;
        this.d = viewPropertyAnimator;
        this.f56983c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f56981a) {
            case 1:
                View view = this.f56983c;
                view.setAlpha(1.0f);
                if (this.f56984e.A(view) > 0.0f) {
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
        switch (this.f56981a) {
            case 0:
                this.d.setListener(null);
                View view = this.f56983c;
                view.setAlpha(1.0f);
                k kVar = this.f56984e;
                if (kVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                kVar.Q();
                d1 d1Var = this.f56982b;
                kVar.d(d1Var);
                kVar.A.remove(d1Var);
                kVar.G();
                return;
            default:
                this.d.setListener(null);
                k kVar2 = this.f56984e;
                kVar2.M();
                d1 d1Var2 = this.f56982b;
                kVar2.u(d1Var2);
                kVar2.f57017y.remove(d1Var2);
                kVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f56981a) {
            case 0:
                return;
            default:
                this.f56984e.getClass();
                return;
        }
    }

    public g(k kVar, d1 d1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f56984e = kVar;
        this.f56982b = d1Var;
        this.f56983c = view;
        this.d = viewPropertyAnimator;
    }

    private final void a(Animator animator) {
    }
}
