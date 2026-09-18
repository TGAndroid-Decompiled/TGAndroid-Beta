package yh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class m {
    public final int f47455a;
    public final long f47456b;
    public int f47457c;
    public boolean d;
    public long f47458f;
    public boolean h;
    public boolean f47460i;
    public String f47461j;
    public final ArrayList e = new ArrayList();
    public int f47459g = 1;

    public m(int i10, long j3) {
        this.h = false;
        this.f47460i = false;
        this.f47461j = null;
        this.f47455a = i10;
        this.f47456b = j3;
        if (System.currentTimeMillis() - this.f47458f > 900000) {
            this.f47457c = 0;
            this.d = false;
            this.f47460i = false;
            this.f47458f = 0L;
            this.f47461j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f47460i && !this.d) {
            this.f47458f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i10 = this.f47455a;
            getsuggestedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f47456b);
            getsuggestedstarrefbots.limit = 20;
            int i11 = this.f47459g;
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
            if (!TextUtils.isEmpty(this.f47461j)) {
                getsuggestedstarrefbots.offset = this.f47461j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new ai.m8(this, 26));
        }
    }
}
