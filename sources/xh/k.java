package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import f2.m1;
import java.util.ArrayList;
import org.telegram.ui.Cells.t1;
public final class k extends AnimatorListenerAdapter {
    public final int f50629a;
    public final f2.j f50630b;
    public final ViewPropertyAnimator f50631c;
    public final View d;
    public final n f50632e;

    public k(n nVar, f2.j jVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f50629a = i10;
        this.f50632e = nVar;
        this.f50630b = jVar;
        this.f50631c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50629a) {
            case 0:
                this.f50631c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleX(1.0f);
                if (view instanceof t1) {
                    ((t1) view).setAnimationOffsetX(0.0f);
                } else {
                    view.setTranslationX(0.0f);
                }
                view.setTranslationY(0.0f);
                n nVar = this.f50632e;
                ArrayList arrayList = nVar.B;
                f2.j jVar = this.f50630b;
                if (arrayList.remove(jVar.f5811a)) {
                    nVar.d(jVar.f5811a);
                    nVar.G();
                    return;
                }
                return;
            default:
                this.f50631c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setScaleX(1.0f);
                view2.setScaleX(1.0f);
                if (view2 instanceof t1) {
                    ((t1) view2).setAnimationOffsetX(0.0f);
                } else {
                    view2.setTranslationX(0.0f);
                }
                view2.setTranslationY(0.0f);
                n nVar2 = this.f50632e;
                ArrayList arrayList2 = nVar2.B;
                f2.j jVar2 = this.f50630b;
                if (arrayList2.remove(jVar2.f5812b)) {
                    nVar2.d(jVar2.f5812b);
                    nVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f50629a) {
            case 0:
                m1 m1Var = this.f50630b.f5811a;
                this.f50632e.getClass();
                return;
            default:
                m1 m1Var2 = this.f50630b.f5812b;
                this.f50632e.getClass();
                return;
        }
    }
}
