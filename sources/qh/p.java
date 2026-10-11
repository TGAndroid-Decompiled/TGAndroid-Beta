package qh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.t0;
public final class p {
    public final int f46819a;
    public final TLRPC.InputPeer f46820b;
    public final int f46821c;
    public final byte[] d;
    public final t0 f46822e;
    public final Utilities.Callback f46823f;
    public String f46824g;
    public boolean h;
    public boolean f46825i;
    public final ArrayList f46826j = new ArrayList();

    public p(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, t0 t0Var, Utilities.Callback callback) {
        this.f46819a = i10;
        this.f46820b = inputPeer;
        this.f46821c = i11;
        this.d = bArr;
        this.f46822e = t0Var;
        this.f46823f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f46825i) {
            this.f46825i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f46824g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f46820b;
            tL_messages_getPollVotes.f20165id = this.f46821c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f46819a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new j(this, 1));
        }
    }
}
