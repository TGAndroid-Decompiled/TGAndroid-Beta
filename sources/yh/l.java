package yh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class l {
    public final int f47619a;
    public final long f47620b;
    public int f47621c;
    public boolean d;
    public final ArrayList e = new ArrayList();
    public long f47622f;
    public boolean f47623g;
    public boolean h;
    public int f47624i;

    public l(int i10, long j3) {
        this.f47623g = false;
        this.h = false;
        this.f47619a = i10;
        this.f47620b = j3;
        if (System.currentTimeMillis() - this.f47622f > 900000) {
            this.f47621c = 0;
            this.h = false;
            this.d = false;
            if (this.f47624i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f47624i, true);
                this.f47624i = 0;
            }
            this.f47623g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f47623g && !this.h && !this.d) {
            this.f47622f = System.currentTimeMillis();
            this.f47623g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f47619a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f47620b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) hg.c.g(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f47624i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new ai.n8(this, 25));
        }
    }
}
