package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class vy0 implements org.telegram.ui.ActionBar.r0, dv0, org.telegram.ui.Components.n8 {
    public final ProfileActivity f38848a;

    public vy0(ProfileActivity profileActivity) {
        this.f38848a = profileActivity;
    }

    @Override
    public void E0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.f38848a;
        profileActivity.f31523a.I0(true);
        c01 c01Var = profileActivity.O;
        if (c01Var != null && c01Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().I0(true);
        }
        profileActivity.f31547d1.setBackgroundColor(i0.a.d(0.1f, profileActivity.P3(profileActivity.V4.f34297f), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19003a7, profileActivity.f31697z0)));
    }

    @Override
    public void H(MessageObject messageObject) {
        org.telegram.ui.Components.rh0 rh0Var = this.f38848a.m0;
        if (rh0Var != null && rh0Var.f27918a) {
            rh0Var.O.d(0.0f, true);
            rh0Var.invalidate();
        }
    }

    @Override
    public void U0(int i10, int i11) {
        int i12;
        ProfileActivity profileActivity = this.f38848a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i10);
        if (profileActivity.f31672v2 == null && profileActivity.f31665u2 == null) {
            return;
        }
        UndoView undoView = profileActivity.M;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.f31672v2;
        if (userFull != null) {
            i12 = userFull.ttl_period;
        } else {
            i12 = profileActivity.f31665u2.ttl_period;
        }
        undoView.k(a2, i11, user, Integer.valueOf(i12), null, null);
    }

    @Override
    public void dismiss() {
        this.f38848a.T0.M(null, null);
    }

    @Override
    public void e() {
        org.telegram.ui.Components.nm0.d(new b5(this.f38848a, 18));
    }

    @Override
    public TextureView j0() {
        return null;
    }

    @Override
    public void j1() {
        this.f38848a.presentFragment(new p4());
        dismiss();
    }

    @Override
    public void c() {
    }
}
