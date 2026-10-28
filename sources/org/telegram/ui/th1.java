package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class th1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.s1 f43653a;
    public final org.telegram.ui.Components.si f43654b;
    public final uh1 f43655c;

    public th1(uh1 uh1Var, org.telegram.ui.Cells.s1 s1Var, org.telegram.ui.Components.si siVar) {
        this.f43655c = uh1Var;
        this.f43653a = s1Var;
        this.f43654b = siVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f43653a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.si siVar = this.f43654b;
        uh1 uh1Var = this.f43655c;
        ((ArrayList) siVar.f32599c).remove(uh1Var);
        siVar.a();
        ((ViewGroup) siVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = uh1Var.f44034g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
