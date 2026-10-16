package org.telegram.ui;

import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ss extends org.telegram.ui.ActionBar.j {
    public final ws f39939a;

    public ss(ws wsVar) {
        this.f39939a = wsVar;
    }

    @Override
    public final void b(int i10) {
        boolean z10;
        int i11;
        int i12;
        ws wsVar = this.f39939a;
        if (i10 == -1) {
            wsVar.finishFragment();
        } else if (i10 == 1 && wsVar.f41347b.getText().length() != 0) {
            TLRPC.User user = wsVar.getMessagesController().getUser(Long.valueOf(wsVar.H));
            TLRPC.UserFull userFull = wsVar.getMessagesController().getUserFull(wsVar.H);
            user.first_name = wsVar.f41347b.getText().toString();
            user.last_name = wsVar.f41348c.getText().toString();
            user.contact = true;
            TLRPC.TL_textWithEntities textWithEntities = wsVar.d.getTextWithEntities();
            wsVar.getMessagesController().putUser(user, false);
            ContactsController contactsController = wsVar.getContactsController();
            if (wsVar.K && wsVar.X) {
                z10 = true;
            } else {
                z10 = false;
            }
            contactsController.addContact(user, textWithEntities, z10);
            i11 = ((org.telegram.ui.ActionBar.m2) wsVar).currentAccount;
            MessagesController.getNotificationsSettings(i11).edit().putInt("dialog_bar_vis3" + wsVar.H, 3).commit();
            wsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            wsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(wsVar.H));
            if (userFull != null) {
                if (textWithEntities != null && textWithEntities.text.length() > 0) {
                    userFull.flags2 |= 4194304;
                    userFull.note = textWithEntities;
                } else {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                }
                i12 = ((org.telegram.ui.ActionBar.m2) wsVar).currentAccount;
                MessagesStorage.getInstance(i12).updateUserInfo(userFull, true);
                wsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(userFull.f19064id), userFull);
            }
            wsVar.finishFragment();
            vs vsVar = wsVar.O;
            if (vsVar != null) {
                vsVar.b();
            }
        }
    }
}
