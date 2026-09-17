package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class vi1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.t1 f38437a;
    public final org.telegram.ui.Components.ui f38438b;
    public final wi1 f38439c;

    public vi1(wi1 wi1Var, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.Components.ui uiVar) {
        this.f38439c = wi1Var;
        this.f38437a = t1Var;
        this.f38438b = uiVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f38437a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.ui uiVar = this.f38438b;
        wi1 wi1Var = this.f38439c;
        ((ArrayList) uiVar.f28393c).remove(wi1Var);
        uiVar.a();
        ((ViewGroup) uiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = wi1Var.f39052g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
