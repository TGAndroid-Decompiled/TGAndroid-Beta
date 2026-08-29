package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class ys0 extends Fade {
    public final int f44963a;
    public final boolean f44964b;
    public final boolean f44965c;
    public final PhotoViewer d;

    public ys0(PhotoViewer photoViewer, boolean z10, boolean z11, int i10) {
        super(1);
        this.f44963a = i10;
        switch (i10) {
            case 1:
                this.d = photoViewer;
                this.f44964b = z10;
                this.f44965c = z11;
                super(2);
                return;
            default:
                this.d = photoViewer;
                this.f44964b = z10;
                this.f44965c = z11;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f44963a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f44964b && !this.f44965c && view == this.d.M1) {
                    onAppear.addListener(new e50(this, 13));
                    ((ObjectAnimator) onAppear).addUpdateListener(new g3(this, 20));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f44963a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f44964b && this.f44965c && view == this.d.M1) {
                    onDisappear.addListener(new e50(this, 14));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new g3(this, 21));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
