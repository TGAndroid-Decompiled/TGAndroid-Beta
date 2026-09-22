package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class vi1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.u1 f38588a;
    public final org.telegram.ui.Components.ui f38589b;
    public final wi1 f38590c;

    public vi1(wi1 wi1Var, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.Components.ui uiVar) {
        this.f38590c = wi1Var;
        this.f38588a = u1Var;
        this.f38589b = uiVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f38588a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.ui uiVar = this.f38589b;
        wi1 wi1Var = this.f38590c;
        ((ArrayList) uiVar.f28786c).remove(wi1Var);
        uiVar.a();
        ((ViewGroup) uiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = wi1Var.f39192g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
