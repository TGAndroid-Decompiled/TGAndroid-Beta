package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class vp0 extends Fade {
    public final int f50785a;
    public final boolean f50786b;
    public final boolean f50787c;
    public final PhotoViewer d;

    public vp0(PhotoViewer photoViewer, boolean z9, boolean z10, int i7) {
        super(1);
        this.f50785a = i7;
        switch (i7) {
            case 1:
                this.d = photoViewer;
                this.f50786b = z9;
                this.f50787c = z10;
                super(2);
                return;
            default:
                this.d = photoViewer;
                this.f50786b = z9;
                this.f50787c = z10;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f50785a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f50786b && !this.f50787c && view == this.d.Q1) {
                    onAppear.addListener(new d30(this, 14));
                    ((ObjectAnimator) onAppear).addUpdateListener(new a3(this, 18));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f50785a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f50786b && this.f50787c && view == this.d.Q1) {
                    onDisappear.addListener(new d30(this, 15));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new a3(this, 19));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
