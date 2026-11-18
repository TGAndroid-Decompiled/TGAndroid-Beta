package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class vv0 extends org.telegram.ui.Components.gt0 {
    public boolean f52852x2;
    public final ProfileActivity f52853y2;

    public vv0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.Components.ys0 ys0Var, int i7, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, int i11, ProfileActivity profileActivity2, ProfileActivity profileActivity3, org.telegram.ui.ActionBar.i6 i6Var, dh.c cVar) {
        super(context, j3, ys0Var, i7, arrayList, chatFull, userFull, i10, i11, profileActivity2, profileActivity3, 1, i6Var, cVar);
        this.f52853y2 = profileActivity;
    }

    @Override
    public final boolean H0() {
        return this.f52853y2.f43637s1;
    }

    @Override
    public final boolean I0() {
        return this.f52853y2.f43637s1;
    }

    @Override
    public final void P0(SparseArray sparseArray) {
        char c10;
        ProfileActivity profileActivity = this.f52853y2;
        if (profileActivity.f43637s1) {
            int size = sparseArray.size();
            int selectedTab = getSelectedTab();
            if (!org.telegram.ui.Components.gt0.J0(selectedTab) && selectedTab != 8) {
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
                profileActivity.C5[c10].c(size, true);
            }
        }
    }

    @Override
    public final void P1(boolean z10) {
        int i7;
        int i10;
        super.P1(z10);
        ProfileActivity profileActivity = this.f52853y2;
        boolean z11 = profileActivity.f43643t1;
        org.telegram.ui.Components.eq0 eq0Var = this.f35572b0;
        if (z11 && !profileActivity.f43664w1 && this.L0.d(14)) {
            if (!this.f52852x2 && (i10 = profileActivity.f43649u1) > 0 && eq0Var != null) {
                this.f52852x2 = true;
                eq0Var.Q = i10;
                eq0Var.e();
            }
            profileActivity.f43664w1 = true;
            k1(14);
        } else if (profileActivity.f43643t1 && profileActivity.f43664w1 && !this.f52852x2 && (i7 = profileActivity.f43649u1) > 0 && eq0Var != null) {
            this.f52852x2 = true;
            eq0Var.Q = i7;
            eq0Var.e();
        }
    }

    @Override
    public final void Q0() {
        FrameLayout frameLayout;
        vv0 vv0Var;
        ProfileActivity profileActivity = this.f52853y2;
        if (profileActivity.f43637s1 && (frameLayout = profileActivity.f43691z5[0]) != null && (vv0Var = profileActivity.O) != null) {
            ProfileActivity.b5(frameLayout, 1.0f - vv0Var.getBottomButtonStoriesVisibility());
        }
    }

    @Override
    public final boolean U0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return this.f52853y2.h(chatParticipant, z10, false, view);
    }

    @Override
    public final void W0() {
        RectF rectF = ProfileActivity.Z6;
        this.f52853y2.F5(true);
    }

    @Override
    public final void X0(boolean z10) {
        int i7;
        ProfileActivity profileActivity = this.f52853y2;
        Activity parentActivity = profileActivity.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.h2) profileActivity).classGuid;
        org.telegram.messenger.g0.B2(parentActivity, i7);
        profileActivity.f43508a.C0();
        profileActivity.Z.setPivotY((profileActivity.Y.getMeasuredHeight() / 2.0f) + profileActivity.Y.getPivotY());
        ai.k0 k0Var = profileActivity.Z;
        k0Var.setPivotX(k0Var.getMeasuredWidth() / 2.0f);
        org.telegram.messenger.g0.X3(profileActivity.Z, !z10, 0.95f, true, true);
        profileActivity.P5(false);
    }

    @Override
    public final void Y0() {
        this.f52853y2.W();
    }

    @Override
    public final void Z0(float f10) {
        Q0();
        ProfileActivity profileActivity = this.f52853y2;
        vv0 vv0Var = profileActivity.O;
        if (vv0Var != null && profileActivity.f43637s1) {
            if (profileActivity.f43691z5[0] != null) {
                profileActivity.f43691z5[0].setTranslationX(vv0Var.q0(8, true));
            }
            if (profileActivity.f43691z5[1] != null) {
                profileActivity.f43691z5[1].setTranslationX(profileActivity.O.q0(9, false));
            }
            ProfileActivity.O0(profileActivity, profileActivity.L6);
            profileActivity.s5();
        }
    }

    @Override
    public final int getInitialTab() {
        return 8;
    }

    @Override
    public final int h1(int i7) {
        RectF rectF = ProfileActivity.Z6;
        this.f52853y2.getClass();
        return i7;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.g0.g3(new ru0(this, 3));
    }

    @Override
    public final void q1(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vv0.q1(boolean):void");
    }

    @Override
    public final boolean x0() {
        ProfileActivity profileActivity = this.f52853y2;
        if (profileActivity.f43569i1 == profileActivity.getUserConfig().e() && !profileActivity.f43562h1) {
            return true;
        }
        return false;
    }
}
