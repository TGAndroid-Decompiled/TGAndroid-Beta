package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class x00 extends AnimatorListenerAdapter {
    public final int f44423a = 0;
    public final pq f44424b;

    public x00(pq pqVar) {
        this.f44424b = pqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44423a) {
            case 0:
                ((h10) this.f44424b.d).f38730h0.unlock();
                return;
            default:
                pq pqVar = this.f44424b;
                View view = pqVar.f41446b;
                view.setAlpha(1.0f);
                f2.w0.x0(view);
                ((h10) pqVar.d).f38720b.removeView(view);
                return;
        }
    }

    public x00(pq pqVar, f2.w0 w0Var) {
        this.f44424b = pqVar;
    }
}
