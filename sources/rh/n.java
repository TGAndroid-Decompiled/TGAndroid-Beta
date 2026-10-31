package rh;

import java.util.ArrayList;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class n {
    public final int f47213a;
    public final long f47214b;
    public int f47215c;
    public boolean d;
    public final ArrayList e = new ArrayList();
    public long f47216f;
    public boolean f47217g;
    public boolean h;
    public int f47218i;

    public n(int i10, long j10) {
        this.f47217g = false;
        this.h = false;
        this.f47213a = i10;
        this.f47214b = j10;
        if (System.currentTimeMillis() - this.f47216f > 900000) {
            this.f47215c = 0;
            this.h = false;
            this.d = false;
            if (this.f47218i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f47218i, true);
                this.f47218i = 0;
            }
            this.f47217g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f47217g && !this.h && !this.d) {
            this.f47216f = System.currentTimeMillis();
            this.f47217g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f47213a;
            getconnectedstarrefbots.peer = vp.r1(i10).i1(this.f47214b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) i0.a.g(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f47218i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new ag.c(this, 14));
        }
    }
}
