package qh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.t0;
public final class p {
    public final int f46647a;
    public final TLRPC.InputPeer f46648b;
    public final int f46649c;
    public final byte[] d;
    public final t0 f46650e;
    public final Utilities.Callback f46651f;
    public String f46652g;
    public boolean h;
    public boolean f46653i;
    public final ArrayList f46654j = new ArrayList();

    public p(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, t0 t0Var, Utilities.Callback callback) {
        this.f46647a = i10;
        this.f46648b = inputPeer;
        this.f46649c = i11;
        this.d = bArr;
        this.f46650e = t0Var;
        this.f46651f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f46653i) {
            this.f46653i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f46652g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f46648b;
            tL_messages_getPollVotes.f19899id = this.f46649c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f46647a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new j(this, 1));
        }
    }
}
