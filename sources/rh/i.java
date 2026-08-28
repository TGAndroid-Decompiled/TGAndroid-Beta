package rh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import f2.q1;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.t1;
public final class i extends AnimatorListenerAdapter {
    public final q1 f47236a;
    public final int f47237b;
    public final View f47238c;
    public final m d;

    public i(m mVar, q1 q1Var, int i9, View view) {
        this.d = mVar;
        this.f47236a = q1Var;
        this.f47237b = i9;
        this.f47238c = view;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        if (this.f47237b != 0) {
            this.f47238c.setTranslationY(0.0f);
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        animator.removeAllListeners();
        q1 q1Var = this.f47236a;
        View view = q1Var.f5501a;
        m mVar = this.d;
        mVar.X(view);
        View view2 = q1Var.f5501a;
        if (view2 instanceof t1) {
            t1 t1Var = (t1) view2;
            if (t1Var.f25326bd) {
                t1Var.f25326bd = false;
                t1Var.setVisibility(0);
            }
            MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
            if (currentMessagesGroup != null) {
                currentMessagesGroup.transitionParams.reset();
            }
        }
        if (mVar.f5459z.remove(q1Var)) {
            mVar.v(q1Var);
            mVar.G();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        this.d.getClass();
    }
}
