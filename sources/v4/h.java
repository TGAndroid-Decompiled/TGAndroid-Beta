package v4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class h extends AnimatorListenerAdapter {
    public final int f57088a;
    public final i f57089b;
    public final ViewPropertyAnimator f57090c;
    public final View d;
    public final k f57091e;

    public h(k kVar, i iVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i7) {
        this.f57088a = i7;
        this.f57091e = kVar;
        this.f57089b = iVar;
        this.f57090c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f57088a) {
            case 0:
                this.f57090c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                k kVar = this.f57091e;
                if (kVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                i iVar = this.f57089b;
                d1 d1Var = iVar.f57096a;
                kVar.O();
                kVar.d(iVar.f57096a);
                kVar.B.remove(iVar.f57096a);
                kVar.G();
                return;
            default:
                this.f57090c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                k kVar2 = this.f57091e;
                if (kVar2.A(view2) > 0.0f) {
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                }
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                i iVar2 = this.f57089b;
                d1 d1Var2 = iVar2.f57097b;
                kVar2.O();
                kVar2.d(iVar2.f57097b);
                kVar2.B.remove(iVar2.f57097b);
                kVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f57088a) {
            case 0:
                d1 d1Var = this.f57089b.f57096a;
                this.f57091e.getClass();
                return;
            default:
                d1 d1Var2 = this.f57089b.f57097b;
                this.f57091e.getClass();
                return;
        }
    }
}
