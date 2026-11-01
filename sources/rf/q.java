package rf;

import java.util.AbstractMap;
import java.util.ArrayList;
import org.telegram.messenger.kj;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
public final class q extends p {
    public final void b(int i10, AbstractMap abstractMap, AbstractMap abstractMap2, int i11) {
        ArrayList arrayList = this.f46559a;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            TLRPC.TL_message b10 = s.b((TL_ephemeral.EphemeralMessage) obj);
            int i13 = i10;
            AbstractMap abstractMap3 = abstractMap;
            AbstractMap abstractMap4 = abstractMap2;
            kj kjVar = new kj(i13, (TLRPC.Message) b10, abstractMap3, abstractMap4, true, true);
            long B0 = kj.B0(b10);
            if (i11 != 0) {
                b10.edit_date = i11;
                b10.flags |= 32768;
            }
            a0.h hVar = this.f46560b;
            TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) hVar.f(B0);
            if (tL_messages_messages == null) {
                tL_messages_messages = new TLRPC.TL_messages_messages();
                hVar.k(tL_messages_messages, B0);
            }
            tL_messages_messages.messages.add(b10);
            a0.h hVar2 = this.f46561c;
            ArrayList arrayList2 = (ArrayList) hVar2.f(B0);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                hVar2.k(arrayList2, B0);
            }
            arrayList2.add(kjVar);
            i10 = i13;
            abstractMap = abstractMap3;
            abstractMap2 = abstractMap4;
        }
    }
}
