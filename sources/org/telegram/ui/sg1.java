package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class sg1 implements Utilities.Callback {
    public final int f38338a;
    public final UserInfoActivity f38339b;

    public sg1(UserInfoActivity userInfoActivity, int i10) {
        this.f38338a = i10;
        this.f38339b = userInfoActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38338a) {
            case 0:
                UserInfoActivity userInfoActivity = this.f38339b;
                userInfoActivity.G = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.a61 a61Var = userInfoActivity.f32385x;
                if (a61Var != null) {
                    a61Var.V2.N(true);
                }
                userInfoActivity.b0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity2 = this.f38339b;
                if (userInfoActivity2.H != chat) {
                    userInfoActivity2.H = chat;
                    if (chat != null) {
                        kh.a2.v(R.string.EditProfileChannelSet, org.telegram.ui.Components.qc.a0(userInfoActivity2), R.raw.contact_check, 36);
                    }
                    userInfoActivity2.b0(true);
                    org.telegram.ui.Components.a61 a61Var2 = userInfoActivity2.f32385x;
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
