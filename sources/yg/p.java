package yg;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import pf.o1;
public final class p {
    public final int f50251a;
    public final TLRPC.InputPeer f50252b;
    public final int f50253c;
    public final byte[] d;
    public final o1 f50254e;
    public final Utilities.Callback f50255f;
    public String f50256g;
    public boolean h;
    public boolean f50257i;
    public final ArrayList f50258j = new ArrayList();

    public p(int i9, TLRPC.InputPeer inputPeer, int i10, byte[] bArr, o1 o1Var, Utilities.Callback callback) {
        this.f50251a = i9;
        this.f50252b = inputPeer;
        this.f50253c = i10;
        this.d = bArr;
        this.f50254e = o1Var;
        this.f50255f = callback;
    }

    public final void a() {
        int i9;
        if (!this.h && !this.f50257i) {
            this.f50257i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f50256g;
            if (str != null) {
                i9 = 10;
            } else {
                i9 = 15;
            }
            tL_messages_getPollVotes.limit = i9;
            tL_messages_getPollVotes.peer = this.f50252b;
            tL_messages_getPollVotes.f22477id = this.f50253c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f50251a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new j(this, 1));
        }
    }
}
