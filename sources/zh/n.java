package zh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class n {
    public final int f50844a;
    public final long f50845b;
    public int f50846c;
    public boolean d;
    public long f50847f;
    public boolean h;
    public boolean f50849i;
    public String f50850j;
    public final ArrayList e = new ArrayList();
    public int f50848g = 1;

    public n(int i10, long j10) {
        this.h = false;
        this.f50849i = false;
        this.f50850j = null;
        this.f50844a = i10;
        this.f50845b = j10;
        if (System.currentTimeMillis() - this.f50847f > 900000) {
            this.f50846c = 0;
            this.d = false;
            this.f50849i = false;
            this.f50847f = 0L;
            this.f50850j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f50849i && !this.d) {
            this.f50847f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i10 = this.f50844a;
            getsuggestedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f50845b);
            getsuggestedstarrefbots.limit = 20;
            int i11 = this.f50848g;
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
            if (!TextUtils.isEmpty(this.f50850j)) {
                getsuggestedstarrefbots.offset = this.f50850j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new bi.z7(this, 26));
        }
    }
}
