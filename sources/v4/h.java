package v4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class h extends AnimatorListenerAdapter {
    public final int f56988a;
    public final i f56989b;
    public final ViewPropertyAnimator f56990c;
    public final View d;
    public final k f56991e;

    public h(k kVar, i iVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i7) {
        this.f56988a = i7;
        this.f56991e = kVar;
        this.f56989b = iVar;
        this.f56990c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f56988a) {
            case 0:
                this.f56990c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                k kVar = this.f56991e;
                if (kVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                i iVar = this.f56989b;
                d1 d1Var = iVar.f56996a;
                kVar.O();
                kVar.d(iVar.f56996a);
                kVar.B.remove(iVar.f56996a);
                kVar.G();
                return;
            default:
                this.f56990c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                k kVar2 = this.f56991e;
                if (kVar2.A(view2) > 0.0f) {
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                }
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                i iVar2 = this.f56989b;
                d1 d1Var2 = iVar2.f56997b;
                kVar2.O();
                kVar2.d(iVar2.f56997b);
                kVar2.B.remove(iVar2.f56997b);
                kVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f56988a) {
            case 0:
                d1 d1Var = this.f56989b.f56996a;
                this.f56991e.getClass();
                return;
            default:
                d1 d1Var2 = this.f56989b.f56997b;
                this.f56991e.getClass();
                return;
        }
    }
}
