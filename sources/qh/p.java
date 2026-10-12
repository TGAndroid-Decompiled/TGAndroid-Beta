package qh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.t0;
public final class p {
    public final int f46655a;
    public final TLRPC.InputPeer f46656b;
    public final int f46657c;
    public final byte[] d;
    public final t0 f46658e;
    public final Utilities.Callback f46659f;
    public String f46660g;
    public boolean h;
    public boolean f46661i;
    public final ArrayList f46662j = new ArrayList();

    public p(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, t0 t0Var, Utilities.Callback callback) {
        this.f46655a = i10;
        this.f46656b = inputPeer;
        this.f46657c = i11;
        this.d = bArr;
        this.f46658e = t0Var;
        this.f46659f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f46661i) {
            this.f46661i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f46660g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f46656b;
            tL_messages_getPollVotes.f19900id = this.f46657c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f46655a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new j(this, 1));
        }
    }
}
