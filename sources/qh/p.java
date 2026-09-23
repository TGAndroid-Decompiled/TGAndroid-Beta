package qh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.t0;
public final class p {
    public final int f41748a;
    public final TLRPC.InputPeer f41749b;
    public final int f41750c;
    public final byte[] d;
    public final t0 e;
    public final Utilities.Callback f41751f;
    public String f41752g;
    public boolean h;
    public boolean f41753i;
    public final ArrayList f41754j = new ArrayList();

    public p(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, t0 t0Var, Utilities.Callback callback) {
        this.f41748a = i10;
        this.f41749b = inputPeer;
        this.f41750c = i11;
        this.d = bArr;
        this.e = t0Var;
        this.f41751f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f41753i) {
            this.f41753i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f41752g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f41749b;
            tL_messages_getPollVotes.f18180id = this.f41750c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f41748a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new j(this, 1));
        }
    }
}
