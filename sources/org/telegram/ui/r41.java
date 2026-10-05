package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class r41 extends Fade {
    public final int f39982a;
    public final boolean f39983b;
    public final boolean f39984c;
    public final SecretMediaViewer d;

    public r41(SecretMediaViewer secretMediaViewer, boolean z10, boolean z11, int i10) {
        super(1);
        this.f39982a = i10;
        switch (i10) {
            case 1:
                this.d = secretMediaViewer;
                this.f39983b = z10;
                this.f39984c = z11;
                super(2);
                return;
            default:
                this.d = secretMediaViewer;
                this.f39983b = z10;
                this.f39984c = z11;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f39982a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f39983b && !this.f39984c && view == this.d.Z) {
                    onAppear.addListener(new ap0(this, 18));
                    ((ObjectAnimator) onAppear).addUpdateListener(new b21(this, 3));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f39982a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f39983b && this.f39984c && view == this.d.Z) {
                    onDisappear.addListener(new ap0(this, 19));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new b21(this, 4));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
