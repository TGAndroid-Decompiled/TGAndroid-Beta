package qh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.t0;
public final class p {
    public final int f46785a;
    public final TLRPC.InputPeer f46786b;
    public final int f46787c;
    public final byte[] d;
    public final t0 f46788e;
    public final Utilities.Callback f46789f;
    public String f46790g;
    public boolean h;
    public boolean f46791i;
    public final ArrayList f46792j = new ArrayList();

    public p(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, t0 t0Var, Utilities.Callback callback) {
        this.f46785a = i10;
        this.f46786b = inputPeer;
        this.f46787c = i11;
        this.d = bArr;
        this.f46788e = t0Var;
        this.f46789f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f46791i) {
            this.f46791i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f46790g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f46786b;
            tL_messages_getPollVotes.f20129id = this.f46787c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f46785a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new j(this, 1));
        }
    }
}
