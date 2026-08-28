package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class z8 extends AnimatorListenerAdapter {
    public final AtomicBoolean f45071a;
    public final org.telegram.ui.Components.l80 f45072b;
    public final String f45073c;

    public z8(AtomicBoolean atomicBoolean, org.telegram.ui.Components.l80 l80Var, String str) {
        this.f45071a = atomicBoolean;
        this.f45072b = l80Var;
        this.f45073c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f45071a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f45072b.setText(this.f45073c);
        }
    }
}
