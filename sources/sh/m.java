package sh;

import java.util.ArrayList;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.z0;
public final class m {
    public final int f57583a;
    public final TLRPC.InputPeer f57584b;
    public final int f57585c;
    public final byte[] d;
    public final z0 f57586e;
    public final w10 f57587f;
    public String f57588g;
    public boolean h;
    public boolean f57589i;
    public final ArrayList f57590j = new ArrayList();

    public m(int i7, TLRPC.InputPeer inputPeer, int i10, byte[] bArr, z0 z0Var, w10 w10Var) {
        this.f57583a = i7;
        this.f57584b = inputPeer;
        this.f57585c = i10;
        this.d = bArr;
        this.f57586e = z0Var;
        this.f57587f = w10Var;
    }

    public final void a() {
        int i7;
        if (!this.h && !this.f57589i) {
            this.f57589i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f57588g;
            if (str != null) {
                i7 = 10;
            } else {
                i7 = 15;
            }
            tL_messages_getPollVotes.limit = i7;
            tL_messages_getPollVotes.peer = this.f57584b;
            tL_messages_getPollVotes.f28591id = this.f57585c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f57583a).sendRequestTyped(tL_messages_getPollVotes, new d3.b(1), new h(this, 1));
        }
    }
}
