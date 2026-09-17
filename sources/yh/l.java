package yh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class l {
    public final int f47413a;
    public final long f47414b;
    public int f47415c;
    public boolean d;
    public final ArrayList e = new ArrayList();
    public long f47416f;
    public boolean f47417g;
    public boolean h;
    public int f47418i;

    public l(int i10, long j3) {
        this.f47417g = false;
        this.h = false;
        this.f47413a = i10;
        this.f47414b = j3;
        if (System.currentTimeMillis() - this.f47416f > 900000) {
            this.f47415c = 0;
            this.h = false;
            this.d = false;
            if (this.f47418i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f47418i, true);
                this.f47418i = 0;
            }
            this.f47417g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f47417g && !this.h && !this.d) {
            this.f47416f = System.currentTimeMillis();
            this.f47417g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f47413a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f47414b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) hg.k0.h(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f47418i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new ai.m8(this, 25));
        }
    }
}
