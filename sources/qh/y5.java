package qh;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class y5 extends a6 {
    public final TLRPC.User f46359b;

    public y5(String str, TLRPC.User user) {
        super(str);
        this.f46359b = user;
    }

    @Override
    public final String a() {
        return LocaleController.getString(R.string.ViewProfile);
    }

    @Override
    public final String b() {
        return UserObject.getUserName(this.f46359b);
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.p2 p2Var) {
        TLRPC.User user = this.f46359b;
        if (user.f20990id == UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f20990id);
            bundle.putBoolean("my_profile", true);
            p2Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        p2Var.presentFragment(ProfileActivity.m4(user.f20990id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        TLRPC.User user = this.f46359b;
        z8Var.r(user);
        imageReceiver.setForUserOrChat(user, z8Var);
    }
}
