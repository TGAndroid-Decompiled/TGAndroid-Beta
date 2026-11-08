package v4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class h extends AnimatorListenerAdapter {
    public final int f57080a;
    public final i f57081b;
    public final ViewPropertyAnimator f57082c;
    public final View d;
    public final k f57083e;

    public h(k kVar, i iVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i7) {
        this.f57080a = i7;
        this.f57083e = kVar;
        this.f57081b = iVar;
        this.f57082c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f57080a) {
            case 0:
                this.f57082c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                k kVar = this.f57083e;
                if (kVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                i iVar = this.f57081b;
                d1 d1Var = iVar.f57088a;
                kVar.O();
                kVar.d(iVar.f57088a);
                kVar.B.remove(iVar.f57088a);
                kVar.G();
                return;
            default:
                this.f57082c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                k kVar2 = this.f57083e;
                if (kVar2.A(view2) > 0.0f) {
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                }
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                i iVar2 = this.f57081b;
                d1 d1Var2 = iVar2.f57089b;
                kVar2.O();
                kVar2.d(iVar2.f57089b);
                kVar2.B.remove(iVar2.f57089b);
                kVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f57080a) {
            case 0:
                d1 d1Var = this.f57081b.f57088a;
                this.f57083e.getClass();
                return;
            default:
                d1 d1Var2 = this.f57081b.f57089b;
                this.f57083e.getClass();
                return;
        }
    }
}
