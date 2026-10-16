package zf;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
public class r {
    public final ArrayList f50207a = new ArrayList();
    public final a0.h f50208b = new a0.h();
    public final a0.h f50209c = new a0.h();

    public static void a(r rVar, TL_ephemeral.EphemeralMessage ephemeralMessage, TLRPC.TL_message tL_message, MessageObject messageObject) {
        a0.h hVar = rVar.f50209c;
        long dialogId = MessageObject.getDialogId(tL_message);
        rVar.f50207a.add(ephemeralMessage);
        a0.h hVar2 = rVar.f50208b;
        TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) hVar2.f(dialogId);
        if (tL_messages_messages == null) {
            tL_messages_messages = new TLRPC.TL_messages_messages();
            hVar2.k(tL_messages_messages, dialogId);
        }
        tL_messages_messages.messages.add(tL_message);
        ArrayList arrayList = (ArrayList) hVar.f(dialogId);
        if (arrayList == null) {
            arrayList = org.telegram.messenger.g0.j(dialogId, hVar);
        }
        arrayList.add(messageObject);
    }
}
