package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class yz0 implements ph.u9 {
    public final ProfileActivity f40362a;

    public yz0(ProfileActivity profileActivity) {
        this.f40362a = profileActivity;
    }

    @Override
    public final ph.y9 a(long j10) {
        float f10;
        ProfileActivity profileActivity = this.f40362a;
        if (j10 == profileActivity.a()) {
            profileActivity.f32010b0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.f32054h2));
            cz0 cz0Var = profileActivity.f32010b0;
            boolean isForum = ChatObject.isForum(profileActivity.B2);
            if (cz0Var != null && cz0Var.getRootView() != null) {
                float scaleX = ((View) cz0Var.getParent()).getScaleX();
                float imageWidth = cz0Var.getImageReceiver().getImageWidth() * scaleX;
                if (isForum) {
                    f10 = 0.32f * imageWidth;
                } else {
                    f10 = imageWidth;
                }
                ph.w9 w9Var = new ph.w9(cz0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                cz0Var.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(cz0Var, (ViewGroup) cz0Var.getRootView(), fArr);
                float imageX = (cz0Var.getImageReceiver().getImageX() * scaleX) + iArr[0] + fArr[0];
                float imageY = (cz0Var.getImageReceiver().getImageY() * scaleX) + iArr[1] + fArr[1];
                w9Var.f42673c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                w9Var.e = cz0Var.getImageReceiver();
                w9Var.f42672b = f10;
                return w9Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void b(long j10, gg.y1 y1Var) {
        ProfileActivity profileActivity = this.f40362a;
        profileActivity.f32010b0.setHasStories(profileActivity.j4());
        if (j10 == profileActivity.a() && profileActivity.f32081l2 && profileActivity.f32054h2 > 0.0f) {
            profileActivity.f32017c.h1(0, profileActivity.T3() - profileActivity.f32002a.getPaddingTop());
            profileActivity.f32002a.post(new qb0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(y1Var, 30L);
    }
}
