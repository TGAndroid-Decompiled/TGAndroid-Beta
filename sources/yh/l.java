package yh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class l {
    public final int f51551a;
    public final long f51552b;
    public int f51553c;
    public boolean d;
    public final ArrayList f51554e = new ArrayList();
    public long f51555f;
    public boolean f51556g;
    public boolean h;
    public int f51557i;

    public l(int i10, long j3) {
        this.f51556g = false;
        this.h = false;
        this.f51551a = i10;
        this.f51552b = j3;
        if (System.currentTimeMillis() - this.f51555f > 900000) {
            this.f51553c = 0;
            this.h = false;
            this.d = false;
            if (this.f51557i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f51557i, true);
                this.f51557i = 0;
            }
            this.f51556g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f51556g && !this.h && !this.d) {
            this.f51555f = System.currentTimeMillis();
            this.f51556g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f51551a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f51552b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.f51554e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) hg.c.g(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f51557i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new ai.n8(this, 25));
        }
    }
}
