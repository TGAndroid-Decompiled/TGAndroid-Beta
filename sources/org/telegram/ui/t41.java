package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class t41 extends Fade {
    public final int f37645a;
    public final boolean f37646b;
    public final boolean f37647c;
    public final SecretMediaViewer d;

    public t41(SecretMediaViewer secretMediaViewer, boolean z10, boolean z11, int i10) {
        super(1);
        this.f37645a = i10;
        switch (i10) {
            case 1:
                this.d = secretMediaViewer;
                this.f37646b = z10;
                this.f37647c = z11;
                super(2);
                return;
            default:
                this.d = secretMediaViewer;
                this.f37646b = z10;
                this.f37647c = z11;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f37645a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f37646b && !this.f37647c && view == this.d.Z) {
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
        switch (this.f37645a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f37646b && this.f37647c && view == this.d.Z) {
                    onDisappear.addListener(new ap0(this, 19));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new b21(this, 4));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
