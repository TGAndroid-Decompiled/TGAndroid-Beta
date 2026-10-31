package xh;

import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class f2 implements Runnable {
    public final int f53760a;
    public final h2 f53761b;

    public f2(h2 h2Var, int i10) {
        this.f53760a = i10;
        this.f53761b = h2Var;
    }

    @Override
    public final void run() {
        switch (this.f53760a) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                h2 h2Var = this.f53761b;
                m2 m2Var = h2Var.d;
                toggleuseremojistatuspermission.bot = vp.r1(m2Var.H).n1(m2Var.I);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(m2Var.H).sendRequest(toggleuseremojistatuspermission, new g2(h2Var, 1));
                return;
            case 1:
                m2 m2Var2 = this.f53761b.d;
                o0.e(m2Var2.getContext(), m2Var2.H, m2Var2.I).l(false, null);
                return;
            default:
                m2 m2Var3 = this.f53761b.d;
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null && T.getParentLayout() != null) {
                    z4 parentLayout = T.getParentLayout();
                    T.presentFragment(ProfileActivity.z4(m2Var3.I));
                    org.telegram.messenger.i0.j3(parentLayout, "botPermissionLocation");
                    m2Var3.o(true);
                    return;
                }
                return;
        }
    }
}
