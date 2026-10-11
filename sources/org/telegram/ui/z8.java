package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class z8 extends AnimatorListenerAdapter {
    public final AtomicBoolean f44637a;
    public final org.telegram.ui.Components.ea0 f44638b;
    public final String f44639c;

    public z8(AtomicBoolean atomicBoolean, org.telegram.ui.Components.ea0 ea0Var, String str) {
        this.f44637a = atomicBoolean;
        this.f44638b = ea0Var;
        this.f44639c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f44637a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f44638b.setText(this.f44639c);
        }
    }
}
