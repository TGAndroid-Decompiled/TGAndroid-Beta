package yh;

import ai.o8;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class m {
    public final int f52851a;
    public final long f52852b;
    public int f52853c;
    public boolean d;
    public long f52855f;
    public boolean h;
    public boolean f52857i;
    public String f52858j;
    public final ArrayList f52854e = new ArrayList();
    public int f52856g = 1;

    public m(int i10, long j3) {
        this.h = false;
        this.f52857i = false;
        this.f52858j = null;
        this.f52851a = i10;
        this.f52852b = j3;
        if (System.currentTimeMillis() - this.f52855f > 900000) {
            this.f52853c = 0;
            this.d = false;
            this.f52857i = false;
            this.f52855f = 0L;
            this.f52858j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f52857i && !this.d) {
            this.f52855f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i10 = this.f52851a;
            getsuggestedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f52852b);
            getsuggestedstarrefbots.limit = 20;
            int i11 = this.f52856g;
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
            if (!TextUtils.isEmpty(this.f52858j)) {
                getsuggestedstarrefbots.offset = this.f52858j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new o8(this, 26));
        }
    }
}
