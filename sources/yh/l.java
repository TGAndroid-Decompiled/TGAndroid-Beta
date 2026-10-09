package yh;

import ai.o8;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class l {
    public final int f52801a;
    public final long f52802b;
    public int f52803c;
    public boolean d;
    public final ArrayList f52804e = new ArrayList();
    public long f52805f;
    public boolean f52806g;
    public boolean h;
    public int f52807i;

    public l(int i10, long j3) {
        this.f52806g = false;
        this.h = false;
        this.f52801a = i10;
        this.f52802b = j3;
        if (System.currentTimeMillis() - this.f52805f > 900000) {
            this.f52803c = 0;
            this.h = false;
            this.d = false;
            if (this.f52807i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f52807i, true);
                this.f52807i = 0;
            }
            this.f52806g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f52806g && !this.h && !this.d) {
            this.f52805f = System.currentTimeMillis();
            this.f52806g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f52801a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f52802b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.f52804e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) hg.c.g(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f52807i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new o8(this, 25));
        }
    }
}
