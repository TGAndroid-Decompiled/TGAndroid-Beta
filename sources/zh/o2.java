package zh;

import android.os.Bundle;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.jz;
import org.telegram.ui.cn;
public final class o2 extends cn {
    public boolean f60508td;
    public final TL_stars.TL_starGiftUnique f60509ud;
    public final long f60510vd;

    public o2(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(bundle);
        this.f60509ud = tL_starGiftUnique;
        this.f60510vd = j3;
        this.f60508td = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f60508td) {
            this.f60508td = true;
            bc O = gc.a0(this).O(this.f60509ud.getDocument(), id.M0(2131752885, null), id.a0(null, null, 2131752886, m5.s(this.currentAccount, this.f60510vd)));
            O.f32211r = false;
            O.j();
            jz jzVar = this.H9;
            if (jzVar != null) {
                jzVar.c(true);
            }
        }
    }
}
