package rh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.a2;
public final class p {
    public final int f46210a;
    public final TLRPC.InputPeer f46211b;
    public final int f46212c;
    public final byte[] d;
    public final a2 e;
    public final Utilities.Callback f46213f;
    public String f46214g;
    public boolean h;
    public boolean f46215i;
    public final ArrayList f46216j = new ArrayList();

    public p(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, a2 a2Var, Utilities.Callback callback) {
        this.f46210a = i10;
        this.f46211b = inputPeer;
        this.f46212c = i11;
        this.d = bArr;
        this.e = a2Var;
        this.f46213f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f46215i) {
            this.f46215i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f46214g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f46211b;
            tL_messages_getPollVotes.f20441id = this.f46212c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f46210a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new j(this, 1));
        }
    }
}
