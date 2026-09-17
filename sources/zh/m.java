package zh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class m {
    public final int f52272a;
    public final long f52273b;
    public int f52274c;
    public boolean d;
    public long f52276f;
    public boolean h;
    public boolean f52278i;
    public String f52279j;
    public final ArrayList f52275e = new ArrayList();
    public int f52277g = 1;

    public m(int i10, long j3) {
        this.h = false;
        this.f52278i = false;
        this.f52279j = null;
        this.f52272a = i10;
        this.f52273b = j3;
        if (System.currentTimeMillis() - this.f52276f > 900000) {
            this.f52274c = 0;
            this.d = false;
            this.f52278i = false;
            this.f52276f = 0L;
            this.f52279j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f52278i && !this.d) {
            this.f52276f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i10 = this.f52272a;
            getsuggestedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f52273b);
            getsuggestedstarrefbots.limit = 20;
            int i11 = this.f52277g;
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
            if (!TextUtils.isEmpty(this.f52279j)) {
                getsuggestedstarrefbots.offset = this.f52279j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new bi.v7(this, 26));
        }
    }
}
