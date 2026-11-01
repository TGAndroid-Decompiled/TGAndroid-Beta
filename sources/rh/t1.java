package rh;

import org.telegram.messenger.dd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ec;
public final class t1 implements Runnable {
    public final int f47500a;
    public final org.telegram.tgnet.e f47501b;
    public final ec[] f47502c;
    public final TL_stars.UniqueStarGiftValueInfo d;
    public final String e;

    public t1(org.telegram.tgnet.e eVar, ec[] ecVarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, int i10) {
        this.f47500a = i10;
        this.f47501b = eVar;
        this.f47502c = ecVarArr;
        this.d = uniqueStarGiftValueInfo;
        this.e = str;
    }

    @Override
    public final void run() {
        int i10 = this.f47500a;
        String str = this.e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        ec[] ecVarArr = this.f47502c;
        org.telegram.tgnet.e eVar = this.f47501b;
        switch (i10) {
            case 0:
                eVar.a(ecVarArr[0], dd.a0(null, null, 2131749588, org.telegram.messenger.u1.i().f(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), str));
                return;
            default:
                eVar.a(ecVarArr[0], dd.a0(null, null, 2131749596, org.telegram.messenger.u1.i().f(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), str));
                return;
        }
    }
}
