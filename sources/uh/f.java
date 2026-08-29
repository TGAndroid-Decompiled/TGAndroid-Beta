package uh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import f2.n1;
import java.util.ArrayList;
public final class f extends AnimatorListenerAdapter {
    public final int f49266a = 1;
    public final View f49267b;
    public final n1 f49268c;
    public final m d;

    public f(m mVar, n1 n1Var, View view) {
        this.d = mVar;
        this.f49268c = n1Var;
        this.f49267b = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f49266a) {
            case 0:
                this.f49267b.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49266a) {
            case 0:
                animator.removeAllListeners();
                View view = this.f49267b;
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setTranslationY(0.0f);
                view.setTranslationY(0.0f);
                m mVar = this.d;
                ArrayList arrayList = mVar.f6413y;
                n1 n1Var = this.f49268c;
                if (arrayList.remove(n1Var)) {
                    mVar.u(n1Var);
                    mVar.G();
                    return;
                }
                return;
            default:
                animator.removeAllListeners();
                View view2 = this.f49267b;
                view2.setAlpha(1.0f);
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                m mVar2 = this.d;
                ArrayList arrayList2 = mVar2.A;
                n1 n1Var2 = this.f49268c;
                if (arrayList2.remove(n1Var2)) {
                    mVar2.d(n1Var2);
                    mVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f49266a) {
            case 0:
                this.d.getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public f(m mVar, View view, n1 n1Var) {
        this.d = mVar;
        this.f49267b = view;
        this.f49268c = n1Var;
    }
}
