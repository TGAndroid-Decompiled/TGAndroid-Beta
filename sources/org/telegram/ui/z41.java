package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class z41 extends Fade {
    public final int f40124a;
    public final boolean f40125b;
    public final boolean f40126c;
    public final SecretMediaViewer d;

    public z41(SecretMediaViewer secretMediaViewer, boolean z10, boolean z11, int i10) {
        super(1);
        this.f40124a = i10;
        switch (i10) {
            case 1:
                this.d = secretMediaViewer;
                this.f40125b = z10;
                this.f40126c = z11;
                super(2);
                return;
            default:
                this.d = secretMediaViewer;
                this.f40125b = z10;
                this.f40126c = z11;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f40124a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f40125b && !this.f40126c && view == this.d.Z) {
                    onAppear.addListener(new er0(this, 17));
                    ((ObjectAnimator) onAppear).addUpdateListener(new k21(this, 3));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f40124a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f40125b && this.f40126c && view == this.d.Z) {
                    onDisappear.addListener(new er0(this, 18));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new k21(this, 4));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
