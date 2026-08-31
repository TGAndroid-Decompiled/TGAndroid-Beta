package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ug1 implements Utilities.Callback {
    public final int f41931a;
    public final UserInfoActivity f41932b;

    public ug1(UserInfoActivity userInfoActivity, int i10) {
        this.f41931a = i10;
        this.f41932b = userInfoActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f41931a) {
            case 0:
                UserInfoActivity userInfoActivity = this.f41932b;
                userInfoActivity.G = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.b61 b61Var = userInfoActivity.f34928x;
                if (b61Var != null) {
                    b61Var.V2.N(true);
                }
                userInfoActivity.b0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity2 = this.f41932b;
                if (userInfoActivity2.H != chat) {
                    userInfoActivity2.H = chat;
                    if (chat != null) {
                        l.d.v(R.string.EditProfileChannelSet, org.telegram.ui.Components.qc.a0(userInfoActivity2), R.raw.contact_check, 36);
                    }
                    userInfoActivity2.b0(true);
                    org.telegram.ui.Components.b61 b61Var2 = userInfoActivity2.f34928x;
                    if (b61Var2 != null) {
                        b61Var2.V2.N(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
