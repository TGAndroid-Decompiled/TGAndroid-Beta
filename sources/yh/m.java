package yh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class m {
    public final int f51595a;
    public final long f51596b;
    public int f51597c;
    public boolean d;
    public long f51599f;
    public boolean h;
    public boolean f51601i;
    public String f51602j;
    public final ArrayList f51598e = new ArrayList();
    public int f51600g = 1;

    public m(int i10, long j3) {
        this.h = false;
        this.f51601i = false;
        this.f51602j = null;
        this.f51595a = i10;
        this.f51596b = j3;
        if (System.currentTimeMillis() - this.f51599f > 900000) {
            this.f51597c = 0;
            this.d = false;
            this.f51601i = false;
            this.f51599f = 0L;
            this.f51602j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f51601i && !this.d) {
            this.f51599f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i10 = this.f51595a;
            getsuggestedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f51596b);
            getsuggestedstarrefbots.limit = 20;
            int i11 = this.f51600g;
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
            if (!TextUtils.isEmpty(this.f51602j)) {
                getsuggestedstarrefbots.offset = this.f51602j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new ai.n8(this, 26));
        }
    }
}
