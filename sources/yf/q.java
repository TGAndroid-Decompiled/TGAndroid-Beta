package yf;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.w1;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
public class q {
    public final ArrayList f50154a = new ArrayList();
    public final a0.i f50155b = new a0.i();
    public final a0.i f50156c = new a0.i();

    public static void a(q qVar, TL_ephemeral.EphemeralMessage ephemeralMessage, TLRPC.TL_message tL_message, MessageObject messageObject) {
        a0.i iVar = qVar.f50156c;
        long dialogId = MessageObject.getDialogId(tL_message);
        qVar.f50154a.add(ephemeralMessage);
        a0.i iVar2 = qVar.f50155b;
        TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) iVar2.f(dialogId);
        if (tL_messages_messages == null) {
            tL_messages_messages = new TLRPC.TL_messages_messages();
            iVar2.k(tL_messages_messages, dialogId);
        }
        tL_messages_messages.messages.add(tL_message);
        ArrayList arrayList = (ArrayList) iVar.f(dialogId);
        if (arrayList == null) {
            arrayList = w1.k(dialogId, iVar);
        }
        arrayList.add(messageObject);
    }
}
