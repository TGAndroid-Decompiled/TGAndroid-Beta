package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
public final class vv0 implements hi.ka {
    public final ProfileActivity f52866a;

    public vv0(ProfileActivity profileActivity) {
        this.f52866a = profileActivity;
    }

    @Override
    public final hi.oa a(long j3) {
        float f10;
        ProfileActivity profileActivity = this.f52866a;
        if (j3 == profileActivity.a()) {
            profileActivity.f43557f0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(profileActivity.s4(), 0.0f, profileActivity.f43599l2));
            av0 av0Var = profileActivity.f43557f0;
            boolean c02 = org.telegram.messenger.v3.c0(profileActivity.F2);
            if (av0Var != null && av0Var.getRootView() != null) {
                float scaleX = ((View) av0Var.getParent()).getScaleX();
                float f11 = av0Var.getImageReceiver().N0 * scaleX;
                if (c02) {
                    f10 = 0.32f * f11;
                } else {
                    f10 = f11;
                }
                hi.ma maVar = new hi.ma(av0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                av0Var.getRootView().getLocationOnScreen(iArr);
                org.telegram.messenger.g0.r1(av0Var, (ViewGroup) av0Var.getRootView(), fArr);
                float f12 = (av0Var.getImageReceiver().L0 * scaleX) + iArr[0] + fArr[0];
                float f13 = (av0Var.getImageReceiver().M0 * scaleX) + iArr[1] + fArr[1];
                maVar.f15159c.set(f12, f13, f12 + f11, f11 + f13);
                maVar.f15160e = av0Var.getImageReceiver();
                maVar.f15158b = f10;
                return maVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void b(long j3, bi.e4 e4Var) {
        ProfileActivity profileActivity = this.f52866a;
        profileActivity.f43557f0.setHasStories(profileActivity.A4());
        if (j3 == profileActivity.a() && profileActivity.f43625p2 && profileActivity.f43599l2 > 0.0f) {
            profileActivity.f43534c.h1(0, profileActivity.j4() - profileActivity.f43518a.getPaddingTop());
            profileActivity.f43518a.post(new n90(profileActivity, 16));
        }
        org.telegram.messenger.g0.h3(e4Var, 30L);
    }
}
