package wh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import f2.l1;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.t1;
public final class j extends AnimatorListenerAdapter {
    public final l1 f46607a;
    public final int f46608b;
    public final View f46609c;
    public final n d;

    public j(n nVar, l1 l1Var, int i10, View view) {
        this.d = nVar;
        this.f46607a = l1Var;
        this.f46608b = i10;
        this.f46609c = view;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        if (this.f46608b != 0) {
            this.f46609c.setTranslationY(0.0f);
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        animator.removeAllListeners();
        l1 l1Var = this.f46607a;
        View view = l1Var.f5785a;
        n nVar = this.d;
        nVar.X(view);
        View view2 = l1Var.f5785a;
        if (view2 instanceof t1) {
            t1 t1Var = (t1) view2;
            if (t1Var.f22008cd) {
                t1Var.f22008cd = false;
                t1Var.setVisibility(0);
            }
            MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
            if (currentMessagesGroup != null) {
                currentMessagesGroup.transitionParams.reset();
            }
        }
        if (nVar.f5783z.remove(l1Var)) {
            nVar.v(l1Var);
            nVar.G();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        this.d.getClass();
    }
}
