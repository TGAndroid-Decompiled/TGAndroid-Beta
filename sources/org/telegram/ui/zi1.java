package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class zi1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.u1 f44862a;
    public final org.telegram.ui.Components.zi f44863b;
    public final aj1 f44864c;

    public zi1(aj1 aj1Var, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.Components.zi ziVar) {
        this.f44864c = aj1Var;
        this.f44862a = u1Var;
        this.f44863b = ziVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f44862a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.zi ziVar = this.f44863b;
        aj1 aj1Var = this.f44864c;
        ((ArrayList) ziVar.f33389c).remove(aj1Var);
        ziVar.a();
        ((ViewGroup) ziVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = aj1Var.f35864g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
