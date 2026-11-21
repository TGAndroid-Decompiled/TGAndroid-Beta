package pi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
import v4.f1;
public final class f extends AnimatorListenerAdapter {
    public final int f55704a = 1;
    public final View f55705b;
    public final f1 f55706c;
    public final k d;

    public f(k kVar, f1 f1Var, View view) {
        this.d = kVar;
        this.f55706c = f1Var;
        this.f55705b = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f55704a) {
            case 0:
                this.f55705b.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f55704a) {
            case 0:
                animator.removeAllListeners();
                View view = this.f55705b;
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setTranslationY(0.0f);
                view.setTranslationY(0.0f);
                k kVar = this.d;
                ArrayList arrayList = kVar.f59217y;
                f1 f1Var = this.f55706c;
                if (arrayList.remove(f1Var)) {
                    kVar.u(f1Var);
                    kVar.G();
                    return;
                }
                return;
            default:
                animator.removeAllListeners();
                View view2 = this.f55705b;
                view2.setAlpha(1.0f);
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                k kVar2 = this.d;
                ArrayList arrayList2 = kVar2.A;
                f1 f1Var2 = this.f55706c;
                if (arrayList2.remove(f1Var2)) {
                    kVar2.d(f1Var2);
                    kVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f55704a) {
            case 0:
                this.d.getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public f(k kVar, View view, f1 f1Var) {
        this.d = kVar;
        this.f55705b = view;
        this.f55706c = f1Var;
    }
}
