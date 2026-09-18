package org.telegram.ui;

import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class qs extends org.telegram.ui.ActionBar.j {
    public final us f37019a;

    public qs(us usVar) {
        this.f37019a = usVar;
    }

    @Override
    public final void b(int i10) {
        boolean z10;
        int i11;
        int i12;
        us usVar = this.f37019a;
        if (i10 == -1) {
            usVar.finishFragment();
        } else if (i10 == 1 && usVar.f38187b.getText().length() != 0) {
            TLRPC.User user = usVar.getMessagesController().getUser(Long.valueOf(usVar.H));
            TLRPC.UserFull userFull = usVar.getMessagesController().getUserFull(usVar.H);
            user.first_name = usVar.f38187b.getText().toString();
            user.last_name = usVar.f38188c.getText().toString();
            user.contact = true;
            TLRPC.TL_textWithEntities textWithEntities = usVar.d.getTextWithEntities();
            usVar.getMessagesController().putUser(user, false);
            ContactsController contactsController = usVar.getContactsController();
            if (usVar.K && usVar.X) {
                z10 = true;
            } else {
                z10 = false;
            }
            contactsController.addContact(user, textWithEntities, z10);
            i11 = ((org.telegram.ui.ActionBar.o2) usVar).currentAccount;
            MessagesController.getNotificationsSettings(i11).edit().putInt("dialog_bar_vis3" + usVar.H, 3).commit();
            usVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            usVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(usVar.H));
            if (userFull != null) {
                if (textWithEntities != null && textWithEntities.text.length() > 0) {
                    userFull.flags2 |= 4194304;
                    userFull.note = textWithEntities;
                } else {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                }
                i12 = ((org.telegram.ui.ActionBar.o2) usVar).currentAccount;
                MessagesStorage.getInstance(i12).updateUserInfo(userFull, true);
                usVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(userFull.f18269id), userFull);
            }
            usVar.finishFragment();
            ts tsVar = usVar.O;
            if (tsVar != null) {
                tsVar.b();
            }
        }
    }
}
