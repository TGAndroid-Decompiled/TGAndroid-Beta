package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class rh1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.s1 f43165a;
    public final org.telegram.ui.Components.si f43166b;
    public final sh1 f43167c;

    public rh1(sh1 sh1Var, org.telegram.ui.Cells.s1 s1Var, org.telegram.ui.Components.si siVar) {
        this.f43167c = sh1Var;
        this.f43165a = s1Var;
        this.f43166b = siVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f43165a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.si siVar = this.f43166b;
        sh1 sh1Var = this.f43167c;
        ((ArrayList) siVar.f32568c).remove(sh1Var);
        siVar.a();
        ((ViewGroup) siVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = sh1Var.f43516g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
