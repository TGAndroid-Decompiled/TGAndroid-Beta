package sh;

import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import sg.t0;
public final class m {
    public final int f55323a;
    public final TLRPC.InputPeer f55324b;
    public final int f55325c;
    public final byte[] d;
    public final t0 f55326e;
    public final c20 f55327f;
    public String f55328g;
    public boolean h;
    public boolean f55329i;
    public final ArrayList f55330j = new ArrayList();

    public m(int i7, TLRPC.InputPeer inputPeer, int i10, byte[] bArr, t0 t0Var, c20 c20Var) {
        this.f55323a = i7;
        this.f55324b = inputPeer;
        this.f55325c = i10;
        this.d = bArr;
        this.f55326e = t0Var;
        this.f55327f = c20Var;
    }

    public final void a() {
        int i7;
        if (!this.h && !this.f55329i) {
            this.f55329i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f55328g;
            if (str != null) {
                i7 = 10;
            } else {
                i7 = 15;
            }
            tL_messages_getPollVotes.limit = i7;
            tL_messages_getPollVotes.peer = this.f55324b;
            tL_messages_getPollVotes.f27055id = this.f55325c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f55323a).sendRequestTyped(tL_messages_getPollVotes, new d3.b(1), new h(this, 1));
        }
    }
}
