package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class zi1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.u1 f44857a;
    public final org.telegram.ui.Components.zi f44858b;
    public final aj1 f44859c;

    public zi1(aj1 aj1Var, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.Components.zi ziVar) {
        this.f44859c = aj1Var;
        this.f44857a = u1Var;
        this.f44858b = ziVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f44857a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.zi ziVar = this.f44858b;
        aj1 aj1Var = this.f44859c;
        ((ArrayList) ziVar.f33381c).remove(aj1Var);
        ziVar.a();
        ((ViewGroup) ziVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = aj1Var.f35862g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
