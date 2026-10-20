package org.telegram.ui;

import android.transition.Transition;
public final class r11 implements Transition.TransitionListener {
    public final Runnable f41033a;

    public r11(Runnable runnable) {
        this.f41033a = runnable;
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f41033a.run();
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
