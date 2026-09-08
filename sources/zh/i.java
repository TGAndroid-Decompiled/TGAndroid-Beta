package zh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class i implements RequestDelegate {
    public final int f52035a;
    public final o f52036b;

    public i(o oVar, int i10) {
        this.f52035a = i10;
        this.f52036b = oVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52035a) {
            case 0:
                final o oVar = this.f52036b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                o oVar2 = oVar;
                                oVar2.getClass();
                                oVar2.f52386j = new ArrayList();
                                oVar2.f52385i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                                        oVar2.f52386j.add((TLRPC.User) vector.objects.get(i10));
                                    }
                                    MessagesController.getInstance(oVar2.f52379a).putUsers(oVar2.f52386j, false);
                                    return;
                                }
                                return;
                            default:
                                o oVar3 = oVar;
                                int i11 = oVar3.f52379a;
                                oVar3.f52388l = new ArrayList();
                                oVar3.f52387k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    MessagesController.getInstance(i11).putChats(messages_chats.chats, false);
                                    oVar3.f52388l.addAll(messages_chats.chats);
                                }
                                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.adminedChannelsLoaded, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            default:
                final o oVar2 = this.f52036b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                o oVar22 = oVar2;
                                oVar22.getClass();
                                oVar22.f52386j = new ArrayList();
                                oVar22.f52385i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                                        oVar22.f52386j.add((TLRPC.User) vector.objects.get(i10));
                                    }
                                    MessagesController.getInstance(oVar22.f52379a).putUsers(oVar22.f52386j, false);
                                    return;
                                }
                                return;
                            default:
                                o oVar3 = oVar2;
                                int i11 = oVar3.f52379a;
                                oVar3.f52388l = new ArrayList();
                                oVar3.f52387k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    MessagesController.getInstance(i11).putChats(messages_chats.chats, false);
                                    oVar3.f52388l.addAll(messages_chats.chats);
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
