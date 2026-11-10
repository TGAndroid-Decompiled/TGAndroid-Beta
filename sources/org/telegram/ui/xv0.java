package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
public final class xv0 implements fi.ma {
    public final ProfileActivity f51827a;

    public xv0(ProfileActivity profileActivity) {
        this.f51827a = profileActivity;
    }

    @Override
    public final fi.qa d(long j3) {
        float f10;
        ProfileActivity profileActivity = this.f51827a;
        if (j3 == profileActivity.a()) {
            profileActivity.f41720e0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(profileActivity.s4(), 0.0f, profileActivity.f41758j2));
            cv0 cv0Var = profileActivity.f41720e0;
            boolean c02 = org.telegram.messenger.t3.c0(profileActivity.D2);
            if (cv0Var != null && cv0Var.getRootView() != null) {
                float scaleX = ((View) cv0Var.getParent()).getScaleX();
                float f11 = cv0Var.getImageReceiver().M0 * scaleX;
                if (c02) {
                    f10 = 0.32f * f11;
                } else {
                    f10 = f11;
                }
                fi.oa oaVar = new fi.oa(cv0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                cv0Var.getRootView().getLocationOnScreen(iArr);
                org.telegram.messenger.g0.r1(cv0Var, (ViewGroup) cv0Var.getRootView(), fArr);
                float f12 = (cv0Var.getImageReceiver().K0 * scaleX) + iArr[0] + fArr[0];
                float f13 = (cv0Var.getImageReceiver().L0 * scaleX) + iArr[1] + fArr[1];
                oaVar.f12692c.set(f12, f13, f12 + f11, f11 + f13);
                oaVar.f12693e = cv0Var.getImageReceiver();
                oaVar.f12691b = f10;
                return oaVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void g(long j3, bi.r3 r3Var) {
        ProfileActivity profileActivity = this.f51827a;
        profileActivity.f41720e0.setHasStories(profileActivity.A4());
        if (j3 == profileActivity.a() && profileActivity.f41783n2 && profileActivity.f41758j2 > 0.0f) {
            profileActivity.f41705c.h1(0, profileActivity.j4() - profileActivity.f41689a.getPaddingTop());
            profileActivity.f41689a.post(new m90(profileActivity, 16));
        }
        org.telegram.messenger.g0.i3(r3Var, 30L);
    }
}
