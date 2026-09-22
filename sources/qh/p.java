package qh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.u0;
public final class p {
    public final int f41792a;
    public final TLRPC.InputPeer f41793b;
    public final int f41794c;
    public final byte[] d;
    public final u0 e;
    public final Utilities.Callback f41795f;
    public String f41796g;
    public boolean h;
    public boolean f41797i;
    public final ArrayList f41798j = new ArrayList();

    public p(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, u0 u0Var, Utilities.Callback callback) {
        this.f41792a = i10;
        this.f41793b = inputPeer;
        this.f41794c = i11;
        this.d = bArr;
        this.e = u0Var;
        this.f41795f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f41797i) {
            this.f41797i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f41796g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f41793b;
            tL_messages_getPollVotes.f18206id = this.f41794c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f41792a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new j(this, 1));
        }
    }
}
