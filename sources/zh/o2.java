package zh;

import android.os.Bundle;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.kz;
import org.telegram.ui.cn;
public final class o2 extends cn {
    public boolean f60501td;
    public final TL_stars.TL_starGiftUnique f60502ud;
    public final long f60503vd;

    public o2(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(bundle);
        this.f60502ud = tL_starGiftUnique;
        this.f60503vd = j3;
        this.f60501td = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f60501td) {
            this.f60501td = true;
            cc O = hc.a0(this).O(this.f60502ud.getDocument(), id.M0(2131752885, null), id.a0(null, null, 2131752886, m5.s(this.currentAccount, this.f60503vd)));
            O.f32635r = false;
            O.j();
            kz kzVar = this.H9;
            if (kzVar != null) {
                kzVar.c(true);
            }
        }
    }
}
