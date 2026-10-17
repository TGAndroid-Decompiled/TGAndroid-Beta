package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class w00 extends AnimatorListenerAdapter {
    public final int f42308a = 0;
    public final qq f42309b;

    public w00(qq qqVar) {
        this.f42309b = qqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42308a) {
            case 0:
                ((g10) this.f42309b.d).f37096l0.unlock();
                return;
            default:
                qq qqVar = this.f42309b;
                View view = qqVar.f40485b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((g10) qqVar.d).f37083b.removeView(view);
                return;
        }
    }

    public w00(qq qqVar, s4.n0 n0Var) {
        this.f42309b = qqVar;
    }
}
