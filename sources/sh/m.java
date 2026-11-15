package sh;

import java.util.ArrayList;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class m {
    public final int f56888a;
    public final TLRPC.InputPeer f56889b;
    public final int f56890c;
    public final byte[] d;
    public final q2.d f56891e;
    public final z10 f56892f;
    public String f56893g;
    public boolean h;
    public boolean f56894i;
    public final ArrayList f56895j = new ArrayList();

    public m(int i7, TLRPC.InputPeer inputPeer, int i10, byte[] bArr, q2.d dVar, z10 z10Var) {
        this.f56888a = i7;
        this.f56889b = inputPeer;
        this.f56890c = i10;
        this.d = bArr;
        this.f56891e = dVar;
        this.f56892f = z10Var;
    }

    public final void a() {
        int i7;
        if (!this.h && !this.f56894i) {
            this.f56894i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f56893g;
            if (str != null) {
                i7 = 10;
            } else {
                i7 = 15;
            }
            tL_messages_getPollVotes.limit = i7;
            tL_messages_getPollVotes.peer = this.f56889b;
            tL_messages_getPollVotes.f28150id = this.f56890c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f56888a).sendRequestTyped(tL_messages_getPollVotes, new d3.b(1), new h(this, 1));
        }
    }
}
