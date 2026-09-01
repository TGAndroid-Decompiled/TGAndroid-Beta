package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import f2.m1;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.t1;
public final class j extends AnimatorListenerAdapter {
    public final m1 f50626a;
    public final int f50627b;
    public final View f50628c;
    public final n d;

    public j(n nVar, m1 m1Var, int i10, View view) {
        this.d = nVar;
        this.f50626a = m1Var;
        this.f50627b = i10;
        this.f50628c = view;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        if (this.f50627b != 0) {
            this.f50628c.setTranslationY(0.0f);
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        animator.removeAllListeners();
        m1 m1Var = this.f50626a;
        View view = m1Var.f5875a;
        n nVar = this.d;
        nVar.X(view);
        View view2 = m1Var.f5875a;
        if (view2 instanceof t1) {
            t1 t1Var = (t1) view2;
            if (t1Var.f23808cd) {
                t1Var.f23808cd = false;
                t1Var.setVisibility(0);
            }
            MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
            if (currentMessagesGroup != null) {
                currentMessagesGroup.transitionParams.reset();
            }
        }
        if (nVar.f5862z.remove(m1Var)) {
            nVar.v(m1Var);
            nVar.G();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        this.d.getClass();
    }
}
