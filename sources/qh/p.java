package qh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.u0;
public final class p {
    public final int f45499a;
    public final TLRPC.InputPeer f45500b;
    public final int f45501c;
    public final byte[] d;
    public final u0 f45502e;
    public final Utilities.Callback f45503f;
    public String f45504g;
    public boolean h;
    public boolean f45505i;
    public final ArrayList f45506j = new ArrayList();

    public p(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, u0 u0Var, Utilities.Callback callback) {
        this.f45499a = i10;
        this.f45500b = inputPeer;
        this.f45501c = i11;
        this.d = bArr;
        this.f45502e = u0Var;
        this.f45503f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f45505i) {
            this.f45505i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f45504g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f45500b;
            tL_messages_getPollVotes.f20139id = this.f45501c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f45499a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new j(this, 1));
        }
    }
}
