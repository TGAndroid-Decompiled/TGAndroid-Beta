package rh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class p {
    public final int f47309a;
    public final long f47310b;
    public int f47311c;
    public boolean d;
    public long f47312f;
    public boolean h;
    public boolean f47314i;
    public String f47315j;
    public final ArrayList e = new ArrayList();
    public int f47313g = 1;

    public p(int i10, long j10) {
        this.h = false;
        this.f47314i = false;
        this.f47315j = null;
        this.f47309a = i10;
        this.f47310b = j10;
        if (System.currentTimeMillis() - this.f47312f > 900000) {
            this.f47311c = 0;
            this.d = false;
            this.f47314i = false;
            this.f47312f = 0L;
            this.f47315j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f47314i && !this.d) {
            this.f47312f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i10 = this.f47309a;
            getsuggestedstarrefbots.peer = wp.r1(i10).i1(this.f47310b);
            getsuggestedstarrefbots.limit = 20;
            int i11 = this.f47313g;
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
            if (!TextUtils.isEmpty(this.f47315j)) {
                getsuggestedstarrefbots.offset = this.f47315j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new ag.c(this, 15));
        }
    }
}
