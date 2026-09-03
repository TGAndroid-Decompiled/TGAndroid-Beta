package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class yz0 implements qh.r9 {
    public final ProfileActivity f43741a;

    public yz0(ProfileActivity profileActivity) {
        this.f43741a = profileActivity;
    }

    @Override
    public final qh.w9 a(long j10) {
        float f10;
        ProfileActivity profileActivity = this.f43741a;
        if (j10 == profileActivity.a()) {
            profileActivity.f34568b0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.f34613h2));
            cz0 cz0Var = profileActivity.f34568b0;
            boolean isForum = ChatObject.isForum(profileActivity.B2);
            if (cz0Var != null && cz0Var.getRootView() != null) {
                float scaleX = ((View) cz0Var.getParent()).getScaleX();
                float imageWidth = cz0Var.getImageReceiver().getImageWidth() * scaleX;
                if (isForum) {
                    f10 = 0.32f * imageWidth;
                } else {
                    f10 = imageWidth;
                }
                qh.t9 t9Var = new qh.t9(cz0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                cz0Var.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(cz0Var, (ViewGroup) cz0Var.getRootView(), fArr);
                float imageX = (cz0Var.getImageReceiver().getImageX() * scaleX) + iArr[0] + fArr[0];
                float imageY = (cz0Var.getImageReceiver().getImageY() * scaleX) + iArr[1] + fArr[1];
                t9Var.f46278c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                t9Var.f46279e = cz0Var.getImageReceiver();
                t9Var.f46277b = f10;
                return t9Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void b(long j10, hg.y1 y1Var) {
        ProfileActivity profileActivity = this.f43741a;
        profileActivity.f34568b0.setHasStories(profileActivity.j4());
        if (j10 == profileActivity.a() && profileActivity.f34640l2 && profileActivity.f34613h2 > 0.0f) {
            profileActivity.f34575c.h1(0, profileActivity.T3() - profileActivity.f34560a.getPaddingTop());
            profileActivity.f34560a.post(new pb0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(y1Var, 30L);
    }
}
