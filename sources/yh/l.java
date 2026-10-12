package yh;

import ai.o8;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class l {
    public final int f53027a;
    public final long f53028b;
    public int f53029c;
    public boolean d;
    public final ArrayList f53030e = new ArrayList();
    public long f53031f;
    public boolean f53032g;
    public boolean h;
    public int f53033i;

    public l(int i10, long j3) {
        this.f53032g = false;
        this.h = false;
        this.f53027a = i10;
        this.f53028b = j3;
        if (System.currentTimeMillis() - this.f53031f > 900000) {
            this.f53029c = 0;
            this.h = false;
            this.d = false;
            if (this.f53033i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f53033i, true);
                this.f53033i = 0;
            }
            this.f53032g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f53032g && !this.h && !this.d) {
            this.f53031f = System.currentTimeMillis();
            this.f53032g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f53027a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f53028b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.f53030e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) hg.c.h(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f53033i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new o8(this, 25));
        }
    }
}
