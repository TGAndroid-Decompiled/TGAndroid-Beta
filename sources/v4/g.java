package v4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class g extends AnimatorListenerAdapter {
    public final int f59140a = 1;
    public final f1 f59141b;
    public final View f59142c;
    public final ViewPropertyAnimator d;
    public final k f59143e;

    public g(k kVar, f1 f1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f59143e = kVar;
        this.f59141b = f1Var;
        this.d = viewPropertyAnimator;
        this.f59142c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f59140a) {
            case 1:
                View view = this.f59142c;
                view.setAlpha(1.0f);
                if (this.f59143e.A(view) > 0.0f) {
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
        switch (this.f59140a) {
            case 0:
                this.d.setListener(null);
                View view = this.f59142c;
                view.setAlpha(1.0f);
                k kVar = this.f59143e;
                if (kVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                kVar.Q();
                f1 f1Var = this.f59141b;
                kVar.d(f1Var);
                kVar.A.remove(f1Var);
                kVar.G();
                return;
            default:
                this.d.setListener(null);
                k kVar2 = this.f59143e;
                kVar2.M();
                f1 f1Var2 = this.f59141b;
                kVar2.u(f1Var2);
                kVar2.f59178y.remove(f1Var2);
                kVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f59140a) {
            case 0:
                return;
            default:
                this.f59143e.getClass();
                return;
        }
    }

    public g(k kVar, f1 f1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f59143e = kVar;
        this.f59141b = f1Var;
        this.f59142c = view;
        this.d = viewPropertyAnimator;
    }

    private final void a(Animator animator) {
    }
}
