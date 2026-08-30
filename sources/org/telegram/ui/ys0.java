package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ys0 extends AnimatorListenerAdapter {
    public final int f40568a;
    public final boolean f40569b;
    public final PhotoViewer f40570c;

    public ys0(PhotoViewer photoViewer, boolean z4, int i10) {
        this.f40568a = i10;
        this.f40570c = photoViewer;
        this.f40569b = z4;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f40568a) {
            case 1:
                PhotoViewer photoViewer = this.f40570c;
                if (animator.equals(photoViewer.f31893w)) {
                    photoViewer.f31893w = null;
                    return;
                }
                return;
            case 2:
                PhotoViewer photoViewer2 = this.f40570c;
                if (animator.equals(photoViewer2.I)) {
                    photoViewer2.I = null;
                    return;
                }
                return;
            case 3:
                this.f40570c.Q7 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11 = this.f40568a;
        boolean z4 = this.f40569b;
        PhotoViewer photoViewer = this.f40570c;
        switch (i11) {
            case 0:
                if (!z4) {
                    photoViewer.f31744f3.setVisibility(8);
                    return;
                }
                return;
            case 1:
                if (animator.equals(photoViewer.f31893w)) {
                    if (!z4) {
                        photoViewer.U0.setVisibility(4);
                    }
                    photoViewer.f31893w = null;
                    return;
                }
                return;
            case 2:
                if (animator.equals(photoViewer.I)) {
                    if (!z4) {
                        photoViewer.C.setVisibility(4);
                        if (photoViewer.f31741f0.getTag() != null) {
                            photoViewer.f31741f0.setVisibility(4);
                        }
                        if (photoViewer.N1.getTag() != null) {
                            photoViewer.N1.setVisibility(4);
                        }
                    }
                    photoViewer.I = null;
                    return;
                }
                return;
            default:
                if (animator.equals(photoViewer.Q7)) {
                    photoViewer.Q7 = new AnimatorSet();
                    if (z4) {
                        photoViewer.K7.setVisibility(0);
                        photoViewer.L7.setVisibility(0);
                        AnimatorSet animatorSet = photoViewer.Q7;
                        lu0 lu0Var = photoViewer.K7;
                        Property property = View.TRANSLATION_Y;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(lu0Var, property, 0.0f), ObjectAnimator.ofFloat(photoViewer.L7, property, 0.0f));
                    } else {
                        if (photoViewer.P4) {
                            photoViewer.f31750g0.setVisibility(8);
                            photoViewer.f31750g0.setAlpha(0.0f);
                            View view = photoViewer.f31750g0;
                            if (photoViewer.Z1 == 11) {
                                i10 = -16777216;
                            } else {
                                i10 = 2130706432;
                            }
                            view.setBackgroundColor(i10);
                        }
                        photoViewer.K7.setVisibility(4);
                        photoViewer.L7.setVisibility(4);
                        AnimatorSet animatorSet2 = photoViewer.Q7;
                        dg.s1 s1Var = photoViewer.M0;
                        Property property2 = View.TRANSLATION_Y;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(s1Var, property2, 0.0f), ObjectAnimator.ofFloat(photoViewer.M0, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(photoViewer.P0, property2, 0.0f));
                    }
                    photoViewer.Q7.addListener(new ls0(this, 7));
                    photoViewer.Q7.setDuration(200L);
                    photoViewer.Q7.setInterpolator(AndroidUtilities.decelerateInterpolator);
                    photoViewer.Q7.start();
                    return;
                }
                return;
        }
    }
}
