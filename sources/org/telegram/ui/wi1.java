package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class wi1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.u1 f43825a;
    public final org.telegram.ui.Components.xi f43826b;
    public final xi1 f43827c;

    public wi1(xi1 xi1Var, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.Components.xi xiVar) {
        this.f43827c = xi1Var;
        this.f43825a = u1Var;
        this.f43826b = xiVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f43825a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.xi xiVar = this.f43826b;
        xi1 xi1Var = this.f43827c;
        ((ArrayList) xiVar.f32985c).remove(xi1Var);
        xiVar.a();
        ((ViewGroup) xiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = xi1Var.f44121g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
