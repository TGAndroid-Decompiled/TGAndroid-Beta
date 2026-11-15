package v4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class h extends AnimatorListenerAdapter {
    public final int f58566a;
    public final i f58567b;
    public final ViewPropertyAnimator f58568c;
    public final View d;
    public final k f58569e;

    public h(k kVar, i iVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i7) {
        this.f58566a = i7;
        this.f58569e = kVar;
        this.f58567b = iVar;
        this.f58568c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f58566a) {
            case 0:
                this.f58568c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                k kVar = this.f58569e;
                if (kVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                i iVar = this.f58567b;
                e1 e1Var = iVar.f58573a;
                kVar.O();
                kVar.d(iVar.f58573a);
                kVar.B.remove(iVar.f58573a);
                kVar.G();
                return;
            default:
                this.f58568c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                k kVar2 = this.f58569e;
                if (kVar2.A(view2) > 0.0f) {
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                }
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                i iVar2 = this.f58567b;
                e1 e1Var2 = iVar2.f58574b;
                kVar2.O();
                kVar2.d(iVar2.f58574b);
                kVar2.B.remove(iVar2.f58574b);
                kVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f58566a) {
            case 0:
                e1 e1Var = this.f58567b.f58573a;
                this.f58569e.getClass();
                return;
            default:
                e1 e1Var2 = this.f58567b.f58574b;
                this.f58569e.getClass();
                return;
        }
    }
}
