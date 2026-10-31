package ph;

import android.os.Bundle;
import org.telegram.messenger.cd;
import org.telegram.messenger.o5;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.xz;
import org.telegram.ui.un;
public final class u2 extends un {
    public boolean f45319jd;
    public final TL_stars.TL_starGiftUnique f45320kd;
    public final long f45321ld;

    public u2(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(bundle);
        this.f45320kd = tL_starGiftUnique;
        this.f45321ld = j10;
        this.f45319jd = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f45319jd) {
            this.f45319jd = true;
            wb O = cc.a0(this).O(this.f45320kd.getDocument(), cd.L0(2131752885, null), cd.a0(null, null, 2131752886, o5.s(this.currentAccount, this.f45321ld)));
            O.f32143r = false;
            O.j();
            xz xzVar = this.F9;
            if (xzVar != null) {
                xzVar.c(true);
            }
        }
    }
}
