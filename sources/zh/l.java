package zh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class l {
    public final int f50773a;
    public final long f50774b;
    public int f50775c;
    public boolean d;
    public final ArrayList e = new ArrayList();
    public long f50776f;
    public boolean f50777g;
    public boolean h;
    public int f50778i;

    public l(int i10, long j10) {
        this.f50777g = false;
        this.h = false;
        this.f50773a = i10;
        this.f50774b = j10;
        if (System.currentTimeMillis() - this.f50776f > 900000) {
            this.f50775c = 0;
            this.h = false;
            this.d = false;
            if (this.f50778i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f50778i, true);
                this.f50778i = 0;
            }
            this.f50777g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f50777g && !this.h && !this.d) {
            this.f50776f = System.currentTimeMillis();
            this.f50777g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f50773a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f50774b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) i2.d.g(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f50778i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new bi.z7(this, 25));
        }
    }
}
