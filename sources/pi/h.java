package pi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.ui.Cells.q1;
import v4.f1;
public final class h extends AnimatorListenerAdapter {
    public final int f55669a;
    public final v4.i f55670b;
    public final ViewPropertyAnimator f55671c;
    public final View d;
    public final k f55672e;

    public h(k kVar, v4.i iVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i7) {
        this.f55669a = i7;
        this.f55672e = kVar;
        this.f55670b = iVar;
        this.f55671c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f55669a) {
            case 0:
                this.f55671c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleX(1.0f);
                if (view instanceof q1) {
                    ((q1) view).setAnimationOffsetX(0.0f);
                } else {
                    view.setTranslationX(0.0f);
                }
                view.setTranslationY(0.0f);
                k kVar = this.f55672e;
                ArrayList arrayList = kVar.B;
                v4.i iVar = this.f55670b;
                if (arrayList.remove(iVar.f59153a)) {
                    kVar.d(iVar.f59153a);
                    kVar.G();
                    return;
                }
                return;
            default:
                this.f55671c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setScaleX(1.0f);
                view2.setScaleX(1.0f);
                if (view2 instanceof q1) {
                    ((q1) view2).setAnimationOffsetX(0.0f);
                } else {
                    view2.setTranslationX(0.0f);
                }
                view2.setTranslationY(0.0f);
                k kVar2 = this.f55672e;
                ArrayList arrayList2 = kVar2.B;
                v4.i iVar2 = this.f55670b;
                if (arrayList2.remove(iVar2.f59154b)) {
                    kVar2.d(iVar2.f59154b);
                    kVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f55669a) {
            case 0:
                f1 f1Var = this.f55670b.f59153a;
                this.f55672e.getClass();
                return;
            default:
                f1 f1Var2 = this.f55670b.f59154b;
                this.f55672e.getClass();
                return;
        }
    }
}
