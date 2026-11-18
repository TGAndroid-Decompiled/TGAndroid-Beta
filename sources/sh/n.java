package sh;

import java.util.ArrayList;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.z0;
public final class n {
    public final int f57464a;
    public final TLRPC.InputPeer f57465b;
    public final int f57466c;
    public final byte[] d;
    public final z0 f57467e;
    public final x10 f57468f;
    public String f57469g;
    public boolean h;
    public boolean f57470i;
    public final ArrayList f57471j = new ArrayList();

    public n(int i7, TLRPC.InputPeer inputPeer, int i10, byte[] bArr, z0 z0Var, x10 x10Var) {
        this.f57464a = i7;
        this.f57465b = inputPeer;
        this.f57466c = i10;
        this.d = bArr;
        this.f57467e = z0Var;
        this.f57468f = x10Var;
    }

    public final void a() {
        int i7;
        if (!this.h && !this.f57470i) {
            this.f57470i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f57469g;
            if (str != null) {
                i7 = 10;
            } else {
                i7 = 15;
            }
            tL_messages_getPollVotes.limit = i7;
            tL_messages_getPollVotes.peer = this.f57465b;
            tL_messages_getPollVotes.f28504id = this.f57466c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f57464a).sendRequestTyped(tL_messages_getPollVotes, new d3.b(1), new i(this, 1));
        }
    }
}
