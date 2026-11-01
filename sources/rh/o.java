package rh;

import java.util.ArrayList;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class o {
    public final int f47280a;
    public final long f47281b;
    public int f47282c;
    public boolean d;
    public final ArrayList e = new ArrayList();
    public long f47283f;
    public boolean f47284g;
    public boolean h;
    public int f47285i;

    public o(int i10, long j10) {
        this.f47284g = false;
        this.h = false;
        this.f47280a = i10;
        this.f47281b = j10;
        if (System.currentTimeMillis() - this.f47283f > 900000) {
            this.f47282c = 0;
            this.h = false;
            this.d = false;
            if (this.f47285i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f47285i, true);
                this.f47285i = 0;
            }
            this.f47284g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f47284g && !this.h && !this.d) {
            this.f47283f = System.currentTimeMillis();
            this.f47284g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f47280a;
            getconnectedstarrefbots.peer = wp.r1(i10).i1(this.f47281b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) i0.a.g(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f47285i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new ag.c(this, 14));
        }
    }
}
