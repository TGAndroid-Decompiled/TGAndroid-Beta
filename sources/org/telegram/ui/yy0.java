package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class yy0 extends Fade {
    public final int f52451a;
    public final boolean f52452b;
    public final boolean f52453c;
    public final SecretMediaViewer d;

    public yy0(SecretMediaViewer secretMediaViewer, boolean z10, boolean z11, int i3) {
        super(1);
        this.f52451a = i3;
        switch (i3) {
            case 1:
                this.d = secretMediaViewer;
                this.f52452b = z10;
                this.f52453c = z11;
                super(2);
                return;
            default:
                this.d = secretMediaViewer;
                this.f52452b = z10;
                this.f52453c = z11;
                return;
        }
    }

    @Override
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f52451a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.f52452b && !this.f52453c && view == this.d.Y) {
                    onAppear.addListener(new y20(this, 24));
                    ((ObjectAnimator) onAppear).addUpdateListener(new xy0(this, 0));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.f52451a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.f52452b && this.f52453c && view == this.d.Y) {
                    onDisappear.addListener(new y20(this, 25));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new xy0(this, 1));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
