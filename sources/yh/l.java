package yh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class l {
    public final int f47631a;
    public final long f47632b;
    public int f47633c;
    public boolean d;
    public final ArrayList e = new ArrayList();
    public long f47634f;
    public boolean f47635g;
    public boolean h;
    public int f47636i;

    public l(int i10, long j3) {
        this.f47635g = false;
        this.h = false;
        this.f47631a = i10;
        this.f47632b = j3;
        if (System.currentTimeMillis() - this.f47634f > 900000) {
            this.f47633c = 0;
            this.h = false;
            this.d = false;
            if (this.f47636i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f47636i, true);
                this.f47636i = 0;
            }
            this.f47635g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f47635g && !this.h && !this.d) {
            this.f47634f = System.currentTimeMillis();
            this.f47635g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f47631a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f47632b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) hg.c.g(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f47636i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new ai.n8(this, 25));
        }
    }
}
