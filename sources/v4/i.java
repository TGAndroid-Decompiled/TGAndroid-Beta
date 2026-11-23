package v4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class i extends AnimatorListenerAdapter {
    public final int f59276a;
    public final j f59277b;
    public final ViewPropertyAnimator f59278c;
    public final View d;
    public final l f59279e;

    public i(l lVar, j jVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i7) {
        this.f59276a = i7;
        this.f59279e = lVar;
        this.f59277b = jVar;
        this.f59278c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f59276a) {
            case 0:
                this.f59278c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                l lVar = this.f59279e;
                if (lVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                j jVar = this.f59277b;
                f1 f1Var = jVar.f59283a;
                lVar.O();
                lVar.d(jVar.f59283a);
                lVar.B.remove(jVar.f59283a);
                lVar.G();
                return;
            default:
                this.f59278c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                l lVar2 = this.f59279e;
                if (lVar2.A(view2) > 0.0f) {
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                }
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                j jVar2 = this.f59277b;
                f1 f1Var2 = jVar2.f59284b;
                lVar2.O();
                lVar2.d(jVar2.f59284b);
                lVar2.B.remove(jVar2.f59284b);
                lVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f59276a) {
            case 0:
                f1 f1Var = this.f59277b.f59283a;
                this.f59279e.getClass();
                return;
            default:
                f1 f1Var2 = this.f59277b.f59284b;
                this.f59279e.getClass();
                return;
        }
    }
}
