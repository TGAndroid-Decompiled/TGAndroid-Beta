package yh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class l {
    public final int f47332a;
    public final long f47333b;
    public int f47334c;
    public boolean d;
    public final ArrayList e = new ArrayList();
    public long f47335f;
    public boolean f47336g;
    public boolean h;
    public int f47337i;

    public l(int i10, long j3) {
        this.f47336g = false;
        this.h = false;
        this.f47332a = i10;
        this.f47333b = j3;
        if (System.currentTimeMillis() - this.f47335f > 900000) {
            this.f47334c = 0;
            this.h = false;
            this.d = false;
            if (this.f47337i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f47337i, true);
                this.f47337i = 0;
            }
            this.f47336g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f47336g && !this.h && !this.d) {
            this.f47335f = System.currentTimeMillis();
            this.f47336g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f47332a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f47333b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) hg.c.h(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f47337i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new ai.m8(this, 25));
        }
    }
}
