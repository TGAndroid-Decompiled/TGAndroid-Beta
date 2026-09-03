package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class sy0 implements org.telegram.ui.ActionBar.t0, yu0, org.telegram.ui.Components.g8 {
    public final ProfileActivity f38335a;

    public sy0(ProfileActivity profileActivity) {
        this.f38335a = profileActivity;
    }

    @Override
    public void H(MessageObject messageObject) {
        org.telegram.ui.Components.nh0 nh0Var = this.f38335a.f32066j0;
        if (nh0Var != null && nh0Var.f27260a) {
            nh0Var.L.d(0.0f, true);
            nh0Var.invalidate();
        }
    }

    @Override
    public void Q0(int i10, int i11) {
        int i12;
        ProfileActivity profileActivity = this.f38335a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i10);
        if (profileActivity.f32132s2 == null && profileActivity.f32124r2 == null) {
            return;
        }
        UndoView undoView = profileActivity.J;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.f32132s2;
        if (userFull != null) {
            i12 = userFull.ttl_period;
        } else {
            i12 = profileActivity.f32124r2.ttl_period;
        }
        undoView.k(a2, i11, user, Integer.valueOf(i12), null, null);
    }

    @Override
    public void dismiss() {
        this.f38335a.Q0.M(null, null);
    }

    @Override
    public void e() {
        org.telegram.ui.Components.hm0.d(new f5(this.f38335a, 18));
    }

    @Override
    public TextureView e0() {
        return null;
    }

    @Override
    public void i1() {
        this.f38335a.presentFragment(new u4());
        dismiss();
    }

    @Override
    public void w0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.f38335a;
        profileActivity.f32002a.I0(true);
        zz0 zz0Var = profileActivity.L;
        if (zz0Var != null && zz0Var.getCurrentListView() != null) {
            profileActivity.L.getCurrentListView().I0(true);
        }
        profileActivity.f32004a1.setBackgroundColor(i0.a.d(0.1f, profileActivity.P3(profileActivity.S4.f33228f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19827a7, profileActivity.f32155w0)));
    }

    @Override
    public void c() {
    }
}
