package wh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import f2.l1;
import java.util.ArrayList;
import org.telegram.ui.Cells.s1;
public final class k extends AnimatorListenerAdapter {
    public final int f46679a;
    public final f2.j f46680b;
    public final ViewPropertyAnimator f46681c;
    public final View d;
    public final n e;

    public k(n nVar, f2.j jVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f46679a = i10;
        this.e = nVar;
        this.f46680b = jVar;
        this.f46681c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46679a) {
            case 0:
                this.f46681c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleX(1.0f);
                if (view instanceof s1) {
                    ((s1) view).setAnimationOffsetX(0.0f);
                } else {
                    view.setTranslationX(0.0f);
                }
                view.setTranslationY(0.0f);
                n nVar = this.e;
                ArrayList arrayList = nVar.B;
                f2.j jVar = this.f46680b;
                if (arrayList.remove(jVar.f5742a)) {
                    nVar.d(jVar.f5742a);
                    nVar.G();
                    return;
                }
                return;
            default:
                this.f46681c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setScaleX(1.0f);
                view2.setScaleX(1.0f);
                if (view2 instanceof s1) {
                    ((s1) view2).setAnimationOffsetX(0.0f);
                } else {
                    view2.setTranslationX(0.0f);
                }
                view2.setTranslationY(0.0f);
                n nVar2 = this.e;
                ArrayList arrayList2 = nVar2.B;
                f2.j jVar2 = this.f46680b;
                if (arrayList2.remove(jVar2.f5743b)) {
                    nVar2.d(jVar2.f5743b);
                    nVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f46679a) {
            case 0:
                l1 l1Var = this.f46680b.f5742a;
                this.e.getClass();
                return;
            default:
                l1 l1Var2 = this.f46680b.f5743b;
                this.e.getClass();
                return;
        }
    }
}
