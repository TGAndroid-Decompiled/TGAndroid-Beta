package qh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.q0;
public final class p {
    public final int f46708a;
    public final TLRPC.InputPeer f46709b;
    public final int f46710c;
    public final byte[] d;
    public final q0 f46711e;
    public final Utilities.Callback f46712f;
    public String f46713g;
    public boolean h;
    public boolean f46714i;
    public final ArrayList f46715j = new ArrayList();

    public p(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, q0 q0Var, Utilities.Callback callback) {
        this.f46708a = i10;
        this.f46709b = inputPeer;
        this.f46710c = i11;
        this.d = bArr;
        this.f46711e = q0Var;
        this.f46712f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f46714i) {
            this.f46714i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f46713g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f46709b;
            tL_messages_getPollVotes.f20135id = this.f46710c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f46708a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new j(this, 1));
        }
    }
}
