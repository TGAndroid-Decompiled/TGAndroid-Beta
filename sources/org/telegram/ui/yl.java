package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.RectF;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.PipRoundVideoView;
public final class yl implements ViewTreeObserver.OnPreDrawListener {
    public final int f43883a;
    public final Object f43884b;
    public final Object f43885c;

    public yl(int i10, Object obj, Object obj2) {
        this.f43883a = i10;
        this.f43885c = obj;
        this.f43884b = obj2;
    }

    @Override
    public final boolean onPreDraw() {
        int[] iArr;
        float f7;
        int i10 = this.f43883a;
        Object obj = this.f43885c;
        Object obj2 = this.f43884b;
        switch (i10) {
            case 0:
                sn snVar = ((em) obj).Q;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj2;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.e(true);
                }
                t1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = t1Var.getPhotoImage();
                float imageWidth = photoImage.getImageWidth();
                RectF cameraRect = snVar.f41610n3.getCameraRect();
                float width = imageWidth / cameraRect.width();
                t1Var.getTransitionParams().f23228x0 = true;
                t1Var.setAlpha(0.0f);
                t1Var.setTimeAlpha(0.0f);
                t1Var.getLocationOnScreen(r9);
                int[] iArr2 = {(int) ((photoImage.getImageX() - t1Var.getAnimationOffsetX()) + iArr2[0]), (int) (((photoImage.getImageY() + t1Var.getPaddingTop()) - t1Var.getTranslationY()) + iArr2[1])};
                org.telegram.ui.Components.n60 cameraContainer = snVar.f41610n3.getCameraContainer();
                cameraContainer.getLocationOnScreen(new int[2]);
                cameraContainer.setPivotX(cameraRect.left - iArr[0]);
                cameraContainer.setPivotY(cameraRect.top - iArr[1]);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, width);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, width);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_Y, iArr2[1] - cameraRect.top);
                View buttonsLayout = snVar.f41610n3.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, property, 0.0f), ObjectAnimator.ofInt(snVar.f41610n3.getPaint(), org.telegram.ui.Components.r6.f30074b, 0), ObjectAnimator.ofFloat(snVar.f41610n3.getMuteImageView(), property, 0.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.zr.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_X, iArr2[0] - cameraRect.left);
                ofFloat4.setInterpolator(org.telegram.ui.Components.zr.f33337f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                org.telegram.ui.Components.q60 q60Var = snVar.f41610n3;
                if (q60Var != null) {
                    q60Var.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new ai.ne(15, this, cameraContainer));
                animatorSet2.start();
                return true;
            case 1:
                ((jx) obj).f38699b.f37034e0[0].f36737a.getViewTreeObserver().removeOnPreDrawListener(this);
                AndroidUtilities.runOnUIThread((ai.v3) obj2, 100L);
                return false;
            default:
                ((ViewTreeObserver) obj2).removeOnPreDrawListener(this);
                vh.h hVar = (vh.h) obj;
                org.telegram.ui.Components.wb wbVar = hVar.W;
                if (wbVar != null) {
                    int[] iArr3 = vh.h.f48874d0;
                    wbVar.getLocationInWindow(iArr3);
                    float f10 = iArr3[0];
                    float translationY = iArr3[1] - hVar.W.getTranslationY();
                    org.telegram.ui.Components.wb wbVar2 = hVar.W;
                    if (wbVar2.top) {
                        f7 = wbVar2.getTopOffset();
                    } else {
                        f7 = -wbVar2.getBottomOffset();
                    }
                    hVar.f48877a.getLocationInWindow(iArr3);
                    hVar.X = (hVar.W.f32175a.getMeasuredWidth() / 2.0f) + (f10 - iArr3[0]) + hVar.W.f32175a.getLeft();
                    hVar.Y = (hVar.W.f32175a.getMeasuredHeight() / 2.0f) + ((translationY + f7) - iArr3[1]) + hVar.W.f32175a.getTop();
                }
                hVar.c();
                return true;
        }
    }
}
