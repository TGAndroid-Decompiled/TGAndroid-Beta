package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ru0 implements org.telegram.messenger.q20 {
    public final int f41295a;
    public final su0 f41296b;

    public ru0(su0 su0Var, int i10) {
        this.f41295a = i10;
        this.f41296b = su0Var;
    }

    @Override
    public final void a(Object obj) {
        TL_account.TL_birthday tL_birthday;
        int i10;
        int i11;
        switch (this.f41295a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f41296b.d;
                privacyControlActivity.K = ((Integer) obj).intValue();
                org.telegram.messenger.i0.Z3(privacyControlActivity.f33736i0, privacyControlActivity.f33728c);
                privacyControlActivity.I0();
                return;
            default:
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                su0 su0Var = this.f41296b;
                PrivacyControlActivity privacyControlActivity2 = su0Var.d;
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
                privacyControlActivity2.getConnectionsManager().sendRequest(updatebirthday, new vp0(su0Var, a2, tL_birthday, 1), 1024);
                i10 = ((org.telegram.ui.ActionBar.k2) privacyControlActivity2).currentAccount;
                org.telegram.messenger.vp.r1(i10).h4(0L, "BIRTHDAY_SETUP");
                i11 = ((org.telegram.ui.ActionBar.k2) privacyControlActivity2).currentAccount;
                org.telegram.messenger.zs.f(i11).k(309, new Object[0]);
                privacyControlActivity2.J0(true);
                return;
        }
    }
}
