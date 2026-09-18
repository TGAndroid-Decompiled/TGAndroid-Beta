package yh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class l {
    public final int f47418a;
    public final long f47419b;
    public int f47420c;
    public boolean d;
    public final ArrayList e = new ArrayList();
    public long f47421f;
    public boolean f47422g;
    public boolean h;
    public int f47423i;

    public l(int i10, long j3) {
        this.f47422g = false;
        this.h = false;
        this.f47418a = i10;
        this.f47419b = j3;
        if (System.currentTimeMillis() - this.f47421f > 900000) {
            this.f47420c = 0;
            this.h = false;
            this.d = false;
            if (this.f47423i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f47423i, true);
                this.f47423i = 0;
            }
            this.f47422g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f47422g && !this.h && !this.d) {
            this.f47421f = System.currentTimeMillis();
            this.f47422g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f47418a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f47419b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) hg.k0.h(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f47423i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new ai.m8(this, 25));
        }
    }
}
