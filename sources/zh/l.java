package zh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class l {
    public final int f52174a;
    public final long f52175b;
    public int f52176c;
    public boolean d;
    public final ArrayList f52177e = new ArrayList();
    public long f52178f;
    public boolean f52179g;
    public boolean h;
    public int f52180i;

    public l(int i10, long j3) {
        this.f52179g = false;
        this.h = false;
        this.f52174a = i10;
        this.f52175b = j3;
        if (System.currentTimeMillis() - this.f52178f > 900000) {
            this.f52176c = 0;
            this.h = false;
            this.d = false;
            if (this.f52180i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f52180i, true);
                this.f52180i = 0;
            }
            this.f52179g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f52179g && !this.h && !this.d) {
            this.f52178f = System.currentTimeMillis();
            this.f52179g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f52174a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f52175b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.f52177e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) i2.g.h(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f52180i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new bi.v7(this, 25));
        }
    }
}
