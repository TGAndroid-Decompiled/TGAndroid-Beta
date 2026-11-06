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
    public boolean f60420rd;
    public final TL_stars.TL_starGiftUnique f60421sd;
    public final long f60422td;

    public q2(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(bundle);
        this.f60421sd = tL_starGiftUnique;
        this.f60422td = j3;
        this.f60420rd = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f60420rd) {
            this.f60420rd = true;
            cc O = hc.a0(this).O(this.f60421sd.getDocument(), hd.M0(2131752885, null), hd.a0(null, null, 2131752886, m5.s(this.currentAccount, this.f60422td)));
            O.f32535r = false;
            O.j();
            jz jzVar = this.F9;
            if (jzVar != null) {
                jzVar.c(true);
            }
        }
    }
}
