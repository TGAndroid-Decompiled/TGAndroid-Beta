package sh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.h1;
public final class p {
    public final int f48659a;
    public final TLRPC.InputPeer f48660b;
    public final int f48661c;
    public final byte[] d;
    public final h1 e;
    public final Utilities.Callback f48662f;
    public String f48663g;
    public boolean h;
    public boolean f48664i;
    public final ArrayList f48665j = new ArrayList();

    public p(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, h1 h1Var, Utilities.Callback callback) {
        this.f48659a = i10;
        this.f48660b = inputPeer;
        this.f48661c = i11;
        this.d = bArr;
        this.e = h1Var;
        this.f48662f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f48664i) {
            this.f48664i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f48663g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f48660b;
            tL_messages_getPollVotes.f22124id = this.f48661c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f48659a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new j(this, 1));
        }
    }
}
