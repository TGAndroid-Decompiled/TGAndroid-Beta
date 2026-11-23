package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class uv0 extends org.telegram.ui.Components.it0 {
    public boolean f52732x2;
    public final ProfileActivity f52733y2;

    public uv0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.Components.at0 at0Var, int i7, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, int i11, ProfileActivity profileActivity2, ProfileActivity profileActivity3, org.telegram.ui.ActionBar.i6 i6Var, dh.c cVar) {
        super(context, j3, at0Var, i7, arrayList, chatFull, userFull, i10, i11, profileActivity2, profileActivity3, 1, i6Var, cVar);
        this.f52733y2 = profileActivity;
    }

    @Override
    public final boolean H0() {
        return this.f52733y2.f43763s1;
    }

    @Override
    public final boolean I0() {
        return this.f52733y2.f43763s1;
    }

    @Override
    public final void P0(SparseArray sparseArray) {
        char c10;
        ProfileActivity profileActivity = this.f52733y2;
        if (profileActivity.f43763s1) {
            int size = sparseArray.size();
            int selectedTab = getSelectedTab();
            if (!org.telegram.ui.Components.it0.J0(selectedTab) && selectedTab != 8) {
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
        ProfileActivity profileActivity = this.f52733y2;
        boolean z11 = profileActivity.f43769t1;
        org.telegram.ui.Components.fq0 fq0Var = this.f36096b0;
        if (z11 && !profileActivity.f43790w1 && this.L0.d(14)) {
            if (!this.f52732x2 && (i10 = profileActivity.f43775u1) > 0 && fq0Var != null) {
                this.f52732x2 = true;
                fq0Var.Q = i10;
                fq0Var.e();
            }
            profileActivity.f43790w1 = true;
            k1(14);
        } else if (profileActivity.f43769t1 && profileActivity.f43790w1 && !this.f52732x2 && (i7 = profileActivity.f43775u1) > 0 && fq0Var != null) {
            this.f52732x2 = true;
            fq0Var.Q = i7;
            fq0Var.e();
        }
    }

    @Override
    public final void Q0() {
        FrameLayout frameLayout;
        uv0 uv0Var;
        ProfileActivity profileActivity = this.f52733y2;
        if (profileActivity.f43763s1 && (frameLayout = profileActivity.f43817z5[0]) != null && (uv0Var = profileActivity.O) != null) {
            ProfileActivity.b5(frameLayout, 1.0f - uv0Var.getBottomButtonStoriesVisibility());
        }
    }

    @Override
    public final boolean U0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return this.f52733y2.h(chatParticipant, z10, false, view);
    }

    @Override
    public final void W0() {
        RectF rectF = ProfileActivity.Z6;
        this.f52733y2.F5(true);
    }

    @Override
    public final void X0(boolean z10) {
        int i7;
        ProfileActivity profileActivity = this.f52733y2;
        Activity parentActivity = profileActivity.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.g2) profileActivity).classGuid;
        org.telegram.messenger.g0.B2(parentActivity, i7);
        profileActivity.f43634a.C0();
        profileActivity.Z.setPivotY((profileActivity.Y.getMeasuredHeight() / 2.0f) + profileActivity.Y.getPivotY());
        ai.h0 h0Var = profileActivity.Z;
        h0Var.setPivotX(h0Var.getMeasuredWidth() / 2.0f);
        org.telegram.messenger.g0.X3(profileActivity.Z, !z10, 0.95f, true, true);
        profileActivity.P5(false);
    }

    @Override
    public final void Y0() {
        this.f52733y2.W();
    }

    @Override
    public final void Z0(float f10) {
        Q0();
        ProfileActivity profileActivity = this.f52733y2;
        uv0 uv0Var = profileActivity.O;
        if (uv0Var != null && profileActivity.f43763s1) {
            if (profileActivity.f43817z5[0] != null) {
                profileActivity.f43817z5[0].setTranslationX(uv0Var.q0(8, true));
            }
            if (profileActivity.f43817z5[1] != null) {
                profileActivity.f43817z5[1].setTranslationX(profileActivity.O.q0(9, false));
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
        this.f52733y2.getClass();
        return i7;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.g0.g3(new qu0(this, 3));
    }

    @Override
    public final void q1(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uv0.q1(boolean):void");
    }

    @Override
    public final boolean x0() {
        ProfileActivity profileActivity = this.f52733y2;
        if (profileActivity.f43695i1 == profileActivity.getUserConfig().e() && !profileActivity.f43688h1) {
            return true;
        }
        return false;
    }
}
