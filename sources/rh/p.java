package rh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.a2;
public final class p {
    public final int f45776a;
    public final TLRPC.InputPeer f45777b;
    public final int f45778c;
    public final byte[] d;
    public final a2 e;
    public final Utilities.Callback f45779f;
    public String f45780g;
    public boolean h;
    public boolean f45781i;
    public final ArrayList f45782j = new ArrayList();

    public p(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, a2 a2Var, Utilities.Callback callback) {
        this.f45776a = i10;
        this.f45777b = inputPeer;
        this.f45778c = i11;
        this.d = bArr;
        this.e = a2Var;
        this.f45779f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f45781i) {
            this.f45781i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f45780g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f45777b;
            tL_messages_getPollVotes.f20369id = this.f45778c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f45776a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new j(this, 1));
        }
    }
}
