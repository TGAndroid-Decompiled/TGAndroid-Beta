package ph;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class z5 extends b6 {
    public final TLRPC.User f42698b;

    public z5(String str, TLRPC.User user) {
        super(str);
        this.f42698b = user;
    }

    @Override
    public final String a() {
        return LocaleController.getString(R.string.ViewProfile);
    }

    @Override
    public final String b() {
        return UserObject.getUserName(this.f42698b);
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.p2 p2Var) {
        TLRPC.User user = this.f42698b;
        if (user.f19306id == UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f19306id);
            bundle.putBoolean("my_profile", true);
            p2Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        p2Var.presentFragment(ProfileActivity.m4(user.f19306id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        TLRPC.User user = this.f42698b;
        z8Var.r(user);
        imageReceiver.setForUserOrChat(user, z8Var);
    }
}
