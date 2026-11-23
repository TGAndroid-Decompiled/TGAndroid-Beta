package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
public final class tv0 implements hi.eb {
    public final ProfileActivity f52486a;

    public tv0(ProfileActivity profileActivity) {
        this.f52486a = profileActivity;
    }

    @Override
    public final hi.ib a(long j3) {
        float f10;
        ProfileActivity profileActivity = this.f52486a;
        if (j3 == profileActivity.a()) {
            profileActivity.f43673f0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(profileActivity.s4(), 0.0f, profileActivity.f43715l2));
            yu0 yu0Var = profileActivity.f43673f0;
            boolean c02 = org.telegram.messenger.v3.c0(profileActivity.F2);
            if (yu0Var != null && yu0Var.getRootView() != null) {
                float scaleX = ((View) yu0Var.getParent()).getScaleX();
                float f11 = yu0Var.getImageReceiver().N0 * scaleX;
                if (c02) {
                    f10 = 0.32f * f11;
                } else {
                    f10 = f11;
                }
                hi.gb gbVar = new hi.gb(yu0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                yu0Var.getRootView().getLocationOnScreen(iArr);
                org.telegram.messenger.g0.r1(yu0Var, (ViewGroup) yu0Var.getRootView(), fArr);
                float f12 = (yu0Var.getImageReceiver().L0 * scaleX) + iArr[0] + fArr[0];
                float f13 = (yu0Var.getImageReceiver().M0 * scaleX) + iArr[1] + fArr[1];
                gbVar.f14710c.set(f12, f13, f12 + f11, f11 + f13);
                gbVar.f14711e = yu0Var.getImageReceiver();
                gbVar.f14709b = f10;
                return gbVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void c(long j3, bi.e4 e4Var) {
        ProfileActivity profileActivity = this.f52486a;
        profileActivity.f43673f0.setHasStories(profileActivity.A4());
        if (j3 == profileActivity.a() && profileActivity.f43741p2 && profileActivity.f43715l2 > 0.0f) {
            profileActivity.f43650c.h1(0, profileActivity.j4() - profileActivity.f43634a.getPaddingTop());
            profileActivity.f43634a.post(new m90(profileActivity, 16));
        }
        org.telegram.messenger.g0.h3(e4Var, 30L);
    }
}
