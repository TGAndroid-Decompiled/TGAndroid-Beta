package qh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.u0;
public final class p {
    public final int f42050a;
    public final TLRPC.InputPeer f42051b;
    public final int f42052c;
    public final byte[] d;
    public final u0 e;
    public final Utilities.Callback f42053f;
    public String f42054g;
    public boolean h;
    public boolean f42055i;
    public final ArrayList f42056j = new ArrayList();

    public p(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, u0 u0Var, Utilities.Callback callback) {
        this.f42050a = i10;
        this.f42051b = inputPeer;
        this.f42052c = i11;
        this.d = bArr;
        this.e = u0Var;
        this.f42053f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f42055i) {
            this.f42055i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f42054g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f42051b;
            tL_messages_getPollVotes.f18393id = this.f42052c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f42050a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new j(this, 1));
        }
    }
}
