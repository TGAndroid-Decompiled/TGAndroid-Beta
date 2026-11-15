package org.telegram.ui;

import android.transition.Transition;
public final class sx0 implements Transition.TransitionListener {
    public final Runnable f51298a;

    public sx0(Runnable runnable) {
        this.f51298a = runnable;
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f51298a.run();
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
