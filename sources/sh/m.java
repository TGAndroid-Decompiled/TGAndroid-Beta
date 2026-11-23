package sh;

import java.util.ArrayList;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.i1;
public final class m {
    public final int f57472a;
    public final TLRPC.InputPeer f57473b;
    public final int f57474c;
    public final byte[] d;
    public final i1 f57475e;
    public final y10 f57476f;
    public String f57477g;
    public boolean h;
    public boolean f57478i;
    public final ArrayList f57479j = new ArrayList();

    public m(int i7, TLRPC.InputPeer inputPeer, int i10, byte[] bArr, i1 i1Var, y10 y10Var) {
        this.f57472a = i7;
        this.f57473b = inputPeer;
        this.f57474c = i10;
        this.d = bArr;
        this.f57475e = i1Var;
        this.f57476f = y10Var;
    }

    public final void a() {
        int i7;
        if (!this.h && !this.f57478i) {
            this.f57478i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f57477g;
            if (str != null) {
                i7 = 10;
            } else {
                i7 = 15;
            }
            tL_messages_getPollVotes.limit = i7;
            tL_messages_getPollVotes.peer = this.f57473b;
            tL_messages_getPollVotes.f28497id = this.f57474c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f57472a).sendRequestTyped(tL_messages_getPollVotes, new d3.b(1), new h(this, 1));
        }
    }
}
