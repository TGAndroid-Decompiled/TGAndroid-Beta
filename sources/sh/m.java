package sh;

import java.util.ArrayList;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.z0;
public final class m {
    public final int f57507a;
    public final TLRPC.InputPeer f57508b;
    public final int f57509c;
    public final byte[] d;
    public final z0 f57510e;
    public final y10 f57511f;
    public String f57512g;
    public boolean h;
    public boolean f57513i;
    public final ArrayList f57514j = new ArrayList();

    public m(int i7, TLRPC.InputPeer inputPeer, int i10, byte[] bArr, z0 z0Var, y10 y10Var) {
        this.f57507a = i7;
        this.f57508b = inputPeer;
        this.f57509c = i10;
        this.d = bArr;
        this.f57510e = z0Var;
        this.f57511f = y10Var;
    }

    public final void a() {
        int i7;
        if (!this.h && !this.f57513i) {
            this.f57513i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f57512g;
            if (str != null) {
                i7 = 10;
            } else {
                i7 = 15;
            }
            tL_messages_getPollVotes.limit = i7;
            tL_messages_getPollVotes.peer = this.f57508b;
            tL_messages_getPollVotes.f28533id = this.f57509c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f57507a).sendRequestTyped(tL_messages_getPollVotes, new d3.b(1), new h(this, 1));
        }
    }
}
