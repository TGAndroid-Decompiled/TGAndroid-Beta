package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class xy0 implements org.telegram.ui.ActionBar.s0, ev0, org.telegram.ui.Components.n8 {
    public final ProfileActivity f39680a;

    public xy0(ProfileActivity profileActivity) {
        this.f39680a = profileActivity;
    }

    @Override
    public void E0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.f39680a;
        profileActivity.f31209a.I0(true);
        e01 e01Var = profileActivity.O;
        if (e01Var != null && e01Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().I0(true);
        }
        profileActivity.f31233d1.setBackgroundColor(i0.a.d(0.1f, profileActivity.P3(profileActivity.V4.f34255f), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18733a7, profileActivity.f31383z0)));
    }

    @Override
    public void H(MessageObject messageObject) {
        org.telegram.ui.Components.gh0 gh0Var = this.f39680a.m0;
        if (gh0Var != null && gh0Var.f24289a) {
            gh0Var.O.d(0.0f, true);
            gh0Var.invalidate();
        }
    }

    @Override
    public void U0(int i10, int i11) {
        int i12;
        ProfileActivity profileActivity = this.f39680a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i10);
        if (profileActivity.f31358v2 == null && profileActivity.f31351u2 == null) {
            return;
        }
        UndoView undoView = profileActivity.M;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.f31358v2;
        if (userFull != null) {
            i12 = userFull.ttl_period;
        } else {
            i12 = profileActivity.f31351u2.ttl_period;
        }
        undoView.k(a2, i11, user, Integer.valueOf(i12), null, null);
    }

    @Override
    public void dismiss() {
        this.f39680a.T0.M(null, null);
    }

    @Override
    public void e() {
        org.telegram.ui.Components.bm0.d(new c5(this.f39680a, 18));
    }

    @Override
    public TextureView j0() {
        return null;
    }

    @Override
    public void j1() {
        this.f39680a.presentFragment(new q4());
        dismiss();
    }

    @Override
    public void c() {
    }
}
