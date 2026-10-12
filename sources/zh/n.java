package zh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class n {
    public final int f50843a;
    public final long f50844b;
    public int f50845c;
    public boolean d;
    public long f50846f;
    public boolean h;
    public boolean f50848i;
    public String f50849j;
    public final ArrayList e = new ArrayList();
    public int f50847g = 1;

    public n(int i10, long j10) {
        this.h = false;
        this.f50848i = false;
        this.f50849j = null;
        this.f50843a = i10;
        this.f50844b = j10;
        if (System.currentTimeMillis() - this.f50846f > 900000) {
            this.f50845c = 0;
            this.d = false;
            this.f50848i = false;
            this.f50846f = 0L;
            this.f50849j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f50848i && !this.d) {
            this.f50846f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i10 = this.f50843a;
            getsuggestedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f50844b);
            getsuggestedstarrefbots.limit = 20;
            int i11 = this.f50847g;
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
            if (!TextUtils.isEmpty(this.f50849j)) {
                getsuggestedstarrefbots.offset = this.f50849j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new bi.z7(this, 26));
        }
    }
}
