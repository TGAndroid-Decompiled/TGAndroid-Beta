package ph;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.voip.x;
public final class p {
    public final int f40439a;
    public final TLRPC.InputPeer f40440b;
    public final int f40441c;
    public final byte[] d;
    public final x e;
    public final Utilities.Callback f40442f;
    public String f40443g;
    public boolean h;
    public boolean f40444i;
    public final ArrayList f40445j = new ArrayList();

    public p(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, x xVar, Utilities.Callback callback) {
        this.f40439a = i10;
        this.f40440b = inputPeer;
        this.f40441c = i11;
        this.d = bArr;
        this.e = xVar;
        this.f40442f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f40444i) {
            this.f40444i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f40443g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f40440b;
            tL_messages_getPollVotes.f17292id = this.f40441c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f40439a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new j(this, 1));
        }
    }
}
