package ph;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class a6 extends c6 {
    public final TLRPC.User f41278b;

    public a6(String str, TLRPC.User user) {
        super(str);
        this.f41278b = user;
    }

    @Override
    public final String a() {
        return LocaleController.getString(R.string.ViewProfile);
    }

    @Override
    public final String b() {
        return UserObject.getUserName(this.f41278b);
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.p2 p2Var) {
        TLRPC.User user = this.f41278b;
        if (user.f19331id == UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f19331id);
            bundle.putBoolean("my_profile", true);
            p2Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        p2Var.presentFragment(ProfileActivity.m4(user.f19331id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        TLRPC.User user = this.f41278b;
        z8Var.r(user);
        imageReceiver.setForUserOrChat(user, z8Var);
    }
}
