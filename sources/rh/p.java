package rh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.a2;
public final class p {
    public final int f46211a;
    public final TLRPC.InputPeer f46212b;
    public final int f46213c;
    public final byte[] d;
    public final a2 e;
    public final Utilities.Callback f46214f;
    public String f46215g;
    public boolean h;
    public boolean f46216i;
    public final ArrayList f46217j = new ArrayList();

    public p(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, a2 a2Var, Utilities.Callback callback) {
        this.f46211a = i10;
        this.f46212b = inputPeer;
        this.f46213c = i11;
        this.d = bArr;
        this.e = a2Var;
        this.f46214f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f46216i) {
            this.f46216i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f46215g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f46212b;
            tL_messages_getPollVotes.f20440id = this.f46213c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f46211a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new j(this, 1));
        }
    }
}
