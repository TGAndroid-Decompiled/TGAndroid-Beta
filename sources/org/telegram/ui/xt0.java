package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class xt0 extends Fade {
    public final int f42944a;
    public final boolean f42945b;
    public final boolean f42946c;
    public final PhotoViewer d;

    public xt0(PhotoViewer photoViewer, boolean z10, boolean z11, int i10) {
        super(1);
        this.f42944a = i10;
        switch (i10) {
            case 1:
                this.d = photoViewer;
                this.f42945b = z10;
                this.f42946c = z11;
                super(2);
                return;
            default:
                this.d = photoViewer;
                this.f42945b = z10;
                this.f42946c = z11;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f42944a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f42945b && !this.f42946c && view == this.d.Q1) {
                    onAppear.addListener(new ap0(this, 6));
                    ((ObjectAnimator) onAppear).addUpdateListener(new c3(this, 19));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f42944a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f42945b && this.f42946c && view == this.d.Q1) {
                    onDisappear.addListener(new ap0(this, 7));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new c3(this, 20));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
