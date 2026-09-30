package qh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.q0;
public final class p {
    public final int f42186a;
    public final TLRPC.InputPeer f42187b;
    public final int f42188c;
    public final byte[] d;
    public final q0 e;
    public final Utilities.Callback f42189f;
    public String f42190g;
    public boolean h;
    public boolean f42191i;
    public final ArrayList f42192j = new ArrayList();

    public p(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, q0 q0Var, Utilities.Callback callback) {
        this.f42186a = i10;
        this.f42187b = inputPeer;
        this.f42188c = i11;
        this.d = bArr;
        this.e = q0Var;
        this.f42189f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f42191i) {
            this.f42191i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f42190g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f42187b;
            tL_messages_getPollVotes.f18449id = this.f42188c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f42186a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new j(this, 1));
        }
    }
}
