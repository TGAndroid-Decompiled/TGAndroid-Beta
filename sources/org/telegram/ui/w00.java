package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class w00 extends AnimatorListenerAdapter {
    public final int f42332a = 0;
    public final qq f42333b;

    public w00(qq qqVar) {
        this.f42333b = qqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42332a) {
            case 0:
                ((g10) this.f42333b.d).f37066l0.unlock();
                return;
            default:
                qq qqVar = this.f42333b;
                View view = qqVar.f40502b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((g10) qqVar.d).f37053b.removeView(view);
                return;
        }
    }

    public w00(qq qqVar, s4.n0 n0Var) {
        this.f42333b = qqVar;
    }
}
