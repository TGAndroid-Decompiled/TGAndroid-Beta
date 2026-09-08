package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class z41 extends Fade {
    public final int f43318a;
    public final boolean f43319b;
    public final boolean f43320c;
    public final SecretMediaViewer d;

    public z41(SecretMediaViewer secretMediaViewer, boolean z10, boolean z11, int i10) {
        super(1);
        this.f43318a = i10;
        switch (i10) {
            case 1:
                this.d = secretMediaViewer;
                this.f43319b = z10;
                this.f43320c = z11;
                super(2);
                return;
            default:
                this.d = secretMediaViewer;
                this.f43319b = z10;
                this.f43320c = z11;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f43318a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f43319b && !this.f43320c && view == this.d.Z) {
                    onAppear.addListener(new gk0(this, 20));
                    ((ObjectAnimator) onAppear).addUpdateListener(new b21(this, 4));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f43318a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f43319b && this.f43320c && view == this.d.Z) {
                    onDisappear.addListener(new gk0(this, 21));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new b21(this, 5));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
