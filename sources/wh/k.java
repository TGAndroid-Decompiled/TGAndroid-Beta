package wh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import f2.l1;
import java.util.ArrayList;
import org.telegram.ui.Cells.t1;
public final class k extends AnimatorListenerAdapter {
    public final int f46610a;
    public final f2.j f46611b;
    public final ViewPropertyAnimator f46612c;
    public final View d;
    public final n e;

    public k(n nVar, f2.j jVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f46610a = i10;
        this.e = nVar;
        this.f46611b = jVar;
        this.f46612c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46610a) {
            case 0:
                this.f46612c.setListener(null);
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
                n nVar = this.e;
                ArrayList arrayList = nVar.B;
                f2.j jVar = this.f46611b;
                if (arrayList.remove(jVar.f5753a)) {
                    nVar.d(jVar.f5753a);
                    nVar.G();
                    return;
                }
                return;
            default:
                this.f46612c.setListener(null);
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
                n nVar2 = this.e;
                ArrayList arrayList2 = nVar2.B;
                f2.j jVar2 = this.f46611b;
                if (arrayList2.remove(jVar2.f5754b)) {
                    nVar2.d(jVar2.f5754b);
                    nVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f46610a) {
            case 0:
                l1 l1Var = this.f46611b.f5753a;
                this.e.getClass();
                return;
            default:
                l1 l1Var2 = this.f46611b.f5754b;
                this.e.getClass();
                return;
        }
    }
}
