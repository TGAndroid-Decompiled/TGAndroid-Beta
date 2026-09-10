package xh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class j implements RequestDelegate {
    public final int f45558a;
    public final p f45559b;

    public j(p pVar, int i10) {
        this.f45558a = i10;
        this.f45559b = pVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45558a) {
            case 0:
                final p pVar = this.f45559b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                p pVar2 = pVar;
                                pVar2.getClass();
                                pVar2.f45849j = new ArrayList();
                                pVar2.f45848i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                                        pVar2.f45849j.add((TLRPC.User) vector.objects.get(i10));
                                    }
                                    MessagesController.getInstance(pVar2.f45843a).putUsers(pVar2.f45849j, false);
                                    return;
                                }
                                return;
                            default:
                                p pVar3 = pVar;
                                int i11 = pVar3.f45843a;
                                pVar3.f45851l = new ArrayList();
                                pVar3.f45850k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    MessagesController.getInstance(i11).putChats(messages_chats.chats, false);
                                    pVar3.f45851l.addAll(messages_chats.chats);
                                }
                                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.adminedChannelsLoaded, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            default:
                final p pVar2 = this.f45559b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                p pVar22 = pVar2;
                                pVar22.getClass();
                                pVar22.f45849j = new ArrayList();
                                pVar22.f45848i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                                        pVar22.f45849j.add((TLRPC.User) vector.objects.get(i10));
                                    }
                                    MessagesController.getInstance(pVar22.f45843a).putUsers(pVar22.f45849j, false);
                                    return;
                                }
                                return;
                            default:
                                p pVar3 = pVar2;
                                int i11 = pVar3.f45843a;
                                pVar3.f45851l = new ArrayList();
                                pVar3.f45850k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    MessagesController.getInstance(i11).putChats(messages_chats.chats, false);
                                    pVar3.f45851l.addAll(messages_chats.chats);
                                }
                                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.adminedChannelsLoaded, new Object[0]);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
