package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class ru0 extends AnimatorListenerAdapter {

    public final int f42341a;

    public final yu0 f42342b;

    public ru0(yu0 yu0Var, int i10) {
        this.f42341a = i10;
        this.f42342b = yu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42341a) {
            case 0:
                this.f42342b.N.setTranslationY(0.0f);
                break;
            case 1:
                this.f42342b.N.setTranslationY(0.0f);
                break;
            default:
                yu0 yu0Var = this.f42342b;
                yu0Var.getClass();
                yu0Var.N.setTranslationY(0.0f);
                yu0Var.l0();
                break;
        }
    }
}
