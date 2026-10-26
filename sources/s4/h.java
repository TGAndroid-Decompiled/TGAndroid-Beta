package s4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class h extends AnimatorListenerAdapter {
    public final int f47765a = 1;
    public final e1 f47766b;
    public final View f47767c;
    public final ViewPropertyAnimator d;
    public final l e;

    public h(l lVar, e1 e1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = lVar;
        this.f47766b = e1Var;
        this.d = viewPropertyAnimator;
        this.f47767c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f47765a) {
            case 1:
                View view = this.f47767c;
                view.setAlpha(1.0f);
                if (this.e.A(view) > 0.0f) {
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
        switch (this.f47765a) {
            case 0:
                this.d.setListener(null);
                View view = this.f47767c;
                view.setAlpha(1.0f);
                l lVar = this.e;
                if (lVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                lVar.Q();
                e1 e1Var = this.f47766b;
                lVar.d(e1Var);
                lVar.A.remove(e1Var);
                lVar.G();
                return;
            default:
                this.d.setListener(null);
                l lVar2 = this.e;
                lVar2.M();
                e1 e1Var2 = this.f47766b;
                lVar2.u(e1Var2);
                lVar2.f47796y.remove(e1Var2);
                lVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f47765a) {
            case 0:
                return;
            default:
                this.e.getClass();
                return;
        }
    }

    public h(l lVar, e1 e1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = lVar;
        this.f47766b = e1Var;
        this.f47767c = view;
        this.d = viewPropertyAnimator;
    }

    private final void a(Animator animator) {
    }
}
