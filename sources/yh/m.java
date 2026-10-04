package yh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class m {
    public final int f51600a;
    public final long f51601b;
    public int f51602c;
    public boolean d;
    public long f51604f;
    public boolean h;
    public boolean f51606i;
    public String f51607j;
    public final ArrayList f51603e = new ArrayList();
    public int f51605g = 1;

    public m(int i10, long j3) {
        this.h = false;
        this.f51606i = false;
        this.f51607j = null;
        this.f51600a = i10;
        this.f51601b = j3;
        if (System.currentTimeMillis() - this.f51604f > 900000) {
            this.f51602c = 0;
            this.d = false;
            this.f51606i = false;
            this.f51604f = 0L;
            this.f51607j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f51606i && !this.d) {
            this.f51604f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i10 = this.f51600a;
            getsuggestedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f51601b);
            getsuggestedstarrefbots.limit = 20;
            int i11 = this.f51605g;
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
            if (!TextUtils.isEmpty(this.f51607j)) {
                getsuggestedstarrefbots.offset = this.f51607j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new ai.n8(this, 26));
        }
    }
}
