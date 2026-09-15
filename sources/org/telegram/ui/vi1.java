package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class vi1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.t1 f38633a;
    public final org.telegram.ui.Components.ui f38634b;
    public final wi1 f38635c;

    public vi1(wi1 wi1Var, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.Components.ui uiVar) {
        this.f38635c = wi1Var;
        this.f38633a = t1Var;
        this.f38634b = uiVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f38633a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.ui uiVar = this.f38634b;
        wi1 wi1Var = this.f38635c;
        ((ArrayList) uiVar.f28413c).remove(wi1Var);
        uiVar.a();
        ((ViewGroup) uiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = wi1Var.f39244g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
