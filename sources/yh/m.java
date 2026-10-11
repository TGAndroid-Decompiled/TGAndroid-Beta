package yh;

import ai.o8;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class m {
    public final int f52962a;
    public final long f52963b;
    public int f52964c;
    public boolean d;
    public long f52966f;
    public boolean h;
    public boolean f52968i;
    public String f52969j;
    public final ArrayList f52965e = new ArrayList();
    public int f52967g = 1;

    public m(int i10, long j3) {
        this.h = false;
        this.f52968i = false;
        this.f52969j = null;
        this.f52962a = i10;
        this.f52963b = j3;
        if (System.currentTimeMillis() - this.f52966f > 900000) {
            this.f52964c = 0;
            this.d = false;
            this.f52968i = false;
            this.f52966f = 0L;
            this.f52969j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f52968i && !this.d) {
            this.f52966f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i10 = this.f52962a;
            getsuggestedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f52963b);
            getsuggestedstarrefbots.limit = 20;
            int i11 = this.f52967g;
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
            if (!TextUtils.isEmpty(this.f52969j)) {
                getsuggestedstarrefbots.offset = this.f52969j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new o8(this, 26));
        }
    }
}
