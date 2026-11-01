package ph;

import android.os.Bundle;
import org.telegram.messenger.dd;
import org.telegram.messenger.o5;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.xz;
import org.telegram.ui.un;
public final class u2 extends un {
    public boolean f45330kd;
    public final TL_stars.TL_starGiftUnique f45331ld;
    public final long f45332md;

    public u2(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(bundle);
        this.f45331ld = tL_starGiftUnique;
        this.f45332md = j10;
        this.f45330kd = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f45330kd) {
            this.f45330kd = true;
            wb O = cc.a0(this).O(this.f45331ld.getDocument(), dd.L0(2131752885, null), dd.a0(null, null, 2131752886, o5.s(this.currentAccount, this.f45332md)));
            O.f32209r = false;
            O.j();
            xz xzVar = this.F9;
            if (xzVar != null) {
                xzVar.c(true);
            }
        }
    }
}
