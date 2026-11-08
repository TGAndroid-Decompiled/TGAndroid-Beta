package sh;

import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import sg.t0;
public final class m {
    public final int f55324a;
    public final TLRPC.InputPeer f55325b;
    public final int f55326c;
    public final byte[] d;
    public final t0 f55327e;
    public final c20 f55328f;
    public String f55329g;
    public boolean h;
    public boolean f55330i;
    public final ArrayList f55331j = new ArrayList();

    public m(int i7, TLRPC.InputPeer inputPeer, int i10, byte[] bArr, t0 t0Var, c20 c20Var) {
        this.f55324a = i7;
        this.f55325b = inputPeer;
        this.f55326c = i10;
        this.d = bArr;
        this.f55327e = t0Var;
        this.f55328f = c20Var;
    }

    public final void a() {
        int i7;
        if (!this.h && !this.f55330i) {
            this.f55330i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f55329g;
            if (str != null) {
                i7 = 10;
            } else {
                i7 = 15;
            }
            tL_messages_getPollVotes.limit = i7;
            tL_messages_getPollVotes.peer = this.f55325b;
            tL_messages_getPollVotes.f27055id = this.f55326c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f55324a).sendRequestTyped(tL_messages_getPollVotes, new d3.b(1), new h(this, 1));
        }
    }
}
