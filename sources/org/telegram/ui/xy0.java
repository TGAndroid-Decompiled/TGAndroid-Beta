package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class xy0 implements org.telegram.ui.ActionBar.s0, gv0, org.telegram.ui.Components.n8 {
    public final ProfileActivity f42968a;

    public xy0(ProfileActivity profileActivity) {
        this.f42968a = profileActivity;
    }

    @Override
    public void G0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.f42968a;
        profileActivity.f34201a.J0(true);
        e01 e01Var = profileActivity.O;
        if (e01Var != null && e01Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().J0(true);
        }
        profileActivity.f34225d1.setBackgroundColor(i0.a.d(0.1f, profileActivity.P3(profileActivity.V4.f38098f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20761a7, profileActivity.f34376z0)));
    }

    @Override
    public void I(MessageObject messageObject) {
        org.telegram.ui.Components.sh0 sh0Var = this.f42968a.m0;
        if (sh0Var != null && sh0Var.f30720a) {
            sh0Var.O.d(0.0f, true);
            sh0Var.invalidate();
        }
    }

    @Override
    public void U0(int i10, int i11) {
        int i12;
        ProfileActivity profileActivity = this.f42968a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i10);
        if (profileActivity.f34351v2 == null && profileActivity.f34344u2 == null) {
            return;
        }
        UndoView undoView = profileActivity.M;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.f34351v2;
        if (userFull != null) {
            i12 = userFull.ttl_period;
        } else {
            i12 = profileActivity.f34344u2.ttl_period;
        }
        undoView.k(a2, i11, user, Integer.valueOf(i12), null, null);
    }

    @Override
    public void dismiss() {
        this.f42968a.T0.M(null, null);
    }

    @Override
    public void e() {
        org.telegram.ui.Components.sm0.d(new c5(this.f42968a, 18));
    }

    @Override
    public TextureView k0() {
        return null;
    }

    @Override
    public void l1() {
        this.f42968a.presentFragment(new q4());
        dismiss();
    }

    @Override
    public void c() {
    }
}
