package yh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class l {
    public final int f51545a;
    public final long f51546b;
    public int f51547c;
    public boolean d;
    public final ArrayList f51548e = new ArrayList();
    public long f51549f;
    public boolean f51550g;
    public boolean h;
    public int f51551i;

    public l(int i10, long j3) {
        this.f51550g = false;
        this.h = false;
        this.f51545a = i10;
        this.f51546b = j3;
        if (System.currentTimeMillis() - this.f51549f > 900000) {
            this.f51547c = 0;
            this.h = false;
            this.d = false;
            if (this.f51551i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f51551i, true);
                this.f51551i = 0;
            }
            this.f51550g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f51550g && !this.h && !this.d) {
            this.f51549f = System.currentTimeMillis();
            this.f51550g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f51545a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f51546b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.f51548e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) hg.k0.g(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f51551i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new ai.n8(this, 25));
        }
    }
}
