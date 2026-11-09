package sh;

import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class n {
    public final int f55336a;
    public final TLRPC.InputPeer f55337b;
    public final int f55338c;
    public final byte[] d;
    public final b f55339e;
    public final c20 f55340f;
    public String f55341g;
    public boolean h;
    public boolean f55342i;
    public final ArrayList f55343j = new ArrayList();

    public n(int i7, TLRPC.InputPeer inputPeer, int i10, byte[] bArr, b bVar, c20 c20Var) {
        this.f55336a = i7;
        this.f55337b = inputPeer;
        this.f55338c = i10;
        this.d = bArr;
        this.f55339e = bVar;
        this.f55340f = c20Var;
    }

    public final void a() {
        int i7;
        if (!this.h && !this.f55342i) {
            this.f55342i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f55341g;
            if (str != null) {
                i7 = 10;
            } else {
                i7 = 15;
            }
            tL_messages_getPollVotes.limit = i7;
            tL_messages_getPollVotes.peer = this.f55337b;
            tL_messages_getPollVotes.f27055id = this.f55338c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f55336a).sendRequestTyped(tL_messages_getPollVotes, new d3.b(1), new i(this, 1));
        }
    }
}
