package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class sw0 implements Utilities.Callback {

    public final int f42701a;

    public final uw0 f42702b;

    public sw0(uw0 uw0Var, int i10) {
        this.f42701a = i10;
        this.f42702b = uw0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f42701a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f42702b.d;
                privacyControlActivity.H = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(privacyControlActivity.d, privacyControlActivity.f35884f0);
                privacyControlActivity.E0();
                break;
            default:
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                uw0 uw0Var = this.f42702b;
                PrivacyControlActivity privacyControlActivity2 = uw0Var.d;
                TLRPC.UserFull userFull = privacyControlActivity2.getMessagesController().getUserFull(privacyControlActivity2.getUserConfig().getClientUserId());
                TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
                if (userFull != null) {
                    userFull.flags2 |= 32;
                    userFull.birthday = tL_birthday;
                    privacyControlActivity2.getMessagesStorage().updateUserInfo(userFull, false);
                }
                privacyControlActivity2.getMessagesController().invalidateContentSettings();
                privacyControlActivity2.getConnectionsManager().sendRequest(updatebirthday, new lr0(uw0Var, userFull, tL_birthday2, 1), 1024);
                MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) privacyControlActivity2).currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
                NotificationCenter.getInstance(((org.telegram.ui.ActionBar.n2) privacyControlActivity2).currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.premiumPromoUpdated, new Object[0]);
                privacyControlActivity2.F0(true);
                break;
        }
    }
}
