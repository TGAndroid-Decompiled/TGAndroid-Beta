package zh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class l {
    public final int f52173a;
    public final long f52174b;
    public int f52175c;
    public boolean d;
    public final ArrayList f52176e = new ArrayList();
    public long f52177f;
    public boolean f52178g;
    public boolean h;
    public int f52179i;

    public l(int i10, long j3) {
        this.f52178g = false;
        this.h = false;
        this.f52173a = i10;
        this.f52174b = j3;
        if (System.currentTimeMillis() - this.f52177f > 900000) {
            this.f52175c = 0;
            this.h = false;
            this.d = false;
            if (this.f52179i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f52179i, true);
                this.f52179i = 0;
            }
            this.f52178g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f52178g && !this.h && !this.d) {
            this.f52177f = System.currentTimeMillis();
            this.f52178g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f52173a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f52174b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.f52176e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) i2.g.h(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f52179i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new bi.v7(this, 25));
        }
    }
}
