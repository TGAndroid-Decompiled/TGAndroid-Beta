package s4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class g extends AnimatorListenerAdapter {
    public final int f46564a;
    public final h f46565b;
    public final ViewPropertyAnimator f46566c;
    public final View d;
    public final j f46567e;

    public g(j jVar, h hVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f46564a = i10;
        this.f46567e = jVar;
        this.f46565b = hVar;
        this.f46566c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46564a) {
            case 0:
                this.f46566c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                j jVar = this.f46567e;
                if (jVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                h hVar = this.f46565b;
                c1 c1Var = hVar.f46574a;
                jVar.O();
                jVar.d(hVar.f46574a);
                jVar.B.remove(hVar.f46574a);
                jVar.G();
                return;
            default:
                this.f46566c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                j jVar2 = this.f46567e;
                if (jVar2.A(view2) > 0.0f) {
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                }
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                h hVar2 = this.f46565b;
                c1 c1Var2 = hVar2.f46575b;
                jVar2.O();
                jVar2.d(hVar2.f46575b);
                jVar2.B.remove(hVar2.f46575b);
                jVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f46564a) {
            case 0:
                c1 c1Var = this.f46565b.f46574a;
                this.f46567e.getClass();
                return;
            default:
                c1 c1Var2 = this.f46565b.f46575b;
                this.f46567e.getClass();
                return;
        }
    }
}
