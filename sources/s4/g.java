package s4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class g extends AnimatorListenerAdapter {
    public final int f46384a = 1;
    public final b1 f46385b;
    public final View f46386c;
    public final ViewPropertyAnimator d;
    public final k e;

    public g(k kVar, b1 b1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = kVar;
        this.f46385b = b1Var;
        this.d = viewPropertyAnimator;
        this.f46386c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f46384a) {
            case 1:
                View view = this.f46386c;
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
        switch (this.f46384a) {
            case 0:
                this.d.setListener(null);
                View view = this.f46386c;
                view.setAlpha(1.0f);
                k kVar = this.e;
                if (kVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                kVar.Q();
                b1 b1Var = this.f46385b;
                kVar.d(b1Var);
                kVar.A.remove(b1Var);
                kVar.G();
                return;
            default:
                this.d.setListener(null);
                k kVar2 = this.e;
                kVar2.M();
                b1 b1Var2 = this.f46385b;
                kVar2.u(b1Var2);
                kVar2.f46414y.remove(b1Var2);
                kVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f46384a) {
            case 0:
                return;
            default:
                this.e.getClass();
                return;
        }
    }

    public g(k kVar, b1 b1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = kVar;
        this.f46385b = b1Var;
        this.f46386c = view;
        this.d = viewPropertyAnimator;
    }

    private final void a(Animator animator) {
    }
}
