package zh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class m {
    public final int f52271a;
    public final long f52272b;
    public int f52273c;
    public boolean d;
    public long f52275f;
    public boolean h;
    public boolean f52277i;
    public String f52278j;
    public final ArrayList f52274e = new ArrayList();
    public int f52276g = 1;

    public m(int i10, long j3) {
        this.h = false;
        this.f52277i = false;
        this.f52278j = null;
        this.f52271a = i10;
        this.f52272b = j3;
        if (System.currentTimeMillis() - this.f52275f > 900000) {
            this.f52273c = 0;
            this.d = false;
            this.f52277i = false;
            this.f52275f = 0L;
            this.f52278j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f52277i && !this.d) {
            this.f52275f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i10 = this.f52271a;
            getsuggestedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f52272b);
            getsuggestedstarrefbots.limit = 20;
            int i11 = this.f52276g;
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
            if (!TextUtils.isEmpty(this.f52278j)) {
                getsuggestedstarrefbots.offset = this.f52278j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new bi.v7(this, 26));
        }
    }
}
