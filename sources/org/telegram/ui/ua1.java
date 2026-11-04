package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ua1 implements org.telegram.messenger.u10 {
    public final int f50026a;
    public final UserInfoActivity f50027b;

    public ua1(UserInfoActivity userInfoActivity, int i3) {
        this.f50026a = i3;
        this.f50027b = userInfoActivity;
    }

    @Override
    public final void a(Object obj) {
        int i3 = this.f50026a;
        UserInfoActivity userInfoActivity = this.f50027b;
        switch (i3) {
            case 0:
                userInfoActivity.K = (TL_account.TL_birthday) obj;
                ai.h4 h4Var = userInfoActivity.f42104y;
                if (h4Var != null) {
                    h4Var.f35594g3.O(true);
                }
                userInfoActivity.g0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (userInfoActivity.L != chat) {
                    userInfoActivity.L = chat;
                    if (chat != null) {
                        org.telegram.messenger.k5.o(null, 2131751234, org.telegram.ui.Components.fc.a0(userInfoActivity), 2131623989, 36);
                    }
                    userInfoActivity.g0(true);
                    ai.h4 h4Var2 = userInfoActivity.f42104y;
                    if (h4Var2 != null) {
                        h4Var2.f35594g3.O(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
