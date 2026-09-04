package rh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class p {
    public final int f45650a;
    public final TLRPC.InputPeer f45651b;
    public final int f45652c;
    public final byte[] d;
    public final org.telegram.ui.web.b f45653e;
    public final Utilities.Callback f45654f;
    public String f45655g;
    public boolean h;
    public boolean f45656i;
    public final ArrayList f45657j = new ArrayList();

    public p(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, org.telegram.ui.web.b bVar, Utilities.Callback callback) {
        this.f45650a = i10;
        this.f45651b = inputPeer;
        this.f45652c = i11;
        this.d = bArr;
        this.f45653e = bVar;
        this.f45654f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f45656i) {
            this.f45656i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f45655g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f45651b;
            tL_messages_getPollVotes.f19966id = this.f45652c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f45650a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new j(this, 1));
        }
    }
}
