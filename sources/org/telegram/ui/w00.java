package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class w00 extends AnimatorListenerAdapter {
    public final int f42305a = 0;
    public final qq f42306b;

    public w00(qq qqVar) {
        this.f42306b = qqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42305a) {
            case 0:
                ((g10) this.f42306b.d).f37031l0.unlock();
                return;
            default:
                qq qqVar = this.f42306b;
                View view = qqVar.f40468b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((g10) qqVar.d).f37018b.removeView(view);
                return;
        }
    }

    public w00(qq qqVar, s4.n0 n0Var) {
        this.f42306b = qqVar;
    }
}
