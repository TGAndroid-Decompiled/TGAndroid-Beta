package sh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import f2.o1;
import java.util.ArrayList;

public final class f extends AnimatorListenerAdapter {

    public final int f47950a = 1;

    public final View f47951b;

    public final o1 f47952c;
    public final m d;

    public f(m mVar, o1 o1Var, View view) {
        this.d = mVar;
        this.f47952c = o1Var;
        this.f47951b = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f47950a) {
            case 0:
                this.f47951b.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47950a) {
            case 0:
                animator.removeAllListeners();
                View view = this.f47951b;
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setTranslationY(0.0f);
                view.setTranslationY(0.0f);
                m mVar = this.d;
                ArrayList arrayList = mVar.f5746y;
                o1 o1Var = this.f47952c;
                if (arrayList.remove(o1Var)) {
                    mVar.u(o1Var);
                    mVar.G();
                }
                break;
            default:
                animator.removeAllListeners();
                View view2 = this.f47951b;
                view2.setAlpha(1.0f);
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                m mVar2 = this.d;
                ArrayList arrayList2 = mVar2.A;
                o1 o1Var2 = this.f47952c;
                if (arrayList2.remove(o1Var2)) {
                    mVar2.d(o1Var2);
                    mVar2.G();
                }
                break;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f47950a) {
            case 0:
                this.d.getClass();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public f(m mVar, View view, o1 o1Var) {
        this.d = mVar;
        this.f47951b = view;
        this.f47952c = o1Var;
    }
}
