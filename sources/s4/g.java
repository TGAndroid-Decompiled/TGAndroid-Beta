package s4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class g extends AnimatorListenerAdapter {
    public final int f45807a;
    public final h f45808b;
    public final ViewPropertyAnimator f45809c;
    public final View d;
    public final j f45810e;

    public g(j jVar, h hVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f45807a = i10;
        this.f45810e = jVar;
        this.f45808b = hVar;
        this.f45809c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45807a) {
            case 0:
                this.f45809c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                j jVar = this.f45810e;
                if (jVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                h hVar = this.f45808b;
                c1 c1Var = hVar.f45817a;
                jVar.O();
                jVar.d(hVar.f45817a);
                jVar.B.remove(hVar.f45817a);
                jVar.G();
                return;
            default:
                this.f45809c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                j jVar2 = this.f45810e;
                if (jVar2.A(view2) > 0.0f) {
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                }
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                h hVar2 = this.f45808b;
                c1 c1Var2 = hVar2.f45818b;
                jVar2.O();
                jVar2.d(hVar2.f45818b);
                jVar2.B.remove(hVar2.f45818b);
                jVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f45807a) {
            case 0:
                c1 c1Var = this.f45808b.f45817a;
                this.f45810e.getClass();
                return;
            default:
                c1 c1Var2 = this.f45808b.f45818b;
                this.f45810e.getClass();
                return;
        }
    }
}
