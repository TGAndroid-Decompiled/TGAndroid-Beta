package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class z8 extends AnimatorListenerAdapter {
    public final AtomicBoolean f52581a;
    public final org.telegram.ui.Components.s70 f52582b;
    public final String f52583c;

    public z8(AtomicBoolean atomicBoolean, org.telegram.ui.Components.s70 s70Var, String str) {
        this.f52581a = atomicBoolean;
        this.f52582b = s70Var;
        this.f52583c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f52581a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f52582b.setText(this.f52583c);
        }
    }
}
