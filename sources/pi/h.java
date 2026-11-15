package pi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.ui.Cells.q1;
import v4.e1;
public final class h extends AnimatorListenerAdapter {
    public final int f55093a;
    public final v4.i f55094b;
    public final ViewPropertyAnimator f55095c;
    public final View d;
    public final k f55096e;

    public h(k kVar, v4.i iVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i7) {
        this.f55093a = i7;
        this.f55096e = kVar;
        this.f55094b = iVar;
        this.f55095c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f55093a) {
            case 0:
                this.f55095c.setListener(null);
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
                k kVar = this.f55096e;
                ArrayList arrayList = kVar.B;
                v4.i iVar = this.f55094b;
                if (arrayList.remove(iVar.f58573a)) {
                    kVar.d(iVar.f58573a);
                    kVar.G();
                    return;
                }
                return;
            default:
                this.f55095c.setListener(null);
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
                k kVar2 = this.f55096e;
                ArrayList arrayList2 = kVar2.B;
                v4.i iVar2 = this.f55094b;
                if (arrayList2.remove(iVar2.f58574b)) {
                    kVar2.d(iVar2.f58574b);
                    kVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f55093a) {
            case 0:
                e1 e1Var = this.f55094b.f58573a;
                this.f55096e.getClass();
                return;
            default:
                e1 e1Var2 = this.f55094b.f58574b;
                this.f55096e.getClass();
                return;
        }
    }
}
