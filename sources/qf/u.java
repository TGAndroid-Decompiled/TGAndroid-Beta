package qf;

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

public final class u implements RequestDelegate {

    public final int f46461a;

    public final v f46462b;

    public u(v vVar, int i10) {
        this.f46461a = i10;
        this.f46462b = vVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f46461a) {
            case 0:
                final int i10 = 1;
                final v vVar = this.f46462b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i11 = i10;
                        TLObject tLObject2 = tLObject;
                        v vVar2 = vVar;
                        switch (i11) {
                            case 0:
                                int i12 = vVar2.f46465a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    vVar2.f46466b.add(tL_businessChatLink);
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinkCreated, tL_businessChatLink);
                                    vVar2.f();
                                }
                                break;
                            default:
                                ArrayList arrayList = vVar2.f46466b;
                                int i13 = vVar2.f46465a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    MessagesController.getInstance(i13).putUsers(businesschatlinks.users, false);
                                    MessagesController.getInstance(i13).putChats(businesschatlinks.chats, false);
                                    MessagesStorage.getInstance(i13).putUsersAndChats(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                                    vVar2.f();
                                } else {
                                    FileLog.e(new RuntimeException("Unexpected response from server!"));
                                }
                                vVar2.f46467c = false;
                                vVar2.d = true;
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final v vVar2 = this.f46462b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i12 = i11;
                        TLObject tLObject2 = tLObject;
                        v vVar3 = vVar2;
                        switch (i12) {
                            case 0:
                                int i13 = vVar3.f46465a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    vVar3.f46466b.add(tL_businessChatLink);
                                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinkCreated, tL_businessChatLink);
                                    vVar3.f();
                                }
                                break;
                            default:
                                ArrayList arrayList = vVar3.f46466b;
                                int i14 = vVar3.f46465a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    MessagesController.getInstance(i14).putUsers(businesschatlinks.users, false);
                                    MessagesController.getInstance(i14).putChats(businesschatlinks.chats, false);
                                    MessagesStorage.getInstance(i14).putUsersAndChats(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                                    vVar3.f();
                                } else {
                                    FileLog.e(new RuntimeException("Unexpected response from server!"));
                                }
                                vVar3.f46467c = false;
                                vVar3.d = true;
                                break;
                        }
                    }
                });
                break;
        }
    }
}
