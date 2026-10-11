package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class wi1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.u1 f43791a;
    public final org.telegram.ui.Components.xi f43792b;
    public final xi1 f43793c;

    public wi1(xi1 xi1Var, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.Components.xi xiVar) {
        this.f43793c = xi1Var;
        this.f43791a = u1Var;
        this.f43792b = xiVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f43791a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.xi xiVar = this.f43792b;
        xi1 xi1Var = this.f43793c;
        ((ArrayList) xiVar.f32923c).remove(xi1Var);
        xiVar.a();
        ((ViewGroup) xiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = xi1Var.f44087g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
