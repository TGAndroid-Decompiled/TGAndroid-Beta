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
public final class xl implements ViewTreeObserver.OnPreDrawListener {
    public final int f43235a;
    public final Object f43236b;
    public final Object f43237c;

    public xl(int i10, Object obj, Object obj2) {
        this.f43235a = i10;
        this.f43237c = obj;
        this.f43236b = obj2;
    }

    @Override
    public final boolean onPreDraw() {
        int[] iArr;
        float f7;
        int i10 = this.f43235a;
        Object obj = this.f43237c;
        Object obj2 = this.f43236b;
        switch (i10) {
            case 0:
                qn qnVar = ((dm) obj).Q;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj2;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.e(true);
                }
                u1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = u1Var.getPhotoImage();
                float imageWidth = photoImage.getImageWidth();
                RectF cameraRect = qnVar.f40632b3.getCameraRect();
                float width = imageWidth / cameraRect.width();
                u1Var.getTransitionParams().f23167x0 = true;
                u1Var.setAlpha(0.0f);
                u1Var.setTimeAlpha(0.0f);
                u1Var.getLocationOnScreen(r9);
                int[] iArr2 = {(int) ((photoImage.getImageX() - u1Var.getAnimationOffsetX()) + iArr2[0]), (int) (((photoImage.getImageY() + u1Var.getPaddingTop()) - u1Var.getTranslationY()) + iArr2[1])};
                org.telegram.ui.Components.o60 cameraContainer = qnVar.f40632b3.getCameraContainer();
                cameraContainer.getLocationOnScreen(new int[2]);
                cameraContainer.setPivotX(cameraRect.left - iArr[0]);
                cameraContainer.setPivotY(cameraRect.top - iArr[1]);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, width);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, width);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_Y, iArr2[1] - cameraRect.top);
                View buttonsLayout = qnVar.f40632b3.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, property, 0.0f), ObjectAnimator.ofInt(qnVar.f40632b3.getPaint(), org.telegram.ui.Components.t6.f30449b, 0), ObjectAnimator.ofFloat(qnVar.f40632b3.getMuteImageView(), property, 0.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.bs.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_X, iArr2[0] - cameraRect.left);
                ofFloat4.setInterpolator(org.telegram.ui.Components.bs.f25025f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                org.telegram.ui.Components.r60 r60Var = qnVar.f40632b3;
                if (r60Var != null) {
                    r60Var.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new ai.me(15, this, cameraContainer));
                animatorSet2.start();
                return true;
            case 1:
                ((hx) obj).f37818b.f36096e0[0].f35447a.getViewTreeObserver().removeOnPreDrawListener(this);
                AndroidUtilities.runOnUIThread((ai.v3) obj2, 100L);
                return false;
            default:
                ((ViewTreeObserver) obj2).removeOnPreDrawListener(this);
                vh.h hVar = (vh.h) obj;
                org.telegram.ui.Components.yb ybVar = hVar.W;
                if (ybVar != null) {
                    int[] iArr3 = vh.h.f48437d0;
                    ybVar.getLocationInWindow(iArr3);
                    float f10 = iArr3[0];
                    float translationY = iArr3[1] - hVar.W.getTranslationY();
                    org.telegram.ui.Components.yb ybVar2 = hVar.W;
                    if (ybVar2.top) {
                        f7 = ybVar2.getTopOffset();
                    } else {
                        f7 = -ybVar2.getBottomOffset();
                    }
                    hVar.f48440a.getLocationInWindow(iArr3);
                    hVar.X = (hVar.W.f32628a.getMeasuredWidth() / 2.0f) + (f10 - iArr3[0]) + hVar.W.f32628a.getLeft();
                    hVar.Y = (hVar.W.f32628a.getMeasuredHeight() / 2.0f) + ((translationY + f7) - iArr3[1]) + hVar.W.f32628a.getTop();
                }
                hVar.c();
                return true;
        }
    }
}
