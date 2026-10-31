package rf;

import java.util.ArrayList;
import org.telegram.messenger.jj;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
public class p {
    public final ArrayList f46548a = new ArrayList();
    public final a0.h f46549b = new a0.h();
    public final a0.h f46550c = new a0.h();

    public static void a(p pVar, TL_ephemeral.EphemeralMessage ephemeralMessage, TLRPC.TL_message tL_message, jj jjVar) {
        a0.h hVar = pVar.f46550c;
        long B0 = jj.B0(tL_message);
        pVar.f46548a.add(ephemeralMessage);
        a0.h hVar2 = pVar.f46549b;
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
        arrayList.add(jjVar);
    }
}
