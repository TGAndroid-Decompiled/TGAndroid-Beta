package s4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class i extends AnimatorListenerAdapter {
    public final int f47768a;
    public final j f47769b;
    public final ViewPropertyAnimator f47770c;
    public final View d;
    public final l e;

    public i(l lVar, j jVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f47768a = i10;
        this.e = lVar;
        this.f47769b = jVar;
        this.f47770c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47768a) {
            case 0:
                this.f47770c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                l lVar = this.e;
                if (lVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                j jVar = this.f47769b;
                e1 e1Var = jVar.f47774a;
                lVar.O();
                lVar.d(jVar.f47774a);
                lVar.B.remove(jVar.f47774a);
                lVar.G();
                return;
            default:
                this.f47770c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                l lVar2 = this.e;
                if (lVar2.A(view2) > 0.0f) {
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                }
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                j jVar2 = this.f47769b;
                e1 e1Var2 = jVar2.f47775b;
                lVar2.O();
                lVar2.d(jVar2.f47775b);
                lVar2.B.remove(jVar2.f47775b);
                lVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f47768a) {
            case 0:
                e1 e1Var = this.f47769b.f47774a;
                this.e.getClass();
                return;
            default:
                e1 e1Var2 = this.f47769b.f47775b;
                this.e.getClass();
                return;
        }
    }
}
