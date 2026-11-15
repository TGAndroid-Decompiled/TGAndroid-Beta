package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
public final class tv0 implements hi.ja {
    public final ProfileActivity f51677a;

    public tv0(ProfileActivity profileActivity) {
        this.f51677a = profileActivity;
    }

    @Override
    public final hi.na a(long j3) {
        float f10;
        ProfileActivity profileActivity = this.f51677a;
        if (j3 == profileActivity.a()) {
            profileActivity.f43101f0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(profileActivity.r4(), 0.0f, profileActivity.f43143l2));
            xu0 xu0Var = profileActivity.f43101f0;
            boolean c02 = org.telegram.messenger.t3.c0(profileActivity.F2);
            if (xu0Var != null && xu0Var.getRootView() != null) {
                float scaleX = ((View) xu0Var.getParent()).getScaleX();
                float f11 = xu0Var.getImageReceiver().N0 * scaleX;
                if (c02) {
                    f10 = 0.32f * f11;
                } else {
                    f10 = f11;
                }
                hi.la laVar = new hi.la(xu0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                xu0Var.getRootView().getLocationOnScreen(iArr);
                org.telegram.messenger.g0.r1(xu0Var, (ViewGroup) xu0Var.getRootView(), fArr);
                float f12 = (xu0Var.getImageReceiver().L0 * scaleX) + iArr[0] + fArr[0];
                float f13 = (xu0Var.getImageReceiver().M0 * scaleX) + iArr[1] + fArr[1];
                laVar.f14783c.set(f12, f13, f12 + f11, f11 + f13);
                laVar.f14784e = xu0Var.getImageReceiver();
                laVar.f14782b = f10;
                return laVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void e(long j3, di.x2 x2Var) {
        ProfileActivity profileActivity = this.f51677a;
        profileActivity.f43101f0.setHasStories(profileActivity.z4());
        if (j3 == profileActivity.a() && profileActivity.f43169p2 && profileActivity.f43143l2 > 0.0f) {
            profileActivity.f43078c.h1(0, profileActivity.i4() - profileActivity.f43062a.getPaddingTop());
            profileActivity.f43062a.post(new k90(profileActivity, 16));
        }
        org.telegram.messenger.g0.i3(x2Var, 30L);
    }
}
