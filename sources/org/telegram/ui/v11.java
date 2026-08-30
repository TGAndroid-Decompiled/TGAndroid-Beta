package org.telegram.ui;

import android.transition.Transition;
public final class v11 implements Transition.TransitionListener {
    public final Runnable f39061a;

    public v11(Runnable runnable) {
        this.f39061a = runnable;
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f39061a.run();
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
