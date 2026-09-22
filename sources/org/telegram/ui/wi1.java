package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class wi1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.t1 f39242a;
    public final org.telegram.ui.Components.ui f39243b;
    public final xi1 f39244c;

    public wi1(xi1 xi1Var, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.Components.ui uiVar) {
        this.f39244c = xi1Var;
        this.f39242a = t1Var;
        this.f39243b = uiVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f39242a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.ui uiVar = this.f39243b;
        xi1 xi1Var = this.f39244c;
        ((ArrayList) uiVar.f28410c).remove(xi1Var);
        uiVar.a();
        ((ViewGroup) uiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = xi1Var.f39641g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
