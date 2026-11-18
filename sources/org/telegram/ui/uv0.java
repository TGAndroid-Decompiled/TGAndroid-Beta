package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
public final class uv0 implements hi.ka {
    public final ProfileActivity f52635a;

    public uv0(ProfileActivity profileActivity) {
        this.f52635a = profileActivity;
    }

    @Override
    public final hi.oa a(long j3) {
        float f10;
        ProfileActivity profileActivity = this.f52635a;
        if (j3 == profileActivity.a()) {
            profileActivity.f43547f0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(profileActivity.s4(), 0.0f, profileActivity.f43589l2));
            zu0 zu0Var = profileActivity.f43547f0;
            boolean c02 = org.telegram.messenger.v3.c0(profileActivity.F2);
            if (zu0Var != null && zu0Var.getRootView() != null) {
                float scaleX = ((View) zu0Var.getParent()).getScaleX();
                float f11 = zu0Var.getImageReceiver().N0 * scaleX;
                if (c02) {
                    f10 = 0.32f * f11;
                } else {
                    f10 = f11;
                }
                hi.ma maVar = new hi.ma(zu0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                zu0Var.getRootView().getLocationOnScreen(iArr);
                org.telegram.messenger.g0.r1(zu0Var, (ViewGroup) zu0Var.getRootView(), fArr);
                float f12 = (zu0Var.getImageReceiver().L0 * scaleX) + iArr[0] + fArr[0];
                float f13 = (zu0Var.getImageReceiver().M0 * scaleX) + iArr[1] + fArr[1];
                maVar.f15204c.set(f12, f13, f12 + f11, f11 + f13);
                maVar.f15205e = zu0Var.getImageReceiver();
                maVar.f15203b = f10;
                return maVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void b(long j3, bi.y3 y3Var) {
        ProfileActivity profileActivity = this.f52635a;
        profileActivity.f43547f0.setHasStories(profileActivity.A4());
        if (j3 == profileActivity.a() && profileActivity.f43615p2 && profileActivity.f43589l2 > 0.0f) {
            profileActivity.f43524c.h1(0, profileActivity.j4() - profileActivity.f43508a.getPaddingTop());
            profileActivity.f43508a.post(new m90(profileActivity, 16));
        }
        org.telegram.messenger.g0.h3(y3Var, 30L);
    }
}
