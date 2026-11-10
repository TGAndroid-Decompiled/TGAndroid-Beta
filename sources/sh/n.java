package sh;

import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class n {
    public final int f55335a;
    public final TLRPC.InputPeer f55336b;
    public final int f55337c;
    public final byte[] d;
    public final b f55338e;
    public final c20 f55339f;
    public String f55340g;
    public boolean h;
    public boolean f55341i;
    public final ArrayList f55342j = new ArrayList();

    public n(int i7, TLRPC.InputPeer inputPeer, int i10, byte[] bArr, b bVar, c20 c20Var) {
        this.f55335a = i7;
        this.f55336b = inputPeer;
        this.f55337c = i10;
        this.d = bArr;
        this.f55338e = bVar;
        this.f55339f = c20Var;
    }

    public final void a() {
        int i7;
        if (!this.h && !this.f55341i) {
            this.f55341i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f55340g;
            if (str != null) {
                i7 = 10;
            } else {
                i7 = 15;
            }
            tL_messages_getPollVotes.limit = i7;
            tL_messages_getPollVotes.peer = this.f55336b;
            tL_messages_getPollVotes.f27059id = this.f55337c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f55335a).sendRequestTyped(tL_messages_getPollVotes, new d3.b(1), new i(this, 1));
        }
    }
}
