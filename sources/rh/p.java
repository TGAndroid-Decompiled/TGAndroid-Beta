package rh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class p {
    public final int f45651a;
    public final TLRPC.InputPeer f45652b;
    public final int f45653c;
    public final byte[] d;
    public final org.telegram.ui.web.b f45654e;
    public final Utilities.Callback f45655f;
    public String f45656g;
    public boolean h;
    public boolean f45657i;
    public final ArrayList f45658j = new ArrayList();

    public p(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, org.telegram.ui.web.b bVar, Utilities.Callback callback) {
        this.f45651a = i10;
        this.f45652b = inputPeer;
        this.f45653c = i11;
        this.d = bArr;
        this.f45654e = bVar;
        this.f45655f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f45657i) {
            this.f45657i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f45656g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f45652b;
            tL_messages_getPollVotes.f19966id = this.f45653c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f45651a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new j(this, 1));
        }
    }
}
