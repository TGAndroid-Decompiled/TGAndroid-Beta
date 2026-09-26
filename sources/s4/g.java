package s4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class g extends AnimatorListenerAdapter {
    public final int f42996a;
    public final h f42997b;
    public final ViewPropertyAnimator f42998c;
    public final View d;
    public final j e;

    public g(j jVar, h hVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f42996a = i10;
        this.e = jVar;
        this.f42997b = hVar;
        this.f42998c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42996a) {
            case 0:
                this.f42998c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                j jVar = this.e;
                if (jVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                h hVar = this.f42997b;
                c1 c1Var = hVar.f43004a;
                jVar.O();
                jVar.d(hVar.f43004a);
                jVar.B.remove(hVar.f43004a);
                jVar.G();
                return;
            default:
                this.f42998c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                j jVar2 = this.e;
                if (jVar2.A(view2) > 0.0f) {
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                }
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                h hVar2 = this.f42997b;
                c1 c1Var2 = hVar2.f43005b;
                jVar2.O();
                jVar2.d(hVar2.f43005b);
                jVar2.B.remove(hVar2.f43005b);
                jVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f42996a) {
            case 0:
                c1 c1Var = this.f42997b.f43004a;
                this.e.getClass();
                return;
            default:
                c1 c1Var2 = this.f42997b.f43005b;
                this.e.getClass();
                return;
        }
    }
}
