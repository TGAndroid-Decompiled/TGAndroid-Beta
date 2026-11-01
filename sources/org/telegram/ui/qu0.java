package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class qu0 implements org.telegram.messenger.r20 {
    public final int f40907a;
    public final ru0 f40908b;

    public qu0(ru0 ru0Var, int i10) {
        this.f40907a = i10;
        this.f40908b = ru0Var;
    }

    @Override
    public final void a(Object obj) {
        TL_account.TL_birthday tL_birthday;
        int i10;
        int i11;
        switch (this.f40907a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f40908b.d;
                privacyControlActivity.K = ((Integer) obj).intValue();
                org.telegram.messenger.i0.Z3(privacyControlActivity.f33743i0, privacyControlActivity.f33735c);
                privacyControlActivity.J0();
                return;
            default:
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                ru0 ru0Var = this.f40908b;
                PrivacyControlActivity privacyControlActivity2 = ru0Var.d;
                TLRPC.UserFull a2 = privacyControlActivity2.getMessagesController().a2(privacyControlActivity2.getUserConfig().e());
                if (a2 != null) {
                    tL_birthday = a2.birthday;
                } else {
                    tL_birthday = null;
                }
                if (a2 != null) {
                    a2.flags2 |= 32;
                    a2.birthday = tL_birthday2;
                    privacyControlActivity2.getMessagesStorage().j2(a2, false);
                }
                privacyControlActivity2.getMessagesController().l2();
                privacyControlActivity2.getConnectionsManager().sendRequest(updatebirthday, new tp0(ru0Var, a2, tL_birthday, 1), 1024);
                i10 = ((org.telegram.ui.ActionBar.k2) privacyControlActivity2).currentAccount;
                org.telegram.messenger.wp.r1(i10).h4(0L, "BIRTHDAY_SETUP");
                i11 = ((org.telegram.ui.ActionBar.k2) privacyControlActivity2).currentAccount;
                org.telegram.messenger.at.f(i11).k(309, new Object[0]);
                privacyControlActivity2.K0(true);
                return;
        }
    }
}
