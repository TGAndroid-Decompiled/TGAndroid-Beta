package rh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.z1;
public final class p {
    public final int f45790a;
    public final TLRPC.InputPeer f45791b;
    public final int f45792c;
    public final byte[] d;
    public final z1 e;
    public final Utilities.Callback f45793f;
    public String f45794g;
    public boolean h;
    public boolean f45795i;
    public final ArrayList f45796j = new ArrayList();

    public p(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, z1 z1Var, Utilities.Callback callback) {
        this.f45790a = i10;
        this.f45791b = inputPeer;
        this.f45792c = i11;
        this.d = bArr;
        this.e = z1Var;
        this.f45793f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f45795i) {
            this.f45795i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f45794g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f45791b;
            tL_messages_getPollVotes.f20377id = this.f45792c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f45790a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new j(this, 1));
        }
    }
}
