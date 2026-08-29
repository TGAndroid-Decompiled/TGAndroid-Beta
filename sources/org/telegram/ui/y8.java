package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class y8 extends AnimatorListenerAdapter {
    public final AtomicBoolean f44769a;
    public final org.telegram.ui.Components.y80 f44770b;
    public final String f44771c;

    public y8(AtomicBoolean atomicBoolean, org.telegram.ui.Components.y80 y80Var, String str) {
        this.f44769a = atomicBoolean;
        this.f44770b = y80Var;
        this.f44771c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f44769a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f44770b.setText(this.f44771c);
        }
    }
}
