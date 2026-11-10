package org.telegram.ui;

import android.transition.Transition;
public final class yx0 implements Transition.TransitionListener {
    public final Runnable f52146a;

    public yx0(Runnable runnable) {
        this.f52146a = runnable;
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f52146a.run();
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
