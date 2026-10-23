package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class x00 extends AnimatorListenerAdapter {
    public final int f43465a = 0;
    public final qq f43466b;

    public x00(qq qqVar) {
        this.f43466b = qqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43465a) {
            case 0:
                ((i10) this.f43466b.d).f38025l0.unlock();
                return;
            default:
                qq qqVar = this.f43466b;
                View view = qqVar.f40905b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((i10) qqVar.d).f38012b.removeView(view);
                return;
        }
    }

    public x00(qq qqVar, s4.n0 n0Var) {
        this.f43466b = qqVar;
    }
}
