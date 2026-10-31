package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class v01 extends Fade {
    public final int f42561a;
    public final boolean f42562b;
    public final boolean f42563c;
    public final SecretMediaViewer d;

    public v01(SecretMediaViewer secretMediaViewer, boolean z10, boolean z11, int i10) {
        super(1);
        this.f42561a = i10;
        switch (i10) {
            case 1:
                this.d = secretMediaViewer;
                this.f42562b = z10;
                this.f42563c = z11;
                super(2);
                return;
            default:
                this.d = secretMediaViewer;
                this.f42562b = z10;
                this.f42563c = z11;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f42561a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f42562b && !this.f42563c && view == this.d.X) {
                    onAppear.addListener(new ns0(this, 5));
                    ((ObjectAnimator) onAppear).addUpdateListener(new u01(this, 0));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f42561a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f42562b && this.f42563c && view == this.d.X) {
                    onDisappear.addListener(new ns0(this, 6));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new u01(this, 1));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
