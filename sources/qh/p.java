package qh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.q0;
public final class p {
    public final int f46754a;
    public final TLRPC.InputPeer f46755b;
    public final int f46756c;
    public final byte[] d;
    public final q0 f46757e;
    public final Utilities.Callback f46758f;
    public String f46759g;
    public boolean h;
    public boolean f46760i;
    public final ArrayList f46761j = new ArrayList();

    public p(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, q0 q0Var, Utilities.Callback callback) {
        this.f46754a = i10;
        this.f46755b = inputPeer;
        this.f46756c = i11;
        this.d = bArr;
        this.f46757e = q0Var;
        this.f46758f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f46760i) {
            this.f46760i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f46759g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f46755b;
            tL_messages_getPollVotes.f20139id = this.f46756c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f46754a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new j(this, 1));
        }
    }
}
