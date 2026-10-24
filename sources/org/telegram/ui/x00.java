package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class x00 extends AnimatorListenerAdapter {
    public final int f43441a = 0;
    public final qq f43442b;

    public x00(qq qqVar) {
        this.f43442b = qqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43441a) {
            case 0:
                ((i10) this.f43442b.d).f38108l0.unlock();
                return;
            default:
                qq qqVar = this.f43442b;
                View view = qqVar.f40917b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((i10) qqVar.d).f38095b.removeView(view);
                return;
        }
    }

    public x00(qq qqVar, s4.n0 n0Var) {
        this.f43442b = qqVar;
    }
}
