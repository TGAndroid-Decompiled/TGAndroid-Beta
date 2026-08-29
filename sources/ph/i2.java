package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class i2 implements Runnable {
    public final int f45838a;
    public final k2 f45839b;

    public i2(k2 k2Var, int i10) {
        this.f45838a = i10;
        this.f45839b = k2Var;
    }

    @Override
    public final void run() {
        switch (this.f45838a) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                k2 k2Var = this.f45839b;
                p2 p2Var = k2Var.d;
                toggleuseremojistatuspermission.bot = MessagesController.getInstance(p2Var.C).getInputUser(p2Var.D);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(p2Var.C).sendRequest(toggleuseremojistatuspermission, new j2(k2Var, 1));
                return;
            case 1:
                p2 p2Var2 = this.f45839b.d;
                q0.e(p2Var2.getContext(), p2Var2.C, p2Var2.D).m(false, null);
                return;
            default:
                p2 p2Var3 = this.f45839b.d;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null && U.getParentLayout() != null) {
                    b5 parentLayout = U.getParentLayout();
                    U.presentFragment(ProfileActivity.m4(p2Var3.D));
                    AndroidUtilities.scrollToFragmentRow(parentLayout, "botPermissionLocation");
                    p2Var3.k(true);
                    return;
                }
                return;
        }
    }
}
