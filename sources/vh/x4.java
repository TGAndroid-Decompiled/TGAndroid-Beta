package vh;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class x4 extends z4 {
    public final TLRPC.User f52169b;

    public x4(String str, TLRPC.User user) {
        super(str);
        this.f52169b = user;
    }

    @Override
    public final String a() {
        return cd.L0(2131743572, null);
    }

    @Override
    public final String b() {
        return h20.p(this.f52169b);
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.k2 k2Var) {
        TLRPC.User user = this.f52169b;
        if (user.f19942id == d20.i(d20.f15147s0).e()) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f19942id);
            bundle.putBoolean("my_profile", true);
            k2Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        k2Var.presentFragment(ProfileActivity.z4(user.f19942id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        TLRPC.User user = this.f52169b;
        r8Var.r(user);
        imageReceiver.i0(user, r8Var, null);
    }
}
