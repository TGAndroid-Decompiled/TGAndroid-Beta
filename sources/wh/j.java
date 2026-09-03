package wh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import f2.l1;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.s1;
public final class j extends AnimatorListenerAdapter {
    public final l1 f46676a;
    public final int f46677b;
    public final View f46678c;
    public final n d;

    public j(n nVar, l1 l1Var, int i10, View view) {
        this.d = nVar;
        this.f46676a = l1Var;
        this.f46677b = i10;
        this.f46678c = view;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        if (this.f46677b != 0) {
            this.f46678c.setTranslationY(0.0f);
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        animator.removeAllListeners();
        l1 l1Var = this.f46676a;
        View view = l1Var.f5774a;
        n nVar = this.d;
        nVar.X(view);
        View view2 = l1Var.f5774a;
        if (view2 instanceof s1) {
            s1 s1Var = (s1) view2;
            if (s1Var.f21945cd) {
                s1Var.f21945cd = false;
                s1Var.setVisibility(0);
            }
            MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
            if (currentMessagesGroup != null) {
                currentMessagesGroup.transitionParams.reset();
            }
        }
        if (nVar.f5772z.remove(l1Var)) {
            nVar.v(l1Var);
            nVar.G();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        this.d.getClass();
    }
}
