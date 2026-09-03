package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class zg1 implements Utilities.Callback {
    public final int f43959a;
    public final UserInfoActivity f43960b;

    public zg1(UserInfoActivity userInfoActivity, int i10) {
        this.f43959a = i10;
        this.f43960b = userInfoActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43959a) {
            case 0:
                UserInfoActivity userInfoActivity = this.f43960b;
                userInfoActivity.G = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.a61 a61Var = userInfoActivity.f34928x;
                if (a61Var != null) {
                    a61Var.V2.N(true);
                }
                userInfoActivity.b0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity2 = this.f43960b;
                if (userInfoActivity2.H != chat) {
                    userInfoActivity2.H = chat;
                    if (chat != null) {
                        l.d.v(R.string.EditProfileChannelSet, org.telegram.ui.Components.qc.a0(userInfoActivity2), R.raw.contact_check, 36);
                    }
                    userInfoActivity2.b0(true);
                    org.telegram.ui.Components.a61 a61Var2 = userInfoActivity2.f34928x;
                    if (a61Var2 != null) {
                        a61Var2.V2.N(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
