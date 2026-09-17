package s4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class f extends AnimatorListenerAdapter {
    public final int f45774a = 1;
    public final c1 f45775b;
    public final View f45776c;
    public final ViewPropertyAnimator d;
    public final j f45777e;

    public f(j jVar, c1 c1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f45777e = jVar;
        this.f45775b = c1Var;
        this.d = viewPropertyAnimator;
        this.f45776c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f45774a) {
            case 1:
                View view = this.f45776c;
                view.setAlpha(1.0f);
                if (this.f45777e.A(view) > 0.0f) {
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
        switch (this.f45774a) {
            case 0:
                this.d.setListener(null);
                View view = this.f45776c;
                view.setAlpha(1.0f);
                j jVar = this.f45777e;
                if (jVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                jVar.Q();
                c1 c1Var = this.f45775b;
                jVar.d(c1Var);
                jVar.A.remove(c1Var);
                jVar.G();
                return;
            default:
                this.d.setListener(null);
                j jVar2 = this.f45777e;
                jVar2.M();
                c1 c1Var2 = this.f45775b;
                jVar2.u(c1Var2);
                jVar2.f45813y.remove(c1Var2);
                jVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f45774a) {
            case 0:
                return;
            default:
                this.f45777e.getClass();
                return;
        }
    }

    public f(j jVar, c1 c1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f45777e = jVar;
        this.f45775b = c1Var;
        this.f45776c = view;
        this.d = viewPropertyAnimator;
    }

    private final void a(Animator animator) {
    }
}
