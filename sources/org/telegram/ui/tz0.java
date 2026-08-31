package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class tz0 implements qh.s9 {
    public final ProfileActivity f41740a;

    public tz0(ProfileActivity profileActivity) {
        this.f41740a = profileActivity;
    }

    @Override
    public final qh.x9 a(long j10) {
        float f10;
        ProfileActivity profileActivity = this.f41740a;
        if (j10 == profileActivity.a()) {
            profileActivity.f34568b0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.f34613h2));
            yy0 yy0Var = profileActivity.f34568b0;
            boolean isForum = ChatObject.isForum(profileActivity.B2);
            if (yy0Var != null && yy0Var.getRootView() != null) {
                float scaleX = ((View) yy0Var.getParent()).getScaleX();
                float imageWidth = yy0Var.getImageReceiver().getImageWidth() * scaleX;
                if (isForum) {
                    f10 = 0.32f * imageWidth;
                } else {
                    f10 = imageWidth;
                }
                qh.u9 u9Var = new qh.u9(yy0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                yy0Var.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(yy0Var, (ViewGroup) yy0Var.getRootView(), fArr);
                float imageX = (yy0Var.getImageReceiver().getImageX() * scaleX) + iArr[0] + fArr[0];
                float imageY = (yy0Var.getImageReceiver().getImageY() * scaleX) + iArr[1] + fArr[1];
                u9Var.f46305c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                u9Var.f46306e = yy0Var.getImageReceiver();
                u9Var.f46304b = f10;
                return u9Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void b(long j10, hg.y1 y1Var) {
        ProfileActivity profileActivity = this.f41740a;
        profileActivity.f34568b0.setHasStories(profileActivity.j4());
        if (j10 == profileActivity.a() && profileActivity.f34640l2 && profileActivity.f34613h2 > 0.0f) {
            profileActivity.f34575c.h1(0, profileActivity.T3() - profileActivity.f34560a.getPaddingTop());
            profileActivity.f34560a.post(new pb0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(y1Var, 30L);
    }
}
