package yh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class m {
    public final int f47748a;
    public final long f47749b;
    public int f47750c;
    public boolean d;
    public long f47751f;
    public boolean h;
    public boolean f47753i;
    public String f47754j;
    public final ArrayList e = new ArrayList();
    public int f47752g = 1;

    public m(int i10, long j3) {
        this.h = false;
        this.f47753i = false;
        this.f47754j = null;
        this.f47748a = i10;
        this.f47749b = j3;
        if (System.currentTimeMillis() - this.f47751f > 900000) {
            this.f47750c = 0;
            this.d = false;
            this.f47753i = false;
            this.f47751f = 0L;
            this.f47754j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f47753i && !this.d) {
            this.f47751f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i10 = this.f47748a;
            getsuggestedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f47749b);
            getsuggestedstarrefbots.limit = 20;
            int i11 = this.f47752g;
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
            if (!TextUtils.isEmpty(this.f47754j)) {
                getsuggestedstarrefbots.offset = this.f47754j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new ai.m8(this, 26));
        }
    }
}
