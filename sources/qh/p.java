package qh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.u0;
public final class p {
    public final int f45506a;
    public final TLRPC.InputPeer f45507b;
    public final int f45508c;
    public final byte[] d;
    public final u0 f45509e;
    public final Utilities.Callback f45510f;
    public String f45511g;
    public boolean h;
    public boolean f45512i;
    public final ArrayList f45513j = new ArrayList();

    public p(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, u0 u0Var, Utilities.Callback callback) {
        this.f45506a = i10;
        this.f45507b = inputPeer;
        this.f45508c = i11;
        this.d = bArr;
        this.f45509e = u0Var;
        this.f45510f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f45512i) {
            this.f45512i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f45511g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f45507b;
            tL_messages_getPollVotes.f20144id = this.f45508c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f45506a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new j(this, 1));
        }
    }
}
