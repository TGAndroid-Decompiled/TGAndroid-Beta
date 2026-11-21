package v4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class g extends AnimatorListenerAdapter {
    public final int f59179a = 1;
    public final f1 f59180b;
    public final View f59181c;
    public final ViewPropertyAnimator d;
    public final k f59182e;

    public g(k kVar, f1 f1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f59182e = kVar;
        this.f59180b = f1Var;
        this.d = viewPropertyAnimator;
        this.f59181c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f59179a) {
            case 1:
                View view = this.f59181c;
                view.setAlpha(1.0f);
                if (this.f59182e.A(view) > 0.0f) {
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
        switch (this.f59179a) {
            case 0:
                this.d.setListener(null);
                View view = this.f59181c;
                view.setAlpha(1.0f);
                k kVar = this.f59182e;
                if (kVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                kVar.Q();
                f1 f1Var = this.f59180b;
                kVar.d(f1Var);
                kVar.A.remove(f1Var);
                kVar.G();
                return;
            default:
                this.d.setListener(null);
                k kVar2 = this.f59182e;
                kVar2.M();
                f1 f1Var2 = this.f59180b;
                kVar2.u(f1Var2);
                kVar2.f59217y.remove(f1Var2);
                kVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f59179a) {
            case 0:
                return;
            default:
                this.f59182e.getClass();
                return;
        }
    }

    public g(k kVar, f1 f1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f59182e = kVar;
        this.f59180b = f1Var;
        this.f59181c = view;
        this.d = viewPropertyAnimator;
    }

    private final void a(Animator animator) {
    }
}
