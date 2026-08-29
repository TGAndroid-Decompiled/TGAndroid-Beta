package uh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import f2.n1;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.s1;
public final class i extends AnimatorListenerAdapter {
    public final n1 f49273a;
    public final int f49274b;
    public final View f49275c;
    public final m d;

    public i(m mVar, n1 n1Var, int i10, View view) {
        this.d = mVar;
        this.f49273a = n1Var;
        this.f49274b = i10;
        this.f49275c = view;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        if (this.f49274b != 0) {
            this.f49275c.setTranslationY(0.0f);
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        animator.removeAllListeners();
        n1 n1Var = this.f49273a;
        View view = n1Var.f6432a;
        m mVar = this.d;
        mVar.X(view);
        View view2 = n1Var.f6432a;
        if (view2 instanceof s1) {
            s1 s1Var = (s1) view2;
            if (s1Var.f25292bd) {
                s1Var.f25292bd = false;
                s1Var.setVisibility(0);
            }
            MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
            if (currentMessagesGroup != null) {
                currentMessagesGroup.transitionParams.reset();
            }
        }
        if (mVar.f6414z.remove(n1Var)) {
            mVar.v(n1Var);
            mVar.G();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        this.d.getClass();
    }
}
