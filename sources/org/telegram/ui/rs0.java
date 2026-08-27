package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class rs0 extends AnimatorListenerAdapter {

    public final int f42323a;

    public final boolean f42324b;

    public final PhotoViewer f42325c;

    public rs0(PhotoViewer photoViewer, boolean z10, int i10) {
        this.f42323a = i10;
        this.f42325c = photoViewer;
        this.f42324b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f42323a) {
            case 1:
                PhotoViewer photoViewer = this.f42325c;
                if (animator.equals(photoViewer.f35781w)) {
                    photoViewer.f35781w = null;
                }
                break;
            case 2:
                PhotoViewer photoViewer2 = this.f42325c;
                if (animator.equals(photoViewer2.H)) {
                    photoViewer2.H = null;
                }
                break;
            case 3:
                this.f42325c.P7 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f42323a;
        boolean z10 = this.f42324b;
        PhotoViewer photoViewer = this.f42325c;
        switch (i10) {
            case 0:
                if (!z10) {
                    photoViewer.f35623e3.setVisibility(8);
                }
                break;
            case 1:
                if (animator.equals(photoViewer.f35781w)) {
                    if (!z10) {
                        photoViewer.T0.setVisibility(4);
                    }
                    photoViewer.f35781w = null;
                }
                break;
            case 2:
                if (animator.equals(photoViewer.H)) {
                    if (!z10) {
                        photoViewer.B.setVisibility(4);
                        if (photoViewer.f35620e0.getTag() != null) {
                            photoViewer.f35620e0.setVisibility(4);
                        }
                        if (photoViewer.M1.getTag() != null) {
                            photoViewer.M1.setVisibility(4);
                        }
                    }
                    photoViewer.H = null;
                }
                break;
            default:
                if (animator.equals(photoViewer.P7)) {
                    photoViewer.P7 = new AnimatorSet();
                    if (z10) {
                        photoViewer.J7.setVisibility(0);
                        photoViewer.K7.setVisibility(0);
                        AnimatorSet animatorSet = photoViewer.P7;
                        eu0 eu0Var = photoViewer.J7;
                        Property property = View.TRANSLATION_Y;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(eu0Var, (Property<eu0, Float>) property, 0.0f), ObjectAnimator.ofFloat(photoViewer.K7, (Property<org.telegram.ui.Components.ff0, Float>) property, 0.0f));
                    } else {
                        if (photoViewer.O4) {
                            photoViewer.f35630f0.setVisibility(8);
                            photoViewer.f35630f0.setAlpha(0.0f);
                            photoViewer.f35630f0.setBackgroundColor(photoViewer.Y1 == 11 ? -16777216 : 2130706432);
                        }
                        photoViewer.J7.setVisibility(4);
                        photoViewer.K7.setVisibility(4);
                        AnimatorSet animatorSet2 = photoViewer.P7;
                        ag.w wVar = photoViewer.L0;
                        Property property2 = View.TRANSLATION_Y;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(wVar, (Property<ag.w, Float>) property2, 0.0f), ObjectAnimator.ofFloat(photoViewer.L0, (Property<ag.w, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(photoViewer.O0, (Property<org.telegram.ui.Components.wo0, Float>) property2, 0.0f));
                    }
                    photoViewer.P7.addListener(new f50(this, 16));
                    photoViewer.P7.setDuration(200L);
                    photoViewer.P7.setInterpolator(AndroidUtilities.decelerateInterpolator);
                    photoViewer.P7.start();
                    break;
                }
                break;
        }
    }
}
