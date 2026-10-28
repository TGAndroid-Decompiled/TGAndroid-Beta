package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class rt0 extends Fade {
    public final int f43167a;
    public final boolean f43168b;
    public final boolean f43169c;
    public final PhotoViewer d;

    public rt0(PhotoViewer photoViewer, boolean z10, boolean z11, int i10) {
        super(1);
        this.f43167a = i10;
        switch (i10) {
            case 1:
                this.d = photoViewer;
                this.f43168b = z10;
                this.f43169c = z11;
                super(2);
                return;
            default:
                this.d = photoViewer;
                this.f43168b = z10;
                this.f43169c = z11;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f43167a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f43168b && !this.f43169c && view == this.d.Q1) {
                    onAppear.addListener(new k50(this, 14));
                    ((ObjectAnimator) onAppear).addUpdateListener(new b3(this, 19));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f43167a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f43168b && this.f43169c && view == this.d.Q1) {
                    onDisappear.addListener(new k50(this, 15));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new b3(this, 20));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
