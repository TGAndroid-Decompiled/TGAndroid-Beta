package pi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
import v4.e1;
public final class f extends AnimatorListenerAdapter {
    public final int f55673a = 1;
    public final View f55674b;
    public final e1 f55675c;
    public final k d;

    public f(k kVar, e1 e1Var, View view) {
        this.d = kVar;
        this.f55675c = e1Var;
        this.f55674b = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f55673a) {
            case 0:
                this.f55674b.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f55673a) {
            case 0:
                animator.removeAllListeners();
                View view = this.f55674b;
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setTranslationY(0.0f);
                view.setTranslationY(0.0f);
                k kVar = this.d;
                ArrayList arrayList = kVar.f59170y;
                e1 e1Var = this.f55675c;
                if (arrayList.remove(e1Var)) {
                    kVar.u(e1Var);
                    kVar.G();
                    return;
                }
                return;
            default:
                animator.removeAllListeners();
                View view2 = this.f55674b;
                view2.setAlpha(1.0f);
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                k kVar2 = this.d;
                ArrayList arrayList2 = kVar2.A;
                e1 e1Var2 = this.f55675c;
                if (arrayList2.remove(e1Var2)) {
                    kVar2.d(e1Var2);
                    kVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f55673a) {
            case 0:
                this.d.getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public f(k kVar, View view, e1 e1Var) {
        this.d = kVar;
        this.f55674b = view;
        this.f55675c = e1Var;
    }
}
