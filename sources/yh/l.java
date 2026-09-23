package yh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class l {
    public final int f47313a;
    public final long f47314b;
    public int f47315c;
    public boolean d;
    public final ArrayList e = new ArrayList();
    public long f47316f;
    public boolean f47317g;
    public boolean h;
    public int f47318i;

    public l(int i10, long j3) {
        this.f47317g = false;
        this.h = false;
        this.f47313a = i10;
        this.f47314b = j3;
        if (System.currentTimeMillis() - this.f47316f > 900000) {
            this.f47315c = 0;
            this.h = false;
            this.d = false;
            if (this.f47318i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f47318i, true);
                this.f47318i = 0;
            }
            this.f47317g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f47317g && !this.h && !this.d) {
            this.f47316f = System.currentTimeMillis();
            this.f47317g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f47313a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f47314b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) hg.c.h(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f47318i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new ai.n8(this, 25));
        }
    }
}
