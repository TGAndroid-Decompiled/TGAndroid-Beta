package rh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.voip.m2;
public final class q {
    public final int f44698a;
    public final TLRPC.InputPeer f44699b;
    public final int f44700c;
    public final byte[] d;
    public final m2 e;
    public final Utilities.Callback f44701f;
    public String f44702g;
    public boolean h;
    public boolean f44703i;
    public final ArrayList f44704j = new ArrayList();

    public q(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, m2 m2Var, Utilities.Callback callback) {
        this.f44698a = i10;
        this.f44699b = inputPeer;
        this.f44700c = i11;
        this.d = bArr;
        this.e = m2Var;
        this.f44701f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f44703i) {
            this.f44703i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f44702g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f44699b;
            tL_messages_getPollVotes.f19313id = this.f44700c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f44698a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new k(this, 1));
        }
    }
}
