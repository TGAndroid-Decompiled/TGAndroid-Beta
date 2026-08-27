package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;

public final class r31 extends Fade {

    public final int f41792a;

    public final boolean f41793b;

    public final boolean f41794c;
    public final SecretMediaViewer d;

    public r31(SecretMediaViewer secretMediaViewer, boolean z10, boolean z11, int i10) {
        super(1);
        this.f41792a = i10;
        switch (i10) {
            case 1:
                this.d = secretMediaViewer;
                this.f41793b = z10;
                this.f41794c = z11;
                super(2);
                break;
            default:
                this.d = secretMediaViewer;
                this.f41793b = z10;
                this.f41794c = z11;
                break;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f41792a) {
            case 0:
                Animator animatorOnAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f41793b && !this.f41794c && view == this.d.V) {
                    animatorOnAppear.addListener(new f50(this, 25));
                    ((ObjectAnimator) animatorOnAppear).addUpdateListener(new w01(this, 4));
                }
                return animatorOnAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f41792a) {
            case 1:
                Animator animatorOnDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f41793b && this.f41794c && view == this.d.V) {
                    animatorOnDisappear.addListener(new f50(this, 26));
                    ((ObjectAnimator) animatorOnDisappear).addUpdateListener(new w01(this, 5));
                }
                return animatorOnDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
