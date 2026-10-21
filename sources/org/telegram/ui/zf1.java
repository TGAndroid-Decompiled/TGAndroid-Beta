package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class zf1 implements Utilities.Callback {
    public final int f43739a;
    public final UserInfoActivity f43740b;

    public zf1(UserInfoActivity userInfoActivity, int i10) {
        this.f43739a = i10;
        this.f43740b = userInfoActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43739a) {
            case 0:
                UserInfoActivity userInfoActivity = this.f43740b;
                userInfoActivity.J = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.w61 w61Var = userInfoActivity.f33954x;
                if (w61Var != null) {
                    w61Var.W2.N(true);
                }
                userInfoActivity.b0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity2 = this.f43740b;
                if (userInfoActivity2.K != chat) {
                    userInfoActivity2.K = chat;
                    if (chat != null) {
                        org.telegram.messenger.g0.q(R.string.EditProfileChannelSet, org.telegram.ui.Components.xc.a0(userInfoActivity2), R.raw.contact_check, 36);
                    }
                    userInfoActivity2.b0(true);
                    org.telegram.ui.Components.w61 w61Var2 = userInfoActivity2.f33954x;
                    if (w61Var2 != null) {
                        w61Var2.W2.N(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
