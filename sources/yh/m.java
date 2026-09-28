package yh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class m {
    public final int f47697a;
    public final long f47698b;
    public int f47699c;
    public boolean d;
    public long f47700f;
    public boolean h;
    public boolean f47702i;
    public String f47703j;
    public final ArrayList e = new ArrayList();
    public int f47701g = 1;

    public m(int i10, long j3) {
        this.h = false;
        this.f47702i = false;
        this.f47703j = null;
        this.f47697a = i10;
        this.f47698b = j3;
        if (System.currentTimeMillis() - this.f47700f > 900000) {
            this.f47699c = 0;
            this.d = false;
            this.f47702i = false;
            this.f47700f = 0L;
            this.f47703j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f47702i && !this.d) {
            this.f47700f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i10 = this.f47697a;
            getsuggestedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f47698b);
            getsuggestedstarrefbots.limit = 20;
            int i11 = this.f47701g;
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
            if (!TextUtils.isEmpty(this.f47703j)) {
                getsuggestedstarrefbots.offset = this.f47703j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new ai.n8(this, 26));
        }
    }
}
