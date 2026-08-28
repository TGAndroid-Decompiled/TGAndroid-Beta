package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class qs0 extends AnimatorListenerAdapter {
    public final int f42184a;
    public final boolean f42185b;
    public final PhotoViewer f42186c;

    public qs0(PhotoViewer photoViewer, boolean z10, int i9) {
        this.f42184a = i9;
        this.f42186c = photoViewer;
        this.f42185b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f42184a) {
            case 1:
                PhotoViewer photoViewer = this.f42186c;
                if (animator.equals(photoViewer.f35778w)) {
                    photoViewer.f35778w = null;
                    return;
                }
                return;
            case 2:
                PhotoViewer photoViewer2 = this.f42186c;
                if (animator.equals(photoViewer2.H)) {
                    photoViewer2.H = null;
                    return;
                }
                return;
            case 3:
                this.f42186c.P7 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i9;
        int i10 = this.f42184a;
        boolean z10 = this.f42185b;
        PhotoViewer photoViewer = this.f42186c;
        switch (i10) {
            case 0:
                if (!z10) {
                    photoViewer.f35620e3.setVisibility(8);
                    return;
                }
                return;
            case 1:
                if (animator.equals(photoViewer.f35778w)) {
                    if (!z10) {
                        photoViewer.T0.setVisibility(4);
                    }
                    photoViewer.f35778w = null;
                    return;
                }
                return;
            case 2:
                if (animator.equals(photoViewer.H)) {
                    if (!z10) {
                        photoViewer.B.setVisibility(4);
                        if (photoViewer.f35617e0.getTag() != null) {
                            photoViewer.f35617e0.setVisibility(4);
                        }
                        if (photoViewer.M1.getTag() != null) {
                            photoViewer.M1.setVisibility(4);
                        }
                    }
                    photoViewer.H = null;
                    return;
                }
                return;
            default:
                if (animator.equals(photoViewer.P7)) {
                    photoViewer.P7 = new AnimatorSet();
                    if (z10) {
                        photoViewer.J7.setVisibility(0);
                        photoViewer.K7.setVisibility(0);
                        AnimatorSet animatorSet = photoViewer.P7;
                        du0 du0Var = photoViewer.J7;
                        Property property = View.TRANSLATION_Y;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(du0Var, property, 0.0f), ObjectAnimator.ofFloat(photoViewer.K7, property, 0.0f));
                    } else {
                        if (photoViewer.O4) {
                            photoViewer.f35627f0.setVisibility(8);
                            photoViewer.f35627f0.setAlpha(0.0f);
                            View view = photoViewer.f35627f0;
                            if (photoViewer.Y1 == 11) {
                                i9 = -16777216;
                            } else {
                                i9 = 2130706432;
                            }
                            view.setBackgroundColor(i9);
                        }
                        photoViewer.J7.setVisibility(4);
                        photoViewer.K7.setVisibility(4);
                        AnimatorSet animatorSet2 = photoViewer.P7;
                        bh.g gVar = photoViewer.L0;
                        Property property2 = View.TRANSLATION_Y;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(gVar, property2, 0.0f), ObjectAnimator.ofFloat(photoViewer.L0, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(photoViewer.O0, property2, 0.0f));
                    }
                    photoViewer.P7.addListener(new bc0(this, 14));
                    photoViewer.P7.setDuration(200L);
                    photoViewer.P7.setInterpolator(AndroidUtilities.decelerateInterpolator);
                    photoViewer.P7.start();
                    return;
                }
                return;
        }
    }
}
