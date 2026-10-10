package yh;

import ai.o8;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class l {
    public final int f52847a;
    public final long f52848b;
    public int f52849c;
    public boolean d;
    public final ArrayList f52850e = new ArrayList();
    public long f52851f;
    public boolean f52852g;
    public boolean h;
    public int f52853i;

    public l(int i10, long j3) {
        this.f52852g = false;
        this.h = false;
        this.f52847a = i10;
        this.f52848b = j3;
        if (System.currentTimeMillis() - this.f52851f > 900000) {
            this.f52849c = 0;
            this.h = false;
            this.d = false;
            if (this.f52853i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f52853i, true);
                this.f52853i = 0;
            }
            this.f52852g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f52852g && !this.h && !this.d) {
            this.f52851f = System.currentTimeMillis();
            this.f52852g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f52847a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f52848b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.f52850e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) hg.c.g(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f52853i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new o8(this, 25));
        }
    }
}
