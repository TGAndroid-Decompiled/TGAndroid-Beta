package yh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class m {
    public final int f51618a;
    public final long f51619b;
    public int f51620c;
    public boolean d;
    public final ArrayList f51621e = new ArrayList();
    public long f51622f;
    public boolean f51623g;
    public boolean h;
    public int f51624i;

    public m(int i10, long j3) {
        this.f51623g = false;
        this.h = false;
        this.f51618a = i10;
        this.f51619b = j3;
        if (System.currentTimeMillis() - this.f51622f > 900000) {
            this.f51620c = 0;
            this.h = false;
            this.d = false;
            if (this.f51624i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f51624i, true);
                this.f51624i = 0;
            }
            this.f51623g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f51623g && !this.h && !this.d) {
            this.f51622f = System.currentTimeMillis();
            this.f51623g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f51618a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f51619b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.f51621e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) hg.c.g(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f51624i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new ai.n8(this, 24));
        }
    }
}
