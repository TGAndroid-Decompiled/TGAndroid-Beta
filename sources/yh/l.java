package yh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class l {
    public final int f47707a;
    public final long f47708b;
    public int f47709c;
    public boolean d;
    public final ArrayList e = new ArrayList();
    public long f47710f;
    public boolean f47711g;
    public boolean h;
    public int f47712i;

    public l(int i10, long j3) {
        this.f47711g = false;
        this.h = false;
        this.f47707a = i10;
        this.f47708b = j3;
        if (System.currentTimeMillis() - this.f47710f > 900000) {
            this.f47709c = 0;
            this.h = false;
            this.d = false;
            if (this.f47712i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f47712i, true);
                this.f47712i = 0;
            }
            this.f47711g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f47711g && !this.h && !this.d) {
            this.f47710f = System.currentTimeMillis();
            this.f47711g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f47707a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f47708b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) hg.k0.g(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f47712i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new ai.n8(this, 25));
        }
    }
}
