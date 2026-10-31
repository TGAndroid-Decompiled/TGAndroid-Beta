package rh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class p {
    public final int f47295a;
    public final long f47296b;
    public int f47297c;
    public boolean d;
    public long f47298f;
    public boolean h;
    public boolean f47300i;
    public String f47301j;
    public final ArrayList e = new ArrayList();
    public int f47299g = 1;

    public p(int i10, long j10) {
        this.h = false;
        this.f47300i = false;
        this.f47301j = null;
        this.f47295a = i10;
        this.f47296b = j10;
        if (System.currentTimeMillis() - this.f47298f > 900000) {
            this.f47297c = 0;
            this.d = false;
            this.f47300i = false;
            this.f47298f = 0L;
            this.f47301j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f47300i && !this.d) {
            this.f47298f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i10 = this.f47295a;
            getsuggestedstarrefbots.peer = vp.r1(i10).i1(this.f47296b);
            getsuggestedstarrefbots.limit = 20;
            int i11 = this.f47299g;
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
            if (!TextUtils.isEmpty(this.f47301j)) {
                getsuggestedstarrefbots.offset = this.f47301j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new ag.c(this, 15));
        }
    }
}
