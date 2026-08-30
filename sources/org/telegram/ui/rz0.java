package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class rz0 implements ph.u9 {
    public final ProfileActivity f38152a;

    public rz0(ProfileActivity profileActivity) {
        this.f38152a = profileActivity;
    }

    @Override
    public final ph.y9 a(long j10) {
        float f10;
        ProfileActivity profileActivity = this.f38152a;
        if (j10 == profileActivity.a()) {
            profileActivity.f32036b0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.f32080h2));
            wy0 wy0Var = profileActivity.f32036b0;
            boolean isForum = ChatObject.isForum(profileActivity.B2);
            if (wy0Var != null && wy0Var.getRootView() != null) {
                float scaleX = ((View) wy0Var.getParent()).getScaleX();
                float imageWidth = wy0Var.getImageReceiver().getImageWidth() * scaleX;
                if (isForum) {
                    f10 = 0.32f * imageWidth;
                } else {
                    f10 = imageWidth;
                }
                ph.w9 w9Var = new ph.w9(wy0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                wy0Var.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(wy0Var, (ViewGroup) wy0Var.getRootView(), fArr);
                float imageX = (wy0Var.getImageReceiver().getImageX() * scaleX) + iArr[0] + fArr[0];
                float imageY = (wy0Var.getImageReceiver().getImageY() * scaleX) + iArr[1] + fArr[1];
                w9Var.f42633c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                w9Var.e = wy0Var.getImageReceiver();
                w9Var.f42632b = f10;
                return w9Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void b(long j10, gg.y1 y1Var) {
        ProfileActivity profileActivity = this.f38152a;
        profileActivity.f32036b0.setHasStories(profileActivity.j4());
        if (j10 == profileActivity.a() && profileActivity.f32107l2 && profileActivity.f32080h2 > 0.0f) {
            profileActivity.f32043c.h1(0, profileActivity.T3() - profileActivity.f32028a.getPaddingTop());
            profileActivity.f32028a.post(new ob0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(y1Var, 30L);
    }
}
