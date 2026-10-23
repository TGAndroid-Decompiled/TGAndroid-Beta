package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class zs0 extends AnimatorListenerAdapter {
    public final int f43804a;
    public final boolean f43805b;
    public final PhotoViewer f43806c;

    public zs0(PhotoViewer photoViewer, boolean z10, int i10) {
        this.f43804a = i10;
        this.f43806c = photoViewer;
        this.f43805b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f43804a) {
            case 1:
                PhotoViewer photoViewer = this.f43806c;
                if (animator.equals(photoViewer.f33442w)) {
                    photoViewer.f33442w = null;
                    return;
                }
                return;
            case 2:
                PhotoViewer photoViewer2 = this.f43806c;
                if (animator.equals(photoViewer2.L)) {
                    photoViewer2.L = null;
                    return;
                }
                return;
            case 3:
                this.f43806c.U7 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11 = this.f43804a;
        boolean z10 = this.f43805b;
        PhotoViewer photoViewer = this.f43806c;
        switch (i11) {
            case 0:
                if (!z10) {
                    photoViewer.f33321i3.setVisibility(8);
                    return;
                }
                return;
            case 1:
                if (animator.equals(photoViewer.f33442w)) {
                    if (!z10) {
                        photoViewer.X0.setVisibility(4);
                    }
                    photoViewer.f33442w = null;
                    return;
                }
                return;
            case 2:
                if (animator.equals(photoViewer.L)) {
                    if (!z10) {
                        photoViewer.F.setVisibility(4);
                        if (photoViewer.f33318i0.getTag() != null) {
                            photoViewer.f33318i0.setVisibility(4);
                        }
                        if (photoViewer.Q1.getTag() != null) {
                            photoViewer.Q1.setVisibility(4);
                        }
                    }
                    photoViewer.L = null;
                    return;
                }
                return;
            default:
                if (animator.equals(photoViewer.U7)) {
                    photoViewer.U7 = new AnimatorSet();
                    if (z10) {
                        photoViewer.O7.setVisibility(0);
                        photoViewer.P7.setVisibility(0);
                        AnimatorSet animatorSet = photoViewer.U7;
                        lu0 lu0Var = photoViewer.O7;
                        Property property = View.TRANSLATION_Y;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(lu0Var, property, 0.0f), ObjectAnimator.ofFloat(photoViewer.P7, property, 0.0f));
                    } else {
                        if (photoViewer.S4) {
                            photoViewer.f33327j0.setVisibility(8);
                            photoViewer.f33327j0.setAlpha(0.0f);
                            View view = photoViewer.f33327j0;
                            if (photoViewer.f33267c2 == 11) {
                                i10 = -16777216;
                            } else {
                                i10 = 2130706432;
                            }
                            view.setBackgroundColor(i10);
                        }
                        photoViewer.O7.setVisibility(4);
                        photoViewer.P7.setVisibility(4);
                        AnimatorSet animatorSet2 = photoViewer.U7;
                        ai.o5 o5Var = photoViewer.P0;
                        Property property2 = View.TRANSLATION_Y;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(o5Var, property2, 0.0f), ObjectAnimator.ofFloat(photoViewer.P0, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(photoViewer.S0, property2, 0.0f));
                    }
                    photoViewer.U7.addListener(new zb0(this, 14));
                    photoViewer.U7.setDuration(200L);
                    photoViewer.U7.setInterpolator(AndroidUtilities.decelerateInterpolator);
                    photoViewer.U7.start();
                    return;
                }
                return;
        }
    }
}
