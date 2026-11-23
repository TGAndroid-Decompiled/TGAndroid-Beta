package v4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class h extends AnimatorListenerAdapter {
    public final int f59269a = 1;
    public final f1 f59270b;
    public final View f59271c;
    public final ViewPropertyAnimator d;
    public final l f59272e;

    public h(l lVar, f1 f1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f59272e = lVar;
        this.f59270b = f1Var;
        this.d = viewPropertyAnimator;
        this.f59271c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f59269a) {
            case 1:
                View view = this.f59271c;
                view.setAlpha(1.0f);
                if (this.f59272e.A(view) > 0.0f) {
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
        switch (this.f59269a) {
            case 0:
                this.d.setListener(null);
                View view = this.f59271c;
                view.setAlpha(1.0f);
                l lVar = this.f59272e;
                if (lVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                lVar.Q();
                f1 f1Var = this.f59270b;
                lVar.d(f1Var);
                lVar.A.remove(f1Var);
                lVar.G();
                return;
            default:
                this.d.setListener(null);
                l lVar2 = this.f59272e;
                lVar2.M();
                f1 f1Var2 = this.f59270b;
                lVar2.u(f1Var2);
                lVar2.f59305y.remove(f1Var2);
                lVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f59269a) {
            case 0:
                return;
            default:
                this.f59272e.getClass();
                return;
        }
    }

    public h(l lVar, f1 f1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f59272e = lVar;
        this.f59270b = f1Var;
        this.f59271c = view;
        this.d = viewPropertyAnimator;
    }

    private final void a(Animator animator) {
    }
}
