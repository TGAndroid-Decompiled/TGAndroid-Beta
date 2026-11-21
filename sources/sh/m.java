package sh;

import java.util.ArrayList;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.z0;
public final class m {
    public final int f57503a;
    public final TLRPC.InputPeer f57504b;
    public final int f57505c;
    public final byte[] d;
    public final z0 f57506e;
    public final x10 f57507f;
    public String f57508g;
    public boolean h;
    public boolean f57509i;
    public final ArrayList f57510j = new ArrayList();

    public m(int i7, TLRPC.InputPeer inputPeer, int i10, byte[] bArr, z0 z0Var, x10 x10Var) {
        this.f57503a = i7;
        this.f57504b = inputPeer;
        this.f57505c = i10;
        this.d = bArr;
        this.f57506e = z0Var;
        this.f57507f = x10Var;
    }

    public final void a() {
        int i7;
        if (!this.h && !this.f57509i) {
            this.f57509i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f57508g;
            if (str != null) {
                i7 = 10;
            } else {
                i7 = 15;
            }
            tL_messages_getPollVotes.limit = i7;
            tL_messages_getPollVotes.peer = this.f57504b;
            tL_messages_getPollVotes.f28530id = this.f57505c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f57503a).sendRequestTyped(tL_messages_getPollVotes, new d3.b(1), new h(this, 1));
        }
    }
}
