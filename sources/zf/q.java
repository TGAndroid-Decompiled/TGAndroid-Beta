package zf;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
public class q {
    public final ArrayList f51608a = new ArrayList();
    public final a0.h f51609b = new a0.h();
    public final a0.h f51610c = new a0.h();

    public static void a(q qVar, TL_ephemeral.EphemeralMessage ephemeralMessage, TLRPC.TL_message tL_message, MessageObject messageObject) {
        a0.h hVar = qVar.f51610c;
        long dialogId = MessageObject.getDialogId(tL_message);
        qVar.f51608a.add(ephemeralMessage);
        a0.h hVar2 = qVar.f51609b;
        TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) hVar2.f(dialogId);
        if (tL_messages_messages == null) {
            tL_messages_messages = new TLRPC.TL_messages_messages();
            hVar2.k(tL_messages_messages, dialogId);
        }
        tL_messages_messages.messages.add(tL_message);
        ArrayList arrayList = (ArrayList) hVar.f(dialogId);
        if (arrayList == null) {
            arrayList = org.telegram.messenger.q.j(dialogId, hVar);
        }
        arrayList.add(messageObject);
    }
}
