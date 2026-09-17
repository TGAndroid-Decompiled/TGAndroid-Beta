package zh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class l {
    public final int f52205a;
    public final long f52206b;
    public int f52207c;
    public boolean d;
    public final ArrayList f52208e = new ArrayList();
    public long f52209f;
    public boolean f52210g;
    public boolean h;
    public int f52211i;

    public l(int i10, long j3) {
        this.f52210g = false;
        this.h = false;
        this.f52205a = i10;
        this.f52206b = j3;
        if (System.currentTimeMillis() - this.f52209f > 900000) {
            this.f52207c = 0;
            this.h = false;
            this.d = false;
            if (this.f52211i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f52211i, true);
                this.f52211i = 0;
            }
            this.f52210g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f52210g && !this.h && !this.d) {
            this.f52209f = System.currentTimeMillis();
            this.f52210g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f52205a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f52206b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.f52208e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) i2.g.h(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f52211i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new bi.v7(this, 25));
        }
    }
}
