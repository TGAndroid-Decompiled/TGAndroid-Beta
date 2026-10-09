package s4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class g extends AnimatorListenerAdapter {
    public final int f47694a;
    public final h f47695b;
    public final ViewPropertyAnimator f47696c;
    public final View d;
    public final j f47697e;

    public g(j jVar, h hVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f47694a = i10;
        this.f47697e = jVar;
        this.f47695b = hVar;
        this.f47696c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47694a) {
            case 0:
                this.f47696c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                j jVar = this.f47697e;
                if (jVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                h hVar = this.f47695b;
                d1 d1Var = hVar.f47700a;
                jVar.O();
                jVar.d(hVar.f47700a);
                jVar.B.remove(hVar.f47700a);
                jVar.G();
                return;
            default:
                this.f47696c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                j jVar2 = this.f47697e;
                if (jVar2.A(view2) > 0.0f) {
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                }
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                h hVar2 = this.f47695b;
                d1 d1Var2 = hVar2.f47701b;
                jVar2.O();
                jVar2.d(hVar2.f47701b);
                jVar2.B.remove(hVar2.f47701b);
                jVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f47694a) {
            case 0:
                d1 d1Var = this.f47695b.f47700a;
                this.f47697e.getClass();
                return;
            default:
                d1 d1Var2 = this.f47695b.f47701b;
                this.f47697e.getClass();
                return;
        }
    }
}
