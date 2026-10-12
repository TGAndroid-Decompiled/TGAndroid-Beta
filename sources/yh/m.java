package yh;

import ai.o8;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class m {
    public final int f53077a;
    public final long f53078b;
    public int f53079c;
    public boolean d;
    public long f53081f;
    public boolean h;
    public boolean f53083i;
    public String f53084j;
    public final ArrayList f53080e = new ArrayList();
    public int f53082g = 1;

    public m(int i10, long j3) {
        this.h = false;
        this.f53083i = false;
        this.f53084j = null;
        this.f53077a = i10;
        this.f53078b = j3;
        if (System.currentTimeMillis() - this.f53081f > 900000) {
            this.f53079c = 0;
            this.d = false;
            this.f53083i = false;
            this.f53081f = 0L;
            this.f53084j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f53083i && !this.d) {
            this.f53081f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i10 = this.f53077a;
            getsuggestedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f53078b);
            getsuggestedstarrefbots.limit = 20;
            int i11 = this.f53082g;
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
            if (!TextUtils.isEmpty(this.f53084j)) {
                getsuggestedstarrefbots.offset = this.f53084j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new o8(this, 26));
        }
    }
}
