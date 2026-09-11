package zh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class m {
    public final int f52240a;
    public final long f52241b;
    public int f52242c;
    public boolean d;
    public long f52244f;
    public boolean h;
    public boolean f52246i;
    public String f52247j;
    public final ArrayList f52243e = new ArrayList();
    public int f52245g = 1;

    public m(int i10, long j3) {
        this.h = false;
        this.f52246i = false;
        this.f52247j = null;
        this.f52240a = i10;
        this.f52241b = j3;
        if (System.currentTimeMillis() - this.f52244f > 900000) {
            this.f52242c = 0;
            this.d = false;
            this.f52246i = false;
            this.f52244f = 0L;
            this.f52247j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f52246i && !this.d) {
            this.f52244f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i10 = this.f52240a;
            getsuggestedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f52241b);
            getsuggestedstarrefbots.limit = 20;
            int i11 = this.f52245g;
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
            if (!TextUtils.isEmpty(this.f52247j)) {
                getsuggestedstarrefbots.offset = this.f52247j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new bi.v7(this, 26));
        }
    }
}
