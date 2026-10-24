package org.telegram.ui;

import android.transition.Transition;
public final class u11 implements Transition.TransitionListener {
    public final Runnable f42182a;

    public u11(Runnable runnable) {
        this.f42182a = runnable;
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f42182a.run();
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
