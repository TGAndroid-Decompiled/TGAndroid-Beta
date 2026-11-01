package vh;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.i20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class x4 extends z4 {
    public final TLRPC.User f52187b;

    public x4(String str, TLRPC.User user) {
        super(str);
        this.f52187b = user;
    }

    @Override
    public final String a() {
        return dd.L0(2131743572, null);
    }

    @Override
    public final String b() {
        return i20.p(this.f52187b);
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.k2 k2Var) {
        TLRPC.User user = this.f52187b;
        if (user.f19943id == e20.i(e20.f15506s0).e()) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f19943id);
            bundle.putBoolean("my_profile", true);
            k2Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        k2Var.presentFragment(ProfileActivity.A4(user.f19943id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        TLRPC.User user = this.f52187b;
        r8Var.r(user);
        imageReceiver.i0(user, r8Var, null);
    }
}
