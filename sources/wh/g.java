package wh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import f2.l1;
import java.util.ArrayList;
public final class g extends AnimatorListenerAdapter {
    public final int f46600a = 1;
    public final View f46601b;
    public final l1 f46602c;
    public final n d;

    public g(n nVar, l1 l1Var, View view) {
        this.d = nVar;
        this.f46602c = l1Var;
        this.f46601b = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f46600a) {
            case 0:
                this.f46601b.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46600a) {
            case 0:
                animator.removeAllListeners();
                View view = this.f46601b;
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setTranslationY(0.0f);
                view.setTranslationY(0.0f);
                n nVar = this.d;
                ArrayList arrayList = nVar.f5782y;
                l1 l1Var = this.f46602c;
                if (arrayList.remove(l1Var)) {
                    nVar.u(l1Var);
                    nVar.G();
                    return;
                }
                return;
            default:
                animator.removeAllListeners();
                View view2 = this.f46601b;
                view2.setAlpha(1.0f);
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                n nVar2 = this.d;
                ArrayList arrayList2 = nVar2.A;
                l1 l1Var2 = this.f46602c;
                if (arrayList2.remove(l1Var2)) {
                    nVar2.d(l1Var2);
                    nVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f46600a) {
            case 0:
                this.d.getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public g(n nVar, View view, l1 l1Var) {
        this.d = nVar;
        this.f46601b = view;
        this.f46602c = l1Var;
    }
}
