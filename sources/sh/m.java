package sh;

import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import sg.t0;
public final class m {
    public final int f55232a;
    public final TLRPC.InputPeer f55233b;
    public final int f55234c;
    public final byte[] d;
    public final t0 f55235e;
    public final c20 f55236f;
    public String f55237g;
    public boolean h;
    public boolean f55238i;
    public final ArrayList f55239j = new ArrayList();

    public m(int i7, TLRPC.InputPeer inputPeer, int i10, byte[] bArr, t0 t0Var, c20 c20Var) {
        this.f55232a = i7;
        this.f55233b = inputPeer;
        this.f55234c = i10;
        this.d = bArr;
        this.f55235e = t0Var;
        this.f55236f = c20Var;
    }

    public final void a() {
        int i7;
        if (!this.h && !this.f55238i) {
            this.f55238i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f55237g;
            if (str != null) {
                i7 = 10;
            } else {
                i7 = 15;
            }
            tL_messages_getPollVotes.limit = i7;
            tL_messages_getPollVotes.peer = this.f55233b;
            tL_messages_getPollVotes.f27051id = this.f55234c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f55232a).sendRequestTyped(tL_messages_getPollVotes, new d3.b(1), new h(this, 1));
        }
    }
}
