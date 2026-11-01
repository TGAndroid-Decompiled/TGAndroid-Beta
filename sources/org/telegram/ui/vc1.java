package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class vc1 implements org.telegram.messenger.r20 {
    public final int f42488a;
    public final UserInfoActivity f42489b;

    public vc1(UserInfoActivity userInfoActivity, int i10) {
        this.f42488a = i10;
        this.f42489b = userInfoActivity;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f42488a;
        UserInfoActivity userInfoActivity = this.f42489b;
        switch (i10) {
            case 0:
                userInfoActivity.J = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.ii iiVar = userInfoActivity.f34152y;
                if (iiVar != null) {
                    iiVar.f31183f3.O(true);
                }
                userInfoActivity.g0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (userInfoActivity.K != chat) {
                    userInfoActivity.K = chat;
                    if (chat != null) {
                        org.telegram.messenger.m5.n(null, 2131751234, org.telegram.ui.Components.cc.a0(userInfoActivity), 2131623989, 36);
                    }
                    userInfoActivity.g0(true);
                    org.telegram.ui.Components.ii iiVar2 = userInfoActivity.f34152y;
                    if (iiVar2 != null) {
                        iiVar2.f31183f3.O(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
