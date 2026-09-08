package zh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class l {
    public final int f52204a;
    public final long f52205b;
    public int f52206c;
    public boolean d;
    public final ArrayList f52207e = new ArrayList();
    public long f52208f;
    public boolean f52209g;
    public boolean h;
    public int f52210i;

    public l(int i10, long j3) {
        this.f52209g = false;
        this.h = false;
        this.f52204a = i10;
        this.f52205b = j3;
        if (System.currentTimeMillis() - this.f52208f > 900000) {
            this.f52206c = 0;
            this.h = false;
            this.d = false;
            if (this.f52210i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f52210i, true);
                this.f52210i = 0;
            }
            this.f52209g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f52209g && !this.h && !this.d) {
            this.f52208f = System.currentTimeMillis();
            this.f52209g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f52204a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f52205b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.f52207e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) i2.g.h(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f52210i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new bi.v7(this, 25));
        }
    }
}
