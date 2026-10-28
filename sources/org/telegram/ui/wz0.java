package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class wz0 implements fi.jb {
    public final ProfileActivity f45432a;

    public wz0(ProfileActivity profileActivity) {
        this.f45432a = profileActivity;
    }

    @Override
    public final fi.nb b(long j10) {
        float f7;
        ProfileActivity profileActivity = this.f45432a;
        if (j10 == profileActivity.a()) {
            profileActivity.f36002e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.i4(), 0.0f, profileActivity.f36047k2));
            az0 az0Var = profileActivity.f36002e0;
            boolean isForum = ChatObject.isForum(profileActivity.E2);
            if (az0Var != null && az0Var.getRootView() != null) {
                float scaleX = ((View) az0Var.getParent()).getScaleX();
                float imageWidth = az0Var.getImageReceiver().getImageWidth() * scaleX;
                if (isForum) {
                    f7 = 0.32f * imageWidth;
                } else {
                    f7 = imageWidth;
                }
                fi.lb lbVar = new fi.lb(az0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                az0Var.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(az0Var, (ViewGroup) az0Var.getRootView(), fArr);
                float imageX = (az0Var.getImageReceiver().getImageX() * scaleX) + iArr[0] + fArr[0];
                float imageY = (az0Var.getImageReceiver().getImageY() * scaleX) + iArr[1] + fArr[1];
                lbVar.f11323c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                lbVar.e = az0Var.getImageReceiver();
                lbVar.f11322b = f7;
                return lbVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void c(long j10, bi.r3 r3Var) {
        ProfileActivity profileActivity = this.f45432a;
        profileActivity.f36002e0.setHasStories(profileActivity.q4());
        if (j10 == profileActivity.a() && profileActivity.f36073o2 && profileActivity.f36047k2 > 0.0f) {
            profileActivity.f35987c.h1(0, profileActivity.c4() - profileActivity.f35972a.getPaddingTop());
            profileActivity.f35972a.post(new hb0(profileActivity, 15));
        }
        AndroidUtilities.runOnUIThread(r3Var, 30L);
    }
}
