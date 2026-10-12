package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class th1 implements Utilities.Callback {
    public final int f40390a;
    public final UserInfoActivity f40391b;

    public th1(UserInfoActivity userInfoActivity, int i10) {
        this.f40390a = i10;
        this.f40391b = userInfoActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40390a) {
            case 0:
                UserInfoActivity userInfoActivity = this.f40391b;
                userInfoActivity.J = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.b71 b71Var = userInfoActivity.f32897x;
                if (b71Var != null) {
                    b71Var.W2.N(true);
                }
                userInfoActivity.b0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity2 = this.f40391b;
                if (userInfoActivity2.K != chat) {
                    userInfoActivity2.K = chat;
                    if (chat != null) {
                        org.telegram.messenger.q.r(R.string.EditProfileChannelSet, org.telegram.ui.Components.zc.a0(userInfoActivity2), R.raw.contact_check, 36);
                    }
                    userInfoActivity2.b0(true);
                    org.telegram.ui.Components.b71 b71Var2 = userInfoActivity2.f32897x;
                    if (b71Var2 != null) {
                        b71Var2.W2.N(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
