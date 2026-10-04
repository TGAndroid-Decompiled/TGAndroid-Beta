package s4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class g extends AnimatorListenerAdapter {
    public final int f46572a;
    public final h f46573b;
    public final ViewPropertyAnimator f46574c;
    public final View d;
    public final j f46575e;

    public g(j jVar, h hVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f46572a = i10;
        this.f46575e = jVar;
        this.f46573b = hVar;
        this.f46574c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46572a) {
            case 0:
                this.f46574c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                j jVar = this.f46575e;
                if (jVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                h hVar = this.f46573b;
                c1 c1Var = hVar.f46582a;
                jVar.O();
                jVar.d(hVar.f46582a);
                jVar.B.remove(hVar.f46582a);
                jVar.G();
                return;
            default:
                this.f46574c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                j jVar2 = this.f46575e;
                if (jVar2.A(view2) > 0.0f) {
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                }
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                h hVar2 = this.f46573b;
                c1 c1Var2 = hVar2.f46583b;
                jVar2.O();
                jVar2.d(hVar2.f46583b);
                jVar2.B.remove(hVar2.f46583b);
                jVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f46572a) {
            case 0:
                c1 c1Var = this.f46573b.f46582a;
                this.f46575e.getClass();
                return;
            default:
                c1 c1Var2 = this.f46573b.f46583b;
                this.f46575e.getClass();
                return;
        }
    }
}
