package pi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.ui.Cells.r1;
import v4.f1;
public final class h extends AnimatorListenerAdapter {
    public final int f55792a;
    public final v4.j f55793b;
    public final ViewPropertyAnimator f55794c;
    public final View d;
    public final k f55795e;

    public h(k kVar, v4.j jVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i7) {
        this.f55792a = i7;
        this.f55795e = kVar;
        this.f55793b = jVar;
        this.f55794c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f55792a) {
            case 0:
                this.f55794c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleX(1.0f);
                if (view instanceof r1) {
                    ((r1) view).setAnimationOffsetX(0.0f);
                } else {
                    view.setTranslationX(0.0f);
                }
                view.setTranslationY(0.0f);
                k kVar = this.f55795e;
                ArrayList arrayList = kVar.B;
                v4.j jVar = this.f55793b;
                if (arrayList.remove(jVar.f59283a)) {
                    kVar.d(jVar.f59283a);
                    kVar.G();
                    return;
                }
                return;
            default:
                this.f55794c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setScaleX(1.0f);
                view2.setScaleX(1.0f);
                if (view2 instanceof r1) {
                    ((r1) view2).setAnimationOffsetX(0.0f);
                } else {
                    view2.setTranslationX(0.0f);
                }
                view2.setTranslationY(0.0f);
                k kVar2 = this.f55795e;
                ArrayList arrayList2 = kVar2.B;
                v4.j jVar2 = this.f55793b;
                if (arrayList2.remove(jVar2.f59284b)) {
                    kVar2.d(jVar2.f59284b);
                    kVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f55792a) {
            case 0:
                f1 f1Var = this.f55793b.f59283a;
                this.f55795e.getClass();
                return;
            default:
                f1 f1Var2 = this.f55793b.f59284b;
                this.f55795e.getClass();
                return;
        }
    }
}
