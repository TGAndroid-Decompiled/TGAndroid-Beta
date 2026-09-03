package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import f2.m1;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.t1;
public final class j extends AnimatorListenerAdapter {
    public final m1 f50662a;
    public final int f50663b;
    public final View f50664c;
    public final n d;

    public j(n nVar, m1 m1Var, int i10, View view) {
        this.d = nVar;
        this.f50662a = m1Var;
        this.f50663b = i10;
        this.f50664c = view;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        if (this.f50663b != 0) {
            this.f50664c.setTranslationY(0.0f);
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        animator.removeAllListeners();
        m1 m1Var = this.f50662a;
        View view = m1Var.f5875a;
        n nVar = this.d;
        nVar.X(view);
        View view2 = m1Var.f5875a;
        if (view2 instanceof t1) {
            t1 t1Var = (t1) view2;
            if (t1Var.f23810cd) {
                t1Var.f23810cd = false;
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
