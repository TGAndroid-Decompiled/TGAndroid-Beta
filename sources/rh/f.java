package rh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import f2.q1;
import java.util.ArrayList;
public final class f extends AnimatorListenerAdapter {
    public final int f47229a = 1;
    public final View f47230b;
    public final q1 f47231c;
    public final m d;

    public f(m mVar, q1 q1Var, View view) {
        this.d = mVar;
        this.f47231c = q1Var;
        this.f47230b = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f47229a) {
            case 0:
                this.f47230b.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47229a) {
            case 0:
                animator.removeAllListeners();
                View view = this.f47230b;
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setTranslationY(0.0f);
                view.setTranslationY(0.0f);
                m mVar = this.d;
                ArrayList arrayList = mVar.f5458y;
                q1 q1Var = this.f47231c;
                if (arrayList.remove(q1Var)) {
                    mVar.u(q1Var);
                    mVar.G();
                    return;
                }
                return;
            default:
                animator.removeAllListeners();
                View view2 = this.f47230b;
                view2.setAlpha(1.0f);
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                m mVar2 = this.d;
                ArrayList arrayList2 = mVar2.A;
                q1 q1Var2 = this.f47231c;
                if (arrayList2.remove(q1Var2)) {
                    mVar2.d(q1Var2);
                    mVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f47229a) {
            case 0:
                this.d.getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public f(m mVar, View view, q1 q1Var) {
        this.d = mVar;
        this.f47230b = view;
        this.f47231c = q1Var;
    }
}
