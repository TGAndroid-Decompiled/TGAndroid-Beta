package sh;

import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import sg.t0;
public final class m {
    public final int f55231a;
    public final TLRPC.InputPeer f55232b;
    public final int f55233c;
    public final byte[] d;
    public final t0 f55234e;
    public final c20 f55235f;
    public String f55236g;
    public boolean h;
    public boolean f55237i;
    public final ArrayList f55238j = new ArrayList();

    public m(int i7, TLRPC.InputPeer inputPeer, int i10, byte[] bArr, t0 t0Var, c20 c20Var) {
        this.f55231a = i7;
        this.f55232b = inputPeer;
        this.f55233c = i10;
        this.d = bArr;
        this.f55234e = t0Var;
        this.f55235f = c20Var;
    }

    public final void a() {
        int i7;
        if (!this.h && !this.f55237i) {
            this.f55237i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f55236g;
            if (str != null) {
                i7 = 10;
            } else {
                i7 = 15;
            }
            tL_messages_getPollVotes.limit = i7;
            tL_messages_getPollVotes.peer = this.f55232b;
            tL_messages_getPollVotes.f27052id = this.f55233c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f55231a).sendRequestTyped(tL_messages_getPollVotes, new d3.b(1), new h(this, 1));
        }
    }
}
