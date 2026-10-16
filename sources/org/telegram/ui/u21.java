package org.telegram.ui;

import android.transition.Transition;
public final class u21 implements Transition.TransitionListener {
    public final Runnable f40249a;

    public u21(Runnable runnable) {
        this.f40249a = runnable;
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f40249a.run();
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
