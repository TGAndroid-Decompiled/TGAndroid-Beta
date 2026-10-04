package yh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class l {
    public final int f51546a;
    public final long f51547b;
    public int f51548c;
    public boolean d;
    public final ArrayList f51549e = new ArrayList();
    public long f51550f;
    public boolean f51551g;
    public boolean h;
    public int f51552i;

    public l(int i10, long j3) {
        this.f51551g = false;
        this.h = false;
        this.f51546a = i10;
        this.f51547b = j3;
        if (System.currentTimeMillis() - this.f51550f > 900000) {
            this.f51548c = 0;
            this.h = false;
            this.d = false;
            if (this.f51552i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f51552i, true);
                this.f51552i = 0;
            }
            this.f51551g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f51551g && !this.h && !this.d) {
            this.f51550f = System.currentTimeMillis();
            this.f51551g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f51546a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f51547b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.f51549e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) hg.k0.g(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f51552i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new ai.n8(this, 25));
        }
    }
}
