package org.telegram.ui;

import android.transition.Transition;
public final class t21 implements Transition.TransitionListener {
    public final Runnable f36826a;

    public t21(Runnable runnable) {
        this.f36826a = runnable;
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f36826a.run();
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
