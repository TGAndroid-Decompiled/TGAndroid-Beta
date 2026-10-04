package qh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.u0;
public final class p {
    public final int f45491a;
    public final TLRPC.InputPeer f45492b;
    public final int f45493c;
    public final byte[] d;
    public final u0 f45494e;
    public final Utilities.Callback f45495f;
    public String f45496g;
    public boolean h;
    public boolean f45497i;
    public final ArrayList f45498j = new ArrayList();

    public p(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, u0 u0Var, Utilities.Callback callback) {
        this.f45491a = i10;
        this.f45492b = inputPeer;
        this.f45493c = i11;
        this.d = bArr;
        this.f45494e = u0Var;
        this.f45495f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f45497i) {
            this.f45497i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f45496g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f45492b;
            tL_messages_getPollVotes.f20134id = this.f45493c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f45491a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new j(this, 1));
        }
    }
}
