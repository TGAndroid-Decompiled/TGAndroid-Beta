package rh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class p {
    public final int f45678a;
    public final TLRPC.InputPeer f45679b;
    public final int f45680c;
    public final byte[] d;
    public final org.telegram.ui.web.b f45681e;
    public final Utilities.Callback f45682f;
    public String f45683g;
    public boolean h;
    public boolean f45684i;
    public final ArrayList f45685j = new ArrayList();

    public p(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, org.telegram.ui.web.b bVar, Utilities.Callback callback) {
        this.f45678a = i10;
        this.f45679b = inputPeer;
        this.f45680c = i11;
        this.d = bArr;
        this.f45681e = bVar;
        this.f45682f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f45684i) {
            this.f45684i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f45683g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f45679b;
            tL_messages_getPollVotes.f19993id = this.f45680c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f45678a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new j(this, 1));
        }
    }
}
