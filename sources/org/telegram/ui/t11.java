package org.telegram.ui;

import android.transition.Transition;
public final class t11 implements Transition.TransitionListener {
    public final Runnable f41587a;

    public t11(Runnable runnable) {
        this.f41587a = runnable;
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f41587a.run();
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
