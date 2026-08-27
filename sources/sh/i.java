package sh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import f2.o1;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.s1;

public final class i extends AnimatorListenerAdapter {

    public final o1 f47957a;

    public final int f47958b;

    public final View f47959c;
    public final m d;

    public i(m mVar, o1 o1Var, int i10, View view) {
        this.d = mVar;
        this.f47957a = o1Var;
        this.f47958b = i10;
        this.f47959c = view;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        if (this.f47958b != 0) {
            this.f47959c.setTranslationY(0.0f);
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        animator.removeAllListeners();
        o1 o1Var = this.f47957a;
        View view = o1Var.f5789a;
        m mVar = this.d;
        mVar.X(view);
        View view2 = o1Var.f5789a;
        if (view2 instanceof s1) {
            s1 s1Var = (s1) view2;
            if (s1Var.f25279bd) {
                s1Var.f25279bd = false;
                s1Var.setVisibility(0);
            }
            MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
            if (currentMessagesGroup != null) {
                currentMessagesGroup.transitionParams.reset();
            }
        }
        if (mVar.f5747z.remove(o1Var)) {
            mVar.v(o1Var);
            mVar.G();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        this.d.getClass();
    }
}
