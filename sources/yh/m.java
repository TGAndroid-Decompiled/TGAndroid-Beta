package yh;

import ai.o8;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class m {
    public final int f52853a;
    public final long f52854b;
    public int f52855c;
    public boolean d;
    public long f52857f;
    public boolean h;
    public boolean f52859i;
    public String f52860j;
    public final ArrayList f52856e = new ArrayList();
    public int f52858g = 1;

    public m(int i10, long j3) {
        this.h = false;
        this.f52859i = false;
        this.f52860j = null;
        this.f52853a = i10;
        this.f52854b = j3;
        if (System.currentTimeMillis() - this.f52857f > 900000) {
            this.f52855c = 0;
            this.d = false;
            this.f52859i = false;
            this.f52857f = 0L;
            this.f52860j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f52859i && !this.d) {
            this.f52857f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i10 = this.f52853a;
            getsuggestedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f52854b);
            getsuggestedstarrefbots.limit = 20;
            int i11 = this.f52858g;
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
            if (!TextUtils.isEmpty(this.f52860j)) {
                getsuggestedstarrefbots.offset = this.f52860j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new o8(this, 26));
        }
    }
}
