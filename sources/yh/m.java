package yh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class m {
    public final int f47378a;
    public final long f47379b;
    public int f47380c;
    public boolean d;
    public long f47381f;
    public boolean h;
    public boolean f47383i;
    public String f47384j;
    public final ArrayList e = new ArrayList();
    public int f47382g = 1;

    public m(int i10, long j3) {
        this.h = false;
        this.f47383i = false;
        this.f47384j = null;
        this.f47378a = i10;
        this.f47379b = j3;
        if (System.currentTimeMillis() - this.f47381f > 900000) {
            this.f47380c = 0;
            this.d = false;
            this.f47383i = false;
            this.f47381f = 0L;
            this.f47384j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f47383i && !this.d) {
            this.f47381f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i10 = this.f47378a;
            getsuggestedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f47379b);
            getsuggestedstarrefbots.limit = 20;
            int i11 = this.f47382g;
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
            if (!TextUtils.isEmpty(this.f47384j)) {
                getsuggestedstarrefbots.offset = this.f47384j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new ai.n8(this, 26));
        }
    }
}
