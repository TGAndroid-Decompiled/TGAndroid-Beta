package yh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class l {
    public final int f47390a;
    public final long f47391b;
    public int f47392c;
    public boolean d;
    public final ArrayList e = new ArrayList();
    public long f47393f;
    public boolean f47394g;
    public boolean h;
    public int f47395i;

    public l(int i10, long j3) {
        this.f47394g = false;
        this.h = false;
        this.f47390a = i10;
        this.f47391b = j3;
        if (System.currentTimeMillis() - this.f47393f > 900000) {
            this.f47392c = 0;
            this.h = false;
            this.d = false;
            if (this.f47395i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f47395i, true);
                this.f47395i = 0;
            }
            this.f47394g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f47394g && !this.h && !this.d) {
            this.f47393f = System.currentTimeMillis();
            this.f47394g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f47390a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f47391b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) hg.k0.h(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f47395i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new ai.m8(this, 25));
        }
    }
}
