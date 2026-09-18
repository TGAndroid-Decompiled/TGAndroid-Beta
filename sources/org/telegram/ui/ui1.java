package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ui1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.u1 f38019a;
    public final org.telegram.ui.Components.ui f38020b;
    public final vi1 f38021c;

    public ui1(vi1 vi1Var, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.Components.ui uiVar) {
        this.f38021c = vi1Var;
        this.f38019a = u1Var;
        this.f38020b = uiVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f38019a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.ui uiVar = this.f38020b;
        vi1 vi1Var = this.f38021c;
        ((ArrayList) uiVar.f28713c).remove(vi1Var);
        uiVar.a();
        ((ViewGroup) uiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = vi1Var.f38574g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
