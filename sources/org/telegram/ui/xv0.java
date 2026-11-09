package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xv0 extends org.telegram.ui.Components.zs0 {
    public boolean f51770w2;
    public final ProfileActivity f51771x2;

    public xv0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.Components.rs0 rs0Var, int i7, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, int i11, ProfileActivity profileActivity2, ProfileActivity profileActivity3, org.telegram.ui.ActionBar.g6 g6Var, dh.c cVar) {
        super(context, j3, rs0Var, i7, arrayList, chatFull, userFull, i10, i11, profileActivity2, profileActivity3, 1, g6Var, cVar);
        this.f51771x2 = profileActivity;
    }

    @Override
    public final boolean H0() {
        return this.f51771x2.f41819r1;
    }

    @Override
    public final boolean I0() {
        return this.f51771x2.f41819r1;
    }

    @Override
    public final void P0(SparseArray sparseArray) {
        char c10;
        ProfileActivity profileActivity = this.f51771x2;
        if (profileActivity.f41819r1) {
            int size = sparseArray.size();
            int selectedTab = getSelectedTab();
            if (!org.telegram.ui.Components.zs0.J0(selectedTab) && selectedTab != 8) {
                if (selectedTab == 9) {
                    c10 = 1;
                } else {
                    c10 = 65535;
                }
            } else {
                c10 = 0;
            }
            if (c10 >= 0) {
                if (c10 == 0) {
                    ProfileActivity.O0(profileActivity, size);
                }
                profileActivity.f41874y5[c10].c(size, true);
            }
        }
    }

    @Override
    public final void P1(boolean z9) {
        int i7;
        int i10;
        super.P1(z9);
        ProfileActivity profileActivity = this.f51771x2;
        boolean z10 = profileActivity.f41827s1;
        org.telegram.ui.Components.vp0 vp0Var = this.f41057a0;
        if (z10 && !profileActivity.f41846v1 && this.K0.d(14)) {
            if (!this.f51770w2 && (i10 = profileActivity.f41833t1) > 0 && vp0Var != null) {
                this.f51770w2 = true;
                vp0Var.P = i10;
                vp0Var.e();
            }
            profileActivity.f41846v1 = true;
            k1(14);
        } else if (profileActivity.f41827s1 && profileActivity.f41846v1 && !this.f51770w2 && (i7 = profileActivity.f41833t1) > 0 && vp0Var != null) {
            this.f51770w2 = true;
            vp0Var.P = i7;
            vp0Var.e();
        }
    }

    @Override
    public final void Q0() {
        FrameLayout frameLayout;
        xv0 xv0Var;
        ProfileActivity profileActivity = this.f51771x2;
        if (profileActivity.f41819r1 && (frameLayout = profileActivity.f41850v5[0]) != null && (xv0Var = profileActivity.N) != null) {
            ProfileActivity.b5(frameLayout, 1.0f - xv0Var.getBottomButtonStoriesVisibility());
        }
    }

    @Override
    public final boolean U0(TLRPC.ChatParticipant chatParticipant, boolean z9, View view) {
        return this.f51771x2.h(chatParticipant, z9, false, view);
    }

    @Override
    public final void W0() {
        RectF rectF = ProfileActivity.V6;
        this.f51771x2.E5(true);
    }

    @Override
    public final void X0(boolean z9) {
        int i7;
        ProfileActivity profileActivity = this.f51771x2;
        Activity parentActivity = profileActivity.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.f2) profileActivity).classGuid;
        org.telegram.messenger.g0.B2(parentActivity, i7);
        profileActivity.f41698a.C0();
        profileActivity.Y.setPivotY((profileActivity.X.getMeasuredHeight() / 2.0f) + profileActivity.X.getPivotY());
        bi.x5 x5Var = profileActivity.Y;
        x5Var.setPivotX(x5Var.getMeasuredWidth() / 2.0f);
        org.telegram.messenger.g0.Z3(profileActivity.Y, !z9, 0.95f, true, true);
        profileActivity.O5(false);
    }

    @Override
    public final void Y0() {
        this.f51771x2.V();
    }

    @Override
    public final void Z0(float f10) {
        Q0();
        ProfileActivity profileActivity = this.f51771x2;
        xv0 xv0Var = profileActivity.N;
        if (xv0Var != null && profileActivity.f41819r1) {
            if (profileActivity.f41850v5[0] != null) {
                profileActivity.f41850v5[0].setTranslationX(xv0Var.q0(8, true));
            }
            if (profileActivity.f41850v5[1] != null) {
                profileActivity.f41850v5[1].setTranslationX(profileActivity.N.q0(9, false));
            }
            ProfileActivity.O0(profileActivity, profileActivity.H6);
            profileActivity.s5();
        }
    }

    @Override
    public final int getInitialTab() {
        return 8;
    }

    @Override
    public final int h1(int i7) {
        RectF rectF = ProfileActivity.V6;
        this.f51771x2.getClass();
        return i7;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.g0.h3(new tu0(this, 3));
    }

    @Override
    public final void q1(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xv0.q1(boolean):void");
    }

    @Override
    public final boolean x0() {
        ProfileActivity profileActivity = this.f51771x2;
        if (profileActivity.f41752h1 == profileActivity.getUserConfig().e() && !profileActivity.f41745g1) {
            return true;
        }
        return false;
    }
}
