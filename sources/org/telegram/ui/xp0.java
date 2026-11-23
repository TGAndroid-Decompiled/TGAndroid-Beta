package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class xp0 extends Fade {
    public final int f53922a;
    public final boolean f53923b;
    public final boolean f53924c;
    public final PhotoViewer d;

    public xp0(PhotoViewer photoViewer, boolean z10, boolean z11, int i7) {
        super(1);
        this.f53922a = i7;
        switch (i7) {
            case 1:
                this.d = photoViewer;
                this.f53923b = z10;
                this.f53924c = z11;
                super(2);
                return;
            default:
                this.d = photoViewer;
                this.f53923b = z10;
                this.f53924c = z11;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f53922a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f53923b && !this.f53924c && view == this.d.R1) {
                    onAppear.addListener(new ay(this, 15));
                    ((ObjectAnimator) onAppear).addUpdateListener(new a3(this, 18));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f53922a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f53923b && this.f53924c && view == this.d.R1) {
                    onDisappear.addListener(new ay(this, 16));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new a3(this, 19));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
