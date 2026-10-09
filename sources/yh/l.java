package yh;

import ai.o8;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class l {
    public final int f52803a;
    public final long f52804b;
    public int f52805c;
    public boolean d;
    public final ArrayList f52806e = new ArrayList();
    public long f52807f;
    public boolean f52808g;
    public boolean h;
    public int f52809i;

    public l(int i10, long j3) {
        this.f52808g = false;
        this.h = false;
        this.f52803a = i10;
        this.f52804b = j3;
        if (System.currentTimeMillis() - this.f52807f > 900000) {
            this.f52805c = 0;
            this.h = false;
            this.d = false;
            if (this.f52809i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f52809i, true);
                this.f52809i = 0;
            }
            this.f52808g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f52808g && !this.h && !this.d) {
            this.f52807f = System.currentTimeMillis();
            this.f52808g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f52803a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f52804b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.f52806e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) hg.c.g(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f52809i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new o8(this, 25));
        }
    }
}
