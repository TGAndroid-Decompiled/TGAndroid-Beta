package org.telegram.ui;

import android.transition.Transition;
public final class tx0 implements Transition.TransitionListener {
    public final Runnable f50169a;

    public tx0(Runnable runnable) {
        this.f50169a = runnable;
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f50169a.run();
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
