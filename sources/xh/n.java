package xh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class n {
    public final int f45731a;
    public final long f45732b;
    public int f45733c;
    public boolean d;
    public long f45734f;
    public boolean h;
    public boolean f45736i;
    public String f45737j;
    public final ArrayList e = new ArrayList();
    public int f45735g = 1;

    public n(int i10, long j3) {
        this.h = false;
        this.f45736i = false;
        this.f45737j = null;
        this.f45731a = i10;
        this.f45732b = j3;
        if (System.currentTimeMillis() - this.f45734f > 900000) {
            this.f45733c = 0;
            this.d = false;
            this.f45736i = false;
            this.f45734f = 0L;
            this.f45737j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f45736i && !this.d) {
            this.f45734f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i10 = this.f45731a;
            getsuggestedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f45732b);
            getsuggestedstarrefbots.limit = 20;
            int i11 = this.f45735g;
            if (i11 == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            getsuggestedstarrefbots.order_by_date = z10;
            if (i11 != 2) {
                z11 = false;
            }
            getsuggestedstarrefbots.order_by_revenue = z11;
            if (!TextUtils.isEmpty(this.f45737j)) {
                getsuggestedstarrefbots.offset = this.f45737j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new bi.c2(this, 23));
        }
    }
}
