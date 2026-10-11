package s4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class f extends AnimatorListenerAdapter {
    public final int f47813a = 1;
    public final d1 f47814b;
    public final View f47815c;
    public final ViewPropertyAnimator d;
    public final j f47816e;

    public f(j jVar, d1 d1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f47816e = jVar;
        this.f47814b = d1Var;
        this.d = viewPropertyAnimator;
        this.f47815c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f47813a) {
            case 1:
                View view = this.f47815c;
                view.setAlpha(1.0f);
                if (this.f47816e.A(view) > 0.0f) {
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
        switch (this.f47813a) {
            case 0:
                this.d.setListener(null);
                View view = this.f47815c;
                view.setAlpha(1.0f);
                j jVar = this.f47816e;
                if (jVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                jVar.Q();
                d1 d1Var = this.f47814b;
                jVar.d(d1Var);
                jVar.A.remove(d1Var);
                jVar.G();
                return;
            default:
                this.d.setListener(null);
                j jVar2 = this.f47816e;
                jVar2.M();
                d1 d1Var2 = this.f47814b;
                jVar2.u(d1Var2);
                jVar2.f47851y.remove(d1Var2);
                jVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f47813a) {
            case 0:
                return;
            default:
                this.f47816e.getClass();
                return;
        }
    }

    public f(j jVar, d1 d1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f47816e = jVar;
        this.f47814b = d1Var;
        this.f47815c = view;
        this.d = viewPropertyAnimator;
    }

    private final void a(Animator animator) {
    }
}
