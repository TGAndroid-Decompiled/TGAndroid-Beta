package v4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class g extends AnimatorListenerAdapter {
    public final int f59133a = 1;
    public final e1 f59134b;
    public final View f59135c;
    public final ViewPropertyAnimator d;
    public final k f59136e;

    public g(k kVar, e1 e1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f59136e = kVar;
        this.f59134b = e1Var;
        this.d = viewPropertyAnimator;
        this.f59135c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f59133a) {
            case 1:
                View view = this.f59135c;
                view.setAlpha(1.0f);
                if (this.f59136e.A(view) > 0.0f) {
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
        switch (this.f59133a) {
            case 0:
                this.d.setListener(null);
                View view = this.f59135c;
                view.setAlpha(1.0f);
                k kVar = this.f59136e;
                if (kVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                kVar.Q();
                e1 e1Var = this.f59134b;
                kVar.d(e1Var);
                kVar.A.remove(e1Var);
                kVar.G();
                return;
            default:
                this.d.setListener(null);
                k kVar2 = this.f59136e;
                kVar2.M();
                e1 e1Var2 = this.f59134b;
                kVar2.u(e1Var2);
                kVar2.f59170y.remove(e1Var2);
                kVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f59133a) {
            case 0:
                return;
            default:
                this.f59136e.getClass();
                return;
        }
    }

    public g(k kVar, e1 e1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f59136e = kVar;
        this.f59134b = e1Var;
        this.f59135c = view;
        this.d = viewPropertyAnimator;
    }

    private final void a(Animator animator) {
    }
}
