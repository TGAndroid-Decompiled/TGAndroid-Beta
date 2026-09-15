package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class tt0 extends AnimatorListenerAdapter {
    public final int f37783a;
    public final boolean f37784b;
    public final PhotoViewer f37785c;

    public tt0(PhotoViewer photoViewer, boolean z10, int i10) {
        this.f37783a = i10;
        this.f37785c = photoViewer;
        this.f37784b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f37783a) {
            case 1:
                PhotoViewer photoViewer = this.f37785c;
                if (animator.equals(photoViewer.f31094w)) {
                    photoViewer.f31094w = null;
                    return;
                }
                return;
            case 2:
                PhotoViewer photoViewer2 = this.f37785c;
                if (animator.equals(photoViewer2.L)) {
                    photoViewer2.L = null;
                    return;
                }
                return;
            case 3:
                this.f37785c.T7 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11 = this.f37783a;
        boolean z10 = this.f37784b;
        PhotoViewer photoViewer = this.f37785c;
        switch (i11) {
            case 0:
                if (!z10) {
                    photoViewer.f30974i3.setVisibility(8);
                    return;
                }
                return;
            case 1:
                if (animator.equals(photoViewer.f31094w)) {
                    if (!z10) {
                        photoViewer.X0.setVisibility(4);
                    }
                    photoViewer.f31094w = null;
                    return;
                }
                return;
            case 2:
                if (animator.equals(photoViewer.L)) {
                    if (!z10) {
                        photoViewer.F.setVisibility(4);
                        if (photoViewer.f30971i0.getTag() != null) {
                            photoViewer.f30971i0.setVisibility(4);
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
                if (animator.equals(photoViewer.T7)) {
                    photoViewer.T7 = new AnimatorSet();
                    if (z10) {
                        photoViewer.N7.setVisibility(0);
                        photoViewer.O7.setVisibility(0);
                        AnimatorSet animatorSet = photoViewer.T7;
                        fv0 fv0Var = photoViewer.N7;
                        Property property = View.TRANSLATION_Y;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(fv0Var, property, 0.0f), ObjectAnimator.ofFloat(photoViewer.O7, property, 0.0f));
                    } else {
                        if (photoViewer.S4) {
                            photoViewer.f30980j0.setVisibility(8);
                            photoViewer.f30980j0.setAlpha(0.0f);
                            View view = photoViewer.f30980j0;
                            if (photoViewer.f30920c2 == 11) {
                                i10 = -16777216;
                            } else {
                                i10 = 2130706432;
                            }
                            view.setBackgroundColor(i10);
                        }
                        photoViewer.N7.setVisibility(4);
                        photoViewer.O7.setVisibility(4);
                        AnimatorSet animatorSet2 = photoViewer.T7;
                        t5 t5Var = photoViewer.P0;
                        Property property2 = View.TRANSLATION_Y;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(t5Var, property2, 0.0f), ObjectAnimator.ofFloat(photoViewer.P0, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(photoViewer.S0, property2, 0.0f));
                    }
                    photoViewer.T7.addListener(new cr0(this, 8));
                    photoViewer.T7.setDuration(200L);
                    photoViewer.T7.setInterpolator(AndroidUtilities.decelerateInterpolator);
                    photoViewer.T7.start();
                    return;
                }
                return;
        }
    }
}
