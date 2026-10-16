package rh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.voip.r2;
public final class p {
    public final int f44455a;
    public final TLRPC.InputPeer f44456b;
    public final int f44457c;
    public final byte[] d;
    public final r2 e;
    public final Utilities.Callback f44458f;
    public String f44459g;
    public boolean h;
    public boolean f44460i;
    public final ArrayList f44461j = new ArrayList();

    public p(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, r2 r2Var, Utilities.Callback callback) {
        this.f44455a = i10;
        this.f44456b = inputPeer;
        this.f44457c = i11;
        this.d = bArr;
        this.e = r2Var;
        this.f44458f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f44460i) {
            this.f44460i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f44459g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f44456b;
            tL_messages_getPollVotes.f19013id = this.f44457c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f44455a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new j(this, 1));
        }
    }
}
