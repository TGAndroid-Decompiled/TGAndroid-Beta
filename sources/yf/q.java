package yf;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
public class q {
    public final ArrayList f47115a = new ArrayList();
    public final a0.i f47116b = new a0.i();
    public final a0.i f47117c = new a0.i();

    public static void a(q qVar, TL_ephemeral.EphemeralMessage ephemeralMessage, TLRPC.TL_message tL_message, MessageObject messageObject) {
        a0.i iVar = qVar.f47117c;
        long dialogId = MessageObject.getDialogId(tL_message);
        qVar.f47115a.add(ephemeralMessage);
        a0.i iVar2 = qVar.f47116b;
        TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) iVar2.f(dialogId);
        if (tL_messages_messages == null) {
            tL_messages_messages = new TLRPC.TL_messages_messages();
            iVar2.k(tL_messages_messages, dialogId);
        }
        tL_messages_messages.messages.add(tL_message);
        ArrayList arrayList = (ArrayList) iVar.f(dialogId);
        if (arrayList == null) {
            arrayList = org.telegram.messenger.f0.j(dialogId, iVar);
        }
        arrayList.add(messageObject);
    }
}
