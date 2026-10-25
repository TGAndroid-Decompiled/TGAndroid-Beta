package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class w00 extends AnimatorListenerAdapter {
    public final int f44934a = 0;
    public final rq f44935b;

    public w00(rq rqVar) {
        this.f44935b = rqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44934a) {
            case 0:
                ((h10) this.f44935b.d).f39838l0.unlock();
                return;
            default:
                rq rqVar = this.f44935b;
                View view = rqVar.f43237b;
                view.setAlpha(1.0f);
                s4.p0.x0(view);
                ((h10) rqVar.d).f39825b.removeView(view);
                return;
        }
    }

    public w00(rq rqVar, s4.p0 p0Var) {
        this.f44935b = rqVar;
    }
}
