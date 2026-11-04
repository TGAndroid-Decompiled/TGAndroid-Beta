package u4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class h extends AnimatorListenerAdapter {
    public final int f55575a;
    public final i f55576b;
    public final ViewPropertyAnimator f55577c;
    public final View d;
    public final k f55578e;

    public h(k kVar, i iVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i3) {
        this.f55575a = i3;
        this.f55578e = kVar;
        this.f55576b = iVar;
        this.f55577c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f55575a) {
            case 0:
                this.f55577c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                k kVar = this.f55578e;
                if (kVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                i iVar = this.f55576b;
                d1 d1Var = iVar.f55585a;
                kVar.O();
                kVar.d(iVar.f55585a);
                kVar.B.remove(iVar.f55585a);
                kVar.G();
                return;
            default:
                this.f55577c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                k kVar2 = this.f55578e;
                if (kVar2.A(view2) > 0.0f) {
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                }
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                i iVar2 = this.f55576b;
                d1 d1Var2 = iVar2.f55586b;
                kVar2.O();
                kVar2.d(iVar2.f55586b);
                kVar2.B.remove(iVar2.f55586b);
                kVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f55575a) {
            case 0:
                d1 d1Var = this.f55576b.f55585a;
                this.f55578e.getClass();
                return;
            default:
                d1 d1Var2 = this.f55576b.f55586b;
                this.f55578e.getClass();
                return;
        }
    }
}
