package zh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class l {
    public final int f50774a;
    public final long f50775b;
    public int f50776c;
    public boolean d;
    public final ArrayList e = new ArrayList();
    public long f50777f;
    public boolean f50778g;
    public boolean h;
    public int f50779i;

    public l(int i10, long j10) {
        this.f50778g = false;
        this.h = false;
        this.f50774a = i10;
        this.f50775b = j10;
        if (System.currentTimeMillis() - this.f50777f > 900000) {
            this.f50776c = 0;
            this.h = false;
            this.d = false;
            if (this.f50779i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f50779i, true);
                this.f50779i = 0;
            }
            this.f50778g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f50778g && !this.h && !this.d) {
            this.f50777f = System.currentTimeMillis();
            this.f50778g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f50774a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f50775b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) i2.d.h(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f50779i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new bi.z7(this, 25));
        }
    }
}
