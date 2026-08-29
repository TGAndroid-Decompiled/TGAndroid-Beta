package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class u31 extends Fade {
    public final int f43170a;
    public final boolean f43171b;
    public final boolean f43172c;
    public final SecretMediaViewer d;

    public u31(SecretMediaViewer secretMediaViewer, boolean z10, boolean z11, int i10) {
        super(1);
        this.f43170a = i10;
        switch (i10) {
            case 1:
                this.d = secretMediaViewer;
                this.f43171b = z10;
                this.f43172c = z11;
                super(2);
                return;
            default:
                this.d = secretMediaViewer;
                this.f43171b = z10;
                this.f43172c = z11;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f43170a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f43171b && !this.f43172c && view == this.d.V) {
                    onAppear.addListener(new e50(this, 25));
                    ((ObjectAnimator) onAppear).addUpdateListener(new w01(this, 4));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f43170a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f43171b && this.f43172c && view == this.d.V) {
                    onDisappear.addListener(new e50(this, 26));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new w01(this, 5));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
