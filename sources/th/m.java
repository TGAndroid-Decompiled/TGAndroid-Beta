package th;

import java.util.ArrayList;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import r4.u;
public final class m {
    public final int f55429a;
    public final TLRPC.InputPeer f55430b;
    public final int f55431c;
    public final byte[] d;
    public final u f55432e;
    public final u10 f55433f;
    public String f55434g;
    public boolean h;
    public boolean f55435i;
    public final ArrayList f55436j = new ArrayList();

    public m(int i3, TLRPC.InputPeer inputPeer, int i10, byte[] bArr, u uVar, u10 u10Var) {
        this.f55429a = i3;
        this.f55430b = inputPeer;
        this.f55431c = i10;
        this.d = bArr;
        this.f55432e = uVar;
        this.f55433f = u10Var;
    }

    public final void a() {
        int i3;
        if (!this.h && !this.f55435i) {
            this.f55435i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f55434g;
            if (str != null) {
                i3 = 10;
            } else {
                i3 = 15;
            }
            tL_messages_getPollVotes.limit = i3;
            tL_messages_getPollVotes.peer = this.f55430b;
            tL_messages_getPollVotes.f27100id = this.f55431c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f55429a).sendRequestTyped(tL_messages_getPollVotes, new c3.b(1), new h(this, 1));
        }
    }
}
