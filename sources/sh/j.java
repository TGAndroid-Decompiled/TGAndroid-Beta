package sh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import f2.o1;
import java.util.ArrayList;
import org.telegram.ui.Cells.s1;

public final class j extends AnimatorListenerAdapter {

    public final int f47960a;

    public final f2.j f47961b;

    public final ViewPropertyAnimator f47962c;
    public final View d;

    public final m f47963e;

    public j(m mVar, f2.j jVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f47960a = i10;
        this.f47963e = mVar;
        this.f47961b = jVar;
        this.f47962c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47960a) {
            case 0:
                this.f47962c.setListener(null);
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
                m mVar = this.f47963e;
                ArrayList arrayList = mVar.B;
                f2.j jVar = this.f47961b;
                if (arrayList.remove(jVar.f5702a)) {
                    mVar.d(jVar.f5702a);
                    mVar.G();
                }
                break;
            default:
                this.f47962c.setListener(null);
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
                m mVar2 = this.f47963e;
                ArrayList arrayList2 = mVar2.B;
                f2.j jVar2 = this.f47961b;
                if (arrayList2.remove(jVar2.f5703b)) {
                    mVar2.d(jVar2.f5703b);
                    mVar2.G();
                }
                break;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f47960a) {
            case 0:
                o1 o1Var = this.f47961b.f5702a;
                this.f47963e.getClass();
                break;
            default:
                o1 o1Var2 = this.f47961b.f5703b;
                this.f47963e.getClass();
                break;
        }
    }
}
