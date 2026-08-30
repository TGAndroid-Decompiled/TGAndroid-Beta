package uf;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class s implements RequestDelegate {
    public final int f45433a;
    public final t f45434b;

    public s(t tVar, int i10) {
        this.f45433a = i10;
        this.f45434b = tVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45433a) {
            case 0:
                final t tVar = this.f45434b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        t tVar2 = tVar;
                        switch (i10) {
                            case 0:
                                int i11 = tVar2.f45440a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    tVar2.f45441b.add(tL_businessChatLink);
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinkCreated, tL_businessChatLink);
                                    tVar2.f();
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = tVar2.f45441b;
                                int i12 = tVar2.f45440a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    MessagesController.getInstance(i12).putUsers(businesschatlinks.users, false);
                                    MessagesController.getInstance(i12).putChats(businesschatlinks.chats, false);
                                    MessagesStorage.getInstance(i12).putUsersAndChats(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                                    tVar2.f();
                                } else {
                                    FileLog.e(new RuntimeException("Unexpected response from server!"));
                                }
                                tVar2.f45442c = false;
                                tVar2.d = true;
                                return;
                        }
                    }
                });
                return;
            default:
                final t tVar2 = this.f45434b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        t tVar22 = tVar2;
                        switch (i10) {
                            case 0:
                                int i11 = tVar22.f45440a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    tVar22.f45441b.add(tL_businessChatLink);
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinkCreated, tL_businessChatLink);
                                    tVar22.f();
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = tVar22.f45441b;
                                int i12 = tVar22.f45440a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    MessagesController.getInstance(i12).putUsers(businesschatlinks.users, false);
                                    MessagesController.getInstance(i12).putChats(businesschatlinks.chats, false);
                                    MessagesStorage.getInstance(i12).putUsersAndChats(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                                    tVar22.f();
                                } else {
                                    FileLog.e(new RuntimeException("Unexpected response from server!"));
                                }
                                tVar22.f45442c = false;
                                tVar22.d = true;
                                return;
                        }
                    }
                });
                return;
        }
    }
}
