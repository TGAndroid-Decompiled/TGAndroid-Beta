package rf;

import java.util.ArrayList;
import org.telegram.messenger.kj;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
public class p {
    public final ArrayList f46559a = new ArrayList();
    public final a0.h f46560b = new a0.h();
    public final a0.h f46561c = new a0.h();

    public static void a(p pVar, TL_ephemeral.EphemeralMessage ephemeralMessage, TLRPC.TL_message tL_message, kj kjVar) {
        a0.h hVar = pVar.f46561c;
        long B0 = kj.B0(tL_message);
        pVar.f46559a.add(ephemeralMessage);
        a0.h hVar2 = pVar.f46560b;
        TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) hVar2.f(B0);
        if (tL_messages_messages == null) {
            tL_messages_messages = new TLRPC.TL_messages_messages();
            hVar2.k(tL_messages_messages, B0);
        }
        tL_messages_messages.messages.add(tL_message);
        ArrayList arrayList = (ArrayList) hVar.f(B0);
        if (arrayList == null) {
            arrayList = m5.i(hVar, B0);
        }
        arrayList.add(kjVar);
    }
}
