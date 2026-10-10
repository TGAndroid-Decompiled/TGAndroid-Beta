package yh;

import ai.o8;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class m {
    public final int f52897a;
    public final long f52898b;
    public int f52899c;
    public boolean d;
    public long f52901f;
    public boolean h;
    public boolean f52903i;
    public String f52904j;
    public final ArrayList f52900e = new ArrayList();
    public int f52902g = 1;

    public m(int i10, long j3) {
        this.h = false;
        this.f52903i = false;
        this.f52904j = null;
        this.f52897a = i10;
        this.f52898b = j3;
        if (System.currentTimeMillis() - this.f52901f > 900000) {
            this.f52899c = 0;
            this.d = false;
            this.f52903i = false;
            this.f52901f = 0L;
            this.f52904j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f52903i && !this.d) {
            this.f52901f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i10 = this.f52897a;
            getsuggestedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f52898b);
            getsuggestedstarrefbots.limit = 20;
            int i11 = this.f52902g;
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
            if (!TextUtils.isEmpty(this.f52904j)) {
                getsuggestedstarrefbots.offset = this.f52904j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new o8(this, 26));
        }
    }
}
