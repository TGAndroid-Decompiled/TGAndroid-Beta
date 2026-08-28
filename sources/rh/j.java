package rh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import f2.q1;
import java.util.ArrayList;
import org.telegram.ui.Cells.t1;
public final class j extends AnimatorListenerAdapter {
    public final int f47239a;
    public final f2.l f47240b;
    public final ViewPropertyAnimator f47241c;
    public final View d;
    public final m f47242e;

    public j(m mVar, f2.l lVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i9) {
        this.f47239a = i9;
        this.f47242e = mVar;
        this.f47240b = lVar;
        this.f47241c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47239a) {
            case 0:
                this.f47241c.setListener(null);
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
                m mVar = this.f47242e;
                ArrayList arrayList = mVar.B;
                f2.l lVar = this.f47240b;
                if (arrayList.remove(lVar.f5414a)) {
                    mVar.d(lVar.f5414a);
                    mVar.G();
                    return;
                }
                return;
            default:
                this.f47241c.setListener(null);
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
                m mVar2 = this.f47242e;
                ArrayList arrayList2 = mVar2.B;
                f2.l lVar2 = this.f47240b;
                if (arrayList2.remove(lVar2.f5415b)) {
                    mVar2.d(lVar2.f5415b);
                    mVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f47239a) {
            case 0:
                q1 q1Var = this.f47240b.f5414a;
                this.f47242e.getClass();
                return;
            default:
                q1 q1Var2 = this.f47240b.f5415b;
                this.f47242e.getClass();
                return;
        }
    }
}
