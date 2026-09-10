package xh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class m {
    public final int f45687a;
    public final long f45688b;
    public int f45689c;
    public boolean d;
    public final ArrayList e = new ArrayList();
    public long f45690f;
    public boolean f45691g;
    public boolean h;
    public int f45692i;

    public m(int i10, long j3) {
        this.f45691g = false;
        this.h = false;
        this.f45687a = i10;
        this.f45688b = j3;
        if (System.currentTimeMillis() - this.f45690f > 900000) {
            this.f45689c = 0;
            this.h = false;
            this.d = false;
            if (this.f45692i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f45692i, true);
                this.f45692i = 0;
            }
            this.f45691g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f45691g && !this.h && !this.d) {
            this.f45690f = System.currentTimeMillis();
            this.f45691g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f45687a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f45688b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) hc.b.i(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f45692i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new bi.c2(this, 22));
        }
    }
}
