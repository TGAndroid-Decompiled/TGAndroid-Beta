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
public final class sz0 extends org.telegram.ui.Components.yu0 {
    public boolean f38462c2;
    public final ProfileActivity f38463d2;

    public sz0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.Components.qu0 qu0Var, int i10, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i11, int i12, ProfileActivity profileActivity2, ProfileActivity profileActivity3, org.telegram.ui.ActionBar.f6 f6Var, ng.a aVar) {
        super(context, j10, qu0Var, i10, arrayList, chatFull, userFull, i11, i12, profileActivity2, profileActivity3, 1, f6Var, aVar);
        this.f38463d2 = profileActivity;
    }

    @Override
    public final void D0(SparseArray sparseArray) {
        char c3;
        ProfileActivity profileActivity = this.f38463d2;
        if (profileActivity.f32134p1) {
            int size = sparseArray.size();
            int selectedTab = getSelectedTab();
            if (!org.telegram.ui.Components.yu0.w0(selectedTab) && selectedTab != 8) {
                if (selectedTab == 9) {
                    c3 = 1;
                } else {
                    c3 = 65535;
                }
            } else {
                c3 = 0;
            }
            if (c3 >= 0) {
                if (c3 == 0) {
                    ProfileActivity.G0(profileActivity, size);
                }
                profileActivity.f32167t5[c3].c(size, true);
            }
        }
    }

    @Override
    public final void E0() {
        FrameLayout frameLayout;
        ProfileActivity profileActivity = this.f38463d2;
        if (profileActivity.f32134p1 && (frameLayout = profileActivity.f32145q5[0]) != null && profileActivity.L != null) {
            frameLayout.setTranslationY((1.0f - profileActivity.L.getBottomButtonStoriesVisibility()) * AndroidUtilities.dp(72.0f));
        }
    }

    @Override
    public final boolean I0(TLRPC.ChatParticipant chatParticipant, boolean z4, View view) {
        return this.f38463d2.h(chatParticipant, z4, false, view);
    }

    @Override
    public final void K0(boolean z4) {
        int i10;
        int i11;
        int i12;
        int i13;
        ProfileActivity profileActivity = this.f38463d2;
        Activity parentActivity = profileActivity.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.p2) profileActivity).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
        profileActivity.f32028a.B0();
        profileActivity.W.setPivotY((profileActivity.V.getMeasuredHeight() / 2.0f) + profileActivity.V.getPivotY());
        ah.d dVar = profileActivity.W;
        dVar.setPivotX(dVar.getMeasuredWidth() / 2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(profileActivity.W, !z4, 0.95f, true);
        org.telegram.ui.ActionBar.w0 w0Var = profileActivity.N0;
        int i14 = 8;
        if (!z4 && profileActivity.I0) {
            i11 = 4;
        } else {
            i11 = 8;
        }
        w0Var.setVisibility(i11);
        org.telegram.ui.ActionBar.w0 w0Var2 = profileActivity.O0;
        if (!z4 && profileActivity.J0) {
            i12 = 4;
        } else {
            i12 = 8;
        }
        w0Var2.setVisibility(i12);
        org.telegram.ui.ActionBar.w0 w0Var3 = profileActivity.P0;
        if (!z4 && profileActivity.K0) {
            i13 = 4;
        } else {
            i13 = 8;
        }
        w0Var3.setVisibility(i13);
        org.telegram.ui.ActionBar.w0 w0Var4 = profileActivity.Q0;
        if (!z4) {
            i14 = 4;
        }
        w0Var4.setVisibility(i14);
        profileActivity.l5(false);
    }

    @Override
    public final void L0() {
        this.f38463d2.R();
    }

    @Override
    public final void M0(float f10) {
        E0();
        ProfileActivity profileActivity = this.f38463d2;
        sz0 sz0Var = profileActivity.L;
        if (sz0Var != null && profileActivity.f32134p1) {
            if (profileActivity.f32145q5[0] != null) {
                profileActivity.f32145q5[0].setTranslationX(sz0Var.f0(8, true));
            }
            if (profileActivity.f32145q5[1] != null) {
                profileActivity.f32145q5[1].setTranslationX(profileActivity.L.f0(9, false));
            }
            ProfileActivity.G0(profileActivity, profileActivity.e6);
            profileActivity.U4();
        }
    }

    @Override
    public final void P(Canvas canvas, float f10, Rect rect, Paint paint) {
        ProfileActivity profileActivity = this.f38463d2;
        profileActivity.f32097j5.J(canvas, getY() + profileActivity.f32028a.getY() + f10, rect, paint, true);
    }

    @Override
    public final int V0(int i10) {
        this.f38463d2.getClass();
        return i10;
    }

    @Override
    public final void b1(boolean r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sz0.b1(boolean):void");
    }

    @Override
    public final int getInitialTab() {
        return 8;
    }

    @Override
    public final boolean l0() {
        ProfileActivity profileActivity = this.f38463d2;
        if (profileActivity.f32065f1 == profileActivity.getUserConfig().getClientUserId() && !profileActivity.f32058e1) {
            return true;
        }
        return false;
    }

    @Override
    public final void o0() {
        qz0 qz0Var = this.f38463d2.f32097j5;
        if (qz0Var != null) {
            qz0Var.M();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(new vy0(this, 2));
    }

    @Override
    public final boolean u0() {
        return this.f38463d2.f32134p1;
    }

    @Override
    public final boolean v0() {
        return this.f38463d2.f32134p1;
    }

    @Override
    public final void v1(boolean z4) {
        int i10;
        int i11;
        super.v1(z4);
        ProfileActivity profileActivity = this.f38463d2;
        boolean z10 = profileActivity.f32141q1;
        org.telegram.ui.Components.or0 or0Var = this.S;
        if (z10 && !profileActivity.f32163t1 && this.F0.d(14)) {
            if (!this.f38462c2 && (i11 = profileActivity.f32149r1) > 0 && or0Var != null) {
                this.f38462c2 = true;
                or0Var.J = i11;
                or0Var.e();
            }
            profileActivity.f32163t1 = true;
            Y0(14);
        } else if (profileActivity.f32141q1 && profileActivity.f32163t1 && !this.f38462c2 && (i10 = profileActivity.f32149r1) > 0 && or0Var != null) {
            this.f38462c2 = true;
            or0Var.J = i10;
            or0Var.e();
        }
    }
}
