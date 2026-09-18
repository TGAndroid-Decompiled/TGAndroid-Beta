package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class vi1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.t1 f38442a;
    public final org.telegram.ui.Components.ui f38443b;
    public final wi1 f38444c;

    public vi1(wi1 wi1Var, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.Components.ui uiVar) {
        this.f38444c = wi1Var;
        this.f38442a = t1Var;
        this.f38443b = uiVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f38442a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.ui uiVar = this.f38443b;
        wi1 wi1Var = this.f38444c;
        ((ArrayList) uiVar.f28396c).remove(wi1Var);
        uiVar.a();
        ((ViewGroup) uiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = wi1Var.f39057g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
