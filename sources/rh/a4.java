package rh;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.aa;
public final class a4 extends aa {
    public ArrayList S1;
    public LimitPreviewView T1;

    public final void d1(long j10) {
        ArrayList arrayList = this.S1;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.T1.j((TL_stars.StarGiftUpgradePrice) arrayList.get(0), j10, (TL_stars.StarGiftUpgradePrice) i0.a.g(1, arrayList));
        }
    }
}
