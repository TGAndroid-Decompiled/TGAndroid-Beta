package v4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class h extends AnimatorListenerAdapter {
    public final int f59141a;
    public final i f59142b;
    public final ViewPropertyAnimator f59143c;
    public final View d;
    public final k f59144e;

    public h(k kVar, i iVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i7) {
        this.f59141a = i7;
        this.f59144e = kVar;
        this.f59142b = iVar;
        this.f59143c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f59141a) {
            case 0:
                this.f59143c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                k kVar = this.f59144e;
                if (kVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                i iVar = this.f59142b;
                e1 e1Var = iVar.f59148a;
                kVar.O();
                kVar.d(iVar.f59148a);
                kVar.B.remove(iVar.f59148a);
                kVar.G();
                return;
            default:
                this.f59143c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                k kVar2 = this.f59144e;
                if (kVar2.A(view2) > 0.0f) {
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                }
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                i iVar2 = this.f59142b;
                e1 e1Var2 = iVar2.f59149b;
                kVar2.O();
                kVar2.d(iVar2.f59149b);
                kVar2.B.remove(iVar2.f59149b);
                kVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f59141a) {
            case 0:
                e1 e1Var = this.f59142b.f59148a;
                this.f59144e.getClass();
                return;
            default:
                e1 e1Var2 = this.f59142b.f59149b;
                this.f59144e.getClass();
                return;
        }
    }
}
