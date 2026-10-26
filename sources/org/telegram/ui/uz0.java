package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class uz0 implements fi.jb {
    public final ProfileActivity f44556a;

    public uz0(ProfileActivity profileActivity) {
        this.f44556a = profileActivity;
    }

    @Override
    public final fi.nb b(long j10) {
        float f7;
        ProfileActivity profileActivity = this.f44556a;
        if (j10 == profileActivity.a()) {
            profileActivity.f35978e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.i4(), 0.0f, profileActivity.f36023k2));
            yy0 yy0Var = profileActivity.f35978e0;
            boolean isForum = ChatObject.isForum(profileActivity.E2);
            if (yy0Var != null && yy0Var.getRootView() != null) {
                float scaleX = ((View) yy0Var.getParent()).getScaleX();
                float imageWidth = yy0Var.getImageReceiver().getImageWidth() * scaleX;
                if (isForum) {
                    f7 = 0.32f * imageWidth;
                } else {
                    f7 = imageWidth;
                }
                fi.lb lbVar = new fi.lb(yy0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                yy0Var.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(yy0Var, (ViewGroup) yy0Var.getRootView(), fArr);
                float imageX = (yy0Var.getImageReceiver().getImageX() * scaleX) + iArr[0] + fArr[0];
                float imageY = (yy0Var.getImageReceiver().getImageY() * scaleX) + iArr[1] + fArr[1];
                lbVar.f11324c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                lbVar.e = yy0Var.getImageReceiver();
                lbVar.f11323b = f7;
                return lbVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void c(long j10, bi.r3 r3Var) {
        ProfileActivity profileActivity = this.f44556a;
        profileActivity.f35978e0.setHasStories(profileActivity.q4());
        if (j10 == profileActivity.a() && profileActivity.f36049o2 && profileActivity.f36023k2 > 0.0f) {
            profileActivity.f35963c.h1(0, profileActivity.c4() - profileActivity.f35948a.getPaddingTop());
            profileActivity.f35948a.post(new fb0(profileActivity, 15));
        }
        AndroidUtilities.runOnUIThread(r3Var, 30L);
    }
}
