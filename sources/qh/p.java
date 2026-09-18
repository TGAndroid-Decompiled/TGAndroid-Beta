package qh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.u0;
public final class p {
    public final int f41823a;
    public final TLRPC.InputPeer f41824b;
    public final int f41825c;
    public final byte[] d;
    public final u0 e;
    public final Utilities.Callback f41826f;
    public String f41827g;
    public boolean h;
    public boolean f41828i;
    public final ArrayList f41829j = new ArrayList();

    public p(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, u0 u0Var, Utilities.Callback callback) {
        this.f41823a = i10;
        this.f41824b = inputPeer;
        this.f41825c = i11;
        this.d = bArr;
        this.e = u0Var;
        this.f41826f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f41828i) {
            this.f41828i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f41827g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f41824b;
            tL_messages_getPollVotes.f18218id = this.f41825c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f41823a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new j(this, 1));
        }
    }
}
