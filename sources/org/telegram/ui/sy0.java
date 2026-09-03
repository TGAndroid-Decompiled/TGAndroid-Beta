package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class sy0 implements org.telegram.ui.ActionBar.t0, yu0, org.telegram.ui.Components.g8 {
    public final ProfileActivity f41331a;

    public sy0(ProfileActivity profileActivity) {
        this.f41331a = profileActivity;
    }

    @Override
    public void G(MessageObject messageObject) {
        org.telegram.ui.Components.oh0 oh0Var = this.f41331a.f34625j0;
        if (oh0Var != null && oh0Var.f29761a) {
            oh0Var.L.d(0.0f, true);
            oh0Var.invalidate();
        }
    }

    @Override
    public void Q0(int i10, int i11) {
        int i12;
        ProfileActivity profileActivity = this.f41331a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i10);
        if (profileActivity.f34691s2 == null && profileActivity.f34683r2 == null) {
            return;
        }
        UndoView undoView = profileActivity.J;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.f34691s2;
        if (userFull != null) {
            i12 = userFull.ttl_period;
        } else {
            i12 = profileActivity.f34683r2.ttl_period;
        }
        undoView.k(a2, i11, user, Integer.valueOf(i12), null, null);
    }

    @Override
    public void dismiss() {
        this.f41331a.Q0.M(null, null);
    }

    @Override
    public void e() {
        org.telegram.ui.Components.im0.d(new d5(this.f41331a, 18));
    }

    @Override
    public TextureView h0() {
        return null;
    }

    @Override
    public void h1() {
        this.f41331a.presentFragment(new s4());
        dismiss();
    }

    @Override
    public void y0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.f41331a;
        profileActivity.f34560a.I0(true);
        zz0 zz0Var = profileActivity.L;
        if (zz0Var != null && zz0Var.getCurrentListView() != null) {
            profileActivity.L.getCurrentListView().I0(true);
        }
        profileActivity.f34562a1.setBackgroundColor(i0.a.d(0.1f, profileActivity.P3(profileActivity.S4.f35867f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21607a7, profileActivity.f34714w0)));
    }

    @Override
    public void c() {
    }
}
