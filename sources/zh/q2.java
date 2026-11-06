package zh;

import android.os.Bundle;
import org.telegram.messenger.hd;
import org.telegram.messenger.m5;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.jz;
import org.telegram.ui.an;
public final class q2 extends an {
    public boolean f60395rd;
    public final TL_stars.TL_starGiftUnique f60396sd;
    public final long f60397td;

    public q2(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(bundle);
        this.f60396sd = tL_starGiftUnique;
        this.f60397td = j3;
        this.f60395rd = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f60395rd) {
            this.f60395rd = true;
            cc O = hc.a0(this).O(this.f60396sd.getDocument(), hd.M0(2131752885, null), hd.a0(null, null, 2131752886, m5.s(this.currentAccount, this.f60397td)));
            O.f32531r = false;
            O.j();
            jz jzVar = this.F9;
            if (jzVar != null) {
                jzVar.c(true);
            }
        }
    }
}
