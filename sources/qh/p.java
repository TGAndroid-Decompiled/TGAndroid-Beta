package qh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.r0;
public final class p {
    public final int f42116a;
    public final TLRPC.InputPeer f42117b;
    public final int f42118c;
    public final byte[] d;
    public final r0 e;
    public final Utilities.Callback f42119f;
    public String f42120g;
    public boolean h;
    public boolean f42121i;
    public final ArrayList f42122j = new ArrayList();

    public p(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, r0 r0Var, Utilities.Callback callback) {
        this.f42116a = i10;
        this.f42117b = inputPeer;
        this.f42118c = i11;
        this.d = bArr;
        this.e = r0Var;
        this.f42119f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f42121i) {
            this.f42121i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f42120g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f42117b;
            tL_messages_getPollVotes.f18440id = this.f42118c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f42116a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new j(this, 1));
        }
    }
}
