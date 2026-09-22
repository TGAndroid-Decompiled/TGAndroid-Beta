package s4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class g extends AnimatorListenerAdapter {
    public final int f43032a;
    public final h f43033b;
    public final ViewPropertyAnimator f43034c;
    public final View d;
    public final j e;

    public g(j jVar, h hVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f43032a = i10;
        this.e = jVar;
        this.f43033b = hVar;
        this.f43034c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43032a) {
            case 0:
                this.f43034c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                j jVar = this.e;
                if (jVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                h hVar = this.f43033b;
                c1 c1Var = hVar.f43040a;
                jVar.O();
                jVar.d(hVar.f43040a);
                jVar.B.remove(hVar.f43040a);
                jVar.G();
                return;
            default:
                this.f43034c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                j jVar2 = this.e;
                if (jVar2.A(view2) > 0.0f) {
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                }
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                h hVar2 = this.f43033b;
                c1 c1Var2 = hVar2.f43041b;
                jVar2.O();
                jVar2.d(hVar2.f43041b);
                jVar2.B.remove(hVar2.f43041b);
                jVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f43032a) {
            case 0:
                c1 c1Var = this.f43033b.f43040a;
                this.e.getClass();
                return;
            default:
                c1 c1Var2 = this.f43033b.f43041b;
                this.e.getClass();
                return;
        }
    }
}
