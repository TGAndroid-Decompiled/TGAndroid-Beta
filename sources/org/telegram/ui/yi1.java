package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class yi1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.u1 f44357a;
    public final org.telegram.ui.Components.xi f44358b;
    public final zi1 f44359c;

    public yi1(zi1 zi1Var, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.Components.xi xiVar) {
        this.f44359c = zi1Var;
        this.f44357a = u1Var;
        this.f44358b = xiVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f44357a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.xi xiVar = this.f44358b;
        zi1 zi1Var = this.f44359c;
        ((ArrayList) xiVar.f32877c).remove(zi1Var);
        xiVar.a();
        ((ViewGroup) xiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = zi1Var.f44676g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
