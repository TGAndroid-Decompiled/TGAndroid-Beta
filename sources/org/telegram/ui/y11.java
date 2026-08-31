package org.telegram.ui;

import android.transition.Transition;
public final class y11 implements Transition.TransitionListener {
    public final Runnable f43520a;

    public y11(Runnable runnable) {
        this.f43520a = runnable;
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f43520a.run();
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
    }

    @Override
    public final void onTransitionPause(Transition transition) {
    }

    @Override
    public final void onTransitionResume(Transition transition) {
    }

    @Override
    public final void onTransitionStart(Transition transition) {
    }
}
