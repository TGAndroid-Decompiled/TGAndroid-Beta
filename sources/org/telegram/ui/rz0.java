package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class rz0 extends org.telegram.ui.Components.xv0 {
    public boolean f41270i2;
    public final ProfileActivity f41271j2;

    public rz0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.Components.pv0 pv0Var, int i10, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i11, int i12, ProfileActivity profileActivity2, ProfileActivity profileActivity3, org.telegram.ui.ActionBar.g6 g6Var, bh.b bVar) {
        super(context, j10, pv0Var, i10, arrayList, chatFull, userFull, i11, i12, profileActivity2, profileActivity3, 1, g6Var, bVar);
        this.f41271j2 = profileActivity;
    }

    @Override
    public final void A1(boolean z10) {
        int i10;
        int i11;
        super.A1(z10);
        ProfileActivity profileActivity = this.f41271j2;
        boolean z11 = profileActivity.f34024u1;
        org.telegram.ui.Components.ns0 ns0Var = this.V;
        if (z11 && !profileActivity.f34047x1 && this.I0.d(14)) {
            if (!this.f41270i2 && (i11 = profileActivity.f34031v1) > 0 && ns0Var != null) {
                this.f41270i2 = true;
                ns0Var.M = i11;
                ns0Var.e();
            }
            profileActivity.f34047x1 = true;
            b1(14);
        } else if (profileActivity.f34024u1 && profileActivity.f34047x1 && !this.f41270i2 && (i10 = profileActivity.f34031v1) > 0 && ns0Var != null) {
            this.f41270i2 = true;
            ns0Var.M = i10;
            ns0Var.e();
        }
    }

    @Override
    public final void G0(SparseArray sparseArray) {
        char c10;
        ProfileActivity profileActivity = this.f41271j2;
        if (profileActivity.f34017t1) {
            int size = sparseArray.size();
            int selectedTab = getSelectedTab();
            if (!org.telegram.ui.Components.xv0.z0(selectedTab) && selectedTab != 8) {
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
                    ProfileActivity.G0(profileActivity, size);
                }
                profileActivity.f34058y5[c10].b(size, true);
            }
        }
    }

    @Override
    public final void H0() {
        FrameLayout frameLayout;
        ProfileActivity profileActivity = this.f41271j2;
        if (profileActivity.f34017t1 && (frameLayout = profileActivity.f34035v5[0]) != null && profileActivity.O != null) {
            frameLayout.setTranslationY((1.0f - profileActivity.O.getBottomButtonStoriesVisibility()) * AndroidUtilities.dp(72.0f));
        }
    }

    @Override
    public final boolean L0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return this.f41271j2.h(chatParticipant, z10, false, view);
    }

    @Override
    public final void N0(boolean z10) {
        int i10;
        ah.v vVar;
        int i11;
        int i12;
        int i13;
        ProfileActivity profileActivity = this.f41271j2;
        Activity parentActivity = profileActivity.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.o2) profileActivity).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
        profileActivity.f33882a.B0();
        profileActivity.Z.setPivotY((profileActivity.Y.getMeasuredHeight() / 2.0f) + profileActivity.Y.getPivotY());
        profileActivity.Z.setPivotX(vVar.getMeasuredWidth() / 2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(profileActivity.Z, !z10, 0.95f, true);
        org.telegram.ui.ActionBar.u0 u0Var = profileActivity.R0;
        int i14 = 8;
        if (!z10 && profileActivity.M0) {
            i11 = 4;
        } else {
            i11 = 8;
        }
        u0Var.setVisibility(i11);
        org.telegram.ui.ActionBar.u0 u0Var2 = profileActivity.S0;
        if (!z10 && profileActivity.N0) {
            i12 = 4;
        } else {
            i12 = 8;
        }
        u0Var2.setVisibility(i12);
        org.telegram.ui.ActionBar.u0 u0Var3 = profileActivity.T0;
        if (!z10 && profileActivity.O0) {
            i13 = 4;
        } else {
            i13 = 8;
        }
        u0Var3.setVisibility(i13);
        org.telegram.ui.ActionBar.u0 u0Var4 = profileActivity.U0;
        if (!z10) {
            i14 = 4;
        }
        u0Var4.setVisibility(i14);
        profileActivity.p5(false);
    }

    @Override
    public final void O0() {
        this.f41271j2.R();
    }

    @Override
    public final void P0(float f7) {
        H0();
        ProfileActivity profileActivity = this.f41271j2;
        rz0 rz0Var = profileActivity.O;
        if (rz0Var != null && profileActivity.f34017t1) {
            if (profileActivity.f34035v5[0] != null) {
                profileActivity.f34035v5[0].setTranslationX(rz0Var.h0(8, true));
            }
            if (profileActivity.f34035v5[1] != null) {
                profileActivity.f34035v5[1].setTranslationX(profileActivity.O.h0(9, false));
            }
            ProfileActivity.G0(profileActivity, profileActivity.f33980n6);
            profileActivity.Y4();
        }
    }

    @Override
    public final void Q(Canvas canvas, float f7, Rect rect, Paint paint) {
        ProfileActivity profileActivity = this.f41271j2;
        profileActivity.f33986o5.I(canvas, getY() + profileActivity.f33882a.getY() + f7, rect, paint, true);
    }

    @Override
    public final int Y0(int i10) {
        this.f41271j2.getClass();
        return i10;
    }

    @Override
    public final void e1(boolean r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rz0.e1(boolean):void");
    }

    @Override
    public final int getInitialTab() {
        return 8;
    }

    @Override
    public final boolean n0() {
        ProfileActivity profileActivity = this.f41271j2;
        if (profileActivity.f33949j1 == profileActivity.getUserConfig().getClientUserId() && !profileActivity.f33942i1) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(new my0(this, 3));
    }

    @Override
    public final void q0() {
        pz0 pz0Var = this.f41271j2.f33986o5;
        if (pz0Var != null) {
            pz0Var.L();
        }
    }

    @Override
    public final boolean x0() {
        return this.f41271j2.f34017t1;
    }

    @Override
    public final boolean y0() {
        return this.f41271j2.f34017t1;
    }
}
