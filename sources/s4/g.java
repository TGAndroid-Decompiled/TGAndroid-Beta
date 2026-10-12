package s4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class g extends AnimatorListenerAdapter {
    public final int f47925a;
    public final h f47926b;
    public final ViewPropertyAnimator f47927c;
    public final View d;
    public final j f47928e;

    public g(j jVar, h hVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f47925a = i10;
        this.f47928e = jVar;
        this.f47926b = hVar;
        this.f47927c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47925a) {
            case 0:
                this.f47927c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                j jVar = this.f47928e;
                if (jVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                h hVar = this.f47926b;
                d1 d1Var = hVar.f47931a;
                jVar.O();
                jVar.d(hVar.f47931a);
                jVar.B.remove(hVar.f47931a);
                jVar.G();
                return;
            default:
                this.f47927c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                j jVar2 = this.f47928e;
                if (jVar2.A(view2) > 0.0f) {
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                }
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                h hVar2 = this.f47926b;
                d1 d1Var2 = hVar2.f47932b;
                jVar2.O();
                jVar2.d(hVar2.f47932b);
                jVar2.B.remove(hVar2.f47932b);
                jVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f47925a) {
            case 0:
                d1 d1Var = this.f47926b.f47931a;
                this.f47928e.getClass();
                return;
            default:
                d1 d1Var2 = this.f47926b.f47932b;
                this.f47928e.getClass();
                return;
        }
    }
}
