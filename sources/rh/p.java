package rh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class p {
    public final int f45679a;
    public final TLRPC.InputPeer f45680b;
    public final int f45681c;
    public final byte[] d;
    public final org.telegram.ui.web.b f45682e;
    public final Utilities.Callback f45683f;
    public String f45684g;
    public boolean h;
    public boolean f45685i;
    public final ArrayList f45686j = new ArrayList();

    public p(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, org.telegram.ui.web.b bVar, Utilities.Callback callback) {
        this.f45679a = i10;
        this.f45680b = inputPeer;
        this.f45681c = i11;
        this.d = bArr;
        this.f45682e = bVar;
        this.f45683f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f45685i) {
            this.f45685i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f45684g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f45680b;
            tL_messages_getPollVotes.f19993id = this.f45681c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f45679a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new j(this, 1));
        }
    }
}
