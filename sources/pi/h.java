package pi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.ui.Cells.r1;
import v4.f1;
public final class h extends AnimatorListenerAdapter {
    public final int f55710a;
    public final v4.i f55711b;
    public final ViewPropertyAnimator f55712c;
    public final View d;
    public final k f55713e;

    public h(k kVar, v4.i iVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i7) {
        this.f55710a = i7;
        this.f55713e = kVar;
        this.f55711b = iVar;
        this.f55712c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f55710a) {
            case 0:
                this.f55712c.setListener(null);
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
                k kVar = this.f55713e;
                ArrayList arrayList = kVar.B;
                v4.i iVar = this.f55711b;
                if (arrayList.remove(iVar.f59192a)) {
                    kVar.d(iVar.f59192a);
                    kVar.G();
                    return;
                }
                return;
            default:
                this.f55712c.setListener(null);
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
                k kVar2 = this.f55713e;
                ArrayList arrayList2 = kVar2.B;
                v4.i iVar2 = this.f55711b;
                if (arrayList2.remove(iVar2.f59193b)) {
                    kVar2.d(iVar2.f59193b);
                    kVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f55710a) {
            case 0:
                f1 f1Var = this.f55711b.f59192a;
                this.f55713e.getClass();
                return;
            default:
                f1 f1Var2 = this.f55711b.f59193b;
                this.f55713e.getClass();
                return;
        }
    }
}
