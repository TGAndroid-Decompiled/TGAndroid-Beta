package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
public final class wv0 implements fi.ma {
    public final ProfileActivity f51486a;

    public wv0(ProfileActivity profileActivity) {
        this.f51486a = profileActivity;
    }

    @Override
    public final fi.qa d(long j3) {
        float f10;
        ProfileActivity profileActivity = this.f51486a;
        if (j3 == profileActivity.a()) {
            profileActivity.f41729e0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(profileActivity.s4(), 0.0f, profileActivity.f41767j2));
            bv0 bv0Var = profileActivity.f41729e0;
            boolean c02 = org.telegram.messenger.t3.c0(profileActivity.D2);
            if (bv0Var != null && bv0Var.getRootView() != null) {
                float scaleX = ((View) bv0Var.getParent()).getScaleX();
                float f11 = bv0Var.getImageReceiver().M0 * scaleX;
                if (c02) {
                    f10 = 0.32f * f11;
                } else {
                    f10 = f11;
                }
                fi.oa oaVar = new fi.oa(bv0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                bv0Var.getRootView().getLocationOnScreen(iArr);
                org.telegram.messenger.g0.r1(bv0Var, (ViewGroup) bv0Var.getRootView(), fArr);
                float f12 = (bv0Var.getImageReceiver().K0 * scaleX) + iArr[0] + fArr[0];
                float f13 = (bv0Var.getImageReceiver().L0 * scaleX) + iArr[1] + fArr[1];
                oaVar.f12688c.set(f12, f13, f12 + f11, f11 + f13);
                oaVar.f12689e = bv0Var.getImageReceiver();
                oaVar.f12687b = f10;
                return oaVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void g(long j3, bi.r3 r3Var) {
        ProfileActivity profileActivity = this.f51486a;
        profileActivity.f41729e0.setHasStories(profileActivity.A4());
        if (j3 == profileActivity.a() && profileActivity.f41792n2 && profileActivity.f41767j2 > 0.0f) {
            profileActivity.f41714c.h1(0, profileActivity.j4() - profileActivity.f41698a.getPaddingTop());
            profileActivity.f41698a.post(new l90(profileActivity, 16));
        }
        org.telegram.messenger.g0.i3(r3Var, 30L);
    }
}
