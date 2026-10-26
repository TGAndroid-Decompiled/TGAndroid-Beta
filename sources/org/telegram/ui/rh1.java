package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class rh1 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Cells.s1 f43168a;
    public final org.telegram.ui.Components.si f43169b;
    public final sh1 f43170c;

    public rh1(sh1 sh1Var, org.telegram.ui.Cells.s1 s1Var, org.telegram.ui.Components.si siVar) {
        this.f43170c = sh1Var;
        this.f43168a = s1Var;
        this.f43169b = siVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f43168a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.si siVar = this.f43169b;
        sh1 sh1Var = this.f43170c;
        ((ArrayList) siVar.f32570c).remove(sh1Var);
        siVar.a();
        ((ViewGroup) siVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = sh1Var.f43519g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
