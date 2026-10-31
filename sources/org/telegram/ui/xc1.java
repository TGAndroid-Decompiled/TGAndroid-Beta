package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class xc1 implements org.telegram.messenger.q20 {
    public final int f43549a;
    public final UserInfoActivity f43550b;

    public xc1(UserInfoActivity userInfoActivity, int i10) {
        this.f43549a = i10;
        this.f43550b = userInfoActivity;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f43549a;
        UserInfoActivity userInfoActivity = this.f43550b;
        switch (i10) {
            case 0:
                userInfoActivity.J = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.ii iiVar = userInfoActivity.f34145y;
                if (iiVar != null) {
                    iiVar.f30819f3.O(true);
                }
                userInfoActivity.f0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (userInfoActivity.K != chat) {
                    userInfoActivity.K = chat;
                    if (chat != null) {
                        org.telegram.messenger.m5.n(null, 2131751234, org.telegram.ui.Components.cc.a0(userInfoActivity), 2131623989, 36);
                    }
                    userInfoActivity.f0(true);
                    org.telegram.ui.Components.ii iiVar2 = userInfoActivity.f34145y;
                    if (iiVar2 != null) {
                        iiVar2.f30819f3.O(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
