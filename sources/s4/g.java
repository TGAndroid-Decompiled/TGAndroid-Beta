package s4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class g extends AnimatorListenerAdapter {
    public final int f45808a;
    public final h f45809b;
    public final ViewPropertyAnimator f45810c;
    public final View d;
    public final j f45811e;

    public g(j jVar, h hVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f45808a = i10;
        this.f45811e = jVar;
        this.f45809b = hVar;
        this.f45810c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45808a) {
            case 0:
                this.f45810c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                j jVar = this.f45811e;
                if (jVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                h hVar = this.f45809b;
                c1 c1Var = hVar.f45818a;
                jVar.O();
                jVar.d(hVar.f45818a);
                jVar.B.remove(hVar.f45818a);
                jVar.G();
                return;
            default:
                this.f45810c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                j jVar2 = this.f45811e;
                if (jVar2.A(view2) > 0.0f) {
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                }
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                h hVar2 = this.f45809b;
                c1 c1Var2 = hVar2.f45819b;
                jVar2.O();
                jVar2.d(hVar2.f45819b);
                jVar2.B.remove(hVar2.f45819b);
                jVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f45808a) {
            case 0:
                c1 c1Var = this.f45809b.f45818a;
                this.f45811e.getClass();
                return;
            default:
                c1 c1Var2 = this.f45809b.f45819b;
                this.f45811e.getClass();
                return;
        }
    }
}
