package sf;

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
public final class t implements RequestDelegate {
    public final int f47953a;
    public final u f47954b;

    public t(u uVar, int i10) {
        this.f47953a = i10;
        this.f47954b = uVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47953a) {
            case 0:
                final u uVar = this.f47954b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        u uVar2 = uVar;
                        switch (i10) {
                            case 0:
                                int i11 = uVar2.f47958a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    uVar2.f47959b.add(tL_businessChatLink);
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinkCreated, tL_businessChatLink);
                                    uVar2.f();
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = uVar2.f47959b;
                                int i12 = uVar2.f47958a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    MessagesController.getInstance(i12).putUsers(businesschatlinks.users, false);
                                    MessagesController.getInstance(i12).putChats(businesschatlinks.chats, false);
                                    MessagesStorage.getInstance(i12).putUsersAndChats(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                                    uVar2.f();
                                } else {
                                    FileLog.e(new RuntimeException("Unexpected response from server!"));
                                }
                                uVar2.f47960c = false;
                                uVar2.d = true;
                                return;
                        }
                    }
                });
                return;
            default:
                final u uVar2 = this.f47954b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        u uVar22 = uVar2;
                        switch (i10) {
                            case 0:
                                int i11 = uVar22.f47958a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    uVar22.f47959b.add(tL_businessChatLink);
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinkCreated, tL_businessChatLink);
                                    uVar22.f();
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = uVar22.f47959b;
                                int i12 = uVar22.f47958a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    MessagesController.getInstance(i12).putUsers(businesschatlinks.users, false);
                                    MessagesController.getInstance(i12).putChats(businesschatlinks.chats, false);
                                    MessagesStorage.getInstance(i12).putUsersAndChats(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                                    uVar22.f();
                                } else {
                                    FileLog.e(new RuntimeException("Unexpected response from server!"));
                                }
                                uVar22.f47960c = false;
                                uVar22.d = true;
                                return;
                        }
                    }
                });
                return;
        }
    }
}
