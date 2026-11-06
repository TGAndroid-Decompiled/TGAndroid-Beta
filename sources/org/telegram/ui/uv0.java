package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
public final class uv0 implements fi.ma {
    public final ProfileActivity f50498a;

    public uv0(ProfileActivity profileActivity) {
        this.f50498a = profileActivity;
    }

    @Override
    public final fi.qa d(long j3) {
        float f10;
        ProfileActivity profileActivity = this.f50498a;
        if (j3 == profileActivity.a()) {
            profileActivity.f41694e0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(profileActivity.q4(), 0.0f, profileActivity.f41732j2));
            yu0 yu0Var = profileActivity.f41694e0;
            boolean c02 = org.telegram.messenger.t3.c0(profileActivity.D2);
            if (yu0Var != null && yu0Var.getRootView() != null) {
                float scaleX = ((View) yu0Var.getParent()).getScaleX();
                float f11 = yu0Var.getImageReceiver().M0 * scaleX;
                if (c02) {
                    f10 = 0.32f * f11;
                } else {
                    f10 = f11;
                }
                fi.oa oaVar = new fi.oa(yu0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                yu0Var.getRootView().getLocationOnScreen(iArr);
                org.telegram.messenger.g0.r1(yu0Var, (ViewGroup) yu0Var.getRootView(), fArr);
                float f12 = (yu0Var.getImageReceiver().K0 * scaleX) + iArr[0] + fArr[0];
                float f13 = (yu0Var.getImageReceiver().L0 * scaleX) + iArr[1] + fArr[1];
                oaVar.f12687c.set(f12, f13, f12 + f11, f11 + f13);
                oaVar.f12688e = yu0Var.getImageReceiver();
                oaVar.f12686b = f10;
                return oaVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void g(long j3, bi.r3 r3Var) {
        ProfileActivity profileActivity = this.f50498a;
        profileActivity.f41694e0.setHasStories(profileActivity.x4());
        if (j3 == profileActivity.a() && profileActivity.f41757n2 && profileActivity.f41732j2 > 0.0f) {
            profileActivity.f41679c.h1(0, profileActivity.j4() - profileActivity.f41663a.getPaddingTop());
            profileActivity.f41663a.post(new j90(profileActivity, 16));
        }
        org.telegram.messenger.g0.i3(r3Var, 30L);
    }
}
