package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
public final class uv0 implements hi.ja {
    public final ProfileActivity f52647a;

    public uv0(ProfileActivity profileActivity) {
        this.f52647a = profileActivity;
    }

    @Override
    public final hi.na a(long j3) {
        float f10;
        ProfileActivity profileActivity = this.f52647a;
        if (j3 == profileActivity.a()) {
            profileActivity.f43592f0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(profileActivity.s4(), 0.0f, profileActivity.f43634l2));
            zu0 zu0Var = profileActivity.f43592f0;
            boolean c02 = org.telegram.messenger.v3.c0(profileActivity.F2);
            if (zu0Var != null && zu0Var.getRootView() != null) {
                float scaleX = ((View) zu0Var.getParent()).getScaleX();
                float f11 = zu0Var.getImageReceiver().N0 * scaleX;
                if (c02) {
                    f10 = 0.32f * f11;
                } else {
                    f10 = f11;
                }
                hi.la laVar = new hi.la(zu0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                zu0Var.getRootView().getLocationOnScreen(iArr);
                org.telegram.messenger.g0.r1(zu0Var, (ViewGroup) zu0Var.getRootView(), fArr);
                float f12 = (zu0Var.getImageReceiver().L0 * scaleX) + iArr[0] + fArr[0];
                float f13 = (zu0Var.getImageReceiver().M0 * scaleX) + iArr[1] + fArr[1];
                laVar.f15137c.set(f12, f13, f12 + f11, f11 + f13);
                laVar.f15138e = zu0Var.getImageReceiver();
                laVar.f15136b = f10;
                return laVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void b(long j3, bi.c4 c4Var) {
        ProfileActivity profileActivity = this.f52647a;
        profileActivity.f43592f0.setHasStories(profileActivity.A4());
        if (j3 == profileActivity.a() && profileActivity.f43660p2 && profileActivity.f43634l2 > 0.0f) {
            profileActivity.f43569c.h1(0, profileActivity.j4() - profileActivity.f43553a.getPaddingTop());
            profileActivity.f43553a.post(new n90(profileActivity, 16));
        }
        org.telegram.messenger.g0.h3(c4Var, 30L);
    }
}
