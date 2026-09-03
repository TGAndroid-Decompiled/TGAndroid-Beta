package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import f2.m1;
import java.util.ArrayList;
public final class g extends AnimatorListenerAdapter {
    public final int f50655a = 1;
    public final View f50656b;
    public final m1 f50657c;
    public final n d;

    public g(n nVar, m1 m1Var, View view) {
        this.d = nVar;
        this.f50657c = m1Var;
        this.f50656b = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f50655a) {
            case 0:
                this.f50656b.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50655a) {
            case 0:
                animator.removeAllListeners();
                View view = this.f50656b;
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setTranslationY(0.0f);
                view.setTranslationY(0.0f);
                n nVar = this.d;
                ArrayList arrayList = nVar.f5861y;
                m1 m1Var = this.f50657c;
                if (arrayList.remove(m1Var)) {
                    nVar.u(m1Var);
                    nVar.G();
                    return;
                }
                return;
            default:
                animator.removeAllListeners();
                View view2 = this.f50656b;
                view2.setAlpha(1.0f);
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                n nVar2 = this.d;
                ArrayList arrayList2 = nVar2.A;
                m1 m1Var2 = this.f50657c;
                if (arrayList2.remove(m1Var2)) {
                    nVar2.d(m1Var2);
                    nVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f50655a) {
            case 0:
                this.d.getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public g(n nVar, View view, m1 m1Var) {
        this.d = nVar;
        this.f50656b = view;
        this.f50657c = m1Var;
    }
}
