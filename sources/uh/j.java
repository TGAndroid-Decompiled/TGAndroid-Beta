package uh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import f2.n1;
import java.util.ArrayList;
import org.telegram.ui.Cells.s1;
public final class j extends AnimatorListenerAdapter {
    public final int f49276a;
    public final f2.j f49277b;
    public final ViewPropertyAnimator f49278c;
    public final View d;
    public final m f49279e;

    public j(m mVar, f2.j jVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f49276a = i10;
        this.f49279e = mVar;
        this.f49277b = jVar;
        this.f49278c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49276a) {
            case 0:
                this.f49278c.setListener(null);
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
                m mVar = this.f49279e;
                ArrayList arrayList = mVar.B;
                f2.j jVar = this.f49277b;
                if (arrayList.remove(jVar.f6357a)) {
                    mVar.d(jVar.f6357a);
                    mVar.G();
                    return;
                }
                return;
            default:
                this.f49278c.setListener(null);
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
                m mVar2 = this.f49279e;
                ArrayList arrayList2 = mVar2.B;
                f2.j jVar2 = this.f49277b;
                if (arrayList2.remove(jVar2.f6358b)) {
                    mVar2.d(jVar2.f6358b);
                    mVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f49276a) {
            case 0:
                n1 n1Var = this.f49277b.f6357a;
                this.f49279e.getClass();
                return;
            default:
                n1 n1Var2 = this.f49277b.f6358b;
                this.f49279e.getClass();
                return;
        }
    }
}
