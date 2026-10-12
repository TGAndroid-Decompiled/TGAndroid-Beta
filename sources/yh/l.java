package yh;

import ai.o8;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class l {
    public final int f53039a;
    public final long f53040b;
    public int f53041c;
    public boolean d;
    public final ArrayList f53042e = new ArrayList();
    public long f53043f;
    public boolean f53044g;
    public boolean h;
    public int f53045i;

    public l(int i10, long j3) {
        this.f53044g = false;
        this.h = false;
        this.f53039a = i10;
        this.f53040b = j3;
        if (System.currentTimeMillis() - this.f53043f > 900000) {
            this.f53041c = 0;
            this.h = false;
            this.d = false;
            if (this.f53045i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f53045i, true);
                this.f53045i = 0;
            }
            this.f53044g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f53044g && !this.h && !this.d) {
            this.f53043f = System.currentTimeMillis();
            this.f53044g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f53039a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f53040b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.f53042e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) hg.c.h(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f53045i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new o8(this, 25));
        }
    }
}
