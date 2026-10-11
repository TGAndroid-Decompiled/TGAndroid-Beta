package yh;

import ai.o8;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class l {
    public final int f52924a;
    public final long f52925b;
    public int f52926c;
    public boolean d;
    public final ArrayList f52927e = new ArrayList();
    public long f52928f;
    public boolean f52929g;
    public boolean h;
    public int f52930i;

    public l(int i10, long j3) {
        this.f52929g = false;
        this.h = false;
        this.f52924a = i10;
        this.f52925b = j3;
        if (System.currentTimeMillis() - this.f52928f > 900000) {
            this.f52926c = 0;
            this.h = false;
            this.d = false;
            if (this.f52930i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f52930i, true);
                this.f52930i = 0;
            }
            this.f52929g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f52929g && !this.h && !this.d) {
            this.f52928f = System.currentTimeMillis();
            this.f52929g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f52924a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f52925b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.f52927e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) hg.c.g(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f52930i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new o8(this, 25));
        }
    }
}
