package yh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class l {
    public final int f47687a;
    public final long f47688b;
    public int f47689c;
    public boolean d;
    public final ArrayList e = new ArrayList();
    public long f47690f;
    public boolean f47691g;
    public boolean h;
    public int f47692i;

    public l(int i10, long j3) {
        this.f47691g = false;
        this.h = false;
        this.f47687a = i10;
        this.f47688b = j3;
        if (System.currentTimeMillis() - this.f47690f > 900000) {
            this.f47689c = 0;
            this.h = false;
            this.d = false;
            if (this.f47692i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f47692i, true);
                this.f47692i = 0;
            }
            this.f47691g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f47691g && !this.h && !this.d) {
            this.f47690f = System.currentTimeMillis();
            this.f47691g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f47687a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f47688b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) hg.k0.g(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f47692i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new ai.m8(this, 25));
        }
    }
}
