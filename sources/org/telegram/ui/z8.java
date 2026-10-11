package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class z8 extends AnimatorListenerAdapter {
    public final AtomicBoolean f44603a;
    public final org.telegram.ui.Components.fa0 f44604b;
    public final String f44605c;

    public z8(AtomicBoolean atomicBoolean, org.telegram.ui.Components.fa0 fa0Var, String str) {
        this.f44603a = atomicBoolean;
        this.f44604b = fa0Var;
        this.f44605c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f44603a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f44604b.setText(this.f44605c);
        }
    }
}
