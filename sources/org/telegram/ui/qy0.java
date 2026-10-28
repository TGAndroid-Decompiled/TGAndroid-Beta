package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class qy0 implements org.telegram.ui.ActionBar.t0, av0, org.telegram.ui.Components.q8 {
    public final ProfileActivity f42816a;

    public qy0(ProfileActivity profileActivity) {
        this.f42816a = profileActivity;
    }

    @Override
    public void B0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.f42816a;
        profileActivity.f35972a.I0(true);
        xz0 xz0Var = profileActivity.N;
        if (xz0Var != null && xz0Var.getCurrentListView() != null) {
            profileActivity.N.getCurrentListView().I0(true);
        }
        profileActivity.f35996d1.setBackgroundColor(i0.a.f(0.1f, profileActivity.Y3(profileActivity.f35985b5.f38949f), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23300a7, profileActivity.f36150z0)));
    }

    @Override
    public void E(MessageObject messageObject) {
        org.telegram.ui.Components.fi0 fi0Var = this.f42816a.m0;
        if (fi0Var != null && fi0Var.f28166a) {
            fi0Var.O.d(0.0f, true);
            fi0Var.invalidate();
        }
    }

    @Override
    public void T0(int i10, int i11) {
        int i12;
        int i13 = ProfileActivity.R6;
        ProfileActivity profileActivity = this.f42816a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i10);
        if (profileActivity.f36122v2 == null && profileActivity.f36115u2 == null) {
            return;
        }
        UndoView undoView = profileActivity.L;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.f36122v2;
        if (userFull != null) {
            i12 = userFull.ttl_period;
        } else {
            i12 = profileActivity.f36115u2.ttl_period;
        }
        undoView.k(a2, i11, user, Integer.valueOf(i12), null, null);
    }

    @Override
    public void b() {
        int i10 = ProfileActivity.R6;
        org.telegram.ui.Components.in0.d(new e5(this.f42816a, 18));
    }

    @Override
    public void dismiss() {
        this.f42816a.T0.U(null, null);
    }

    @Override
    public void e1() {
        this.f42816a.presentFragment(new t4());
        dismiss();
    }

    @Override
    public TextureView f0() {
        return null;
    }

    @Override
    public void a() {
    }
}
