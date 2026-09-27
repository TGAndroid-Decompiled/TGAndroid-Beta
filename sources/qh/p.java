package qh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.u0;
public final class p {
    public final int f42111a;
    public final TLRPC.InputPeer f42112b;
    public final int f42113c;
    public final byte[] d;
    public final u0 e;
    public final Utilities.Callback f42114f;
    public String f42115g;
    public boolean h;
    public boolean f42116i;
    public final ArrayList f42117j = new ArrayList();

    public p(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, u0 u0Var, Utilities.Callback callback) {
        this.f42111a = i10;
        this.f42112b = inputPeer;
        this.f42113c = i11;
        this.d = bArr;
        this.e = u0Var;
        this.f42114f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f42116i) {
            this.f42116i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f42115g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f42112b;
            tL_messages_getPollVotes.f18426id = this.f42113c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f42111a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new j(this, 1));
        }
    }
}
