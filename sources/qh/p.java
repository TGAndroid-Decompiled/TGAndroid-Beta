package qh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.r0;
public final class p {
    public final int f42095a;
    public final TLRPC.InputPeer f42096b;
    public final int f42097c;
    public final byte[] d;
    public final r0 e;
    public final Utilities.Callback f42098f;
    public String f42099g;
    public boolean h;
    public boolean f42100i;
    public final ArrayList f42101j = new ArrayList();

    public p(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, r0 r0Var, Utilities.Callback callback) {
        this.f42095a = i10;
        this.f42096b = inputPeer;
        this.f42097c = i11;
        this.d = bArr;
        this.e = r0Var;
        this.f42098f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f42100i) {
            this.f42100i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f42099g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f42096b;
            tL_messages_getPollVotes.f18425id = this.f42097c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f42095a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new j(this, 1));
        }
    }
}
