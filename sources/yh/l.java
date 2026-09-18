package yh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class l {
    public final int f47626a;
    public final long f47627b;
    public int f47628c;
    public boolean d;
    public final ArrayList e = new ArrayList();
    public long f47629f;
    public boolean f47630g;
    public boolean h;
    public int f47631i;

    public l(int i10, long j3) {
        this.f47630g = false;
        this.h = false;
        this.f47626a = i10;
        this.f47627b = j3;
        if (System.currentTimeMillis() - this.f47629f > 900000) {
            this.f47628c = 0;
            this.h = false;
            this.d = false;
            if (this.f47631i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f47631i, true);
                this.f47631i = 0;
            }
            this.f47630g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f47630g && !this.h && !this.d) {
            this.f47629f = System.currentTimeMillis();
            this.f47630g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f47626a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f47627b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) hg.k0.g(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f47631i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new ai.m8(this, 25));
        }
    }
}
