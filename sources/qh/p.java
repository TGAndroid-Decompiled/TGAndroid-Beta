package qh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.u0;
public final class p {
    public final int f45492a;
    public final TLRPC.InputPeer f45493b;
    public final int f45494c;
    public final byte[] d;
    public final u0 f45495e;
    public final Utilities.Callback f45496f;
    public String f45497g;
    public boolean h;
    public boolean f45498i;
    public final ArrayList f45499j = new ArrayList();

    public p(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, u0 u0Var, Utilities.Callback callback) {
        this.f45492a = i10;
        this.f45493b = inputPeer;
        this.f45494c = i11;
        this.d = bArr;
        this.f45495e = u0Var;
        this.f45496f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f45498i) {
            this.f45498i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f45497g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f45493b;
            tL_messages_getPollVotes.f20135id = this.f45494c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f45492a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new j(this, 1));
        }
    }
}
