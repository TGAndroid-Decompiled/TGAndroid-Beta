package zh;

import android.os.Bundle;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.kz;
import org.telegram.ui.an;
public final class o2 extends an {
    public boolean f60491rd;
    public final TL_stars.TL_starGiftUnique f60492sd;
    public final long f60493td;

    public o2(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(bundle);
        this.f60492sd = tL_starGiftUnique;
        this.f60493td = j3;
        this.f60491rd = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f60491rd) {
            this.f60491rd = true;
            cc O = hc.a0(this).O(this.f60492sd.getDocument(), id.M0(2131752885, null), id.a0(null, null, 2131752886, m5.s(this.currentAccount, this.f60493td)));
            O.f32553r = false;
            O.j();
            kz kzVar = this.F9;
            if (kzVar != null) {
                kzVar.c(true);
            }
        }
    }
}
