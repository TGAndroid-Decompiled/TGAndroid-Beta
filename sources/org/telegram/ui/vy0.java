package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class vy0 implements org.telegram.ui.ActionBar.r0, dv0, org.telegram.ui.Components.n8 {
    public final ProfileActivity f38850a;

    public vy0(ProfileActivity profileActivity) {
        this.f38850a = profileActivity;
    }

    @Override
    public void E0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.f38850a;
        profileActivity.f31525a.I0(true);
        c01 c01Var = profileActivity.O;
        if (c01Var != null && c01Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().I0(true);
        }
        profileActivity.f31549d1.setBackgroundColor(i0.a.d(0.1f, profileActivity.P3(profileActivity.V4.f34299f), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19004a7, profileActivity.f31699z0)));
    }

    @Override
    public void H(MessageObject messageObject) {
        org.telegram.ui.Components.qh0 qh0Var = this.f38850a.m0;
        if (qh0Var != null && qh0Var.f27622a) {
            qh0Var.O.d(0.0f, true);
            qh0Var.invalidate();
        }
    }

    @Override
    public void U0(int i10, int i11) {
        int i12;
        ProfileActivity profileActivity = this.f38850a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i10);
        if (profileActivity.f31674v2 == null && profileActivity.f31667u2 == null) {
            return;
        }
        UndoView undoView = profileActivity.M;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.f31674v2;
        if (userFull != null) {
            i12 = userFull.ttl_period;
        } else {
            i12 = profileActivity.f31667u2.ttl_period;
        }
        undoView.k(a2, i11, user, Integer.valueOf(i12), null, null);
    }

    @Override
    public void dismiss() {
        this.f38850a.T0.M(null, null);
    }

    @Override
    public void e() {
        org.telegram.ui.Components.mm0.d(new b5(this.f38850a, 18));
    }

    @Override
    public TextureView j0() {
        return null;
    }

    @Override
    public void j1() {
        this.f38850a.presentFragment(new p4());
        dismiss();
    }

    @Override
    public void c() {
    }
}
