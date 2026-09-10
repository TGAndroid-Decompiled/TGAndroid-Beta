package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class rh1 implements Utilities.Callback {
    public final int f36373a;
    public final UserInfoActivity f36374b;

    public rh1(UserInfoActivity userInfoActivity, int i10) {
        this.f36373a = i10;
        this.f36374b = userInfoActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f36373a) {
            case 0:
                UserInfoActivity userInfoActivity = this.f36374b;
                userInfoActivity.J = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.l61 l61Var = userInfoActivity.f30718x;
                if (l61Var != null) {
                    l61Var.Y2.N(true);
                }
                userInfoActivity.b0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity2 = this.f36374b;
                if (userInfoActivity2.K != chat) {
                    userInfoActivity2.K = chat;
                    if (chat != null) {
                        org.telegram.messenger.a2.o(R.string.EditProfileChannelSet, org.telegram.ui.Components.wc.a0(userInfoActivity2), R.raw.contact_check, 36);
                    }
                    userInfoActivity2.b0(true);
                    org.telegram.ui.Components.l61 l61Var2 = userInfoActivity2.f30718x;
                    if (l61Var2 != null) {
                        l61Var2.Y2.N(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
