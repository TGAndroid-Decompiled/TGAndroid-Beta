package qh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.q0;
public final class p {
    public final int f42080a;
    public final TLRPC.InputPeer f42081b;
    public final int f42082c;
    public final byte[] d;
    public final q0 e;
    public final Utilities.Callback f42083f;
    public String f42084g;
    public boolean h;
    public boolean f42085i;
    public final ArrayList f42086j = new ArrayList();

    public p(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, q0 q0Var, Utilities.Callback callback) {
        this.f42080a = i10;
        this.f42081b = inputPeer;
        this.f42082c = i11;
        this.d = bArr;
        this.e = q0Var;
        this.f42083f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f42085i) {
            this.f42085i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f42084g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f42081b;
            tL_messages_getPollVotes.f18432id = this.f42082c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f42080a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new j(this, 1));
        }
    }
}
