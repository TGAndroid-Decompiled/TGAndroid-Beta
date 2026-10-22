package org.telegram.ui;

import android.transition.Transition;
public final class r11 implements Transition.TransitionListener {
    public final Runnable f41036a;

    public r11(Runnable runnable) {
        this.f41036a = runnable;
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f41036a.run();
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
