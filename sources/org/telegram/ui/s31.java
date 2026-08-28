package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class s31 extends Fade {
    public final int f42549a;
    public final boolean f42550b;
    public final boolean f42551c;
    public final SecretMediaViewer d;

    public s31(SecretMediaViewer secretMediaViewer, boolean z10, boolean z11, int i9) {
        super(1);
        this.f42549a = i9;
        switch (i9) {
            case 1:
                this.d = secretMediaViewer;
                this.f42550b = z10;
                this.f42551c = z11;
                super(2);
                return;
            default:
                this.d = secretMediaViewer;
                this.f42550b = z10;
                this.f42551c = z11;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f42549a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f42550b && !this.f42551c && view == this.d.V) {
                    onAppear.addListener(new bc0(this, 23));
                    ((ObjectAnimator) onAppear).addUpdateListener(new v01(this, 4));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f42549a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f42550b && this.f42551c && view == this.d.V) {
                    onDisappear.addListener(new bc0(this, 24));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new v01(this, 5));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
