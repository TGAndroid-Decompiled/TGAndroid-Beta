package yf;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.w1;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
public final class r extends q {
    public final void b(int i10, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i11) {
        ArrayList arrayList = this.f50154a;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            TLRPC.TL_message b10 = u.b((TL_ephemeral.EphemeralMessage) obj);
            int i13 = i10;
            ConcurrentHashMap concurrentHashMap3 = concurrentHashMap;
            ConcurrentHashMap concurrentHashMap4 = concurrentHashMap2;
            MessageObject messageObject = new MessageObject(i13, (TLRPC.Message) b10, (AbstractMap<Long, TLRPC.User>) concurrentHashMap3, (AbstractMap<Long, TLRPC.Chat>) concurrentHashMap4, true, true);
            long dialogId = MessageObject.getDialogId(b10);
            if (i11 != 0) {
                b10.edit_date = i11;
                b10.flags |= 32768;
            }
            a0.i iVar = this.f50155b;
            TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) iVar.f(dialogId);
            if (tL_messages_messages == null) {
                tL_messages_messages = new TLRPC.TL_messages_messages();
                iVar.k(tL_messages_messages, dialogId);
            }
            tL_messages_messages.messages.add(b10);
            a0.i iVar2 = this.f50156c;
            ArrayList arrayList2 = (ArrayList) iVar2.f(dialogId);
            if (arrayList2 == null) {
                arrayList2 = w1.k(dialogId, iVar2);
            }
            arrayList2.add(messageObject);
            i10 = i13;
            concurrentHashMap = concurrentHashMap3;
            concurrentHashMap2 = concurrentHashMap4;
        }
    }
}
