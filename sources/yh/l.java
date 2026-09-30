package yh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class l {
    public final int f47632a;
    public final long f47633b;
    public int f47634c;
    public boolean d;
    public final ArrayList e = new ArrayList();
    public long f47635f;
    public boolean f47636g;
    public boolean h;
    public int f47637i;

    public l(int i10, long j3) {
        this.f47636g = false;
        this.h = false;
        this.f47632a = i10;
        this.f47633b = j3;
        if (System.currentTimeMillis() - this.f47635f > 900000) {
            this.f47634c = 0;
            this.h = false;
            this.d = false;
            if (this.f47637i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f47637i, true);
                this.f47637i = 0;
            }
            this.f47636g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f47636g && !this.h && !this.d) {
            this.f47635f = System.currentTimeMillis();
            this.f47636g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f47632a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f47633b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) hg.c.g(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f47637i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new ai.n8(this, 25));
        }
    }
}
