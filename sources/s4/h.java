package s4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class h extends AnimatorListenerAdapter {
    public final int f45988a;
    public final i f45989b;
    public final ViewPropertyAnimator f45990c;
    public final View d;
    public final k e;

    public h(k kVar, i iVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f45988a = i10;
        this.e = kVar;
        this.f45989b = iVar;
        this.f45990c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45988a) {
            case 0:
                this.f45990c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                k kVar = this.e;
                if (kVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                i iVar = this.f45989b;
                b1 b1Var = iVar.f45991a;
                kVar.O();
                kVar.d(iVar.f45991a);
                kVar.B.remove(iVar.f45991a);
                kVar.G();
                return;
            default:
                this.f45990c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                k kVar2 = this.e;
                if (kVar2.A(view2) > 0.0f) {
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                }
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                i iVar2 = this.f45989b;
                b1 b1Var2 = iVar2.f45992b;
                kVar2.O();
                kVar2.d(iVar2.f45992b);
                kVar2.B.remove(iVar2.f45992b);
                kVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f45988a) {
            case 0:
                b1 b1Var = this.f45989b.f45991a;
                this.e.getClass();
                return;
            default:
                b1 b1Var2 = this.f45989b.f45992b;
                this.e.getClass();
                return;
        }
    }
}
