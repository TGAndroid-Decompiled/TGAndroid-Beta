package sh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.h1;
public final class p {
    public final int f48662a;
    public final TLRPC.InputPeer f48663b;
    public final int f48664c;
    public final byte[] d;
    public final h1 e;
    public final Utilities.Callback f48665f;
    public String f48666g;
    public boolean h;
    public boolean f48667i;
    public final ArrayList f48668j = new ArrayList();

    public p(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, h1 h1Var, Utilities.Callback callback) {
        this.f48662a = i10;
        this.f48663b = inputPeer;
        this.f48664c = i11;
        this.d = bArr;
        this.e = h1Var;
        this.f48665f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f48667i) {
            this.f48667i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f48666g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f48663b;
            tL_messages_getPollVotes.f22126id = this.f48664c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f48662a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new j(this, 1));
        }
    }
}
