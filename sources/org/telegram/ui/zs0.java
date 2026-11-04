package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class zs0 implements org.telegram.messenger.u10 {
    public final int f52746a;
    public final at0 f52747b;

    public zs0(at0 at0Var, int i3) {
        this.f52746a = i3;
        this.f52747b = at0Var;
    }

    @Override
    public final void a(Object obj) {
        TL_account.TL_birthday tL_birthday;
        int i3;
        int i10;
        switch (this.f52746a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f52747b.d;
                privacyControlActivity.N = ((Integer) obj).intValue();
                org.telegram.messenger.g0.a4(privacyControlActivity.f41684l0, privacyControlActivity.f41672c);
                privacyControlActivity.P0();
                return;
            default:
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                at0 at0Var = this.f52747b;
                PrivacyControlActivity privacyControlActivity2 = at0Var.d;
                TLRPC.UserFull b22 = privacyControlActivity2.getMessagesController().b2(privacyControlActivity2.getUserConfig().e());
                if (b22 != null) {
                    tL_birthday = b22.birthday;
                } else {
                    tL_birthday = null;
                }
                if (b22 != null) {
                    b22.flags2 |= 32;
                    b22.birthday = tL_birthday2;
                    privacyControlActivity2.getMessagesStorage().j2(b22, false);
                }
                privacyControlActivity2.getMessagesController().m2();
                privacyControlActivity2.getConnectionsManager().sendRequest(updatebirthday, new co0(at0Var, b22, tL_birthday, 1), 1024);
                i3 = ((org.telegram.ui.ActionBar.d2) privacyControlActivity2).currentAccount;
                org.telegram.messenger.hp.s1(i3).k4(0L, "BIRTHDAY_SETUP");
                i10 = ((org.telegram.ui.ActionBar.d2) privacyControlActivity2).currentAccount;
                org.telegram.messenger.hs.f(i10).k(309, new Object[0]);
                privacyControlActivity2.Q0(true);
                return;
        }
    }
}
