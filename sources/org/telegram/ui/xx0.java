package org.telegram.ui;

import android.transition.Transition;
public final class xx0 implements Transition.TransitionListener {
    public final Runnable f51789a;

    public xx0(Runnable runnable) {
        this.f51789a = runnable;
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f51789a.run();
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
