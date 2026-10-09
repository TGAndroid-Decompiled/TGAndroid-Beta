package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class z41 extends Fade {
    public final int f44481a;
    public final boolean f44482b;
    public final boolean f44483c;
    public final SecretMediaViewer d;

    public z41(SecretMediaViewer secretMediaViewer, boolean z10, boolean z11, int i10) {
        super(1);
        this.f44481a = i10;
        switch (i10) {
            case 1:
                this.d = secretMediaViewer;
                this.f44482b = z10;
                this.f44483c = z11;
                super(2);
                return;
            default:
                this.d = secretMediaViewer;
                this.f44482b = z10;
                this.f44483c = z11;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f44481a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f44482b && !this.f44483c && view == this.d.Z) {
                    onAppear.addListener(new ep0(this, 18));
                    ((ObjectAnimator) onAppear).addUpdateListener(new y11(this, 4));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f44481a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f44482b && this.f44483c && view == this.d.Z) {
                    onDisappear.addListener(new ep0(this, 19));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new y11(this, 5));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
