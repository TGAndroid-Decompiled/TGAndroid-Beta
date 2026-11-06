package sh;

import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import sg.t0;
public final class m {
    public final int f55207a;
    public final TLRPC.InputPeer f55208b;
    public final int f55209c;
    public final byte[] d;
    public final t0 f55210e;
    public final c20 f55211f;
    public String f55212g;
    public boolean h;
    public boolean f55213i;
    public final ArrayList f55214j = new ArrayList();

    public m(int i7, TLRPC.InputPeer inputPeer, int i10, byte[] bArr, t0 t0Var, c20 c20Var) {
        this.f55207a = i7;
        this.f55208b = inputPeer;
        this.f55209c = i10;
        this.d = bArr;
        this.f55210e = t0Var;
        this.f55211f = c20Var;
    }

    public final void a() {
        int i7;
        if (!this.h && !this.f55213i) {
            this.f55213i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f55212g;
            if (str != null) {
                i7 = 10;
            } else {
                i7 = 15;
            }
            tL_messages_getPollVotes.limit = i7;
            tL_messages_getPollVotes.peer = this.f55208b;
            tL_messages_getPollVotes.f27051id = this.f55209c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f55207a).sendRequestTyped(tL_messages_getPollVotes, new d3.b(1), new h(this, 1));
        }
    }
}
