package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class wi1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.t1 f42411a;
    public final org.telegram.ui.Components.ui f42412b;
    public final xi1 f42413c;

    public wi1(xi1 xi1Var, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.Components.ui uiVar) {
        this.f42413c = xi1Var;
        this.f42411a = t1Var;
        this.f42412b = uiVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f42411a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.ui uiVar = this.f42412b;
        xi1 xi1Var = this.f42413c;
        ((ArrayList) uiVar.f30905c).remove(xi1Var);
        uiVar.a();
        ((ViewGroup) uiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = xi1Var.f42744g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
