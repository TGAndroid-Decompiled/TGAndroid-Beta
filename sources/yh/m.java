package yh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class m {
    public final int f47698a;
    public final long f47699b;
    public int f47700c;
    public boolean d;
    public long f47701f;
    public boolean h;
    public boolean f47703i;
    public String f47704j;
    public final ArrayList e = new ArrayList();
    public int f47702g = 1;

    public m(int i10, long j3) {
        this.h = false;
        this.f47703i = false;
        this.f47704j = null;
        this.f47698a = i10;
        this.f47699b = j3;
        if (System.currentTimeMillis() - this.f47701f > 900000) {
            this.f47700c = 0;
            this.d = false;
            this.f47703i = false;
            this.f47701f = 0L;
            this.f47704j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f47703i && !this.d) {
            this.f47701f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i10 = this.f47698a;
            getsuggestedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f47699b);
            getsuggestedstarrefbots.limit = 20;
            int i11 = this.f47702g;
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
            if (!TextUtils.isEmpty(this.f47704j)) {
                getsuggestedstarrefbots.offset = this.f47704j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new ai.n8(this, 26));
        }
    }
}
