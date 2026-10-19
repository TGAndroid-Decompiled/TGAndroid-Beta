package rh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.z1;
public final class p {
    public final int f45778a;
    public final TLRPC.InputPeer f45779b;
    public final int f45780c;
    public final byte[] d;
    public final z1 e;
    public final Utilities.Callback f45781f;
    public String f45782g;
    public boolean h;
    public boolean f45783i;
    public final ArrayList f45784j = new ArrayList();

    public p(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, z1 z1Var, Utilities.Callback callback) {
        this.f45778a = i10;
        this.f45779b = inputPeer;
        this.f45780c = i11;
        this.d = bArr;
        this.e = z1Var;
        this.f45781f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f45783i) {
            this.f45783i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f45782g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f45779b;
            tL_messages_getPollVotes.f20370id = this.f45780c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f45778a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new j(this, 1));
        }
    }
}
