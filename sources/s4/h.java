package s4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class h extends AnimatorListenerAdapter {
    public final int f44888a;
    public final i f44889b;
    public final ViewPropertyAnimator f44890c;
    public final View d;
    public final k e;

    public h(k kVar, i iVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f44888a = i10;
        this.e = kVar;
        this.f44889b = iVar;
        this.f44890c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44888a) {
            case 0:
                this.f44890c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                k kVar = this.e;
                if (kVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                i iVar = this.f44889b;
                b1 b1Var = iVar.f44891a;
                kVar.O();
                kVar.d(iVar.f44891a);
                kVar.B.remove(iVar.f44891a);
                kVar.G();
                return;
            default:
                this.f44890c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                k kVar2 = this.e;
                if (kVar2.A(view2) > 0.0f) {
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                }
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                i iVar2 = this.f44889b;
                b1 b1Var2 = iVar2.f44892b;
                kVar2.O();
                kVar2.d(iVar2.f44892b);
                kVar2.B.remove(iVar2.f44892b);
                kVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f44888a) {
            case 0:
                b1 b1Var = this.f44889b.f44891a;
                this.e.getClass();
                return;
            default:
                b1 b1Var2 = this.f44889b.f44892b;
                this.e.getClass();
                return;
        }
    }
}
