package zg;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

public final class q {

    public final int f50849a;

    public final TLRPC.InputPeer f50850b;

    public final int f50851c;
    public final byte[] d;

    public final j f50852e;

    public final Utilities.Callback f50853f;

    public String f50854g;
    public boolean h;

    public boolean f50855i;

    public final ArrayList f50856j = new ArrayList();

    public q(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, j jVar, Utilities.Callback callback) {
        this.f50849a = i10;
        this.f50850b = inputPeer;
        this.f50851c = i11;
        this.d = bArr;
        this.f50852e = jVar;
        this.f50853f = callback;
    }

    public final void a() {
        if (this.h || this.f50855i) {
            return;
        }
        this.f50855i = true;
        TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
        String str = this.f50854g;
        tL_messages_getPollVotes.limit = str != null ? 10 : 15;
        tL_messages_getPollVotes.peer = this.f50850b;
        tL_messages_getPollVotes.f22477id = this.f50851c;
        tL_messages_getPollVotes.option = this.d;
        tL_messages_getPollVotes.offset = str;
        ConnectionsManager.getInstance(this.f50849a).sendRequestTyped(tL_messages_getPollVotes, new org.telegram.messenger.a(), new k(this, 1));
    }
}
