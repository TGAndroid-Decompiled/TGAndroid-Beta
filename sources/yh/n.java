package yh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class n {
    public final int f51666a;
    public final long f51667b;
    public int f51668c;
    public boolean d;
    public long f51670f;
    public boolean h;
    public boolean f51672i;
    public String f51673j;
    public final ArrayList f51669e = new ArrayList();
    public int f51671g = 1;

    public n(int i10, long j3) {
        this.h = false;
        this.f51672i = false;
        this.f51673j = null;
        this.f51666a = i10;
        this.f51667b = j3;
        if (System.currentTimeMillis() - this.f51670f > 900000) {
            this.f51668c = 0;
            this.d = false;
            this.f51672i = false;
            this.f51670f = 0L;
            this.f51673j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f51672i && !this.d) {
            this.f51670f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i10 = this.f51666a;
            getsuggestedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f51667b);
            getsuggestedstarrefbots.limit = 20;
            int i11 = this.f51671g;
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
            if (!TextUtils.isEmpty(this.f51673j)) {
                getsuggestedstarrefbots.offset = this.f51673j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new ai.n8(this, 25));
        }
    }
}
