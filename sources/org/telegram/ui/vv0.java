package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class vv0 extends org.telegram.ui.Components.xs0 {
    public boolean f50836w2;
    public final ProfileActivity f50837x2;

    public vv0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.Components.ps0 ps0Var, int i7, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, int i11, ProfileActivity profileActivity2, ProfileActivity profileActivity3, org.telegram.ui.ActionBar.f6 f6Var, dh.c cVar) {
        super(context, j3, ps0Var, i7, arrayList, chatFull, userFull, i10, i11, profileActivity2, profileActivity3, 1, f6Var, cVar);
        this.f50837x2 = profileActivity;
    }

    @Override
    public final boolean G0() {
        return this.f50837x2.f41808r1;
    }

    @Override
    public final boolean H0() {
        return this.f50837x2.f41808r1;
    }

    @Override
    public final void N1(boolean z9) {
        int i7;
        int i10;
        super.N1(z9);
        ProfileActivity profileActivity = this.f50837x2;
        boolean z10 = profileActivity.f41816s1;
        org.telegram.ui.Components.up0 up0Var = this.f40370a0;
        if (z10 && !profileActivity.f41835v1 && this.K0.d(14)) {
            if (!this.f50836w2 && (i10 = profileActivity.f41822t1) > 0 && up0Var != null) {
                this.f50836w2 = true;
                up0Var.P = i10;
                up0Var.e();
            }
            profileActivity.f41835v1 = true;
            i1(14);
        } else if (profileActivity.f41816s1 && profileActivity.f41835v1 && !this.f50836w2 && (i7 = profileActivity.f41822t1) > 0 && up0Var != null) {
            this.f50836w2 = true;
            up0Var.P = i7;
            up0Var.e();
        }
    }

    @Override
    public final void O0(SparseArray sparseArray) {
        char c10;
        ProfileActivity profileActivity = this.f50837x2;
        if (profileActivity.f41808r1) {
            int size = sparseArray.size();
            int selectedTab = getSelectedTab();
            if (!org.telegram.ui.Components.xs0.I0(selectedTab) && selectedTab != 8) {
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
                profileActivity.f41847w5[c10].c(size, true);
            }
        }
    }

    @Override
    public final void P0() {
        FrameLayout frameLayout;
        vv0 vv0Var;
        ProfileActivity profileActivity = this.f50837x2;
        if (profileActivity.f41808r1 && (frameLayout = profileActivity.f41826t5[0]) != null && (vv0Var = profileActivity.N) != null) {
            ProfileActivity.Y4(frameLayout, 1.0f - vv0Var.getBottomButtonStoriesVisibility());
        }
    }

    @Override
    public final boolean T0(TLRPC.ChatParticipant chatParticipant, boolean z9, View view) {
        return this.f50837x2.h(chatParticipant, z9, false, view);
    }

    @Override
    public final void V0(boolean z9) {
        int i7;
        ProfileActivity profileActivity = this.f50837x2;
        Activity parentActivity = profileActivity.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.f2) profileActivity).classGuid;
        org.telegram.messenger.g0.B2(parentActivity, i7);
        profileActivity.f41687a.C0();
        profileActivity.Y.setPivotY((profileActivity.X.getMeasuredHeight() / 2.0f) + profileActivity.X.getPivotY());
        bi.x5 x5Var = profileActivity.Y;
        x5Var.setPivotX(x5Var.getMeasuredWidth() / 2.0f);
        org.telegram.messenger.g0.Z3(profileActivity.Y, !z9, 0.95f, true, true);
        profileActivity.L5(false);
    }

    @Override
    public final void W0() {
        this.f50837x2.V();
    }

    @Override
    public final void X0(float f10) {
        P0();
        ProfileActivity profileActivity = this.f50837x2;
        vv0 vv0Var = profileActivity.N;
        if (vv0Var != null && profileActivity.f41808r1) {
            if (profileActivity.f41826t5[0] != null) {
                profileActivity.f41826t5[0].setTranslationX(vv0Var.q0(8, true));
            }
            if (profileActivity.f41826t5[1] != null) {
                profileActivity.f41826t5[1].setTranslationX(profileActivity.N.q0(9, false));
            }
            ProfileActivity.O0(profileActivity, profileActivity.E6);
            profileActivity.p5();
        }
    }

    @Override
    public final int f1(int i7) {
        RectF rectF = ProfileActivity.S6;
        this.f50837x2.getClass();
        return i7;
    }

    @Override
    public final int getInitialTab() {
        return 8;
    }

    @Override
    public final void o1(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vv0.o1(boolean):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.g0.h3(new ru0(this, 3));
    }

    @Override
    public final boolean x0() {
        ProfileActivity profileActivity = this.f50837x2;
        if (profileActivity.f41741h1 == profileActivity.getUserConfig().e() && !profileActivity.f41734g1) {
            return true;
        }
        return false;
    }
}
