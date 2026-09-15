package qh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.u0;
public final class p {
    public final int f41796a;
    public final TLRPC.InputPeer f41797b;
    public final int f41798c;
    public final byte[] d;
    public final u0 e;
    public final Utilities.Callback f41799f;
    public String f41800g;
    public boolean h;
    public boolean f41801i;
    public final ArrayList f41802j = new ArrayList();

    public p(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, u0 u0Var, Utilities.Callback callback) {
        this.f41796a = i10;
        this.f41797b = inputPeer;
        this.f41798c = i11;
        this.d = bArr;
        this.e = u0Var;
        this.f41799f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f41801i) {
            this.f41801i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f41800g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f41797b;
            tL_messages_getPollVotes.f18209id = this.f41798c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f41796a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new j(this, 1));
        }
    }
}
