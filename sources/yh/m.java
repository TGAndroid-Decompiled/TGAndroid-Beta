package yh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class m {
    public final int f47696a;
    public final long f47697b;
    public int f47698c;
    public boolean d;
    public long f47699f;
    public boolean h;
    public boolean f47701i;
    public String f47702j;
    public final ArrayList e = new ArrayList();
    public int f47700g = 1;

    public m(int i10, long j3) {
        this.h = false;
        this.f47701i = false;
        this.f47702j = null;
        this.f47696a = i10;
        this.f47697b = j3;
        if (System.currentTimeMillis() - this.f47699f > 900000) {
            this.f47698c = 0;
            this.d = false;
            this.f47701i = false;
            this.f47699f = 0L;
            this.f47702j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f47701i && !this.d) {
            this.f47699f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i10 = this.f47696a;
            getsuggestedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f47697b);
            getsuggestedstarrefbots.limit = 20;
            int i11 = this.f47700g;
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
            if (!TextUtils.isEmpty(this.f47702j)) {
                getsuggestedstarrefbots.offset = this.f47702j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new ai.n8(this, 26));
        }
    }
}
