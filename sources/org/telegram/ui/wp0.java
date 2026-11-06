package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class wp0 extends Fade {
    public final int f51473a;
    public final boolean f51474b;
    public final boolean f51475c;
    public final PhotoViewer d;

    public wp0(PhotoViewer photoViewer, boolean z9, boolean z10, int i7) {
        super(1);
        this.f51473a = i7;
        switch (i7) {
            case 1:
                this.d = photoViewer;
                this.f51474b = z9;
                this.f51475c = z10;
                super(2);
                return;
            default:
                this.d = photoViewer;
                this.f51474b = z9;
                this.f51475c = z10;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f51473a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f51474b && !this.f51475c && view == this.d.Q1) {
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
        switch (this.f51473a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f51474b && this.f51475c && view == this.d.Q1) {
                    onDisappear.addListener(new d30(this, 15));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new a3(this, 19));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
