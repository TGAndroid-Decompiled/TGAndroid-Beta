package s4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class g extends AnimatorListenerAdapter {
    public final int f41647a;
    public final h f41648b;
    public final ViewPropertyAnimator f41649c;
    public final View d;
    public final j e;

    public g(j jVar, h hVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f41647a = i10;
        this.e = jVar;
        this.f41648b = hVar;
        this.f41649c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41647a) {
            case 0:
                this.f41649c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                j jVar = this.e;
                if (jVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                h hVar = this.f41648b;
                c1 c1Var = hVar.f41655a;
                jVar.O();
                jVar.d(hVar.f41655a);
                jVar.B.remove(hVar.f41655a);
                jVar.G();
                return;
            default:
                this.f41649c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                j jVar2 = this.e;
                if (jVar2.A(view2) > 0.0f) {
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                }
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                h hVar2 = this.f41648b;
                c1 c1Var2 = hVar2.f41656b;
                jVar2.O();
                jVar2.d(hVar2.f41656b);
                jVar2.B.remove(hVar2.f41656b);
                jVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f41647a) {
            case 0:
                c1 c1Var = this.f41648b.f41655a;
                this.e.getClass();
                return;
            default:
                c1 c1Var2 = this.f41648b.f41656b;
                this.e.getClass();
                return;
        }
    }
}
