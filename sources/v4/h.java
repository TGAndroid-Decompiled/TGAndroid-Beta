package v4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class h extends AnimatorListenerAdapter {
    public final int f59146a;
    public final i f59147b;
    public final ViewPropertyAnimator f59148c;
    public final View d;
    public final k f59149e;

    public h(k kVar, i iVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i7) {
        this.f59146a = i7;
        this.f59149e = kVar;
        this.f59147b = iVar;
        this.f59148c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f59146a) {
            case 0:
                this.f59148c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                k kVar = this.f59149e;
                if (kVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                i iVar = this.f59147b;
                f1 f1Var = iVar.f59154a;
                kVar.O();
                kVar.d(iVar.f59154a);
                kVar.B.remove(iVar.f59154a);
                kVar.G();
                return;
            default:
                this.f59148c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                k kVar2 = this.f59149e;
                if (kVar2.A(view2) > 0.0f) {
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                }
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                i iVar2 = this.f59147b;
                f1 f1Var2 = iVar2.f59155b;
                kVar2.O();
                kVar2.d(iVar2.f59155b);
                kVar2.B.remove(iVar2.f59155b);
                kVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f59146a) {
            case 0:
                f1 f1Var = this.f59147b.f59154a;
                this.f59149e.getClass();
                return;
            default:
                f1 f1Var2 = this.f59147b.f59155b;
                this.f59149e.getClass();
                return;
        }
    }
}
