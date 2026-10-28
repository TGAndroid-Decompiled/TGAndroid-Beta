package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class xz0 extends org.telegram.ui.Components.bw0 {
    public boolean f45803r2;
    public final ProfileActivity f45804s2;

    public xz0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.Components.tv0 tv0Var, int i10, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i11, int i12, ProfileActivity profileActivity2, ProfileActivity profileActivity3, org.telegram.ui.ActionBar.u6 u6Var, ch.b bVar) {
        super(context, j10, tv0Var, i10, arrayList, chatFull, userFull, i11, i12, profileActivity2, profileActivity3, 1, u6Var, bVar);
        this.f45804s2 = profileActivity;
    }

    @Override
    public final boolean C0() {
        return this.f45804s2.f36100s1;
    }

    @Override
    public final boolean D0() {
        return this.f45804s2.f36100s1;
    }

    @Override
    public final void J1(boolean z10) {
        int i10;
        int i11;
        super.J1(z10);
        ProfileActivity profileActivity = this.f45804s2;
        boolean z11 = profileActivity.f36107t1;
        org.telegram.ui.Components.ws0 ws0Var = this.f26925a0;
        if (z11 && !profileActivity.f36129w1 && this.K0.d(14)) {
            if (!this.f45803r2 && (i11 = profileActivity.f36114u1) > 0 && ws0Var != null) {
                this.f45803r2 = true;
                ws0Var.P = i11;
                ws0Var.e();
            }
            profileActivity.f36129w1 = true;
            e1(14);
        } else if (profileActivity.f36107t1 && profileActivity.f36129w1 && !this.f45803r2 && (i10 = profileActivity.f36114u1) > 0 && ws0Var != null) {
            this.f45803r2 = true;
            ws0Var.P = i10;
            ws0Var.e();
        }
    }

    @Override
    public final void K0(SparseArray sparseArray) {
        char c10;
        ProfileActivity profileActivity = this.f45804s2;
        if (profileActivity.f36100s1) {
            int size = sparseArray.size();
            int selectedTab = getSelectedTab();
            if (!org.telegram.ui.Components.bw0.E0(selectedTab) && selectedTab != 8) {
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
                    ProfileActivity.H0(profileActivity, size);
                }
                profileActivity.C5[c10].b(size, true);
            }
        }
    }

    @Override
    public final void L0() {
        FrameLayout frameLayout;
        xz0 xz0Var;
        ProfileActivity profileActivity = this.f45804s2;
        if (profileActivity.f36100s1 && (frameLayout = profileActivity.f36155z5[0]) != null && (xz0Var = profileActivity.N) != null) {
            ProfileActivity.S4(frameLayout, 1.0f - xz0Var.getBottomButtonStoriesVisibility());
        }
    }

    @Override
    public final boolean P0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return this.f45804s2.h(chatParticipant, z10, false, view);
    }

    @Override
    public final void R0(boolean z10) {
        int i10;
        bh.p pVar;
        int i11;
        int i12;
        int i13;
        ProfileActivity profileActivity = this.f45804s2;
        Activity parentActivity = profileActivity.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.r2) profileActivity).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
        profileActivity.f35972a.C0();
        profileActivity.Y.setPivotY((profileActivity.X.getMeasuredHeight() / 2.0f) + profileActivity.X.getPivotY());
        profileActivity.Y.setPivotX(pVar.getMeasuredWidth() / 2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(profileActivity.Y, !z10, 0.95f, true);
        org.telegram.ui.ActionBar.w0 w0Var = profileActivity.Q0;
        int i14 = 8;
        if (!z10 && profileActivity.L0) {
            i11 = 4;
        } else {
            i11 = 8;
        }
        w0Var.setVisibility(i11);
        org.telegram.ui.ActionBar.w0 w0Var2 = profileActivity.R0;
        if (!z10 && profileActivity.M0) {
            i12 = 4;
        } else {
            i12 = 8;
        }
        w0Var2.setVisibility(i12);
        org.telegram.ui.ActionBar.w0 w0Var3 = profileActivity.S0;
        if (!z10 && profileActivity.N0) {
            i13 = 4;
        } else {
            i13 = 8;
        }
        w0Var3.setVisibility(i13);
        org.telegram.ui.ActionBar.w0 w0Var4 = profileActivity.T0;
        if (!z10) {
            i14 = 4;
        }
        w0Var4.setVisibility(i14);
        profileActivity.x5(false);
    }

    @Override
    public final void S0() {
        this.f45804s2.S();
    }

    @Override
    public final void T0(float f7) {
        L0();
        ProfileActivity profileActivity = this.f45804s2;
        xz0 xz0Var = profileActivity.N;
        if (xz0Var != null && profileActivity.f36100s1) {
            if (profileActivity.f36155z5[0] != null) {
                profileActivity.f36155z5[0].setTranslationX(xz0Var.n0(8, true));
            }
            if (profileActivity.f36155z5[1] != null) {
                profileActivity.f36155z5[1].setTranslationX(profileActivity.N.n0(9, false));
            }
            ProfileActivity.H0(profileActivity, profileActivity.f36126v6);
            profileActivity.g5();
        }
    }

    @Override
    public final int b1(int i10) {
        int i11 = ProfileActivity.R6;
        this.f45804s2.getClass();
        return i10;
    }

    @Override
    public final int getInitialTab() {
        return 8;
    }

    @Override
    public final void k1(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xz0.k1(boolean):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(new oy0(this, 4));
    }

    @Override
    public final boolean u0() {
        ProfileActivity profileActivity = this.f45804s2;
        if (profileActivity.f36032i1 == profileActivity.getUserConfig().getClientUserId() && !profileActivity.f36025h1) {
            return true;
        }
        return false;
    }
}
