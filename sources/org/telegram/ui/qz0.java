package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class qz0 implements ei.mb {
    public final ProfileActivity f40948a;

    public qz0(ProfileActivity profileActivity) {
        this.f40948a = profileActivity;
    }

    @Override
    public final ei.qb a(long j10) {
        float f7;
        ProfileActivity profileActivity = this.f40948a;
        if (j10 == profileActivity.a()) {
            profileActivity.f33920f0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.e4(), 0.0f, profileActivity.f33963l2));
            vy0 vy0Var = profileActivity.f33920f0;
            boolean isForum = ChatObject.isForum(profileActivity.F2);
            if (vy0Var != null && vy0Var.getRootView() != null) {
                float scaleX = ((View) vy0Var.getParent()).getScaleX();
                float imageWidth = vy0Var.getImageReceiver().getImageWidth() * scaleX;
                if (isForum) {
                    f7 = 0.32f * imageWidth;
                } else {
                    f7 = imageWidth;
                }
                ei.ob obVar = new ei.ob(vy0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                vy0Var.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(vy0Var, (ViewGroup) vy0Var.getRootView(), fArr);
                float imageX = (vy0Var.getImageReceiver().getImageX() * scaleX) + iArr[0] + fArr[0];
                float imageY = (vy0Var.getImageReceiver().getImageY() * scaleX) + iArr[1] + fArr[1];
                obVar.f9681c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                obVar.e = vy0Var.getImageReceiver();
                obVar.f9680b = f7;
                return obVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void b(long j10, ai.v3 v3Var) {
        ProfileActivity profileActivity = this.f40948a;
        profileActivity.f33920f0.setHasStories(profileActivity.l4());
        if (j10 == profileActivity.a() && profileActivity.f33990p2 && profileActivity.f33963l2 > 0.0f) {
            profileActivity.f33897c.h1(0, profileActivity.V3() - profileActivity.f33882a.getPaddingTop());
            profileActivity.f33882a.post(new ib0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(v3Var, 30L);
    }
}
