package rh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class j2 implements Runnable {
    public final int f43569a;
    public final l2 f43570b;

    public j2(l2 l2Var, int i10) {
        this.f43569a = i10;
        this.f43570b = l2Var;
    }

    @Override
    public final void run() {
        switch (this.f43569a) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                l2 l2Var = this.f43570b;
                q2 q2Var = l2Var.d;
                toggleuseremojistatuspermission.bot = MessagesController.getInstance(q2Var.D).getInputUser(q2Var.E);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(q2Var.D).sendRequest(toggleuseremojistatuspermission, new k2(l2Var, 1));
                return;
            case 1:
                q2 q2Var2 = this.f43570b.d;
                r0.e(q2Var2.getContext(), q2Var2.D, q2Var2.E).m(false, null);
                return;
            default:
                q2 q2Var3 = this.f43570b.d;
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null && U.getParentLayout() != null) {
                    e5 parentLayout = U.getParentLayout();
                    U.presentFragment(ProfileActivity.m4(q2Var3.E));
                    AndroidUtilities.scrollToFragmentRow(parentLayout, "botPermissionLocation");
                    q2Var3.k(true);
                    return;
                }
                return;
        }
    }
}
