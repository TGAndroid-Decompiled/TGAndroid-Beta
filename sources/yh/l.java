package yh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class l {
    public final int f47629a;
    public final long f47630b;
    public int f47631c;
    public boolean d;
    public final ArrayList e = new ArrayList();
    public long f47632f;
    public boolean f47633g;
    public boolean h;
    public int f47634i;

    public l(int i10, long j3) {
        this.f47633g = false;
        this.h = false;
        this.f47629a = i10;
        this.f47630b = j3;
        if (System.currentTimeMillis() - this.f47632f > 900000) {
            this.f47631c = 0;
            this.h = false;
            this.d = false;
            if (this.f47634i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f47634i, true);
                this.f47634i = 0;
            }
            this.f47633g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f47633g && !this.h && !this.d) {
            this.f47632f = System.currentTimeMillis();
            this.f47633g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f47629a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f47630b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) hg.c.g(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f47634i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new ai.n8(this, 25));
        }
    }
}
