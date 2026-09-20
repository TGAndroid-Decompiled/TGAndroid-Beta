package yh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class l {
    public final int f47666a;
    public final long f47667b;
    public int f47668c;
    public boolean d;
    public final ArrayList e = new ArrayList();
    public long f47669f;
    public boolean f47670g;
    public boolean h;
    public int f47671i;

    public l(int i10, long j3) {
        this.f47670g = false;
        this.h = false;
        this.f47666a = i10;
        this.f47667b = j3;
        if (System.currentTimeMillis() - this.f47669f > 900000) {
            this.f47668c = 0;
            this.h = false;
            this.d = false;
            if (this.f47671i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f47671i, true);
                this.f47671i = 0;
            }
            this.f47670g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f47670g && !this.h && !this.d) {
            this.f47669f = System.currentTimeMillis();
            this.f47670g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f47666a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f47667b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) hg.k0.g(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f47671i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new ai.m8(this, 25));
        }
    }
}
