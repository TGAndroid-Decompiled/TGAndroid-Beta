package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class v00 extends AnimatorListenerAdapter {
    public final int f43350a = 0;
    public final nq f43351b;

    public v00(nq nqVar) {
        this.f43351b = nqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43350a) {
            case 0:
                ((f10) this.f43351b.d).f38097h0.unlock();
                return;
            default:
                nq nqVar = this.f43351b;
                View view = nqVar.f40787b;
                view.setAlpha(1.0f);
                f2.z0.x0(view);
                ((f10) nqVar.d).f38087b.removeView(view);
                return;
        }
    }

    public v00(nq nqVar, f2.z0 z0Var) {
        this.f43351b = nqVar;
    }
}
