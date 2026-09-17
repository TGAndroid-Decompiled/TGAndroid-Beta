package zh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class m {
    public final int f52241a;
    public final long f52242b;
    public int f52243c;
    public boolean d;
    public long f52245f;
    public boolean h;
    public boolean f52247i;
    public String f52248j;
    public final ArrayList f52244e = new ArrayList();
    public int f52246g = 1;

    public m(int i10, long j3) {
        this.h = false;
        this.f52247i = false;
        this.f52248j = null;
        this.f52241a = i10;
        this.f52242b = j3;
        if (System.currentTimeMillis() - this.f52245f > 900000) {
            this.f52243c = 0;
            this.d = false;
            this.f52247i = false;
            this.f52245f = 0L;
            this.f52248j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f52247i && !this.d) {
            this.f52245f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i10 = this.f52241a;
            getsuggestedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f52242b);
            getsuggestedstarrefbots.limit = 20;
            int i11 = this.f52246g;
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
            if (!TextUtils.isEmpty(this.f52248j)) {
                getsuggestedstarrefbots.offset = this.f52248j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new bi.v7(this, 26));
        }
    }
}
