package v4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class h extends AnimatorListenerAdapter {
    public final int f59145a;
    public final i f59146b;
    public final ViewPropertyAnimator f59147c;
    public final View d;
    public final k f59148e;

    public h(k kVar, i iVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i7) {
        this.f59145a = i7;
        this.f59148e = kVar;
        this.f59146b = iVar;
        this.f59147c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f59145a) {
            case 0:
                this.f59147c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                k kVar = this.f59148e;
                if (kVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                i iVar = this.f59146b;
                f1 f1Var = iVar.f59153a;
                kVar.O();
                kVar.d(iVar.f59153a);
                kVar.B.remove(iVar.f59153a);
                kVar.G();
                return;
            default:
                this.f59147c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                k kVar2 = this.f59148e;
                if (kVar2.A(view2) > 0.0f) {
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                }
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                i iVar2 = this.f59146b;
                f1 f1Var2 = iVar2.f59154b;
                kVar2.O();
                kVar2.d(iVar2.f59154b);
                kVar2.B.remove(iVar2.f59154b);
                kVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f59145a) {
            case 0:
                f1 f1Var = this.f59146b.f59153a;
                this.f59148e.getClass();
                return;
            default:
                f1 f1Var2 = this.f59146b.f59154b;
                this.f59148e.getClass();
                return;
        }
    }
}
