package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class vi1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.u1 f38569a;
    public final org.telegram.ui.Components.ui f38570b;
    public final wi1 f38571c;

    public vi1(wi1 wi1Var, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.Components.ui uiVar) {
        this.f38571c = wi1Var;
        this.f38569a = u1Var;
        this.f38570b = uiVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f38569a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.ui uiVar = this.f38570b;
        wi1 wi1Var = this.f38571c;
        ((ArrayList) uiVar.f28686c).remove(wi1Var);
        uiVar.a();
        ((ViewGroup) uiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = wi1Var.f39166g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
