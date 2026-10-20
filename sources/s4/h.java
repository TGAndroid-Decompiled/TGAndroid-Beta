package s4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class h extends AnimatorListenerAdapter {
    public final int f45967a;
    public final i f45968b;
    public final ViewPropertyAnimator f45969c;
    public final View d;
    public final k e;

    public h(k kVar, i iVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f45967a = i10;
        this.e = kVar;
        this.f45968b = iVar;
        this.f45969c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45967a) {
            case 0:
                this.f45969c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                k kVar = this.e;
                if (kVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                i iVar = this.f45968b;
                b1 b1Var = iVar.f45970a;
                kVar.O();
                kVar.d(iVar.f45970a);
                kVar.B.remove(iVar.f45970a);
                kVar.G();
                return;
            default:
                this.f45969c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                k kVar2 = this.e;
                if (kVar2.A(view2) > 0.0f) {
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                }
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                i iVar2 = this.f45968b;
                b1 b1Var2 = iVar2.f45971b;
                kVar2.O();
                kVar2.d(iVar2.f45971b);
                kVar2.B.remove(iVar2.f45971b);
                kVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f45967a) {
            case 0:
                b1 b1Var = this.f45968b.f45970a;
                this.e.getClass();
                return;
            default:
                b1 b1Var2 = this.f45968b.f45971b;
                this.e.getClass();
                return;
        }
    }
}
